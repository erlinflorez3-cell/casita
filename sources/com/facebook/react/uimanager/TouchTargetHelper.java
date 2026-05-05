package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.uimanager.common.ViewUtil;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class TouchTargetHelper {
    private static final float[] mEventCoords = new float[2];
    private static final PointF mTempPoint = new PointF();
    private static final float[] mMatrixTransformCoords = new float[2];
    private static final Matrix mInverseMatrix = new Matrix();

    private enum TouchTargetReturnType {
        SELF,
        CHILD
    }

    public static class ViewTarget {
        private final View mView;
        private final int mViewId;

        private ViewTarget(int i2, View view) {
            this.mViewId = i2;
            this.mView = view;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ViewTarget) && ((ViewTarget) obj).getViewId() == this.mViewId;
        }

        public View getView() {
            return this.mView;
        }

        public int getViewId() {
            return this.mViewId;
        }

        public int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.mViewId));
        }
    }

    private static View findClosestReactAncestor(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<ViewTarget> findTargetPathAndCoordinatesForTouch(float f2, float f3, ViewGroup viewGroup, float[] fArr) {
        UiThreadUtil.assertOnUiThread();
        fArr[0] = f2;
        fArr[1] = f3;
        List<ViewTarget> arrayList = new ArrayList<>();
        View viewFindTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(fArr, viewGroup, arrayList);
        if (viewFindTouchTargetViewWithPointerEvents != null) {
            int i2 = 0;
            while (viewFindTouchTargetViewWithPointerEvents != null && viewFindTouchTargetViewWithPointerEvents.getId() <= 0) {
                viewFindTouchTargetViewWithPointerEvents = (View) viewFindTouchTargetViewWithPointerEvents.getParent();
                i2++;
            }
            if (i2 > 0 && i2 <= arrayList.size()) {
                arrayList = arrayList.subList(i2, arrayList.size());
            }
            int touchTargetForView = getTouchTargetForView(viewFindTouchTargetViewWithPointerEvents, fArr[0], fArr[1]);
            if (touchTargetForView != viewFindTouchTargetViewWithPointerEvents.getId()) {
                arrayList.add(0, new ViewTarget(touchTargetForView, null));
            }
        }
        return arrayList;
    }

    public static int findTargetTagAndCoordinatesForTouch(float f2, float f3, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View viewFindClosestReactAncestor;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f2;
        fArr[1] = f3;
        View viewFindTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(fArr, viewGroup, null);
        if (viewFindTouchTargetViewWithPointerEvents == null || (viewFindClosestReactAncestor = findClosestReactAncestor(viewFindTouchTargetViewWithPointerEvents)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = viewFindClosestReactAncestor.getId();
        }
        return getTouchTargetForView(viewFindClosestReactAncestor, fArr[0], fArr[1]);
    }

    public static int findTargetTagForTouch(float f2, float f3, ViewGroup viewGroup) {
        return findTargetTagAndCoordinatesForTouch(f2, f3, viewGroup, mEventCoords, null);
    }

    public static int findTargetTagForTouch(float f2, float f3, ViewGroup viewGroup, int[] iArr) {
        return findTargetTagAndCoordinatesForTouch(f2, f3, viewGroup, mEventCoords, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View findTouchTargetView(float[] fArr, View view, EnumSet<TouchTargetReturnType> enumSet, List<ViewTarget> list) {
        if (enumSet.contains(TouchTargetReturnType.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!isTouchPointInView(fArr[0], fArr[1], view)) {
                if (view instanceof ReactOverflowViewWithInset) {
                    if (ViewUtil.getUIManagerType(view.getId()) == 2 && !isTouchPointInViewWithOverflowInset(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((ReactOverflowViewWithInset) view).getOverflow();
                    if (ViewProps.HIDDEN.equals(overflow) || ViewProps.SCROLL.equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            ReactZIndexedViewGroup reactZIndexedViewGroup = viewGroup instanceof ReactZIndexedViewGroup ? (ReactZIndexedViewGroup) viewGroup : null;
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = viewGroup.getChildAt(reactZIndexedViewGroup != null ? reactZIndexedViewGroup.getZIndexMappedChildIndex(i2) : i2);
                PointF pointF = mTempPoint;
                getChildPoint(fArr[0], fArr[1], viewGroup, childAt, pointF);
                float f2 = fArr[0];
                float f3 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View viewFindTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(fArr, childAt, list);
                if (viewFindTouchTargetViewWithPointerEvents != null) {
                    return viewFindTouchTargetViewWithPointerEvents;
                }
                fArr[0] = f2;
                fArr[1] = f3;
            }
        }
        if (enumSet.contains(TouchTargetReturnType.SELF) && isTouchPointInView(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View findTouchTargetViewWithPointerEvents(float[] fArr, View view, List<ViewTarget> list) {
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                pointerEvents = PointerEvents.BOX_NONE;
            } else if (pointerEvents == PointerEvents.BOX_ONLY) {
                pointerEvents = PointerEvents.NONE;
            }
        }
        if (pointerEvents == PointerEvents.NONE) {
            return null;
        }
        if (pointerEvents == PointerEvents.BOX_ONLY) {
            View viewFindTouchTargetView = findTouchTargetView(fArr, view, EnumSet.of(TouchTargetReturnType.SELF), list);
            if (viewFindTouchTargetView != null && list != null) {
                list.add(new ViewTarget(view.getId(), view));
            }
            return viewFindTouchTargetView;
        }
        if (pointerEvents == PointerEvents.BOX_NONE) {
            View viewFindTouchTargetView2 = findTouchTargetView(fArr, view, EnumSet.of(TouchTargetReturnType.CHILD), list);
            if (viewFindTouchTargetView2 != null) {
                if (list != null) {
                    list.add(new ViewTarget(view.getId(), view));
                }
                return viewFindTouchTargetView2;
            }
            if (!(view instanceof ReactCompoundView) || !isTouchPointInView(fArr[0], fArr[1], view) || ((ReactCompoundView) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                return null;
            }
            if (list != null) {
                list.add(new ViewTarget(view.getId(), view));
            }
            return view;
        }
        if (pointerEvents != PointerEvents.AUTO) {
            FLog.w(ReactConstants.TAG, "Unknown pointer event type: " + pointerEvents.toString());
        }
        if ((view instanceof ReactCompoundViewGroup) && isTouchPointInView(fArr[0], fArr[1], view) && ((ReactCompoundViewGroup) view).interceptsTouchEvent(fArr[0], fArr[1])) {
            if (list != null) {
                list.add(new ViewTarget(view.getId(), view));
            }
            return view;
        }
        View viewFindTouchTargetView3 = findTouchTargetView(fArr, view, EnumSet.of(TouchTargetReturnType.SELF, TouchTargetReturnType.CHILD), list);
        if (viewFindTouchTargetView3 != null && list != null) {
            list.add(new ViewTarget(view.getId(), view));
        }
        return viewFindTouchTargetView3;
    }

    private static void getChildPoint(float f2, float f3, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f2 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f3 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = mMatrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = mInverseMatrix;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        pointF.set(scrollX, scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int getTouchTargetForView(View view, float f2, float f3) {
        return view instanceof ReactCompoundView ? ((ReactCompoundView) view).reactTagForTouch(f2, f3) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isTouchPointInView(float f2, float f3, View view) {
        if (view instanceof ReactHitSlopView) {
            ReactHitSlopView reactHitSlopView = (ReactHitSlopView) view;
            if (reactHitSlopView.getHitSlopRect() != null) {
                Rect hitSlopRect = reactHitSlopView.getHitSlopRect();
                return f2 >= ((float) (-hitSlopRect.left)) && f2 < ((float) (view.getWidth() + hitSlopRect.right)) && f3 >= ((float) (-hitSlopRect.top)) && f3 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f2 >= 0.0f && f2 < ((float) view.getWidth()) && f3 >= 0.0f && f3 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isTouchPointInViewWithOverflowInset(float f2, float f3, View view) {
        if (!(view instanceof ReactOverflowViewWithInset)) {
            return false;
        }
        Rect overflowInset = ((ReactOverflowViewWithInset) view).getOverflowInset();
        return f2 >= ((float) overflowInset.left) && f2 < ((float) (view.getWidth() - overflowInset.right)) && f3 >= ((float) overflowInset.top) && f3 < ((float) (view.getHeight() - overflowInset.bottom));
    }
}
