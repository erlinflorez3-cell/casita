package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.FillAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class FillDrawer extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6235b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6236c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f6237a;

    public FillDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
        Paint paint2 = new Paint();
        this.f6237a = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f6237a.setAntiAlias(true);
    }

    public final void c(Canvas canvas, Value value, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f6235b + 9;
        f6236c = i6 % 128;
        int i7 = i6 % 2;
        if (value instanceof FillAnimationValue) {
            FillAnimationValue fillAnimationValue = (FillAnimationValue) value;
            int iN = this.f6253d.n();
            float fIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
            int iJ = this.f6253d.j();
            int iQ = this.f6253d.q();
            int iX = this.f6253d.x();
            int iU = this.f6253d.u();
            if (this.f6253d.l()) {
                if (i2 == iX) {
                    iN = fillAnimationValue.c();
                    fIntValue = fillAnimationValue.b();
                    iJ = fillAnimationValue.e();
                } else if (i2 == iQ) {
                    iN = fillAnimationValue.d();
                    fIntValue = fillAnimationValue.a();
                    iJ = fillAnimationValue.i();
                    int i8 = f6235b + 61;
                    f6236c = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (i2 == iQ) {
                iN = fillAnimationValue.c();
                fIntValue = fillAnimationValue.b();
                iJ = fillAnimationValue.e();
            } else if (i2 == iU) {
                iN = fillAnimationValue.d();
                fIntValue = fillAnimationValue.a();
                iJ = fillAnimationValue.i();
            }
            this.f6237a.setColor(iN);
            this.f6237a.setStrokeWidth(this.f6253d.j());
            float f2 = i3;
            float f3 = i4;
            Object[] objArr = {this.f6253d};
            canvas.drawCircle(f2, f3, ((Integer) Indicator.d(1089547635, w.c(), w.c(), objArr, -1089547635, w.c(), w.c())).intValue(), this.f6237a);
            this.f6237a.setStrokeWidth(iJ);
            canvas.drawCircle(f2, f3, fIntValue, this.f6237a);
        }
    }
}
