package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import com.facebook.yoga.YogaDirection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class UIImplementation {
    protected final EventDispatcher mEventDispatcher;
    private long mLastCalculateLayoutTime;
    protected LayoutUpdateListener mLayoutUpdateListener;
    private final int[] mMeasureBuffer;
    private final NativeViewHierarchyOptimizer mNativeViewHierarchyOptimizer;
    private final UIViewOperationQueue mOperationsQueue;
    protected final ReactApplicationContext mReactContext;
    protected final ShadowNodeRegistry mShadowNodeRegistry;
    private final ViewManagerRegistry mViewManagers;
    private volatile boolean mViewOperationsEnabled;
    protected Object uiImplementationThreadLock;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.UIImplementation$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ ReactShadowNode val$rootCSSNode;

        AnonymousClass1(ReactShadowNode reactShadowNode) {
            reactShadowNode = reactShadowNode;
        }

        @Override // java.lang.Runnable
        public void run() {
            UIImplementation.this.mShadowNodeRegistry.addRootNode(reactShadowNode);
        }
    }

    public interface LayoutUpdateListener {
        void onLayoutUpdated(ReactShadowNode reactShadowNode);
    }

    protected UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, UIViewOperationQueue uIViewOperationQueue, EventDispatcher eventDispatcher) {
        this.uiImplementationThreadLock = new Object();
        ShadowNodeRegistry shadowNodeRegistry = new ShadowNodeRegistry();
        this.mShadowNodeRegistry = shadowNodeRegistry;
        this.mMeasureBuffer = new int[4];
        this.mLastCalculateLayoutTime = 0L;
        this.mViewOperationsEnabled = true;
        this.mReactContext = reactApplicationContext;
        this.mViewManagers = viewManagerRegistry;
        this.mOperationsQueue = uIViewOperationQueue;
        this.mNativeViewHierarchyOptimizer = new NativeViewHierarchyOptimizer(uIViewOperationQueue, shadowNodeRegistry);
        this.mEventDispatcher = eventDispatcher;
    }

    UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i2) {
        this(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(viewManagerRegistry), i2), eventDispatcher);
    }

    private void assertNodeDoesNotNeedCustomLayoutForChildren(ReactShadowNode reactShadowNode) {
        NativeModule nativeModule = (ViewManager) Assertions.assertNotNull(this.mViewManagers.get(reactShadowNode.getViewClass()));
        if (!(nativeModule instanceof IViewManagerWithChildren)) {
            throw new IllegalViewOperationException("Trying to use view " + reactShadowNode.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        IViewManagerWithChildren iViewManagerWithChildren = (IViewManagerWithChildren) nativeModule;
        if (iViewManagerWithChildren != null && iViewManagerWithChildren.needsCustomLayoutForChildren()) {
            throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + reactShadowNode.getViewClass() + "). Use measure instead.");
        }
    }

    private boolean checkOrAssertViewExists(int i2, String str) {
        if (this.mShadowNodeRegistry.getNode(i2) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i2 + ", since the view does not exist";
        if (ReactBuildConfig.DEBUG) {
            throw new IllegalViewOperationException(str2);
        }
        FLog.w(ReactConstants.TAG, str2);
        return false;
    }

    private void dispatchViewUpdatesIfNeeded() {
        if (this.mOperationsQueue.isEmpty()) {
            dispatchViewUpdates(-1);
        }
    }

    private void measureLayout(int i2, int i3, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i3);
        if (node == null || node2 == null) {
            StringBuilder sb = new StringBuilder("Tag ");
            if (node != null) {
                i2 = i3;
            }
            throw new IllegalViewOperationException(sb.append(i2).append(" does not exist").toString());
        }
        if (node != node2) {
            for (ReactShadowNode parent = node.getParent(); parent != node2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new IllegalViewOperationException("Tag " + i3 + " is not an ancestor of tag " + i2);
                }
            }
        }
        measureLayoutRelativeToVerifiedAncestor(node, node2, iArr);
    }

    private void measureLayoutRelativeToParent(int i2, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        if (node == null) {
            throw new IllegalViewOperationException("No native view for tag " + i2 + " exists!");
        }
        ReactShadowNode parent = node.getParent();
        if (parent == null) {
            throw new IllegalViewOperationException("View with tag " + i2 + " doesn't have a parent!");
        }
        measureLayoutRelativeToVerifiedAncestor(node, parent, iArr);
    }

    private void measureLayoutRelativeToVerifiedAncestor(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int[] iArr) {
        int iRound;
        int iRound2;
        if (reactShadowNode == reactShadowNode2 || reactShadowNode.isVirtual()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            iRound = Math.round(reactShadowNode.getLayoutX());
            iRound2 = Math.round(reactShadowNode.getLayoutY());
            for (ReactShadowNode parent = reactShadowNode.getParent(); parent != reactShadowNode2; parent = parent.getParent()) {
                Assertions.assertNotNull(parent);
                assertNodeDoesNotNeedCustomLayoutForChildren(parent);
                iRound += Math.round(parent.getLayoutX());
                iRound2 += Math.round(parent.getLayoutY());
            }
            assertNodeDoesNotNeedCustomLayoutForChildren(reactShadowNode2);
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = reactShadowNode.getScreenWidth();
        iArr[3] = reactShadowNode.getScreenHeight();
    }

    private void notifyOnBeforeLayoutRecursive(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.hasUpdates()) {
            for (int i2 = 0; i2 < reactShadowNode.getChildCount(); i2++) {
                notifyOnBeforeLayoutRecursive(reactShadowNode.getChildAt(i2));
            }
            reactShadowNode.onBeforeLayout(this.mNativeViewHierarchyOptimizer);
        }
    }

    private void removeShadowNodeRecursive(ReactShadowNode reactShadowNode) {
        NativeViewHierarchyOptimizer.handleRemoveNode(reactShadowNode);
        this.mShadowNodeRegistry.removeNode(reactShadowNode.getReactTag());
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeShadowNodeRecursive(reactShadowNode.getChildAt(childCount));
        }
        reactShadowNode.removeAndDisposeAllChildren();
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.enqueueUIBlock(uIBlock);
    }

    protected void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f2, float f3, List<ReactShadowNode> list) {
        if (reactShadowNode.hasUpdates()) {
            if (reactShadowNode.dispatchUpdatesWillChangeLayout(f2, f3) && reactShadowNode.shouldNotifyOnLayout() && !this.mShadowNodeRegistry.isRootNode(reactShadowNode.getReactTag())) {
                list.add(reactShadowNode);
            }
            Iterable<? extends ReactShadowNode> iterableCalculateLayoutOnChildren = reactShadowNode.calculateLayoutOnChildren();
            if (iterableCalculateLayoutOnChildren != null) {
                Iterator<? extends ReactShadowNode> it = iterableCalculateLayoutOnChildren.iterator();
                while (it.hasNext()) {
                    applyUpdatesRecursive(it.next(), reactShadowNode.getLayoutX() + f2, reactShadowNode.getLayoutY() + f3, list);
                }
            }
            reactShadowNode.dispatchUpdates(f2, f3, this.mOperationsQueue, this.mNativeViewHierarchyOptimizer);
            reactShadowNode.markUpdateSeen();
            this.mNativeViewHierarchyOptimizer.onViewUpdatesCompleted(reactShadowNode);
        }
    }

    protected void calculateRootLayout(ReactShadowNode reactShadowNode) {
        SystraceMessage.beginSection(0L, "cssRoot.calculateLayout").arg("rootTag", reactShadowNode.getReactTag()).flush();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            reactShadowNode.calculateLayout(View.MeasureSpec.getMode(reactShadowNode.getWidthMeasureSpec().intValue()) == 0 ? Float.NaN : View.MeasureSpec.getSize(r1), View.MeasureSpec.getMode(reactShadowNode.getHeightMeasureSpec().intValue()) != 0 ? View.MeasureSpec.getSize(r5) : Float.NaN);
        } finally {
            Systrace.endSection(0L);
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public void clearJSResponder() {
        this.mOperationsQueue.enqueueClearJSResponder();
    }

    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperationsQueue.enqueueConfigureLayoutAnimation(readableMap, callback);
    }

    protected ReactShadowNode createRootShadowNode() {
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            reactShadowNodeImpl.setLayoutDirection(YogaDirection.RTL);
        }
        reactShadowNodeImpl.setViewClassName("Root");
        return reactShadowNodeImpl;
    }

    protected ReactShadowNode createShadowNode(String str) {
        return this.mViewManagers.get(str).createShadowNodeInstance(this.mReactContext);
    }

    public void createView(int i2, String str, int i3, ReadableMap readableMap) {
        ReactStylesDiffMap reactStylesDiffMap;
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                ReactShadowNode reactShadowNodeCreateShadowNode = createShadowNode(str);
                ReactShadowNode node = this.mShadowNodeRegistry.getNode(i3);
                Assertions.assertNotNull(node, "Root node with tag " + i3 + " doesn't exist");
                reactShadowNodeCreateShadowNode.setReactTag(i2);
                reactShadowNodeCreateShadowNode.setViewClassName(str);
                reactShadowNodeCreateShadowNode.setRootTag(node.getReactTag());
                reactShadowNodeCreateShadowNode.setThemedContext(node.getThemedContext());
                this.mShadowNodeRegistry.addNode(reactShadowNodeCreateShadowNode);
                if (readableMap != null) {
                    reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                    reactShadowNodeCreateShadowNode.updateProperties(reactStylesDiffMap);
                } else {
                    reactStylesDiffMap = null;
                }
                handleCreateView(reactShadowNodeCreateShadowNode, i3, reactStylesDiffMap);
            }
        }
    }

    @Deprecated
    public void dispatchViewManagerCommand(int i2, int i3, ReadableArray readableArray) {
        if (checkOrAssertViewExists(i2, "dispatchViewManagerCommand: " + i3)) {
            this.mOperationsQueue.enqueueDispatchCommand(i2, i3, readableArray);
        }
    }

    public void dispatchViewManagerCommand(int i2, String str, ReadableArray readableArray) {
        if (checkOrAssertViewExists(i2, "dispatchViewManagerCommand: " + str)) {
            this.mOperationsQueue.enqueueDispatchCommand(i2, str, readableArray);
        }
    }

    public void dispatchViewUpdates(int i2) {
        SystraceMessage.beginSection(0L, "UIImplementation.dispatchViewUpdates").arg("batchId", i2).flush();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            updateViewHierarchy();
            this.mNativeViewHierarchyOptimizer.onBatchComplete();
            this.mOperationsQueue.dispatchViewUpdates(i2, jUptimeMillis, this.mLastCalculateLayoutTime);
        } finally {
            Systrace.endSection(0L);
        }
    }

    public void findSubviewIn(int i2, float f2, float f3, Callback callback) {
        this.mOperationsQueue.enqueueFindTargetForTouch(i2, f2, f3, callback);
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        return this.mOperationsQueue.getProfiledBatchPerfCounters();
    }

    public int getRootViewNum() {
        return this.mOperationsQueue.getNativeViewHierarchyManager().getRootViewNum();
    }

    UIViewOperationQueue getUIViewOperationQueue() {
        return this.mOperationsQueue;
    }

    protected void handleCreateView(ReactShadowNode reactShadowNode, int i2, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isVirtual()) {
            return;
        }
        this.mNativeViewHierarchyOptimizer.handleCreateView(reactShadowNode, reactShadowNode.getThemedContext(), reactStylesDiffMap);
    }

    protected void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isVirtual()) {
            return;
        }
        this.mNativeViewHierarchyOptimizer.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
    }

    public void manageChildren(int i2, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) throws Throwable {
        if (!this.mViewOperationsEnabled) {
            return;
        }
        synchronized (this.uiImplementationThreadLock) {
            try {
                ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
                int size = readableArray == null ? 0 : readableArray.size();
                int size2 = readableArray3 == null ? 0 : readableArray3.size();
                int size3 = readableArray5 == null ? 0 : readableArray5.size();
                if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                    throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
                }
                if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                    throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
                }
                int i3 = size + size2;
                ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[i3];
                int i4 = size + size3;
                int[] iArr = new int[i4];
                try {
                    int[] iArr2 = new int[i4];
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        Assertions.assertNotNull(readableArray);
                        Assertions.assertNotNull(readableArray2);
                        for (int i5 = 0; i5 < size; i5++) {
                            int i6 = readableArray.getInt(i5);
                            int reactTag = node.getChildAt(i6).getReactTag();
                            viewAtIndexArr[i5] = new ViewAtIndex(reactTag, readableArray2.getInt(i5));
                            iArr[i5] = i6;
                            iArr2[i5] = reactTag;
                        }
                    }
                    if (size2 > 0) {
                        Assertions.assertNotNull(readableArray3);
                        Assertions.assertNotNull(readableArray4);
                        for (int i7 = 0; i7 < size2; i7++) {
                            viewAtIndexArr[size + i7] = new ViewAtIndex(readableArray3.getInt(i7), readableArray4.getInt(i7));
                        }
                    }
                    if (size3 > 0) {
                        Assertions.assertNotNull(readableArray5);
                        for (int i8 = 0; i8 < size3; i8++) {
                            int i9 = readableArray5.getInt(i8);
                            int reactTag2 = node.getChildAt(i9).getReactTag();
                            int i10 = size + i8;
                            iArr[i10] = i9;
                            iArr2[i10] = reactTag2;
                            iArr3[i8] = reactTag2;
                        }
                    }
                    Arrays.sort(viewAtIndexArr, ViewAtIndex.COMPARATOR);
                    Arrays.sort(iArr);
                    int i11 = -1;
                    for (int i12 = i4 - 1; i12 >= 0; i12--) {
                        int i13 = iArr[i12];
                        if (i13 == i11) {
                            throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: " + i2);
                        }
                        node.removeChildAt(i13);
                        i11 = iArr[i12];
                    }
                    for (int i14 = 0; i14 < i3; i14++) {
                        ViewAtIndex viewAtIndex = viewAtIndexArr[i14];
                        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(viewAtIndex.mTag);
                        if (node2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag);
                        }
                        node.addChildAt(node2, viewAtIndex.mIndex);
                    }
                    this.mNativeViewHierarchyOptimizer.handleManageChildren(node, iArr, iArr2, viewAtIndexArr, iArr3);
                    for (int i15 = 0; i15 < size3; i15++) {
                        removeShadowNode(this.mShadowNodeRegistry.getNode(iArr3[i15]));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void measure(int i2, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.enqueueMeasure(i2, callback);
        }
    }

    public void measureInWindow(int i2, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.enqueueMeasureInWindow(i2, callback);
        }
    }

    public void measureLayout(int i2, int i3, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayout(i2, i3, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e2) {
                callback.invoke(e2.getMessage());
            }
        }
    }

    public void measureLayoutRelativeToParent(int i2, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayoutRelativeToParent(i2, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e2) {
                callback.invoke(e2.getMessage());
            }
        }
    }

    public void onCatalystInstanceDestroyed() {
        this.mViewOperationsEnabled = false;
        this.mViewManagers.invalidate();
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mOperationsQueue.pauseFrameCallback();
    }

    public void onHostResume() {
        this.mOperationsQueue.resumeFrameCallback();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.prependUIBlock(uIBlock);
    }

    public void profileNextBatch() {
        this.mOperationsQueue.profileNextBatch();
    }

    public <T extends View> void registerRootView(T t2, int i2, ThemedReactContext themedReactContext) {
        synchronized (this.uiImplementationThreadLock) {
            ReactShadowNode reactShadowNodeCreateRootShadowNode = createRootShadowNode();
            reactShadowNodeCreateRootShadowNode.setReactTag(i2);
            reactShadowNodeCreateRootShadowNode.setThemedContext(themedReactContext);
            themedReactContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.UIImplementation.1
                final /* synthetic */ ReactShadowNode val$rootCSSNode;

                AnonymousClass1(ReactShadowNode reactShadowNodeCreateRootShadowNode2) {
                    reactShadowNode = reactShadowNodeCreateRootShadowNode2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    UIImplementation.this.mShadowNodeRegistry.addRootNode(reactShadowNode);
                }
            });
            this.mOperationsQueue.addRootView(i2, t2);
        }
    }

    public void removeLayoutUpdateListener() {
        this.mLayoutUpdateListener = null;
    }

    public void removeRootShadowNode(int i2) {
        synchronized (this.uiImplementationThreadLock) {
            this.mShadowNodeRegistry.removeRootNode(i2);
        }
    }

    public void removeRootView(int i2) {
        removeRootShadowNode(i2);
        this.mOperationsQueue.enqueueRemoveRootView(i2);
    }

    protected final void removeShadowNode(ReactShadowNode reactShadowNode) {
        removeShadowNodeRecursive(reactShadowNode);
        reactShadowNode.dispose();
    }

    public void replaceExistingNonRootView(int i2, int i3) throws Throwable {
        if (this.mShadowNodeRegistry.isRootNode(i2) || this.mShadowNodeRegistry.isRootNode(i3)) {
            throw new IllegalViewOperationException("Trying to add or replace a root tag!");
        }
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        if (node == null) {
            throw new IllegalViewOperationException("Trying to replace unknown view tag: " + i2);
        }
        ReactShadowNode parent = node.getParent();
        if (parent == null) {
            throw new IllegalViewOperationException("Node is not attached to a parent: " + i2);
        }
        int iIndexOf = parent.indexOf(node);
        if (iIndexOf < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i3);
        WritableArray writableArrayCreateArray2 = Arguments.createArray();
        writableArrayCreateArray2.pushInt(iIndexOf);
        WritableArray writableArrayCreateArray3 = Arguments.createArray();
        writableArrayCreateArray3.pushInt(iIndexOf);
        manageChildren(parent.getReactTag(), null, null, writableArrayCreateArray, writableArrayCreateArray2, writableArrayCreateArray3);
    }

    public int resolveRootTagFromReactTag(int i2) {
        if (this.mShadowNodeRegistry.isRootNode(i2)) {
            return i2;
        }
        ReactShadowNode reactShadowNodeResolveShadowNode = resolveShadowNode(i2);
        if (reactShadowNodeResolveShadowNode != null) {
            return reactShadowNodeResolveShadowNode.getRootTag();
        }
        FLog.w(ReactConstants.TAG, "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i2);
        return 0;
    }

    public final ReactShadowNode resolveShadowNode(int i2) {
        return this.mShadowNodeRegistry.getNode(i2);
    }

    protected final ViewManager resolveViewManager(String str) {
        return this.mViewManagers.getViewManagerIfExists(str);
    }

    public void sendAccessibilityEvent(int i2, int i3) {
        this.mOperationsQueue.enqueueSendAccessibilityEvent(i2, i3);
    }

    public void setChildren(int i2, ReadableArray readableArray) {
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
                for (int i3 = 0; i3 < readableArray.size(); i3++) {
                    ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(readableArray.getInt(i3));
                    if (node2 == null) {
                        throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i3));
                    }
                    node.addChildAt(node2, i3);
                }
                this.mNativeViewHierarchyOptimizer.handleSetChildren(node, readableArray);
            }
        }
    }

    public void setJSResponder(int i2, boolean z2) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        if (node == null) {
            return;
        }
        while (node.getNativeKind() == NativeKind.NONE) {
            node = node.getParent();
        }
        this.mOperationsQueue.enqueueSetJSResponder(node.getReactTag(), i2, z2);
    }

    public void setLayoutAnimationEnabledExperimental(boolean z2) {
        this.mOperationsQueue.enqueueSetLayoutAnimationEnabled(z2);
    }

    public void setLayoutUpdateListener(LayoutUpdateListener layoutUpdateListener) {
        this.mLayoutUpdateListener = layoutUpdateListener;
    }

    public void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mOperationsQueue.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public void setViewLocalData(int i2, Object obj) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        if (node == null) {
            FLog.w(ReactConstants.TAG, "Attempt to set local data for view with unknown tag: " + i2);
        } else {
            node.setLocalData(obj);
            dispatchViewUpdatesIfNeeded();
        }
    }

    public void synchronouslyUpdateViewOnUIThread(int i2, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        this.mOperationsQueue.getNativeViewHierarchyManager().updateProperties(i2, reactStylesDiffMap);
    }

    public void updateInsetsPadding(int i2, int i3, int i4, int i5, int i6) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        if (node == null) {
            FLog.w(ReactConstants.TAG, "Tried to update size of non-existent tag: " + i2);
            return;
        }
        node.setPadding(4, i4);
        node.setPadding(1, i3);
        node.setPadding(5, i6);
        node.setPadding(3, i5);
        dispatchViewUpdatesIfNeeded();
    }

    public void updateNodeSize(int i2, int i3, int i4) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        if (node == null) {
            FLog.w(ReactConstants.TAG, "Tried to update size of non-existent tag: " + i2);
            return;
        }
        node.setStyleWidth(i3);
        node.setStyleHeight(i4);
        dispatchViewUpdatesIfNeeded();
    }

    public void updateRootView(int i2, int i3, int i4) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        if (node == null) {
            FLog.w(ReactConstants.TAG, "Tried to update non-existent root tag: " + i2);
        } else {
            updateRootView(node, i3, i4);
        }
    }

    public void updateRootView(ReactShadowNode reactShadowNode, int i2, int i3) {
        reactShadowNode.setMeasureSpecs(i2, i3);
    }

    public void updateView(int i2, String str, ReadableMap readableMap) {
        if (this.mViewOperationsEnabled) {
            if (this.mViewManagers.get(str) == null) {
                throw new IllegalViewOperationException("Got unknown view type: " + str);
            }
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
            if (node == null) {
                throw new IllegalViewOperationException("Trying to update non-existent view with tag " + i2);
            }
            if (readableMap != null) {
                ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                node.updateProperties(reactStylesDiffMap);
                handleUpdateView(node, str, reactStylesDiffMap);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ac, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b0, code lost:
    
        throw r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void updateViewHierarchy() {
        /*
            r14 = this;
            java.lang.String r6 = "rootTag"
            java.lang.String r2 = "UIImplementation.updateViewHierarchy"
            r0 = 0
            com.facebook.systrace.Systrace.beginSection(r0, r2)
            r5 = 0
        Lb:
            com.facebook.react.uimanager.ShadowNodeRegistry r2 = r14.mShadowNodeRegistry     // Catch: java.lang.Throwable -> Lac
            int r2 = r2.getRootNodeCount()     // Catch: java.lang.Throwable -> Lac
            if (r5 >= r2) goto La8
            com.facebook.react.uimanager.ShadowNodeRegistry r2 = r14.mShadowNodeRegistry     // Catch: java.lang.Throwable -> Lac
            int r3 = r2.getRootTag(r5)     // Catch: java.lang.Throwable -> Lac
            com.facebook.react.uimanager.ShadowNodeRegistry r2 = r14.mShadowNodeRegistry     // Catch: java.lang.Throwable -> Lac
            com.facebook.react.uimanager.ReactShadowNode r4 = r2.getNode(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r2 = r4.getWidthMeasureSpec()     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L9a
            java.lang.Integer r2 = r4.getHeightMeasureSpec()     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L9a
            java.lang.String r2 = "UIImplementation.notifyOnBeforeLayoutRecursive"
            com.facebook.systrace.SystraceMessage$Builder r3 = com.facebook.systrace.SystraceMessage.beginSection(r0, r2)     // Catch: java.lang.Throwable -> Lac
            int r2 = r4.getReactTag()     // Catch: java.lang.Throwable -> Lac
            com.facebook.systrace.SystraceMessage$Builder r2 = r3.arg(r6, r2)     // Catch: java.lang.Throwable -> Lac
            r2.flush()     // Catch: java.lang.Throwable -> Lac
            r14.notifyOnBeforeLayoutRecursive(r4)     // Catch: java.lang.Throwable -> La3
            com.facebook.systrace.Systrace.endSection(r0)     // Catch: java.lang.Throwable -> Lac
            r14.calculateRootLayout(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "UIImplementation.applyUpdatesRecursive"
            com.facebook.systrace.SystraceMessage$Builder r3 = com.facebook.systrace.SystraceMessage.beginSection(r0, r2)     // Catch: java.lang.Throwable -> Lac
            int r2 = r4.getReactTag()     // Catch: java.lang.Throwable -> Lac
            com.facebook.systrace.SystraceMessage$Builder r2 = r3.arg(r6, r2)     // Catch: java.lang.Throwable -> Lac
            r2.flush()     // Catch: java.lang.Throwable -> Lac
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9e
            r3.<init>()     // Catch: java.lang.Throwable -> L9e
            r2 = 0
            r14.applyUpdatesRecursive(r4, r2, r2, r3)     // Catch: java.lang.Throwable -> L9e
            java.util.Iterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> L9e
        L63:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L9e
            com.facebook.react.uimanager.ReactShadowNode r2 = (com.facebook.react.uimanager.ReactShadowNode) r2     // Catch: java.lang.Throwable -> L9e
            com.facebook.react.uimanager.events.EventDispatcher r3 = r14.mEventDispatcher     // Catch: java.lang.Throwable -> L9e
            int r9 = r2.getReactTag()     // Catch: java.lang.Throwable -> L9e
            int r10 = r2.getScreenX()     // Catch: java.lang.Throwable -> L9e
            int r11 = r2.getScreenY()     // Catch: java.lang.Throwable -> L9e
            int r12 = r2.getScreenWidth()     // Catch: java.lang.Throwable -> L9e
            int r13 = r2.getScreenHeight()     // Catch: java.lang.Throwable -> L9e
            r8 = -1
            com.facebook.react.uimanager.OnLayoutEvent r2 = com.facebook.react.uimanager.OnLayoutEvent.obtain(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L9e
            r3.dispatchEvent(r2)     // Catch: java.lang.Throwable -> L9e
            goto L63
        L8e:
            com.facebook.systrace.Systrace.endSection(r0)     // Catch: java.lang.Throwable -> Lac
            com.facebook.react.uimanager.UIImplementation$LayoutUpdateListener r3 = r14.mLayoutUpdateListener     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto L9a
            com.facebook.react.uimanager.UIViewOperationQueue r2 = r14.mOperationsQueue     // Catch: java.lang.Throwable -> Lac
            r2.enqueueLayoutUpdateFinished(r4, r3)     // Catch: java.lang.Throwable -> Lac
        L9a:
            int r5 = r5 + 1
            goto Lb
        L9e:
            r2 = move-exception
            com.facebook.systrace.Systrace.endSection(r0)     // Catch: java.lang.Throwable -> Lac
            throw r2     // Catch: java.lang.Throwable -> Lac
        La3:
            r2 = move-exception
            com.facebook.systrace.Systrace.endSection(r0)     // Catch: java.lang.Throwable -> Lac
            throw r2     // Catch: java.lang.Throwable -> Lac
        La8:
            com.facebook.systrace.Systrace.endSection(r0)
            return
        Lac:
            r2 = move-exception
            com.facebook.systrace.Systrace.endSection(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIImplementation.updateViewHierarchy():void");
    }

    @Deprecated
    public void viewIsDescendantOf(int i2, int i3, Callback callback) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i2);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i3);
        if (node == null || node2 == null) {
            callback.invoke(false);
        } else {
            callback.invoke(Boolean.valueOf(node.isDescendantOf(node2)));
        }
    }
}
