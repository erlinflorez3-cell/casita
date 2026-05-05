package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.common.logging.FLog;
import com.facebook.react.R;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import com.facebook.yoga.YogaDirection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class NativeViewHierarchyManager {
    private static final String TAG = "NativeViewHierarchyManager";
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final JSResponderHandler mJSResponderHandler;
    private volatile boolean mLayoutAnimationEnabled;
    private final LayoutAnimationController mLayoutAnimator;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final ViewManagerRegistry mViewManagers;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.NativeViewHierarchyManager$1 */
    class AnonymousClass1 implements LayoutAnimationListener {
        final /* synthetic */ Set val$pendingDeletionTags;
        final /* synthetic */ int val$tag;
        final /* synthetic */ ViewGroupManager val$viewManager;
        final /* synthetic */ View val$viewToDestroy;
        final /* synthetic */ ViewGroup val$viewToManage;

        AnonymousClass1(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i2) {
            viewGroupManager = viewGroupManager;
            viewGroup = viewGroup;
            view = view;
            set = set;
            i = i2;
        }

        @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener
        public void onAnimationEnd() {
            UiThreadUtil.assertOnUiThread();
            viewGroupManager.removeView(viewGroup, view);
            NativeViewHierarchyManager.this.dropView(view);
            set.remove(Integer.valueOf(view.getId()));
            if (set.isEmpty()) {
                NativeViewHierarchyManager.this.mPendingDeletionsForTag.remove(Integer.valueOf(i));
            }
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
        this(viewManagerRegistry, new RootViewManager());
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
        boolean z2 = ReactBuildConfig.DEBUG;
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new JSResponderHandler();
        this.mLayoutAnimator = new LayoutAnimationController();
        this.mBoundingBox = new RectF();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    private boolean arrayContains(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void computeBoundingBox(View view, int[] iArr) {
        this.mBoundingBox.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, this.mBoundingBox);
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        iArr[2] = Math.round(this.mBoundingBox.right - this.mBoundingBox.left);
        iArr[3] = Math.round(this.mBoundingBox.bottom - this.mBoundingBox.top);
    }

    private static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            sb.append("  children(" + viewGroupManager.getChildCount(viewGroup) + "): [\n");
            for (int i2 = 0; viewGroupManager.getChildAt(viewGroup, i2) != null; i2 += 16) {
                int i3 = 0;
                while (true) {
                    int i4 = i2 + i3;
                    if (viewGroupManager.getChildAt(viewGroup, i4) == null || i3 >= 16) {
                        break;
                    }
                    sb.append(viewGroupManager.getChildAt(viewGroup, i4).getId() + ",");
                    i3++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i5 = 0; i5 < iArr.length; i5 += 16) {
                int i6 = 0;
                while (true) {
                    int i7 = i5 + i6;
                    if (i7 >= iArr.length || i6 >= 16) {
                        break;
                    }
                    sb.append(iArr[i7] + ",");
                    i6++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (viewAtIndexArr != null) {
            sb.append("  viewsToAdd(" + viewAtIndexArr.length + "): [\n");
            for (int i8 = 0; i8 < viewAtIndexArr.length; i8 += 16) {
                int i9 = 0;
                while (true) {
                    int i10 = i8 + i9;
                    if (i10 >= viewAtIndexArr.length || i9 >= 16) {
                        break;
                    }
                    sb.append("[" + viewAtIndexArr[i10].mIndex + "," + viewAtIndexArr[i10].mTag + "],");
                    i9++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i11 = 0; i11 < iArr2.length; i11 += 16) {
                int i12 = 0;
                while (true) {
                    int i13 = i11 + i12;
                    if (i13 >= iArr2.length || i12 >= 16) {
                        break;
                    }
                    sb.append(iArr2[i13] + ",");
                    i12++;
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    private static String constructSetChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[readableArray.size()];
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            viewAtIndexArr[i2] = new ViewAtIndex(readableArray.getInt(i2), i2);
        }
        return constructManageChildrenErrorMessage(viewGroup, viewGroupManager, null, viewAtIndexArr, null);
    }

    private Set<Integer> getPendingDeletionsForTag(int i2) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i2))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i2), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i2));
    }

    private ThemedReactContext getReactContextForView(int i2) {
        View view = this.mTagsToViews.get(i2);
        if (view != null) {
            return (ThemedReactContext) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i2);
    }

    private void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    private void updateInstanceHandle(View view, long j2) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(R.id.view_tag_instance_handle, Long.valueOf(j2));
    }

    private void updateLayout(View view, int i2, int i3, int i4, int i5) {
        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
            this.mLayoutAnimator.applyLayoutUpdate(view, i2, i3, i4, i5);
        } else {
            view.layout(i2, i3, i4 + i2, i5 + i3);
        }
    }

    public synchronized void addRootView(int i2, View view) {
        addRootViewGroup(i2, view);
    }

    protected final synchronized void addRootViewGroup(int i2, View view) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "addRootViewGroup[%d]: %s", Integer.valueOf(i2), view != null ? view.toString() : "<null>");
        }
        if (view.getId() != -1) {
            FLog.e(TAG, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        this.mTagsToViews.put(i2, view);
        this.mTagsToViewManagers.put(i2, this.mRootViewManager);
        this.mRootTags.put(i2, true);
        view.setId(i2);
    }

    public synchronized void clearJSResponder() {
        this.mJSResponderHandler.clearJSResponder();
    }

    synchronized void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    synchronized void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mLayoutAnimator.initializeFromConfig(readableMap, callback);
    }

    public synchronized void createView(ThemedReactContext themedReactContext, int i2, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "createView[%d]: %s %s", Integer.valueOf(i2), str, reactStylesDiffMap != null ? reactStylesDiffMap.toString() : "<null>");
        }
        UiThreadUtil.assertOnUiThread();
        SystraceMessage.beginSection(0L, "NativeViewHierarchyManager_createView").arg("tag", i2).arg("className", str).flush();
        try {
            ViewManager viewManager = this.mViewManagers.get(str);
            this.mTagsToViews.put(i2, viewManager.createView(i2, themedReactContext, reactStylesDiffMap, null, this.mJSResponderHandler));
            this.mTagsToViewManagers.put(i2, viewManager);
        } finally {
            Systrace.endSection(0L);
        }
    }

    @Deprecated
    public synchronized void dispatchCommand(int i2, int i3, ReadableArray readableArray) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "dispatchCommand[%d]: %d %s", Integer.valueOf(i2), Integer.valueOf(i3), readableArray != null ? readableArray.toString() : "<null>");
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i2);
        if (view == null) {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i2 + "] and command " + i3);
        }
        resolveViewManager(i2).receiveCommand(view, i3, readableArray);
    }

    public synchronized void dispatchCommand(int i2, String str, ReadableArray readableArray) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "dispatchCommand[%d]: %s %s", Integer.valueOf(i2), str, readableArray != null ? readableArray.toString() : "<null>");
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i2);
        if (view == null) {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i2 + "] and command " + str);
        }
        resolveViewManager(i2).receiveCommand(view, str, readableArray);
    }

    protected synchronized void dropView(View view) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "dropView[%d]", Integer.valueOf(view != null ? view.getId() : -1));
        }
        UiThreadUtil.assertOnUiThread();
        if (view == null) {
            return;
        }
        if (this.mTagsToViewManagers.get(view.getId()) == null) {
            return;
        }
        if (!this.mRootTags.get(view.getId())) {
            resolveViewManager(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (childAt == null) {
                    FLog.e(TAG, "Unable to drop null child view");
                } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                    dropView(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.mTagsToViews.remove(view.getId());
        this.mTagsToViewManagers.remove(view.getId());
    }

    public synchronized int findTargetTagForTouch(int i2, float f2, float f3) {
        View view;
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(f3));
        }
        UiThreadUtil.assertOnUiThread();
        view = this.mTagsToViews.get(i2);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i2);
        }
        return TouchTargetHelper.findTargetTagForTouch(f2, f3, (ViewGroup) view);
    }

    public synchronized long getInstanceHandle(int i2) {
        Long l2;
        View view = this.mTagsToViews.get(i2);
        if (view == null) {
            throw new IllegalViewOperationException("Unable to find view for tag: " + i2);
        }
        l2 = (Long) view.getTag(R.id.view_tag_instance_handle);
        if (l2 == null) {
            throw new IllegalViewOperationException("Unable to find instanceHandle for tag: " + i2);
        }
        return l2.longValue();
    }

    public synchronized int getRootViewNum() {
        return this.mRootTags.size();
    }

    public synchronized void manageChildren(int i2, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "createView[%d]: %s %s %s", Integer.valueOf(i2), iArr != null ? iArr.toString() : "<null>", viewAtIndexArr != null ? viewAtIndexArr.toString() : "<null>", iArr2 != null ? iArr2.toString() : "<null>");
        }
        UiThreadUtil.assertOnUiThread();
        Set<Integer> pendingDeletionsForTag = getPendingDeletionsForTag(i2);
        ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i2);
        ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i2);
        if (viewGroup == null) {
            throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i2 + " which doesn't exist\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
        }
        int childCount = viewGroupManager.getChildCount(viewGroup);
        if (iArr != null) {
            int length = iArr.length - 1;
            while (length >= 0) {
                int i3 = iArr[length];
                if (i3 < 0) {
                    throw new IllegalViewOperationException("Trying to remove a negative view index:" + i3 + " view tag: " + i2 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                }
                if (viewGroupManager.getChildAt(viewGroup, i3) == null) {
                    if (!this.mRootTags.get(i2) || viewGroupManager.getChildCount(viewGroup) != 0) {
                        throw new IllegalViewOperationException("Trying to remove a view index above child count " + i3 + " view tag: " + i2 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                    return;
                } else {
                    if (i3 >= childCount) {
                        throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i3 + " view tag: " + i2 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                    View childAt = viewGroupManager.getChildAt(viewGroup, i3);
                    if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !arrayContains(iArr2, childAt.getId())) {
                        viewGroupManager.removeViewAt(viewGroup, i3);
                    }
                    length--;
                    childCount = i3;
                }
            }
        }
        if (iArr2 != null) {
            for (int i4 : iArr2) {
                View view = this.mTagsToViews.get(i4);
                if (view == null) {
                    throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + i4 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                }
                if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
                    pendingDeletionsForTag.add(Integer.valueOf(i4));
                    this.mLayoutAnimator.deleteView(view, new LayoutAnimationListener() { // from class: com.facebook.react.uimanager.NativeViewHierarchyManager.1
                        final /* synthetic */ Set val$pendingDeletionTags;
                        final /* synthetic */ int val$tag;
                        final /* synthetic */ ViewGroupManager val$viewManager;
                        final /* synthetic */ View val$viewToDestroy;
                        final /* synthetic */ ViewGroup val$viewToManage;

                        AnonymousClass1(ViewGroupManager viewGroupManager2, ViewGroup viewGroup2, View view2, Set pendingDeletionsForTag2, int i22) {
                            viewGroupManager = viewGroupManager2;
                            viewGroup = viewGroup2;
                            view = view2;
                            set = pendingDeletionsForTag2;
                            i = i22;
                        }

                        @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener
                        public void onAnimationEnd() {
                            UiThreadUtil.assertOnUiThread();
                            viewGroupManager.removeView(viewGroup, view);
                            NativeViewHierarchyManager.this.dropView(view);
                            set.remove(Integer.valueOf(view.getId()));
                            if (set.isEmpty()) {
                                NativeViewHierarchyManager.this.mPendingDeletionsForTag.remove(Integer.valueOf(i));
                            }
                        }
                    });
                } else {
                    dropView(view2);
                }
            }
        }
        if (viewAtIndexArr != null) {
            for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
                View view2 = this.mTagsToViews.get(viewAtIndex.mTag);
                if (view2 == null) {
                    throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag + "\n detail: " + constructManageChildrenErrorMessage(viewGroup2, viewGroupManager2, iArr, viewAtIndexArr, iArr2));
                }
                int i5 = viewAtIndex.mIndex;
                if (!pendingDeletionsForTag2.isEmpty()) {
                    i5 = 0;
                    int i6 = 0;
                    while (i5 < viewGroup2.getChildCount() && i6 != viewAtIndex.mIndex) {
                        if (!pendingDeletionsForTag2.contains(Integer.valueOf(viewGroup2.getChildAt(i5).getId()))) {
                            i6++;
                        }
                        i5++;
                    }
                }
                viewGroupManager2.addView(viewGroup2, view2, i5);
            }
        }
        if (pendingDeletionsForTag2.isEmpty()) {
            this.mPendingDeletionsForTag.remove(Integer.valueOf(i22));
        }
    }

    public synchronized void measure(int i2, int[] iArr) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "measure[%d]", Integer.valueOf(i2));
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i2);
        if (view == null) {
            throw new NoSuchNativeViewException("No native view for " + i2 + " currently exists");
        }
        View view2 = (View) RootViewUtil.getRootView(view);
        if (view2 == null) {
            throw new NoSuchNativeViewException("Native view " + i2 + " is no longer on screen");
        }
        computeBoundingBox(view2, iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        computeBoundingBox(view, iArr);
        iArr[0] = iArr[0] - i3;
        iArr[1] = iArr[1] - i4;
    }

    public synchronized void measureInWindow(int i2, int[] iArr) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "measureInWindow[%d]", Integer.valueOf(i2));
        }
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i2);
        if (view == null) {
            throw new NoSuchNativeViewException("No native view for " + i2 + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public synchronized void removeRootView(int i2) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "removeRootView[%d]", Integer.valueOf(i2));
        }
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(i2)) {
            SoftAssertions.assertUnreachable("View with tag " + i2 + " is not registered as a root view");
        }
        dropView(this.mTagsToViews.get(i2));
        this.mRootTags.delete(i2);
    }

    public final synchronized View resolveView(int i2) {
        View view;
        view = this.mTagsToViews.get(i2);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i2 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i2) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i2);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i2 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void sendAccessibilityEvent(int i2, int i3) {
        View view = this.mTagsToViews.get(i2);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i2);
        }
        view.sendAccessibilityEvent(i3);
    }

    public synchronized void setChildren(int i2, ReadableArray readableArray) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "setChildren[%d]: %s", Integer.valueOf(i2), readableArray != null ? readableArray.toString() : "<null>");
        }
        UiThreadUtil.assertOnUiThread();
        ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i2);
        ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i2);
        for (int i3 = 0; i3 < readableArray.size(); i3++) {
            View view = this.mTagsToViews.get(readableArray.getInt(i3));
            if (view == null) {
                throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i3) + "\n detail: " + constructSetChildrenErrorMessage(viewGroup, viewGroupManager, readableArray));
            }
            viewGroupManager.addView(viewGroup, view, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i2, int i3, boolean z2) {
        if (!z2) {
            this.mJSResponderHandler.setJSResponder(i3, null);
            return;
        }
        View view = this.mTagsToViews.get(i2);
        if (i3 != i2 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.setJSResponder(i3, (ViewParent) view);
            return;
        }
        if (this.mRootTags.get(i2)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i2 + " that is a root view");
        }
        this.mJSResponderHandler.setJSResponder(i3, view.getParent());
    }

    public void setLayoutAnimationEnabled(boolean z2) {
        this.mLayoutAnimationEnabled = z2;
    }

    public synchronized void updateInstanceHandle(int i2, long j2) {
        UiThreadUtil.assertOnUiThread();
        try {
            updateInstanceHandle(resolveView(i2), j2);
        } catch (IllegalViewOperationException e2) {
            FLog.e(TAG, "Unable to update properties for view tag " + i2, e2);
        }
    }

    @Deprecated
    public void updateLayout(int i2, int i3, int i4, int i5, int i6) {
        updateLayout(i2, i2, i3, i4, i5, i6, YogaDirection.INHERIT);
    }

    public synchronized void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, YogaDirection yogaDirection) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "updateLayout[%d]->[%d]: %d %d %d %d", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
        }
        UiThreadUtil.assertOnUiThread();
        SystraceMessage.beginSection(0L, "NativeViewHierarchyManager_updateLayout").arg("parentTag", i2).arg("tag", i3).flush();
        try {
            View viewResolveView = resolveView(i3);
            if (ReactNativeFeatureFlags.setAndroidLayoutDirection()) {
                viewResolveView.setLayoutDirection(LayoutDirectionUtil.toAndroidFromYoga(yogaDirection));
            }
            viewResolveView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            ViewParent parent = viewResolveView.getParent();
            if (parent instanceof RootView) {
                parent.requestLayout();
            }
            if (this.mRootTags.get(i2)) {
                updateLayout(viewResolveView, i4, i5, i6, i7);
            } else {
                NativeModule nativeModule = (ViewManager) this.mTagsToViewManagers.get(i2);
                if (!(nativeModule instanceof IViewManagerWithChildren)) {
                    throw new IllegalViewOperationException("Trying to use view with tag " + i2 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                }
                IViewManagerWithChildren iViewManagerWithChildren = (IViewManagerWithChildren) nativeModule;
                if (iViewManagerWithChildren != null && !iViewManagerWithChildren.needsCustomLayoutForChildren()) {
                    updateLayout(viewResolveView, i4, i5, i6, i7);
                }
            }
        } finally {
            Systrace.endSection(0L);
        }
    }

    public synchronized void updateProperties(int i2, ReactStylesDiffMap reactStylesDiffMap) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "updateProperties[%d]: %s", Integer.valueOf(i2), reactStylesDiffMap.toString());
        }
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager viewManagerResolveViewManager = resolveViewManager(i2);
            View viewResolveView = resolveView(i2);
            if (reactStylesDiffMap != null) {
                viewManagerResolveViewManager.updateProperties(viewResolveView, reactStylesDiffMap);
            }
        } catch (IllegalViewOperationException e2) {
            FLog.e(TAG, "Unable to update properties for view tag " + i2, e2);
        }
    }

    public synchronized void updateViewExtraData(int i2, Object obj) {
        if (this.DEBUG_MODE) {
            FLog.d(TAG, "updateViewExtraData[%d]: %s", Integer.valueOf(i2), obj.toString());
        }
        UiThreadUtil.assertOnUiThread();
        resolveViewManager(i2).updateExtraData(resolveView(i2), obj);
    }
}
