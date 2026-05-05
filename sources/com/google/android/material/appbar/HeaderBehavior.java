package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes8.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;

    private class FlingRunnable implements Runnable {
        private final V layout;
        private final CoordinatorLayout parent;

        FlingRunnable(CoordinatorLayout coordinatorLayout, V v2) {
            this.parent = coordinatorLayout;
            this.layout = v2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.layout == null || HeaderBehavior.this.scroller == null) {
                return;
            }
            if (!HeaderBehavior.this.scroller.computeScrollOffset()) {
                HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
            ViewCompat.postOnAnimation(this.layout, this);
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    boolean canDragView(V v2) {
        return false;
    }

    final boolean fling(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, float f2) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v2.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v2.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f2), 0, 0, i2, i3);
        if (!this.scroller.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v2);
            return false;
        }
        FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v2);
        this.flingRunnable = flingRunnable;
        ViewCompat.postOnAnimation(v2, flingRunnable);
        return true;
    }

    int getMaxDragOffset(V v2) {
        return -v2.getHeight();
    }

    int getScrollRangeForDragFling(V v2) {
        return v2.getHeight();
    }

    int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    void onFlingFinished(CoordinatorLayout coordinatorLayout, V v2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i2 = this.activePointerId;
            if (i2 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y2 - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x2 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            boolean z2 = canDragView(v2) && coordinatorLayout.isPointInChildBounds(v2, x2, y3);
            this.isBeingDragged = z2;
            if (z2) {
                this.lastMotionY = y3;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0025 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r15, V r16, android.view.MotionEvent r17) {
        /*
            r14 = this;
            r3 = r17
            int r4 = r3.getActionMasked()
            r5 = -1
            r2 = 1
            r1 = 0
            r7 = r16
            r6 = r15
            if (r4 == r2) goto L5f
            r0 = 2
            if (r4 == r0) goto L42
            r0 = 3
            if (r4 == r0) goto L91
            r0 = 6
            if (r4 == r0) goto L28
        L17:
            r4 = r1
        L18:
            android.view.VelocityTracker r0 = r14.velocityTracker
            if (r0 == 0) goto L1f
            r0.addMovement(r3)
        L1f:
            boolean r0 = r14.isBeingDragged
            if (r0 != 0) goto L25
            if (r4 == 0) goto L26
        L25:
            return r2
        L26:
            r2 = r1
            goto L25
        L28:
            int r0 = r3.getActionIndex()
            if (r0 != 0) goto L40
            r4 = r2
        L2f:
            int r0 = r3.getPointerId(r4)
            r14.activePointerId = r0
            float r4 = r3.getY(r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r0 = (int) r4
            r14.lastMotionY = r0
            goto L17
        L40:
            r4 = r1
            goto L2f
        L42:
            int r0 = r14.activePointerId
            int r0 = r3.findPointerIndex(r0)
            if (r0 != r5) goto L4b
            return r1
        L4b:
            float r0 = r3.getY(r0)
            int r0 = (int) r0
            int r8 = r14.lastMotionY
            int r8 = r8 - r0
            r14.lastMotionY = r0
            int r9 = r14.getMaxDragOffset(r7)
            r10 = 0
            r5 = r14
            r5.scroll(r6, r7, r8, r9, r10)
            goto L17
        L5f:
            android.view.VelocityTracker r0 = r14.velocityTracker
            if (r0 == 0) goto L91
            r0.addMovement(r3)
            android.view.VelocityTracker r4 = r14.velocityTracker
            r0 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r0)
            android.view.VelocityTracker r4 = r14.velocityTracker
            int r0 = r14.activePointerId
            float r13 = r4.getYVelocity(r0)
            int r0 = r14.getScrollRangeForDragFling(r7)
            int r11 = -r0
            r12 = 0
            r8 = r14
            r9 = r6
            r10 = r7
            r8.fling(r9, r10, r11, r12, r13)
            r4 = r2
        L82:
            r14.isBeingDragged = r1
            r14.activePointerId = r5
            android.view.VelocityTracker r0 = r14.velocityTracker
            if (r0 == 0) goto L18
            r0.recycle()
            r0 = 0
            r14.velocityTracker = r0
            goto L18
        L91:
            r4 = r1
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    final int scroll(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4) {
        return setHeaderTopBottomOffset(coordinatorLayout, v2, getTopBottomOffsetForScrollingSibling() - i2, i3, i4);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        return setHeaderTopBottomOffset(coordinatorLayout, v2, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4) {
        int iClamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i3 == 0 || topAndBottomOffset < i3 || topAndBottomOffset > i4 || topAndBottomOffset == (iClamp = MathUtils.clamp(i2, i3, i4))) {
            return 0;
        }
        setTopAndBottomOffset(iClamp);
        return topAndBottomOffset - iClamp;
    }
}
