package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.SwapAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class SwapDrawer extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6246a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6247b = 0;

    public SwapDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
    }

    public final void e(Canvas canvas, Value value, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        if (value instanceof SwapAnimationValue) {
            SwapAnimationValue swapAnimationValue = (SwapAnimationValue) value;
            int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), new Object[]{this.f6253d}, -1903576323, w.c(), w.c())).intValue();
            int iN = this.f6253d.n();
            int iIntValue2 = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
            int iQ = this.f6253d.q();
            int iX = this.f6253d.x();
            int iU = this.f6253d.u();
            int iD = swapAnimationValue.d();
            if (this.f6253d.l()) {
                if (i2 == iX) {
                    iD = swapAnimationValue.d();
                } else {
                    if (i2 == iQ) {
                        iD = swapAnimationValue.a();
                        int i6 = f6247b + 17;
                        f6246a = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    iIntValue = iN;
                }
            } else if (i2 == iU) {
                iD = swapAnimationValue.d();
            } else {
                if (i2 == iQ) {
                    int i8 = f6246a + 43;
                    f6247b = i8 % 128;
                    int i9 = i8 % 2;
                    iD = swapAnimationValue.a();
                }
                iIntValue = iN;
            }
            this.f6254e.setColor(iIntValue);
            if (this.f6253d.w() == Orientation.HORIZONTAL) {
                canvas.drawCircle(iD, i4, iIntValue2, this.f6254e);
            } else {
                canvas.drawCircle(i3, iD, iIntValue2, this.f6254e);
            }
        }
    }
}
