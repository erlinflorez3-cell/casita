package cz.msebera.android.httpclient.pool;

import cz.msebera.android.httpclient.concurrent.FutureCallback;
import cz.msebera.android.httpclient.pool.PoolEntry;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.Asserts;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractConnPool<T, C, E extends PoolEntry<T, C>> implements ConnPool<T, E>, ConnPoolControl<T> {
    private final LinkedList<E> available;
    private final Condition condition;
    private final ConnFactory<T, C> connFactory;
    private volatile int defaultMaxPerRoute;
    private volatile boolean isShutDown;
    private final Set<E> leased;
    private final Lock lock;
    private final Map<T, Integer> maxPerRoute;
    private volatile int maxTotal;
    private final LinkedList<Future<E>> pending;
    private final Map<T, RouteSpecificPool<T, C, E>> routeToPool;
    private volatile int validateAfterInactivity;

    public AbstractConnPool(ConnFactory<T, C> connFactory, int i2, int i3) {
        this.connFactory = (ConnFactory) Args.notNull(connFactory, "Connection factory");
        this.defaultMaxPerRoute = Args.positive(i2, "Max per route value");
        this.maxTotal = Args.positive(i3, "Max total value");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.routeToPool = new HashMap();
        this.leased = new HashSet();
        this.available = new LinkedList<>();
        this.pending = new LinkedList<>();
        this.maxPerRoute = new HashMap();
    }

    private int getMax(T t2) {
        Integer num = this.maxPerRoute.get(t2);
        return num != null ? num.intValue() : this.defaultMaxPerRoute;
    }

    private RouteSpecificPool<T, C, E> getPool(final T t2) {
        RouteSpecificPool<T, C, E> routeSpecificPool = this.routeToPool.get(t2);
        if (routeSpecificPool != null) {
            return routeSpecificPool;
        }
        RouteSpecificPool<T, C, E> routeSpecificPool2 = (RouteSpecificPool<T, C, E>) new RouteSpecificPool<T, C, E>(t2) { // from class: cz.msebera.android.httpclient.pool.AbstractConnPool.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // cz.msebera.android.httpclient.pool.RouteSpecificPool
            protected E createEntry(C c2) {
                return (E) AbstractConnPool.this.createEntry(t2, c2);
            }
        };
        this.routeToPool.put(t2, routeSpecificPool2);
        return routeSpecificPool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public E getPoolEntryBlocking(T t2, Object obj, long j2, TimeUnit timeUnit, Future<E> future) throws InterruptedException, TimeoutException, IOException {
        E e2;
        Date date = j2 > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j2)) : null;
        this.lock.lock();
        try {
            RouteSpecificPool pool = getPool(t2);
            while (true) {
                boolean zAwaitUntil = true;
                Asserts.check(!this.isShutDown, "Connection pool shut down");
                while (true) {
                    e2 = (E) pool.getFree(obj);
                    if (e2 == null) {
                        break;
                    }
                    if (e2.isExpired(System.currentTimeMillis())) {
                        e2.close();
                    }
                    if (!e2.isClosed()) {
                        break;
                    }
                    this.available.remove(e2);
                    pool.free(e2, false);
                }
                if (e2 != null) {
                    this.available.remove(e2);
                    this.leased.add(e2);
                    onReuse(e2);
                    return e2;
                }
                int max = getMax(t2);
                int iMax = Math.max(0, (pool.getAllocatedCount() + 1) - max);
                if (iMax > 0) {
                    for (int i2 = 0; i2 < iMax; i2++) {
                        PoolEntry lastUsed = pool.getLastUsed();
                        if (lastUsed == null) {
                            break;
                        }
                        lastUsed.close();
                        this.available.remove(lastUsed);
                        pool.remove(lastUsed);
                    }
                }
                if (pool.getAllocatedCount() < max) {
                    int iMax2 = Math.max(this.maxTotal - this.leased.size(), 0);
                    if (iMax2 > 0) {
                        if (this.available.size() > iMax2 - 1 && !this.available.isEmpty()) {
                            E eRemoveLast = this.available.removeLast();
                            eRemoveLast.close();
                            getPool(eRemoveLast.getRoute()).remove(eRemoveLast);
                        }
                        E e3 = (E) pool.add(this.connFactory.create(t2));
                        this.leased.add(e3);
                        return e3;
                    }
                }
                try {
                    if (future.isCancelled()) {
                        throw new InterruptedException("Operation interrupted");
                    }
                    pool.queue(future);
                    this.pending.add(future);
                    if (date != null) {
                        zAwaitUntil = this.condition.awaitUntil(date);
                    } else {
                        this.condition.await();
                    }
                    if (future.isCancelled()) {
                        throw new InterruptedException("Operation interrupted");
                    }
                    if (!zAwaitUntil && date != null && date.getTime() <= System.currentTimeMillis()) {
                        throw new TimeoutException("Timeout waiting for connection");
                    }
                } finally {
                    pool.unqueue(future);
                    this.pending.remove(future);
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    private void purgePoolMap() {
        Iterator<Map.Entry<T, RouteSpecificPool<T, C, E>>> it = this.routeToPool.entrySet().iterator();
        while (it.hasNext()) {
            RouteSpecificPool<T, C, E> value = it.next().getValue();
            if (value.getPendingCount() + value.getAllocatedCount() == 0) {
                it.remove();
            }
        }
    }

    public void closeExpired() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        enumAvailable(new PoolEntryCallback<T, C>() { // from class: cz.msebera.android.httpclient.pool.AbstractConnPool.4
            @Override // cz.msebera.android.httpclient.pool.PoolEntryCallback
            public void process(PoolEntry<T, C> poolEntry) {
                if (poolEntry.isExpired(jCurrentTimeMillis)) {
                    poolEntry.close();
                }
            }
        });
    }

    public void closeIdle(long j2, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j2);
        if (millis < 0) {
            millis = 0;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis() - millis;
        enumAvailable(new PoolEntryCallback<T, C>() { // from class: cz.msebera.android.httpclient.pool.AbstractConnPool.3
            @Override // cz.msebera.android.httpclient.pool.PoolEntryCallback
            public void process(PoolEntry<T, C> poolEntry) {
                if (poolEntry.getUpdated() <= jCurrentTimeMillis) {
                    poolEntry.close();
                }
            }
        });
    }

    protected abstract E createEntry(T t2, C c2);

    protected void enumAvailable(PoolEntryCallback<T, C> poolEntryCallback) {
        this.lock.lock();
        try {
            Iterator<E> it = this.available.iterator();
            while (it.hasNext()) {
                E next = it.next();
                poolEntryCallback.process(next);
                if (next.isClosed()) {
                    getPool(next.getRoute()).remove(next);
                    it.remove();
                }
            }
            purgePoolMap();
        } finally {
            this.lock.unlock();
        }
    }

    protected void enumLeased(PoolEntryCallback<T, C> poolEntryCallback) {
        this.lock.lock();
        try {
            Iterator<E> it = this.leased.iterator();
            while (it.hasNext()) {
                poolEntryCallback.process(it.next());
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        this.lock.lock();
        try {
            return this.defaultMaxPerRoute;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPoolControl
    public int getMaxPerRoute(T t2) {
        Args.notNull(t2, "Route");
        this.lock.lock();
        try {
            return getMax(t2);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPoolControl
    public int getMaxTotal() {
        this.lock.lock();
        try {
            return this.maxTotal;
        } finally {
            this.lock.unlock();
        }
    }

    public Set<T> getRoutes() {
        this.lock.lock();
        try {
            return new HashSet(this.routeToPool.keySet());
        } finally {
            this.lock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPoolControl
    public PoolStats getStats(T t2) {
        Args.notNull(t2, "Route");
        this.lock.lock();
        try {
            RouteSpecificPool<T, C, E> pool = getPool(t2);
            return new PoolStats(pool.getLeasedCount(), pool.getPendingCount(), pool.getAvailableCount(), getMax(t2));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        this.lock.lock();
        try {
            return new PoolStats(this.leased.size(), this.pending.size(), this.available.size(), this.maxTotal);
        } finally {
            this.lock.unlock();
        }
    }

    public int getValidateAfterInactivity() {
        return this.validateAfterInactivity;
    }

    public boolean isShutdown() {
        return this.isShutDown;
    }

    public Future<E> lease(T t2, Object obj) {
        return lease(t2, obj, null);
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPool
    public Future<E> lease(final T t2, final Object obj, final FutureCallback<E> futureCallback) {
        Args.notNull(t2, "Route");
        Asserts.check(!this.isShutDown, "Connection pool shut down");
        return (Future<E>) new Future<E>() { // from class: cz.msebera.android.httpclient.pool.AbstractConnPool.2
            private final AtomicBoolean cancelled = new AtomicBoolean(false);
            private final AtomicBoolean done = new AtomicBoolean(false);
            private final AtomicReference<E> entryRef = new AtomicReference<>(null);

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z2) {
                if (!this.cancelled.compareAndSet(false, true)) {
                    return false;
                }
                this.done.set(true);
                AbstractConnPool.this.lock.lock();
                try {
                    AbstractConnPool.this.condition.signalAll();
                    AbstractConnPool.this.lock.unlock();
                    FutureCallback futureCallback2 = futureCallback;
                    if (futureCallback2 != null) {
                        futureCallback2.cancelled();
                    }
                    return true;
                } catch (Throwable th) {
                    AbstractConnPool.this.lock.unlock();
                    throw th;
                }
            }

            @Override // java.util.concurrent.Future
            public E get() throws ExecutionException, InterruptedException {
                try {
                    return (E) get(0L, TimeUnit.MILLISECONDS);
                } catch (TimeoutException e2) {
                    throw new ExecutionException(e2);
                }
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.concurrent.Future
            public E get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
                E e2;
                E e3 = this.entryRef.get();
                if (e3 != null) {
                    return e3;
                }
                synchronized (this) {
                    while (true) {
                        try {
                            e2 = (E) AbstractConnPool.this.getPoolEntryBlocking(t2, obj, j2, timeUnit, this);
                            if (AbstractConnPool.this.validateAfterInactivity <= 0 || e2.getUpdated() + ((long) AbstractConnPool.this.validateAfterInactivity) > System.currentTimeMillis() || AbstractConnPool.this.validate(e2)) {
                                break;
                            }
                            e2.close();
                            AbstractConnPool.this.release((PoolEntry) e2, false);
                        } catch (IOException e4) {
                            this.done.set(true);
                            FutureCallback futureCallback2 = futureCallback;
                            if (futureCallback2 != null) {
                                futureCallback2.failed(e4);
                            }
                            throw new ExecutionException(e4);
                        }
                    }
                    this.entryRef.set(e2);
                    this.done.set(true);
                    AbstractConnPool.this.onLease(e2);
                    FutureCallback futureCallback3 = futureCallback;
                    if (futureCallback3 != null) {
                        futureCallback3.completed(e2);
                    }
                }
                return e2;
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return this.cancelled.get();
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return this.done.get();
            }
        };
    }

    protected void onLease(E e2) {
    }

    protected void onRelease(E e2) {
    }

    protected void onReuse(E e2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cz.msebera.android.httpclient.pool.ConnPool
    public void release(E e2, boolean z2) {
        this.lock.lock();
        try {
            if (this.leased.remove(e2)) {
                RouteSpecificPool pool = getPool(e2.getRoute());
                pool.free(e2, z2);
                if (!z2 || this.isShutDown) {
                    e2.close();
                } else {
                    this.available.addFirst(e2);
                }
                onRelease(e2);
                Future<E> futureNextPending = pool.nextPending();
                if (futureNextPending != null) {
                    this.pending.remove(futureNextPending);
                } else {
                    futureNextPending = this.pending.poll();
                }
                if (futureNextPending != null) {
                    this.condition.signalAll();
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i2) {
        Args.positive(i2, "Max per route value");
        this.lock.lock();
        try {
            this.defaultMaxPerRoute = i2;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPoolControl
    public void setMaxPerRoute(T t2, int i2) {
        Args.notNull(t2, "Route");
        this.lock.lock();
        try {
            if (i2 > -1) {
                this.maxPerRoute.put(t2, Integer.valueOf(i2));
            } else {
                this.maxPerRoute.remove(t2);
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // cz.msebera.android.httpclient.pool.ConnPoolControl
    public void setMaxTotal(int i2) {
        Args.positive(i2, "Max value");
        this.lock.lock();
        try {
            this.maxTotal = i2;
        } finally {
            this.lock.unlock();
        }
    }

    public void setValidateAfterInactivity(int i2) {
        this.validateAfterInactivity = i2;
    }

    public void shutdown() throws IOException {
        if (this.isShutDown) {
            return;
        }
        this.isShutDown = true;
        this.lock.lock();
        try {
            Iterator<E> it = this.available.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<E> it2 = this.leased.iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
            Iterator<RouteSpecificPool<T, C, E>> it3 = this.routeToPool.values().iterator();
            while (it3.hasNext()) {
                it3.next().shutdown();
            }
            this.routeToPool.clear();
            this.leased.clear();
            this.available.clear();
        } finally {
            this.lock.unlock();
        }
    }

    public String toString() {
        this.lock.lock();
        try {
            return "[leased: " + this.leased + "][available: " + this.available + "][pending: " + this.pending + "]";
        } finally {
            this.lock.unlock();
        }
    }

    protected boolean validate(E e2) {
        return true;
    }
}
