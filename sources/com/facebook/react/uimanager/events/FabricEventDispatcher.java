package com.facebook.react.uimanager.events;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.systrace.Systrace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class FabricEventDispatcher implements EventDispatcher, LifecycleEventListener {
    private static final Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
    private final ReactApplicationContext mReactContext;
    private final ReactEventEmitter mReactEventEmitter;
    private final CopyOnWriteArrayList<EventDispatcherListener> mListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<BatchEventDispatchedListener> mPostEventDispatchListeners = new CopyOnWriteArrayList<>();
    private final ScheduleDispatchFrameCallback mCurrentFrameCallback = new ScheduleDispatchFrameCallback();
    private boolean mIsDispatchScheduled = false;
    private final Runnable mDispatchEventsRunnable = new Runnable() { // from class: com.facebook.react.uimanager.events.FabricEventDispatcher.1
        @Override // java.lang.Runnable
        public void run() {
            FabricEventDispatcher.this.mIsDispatchScheduled = false;
            Systrace.beginSection(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = FabricEventDispatcher.this.mPostEventDispatchListeners.iterator();
                while (it.hasNext()) {
                    ((BatchEventDispatchedListener) it.next()).onBatchEventDispatched();
                }
            } finally {
                Systrace.endSection(0L);
            }
        }
    };

    private class ScheduleDispatchFrameCallback implements Choreographer.FrameCallback {
        private volatile boolean mIsDispatchScheduled;
        private boolean mShouldStop;

        private ScheduleDispatchFrameCallback() {
            this.mIsDispatchScheduled = false;
            this.mShouldStop = false;
        }

        private void dispatchBatchedEvents() {
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, FabricEventDispatcher.this.mCurrentFrameCallback);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            UiThreadUtil.assertOnUiThread();
            if (this.mShouldStop) {
                this.mIsDispatchScheduled = false;
            } else {
                dispatchBatchedEvents();
            }
            Systrace.beginSection(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = FabricEventDispatcher.this.mPostEventDispatchListeners.iterator();
                while (it.hasNext()) {
                    ((BatchEventDispatchedListener) it.next()).onBatchEventDispatched();
                }
            } finally {
                Systrace.endSection(0L);
            }
        }

        public void maybeDispatchBatchedEvents() {
            if (this.mIsDispatchScheduled) {
                return;
            }
            this.mIsDispatchScheduled = true;
            dispatchBatchedEvents();
        }

        public void maybeScheduleDispatchOfBatchedEvents() {
            if (this.mIsDispatchScheduled) {
                return;
            }
            if (FabricEventDispatcher.this.mReactContext.isOnUiQueueThread()) {
                maybeDispatchBatchedEvents();
            } else {
                FabricEventDispatcher.this.mReactContext.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.FabricEventDispatcher.ScheduleDispatchFrameCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ScheduleDispatchFrameCallback.this.maybeDispatchBatchedEvents();
                    }
                });
            }
        }

        public void stop() {
            this.mShouldStop = true;
        }
    }

    public FabricEventDispatcher(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mReactEventEmitter = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelDispatchOfBatchedEvents() {
        UiThreadUtil.assertOnUiThread();
        if (!ReactNativeFeatureFlags.useOptimizedEventBatchingOnAndroid()) {
            this.mCurrentFrameCallback.stop();
        } else {
            this.mIsDispatchScheduled = false;
            uiThreadHandler.removeCallbacks(this.mDispatchEventsRunnable);
        }
    }

    private void dispatchSynchronous(Event event) {
        Systrace.beginSection(0L, "FabricEventDispatcher.dispatchSynchronous('" + event.getEventName() + "')");
        try {
            UIManager uIManager = UIManagerHelper.getUIManager(this.mReactContext, 2);
            if (uIManager instanceof SynchronousEventReceiver) {
                ((SynchronousEventReceiver) uIManager).receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), event.getEventData(), event.getEventCategory(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new ReactNoCrashSoftException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
        } finally {
            Systrace.endSection(0L);
        }
    }

    private void scheduleDispatchOfBatchedEvents() throws Throwable {
        if (!ReactNativeFeatureFlags.useOptimizedEventBatchingOnAndroid()) {
            this.mCurrentFrameCallback.maybeScheduleDispatchOfBatchedEvents();
            return;
        }
        if (this.mIsDispatchScheduled) {
            return;
        }
        this.mIsDispatchScheduled = true;
        Handler handler = uiThreadHandler;
        Runnable runnable = this.mDispatchEventsRunnable;
        short sXd = (short) (C1580rY.Xd() ^ (-7977));
        short sXd2 = (short) (C1580rY.Xd() ^ (-30222));
        int[] iArr = new int["myn{wpj3sv0Iambiam".length()];
        QB qb = new QB("myn{wpj3sv0Iambiam");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (OY.Xd() ^ 3406);
        short sXd4 = (short) (OY.Xd() ^ 3659);
        int[] iArr2 = new int["\t~\u0013|H\u0006y\u0006}Cf\t\u0001\u007fqqzr".length()];
        QB qb2 = new QB("\t~\u0013|H\u0006y\u0006}Cf\t\u0001\u007fqqzr");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(C1561oA.ud("%#&&q$t \u001c\u001a\u001fx\u000fx\u001c\u000b\u001a\t", (short) (Od.Xd() ^ (-11415))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addBatchEventDispatchedListener(BatchEventDispatchedListener batchEventDispatchedListener) {
        this.mPostEventDispatchListeners.add(batchEventDispatchedListener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.add(eventDispatcherListener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchAllEvents() throws Throwable {
        scheduleDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(Event event) throws Throwable {
        Iterator<EventDispatcherListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onEventDispatch(event);
        }
        if (event.experimental_isSynchronous()) {
            dispatchSynchronous(event);
        } else {
            event.dispatchModern(this.mReactEventEmitter);
        }
        event.dispose();
        scheduleDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void onCatalystInstanceDestroyed() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.FabricEventDispatcher.2
            @Override // java.lang.Runnable
            public void run() {
                FabricEventDispatcher.this.cancelDispatchOfBatchedEvents();
            }
        });
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        cancelDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        cancelDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() throws Throwable {
        scheduleDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i2, RCTEventEmitter rCTEventEmitter) {
        this.mReactEventEmitter.register(i2, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i2, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mReactEventEmitter.register(i2, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeBatchEventDispatchedListener(BatchEventDispatchedListener batchEventDispatchedListener) {
        this.mPostEventDispatchListeners.remove(batchEventDispatchedListener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.remove(eventDispatcherListener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void unregisterEventEmitter(int i2) {
        this.mReactEventEmitter.unregister(i2);
    }
}
