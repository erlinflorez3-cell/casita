package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class RequestManager implements ComponentCallbacks2, LifecycleListener, ModelTypes<RequestBuilder<Drawable>> {
    private static final RequestOptions DECODE_TYPE_BITMAP = RequestOptions.decodeTypeOf(Bitmap.class).lock();
    private static final RequestOptions DECODE_TYPE_GIF = RequestOptions.decodeTypeOf(GifDrawable.class).lock();
    private static final RequestOptions DOWNLOAD_ONLY_OPTIONS = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private final ConnectivityMonitor connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<RequestListener<Object>> defaultRequestListeners;
    protected final Glide glide;
    final Lifecycle lifecycle;
    private final Handler mainHandler;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private RequestOptions requestOptions;
    private final RequestTracker requestTracker;
    private final TargetTracker targetTracker;
    private final RequestManagerTreeNode treeNode;

    /* JADX INFO: renamed from: com.bumptech.glide.RequestManager$1 */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestManager.this.lifecycle.addListener(RequestManager.this);
        }
    }

    private static class ClearTarget extends CustomViewTarget<View, Object> {
        ClearTarget(View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        protected void onResourceCleared(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Object obj, Transition<? super Object> transition) {
        }
    }

    private class RequestManagerConnectivityListener implements ConnectivityMonitor.ConnectivityListener {
        private final RequestTracker requestTracker;

        RequestManagerConnectivityListener(RequestTracker requestTracker) {
            this.requestTracker = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean z2) {
            if (z2) {
                synchronized (RequestManager.this) {
                    this.requestTracker.restartRequests();
                }
            }
        }
    }

    public RequestManager(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        this(glide, lifecycle, requestManagerTreeNode, new RequestTracker(), glide.getConnectivityMonitorFactory(), context);
    }

    RequestManager(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, RequestTracker requestTracker, ConnectivityMonitorFactory connectivityMonitorFactory, Context context) throws Throwable {
        this.targetTracker = new TargetTracker();
        AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.bumptech.glide.RequestManager.1
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RequestManager.this.lifecycle.addListener(RequestManager.this);
            }
        };
        this.addSelfToLifecycle = anonymousClass1;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(hg.Vd("R^S`\\UO\u0018X[\u00152TSSGS", (short) (C1633zX.Xd() ^ (-25355)), (short) (C1633zX.Xd() ^ (-4967)))).getDeclaredMethod(C1561oA.ud("a^lDW^b?a``T`", (short) (OY.Xd() ^ 25050)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.mainHandler = handler;
            this.glide = glide;
            this.lifecycle = lifecycle;
            this.treeNode = requestManagerTreeNode;
            this.requestTracker = requestTracker;
            this.context = context;
            short sXd = (short) (C1499aX.Xd() ^ (-6552));
            int[] iArr = new int["drixnie0n{{\u0003lv}8V\u0004\u0004\u000bt\t\u0006".length()];
            QB qb = new QB("drixnie0n{{\u0003lv}8V\u0004\u0004\u000bt\t\u0006");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd2 = (short) (OY.Xd() ^ 10593);
            int[] iArr2 = new int["ML\\*Z[XVQPdZaa7ddk]qn".length()];
            QB qb2 = new QB("ML\\*Z[XVQPdZaa7ddk]qn");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                ConnectivityMonitor connectivityMonitorBuild = connectivityMonitorFactory.build((Context) method.invoke(context, objArr2), new RequestManagerConnectivityListener(requestTracker));
                this.connectivityMonitor = connectivityMonitorBuild;
                if (Util.isOnBackgroundThread()) {
                    Class<?> cls2 = Class.forName(Xg.qd("\f\u001a\u0011 \u001e\u0019\u0015_\"'b}\u0018&\u001d& .", (short) (C1633zX.Xd() ^ (-16144)), (short) (C1633zX.Xd() ^ (-12975))));
                    Class<?>[] clsArr2 = {Class.forName(Jg.Wd("q)L\u0018q\u0001\u0014qw\u001b51~\t`jI\\", (short) (C1499aX.Xd() ^ (-29131)), (short) (C1499aX.Xd() ^ (-28687))))};
                    Object[] objArr3 = {anonymousClass1};
                    short sXd3 = (short) (OY.Xd() ^ 18847);
                    short sXd4 = (short) (OY.Xd() ^ 27921);
                    int[] iArr3 = new int["kc&C".length()];
                    QB qb3 = new QB("kc&C");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd4) + sXd3)));
                        i4++;
                    }
                    Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(handler, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    lifecycle.addListener(this);
                }
                lifecycle.addListener(connectivityMonitorBuild);
                this.defaultRequestListeners = new CopyOnWriteArrayList<>(glide.getGlideContext().getDefaultRequestListeners());
                setRequestOptions(glide.getGlideContext().getDefaultRequestOptions());
                glide.registerRequestManager(this);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private void untrackOrDelegate(Target<?> target) {
        boolean zUntrack = untrack(target);
        Request request = target.getRequest();
        if (zUntrack || this.glide.removeFromManagers(target) || request == null) {
            return;
        }
        target.setRequest(null);
        request.clear();
    }

    private synchronized void updateRequestOptions(RequestOptions requestOptions) {
        this.requestOptions = this.requestOptions.apply(requestOptions);
    }

    public RequestManager addDefaultRequestListener(RequestListener<Object> requestListener) {
        this.defaultRequestListeners.add(requestListener);
        return this;
    }

    public synchronized RequestManager applyDefaultRequestOptions(RequestOptions requestOptions) {
        updateRequestOptions(requestOptions);
        return this;
    }

    public <ResourceType> RequestBuilder<ResourceType> as(Class<ResourceType> cls) {
        return new RequestBuilder<>(this.glide, this, cls, this.context);
    }

    public RequestBuilder<Bitmap> asBitmap() {
        return as(Bitmap.class).apply((BaseRequestOptions<?>) DECODE_TYPE_BITMAP);
    }

    public RequestBuilder<Drawable> asDrawable() {
        return as(Drawable.class);
    }

    public RequestBuilder<File> asFile() {
        return as(File.class).apply((BaseRequestOptions<?>) RequestOptions.skipMemoryCacheOf(true));
    }

    public RequestBuilder<GifDrawable> asGif() {
        return as(GifDrawable.class).apply((BaseRequestOptions<?>) DECODE_TYPE_GIF);
    }

    public void clear(View view) {
        clear(new ClearTarget(view));
    }

    public void clear(Target<?> target) {
        if (target == null) {
            return;
        }
        untrackOrDelegate(target);
    }

    public RequestBuilder<File> download(Object obj) {
        return downloadOnly().load(obj);
    }

    public RequestBuilder<File> downloadOnly() {
        return as(File.class).apply((BaseRequestOptions<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    List<RequestListener<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    synchronized RequestOptions getDefaultRequestOptions() {
        return this.requestOptions;
    }

    <T> TransitionOptions<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.getGlideContext().getDefaultTransitionOptions(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.isPaused();
    }

    @Override // com.bumptech.glide.ModelTypes
    public RequestBuilder<Drawable> load(Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    @Override // com.bumptech.glide.ModelTypes
    public RequestBuilder<Drawable> load(Drawable drawable) {
        return asDrawable().load(drawable);
    }

    @Override // com.bumptech.glide.ModelTypes
    public RequestBuilder<Drawable> load(Uri uri) {
        return asDrawable().load(uri);
    }

    @Override // com.bumptech.glide.ModelTypes
    public RequestBuilder<Drawable> load(File file) {
        return asDrawable().load(file);
    }

    @Override // com.bumptech.glide.ModelTypes
    public RequestBuilder<Drawable> load(Integer num) {
        return asDrawable().load(num);
    }

    @Override // com.bumptech.glide.ModelTypes
    public RequestBuilder<Drawable> load(Object obj) {
        return asDrawable().load(obj);
    }

    @Override // com.bumptech.glide.ModelTypes
    public RequestBuilder<Drawable> load(String str) {
        return asDrawable().load(str);
    }

    @Override // com.bumptech.glide.ModelTypes
    @Deprecated
    public RequestBuilder<Drawable> load(URL url) {
        return asDrawable().load(url);
    }

    @Override // com.bumptech.glide.ModelTypes
    public RequestBuilder<Drawable> load(byte[] bArr) {
        return asDrawable().load(bArr);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        Iterator<Target<?>> it = this.targetTracker.getAll().iterator();
        while (it.hasNext()) {
            clear(it.next());
        }
        this.targetTracker.clear();
        this.requestTracker.clearRequests();
        this.lifecycle.removeListener(this);
        this.lifecycle.removeListener(this.connectivityMonitor);
        this.mainHandler.removeCallbacks(this.addSelfToLifecycle);
        this.glide.unregisterRequestManager(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStop() {
        pauseRequests();
        this.targetTracker.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        if (i2 == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.pauseAllRequests();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator<RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.requestTracker.pauseRequests();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator<RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.requestTracker.resumeRequests();
    }

    public synchronized void resumeRequestsRecursive() {
        Util.assertMainThread();
        resumeRequests();
        Iterator<RequestManager> it = this.treeNode.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().resumeRequests();
        }
    }

    public synchronized RequestManager setDefaultRequestOptions(RequestOptions requestOptions) {
        setRequestOptions(requestOptions);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z2) {
        this.pauseAllRequestsOnTrimMemoryModerate = z2;
    }

    protected synchronized void setRequestOptions(RequestOptions requestOptions) {
        this.requestOptions = requestOptions.mo7079clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    synchronized void track(Target<?> target, Request request) {
        this.targetTracker.track(target);
        this.requestTracker.runRequest(request);
    }

    synchronized boolean untrack(Target<?> target) {
        Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.clearAndRemove(request)) {
            return false;
        }
        this.targetTracker.untrack(target);
        target.setRequest(null);
        return true;
    }
}
