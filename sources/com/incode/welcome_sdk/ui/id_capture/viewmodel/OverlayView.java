package com.incode.welcome_sdk.ui.id_capture.viewmodel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OverlayView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16296a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16297c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f16298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f16299e;

    public /* synthetic */ OverlayView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setStrokeWidth(10.0f);
        this.f16299e = paint;
    }

    public final float[] getPoints() {
        float[] fArr;
        int i2 = 2 % 2;
        int i3 = f16297c;
        int i4 = i3 + 71;
        f16296a = i4 % 128;
        if (i4 % 2 != 0) {
            fArr = this.f16298d;
            int i5 = 11 / 0;
        } else {
            fArr = this.f16298d;
        }
        int i6 = i3 + 83;
        f16296a = i6 % 128;
        int i7 = i6 % 2;
        return fArr;
    }

    public final void setPoints(float[] fArr) {
        int i2 = 2 % 2;
        int i3 = f16296a + 111;
        f16297c = i3 % 128;
        int i4 = i3 % 2;
        this.f16298d = fArr;
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
    }

    public final void updatePoints(Point[] pointArr) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(pointArr, "");
        int length = pointArr.length << 1;
        float[] fArr = new float[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = f16296a + 21;
            int i6 = i5 % 128;
            f16297c = i6;
            int i7 = i5 % 2;
            if (i4 % 2 == 0) {
                int i8 = i6 + 43;
                f16296a = i8 % 128;
                i2 = (i8 % 2 != 0 ? pointArr[i4 >> 5] : pointArr[i4 / 2]).x;
            } else {
                i2 = pointArr[i4 / 2].y;
            }
            fArr[i4] = i2;
        }
        this.f16298d = fArr;
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f16296a + 3;
        f16297c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float[] fArr = this.f16298d;
        if (fArr != null) {
            canvas.drawPoints(fArr, this.f16299e);
            canvas.drawLine(fArr[0], fArr[1], fArr[2], fArr[3], this.f16299e);
            canvas.drawLine(fArr[2], fArr[3], fArr[4], fArr[5], this.f16299e);
            canvas.drawLine(fArr[4], fArr[5], fArr[6], fArr[7], this.f16299e);
            canvas.drawLine(fArr[6], fArr[7], fArr[0], fArr[1], this.f16299e);
            int i5 = f16296a + 73;
            f16297c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 0;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
