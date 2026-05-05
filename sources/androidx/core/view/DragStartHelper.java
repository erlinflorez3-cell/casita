package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final OnDragStartListener mListener;
    private final View.OnLongClickListener mLongClickListener = new View.OnLongClickListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda0
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f$0.onLongClick(view);
        }
    };
    private final View.OnTouchListener mTouchListener = new View.OnTouchListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda1
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f$0.onTouch(view, motionEvent);
        }
    };
    private final View mView;

    public interface OnDragStartListener {
        boolean onDragStart(View view, DragStartHelper dragStartHelper);
    }

    public DragStartHelper(View view, OnDragStartListener onDragStartListener) {
        this.mView = view;
        this.mListener = onDragStartListener;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r5 = (int) r0
            float r0 = r8.getY()
            int r4 = (int) r0
            int r1 = r8.getAction()
            r3 = 0
            if (r1 == 0) goto L3f
            r2 = 1
            if (r1 == r2) goto L3c
            r0 = 2
            if (r1 == r0) goto L1b
            r0 = 3
            if (r1 == r0) goto L3c
        L1a:
            return r3
        L1b:
            r0 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = androidx.core.view.MotionEventCompat.isFromSource(r8, r0)
            if (r0 == 0) goto L1a
            int r1 = r8.getButtonState()
            int r0 = r1 + r2
            r1 = r1 | r2
            int r0 = r0 - r1
            if (r0 != 0) goto L2e
            goto L1a
        L2e:
            boolean r0 = r6.mDragging
            if (r0 == 0) goto L33
            goto L1a
        L33:
            int r0 = r6.mLastTouchX
            if (r0 != r5) goto L44
            int r0 = r6.mLastTouchY
            if (r0 != r4) goto L44
            goto L1a
        L3c:
            r6.mDragging = r3
            goto L1a
        L3f:
            r6.mLastTouchX = r5
            r6.mLastTouchY = r4
            goto L1a
        L44:
            r6.mLastTouchX = r5
            r6.mLastTouchY = r4
            androidx.core.view.DragStartHelper$OnDragStartListener r0 = r6.mListener
            boolean r0 = r0.onDragStart(r7, r6)
            r6.mDragging = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.DragStartHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean onLongClick(View view) {
        if (this.mDragging) {
            return true;
        }
        boolean zOnDragStart = this.mListener.onDragStart(view, this);
        this.mDragging = zOnDragStart;
        return zOnDragStart;
    }

    public void getTouchPosition(Point point) {
        point.set(this.mLastTouchX, this.mLastTouchY);
    }
}
