package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.ad;
import com.facetec.sdk.ca;
import com.facetec.sdk.g;
import com.facetec.sdk.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends Fragment {
    protected ImageView B;
    protected View C;
    protected RelativeLayout Code;
    protected bf I;
    protected ViewGroup L;
    protected ViewGroup S;
    protected bs V;
    protected ImageView Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f3103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Animator f3104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f3105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f3106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected av f3107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f3108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f3109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f3110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animator f3111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f3112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AnimatorSet f3113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ad.Z f3114l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f3116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Runnable f3117o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Handler f3118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f3119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ca f3120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ca.Z f3121t;
    protected boolean F = false;
    protected boolean D = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f3115m = false;

    /* JADX INFO: renamed from: com.facetec.sdk.e$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] B;
        static final /* synthetic */ int[] I;
        static final /* synthetic */ int[] Z;

        static {
            int[] iArr = new int[FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            I = iArr;
            try {
                iArr[FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                I[FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                I[FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                I[FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[aj.values().length];
            B = iArr2;
            try {
                iArr2[aj.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                B[aj.DARK_AS_POSSIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                B[aj.BRIGHT_AS_POSSIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[an.values().length];
            Z = iArr3;
            try {
                iArr3[an.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Z[an.DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    class B implements ad.Z {
        private B() {
        }

        /* synthetic */ B(e eVar, byte b2) {
            this();
        }

        @Override // com.facetec.sdk.ad.Z
        public final void Code(al alVar, aj ajVar, ak akVar, an anVar) throws Throwable {
            final o oVarC;
            if (e.this.F || (oVarC = e.this.C()) == null) {
                return;
            }
            if (alVar == al.TIMEOUT_GO_TO_RETRY) {
                if (oVarC.Z != null && ad.S() && e.this.L()) {
                    e.I(e.this);
                    e.this.c().B();
                    return;
                } else {
                    e.V(e.this, anVar);
                    e.I(e.this);
                    oVarC.F();
                    return;
                }
            }
            if (alVar != al.DETECTING_LIGHT_MODE) {
                e.I(e.this);
                return;
            }
            e.V(e.this, anVar);
            int i2 = AnonymousClass3.B[ajVar.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    oVarC.j();
                }
            } else if (FaceTecSDK.Z != FaceTecSDK.Code.BRIGHT_LIGHT) {
                FaceTecSDK.Z = FaceTecSDK.Code.BRIGHT_LIGHT;
                ai.r();
                oVarC.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.k();
                        o.this.h();
                    }
                });
            }
            if (anVar != an.ENABLE) {
                e.this.e();
                return;
            }
            boolean zL = e.this.L();
            boolean z2 = e.this.D;
            boolean zIsEnabled = e.this.I.isEnabled();
            boolean z3 = e.this.f3107e != null;
            if (zL && z2 && zIsEnabled && !z3) {
                e.V(e.this);
            }
        }
    }

    public e() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("1=2?;4.v7:s\u0011322&2", (short) (C1580rY.Xd() ^ (-24766)), (short) (C1580rY.Xd() ^ (-4688)))).getDeclaredMethod(yg.hg.Vd("\u0003\u007f\u000eex\u007f\u0004`\u0003\u0002\u0002u\u0002", (short) (Od.Xd() ^ (-18171)), (short) (Od.Xd() ^ (-16847))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.f3118q = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.f3107e = null;
            this.f3121t = new ca.Z() { // from class: com.facetec.sdk.e.2
                @Override // com.facetec.sdk.ca.Z
                public final void Code() {
                    o oVarC = e.this.C();
                    if (oVarC != null) {
                        oVarC.j();
                    }
                }
            };
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ void Code(e eVar) {
        eVar.F = true;
        eVar.B.setEnabled(false);
        eVar.I(false);
        eVar.I.setEnabled(false, true);
        eVar.f3104b = ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 0.0f).setDuration(1000L);
        eVar.d();
    }

    static /* synthetic */ void I(e eVar) {
        ca caVar = eVar.f3120s;
        if (caVar != null) {
            caVar.Z();
            eVar.f3120s = null;
        }
        ad adVarS = eVar.S();
        if (adVarS != null) {
            adVarS.Code(eVar.f3114l);
            eVar.f3114l = null;
        }
    }

    static /* synthetic */ void V(e eVar) throws Throwable {
        eVar.e();
        av avVarC = eVar.c();
        eVar.f3107e = avVarC;
        Handler handler = eVar.f3118q;
        Class<?> cls = Class.forName(C1561oA.ud("AMBOKD>\u0007GJ\u0004\u001d5A6=5A", (short) (Od.Xd() ^ (-24999))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1633zX.Xd() ^ (-15884));
        int[] iArr = new int["_UiS\u001f\\P\\T\u001a=_WVHHQI".length()];
        QB qb = new QB("_UiS\u001f\\P\\T\u001a=_WVHHQI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {avVarC, 2000L};
        Method method = cls.getMethod(C1561oA.Yd("\u0019\u0019\u001e p\u0013\u001b\u0011*\u0017\u0017", (short) (C1580rY.Xd() ^ (-18214))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ void V(e eVar, an anVar) {
        if (eVar.L()) {
            int i2 = AnonymousClass3.Z[anVar.ordinal()];
            if (i2 == 1) {
                if (eVar.I.isEnabled()) {
                    return;
                }
                eVar.I.setEnabled(true, true);
            } else if (i2 == 2 && eVar.I.isEnabled() && !eVar.D) {
                eVar.I.setEnabled(false, true);
            }
        }
    }

    private void a() throws Throwable {
        this.f3116n = new Handler();
        Runnable runnable = new Runnable() { // from class: com.facetec.sdk.e.6
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (!e.this.I.D && !e.this.F && e.this.I.isEnabled()) {
                    e.this.I.setEnabled(true, false);
                }
                Handler handler = e.this.f3116n;
                Object[] objArr = {this, 5000L};
                Method method = Class.forName(C1561oA.ud("t\u0001u\u0003~wq:z}7Phtipht", (short) (Od.Xd() ^ (-946)))).getMethod(C1561oA.Yd("$$)+{\u001e&\u001c5\"\"", (short) (C1633zX.Xd() ^ (-19977))), Class.forName(C1561oA.yd("\u0010\b\u001a\u0006W\u0017\t\u0017\u0015\\}\" !\u0011\u0013\"\u001c", (short) (FB.Xd() ^ 24177))), Long.TYPE);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        };
        this.f3117o = runnable;
        Handler handler = this.f3116n;
        Object[] objArr = {runnable};
        Method method = Class.forName(Xg.qd(";I@OMHD\u000fQV\u0012-GULUO]", (short) (ZN.Xd() ^ 30673), (short) (ZN.Xd() ^ 6652))).getMethod(ZO.xd("Vh~ ", (short) (C1633zX.Xd() ^ (-26476)), (short) (C1633zX.Xd() ^ (-27932))), Class.forName(Jg.Wd(":Y\u0012\bv\u007f\u0018mM;'p1\u0018\u000fzHk", (short) (C1499aX.Xd() ^ (-14142)), (short) (C1499aX.Xd() ^ (-20885)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ boolean a(e eVar) {
        eVar.f3115m = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public av c() {
        return new av(this) { // from class: com.facetec.sdk.e.8
            @Override // com.facetec.sdk.av
            final void B() {
                e.this.e();
                boolean zL = e.this.L();
                boolean z2 = e.this.D;
                boolean zIsEnabled = e.this.I.isEnabled();
                if (zL && z2 && zIsEnabled) {
                    e.Code(e.this);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f3118q.removeCallbacksAndMessages(null);
        this.f3107e = null;
    }

    private void g() {
        if (C() == null) {
            return;
        }
        ax.Code(new Runnable() { // from class: com.facetec.sdk.e.9
            @Override // java.lang.Runnable
            public final void run() {
                e.this.f3120s = new ca(e.this.C());
            }
        });
    }

    protected abstract void B();

    protected final void B(final Runnable runnable, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3113k = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.S, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f));
        this.f3113k.setDuration(i2);
        this.f3113k.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.e.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                runnable.run();
            }
        });
        this.f3113k.start();
    }

    final o C() {
        return (o) getActivity();
    }

    protected abstract void Code();

    final void Code(boolean z2, int i2, int i3) {
        ImageView imageView = this.Z;
        if (imageView == null) {
            imageView = this.B;
        }
        float f2 = z2 ? 1.0f : 0.0f;
        if (i2 == 0 && i3 == 0) {
            imageView.setAlpha(f2);
        } else {
            imageView.animate().alpha(f2).setDuration(i2).setStartDelay(i3).setListener(null).start();
        }
    }

    final g D() {
        return (g) getActivity();
    }

    final void F() {
        if (FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            ImageView imageView = this.B;
            if (imageView == null) {
                a.V(C(), V.NON_FATAL_ERROR, "backButton is null unexpectedly.");
            } else {
                imageView.setImageResource(ba.ay());
            }
        }
        bf bfVar = this.I;
        if (bfVar.C != FaceTecSDK.Z) {
            bfVar.C = FaceTecSDK.Z;
            bfVar.S = 1000;
            bfVar.B(true);
        }
        V();
    }

    protected abstract void I();

    final void I(boolean z2) {
        ImageView imageView = this.Z;
        if (imageView == null) {
            return;
        }
        imageView.setEnabled(z2);
    }

    protected abstract boolean L();

    protected final ad S() {
        o oVarC = C();
        if (oVarC != null) {
            return oVarC.Z;
        }
        return null;
    }

    protected abstract void V();

    protected final void V(final Context context) throws Throwable {
        o oVarC = C();
        if (oVarC != null) {
            oVarC.aa = o.L.PRE_SESSION_STARTED;
        }
        Class<?> cls = Class.forName(C1626yg.Ud("_3r6J}385eUiT\u001d\u000e\t\u0010", (short) (C1499aX.Xd() ^ (-15967)), (short) (C1499aX.Xd() ^ (-11230))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-23473));
        int[] iArr = new int["6zg!L\u001fP66\u0003\u000e\\:".length()];
        QB qb = new QB("6zg!L\u001fP66\u0003\u000e\\:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.f3119r = handler;
            Object[] objArr2 = {new av(this) { // from class: com.facetec.sdk.e.7
                @Override // com.facetec.sdk.av
                public final void B() {
                    ad adVarS = e.this.S();
                    if (adVarS != null) {
                        e.this.f3114l = new B(e.this, (byte) 0);
                        adVarS.V(e.this.f3114l);
                        if (adVarS.Code(context) || e.this.C() == null) {
                            return;
                        }
                        e.this.C().Code(bo.f3046j);
                    }
                }
            }, 20L};
            Method method = Class.forName(EO.Od("6zT<c#D\u0017,}PR\u001b\u001c0 >g", (short) (ZN.Xd() ^ 6131))).getMethod(C1593ug.zd("\"\"')y\u001c$\u001a3  ", (short) (Od.Xd() ^ (-26230)), (short) (Od.Xd() ^ (-5523))), Class.forName(C1561oA.Qd("cYmW#`T`X\u001eAc[ZLLUM", (short) (C1499aX.Xd() ^ (-2278)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
                a();
                if (FaceTecSDK.Z == FaceTecSDK.Code.NORMAL) {
                    if (S() != null) {
                        g();
                    }
                    Handler handler2 = this.f3119r;
                    Object[] objArr3 = {new av(this) { // from class: com.facetec.sdk.e.10
                        @Override // com.facetec.sdk.av
                        public final void B() {
                            ad adVarS = e.this.S();
                            if (e.this.f3120s == null || adVarS == null) {
                                return;
                            }
                            e.this.f3120s.V(e.this.f3121t, adVarS);
                        }
                    }, 185L};
                    Method method2 = Class.forName(C1561oA.od("LXMZVOI\u0012RU\u000f(@LAH@L", (short) (C1499aX.Xd() ^ (-25942)))).getMethod(Wg.Zd("\u0002 Q\u0006\u0003T\t1v\u0012?", (short) (Od.Xd() ^ (-12446)), (short) (Od.Xd() ^ (-30170))), Class.forName(C1561oA.Kd("kcye3rhvp8]\u0002{|pr}w", (short) (C1607wl.Xd() ^ 12322))), Long.TYPE);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(handler2, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    protected abstract void Z();

    public void Z(boolean z2) {
        this.F = z2;
    }

    void b() {
        this.B.setEnabled(false);
        I(false);
        if (FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.B.setImageResource(ba.ay());
        }
        int i2 = AnonymousClass3.I[FaceTecSDK.V.f2853d.V.ordinal()];
        if (i2 == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            this.B.setLayoutParams(layoutParams);
        } else if (i2 == 3 || i2 == 4) {
            this.B.setVisibility(8);
        }
        final float fCode = ba.Code() * ba.V();
        ba.B(this.Code);
        this.f3106d.setTypeface(bn.I);
        this.f3106d.setTextSize(2, ba.f2961a * fCode);
        ba.Z(this.f3106d);
        this.f3106d.setLineSpacing(0.0f, ba.V);
        this.f3105c.setTypeface(bn.Code);
        ba.Z(this.f3105c);
        this.f3105c.setTypeface(bn.Code);
        this.f3105c.setTextSize(2, ba.f2962b * fCode);
        this.f3105c.setLineSpacing(0.0f, ba.V);
        this.f3103a.setTypeface(bn.I);
        this.f3108f.setTypeface(bn.I);
        this.f3112j.setTypeface(bn.I);
        this.f3109g.setTypeface(bn.I);
        this.f3103a.setTextSize(2, ba.f2961a * fCode);
        this.f3108f.setTextSize(2, ba.f2961a * fCode);
        this.f3112j.setTextSize(2, ba.f2961a * fCode);
        this.f3109g.setTextSize(2, ba.f2961a * fCode);
        this.f3103a.setLineSpacing(0.0f, ba.V);
        this.f3108f.setLineSpacing(0.0f, ba.V);
        this.f3112j.setLineSpacing(0.0f, ba.V);
        this.f3109g.setLineSpacing(0.0f, ba.V);
        ba.Z(this.f3103a);
        ba.Z(this.f3108f);
        ba.Z(this.f3112j);
        ba.Z(this.f3109g);
        this.I.setEnabled(false);
        this.I.setupButton();
        this.I.setAlpha(0.0f);
        this.C.setAlpha(0.0f);
        Code(false, 0, 0);
        this.I.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.e.11
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (e.this.f3115m) {
                    return;
                }
                e.a(e.this);
                int iV = (int) (ce.V(ba.Z) * fCode);
                int iV2 = (int) (ce.V(ba.Code) * fCode);
                int iZ = ba.Z();
                float f2 = iZ / 2.0f;
                int iRound = Math.round(f2);
                int iRound2 = Math.round(f2);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) e.this.L.getLayoutParams();
                layoutParams2.setMargins(0, 0, 0, iZ);
                e.this.L.setLayoutParams(layoutParams2);
                e.this.I.setLayoutParams(new LinearLayout.LayoutParams((int) ((Resources.getSystem().getDisplayMetrics().widthPixels * ba.V()) - (iZ << 1)), iV));
                e.this.I.requestLayout();
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) e.this.B.getLayoutParams();
                layoutParams3.setMargins(iRound, iRound, 0, 0);
                layoutParams3.setMarginStart(iRound);
                layoutParams3.setMarginEnd(iRound);
                e.this.B.setLayoutParams(layoutParams3);
                e.this.B.setPadding(iRound2, iRound2, iRound2, iRound2);
                e.this.B.getLayoutParams().height = iV2;
                e.this.B.getLayoutParams().width = iV2;
                e.this.B.requestLayout();
                e.this.C.animate().alpha(1.0f).setDuration(300L).setListener(null).start();
            }
        });
        ce.I(getActivity());
        this.B.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.e.14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    e.this.B.setAlpha(1.0f);
                    e.this.B.setEnabled(false);
                    e.this.I(false);
                    e.this.I.setEnabled(false, true);
                    e.this.Z();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        this.B.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.e.15
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    e.this.B.setAlpha(0.4f);
                } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > e.this.B.getWidth() + e.this.B.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > e.this.B.getHeight() + e.this.B.getTop() + 10) {
                    e.this.B.setAlpha(1.0f);
                } else if (motionEvent.getAction() == 1) {
                    e.this.B.performClick();
                }
                return true;
            }
        });
        this.I.setOnClickListenerRunnable(new av(this) { // from class: com.facetec.sdk.e.4
            @Override // com.facetec.sdk.av
            final void B() {
                e.Code(e.this);
            }
        });
        this.f3110h.post(new av(this) { // from class: com.facetec.sdk.e.5
            @Override // com.facetec.sdk.av
            public final void B() {
                if (e.this.getActivity() != null) {
                    e.this.I(true);
                    e.this.B.setEnabled(true);
                    e.this.I.setEnabled(true);
                    e.this.I();
                }
            }
        });
    }

    protected void d() {
        B();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public Animator onCreateAnimator(int i2, boolean z2, int i3) {
        Animator animator;
        Animator animator2;
        return (!z2 || (animator2 = this.f3111i) == null) ? (z2 || (animator = this.f3104b) == null) ? super.onCreateAnimator(i2, z2, i3) : animator : animator2;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.facetec_guidance_fragment, viewGroup, false);
        this.f3110h = viewInflate;
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onPause() {
        Runnable runnable;
        super.onPause();
        this.f3110h.removeCallbacks(null);
        AnimatorSet animatorSet = this.f3113k;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Handler handler = this.f3116n;
        if (handler == null || (runnable = this.f3117o) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        bq.B = false;
        this.C = view.findViewById(R.id.centerContentView);
        this.V = (bs) view.findViewById(R.id.zoomDialogBackground);
        this.L = (ViewGroup) view.findViewById(R.id.bottomLayout);
        this.S = (ViewGroup) view.findViewById(R.id.zoomDialogForeground);
        this.B = (ImageView) view.findViewById(R.id.backButton);
        this.f3106d = (TextView) view.findViewById(R.id.zoomDialogIconSubtext);
        view.findViewById(R.id.zoomDialogImage);
        this.f3105c = (TextView) view.findViewById(R.id.zoomDialogHeader);
        this.f3103a = (TextView) view.findViewById(R.id.zoomDialogText1);
        this.f3108f = (TextView) view.findViewById(R.id.zoomDialogText2);
        this.f3112j = (TextView) view.findViewById(R.id.zoomDialogText3);
        this.f3109g = (TextView) view.findViewById(R.id.zoomDialogText4);
        this.I = (bf) view.findViewById(R.id.zoomDialogActionButton);
        this.Code = (RelativeLayout) view.findViewById(R.id.guidanceTransitionView);
        o oVarC = C();
        if (S() != null && oVarC != null && oVarC.V() == g.Z.GRANTED) {
            V(oVarC);
        }
        this.Z = oVarC.f3275g;
        b();
    }
}
