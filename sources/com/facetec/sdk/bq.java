package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.dynatrace.android.callback.Callback;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.facetec.sdk.ad;
import com.facetec.sdk.bg;
import com.facetec.sdk.o;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import cz.msebera.android.httpclient.HttpStatus;
import io.sentry.clientreport.DiscardedEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
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
public final class bq extends Fragment {
    public static boolean B = false;
    public ImageView Code;
    private TextView D;
    private ImageView F;
    cg I;
    private LinearLayout L;

    /* JADX INFO: renamed from: a */
    private V f3055a;

    /* JADX INFO: renamed from: b */
    private TextView f3056b;

    /* JADX INFO: renamed from: c */
    private ao f3057c;

    /* JADX INFO: renamed from: d */
    private View f3058d;

    /* JADX INFO: renamed from: e */
    private FrameLayout f3059e;

    /* JADX INFO: renamed from: g */
    private Handler f3061g;

    /* JADX INFO: renamed from: h */
    private Handler f3062h;

    /* JADX INFO: renamed from: i */
    private Handler f3063i;

    /* JADX INFO: renamed from: n */
    private Semaphore f3068n;

    /* JADX INFO: renamed from: s */
    private Handler f3073s;

    /* JADX INFO: renamed from: t */
    private ak f3074t;
    private int S = 30;
    private boolean C = false;

    /* JADX INFO: renamed from: j */
    private boolean f3064j = false;

    /* JADX INFO: renamed from: f */
    private boolean f3060f = false;

    /* JADX INFO: renamed from: o */
    private boolean f3069o = false;

    /* JADX INFO: renamed from: k */
    private boolean f3065k = false;

    /* JADX INFO: renamed from: m */
    private boolean f3067m = false;
    ah V = null;
    boolean Z = false;

    /* JADX INFO: renamed from: l */
    private final int f3066l = (int) ce.V(12);

    /* JADX INFO: renamed from: p */
    private boolean f3070p = false;

    /* JADX INFO: renamed from: q */
    private final Runnable f3071q = new Runnable() { // from class: com.facetec.sdk.bq.11
        AnonymousClass11() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ai.L() == ah.ZOOM_CLOSE) {
                bg.B(bq.this.V(), bg.V.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
            }
        }
    };

    /* JADX INFO: renamed from: r */
    private final ad.Z f3072r = new am() { // from class: com.facetec.sdk.bq.2
        AnonymousClass2() {
        }

        @Override // com.facetec.sdk.am, com.facetec.sdk.ad.Z
        public final void Code(al alVar, aj ajVar, ak akVar, an anVar) throws Throwable {
            if (alVar == al.TIMEOUT_GO_TO_RETRY) {
                ad adVarI = bq.this.I();
                if (adVarI != null) {
                    adVarI.F();
                    adVarI.Code(bq.this.f3072r);
                }
                g gVarV = bq.this.V();
                if (gVarV != null) {
                    gVarV.F();
                    return;
                }
                return;
            }
            if (bq.this.f3064j && alVar != al.DETECTING_LIGHT_MODE) {
                if (alVar == al.DETECTING_FACE_FEEDBACK) {
                    if (!bq.this.isAdded() || bq.this.C) {
                        return;
                    }
                    bq.this.f3074t = akVar;
                    bq.this.B(akVar);
                    return;
                }
                ad adVarI2 = bq.this.I();
                if (adVarI2 != null) {
                    adVarI2.F();
                    adVarI2.Code(bq.this.f3072r);
                }
                bq.this.B(bq.this.V());
            }
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.bq$1 */
    final class AnonymousClass1 implements View.OnTouchListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                bq.this.Code.setAlpha(0.4f);
            } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > bq.this.Code.getWidth() + bq.this.Code.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > bq.this.Code.getHeight() + bq.this.Code.getTop() + 10) {
                bq.this.Code.setAlpha(1.0f);
            } else if (motionEvent.getAction() == 1) {
                bq.this.Code.setAlpha(1.0f);
                bq.this.Code.setEnabled(false);
                if (bq.this.V() == null) {
                    return false;
                }
                bq.this.Code.performClick();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$10 */
    final class AnonymousClass10 extends av {
        AnonymousClass10(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            bq.this.f3068n.release();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$11 */
    final class AnonymousClass11 implements Runnable {
        AnonymousClass11() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ai.L() == ah.ZOOM_CLOSE) {
                bg.B(bq.this.V(), bg.V.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$2 */
    final class AnonymousClass2 extends am {
        AnonymousClass2() {
        }

        @Override // com.facetec.sdk.am, com.facetec.sdk.ad.Z
        public final void Code(al alVar, aj ajVar, ak akVar, an anVar) throws Throwable {
            if (alVar == al.TIMEOUT_GO_TO_RETRY) {
                ad adVarI = bq.this.I();
                if (adVarI != null) {
                    adVarI.F();
                    adVarI.Code(bq.this.f3072r);
                }
                g gVarV = bq.this.V();
                if (gVarV != null) {
                    gVarV.F();
                    return;
                }
                return;
            }
            if (bq.this.f3064j && alVar != al.DETECTING_LIGHT_MODE) {
                if (alVar == al.DETECTING_FACE_FEEDBACK) {
                    if (!bq.this.isAdded() || bq.this.C) {
                        return;
                    }
                    bq.this.f3074t = akVar;
                    bq.this.B(akVar);
                    return;
                }
                ad adVarI2 = bq.this.I();
                if (adVarI2 != null) {
                    adVarI2.F();
                    adVarI2.Code(bq.this.f3072r);
                }
                bq.this.B(bq.this.V());
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] Code;
        static final /* synthetic */ int[] I;

        static {
            int[] iArr = new int[FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            Code = iArr;
            try {
                iArr[FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[FaceTecSecurityWatermarkImage.values().length];
            I = iArr2;
            try {
                iArr2[FaceTecSecurityWatermarkImage.FACETEC_ZOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                I[FaceTecSecurityWatermarkImage.FACETEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$4 */
    final class AnonymousClass4 implements View.OnClickListener {
        private /* synthetic */ g B;

        AnonymousClass4(g gVar) {
            gVar = gVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                if (bq.this.f3060f) {
                    br.B(gVar, bp.ZOOM_EVENT_ZOOM_SESSION_FAIL);
                }
                gVar.c();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$5 */
    final class AnonymousClass5 implements ViewTreeObserver.OnGlobalLayoutListener {
        AnonymousClass5() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (bq.this.f3067m) {
                return;
            }
            bq.Code(bq.this);
            float fCode = ba.Code();
            float fV = ba.V();
            int iZ = ba.Z();
            int iV = (int) (ce.V(ba.Code) * fV * fCode);
            float f2 = iZ / 2.0f;
            int iRound = Math.round(f2);
            int iRound2 = Math.round(f2);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bq.this.Code.getLayoutParams();
            layoutParams.setMargins(iRound, iRound, 0, 0);
            layoutParams.setMarginStart(iRound);
            layoutParams.setMarginEnd(iRound);
            bq.this.Code.setLayoutParams(layoutParams);
            bq.this.Code.setPadding(iRound2, iRound2, iRound2, iRound2);
            bq.this.Code.getLayoutParams().height = iV;
            bq.this.Code.getLayoutParams().width = iV;
            bq.this.Code.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$6 */
    final class AnonymousClass6 implements Runnable {
        AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            bq.this.Code.setImageResource(ba.ay());
            bq.this.I.S();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$7 */
    final class AnonymousClass7 extends av {

        /* JADX INFO: renamed from: com.facetec.sdk.bq$7$1 */
        final class AnonymousClass1 extends av {
            AnonymousClass1(Fragment fragment) {
                super(fragment);
            }

            @Override // com.facetec.sdk.av
            public final void B() {
                if (bq.this.C) {
                    return;
                }
                bq.this.L.setAlpha(0.0f);
                bq.this.L.setVisibility(0);
                bq.this.D.setAlpha(0.0f);
                bq.this.f3070p = false;
                bq.this.I.Z(false);
                int iL = bq.this.I.L() - (bq.this.f3066l << 1);
                if ((bq.this.I.C() - bq.this.L.getHeight()) - (bq.this.f3066l << 1) >= iL && n.S() < 1.4d) {
                    bq.this.L.setY(iL);
                }
                bq.this.L.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
            }
        }

        /* JADX INFO: renamed from: com.facetec.sdk.bq$7$4 */
        final class AnonymousClass4 extends av {
            AnonymousClass4(Fragment fragment) {
                super(fragment);
            }

            @Override // com.facetec.sdk.av
            public final void B() {
                bq.b(bq.this);
            }
        }

        AnonymousClass7(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() throws Throwable {
            bq.this.I.setVisibility(0);
            ao aoVar = bq.this.f3057c;
            aoVar.postDelayed(new Runnable() { // from class: com.facetec.sdk.ao.4
                private /* synthetic */ int B = 500;

                AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    float y2 = ao.this.getY();
                    ao.this.setVisibility(0);
                    ao.this.setAlpha(0.0f);
                    ao.this.setY(y2 - (r1.Code.getHeight() / 2));
                    ao.this.animate().setDuration(this.B).alpha(1.0f).y(y2).setListener(null).start();
                }
            }, 50L);
            bq.this.I.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
            bq.this.f3059e.animate().alpha(0.0f).setDuration(300L).setListener(null).start();
            if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT || FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) {
                bq.this.Code.setVisibility(0);
                bq.this.Code.animate().alpha(1.0f).setDuration(500L).setStartDelay(50L).setListener(null).start();
            }
            g gVarV = bq.this.V();
            if (gVarV == null) {
                return;
            }
            gVarV.I.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
            Handler handler = bq.this.f3061g;
            AnonymousClass1 anonymousClass1 = new av(bq.this) { // from class: com.facetec.sdk.bq.7.1
                AnonymousClass1(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                public final void B() {
                    if (bq.this.C) {
                        return;
                    }
                    bq.this.L.setAlpha(0.0f);
                    bq.this.L.setVisibility(0);
                    bq.this.D.setAlpha(0.0f);
                    bq.this.f3070p = false;
                    bq.this.I.Z(false);
                    int iL = bq.this.I.L() - (bq.this.f3066l << 1);
                    if ((bq.this.I.C() - bq.this.L.getHeight()) - (bq.this.f3066l << 1) >= iL && n.S() < 1.4d) {
                        bq.this.L.setY(iL);
                    }
                    bq.this.L.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                }
            };
            Class<?> cls = Class.forName(Qg.kd("\u0017#\u0018%!\u001a\u0014\\\u001d Yr\u000b\u0017\f\u0013\u000b\u0017", (short) (C1580rY.Xd() ^ (-22700)), (short) (C1580rY.Xd() ^ (-28563))));
            Class<?>[] clsArr = {Class.forName(yg.hg.Vd("@6J4\u007f=1=5z\u001e@87))2*", (short) (Od.Xd() ^ (-2682)), (short) (Od.Xd() ^ (-6664)))), Long.TYPE};
            Object[] objArr = {anonymousClass1, 500L};
            short sXd = (short) (OY.Xd() ^ 5235);
            int[] iArr = new int["\u001c\u001a\u001d\u001dk\f\u0012\u0006\u001d\b\u0006".length()];
            QB qb = new QB("\u001c\u001a\u001d\u001dk\f\u0012\u0006\u001d\b\u0006");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                Handler handler2 = bq.this.f3061g;
                AnonymousClass4 anonymousClass4 = new av(bq.this) { // from class: com.facetec.sdk.bq.7.4
                    AnonymousClass4(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() {
                        bq.b(bq.this);
                    }
                };
                Class<?> cls2 = Class.forName(C1561oA.yd("\u0015!\u0016#\u001f\u0018\u0012Z+.g\u0001\u0019%\u001a!)5", (short) (Od.Xd() ^ (-32174))));
                Class<?>[] clsArr2 = new Class[2];
                short sXd2 = (short) (FB.Xd() ^ 20193);
                int[] iArr2 = new int["-%;'t4*82y\u001fC=>24?9".length()];
                QB qb2 = new QB("-%;'t4*82y\u001fC=>24?9");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr2[1] = Long.TYPE;
                Object[] objArr2 = {anonymousClass4, 1150L};
                Method method2 = cls2.getMethod(Xg.qd("FFKM\u001e@H>WDD", (short) (C1580rY.Xd() ^ (-29145)), (short) (C1580rY.Xd() ^ (-29683))), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler2, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$8 */
    final class AnonymousClass8 extends av {
        AnonymousClass8(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() throws Throwable {
            bq.this.f3057c.V();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bq$9 */
    final class AnonymousClass9 extends av {
        private /* synthetic */ o V;
        private /* synthetic */ Context Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(Fragment fragment, Context context, o oVar) {
            super(fragment);
            context = context;
            oVar = oVar;
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            g gVarV;
            ad adVarI = bq.this.I();
            if (adVarI == null || adVarI.Z(context, oVar.F) || (gVarV = bq.this.V()) == null) {
                return;
            }
            gVarV.Code(bo.f3042f);
        }
    }

    class V implements ad.B {

        /* JADX INFO: renamed from: com.facetec.sdk.bq$V$2 */
        final class AnonymousClass2 extends av {
            final /* synthetic */ g Code;

            /* JADX INFO: renamed from: com.facetec.sdk.bq$V$2$1 */
            final class AnonymousClass1 extends av {
                AnonymousClass1(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                public final void B() {
                    gVar.Z();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Fragment fragment, g gVar) {
                super(fragment);
                gVar = gVar;
            }

            @Override // com.facetec.sdk.av
            public final void B() throws Throwable {
                Handler handler = bq.this.f3061g;
                AnonymousClass1 anonymousClass1 = new av(bq.this) { // from class: com.facetec.sdk.bq.V.2.1
                    AnonymousClass1(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() {
                        gVar.Z();
                    }
                };
                Class<?> cls = Class.forName(Jg.Wd("W2]\"S\u000b<?6gwG\u0016a\u0011M|7", (short) (Od.Xd() ^ (-29551)), (short) (Od.Xd() ^ (-23694))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (OY.Xd() ^ 9044);
                short sXd2 = (short) (OY.Xd() ^ 24736);
                int[] iArr = new int["~c!C\u0003M[r-p\u000f+r+-C\u00024".length()];
                QB qb = new QB("~c!C\u0003M[r-p\u000f+r+-C\u00024");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr = {anonymousClass1};
                Method method = cls.getMethod(C1626yg.Ud("\u0018L\tR", (short) (OY.Xd() ^ 30023), (short) (OY.Xd() ^ 2290)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        /* JADX INFO: renamed from: com.facetec.sdk.bq$V$3 */
        final class AnonymousClass3 extends av {
            final /* synthetic */ g B;

            /* JADX INFO: renamed from: com.facetec.sdk.bq$V$3$2 */
            final class AnonymousClass2 extends av {
                AnonymousClass2(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                public final void B() {
                    gVar.L();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Fragment fragment, g gVar) {
                super(fragment);
                gVar = gVar;
            }

            @Override // com.facetec.sdk.av
            public final void B() throws Throwable {
                Handler handler = bq.this.f3061g;
                Object[] objArr = {new av(bq.this) { // from class: com.facetec.sdk.bq.V.3.2
                    AnonymousClass2(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() {
                        gVar.L();
                    }
                }};
                Method method = Class.forName(Ig.wd("\u0002^b\u001c\nO*;V]\u0012R=HFo0+", (short) (FB.Xd() ^ 2046))).getMethod(C1561oA.Qd("hfii", (short) (C1633zX.Xd() ^ (-22141))), Class.forName(EO.Od("D\u0004-9\u0010\f^U\n}\"e\u000e\u001a\u0012sB/", (short) (OY.Xd() ^ 29937))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        /* JADX INFO: renamed from: com.facetec.sdk.bq$V$4 */
        final class AnonymousClass4 extends av {
            final /* synthetic */ g V;

            /* JADX INFO: renamed from: com.facetec.sdk.bq$V$4$5 */
            final class AnonymousClass5 extends av {
                AnonymousClass5(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                public final void B() {
                    gVar.S();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Fragment fragment, g gVar) {
                super(fragment);
                gVar = gVar;
            }

            @Override // com.facetec.sdk.av
            public final void B() throws Throwable {
                Handler handler = bq.this.f3061g;
                AnonymousClass5 anonymousClass5 = new av(bq.this) { // from class: com.facetec.sdk.bq.V.4.5
                    AnonymousClass5(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() {
                        gVar.S();
                    }
                };
                Class<?> cls = Class.forName(C1593ug.zd("UcZigb^)kp,Gaofoiw", (short) (Od.Xd() ^ (-4546)), (short) (Od.Xd() ^ (-10918))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (C1499aX.Xd() ^ (-14918));
                int[] iArr = new int["F<P:\u0006C7C;\u0001$F>=//80".length()];
                QB qb = new QB("F<P:\u0006C7C;\u0001$F>=//80");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr = {anonymousClass5};
                Method method = cls.getMethod(C1561oA.Kd("\u0011\u0011\u0016\u0018", (short) (ZN.Xd() ^ 27927)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        private V() {
        }

        /* synthetic */ V(bq bqVar, byte b2) {
            this();
        }

        @Override // com.facetec.sdk.ad.B
        public final void Code(ah ahVar, ac acVar) throws Throwable {
            g gVarV = bq.this.V();
            if (!bq.this.isAdded() || gVarV == null) {
                return;
            }
            if (bq.this.I.D() && acVar == ac.HOLD_STEADY && !bq.this.f3070p) {
                bq.this.D.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
                bq.this.f3070p = true;
            }
            if (!bq.this.f3060f && acVar != ac.FACE_NOT_FOUND) {
                bq.j(bq.this);
                if (!bq.this.f3069o) {
                    bq.this.f3069o = true;
                    cb.V(gVarV);
                }
                gVarV.D();
            }
            if (!bq.this.isAdded() || bq.this.C) {
                return;
            }
            if (bq.this.V != ahVar) {
                if (bq.this.V != null) {
                    bq.this.L();
                }
                bq.this.V = ahVar;
                bq.this.Z = false;
            }
            if (ahVar == ah.ZOOM_CLOSE) {
                bq.h(bq.this);
            }
            bq.this.I(ahVar, acVar);
        }

        @Override // com.facetec.sdk.ad.B
        public final void I() throws Throwable {
            o oVar = (o) bq.this.getActivity();
            if (oVar != null) {
                oVar.o();
            }
            g gVarV = bq.this.V();
            if (!bq.this.isAdded() || gVarV == null) {
                return;
            }
            bq.this.Z();
            cb.Z(gVarV);
            if (bq.this.f3060f) {
                br.B(gVarV, bp.ZOOM_EVENT_ZOOM_SESSION_FAIL);
            }
            bq.V(bq.this, new av(bq.this) { // from class: com.facetec.sdk.bq.V.3
                final /* synthetic */ g B;

                /* JADX INFO: renamed from: com.facetec.sdk.bq$V$3$2 */
                final class AnonymousClass2 extends av {
                    AnonymousClass2(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() {
                        gVar.L();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(Fragment fragment, g gVarV2) {
                    super(fragment);
                    gVar = gVarV2;
                }

                @Override // com.facetec.sdk.av
                public final void B() throws Throwable {
                    Handler handler = bq.this.f3061g;
                    Object[] objArr = {new av(bq.this) { // from class: com.facetec.sdk.bq.V.3.2
                        AnonymousClass2(Fragment fragment) {
                            super(fragment);
                        }

                        @Override // com.facetec.sdk.av
                        public final void B() {
                            gVar.L();
                        }
                    }};
                    Method method = Class.forName(Ig.wd("\u0002^b\u001c\nO*;V]\u0012R=HFo0+", (short) (FB.Xd() ^ 2046))).getMethod(C1561oA.Qd("hfii", (short) (C1633zX.Xd() ^ (-22141))), Class.forName(EO.Od("D\u0004-9\u0010\f^U\n}\"e\u000e\u001a\u0012sB/", (short) (OY.Xd() ^ 29937))));
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }, false);
        }

        @Override // com.facetec.sdk.ad.B
        public final void V() throws Throwable {
            o oVar = (o) bq.this.getActivity();
            if (oVar != null) {
                oVar.o();
            }
            g gVarV = bq.this.V();
            if (!bq.this.isAdded() || gVarV == null) {
                return;
            }
            bq.this.Z();
            cb.Z(gVarV);
            if (bq.this.f3060f) {
                br.B(gVarV, bp.ZOOM_EVENT_ZOOM_SESSION_FAIL);
            }
            bq.V(bq.this, new av(bq.this) { // from class: com.facetec.sdk.bq.V.4
                final /* synthetic */ g V;

                /* JADX INFO: renamed from: com.facetec.sdk.bq$V$4$5 */
                final class AnonymousClass5 extends av {
                    AnonymousClass5(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() {
                        gVar.S();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(Fragment fragment, g gVarV2) {
                    super(fragment);
                    gVar = gVarV2;
                }

                @Override // com.facetec.sdk.av
                public final void B() throws Throwable {
                    Handler handler = bq.this.f3061g;
                    AnonymousClass5 anonymousClass5 = new av(bq.this) { // from class: com.facetec.sdk.bq.V.4.5
                        AnonymousClass5(Fragment fragment) {
                            super(fragment);
                        }

                        @Override // com.facetec.sdk.av
                        public final void B() {
                            gVar.S();
                        }
                    };
                    Class<?> cls = Class.forName(C1593ug.zd("UcZigb^)kp,Gaofoiw", (short) (Od.Xd() ^ (-4546)), (short) (Od.Xd() ^ (-10918))));
                    Class<?>[] clsArr = new Class[1];
                    short sXd = (short) (C1499aX.Xd() ^ (-14918));
                    int[] iArr = new int["F<P:\u0006C7C;\u0001$F>=//80".length()];
                    QB qb = new QB("F<P:\u0006C7C;\u0001$F>=//80");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i2));
                    Object[] objArr = {anonymousClass5};
                    Method method = cls.getMethod(C1561oA.Kd("\u0011\u0011\u0016\u0018", (short) (ZN.Xd() ^ 27927)), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }, false);
        }

        @Override // com.facetec.sdk.ad.B
        public final void Z() throws Throwable {
            o oVar = (o) bq.this.getActivity();
            if (oVar != null) {
                oVar.o();
            }
            g gVarV = bq.this.V();
            if (!bq.this.isAdded() || gVarV == null) {
                return;
            }
            bq.this.Z();
            if (bq.this.f3069o) {
                cb.B(gVarV);
                bq.this.f3069o = false;
            }
            if (bq.this.f3065k) {
                try {
                    bq.m(bq.this);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            br.B(gVarV, bp.ZOOM_EVENT_ZOOM_SESSION_SUCCESS);
            bq.V(bq.this, new av(bq.this) { // from class: com.facetec.sdk.bq.V.2
                final /* synthetic */ g Code;

                /* JADX INFO: renamed from: com.facetec.sdk.bq$V$2$1 */
                final class AnonymousClass1 extends av {
                    AnonymousClass1(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() {
                        gVar.Z();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Fragment fragment, g gVarV2) {
                    super(fragment);
                    gVar = gVarV2;
                }

                @Override // com.facetec.sdk.av
                public final void B() throws Throwable {
                    Handler handler = bq.this.f3061g;
                    AnonymousClass1 anonymousClass1 = new av(bq.this) { // from class: com.facetec.sdk.bq.V.2.1
                        AnonymousClass1(Fragment fragment) {
                            super(fragment);
                        }

                        @Override // com.facetec.sdk.av
                        public final void B() {
                            gVar.Z();
                        }
                    };
                    Class<?> cls = Class.forName(Jg.Wd("W2]\"S\u000b<?6gwG\u0016a\u0011M|7", (short) (Od.Xd() ^ (-29551)), (short) (Od.Xd() ^ (-23694))));
                    Class<?>[] clsArr = new Class[1];
                    short sXd = (short) (OY.Xd() ^ 9044);
                    short sXd2 = (short) (OY.Xd() ^ 24736);
                    int[] iArr = new int["~c!C\u0003M[r-p\u000f+r+-C\u00024".length()];
                    QB qb = new QB("~c!C\u0003M[r-p\u000f+r+-C\u00024");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                        i2++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i2));
                    Object[] objArr = {anonymousClass1};
                    Method method = cls.getMethod(C1626yg.Ud("\u0018L\tR", (short) (OY.Xd() ^ 30023), (short) (OY.Xd() ^ 2290)), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr);
                    } catch (InvocationTargetException e22) {
                        throw e22.getCause();
                    }
                }
            }, true);
        }
    }

    public void B(Context context) throws Throwable {
        a.B = bo.f3041e;
        this.C = false;
        o oVar = (o) getActivity();
        if (oVar != null) {
            oVar.aa = o.L.ZOOM_SESSION_STARTED;
        }
        Handler handler = this.f3061g;
        AnonymousClass9 anonymousClass9 = new av(this) { // from class: com.facetec.sdk.bq.9
            private /* synthetic */ o V;
            private /* synthetic */ Context Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(Fragment this, Context context2, o oVar2) {
                super(this);
                context = context2;
                oVar = oVar2;
            }

            @Override // com.facetec.sdk.av
            public final void B() {
                g gVarV;
                ad adVarI = bq.this.I();
                if (adVarI == null || adVarI.Z(context, oVar.F) || (gVarV = bq.this.V()) == null) {
                    return;
                }
                gVarV.Code(bo.f3042f);
            }
        };
        short sXd = (short) (OY.Xd() ^ 321);
        short sXd2 = (short) (OY.Xd() ^ 29277);
        int[] iArr = new int["%j$C$gn ':Z,aX\u0002+\bF".length()];
        QB qb = new QB("%j$C$gn ':Z,aX\u0002+\bF");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(C1561oA.Xd("@8N:\bG=KE\r2VPQEGRL", (short) (FB.Xd() ^ 8842))), Long.TYPE};
        Object[] objArr = {anonymousClass9, 20L};
        short sXd3 = (short) (ZN.Xd() ^ 14839);
        int[] iArr2 = new int["[[`b3U]S\\II".length()];
        QB qb2 = new QB("[[`b3U]S\\II");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd3 ^ i3) + xuXd2.CK(iKK2));
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

    public synchronized void B(ak akVar) {
        S();
        this.f3057c.B(akVar);
    }

    static bq Code(String str) {
        bq bqVar = new bq();
        Bundle bundle = new Bundle();
        bundle.putString(DiscardedEvent.JsonKeys.REASON, str);
        bqVar.setArguments(bundle);
        return bqVar;
    }

    static /* synthetic */ boolean Code(bq bqVar) {
        bqVar.f3067m = true;
        return true;
    }

    public ad I() {
        g gVarV = V();
        if (gVarV != null) {
            return gVarV.Z;
        }
        return null;
    }

    public synchronized void I(ah ahVar, ac acVar) {
        if (ahVar == ah.ZOOM_FAR) {
            S();
        }
        if (acVar == ac.HOLD_STEADY) {
            this.I.Code();
            this.Z = true;
        }
        this.f3057c.Code(acVar);
    }

    public void L() {
        if (this.Z || !this.f3060f) {
            return;
        }
        this.I.Code();
        this.Z = true;
    }

    private void S() throws Throwable {
        if (this.I.D()) {
            this.I.c();
        }
    }

    public g V() {
        return (g) getActivity();
    }

    static /* synthetic */ void V(bq bqVar, Runnable runnable, boolean z2) throws Throwable {
        bqVar.L();
        int i2 = z2 ? 400 : 300;
        bqVar.I.e();
        bqVar.I.I(new av(bqVar) { // from class: com.facetec.sdk.bq.10
            AnonymousClass10(Fragment bqVar2) {
                super(bqVar2);
            }

            @Override // com.facetec.sdk.av
            public final void B() {
                bq.this.f3068n.release();
            }
        }, z2);
        try {
            bqVar2.f3068n.acquire();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        bqVar2.Code.setVisibility(4);
        bqVar2.f3058d.setVisibility(4);
        bqVar2.f3056b.setVisibility(4);
        ba.I(bqVar2.f3059e);
        bqVar2.f3059e.animate().alpha(1.0f).setDuration(i2 + 100).setStartDelay(0L).setListener(null).start();
        AnimatorSet duration = new AnimatorSet().setDuration(i2);
        duration.playTogether(ObjectAnimator.ofFloat(bqVar2.L, (Property<LinearLayout, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(bqVar2.f3057c, (Property<ao, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(bqVar2.Code, (Property<ImageView, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(bqVar2.f3057c, (Property<ao, Float>) View.TRANSLATION_Y, (-bqVar2.f3057c.getHeight()) / 2));
        duration.start();
        runnable.run();
    }

    public void Z() {
        ad adVarI = I();
        if (adVarI != null) {
            adVarI.I(this.f3055a);
            this.f3055a = null;
        }
    }

    static /* synthetic */ boolean b(bq bqVar) {
        bqVar.f3064j = true;
        return true;
    }

    static /* synthetic */ void h(bq bqVar) throws Throwable {
        a.B = bo.f3039c;
        if (bqVar.I.D()) {
            return;
        }
        bqVar.I.a();
        if (FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            bg.B(bqVar.V(), bg.V.FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC);
            Handler handler = new Handler();
            bqVar.f3073s = handler;
            Runnable runnable = bqVar.f3071q;
            Class<?> cls = Class.forName(Qg.kd("x\u0005y\u0007\u0003{u>~\u0002;Tlxmtlx", (short) (Od.Xd() ^ (-29613)), (short) (Od.Xd() ^ (-17605))));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1499aX.Xd() ^ (-5199));
            short sXd2 = (short) (C1499aX.Xd() ^ (-3652));
            int[] iArr = new int["\u0001v\u000bt@}q}u;^\u0001xwiirj".length()];
            QB qb = new QB("\u0001v\u000bt@}q}u;^\u0001xwiirj");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Long.TYPE;
            Object[] objArr = {runnable, 4500L};
            Method method = cls.getMethod(C1561oA.ud(")'**x\u0019\u001f\u0013*\u0015\u0013", (short) (FB.Xd() ^ 7276)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (FaceTecSDK.V.L.enablePulsatingText) {
            Handler handler2 = new Handler();
            bqVar.f3062h = handler2;
            AnonymousClass8 anonymousClass8 = new av(bqVar) { // from class: com.facetec.sdk.bq.8
                AnonymousClass8(Fragment bqVar2) {
                    super(bqVar2);
                }

                @Override // com.facetec.sdk.av
                public final void B() throws Throwable {
                    bq.this.f3057c.V();
                }
            };
            Class<?> cls2 = Class.forName(C1561oA.yd("y\bz\n\f\u0007~I\u0010\u0015Lg\u0006\u0014\u0007\u0010m{", (short) (C1607wl.Xd() ^ 12552)));
            Class<?>[] clsArr2 = new Class[2];
            short sXd3 = (short) (Od.Xd() ^ (-4271));
            int[] iArr2 = new int["^VlX&e[ic+Ptnocepj".length()];
            QB qb2 = new QB("^VlX&e[ic+Ptnocepj");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                i3++;
            }
            clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr2[1] = Long.TYPE;
            Object[] objArr2 = {anonymousClass8, Long.valueOf(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec)};
            Method method2 = cls2.getMethod(Xg.qd("llqsDfnd}jj", (short) (C1607wl.Xd() ^ 27304), (short) (C1607wl.Xd() ^ 26458)), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(handler2, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    static /* synthetic */ boolean j(bq bqVar) {
        bqVar.f3060f = true;
        return true;
    }

    static /* synthetic */ boolean m(bq bqVar) {
        bqVar.f3065k = false;
        return false;
    }

    final ak B() {
        return this.f3074t;
    }

    final void Code() {
        Semaphore semaphore = this.f3068n;
        if (semaphore != null) {
            try {
                if (semaphore.tryAcquire(2000L, TimeUnit.MILLISECONDS)) {
                    this.f3068n.release();
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3060f = false;
        this.f3069o = false;
        this.f3065k = false;
        this.f3068n = new Semaphore(1);
    }

    @Override // android.app.Fragment
    public final Animator onCreateAnimator(int i2, boolean z2, int i3) {
        return !z2 ? ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 0.0f).setDuration(400L) : super.onCreateAnimator(i2, z2, i3);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.facetec_facescan_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.C = true;
        Handler handler = this.f3061g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f3063i;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        Handler handler3 = this.f3062h;
        if (handler3 != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        ao aoVar = this.f3057c;
        if (aoVar != null) {
            aoVar.Code();
        }
        Z();
        Handler handler4 = this.f3073s;
        if (handler4 != null) {
            handler4.removeCallbacksAndMessages(null);
            this.f3073s = null;
        }
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        g gVarV = V();
        ad adVarI = I();
        if (adVarI == null) {
            return;
        }
        a.B = bo.f3037a;
        V v2 = new V(this, (byte) 0);
        this.f3055a = v2;
        adVarI.B(v2);
        al alVarA = adVarI.a();
        ak akVarC = adVarI.c();
        if (alVarA != al.READY_TO_START_ZOOM_SESSION) {
            adVarI.V(this.f3072r);
        }
        this.L = (LinearLayout) view.findViewById(R.id.zoomLogoContainer);
        this.F = (ImageView) view.findViewById(R.id.securityWatermark);
        this.D = (TextView) view.findViewById(R.id.zoomLogoText);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("]aFA-\u0006q*FO=2\u0014{p\u0017\u0013>.#\u0003r]", (short) (C1499aX.Xd() ^ (-9957)), (short) (C1499aX.Xd() ^ (-29358)))).getMethod(ZO.xd("x\u0012|Ld;#l\r;l4_h", (short) (OY.Xd() ^ 8533), (short) (OY.Xd() ^ 18976)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(gVarV, objArr);
            int i2 = AnonymousClass3.I[FaceTecSDK.V.securityWatermarkImage.ordinal()];
            if (i2 == 1) {
                this.F.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.facetec_internal_zoom_watermark));
            } else if (i2 == 2) {
                this.F.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.facetec_internal_facetec_watermark));
            }
            float fCode = ba.Code();
            this.F.setLayoutParams(new LinearLayout.LayoutParams(-2, (int) (Resources.getSystem().getDisplayMetrics().heightPixels * ba.V() * 0.15f * fCode)));
            this.S = 12;
            this.D.setVisibility(0);
            this.D.setTextSize(ba.V() * 8.0f * fCode);
            short sXd = (short) (C1633zX.Xd() ^ (-21297));
            short sXd2 = (short) (C1633zX.Xd() ^ (-4618));
            int[] iArr = new int["}\u0010RL$s|&\u00036f\f\\\\\u0004cm\u000eTv!".length()];
            QB qb = new QB("}\u0010RL$s|&\u00036f\f\\\\\u0004cm\u000eTv!");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
                i3++;
            }
            boolean zContains = str.contains(new String(iArr, 0, i3));
            String strWd = Ig.wd("Rn5\u0013\r>", (short) (OY.Xd() ^ 13623));
            if (zContains) {
                this.D.setText(strWd);
            } else {
                this.D.setText(strWd.concat(String.valueOf(Build.CPU_ABI.equals(EO.Od("gHU=l\u0013(ym", (short) (C1607wl.Xd() ^ 7175))) ? C1561oA.Qd("-B?7kq{", (short) (ZN.Xd() ^ 30437)) : "")));
            }
            this.L.setPadding(0, 0, 0, this.S);
            this.I = (cg) view.findViewById(R.id.zoomOval);
            this.f3058d = view.findViewById(R.id.instructionsBackground);
            this.Code = (ImageView) view.findViewById(R.id.zoomBackButton);
            this.f3056b = (TextView) view.findViewById(R.id.authReasonText);
            ao aoVar = (ao) view.findViewById(R.id.zoomProgressBar);
            this.f3057c = aoVar;
            aoVar.Z(alVarA, akVarC);
            ao aoVar2 = this.f3057c;
            if (aoVar2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aoVar2.getLayoutParams();
                ba.L();
                layoutParams.addRule(13, -1);
                layoutParams.setMargins(0, 0, 0, 0);
                aoVar2.requestLayout();
            }
            this.f3056b.setTypeface(bn.I);
            ba.Z(this.f3056b);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.transitionView);
            this.f3059e = frameLayout;
            ba.V(frameLayout);
            Object[] objArr2 = new Object[0];
            Method declaredMethod = Class.forName(C1593ug.zd("^lcrpkg2ty5Txy{q\u007f", (short) (FB.Xd() ^ 21747), (short) (FB.Xd() ^ 21114))).getDeclaredMethod(C1561oA.od("\u0010\r\u001br\u0006\r\u0011m\u0010\u000f\u000f\u0003\u000f", (short) (C1607wl.Xd() ^ HttpStatus.SC_REQUEST_TOO_LONG)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.f3061g = new Handler((Looper) declaredMethod.invoke(null, objArr2));
                this.f3063i = new Handler();
                if (alVarA == al.READY_TO_START_ZOOM_SESSION) {
                    B(gVarV);
                }
                this.Code.setEnabled(true);
                if (FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
                    this.Code.setImageDrawable(ContextCompat.getDrawable(gVarV, ba.ay()));
                }
                int i4 = AnonymousClass3.Code[FaceTecSDK.V.f2853d.V.ordinal()];
                if (i4 == 2) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.Code.getLayoutParams();
                    layoutParams2.removeRule(20);
                    layoutParams2.addRule(21);
                    this.Code.setLayoutParams(layoutParams2);
                } else if (i4 == 3 || i4 == 4) {
                    this.Code.setVisibility(8);
                }
                this.Code.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.bq.5
                    AnonymousClass5() {
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        if (bq.this.f3067m) {
                            return;
                        }
                        bq.Code(bq.this);
                        float fCode2 = ba.Code();
                        float fV = ba.V();
                        int iZ = ba.Z();
                        int iV = (int) (ce.V(ba.Code) * fV * fCode2);
                        float f2 = iZ / 2.0f;
                        int iRound = Math.round(f2);
                        int iRound2 = Math.round(f2);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) bq.this.Code.getLayoutParams();
                        layoutParams3.setMargins(iRound, iRound, 0, 0);
                        layoutParams3.setMarginStart(iRound);
                        layoutParams3.setMarginEnd(iRound);
                        bq.this.Code.setLayoutParams(layoutParams3);
                        bq.this.Code.setPadding(iRound2, iRound2, iRound2, iRound2);
                        bq.this.Code.getLayoutParams().height = iV;
                        bq.this.Code.getLayoutParams().width = iV;
                        bq.this.Code.requestLayout();
                    }
                });
                this.Code.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.bq.4
                    private /* synthetic */ g B;

                    AnonymousClass4(g gVarV2) {
                        gVar = gVarV2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Callback.onClick_enter(view2);
                        try {
                            if (bq.this.f3060f) {
                                br.B(gVar, bp.ZOOM_EVENT_ZOOM_SESSION_FAIL);
                            }
                            gVar.c();
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
                this.Code.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.bq.1
                    AnonymousClass1() {
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            bq.this.Code.setAlpha(0.4f);
                        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > bq.this.Code.getWidth() + bq.this.Code.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > bq.this.Code.getHeight() + bq.this.Code.getTop() + 10) {
                            bq.this.Code.setAlpha(1.0f);
                        } else if (motionEvent.getAction() == 1) {
                            bq.this.Code.setAlpha(1.0f);
                            bq.this.Code.setEnabled(false);
                            if (bq.this.V() == null) {
                                return false;
                            }
                            bq.this.Code.performClick();
                        }
                        return true;
                    }
                });
                g gVarV2 = V();
                if (gVarV2 != null) {
                    gVarV2.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.bq.6
                        AnonymousClass6() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bq.this.Code.setImageResource(ba.ay());
                            bq.this.I.S();
                        }
                    });
                }
                this.f3064j = false;
                this.I.setVisibility(0);
                this.I.setAlpha(1.0f);
                this.f3059e.setAlpha(0.0f);
                this.Code.setAlpha(0.0f);
                Handler handler = new Handler();
                AnonymousClass7 anonymousClass7 = new av(this) { // from class: com.facetec.sdk.bq.7

                    /* JADX INFO: renamed from: com.facetec.sdk.bq$7$1 */
                    final class AnonymousClass1 extends av {
                        AnonymousClass1(Fragment fragment) {
                            super(fragment);
                        }

                        @Override // com.facetec.sdk.av
                        public final void B() {
                            if (bq.this.C) {
                                return;
                            }
                            bq.this.L.setAlpha(0.0f);
                            bq.this.L.setVisibility(0);
                            bq.this.D.setAlpha(0.0f);
                            bq.this.f3070p = false;
                            bq.this.I.Z(false);
                            int iL = bq.this.I.L() - (bq.this.f3066l << 1);
                            if ((bq.this.I.C() - bq.this.L.getHeight()) - (bq.this.f3066l << 1) >= iL && n.S() < 1.4d) {
                                bq.this.L.setY(iL);
                            }
                            bq.this.L.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                        }
                    }

                    /* JADX INFO: renamed from: com.facetec.sdk.bq$7$4 */
                    final class AnonymousClass4 extends av {
                        AnonymousClass4(Fragment fragment) {
                            super(fragment);
                        }

                        @Override // com.facetec.sdk.av
                        public final void B() {
                            bq.b(bq.this);
                        }
                    }

                    AnonymousClass7(Fragment this) {
                        super(this);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() throws Throwable {
                        bq.this.I.setVisibility(0);
                        ao aoVar3 = bq.this.f3057c;
                        aoVar3.postDelayed(new Runnable() { // from class: com.facetec.sdk.ao.4
                            private /* synthetic */ int B = 500;

                            AnonymousClass4() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                float y2 = ao.this.getY();
                                ao.this.setVisibility(0);
                                ao.this.setAlpha(0.0f);
                                ao.this.setY(y2 - (r1.Code.getHeight() / 2));
                                ao.this.animate().setDuration(this.B).alpha(1.0f).y(y2).setListener(null).start();
                            }
                        }, 50L);
                        bq.this.I.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
                        bq.this.f3059e.animate().alpha(0.0f).setDuration(300L).setListener(null).start();
                        if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT || FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) {
                            bq.this.Code.setVisibility(0);
                            bq.this.Code.animate().alpha(1.0f).setDuration(500L).setStartDelay(50L).setListener(null).start();
                        }
                        g gVarV3 = bq.this.V();
                        if (gVarV3 == null) {
                            return;
                        }
                        gVarV3.I.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
                        Handler handler2 = bq.this.f3061g;
                        AnonymousClass1 anonymousClass1 = new av(bq.this) { // from class: com.facetec.sdk.bq.7.1
                            AnonymousClass1(Fragment fragment) {
                                super(fragment);
                            }

                            @Override // com.facetec.sdk.av
                            public final void B() {
                                if (bq.this.C) {
                                    return;
                                }
                                bq.this.L.setAlpha(0.0f);
                                bq.this.L.setVisibility(0);
                                bq.this.D.setAlpha(0.0f);
                                bq.this.f3070p = false;
                                bq.this.I.Z(false);
                                int iL = bq.this.I.L() - (bq.this.f3066l << 1);
                                if ((bq.this.I.C() - bq.this.L.getHeight()) - (bq.this.f3066l << 1) >= iL && n.S() < 1.4d) {
                                    bq.this.L.setY(iL);
                                }
                                bq.this.L.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                            }
                        };
                        Class<?> cls = Class.forName(Qg.kd("\u0017#\u0018%!\u001a\u0014\\\u001d Yr\u000b\u0017\f\u0013\u000b\u0017", (short) (C1580rY.Xd() ^ (-22700)), (short) (C1580rY.Xd() ^ (-28563))));
                        Class<?>[] clsArr = {Class.forName(yg.hg.Vd("@6J4\u007f=1=5z\u001e@87))2*", (short) (Od.Xd() ^ (-2682)), (short) (Od.Xd() ^ (-6664)))), Long.TYPE};
                        Object[] objArr3 = {anonymousClass1, 500L};
                        short sXd3 = (short) (OY.Xd() ^ 5235);
                        int[] iArr2 = new int["\u001c\u001a\u001d\u001dk\f\u0012\u0006\u001d\b\u0006".length()];
                        QB qb2 = new QB("\u001c\u001a\u001d\u001dk\f\u0012\u0006\u001d\b\u0006");
                        int i22 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i22] = xuXd2.fK(sXd3 + i22 + xuXd2.CK(iKK2));
                            i22++;
                        }
                        Method method2 = cls.getMethod(new String(iArr2, 0, i22), clsArr);
                        try {
                            method2.setAccessible(true);
                            method2.invoke(handler2, objArr3);
                            Handler handler22 = bq.this.f3061g;
                            AnonymousClass4 anonymousClass4 = new av(bq.this) { // from class: com.facetec.sdk.bq.7.4
                                AnonymousClass4(Fragment fragment) {
                                    super(fragment);
                                }

                                @Override // com.facetec.sdk.av
                                public final void B() {
                                    bq.b(bq.this);
                                }
                            };
                            Class<?> cls2 = Class.forName(C1561oA.yd("\u0015!\u0016#\u001f\u0018\u0012Z+.g\u0001\u0019%\u001a!)5", (short) (Od.Xd() ^ (-32174))));
                            Class<?>[] clsArr2 = new Class[2];
                            short sXd22 = (short) (FB.Xd() ^ 20193);
                            int[] iArr22 = new int["-%;'t4*82y\u001fC=>24?9".length()];
                            QB qb22 = new QB("-%;'t4*82y\u001fC=>24?9");
                            int i32 = 0;
                            while (qb22.YK()) {
                                int iKK22 = qb22.KK();
                                Xu xuXd22 = Xu.Xd(iKK22);
                                iArr22[i32] = xuXd22.fK(xuXd22.CK(iKK22) - (((sXd22 + sXd22) + sXd22) + i32));
                                i32++;
                            }
                            clsArr2[0] = Class.forName(new String(iArr22, 0, i32));
                            clsArr2[1] = Long.TYPE;
                            Object[] objArr22 = {anonymousClass4, 1150L};
                            Method method22 = cls2.getMethod(Xg.qd("FFKM\u001e@H>WDD", (short) (C1580rY.Xd() ^ (-29145)), (short) (C1580rY.Xd() ^ (-29683))), clsArr2);
                            try {
                                method22.setAccessible(true);
                                method22.invoke(handler22, objArr22);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                };
                Class<?> cls = Class.forName(C1561oA.Kd("FTKZXSO\u001a\\a\u001d8R`W`Zh", (short) (OY.Xd() ^ LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE)));
                Class<?>[] clsArr = {Class.forName(Wg.Zd("V*\u001eg3H\u001cg?\\\u007f\u0002Y\u0010aA*\u001a", (short) (C1499aX.Xd() ^ (-28307)), (short) (C1499aX.Xd() ^ (-30062)))), Long.TYPE};
                Object[] objArr3 = {anonymousClass7, 0L};
                short sXd3 = (short) (C1633zX.Xd() ^ (-26782));
                int[] iArr2 = new int["338:\u000b-5+D11".length()];
                QB qb2 = new QB("338:\u000b-5+D11");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i5));
                    i5++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i5), clsArr);
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler, objArr3);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
