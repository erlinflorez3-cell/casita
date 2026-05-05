package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
abstract class SheetDelegate {
    SheetDelegate() {
    }

    abstract int calculateInnerMargin(ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract float calculateSlideOffset(int i2);

    abstract int getCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract int getExpandedOffset();

    abstract int getHiddenOffset();

    abstract int getMaxViewPositionHorizontal();

    abstract int getMinViewPositionHorizontal();

    abstract <V extends View> int getOuterEdge(V v2);

    abstract int getParentInnerEdge(CoordinatorLayout coordinatorLayout);

    abstract int getSheetEdge();

    abstract boolean isExpandingOutwards(float f2);

    abstract boolean isReleasedCloseToInnerEdge(View view);

    abstract boolean isSwipeSignificant(float f2, float f3);

    abstract boolean shouldHide(View view, float f2);

    abstract void updateCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    abstract void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);
}
