package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.facetec.sdk.GuidanceCenterContentFragment;
import com.facetec.sdk.bg;
import com.facetec.sdk.g;
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
public final class p extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f3295c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g.Z f3296a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    GuidanceCenterContentFragment f3297d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private GuidanceCenterContentFragment f3298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f3299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f3300h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f3302j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3301i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f3303l = new Runnable() { // from class: com.facetec.sdk.p.1
        @Override // java.lang.Runnable
        public final void run() {
            bg.B(p.this.D(), bg.V.GET_READY_PRESS_BUTTON_DELAYED);
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.p$5, reason: invalid class name */
    final class AnonymousClass5 extends av implements ValueAnimator.AnimatorUpdateListener {
        AnonymousClass5(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            p.this.V.V();
            if (p.this.f3297d == null || p.this.f3297d.Z == null || p.this.f3297d.L == null || p.this.f3297d.S == null || p.this.f3297d.D == null) {
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(p.this.f3297d.Z.getCurrentTextColor()), Integer.valueOf(ba.L(p.this.getActivity())));
            valueAnimatorOfObject.setDuration(1000L);
            valueAnimatorOfObject.addUpdateListener(this);
            valueAnimatorOfObject.start();
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(p.this.f3297d.Z.getCurrentTextColor()), Integer.valueOf(ba.D(p.this.getActivity())));
            valueAnimatorOfObject2.setDuration(1000L);
            valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.p.5.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (p.this.f3297d == null || !p.this.isAdded() || p.this.f3297d.S == null || p.this.f3297d.D == null) {
                        return;
                    }
                    p.this.f3297d.S.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    p.this.f3297d.D.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfObject2.start();
            if (p.this.f3297d.C.getBackground() == null && p.this.f3297d.F.getBackground() == null) {
                return;
            }
            ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(ba.Code(p.this.getActivity(), FaceTecSDK.V.D.readyScreenTextBackgroundColor)), Integer.valueOf(ba.Code(p.this.getActivity(), ba.H())));
            valueAnimatorOfObject3.setDuration(1000L);
            valueAnimatorOfObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.p.5.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (p.this.f3297d == null || !p.this.isAdded()) {
                        return;
                    }
                    if (p.this.f3297d.C != null && p.this.f3297d.C.getBackground() != null) {
                        ba.I(p.this.getActivity(), p.this.f3297d.f2857b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                        p.this.f3297d.C.setBackground(p.this.f3297d.f2857b);
                    }
                    if (p.this.f3297d.F == null || p.this.f3297d.F.getBackground() == null) {
                        return;
                    }
                    ba.I(p.this.getActivity(), p.this.f3297d.f2860e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    p.this.f3297d.F.setBackground(p.this.f3297d.f2860e);
                }
            });
            valueAnimatorOfObject3.start();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (p.this.f3297d == null || !p.this.isAdded() || p.this.f3297d.Z == null || p.this.f3297d.L == null) {
                return;
            }
            p.this.f3297d.Z.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            p.this.f3297d.L.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(GuidanceCenterContentFragment guidanceCenterContentFragment) throws Exception {
        FragmentManager fragmentManager = getFragmentManager();
        CX.ud();
        FragmentTransaction customAnimations = fragmentManager.beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0);
        int i2 = R.id.centerContentFrameLayout;
        CX.ud();
        customAnimations.replace(i2, guidanceCenterContentFragment).commitAllowingStateLoss();
    }

    static /* synthetic */ void Code(p pVar) throws Exception {
        pVar.f3297d = GuidanceCenterContentFragment.Code(R.string.FaceTec_instructions_header_ready_1, R.string.FaceTec_instructions_message_ready_2, GuidanceCenterContentFragment.ScreenType.READY_OVAL, pVar.V.F().top, pVar.V.F().bottom);
        pVar.f3298f.I.setVisibility(0);
        pVar.f3298f.V.setVisibility(0);
        pVar.I.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        pVar.Code(true, 500, 0);
        if (pVar.g()) {
            pVar.I.setEnabled(true);
            if (ba.I(pVar.getActivity()) != 0) {
                pVar.f3298f.Code.setImageDrawable(ContextCompat.getDrawable(pVar.getActivity(), ba.I(pVar.getActivity())));
                pVar.f3298f.Code.setVisibility(0);
            } else {
                pVar.f3298f.Code.setVisibility(8);
            }
            pVar.f3298f.B.setVisibility(0);
            bb.B(pVar.f3298f.I, R.string.FaceTec_camera_permission_header);
            pVar.f3298f.B(R.string.FaceTec_camera_permission_message_enroll);
            if (pVar.f3296a == g.Z.NOT_GRANTED) {
                bb.B(pVar.I, R.string.FaceTec_camera_permission_enable_camera);
            } else {
                bb.B(pVar.I, R.string.FaceTec_camera_permission_launch_settings);
            }
        } else {
            pVar.I.setEnabled(false);
            pVar.B(pVar.f3297d);
            pVar.V.V.setAlpha(255);
            pVar.V.B();
            Handler handler = new Handler();
            av avVar = new av(pVar) { // from class: com.facetec.sdk.p.4
                @Override // com.facetec.sdk.av
                public final void B() {
                    if (p.this.V != null) {
                        p.this.V.Z();
                    }
                }
            };
            Class<?> cls = Class.forName(Qg.kd("\u0004\u0010\u0005\u0012\u000e\u0007\u0001I\n\rF_w\u0004x\u007fw\u0004", (short) (FB.Xd() ^ 10962), (short) (FB.Xd() ^ 9029)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (Od.Xd() ^ (-18482));
            short sXd2 = (short) (Od.Xd() ^ (-2009));
            int[] iArr = new int[";1E/z8,80u\u0019;32$$-%".length()];
            QB qb = new QB(";1E/z8,80u\u0019;32$$-%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Long.TYPE;
            Object[] objArr = {avVar, 1000L};
            Method method = cls.getMethod(C1561oA.ud("truuDdj^u`^", (short) (OY.Xd() ^ 2973)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                pVar.f3301i = 2;
                pVar.Code(false);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        pVar.S.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(pVar.S, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.start();
        a.V(pVar.D(), V.GET_READY_IM_READY_SHOWN_AND_READY, null);
    }

    private void Code(boolean z2) throws Throwable {
        this.V.B(ba.aB(), 1000, 500);
        if (z2) {
            this.Code.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new av(this) { // from class: com.facetec.sdk.p.6
                @Override // com.facetec.sdk.av
                final void B() throws Exception {
                    if (p.this.f3297d == null || !p.this.isAdded()) {
                        return;
                    }
                    p pVar = p.this;
                    pVar.B(pVar.f3297d);
                    p.this.V.B();
                    bb.B(p.this.I, R.string.FaceTec_action_im_ready);
                    p.this.Code.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
                }
            }).start();
            this.f3301i++;
        } else {
            bb.B(this.I, R.string.FaceTec_action_im_ready);
        }
        this.B.setEnabled(true);
        I(true);
        this.I.setEnabled(false, true);
        Handler handler = new Handler();
        this.f3302j = handler;
        Object[] objArr = {new av(this) { // from class: com.facetec.sdk.p.9
            @Override // com.facetec.sdk.av
            final void B() {
                p.this.D = true;
                if (p.this.I.isEnabled()) {
                    return;
                }
                p.this.I.setEnabled(true, true);
            }
        }, 7000L};
        Method method = Class.forName(C1561oA.yd("GSLYYRP\u0019MP\u000e'COHO[g", (short) (OY.Xd() ^ 9953))).getMethod(Xg.qd("KKPR#EMC\\II", (short) (C1580rY.Xd() ^ (-15592)), (short) (C1580rY.Xd() ^ (-7362))), Class.forName(C1561oA.Yd("YQgS!`Vd^&Koij^`ke", (short) (Od.Xd() ^ (-3372)))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            if (FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                bg.B(D(), bg.V.GET_READY_FRAME_YOUR_FACE_AUTOMATIC);
                Handler handler2 = new Handler();
                this.f3300h = handler2;
                Object[] objArr2 = {this.f3303l, 4500L};
                Method method2 = Class.forName(Jg.Wd("nw**KwrNTJ!m\u00076X`o=", (short) (C1499aX.Xd() ^ (-23042)), (short) (C1499aX.Xd() ^ (-31431)))).getMethod(C1626yg.Ud("qh@\u0006;|\r3m}\r", (short) (ZN.Xd() ^ 2210), (short) (ZN.Xd() ^ 32317)), Class.forName(ZO.xd("dUzY2e8wO:PI'\\\u0019i=D", (short) (C1499aX.Xd() ^ (-29152)), (short) (C1499aX.Xd() ^ (-12860)))), Long.TYPE);
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler2, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static /* synthetic */ void I(p pVar) {
        pVar.I.setEnabled(false, true);
        pVar.B.setEnabled(false);
        pVar.I(false);
        g gVarD = pVar.D();
        if (gVarD != null) {
            gVarD.S();
        }
    }

    static p Z(g.Z z2) {
        p pVar = new p();
        Bundle bundle = new Bundle();
        bundle.putInt("PERMISSIONS_STATUS", z2.ordinal());
        pVar.setArguments(bundle);
        f3295c = false;
        return pVar;
    }

    private void c() {
        Handler handler = this.f3300h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3300h = null;
        }
    }

    private void e() {
        Handler handler = this.f3299g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3299g = null;
        }
    }

    private boolean g() {
        return this.f3296a != g.Z.GRANTED;
    }

    private void i() throws Throwable {
        if (this.f3299g == null) {
            this.f3299g = new Handler();
        }
        Handler handler = this.f3299g;
        Object[] objArr = {new av(this) { // from class: com.facetec.sdk.p.3
            @Override // com.facetec.sdk.av
            public final void B() {
                p.I(p.this);
            }
        }, 600000L};
        Method method = Class.forName(Ig.wd("\u0003hn\u001b\u000e*\u000f7)_\u001eT\"\u001f+O\u000b\b", (short) (FB.Xd() ^ 16179))).getMethod(C1561oA.Qd("*(++y\u001a \u0014+\u0016\u0014", (short) (C1499aX.Xd() ^ (-12234))), Class.forName(EO.Od("0W\u001d&$/\u0006]\u0015\u000e.q\u0015\u00152W\u000e\u0013", (short) (C1607wl.Xd() ^ 24686))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facetec.sdk.e
    protected final void B() {
        g gVarD = D();
        if (gVarD == null) {
            return;
        }
        if (g()) {
            gVarD.I();
        } else {
            this.I.setEnabled(false, true);
            this.I.setVisibility(4);
            f3295c = true;
            e();
            c();
            B(new av(this) { // from class: com.facetec.sdk.p.10
                @Override // com.facetec.sdk.av
                public final void B() {
                    g gVarD2 = p.this.D();
                    if (gVarD2 != null) {
                        gVarD2.e();
                        a.V(gVarD2, V.GET_READY_IM_READY_PRESSED, null);
                    }
                }
            }, 300);
        }
        Z(false);
    }

    @Override // com.facetec.sdk.e
    protected final void Code() {
    }

    @Override // com.facetec.sdk.e
    protected final void I() throws Exception {
        a.B = bo.D;
        this.C.setVisibility(8);
        B(this.f3298f);
        if (this.f3299g == null) {
            this.f3299g = new Handler();
        }
        Handler handler = this.f3299g;
        Object[] objArr = {new av(this) { // from class: com.facetec.sdk.p.2
            @Override // com.facetec.sdk.av
            public final void B() throws Exception {
                p.Code(p.this);
            }
        }};
        Method method = Class.forName(C1593ug.zd(",:1@>95\u007fBG\u0003\u001e8F=F@N", (short) (C1499aX.Xd() ^ (-11240)), (short) (C1499aX.Xd() ^ (-250)))).getMethod(C1561oA.Kd("XX]_", (short) (FB.Xd() ^ 14322)), Class.forName(C1561oA.od("^ThR\u001e[O[S\u0019<^VUGGPH", (short) (C1580rY.Xd() ^ (-17789)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facetec.sdk.e
    protected final boolean L() {
        return true;
    }

    @Override // com.facetec.sdk.e
    protected final void V() throws Throwable {
        Handler handler = new Handler();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this);
        Class<?> cls = Class.forName(Wg.Zd("?\u0019l\t2\u0007\u000b&9O6'U/s\u0015O\u0016", (short) (FB.Xd() ^ 2790), (short) (FB.Xd() ^ 8600)));
        Class<?>[] clsArr = {Class.forName(C1561oA.Xd("d\\r^,kaoi1Vztuikvp", (short) (C1607wl.Xd() ^ 17427)))};
        Object[] objArr = {anonymousClass5};
        short sXd = (short) (ZN.Xd() ^ 26267);
        int[] iArr = new int["SSXZ".length()];
        QB qb = new QB("SSXZ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
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

    @Override // com.facetec.sdk.e
    protected final void Z() {
        e();
        c();
        this.f3104b = null;
        g gVarD = D();
        if (gVarD == null) {
            return;
        }
        if (g()) {
            gVarD.i();
        } else {
            gVarD.a();
        }
    }

    @Override // com.facetec.sdk.e
    public final /* bridge */ /* synthetic */ void Z(boolean z2) {
        super.Z(z2);
    }

    final void a() throws Throwable {
        i();
        this.f3296a = g.Z.GRANTED;
        V(getActivity());
        ba.B(this.I, FaceTecSDK.V.D.buttonTextNormalColor);
        this.f3301i = 2;
        Code(true);
    }

    @Override // com.facetec.sdk.e
    final void b() {
        super.b();
        this.S.setVisibility(4);
    }

    @Override // com.facetec.sdk.e
    protected final void d() throws Exception {
        g gVarD = D();
        if (gVarD == null) {
            return;
        }
        if (!g()) {
            if (this.f3301i < 2) {
                Handler handler = new Handler();
                int i2 = this.f3301i;
                if (i2 == 0) {
                    this.f3301i = i2 + 1;
                }
                if (this.f3301i == 1) {
                    GuidanceCenterContentFragment guidanceCenterContentFragment = this.f3297d;
                    FragmentManager fragmentManager = getFragmentManager();
                    CX.ud();
                    FragmentTransaction customAnimations = fragmentManager.beginTransaction().setCustomAnimations(R.anim.facetec_slide_in_left, R.anim.facetec_slide_out_left);
                    int i3 = R.id.centerContentFrameLayout;
                    String strXd = ZO.xd("\rzme\u0001w\u0019Pc7dOE}k^!\t\u000b\f$\u0006 =", (short) (Od.Xd() ^ (-13762)), (short) (Od.Xd() ^ (-32057)));
                    CX.ud();
                    customAnimations.replace(i3, guidanceCenterContentFragment, strXd).commitAllowingStateLoss();
                    this.V.I();
                    av avVar = new av(this) { // from class: com.facetec.sdk.p.8
                        @Override // com.facetec.sdk.av
                        public final void B() {
                            bb.B(p.this.I, R.string.FaceTec_action_im_ready);
                        }
                    };
                    short sXd = (short) (C1607wl.Xd() ^ 15799);
                    short sXd2 = (short) (C1607wl.Xd() ^ 25536);
                    int[] iArr = new int["L.wb)>\u0015V[&H?\f(\u0001(=\u000f".length()];
                    QB qb = new QB("L.wb)>\u0015V[&H?\f(\u0001(=\u000f");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i4 * sXd2))) + xuXd.CK(iKK));
                        i4++;
                    }
                    Object[] objArr = {avVar, 900L};
                    Method method = Class.forName(new String(iArr, 0, i4)).getMethod(EO.Od("\u0018D<\u001c]K\\\u0004F%$", (short) (ZN.Xd() ^ 15701)), Class.forName(Ig.wd(")WX\u001d02Mo.Rv}H<w\u001b_n", (short) (FB.Xd() ^ 2625))), Long.TYPE);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Object[] objArr2 = {new av(this) { // from class: com.facetec.sdk.p.7
                    @Override // com.facetec.sdk.av
                    public final void B() {
                        p.this.B.setEnabled(true);
                        p.this.I(true);
                        p.this.I.setEnabled(true, true);
                    }
                }, 900L};
                Method method2 = Class.forName(C1561oA.Qd("\u001b'\u001c)%\u001e\u0018`!$]v\u000f\u001b\u0010\u0017\u000f\u001b", (short) (C1580rY.Xd() ^ (-30266)))).getMethod(C1561oA.od("#!$$r\u0013\u0019\r$\u000f\r", (short) (C1633zX.Xd() ^ (-27636))), Class.forName(C1593ug.zd("_WmY'f\\jd,Quopdfqk", (short) (ZN.Xd() ^ 21900), (short) (ZN.Xd() ^ 12919))), Long.TYPE);
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                super.d();
            }
            this.f3301i++;
        } else if (this.f3296a == g.Z.NOT_GRANTED) {
            e();
            gVarD.I();
        } else {
            Intent intent = new Intent();
            short sXd3 = (short) (C1580rY.Xd() ^ (-17337));
            short sXd4 = (short) (C1580rY.Xd() ^ (-14214));
            int[] iArr2 = new int["myn{wpj3whvuimep*<JID@96H<A?O33A-46<G:+98,0(3".length()];
            QB qb2 = new QB("myn{wpj3whvuimep*<JID@96H<A?O33A-46<G:+98,0(3");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(((sXd3 + i5) + xuXd2.CK(iKK2)) - sXd4);
                i5++;
            }
            intent.setAction(new String(iArr2, 0, i5));
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(yg.hg.Vd("eqfsohb+_jhm]ej#7b`eUgb", (short) (C1607wl.Xd() ^ 9715), (short) (C1607wl.Xd() ^ 6293))).getMethod(C1561oA.ud("\u0015\u0012 z\u000b\f\u0013\b\r\nq\u0004\u000f\u0006", (short) (C1633zX.Xd() ^ (-562))), new Class[0]);
            try {
                method3.setAccessible(true);
                intent.setData(Uri.fromParts(C1561oA.yd(",\u001c\u001d$\u0019\u001e\u001b", (short) (C1499aX.Xd() ^ (-11957))), (String) method3.invoke(gVarD, objArr3), null));
                CX.ud();
                Object[] objArr4 = {intent};
                Method method4 = Class.forName(C1561oA.Yd("{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dWm\u001b\u001b\"\u0014(%", (short) (C1580rY.Xd() ^ (-15310)))).getMethod(Jg.Wd(" \u0004&^X\u0007\u001f\u0018C7]\u000f\n", (short) (C1607wl.Xd() ^ 32648), (short) (C1607wl.Xd() ^ 30194)), Class.forName(Xg.qd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*d\u0001'. *1", (short) (C1633zX.Xd() ^ (-21436)), (short) (C1633zX.Xd() ^ (-6377)))));
                try {
                    method4.setAccessible(true);
                    method4.invoke(gVarD, objArr4);
                    gVarD.i();
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        Z(false);
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        this.f3296a = g.Z.values()[getArguments().getInt("PERMISSIONS_STATUS")];
        i();
        GuidanceCenterContentFragment guidanceCenterContentFragment = new GuidanceCenterContentFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("screenType", GuidanceCenterContentFragment.ScreenType.GENERIC);
        guidanceCenterContentFragment.setArguments(bundle2);
        this.f3298f = guidanceCenterContentFragment;
        int i2 = R.string.FaceTec_instructions_header_ready_1;
        int i3 = R.string.FaceTec_instructions_message_ready_2;
        GuidanceCenterContentFragment.ScreenType screenType = GuidanceCenterContentFragment.ScreenType.READY_OVAL;
        GuidanceCenterContentFragment guidanceCenterContentFragment2 = new GuidanceCenterContentFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("header", i2);
        bundle3.putInt("message", i3);
        bundle3.putSerializable("screenType", screenType);
        guidanceCenterContentFragment2.setArguments(bundle3);
        this.f3297d = guidanceCenterContentFragment2;
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final /* bridge */ /* synthetic */ Animator onCreateAnimator(int i2, boolean z2, int i3) {
        return super.onCreateAnimator(i2, z2, i3);
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f3298f = null;
        this.f3297d = null;
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final void onPause() {
        super.onPause();
        e();
        c();
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final /* bridge */ /* synthetic */ void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
    }
}
