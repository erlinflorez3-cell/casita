package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class DebugRectView extends View {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f5785s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f5786t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f5787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f5788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f5790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f5791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f5792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f5793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f5794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f5795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f5796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f5797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f5798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f5799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f5800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f5801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f5802p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f5803r;

    public DebugRectView(Context context) {
        super(context);
        b();
    }

    public DebugRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public DebugRectView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }

    private void b() {
        int i2 = 2 % 2;
        this.f5800n = "";
        this.f5799m = "";
        this.f5789c = "";
        this.f5796j = "";
        Paint paint = new Paint();
        this.f5790d = paint;
        paint.setColor(SupportMenu.CATEGORY_MASK);
        this.f5790d.setAlpha(128);
        this.f5790d.setStrokeWidth(8.0f);
        this.f5790d.setTextSize(48.0f);
        Paint paint2 = new Paint();
        this.f5787a = paint2;
        paint2.setColor(-16711936);
        this.f5787a.setAlpha(128);
        this.f5787a.setStrokeWidth(8.0f);
        this.f5787a.setTextSize(48.0f);
        int i3 = f5786t + 85;
        f5785s = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 82 / 0;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = f5786t + 21;
        f5785s = i7 % 128;
        if (i7 % 2 != 0) {
            super.onSizeChanged(i2, i3, i4, i5);
        } else {
            super.onSizeChanged(i2, i3, i4, i5);
            throw null;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f5785s + 109;
        f5786t = i3 % 128;
        int i4 = i3 % 2;
        canvas.drawText(this.f5800n, this.f5798l, this.f5801o, this.f5790d);
        canvas.drawText(this.f5799m, this.f5797k, this.f5802p, this.f5790d);
        float f2 = this.f5798l;
        float f3 = this.f5801o;
        canvas.drawLine(f2, f3, this.f5797k, f3, this.f5790d);
        float f4 = this.f5798l;
        float f5 = this.f5802p;
        canvas.drawLine(f4, f5, this.f5797k, f5, this.f5790d);
        float f6 = this.f5798l;
        canvas.drawLine(f6, this.f5801o, f6, this.f5802p, this.f5790d);
        float f7 = this.f5797k;
        canvas.drawLine(f7, this.f5801o, f7, this.f5802p, this.f5790d);
        canvas.drawText(this.f5789c, this.f5795i, this.f5793g, this.f5787a);
        canvas.drawText(this.f5796j, this.f5794h, this.f5792f, this.f5787a);
        float f8 = this.f5795i;
        float f9 = this.f5793g;
        canvas.drawLine(f8, f9, this.f5794h, f9, this.f5787a);
        float f10 = this.f5795i;
        float f11 = this.f5792f;
        canvas.drawLine(f10, f11, this.f5794h, f11, this.f5787a);
        float f12 = this.f5795i;
        canvas.drawLine(f12, this.f5793g, f12, this.f5792f, this.f5787a);
        float f13 = this.f5794h;
        canvas.drawLine(f13, this.f5793g, f13, this.f5792f, this.f5787a);
        int i5 = f5785s + 87;
        f5786t = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setSize(float f2, float f3) {
        int i2 = 2 % 2;
        if (!this.f5803r) {
            int i3 = f5785s + 17;
            f5786t = i3 % 128;
            int i4 = i3 % 2;
            Timber.d("new size: %d, %d", Float.valueOf(f2), Float.valueOf(f3));
            this.f5803r = true;
            this.f5791e = getWidth() / f2;
            this.f5788b = getHeight() / f3;
            int i5 = f5786t + 31;
            f5785s = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
