package com.facebook.react.fabric;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.DevToolsReactPerfLogger;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.internal.interop.InteropUIBlockListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItemFactory;
import com.facebook.react.interfaces.fabric.SurfaceHandler;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactRootViewTagGenerator;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.events.BatchEventDispatchedListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FabricEventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.SynchronousEventReceiver;
import com.facebook.react.views.text.TextLayoutManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import yg.C1561oA;
import yg.C1633zX;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class FabricUIManager implements UIManager, LifecycleEventListener, UIBlockViewResolver, SynchronousEventReceiver {
    private static final DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener FABRIC_PERF_LOGGER = new DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener() { // from class: com.facebook.react.fabric.FabricUIManager$$ExternalSyntheticLambda0
        @Override // com.facebook.react.fabric.DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener
        public final void onFabricCommitEnd(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
            FabricUIManager.lambda$static$0(fabricCommitPoint);
        }
    };
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private final BatchEventDispatchedListener mBatchEventDispatchedListener;
    private Binding mBinding;
    public DevToolsReactPerfLogger mDevToolsReactPerfLogger;
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final EventDispatcher mEventDispatcher;
    private InteropUIBlockListener mInteropUIBlockListener;
    private final MountItemDispatcher mMountItemDispatcher;
    private final MountingManager.MountItemExecutor mMountItemExecutor;
    private final MountingManager mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private final ViewManagerRegistry mViewManagerRegistry;
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private boolean mMountNotificationScheduled = false;
    private List<Integer> mSurfaceIdsWithPendingMountNotification = new ArrayList();
    private final Set<SynchronousEvent> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = 10000;

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$1 */
    class AnonymousClass1 implements MountingManager.MountItemExecutor {
        AnonymousClass1() {
        }

        @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
        public void executeItems(Queue<MountItem> queue) {
            FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$2 */
    class AnonymousClass2 implements MountItem {
        final /* synthetic */ ReadableMap val$props;
        final /* synthetic */ int val$reactTag;

        AnonymousClass2(int i2, ReadableMap readableMap) {
            i = i2;
            readableMap = readableMap;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public void execute(MountingManager mountingManager) {
            try {
                mountingManager.updateProps(i, readableMap);
            } catch (Exception unused) {
            }
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public int getSurfaceId() {
            return -1;
        }

        public String toString() {
            return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(i), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$3 */
    class AnonymousClass3 extends GuardedRunnable {
        AnonymousClass3(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$4 */
    class AnonymousClass4 implements MountItem {
        final /* synthetic */ boolean val$blockNativeResponder;
        final /* synthetic */ int val$initialReactTag;
        final /* synthetic */ int val$reactTag;
        final /* synthetic */ int val$surfaceId;

        AnonymousClass4(int i2, int i3, int i4, boolean z2) {
            i = i2;
            i = i3;
            i = i4;
            z = z2;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public void execute(MountingManager mountingManager) {
            SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i);
            if (surfaceManager != null) {
                surfaceManager.setJSResponder(i, i, z);
            } else {
                FLog.e(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + i + "]");
            }
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public int getSurfaceId() {
            return i;
        }

        public String toString() {
            return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i), Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$5 */
    class AnonymousClass5 implements MountItem {
        AnonymousClass5() {
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public void execute(MountingManager mountingManager) {
            mountingManager.clearJSResponder();
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public int getSurfaceId() {
            return -1;
        }

        public String toString() {
            return "CLEAR_JS_RESPONDER";
        }
    }

    private class DispatchUIFrameCallback extends GuardedFrameCallback {
        private volatile boolean mIsMountingEnabled;
        private boolean mIsScheduled;
        private boolean mShouldSchedule;

        private DispatchUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
            this.mIsMountingEnabled = true;
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }

        /* synthetic */ DispatchUIFrameCallback(FabricUIManager fabricUIManager, ReactContext reactContext, DispatchUIFrameCallbackIA dispatchUIFrameCallbackIA) {
            this(reactContext);
        }

        private void schedule() {
            if (this.mIsScheduled || !this.mShouldSchedule) {
                return;
            }
            this.mIsScheduled = true;
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
        }

        @Override // com.facebook.react.fabric.GuardedFrameCallback
        public void doFrameGuarded(long j2) {
            this.mIsScheduled = false;
            if (!this.mIsMountingEnabled) {
                FLog.w(FabricUIManager.TAG, "Not flushing pending UI operations: exception was previously thrown");
                return;
            }
            if (FabricUIManager.this.mDestroyed) {
                FLog.w(FabricUIManager.TAG, "Not flushing pending UI operations: FabricUIManager is destroyed");
                return;
            }
            if (FabricUIManager.this.mDriveCxxAnimations && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            if (ReactNativeFeatureFlags.useOptimisedViewPreallocationOnAndroid() && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.drainPreallocateViewsQueue();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.dispatchPreMountItems(j2);
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                    schedule();
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e2) {
                    FLog.e(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e2);
                    this.mIsMountingEnabled = false;
                    throw e2;
                }
            } catch (Throwable th) {
                schedule();
                throw th;
            }
        }

        void pause() {
            ReactChoreographer.getInstance().removeFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }

        void resume() {
            this.mShouldSchedule = true;
            schedule();
        }
    }

    private class MountItemDispatchListener implements MountItemDispatcher.ItemDispatchListener {

        /* JADX INFO: renamed from: com.facebook.react.fabric.FabricUIManager$MountItemDispatchListener$1 */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FabricUIManager.this.mMountNotificationScheduled = false;
                List list = FabricUIManager.this.mSurfaceIdsWithPendingMountNotification;
                FabricUIManager.this.mSurfaceIdsWithPendingMountNotification = new ArrayList();
                Binding binding = FabricUIManager.this.mBinding;
                if (binding == null || FabricUIManager.this.mDestroyed) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    binding.reportMount(((Integer) it.next()).intValue());
                }
            }
        }

        private MountItemDispatchListener() {
        }

        /* synthetic */ MountItemDispatchListener(FabricUIManager fabricUIManager, MountItemDispatchListenerIA mountItemDispatchListenerIA) {
            this();
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didDispatchMountItems() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didMountItems(List<MountItem> list) throws Throwable {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didMountItems(FabricUIManager.this);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            for (MountItem mountItem : list) {
                if (mountItem != null && !FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.contains(Integer.valueOf(mountItem.getSurfaceId()))) {
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.add(Integer.valueOf(mountItem.getSurfaceId()));
                }
            }
            if (FabricUIManager.this.mMountNotificationScheduled || FabricUIManager.this.mSurfaceIdsWithPendingMountNotification.isEmpty()) {
                return;
            }
            FabricUIManager.this.mMountNotificationScheduled = true;
            Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.facebook.react.fabric.FabricUIManager.MountItemDispatchListener.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    FabricUIManager.this.mMountNotificationScheduled = false;
                    List list2 = FabricUIManager.this.mSurfaceIdsWithPendingMountNotification;
                    FabricUIManager.this.mSurfaceIdsWithPendingMountNotification = new ArrayList();
                    Binding binding = FabricUIManager.this.mBinding;
                    if (binding == null || FabricUIManager.this.mDestroyed) {
                        return;
                    }
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        binding.reportMount(((Integer) it2.next()).intValue());
                    }
                }
            };
            Class<?> cls = Class.forName(ZO.xd("J{Q:g\u0017\u0002?bn\u001a\fPm\u0006h+\"", (short) (C1633zX.Xd() ^ (-11745)), (short) (C1633zX.Xd() ^ (-25310))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (OY.Xd() ^ 5412);
            short sXd2 = (short) (OY.Xd() ^ 2472);
            int[] iArr = new int["ZV}\u0004\u000b/\u0013\u000f\u0003f`)\u000fQ\u0003! \u0018".length()];
            QB qb = new QB("ZV}\u0004\u000b/\u0013\u000f\u0003f`)\u000fQ\u0003! \u0018");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {anonymousClass1};
            Method method = cls.getMethod(Ig.wd("%ZP*NDBn<\b\u0014L8\u0015-{nh", (short) (OY.Xd() ^ 18776)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(uiThreadHandler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void willMountItems(List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).willMountItems(FabricUIManager.this);
            }
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, BatchEventDispatchedListener batchEventDispatchedListener) {
        AnonymousClass1 anonymousClass1 = new MountingManager.MountItemExecutor() { // from class: com.facebook.react.fabric.FabricUIManager.1
            AnonymousClass1() {
            }

            @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
            public void executeItems(Queue<MountItem> queue) {
                FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
            }
        };
        this.mMountItemExecutor = anonymousClass1;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        MountingManager mountingManager = new MountingManager(viewManagerRegistry, anonymousClass1);
        this.mMountingManager = mountingManager;
        this.mMountItemDispatcher = new MountItemDispatcher(mountingManager, new MountItemDispatchListener());
        this.mEventDispatcher = new FabricEventDispatcher(reactApplicationContext);
        this.mBatchEventDispatchedListener = batchEventDispatchedListener;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = viewManagerRegistry;
        reactApplicationContext.registerComponentCallbacks(viewManagerRegistry);
    }

    private MountItem createIntBufferBatchMountItem(int i2, int[] iArr, Object[] objArr, int i3) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return MountItemFactory.createIntBufferBatchMountItem(i2, iArr, objArr, i3);
    }

    private InteropUIBlockListener getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            InteropUIBlockListener interopUIBlockListener = new InteropUIBlockListener();
            this.mInteropUIBlockListener = interopUIBlockListener;
            addUIManagerEventListener(interopUIBlockListener);
        }
        return this.mInteropUIBlockListener;
    }

    private boolean isOnMainThread() {
        return UiThreadUtil.isOnUiThread();
    }

    static /* synthetic */ void lambda$static$0(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
        long commitDuration = fabricCommitPoint.getCommitDuration();
        long layoutDuration = fabricCommitPoint.getLayoutDuration();
        long diffDuration = fabricCommitPoint.getDiffDuration();
        long transactionEndDuration = fabricCommitPoint.getTransactionEndDuration();
        long batchExecutionDuration = fabricCommitPoint.getBatchExecutionDuration();
        DevToolsReactPerfLogger.mStreamingCommitStats.add(commitDuration);
        DevToolsReactPerfLogger.mStreamingLayoutStats.add(layoutDuration);
        DevToolsReactPerfLogger.mStreamingDiffStats.add(diffDuration);
        DevToolsReactPerfLogger.mStreamingTransactionEndStats.add(transactionEndDuration);
        DevToolsReactPerfLogger.mStreamingBatchExecutionStats.add(batchExecutionDuration);
        FLog.i(TAG, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", Long.valueOf(fabricCommitPoint.getCommitNumber()), Long.valueOf(commitDuration), Double.valueOf(DevToolsReactPerfLogger.mStreamingCommitStats.getAverage()), Double.valueOf(DevToolsReactPerfLogger.mStreamingCommitStats.getMedian()), Long.valueOf(DevToolsReactPerfLogger.mStreamingCommitStats.getMax()), Long.valueOf(layoutDuration), Double.valueOf(DevToolsReactPerfLogger.mStreamingLayoutStats.getAverage()), Double.valueOf(DevToolsReactPerfLogger.mStreamingLayoutStats.getMedian()), Long.valueOf(DevToolsReactPerfLogger.mStreamingLayoutStats.getMax()), Long.valueOf(diffDuration), Double.valueOf(DevToolsReactPerfLogger.mStreamingDiffStats.getAverage()), Double.valueOf(DevToolsReactPerfLogger.mStreamingDiffStats.getMedian()), Long.valueOf(DevToolsReactPerfLogger.mStreamingDiffStats.getMax()), Long.valueOf(transactionEndDuration), Double.valueOf(DevToolsReactPerfLogger.mStreamingTransactionEndStats.getAverage()), Double.valueOf(DevToolsReactPerfLogger.mStreamingTransactionEndStats.getMedian()), Long.valueOf(DevToolsReactPerfLogger.mStreamingTransactionEndStats.getMax()), Long.valueOf(batchExecutionDuration), Double.valueOf(DevToolsReactPerfLogger.mStreamingBatchExecutionStats.getAverage()), Double.valueOf(DevToolsReactPerfLogger.mStreamingBatchExecutionStats.getMedian()), Long.valueOf(DevToolsReactPerfLogger.mStreamingBatchExecutionStats.getMax()));
    }

    private long measure(int i2, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, float f3, float f4, float f5) {
        return measure(i2, str, readableMap, readableMap2, readableMap3, f2, f3, f4, f5, null);
    }

    private long measure(int i2, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, float f3, float f4, float f5, float[] fArr) {
        ReactContext context;
        if (i2 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i2, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measure(context, str, readableMap, readableMap2, readableMap3, LayoutMetricsConversions.getYogaSize(f2, f3), LayoutMetricsConversions.getYogaMeasureMode(f2, f3), LayoutMetricsConversions.getYogaSize(f4, f5), LayoutMetricsConversions.getYogaMeasureMode(f4, f5), fArr);
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f2, float f3) {
        return (NativeArray) TextLayoutManager.measureLines(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, PixelUtil.toPixelFromDIP(f2), PixelUtil.toPixelFromDIP(f3));
    }

    private long measureMapBuffer(int i2, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, ReadableMapBuffer readableMapBuffer3, float f2, float f3, float f4, float f5, float[] fArr) {
        ReactContext context;
        if (i2 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i2, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measureMapBuffer(context, str, readableMapBuffer, readableMapBuffer2, readableMapBuffer3, LayoutMetricsConversions.getYogaSize(f2, f3), LayoutMetricsConversions.getYogaMeasureMode(f2, f3), LayoutMetricsConversions.getYogaSize(f4, f5), LayoutMetricsConversions.getYogaMeasureMode(f4, f5), fArr);
    }

    private void preallocateView(int i2, int i3, String str, Object obj, Object obj2, boolean z2) {
        this.mMountItemDispatcher.addPreAllocateMountItem(MountItemFactory.createPreAllocateViewMountItem(i2, i3, str, (ReadableMap) obj, (StateWrapper) obj2, z2));
    }

    private void scheduleMountItem(MountItem mountItem, int i2, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z2 = mountItem instanceof BatchMountItem;
        boolean z3 = (z2 && !((BatchMountItem) mountItem).isBatchEmpty()) || !(z2 || mountItem == null);
        Iterator<UIManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().didScheduleMountItems(this);
        }
        if (z2) {
            this.mCommitStartTime = j2;
            this.mLayoutTime = j6 - j5;
            this.mFinishTransactionCPPTime = j8 - j7;
            this.mFinishTransactionTime = jUptimeMillis - j7;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z3) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            AnonymousClass3 anonymousClass3 = new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.fabric.FabricUIManager.3
                AnonymousClass3(ReactContext reactContext) {
                    super(reactContext);
                }

                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                }
            };
            if (UiThreadUtil.isOnUiThread()) {
                anonymousClass3.run();
            }
        }
        if (z2) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i2, j2);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i2, j7);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i2, j8);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i2, j3);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i2, j4);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i2, j5);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i2, j6);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i2, j6, i3);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t2, WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        ReactRoot reactRoot = (ReactRoot) t2;
        int rootViewTag = reactRoot.getRootViewTag();
        this.mMountingManager.startSurface(rootViewTag, new ThemedReactContext(this.mReactApplicationContext, t2.getContext(), reactRoot.getSurfaceID(), rootViewTag), t2);
        String jSModuleName = reactRoot.getJSModuleName();
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            FLog.d(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            getInteropUIBlockListener().addUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(SurfaceHandler surfaceHandler, View view) {
        this.mMountingManager.attachRootView(surfaceHandler.getSurfaceId(), view, new ThemedReactContext(this.mReactApplicationContext, view.getContext(), surfaceHandler.getModuleName(), surfaceHandler.getSurfaceId()));
        surfaceHandler.setMountable(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.5
            AnonymousClass5() {
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                mountingManager.clearJSResponder();
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return -1;
            }

            public String toString() {
                return "CLEAR_JS_RESPONDER";
            }
        });
    }

    DispatchCommandMountItem createDispatchCommandMountItemForInterop(int i2, int i3, String str, ReadableArray readableArray) {
        try {
            return MountItemFactory.createDispatchCommandMountItem(i2, i3, Integer.parseInt(str), readableArray);
        } catch (NumberFormatException unused) {
            return MountItemFactory.createDispatchCommandMountItem(i2, i3, str, readableArray);
        }
    }

    @Deprecated
    public void dispatchCommand(int i2, int i3, int i4, ReadableArray readableArray) {
        this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i2, i3, i4, readableArray));
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i2, int i3, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public void dispatchCommand(int i2, int i3, String str, ReadableArray readableArray) {
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            this.mMountItemDispatcher.addViewCommandMountItem(createDispatchCommandMountItemForInterop(i2, i3, str, readableArray));
        } else {
            this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i2, i3, str, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i2, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public int getColor(int i2, String[] strArr) {
        ThemedReactContext context = this.mMountingManager.getSurfaceManagerEnforced(i2, "getColor").getContext();
        if (context == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer numResolveResourcePath = ColorPropConverter.resolveResourcePath(context, str);
            if (numResolveResourcePath != null) {
                return numResolveResourcePath.intValue();
            }
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public ReadableMap getInspectorDataForInstance(int i2, View view) {
        UiThreadUtil.assertOnUiThread();
        return this.mBinding.getInspectorDataForInstance(this.mMountingManager.getEventEmitter(i2, view.getId()));
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        map.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.getRunStartTime()));
        map.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.getBatchedExecutionTime()));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return map;
    }

    public boolean getThemeData(int i2, float[] fArr) {
        ThemedReactContext context = this.mMountingManager.getSurfaceManagerEnforced(i2, "getThemeData").getContext();
        if (context == null) {
            FLog.w(TAG, "\"themedReactContext\" is null when call \"getThemeData\"");
            return false;
        }
        float[] defaultTextInputPadding = UIManagerHelper.getDefaultTextInputPadding(context);
        fArr[0] = defaultTextInputPadding[0];
        fArr[1] = defaultTextInputPadding[1];
        fArr[2] = defaultTextInputPadding[2];
        fArr[3] = defaultTextInputPadding[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        this.mEventDispatcher.registerEventEmitter(2, (RCTModernEventEmitter) new FabricEventEmitter(this));
        this.mEventDispatcher.addBatchEventDispatchedListener(this.mBatchEventDispatchedListener);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            DevToolsReactPerfLogger devToolsReactPerfLogger = new DevToolsReactPerfLogger();
            this.mDevToolsReactPerfLogger = devToolsReactPerfLogger;
            devToolsReactPerfLogger.addDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void invalidate() {
        String str = TAG;
        FLog.i(str, "FabricUIManager.invalidate");
        DevToolsReactPerfLogger devToolsReactPerfLogger = this.mDevToolsReactPerfLogger;
        if (devToolsReactPerfLogger != null) {
            devToolsReactPerfLogger.removeDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mEventDispatcher.removeBatchEventDispatchedListener(this.mBatchEventDispatchedListener);
        this.mEventDispatcher.unregisterEventEmitter(2);
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.invalidate();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        this.mBinding.unregister();
        this.mBinding = null;
        ViewManagerPropertyUpdater.clear();
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            return;
        }
        this.mEventDispatcher.onCatalystInstanceDestroyed();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i2, int i3) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i2);
        if (surfaceManager != null) {
            surfaceManager.markActiveTouchForTag(i3);
        }
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mDispatchUIFrameCallback.pause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mDispatchUIFrameCallback.resume();
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.dispatchAllEvents();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            getInteropUIBlockListener().prependUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i2, int i3, String str, WritableMap writableMap) {
        receiveEvent(i2, i3, str, false, writableMap, 2);
    }

    public void receiveEvent(int i2, int i3, String str, boolean z2, WritableMap writableMap, int i4) {
        receiveEvent(i2, i3, str, z2, writableMap, i4, false);
    }

    @Override // com.facebook.react.uimanager.events.SynchronousEventReceiver
    public void receiveEvent(int i2, int i3, String str, boolean z2, WritableMap writableMap, int i4, boolean z3) {
        if (ReactBuildConfig.DEBUG && i2 == -1) {
            FLog.d(TAG, "Emitted event without surfaceId: [%d] %s", Integer.valueOf(i3), str);
        }
        if (this.mDestroyed) {
            FLog.e(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper eventEmitter = this.mMountingManager.getEventEmitter(i2, i3);
        if (eventEmitter == null) {
            if (this.mMountingManager.getViewExists(i3)) {
                this.mMountingManager.enqueuePendingEvent(i2, i3, str, z2, writableMap, i4);
                return;
            } else {
                FLog.d(TAG, "Unable to invoke event: " + str + " for reactTag: " + i3);
                return;
            }
        }
        if (z3) {
            if (this.mSynchronousEvents.add(new SynchronousEvent(i2, i3, str))) {
                eventEmitter.dispatchEventSynchronously(str, writableMap);
            }
        } else if (z2) {
            eventEmitter.dispatchUnique(str, writableMap);
        } else {
            eventEmitter.dispatch(str, writableMap, i4);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i2, String str, WritableMap writableMap) {
        receiveEvent(-1, i2, str, false, writableMap, 2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("top") ? "on" + str.substring(3) : str;
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i2) {
        UiThreadUtil.assertOnUiThread();
        SurfaceMountingManager surfaceManagerForView = this.mMountingManager.getSurfaceManagerForView(i2);
        if (surfaceManagerForView == null) {
            return null;
        }
        return surfaceManagerForView.getView(i2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i2, int i3) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(-1, i2, i3));
    }

    public void sendAccessibilityEventFromJS(int i2, int i3, String str) {
        int i4;
        if ("focus".equals(str)) {
            i4 = 8;
        } else if ("windowStateChange".equals(str)) {
            i4 = 32;
        } else if ("click".equals(str)) {
            i4 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                throw new IllegalArgumentException("sendAccessibilityEventFromJS: invalid eventType " + str);
            }
            i4 = 128;
        }
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(i2, i3, i4));
    }

    public void setBinding(Binding binding) {
        this.mBinding = binding;
    }

    public void setJSResponder(int i2, int i3, int i4, boolean z2) {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.4
            final /* synthetic */ boolean val$blockNativeResponder;
            final /* synthetic */ int val$initialReactTag;
            final /* synthetic */ int val$reactTag;
            final /* synthetic */ int val$surfaceId;

            AnonymousClass4(int i22, int i32, int i42, boolean z22) {
                i = i22;
                i = i32;
                i = i42;
                z = z22;
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i);
                if (surfaceManager != null) {
                    surfaceManager.setJSResponder(i, i, z);
                } else {
                    FLog.e(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + i + "]");
                }
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return i;
            }

            public String toString() {
                return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i), Integer.valueOf(i));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t2, String str, WritableMap writableMap, int i2, int i3) {
        int rootViewTag = ((ReactRoot) t2).getRootViewTag();
        Context context = t2.getContext();
        ThemedReactContext themedReactContext = new ThemedReactContext(this.mReactApplicationContext, context, str, rootViewTag);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            FLog.d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.startSurface(rootViewTag, themedReactContext, t2);
        Point viewportOffset = UiThreadUtil.isOnUiThread() ? RootViewUtil.getViewportOffset(t2) : new Point(0, 0);
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, LayoutMetricsConversions.getMinSize(i2), LayoutMetricsConversions.getMaxSize(i2), LayoutMetricsConversions.getMinSize(i3), LayoutMetricsConversions.getMaxSize(i3), viewportOffset.x, viewportOffset.y, I18nUtil.getInstance().isRTL(context), I18nUtil.getInstance().doLeftAndRightSwapInRTL(context));
        return rootViewTag;
    }

    public void startSurface(SurfaceHandler surfaceHandler, Context context, View view) {
        int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        this.mMountingManager.startSurface(nextRootViewTag, new ThemedReactContext(this.mReactApplicationContext, context, surfaceHandler.getModuleName(), nextRootViewTag), view);
        surfaceHandler.setSurfaceId(nextRootViewTag);
        if (surfaceHandler instanceof SurfaceHandlerBinding) {
            this.mBinding.registerSurface((SurfaceHandlerBinding) surfaceHandler);
        }
        surfaceHandler.setMountable(view != null);
        surfaceHandler.start();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i2) {
        this.mMountingManager.stopSurface(i2);
        this.mBinding.stopSurface(i2);
    }

    public void stopSurface(SurfaceHandler surfaceHandler) {
        if (!surfaceHandler.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.stopSurface(surfaceHandler.getSurfaceId());
        surfaceHandler.stop();
        if (surfaceHandler instanceof SurfaceHandlerBinding) {
            this.mBinding.unregisterSurface((SurfaceHandlerBinding) surfaceHandler);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i2, int i3) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i2);
        if (surfaceManager != null) {
            surfaceManager.sweepActiveTouchForTag(i3);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i2, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i3 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i3 + 1;
        AnonymousClass2 anonymousClass2 = new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.2
            final /* synthetic */ ReadableMap val$props;
            final /* synthetic */ int val$reactTag;

            AnonymousClass2(int i22, ReadableMap readableMap2) {
                i = i22;
                readableMap = readableMap2;
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                try {
                    mountingManager.updateProps(i, readableMap);
                } catch (Exception unused) {
                }
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return -1;
            }

            public String toString() {
                return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(i), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
            }
        };
        if (!this.mMountingManager.getViewExists(i22)) {
            this.mMountItemDispatcher.addMountItem(anonymousClass2);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i3);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            FLog.d(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i22), IS_DEVELOPMENT_ENVIRONMENT ? readableMap2.toHashMap().toString() : "<hidden>");
        }
        anonymousClass2.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i2, int i3, int i4, int i5, int i6) {
        boolean zIsRTL;
        boolean zDoLeftAndRightSwapInRTL;
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            FLog.d(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i2));
        }
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i2);
        if (surfaceManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Cannot updateRootLayoutSpecs on surfaceId that does not exist: " + i2));
            return;
        }
        ThemedReactContext context = surfaceManager.getContext();
        if (context != null) {
            zIsRTL = I18nUtil.getInstance().isRTL(context);
            zDoLeftAndRightSwapInRTL = I18nUtil.getInstance().doLeftAndRightSwapInRTL(context);
        } else {
            zIsRTL = false;
            zDoLeftAndRightSwapInRTL = false;
        }
        this.mBinding.setConstraints(i2, LayoutMetricsConversions.getMinSize(i3), LayoutMetricsConversions.getMaxSize(i3), LayoutMetricsConversions.getMinSize(i4), LayoutMetricsConversions.getMaxSize(i4), i5, i6, zIsRTL, zDoLeftAndRightSwapInRTL);
    }
}
