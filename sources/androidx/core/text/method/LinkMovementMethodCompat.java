package androidx.core.text.method;

import android.text.method.LinkMovementMethod;

/* JADX INFO: loaded from: classes4.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    private static LinkMovementMethodCompat sInstance = null;

    private LinkMovementMethodCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r1 <= r3.getLineRight(r2)) goto L18;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.widget.TextView r6, android.text.Spannable r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r1 >= r0) goto L57
            int r1 = r8.getAction()
            r0 = 1
            if (r1 == r0) goto Lf
            if (r1 != 0) goto L57
        Lf:
            float r0 = r8.getX()
            int r4 = (int) r0
            float r0 = r8.getY()
            int r1 = (int) r0
            int r0 = r6.getTotalPaddingLeft()
            int r4 = r4 - r0
            int r0 = r6.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r6.getScrollX()
            int r4 = r4 + r0
            int r0 = r6.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r3 = r6.getLayout()
            if (r1 < 0) goto L39
            int r0 = r3.getHeight()
            if (r1 <= r0) goto L41
        L39:
            android.text.Selection.removeSelection(r7)
            boolean r0 = android.text.method.Touch.onTouchEvent(r6, r7, r8)
            return r0
        L41:
            int r2 = r3.getLineForVertical(r1)
            float r1 = (float) r4
            float r0 = r3.getLineLeft(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L39
            float r0 = r3.getLineRight(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L57
            goto L39
        L57:
            boolean r0 = super.onTouchEvent(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.method.LinkMovementMethodCompat.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    public static LinkMovementMethodCompat getInstance() {
        if (sInstance == null) {
            sInstance = new LinkMovementMethodCompat();
        }
        return sInstance;
    }
}
