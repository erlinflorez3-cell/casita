package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;

/* JADX INFO: loaded from: classes5.dex */
public class SignatureView extends View {

    /* JADX INFO: renamed from: l */
    private static int f5889l = 1;

    /* JADX INFO: renamed from: n */
    private static int f5890n = 0;

    /* JADX INFO: renamed from: a */
    private int f5891a;

    /* JADX INFO: renamed from: b */
    private Path f5892b;

    /* JADX INFO: renamed from: c */
    private final int f5893c;

    /* JADX INFO: renamed from: d */
    private int f5894d;

    /* JADX INFO: renamed from: e */
    private int f5895e;

    /* JADX INFO: renamed from: f */
    private Bitmap f5896f;

    /* JADX INFO: renamed from: g */
    private OnSignatureUpdatedListener f5897g;

    /* JADX INFO: renamed from: h */
    private Paint f5898h;

    /* JADX INFO: renamed from: i */
    private Canvas f5899i;

    /* JADX INFO: renamed from: j */
    private Paint f5900j;

    /* JADX INFO: renamed from: k */
    private boolean f5901k;

    /* JADX INFO: renamed from: m */
    private float f5902m;

    /* JADX INFO: renamed from: o */
    private float f5903o;

    public interface OnSignatureUpdatedListener {
        void b(boolean z2);

        void e();
    }

    public SignatureView(Context context) {
        super(context);
        this.f5893c = ViewCompat.MEASURED_STATE_MASK;
        this.f5901k = true;
        e(context);
    }

    public SignatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5893c = ViewCompat.MEASURED_STATE_MASK;
        this.f5901k = true;
        e(context);
    }

    public SignatureView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f5893c = ViewCompat.MEASURED_STATE_MASK;
        this.f5901k = true;
        e(context);
    }

    private void e(Context context) {
        int i2 = 2 % 2;
        this.f5891a = (int) (context.getResources().getDisplayMetrics().density * 14.0f);
        Paint paint = new Paint();
        this.f5898h = paint;
        paint.setAntiAlias(true);
        this.f5898h.setDither(true);
        this.f5898h.setColor(ContextCompat.getColor(context, R.color.onboard_sdk_SignatureInk));
        this.f5898h.setStyle(Paint.Style.STROKE);
        this.f5898h.setStrokeJoin(Paint.Join.ROUND);
        this.f5898h.setStrokeCap(Paint.Cap.ROUND);
        this.f5898h.setStrokeWidth(12.0f);
        this.f5892b = new Path();
        this.f5900j = new Paint(4);
        int i3 = f5889l + 25;
        f5890n = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.ui.SignatureView.f5889l
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.SignatureView.f5890n = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L35
            r3.b()
            r3.invalidate()
            com.incode.welcome_sdk.commons.ui.SignatureView$OnSignatureUpdatedListener r1 = r3.f5897g
            r0 = 93
            int r0 = r0 / 0
            if (r1 == 0) goto L2b
        L1c:
            int r0 = com.incode.welcome_sdk.commons.ui.SignatureView.f5890n
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.SignatureView.f5889l = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.commons.ui.SignatureView$OnSignatureUpdatedListener r1 = r3.f5897g
            r0 = 1
            r1.b(r0)
        L2b:
            int r0 = com.incode.welcome_sdk.commons.ui.SignatureView.f5890n
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.SignatureView.f5889l = r0
            int r1 = r1 % r2
            return
        L35:
            r3.b()
            r3.invalidate()
            com.incode.welcome_sdk.commons.ui.SignatureView$OnSignatureUpdatedListener r0 = r3.f5897g
            if (r0 == 0) goto L2b
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.SignatureView.d():void");
    }

    public void setDrawingEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f5889l + 81;
        f5890n = i3 % 128;
        if (i3 % 2 != 0) {
            this.f5901k = z2;
            int i4 = 93 / 0;
        } else {
            this.f5901k = z2;
        }
    }

    private void b() {
        int i2 = 2 % 2;
        this.f5896f = Bitmap.createBitmap(this.f5894d, this.f5895e, Bitmap.Config.ARGB_8888);
        this.f5899i = new Canvas(this.f5896f);
        int i3 = f5889l + 49;
        f5890n = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Bitmap a() {
        int i2 = 2 % 2;
        int i3 = f5889l + 83;
        f5890n = i3 % 128;
        int i4 = i3 % 2;
        Bitmap newColorBitmap = BitmapUtils.getNewColorBitmap(this.f5896f, ViewCompat.MEASURED_STATE_MASK);
        int i5 = f5890n + 31;
        f5889l = i5 % 128;
        int i6 = i5 % 2;
        return newColorBitmap;
    }

    public void setOnSignatureUpdatedListener(OnSignatureUpdatedListener onSignatureUpdatedListener) {
        int i2 = 2 % 2;
        int i3 = f5889l;
        int i4 = i3 + 1;
        f5890n = i4 % 128;
        int i5 = i4 % 2;
        this.f5897g = onSignatureUpdatedListener;
        int i6 = i3 + 9;
        f5890n = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = f5889l + 5;
        f5890n = i7 % 128;
        int i8 = i7 % 2;
        super.onSizeChanged(i2, i3, i4, i5);
        this.f5894d = i2;
        this.f5895e = i3;
        b();
        int i9 = f5889l + 23;
        f5890n = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f5890n + 1;
        f5889l = i3 % 128;
        int i4 = i3 % 2;
        super.onDraw(canvas);
        if (!this.f5896f.isRecycled()) {
            int i5 = f5890n + 33;
            f5889l = i5 % 128;
            if (i5 % 2 == 0) {
                canvas.drawBitmap(this.f5896f, 2.0f, 1.0f, this.f5900j);
            } else {
                canvas.drawBitmap(this.f5896f, 0.0f, 0.0f, this.f5900j);
            }
        }
        canvas.drawPath(this.f5892b, this.f5898h);
    }

    private void d(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = f5890n + 59;
        f5889l = i3 % 128;
        int i4 = i3 % 2;
        float f4 = f2 - this.f5891a;
        this.f5892b.reset();
        this.f5892b.moveTo(f4, f3);
        this.f5902m = f4;
        this.f5903o = f3;
        int i5 = f5890n + 105;
        f5889l = i5 % 128;
        int i6 = i5 % 2;
    }

    private void b(float f2, float f3) {
        int i2 = 2 % 2;
        float f4 = f2 - this.f5891a;
        float fAbs = Math.abs(f4 - this.f5902m);
        float fAbs2 = Math.abs(f3 - this.f5903o);
        if (fAbs < 4.0f) {
            int i3 = f5889l + 111;
            f5890n = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 98 / 0;
                if (fAbs2 < 4.0f) {
                    return;
                }
            } else if (fAbs2 < 4.0f) {
                return;
            }
        }
        Path path = this.f5892b;
        float f5 = this.f5902m;
        float f6 = this.f5903o;
        path.quadTo(f5, f6, (f4 + f5) / 2.0f, (f3 + f6) / 2.0f);
        this.f5902m = f4;
        this.f5903o = f3;
        int i5 = f5890n + 15;
        f5889l = i5 % 128;
        int i6 = i5 % 2;
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = f5889l + 41;
        f5890n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f5892b.lineTo(this.f5902m, this.f5903o);
            this.f5899i.drawPath(this.f5892b, this.f5898h);
            this.f5892b.reset();
            int i4 = f5889l + 73;
            f5890n = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f5892b.lineTo(this.f5902m, this.f5903o);
        this.f5899i.drawPath(this.f5892b, this.f5898h);
        this.f5892b.reset();
        throw null;
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = f5890n + 51;
        f5889l = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        OnSignatureUpdatedListener onSignatureUpdatedListener = this.f5897g;
        if (onSignatureUpdatedListener != null) {
            onSignatureUpdatedListener.e();
            int i4 = f5889l + 61;
            f5890n = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void f() {
        int i2 = 2 % 2;
        OnSignatureUpdatedListener onSignatureUpdatedListener = this.f5897g;
        if (onSignatureUpdatedListener != null) {
            onSignatureUpdatedListener.b(false);
            int i3 = f5890n + 83;
            f5889l = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = f5889l + 27;
        f5890n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2 = 2 % 2;
        if (!this.f5901k) {
            int i3 = f5889l + 15;
            f5890n = i3 % 128;
            return i3 % 2 != 0;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            d(x2, y2);
            invalidate();
            c();
        } else if (action == 1) {
            e();
            invalidate();
            f();
        } else if (action == 2) {
            b(x2, y2);
            invalidate();
            int i4 = f5890n + 55;
            f5889l = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f5890n + 103;
        f5889l = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
