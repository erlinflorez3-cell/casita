package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public class RequestQueue {
    private static final int DEFAULT_NETWORK_THREAD_POOL_SIZE = 4;
    private final Cache mCache;
    private CacheDispatcher mCacheDispatcher;
    private final PriorityBlockingQueue<Request<?>> mCacheQueue;
    private final Set<Request<?>> mCurrentRequests;
    private final ResponseDelivery mDelivery;
    private final NetworkDispatcher[] mDispatchers;
    private final List<RequestEventListener> mEventListeners;
    private final List<RequestFinishedListener> mFinishedListeners;
    private final Network mNetwork;
    private final PriorityBlockingQueue<Request<?>> mNetworkQueue;
    private final AtomicInteger mSequenceGenerator;

    /* JADX INFO: renamed from: com.android.volley.RequestQueue$1 */
    class AnonymousClass1 implements RequestFilter {
        final /* synthetic */ Object val$tag;

        AnonymousClass1(Object obj) {
            obj = obj;
        }

        @Override // com.android.volley.RequestQueue.RequestFilter
        public boolean apply(Request<?> request) {
            return request.getTag() == obj;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestEvent {
        public static final int REQUEST_CACHE_LOOKUP_FINISHED = 2;
        public static final int REQUEST_CACHE_LOOKUP_STARTED = 1;
        public static final int REQUEST_FINISHED = 5;
        public static final int REQUEST_NETWORK_DISPATCH_FINISHED = 4;
        public static final int REQUEST_NETWORK_DISPATCH_STARTED = 3;
        public static final int REQUEST_QUEUED = 0;
    }

    public interface RequestEventListener {
        void onRequestEvent(Request<?> request, int i2);
    }

    public interface RequestFilter {
        boolean apply(Request<?> request);
    }

    @Deprecated
    public interface RequestFinishedListener<T> {
        void onRequestFinished(Request<T> request);
    }

    public RequestQueue(Cache cache, Network network) {
        this(cache, network, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RequestQueue(Cache cache, Network network, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(ZO.xd("U.\u001eGy$?[XU%1\u0015=V;G", (short) (C1633zX.Xd() ^ (-29800)), (short) (C1633zX.Xd() ^ (-18852)))).getDeclaredMethod(C1626yg.Ud("a\u007f\u0018\u0017\u0006\u0006)\u000b\u001c\u0007*\u0007\u000b", (short) (C1580rY.Xd() ^ (-23791)), (short) (C1580rY.Xd() ^ (-17673))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this(cache, network, i2, new ExecutorDelivery(new Handler((Looper) declaredMethod.invoke(null, objArr))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public RequestQueue(Cache cache, Network network, int i2, ResponseDelivery responseDelivery) {
        this.mSequenceGenerator = new AtomicInteger();
        this.mCurrentRequests = new HashSet();
        this.mCacheQueue = new PriorityBlockingQueue<>();
        this.mNetworkQueue = new PriorityBlockingQueue<>();
        this.mFinishedListeners = new ArrayList();
        this.mEventListeners = new ArrayList();
        this.mCache = cache;
        this.mNetwork = network;
        this.mDispatchers = new NetworkDispatcher[i2];
        this.mDelivery = responseDelivery;
    }

    public <T> Request<T> add(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.mCurrentRequests) {
            this.mCurrentRequests.add(request);
        }
        request.setSequence(getSequenceNumber());
        request.addMarker("add-to-queue");
        sendRequestEvent(request, 0);
        beginRequest(request);
        return request;
    }

    public void addRequestEventListener(RequestEventListener requestEventListener) {
        synchronized (this.mEventListeners) {
            this.mEventListeners.add(requestEventListener);
        }
    }

    @Deprecated
    public <T> void addRequestFinishedListener(RequestFinishedListener<T> requestFinishedListener) {
        synchronized (this.mFinishedListeners) {
            this.mFinishedListeners.add(requestFinishedListener);
        }
    }

    <T> void beginRequest(Request<T> request) {
        if (request.shouldCache()) {
            this.mCacheQueue.add(request);
        } else {
            sendRequestOverNetwork(request);
        }
    }

    public void cancelAll(RequestFilter requestFilter) {
        synchronized (this.mCurrentRequests) {
            for (Request<?> request : this.mCurrentRequests) {
                if (requestFilter.apply(request)) {
                    request.cancel();
                }
            }
        }
    }

    public void cancelAll(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        cancelAll((RequestFilter) new RequestFilter() { // from class: com.android.volley.RequestQueue.1
            final /* synthetic */ Object val$tag;

            AnonymousClass1(Object obj2) {
                obj = obj2;
            }

            @Override // com.android.volley.RequestQueue.RequestFilter
            public boolean apply(Request<?> request) {
                return request.getTag() == obj;
            }
        });
    }

    <T> void finish(Request<T> request) {
        synchronized (this.mCurrentRequests) {
            this.mCurrentRequests.remove(request);
        }
        synchronized (this.mFinishedListeners) {
            Iterator<RequestFinishedListener> it = this.mFinishedListeners.iterator();
            while (it.hasNext()) {
                it.next().onRequestFinished(request);
            }
        }
        sendRequestEvent(request, 5);
    }

    public Cache getCache() {
        return this.mCache;
    }

    public ResponseDelivery getResponseDelivery() {
        return this.mDelivery;
    }

    public int getSequenceNumber() {
        return this.mSequenceGenerator.incrementAndGet();
    }

    public void removeRequestEventListener(RequestEventListener requestEventListener) {
        synchronized (this.mEventListeners) {
            this.mEventListeners.remove(requestEventListener);
        }
    }

    @Deprecated
    public <T> void removeRequestFinishedListener(RequestFinishedListener<T> requestFinishedListener) {
        synchronized (this.mFinishedListeners) {
            this.mFinishedListeners.remove(requestFinishedListener);
        }
    }

    void sendRequestEvent(Request<?> request, int i2) {
        synchronized (this.mEventListeners) {
            Iterator<RequestEventListener> it = this.mEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onRequestEvent(request, i2);
            }
        }
    }

    <T> void sendRequestOverNetwork(Request<T> request) {
        this.mNetworkQueue.add(request);
    }

    public void start() {
        stop();
        CacheDispatcher cacheDispatcher = new CacheDispatcher(this.mCacheQueue, this.mNetworkQueue, this.mCache, this.mDelivery);
        this.mCacheDispatcher = cacheDispatcher;
        cacheDispatcher.start();
        for (int i2 = 0; i2 < this.mDispatchers.length; i2++) {
            NetworkDispatcher networkDispatcher = new NetworkDispatcher(this.mNetworkQueue, this.mNetwork, this.mCache, this.mDelivery);
            this.mDispatchers[i2] = networkDispatcher;
            networkDispatcher.start();
        }
    }

    public void stop() {
        CacheDispatcher cacheDispatcher = this.mCacheDispatcher;
        if (cacheDispatcher != null) {
            cacheDispatcher.quit();
        }
        for (NetworkDispatcher networkDispatcher : this.mDispatchers) {
            if (networkDispatcher != null) {
                networkDispatcher.quit();
            }
        }
    }
}
