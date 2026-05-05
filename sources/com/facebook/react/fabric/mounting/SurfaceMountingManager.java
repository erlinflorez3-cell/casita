package com.facebook.react.fabric.mounting;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.SparseArrayCompat;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.systrace.Systrace;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;
    public static final String TAG = "SurfaceMountingManager";
    private JSResponderHandler mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private SparseArrayCompat<Object> mTagSetForStoppedSurface;
    private ThemedReactContext mThemedReactContext;
    private ViewManagerRegistry mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();
    private final Set<Integer> mViewsWithActiveTouches = new HashSet();
    private final Set<Integer> mViewsToDeleteAfterTouchFinishes = new HashSet();

    /* JADX INFO: renamed from: com.facebook.react.fabric.mounting.SurfaceMountingManager$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$parentTag;
        final /* synthetic */ ViewGroup val$parentView;
        final /* synthetic */ int val$tag;

        AnonymousClass1(int i2, int i3, int i4, ViewGroup viewGroup) {
            i = i2;
            i = i3;
            i = i4;
            viewGroup = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            FLog.e(SurfaceMountingManager.TAG, "addViewAt: [" + i + "] -> [" + i + "] idx: " + i + " AFTER");
            SurfaceMountingManager.logViewHierarchy(viewGroup, false);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.mounting.SurfaceMountingManager$2 */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ int val$finalIndex;
        final /* synthetic */ int val$parentTag;
        final /* synthetic */ ViewGroup val$parentView;
        final /* synthetic */ int val$tag;

        AnonymousClass2(int i2, int i3, int i4, ViewGroup viewGroup) {
            i = i2;
            i = i3;
            i = i4;
            viewGroup = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            FLog.e(SurfaceMountingManager.TAG, "removeViewAt: [" + i + "] -> [" + i + "] idx: " + i + " AFTER");
            SurfaceMountingManager.logViewHierarchy(viewGroup, false);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.mounting.SurfaceMountingManager$3 */
    class AnonymousClass3 implements Runnable {
        final /* synthetic */ PendingViewEvent val$viewEvent;
        final /* synthetic */ ViewState val$viewState;

        AnonymousClass3(ViewState viewState, PendingViewEvent pendingViewEvent) {
            viewState = viewState;
            pendingViewEvent = pendingViewEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (viewState.mEventEmitter != null) {
                pendingViewEvent.dispatch(viewState.mEventEmitter);
                return;
            }
            if (viewState.mPendingEventQueue == null) {
                viewState.mPendingEventQueue = new LinkedList();
            }
            viewState.mPendingEventQueue.add(pendingViewEvent);
        }
    }

    private static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;
        private final WritableMap mParams;

        public PendingViewEvent(String str, WritableMap writableMap, int i2, boolean z2) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i2;
            this.mCanCoalesceEvent = z2;
        }

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }
    }

    private static class ViewState {
        ReadableMap mCurrentLocalData;
        ReactStylesDiffMap mCurrentProps;
        EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;
        Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;
        StateWrapper mStateWrapper;
        View mView;
        ViewManager mViewManager;

        private ViewState(int i2) {
            this(i2, null, null, false);
        }

        private ViewState(int i2, View view, ViewManager viewManager, boolean z2) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i2;
            this.mView = view;
            this.mIsRoot = z2;
            this.mViewManager = viewManager;
        }

        /* synthetic */ ViewState(int i2, View view, ViewManager viewManager, boolean z2, ViewStateIA viewStateIA) {
            this(i2, view, viewManager, z2);
        }

        /* synthetic */ ViewState(int i2, ViewStateIA viewStateIA) {
            this(i2);
        }

        public String toString() {
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + (this.mViewManager == null);
        }
    }

    static {
        boolean z2 = ReactBuildConfig.DEBUG;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }

    public SurfaceMountingManager(int i2, JSResponderHandler jSResponderHandler, ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager, MountingManager.MountItemExecutor mountItemExecutor, ThemedReactContext themedReactContext) {
        this.mSurfaceId = i2;
        this.mJSResponderHandler = jSResponderHandler;
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = themedReactContext;
    }

    private void addRootView(final View view) {
        if (isStopped()) {
            return;
        }
        this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager, true));
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$addRootView$0(view);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    private void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    private ViewState getNullableViewState(int i2) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i2));
    }

    private static IViewGroupManager<ViewGroup> getViewGroupManager(ViewState viewState) {
        if (viewState.mViewManager != null) {
            return (IViewGroupManager) viewState.mViewManager;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    private ViewState getViewState(int i2) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i2));
        if (viewState != null) {
            return viewState;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i2 + ". Surface stopped: " + isStopped());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$addRootView$0(View view) {
        if (isStopped()) {
            return;
        }
        if (view.getId() == this.mSurfaceId) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Race condition in addRootView detected. Trying to set an id of [" + this.mSurfaceId + "] on the RootView, but that id has already been set. "));
        } else if (view.getId() != -1) {
            String str = TAG;
            FLog.e(str, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(this.mSurfaceId));
            ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
        }
        view.setId(this.mSurfaceId);
        if (view instanceof ReactRoot) {
            ((ReactRoot) view).setRootViewTag(this.mSurfaceId);
        }
        if (!ReactNativeFeatureFlags.forceBatchingMountItemsOnAndroid()) {
            this.mRootViewAttached = true;
        }
        executeMountItemsOnViewAttach();
        if (ReactNativeFeatureFlags.forceBatchingMountItemsOnAndroid()) {
            this.mRootViewAttached = true;
        }
    }

    public /* synthetic */ void lambda$stopSurface$1() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mViewManagerRegistry.onSurfaceStopped(this.mSurfaceId);
        }
        this.mTagSetForStoppedSurface = new SparseArrayCompat<>();
        for (Map.Entry<Integer, ViewState> entry : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.put(entry.getKey().intValue(), this);
            onViewStateDeleted(entry.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        this.mOnViewAttachMountItems.clear();
        FLog.e(TAG, "Surface [" + this.mSurfaceId + "] was stopped on SurfaceMountingManager.");
    }

    public static void logViewHierarchy(ViewGroup viewGroup, boolean z2) {
        int id = viewGroup.getId();
        FLog.e(TAG, "  <ViewGroup tag=" + id + " class=" + viewGroup.getClass().toString() + ">");
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            FLog.e(TAG, "     <View idx=" + i2 + " tag=" + viewGroup.getChildAt(i2).getId() + " class=" + viewGroup.getChildAt(i2).getClass().toString() + ">");
        }
        String str = TAG;
        FLog.e(str, "  </ViewGroup tag=" + id + ">");
        if (z2) {
            FLog.e(str, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                FLog.e(TAG, "<ViewParent tag=" + (viewGroup2 == null ? -1 : viewGroup2.getId()) + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    private void onViewStateDeleted(ViewState viewState) {
        if (viewState.mStateWrapper != null) {
            viewState.mStateWrapper.destroyState();
            viewState.mStateWrapper = null;
        }
        if (viewState.mEventEmitter != null) {
            viewState.mEventEmitter.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewState.mIsRoot || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(viewState.mView);
    }

    public void addViewAt(int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i2);
        if (!(viewState.mView instanceof ViewGroup)) {
            String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i2 + " - Tag: " + i3 + " - Index: " + i4;
            FLog.e(TAG, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) viewState.mView;
        ViewState viewState2 = getViewState(i3);
        View view = viewState2.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i3);
        }
        boolean z2 = SHOW_CHANGED_VIEW_HIERARCHIES;
        if (z2) {
            FLog.e(TAG, "addViewAt: [" + i3 + "] -> [" + i2 + "] idx: " + i4 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            boolean z3 = parent instanceof ViewGroup;
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + i3 + "] into parent [" + i2 + "]: View already has a parent: [" + (z3 ? ((ViewGroup) parent).getId() : -1) + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view.getClass().getSimpleName()));
            if (z3) {
                ((ViewGroup) parent).removeView(view);
            }
            this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i3));
        }
        try {
            getViewGroupManager(viewState).addView(viewGroup, view, i4);
            if (z2) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.1
                    final /* synthetic */ int val$index;
                    final /* synthetic */ int val$parentTag;
                    final /* synthetic */ ViewGroup val$parentView;
                    final /* synthetic */ int val$tag;

                    AnonymousClass1(int i32, int i22, int i42, ViewGroup viewGroup2) {
                        i = i32;
                        i = i22;
                        i = i42;
                        viewGroup = viewGroup2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        FLog.e(SurfaceMountingManager.TAG, "addViewAt: [" + i + "] -> [" + i + "] idx: " + i + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + i32 + "] into parent [" + i22 + "] at index " + i42, e2);
        }
    }

    public void attachRootView(View view, ThemedReactContext themedReactContext) {
        this.mThemedReactContext = themedReactContext;
        addRootView(view);
    }

    public void createView(String str, int i2, ReadableMap readableMap, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean z2) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i2);
        if (nullableViewState == null || nullableViewState.mView == null) {
            createViewUnsafe(str, i2, readableMap, stateWrapper, eventEmitterWrapper, z2);
        }
    }

    public void createViewUnsafe(String str, int i2, ReadableMap readableMap, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean z2) {
        Systrace.beginSection(0L, "SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
            ViewState viewState = new ViewState(i2);
            viewState.mCurrentProps = reactStylesDiffMap;
            viewState.mStateWrapper = stateWrapper;
            viewState.mEventEmitter = eventEmitterWrapper;
            this.mTagToViewState.put(Integer.valueOf(i2), viewState);
            if (z2) {
                ViewManager viewManager = this.mViewManagerRegistry.get(str);
                viewState.mView = viewManager.createView(i2, this.mThemedReactContext, reactStylesDiffMap, stateWrapper, this.mJSResponderHandler);
                viewState.mViewManager = viewManager;
            }
        } finally {
            Systrace.endSection(0L);
        }
    }

    public void deleteView(int i2) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i2);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: " + i2 + " for deleteView"));
        } else if (ReactNativeFeatureFlags.enableEventEmitterRetentionDuringGesturesOnAndroid() && this.mViewsWithActiveTouches.contains(Integer.valueOf(i2))) {
            this.mViewsToDeleteAfterTouchFinishes.add(Integer.valueOf(i2));
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i2));
            onViewStateDeleted(nullableViewState);
        }
    }

    public void enqueuePendingEvent(int i2, String str, boolean z2, WritableMap writableMap, int i3) {
        ViewState viewState;
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null || (viewState = concurrentHashMap.get(Integer.valueOf(i2))) == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.3
            final /* synthetic */ PendingViewEvent val$viewEvent;
            final /* synthetic */ ViewState val$viewState;

            AnonymousClass3(ViewState viewState2, PendingViewEvent pendingViewEvent) {
                viewState = viewState2;
                pendingViewEvent = pendingViewEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (viewState.mEventEmitter != null) {
                    pendingViewEvent.dispatch(viewState.mEventEmitter);
                    return;
                }
                if (viewState.mPendingEventQueue == null) {
                    viewState.mPendingEventQueue = new LinkedList();
                }
                viewState.mPendingEventQueue.add(pendingViewEvent);
            }
        });
    }

    public ThemedReactContext getContext() {
        return this.mThemedReactContext;
    }

    public EventEmitterWrapper getEventEmitter(int i2) {
        ViewState nullableViewState = getNullableViewState(i2);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public View getView(int i2) {
        ViewState nullableViewState = getNullableViewState(i2);
        View view = nullableViewState == null ? null : nullableViewState.mView;
        if (view != null) {
            return view;
        }
        throw new IllegalViewOperationException("Trying to resolve view with tag " + i2 + " which doesn't exist");
    }

    public boolean getViewExists(int i2) {
        SparseArrayCompat<Object> sparseArrayCompat = this.mTagSetForStoppedSurface;
        if (sparseArrayCompat != null && sparseArrayCompat.containsKey(i2)) {
            return true;
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i2));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void markActiveTouchForTag(int i2) {
        if (ReactNativeFeatureFlags.enableEventEmitterRetentionDuringGesturesOnAndroid()) {
            this.mViewsWithActiveTouches.add(Integer.valueOf(i2));
        }
    }

    public void preallocateView(String str, int i2, ReadableMap readableMap, StateWrapper stateWrapper, boolean z2) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i2) == null) {
            createViewUnsafe(str, i2, readableMap, stateWrapper, null, z2);
        }
    }

    public void printSurfaceState() {
        FLog.e(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            Integer numValueOf = null;
            String name = viewState.mViewManager != null ? viewState.mViewManager.getName() : null;
            View view = viewState.mView;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            FLog.e(TAG, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(viewState.mReactTag), numValueOf, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i2, int i3, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i2);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i2 + "] for commandId: " + i3);
        }
        if (nullableViewState.mViewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i2);
        }
        if (nullableViewState.mView == null) {
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i2);
        }
        nullableViewState.mViewManager.receiveCommand(nullableViewState.mView, i3, readableArray);
    }

    public void receiveCommand(int i2, String str, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i2);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i2 + " for commandId: " + str);
        }
        if (nullableViewState.mViewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i2);
        }
        if (nullableViewState.mView == null) {
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i2);
        }
        nullableViewState.mViewManager.receiveCommand(nullableViewState.mView, str, readableArray);
    }

    public void removeViewAt(int i2, int i3, int i4) {
        if (isStopped()) {
            return;
        }
        if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i2))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i2 + "]"));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(i3);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: [" + i3 + "] for removeViewAt"));
            return;
        }
        if (!(nullableViewState.mView instanceof ViewGroup)) {
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i3 + " - Tag: " + i2 + " - Index: " + i4;
            FLog.e(TAG, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) nullableViewState.mView;
        if (viewGroup == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i3 + "]");
        }
        int i5 = 0;
        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
            FLog.e(TAG, "removeViewAt: [" + i2 + "] -> [" + i3 + "] idx: " + i4 + " BEFORE");
            logViewHierarchy(viewGroup, false);
        }
        IViewGroupManager<ViewGroup> viewGroupManager = getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(viewGroup, i4);
        int id = childAt != null ? childAt.getId() : -1;
        if (id != i2) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i5 >= childCount) {
                    i5 = -1;
                    break;
                } else if (viewGroup.getChildAt(i5).getId() == i2) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 == -1) {
                FLog.e(TAG, "removeViewAt: [" + i2 + "] -> [" + i3 + "] @" + i4 + ": view already removed from parent! Children in parent: " + childCount);
                return;
            } else {
                logViewHierarchy(viewGroup, true);
                ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + i2 + "] of parent [" + i3 + "] at index " + i4 + ", but got view tag " + id + " - actual index of view: " + i5));
            }
        } else {
            i5 = i4;
        }
        try {
            viewGroupManager.removeViewAt(viewGroup, i5);
            if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.2
                    final /* synthetic */ int val$finalIndex;
                    final /* synthetic */ int val$parentTag;
                    final /* synthetic */ ViewGroup val$parentView;
                    final /* synthetic */ int val$tag;

                    AnonymousClass2(int i22, int i32, int i52, ViewGroup viewGroup2) {
                        i = i22;
                        i = i32;
                        i = i52;
                        viewGroup = viewGroup2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        FLog.e(SurfaceMountingManager.TAG, "removeViewAt: [" + i + "] -> [" + i + "] idx: " + i + " AFTER");
                        SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                    }
                });
            }
        } catch (RuntimeException e2) {
            int childCount2 = viewGroupManager.getChildCount(viewGroup2);
            logViewHierarchy(viewGroup2, true);
            throw new IllegalStateException("Cannot remove child at index " + i52 + " from parent ViewGroup [" + viewGroup2.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e2);
        }
    }

    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    public void sendAccessibilityEvent(int i2, int i3) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i2);
        if (viewState.mViewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i2);
        }
        if (viewState.mView == null) {
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i2);
        }
        viewState.mView.sendAccessibilityEvent(i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i2, int i3, boolean z2) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (!z2) {
            this.mJSResponderHandler.setJSResponder(i3, null);
            return;
        }
        ViewState viewState = getViewState(i2);
        View view = viewState.mView;
        if (i3 != i2 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.setJSResponder(i3, (ViewParent) view);
        } else {
            if (view == 0) {
                SoftAssertions.assertUnreachable("Cannot find view for tag [" + i2 + "].");
                return;
            }
            if (viewState.mIsRoot) {
                SoftAssertions.assertUnreachable("Cannot block native responder on [" + i2 + "] that is a root view");
            }
            this.mJSResponderHandler.setJSResponder(i3, view.getParent());
        }
    }

    public void stopSurface() {
        FLog.e(TAG, "Stopping surface [" + this.mSurfaceId + "]");
        if (isStopped()) {
            return;
        }
        this.mIsStopped = true;
        for (ViewState viewState : this.mTagToViewState.values()) {
            if (viewState.mStateWrapper != null) {
                viewState.mStateWrapper.destroyState();
                viewState.mStateWrapper = null;
            }
            if (viewState.mEventEmitter != null) {
                viewState.mEventEmitter.destroy();
                viewState.mEventEmitter = null;
            }
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$stopSurface$1();
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public void sweepActiveTouchForTag(int i2) {
        if (ReactNativeFeatureFlags.enableEventEmitterRetentionDuringGesturesOnAndroid()) {
            this.mViewsWithActiveTouches.remove(Integer.valueOf(i2));
            if (this.mViewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(i2))) {
                this.mViewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(i2));
                deleteView(i2);
            }
        }
    }

    public void updateEventEmitter(int i2, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i2));
        if (viewState == null) {
            viewState = new ViewState(i2);
            this.mTagToViewState.put(Integer.valueOf(i2), viewState);
        }
        EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
        viewState.mEventEmitter = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.destroy();
        }
        Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
        if (queue != null) {
            Iterator<PendingViewEvent> it = queue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitterWrapper);
            }
            viewState.mPendingEventQueue = null;
        }
    }

    public void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i2);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i2);
        }
        if (ReactNativeFeatureFlags.setAndroidLayoutDirection()) {
            int i10 = 1;
            if (i9 == 1) {
                i10 = 0;
            } else if (i9 != 2) {
                i10 = 2;
            }
            view.setLayoutDirection(i10);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof RootView) {
            parent.requestLayout();
        }
        ViewState viewState2 = getViewState(i3);
        IViewGroupManager iViewGroupManager = viewState2.mViewManager != null ? (IViewGroupManager) viewState2.mViewManager : null;
        if (iViewGroupManager == null || !iViewGroupManager.needsCustomLayoutForChildren()) {
            view.layout(i4, i5, i6 + i4, i7 + i5);
        }
        int i11 = i8 == 0 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
    }

    public void updateOverflowInset(int i2, int i3, int i4, int i5, int i6) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i2);
        if (viewState.mIsRoot) {
            return;
        }
        KeyEvent.Callback callback = viewState.mView;
        if (callback == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i2);
        }
        if (callback instanceof ReactOverflowViewWithInset) {
            ((ReactOverflowViewWithInset) callback).setOverflowInset(i3, i4, i5, i6);
        }
    }

    public void updatePadding(int i2, int i3, int i4, int i5, int i6) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i2);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i2);
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager == null) {
            throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
        }
        viewManager.setPadding(view, i3, i4, i5, i6);
    }

    public void updateProps(int i2, ReadableMap readableMap) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i2);
        viewState.mCurrentProps = new ReactStylesDiffMap(readableMap);
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i2 + "]");
        }
        ((ViewManager) Assertions.assertNotNull(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
    }

    public void updateState(int i2, StateWrapper stateWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i2);
        StateWrapper stateWrapper2 = viewState.mStateWrapper;
        viewState.mStateWrapper = stateWrapper;
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager == null) {
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i2);
        }
        Object objUpdateState = viewManager.updateState(viewState.mView, viewState.mCurrentProps, stateWrapper);
        if (objUpdateState != null) {
            viewManager.updateExtraData(viewState.mView, objUpdateState);
        }
        if (stateWrapper2 != null) {
            stateWrapper2.destroyState();
        }
    }
}
