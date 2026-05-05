package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.ScaleAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class ScaleDownDrawer extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6238a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6239b = 1;

    public ScaleDownDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
    }

    public final void e(Canvas canvas, Value value, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        if (value instanceof ScaleAnimationValue) {
            ScaleAnimationValue scaleAnimationValue = (ScaleAnimationValue) value;
            float fIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
            int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), new Object[]{this.f6253d}, -1903576323, w.c(), w.c())).intValue();
            int iQ = this.f6253d.q();
            int iX = this.f6253d.x();
            int iU = this.f6253d.u();
            if (this.f6253d.l()) {
                if (i2 == iX) {
                    int i6 = f6238a + 67;
                    f6239b = i6 % 128;
                    if (i6 % 2 == 0) {
                        fIntValue = scaleAnimationValue.a();
                        iIntValue = scaleAnimationValue.c();
                        int i7 = 66 / 0;
                    } else {
                        fIntValue = scaleAnimationValue.a();
                        iIntValue = scaleAnimationValue.c();
                    }
                } else if (i2 == iQ) {
                    fIntValue = scaleAnimationValue.b();
                    iIntValue = scaleAnimationValue.d();
                }
            } else if (i2 == iQ) {
                int i8 = f6238a + 15;
                f6239b = i8 % 128;
                int i9 = i8 % 2;
                fIntValue = scaleAnimationValue.a();
                iIntValue = scaleAnimationValue.c();
                int i10 = f6239b + 61;
                f6238a = i10 % 128;
                int i11 = i10 % 2;
            } else if (i2 == iU) {
                int i12 = f6239b + 91;
                f6238a = i12 % 128;
                int i13 = i12 % 2;
                fIntValue = scaleAnimationValue.b();
                iIntValue = scaleAnimationValue.d();
            }
            this.f6254e.setColor(iIntValue);
            canvas.drawCircle(i3, i4, fIntValue, this.f6254e);
        }
    }
}
