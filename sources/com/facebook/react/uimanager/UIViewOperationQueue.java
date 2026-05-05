package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.animation.core.AnimationKt;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import com.facebook.yoga.YogaDirection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class UIViewOperationQueue {
    public static final int DEFAULT_MIN_TIME_LEFT_IN_FRAME_FOR_NONBATCHED_OPERATION_MS = 8;
    private static final String TAG = "UIViewOperationQueue";
    private long mCreateViewCount;
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final NativeViewHierarchyManager mNativeViewHierarchyManager;
    private long mNonBatchedExecutionTotalTime;
    private long mProfiledBatchBatchedExecutionTime;
    private long mProfiledBatchCommitEndTime;
    private long mProfiledBatchCommitStartTime;
    private long mProfiledBatchDispatchViewUpdatesTime;
    private long mProfiledBatchLayoutTime;
    private long mProfiledBatchNonBatchedExecutionTime;
    private long mProfiledBatchRunEndTime;
    private long mProfiledBatchRunStartTime;
    private final ReactApplicationContext mReactApplicationContext;
    private long mThreadCpuTime;
    private long mUpdatePropertiesOperationCount;
    private NotThreadSafeViewHierarchyUpdateDebugListener mViewHierarchyUpdateDebugListener;
    private final int[] mMeasureBuffer = new int[4];
    private final Object mDispatchRunnablesLock = new Object();
    private final Object mNonBatchedOperationsLock = new Object();
    private ArrayList<DispatchCommandViewOperation> mViewCommandOperations = new ArrayList<>();
    private ArrayList<UIOperation> mOperations = new ArrayList<>();
    private ArrayList<Runnable> mDispatchUIRunnables = new ArrayList<>();
    private ArrayDeque<UIOperation> mNonBatchedOperations = new ArrayDeque<>();
    private boolean mIsDispatchUIFrameCallbackEnqueued = false;
    private boolean mIsInIllegalUIState = false;
    private boolean mIsProfilingNextBatch = false;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.UIViewOperationQueue$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ int val$batchId;
        final /* synthetic */ ArrayList val$batchedOperations;
        final /* synthetic */ long val$commitStartTime;
        final /* synthetic */ long val$dispatchViewUpdatesTime;
        final /* synthetic */ long val$layoutTime;
        final /* synthetic */ long val$nativeModulesThreadCpuTime;
        final /* synthetic */ ArrayDeque val$nonBatchedOperations;
        final /* synthetic */ ArrayList val$viewCommandOperations;

        AnonymousClass1(int i2, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j2, long j3, long j4, long j5) {
            i = i2;
            arrayList = arrayList;
            arrayDeque = arrayDeque;
            arrayList = arrayList2;
            j = j2;
            j = j3;
            j = j4;
            j = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystraceMessage.beginSection(0L, "DispatchUI").arg("BatchId", i).flush();
            try {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList<DispatchCommandViewOperation> arrayList = arrayList;
                    if (arrayList != null) {
                        for (DispatchCommandViewOperation dispatchCommandViewOperation : arrayList) {
                            try {
                                dispatchCommandViewOperation.executeWithExceptions();
                            } catch (RetryableMountingLayerException e2) {
                                if (dispatchCommandViewOperation.getRetries() == 0) {
                                    dispatchCommandViewOperation.incrementRetries();
                                    UIViewOperationQueue.this.mViewCommandOperations.add(dispatchCommandViewOperation);
                                } else {
                                    ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new ReactNoCrashSoftException(e2));
                                }
                            } catch (Throwable th) {
                                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, th);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = arrayDeque;
                    if (arrayDeque != null) {
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            ((UIOperation) it.next()).execute();
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((UIOperation) it2.next()).execute();
                        }
                    }
                    if (UIViewOperationQueue.this.mIsProfilingNextBatch && UIViewOperationQueue.this.mProfiledBatchCommitStartTime == 0) {
                        UIViewOperationQueue.this.mProfiledBatchCommitStartTime = j;
                        UIViewOperationQueue.this.mProfiledBatchCommitEndTime = SystemClock.uptimeMillis();
                        UIViewOperationQueue.this.mProfiledBatchLayoutTime = j;
                        UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime = j;
                        UIViewOperationQueue.this.mProfiledBatchRunStartTime = jUptimeMillis;
                        UIViewOperationQueue uIViewOperationQueue = UIViewOperationQueue.this;
                        uIViewOperationQueue.mProfiledBatchRunEndTime = uIViewOperationQueue.mProfiledBatchCommitEndTime;
                        UIViewOperationQueue.this.mThreadCpuTime = j;
                        Systrace.beginAsyncSection(0L, "delayBeforeDispatchViewUpdates", 0, UIViewOperationQueue.this.mProfiledBatchCommitStartTime * AnimationKt.MillisToNanos);
                        Systrace.endAsyncSection(0L, "delayBeforeDispatchViewUpdates", 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * AnimationKt.MillisToNanos);
                        Systrace.beginAsyncSection(0L, "delayBeforeBatchRunStart", 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * AnimationKt.MillisToNanos);
                        Systrace.endAsyncSection(0L, "delayBeforeBatchRunStart", 0, UIViewOperationQueue.this.mProfiledBatchRunStartTime * AnimationKt.MillisToNanos);
                    }
                    UIViewOperationQueue.this.mNativeViewHierarchyManager.clearLayoutAnimation();
                    if (UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener != null) {
                        UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateFinished();
                    }
                } catch (Exception e3) {
                    UIViewOperationQueue.this.mIsInIllegalUIState = true;
                    throw e3;
                }
            } finally {
                Systrace.endSection(0L);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.UIViewOperationQueue$2 */
    class AnonymousClass2 extends GuardedRunnable {
        AnonymousClass2(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIViewOperationQueue.this.flushPendingBatches();
        }
    }

    private static abstract class AnimationOperation implements UIOperation {
        protected final int mAnimationID;

        public AnimationOperation(int i2) {
            this.mAnimationID = i2;
        }
    }

    private final class ChangeJSResponderOperation extends ViewOperation {
        private final boolean mBlockNativeResponder;
        private final boolean mClearResponder;
        private final int mInitialTag;

        public ChangeJSResponderOperation(int i2, int i3, boolean z2, boolean z3) {
            super(i2);
            this.mInitialTag = i3;
            this.mClearResponder = z2;
            this.mBlockNativeResponder = z3;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            if (this.mClearResponder) {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.clearJSResponder();
            } else {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.setJSResponder(this.mTag, this.mInitialTag, this.mBlockNativeResponder);
            }
        }
    }

    private class ConfigureLayoutAnimationOperation implements UIOperation {
        private final Callback mAnimationComplete;
        private final ReadableMap mConfig;

        private ConfigureLayoutAnimationOperation(ReadableMap readableMap, Callback callback) {
            this.mConfig = readableMap;
            this.mAnimationComplete = callback;
        }

        /* synthetic */ ConfigureLayoutAnimationOperation(UIViewOperationQueue uIViewOperationQueue, ReadableMap readableMap, Callback callback, ConfigureLayoutAnimationOperationIA configureLayoutAnimationOperationIA) {
            this(readableMap, callback);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.configureLayoutAnimation(this.mConfig, this.mAnimationComplete);
        }
    }

    private final class CreateViewOperation extends ViewOperation {
        private final String mClassName;
        private final ReactStylesDiffMap mInitialProps;
        private final ThemedReactContext mThemedContext;

        public CreateViewOperation(ThemedReactContext themedReactContext, int i2, String str, ReactStylesDiffMap reactStylesDiffMap) {
            super(i2);
            this.mThemedContext = themedReactContext;
            this.mClassName = str;
            this.mInitialProps = reactStylesDiffMap;
            Systrace.startAsyncFlow(0L, "createView", this.mTag);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            Systrace.endAsyncFlow(0L, "createView", this.mTag);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.createView(this.mThemedContext, this.mTag, this.mClassName, this.mInitialProps);
        }
    }

    @Deprecated
    private final class DispatchCommandOperation extends ViewOperation implements DispatchCommandViewOperation {
        private final ReadableArray mArgs;
        private final int mCommand;
        private int numRetries;

        public DispatchCommandOperation(int i2, int i3, ReadableArray readableArray) {
            super(i2);
            this.numRetries = 0;
            this.mCommand = i3;
            this.mArgs = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void executeWithExceptions() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public int getRetries() {
            return this.numRetries;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void incrementRetries() {
            this.numRetries++;
        }
    }

    private interface DispatchCommandViewOperation {
        void executeWithExceptions();

        int getRetries();

        void incrementRetries();
    }

    private final class DispatchStringCommandOperation extends ViewOperation implements DispatchCommandViewOperation {
        private final ReadableArray mArgs;
        private final String mCommand;
        private int numRetries;

        public DispatchStringCommandOperation(int i2, String str, ReadableArray readableArray) {
            super(i2);
            this.numRetries = 0;
            this.mCommand = str;
            this.mArgs = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void executeWithExceptions() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public int getRetries() {
            return this.numRetries;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void incrementRetries() {
            this.numRetries++;
        }
    }

    private class DispatchUIFrameCallback extends GuardedFrameCallback {
        private static final int FRAME_TIME_MS = 16;
        private final int mMinTimeLeftInFrameForNonBatchedOperationMs;

        private DispatchUIFrameCallback(ReactContext reactContext, int i2) {
            super(reactContext);
            this.mMinTimeLeftInFrameForNonBatchedOperationMs = i2;
        }

        /* synthetic */ DispatchUIFrameCallback(UIViewOperationQueue uIViewOperationQueue, ReactContext reactContext, int i2, DispatchUIFrameCallbackIA dispatchUIFrameCallbackIA) {
            this(reactContext, i2);
        }

        private void dispatchPendingNonBatchedOperations(long j2) throws Exception {
            UIOperation uIOperation;
            while (16 - ((System.nanoTime() - j2) / AnimationKt.MillisToNanos) >= this.mMinTimeLeftInFrameForNonBatchedOperationMs) {
                synchronized (UIViewOperationQueue.this.mNonBatchedOperationsLock) {
                    if (UIViewOperationQueue.this.mNonBatchedOperations.isEmpty()) {
                        return;
                    } else {
                        uIOperation = (UIOperation) UIViewOperationQueue.this.mNonBatchedOperations.pollFirst();
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    uIOperation.execute();
                    UIViewOperationQueue.this.mNonBatchedExecutionTotalTime += SystemClock.uptimeMillis() - jUptimeMillis;
                } catch (Exception e2) {
                    UIViewOperationQueue.this.mIsInIllegalUIState = true;
                    throw e2;
                }
            }
        }

        @Override // com.facebook.react.uimanager.GuardedFrameCallback
        public void doFrameGuarded(long j2) {
            if (UIViewOperationQueue.this.mIsInIllegalUIState) {
                FLog.w(ReactConstants.TAG, "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            Systrace.beginSection(0L, "dispatchNonBatchedUIOperations");
            try {
                dispatchPendingNonBatchedOperations(j2);
                Systrace.endSection(0L);
                UIViewOperationQueue.this.flushPendingBatches();
                ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
            } catch (Throwable th) {
                Systrace.endSection(0L);
                throw th;
            }
        }
    }

    private final class FindTargetForTouchOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;
        private final float mTargetX;
        private final float mTargetY;

        private FindTargetForTouchOperation(int i2, float f2, float f3, Callback callback) {
            this.mReactTag = i2;
            this.mTargetX = f2;
            this.mTargetY = f3;
            this.mCallback = callback;
        }

        /* synthetic */ FindTargetForTouchOperation(UIViewOperationQueue uIViewOperationQueue, int i2, float f2, float f3, Callback callback, FindTargetForTouchOperationIA findTargetForTouchOperationIA) {
            this(i2, f2, f3, callback);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                float f2 = UIViewOperationQueue.this.mMeasureBuffer[0];
                float f3 = UIViewOperationQueue.this.mMeasureBuffer[1];
                int iFindTargetTagForTouch = UIViewOperationQueue.this.mNativeViewHierarchyManager.findTargetTagForTouch(this.mReactTag, this.mTargetX, this.mTargetY);
                try {
                    UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(iFindTargetTagForTouch, UIViewOperationQueue.this.mMeasureBuffer);
                    this.mCallback.invoke(Integer.valueOf(iFindTargetTagForTouch), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0] - f2)), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1] - f3)), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])));
                } catch (IllegalViewOperationException unused) {
                    this.mCallback.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.mCallback.invoke(new Object[0]);
            }
        }
    }

    private final class LayoutUpdateFinishedOperation implements UIOperation {
        private final UIImplementation.LayoutUpdateListener mListener;
        private final ReactShadowNode mNode;

        private LayoutUpdateFinishedOperation(ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener) {
            this.mNode = reactShadowNode;
            this.mListener = layoutUpdateListener;
        }

        /* synthetic */ LayoutUpdateFinishedOperation(UIViewOperationQueue uIViewOperationQueue, ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener, LayoutUpdateFinishedOperationIA layoutUpdateFinishedOperationIA) {
            this(reactShadowNode, layoutUpdateListener);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            this.mListener.onLayoutUpdated(this.mNode);
        }
    }

    private final class ManageChildrenOperation extends ViewOperation {
        private final int[] mIndicesToRemove;
        private final int[] mTagsToDelete;
        private final ViewAtIndex[] mViewsToAdd;

        public ManageChildrenOperation(int i2, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
            super(i2);
            this.mIndicesToRemove = iArr;
            this.mViewsToAdd = viewAtIndexArr;
            this.mTagsToDelete = iArr2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.manageChildren(this.mTag, this.mIndicesToRemove, this.mViewsToAdd, this.mTagsToDelete);
        }
    }

    private final class MeasureInWindowOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        private MeasureInWindowOperation(int i2, Callback callback) {
            this.mReactTag = i2;
            this.mCallback = callback;
        }

        /* synthetic */ MeasureInWindowOperation(UIViewOperationQueue uIViewOperationQueue, int i2, Callback callback, MeasureInWindowOperationIA measureInWindowOperationIA) {
            this(i2, callback);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measureInWindow(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                this.mCallback.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }
    }

    private final class MeasureOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        private MeasureOperation(int i2, Callback callback) {
            this.mReactTag = i2;
            this.mCallback = callback;
        }

        /* synthetic */ MeasureOperation(UIViewOperationQueue uIViewOperationQueue, int i2, Callback callback, MeasureOperationIA measureOperationIA) {
            this(i2, callback);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                this.mCallback.invoke(0, 0, Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1])));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }
    }

    private final class RemoveRootViewOperation extends ViewOperation {
        public RemoveRootViewOperation(int i2) {
            super(i2);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.removeRootView(this.mTag);
        }
    }

    private final class SendAccessibilityEvent extends ViewOperation {
        private final int mEventType;

        private SendAccessibilityEvent(int i2, int i3) {
            super(i2);
            this.mEventType = i3;
        }

        /* synthetic */ SendAccessibilityEvent(UIViewOperationQueue uIViewOperationQueue, int i2, int i3, SendAccessibilityEventIA sendAccessibilityEventIA) {
            this(i2, i3);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.sendAccessibilityEvent(this.mTag, this.mEventType);
            } catch (RetryableMountingLayerException e2) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, e2);
            }
        }
    }

    private final class SetChildrenOperation extends ViewOperation {
        private final ReadableArray mChildrenTags;

        public SetChildrenOperation(int i2, ReadableArray readableArray) {
            super(i2);
            this.mChildrenTags = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setChildren(this.mTag, this.mChildrenTags);
        }
    }

    private class SetLayoutAnimationEnabledOperation implements UIOperation {
        private final boolean mEnabled;

        private SetLayoutAnimationEnabledOperation(boolean z2) {
            this.mEnabled = z2;
        }

        /* synthetic */ SetLayoutAnimationEnabledOperation(UIViewOperationQueue uIViewOperationQueue, boolean z2, SetLayoutAnimationEnabledOperationIA setLayoutAnimationEnabledOperationIA) {
            this(z2);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setLayoutAnimationEnabled(this.mEnabled);
        }
    }

    private class UIBlockOperation implements UIOperation {
        private final UIBlock mBlock;

        public UIBlockOperation(UIBlock uIBlock) {
            this.mBlock = uIBlock;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            this.mBlock.execute(UIViewOperationQueue.this.mNativeViewHierarchyManager);
        }
    }

    public interface UIOperation {
        void execute();
    }

    private final class UpdateInstanceHandleOperation extends ViewOperation {
        private final long mInstanceHandle;

        private UpdateInstanceHandleOperation(int i2, long j2) {
            super(i2);
            this.mInstanceHandle = j2;
        }

        /* synthetic */ UpdateInstanceHandleOperation(UIViewOperationQueue uIViewOperationQueue, int i2, long j2, UpdateInstanceHandleOperationIA updateInstanceHandleOperationIA) {
            this(i2, j2);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateInstanceHandle(this.mTag, this.mInstanceHandle);
        }
    }

    private final class UpdateLayoutOperation extends ViewOperation {
        private final int mHeight;
        private final YogaDirection mLayoutDirection;
        private final int mParentTag;
        private final int mWidth;
        private final int mX;
        private final int mY;

        public UpdateLayoutOperation(int i2, int i3, int i4, int i5, int i6, int i7, YogaDirection yogaDirection) {
            super(i3);
            this.mParentTag = i2;
            this.mX = i4;
            this.mY = i5;
            this.mWidth = i6;
            this.mHeight = i7;
            this.mLayoutDirection = yogaDirection;
            Systrace.startAsyncFlow(0L, "updateLayout", this.mTag);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            Systrace.endAsyncFlow(0L, "updateLayout", this.mTag);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateLayout(this.mParentTag, this.mTag, this.mX, this.mY, this.mWidth, this.mHeight, this.mLayoutDirection);
        }
    }

    private final class UpdatePropertiesOperation extends ViewOperation {
        private final ReactStylesDiffMap mProps;

        private UpdatePropertiesOperation(int i2, ReactStylesDiffMap reactStylesDiffMap) {
            super(i2);
            this.mProps = reactStylesDiffMap;
        }

        /* synthetic */ UpdatePropertiesOperation(UIViewOperationQueue uIViewOperationQueue, int i2, ReactStylesDiffMap reactStylesDiffMap, UpdatePropertiesOperationIA updatePropertiesOperationIA) {
            this(i2, reactStylesDiffMap);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateProperties(this.mTag, this.mProps);
        }
    }

    private final class UpdateViewExtraData extends ViewOperation {
        private final Object mExtraData;

        public UpdateViewExtraData(int i2, Object obj) {
            super(i2);
            this.mExtraData = obj;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateViewExtraData(this.mTag, this.mExtraData);
        }
    }

    private abstract class ViewOperation implements UIOperation {
        public int mTag;

        public ViewOperation(int i2) {
            this.mTag = i2;
        }
    }

    public UIViewOperationQueue(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager, int i2) {
        this.mNativeViewHierarchyManager = nativeViewHierarchyManager;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext, i2 == -1 ? 8 : i2);
        this.mReactApplicationContext = reactApplicationContext;
    }

    public void flushPendingBatches() {
        if (this.mIsInIllegalUIState) {
            FLog.w(ReactConstants.TAG, "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.mDispatchRunnablesLock) {
            if (this.mDispatchUIRunnables.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.mDispatchUIRunnables;
            this.mDispatchUIRunnables = new ArrayList<>();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.mIsProfilingNextBatch) {
                this.mProfiledBatchBatchedExecutionTime = SystemClock.uptimeMillis() - jUptimeMillis;
                this.mProfiledBatchNonBatchedExecutionTime = this.mNonBatchedExecutionTotalTime;
                this.mIsProfilingNextBatch = false;
                Systrace.beginAsyncSection(0L, "batchedExecutionTime", 0, jUptimeMillis * AnimationKt.MillisToNanos);
                Systrace.endAsyncSection(0L, "batchedExecutionTime", 0);
            }
            this.mNonBatchedExecutionTotalTime = 0L;
        }
    }

    public void addRootView(int i2, View view) {
        this.mNativeViewHierarchyManager.addRootView(i2, view);
    }

    public void dispatchViewUpdates(int i2, long j2, long j3) throws Throwable {
        ArrayList<DispatchCommandViewOperation> arrayList;
        ArrayList<UIOperation> arrayList2;
        long j4 = 0;
        SystraceMessage.beginSection(0L, "UIViewOperationQueue.dispatchViewUpdates").arg("batchId", i2).flush();
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            ArrayDeque<UIOperation> arrayDeque = null;
            if (this.mViewCommandOperations.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = this.mViewCommandOperations;
                this.mViewCommandOperations = new ArrayList<>();
            }
            if (this.mOperations.isEmpty()) {
                arrayList2 = null;
            } else {
                arrayList2 = this.mOperations;
                this.mOperations = new ArrayList<>();
            }
            synchronized (this.mNonBatchedOperationsLock) {
                try {
                    try {
                        if (!this.mNonBatchedOperations.isEmpty()) {
                            arrayDeque = this.mNonBatchedOperations;
                            this.mNonBatchedOperations = new ArrayDeque<>();
                        }
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener = this.mViewHierarchyUpdateDebugListener;
            if (notThreadSafeViewHierarchyUpdateDebugListener != null) {
                notThreadSafeViewHierarchyUpdateDebugListener.onViewHierarchyUpdateEnqueued();
            }
            try {
                AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.facebook.react.uimanager.UIViewOperationQueue.1
                    final /* synthetic */ int val$batchId;
                    final /* synthetic */ ArrayList val$batchedOperations;
                    final /* synthetic */ long val$commitStartTime;
                    final /* synthetic */ long val$dispatchViewUpdatesTime;
                    final /* synthetic */ long val$layoutTime;
                    final /* synthetic */ long val$nativeModulesThreadCpuTime;
                    final /* synthetic */ ArrayDeque val$nonBatchedOperations;
                    final /* synthetic */ ArrayList val$viewCommandOperations;

                    AnonymousClass1(int i22, ArrayList arrayList3, ArrayDeque arrayDeque2, ArrayList arrayList22, long j22, long j32, long jUptimeMillis2, long jCurrentThreadTimeMillis2) {
                        i = i22;
                        arrayList = arrayList3;
                        arrayDeque = arrayDeque2;
                        arrayList = arrayList22;
                        j = j22;
                        j = j32;
                        j = jUptimeMillis2;
                        j = jCurrentThreadTimeMillis2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        SystraceMessage.beginSection(0L, "DispatchUI").arg("BatchId", i).flush();
                        try {
                            try {
                                long jUptimeMillis2 = SystemClock.uptimeMillis();
                                ArrayList<DispatchCommandViewOperation> arrayList3 = arrayList;
                                if (arrayList3 != null) {
                                    for (DispatchCommandViewOperation dispatchCommandViewOperation : arrayList3) {
                                        try {
                                            dispatchCommandViewOperation.executeWithExceptions();
                                        } catch (RetryableMountingLayerException e2) {
                                            if (dispatchCommandViewOperation.getRetries() == 0) {
                                                dispatchCommandViewOperation.incrementRetries();
                                                UIViewOperationQueue.this.mViewCommandOperations.add(dispatchCommandViewOperation);
                                            } else {
                                                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new ReactNoCrashSoftException(e2));
                                            }
                                        } catch (Throwable th4) {
                                            ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, th4);
                                        }
                                    }
                                }
                                ArrayDeque arrayDeque2 = arrayDeque;
                                if (arrayDeque2 != null) {
                                    Iterator it = arrayDeque2.iterator();
                                    while (it.hasNext()) {
                                        ((UIOperation) it.next()).execute();
                                    }
                                }
                                ArrayList arrayList22 = arrayList;
                                if (arrayList22 != null) {
                                    Iterator it2 = arrayList22.iterator();
                                    while (it2.hasNext()) {
                                        ((UIOperation) it2.next()).execute();
                                    }
                                }
                                if (UIViewOperationQueue.this.mIsProfilingNextBatch && UIViewOperationQueue.this.mProfiledBatchCommitStartTime == 0) {
                                    UIViewOperationQueue.this.mProfiledBatchCommitStartTime = j;
                                    UIViewOperationQueue.this.mProfiledBatchCommitEndTime = SystemClock.uptimeMillis();
                                    UIViewOperationQueue.this.mProfiledBatchLayoutTime = j;
                                    UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime = j;
                                    UIViewOperationQueue.this.mProfiledBatchRunStartTime = jUptimeMillis2;
                                    UIViewOperationQueue uIViewOperationQueue = UIViewOperationQueue.this;
                                    uIViewOperationQueue.mProfiledBatchRunEndTime = uIViewOperationQueue.mProfiledBatchCommitEndTime;
                                    UIViewOperationQueue.this.mThreadCpuTime = j;
                                    Systrace.beginAsyncSection(0L, "delayBeforeDispatchViewUpdates", 0, UIViewOperationQueue.this.mProfiledBatchCommitStartTime * AnimationKt.MillisToNanos);
                                    Systrace.endAsyncSection(0L, "delayBeforeDispatchViewUpdates", 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * AnimationKt.MillisToNanos);
                                    Systrace.beginAsyncSection(0L, "delayBeforeBatchRunStart", 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * AnimationKt.MillisToNanos);
                                    Systrace.endAsyncSection(0L, "delayBeforeBatchRunStart", 0, UIViewOperationQueue.this.mProfiledBatchRunStartTime * AnimationKt.MillisToNanos);
                                }
                                UIViewOperationQueue.this.mNativeViewHierarchyManager.clearLayoutAnimation();
                                if (UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener != null) {
                                    UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateFinished();
                                }
                            } catch (Exception e3) {
                                UIViewOperationQueue.this.mIsInIllegalUIState = true;
                                throw e3;
                            }
                        } finally {
                            Systrace.endSection(0L);
                        }
                    }
                };
                j4 = 0;
                SystraceMessage.beginSection(0L, "acquiring mDispatchRunnablesLock").arg("batchId", i22).flush();
                synchronized (this.mDispatchRunnablesLock) {
                    Systrace.endSection(0L);
                    this.mDispatchUIRunnables.add(anonymousClass1);
                }
                if (!this.mIsDispatchUIFrameCallbackEnqueued) {
                    UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.uimanager.UIViewOperationQueue.2
                        AnonymousClass2(ReactContext reactContext) {
                            super(reactContext);
                        }

                        @Override // com.facebook.react.bridge.GuardedRunnable
                        public void runGuarded() {
                            UIViewOperationQueue.this.flushPendingBatches();
                        }
                    });
                }
                Systrace.endSection(0L);
            } catch (Throwable th4) {
                th = th4;
                j4 = 0;
                Systrace.endSection(j4);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public void enqueueClearJSResponder() {
        this.mOperations.add(new ChangeJSResponderOperation(0, 0, true, false));
    }

    public void enqueueConfigureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperations.add(new ConfigureLayoutAnimationOperation(readableMap, callback));
    }

    public void enqueueCreateView(ThemedReactContext themedReactContext, int i2, String str, ReactStylesDiffMap reactStylesDiffMap) {
        synchronized (this.mNonBatchedOperationsLock) {
            this.mCreateViewCount++;
            this.mNonBatchedOperations.addLast(new CreateViewOperation(themedReactContext, i2, str, reactStylesDiffMap));
        }
    }

    @Deprecated
    public void enqueueDispatchCommand(int i2, int i3, ReadableArray readableArray) {
        this.mViewCommandOperations.add(new DispatchCommandOperation(i2, i3, readableArray));
    }

    public void enqueueDispatchCommand(int i2, String str, ReadableArray readableArray) {
        this.mViewCommandOperations.add(new DispatchStringCommandOperation(i2, str, readableArray));
    }

    public void enqueueFindTargetForTouch(int i2, float f2, float f3, Callback callback) {
        this.mOperations.add(new FindTargetForTouchOperation(i2, f2, f3, callback));
    }

    public void enqueueLayoutUpdateFinished(ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener) {
        this.mOperations.add(new LayoutUpdateFinishedOperation(reactShadowNode, layoutUpdateListener));
    }

    public void enqueueManageChildren(int i2, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        this.mOperations.add(new ManageChildrenOperation(i2, iArr, viewAtIndexArr, iArr2));
    }

    public void enqueueMeasure(int i2, Callback callback) {
        this.mOperations.add(new MeasureOperation(i2, callback));
    }

    public void enqueueMeasureInWindow(int i2, Callback callback) {
        this.mOperations.add(new MeasureInWindowOperation(i2, callback));
    }

    public void enqueueRemoveRootView(int i2) {
        this.mOperations.add(new RemoveRootViewOperation(i2));
    }

    public void enqueueSendAccessibilityEvent(int i2, int i3) {
        this.mOperations.add(new SendAccessibilityEvent(i2, i3));
    }

    public void enqueueSetChildren(int i2, ReadableArray readableArray) {
        this.mOperations.add(new SetChildrenOperation(i2, readableArray));
    }

    public void enqueueSetJSResponder(int i2, int i3, boolean z2) {
        this.mOperations.add(new ChangeJSResponderOperation(i2, i3, false, z2));
    }

    public void enqueueSetLayoutAnimationEnabled(boolean z2) {
        this.mOperations.add(new SetLayoutAnimationEnabledOperation(z2));
    }

    public void enqueueUIBlock(UIBlock uIBlock) {
        this.mOperations.add(new UIBlockOperation(uIBlock));
    }

    protected void enqueueUIOperation(UIOperation uIOperation) {
        SoftAssertions.assertNotNull(uIOperation);
        this.mOperations.add(uIOperation);
    }

    public void enqueueUpdateExtraData(int i2, Object obj) {
        this.mOperations.add(new UpdateViewExtraData(i2, obj));
    }

    public void enqueueUpdateInstanceHandle(int i2, long j2) {
        this.mOperations.add(new UpdateInstanceHandleOperation(i2, j2));
    }

    @Deprecated
    public void enqueueUpdateLayout(int i2, int i3, int i4, int i5, int i6, int i7) {
        enqueueUpdateLayout(i2, i3, i4, i5, i6, i7, YogaDirection.INHERIT);
    }

    public void enqueueUpdateLayout(int i2, int i3, int i4, int i5, int i6, int i7, YogaDirection yogaDirection) {
        this.mOperations.add(new UpdateLayoutOperation(i2, i3, i4, i5, i6, i7, yogaDirection));
    }

    public void enqueueUpdateProperties(int i2, String str, ReactStylesDiffMap reactStylesDiffMap) {
        this.mUpdatePropertiesOperationCount++;
        this.mOperations.add(new UpdatePropertiesOperation(i2, reactStylesDiffMap));
    }

    NativeViewHierarchyManager getNativeViewHierarchyManager() {
        return this.mNativeViewHierarchyManager;
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mProfiledBatchCommitStartTime));
        map.put("CommitEndTime", Long.valueOf(this.mProfiledBatchCommitEndTime));
        map.put("LayoutTime", Long.valueOf(this.mProfiledBatchLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mProfiledBatchDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mProfiledBatchRunStartTime));
        map.put("RunEndTime", Long.valueOf(this.mProfiledBatchRunEndTime));
        map.put("BatchedExecutionTime", Long.valueOf(this.mProfiledBatchBatchedExecutionTime));
        map.put("NonBatchedExecutionTime", Long.valueOf(this.mProfiledBatchNonBatchedExecutionTime));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(this.mThreadCpuTime));
        map.put("CreateViewCount", Long.valueOf(this.mCreateViewCount));
        map.put("UpdatePropsCount", Long.valueOf(this.mUpdatePropertiesOperationCount));
        return map;
    }

    public boolean isEmpty() {
        return this.mOperations.isEmpty() && this.mViewCommandOperations.isEmpty();
    }

    void pauseFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = false;
        ReactChoreographer.getInstance().removeFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
        flushPendingBatches();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperations.add(0, new UIBlockOperation(uIBlock));
    }

    public void profileNextBatch() {
        this.mIsProfilingNextBatch = true;
        this.mProfiledBatchCommitStartTime = 0L;
        this.mCreateViewCount = 0L;
        this.mUpdatePropertiesOperationCount = 0L;
    }

    void resumeFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = true;
        if (ReactNativeFeatureFlags.enableFabricRendererExclusively()) {
            return;
        }
        ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mViewHierarchyUpdateDebugListener = notThreadSafeViewHierarchyUpdateDebugListener;
    }
}
