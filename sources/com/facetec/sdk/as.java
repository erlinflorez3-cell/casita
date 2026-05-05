package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.facetec.sdk.GuidanceCenterContentFragment;
import com.facetec.sdk.bg;
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
public final class as extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static boolean f2933j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    at f2934a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GuidanceCenterContentFragment f2935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2936d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f2937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f2938g;

    /* JADX INFO: renamed from: com.facetec.sdk.as$5, reason: invalid class name */
    final class AnonymousClass5 extends av {

        /* JADX INFO: renamed from: com.facetec.sdk.as$5$1, reason: invalid class name */
        final class AnonymousClass1 extends av {

            /* JADX INFO: renamed from: com.facetec.sdk.as$5$1$2, reason: invalid class name */
            final class AnonymousClass2 extends av {

                /* JADX INFO: renamed from: com.facetec.sdk.as$5$1$2$4, reason: invalid class name */
                final class AnonymousClass4 extends av {

                    /* JADX INFO: renamed from: com.facetec.sdk.as$5$1$2$4$2, reason: invalid class name and collision with other inner class name */
                    final class C01602 extends av {
                        C01602(Fragment fragment) {
                            super(fragment);
                        }

                        @Override // com.facetec.sdk.av
                        final void B() {
                            as.this.I.setAlpha(0.0f);
                            as.this.I.setVisibility(0);
                            as.this.I.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new av(as.this) { // from class: com.facetec.sdk.as.5.1.2.4.2.3
                                @Override // com.facetec.sdk.av
                                final void B() throws Throwable {
                                    if (ba.aC().length != 0) {
                                        Object[] objArr = new Object[0];
                                        Method declaredMethod = Class.forName(Qg.kd("6B7D@93{<?x\u0016877+7", (short) (ZN.Xd() ^ 8052), (short) (ZN.Xd() ^ 10883))).getDeclaredMethod(yg.hg.Vd("\u007f|\u000bbu|\u0001]\u007f~~r~", (short) (C1607wl.Xd() ^ 27580), (short) (C1607wl.Xd() ^ 25591)), new Class[0]);
                                        try {
                                            declaredMethod.setAccessible(true);
                                            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                                            av avVar = new av(as.this) { // from class: com.facetec.sdk.as.5.1.2.4.2.3.4
                                                @Override // com.facetec.sdk.av
                                                public final void B() throws Throwable {
                                                    as.this.f2934a.f2939a.Z();
                                                }
                                            };
                                            Class<?> cls = Class.forName(C1561oA.ud("\f\u0018\r\u001a\u0016\u000f\tQ\u0012\u0015Ng\u007f\f\u0001\b\u007f\f", (short) (OY.Xd() ^ 14492)));
                                            Class<?>[] clsArr = new Class[2];
                                            short sXd = (short) (C1633zX.Xd() ^ (-12370));
                                            int[] iArr = new int["yo\bq9vnz~Dk\u000e\u0002\u0001vv\f\u0004".length()];
                                            QB qb = new QB("yo\bq9vnz~Dk\u000e\u0002\u0001vv\f\u0004");
                                            int i2 = 0;
                                            while (qb.YK()) {
                                                int iKK = qb.KK();
                                                Xu xuXd = Xu.Xd(iKK);
                                                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                                                i2++;
                                            }
                                            clsArr[0] = Class.forName(new String(iArr, 0, i2));
                                            clsArr[1] = Long.TYPE;
                                            Object[] objArr2 = {avVar, 10L};
                                            Method method = cls.getMethod(C1561oA.Yd("ggln?ai_xee", (short) (OY.Xd() ^ 31995)), clsArr);
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
                                    Object[] objArr3 = new Object[0];
                                    Method declaredMethod2 = Class.forName(Xg.qd("_mdsqlh3uz6Uyz|r\u0001", (short) (ZN.Xd() ^ 16817), (short) (ZN.Xd() ^ 18984))).getDeclaredMethod(Jg.Wd("7||6$\r\u0003B>\u001f\u0012gO", (short) (C1633zX.Xd() ^ (-440)), (short) (C1633zX.Xd() ^ (-4546))), new Class[0]);
                                    try {
                                        declaredMethod2.setAccessible(true);
                                        Handler handler2 = new Handler((Looper) declaredMethod2.invoke(null, objArr3));
                                        Object[] objArr4 = {new av(as.this) { // from class: com.facetec.sdk.as.5.1.2.4.2.3.2
                                            @Override // com.facetec.sdk.av
                                            final void B() {
                                                if (as.this.C() != null) {
                                                    as.this.I.setEnabled(true, true);
                                                    as.this.B.setEnabled(true);
                                                    as.this.I(true);
                                                }
                                            }
                                        }, 300L};
                                        Method method2 = Class.forName(ZO.xd("vDj\u001e\u000f<\u000f1KfEJ\u001e,%&uJ", (short) (FB.Xd() ^ 29934), (short) (FB.Xd() ^ 7087))).getMethod(Ig.wd(";ueD:/PD\r\u001d\u001e", (short) (Od.Xd() ^ (-17364))), Class.forName(C1626yg.Ud("w\u0019\u000bf\u000e,cF06\u000fe\u007f\u0017*'\b#", (short) (Od.Xd() ^ (-15166)), (short) (Od.Xd() ^ (-6510)))), Long.TYPE);
                                        try {
                                            method2.setAccessible(true);
                                            method2.invoke(handler2, objArr4);
                                        } catch (InvocationTargetException e4) {
                                            throw e4.getCause();
                                        }
                                    } catch (InvocationTargetException e5) {
                                        throw e5.getCause();
                                    }
                                }
                            }).start();
                            as.this.Code(true, 500, 300);
                        }
                    }

                    AnonymousClass4(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    final void B() {
                        as.this.f2934a.F.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).start();
                        as.this.f2934a.C.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new C01602(as.this)).start();
                    }
                }

                AnonymousClass2(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                final void B() {
                    as.this.f2934a.Code.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new AnonymousClass4(as.this)).start();
                }
            }

            AnonymousClass1(Fragment fragment) {
                super(fragment);
            }

            @Override // com.facetec.sdk.av
            final void B() {
                as.this.f2934a.S.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new AnonymousClass2(as.this)).start();
            }
        }

        AnonymousClass5(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() throws Exception {
            as.this.f2935c = GuidanceCenterContentFragment.Code(R.string.FaceTec_instructions_header_ready_1, R.string.FaceTec_instructions_message_ready_2, GuidanceCenterContentFragment.ScreenType.READY_OVAL, as.this.V.F().top, as.this.V.F().bottom);
            if (as.this.f2936d != 1) {
                if (as.this.f2934a == null) {
                    return;
                }
                bb.B(as.this.I, R.string.FaceTec_action_try_again);
                as.this.C();
                as.this.f2934a.D.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                as.this.f2934a.L.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new AnonymousClass1(as.this)).start();
                return;
            }
            FragmentManager fragmentManager = as.this.getFragmentManager();
            CX.ud();
            FragmentTransaction customAnimations = fragmentManager.beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0);
            int i2 = R.id.centerContentFrameLayout;
            GuidanceCenterContentFragment guidanceCenterContentFragment = as.this.f2935c;
            CX.ud();
            customAnimations.replace(i2, guidanceCenterContentFragment).commitAllowingStateLoss();
            bb.B(as.this.I, R.string.FaceTec_action_im_ready);
            as.this.V.V.setAlpha(255);
            as.this.V.B();
            Handler handler = new Handler();
            av avVar = new av(as.this) { // from class: com.facetec.sdk.as.5.4
                @Override // com.facetec.sdk.av
                public final void B() {
                    as.this.V.Z();
                }
            };
            short sXd = (short) (OY.Xd() ^ 19520);
            short sXd2 = (short) (OY.Xd() ^ 22707);
            int[] iArr = new int["/QzK\u001cH\u0007ag\u001f,\fe\u0006Aw6\u0016".length()];
            QB qb = new QB("/QzK\u001cH\u0007ag\u001f,\fe\u0006Aw6\u0016");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            Object[] objArr = {avVar, 500L};
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Wg.vd("?=DD\u000f/9-@+-", (short) (Od.Xd() ^ (-17657))), Class.forName(C1561oA.Xd("!\u0019/\u001bh(\u001e,&m\u0013712&(3-", (short) (C1499aX.Xd() ^ (-14216)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                as.this.I.setAlpha(0.0f);
                as.this.I.setVisibility(0);
                as.this.I.animate().alpha(1.0f).setDuration(500L).setStartDelay(300L).setListener(null).withEndAction(new av(as.this) { // from class: com.facetec.sdk.as.5.2
                    @Override // com.facetec.sdk.av
                    final void B() throws Throwable {
                        Object[] objArr2 = new Object[0];
                        Method declaredMethod = Class.forName(EO.Od("\u001aW?)tLg0M!YYLV_2d", (short) (C1580rY.Xd() ^ (-1376)))).getDeclaredMethod(C1561oA.Qd("\u0016\u0013!x\f\u0013\u0017s\u0016\u0015\u0015\t\u0015", (short) (OY.Xd() ^ 24737)), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Handler handler2 = new Handler((Looper) declaredMethod.invoke(null, objArr2));
                            av avVar2 = new av(as.this) { // from class: com.facetec.sdk.as.5.2.3
                                @Override // com.facetec.sdk.av
                                final void B() {
                                    if (as.this.C() != null) {
                                        as.this.B.setEnabled(true);
                                        as.this.I(true);
                                    }
                                }
                            };
                            short sXd3 = (short) (C1633zX.Xd() ^ (-14215));
                            short sXd4 = (short) (C1633zX.Xd() ^ (-5274));
                            int[] iArr2 = new int["LZQ`^YU bg#>Xf]f`n".length()];
                            QB qb2 = new QB("LZQ`^YU bg#>Xf]f`n");
                            int i4 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i4)) - sXd4);
                                i4++;
                            }
                            Class<?> cls = Class.forName(new String(iArr2, 0, i4));
                            Class<?>[] clsArr = new Class[2];
                            short sXd5 = (short) (FB.Xd() ^ 25863);
                            int[] iArr3 = new int["YOcM\u0019VJVN\u00147YQPBBKC".length()];
                            QB qb3 = new QB("YOcM\u0019VJVN\u00147YQPBBKC");
                            int i5 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i5] = xuXd3.fK(sXd5 + sXd5 + i5 + xuXd3.CK(iKK3));
                                i5++;
                            }
                            clsArr[0] = Class.forName(new String(iArr3, 0, i5));
                            clsArr[1] = Long.TYPE;
                            Object[] objArr3 = {avVar2, 300L};
                            Method method2 = cls.getMethod(C1561oA.Kd("\u0015\u0015\u001a\u001cl\u000f\u0017\r&\u0013\u0013", (short) (FB.Xd() ^ 19705)), clsArr);
                            try {
                                method2.setAccessible(true);
                                method2.invoke(handler2, objArr3);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                }).start();
                as.this.Code(true, 500, 300);
                as.this.j();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.as$8, reason: invalid class name */
    final class AnonymousClass8 extends av implements ValueAnimator.AnimatorUpdateListener {
        AnonymousClass8(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            if (as.this.f2934a == null) {
                if (as.this.f2935c == null || as.this.f2935c.Z == null || as.this.f2935c.L == null || as.this.f2935c.S == null || as.this.f2935c.D == null) {
                    return;
                }
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(as.this.f2935c.Z.getCurrentTextColor()), Integer.valueOf(ba.L(as.this.getActivity())));
                valueAnimatorOfObject.setDuration(1000L);
                valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.as.8.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (as.this.f2935c == null || !as.this.isAdded()) {
                            return;
                        }
                        as.this.f2935c.Z.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        as.this.f2935c.L.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                valueAnimatorOfObject.start();
                ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(as.this.f2935c.S.getCurrentTextColor()), Integer.valueOf(ba.D(as.this.getActivity())));
                valueAnimatorOfObject2.setDuration(1000L);
                valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.as.8.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (as.this.f2935c == null || !as.this.isAdded()) {
                            return;
                        }
                        as.this.f2935c.S.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        as.this.f2935c.D.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                valueAnimatorOfObject2.start();
                return;
            }
            ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(as.this.f2934a.L.getCurrentTextColor()), Integer.valueOf(ba.F(as.this.getActivity())));
            valueAnimatorOfObject3.setDuration(1000L);
            valueAnimatorOfObject3.addUpdateListener(this);
            valueAnimatorOfObject3.start();
            ValueAnimator valueAnimatorOfObject4 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(as.this.f2934a.D.getCurrentTextColor()), Integer.valueOf(ba.C(as.this.getActivity())));
            valueAnimatorOfObject4.setDuration(1000L);
            valueAnimatorOfObject4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.as.8.5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (as.this.f2934a == null || !as.this.isAdded()) {
                        return;
                    }
                    as.this.f2934a.D.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    as.this.f2934a.C.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    as.this.f2934a.F.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    as.this.f2934a.f2940b.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    as.this.f2934a.f2941c.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfObject4.start();
            ValueAnimator valueAnimatorOfObject5 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(ba.Code(as.this.getActivity(), FaceTecSDK.V.D.retryScreenImageBorderColor)), Integer.valueOf(ba.f(as.this.getActivity())));
            valueAnimatorOfObject5.setDuration(1000L);
            valueAnimatorOfObject5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.as.8.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (as.this.f2934a == null || !as.this.isAdded()) {
                        return;
                    }
                    as.this.f2934a.f2943e.setStroke(ba.F(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    as.this.f2934a.V.setBackground(as.this.f2934a.f2943e);
                    as.this.f2934a.Z.setBackground(as.this.f2934a.f2943e);
                }
            });
            valueAnimatorOfObject5.start();
            ValueAnimator valueAnimatorOfObject6 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(ba.Code(as.this.getActivity(), FaceTecSDK.V.D.retryScreenOvalStrokeColor)), Integer.valueOf(ba.j(as.this.getActivity())));
            valueAnimatorOfObject6.setDuration(1000L);
            valueAnimatorOfObject6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.as.8.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (as.this.f2934a == null || !as.this.isAdded()) {
                        return;
                    }
                    as.this.f2934a.I.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN);
                }
            });
            valueAnimatorOfObject6.start();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (as.this.f2934a == null || !as.this.isAdded()) {
                return;
            }
            as.this.f2934a.L.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private void I(GuidanceCenterContentFragment guidanceCenterContentFragment) throws Exception {
        FragmentManager fragmentManager = getFragmentManager();
        CX.ud();
        FragmentTransaction customAnimations = fragmentManager.beginTransaction().setCustomAnimations(R.anim.facetec_slide_in_left, R.anim.facetec_slide_out_left);
        int i2 = R.id.centerContentFrameLayout;
        CX.ud();
        customAnimations.replace(i2, guidanceCenterContentFragment, "centerContentFrameLayout").commitAllowingStateLoss();
    }

    static as c() {
        as asVar = new as();
        asVar.setArguments(new Bundle());
        f2933j = false;
        return asVar;
    }

    private void f() throws Exception {
        j();
        Code(false, 500, 0);
        this.I.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        Class<?> cls = Class.forName(C1561oA.Xd("'5,;940z=B}\u001dABD:H", (short) (ZN.Xd() ^ 3216)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-17450));
        int[] iArr = new int["fcuM\\ckHvuymu".length()];
        QB qb = new QB("fcuM\\ckHvuymu");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Object[] objArr2 = {new av(this) { // from class: com.facetec.sdk.as.1
                @Override // com.facetec.sdk.av
                public final void B() throws Throwable {
                    bb.B(as.this.I, R.string.FaceTec_action_im_ready);
                    as.this.I.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
                    as.this.Code(true, 500, 0);
                    Object[] objArr3 = new Object[0];
                    Method declaredMethod2 = Class.forName(C1561oA.od("\u0005\u0011\u0006\u0013\u000f\b\u0002J\u000b\u000eGd\u0007\u0006\u0006y\u0006", (short) (C1580rY.Xd() ^ (-3688)))).getDeclaredMethod(C1561oA.Kd("! 0\n\u001f(.\r124*8", (short) (FB.Xd() ^ 7239)), new Class[0]);
                    try {
                        declaredMethod2.setAccessible(true);
                        Handler handler2 = new Handler((Looper) declaredMethod2.invoke(null, objArr3));
                        av avVar = new av(as.this) { // from class: com.facetec.sdk.as.1.3
                            @Override // com.facetec.sdk.av
                            public final void B() {
                                as.this.B.setEnabled(true);
                                as.this.I(true);
                            }
                        };
                        short sXd2 = (short) (C1580rY.Xd() ^ (-9627));
                        short sXd3 = (short) (C1580rY.Xd() ^ (-7850));
                        int[] iArr2 = new int["yD0.`J12icUel'\r\u000b9>".length()];
                        QB qb2 = new QB("yD0.`J12icUel'\r\u000b9>");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Object[] objArr4 = {avVar, 500L};
                        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.vd("\u0012\u0010\u0017\u0017a\u0002\f\u007f#\u000e\u0010", (short) (C1580rY.Xd() ^ (-32149))), Class.forName(C1561oA.Xd("}u\fwE\u0005z\t\u0003Jo\u0014\u000e\u000f\u0003\u0005\u0010\n", (short) (C1499aX.Xd() ^ (-28143)))), Long.TYPE);
                        try {
                            method.setAccessible(true);
                            method.invoke(handler2, objArr4);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            }, 800L};
            Method method = Class.forName(Qg.kd("UaVc_XR\u001b[^\u00181IUJQIU", (short) (C1499aX.Xd() ^ (-27582)), (short) (C1499aX.Xd() ^ (-18282)))).getMethod(C1561oA.ud("ZX[[*JPD[FD", (short) (ZN.Xd() ^ 9748)), Class.forName(yg.hg.Vd("zp\u0005n:wkwo5Xzrqccld", (short) (ZN.Xd() ^ 7749), (short) (ZN.Xd() ^ 24001))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
                a.B = bo.D;
                I(this.f2935c);
                this.V.I();
                a.V(D(), V.GET_READY_IM_READY_SHOWN_AND_READY_RETRY, null);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private void h() {
        at atVar = this.f2934a;
        if (atVar == null || atVar.f2939a == null) {
            return;
        }
        this.f2934a.f2939a.Code();
    }

    private void i() {
        Handler handler = this.f2938g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f2938g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() throws Throwable {
        Handler handler = new Handler();
        this.f2937f = handler;
        av avVar = new av(this) { // from class: com.facetec.sdk.as.3
            @Override // com.facetec.sdk.av
            final void B() {
                as.this.D = true;
                if (as.this.I.isEnabled()) {
                    return;
                }
                as.this.I.setEnabled(true, true);
            }
        };
        Class<?> cls = Class.forName(C1561oA.yd("kwlyunh1qt.G_k`g\u007f\f", (short) (C1633zX.Xd() ^ (-10460))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("e]s_-lbpj2W{uvjlwq", (short) (Od.Xd() ^ (-10338)))), Long.TYPE};
        Object[] objArr = {avVar, 7000L};
        short sXd = (short) (C1580rY.Xd() ^ (-18724));
        short sXd2 = (short) (C1580rY.Xd() ^ (-30150));
        int[] iArr = new int["IINP!CKAZGG".length()];
        QB qb = new QB("IINP!CKAZGG");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
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
    protected final void B() throws Exception {
        h();
        if (this.f2936d == 0) {
            f();
            ai.K();
            if (FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                bg.B(D(), bg.V.GET_READY_FRAME_YOUR_FACE_AUTOMATIC);
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(Jg.Wd("w)qM\u001bk9PbEZF:\td'\u0005", (short) (OY.Xd() ^ 9937), (short) (OY.Xd() ^ 26471))).getDeclaredMethod(ZO.xd("\u001a\u0015.y*2\u0002\u001d\u001fP!p>", (short) (FB.Xd() ^ 2645), (short) (FB.Xd() ^ 29355)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                av avVar = new av(this) { // from class: com.facetec.sdk.as.7
                    @Override // com.facetec.sdk.av
                    public final void B() {
                        as.this.Z(false);
                    }
                };
                Class<?> cls = Class.forName(C1626yg.Ud("u] \u0015}A{5\"L\u0006K3\u001d\fSfX", (short) (Od.Xd() ^ (-5215)), (short) (Od.Xd() ^ (-27848))));
                Class<?>[] clsArr = {Class.forName(Ig.wd("}*1x]^{\tRi\u0014\u0011^P7\u0017\u0004\u000b", (short) (ZN.Xd() ^ 20032))), Long.TYPE};
                Object[] objArr2 = {avVar, 1300L};
                short sXd = (short) (C1499aX.Xd() ^ (-24018));
                int[] iArr = new int["\u007f1#\fza\u0015\u0011\u000101".length()];
                QB qb = new QB("\u007f1#\fza\u0015\u0011\u000101");
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
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else {
            f2933j = true;
            i();
            B(new av(this) { // from class: com.facetec.sdk.as.6
                @Override // com.facetec.sdk.av
                public final void B() {
                    g gVarD = as.this.D();
                    if (gVarD != null) {
                        gVarD.C();
                        a.V(gVarD, V.GET_READY_IM_READY_PRESSED_RETY, null);
                    }
                    as.this.Z(false);
                }
            }, 1000);
        }
        this.f2936d++;
    }

    @Override // com.facetec.sdk.e
    protected final void Code() throws Exception {
        if (!(this.Z == null ? this.B : this.Z).isEnabled() || f2933j) {
            return;
        }
        Z();
    }

    @Override // com.facetec.sdk.e
    protected final void I() throws Throwable {
        g gVarD = D();
        if (gVarD != null && FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            bg.B(gVarD, bg.V.RETRY);
        }
        at atVar = this.f2934a;
        if (atVar != null) {
            atVar.L.setAlpha(0.0f);
            this.f2934a.D.setAlpha(0.0f);
            this.f2934a.S.setAlpha(0.0f);
            this.f2934a.Code.setAlpha(0.0f);
            this.f2934a.C.setAlpha(0.0f);
            this.f2934a.F.setAlpha(0.0f);
            this.I.setVisibility(4);
            this.I.setAlpha(0.0f);
        }
        this.C.setVisibility(8);
        this.I.setEnabled(false);
        this.B.setEnabled(false);
        I(false);
        this.V.B(ba.aB(), 0, 0);
        if (this.f2938g == null) {
            Handler handler = new Handler();
            this.f2938g = handler;
            av avVar = new av(this) { // from class: com.facetec.sdk.as.2
                @Override // com.facetec.sdk.av
                public final void B() {
                    g gVarD2 = as.this.D();
                    if (gVarD2 != null) {
                        gVarD2.d();
                    }
                }
            };
            Class<?> cls = Class.forName(C1561oA.Qd("\u0001\r\u0002\u000f\u000b\u0004}F\u0007\nC\\t\u0001u|t\u0001", (short) (C1580rY.Xd() ^ (-27828))));
            Class<?>[] clsArr = {Class.forName(C1593ug.zd("\u001f\u0017-\u0019f&\u001c*$k\u00115/0$&1+", (short) (C1633zX.Xd() ^ (-1870)), (short) (C1633zX.Xd() ^ (-16542)))), Long.TYPE};
            Object[] objArr = {avVar, 600000L};
            short sXd = (short) (Od.Xd() ^ (-266));
            int[] iArr = new int["|z}}Llrf}hf".length()];
            QB qb = new QB("|z}}Llrf}hf");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
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
        Object[] objArr2 = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("x\u0007}\r\u000b\u0006\u0002L\u000f\u0014On\u0013\u0014\u0016\f\u001a", (short) (FB.Xd() ^ 12153))).getDeclaredMethod(Wg.Zd(".\u0012*,E6D's|caw", (short) (Od.Xd() ^ (-31906)), (short) (Od.Xd() ^ (-14107))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler2 = new Handler((Looper) declaredMethod.invoke(null, objArr2));
            Object[] objArr3 = {new AnonymousClass5(this)};
            Method method2 = Class.forName(C1561oA.Xd("CQHWUPL\u0017Y^\u001a5O]T]We", (short) (Od.Xd() ^ (-23253)))).getMethod(Qg.kd("\u0002\u007f\u0003\u0003", (short) (OY.Xd() ^ 5952), (short) (OY.Xd() ^ 27355)), Class.forName(Wg.vd("f^p\\.m_m[#DhfgWYXR", (short) (ZN.Xd() ^ 16501))));
            try {
                method2.setAccessible(true);
                method2.invoke(handler2, objArr3);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.facetec.sdk.e
    protected final boolean L() {
        return this.f2936d == 1;
    }

    @Override // com.facetec.sdk.e
    protected final void V() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(yg.hg.Vd("$0%2.'!i*-f\u0004&%%\u0019%", (short) (FB.Xd() ^ 2013), (short) (FB.Xd() ^ 18845))).getDeclaredMethod(C1561oA.ud("JGU-@GK(JII=I", (short) (C1580rY.Xd() ^ (-23571))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this);
            Class<?> cls = Class.forName(C1561oA.yd("\r\u0019\u0012\u001f\u0017\u0010\u000eV\u0013\u0016Sl\u0001\r\u0006\r\u0001\r", (short) (C1580rY.Xd() ^ (-25124))));
            Class<?>[] clsArr = {Class.forName(C1561oA.Yd("D<R>\fKAOI\u00116ZTUIKVP", (short) (C1607wl.Xd() ^ 21405)))};
            Object[] objArr2 = {anonymousClass8};
            short sXd = (short) (Od.Xd() ^ (-22100));
            short sXd2 = (short) (Od.Xd() ^ (-3283));
            int[] iArr = new int["\u001e\u001e#%".length()];
            QB qb = new QB("\u001e\u001e#%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
                this.V.V();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.facetec.sdk.e
    protected final void Z() throws Exception {
        if (this.f2936d == 0) {
            f();
            ai.K();
            this.f2936d++;
        } else {
            g gVarD = D();
            if (gVarD != null) {
                gVarD.b();
            }
            i();
            h();
        }
    }

    @Override // com.facetec.sdk.e
    public final /* bridge */ /* synthetic */ void Z(boolean z2) {
        super.Z(z2);
    }

    public final boolean a() {
        return this.f2936d == 1;
    }

    public final void e() throws Throwable {
        if (this.f2938g == null) {
            this.f2938g = new Handler();
        }
        Handler handler = this.f2938g;
        Object[] objArr = {new av(this) { // from class: com.facetec.sdk.as.9
            @Override // com.facetec.sdk.av
            public final void B() {
                g gVarD = as.this.D();
                if (gVarD != null) {
                    gVarD.d();
                }
            }
        }, 600000L};
        Method method = Class.forName(Jg.Wd(")f{Qm\u0011K<<gC%]\u0012Gx0d", (short) (C1633zX.Xd() ^ (-31161)), (short) (C1633zX.Xd() ^ (-16339)))).getMethod(C1626yg.Ud("m\u000b0d<9Zd\u00040\u0018", (short) (Od.Xd() ^ (-4578)), (short) (Od.Xd() ^ (-29009))), Class.forName(ZO.xd("\u001c\u0006IoC4+B2\u001e`BjL\u0002O&_", (short) (OY.Xd() ^ 23776), (short) (OY.Xd() ^ 18932))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        Handler handler = new Handler();
        this.f2938g = handler;
        av avVar = new av(this) { // from class: com.facetec.sdk.as.4
            @Override // com.facetec.sdk.av
            public final void B() {
                g gVarD = as.this.D();
                if (gVarD != null) {
                    gVarD.d();
                }
            }
        };
        short sXd = (short) (FB.Xd() ^ 27436);
        int[] iArr = new int["\tr8%\u007f$I1/*h^$)%\n)R".length()];
        QB qb = new QB("\tr8%\u007f$I1/*h^$)%\n)R");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[2];
        short sXd2 = (short) (Od.Xd() ^ (-25526));
        int[] iArr2 = new int["\fP)vUhs#^\u0004 +rvWA \r".length()];
        QB qb2 = new QB("\fP)vUhs#^\u0004 +rvWA \r");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {avVar, 600000L};
        Method method = cls.getMethod(C1561oA.Qd("XVYY(HNBYDB", (short) (C1607wl.Xd() ^ 4574)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            if (ai.i().length == 0) {
                a.B = bo.D;
                this.f2936d = 1;
                return;
            }
            a.B = bo.f3040d;
            this.f2934a = new at();
            FragmentManager fragmentManager = getFragmentManager();
            CX.ud();
            fragmentManager.beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(R.id.centerContentFrameLayout, this.f2934a).commitAllowingStateLoss();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final /* bridge */ /* synthetic */ Animator onCreateAnimator(int i2, boolean z2, int i3) {
        return super.onCreateAnimator(i2, z2, i3);
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final void onPause() {
        super.onPause();
        i();
        h();
    }

    @Override // com.facetec.sdk.e, android.app.Fragment
    public final /* bridge */ /* synthetic */ void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
    }
}
