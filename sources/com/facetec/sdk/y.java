package com.facetec.sdk;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
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
final class y {
    private final Handler B;
    private boolean C;
    ap Code;
    private boolean S;
    AnimatedVectorDrawableCompat Z;
    private int V = 6000;
    private int I = 4000;

    /* JADX INFO: renamed from: com.facetec.sdk.y$1, reason: invalid class name */
    final class AnonymousClass1 extends av {
        AnonymousClass1(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            y.this.V(true);
            y.this.Code(false);
            y.this.Code.f2909d.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
            y.this.Code.f2907b.animate().alpha(0.0f).setDuration(800L).setListener(null).withEndAction(new av(y.this.Code) { // from class: com.facetec.sdk.y.1.3
                @Override // com.facetec.sdk.av
                final void B() throws Throwable {
                    y.this.Z(ba.B(x.SCANNING));
                    y.this.Code.f2909d.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                    y.this.Code.f2907b.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                    Handler handler = new Handler();
                    av avVar = new av(y.this.Code) { // from class: com.facetec.sdk.y.1.3.3
                        @Override // com.facetec.sdk.av
                        public final void B() throws Throwable {
                            y.this.I(true);
                        }
                    };
                    Class<?> cls = Class.forName(Ig.wd("k5\u0017\u0003%b\b^aK\u0006\u007fjkct$O", (short) (FB.Xd() ^ 25410)));
                    Class<?>[] clsArr = {Class.forName(EO.Od("m\u001f\u0016\\pt\u0012&r\tCPxj]Ds\u000b", (short) (FB.Xd() ^ 21104))), Long.TYPE};
                    Object[] objArr = {avVar, 100L};
                    short sXd = (short) (C1633zX.Xd() ^ (-32468));
                    int[] iArr = new int["\u0019\u0017\u001a\u001ah\t\u000f\u0003\u001a\u0005\u0003".length()];
                    QB qb = new QB("\u0019\u0017\u001a\u001ah\t\u000f\u0003\u001a\u0005\u0003");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
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
            }).start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.y$2, reason: invalid class name */
    final class AnonymousClass2 extends av {
        AnonymousClass2(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() throws Throwable {
            y.this.Code();
            y.this.Code.f2909d.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
            y.this.Code.f2907b.animate().alpha(0.0f).setDuration(800L).setListener(null).withEndAction(new av(y.this.Code) { // from class: com.facetec.sdk.y.2.2
                @Override // com.facetec.sdk.av
                final void B() throws Throwable {
                    y.this.Z(ba.B(x.WEAK_CONNECTION));
                    y.this.Code.f2909d.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                    y.this.Code.f2907b.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                    y.this.Code(true);
                    Handler handler = new Handler();
                    av avVar = new av(y.this.Code) { // from class: com.facetec.sdk.y.2.2.5
                        @Override // com.facetec.sdk.av
                        public final void B() throws Throwable {
                            y.this.I(false);
                        }
                    };
                    Class<?> cls = Class.forName(C1593ug.zd("\u0012 \u0017&$\u001f\u001be(-h\u0004\u001e,#,&4", (short) (C1607wl.Xd() ^ 19377), (short) (C1607wl.Xd() ^ 4182)));
                    Class<?>[] clsArr = {Class.forName(C1561oA.od("e[oY%bVbZ Ce]\\NNWO", (short) (ZN.Xd() ^ 9825))), Long.TYPE};
                    Object[] objArr = {avVar, 100L};
                    short sXd = (short) (C1499aX.Xd() ^ (-20976));
                    int[] iArr = new int["FFKM\u001e@H>WDD".length()];
                    QB qb = new QB("FFKM\u001e@H>WDD");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
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
            }).start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.y$4, reason: invalid class name */
    final class AnonymousClass4 extends av {
        private /* synthetic */ boolean B;
        final /* synthetic */ Handler V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Fragment fragment, boolean z2, Handler handler) {
            super(fragment);
            this.B = z2;
            this.V = handler;
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            Drawable drawable;
            int iAD = ba.aD();
            int iAF = ba.aF();
            boolean z2 = this.B;
            if (z2 && iAF != 0) {
                y yVar = y.this;
                yVar.Z = ap.V(yVar.Code.getActivity(), iAF);
            } else if (!z2 && iAD != 0) {
                y yVar2 = y.this;
                yVar2.Z = ap.V(yVar2.Code.getActivity(), iAD);
            }
            if (y.this.Z != null) {
                y.this.Code.f2909d.setImageDrawable(y.this.Z);
                y.this.Z.registerAnimationCallback(new Animatable2Compat.AnimationCallback() { // from class: com.facetec.sdk.y.4.1
                    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
                    public final void onAnimationEnd(Drawable drawable2) throws Throwable {
                        Handler handler = AnonymousClass4.this.V;
                        Runnable runnable = new Runnable() { // from class: com.facetec.sdk.y.4.1.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (y.this.Z != null) {
                                    y.this.Z.start();
                                }
                            }
                        };
                        Class<?> cls = Class.forName(Wg.Zd("QX\u001d&pd*mmks\u0015l\u00037J\rd", (short) (Od.Xd() ^ (-30589)), (short) (Od.Xd() ^ (-8604))));
                        Class<?>[] clsArr = {Class.forName(C1561oA.Xd("~v\rxF\u0006{\n\u0004Kp\u0015\u000f\u0010\u0004\u0006\u0011\u000b", (short) (C1580rY.Xd() ^ (-4373))))};
                        Object[] objArr = {runnable};
                        short sXd = (short) (C1499aX.Xd() ^ (-31706));
                        int[] iArr = new int["ljqq".length()];
                        QB qb = new QB("ljqq");
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
                });
                if (y.this.Z != null) {
                    y.this.Z.start();
                    return;
                }
                return;
            }
            y.this.Code.f2909d.getLayoutParams().width = (int) (y.this.Code.f2909d.getLayoutParams().height * 0.875f);
            y.this.Code.f2909d.requestLayout();
            if (this.B) {
                int iAG = ba.aG();
                if (iAG == 0) {
                    iAG = R.drawable.facetec_internal_nfc;
                }
                drawable = ContextCompat.getDrawable(y.this.Code.getActivity(), iAG);
            } else {
                int iAI = ba.aI();
                if (iAI == 0) {
                    iAI = R.drawable.facetec_internal_nfc;
                }
                drawable = ContextCompat.getDrawable(y.this.Code.getActivity(), iAI);
            }
            if (drawable != null) {
                y.this.Code.f2909d.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.y$5, reason: invalid class name */
    final class AnonymousClass5 extends av {
        private /* synthetic */ boolean V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Fragment fragment, boolean z2) {
            super(fragment);
            this.V = z2;
        }

        @Override // com.facetec.sdk.av
        public final void B() throws Throwable {
            y.this.Code();
            if (this.V) {
                y.this.Code.f2907b.animate().alpha(0.0f).setDuration(800L).setListener(null).withEndAction(new av(y.this.Code) { // from class: com.facetec.sdk.y.5.3
                    @Override // com.facetec.sdk.av
                    final void B() {
                        y.this.Z(ba.B(x.STARTING));
                        y.this.Code.f2907b.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                    }
                }).start();
                return;
            }
            y.this.Code.f2908c.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
            y.this.Code.F.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
            y.this.Code.V.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
            y.this.Code.Z.animate().alpha(0.0f).setDuration(800L).setListener(null).withEndAction(new av(y.this.Code) { // from class: com.facetec.sdk.y.5.2
                @Override // com.facetec.sdk.av
                final void B() throws Throwable {
                    y.this.Code.f2908c.setVisibility(8);
                    y.this.Code.F.setVisibility(8);
                    y.this.Code.V.setVisibility(8);
                    y.this.Code.Z.setVisibility(4);
                    y.this.Code.f2910e.setAlpha(0.0f);
                    y.this.Code.D.setAlpha(0.0f);
                    y.this.Code.D.setVisibility(0);
                    y.this.Code.f2910e.setVisibility(0);
                    y.this.Code.f2913h.setVisibility(0);
                    FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) y.this.Code.getActivity();
                    if (FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM && FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
                        y.this.Code.f2915j.setVisibility(0);
                    } else if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                        faceTecSessionActivity.f3275g.setVisibility(0);
                        faceTecSessionActivity.f3275g.setAlpha(0.0f);
                    }
                    if (faceTecSessionActivity != null) {
                        faceTecSessionActivity.f3293y.setVisibility(8);
                    }
                    if (!cf.Code(y.this.Code.getActivity()) || cf.I(y.this.Code.getActivity())) {
                        y.this.Z(ba.B(x.STARTING));
                    } else {
                        y.this.V(true);
                        if (faceTecSessionActivity != null) {
                            faceTecSessionActivity.q();
                        }
                        y.this.Z(ba.B(x.DISABLED));
                    }
                    y.this.Code.f2910e.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                    y.this.Code.D.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                    y.this.Code(true);
                    Handler handler = new Handler();
                    Object[] objArr = {new av(y.this.Code) { // from class: com.facetec.sdk.y.5.2.2
                        @Override // com.facetec.sdk.av
                        public final void B() throws Throwable {
                            y.this.I(false);
                        }
                    }, 100L};
                    Method method = Class.forName(Qg.kd("o{p}yrl5ux2Kcodkco", (short) (C1580rY.Xd() ^ (-29823)), (short) (C1580rY.Xd() ^ (-26665)))).getMethod(C1561oA.ud("5366\u0005%+\u001f6!\u001f", (short) (OY.Xd() ^ 30897)), Class.forName(yg.hg.Vd("uk\u007fi5rfrj0Suml^^g_", (short) (OY.Xd() ^ 28664), (short) (OY.Xd() ^ 19047))), Long.TYPE);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }).start();
        }
    }

    y(ap apVar) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.yd("\u000b\u0019\u0010\u001f\u0015\u0010\fV\u0011\u0016Qp\r\u000e\u0010\u0006\f", (short) (FB.Xd() ^ 27055))).getDeclaredMethod(C1561oA.Yd("PO_9NW]<`acYg", (short) (OY.Xd() ^ 7119)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.B = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.C = false;
            this.S = false;
            this.Code = apVar;
            new Handler();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void B() {
        Handler handler = this.B;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void Z(boolean z2) {
        this.S = z2;
        if (z2) {
            B();
            this.Code.getActivity().runOnUiThread(new av(this.Code) { // from class: com.facetec.sdk.y.9
                @Override // com.facetec.sdk.av
                public final void B() {
                    y.this.Code.f2913h.setEnabled(false, y.this.Code.f2913h.getAlpha() > 0.0f);
                }
            });
        }
    }

    final void Code() throws Throwable {
        int i2 = this.Code.f2913h.getAlpha() == 1.0f ? 0 : this.V;
        B();
        V(false);
        Z(false);
        Handler handler = this.B;
        av avVar = new av(this.Code) { // from class: com.facetec.sdk.y.3
            @Override // com.facetec.sdk.av
            public final void B() {
                if (y.this.C) {
                    return;
                }
                y.this.Code.f2913h.animate().alpha(1.0f).setDuration(y.this.Code.f2913h.getAlpha() == 1.0f ? 0 : LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE).setListener(null).withEndAction(new av(y.this.Code) { // from class: com.facetec.sdk.y.3.2
                    @Override // com.facetec.sdk.av
                    final void B() throws Throwable {
                        if (y.this.S) {
                            return;
                        }
                        y.this.I();
                    }
                });
            }
        };
        Class<?> cls = Class.forName(Xg.qd("!/&53.*t7<w\u0013-;2;5C", (short) (C1580rY.Xd() ^ (-32280)), (short) (C1580rY.Xd() ^ (-15072))));
        Class<?>[] clsArr = {Class.forName(Jg.Wd("\"X-\u001b'%]i!+\u000f1m-_c.f", (short) (ZN.Xd() ^ 19387), (short) (ZN.Xd() ^ 4856))), Long.TYPE};
        Object[] objArr = {avVar, Long.valueOf(i2)};
        Method method = cls.getMethod(ZO.xd("2\ncM,{\f9\u0012u\u0006", (short) (FB.Xd() ^ 21492), (short) (FB.Xd() ^ 10697)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final void Code(boolean z2) {
        float f2 = z2 ? 1.0f : 0.0f;
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) this.Code.getActivity();
        if (FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            this.Code.f2915j.animate().alpha(f2).setDuration(800L).setListener(null).start();
            this.Code.f2915j.setEnabled(z2);
        } else {
            faceTecSessionActivity.f3275g.animate().alpha(f2).setDuration(800L).setListener(null).start();
            faceTecSessionActivity.f3275g.setEnabled(z2);
        }
    }

    final void I() throws Throwable {
        int i2 = (this.Code.f2913h.getAlpha() == 1.0f && this.Code.f2913h.isEnabled()) ? 0 : this.I;
        Z(false);
        Handler handler = this.B;
        Class<?> cls = Class.forName(C1626yg.Ud("x*\r\f81Pw\"wL;4z\u0006^[v", (short) (OY.Xd() ^ 28842), (short) (OY.Xd() ^ 24625)));
        Class<?>[] clsArr = {Class.forName(Ig.wd("`\u001fR]rk<Bgjx6\u007f\u000ePkP7", (short) (ZN.Xd() ^ 2422))), Long.TYPE};
        Object[] objArr = {new av(this.Code) { // from class: com.facetec.sdk.y.8
            @Override // com.facetec.sdk.av
            final void B() {
                if (y.this.S || y.this.Code.f2913h.getAlpha() != 1.0f || y.this.Code.f2913h.isEnabled()) {
                    return;
                }
                y.this.Code.f2913h.setEnabled(true, y.this.Code.f2913h.getAlpha() > 0.0f);
            }
        }, Long.valueOf(i2)};
        Method method = cls.getMethod(EO.Od("d\f}c\n\b'<#OH", (short) (ZN.Xd() ^ 27792)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final void I(boolean z2) throws Throwable {
        V();
        Class<?> cls = Class.forName(C1561oA.Qd("}\n~\f\b\u0001zC\u0004\u0007@]\u007f~~r~", (short) (FB.Xd() ^ 10535)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 27264);
        short sXd2 = (short) (C1607wl.Xd() ^ 13643);
        int[] iArr = new int["\u0015\u0014$}\u0013\u001c\"\u0001%&(\u001e,".length()];
        QB qb = new QB("\u0015\u0014$}\u0013\u001c\"\u0001%&(\u001e,");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Object[] objArr2 = {new AnonymousClass4(this.Code, z2, handler)};
            Method method = Class.forName(C1561oA.od("\u001a&\u001b($\u001d\u0017_ #\\u\u000e\u001a\u000f\u0016\u000e\u001a", (short) (C1607wl.Xd() ^ 4231))).getMethod(Wg.Zd("\u0004k S", (short) (OY.Xd() ^ 18212), (short) (OY.Xd() ^ 5883)), Class.forName(C1561oA.Kd("6.D0}=3A;\u0003(LFG;=HB", (short) (Od.Xd() ^ (-31728)))));
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

    final void V() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.Z;
        if (animatedVectorDrawableCompat != null) {
            animatedVectorDrawableCompat.stop();
            this.Z.clearAnimationCallbacks();
            this.Z = null;
        }
    }

    final void V(boolean z2) {
        this.C = z2;
        if (z2) {
            B();
            Z(true);
            this.Code.getActivity().runOnUiThread(new av(this.Code) { // from class: com.facetec.sdk.y.7
                @Override // com.facetec.sdk.av
                public final void B() {
                    y.this.Code.f2913h.animate().alpha(0.0f).setDuration(800L).setListener(null).start();
                }
            });
        }
    }

    final void Z() {
        if (this.Code.getActivity() == null) {
            return;
        }
        this.Code.getActivity().runOnUiThread(new av(this.Code) { // from class: com.facetec.sdk.y.6
            @Override // com.facetec.sdk.av
            final void B() {
                y.this.V(true);
                y.this.Code(false);
                y.this.Code.f2910e.animate().alpha(0.0f).setDuration(800L).setListener(null).withEndAction(new av(y.this.Code) { // from class: com.facetec.sdk.y.6.4
                    @Override // com.facetec.sdk.av
                    final void B() {
                        y.this.V();
                        y.this.Code.D.setVisibility(8);
                        y.this.Code.F.setVisibility(0);
                    }
                }).start();
            }
        });
    }

    final void Z(final String str) {
        if (this.Code.getActivity() == null) {
            return;
        }
        this.Code.getActivity().runOnUiThread(new av(this.Code) { // from class: com.facetec.sdk.y.10
            @Override // com.facetec.sdk.av
            public final void B() {
                y.this.Code.f2907b.setText(str);
            }
        });
    }
}
