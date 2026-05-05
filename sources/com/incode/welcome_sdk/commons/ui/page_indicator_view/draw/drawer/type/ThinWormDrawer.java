package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.ThinWormAnimationValue;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class ThinWormDrawer extends WormDrawer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6248a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6249c = 0;

    public ThinWormDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.WormDrawer
    public final void a(Canvas canvas, Value value, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f6248a + 125;
        f6249c = i5 % 128;
        int i6 = i5 % 2;
        if (value instanceof ThinWormAnimationValue) {
            ThinWormAnimationValue thinWormAnimationValue = (ThinWormAnimationValue) value;
            int iA = thinWormAnimationValue.a();
            int iC = thinWormAnimationValue.c();
            int iD = thinWormAnimationValue.d() / 2;
            int iIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6253d}, -1089547635, w.c(), w.c())).intValue();
            int iN = this.f6253d.n();
            int iIntValue2 = ((Integer) Indicator.d(1903576326, w.c(), w.c(), new Object[]{this.f6253d}, -1903576323, w.c(), w.c())).intValue();
            if (this.f6253d.w() == Orientation.HORIZONTAL) {
                this.f6252b.left = iA;
                this.f6252b.right = iC;
                this.f6252b.top = i3 - iD;
                this.f6252b.bottom = iD + i3;
            } else {
                this.f6252b.left = i2 - iD;
                this.f6252b.right = iD + i2;
                this.f6252b.top = iA;
                this.f6252b.bottom = iC;
                int i7 = f6248a + 21;
                f6249c = i7 % 128;
                int i8 = i7 % 2;
            }
            this.f6254e.setColor(iN);
            float f2 = iIntValue;
            canvas.drawCircle(i2, i3, f2, this.f6254e);
            this.f6254e.setColor(iIntValue2);
            canvas.drawRoundRect(this.f6252b, f2, f2, this.f6254e);
        }
    }
}
