package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
class h extends View {
    float B;
    private boolean C;
    int Code;
    private boolean D;
    private Paint F;
    int I;
    private final Context L;
    private RectF S;
    private V V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f3240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3241b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f3242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3243e;

    /* JADX INFO: renamed from: com.facetec.sdk.h$7, reason: invalid class name */
    final class AnonymousClass7 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ Runnable Z;

        AnonymousClass7(Runnable runnable) {
            this.Z = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(h.this.I, 0.0f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.h.7.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    super.onAnimationEnd(animator2);
                    if (AnonymousClass7.this.Z != null) {
                        AnonymousClass7.this.Z.run();
                    }
                }
            });
            valueAnimatorOfFloat.start();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.this.f3242d.setStrokeWidth(((Float) valueAnimator.getAnimatedValue()).floatValue());
            h.this.Z();
        }
    }

    enum V {
        DEFAULT,
        SMALL_FOR_OVERZOOMED
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = V.DEFAULT;
        this.D = false;
        this.C = false;
        this.L = context;
        post(new Runnable() { // from class: com.facetec.sdk.h.3
            @Override // java.lang.Runnable
            public final void run() {
                h.this.D();
            }
        });
    }

    static /* synthetic */ void B(h hVar, Runnable runnable) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(hVar.B, hVar.f3243e);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.h.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar2 = h.this;
                hVar2.S = h.I(hVar2, hVar2.B);
                h hVar3 = h.this;
                hVar3.Code = h.V(hVar3, hVar3.B);
                h.this.Z();
            }
        });
        valueAnimatorOfFloat.addListener(hVar.new AnonymousClass7(runnable));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.Code = Math.round(ce.V(ba.r()) * ba.V());
        this.I = Math.round(ce.V(ba.h()) * ba.V());
        V(ba.Z());
        post(new Runnable() { // from class: com.facetec.sdk.h.5
            @Override // java.lang.Runnable
            public final void run() {
                h.this.setLayerType(1, null);
                h.this.F = new Paint(1);
                h.this.F.setStyle(Paint.Style.FILL);
                h.this.F.setAlpha(0);
                h.this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                h.this.setLayerType(2, null);
                h.this.f3242d = new Paint(1);
                h.this.f3242d.setStyle(Paint.Style.STROKE);
                h.this.f3242d.setStrokeWidth(Math.round(h.this.I));
                h.this.f3242d.setColor(ba.Code(h.this.L));
            }
        });
    }

    private float F() {
        if (this.V != V.SMALL_FOR_OVERZOOMED) {
            return 1.0f;
        }
        return 1.0f / (((new Random().nextInt(Math.round(0.050000004f) + 1) / 100.0f) + 0.1f) + 1.0f);
    }

    static /* synthetic */ RectF I(h hVar, float f2) {
        int width = hVar.getWidth();
        int height = hVar.getHeight();
        float f3 = width;
        float f4 = height;
        float f5 = (f4 - ((f3 - (f2 * 2.0f)) * 0.632f)) / 2.0f;
        return new RectF(f2, f5, f3 - f2, f4 - f5);
    }

    private void I(V v2) {
        this.V = v2;
        D();
        V();
    }

    private void I(boolean z2) {
        if (!this.C || z2) {
            this.C = true;
            int width = getWidth();
            int height = getHeight();
            float f2 = width;
            float fZ = (f2 - (ba.Z() * 2.0f)) * F();
            float f3 = height;
            float f4 = (f3 - (0.632f * fZ)) / 2.0f;
            float f5 = (f2 - fZ) / 2.0f;
            V(f5);
            RectF rectF = new RectF();
            this.S = rectF;
            rectF.set(f5, f4, f2 - f5, f3 - f4);
            be.F = this.S.centerX();
            be.L = this.S.centerY();
        }
    }

    static /* synthetic */ int V(h hVar, float f2) {
        return Math.min(Math.round(((hVar.getWidth() - (f2 * 2.0f)) * 0.632f) / 2.0f), hVar.Code);
    }

    private void V(float f2) {
        this.f3241b = f2;
        this.f3240a = f2 / 1.5f;
        this.f3243e = getWidth() / 2.0f;
        this.B = this.f3241b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.D = true;
        postInvalidate();
    }

    public final void B() {
        I(V.DEFAULT);
    }

    public final void B(final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: com.facetec.sdk.h.1
            @Override // java.lang.Runnable
            public final void run() {
                h.B(h.this, new Runnable() { // from class: com.facetec.sdk.h.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        };
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.B, this.f3240a);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.h.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = h.this;
                hVar.S = h.I(hVar, hVar.B);
                h.this.Z();
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.h.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Runnable runnable3 = runnable2;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final RectF Code() {
        if (this.S == null) {
            I(false);
        }
        return this.S;
    }

    public final void I() {
        I(V.SMALL_FOR_OVERZOOMED);
    }

    public final void V() {
        this.f3242d.setStrokeWidth(Math.round(this.I));
        this.Code = Math.round(ce.V(ba.r()) * ba.V());
        this.B = this.f3241b;
        I(true);
        Z();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        canvas.drawColor(ba.Code(ba.Z(this.L), 255));
        if (!this.D || (rectF = this.S) == null || (paint = this.F) == null || this.f3242d == null) {
            return;
        }
        int i2 = this.Code;
        canvas.drawRoundRect(rectF, i2, i2, paint);
        RectF rectF2 = this.S;
        int i3 = this.Code;
        canvas.drawRoundRect(rectF2, i3, i3, this.f3242d);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        I(true);
        Z();
    }
}
