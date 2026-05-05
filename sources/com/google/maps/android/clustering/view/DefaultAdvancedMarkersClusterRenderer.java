package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.AdvancedMarker;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.R;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultAdvancedMarkersClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {
    private boolean mAnimate;
    private long mAnimationDurationMs;
    private ClusterManager.OnClusterClickListener<T> mClickListener;
    private final ClusterManager<T> mClusterManager;
    private MarkerCache<Cluster<T>> mClusterMarkerCache;
    private Set<? extends Cluster<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final Executor mExecutor;
    private final IconGenerator mIconGenerator;
    private SparseArray<BitmapDescriptor> mIcons;
    private ClusterManager.OnClusterInfoWindowClickListener<T> mInfoWindowClickListener;
    private ClusterManager.OnClusterInfoWindowLongClickListener<T> mInfoWindowLongClickListener;
    private ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    private ClusterManager.OnClusterItemInfoWindowClickListener<T> mItemInfoWindowClickListener;
    private ClusterManager.OnClusterItemInfoWindowLongClickListener<T> mItemInfoWindowLongClickListener;
    private final GoogleMap mMap;
    private MarkerCache<T> mMarkerCache;
    private Set<MarkerWithPosition> mMarkers;
    private int mMinClusterSize;
    private final DefaultAdvancedMarkersClusterRenderer<T>.ViewModifier mViewModifier;
    private float mZoom;
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();

    private class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final LatLng from;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final Marker marker;
        private final MarkerWithPosition markerWithPosition;
        private final LatLng to;

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.to = latLng2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.remove(this.marker);
                DefaultAdvancedMarkersClusterRenderer.this.mClusterMarkerCache.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            this.markerWithPosition.position = this.to;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            double animatedFraction = valueAnimator.getAnimatedFraction();
            double d2 = ((this.to.latitude - this.from.latitude) * animatedFraction) + this.from.latitude;
            double dSignum = this.to.longitude - this.from.longitude;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            this.marker.setPosition(new LatLng(d2, (dSignum * animatedFraction) + this.from.longitude));
        }

        public void perform() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(DefaultAdvancedMarkersClusterRenderer.ANIMATION_INTERP);
            valueAnimatorOfFloat.setDuration(DefaultAdvancedMarkersClusterRenderer.this.mAnimationDurationMs);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }
    }

    private class CreateMarkerTask {
        private final LatLng animateFrom;
        private final Cluster<T> cluster;
        private final Set<MarkerWithPosition> newMarkers;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.cluster = cluster;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void perform(DefaultAdvancedMarkersClusterRenderer<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            if (DefaultAdvancedMarkersClusterRenderer.this.shouldRenderAsCluster(this.cluster)) {
                AdvancedMarker advancedMarker = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.mClusterMarkerCache.get(this.cluster);
                if (advancedMarker == null) {
                    AdvancedMarkerOptions advancedMarkerOptions = new AdvancedMarkerOptions();
                    LatLng position = this.animateFrom;
                    if (position == null) {
                        position = this.cluster.getPosition();
                    }
                    AdvancedMarkerOptions advancedMarkerOptionsPosition = advancedMarkerOptions.position(position);
                    DefaultAdvancedMarkersClusterRenderer.this.onBeforeClusterRendered(this.cluster, advancedMarkerOptionsPosition);
                    advancedMarker = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.mClusterManager.getClusterMarkerCollection().addMarker(advancedMarkerOptionsPosition);
                    DefaultAdvancedMarkersClusterRenderer.this.mClusterMarkerCache.put(this.cluster, advancedMarker);
                    markerWithPosition = new MarkerWithPosition(advancedMarker);
                    LatLng latLng = this.animateFrom;
                    if (latLng != null) {
                        markerModifier.animate(markerWithPosition, latLng, this.cluster.getPosition());
                    }
                } else {
                    markerWithPosition = new MarkerWithPosition(advancedMarker);
                    DefaultAdvancedMarkersClusterRenderer.this.onClusterUpdated(this.cluster, advancedMarker);
                }
                DefaultAdvancedMarkersClusterRenderer.this.onClusterRendered(this.cluster, advancedMarker);
                this.newMarkers.add(markerWithPosition);
                return;
            }
            for (T t2 : this.cluster.getItems()) {
                AdvancedMarker advancedMarker2 = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.get(t2);
                if (advancedMarker2 == null) {
                    AdvancedMarkerOptions advancedMarkerOptions2 = new AdvancedMarkerOptions();
                    LatLng latLng2 = this.animateFrom;
                    if (latLng2 != null) {
                        advancedMarkerOptions2.position(latLng2);
                    } else {
                        advancedMarkerOptions2.position(t2.getPosition());
                        if (t2.getZIndex() != null) {
                            advancedMarkerOptions2.zIndex(t2.getZIndex().floatValue());
                        }
                    }
                    DefaultAdvancedMarkersClusterRenderer.this.onBeforeClusterItemRendered(t2, advancedMarkerOptions2);
                    advancedMarker2 = (AdvancedMarker) DefaultAdvancedMarkersClusterRenderer.this.mClusterManager.getMarkerCollection().addMarker(advancedMarkerOptions2);
                    markerWithPosition2 = new MarkerWithPosition(advancedMarker2);
                    DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.put(t2, advancedMarker2);
                    LatLng latLng3 = this.animateFrom;
                    if (latLng3 != null) {
                        markerModifier.animate(markerWithPosition2, latLng3, t2.getPosition());
                    }
                } else {
                    markerWithPosition2 = new MarkerWithPosition(advancedMarker2);
                    DefaultAdvancedMarkersClusterRenderer.this.onClusterItemUpdated(t2, advancedMarker2);
                }
                DefaultAdvancedMarkersClusterRenderer.this.onClusterItemRendered(t2, advancedMarker2);
                this.newMarkers.add(markerWithPosition2);
            }
        }
    }

    private static class MarkerCache<T> {
        private Map<T, Marker> mCache;
        private Map<Marker, T> mCacheReverse;

        private MarkerCache() {
            this.mCache = new HashMap();
            this.mCacheReverse = new HashMap();
        }

        public Marker get(T t2) {
            return this.mCache.get(t2);
        }

        public T get(Marker marker) {
            return this.mCacheReverse.get(marker);
        }

        public void put(T t2, Marker marker) {
            this.mCache.put(t2, marker);
            this.mCacheReverse.put(marker, t2);
        }

        public void remove(Marker marker) {
            T t2 = this.mCacheReverse.get(marker);
            this.mCacheReverse.remove(marker);
            this.mCache.remove(t2);
        }
    }

    private class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private Queue<DefaultAdvancedMarkersClusterRenderer<T>.AnimationTask> mAnimationTasks;
        private Queue<DefaultAdvancedMarkersClusterRenderer<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private Queue<DefaultAdvancedMarkersClusterRenderer<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private Queue<Marker> mOnScreenRemoveMarkerTasks;
        private Queue<Marker> mRemoveMarkerTasks;

        /* JADX WARN: Illegal instructions before constructor call */
        private MarkerModifier() throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Qd("WcXeaZT\u001d]`\u001a7YXXLX", (short) (C1499aX.Xd() ^ (-12117)))).getDeclaredMethod(C1593ug.zd("ML\\6KTZ9]^`Vd", (short) (C1580rY.Xd() ^ (-5107)), (short) (C1580rY.Xd() ^ (-11883))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                super((Looper) declaredMethod.invoke(null, objArr));
                ReentrantLock reentrantLock = new ReentrantLock();
                this.lock = reentrantLock;
                this.busyCondition = reentrantLock.newCondition();
                this.mCreateMarkerTasks = new LinkedList();
                this.mOnScreenCreateMarkerTasks = new LinkedList();
                this.mRemoveMarkerTasks = new LinkedList();
                this.mOnScreenRemoveMarkerTasks = new LinkedList();
                this.mAnimationTasks = new LinkedList();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mAnimationTasks.isEmpty()) {
                this.mAnimationTasks.poll().perform();
                return;
            }
            if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                this.mOnScreenCreateMarkerTasks.poll().perform(this);
            } else if (!this.mCreateMarkerTasks.isEmpty()) {
                this.mCreateMarkerTasks.poll().perform(this);
            } else {
                if (this.mRemoveMarkerTasks.isEmpty()) {
                    return;
                }
                removeMarker(this.mRemoveMarkerTasks.poll());
            }
        }

        private void removeMarker(Marker marker) {
            DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.remove(marker);
            DefaultAdvancedMarkersClusterRenderer.this.mClusterMarkerCache.remove(marker);
            DefaultAdvancedMarkersClusterRenderer.this.mClusterManager.getMarkerManager().remove(marker);
        }

        public void add(boolean z2, DefaultAdvancedMarkersClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z2) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            this.mAnimationTasks.add(new AnimationTask(markerWithPosition, latLng, latLng2));
            this.lock.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            DefaultAdvancedMarkersClusterRenderer<T>.AnimationTask animationTask = new AnimationTask(markerWithPosition, latLng, latLng2);
            animationTask.removeOnAnimationComplete(DefaultAdvancedMarkersClusterRenderer.this.mClusterManager.getMarkerManager());
            this.mAnimationTasks.add(animationTask);
            this.lock.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            for (int i2 = 0; i2 < 10; i2++) {
                try {
                    performNextTask();
                } finally {
                    this.lock.unlock();
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isBusy() {
            /*
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.lock     // Catch: java.lang.Throwable -> L36
                r0.lock()     // Catch: java.lang.Throwable -> L36
                java.util.Queue<com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer<T>$CreateMarkerTask> r0 = r2.mCreateMarkerTasks     // Catch: java.lang.Throwable -> L36
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L2d
                java.util.Queue<com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer<T>$CreateMarkerTask> r0 = r2.mOnScreenCreateMarkerTasks     // Catch: java.lang.Throwable -> L36
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L2d
                java.util.Queue<com.google.android.gms.maps.model.Marker> r0 = r2.mOnScreenRemoveMarkerTasks     // Catch: java.lang.Throwable -> L36
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L2d
                java.util.Queue<com.google.android.gms.maps.model.Marker> r0 = r2.mRemoveMarkerTasks     // Catch: java.lang.Throwable -> L36
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L2d
                java.util.Queue<com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer<T>$AnimationTask> r0 = r2.mAnimationTasks     // Catch: java.lang.Throwable -> L36
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L36
                if (r0 != 0) goto L34
            L2d:
                r1 = 1
            L2e:
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.unlock()
                return r1
            L34:
                r1 = 0
                goto L2e
            L36:
                r1 = move-exception
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer.MarkerModifier.isBusy():boolean");
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z2, Marker marker) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z2) {
                this.mOnScreenRemoveMarkerTasks.add(marker);
            } else {
                this.mRemoveMarkerTasks.add(marker);
            }
            this.lock.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                    } catch (InterruptedException e2) {
                        throw new RuntimeException(e2);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }
    }

    private static class MarkerWithPosition {
        private final Marker marker;
        private LatLng position;

        private MarkerWithPosition(Marker marker) {
            this.marker = marker;
            this.position = marker.getPosition();
        }

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.marker.equals(((MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }
    }

    private class RenderTask implements Runnable {
        final Set<? extends Cluster<T>> clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private Projection mProjection;
        private SphericalMercatorProjection mSphericalMercatorProjection;

        private RenderTask(Set<? extends Cluster<T>> set) {
            this.clusters = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            LatLngBounds latLngBoundsBuild;
            ArrayList arrayList;
            DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer = DefaultAdvancedMarkersClusterRenderer.this;
            if (!defaultAdvancedMarkersClusterRenderer.shouldRender(defaultAdvancedMarkersClusterRenderer.immutableOf(defaultAdvancedMarkersClusterRenderer.mClusters), DefaultAdvancedMarkersClusterRenderer.this.immutableOf(this.clusters))) {
                this.mCallback.run();
                return;
            }
            ArrayList arrayList2 = null;
            MarkerModifier markerModifier = new MarkerModifier();
            float f2 = this.mMapZoom;
            boolean z2 = f2 > DefaultAdvancedMarkersClusterRenderer.this.mZoom;
            float f3 = f2 - DefaultAdvancedMarkersClusterRenderer.this.mZoom;
            Set<MarkerWithPosition> set = DefaultAdvancedMarkersClusterRenderer.this.mMarkers;
            try {
                latLngBoundsBuild = this.mProjection.getVisibleRegion().latLngBounds;
            } catch (Exception e2) {
                e2.printStackTrace();
                latLngBoundsBuild = LatLngBounds.builder().include(new LatLng(0.0d, 0.0d)).build();
            }
            if (DefaultAdvancedMarkersClusterRenderer.this.mClusters == null || !DefaultAdvancedMarkersClusterRenderer.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster<T> cluster : DefaultAdvancedMarkersClusterRenderer.this.mClusters) {
                    if (DefaultAdvancedMarkersClusterRenderer.this.shouldRenderAsCluster(cluster) && latLngBoundsBuild.contains(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster<T> cluster2 : this.clusters) {
                boolean zContains = latLngBoundsBuild.contains(cluster2.getPosition());
                if (z2 && zContains && DefaultAdvancedMarkersClusterRenderer.this.mAnimate) {
                    Point pointFindClosestCluster = DefaultAdvancedMarkersClusterRenderer.this.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (pointFindClosestCluster != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster)));
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                    }
                } else {
                    markerModifier.add(zContains, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(setNewSetFromMap);
            if (DefaultAdvancedMarkersClusterRenderer.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (Cluster<T> cluster3 : this.clusters) {
                    if (DefaultAdvancedMarkersClusterRenderer.this.shouldRenderAsCluster(cluster3) && latLngBoundsBuild.contains(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean zContains2 = latLngBoundsBuild.contains(markerWithPosition.position);
                if (z2 || f3 <= -3.0f || !zContains2 || !DefaultAdvancedMarkersClusterRenderer.this.mAnimate) {
                    markerModifier.remove(zContains2, markerWithPosition.marker);
                } else {
                    Point pointFindClosestCluster2 = DefaultAdvancedMarkersClusterRenderer.this.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (pointFindClosestCluster2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster2));
                    } else {
                        markerModifier.remove(true, markerWithPosition.marker);
                    }
                }
            }
            markerModifier.waitUntilFree();
            DefaultAdvancedMarkersClusterRenderer.this.mMarkers = setNewSetFromMap;
            DefaultAdvancedMarkersClusterRenderer.this.mClusters = this.clusters;
            DefaultAdvancedMarkersClusterRenderer.this.mZoom = f2;
            this.mCallback.run();
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setMapZoom(float f2) {
            this.mMapZoom = f2;
            this.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f2, DefaultAdvancedMarkersClusterRenderer.this.mZoom)) * 256.0d);
        }

        public void setProjection(Projection projection) {
            this.mProjection = projection;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ViewModifier extends Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private DefaultAdvancedMarkersClusterRenderer<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        private ViewModifier() {
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DefaultAdvancedMarkersClusterRenderer<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            Projection projection = DefaultAdvancedMarkersClusterRenderer.this.mMap.getProjection();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new Runnable() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer$ViewModifier$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7786x1c4a00de();
                }
            });
            renderTask.setProjection(projection);
            renderTask.setMapZoom(DefaultAdvancedMarkersClusterRenderer.this.mMap.getCameraPosition().zoom);
            DefaultAdvancedMarkersClusterRenderer.this.mExecutor.execute(renderTask);
        }

        /* JADX INFO: renamed from: lambda$handleMessage$0$com-google-maps-android-clustering-view-DefaultAdvancedMarkersClusterRenderer$ViewModifier, reason: not valid java name */
        /* synthetic */ void m7786x1c4a00de() {
            sendEmptyMessage(1);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(set);
            }
            sendEmptyMessage(0);
        }
    }

    public DefaultAdvancedMarkersClusterRenderer(Context context, GoogleMap googleMap, ClusterManager<T> clusterManager) throws Throwable {
        short sXd = (short) (OY.Xd() ^ 27876);
        int[] iArr = new int["?5I3~EC79y.97+<87)16n\u00057# 1/)++".length()];
        QB qb = new QB("?5I3~EC79y.97+<87)16n\u00057# 1/)++");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Kd("e]pMdjdjdTitheiK\u007fml\u007f\u007f{\u007f", (short) (OY.Xd() ^ 5480)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mExecutor = (ExecutorService) declaredMethod.invoke(null, objArr);
            this.mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
            this.mIcons = new SparseArray<>();
            this.mMarkerCache = new MarkerCache<>();
            this.mMinClusterSize = 4;
            this.mClusterMarkerCache = new MarkerCache<>();
            this.mViewModifier = new ViewModifier();
            this.mMap = googleMap;
            this.mAnimate = true;
            this.mAnimationDurationMs = 300L;
            Class<?> cls = Class.forName(Wg.Zd(")%*\u0017#{E.2]k@PH\rUId\"vv\tS", (short) (C1607wl.Xd() ^ 1994), (short) (C1607wl.Xd() ^ 29206)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd2 = (short) (C1499aX.Xd() ^ (-31366));
            int[] iArr2 = new int["98H';JGNL>AP".length()];
            QB qb2 = new QB("98H';JGNL>AP");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                this.mDensity = ((Resources) method.invoke(context, objArr2)).getDisplayMetrics().density;
                IconGenerator iconGenerator = new IconGenerator(context);
                this.mIconGenerator = iconGenerator;
                iconGenerator.setContentView(makeSquareTextView(context));
                iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
                iconGenerator.setBackground(makeClusterBackground());
                this.mClusterManager = clusterManager;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static double distanceSquared(Point point, Point point2) {
        return ((point.f3534x - point2.f3534x) * (point.f3534x - point2.f3534x)) + ((point.f3535y - point2.f3535y) * (point.f3535y - point2.f3535y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Point findClosestCluster(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int maxDistanceBetweenClusteredItems = this.mClusterManager.getAlgorithm().getMaxDistanceBetweenClusteredItems();
            double d2 = maxDistanceBetweenClusteredItems * maxDistanceBetweenClusteredItems;
            for (Point point3 : list) {
                double dDistanceSquared = distanceSquared(point3, point);
                if (dDistanceSquared < d2) {
                    point2 = point3;
                    d2 = dDistanceSquared;
                }
            }
        }
        return point2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> immutableOf(Set<? extends Cluster<T>> set) {
        return set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i2 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    private SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i2 = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i2, i2, i2, i2);
        return squareTextView;
    }

    protected int getBucket(Cluster<T> cluster) {
        int size = cluster.getSize();
        int i2 = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i2 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i3 = i2 + 1;
            if (size < iArr[i3]) {
                return iArr[i2];
            }
            i2 = i3;
        }
    }

    public Cluster<T> getCluster(Marker marker) {
        return this.mClusterMarkerCache.get(marker);
    }

    public T getClusterItem(Marker marker) {
        return this.mMarkerCache.get(marker);
    }

    protected String getClusterText(int i2) {
        return i2 < BUCKETS[0] ? String.valueOf(i2) : i2 + "+";
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getClusterTextAppearance(int i2) {
        return R.style.amu_ClusterIcon_TextAppearance;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getColor(int i2) {
        float fMin = 300.0f - Math.min(i2, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    protected BitmapDescriptor getDescriptorForCluster(Cluster<T> cluster) {
        int bucket = getBucket(cluster);
        BitmapDescriptor bitmapDescriptor = this.mIcons.get(bucket);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
        this.mIconGenerator.setTextAppearance(getClusterTextAppearance(bucket));
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(this.mIconGenerator.makeIcon(getClusterText(bucket)));
        this.mIcons.put(bucket, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.mClusterMarkerCache.get(cluster);
    }

    public Marker getMarker(T t2) {
        return this.mMarkerCache.get(t2);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    /* JADX INFO: renamed from: lambda$onAdd$0$com-google-maps-android-clustering-view-DefaultAdvancedMarkersClusterRenderer, reason: not valid java name */
    /* synthetic */ void m7782xfde6dfc5(Marker marker) {
        ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener = this.mItemInfoWindowLongClickListener;
        if (onClusterItemInfoWindowLongClickListener != null) {
            onClusterItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick(this.mMarkerCache.get(marker));
        }
    }

    /* JADX INFO: renamed from: lambda$onAdd$1$com-google-maps-android-clustering-view-DefaultAdvancedMarkersClusterRenderer, reason: not valid java name */
    /* synthetic */ boolean m7783x50fc206(Marker marker) {
        ClusterManager.OnClusterClickListener<T> onClusterClickListener = this.mClickListener;
        return onClusterClickListener != null && onClusterClickListener.onClusterClick(this.mClusterMarkerCache.get(marker));
    }

    /* JADX INFO: renamed from: lambda$onAdd$2$com-google-maps-android-clustering-view-DefaultAdvancedMarkersClusterRenderer, reason: not valid java name */
    /* synthetic */ void m7784xc38a447(Marker marker) {
        ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener = this.mInfoWindowClickListener;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick(this.mClusterMarkerCache.get(marker));
        }
    }

    /* JADX INFO: renamed from: lambda$onAdd$3$com-google-maps-android-clustering-view-DefaultAdvancedMarkersClusterRenderer, reason: not valid java name */
    /* synthetic */ void m7785x13618688(Marker marker) {
        ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener = this.mInfoWindowLongClickListener;
        if (onClusterInfoWindowLongClickListener != null) {
            onClusterInfoWindowLongClickListener.onClusterInfoWindowLongClick(this.mClusterMarkerCache.get(marker));
        }
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(Marker marker) {
                return DefaultAdvancedMarkersClusterRenderer.this.mItemClickListener != null && DefaultAdvancedMarkersClusterRenderer.this.mItemClickListener.onClusterItemClick((ClusterItem) DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.get(marker));
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public void onInfoWindowClick(Marker marker) {
                if (DefaultAdvancedMarkersClusterRenderer.this.mItemInfoWindowClickListener != null) {
                    DefaultAdvancedMarkersClusterRenderer.this.mItemInfoWindowClickListener.onClusterItemInfoWindowClick((ClusterItem) DefaultAdvancedMarkersClusterRenderer.this.mMarkerCache.get(marker));
                }
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                this.f$0.m7782xfde6dfc5(marker);
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return this.f$0.m7783x50fc206(marker);
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(Marker marker) {
                this.f$0.m7784xc38a447(marker);
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                this.f$0.m7785x13618688(marker);
            }
        });
    }

    protected void onBeforeClusterItemRendered(T t2, AdvancedMarkerOptions advancedMarkerOptions) {
        if (t2.getTitle() != null && t2.getSnippet() != null) {
            advancedMarkerOptions.title(t2.getTitle());
            advancedMarkerOptions.snippet(t2.getSnippet());
        } else if (t2.getTitle() != null) {
            advancedMarkerOptions.title(t2.getTitle());
        } else if (t2.getSnippet() != null) {
            advancedMarkerOptions.title(t2.getSnippet());
        }
    }

    protected void onBeforeClusterRendered(Cluster<T> cluster, AdvancedMarkerOptions advancedMarkerOptions) {
        advancedMarkerOptions.icon(getDescriptorForCluster(cluster));
    }

    protected void onClusterItemRendered(T t2, Marker marker) {
    }

    protected void onClusterItemUpdated(T t2, Marker marker) {
        boolean z2 = true;
        boolean z3 = false;
        if (t2.getTitle() == null || t2.getSnippet() == null) {
            if (t2.getSnippet() != null && !t2.getSnippet().equals(marker.getTitle())) {
                marker.setTitle(t2.getSnippet());
            } else if (t2.getTitle() != null && !t2.getTitle().equals(marker.getTitle())) {
                marker.setTitle(t2.getTitle());
            }
            z3 = true;
        } else {
            if (!t2.getTitle().equals(marker.getTitle())) {
                marker.setTitle(t2.getTitle());
                z3 = true;
            }
            if (!t2.getSnippet().equals(marker.getSnippet())) {
                marker.setSnippet(t2.getSnippet());
                z3 = true;
            }
        }
        if (marker.getPosition().equals(t2.getPosition())) {
            z2 = z3;
        } else {
            marker.setPosition(t2.getPosition());
            if (t2.getZIndex() != null) {
                marker.setZIndex(t2.getZIndex().floatValue());
            }
        }
        if (z2 && marker.isInfoWindowShown()) {
            marker.showInfoWindow();
        }
    }

    protected void onClusterRendered(Cluster<T> cluster, Marker marker) {
    }

    protected void onClusterUpdated(Cluster<T> cluster, AdvancedMarker advancedMarker) {
        advancedMarker.setIcon(getDescriptorForCluster(cluster));
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(null);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z2) {
        this.mAnimate = z2;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimationDuration(long j2) {
        this.mAnimationDurationMs = j2;
    }

    public void setMinClusterSize(int i2) {
        this.mMinClusterSize = i2;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mInfoWindowClickListener = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.mInfoWindowLongClickListener = onClusterInfoWindowLongClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.mItemInfoWindowLongClickListener = onClusterItemInfoWindowLongClickListener;
    }

    protected boolean shouldRender(Set<? extends Cluster<T>> set, Set<? extends Cluster<T>> set2) {
        return !set2.equals(set);
    }

    protected boolean shouldRenderAsCluster(Cluster<T> cluster) {
        return cluster.getSize() >= this.mMinClusterSize;
    }
}
