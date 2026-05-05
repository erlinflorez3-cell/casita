package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import com.dynatrace.android.callback.Callback;
import com.facetec.sdk.FaceTecSDK;

/* JADX INFO: loaded from: classes3.dex */
class bf extends AppCompatButton {
    int B;
    FaceTecSDK.Code C;
    Drawable Code;
    boolean D;
    int F;
    int I;
    int L;
    int S;
    int V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Typeface f2982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f2983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2984e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ValueAnimator f2985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ValueAnimator f2986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ValueAnimator f2987j;

    /* JADX INFO: renamed from: com.facetec.sdk.bf$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[V.values().length];
            Code = iArr;
            try {
                iArr[V.Guidance.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[V.IDScan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[V.OCRConfirmation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    enum V {
        Guidance,
        IDScan,
        OCRConfirmation
    }

    public bf(Context context) {
        super(context);
        this.S = 200;
        this.D = false;
        this.f2984e = false;
        this.f2981b = false;
        this.f2983d = V.Guidance;
        this.C = FaceTecSDK.Code.NORMAL;
    }

    public bf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = 200;
        this.D = false;
        this.f2984e = false;
        this.f2981b = false;
        this.f2983d = V.Guidance;
        this.C = FaceTecSDK.Code.NORMAL;
    }

    public bf(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.S = 200;
        this.D = false;
        this.f2984e = false;
        this.f2981b = false;
        this.f2983d = V.Guidance;
        this.C = FaceTecSDK.Code.NORMAL;
    }

    private void Z() {
        this.f2986i.cancel();
        this.f2987j.cancel();
        this.f2985h.cancel();
    }

    final void B(boolean z2) {
        int iCode;
        int iCode2;
        if (this.D) {
            Z();
        }
        this.D = true;
        Context context = getContext();
        final float fV = ba.V();
        int iCode3 = 0;
        int i2 = z2 ? this.S : 0;
        int i3 = this.B;
        int i4 = this.V;
        int i5 = this.I;
        int i6 = AnonymousClass10.Code[this.f2983d.ordinal()];
        if (i6 == 1) {
            iCode = ba.Code(context, ba.Q());
            if (!isEnabled()) {
                iCode3 = ba.Code(context, ba.K());
                iCode2 = ba.Code(context, ba.M());
            } else if (this.f2984e) {
                iCode3 = ba.Code(context, ba.N());
                iCode2 = ba.Code(context, ba.J());
            } else {
                iCode3 = ba.Code(context, ba.O());
                iCode2 = ba.Code(context, ba.A());
            }
        } else if (i6 == 2) {
            iCode = ba.Code(context, ba.aa());
            if (!isEnabled()) {
                iCode3 = ba.Code(context, ba.Y());
                iCode2 = ba.Code(context, ba.U());
            } else if (this.f2984e) {
                iCode3 = ba.Code(context, ba.W());
                iCode2 = ba.Code(context, ba.R());
            } else {
                iCode3 = ba.Code(context, ba.P());
                iCode2 = ba.Code(context, ba.T());
            }
        } else if (i6 != 3) {
            iCode = 0;
            iCode2 = 0;
        } else {
            iCode = ba.Code(context, ba.af());
            if (!isEnabled()) {
                iCode3 = ba.Code(context, ba.ag());
                iCode2 = ba.Code(context, ba.ad());
            } else if (this.f2984e) {
                iCode3 = ba.Code(context, ba.ae());
                iCode2 = ba.Code(context, ba.ab());
            } else {
                iCode3 = ba.Code(context, ba.ac());
                iCode2 = ba.Code(context, ba.X());
            }
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i3), Integer.valueOf(iCode3));
        this.f2986i = valueAnimatorOfObject;
        long j2 = i2;
        valueAnimatorOfObject.setDuration(j2);
        this.f2986i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bf.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bf.this.B = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ba.V(bf.this.Code, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f2986i.start();
        ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i4), Integer.valueOf(iCode));
        this.f2987j = valueAnimatorOfObject2;
        valueAnimatorOfObject2.setDuration(j2);
        this.f2987j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bf.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bf.this.V = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ba.V(bf.this.Code, ((Integer) valueAnimator.getAnimatedValue()).intValue(), Math.round(ce.V(bf.this.F) * fV), ce.V(bf.this.L) * fV);
                bf bfVar = bf.this;
                bfVar.setBackground(bfVar.Code);
                bf.this.postInvalidate();
            }
        });
        this.f2987j.start();
        ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i5), Integer.valueOf(iCode2));
        this.f2985h = valueAnimatorOfObject3;
        valueAnimatorOfObject3.setDuration(j2);
        this.f2985h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.bf.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bf.this.I = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bf.this.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f2985h.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.bf.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                bf.this.D = false;
            }
        });
        this.f2985h.start();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        B(false);
    }

    public void setEnabled(boolean z2, boolean z3) {
        if (isEnabled() == z2) {
            if (this.D) {
                return;
            }
            B(false);
        } else {
            super.setEnabled(z2);
            this.S = 200;
            B(z3);
        }
    }

    public void setHighlighted(boolean z2) {
        setHighlighted(z2, false);
    }

    public void setHighlighted(boolean z2, boolean z3) {
        if (this.f2984e == z2 || !isEnabled()) {
            return;
        }
        this.f2984e = z2;
        B(z3);
    }

    public void setOnClickListenerRunnable(final Runnable runnable) {
        setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.bf.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    bf.this.setHighlighted(false, true);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
    }

    public void setupButton() {
        if (this.f2981b) {
            return;
        }
        this.f2981b = true;
        Context context = getContext();
        this.Code = ContextCompat.getDrawable(context, R.drawable.facetec_button_background);
        int i2 = AnonymousClass10.Code[this.f2983d.ordinal()];
        if (i2 == 1) {
            this.B = ba.Code(context, isEnabled() ? ba.O() : ba.K());
            this.I = ba.Code(context, isEnabled() ? ba.A() : ba.M());
            this.V = ba.Code(context, ba.Q());
            this.F = ba.a();
            this.L = ba.s();
            this.f2980a = ba.f2967g;
            this.f2982c = FaceTecSDK.V.D.buttonFont;
        } else if (i2 == 2) {
            this.B = ba.Code(context, isEnabled() ? ba.P() : ba.Y());
            this.I = ba.Code(context, isEnabled() ? ba.T() : ba.U());
            this.V = ba.Code(context, ba.aa());
            this.F = ba.e();
            this.L = ba.p();
            this.f2980a = ba.f2967g;
            this.f2982c = FaceTecSDK.V.Code.buttonFont;
        } else if (i2 == 3) {
            this.B = ba.Code(context, isEnabled() ? ba.ac() : ba.ag());
            this.I = ba.Code(context, isEnabled() ? ba.X() : ba.ad());
            this.V = ba.Code(context, ba.af());
            this.F = ba.d();
            this.L = ba.t();
            this.f2980a = ba.f2967g;
            this.f2982c = FaceTecSDK.V.V.buttonFont;
        }
        setTextSize(2, this.f2980a * ba.Code() * ba.V());
        setTypeface(this.f2982c);
        setMaxLines(1);
        B(false);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.bf.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!bf.this.isEnabled()) {
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    bf.this.setHighlighted(true, false);
                } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > bf.this.getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() > bf.this.getHeight()) {
                    bf.this.setHighlighted(false, true);
                } else if (motionEvent.getAction() == 1) {
                    bf.this.performClick();
                }
                return true;
            }
        });
    }

    public void setupButtonForIdentityCheck() {
        this.f2983d = V.IDScan;
        this.f2981b = false;
        setupButton();
    }

    public void setupButtonForOCRConfirmation() {
        this.f2983d = V.OCRConfirmation;
        this.f2981b = false;
        setupButton();
    }
}
