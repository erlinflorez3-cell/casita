package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private int mActivePointerId;
    private Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    final View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation = new int[2];
    private Runnable mTriggerLongPress;

    public abstract ShowableListMenu getPopup();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public ForwardingListener(View view) {
        this.mSrc = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.mTapTimeout = tapTimeout;
        this.mLongPressTimeout = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = this.mForwarding;
        if (z3) {
            z2 = onTouchForwarded(motionEvent) || !onForwardingStopped();
        } else {
            z2 = onTouchObserved(motionEvent) && onForwardingStarted();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.mSrc.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.mForwarding = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.mForwarding = false;
        this.mActivePointerId = -1;
        Runnable runnable = this.mDisallowIntercept;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
    }

    protected boolean onForwardingStarted() {
        ShowableListMenu popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    protected boolean onForwardingStopped() {
        ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean onTouchObserved(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.View r4 = r6.mSrc
            boolean r0 = r4.isEnabled()
            r3 = 0
            if (r0 != 0) goto La
            return r3
        La:
            int r1 = r7.getActionMasked()
            if (r1 == 0) goto L41
            r5 = 1
            if (r1 == r5) goto L3d
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L3d
        L19:
            return r3
        L1a:
            int r0 = r6.mActivePointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 < 0) goto L19
            float r2 = r7.getX(r0)
            float r1 = r7.getY(r0)
            float r0 = r6.mScaledTouchSlop
            boolean r0 = pointInView(r4, r2, r1, r0)
            if (r0 != 0) goto L19
            r6.clearCallbacks()
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            return r5
        L3d:
            r6.clearCallbacks()
            goto L19
        L41:
            int r0 = r7.getPointerId(r3)
            r6.mActivePointerId = r0
            java.lang.Runnable r0 = r6.mDisallowIntercept
            if (r0 != 0) goto L52
            androidx.appcompat.widget.ForwardingListener$DisallowIntercept r0 = new androidx.appcompat.widget.ForwardingListener$DisallowIntercept
            r0.<init>()
            r6.mDisallowIntercept = r0
        L52:
            java.lang.Runnable r2 = r6.mDisallowIntercept
            int r0 = r6.mTapTimeout
            long r0 = (long) r0
            r4.postDelayed(r2, r0)
            java.lang.Runnable r0 = r6.mTriggerLongPress
            if (r0 != 0) goto L65
            androidx.appcompat.widget.ForwardingListener$TriggerLongPress r0 = new androidx.appcompat.widget.ForwardingListener$TriggerLongPress
            r0.<init>()
            r6.mTriggerLongPress = r0
        L65:
            java.lang.Runnable r2 = r6.mTriggerLongPress
            int r0 = r6.mLongPressTimeout
            long r0 = (long) r0
            r4.postDelayed(r2, r0)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ForwardingListener.onTouchObserved(android.view.MotionEvent):boolean");
    }

    private void clearCallbacks() {
        Runnable runnable = this.mTriggerLongPress;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.mDisallowIntercept;
        if (runnable2 != null) {
            this.mSrc.removeCallbacks(runnable2);
        }
    }

    void onLongPress() {
        clearCallbacks();
        View view = this.mSrc;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.mForwarding = true;
        }
    }

    private boolean onTouchForwarded(MotionEvent motionEvent) {
        DropDownListView dropDownListView;
        View view = this.mSrc;
        ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing() || (dropDownListView = (DropDownListView) popup.getListView()) == null || !dropDownListView.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        toGlobalMotionEvent(view, motionEventObtainNoHistory);
        toLocalMotionEvent(dropDownListView, motionEventObtainNoHistory);
        boolean zOnForwardedEvent = dropDownListView.onForwardedEvent(motionEventObtainNoHistory, this.mActivePointerId);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zOnForwardedEvent && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean pointInView(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.mTmpLocation);
        motionEvent.offsetLocation(-r3[0], -r3[1]);
        return true;
    }

    private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.mTmpLocation);
        motionEvent.offsetLocation(r3[0], r3[1]);
        return true;
    }

    private class DisallowIntercept implements Runnable {
        DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = ForwardingListener.this.mSrc.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class TriggerLongPress implements Runnable {
        TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForwardingListener.this.onLongPress();
        }
    }
}
