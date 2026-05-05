package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Process;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.ScaleAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class ScaleDrawer extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f6240a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6241b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f6242c = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f6243h = 1;

    public ScaleDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
    }

    public final void c(Canvas canvas, Value value, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        if (!(value instanceof ScaleAnimationValue)) {
            int i6 = f6243h + 117;
            f6241b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 99 / 0;
                return;
            }
            return;
        }
        ScaleAnimationValue scaleAnimationValue = (ScaleAnimationValue) value;
        float fIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
        int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), new Object[]{this.f6253d}, -1903576323, w.c(), w.c())).intValue();
        int iQ = this.f6253d.q();
        int iX = this.f6253d.x();
        int iU = this.f6253d.u();
        if (this.f6253d.l()) {
            if (i2 == iX) {
                fIntValue = scaleAnimationValue.a();
                iIntValue = scaleAnimationValue.c();
            } else if (i2 == iQ) {
                int i8 = f6241b + 15;
                f6243h = i8 % 128;
                if (i8 % 2 == 0) {
                    fIntValue = scaleAnimationValue.b();
                    iIntValue = scaleAnimationValue.d();
                    int i9 = 75 / 0;
                } else {
                    fIntValue = scaleAnimationValue.b();
                    iIntValue = scaleAnimationValue.d();
                }
            }
        } else if (i2 == iQ) {
            fIntValue = scaleAnimationValue.a();
            iIntValue = scaleAnimationValue.c();
        } else if (i2 == iU) {
            int i10 = f6241b + 5;
            f6243h = i10 % 128;
            int i11 = i10 % 2;
            fIntValue = scaleAnimationValue.b();
            iIntValue = scaleAnimationValue.d();
        }
        this.f6254e.setColor(iIntValue);
        canvas.drawCircle(i3, i4, fIntValue, this.f6254e);
    }

    public static int b() {
        int i2 = f6240a;
        int i3 = i2 % 7971175;
        f6240a = i2 + 1;
        if (i3 != 0) {
            return f6242c;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        f6242c = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
