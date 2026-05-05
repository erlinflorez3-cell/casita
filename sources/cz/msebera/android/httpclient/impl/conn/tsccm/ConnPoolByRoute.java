package cz.msebera.android.httpclient.impl.conn.tsccm;

import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.conn.ClientConnectionOperator;
import cz.msebera.android.httpclient.conn.ConnectionPoolTimeoutException;
import cz.msebera.android.httpclient.conn.OperatedClientConnection;
import cz.msebera.android.httpclient.conn.params.ConnManagerParams;
import cz.msebera.android.httpclient.conn.params.ConnPerRoute;
import cz.msebera.android.httpclient.conn.routing.HttpRoute;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import cz.msebera.android.httpclient.params.HttpParams;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.Asserts;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class ConnPoolByRoute extends AbstractConnPool {
    protected final ConnPerRoute connPerRoute;
    private final long connTTL;
    private final TimeUnit connTTLTimeUnit;
    protected final Queue<BasicPoolEntry> freeConnections;
    protected final Set<BasicPoolEntry> leasedConnections;
    public HttpClientAndroidLog log;
    protected volatile int maxTotalConnections;
    protected volatile int numConnections;
    protected final ClientConnectionOperator operator;
    private final Lock poolLock;
    protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
    protected volatile boolean shutdown;
    protected final Queue<WaitingThread> waitingThreads;

    /* JADX INFO: renamed from: cz.msebera.android.httpclient.impl.conn.tsccm.ConnPoolByRoute$1 */
    class AnonymousClass1 implements PoolEntryRequest {
        final /* synthetic */ WaitingThreadAborter val$aborter;
        final /* synthetic */ HttpRoute val$route;
        final /* synthetic */ Object val$state;

        AnonymousClass1(WaitingThreadAborter waitingThreadAborter, HttpRoute httpRoute, Object obj) {
            waitingThreadAborter = waitingThreadAborter;
            httpRoute = httpRoute;
            obj = obj;
        }

        @Override // cz.msebera.android.httpclient.impl.conn.tsccm.PoolEntryRequest
        public void abortRequest() {
            ConnPoolByRoute.this.poolLock.lock();
            try {
                waitingThreadAborter.abort();
            } finally {
                ConnPoolByRoute.this.poolLock.unlock();
            }
        }

        @Override // cz.msebera.android.httpclient.impl.conn.tsccm.PoolEntryRequest
        public BasicPoolEntry getPoolEntry(long j2, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
            return ConnPoolByRoute.this.getEntryBlocking(httpRoute, obj, j2, timeUnit, waitingThreadAborter);
        }
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute, int i2) {
        this(clientConnectionOperator, connPerRoute, i2, -1L, TimeUnit.MILLISECONDS);
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute, int i2, long j2, TimeUnit timeUnit) {
        this.log = new HttpClientAndroidLog(getClass());
        Args.notNull(clientConnectionOperator, "Connection operator");
        Args.notNull(connPerRoute, "Connections per route");
        this.poolLock = super.poolLock;
        this.leasedConnections = super.leasedConnections;
        this.operator = clientConnectionOperator;
        this.connPerRoute = connPerRoute;
        this.maxTotalConnections = i2;
        this.freeConnections = createFreeConnQueue();
        this.waitingThreads = createWaitingThreadQueue();
        this.routeToPool = createRouteToPoolMap();
        this.connTTL = j2;
        this.connTTLTimeUnit = timeUnit;
    }

    @Deprecated
    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        this(clientConnectionOperator, ConnManagerParams.getMaxConnectionsPerRoute(httpParams), ConnManagerParams.getMaxTotalConnections(httpParams));
    }

    private void closeConnection(BasicPoolEntry basicPoolEntry) {
        OperatedClientConnection connection = basicPoolEntry.getConnection();
        if (connection != null) {
            try {
                connection.close();
            } catch (IOException e2) {
                this.log.debug("I/O error closing connection", e2);
            }
        }
    }

    @Override // cz.msebera.android.httpclient.impl.conn.tsccm.AbstractConnPool
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (next.isExpired(jCurrentTimeMillis)) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection expired @ " + new Date(next.getExpiry()));
                    }
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.impl.conn.tsccm.AbstractConnPool
    public void closeIdleConnections(long j2, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        if (j2 <= 0) {
            j2 = 0;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + j2 + Global.BLANK + timeUnit);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - timeUnit.toMillis(j2);
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (next.getUpdated() <= jCurrentTimeMillis) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection last used @ " + new Date(next.getUpdated()));
                    }
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    protected BasicPoolEntry createEntry(RouteSpecificPool routeSpecificPool, ClientConnectionOperator clientConnectionOperator) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Creating new connection [" + routeSpecificPool.getRoute() + "]");
        }
        BasicPoolEntry basicPoolEntry = new BasicPoolEntry(clientConnectionOperator, routeSpecificPool.getRoute(), this.connTTL, this.connTTLTimeUnit);
        this.poolLock.lock();
        try {
            routeSpecificPool.createdEntry(basicPoolEntry);
            this.numConnections++;
            this.leasedConnections.add(basicPoolEntry);
            return basicPoolEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    protected Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    protected Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    protected Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    @Override // cz.msebera.android.httpclient.impl.conn.tsccm.AbstractConnPool
    public void deleteClosedConnections() {
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (!next.getConnection().isOpen()) {
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    protected void deleteEntry(BasicPoolEntry basicPoolEntry) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Deleting connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            closeConnection(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            routePool.deleteEntry(basicPoolEntry);
            this.numConnections--;
            if (routePool.isUnused()) {
                this.routeToPool.remove(plannedRoute);
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    protected void deleteLeastUsedEntry() {
        this.poolLock.lock();
        try {
            BasicPoolEntry basicPoolEntryRemove = this.freeConnections.remove();
            if (basicPoolEntryRemove != null) {
                deleteEntry(basicPoolEntryRemove);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("No free connection to delete");
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.impl.conn.tsccm.AbstractConnPool
    public void freeEntry(BasicPoolEntry basicPoolEntry, boolean z2, long j2, TimeUnit timeUnit) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            if (this.shutdown) {
                closeConnection(basicPoolEntry);
                return;
            }
            this.leasedConnections.remove(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            if (!z2 || routePool.getCapacity() < 0) {
                closeConnection(basicPoolEntry);
                routePool.dropEntry();
                this.numConnections--;
            } else {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Pooling connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]; keep alive " + (j2 > 0 ? "for " + j2 + Global.BLANK + timeUnit : "indefinitely"));
                }
                routePool.freeEntry(basicPoolEntry);
                basicPoolEntry.updateExpiry(j2, timeUnit);
                this.freeConnections.add(basicPoolEntry);
            }
            notifyWaitingThread(routePool);
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool() {
        this.poolLock.lock();
        try {
            return this.numConnections;
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, false);
            return routePool != null ? routePool.getEntryCount() : 0;
        } finally {
            this.poolLock.unlock();
        }
    }

    protected BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j2, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) throws ConnectionPoolTimeoutException, InterruptedException {
        BasicPoolEntry freeEntry = null;
        Date date = j2 > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j2)) : null;
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            WaitingThread waitingThreadNewWaitingThread = null;
            while (freeEntry == null) {
                Asserts.check(!this.shutdown, "Connection pool shut down");
                if (this.log.isDebugEnabled()) {
                    this.log.debug("[" + httpRoute + "] total kept alive: " + this.freeConnections.size() + ", total issued: " + this.leasedConnections.size() + ", total allocated: " + this.numConnections + " out of " + this.maxTotalConnections);
                }
                freeEntry = getFreeEntry(routePool, obj);
                if (freeEntry != null) {
                    break;
                }
                boolean z2 = routePool.getCapacity() > 0;
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Available capacity: " + routePool.getCapacity() + " out of " + routePool.getMaxEntries() + " [" + httpRoute + "][" + obj + "]");
                }
                if (z2 && this.numConnections < this.maxTotalConnections) {
                    freeEntry = createEntry(routePool, this.operator);
                } else if (!z2 || this.freeConnections.isEmpty()) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Need to wait for connection [" + httpRoute + "][" + obj + "]");
                    }
                    if (waitingThreadNewWaitingThread == null) {
                        waitingThreadNewWaitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                        waitingThreadAborter.setWaitingThread(waitingThreadNewWaitingThread);
                    }
                    try {
                        routePool.queueThread(waitingThreadNewWaitingThread);
                        this.waitingThreads.add(waitingThreadNewWaitingThread);
                        if (!waitingThreadNewWaitingThread.await(date) && date != null && date.getTime() <= System.currentTimeMillis()) {
                            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
                        }
                    } finally {
                        routePool.removeThread(waitingThreadNewWaitingThread);
                        this.waitingThreads.remove(waitingThreadNewWaitingThread);
                    }
                } else {
                    deleteLeastUsedEntry();
                    routePool = getRoutePool(httpRoute, true);
                    freeEntry = createEntry(routePool, this.operator);
                }
            }
            return freeEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    protected BasicPoolEntry getFreeEntry(RouteSpecificPool routeSpecificPool, Object obj) {
        this.poolLock.lock();
        BasicPoolEntry basicPoolEntryAllocEntry = null;
        boolean z2 = false;
        while (!z2) {
            try {
                basicPoolEntryAllocEntry = routeSpecificPool.allocEntry(obj);
                if (basicPoolEntryAllocEntry != null) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Getting free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                    }
                    this.freeConnections.remove(basicPoolEntryAllocEntry);
                    if (basicPoolEntryAllocEntry.isExpired(System.currentTimeMillis())) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Closing expired free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                        }
                        closeConnection(basicPoolEntryAllocEntry);
                        routeSpecificPool.dropEntry();
                        this.numConnections--;
                    } else {
                        this.leasedConnections.add(basicPoolEntryAllocEntry);
                    }
                } else if (this.log.isDebugEnabled()) {
                    this.log.debug("No free connections [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                }
                z2 = true;
            } finally {
                this.poolLock.unlock();
            }
        }
        return basicPoolEntryAllocEntry;
    }

    protected Lock getLock() {
        return this.poolLock;
    }

    public int getMaxTotalConnections() {
        return this.maxTotalConnections;
    }

    protected RouteSpecificPool getRoutePool(HttpRoute httpRoute, boolean z2) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routeSpecificPoolNewRouteSpecificPool = this.routeToPool.get(httpRoute);
            if (routeSpecificPoolNewRouteSpecificPool == null && z2) {
                routeSpecificPoolNewRouteSpecificPool = newRouteSpecificPool(httpRoute);
                this.routeToPool.put(httpRoute, routeSpecificPoolNewRouteSpecificPool);
            }
            return routeSpecificPoolNewRouteSpecificPool;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.impl.conn.tsccm.AbstractConnPool
    protected void handleLostEntry(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            routePool.dropEntry();
            if (routePool.isUnused()) {
                this.routeToPool.remove(httpRoute);
            }
            this.numConnections--;
            notifyWaitingThread(routePool);
        } finally {
            this.poolLock.unlock();
        }
    }

    protected RouteSpecificPool newRouteSpecificPool(HttpRoute httpRoute) {
        return new RouteSpecificPool(httpRoute, this.connPerRoute);
    }

    protected WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        return new WaitingThread(condition, routeSpecificPool);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0038 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:33:0x0009, B:35:0x000f, B:37:0x0017, B:38:0x0033, B:50:0x006a, B:39:0x0038, B:41:0x0040, B:43:0x0048, B:44:0x004f, B:45:0x0058, B:47:0x0060), top: B:56:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void notifyWaitingThread(cz.msebera.android.httpclient.impl.conn.tsccm.RouteSpecificPool r5) {
        /*
            r4 = this;
            java.lang.String r3 = "Notifying thread waiting on pool ["
            java.util.concurrent.locks.Lock r0 = r4.poolLock
            r0.lock()
            if (r5 == 0) goto L38
            boolean r0 = r5.hasThread()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L38
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r0 = r4.log     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L33
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r2 = r4.log     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L73
            cz.msebera.android.httpclient.conn.routing.HttpRoute r0 = r5.getRoute()     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "]"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L73
            r2.debug(r0)     // Catch: java.lang.Throwable -> L73
        L33:
            cz.msebera.android.httpclient.impl.conn.tsccm.WaitingThread r0 = r5.nextThread()     // Catch: java.lang.Throwable -> L73
            goto L68
        L38:
            java.util.Queue<cz.msebera.android.httpclient.impl.conn.tsccm.WaitingThread> r0 = r4.waitingThreads     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L58
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r0 = r4.log     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L4f
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r1 = r4.log     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "Notifying thread waiting on any pool"
            r1.debug(r0)     // Catch: java.lang.Throwable -> L73
        L4f:
            java.util.Queue<cz.msebera.android.httpclient.impl.conn.tsccm.WaitingThread> r0 = r4.waitingThreads     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L73
            cz.msebera.android.httpclient.impl.conn.tsccm.WaitingThread r0 = (cz.msebera.android.httpclient.impl.conn.tsccm.WaitingThread) r0     // Catch: java.lang.Throwable -> L73
            goto L68
        L58:
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r0 = r4.log     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L67
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r1 = r4.log     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "Notifying no-one, there are no waiting threads"
            r1.debug(r0)     // Catch: java.lang.Throwable -> L73
        L67:
            r0 = 0
        L68:
            if (r0 == 0) goto L6d
            r0.wakeup()     // Catch: java.lang.Throwable -> L73
        L6d:
            java.util.concurrent.locks.Lock r0 = r4.poolLock
            r0.unlock()
            return
        L73:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r4.poolLock
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.impl.conn.tsccm.ConnPoolByRoute.notifyWaitingThread(cz.msebera.android.httpclient.impl.conn.tsccm.RouteSpecificPool):void");
    }

    @Override // cz.msebera.android.httpclient.impl.conn.tsccm.AbstractConnPool
    public PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj) {
        return new PoolEntryRequest() { // from class: cz.msebera.android.httpclient.impl.conn.tsccm.ConnPoolByRoute.1
            final /* synthetic */ WaitingThreadAborter val$aborter;
            final /* synthetic */ HttpRoute val$route;
            final /* synthetic */ Object val$state;

            AnonymousClass1(WaitingThreadAborter waitingThreadAborter, HttpRoute httpRoute2, Object obj2) {
                waitingThreadAborter = waitingThreadAborter;
                httpRoute = httpRoute2;
                obj = obj2;
            }

            @Override // cz.msebera.android.httpclient.impl.conn.tsccm.PoolEntryRequest
            public void abortRequest() {
                ConnPoolByRoute.this.poolLock.lock();
                try {
                    waitingThreadAborter.abort();
                } finally {
                    ConnPoolByRoute.this.poolLock.unlock();
                }
            }

            @Override // cz.msebera.android.httpclient.impl.conn.tsccm.PoolEntryRequest
            public BasicPoolEntry getPoolEntry(long j2, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
                return ConnPoolByRoute.this.getEntryBlocking(httpRoute, obj, j2, timeUnit, waitingThreadAborter);
            }
        };
    }

    public void setMaxTotalConnections(int i2) {
        this.poolLock.lock();
        try {
            this.maxTotalConnections = i2;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.impl.conn.tsccm.AbstractConnPool
    public void shutdown() {
        this.poolLock.lock();
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Iterator<BasicPoolEntry> it = this.leasedConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                it.remove();
                closeConnection(next);
            }
            Iterator<BasicPoolEntry> it2 = this.freeConnections.iterator();
            while (it2.hasNext()) {
                BasicPoolEntry next2 = it2.next();
                it2.remove();
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Closing connection [" + next2.getPlannedRoute() + "][" + next2.getState() + "]");
                }
                closeConnection(next2);
            }
            Iterator<WaitingThread> it3 = this.waitingThreads.iterator();
            while (it3.hasNext()) {
                WaitingThread next3 = it3.next();
                it3.remove();
                next3.wakeup();
            }
            this.routeToPool.clear();
        } finally {
            this.poolLock.unlock();
        }
    }
}
