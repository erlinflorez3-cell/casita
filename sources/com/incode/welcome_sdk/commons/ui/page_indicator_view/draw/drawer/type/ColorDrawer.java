package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.ColorAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class ColorDrawer extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6231a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6232c = 1;

    public ColorDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
    }

    public final void a(Canvas canvas, Value value, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f6231a + 61;
        f6232c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 88 / 0;
            if (!(value instanceof ColorAnimationValue)) {
                return;
            }
        } else if (!(value instanceof ColorAnimationValue)) {
            return;
        }
        ColorAnimationValue colorAnimationValue = (ColorAnimationValue) value;
        float fIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
        int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), new Object[]{this.f6253d}, -1903576323, w.c(), w.c())).intValue();
        int iQ = this.f6253d.q();
        int iX = this.f6253d.x();
        int iU = this.f6253d.u();
        if (!(!this.f6253d.l())) {
            if (i2 == iX) {
                iIntValue = colorAnimationValue.c();
            } else if (i2 == iQ) {
                int i8 = f6232c + 35;
                f6231a = i8 % 128;
                int i9 = i8 % 2;
                iIntValue = colorAnimationValue.d();
            }
        } else if (i2 == iQ) {
            iIntValue = colorAnimationValue.c();
        } else if (i2 == iU) {
            int i10 = f6231a + 105;
            f6232c = i10 % 128;
            int i11 = i10 % 2;
            iIntValue = colorAnimationValue.d();
        }
        this.f6254e.setColor(iIntValue);
        canvas.drawCircle(i3, i4, fIntValue, this.f6254e);
    }
}
