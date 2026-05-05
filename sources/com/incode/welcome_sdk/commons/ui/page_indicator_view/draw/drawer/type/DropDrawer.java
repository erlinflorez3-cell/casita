package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.DropAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class DropDrawer extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6233a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6234b = 0;

    public DropDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
    }

    public final void b(Canvas canvas, Value value, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f6234b + 21;
        int i6 = i5 % 128;
        f6233a = i6;
        int i7 = i5 % 2;
        if (value instanceof DropAnimationValue) {
            DropAnimationValue dropAnimationValue = (DropAnimationValue) value;
            int iN = this.f6253d.n();
            int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), new Object[]{this.f6253d}, -1903576323, w.c(), w.c())).intValue();
            float fIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
            this.f6254e.setColor(iN);
            canvas.drawCircle(i2, i3, fIntValue, this.f6254e);
            this.f6254e.setColor(iIntValue);
            if (this.f6253d.w() == Orientation.HORIZONTAL) {
                canvas.drawCircle(dropAnimationValue.d(), dropAnimationValue.b(), dropAnimationValue.e(), this.f6254e);
                return;
            } else {
                canvas.drawCircle(dropAnimationValue.b(), dropAnimationValue.d(), dropAnimationValue.e(), this.f6254e);
                return;
            }
        }
        int i8 = i6 + 51;
        f6234b = i8 % 128;
        int i9 = i8 % 2;
    }
}
