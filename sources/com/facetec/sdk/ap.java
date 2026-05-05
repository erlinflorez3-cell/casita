package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.animation.core.AnimationKt;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.dynatrace.android.callback.Callback;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class ap extends Fragment {
    private static /* synthetic */ boolean K = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Handler f2904s = new Handler();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Handler f2905w;
    protected View B;
    protected ImageView C;
    protected TextView Code;
    protected RelativeLayout D;
    protected RelativeLayout F;
    protected ProgressBar I;
    protected RelativeLayout L;
    protected ImageView S;
    protected TextView V;
    protected ImageView Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ObjectAnimator f2906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected TextView f2907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LinearLayout f2908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f2909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected RelativeLayout f2910e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected bf f2913h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ImageView f2915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    AnimatedVectorDrawableCompat f2916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Animatable2Compat.AnimationCallback f2917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    AnimatedVectorDrawableCompat f2918m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private FrameLayout f2921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LayerDrawable f2922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f2923r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f2924t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2926v = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f2912g = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2925u = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f2927x = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f2911f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f2914i = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected V f2920o = V.UPLOAD_STARTED;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Code f2919n = Code.DEFAULT;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final av f2928y = new av(this) { // from class: com.facetec.sdk.ap.2
        @Override // com.facetec.sdk.av
        public final void B() {
            g gVar = (g) ap.this.getActivity();
            if (gVar != null) {
                gVar.f();
            }
        }
    };
    private final av E = new av(this) { // from class: com.facetec.sdk.ap.5
        @Override // com.facetec.sdk.av
        public final void B() throws Throwable {
            if (ap.f2905w == null || ap.this.f2911f) {
                return;
            }
            ap.f2905w.removeCallbacksAndMessages(null);
            ap.this.f2920o = V.UPLOAD_STARTED;
            ap.B(ap.this, false);
            long j2 = ap.this.f2912g ? 8000L : 6000L;
            Handler handler = ap.f2905w;
            av avVar = ap.this.H;
            Class<?> cls = Class.forName(Xg.qd("UcZigb^)kp,Gaofoiw", (short) (FB.Xd() ^ 16499), (short) (FB.Xd() ^ 2281)));
            Class<?>[] clsArr = {Class.forName(Jg.Wd("7\u000e8\u0018\u000eYKxfB\f 6\u0012}\u0014#1", (short) (FB.Xd() ^ 25089), (short) (FB.Xd() ^ 12677))), Long.TYPE};
            Object[] objArr = {avVar, Long.valueOf(j2)};
            Method method = cls.getMethod(ZO.xd("Iy.W8\u00124OB\u00136", (short) (FB.Xd() ^ 11362), (short) (FB.Xd() ^ 4790)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    };
    private final av H = new av(this) { // from class: com.facetec.sdk.ap.7
        @Override // com.facetec.sdk.av
        public final void B() throws Throwable {
            if (ap.f2905w == null || ap.this.f2911f) {
                return;
            }
            ap.f2905w.removeCallbacksAndMessages(null);
            ap.this.f2920o = V.STILL_UPLOADING;
            ap.B(ap.this, true);
        }
    };

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final av f2929z = new AnonymousClass9(this);
    private final av G = new av(this) { // from class: com.facetec.sdk.ap.10
        @Override // com.facetec.sdk.av
        public final void B() throws Throwable {
            if (ap.f2905w == null) {
                return;
            }
            ap.f2905w.removeCallbacksAndMessages(null);
            if (ap.this.f2911f) {
                return;
            }
            ap.this.f2920o = V.UPLOAD_COMPLETE_AWAITING_PROCESSING;
            ap.B(ap.this, true);
            Handler handler = ap.f2905w;
            Object[] objArr = {ap.this.A, 1000L};
            Method method = Class.forName(C1561oA.ud("KWLYUNH\u0011QT\u000e'?K@G?K", (short) (C1580rY.Xd() ^ (-18888)))).getMethod(C1561oA.Yd("!!&(x\u001b#\u00192\u001f\u001f", (short) (ZN.Xd() ^ 3807)), Class.forName(C1561oA.yd("e[s]-jbnj0Wyutjjwo", (short) (C1499aX.Xd() ^ (-19379)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    };
    private final av A = new av(this) { // from class: com.facetec.sdk.ap.8
        @Override // com.facetec.sdk.av
        public final void B() {
            if (ap.f2905w == null) {
                return;
            }
            ap.f2905w.removeCallbacksAndMessages(null);
            ap.this.f2911f = true;
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.ap$11, reason: invalid class name */
    final class AnonymousClass11 extends av {
        final /* synthetic */ Handler Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass11(Fragment fragment, Handler handler) {
            super(fragment);
            this.Code = handler;
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            ap.this.Z.setImageDrawable(ap.this.f2918m);
            ap.this.f2917l = new Animatable2Compat.AnimationCallback() { // from class: com.facetec.sdk.ap.11.4
                @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
                public final void onAnimationEnd(Drawable drawable) throws Throwable {
                    Handler handler = AnonymousClass11.this.Code;
                    av avVar = new av(ap.this) { // from class: com.facetec.sdk.ap.11.4.5
                        @Override // com.facetec.sdk.av
                        public final void B() {
                            if (ap.this.f2918m == null) {
                                return;
                            }
                            ap.this.f2918m.start();
                        }
                    };
                    Class<?> cls = Class.forName(Xg.qd("\u0010\u001e\u0015$\"\u001d\u0019c&+f\u0002\u001c*!*$2", (short) (C1607wl.Xd() ^ 11306), (short) (C1607wl.Xd() ^ 16964)));
                    Class<?>[] clsArr = new Class[1];
                    short sXd = (short) (ZN.Xd() ^ 10694);
                    short sXd2 = (short) (ZN.Xd() ^ 19150);
                    int[] iArr = new int["O1C\n\u0013\u001a\u000bt*Xyx.veC\n\u000b".length()];
                    QB qb = new QB("O1C\n\u0013\u001a\u000bt*Xyx.veC\n\u000b");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                        i2++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i2));
                    Object[] objArr = {avVar};
                    Method method = cls.getMethod(ZO.xd("\u0013-\u0012\u000b", (short) (C1607wl.Xd() ^ 21705), (short) (C1607wl.Xd() ^ 22627)), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            };
            ap.this.f2918m.registerAnimationCallback(ap.this.f2917l);
            ap.this.f2918m.start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ap$13, reason: invalid class name */
    final class AnonymousClass13 extends av {
        final /* synthetic */ boolean Code;
        final /* synthetic */ Runnable I;
        final /* synthetic */ boolean V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass13(Fragment fragment, boolean z2, Runnable runnable, boolean z3) {
            super(fragment);
            this.Code = z2;
            this.I = runnable;
            this.V = z3;
        }

        @Override // com.facetec.sdk.av
        final void B() {
            ap.this.Code(new av(ap.this) { // from class: com.facetec.sdk.ap.13.1
                @Override // com.facetec.sdk.av
                final void B() {
                    if (AnonymousClass13.this.Code) {
                        ap.this.B(true, new av(ap.this) { // from class: com.facetec.sdk.ap.13.1.1
                            @Override // com.facetec.sdk.av
                            public final void B() {
                                AnonymousClass13.this.I.run();
                            }
                        });
                        return;
                    }
                    if (!AnonymousClass13.this.V) {
                        if (ap.this.f2912g) {
                            ap.this.B(false, new av(ap.this) { // from class: com.facetec.sdk.ap.13.1.4
                                @Override // com.facetec.sdk.av
                                public final void B() {
                                    AnonymousClass13.this.I.run();
                                }
                            });
                            return;
                        } else {
                            ap.this.Z(new av(ap.this) { // from class: com.facetec.sdk.ap.13.1.3
                                @Override // com.facetec.sdk.av
                                public final void B() {
                                    AnonymousClass13.this.I.run();
                                }
                            });
                            return;
                        }
                    }
                    ap apVar = ap.this;
                    av avVar = new av(ap.this) { // from class: com.facetec.sdk.ap.13.1.2
                        @Override // com.facetec.sdk.av
                        final void B() {
                            AnonymousClass13.this.I.run();
                        }
                    };
                    if (apVar.getActivity() != null) {
                        int iAJ = ba.aJ();
                        int iAK = ba.aK();
                        if (iAK == 0) {
                            iAK = R.drawable.facetec_internal_warning;
                        }
                        apVar.getActivity().runOnUiThread(apVar.new AnonymousClass16(apVar, iAJ != 0, iAJ, iAK, avVar));
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ap$16, reason: invalid class name */
    final class AnonymousClass16 extends av {
        private /* synthetic */ boolean B;
        private /* synthetic */ int Code;
        final /* synthetic */ av I;
        private /* synthetic */ int V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass16(Fragment fragment, boolean z2, int i2, int i3, av avVar) {
            super(fragment);
            this.B = z2;
            this.Code = i2;
            this.V = i3;
            this.I = avVar;
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            ap.this.F.setVisibility(0);
            ap.this.S.setImageDrawable(null);
            ap.this.S.clearColorFilter();
            ap.this.S.invalidate();
            ap.this.C.clearColorFilter();
            ap.this.C.invalidate();
            if (this.B) {
                ap.this.C.setImageDrawable(ap.V(ap.this.getActivity(), this.Code));
                ((AnimatedVectorDrawableCompat) ap.this.C.getDrawable()).start();
            } else {
                ap.this.C.setImageDrawable(ContextCompat.getDrawable(ap.this.getActivity(), this.V));
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ap.this.D, "alpha", ap.this.D.getAlpha(), 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ap.this.F, "alpha", ap.this.F.getAlpha(), 1.0f);
            objectAnimatorOfFloat2.setDuration(800L);
            objectAnimatorOfFloat.setDuration(800L);
            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.ap.16.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) throws Throwable {
                    ap.this.Code.animate().alpha(1.0f).setDuration(1500L).setStartDelay(0L).setListener(null).start();
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(C1626yg.Ud(">.8s\u0014<A93s^\u0004}pA^\u000b", (short) (FB.Xd() ^ 17227), (short) (FB.Xd() ^ 2324))).getDeclaredMethod(Ig.wd("Z&SD){l\u000b\u000b\u0007\u0012!~", (short) (FB.Xd() ^ 7869)), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                        av avVar = new av(ap.this) { // from class: com.facetec.sdk.ap.16.1.3
                            @Override // com.facetec.sdk.av
                            public final void B() {
                                AnonymousClass16.this.I.B();
                            }
                        };
                        Class<?> cls = Class.forName(EO.Od("5z`Mc\"G\u0013+\u0002@2\u0016\u001b3\u0018=f", (short) (C1580rY.Xd() ^ (-11709))));
                        Class<?>[] clsArr = {Class.forName(C1561oA.Qd("VL`J\u0016SGSK\u00114VNM??H@", (short) (Od.Xd() ^ (-15529)))), Long.TYPE};
                        Object[] objArr2 = {avVar, 2500L};
                        short sXd = (short) (C1607wl.Xd() ^ 19107);
                        short sXd2 = (short) (C1607wl.Xd() ^ 25810);
                        int[] iArr = new int["\u0016\u0016\u001b\u001dm\u0010\u0018\u000e'\u0014\u0014".length()];
                        QB qb = new QB("\u0016\u0016\u001b\u001dm\u0010\u0018\u000e'\u0014\u0014");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                            i2++;
                        }
                        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(handler, objArr2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            });
            objectAnimatorOfFloat2.start();
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ap$17, reason: invalid class name */
    final class AnonymousClass17 extends av {
        private /* synthetic */ int B;
        private /* synthetic */ int C;
        private /* synthetic */ boolean Code;
        private /* synthetic */ boolean F;
        final /* synthetic */ av I;
        private /* synthetic */ boolean L;
        private /* synthetic */ int S;
        private /* synthetic */ boolean Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass17(Fragment fragment, boolean z2, int i2, boolean z3, int i3, boolean z4, boolean z5, int i4, av avVar) {
            super(fragment);
            this.Z = z2;
            this.B = i2;
            this.Code = z3;
            this.C = i3;
            this.L = z4;
            this.F = z5;
            this.S = i4;
            this.I = avVar;
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            ap.this.F.setVisibility(0);
            if (this.Z) {
                ap.this.C.clearColorFilter();
                ap.this.C.invalidate();
                ap.this.C.setImageDrawable(ap.V(ap.this.getActivity(), this.B));
                ((AnimatedVectorDrawableCompat) ap.this.C.getDrawable()).start();
            } else {
                if (this.Code) {
                    ap.this.S.setImageResource(this.C);
                    ap.this.S.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(0L).setStartDelay(0L).setListener(null).start();
                    ap.this.S.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(1000L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                } else {
                    ap.this.S.setImageDrawable(ap.V(ap.this.getActivity(), R.drawable.facetec_animated_result_background));
                    ((AnimatedVectorDrawableCompat) ap.this.S.getDrawable()).start();
                }
                ap.this.C.setImageDrawable(ap.V(ap.this.getActivity(), this.L ? R.drawable.facetec_animated_success_foreground : R.drawable.facetec_animated_unsuccess_foreground));
                ((AnimatedVectorDrawableCompat) ap.this.C.getDrawable()).start();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ap.this.D, "alpha", ap.this.D.getAlpha(), 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ap.this.F, "alpha", ap.this.F.getAlpha(), 1.0f);
            objectAnimatorOfFloat2.setDuration(800L);
            objectAnimatorOfFloat.setDuration(800L);
            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.ap.17.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) throws Throwable {
                    if (ap.this.f2918m != null && ap.this.f2917l != null) {
                        ap.this.f2918m.unregisterAnimationCallback(ap.this.f2917l);
                        ap.this.f2918m.stop();
                        ap.this.f2918m = null;
                        ap.this.f2917l = null;
                    }
                    if (ap.this.f2916k != null) {
                        ap.this.f2916k.stop();
                        ap.this.f2916k = null;
                    }
                    ap.this.Code.animate().alpha(1.0f).setDuration(1500L).setStartDelay(0L).setListener(null).start();
                    Class<?> cls = Class.forName(C1561oA.od("?K@MIB<\u0005EH\u0002\u001fA@@4@", (short) (C1580rY.Xd() ^ (-28035))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd = (short) (OY.Xd() ^ 21305);
                    int[] iArr = new int["{z\u000bdy\u0003\tg\f\r\u000f\u0005\u0013".length()];
                    QB qb = new QB("{z\u000bdy\u0003\tg\f\r\u000f\u0005\u0013");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                        i2++;
                    }
                    Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                        Object[] objArr2 = {new av(ap.this) { // from class: com.facetec.sdk.ap.17.4.3
                            @Override // com.facetec.sdk.av
                            public final void B() {
                                AnonymousClass17.this.I.B();
                            }
                        }, 2500L};
                        Method method = Class.forName(Wg.Zd("y}{-2OR?\nA\u0004!br\u0011\u001b<<", (short) (C1499aX.Xd() ^ (-16166)), (short) (C1499aX.Xd() ^ (-7309)))).getMethod(Wg.vd("0057\b*2(1\u001e\u001e", (short) (C1633zX.Xd() ^ (-8196))), Class.forName(C1561oA.Xd("nf|h6ukys;`\u0005~\u007fsu\u0001z", (short) (C1580rY.Xd() ^ (-28308)))), Long.TYPE);
                        try {
                            method.setAccessible(true);
                            method.invoke(handler, objArr2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            });
            objectAnimatorOfFloat2.start();
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ap$19, reason: invalid class name */
    static /* synthetic */ class AnonymousClass19 {
        static final /* synthetic */ int[] Code;
        static final /* synthetic */ int[] I;
        static final /* synthetic */ int[] Z;

        static {
            int[] iArr = new int[Code.values().length];
            I = iArr;
            try {
                iArr[Code.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                I[Code.FRONT_SIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                I[Code.NFC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                I[Code.BACK_SIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                I[Code.USER_CONFIRMED_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[V.values().length];
            Z = iArr2;
            try {
                iArr2[V.UPLOAD_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Z[V.STILL_UPLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Z[V.UPLOAD_COMPLETE_AWAITING_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Z[V.UPLOAD_COMPLETE_AWAITING_PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            Code = iArr3;
            try {
                iArr3[FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Code[FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Code[FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Code[FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ap$20, reason: invalid class name */
    final class AnonymousClass20 extends av {
        final /* synthetic */ av V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass20(Fragment fragment, av avVar) {
            super(fragment);
            this.V = avVar;
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            ap.this.f2908c.animate().alpha(0.0f).setDuration(800L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ap.this.L, "alpha", ap.this.L.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(800L);
            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.ap.20.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) throws Throwable {
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(Qg.kd("S_Ta]VP\u0019Y\\\u00163UTTHT", (short) (ZN.Xd() ^ 18148), (short) (ZN.Xd() ^ 7133))).getDeclaredMethod(yg.hg.Vd("liwObimJlkk_k", (short) (ZN.Xd() ^ 30570), (short) (ZN.Xd() ^ 24831)), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                        Object[] objArr2 = {new av(ap.this) { // from class: com.facetec.sdk.ap.20.2.1
                            @Override // com.facetec.sdk.av
                            public final void B() {
                                if (ap.this.L != null) {
                                    ap.this.L.setVisibility(8);
                                }
                                if (AnonymousClass20.this.V != null) {
                                    AnonymousClass20.this.V.B();
                                }
                            }
                        }};
                        Method method = Class.forName(C1561oA.ud("\t\u0015\n\u0017\u0013\f\u0006N\u000f\u0012Kd|\t}\u0005|\t", (short) (C1580rY.Xd() ^ (-23900)))).getMethod(C1561oA.Yd("??DF", (short) (C1499aX.Xd() ^ (-11543))), Class.forName(C1561oA.yd("\u0006}\u0010{E\u0005v\u0005zBc\b}~np\u0018\u0012", (short) (C1499aX.Xd() ^ (-4798)))));
                        try {
                            method.setAccessible(true);
                            method.invoke(handler, objArr2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            });
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ap$9, reason: invalid class name */
    final class AnonymousClass9 extends av {

        /* JADX INFO: renamed from: com.facetec.sdk.ap$9$5, reason: invalid class name */
        final class AnonymousClass5 extends av {
            AnonymousClass5(Fragment fragment) {
                super(fragment);
            }

            @Override // com.facetec.sdk.av
            final void B() throws Throwable {
                if (ap.f2905w == null || ap.this.f2911f) {
                    return;
                }
                ap.f2905w.removeCallbacksAndMessages(null);
                Handler handler = ap.f2905w;
                av avVar = new av(ap.this) { // from class: com.facetec.sdk.ap.9.5.1
                    @Override // com.facetec.sdk.av
                    final void B() throws Throwable {
                        ap.this.f2920o = V.UPLOAD_COMPLETE_AWAITING_RESPONSE;
                        ap.this.B(new av(ap.this) { // from class: com.facetec.sdk.ap.9.5.1.3
                            @Override // com.facetec.sdk.av
                            final void B() throws Throwable {
                                if (ap.f2905w == null || ap.this.f2911f) {
                                    return;
                                }
                                ap.B(ap.this, true);
                                ap.this.I((av) null);
                                Handler handler2 = ap.f2905w;
                                av avVar2 = ap.this.G;
                                Class<?> cls = Class.forName(C1626yg.Ud("\u001dK\u001e\u0017'%`q\b|`3g\t?>|\u0015", (short) (FB.Xd() ^ 1528), (short) (FB.Xd() ^ 15418)));
                                Class<?>[] clsArr = {Class.forName(Ig.wd("~\u001ddoT=V\u0014Eh\u000b\u0014A;ZBni", (short) (C1607wl.Xd() ^ 10310))), Long.TYPE};
                                Object[] objArr = {avVar2, Long.valueOf(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec)};
                                Method method = cls.getMethod(EO.Od("\u0013Yo\u0018`/\u0002\u000fqB?", (short) (FB.Xd() ^ 26606)), clsArr);
                                try {
                                    method.setAccessible(true);
                                    method.invoke(handler2, objArr);
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        });
                    }
                };
                short sXd = (short) (C1499aX.Xd() ^ (-12522));
                int[] iArr = new int["_k`mib\\%eh\";S_T[S_".length()];
                QB qb = new QB("_k`mib\\%eh\";S_T[S_");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = {Class.forName(C1593ug.zd("\u0013\u000b!\rZ\u001a\u0010\u001e\u0018_\u0005)#$\u0018\u001a%\u001f", (short) (FB.Xd() ^ 2905), (short) (FB.Xd() ^ 8678))), Long.TYPE};
                Object[] objArr = {avVar, 500L};
                short sXd2 = (short) (C1633zX.Xd() ^ (-26245));
                int[] iArr2 = new int["\u0006\u0004\u0007\u0007Uu{o\u0007qo".length()];
                QB qb2 = new QB("\u0006\u0004\u0007\u0007Uu{o\u0007qo");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        AnonymousClass9(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            if (ap.f2905w == null || ap.this.f2911f) {
                return;
            }
            ap.f2905w.removeCallbacksAndMessages(null);
            ap.this.Code(new AnonymousClass5(ap.this));
        }
    }

    enum Code {
        DEFAULT,
        FRONT_SIDE,
        BACK_SIDE,
        USER_CONFIRMED_INFO,
        NFC
    }

    enum V {
        UPLOAD_STARTED,
        STILL_UPLOADING,
        UPLOAD_COMPLETE_AWAITING_RESPONSE,
        UPLOAD_COMPLETE_AWAITING_PROCESSING
    }

    static {
        Class<?> cls = Class.forName(C1561oA.Kd("SaXge`\\'in*Imnpft", (short) (C1580rY.Xd() ^ (-26511))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-23763));
        short sXd2 = (short) (C1580rY.Xd() ^ (-21144));
        int[] iArr = new int["\t\u0004\b=N3\r\bhe=\u000b9".length()];
        QB qb = new QB("\t\u0004\b=N3\r\bhe=\u000b9");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            f2905w = new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ void B(ap apVar, final boolean z2) throws Throwable {
        f2905w.removeCallbacksAndMessages(null);
        apVar.B(new av(apVar) { // from class: com.facetec.sdk.ap.3
            @Override // com.facetec.sdk.av
            final void B() {
                if (ap.this.V != null) {
                    ap apVar2 = ap.this;
                    String strV = apVar2.V(apVar2.f2920o, ap.this.f2919n);
                    if (strV.equals(ap.this.V.getText().toString())) {
                        return;
                    }
                    if (z2) {
                        ap.this.f2914i = (System.nanoTime() / AnimationKt.MillisToNanos) + 1000;
                        ap.this.V.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new av(ap.this) { // from class: com.facetec.sdk.ap.3.3
                            @Override // com.facetec.sdk.av
                            final void B() {
                                ap.this.V.setText(ap.this.V(ap.this.f2920o, ap.this.f2919n));
                                ap.this.V.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                            }
                        }).start();
                    } else {
                        ap.this.V.setText(strV);
                        ap.this.f2914i = System.nanoTime() / AnimationKt.MillisToNanos;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(final av avVar) throws Throwable {
        Handler handler = f2905w;
        if (handler == null) {
            return;
        }
        long jV = V();
        av avVar2 = new av(this) { // from class: com.facetec.sdk.ap.4
            @Override // com.facetec.sdk.av
            final void B() {
                av avVar3 = avVar;
                if (avVar3 != null) {
                    avVar3.B();
                }
            }
        };
        Class<?> cls = Class.forName(C1561oA.Xd("lzq\u0001~yu@\u0003\bC^x\u0007}\u0007\u0001\u000f", (short) (C1499aX.Xd() ^ (-6431))));
        Class<?>[] clsArr = {Class.forName(Wg.vd("G?Q=\u000fN@NL\u00145YWXHJYS", (short) (FB.Xd() ^ 3438))), Long.TYPE};
        Object[] objArr = {avVar2, Long.valueOf(jV)};
        Method method = cls.getMethod(Qg.kd("KILL\u001b;A5L75", (short) (FB.Xd() ^ 16299), (short) (FB.Xd() ^ 30035)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static ap Code(boolean z2, Code code) {
        ap apVar = new ap();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isIDScan", z2);
        bundle.putSerializable("uploadType", code);
        apVar.setArguments(bundle);
        return apVar;
    }

    private long V() {
        if (this.f2914i != -1) {
            long jNanoTime = (System.nanoTime() / AnimationKt.MillisToNanos) - this.f2914i;
            if (jNanoTime < 1000) {
                return 1000 - jNanoTime;
            }
        }
        return 0L;
    }

    static AnimatedVectorDrawableCompat V(Activity activity, int i2) throws Throwable {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompatCreate = AnimatedVectorDrawableCompat.create(activity, i2);
        if (K || animatedVectorDrawableCompatCreate != null) {
            return (AnimatedVectorDrawableCompat) animatedVectorDrawableCompatCreate.mutate();
        }
        throw new AssertionError();
    }

    static /* synthetic */ boolean V(ap apVar) {
        apVar.f2926v = true;
        return true;
    }

    final void B(final String str) {
        if (this.V == null || this.f2925u) {
            return;
        }
        B(new av(this) { // from class: com.facetec.sdk.ap.1
            @Override // com.facetec.sdk.av
            final void B() {
                if (ap.this.f2911f) {
                    return;
                }
                if (ap.this.I == null || ap.this.I.getProgress() / ap.this.I.getMax() < 0.9d) {
                    ap.this.V.setText(str);
                    ap.this.f2914i = System.nanoTime() / AnimationKt.MillisToNanos;
                }
            }
        });
    }

    final void B(boolean z2, av avVar) {
        if (getActivity() == null) {
            return;
        }
        int iAw = z2 ? ba.aw() : ba.aE();
        boolean z3 = iAw != 0;
        int iAL = z2 ? ba.aL() : ba.aO();
        boolean z4 = iAL != 0;
        int iAN = z2 ? ba.aN() : ba.aM();
        if (z3 || z4) {
            this.S.setImageDrawable(null);
            this.S.clearColorFilter();
            this.S.invalidate();
        }
        getActivity().runOnUiThread(new AnonymousClass17(this, z4, iAL, z3, iAw, z2, false, iAN, avVar));
    }

    final void Code(final av avVar) {
        ProgressBar progressBar = this.I;
        if (progressBar == null || progressBar.getProgress() == this.I.getMax() || !FaceTecSDK.V.F.showUploadProgressBar) {
            avVar.B();
        } else {
            getActivity().runOnUiThread(new av(this) { // from class: com.facetec.sdk.ap.6
                @Override // com.facetec.sdk.av
                public final void B() {
                    if (ap.this.f2906a != null) {
                        ap.this.f2906a.end();
                        ap.this.f2906a = null;
                    }
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(ap.this.I, "progress", ap.this.I.getProgress(), ap.this.I.getMax());
                    objectAnimatorOfInt.setDuration(500L);
                    objectAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.ap.6.5
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            if (avVar != null) {
                                avVar.B();
                            }
                        }
                    });
                    objectAnimatorOfInt.start();
                }
            });
        }
    }

    final void I(final av avVar) {
        if (this.I != null && FaceTecSDK.V.F.showUploadProgressBar) {
            getActivity().runOnUiThread(new av(this) { // from class: com.facetec.sdk.ap.14
                @Override // com.facetec.sdk.av
                public final void B() {
                    ap.this.I.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new av(ap.this) { // from class: com.facetec.sdk.ap.14.3
                        @Override // com.facetec.sdk.av
                        final void B() {
                            if (avVar != null) {
                                avVar.B();
                            }
                        }
                    }).start();
                }
            });
        } else if (avVar != null) {
            avVar.B();
        }
    }

    final void I(boolean z2, String str, Runnable runnable) {
        V(z2, false, str, runnable);
    }

    final String V(V v2, Code code) {
        if (!this.f2912g) {
            return bb.Z(R.string.FaceTec_result_facescan_upload_message);
        }
        if (FaceTecCustomization.f2849h == null) {
            return bb.Z(R.string.FaceTec_result_idscan_upload_message);
        }
        az azVar = az.UNKNOWN;
        int i2 = AnonymousClass19.I[code.ordinal()];
        if (i2 == 2) {
            int i3 = AnonymousClass19.Z[v2.ordinal()];
            if (i3 == 1) {
                azVar = az.IDSCAN_FRONT_SIDE_UPLOAD_STARTED;
            } else if (i3 == 2) {
                azVar = az.IDSCAN_FRONT_SIDE_STILL_UPLOADING;
            } else if (i3 == 3) {
                azVar = az.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i3 == 4) {
                azVar = az.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i2 == 3) {
            int i4 = AnonymousClass19.Z[v2.ordinal()];
            if (i4 == 1) {
                azVar = az.NFC_UPLOAD_STARTED;
            } else if (i4 == 2) {
                azVar = az.NFC_STILL_UPLOADING;
            } else if (i4 == 3) {
                azVar = az.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i4 == 4) {
                azVar = az.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i2 == 4) {
            int i5 = AnonymousClass19.Z[v2.ordinal()];
            if (i5 == 1) {
                azVar = az.IDSCAN_BACK_SIDE_UPLOAD_STARTED;
            } else if (i5 == 2) {
                azVar = az.IDSCAN_BACK_SIDE_STILL_UPLOADING;
            } else if (i5 == 3) {
                azVar = az.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i5 == 4) {
                azVar = az.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        } else if (i2 == 5) {
            int i6 = AnonymousClass19.Z[v2.ordinal()];
            if (i6 == 1) {
                azVar = az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED;
            } else if (i6 == 2) {
                azVar = az.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING;
            } else if (i6 == 3) {
                azVar = az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE;
            } else if (i6 == 4) {
                azVar = az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING;
            }
        }
        String strV = ba.V(azVar);
        return strV == null ? v2 == V.UPLOAD_COMPLETE_AWAITING_PROCESSING ? V(V.UPLOAD_COMPLETE_AWAITING_RESPONSE, code) : (v2 == V.UPLOAD_COMPLETE_AWAITING_RESPONSE || v2 == V.STILL_UPLOADING) ? V(V.UPLOAD_STARTED, code) : this.f2912g ? code == Code.NFC ? bb.Z(R.string.FaceTec_result_nfc_upload_message) : bb.Z(R.string.FaceTec_result_idscan_upload_message) : bb.Z(R.string.FaceTec_result_facescan_upload_message) : strV;
    }

    final void V(float f2) {
        if (this.I == null) {
            return;
        }
        float progress = r0.getProgress() / this.I.getMax();
        if (f2 > 1.0f || progress >= f2) {
            return;
        }
        if (f2 == 1.0f && !this.f2927x) {
            this.f2927x = true;
            if (this.f2925u) {
                Handler handler = f2905w;
                av avVar = this.f2929z;
                Class<?> cls = Class.forName(yg.hg.Vd("Q]R_[TN\u0017WZ\u0014-EQFMEQ", (short) (FB.Xd() ^ 28604), (short) (FB.Xd() ^ 1821)));
                Class<?>[] clsArr = {Class.forName(C1561oA.ud("\n\u007f\u0014}I\u0007z\u0007~Dg\n\u0002\u0001rr{s", (short) (C1580rY.Xd() ^ (-11894))))};
                Object[] objArr = {avVar};
                short sXd = (short) (ZN.Xd() ^ 21895);
                int[] iArr = new int["@>AA".length()];
                QB qb = new QB("@>AA");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
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
        }
        float f3 = (f2 * 10000.0f) - 1000.0f;
        if (f3 > this.I.getProgress()) {
            ObjectAnimator objectAnimator = this.f2906a;
            if (objectAnimator != null) {
                objectAnimator.end();
                this.f2906a = null;
            }
            this.I.setProgress(Math.round(f3), true);
        }
        Handler handler2 = f2904s;
        handler2.removeCallbacks(this.f2928y);
        av avVar2 = this.f2928y;
        Class<?> cls2 = Class.forName(C1561oA.Yd("p~u\u0005\u0003}yD\u0007\fGb|\u000b\u0002\u000b\u0005\u0013", (short) (FB.Xd() ^ 6698)));
        Class<?>[] clsArr2 = new Class[2];
        short sXd2 = (short) (FB.Xd() ^ 19688);
        short sXd3 = (short) (FB.Xd() ^ 12703);
        int[] iArr2 = new int["#\u001b1\u001dj* .(o\u0015934(*5/".length()];
        QB qb2 = new QB("#\u001b1\u001dj* .(o\u0015934(*5/");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr2[1] = Long.TYPE;
        Object[] objArr2 = {avVar2, 600000L};
        Method method2 = cls2.getMethod(Jg.Wd("E\u0013rT\u0018\u001a|q^*&", (short) (ZN.Xd() ^ 32060), (short) (ZN.Xd() ^ 277)), clsArr2);
        try {
            method2.setAccessible(true);
            method2.invoke(handler2, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    final void V(boolean z2, boolean z3, String str, Runnable runnable) {
        f2904s.removeCallbacks(this.f2928y);
        f2905w.removeCallbacksAndMessages(null);
        if (getActivity() == null) {
            return;
        }
        if (!this.f2912g) {
            if (str == null) {
                str = bb.Z(R.string.FaceTec_result_success_message);
            }
            this.Code.setText(str);
        } else if (z2) {
            if (str == null) {
                str = bb.Z(R.string.FaceTec_result_success_message);
            }
            this.Code.setText(str);
        } else {
            if (str == null) {
                str = bb.Z(R.string.FaceTec_result_idscan_unsuccess_message);
            }
            this.Code.setText(str);
        }
        this.f2911f = true;
        B(new AnonymousClass13(this, z2, runnable, z3));
    }

    final void Z(av avVar) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new AnonymousClass20(this, avVar));
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        Handler handler = f2904s;
        Object[] objArr = {this.f2928y, 600000L};
        Method method = Class.forName(ZO.xd("O\t\u001dNk\u0011!QZ6j|_m\n[lz", (short) (C1499aX.Xd() ^ (-8399)), (short) (C1499aX.Xd() ^ (-18088)))).getMethod(Ig.wd("6iYH6\u0003kF\u001890", (short) (ZN.Xd() ^ 15053)), Class.forName(C1626yg.Ud("\rGSI\u000f!.l?2G[\u0013\u000e\u000b5V\u0012", (short) (FB.Xd() ^ 11223), (short) (FB.Xd() ^ 32349))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.facetec_results_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        this.f2912g = getArguments().getBoolean(EO.Od("{80S\u0003G\u0019'", (short) (C1607wl.Xd() ^ 27949)));
        this.f2919n = (Code) getArguments().get(C1561oA.Qd("c]XZKM<`VJ", (short) (Od.Xd() ^ (-1540))));
        this.f2920o = V.UPLOAD_STARTED;
        this.Z = (ImageView) view.findViewById(R.id.activityIndicatorImageView);
        this.I = (ProgressBar) view.findViewById(R.id.uploadProgressBar);
        this.V = (TextView) view.findViewById(R.id.progressTextView);
        this.Code = (TextView) view.findViewById(R.id.resultTextView);
        this.B = view.findViewById(R.id.zoomResultBackground);
        this.D = (RelativeLayout) view.findViewById(R.id.progressBarLayout);
        this.F = (RelativeLayout) view.findViewById(R.id.zoomResultLayout);
        this.L = (RelativeLayout) view.findViewById(R.id.zoomResultContainer);
        this.S = (ImageView) view.findViewById(R.id.resultAnimationBackground);
        this.C = (ImageView) view.findViewById(R.id.resultAnimationForeground);
        this.f2921p = (FrameLayout) view.findViewById(R.id.resultFrame);
        this.f2908c = (LinearLayout) view.findViewById(R.id.devModeTagLayout);
        this.f2923r = (TextView) view.findViewById(R.id.devModeTagTextView);
        this.f2924t = (ImageView) view.findViewById(R.id.devModeTagImageView);
        this.f2909d = (ImageView) view.findViewById(R.id.nfcIcon);
        this.f2907b = (TextView) view.findViewById(R.id.nfcStatus);
        this.f2910e = (RelativeLayout) view.findViewById(R.id.nfcLayout);
        ImageView imageView = (ImageView) view.findViewById(R.id.nfcBackButton);
        this.f2915j = imageView;
        imageView.setEnabled(true);
        if (FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f2915j.setImageDrawable(ContextCompat.getDrawable(getActivity(), ba.ay()));
        }
        int i2 = AnonymousClass19.Code[FaceTecSDK.V.f2853d.V.ordinal()];
        if (i2 == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f2915j.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            this.f2915j.setLayoutParams(layoutParams);
        } else if (i2 == 3 || i2 == 4) {
            this.f2915j.setVisibility(8);
        }
        this.f2915j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.ap.23
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (ap.this.f2926v) {
                    return;
                }
                ap.V(ap.this);
                float fCode = ba.Code();
                float fV = ba.V();
                int iZ = ba.Z();
                int iV = (int) (ce.V(ba.Code) * fV * fCode);
                float f2 = iZ / 2.0f;
                int iRound = Math.round(f2);
                int iRound2 = Math.round(f2);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) ap.this.f2915j.getLayoutParams();
                layoutParams2.setMargins(iRound, iRound, 0, 0);
                layoutParams2.setMarginStart(iRound);
                layoutParams2.setMarginEnd(iRound);
                ap.this.f2915j.setLayoutParams(layoutParams2);
                ap.this.f2915j.setPadding(iRound2, iRound2, iRound2, iRound2);
                ap.this.f2915j.getLayoutParams().height = iV;
                ap.this.f2915j.getLayoutParams().width = iV;
                ap.this.f2915j.requestLayout();
            }
        });
        this.f2915j.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.ap.25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Callback.onClick_enter(view2);
                try {
                    ((FaceTecSessionActivity) ap.this.getActivity()).c();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        this.f2915j.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.ap.21
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    ap.this.f2915j.setAlpha(0.4f);
                } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > ap.this.f2915j.getWidth() + ap.this.f2915j.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > ap.this.f2915j.getHeight() + ap.this.f2915j.getTop() + 10) {
                    ap.this.f2915j.setAlpha(1.0f);
                } else if (motionEvent.getAction() == 1) {
                    ap.this.f2915j.setAlpha(1.0f);
                    ap.this.f2915j.performClick();
                }
                return true;
            }
        });
        if (Z.V(getActivity()) && FaceTecSDK.V.Z) {
            Activity activity = getActivity();
            short sXd = (short) (C1580rY.Xd() ^ (-22920));
            short sXd2 = (short) (C1580rY.Xd() ^ (-26192));
            int[] iArr = new int["N\\Sb`[W\"Xeel^ho*@mmtfzw".length()];
            QB qb = new QB("N\\Sb`[W\"Xeel^ho*@mmtfzw");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(C1561oA.od("\u0018\u0015#}\u000e\u000f\u0016\u000b\u0010\rt\u0007\u0012\t", (short) (C1633zX.Xd() ^ (-10752))), new Class[0]);
            try {
                method.setAccessible(true);
                if (!((String) method.invoke(activity, objArr)).contains(C1561oA.Kd("]ji+d`cfvhg3\u0001vwvvzsv|", (short) (C1580rY.Xd() ^ (-10124))))) {
                    Activity activity2 = getActivity();
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Wg.Zd("\u001f\u0018icuW2e~vS\u0001I<\u001e\u0003=Qo_$#<", (short) (Od.Xd() ^ (-9870)), (short) (Od.Xd() ^ (-16175)))).getMethod(C1561oA.Xd("ON^;MPYPWV@TaZ", (short) (ZN.Xd() ^ 5734)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        if (!((String) method2.invoke(activity2, objArr2)).contains(Wg.vd("\u0014\u0013T\u000e\u0002\u0005\b\u0018\u0012\u0011\\ \u0011\u0019\u001f\u001b}y\u0004x\u0005tz\b\u0002\u0011\u0013\u0005\u000b", (short) (C1499aX.Xd() ^ (-32569))))) {
                            float fCode = ba.Code() * ba.V();
                            this.f2923r.setTypeface(FaceTecSDK.V.F.messageFont);
                            this.f2923r.setTextSize(2, 14.0f * fCode);
                            ba.I(this.f2923r);
                            this.f2924t.setColorFilter(ba.v(), PorterDuff.Mode.SRC_IN);
                            this.f2924t.getLayoutParams().height = (int) (ce.V(18) * fCode);
                            this.f2924t.getLayoutParams().width = (int) (ce.V(18) * fCode);
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f2908c.getLayoutParams();
                            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = ba.Z();
                            ((ViewGroup.LayoutParams) layoutParams2).height = (int) (ce.V(26) * fCode);
                            this.f2908c.setLayoutParams(layoutParams2);
                            this.f2908c.requestLayout();
                            this.f2908c.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.ap.22
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) throws Exception {
                                    Callback.onClick_enter(view2);
                                    try {
                                        ap.this.f2908c.setEnabled(false);
                                        ap.this.f2908c.setClickable(false);
                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://dev.facetec.com/removing-development-mode-watermark"));
                                        ap apVar = ap.this;
                                        CX.ud();
                                        apVar.startActivity(intent);
                                    } finally {
                                        Callback.onClick_exit();
                                    }
                                }
                            });
                            this.f2908c.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.ap.29
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                    if (motionEvent.getAction() == 0) {
                                        ap.this.f2908c.setAlpha(0.4f);
                                    } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > ap.this.f2908c.getWidth() + ap.this.f2908c.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > ap.this.f2908c.getHeight() + 10) {
                                        ap.this.f2908c.setAlpha(1.0f);
                                    } else if (motionEvent.getAction() == 1) {
                                        ap.this.f2908c.performClick();
                                    }
                                    return true;
                                }
                            });
                            this.f2908c.setVisibility(0);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        ba.I(this.B);
        if (!this.f2912g) {
            this.B.getBackground().setAlpha(ba.aB());
        }
        float fCode2 = ba.Code() * ba.V();
        float fAP = ba.aP();
        int iZ = ba.Z();
        int iRound = Math.round(ce.V(ba.C) * fAP * fCode2);
        int iRound2 = Math.round(ce.V(ba.F) * fCode2);
        int iRound3 = Math.round(ce.V(ba.S) * fCode2);
        int iRound4 = Math.round(ce.V(6) * fCode2);
        int iRound5 = Math.round(ce.V(ba.Z) * fCode2);
        bf bfVar = (bf) view.findViewById(R.id.nfcSkipButton);
        this.f2913h = bfVar;
        bfVar.setupButtonForIdentityCheck();
        this.f2913h.setText(bb.Z(R.string.FaceTec_action_skip_nfc));
        this.f2913h.setEnabled(false);
        this.f2913h.setOnClickListenerRunnable(new av(this) { // from class: com.facetec.sdk.ap.12
            @Override // com.facetec.sdk.av
            public final void B() {
                FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) ap.this.getActivity();
                if (faceTecSessionActivity != null) {
                    faceTecSessionActivity.y();
                }
            }
        });
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f2913h.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams3).height = iRound5;
        layoutParams3.setMargins(iZ, 0, iZ, iZ);
        this.f2913h.setLayoutParams(layoutParams3);
        this.L.setTranslationY(iRound3);
        this.f2921p.getLayoutParams().height = iRound;
        this.f2921p.getLayoutParams().width = iRound;
        this.S.setColorFilter(ba.b(getActivity()), PorterDuff.Mode.SRC_IN);
        this.C.setColorFilter(ba.d(getActivity()), PorterDuff.Mode.SRC_IN);
        this.f2909d.getLayoutParams().height = iRound2;
        LayerDrawable layerDrawable = (LayerDrawable) getResources().getDrawable(R.drawable.facetec_progress_bar);
        this.f2922q = layerDrawable;
        layerDrawable.mutate();
        Drawable drawable = this.f2922q.getDrawable(0);
        LayerDrawable layerDrawable2 = (LayerDrawable) ((ScaleDrawable) this.f2922q.getDrawable(1)).getDrawable();
        Drawable drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progressFill);
        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.progressGlow);
        float f2 = iRound4 / 2.0f;
        ((GradientDrawable) drawable).setCornerRadius(f2);
        ((GradientDrawable) drawableFindDrawableByLayerId).setCornerRadius(f2);
        ((GradientDrawable) drawableFindDrawableByLayerId2).setCornerRadius(f2);
        ba.Z(this.I, drawable);
        ba.V(this.I, drawableFindDrawableByLayerId, drawableFindDrawableByLayerId2);
        this.I.setProgressDrawable(this.f2922q);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.I.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams4).height = iRound4;
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = iZ;
        this.I.setLayoutParams(layoutParams4);
        this.I.setVisibility(0);
        ba.I(this.V);
        ba.I(this.Code);
        ba.I(this.f2907b);
        this.V.setTypeface(FaceTecSDK.V.F.messageFont);
        this.Code.setTypeface(FaceTecSDK.V.F.messageFont);
        this.f2907b.setTypeface(FaceTecSDK.V.F.messageFont);
        if (this.f2912g) {
            bb.B(this.V, R.string.FaceTec_result_idscan_upload_message);
            if (this.f2919n == Code.NFC) {
                bb.B(this.V, R.string.FaceTec_result_nfc_upload_message);
            } else {
                bb.B(this.V, R.string.FaceTec_result_idscan_upload_message);
            }
        } else {
            bb.B(this.V, R.string.FaceTec_result_facescan_upload_message);
        }
        this.V.setTextSize(2, ba.f2968h * fCode2);
        this.f2907b.setTextSize(2, ba.f2968h * fCode2);
        this.Code.setTextSize(2, ba.f2968h * fCode2);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.V.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = iZ;
        ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = iZ;
        ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = iZ;
        this.V.setLayoutParams(layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.Code.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = iZ;
        ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = iZ;
        ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = iZ;
        this.Code.setLayoutParams(layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.f2907b.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = iZ;
        ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = iZ;
        ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = iZ;
        this.f2907b.setLayoutParams(layoutParams7);
        ViewGroup.LayoutParams layoutParams8 = this.Z.getLayoutParams();
        layoutParams8.height = iRound;
        layoutParams8.width = iRound;
        this.Z.setLayoutParams(layoutParams8);
        int iAx = ba.ax();
        int iAH = ba.aH();
        if (iAH != 0) {
            this.f2918m = V(getActivity(), iAH);
        }
        if (this.f2918m != null) {
            Class<?> cls = Class.forName(Qg.kd("\u001f+ -)\"\u001cd%(a~!  \u0014 ", (short) (Od.Xd() ^ (-17989)), (short) (Od.Xd() ^ (-16665))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr3 = new Object[0];
            short sXd3 = (short) (ZN.Xd() ^ 932);
            short sXd4 = (short) (ZN.Xd() ^ 14304);
            int[] iArr2 = new int["ur\u0001XkrvSuttht".length()];
            QB qb2 = new QB("ur\u0001XkrvSuttht");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2) + sXd4);
                i4++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i4), clsArr);
            try {
                declaredMethod.setAccessible(true);
                Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr3));
                AnonymousClass11 anonymousClass11 = new AnonymousClass11(this, handler);
                short sXd5 = (short) (Od.Xd() ^ (-4865));
                int[] iArr3 = new int["DPERNGA\nJM\u0007 8D9@8D".length()];
                QB qb3 = new QB("DPERNGA\nJM\u0007 8D9@8D");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(sXd5 + i5 + xuXd3.CK(iKK3));
                    i5++;
                }
                Class<?> cls2 = Class.forName(new String(iArr3, 0, i5));
                Class<?>[] clsArr2 = {Class.forName(C1561oA.yd("\u0018\u0010&\u0012_\u001f\u0015#\rTy\u001e\u0018\u0019\r\u000f*$", (short) (C1499aX.Xd() ^ (-5852))))};
                Object[] objArr4 = {anonymousClass11};
                short sXd6 = (short) (FB.Xd() ^ 4285);
                int[] iArr4 = new int["\u001e\u001e#%".length()];
                QB qb4 = new QB("\u001e\u001e#%");
                int i6 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd6 + sXd6) + sXd6) + i6));
                    i6++;
                }
                Method method3 = cls2.getMethod(new String(iArr4, 0, i6), clsArr2);
                try {
                    method3.setAccessible(true);
                    method3.invoke(handler, objArr4);
                    this.Z.setVisibility(0);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } else if (iAx != 0) {
            this.Z.setImageResource(iAx);
            this.Z.clearAnimation();
            this.Z.setVisibility(0);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration(FaceTecSDK.V.F.customActivityIndicatorRotationInterval);
            rotateAnimation.setRepeatCount(-1);
            this.Z.startAnimation(rotateAnimation);
        } else {
            Object[] objArr5 = new Object[0];
            Method declaredMethod2 = Class.forName(Xg.qd("BPGVTOK\u0016X]\u00198\\]_Uc", (short) (C1580rY.Xd() ^ (-8399)), (short) (C1580rY.Xd() ^ (-13447)))).getDeclaredMethod(Jg.Wd("}V7\u0019>O&2\u001f`jp\u0007", (short) (C1580rY.Xd() ^ (-17146)), (short) (C1580rY.Xd() ^ (-25290))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Handler handler2 = new Handler((Looper) declaredMethod2.invoke(null, objArr5));
                Object[] objArr6 = {new av(this) { // from class: com.facetec.sdk.ap.15
                    @Override // com.facetec.sdk.av
                    public final void B() {
                        ap apVar = ap.this;
                        apVar.f2916k = ap.V(apVar.getActivity(), R.drawable.facetec_animated_activity_indicator_vector_drawable);
                        ap.this.Z.setColorFilter(ba.z(), PorterDuff.Mode.SRC_IN);
                        ap.this.Z.setImageDrawable(ap.this.f2916k);
                        ap.this.f2916k.start();
                        ap.this.Z.setVisibility(0);
                    }
                }};
                Method method4 = Class.forName(ZO.xd(")-IuurJw3sIKr<J0I\u0011", (short) (FB.Xd() ^ 25856), (short) (FB.Xd() ^ 4237))).getMethod(Ig.wd("\u001bt\u0005$", (short) (OY.Xd() ^ 7402)), Class.forName(C1626yg.Ud("a\u0004&,0/G\u001d[\u0003SU\r\u00056!$i", (short) (OY.Xd() ^ 16603), (short) (OY.Xd() ^ 6785))));
                try {
                    method4.setAccessible(true);
                    method4.invoke(handler2, objArr6);
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        }
        boolean z2 = this.f2912g && FaceTecCustomization.f2849h != null;
        this.f2925u = z2;
        if (z2) {
            Handler handler3 = f2905w;
            Object[] objArr7 = {this.E};
            Method method5 = Class.forName(EO.Od("2m\u0014<Z1\u0002&68n-\u0011.\u001eJ\u007f\u0015", (short) (OY.Xd() ^ 23512))).getMethod(C1593ug.zd("kkpr", (short) (FB.Xd() ^ 14113), (short) (FB.Xd() ^ 27904)), Class.forName(C1561oA.Qd("wm\u0002k7thtl2Uwon``ia", (short) (C1633zX.Xd() ^ (-30136)))));
            try {
                method5.setAccessible(true);
                method5.invoke(handler3, objArr7);
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        }
        if (FaceTecSDK.V.F.showUploadProgressBar) {
            this.I.setVisibility(0);
            getActivity().runOnUiThread(new av(this) { // from class: com.facetec.sdk.ap.18
                @Override // com.facetec.sdk.av
                public final void B() {
                    ap apVar = ap.this;
                    apVar.f2906a = ObjectAnimator.ofInt(apVar.I, "progress", ap.this.I.getProgress(), 3000);
                    ap.this.f2906a.setDuration(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec);
                    ap.this.f2906a.start();
                }
            });
        } else {
            this.I.setVisibility(4);
        }
        getActivity().runOnUiThread(new av(this) { // from class: com.facetec.sdk.ap.24
            @Override // com.facetec.sdk.av
            public final void B() {
                ap.this.L.animate().alpha(1.0f).setDuration(800L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
            }
        });
    }
}
