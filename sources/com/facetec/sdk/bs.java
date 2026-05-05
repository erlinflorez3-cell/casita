package com.facetec.sdk;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes3.dex */
class bs extends cg {
    private final Context C;
    private Drawable L;
    private final Matrix S;
    public Paint V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f3075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3079e;

    /* JADX INFO: renamed from: com.facetec.sdk.bs$1, reason: invalid class name */
    final class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener, Runnable {
        private /* synthetic */ int Code;
        private /* synthetic */ int V;

        AnonymousClass1(int i2, int i3) {
            this.Code = i2;
            this.V = i3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (bs.this.L == null) {
                return;
            }
            bs.this.L.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            bs.this.postInvalidateOnAnimation();
        }

        @Override // java.lang.Runnable
        public final void run() {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, this.Code);
            valueAnimatorOfInt.setDuration(this.V);
            valueAnimatorOfInt.addUpdateListener(this);
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bs$2, reason: invalid class name */
    final class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener, Runnable {
        AnonymousClass2() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (bs.this.V == null) {
                return;
            }
            bs.this.V.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            bs.this.postInvalidateOnAnimation();
        }

        @Override // java.lang.Runnable
        public final void run() {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(bs.this.V.getColor()), Integer.valueOf(ba.a(bs.this.C)));
            valueAnimatorOfObject.setDuration(1000L);
            valueAnimatorOfObject.addUpdateListener(this);
            valueAnimatorOfObject.start();
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(bs.this.B.getColor()), Integer.valueOf(ba.c(bs.this.C)));
            valueAnimatorOfObject2.setDuration(1000L);
            valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bs.2.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (bs.this.B == null) {
                        return;
                    }
                    bs.this.B.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    bs.this.postInvalidateOnAnimation();
                }
            });
            valueAnimatorOfObject2.start();
            ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
            final int iG = ba.G();
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bs.2.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (bs.this.L == null) {
                        return;
                    }
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    bs.this.L.setColorFilter(ba.I(iG, fFloatValue), PorterDuff.Mode.SRC_ATOP);
                    double d2 = fFloatValue;
                    if (d2 == 0.0d || d2 == 1.0d) {
                        if (d2 == 1.0d) {
                            ((GradientDrawable) bs.this.L).setColor(iG);
                        }
                        bs.this.L.setColorFilter(null);
                    }
                    bs.this.postInvalidateOnAnimation();
                }
            });
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bs$4, reason: invalid class name */
    final class AnonymousClass4 implements ValueAnimator.AnimatorUpdateListener, Runnable {
        AnonymousClass4() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (bs.this.S == null) {
                return;
            }
            bs.this.S.getValues(bs.this.f3075a);
            float f2 = bs.this.f3077c - bs.this.f3075a[2];
            bs.this.f3079e = -((valueAnimator.getAnimatedFraction() * bs.this.f3077c) - f2);
            bs.this.S.postTranslate(bs.this.f3079e, 0.0f);
            bs.this.postInvalidateOnAnimation();
        }

        @Override // java.lang.Runnable
        public final void run() {
            ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(bs.this.f3077c, 0.0f);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.setDuration(800L);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bs$5, reason: invalid class name */
    final class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener, Runnable {
        private /* synthetic */ int V = 1000;

        AnonymousClass5() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (bs.this.V == null) {
                return;
            }
            bs.this.V.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            bs.this.postInvalidateOnAnimation();
        }

        @Override // java.lang.Runnable
        public final void run() {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, ba.B(bs.this.C, FaceTecSDK.V.D.readyScreenOvalFillColor));
            valueAnimatorOfInt.setDuration(this.V);
            valueAnimatorOfInt.addUpdateListener(this);
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, ba.B(bs.this.C, FaceTecSDK.V.f2852c.strokeColor));
            valueAnimatorOfInt2.setDuration(this.V);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bs.5.5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (bs.this.B == null) {
                        return;
                    }
                    bs.this.B.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    bs.this.postInvalidateOnAnimation();
                }
            });
            valueAnimatorOfInt.start();
            valueAnimatorOfInt2.start();
        }
    }

    public bs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = new Matrix();
        this.f3075a = new float[9];
        this.f3077c = 0.0f;
        this.f3079e = 0.0f;
        this.f3076b = false;
        this.f3078d = -1;
        this.C = context;
        post(new Runnable() { // from class: com.facetec.sdk.bs.3
            @Override // java.lang.Runnable
            public final void run() {
                bs.B(bs.this);
            }
        });
    }

    static /* synthetic */ void B(bs bsVar) {
        bsVar.setLayerType(2, null);
        Paint paint = new Paint(1);
        bsVar.V = paint;
        paint.setStyle(Paint.Style.FILL);
        bsVar.V.setColor(ba.a(bsVar.C));
    }

    public final void B() {
        this.f3076b = true;
        postInvalidate();
    }

    public final void B(int i2, int i3, int i4) {
        postDelayed(new AnonymousClass1(i2, i3), i4);
    }

    public final void I() {
        this.f3076b = true;
        float fV = getResources().getDisplayMetrics().widthPixels * ba.V();
        this.f3077c = fV;
        this.S.setTranslate(fV, 0.0f);
        post(new AnonymousClass4());
    }

    public final void V() {
        postDelayed(new AnonymousClass2(), 0L);
    }

    public final void Z() {
        postDelayed(new AnonymousClass5(), 0L);
    }

    @Override // com.facetec.sdk.cg, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = this.L;
        if (drawable == null) {
            canvas.drawColor(ba.Code(ba.e(this.C), 255));
            return;
        }
        drawable.draw(canvas);
        if (!this.f3076b || this.Code == null || this.D == null || this.F == null || this.V == null || this.I == null || this.B == null) {
            return;
        }
        canvas.concat(this.S);
        canvas.drawOval(this.Code, this.I);
        canvas.drawOval(this.F, this.V);
        canvas.drawOval(this.D, this.B);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int width = getWidth();
        if (width != this.f3078d) {
            if (this.L == null) {
                Drawable drawableI = ba.i(this.C);
                this.L = drawableI;
                drawableI.setAlpha(255);
            }
            this.L.setBounds(0, 0, getWidth(), getHeight());
            if (this.f3078d != -1) {
                Z(true);
            }
            this.f3078d = width;
        }
    }
}
