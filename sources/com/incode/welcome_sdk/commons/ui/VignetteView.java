package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class VignetteView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5904b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5905e = 0;
    private int cornerRadius;
    private int padding;
    private Paint paint;
    private Paint paintClear;
    private RectF roundRect;

    public VignetteView(Context context) {
        super(context);
        init();
    }

    public VignetteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public VignetteView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }

    private void init() {
        int i2 = 2 % 2;
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(getResources().getColor(R.color.onboard_sdk_id_scan_vignette));
        this.paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.paintClear = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        int i3 = f5904b + 5;
        f5905e = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setParams(Rect rect, int i2) {
        int i3 = 2 % 2;
        int i4 = f5905e + 59;
        f5904b = i4 % 128;
        setParams(rect, i2, i4 % 2 == 0 ? 1 : 0);
        int i5 = f5904b + 99;
        f5905e = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setParams(Rect rect, int i2, int i3) {
        int i4 = 2 % 2;
        this.roundRect = new RectF(rect.left + i3, rect.top + i3, rect.right - i3, rect.bottom - i3);
        this.cornerRadius = i2;
        this.padding = i3;
        postInvalidate();
        int i5 = f5904b + 57;
        f5905e = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPaintColor(int i2) {
        int i3 = 2 % 2;
        int i4 = f5904b + 87;
        f5905e = i4 % 128;
        if (i4 % 2 == 0) {
            this.paint.setColor(i2);
            postInvalidate();
        } else {
            this.paint.setColor(i2);
            postInvalidate();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f5904b + 41;
        f5905e = i3 % 128;
        int i4 = i3 % 2;
        super.onDraw(canvas);
        if (this.roundRect != null) {
            canvas.drawPaint(this.paint);
            RectF rectF = this.roundRect;
            int i5 = this.cornerRadius;
            canvas.drawRoundRect(rectF, i5, i5, this.paintClear);
            int i6 = f5905e + 39;
            f5904b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public int getVignetteWidth() {
        int i2 = 2 % 2;
        int i3 = f5905e + 115;
        f5904b = i3 % 128;
        int i4 = (int) (i3 % 2 == 0 ? this.roundRect.right / this.roundRect.left : this.roundRect.right - this.roundRect.left);
        int i5 = f5904b + 117;
        f5905e = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public int getVignetteHeight() {
        int i2 = 2 % 2;
        int i3 = f5904b + 101;
        f5905e = i3 % 128;
        int i4 = i3 % 2;
        float f2 = this.roundRect.bottom;
        return (int) (i4 != 0 ? f2 * this.roundRect.top : f2 - this.roundRect.top);
    }

    public int getVignetteX() {
        int i2 = 2 % 2;
        int i3 = f5905e + 1;
        f5904b = i3 % 128;
        int i4 = i3 % 2;
        float f2 = this.roundRect.left;
        if (i4 != 0) {
            return (int) f2;
        }
        throw null;
    }

    public int getVignetteY() {
        int i2 = 2 % 2;
        int i3 = f5905e + 47;
        f5904b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (int) this.roundRect.top;
        int i6 = f5904b + 65;
        f5905e = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getPadding() {
        int i2 = 2 % 2;
        int i3 = f5905e;
        int i4 = i3 + 7;
        f5904b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.padding;
        int i7 = i3 + 51;
        f5904b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }
}
