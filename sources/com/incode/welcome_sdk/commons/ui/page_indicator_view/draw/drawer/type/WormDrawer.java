package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.WormAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class WormDrawer extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6250a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6251c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f6252b;

    public WormDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
        this.f6252b = new RectF();
    }

    public void a(Canvas canvas, Value value, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f6251c;
        int i6 = i5 + 5;
        f6250a = i6 % 128;
        int i7 = i6 % 2;
        if (value instanceof WormAnimationValue) {
            WormAnimationValue wormAnimationValue = (WormAnimationValue) value;
            int iA = wormAnimationValue.a();
            int iC = wormAnimationValue.c();
            int iIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
            int iN = this.f6253d.n();
            int iIntValue2 = ((Integer) Indicator.d(1903576326, w.c(), w.c(), new Object[]{this.f6253d}, -1903576323, w.c(), w.c())).intValue();
            if (this.f6253d.w() == Orientation.HORIZONTAL) {
                this.f6252b.left = iA;
                this.f6252b.right = iC;
                this.f6252b.top = i3 - iIntValue;
                this.f6252b.bottom = i3 + iIntValue;
            } else {
                this.f6252b.left = i2 - iIntValue;
                this.f6252b.right = i2 + iIntValue;
                this.f6252b.top = iA;
                this.f6252b.bottom = iC;
            }
            this.f6254e.setColor(iN);
            float f2 = iIntValue;
            canvas.drawCircle(i2, i3, f2, this.f6254e);
            this.f6254e.setColor(iIntValue2);
            canvas.drawRoundRect(this.f6252b, f2, f2, this.f6254e);
            return;
        }
        int i8 = i5 + 95;
        f6250a = i8 % 128;
        int i9 = i8 % 2;
    }
}
