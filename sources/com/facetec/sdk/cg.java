package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
class cg extends View {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f3085i = (int) ce.V(10);
    protected Paint B;
    private Paint C;
    protected RectF Code;
    protected RectF D;
    protected RectF F;
    protected Paint I;
    private RectF L;
    private boolean S;
    private final Context V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnimatorSet f3086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f3087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f3088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AnimatorSet f3089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AnimatorSet f3090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private V f3091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f3092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AnimatorSet f3093h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f3094j;

    /* JADX INFO: renamed from: com.facetec.sdk.cg$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] B;

        static {
            int[] iArr = new int[FaceTecExitAnimationStyle.values().length];
            B = iArr;
            try {
                iArr[FaceTecExitAnimationStyle.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                B[FaceTecExitAnimationStyle.RIPPLE_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                B[FaceTecExitAnimationStyle.RIPPLE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                B[FaceTecExitAnimationStyle.CIRCLE_FADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class V implements ValueAnimator.AnimatorUpdateListener {
        private final int B;
        private final TimeInterpolator D;
        private final int F;
        private final Paint I;
        private final Paint Z;
        private AnimatorSet Code = null;
        private RectF V = null;
        private float S = 0.0f;
        private float L = 0.0f;
        private final ValueAnimator.AnimatorUpdateListener C = this;

        V() {
            int iCode = ba.Code(cg.this.V, FaceTecSDK.V.f2852c.progressColor1);
            int iCode2 = ba.Code(cg.this.V, FaceTecSDK.V.f2852c.progressColor2);
            this.I = B(iCode);
            this.Z = B(iCode2);
            this.B = ba.B(cg.this.V, FaceTecSDK.V.f2852c.progressColor1);
            this.F = ba.B(cg.this.V, FaceTecSDK.V.f2852c.progressColor2);
            this.D = new AccelerateDecelerateInterpolator();
        }

        private ObjectAnimator B(Paint paint, int i2) {
            paint.setAlpha(Math.max(0, i2 - 50));
            double d2 = i2;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(paint, "alpha", (int) (0.8d * d2), (int) (d2 * 0.24d));
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfInt.setStartDelay(cg.this.S ? 600L : 400L);
            return objectAnimatorOfInt;
        }

        private Paint B(int i2) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(cg.this.f3087b);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(i2);
            return paint;
        }

        private boolean B() {
            AnimatorSet animatorSet = this.Code;
            return animatorSet != null && animatorSet.isStarted();
        }

        final void B(Canvas canvas) {
            if (this.Code != null) {
                float f2 = this.S;
                float f3 = -(f2 - this.L);
                canvas.drawArc(this.V, f2, f3, false, this.Z);
                canvas.drawArc(this.V, (this.S + 180.0f) % 360.0f, f3, false, this.I);
            }
        }

        final void V() {
            if (B()) {
                return;
            }
            if (this.V == null) {
                float fV = FaceTecSDK.V.f2852c.progressRadialOffset == 0 ? cg.this.f3087b + cg.this.f3088c : ce.V((int) (FaceTecSDK.V.f2852c.progressRadialOffset * ba.V()));
                this.V = new RectF(cg.this.D.left + fV, cg.this.D.top + fV, cg.this.D.right - fV, cg.this.D.bottom - fV);
            }
            ObjectAnimator objectAnimatorB = B(this.I, this.B);
            ObjectAnimator objectAnimatorB2 = B(this.Z, this.F);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "startStrokePosition", 0.0f, 360.0f);
            objectAnimatorOfFloat.addUpdateListener(this.C);
            objectAnimatorOfFloat.setInterpolator(this.D);
            objectAnimatorOfFloat.setDuration(cg.this.S ? 1000L : 800L);
            this.L = 0.0f;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "endStrokePosition", 0.0f, 360.0f);
            objectAnimatorOfFloat2.setDuration(cg.this.S ? 1000L : 800L);
            objectAnimatorOfFloat2.addUpdateListener(this.C);
            objectAnimatorOfFloat2.setInterpolator(this.D);
            objectAnimatorOfFloat2.setStartDelay(cg.this.S ? 200L : 100L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.Code = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorB, objectAnimatorB2);
            this.Code.start();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            cg.this.invalidate();
        }

        public final void setEndStrokePosition(float f2) {
            this.L = f2;
        }

        public final void setStartStrokePosition(float f2) {
            this.S = f2;
        }
    }

    public cg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3094j = false;
        this.f3092g = new Handler();
        this.V = context;
        this.f3088c = ce.V(ba.f()) * ba.V();
        this.f3087b = ce.V(ba.g()) * ba.V();
        this.Code = null;
        post(new Runnable() { // from class: com.facetec.sdk.cg.5
            @Override // java.lang.Runnable
            public final void run() {
                cg.this.Z(false);
                cg.this.I();
                cg.Code(cg.this);
            }
        });
    }

    static /* synthetic */ void Code(cg cgVar) {
        float fWidth = cgVar.L.width() / cgVar.Code.width();
        float fHeight = cgVar.L.height() / cgVar.Code.height();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) View.SCALE_X, 1.0f, fWidth);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) View.SCALE_Y, 1.0f, fHeight);
        AnimatorSet animatorSet = new AnimatorSet();
        cgVar.f3086a = animatorSet;
        animatorSet.setInterpolator(new OvershootInterpolator(0.8f));
        cgVar.f3086a.setDuration(1600L);
        cgVar.f3086a.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        cgVar.f3090e = animatorSet2;
        animatorSet2.setDuration(0L);
        cgVar.f3090e.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) View.SCALE_X, 1.0f, fWidth);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) View.SCALE_Y, 1.0f, fHeight);
        AnimatorSet animatorSet3 = new AnimatorSet();
        cgVar.f3089d = animatorSet3;
        animatorSet3.setInterpolator(new OvershootInterpolator(1.5f));
        cgVar.f3089d.setDuration(1200L);
        cgVar.f3089d.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) View.SCALE_X, fWidth, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) View.SCALE_Y, fHeight, 1.0f);
        AnimatorSet animatorSet4 = new AnimatorSet();
        cgVar.f3093h = animatorSet4;
        animatorSet4.setDuration(700L);
        cgVar.f3093h.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setStyle(Paint.Style.FILL);
        this.I.setAlpha(0);
        this.I.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(2, null);
        Paint paint2 = new Paint(1);
        this.B = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.B.setStrokeWidth(this.f3088c);
        if (Build.MODEL.equals("Nokia 2.2") || Build.MODEL.equals("Nokia_2_2") || Build.MODEL.equals("LM-X520") || Build.MODEL.equals("G5") || Build.MODEL.equals("G5_Plus")) {
            this.B.setAntiAlias(false);
        }
        Paint paint3 = new Paint(1);
        this.C = paint3;
        paint3.setStyle(Paint.Style.FILL);
        V();
    }

    private void V() {
        if (this.C != null) {
            this.B.setColor(ba.c(this.V));
            this.C.setColor(ba.e(this.V));
        }
    }

    private void V(final AnimatorSet animatorSet) throws Throwable {
        Handler handler = this.f3092g;
        Runnable runnable = new Runnable() { // from class: com.facetec.sdk.cg.4
            @Override // java.lang.Runnable
            public final void run() {
                AnimatorSet animatorSet2 = animatorSet;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                } else {
                    a.V(cg.this.V, com.facetec.sdk.V.NON_FATAL_ERROR, "animatorSet is null unexpectedly.");
                }
            }
        };
        Class<?> cls = Class.forName(C1626yg.Ud("\rE[5\fw\u001dEx%\u0017lN\f\"}F\u0018", (short) (C1633zX.Xd() ^ (-14405)), (short) (C1633zX.Xd() ^ (-23554))));
        Class<?>[] clsArr = {Class.forName(Ig.wd("Uv{Iz\u0014\u001fJ\f!ALZbs\u0018UR", (short) (C1580rY.Xd() ^ (-3883))))};
        Object[] objArr = {runnable};
        short sXd = (short) (C1580rY.Xd() ^ (-31069));
        int[] iArr = new int["4l^;".length()];
        QB qb = new QB("4l^;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final int C() {
        return (int) this.L.bottom;
    }

    public final void Code() {
        V v2 = this.f3091f;
        if (v2 != null) {
            v2.V();
        }
    }

    public final boolean D() {
        return this.S;
    }

    public final RectF F() {
        return this.Code;
    }

    public final void I(final Runnable runnable, boolean z2) throws Throwable {
        float f2;
        S();
        FaceTecExitAnimationStyle faceTecExitAnimationStyle = z2 ? FaceTecSDK.V.f2851b : FaceTecSDK.V.f2850a;
        int i2 = AnonymousClass3.B[faceTecExitAnimationStyle.ordinal()];
        float f3 = 1.0f;
        int i3 = LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE;
        if (i2 != 2) {
            f2 = 2.1f;
            if (i2 != 3) {
                if (i2 == 4) {
                    this.B.setColor(ba.e(this.V));
                    i3 = 1000;
                }
                f2 = 1.0f;
            }
            f3 = 1.8f;
        } else {
            f2 = 1.0f;
        }
        if (faceTecExitAnimationStyle != FaceTecExitAnimationStyle.NONE) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<cg, Float>) View.SCALE_X, getScaleX(), f3);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<cg, Float>) View.SCALE_Y, getScaleY(), f2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(i3);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.cg.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    cg.this.setVisibility(4);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            V(animatorSet);
        }
    }

    public final int L() {
        return (int) this.Code.bottom;
    }

    public final void S() {
        V();
        invalidate();
    }

    final synchronized void Z(boolean z2) {
        if (!this.f3094j || z2) {
            this.f3094j = true;
            int width = getWidth();
            int height = ba.V() < 1.0f ? Resources.getSystem().getDisplayMetrics().heightPixels : getHeight();
            float f2 = width;
            float f3 = 0.65f * f2;
            float f4 = (f2 - f3) / 2.0f;
            float height2 = (getHeight() - (f3 * 1.48f)) / 2.0f;
            RectF rectF = new RectF();
            this.Code = rectF;
            rectF.set(f4, height2, f2 - f4, getHeight() - height2);
            RectF rectF2 = new RectF();
            this.D = rectF2;
            rectF2.set(this.Code.left + (this.f3088c / 2.0f), this.Code.top + (this.f3088c / 2.0f), this.Code.right - (this.f3088c / 2.0f), this.Code.bottom - (this.f3088c / 2.0f));
            RectF rectF3 = new RectF();
            this.F = rectF3;
            rectF3.set(this.Code.left + this.f3088c, this.Code.top + this.f3088c, this.Code.right - this.f3088c, this.Code.bottom - this.f3088c);
            float f5 = 0.98f * f2;
            float f6 = (f2 - f5) / 2.0f;
            float f7 = f5 * 1.7f;
            float f8 = height - (f3085i << 1);
            if (f8 <= f7) {
                f7 = f8;
            }
            float height3 = (getHeight() - f7) / 2.0f;
            RectF rectF4 = new RectF();
            this.L = rectF4;
            rectF4.set(f6, height3, f2 - f6, getHeight() - height3);
            this.f3091f = new V();
        }
    }

    public final void a() throws Throwable {
        setOvalHasExpanded(true);
        V(this.f3089d);
    }

    public final void c() throws Throwable {
        setOvalHasExpanded(false);
        V(this.f3093h);
    }

    public final void e() {
        this.f3089d.cancel();
        this.f3086a.cancel();
        this.f3093h.cancel();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.Code != null) {
            canvas.drawRect(-400.0f, -400.0f, getWidth() + LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE, getHeight() + LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE, this.C);
            canvas.drawOval(this.Code, this.I);
            canvas.drawOval(this.D, this.B);
        }
        V v2 = this.f3091f;
        if (v2 != null) {
            v2.B(canvas);
        }
    }

    public void setOvalHasExpanded(boolean z2) {
        this.S = z2;
    }

    public void setOvalStrokeWidth(int i2) {
        if (this.B == null) {
            I();
            V();
        }
        this.B.setStrokeWidth(i2);
        invalidate();
    }

    public void setTransparentBackground() {
        if (this.C == null) {
            I();
            V();
        }
        this.C.setColor(0);
        invalidate();
    }
}
