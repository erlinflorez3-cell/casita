package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.AttributeController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.MeasureController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;

/* JADX INFO: loaded from: classes5.dex */
public class DrawManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6142c = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f6143i = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Indicator f6146d = new Indicator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DrawController f6147e = new DrawController(this.f6146d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MeasureController f6144a = new MeasureController();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AttributeController f6145b = new AttributeController(this.f6146d);

    public final Indicator d() {
        int i2 = 2 % 2;
        int i3 = f6142c + 113;
        f6143i = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.f6146d == null) {
                this.f6146d = new Indicator();
            }
            Indicator indicator = this.f6146d;
            int i4 = f6143i + 29;
            f6142c = i4 % 128;
            int i5 = i4 % 2;
            return indicator;
        }
        throw null;
    }

    public void setClickListener(DrawController.ClickListener clickListener) {
        int i2 = 2 % 2;
        int i3 = f6142c + 103;
        f6143i = i3 % 128;
        int i4 = i3 % 2;
        this.f6147e.setClickListener(clickListener);
        int i5 = f6143i + 51;
        f6142c = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void a(MotionEvent motionEvent) {
        int i2 = 2 % 2;
        int i3 = f6143i + 49;
        f6142c = i3 % 128;
        int i4 = i3 % 2;
        this.f6147e.e(motionEvent);
        int i5 = f6142c + 103;
        f6143i = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void c(Value value) {
        int i2 = 2 % 2;
        int i3 = f6143i + 61;
        f6142c = i3 % 128;
        if (i3 % 2 != 0) {
            this.f6147e.e(value);
            int i4 = 0 / 0;
        } else {
            this.f6147e.e(value);
        }
        int i5 = f6142c + 5;
        f6143i = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void d(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f6143i + 27;
        f6142c = i3 % 128;
        int i4 = i3 % 2;
        this.f6147e.a(canvas);
        int i5 = f6143i + 35;
        f6142c = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<Integer, Integer> d(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f6142c + 29;
        f6143i = i5 % 128;
        int i6 = i5 % 2;
        Pair<Integer, Integer> pairB = MeasureController.b(this.f6146d, i2, i3);
        int i7 = f6142c + 87;
        f6143i = i7 % 128;
        int i8 = i7 % 2;
        return pairB;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        int i3 = f6143i + 107;
        f6142c = i3 % 128;
        if (i3 % 2 == 0) {
            this.f6145b.a(context, attributeSet);
        } else {
            this.f6145b.a(context, attributeSet);
            throw null;
        }
    }
}
