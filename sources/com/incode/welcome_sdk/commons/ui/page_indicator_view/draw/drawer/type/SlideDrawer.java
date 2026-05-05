package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.SlideAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class SlideDrawer extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6244b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6245c = 0;

    public SlideDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
    }

    public final void e(Canvas canvas, Value value, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f6245c + 17;
        f6244b = i5 % 128;
        if (i5 % 2 != 0) {
            if (value instanceof SlideAnimationValue) {
                int iB = ((SlideAnimationValue) value).b();
                int iN = this.f6253d.n();
                int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), new Object[]{this.f6253d}, -1903576323, w.c(), w.c())).intValue();
                int iIntValue2 = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
                this.f6254e.setColor(iN);
                float f2 = i2;
                float f3 = i3;
                float f4 = iIntValue2;
                canvas.drawCircle(f2, f3, f4, this.f6254e);
                this.f6254e.setColor(iIntValue);
                if (this.f6253d.w() == Orientation.HORIZONTAL) {
                    int i6 = f6245c + 45;
                    f6244b = i6 % 128;
                    if (i6 % 2 != 0) {
                        canvas.drawCircle(iB, f3, f4, this.f6254e);
                        return;
                    } else {
                        canvas.drawCircle(iB, f3, f4, this.f6254e);
                        throw null;
                    }
                }
                canvas.drawCircle(f2, iB, f4, this.f6254e);
                return;
            }
            return;
        }
        boolean z2 = value instanceof SlideAnimationValue;
        throw null;
    }
}
