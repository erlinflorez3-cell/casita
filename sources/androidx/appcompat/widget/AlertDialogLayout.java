package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (tryOnMeasure(i2, i3)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    private boolean tryOnMeasure(int i2, int i3) {
        int iCombineMeasuredStates;
        int iResolveMinimumHeight;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i2, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            iResolveMinimumHeight = resolveMinimumHeight(view2);
            measuredHeight = view2.getMeasuredHeight() - iResolveMinimumHeight;
            paddingTop += iResolveMinimumHeight;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iResolveMinimumHeight = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode != 0 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode) : 0);
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingTop;
        if (view2 != null) {
            int i6 = paddingTop - iResolveMinimumHeight;
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                iResolveMinimumHeight += iMin;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(iResolveMinimumHeight, 1073741824));
            paddingTop = i6 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i5, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i2, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i3, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        forceUniformWidth(childCount, i3);
        return true;
    }

    private void forceUniformWidth(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i5 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i3, 0);
                    layoutParams.height = i5;
                }
            }
        }
    }

    private static int resolveMinimumHeight(View view) {
        int minimumHeight = ViewCompat.getMinimumHeight(view);
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return resolveMinimumHeight(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            r16 = this;
            r1 = r16
            int r9 = r16.getPaddingLeft()
            int r20 = r20 - r18
            int r0 = r16.getPaddingRight()
            int r8 = r20 - r0
            int r20 = r20 - r9
            int r0 = r16.getPaddingRight()
            int r20 = r20 - r0
            int r5 = r16.getMeasuredHeight()
            int r2 = r16.getChildCount()
            int r4 = r16.getGravity()
            r0 = 112(0x70, float:1.57E-43)
            int r3 = (-1) - r4
            int r0 = (-1) - r0
            r3 = r3 | r0
            int r3 = (-1) - r3
            r0 = 8388615(0x800007, float:1.1754953E-38)
            int r7 = r4 + r0
            r4 = r4 | r0
            int r7 = r7 - r4
            r0 = 16
            if (r3 == r0) goto Lb8
            r0 = 80
            if (r3 == r0) goto Lae
            int r13 = r16.getPaddingTop()
        L3e:
            android.graphics.drawable.Drawable r0 = r16.getDividerDrawable()
            r3 = 0
            if (r0 != 0) goto La9
            r6 = r3
        L46:
            if (r3 >= r2) goto Lc5
            android.view.View r11 = r1.getChildAt(r3)
            if (r11 == 0) goto L95
            int r4 = r11.getVisibility()
            r0 = 8
            if (r4 == r0) goto L95
            int r14 = r11.getMeasuredWidth()
            int r15 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            int r5 = r4.gravity
            if (r5 >= 0) goto L69
            r5 = r7
        L69:
            int r0 = r16.getLayoutDirection()
            int r5 = androidx.core.view.GravityCompat.getAbsoluteGravity(r5, r0)
            r0 = 7
            int r5 = (-1) - r5
            int r0 = (-1) - r0
            r5 = r5 | r0
            int r5 = (-1) - r5
            r0 = 1
            if (r5 == r0) goto L98
            r0 = 5
            if (r5 == r0) goto La3
            int r12 = r4.leftMargin
            int r12 = r12 + r9
        L82:
            boolean r0 = r1.hasDividerBeforeChildAt(r3)
            if (r0 == 0) goto L89
            int r13 = r13 + r6
        L89:
            int r0 = r4.topMargin
            int r13 = r13 + r0
            r10 = r16
            r10.setChildFrame(r11, r12, r13, r14, r15)
            int r0 = r4.bottomMargin
            int r15 = r15 + r0
            int r13 = r13 + r15
        L95:
            int r3 = r3 + 1
            goto L46
        L98:
            int r0 = r20 - r14
            int r12 = r0 / 2
            int r12 = r12 + r9
            int r0 = r4.leftMargin
            int r12 = r12 + r0
            int r0 = r4.rightMargin
            goto La7
        La3:
            int r12 = r8 - r14
            int r0 = r4.rightMargin
        La7:
            int r12 = r12 - r0
            goto L82
        La9:
            int r6 = r0.getIntrinsicHeight()
            goto L46
        Lae:
            int r13 = r16.getPaddingTop()
            int r13 = r13 + r21
            int r13 = r13 - r19
            int r13 = r13 - r5
            goto L3e
        Lb8:
            int r13 = r16.getPaddingTop()
            int r21 = r21 - r19
            int r21 = r21 - r5
            int r0 = r21 / 2
            int r13 = r13 + r0
            goto L3e
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    private void setChildFrame(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }
}
