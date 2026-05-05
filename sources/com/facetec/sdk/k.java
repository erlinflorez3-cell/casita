package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class k extends View {
    private int B;
    private int Code;
    private boolean I;
    private ArrayList<V> V;

    class V {
        Z B;
        Paint Code;
        float Z = 0.0f;
        private int V = -1;
        ArrayList<Animator> I = new ArrayList<>();

        public V(k kVar, float f2, float f3) {
            this.B = new Z(f2, f3);
            kVar.setLayerType(2, null);
            Paint paint = new Paint(1);
            this.Code = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.Code.setStrokeWidth(this.Z);
            this.Code.setColor(this.V);
        }
    }

    static class Z {
        float Code;
        float I;
        float V = 0.0f;

        public Z(float f2, float f3) {
            this.Code = f2;
            this.I = f3;
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = false;
        post(new Runnable() { // from class: com.facetec.sdk.k.4
            @Override // java.lang.Runnable
            public final void run() {
                k.Code(k.this);
            }
        });
    }

    static /* synthetic */ void Code(k kVar) {
        kVar.V = new ArrayList<>();
        kVar.Code = Math.round(ce.V(50) * ba.V() * ba.Code());
        kVar.B = Math.round(ce.V(3) * ba.V() * ba.Code());
    }

    static /* synthetic */ void I(k kVar) {
        kVar.I = true;
        kVar.postInvalidate();
    }

    public final void Code(float f2, float f3, final Runnable runnable) {
        if (this.V.size() > 5) {
            return;
        }
        final V v2 = new V(this, f2, f3);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(v2.B.V, this.Code);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.k.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v2.B.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                V v3 = v2;
                v3.Z = Math.min(k.this.B, v2.B.V);
                if (v3.Code != null) {
                    v3.Code.setStrokeWidth(v3.Z);
                }
                v2.Code.setAlpha(Math.round((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                k.I(k.this);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.k.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                v2.Code.setAlpha(0);
                k.I(k.this);
                v2.I.remove(valueAnimatorOfFloat);
                k.this.V.remove(v2);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        valueAnimatorOfFloat.start();
        v2.I.add(valueAnimatorOfFloat);
        this.V.add(v2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        ArrayList<V> arrayList;
        if (!this.I || (arrayList = this.V) == null || arrayList.size() <= 0) {
            return;
        }
        for (V v2 : this.V) {
            Z z2 = v2.B;
            canvas.drawCircle(z2.Code, z2.I, z2.V, v2.Code);
        }
        this.I = false;
    }
}
