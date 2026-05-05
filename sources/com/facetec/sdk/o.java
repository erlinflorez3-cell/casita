package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.facetec.sdk.a;
import com.facetec.sdk.ad;
import com.facetec.sdk.ap;
import com.facetec.sdk.bg;
import com.facetec.sdk.cf;
import com.facetec.sdk.g;
import com.facetec.sdk.y.AnonymousClass1;
import com.facetec.sdk.y.AnonymousClass2;
import com.facetec.sdk.y.AnonymousClass5;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
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
abstract class o extends g implements ActivityCompat.OnRequestPermissionsResultCallback {
    RelativeLayout A;
    private Handler B;
    RelativeLayout C;
    private volatile bq D;
    ImageView G;
    k H;
    LinearLayout J;
    RelativeLayout K;
    float L;
    String M;
    RelativeLayout N;
    RelativeLayout O;
    FaceTecIDScanRetryMode P;
    FaceTecSessionResult Q;
    float S;
    FaceTecIDScanResult T;
    String U;
    Bitmap W;
    ImageView Y;

    /* JADX INFO: renamed from: a */
    RelativeLayout f3268a;
    private be aB;
    private y aH;
    private S aI;
    private cf aJ;
    private String aK;
    private int aL;
    private TextView aN;
    private LinearLayout aO;
    private ImageView aQ;
    private ImageView aR;
    private LinearLayout aT;
    private LinearLayout aU;
    private Handler aX;
    private RelativeLayout aZ;
    Integer ac;
    Integer ad;
    Integer ae;
    View af;
    private volatile ap ah;
    private volatile byte[][] ai;
    private volatile w aj;
    private volatile as ak;
    private volatile p al;
    private volatile byte[] am;
    private volatile byte[][] aq;

    /* JADX INFO: renamed from: b */
    RelativeLayout f3269b;
    private Timer ba;
    private Timer be;
    private ValueAnimator bg;
    private boolean bi;
    private TimerTask bj;

    /* JADX INFO: renamed from: c */
    RelativeLayout f3271c;

    /* JADX INFO: renamed from: d */
    RelativeLayout f3272d;

    /* JADX INFO: renamed from: e */
    RelativeLayout f3273e;

    /* JADX INFO: renamed from: f */
    View f3274f;

    /* JADX INFO: renamed from: g */
    ImageView f3275g;

    /* JADX INFO: renamed from: h */
    RelativeLayout f3276h;

    /* JADX INFO: renamed from: i */
    RelativeLayout f3277i;

    /* JADX INFO: renamed from: j */
    RelativeLayout f3278j;

    /* JADX INFO: renamed from: k */
    RelativeLayout f3279k;

    /* JADX INFO: renamed from: l */
    RelativeLayout f3280l;

    /* JADX INFO: renamed from: m */
    TextView f3281m;

    /* JADX INFO: renamed from: n */
    h f3282n;

    /* JADX INFO: renamed from: o */
    RelativeLayout f3283o;

    /* JADX INFO: renamed from: p */
    bf f3284p;

    /* JADX INFO: renamed from: q */
    TextView f3285q;

    /* JADX INFO: renamed from: r */
    bf f3286r;

    /* JADX INFO: renamed from: s */
    TextView f3287s;

    /* JADX INFO: renamed from: t */
    ImageView f3288t;

    /* JADX INFO: renamed from: u */
    RelativeLayout f3289u;

    /* JADX INFO: renamed from: v */
    bf f3290v;

    /* JADX INFO: renamed from: w */
    bf f3291w;

    /* JADX INFO: renamed from: x */
    LinearLayout f3292x;

    /* JADX INFO: renamed from: y */
    ImageView f3293y;

    /* JADX INFO: renamed from: z */
    LinearLayout f3294z;
    private volatile FaceTecSessionStatus ao = null;
    private volatile FaceTecSessionStatus an = FaceTecSessionStatus.SESSION_UNSUCCESSFUL;
    private boolean ap = false;
    private boolean au = false;
    private boolean av = false;
    private boolean as = false;
    private boolean ar = false;
    private boolean at = false;
    private boolean ax = false;
    private boolean ay = false;
    private boolean aA = false;
    private boolean az = false;
    private boolean aw = false;
    private boolean aC = false;
    private boolean aF = false;
    private boolean aD = false;
    private boolean aE = false;
    String F = "";
    private boolean aG = false;
    private boolean aP = false;
    private int aM = 0;
    Z E = Z.FRONT;
    private boolean aS = false;
    private boolean aW = false;
    private boolean aY = false;
    private int aV = 0;
    boolean R = false;
    private JSONObject bb = null;
    boolean ab = false;
    private int bd = 0;
    private boolean bc = false;
    ap.Code X = ap.Code.DEFAULT;
    L aa = L.NOT_STARTED;
    boolean ag = false;
    private boolean bh = false;
    private final Runnable bf = new Runnable() { // from class: com.facetec.sdk.o.14
        AnonymousClass14() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (com.facetec.sdk.Z.V(o.this)) {
                o oVar = o.this;
                Class<?> cls = Class.forName(C1626yg.Ud("TB\u0018rgx\t\u0011?\u0002\n\u0006v=OH`x,+%L\"", (short) (C1633zX.Xd() ^ (-7527)), (short) (C1633zX.Xd() ^ (-20951))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (Od.Xd() ^ (-16133));
                int[] iArr = new int["@\ry#Q\u001c@=\u0014b\u007fJ!\u001eRY##{C|".length()];
                QB qb = new QB("@\ry#Q\u001c@=\u0014b\u007fJ!\u001eRY##{C|");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    if (n.S((Context) method.invoke(oVar, objArr))) {
                        n.F();
                    } else {
                        o.this.I(FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED, (FaceTecIDScanStatus) null);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    };
    private final Runnable bl = new Runnable() { // from class: com.facetec.sdk.o.65
        AnonymousClass65() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ai.L() == ah.ZOOM_FAR) {
                bg.B(o.this, bg.V.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED);
            }
        }
    };
    private float bm = 0.0f;

    /* JADX INFO: renamed from: bo */
    private boolean f3270bo = false;
    private boolean bk = false;
    private TimerTask bn = new TimerTask() { // from class: com.facetec.sdk.o.33
        AnonymousClass33() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (o.this.aB != null) {
                o.this.aB.I(false);
            }
        }
    };
    private ad.Code br = new q() { // from class: com.facetec.sdk.o.36
        AnonymousClass36() {
        }

        @Override // com.facetec.sdk.q, com.facetec.sdk.ad.Code
        public final void I(ag agVar, ae aeVar) throws Throwable {
            int i2 = AnonymousClass63.Code[agVar.ordinal()];
            if (i2 == 1) {
                if (AnonymousClass63.B[aeVar.ordinal()] != 3) {
                    return;
                }
                o.this.aB.I(true);
            } else {
                if (i2 == 2) {
                    o.this.I(true);
                    return;
                }
                if (i2 == 3 && o.this.ab && o.this.f3286r.getVisibility() != 0) {
                    o.this.R = true;
                    o.this.f3286r.setAlpha(0.0f);
                    o.this.f3286r.setVisibility(0);
                    o.this.f3286r.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
                }
            }
        }
    };
    private boolean bp = false;
    private final cf.I bs = new cf.I() { // from class: com.facetec.sdk.o.56
        AnonymousClass56() {
        }

        @Override // com.facetec.sdk.cf.I
        public final void B(cl clVar) throws Throwable {
            o.J(o.this);
            o.this.ae();
            a.V(o.this, com.facetec.sdk.V.NFC_ERROR, o.V(clVar));
            if (clVar == cl.ConnectionError) {
                o.this.x();
            } else {
                o.this.Z(false);
            }
        }

        @Override // com.facetec.sdk.cf.I
        public final void Code() throws Throwable {
            o.J(o.this);
            o.this.ae();
            o.this.Z(true);
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.o$1 */
    final class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                o.this.f3275g.setAlpha(1.0f);
                o.this.onBackPressed();
                o.this.f3275g.setEnabled(false);
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$10 */
    final class AnonymousClass10 implements Runnable {
        AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.f3271c.animate().alpha(0.0f).setDuration(300L).setListener(null).start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$11 */
    final class AnonymousClass11 implements Runnable {
        private /* synthetic */ as Z;

        AnonymousClass11(as asVar) {
            asVar = asVar;
        }

        @Override // java.lang.Runnable
        public final void run() throws Exception {
            if (o.this.isFinishing()) {
                return;
            }
            FragmentManager fragmentManager = o.this.getFragmentManager();
            CX.ud();
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            int i2 = o.this.aL;
            as asVar = asVar;
            CX.ud();
            fragmentTransactionBeginTransaction.replace(i2, asVar, "RetryZoom").commitAllowingStateLoss();
            o.this.ak = asVar;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$12 */
    final class AnonymousClass12 extends av {
        AnonymousClass12(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() throws Exception {
            o.this.A();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$13 */
    final class AnonymousClass13 extends av {
        AnonymousClass13(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() throws Exception {
            FragmentManager fragmentManager = o.this.getFragmentManager();
            CX.ud();
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            int i2 = o.this.aL;
            ap apVar = o.this.ah;
            CX.ud();
            fragmentTransactionBeginTransaction.replace(i2, apVar, "Results").addToBackStack("zoom").commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$14 */
    final class AnonymousClass14 implements Runnable {
        AnonymousClass14() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (com.facetec.sdk.Z.V(o.this)) {
                o oVar = o.this;
                Class<?> cls = Class.forName(C1626yg.Ud("TB\u0018rgx\t\u0011?\u0002\n\u0006v=OH`x,+%L\"", (short) (C1633zX.Xd() ^ (-7527)), (short) (C1633zX.Xd() ^ (-20951))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (Od.Xd() ^ (-16133));
                int[] iArr = new int["@\ry#Q\u001c@=\u0014b\u007fJ!\u001eRY##{C|".length()];
                QB qb = new QB("@\ry#Q\u001c@=\u0014b\u007fJ!\u001eRY##{C|");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    if (n.S((Context) method.invoke(oVar, objArr))) {
                        n.F();
                    } else {
                        o.this.I(FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED, (FaceTecIDScanStatus) null);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$15 */
    final class AnonymousClass15 implements Runnable {
        AnonymousClass15() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.f3275g != null) {
                o.this.f3275g.setEnabled(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$16 */
    final class AnonymousClass16 implements Runnable {
        AnonymousClass16() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.f3268a.setVisibility(0);
            o.this.f3268a.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$17 */
    final class AnonymousClass17 implements Runnable {
        AnonymousClass17() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.B(FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (FaceTecIDScanStatus) null);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$18 */
    final class AnonymousClass18 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$18$1 */
        final class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.E == null || o.this.f3281m == null) {
                    return;
                }
                bb.B(o.this.f3281m, R.string.FaceTec_idscan_review_id_front_instruction_message);
            }
        }

        AnonymousClass18() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.18.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (o.this.E == null || o.this.f3281m == null) {
                        return;
                    }
                    bb.B(o.this.f3281m, R.string.FaceTec_idscan_review_id_front_instruction_message);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$19 */
    final class AnonymousClass19 implements Runnable {
        AnonymousClass19() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.f3271c.animate().alpha(0.0f).setDuration(300L).setListener(null).start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$2 */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.k();
            o.this.h();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$20 */
    final class AnonymousClass20 implements Runnable {
        private /* synthetic */ FaceTecIDScanStatus I;

        AnonymousClass20(FaceTecIDScanStatus faceTecIDScanStatus) {
            faceTecIDScanStatus = faceTecIDScanStatus;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            oVar.B(oVar.Q.getStatus(), faceTecIDScanStatus);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$21 */
    final class AnonymousClass21 implements Runnable {
        AnonymousClass21() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.O();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$22 */
    final class AnonymousClass22 implements Runnable {
        private /* synthetic */ String Code;

        AnonymousClass22(String str) {
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.ah != null) {
                o.this.ah.B(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$23 */
    final class AnonymousClass23 implements Runnable {
        final /* synthetic */ FaceTecIDScanNextStep I;

        /* JADX INFO: renamed from: com.facetec.sdk.o$23$5 */
        final class AnonymousClass5 implements Runnable {
            AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.Code(faceTecIDScanNextStep);
            }
        }

        AnonymousClass23(FaceTecIDScanNextStep faceTecIDScanNextStep) {
            faceTecIDScanNextStep = faceTecIDScanNextStep;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.ah != null) {
                o.this.ah.I(true, FaceTecCustomization.overrideResultScreenSuccessMessage, new Runnable() { // from class: com.facetec.sdk.o.23.5
                    AnonymousClass5() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.Code(faceTecIDScanNextStep);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$24 */
    final class AnonymousClass24 implements Runnable {
        private /* synthetic */ float Code;

        AnonymousClass24(float f2) {
            f = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.ah != null) {
                o.this.ah.V(f);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$25 */
    final class AnonymousClass25 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$25$2 */
        final class AnonymousClass2 implements Runnable {
            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Exception {
                if (o.this.isFinishing() || !o.this.hasWindowFocus()) {
                    return;
                }
                o.this.A();
            }
        }

        AnonymousClass25() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.ah != null) {
                o.this.ah.I(false, null, new Runnable() { // from class: com.facetec.sdk.o.25.2
                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        if (o.this.isFinishing() || !o.this.hasWindowFocus()) {
                            return;
                        }
                        o.this.A();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$26 */
    final class AnonymousClass26 implements Runnable {
        AnonymousClass26() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.v(o.this);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$27 */
    final class AnonymousClass27 implements Runnable {
        private /* synthetic */ boolean B;
        private /* synthetic */ String V;

        /* JADX INFO: renamed from: com.facetec.sdk.o$27$4 */
        final class AnonymousClass4 implements Runnable {
            AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (o.this.isFinishing() || !o.this.hasWindowFocus() || o.this.ah == null) {
                    return;
                }
                o.this.E();
            }
        }

        AnonymousClass27(boolean z2, String str) {
            z = z2;
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.ah != null) {
                o.this.ah.I(z, str, new Runnable() { // from class: com.facetec.sdk.o.27.4
                    AnonymousClass4() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        if (o.this.isFinishing() || !o.this.hasWindowFocus() || o.this.ah == null) {
                            return;
                        }
                        o.this.E();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$28 */
    final class AnonymousClass28 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$28$2 */
        final class AnonymousClass2 implements Runnable {
            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Exception {
                if (o.this.isFinishing() || !o.this.hasWindowFocus()) {
                    return;
                }
                o.this.G();
            }
        }

        AnonymousClass28() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.O.setVisibility(4);
            o.this.f3276h.setVisibility(8);
            if (o.this.ah != null) {
                o.this.ah.I(true, o.this.U, new Runnable() { // from class: com.facetec.sdk.o.28.2
                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        if (o.this.isFinishing() || !o.this.hasWindowFocus()) {
                            return;
                        }
                        o.this.G();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$29 */
    final class AnonymousClass29 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$29$5 */
        final class AnonymousClass5 implements Runnable {
            AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.I(o.this.Q.getStatus(), o.this.T.getStatus());
            }
        }

        AnonymousClass29() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.O.setVisibility(4);
            if (o.this.ah != null) {
                o.this.ah.I(true, o.this.U, new Runnable() { // from class: com.facetec.sdk.o.29.5
                    AnonymousClass5() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.I(o.this.Q.getStatus(), o.this.T.getStatus());
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$3 */
    final class AnonymousClass3 implements View.OnTouchListener {
        AnonymousClass3() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                o.this.f3275g.setAlpha(0.4f);
            } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > o.this.f3275g.getWidth() + o.this.f3275g.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > o.this.f3275g.getHeight() + o.this.f3275g.getTop() + 10) {
                o.this.f3275g.setAlpha(1.0f);
            } else if (motionEvent.getAction() == 1) {
                o.this.f3275g.performClick();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$30 */
    final class AnonymousClass30 extends av {
        AnonymousClass30(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() throws Exception {
            o.this.R();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$31 */
    final class AnonymousClass31 extends TimerTask {
        AnonymousClass31() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (o.this.aB != null) {
                o.this.aB.I(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$32 */
    final class AnonymousClass32 implements Runnable {
        private /* synthetic */ View B;

        AnonymousClass32(View view) {
            view = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = view;
            if (view != null) {
                view.setVisibility(4);
            }
            o.this.f3273e.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$33 */
    final class AnonymousClass33 extends TimerTask {
        AnonymousClass33() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (o.this.aB != null) {
                o.this.aB.I(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$34 */
    final class AnonymousClass34 extends av {

        /* JADX INFO: renamed from: com.facetec.sdk.o$34$4 */
        final class AnonymousClass4 extends av {

            /* JADX INFO: renamed from: com.facetec.sdk.o$34$4$2 */
            final class AnonymousClass2 implements Runnable {
                AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    o.this.Z(0);
                }
            }

            AnonymousClass4(Fragment fragment) {
                super(fragment);
            }

            @Override // com.facetec.sdk.av
            public final void B() {
                if (o.this.isFinishing()) {
                    return;
                }
                o.this.ah.B.animate().alpha(0.0f).setDuration(500L).setStartDelay(500L).setListener(null).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.34.4.2
                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        o.this.Z(0);
                    }
                }).start();
            }
        }

        AnonymousClass34(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            o.this.ah.Z(new av(o.this.ah) { // from class: com.facetec.sdk.o.34.4

                /* JADX INFO: renamed from: com.facetec.sdk.o$34$4$2 */
                final class AnonymousClass2 implements Runnable {
                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        o.this.Z(0);
                    }
                }

                AnonymousClass4(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                public final void B() {
                    if (o.this.isFinishing()) {
                        return;
                    }
                    o.this.ah.B.animate().alpha(0.0f).setDuration(500L).setStartDelay(500L).setListener(null).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.34.4.2
                        AnonymousClass2() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            o.this.Z(0);
                        }
                    }).start();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$35 */
    final class AnonymousClass35 implements View.OnTouchListener {
        AnonymousClass35() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!o.this.az || motionEvent.getAction() != 0 || !o.this.f3282n.Code().contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
            try {
                if (o.this.aB == null) {
                    return true;
                }
                o.this.W();
                o.this.aB.Code(motionEvent, o.this.O);
                o.this.H.Code(motionEvent.getX(), motionEvent.getY(), null);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$36 */
    final class AnonymousClass36 extends q {
        AnonymousClass36() {
        }

        @Override // com.facetec.sdk.q, com.facetec.sdk.ad.Code
        public final void I(ag agVar, ae aeVar) throws Throwable {
            int i2 = AnonymousClass63.Code[agVar.ordinal()];
            if (i2 == 1) {
                if (AnonymousClass63.B[aeVar.ordinal()] != 3) {
                    return;
                }
                o.this.aB.I(true);
            } else {
                if (i2 == 2) {
                    o.this.I(true);
                    return;
                }
                if (i2 == 3 && o.this.ab && o.this.f3286r.getVisibility() != 0) {
                    o.this.R = true;
                    o.this.f3286r.setAlpha(0.0f);
                    o.this.f3286r.setVisibility(0);
                    o.this.f3286r.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$37 */
    final class AnonymousClass37 implements Runnable {
        private /* synthetic */ boolean Z;

        /* JADX INFO: renamed from: com.facetec.sdk.o$37$2 */
        final class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: com.facetec.sdk.o$37$2$2 */
            final class RunnableC01652 implements Runnable {
                RunnableC01652() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (o.this.f3280l == null) {
                        return;
                    }
                    o.this.f3280l.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                }
            }

            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (o.this.aB == null) {
                    return;
                }
                o.this.aB.I(new Runnable() { // from class: com.facetec.sdk.o.37.2.2
                    RunnableC01652() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (o.this.f3280l == null) {
                            return;
                        }
                        o.this.f3280l.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: com.facetec.sdk.o$37$3 */
        final class AnonymousClass3 implements Runnable {
            AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.H(o.this);
            }
        }

        AnonymousClass37(boolean z2) {
            this.Z = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i2;
            o.this.C(false);
            o.this.f3293y.setAlpha(0.0f);
            o.this.f3279k.setVisibility(0);
            o.this.f3283o.setVisibility(0);
            o.this.f3276h.setVisibility(0);
            if (this.Z) {
                float fV = ce.V(20) * ba.Code() * ba.V();
                o.this.f3294z.setTranslationY(-fV);
                o.this.J.setTranslationY(fV);
                o.this.f3294z.animate().alpha(1.0f).translationY(0.0f).setDuration(500L).setStartDelay(1300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                o.this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(500L).setStartDelay(1300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                i2 = 1300;
            } else {
                o.this.f3280l.setAlpha(1.0f);
                o.this.N.setVisibility(8);
                o.this.f3283o.animate().alpha(0.0f).setDuration(500L).setStartDelay(800L).setInterpolator(new DecelerateInterpolator()).setListener(null).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.37.2

                    /* JADX INFO: renamed from: com.facetec.sdk.o$37$2$2 */
                    final class RunnableC01652 implements Runnable {
                        RunnableC01652() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (o.this.f3280l == null) {
                                return;
                            }
                            o.this.f3280l.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                        }
                    }

                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        if (o.this.aB == null) {
                            return;
                        }
                        o.this.aB.I(new Runnable() { // from class: com.facetec.sdk.o.37.2.2
                            RunnableC01652() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (o.this.f3280l == null) {
                                    return;
                                }
                                o.this.f3280l.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                            }
                        });
                    }
                }).start();
                o.this.X();
                i2 = LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE;
            }
            if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                o.this.Code(500, i2);
            } else if (FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
                o.this.f3293y.animate().alpha(1.0f).setDuration(500L).setStartDelay(i2).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
            }
            o.this.f3276h.animate().alpha(1.0f).setDuration(500L).setStartDelay(800L).setInterpolator(new DecelerateInterpolator()).setListener(null).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.37.3
                AnonymousClass3() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.H(o.this);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$38 */
    final class AnonymousClass38 implements Runnable {
        AnonymousClass38() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            bb.B(o.this.f3285q, R.string.FaceTec_idscan_capture_id_front_instruction_message);
            o.this.G.setImageResource(ba.at());
            o.this.f3277i.setVisibility(0);
            o.this.f3285q.setVisibility(0);
            int iZ = ba.Z();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) o.this.A.getLayoutParams();
            float f2 = iZ;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ((o.this.f3282n.Code().top - o.this.A.getHeight()) - f2);
            o.this.A.setLayoutParams(layoutParams);
            RelativeLayout relativeLayout = (RelativeLayout) o.this.findViewById(R.id.focusMessageContainer);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (o.this.f3282n.Code().bottom + f2);
            relativeLayout.setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout2 = (RelativeLayout) o.this.findViewById(R.id.idScanCroppedFrame);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
            ((ViewGroup.LayoutParams) layoutParams3).height = (int) (((double) relativeLayout2.getWidth()) / 1.59d);
            relativeLayout2.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$39 */
    final class AnonymousClass39 implements Runnable {
        AnonymousClass39() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.v(o.this);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$4 */
    final class AnonymousClass4 implements ValueAnimator.AnimatorUpdateListener, Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$4$2 */
        final class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {
            AnonymousClass2() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.this.ae = (Integer) valueAnimator.getAnimatedValue();
                o.this.af.setBackgroundColor(o.this.ae.intValue());
                o.this.af.invalidate();
            }
        }

        /* JADX INFO: renamed from: com.facetec.sdk.o$4$5 */
        final class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {
            private /* synthetic */ GradientDrawable B;
            private /* synthetic */ int Z;

            AnonymousClass5(GradientDrawable gradientDrawable, int i2) {
                gradientDrawable = gradientDrawable;
                i = i2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.this.ac = (Integer) valueAnimator.getAnimatedValue();
                gradientDrawable.setStroke(i, o.this.ac.intValue());
                o.this.C.setBackground(gradientDrawable);
                o.this.f3272d.setBackground(gradientDrawable);
                o.this.f3274f.setBackground(gradientDrawable);
                o.this.C.invalidate();
                o.this.f3272d.invalidate();
                o.this.f3274f.invalidate();
            }
        }

        AnonymousClass4() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            o.this.ad = (Integer) valueAnimator.getAnimatedValue();
            o.this.f3271c.setBackgroundColor(o.this.ad.intValue());
            o.this.f3271c.invalidate();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int iAy;
            if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM && FaceTecSDK.V.f2853d.Z != null && (iAy = ba.ay()) != 0) {
                o.this.f3275g.setImageDrawable(ContextCompat.getDrawable(o.this, iAy));
            }
            int iAv = ba.av();
            if (FaceTecSDK.V.C.showBrandingImage && iAv != 0) {
                o.this.Y.setImageDrawable(ContextCompat.getDrawable(o.this, iAv));
            }
            o.this.f3271c.setBackground(ba.i(o.this));
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), o.this.ad, Integer.valueOf(ba.Code(o.this, ba.G())));
            valueAnimatorOfObject.setDuration(1000L);
            valueAnimatorOfObject.addUpdateListener(this);
            valueAnimatorOfObject.start();
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), o.this.ae, Integer.valueOf(ba.Code(o.this, ba.E())));
            valueAnimatorOfObject2.setDuration(1000L);
            valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.o.4.2
                AnonymousClass2() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    o.this.ae = (Integer) valueAnimator.getAnimatedValue();
                    o.this.af.setBackgroundColor(o.this.ae.intValue());
                    o.this.af.invalidate();
                }
            });
            valueAnimatorOfObject2.start();
            GradientDrawable gradientDrawable = (GradientDrawable) o.this.C.getBackground();
            int iV = (int) (ce.V(ba.D()) * ba.V());
            ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), o.this.ac, Integer.valueOf(ba.S(o.this)));
            valueAnimatorOfObject3.setDuration(1000L);
            valueAnimatorOfObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.o.4.5
                private /* synthetic */ GradientDrawable B;
                private /* synthetic */ int Z;

                AnonymousClass5(GradientDrawable gradientDrawable2, int iV2) {
                    gradientDrawable = gradientDrawable2;
                    i = iV2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    o.this.ac = (Integer) valueAnimator.getAnimatedValue();
                    gradientDrawable.setStroke(i, o.this.ac.intValue());
                    o.this.C.setBackground(gradientDrawable);
                    o.this.f3272d.setBackground(gradientDrawable);
                    o.this.f3274f.setBackground(gradientDrawable);
                    o.this.C.invalidate();
                    o.this.f3272d.invalidate();
                    o.this.f3274f.invalidate();
                }
            });
            valueAnimatorOfObject3.start();
            if (o.this.al != null) {
                o.this.al.F();
            }
            if (o.this.ak != null) {
                o.this.ak.F();
            }
            if (FaceTecSessionActivity.D != null) {
                o.this.ac();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$40 */
    final class AnonymousClass40 extends TimerTask {
        AnonymousClass40() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() throws Throwable {
            if (cf.I(o.this)) {
                o.this.Z(false, true);
                o.this.p();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$41 */
    final class AnonymousClass41 implements Runnable {
        final /* synthetic */ boolean B;

        /* JADX INFO: renamed from: com.facetec.sdk.o$41$4 */
        final class AnonymousClass4 implements Runnable {
            AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.f3289u.setVisibility(4);
                if (z) {
                    return;
                }
                o.this.f3287s.animate().alpha(0.0f).setDuration(100L);
            }
        }

        AnonymousClass41(boolean z2) {
            z = z2;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            o.this.f3290v.setEnabled(false, true);
            o.this.f3284p.setEnabled(false, true);
            o.this.f3286r.setEnabled(false, true);
            o.this.f3286r.setVisibility(4);
            o.this.f3289u.setVisibility(0);
            Handler handler = new Handler();
            Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.o.41.4
                AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.f3289u.setVisibility(4);
                    if (z) {
                        return;
                    }
                    o.this.f3287s.animate().alpha(0.0f).setDuration(100L);
                }
            }, 100L};
            Method method = Class.forName(EO.Od("\u00018 \u0016\naxIf.f^G^L2Pg", (short) (OY.Xd() ^ 32297))).getMethod(C1593ug.zd("eejl=_g]vcc", (short) (OY.Xd() ^ 5218), (short) (OY.Xd() ^ 6756)), Class.forName(C1561oA.Qd("tj~h4qeqi/Rtlk]]f^", (short) (C1633zX.Xd() ^ (-9362)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$42 */
    final class AnonymousClass42 implements Runnable {
        private /* synthetic */ boolean I;

        AnonymousClass42(boolean z2) {
            z = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i2;
            int i3 = 0;
            if (z) {
                i2 = 4;
            } else {
                o.this.f3287s.animate().alpha(1.0f).setDuration(100L);
                i2 = 0;
                i3 = 4;
            }
            o.this.f3292x.setVisibility(i3);
            o.this.f3288t.setVisibility(i3);
            o.this.f3281m.setVisibility(i3);
            o.this.G.setVisibility(i2);
            if (o.this.R) {
                o.this.f3286r.setVisibility(i2);
            } else {
                o.this.f3286r.setVisibility(4);
            }
            o.this.f3285q.setVisibility(i2);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$43 */
    final class AnonymousClass43 implements Runnable {
        AnonymousClass43() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.f3290v.setEnabled(true, true);
            o.this.f3284p.setEnabled(true, true);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$44 */
    final class AnonymousClass44 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$44$2 */
        final class AnonymousClass2 implements Runnable {
            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.f3283o.setVisibility(8);
            }
        }

        AnonymousClass44() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.f3283o.animate().alpha(0.0f).setDuration(300L).setListener(null).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.44.2
                AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.f3283o.setVisibility(8);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$45 */
    final class AnonymousClass45 extends av {
        AnonymousClass45(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        final void B() throws Exception {
            o.this.Z(200);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$46 */
    final class AnonymousClass46 implements View.OnClickListener {
        AnonymousClass46() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                o.this.f3293y.setAlpha(1.0f);
                o.this.f3293y.setEnabled(false);
                o.this.f3290v.setEnabled(false, true);
                o.this.f3284p.setEnabled(false, true);
                o.this.f3286r.setEnabled(false, true);
                o.this.I(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, FaceTecIDScanStatus.USER_CANCELED);
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$47 */
    final class AnonymousClass47 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$47$1 */
        final class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Exception {
                o.this.f3282n.V();
                o oVar = o.this;
                oVar.K.setAlpha(1.0f);
                oVar.A.setAlpha(1.0f);
                oVar.f3287s.setAlpha(1.0f);
                oVar.G.setAlpha(1.0f);
                oVar.f3293y.setAlpha(1.0f);
                oVar.K.setTranslationY(0.0f);
                oVar.A.setTranslationY(0.0f);
                o.this.Z(0);
                if (o.this.E == Z.FRONT) {
                    o.this.X = ap.Code.FRONT_SIDE;
                } else {
                    o.this.X = ap.Code.BACK_SIDE;
                }
                o.this.ah = ap.Code(true, o.this.X);
                FragmentManager fragmentManager = o.this.getFragmentManager();
                CX.ud();
                fragmentManager.beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                    o.this.v();
                }
                new B(o.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }

        AnonymousClass47() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.f3276h.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.47.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    o.this.f3282n.V();
                    o oVar = o.this;
                    oVar.K.setAlpha(1.0f);
                    oVar.A.setAlpha(1.0f);
                    oVar.f3287s.setAlpha(1.0f);
                    oVar.G.setAlpha(1.0f);
                    oVar.f3293y.setAlpha(1.0f);
                    oVar.K.setTranslationY(0.0f);
                    oVar.A.setTranslationY(0.0f);
                    o.this.Z(0);
                    if (o.this.E == Z.FRONT) {
                        o.this.X = ap.Code.FRONT_SIDE;
                    } else {
                        o.this.X = ap.Code.BACK_SIDE;
                    }
                    o.this.ah = ap.Code(true, o.this.X);
                    FragmentManager fragmentManager = o.this.getFragmentManager();
                    CX.ud();
                    fragmentManager.beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                    if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                        o.this.v();
                    }
                    new B(o.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$48 */
    final class AnonymousClass48 implements Runnable {
        private /* synthetic */ View I;

        AnonymousClass48(View view) {
            view = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            view.setEnabled(true);
            o.this.f3286r.setEnabled(true, true);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$49 */
    final class AnonymousClass49 implements Runnable {
        AnonymousClass49() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            float fV = ce.V(20) * ba.Code() * ba.V();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(o.this.K, (Property<RelativeLayout, Float>) View.TRANSLATION_Y, fV), ObjectAnimator.ofFloat(o.this.A, (Property<RelativeLayout, Float>) View.TRANSLATION_Y, -fV));
            animatorSet.setDuration(500L);
            animatorSet.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(o.this.K, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(o.this.A, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(o.this.f3287s, (Property<TextView, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(o.this.G, (Property<ImageView, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(o.this.f3293y, (Property<ImageView, Float>) View.ALPHA, 0.0f));
            animatorSet2.setDuration(500L);
            animatorSet2.start();
            if (o.this.f3275g != null) {
                o.this.f3275g.animate().alpha(0.0f).setDuration(500L).start();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$5 */
    final class AnonymousClass5 implements View.OnTouchListener {
        AnonymousClass5() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (o.this.getFragmentManager().findFragmentByTag("PreEnroll") != null) {
                    e eVar = (e) o.this.getFragmentManager().findFragmentByTag("PreEnroll");
                    if (eVar.I == null || p.f3295c) {
                        return true;
                    }
                    if (eVar.I.isEnabled()) {
                        bg.B(o.this, bg.V.GET_READY_PRESS_BUTTON_TAPPING);
                    } else {
                        bg.B(o.this, bg.V.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                    }
                } else if (o.this.getFragmentManager().findFragmentByTag("RetryZoom") != null) {
                    e eVar2 = (e) o.this.getFragmentManager().findFragmentByTag("RetryZoom");
                    if (eVar2.I == null || as.f2933j) {
                        return true;
                    }
                    if (eVar2.I.isEnabled()) {
                        bg.B(o.this, bg.V.GET_READY_PRESS_BUTTON_TAPPING);
                    } else if (((as) eVar2).f2936d == 1) {
                        bg.B(o.this, bg.V.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                    }
                } else if (o.this.getFragmentManager().findFragmentByTag("Zoom") != null) {
                    if (o.this.aa != L.ZOOM_SESSION_STARTED) {
                        if (((bq) o.this.getFragmentManager().findFragmentByTag("Zoom")).B() == ak.FRAME_YOUR_FACE) {
                            bg.B(o.this, bg.V.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                        }
                    } else if (ai.L() == ah.ZOOM_CLOSE) {
                        if (ai.a() == ac.MOVE_FACE_CLOSER) {
                            bg.B(o.this, bg.V.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING);
                        } else if (ai.a() != ac.HOLD_STEADY) {
                            bg.B(o.this, bg.V.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                        }
                    } else if (ai.L() == ah.ZOOM_FAR && ai.a() != ac.HOLD_STEADY) {
                        bg.B(o.this, bg.V.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$50 */
    final class AnonymousClass50 implements Runnable {
        AnonymousClass50() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.f3275g.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$51 */
    final class AnonymousClass51 implements View.OnTouchListener {
        AnonymousClass51() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                o.this.f3293y.setAlpha(0.4f);
            } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > o.this.f3293y.getWidth() + o.this.f3293y.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > o.this.f3293y.getHeight() + o.this.f3293y.getTop() + 10) {
                o.this.f3293y.setAlpha(1.0f);
            } else if (motionEvent.getAction() == 1) {
                o.this.f3293y.performClick();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$52 */
    final class AnonymousClass52 implements ViewTreeObserver.OnGlobalLayoutListener {
        AnonymousClass52() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            o.E(o.this);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$53 */
    final class AnonymousClass53 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$53$2 */
        final class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: com.facetec.sdk.o$53$2$3 */
            final class AnonymousClass3 implements Runnable {
                AnonymousClass3() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (o.this.f3280l == null) {
                        return;
                    }
                    o.this.f3280l.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                }
            }

            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (o.this.aB == null) {
                    return;
                }
                o.this.aB.I(new Runnable() { // from class: com.facetec.sdk.o.53.2.3
                    AnonymousClass3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (o.this.f3280l == null) {
                            return;
                        }
                        o.this.f3280l.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: com.facetec.sdk.o$53$3 */
        final class AnonymousClass3 implements Runnable {
            AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.f3286r.setEnabled(true, true);
                o.this.G.setEnabled(true);
                o.this.f3293y.setEnabled(true);
                o.this.ab = true;
            }
        }

        AnonymousClass53() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (o.this.P == FaceTecIDScanRetryMode.BACK) {
                o.this.E = Z.BACK;
                bb.B(o.this.f3285q, R.string.FaceTec_idscan_capture_id_back_instruction_message);
            } else {
                o.this.E = Z.FRONT;
                bb.B(o.this.f3285q, R.string.FaceTec_idscan_capture_id_front_instruction_message);
            }
            o.this.f3280l.setAlpha(1.0f);
            o.this.f3276h.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.53.2

                /* JADX INFO: renamed from: com.facetec.sdk.o$53$2$3 */
                final class AnonymousClass3 implements Runnable {
                    AnonymousClass3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (o.this.f3280l == null) {
                            return;
                        }
                        o.this.f3280l.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                    }
                }

                AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    if (o.this.aB == null) {
                        return;
                    }
                    o.this.aB.I(new Runnable() { // from class: com.facetec.sdk.o.53.2.3
                        AnonymousClass3() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (o.this.f3280l == null) {
                                return;
                            }
                            o.this.f3280l.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
                        }
                    });
                }
            }).start();
            if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                o.this.Code(500, 0);
            }
            o.this.f3283o.setVisibility(4);
            o.this.f3279k.setVisibility(0);
            o.this.f3277i.setVisibility(0);
            o.this.C(false);
            if (o.this.aB == null) {
                o.this.B(3);
                return;
            }
            o.this.aB.Z();
            o.this.W();
            ai.l(o.this.R, false);
            Class<?> cls = Class.forName(C1561oA.od("\b\u0014\t\u0016\u0012\u000b\u0005M\u000e\u0011Jg\n\t\t|\t", (short) (OY.Xd() ^ 14818)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 25933);
            int[] iArr = new int["sr\u0003\\qz\u0001_\u0004\u0005\u0007|\u000b".length()];
            QB qb = new QB("sr\u0003\\qz\u0001_\u0004\u0005\u0007|\u000b");
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
                AnonymousClass3 anonymousClass3 = new Runnable() { // from class: com.facetec.sdk.o.53.3
                    AnonymousClass3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f3286r.setEnabled(true, true);
                        o.this.G.setEnabled(true);
                        o.this.f3293y.setEnabled(true);
                        o.this.ab = true;
                    }
                };
                short sXd2 = (short) (C1580rY.Xd() ^ (-11475));
                short sXd3 = (short) (C1580rY.Xd() ^ (-23732));
                int[] iArr2 = new int["#+x^>\u0010\u0003'F\"8IbK\u0018uRV".length()];
                QB qb2 = new QB("#+x^>\u0010\u0003'F\"8IbK\u0018uRV");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = new Class[2];
                short sXd4 = (short) (C1580rY.Xd() ^ (-8660));
                int[] iArr3 = new int["$\u001c2\u001ek+!/)p\u0016:45)+60".length()];
                QB qb3 = new QB("$\u001c2\u001ek+!/)p\u0016:45)+60");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
                    i4++;
                }
                clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
                clsArr2[1] = Long.TYPE;
                Object[] objArr2 = {anonymousClass3, 800L};
                Method method = cls2.getMethod(Wg.vd("\u0003\u0003\u0004\u0006Z|\u0001v\u0014\u0001|", (short) (C1580rY.Xd() ^ (-19380))), clsArr2);
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
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$54 */
    final class AnonymousClass54 implements Runnable {
        AnonymousClass54() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            o.this.I(false);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$55 */
    final class AnonymousClass55 implements Runnable {
        AnonymousClass55() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            o oVar = o.this;
            oVar.findViewById(oVar.f3284p.getId());
            oVar.s();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$56 */
    final class AnonymousClass56 implements cf.I {
        AnonymousClass56() {
        }

        @Override // com.facetec.sdk.cf.I
        public final void B(cl clVar) throws Throwable {
            o.J(o.this);
            o.this.ae();
            a.V(o.this, com.facetec.sdk.V.NFC_ERROR, o.V(clVar));
            if (clVar == cl.ConnectionError) {
                o.this.x();
            } else {
                o.this.Z(false);
            }
        }

        @Override // com.facetec.sdk.cf.I
        public final void Code() throws Throwable {
            o.J(o.this);
            o.this.ae();
            o.this.Z(true);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$57 */
    final class AnonymousClass57 extends av {
        private /* synthetic */ String Z;

        /* JADX INFO: renamed from: com.facetec.sdk.o$57$3 */
        final class AnonymousClass3 implements Runnable {

            /* JADX INFO: renamed from: com.facetec.sdk.o$57$3$3 */
            final class C01663 extends av {
                C01663(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                final void B() throws Exception {
                    FragmentManager fragmentManager = o.this.getFragmentManager();
                    CX.ud();
                    fragmentManager.beginTransaction().remove(o.this.ah).commitAllowingStateLoss();
                    o.this.ah = null;
                    o.this.X = ap.Code.NFC;
                    o.this.ah = ap.Code(true, o.this.X);
                    FragmentManager fragmentManager2 = o.this.getFragmentManager();
                    CX.ud();
                    fragmentManager2.beginTransaction().add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                    new Code(o.this, false, true).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                }
            }

            AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.ah.F.animate().alpha(0.0f).setDuration(800L).setStartDelay(0L).setListener(null).withEndAction(new av(o.this.ah) { // from class: com.facetec.sdk.o.57.3.3
                    C01663(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    final void B() throws Exception {
                        FragmentManager fragmentManager = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager.beginTransaction().remove(o.this.ah).commitAllowingStateLoss();
                        o.this.ah = null;
                        o.this.X = ap.Code.NFC;
                        o.this.ah = ap.Code(true, o.this.X);
                        FragmentManager fragmentManager2 = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager2.beginTransaction().add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                        new Code(o.this, false, true).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                }).start();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass57(Fragment fragment, String str) {
            super(fragment);
            this.Z = str;
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            o.this.ah.V(false, true, this.Z, new Runnable() { // from class: com.facetec.sdk.o.57.3

                /* JADX INFO: renamed from: com.facetec.sdk.o$57$3$3 */
                final class C01663 extends av {
                    C01663(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    final void B() throws Exception {
                        FragmentManager fragmentManager = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager.beginTransaction().remove(o.this.ah).commitAllowingStateLoss();
                        o.this.ah = null;
                        o.this.X = ap.Code.NFC;
                        o.this.ah = ap.Code(true, o.this.X);
                        FragmentManager fragmentManager2 = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager2.beginTransaction().add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                        new Code(o.this, false, true).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                }

                AnonymousClass3() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.ah.F.animate().alpha(0.0f).setDuration(800L).setStartDelay(0L).setListener(null).withEndAction(new av(o.this.ah) { // from class: com.facetec.sdk.o.57.3.3
                        C01663(Fragment fragment) {
                            super(fragment);
                        }

                        @Override // com.facetec.sdk.av
                        final void B() throws Exception {
                            FragmentManager fragmentManager = o.this.getFragmentManager();
                            CX.ud();
                            fragmentManager.beginTransaction().remove(o.this.ah).commitAllowingStateLoss();
                            o.this.ah = null;
                            o.this.X = ap.Code.NFC;
                            o.this.ah = ap.Code(true, o.this.X);
                            FragmentManager fragmentManager2 = o.this.getFragmentManager();
                            CX.ud();
                            fragmentManager2.beginTransaction().add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                            new Code(o.this, false, true).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                        }
                    }).start();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$58 */
    final class AnonymousClass58 implements Runnable {
        private /* synthetic */ Runnable Z;

        AnonymousClass58(Runnable runnable) {
            runnable = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$59 */
    final class AnonymousClass59 implements Runnable {
        AnonymousClass59() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            o oVar = o.this;
            oVar.findViewById(oVar.f3291w.getId());
            oVar.t();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$6 */
    final class AnonymousClass6 implements ValueAnimator.AnimatorUpdateListener {
        AnonymousClass6() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WindowManager.LayoutParams attributes = o.this.getWindow().getAttributes();
            attributes.screenBrightness = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            o.this.getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$60 */
    final class AnonymousClass60 implements Runnable {
        AnonymousClass60() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            oVar.findViewById(oVar.f3290v.getId());
            oVar.w();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$61 */
    final class AnonymousClass61 extends av {
        final /* synthetic */ boolean Code;
        private /* synthetic */ String I;

        /* JADX INFO: renamed from: com.facetec.sdk.o$61$4 */
        final class AnonymousClass4 implements Runnable {

            /* JADX INFO: renamed from: com.facetec.sdk.o$61$4$5 */
            final class AnonymousClass5 extends av {
                AnonymousClass5(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                final void B() throws Exception {
                    FragmentManager fragmentManager = o.this.getFragmentManager();
                    CX.ud();
                    fragmentManager.beginTransaction().remove(o.this.ah).commitAllowingStateLoss();
                    o.this.ah = null;
                    o.this.X = ap.Code.NFC;
                    o.this.ah = ap.Code(true, o.this.X);
                    FragmentManager fragmentManager2 = o.this.getFragmentManager();
                    CX.ud();
                    fragmentManager2.beginTransaction().add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                    new Code(o.this, AnonymousClass61.this.Code, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                }
            }

            AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.ah.F.animate().alpha(0.0f).setDuration(800L).setStartDelay(0L).setListener(null).withEndAction(new av(o.this.ah) { // from class: com.facetec.sdk.o.61.4.5
                    AnonymousClass5(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    final void B() throws Exception {
                        FragmentManager fragmentManager = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager.beginTransaction().remove(o.this.ah).commitAllowingStateLoss();
                        o.this.ah = null;
                        o.this.X = ap.Code.NFC;
                        o.this.ah = ap.Code(true, o.this.X);
                        FragmentManager fragmentManager2 = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager2.beginTransaction().add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                        new Code(o.this, AnonymousClass61.this.Code, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                }).start();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass61(Fragment fragment, boolean z2, String str) {
            super(fragment);
            this.Code = z2;
            this.I = str;
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            ap apVar = o.this.ah;
            boolean z2 = this.Code;
            apVar.V(z2, z2, this.I, new Runnable() { // from class: com.facetec.sdk.o.61.4

                /* JADX INFO: renamed from: com.facetec.sdk.o$61$4$5 */
                final class AnonymousClass5 extends av {
                    AnonymousClass5(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    final void B() throws Exception {
                        FragmentManager fragmentManager = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager.beginTransaction().remove(o.this.ah).commitAllowingStateLoss();
                        o.this.ah = null;
                        o.this.X = ap.Code.NFC;
                        o.this.ah = ap.Code(true, o.this.X);
                        FragmentManager fragmentManager2 = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager2.beginTransaction().add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                        new Code(o.this, AnonymousClass61.this.Code, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                }

                AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.ah.F.animate().alpha(0.0f).setDuration(800L).setStartDelay(0L).setListener(null).withEndAction(new av(o.this.ah) { // from class: com.facetec.sdk.o.61.4.5
                        AnonymousClass5(Fragment fragment) {
                            super(fragment);
                        }

                        @Override // com.facetec.sdk.av
                        final void B() throws Exception {
                            FragmentManager fragmentManager = o.this.getFragmentManager();
                            CX.ud();
                            fragmentManager.beginTransaction().remove(o.this.ah).commitAllowingStateLoss();
                            o.this.ah = null;
                            o.this.X = ap.Code.NFC;
                            o.this.ah = ap.Code(true, o.this.X);
                            FragmentManager fragmentManager2 = o.this.getFragmentManager();
                            CX.ud();
                            fragmentManager2.beginTransaction().add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                            new Code(o.this, AnonymousClass61.this.Code, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                        }
                    }).start();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$62 */
    final class AnonymousClass62 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$62$3 */
        final class AnonymousClass3 implements Runnable {
            AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.this.Z(false, false);
            }
        }

        AnonymousClass62() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.O.setVisibility(4);
            o.this.f3268a.setVisibility(4);
            if (o.this.ah != null) {
                o.this.ah.I(true, o.this.U, new Runnable() { // from class: com.facetec.sdk.o.62.3
                    AnonymousClass3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        o.this.Z(false, false);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$63 */
    static /* synthetic */ class AnonymousClass63 {
        static final /* synthetic */ int[] B;
        private static /* synthetic */ int[] C = null;
        static final /* synthetic */ int[] Code;
        static final /* synthetic */ int[] I;
        static final /* synthetic */ int[] S;
        static final /* synthetic */ int[] V;
        static final /* synthetic */ int[] Z;

        static {
            int[] iArr = new int[cl.values().length];
            S = iArr;
            try {
                iArr[cl.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                S[cl.InvalidMrzKey.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                S[cl.ResponseError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                S[cl.ConnectionError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            I = iArr2;
            try {
                iArr2[FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                I[FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                I[FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                I[FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[ag.values().length];
            Code = iArr3;
            try {
                iArr3[ag.KEEP_SCANNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Code[ag.END_SCAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Code[ag.PRESENT_USER_HELP_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[ae.values().length];
            B = iArr4;
            try {
                iArr4[ae.ID_IMAGE_HOLD_STEADY.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                B[ae.ID_IMAGE_FACE_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                B[ae.ID_IMAGE_BLURRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr5 = new int[FaceTecSessionStatus.values().length];
            V = iArr5;
            try {
                iArr5[FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                V[FaceTecSessionStatus.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                V[FaceTecSessionStatus.CONTEXT_SWITCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                V[FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                V[FaceTecSessionStatus.USER_CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                V[FaceTecSessionStatus.SESSION_UNSUCCESSFUL.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                V[FaceTecSessionStatus.CAMERA_PERMISSION_DENIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                V[FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                V[FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr6 = new int[FaceTecExitAnimationStyle.values().length];
            C = iArr6;
            try {
                iArr6[FaceTecExitAnimationStyle.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                C[FaceTecExitAnimationStyle.RIPPLE_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                C[FaceTecExitAnimationStyle.RIPPLE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                C[FaceTecExitAnimationStyle.CIRCLE_FADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr7 = new int[FaceTecSDKStatus.values().length];
            Z = iArr7;
            try {
                iArr7[FaceTecSDKStatus.INVALID_DEVICE_KEY_IDENTIFIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                Z[FaceTecSDKStatus.NETWORK_ISSUES.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                Z[FaceTecSDKStatus.GRACE_PERIOD_EXCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                Z[FaceTecSDKStatus.DEVICE_LOCKED_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                Z[FaceTecSDKStatus.ENCRYPTION_KEY_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                Z[FaceTecSDKStatus.DEVICE_IN_LANDSCAPE_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                Z[FaceTecSDKStatus.DEVICE_IN_REVERSE_PORTRAIT_MODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused34) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$64 */
    final class AnonymousClass64 implements Runnable {
        AnonymousClass64() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.bg != null) {
                o.this.bg.cancel();
                o.this.bg.removeAllUpdateListeners();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$65 */
    final class AnonymousClass65 implements Runnable {
        AnonymousClass65() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ai.L() == ah.ZOOM_FAR) {
                bg.B(o.this, bg.V.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$67 */
    final class AnonymousClass67 implements Runnable {
        AnonymousClass67() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.n();
            o.this.h();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$7 */
    final class AnonymousClass7 extends AnimatorListenerAdapter {
        private /* synthetic */ float V;
        private /* synthetic */ float Z;

        AnonymousClass7(float f2, float f3) {
            f = f2;
            f = f3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (o.this.f3270bo || o.this.bk) {
                o.e(o.this);
                o.d(o.this);
            } else if (o.this.ag && ai.L() == ah.ZOOM_CLOSE && !o.this.bh && f == 0.8f) {
                o.h(o.this);
                o.this.Z(0.5f, 0.8f, 1000);
            } else if (o.this.ag) {
                o.this.Z(f, f, 1000);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$8 */
    final class AnonymousClass8 implements Runnable {

        /* JADX INFO: renamed from: com.facetec.sdk.o$8$2 */
        final class AnonymousClass2 implements Animator.AnimatorListener, Runnable {
            AnonymousClass2() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (o.this.V() != g.Z.GRANTED) {
                    return;
                }
                o.this.f3268a.setVisibility(0);
                o.this.f3268a.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(o.this.I, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.f3269b, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.f3272d, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.af, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.f3278j, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.f3274f, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.C, "alpha", 1.0f));
                animatorSet.setDuration(800L);
                animatorSet.addListener(this);
                animatorSet.start();
                if (o.this.f3275g != null) {
                    o.this.f3275g.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                }
            }
        }

        AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.u()) {
                return;
            }
            o.this.runOnUiThread(new AnonymousClass2());
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.o$9 */
    final class AnonymousClass9 implements Runnable {
        AnonymousClass9() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ai.Code();
            ai.x(com.facetec.sdk.Z.Code());
            ai.B("fnkey_ZOOMSDK_LIGHTINGMODE", 1);
        }
    }

    class B extends ax {
        private boolean B;
        private boolean C;
        private JSONObject Code;
        private boolean I;
        private String Z;

        B(o oVar, JSONObject jSONObject) {
            this(jSONObject, false, false, false);
        }

        protected B(JSONObject jSONObject, boolean z2, boolean z3, boolean z4) {
            super(null);
            this.Z = UUID.randomUUID().toString();
            o.this.T = new FaceTecIDScanResult(FaceTecIDScanStatus.SUCCESS);
            this.Code = jSONObject;
            this.I = z2;
            this.B = z3;
            this.C = z4;
        }

        @Override // com.facetec.sdk.ax
        protected final void B() {
            o.G(o.this);
            if (o.this.T.getStatus() != null) {
                a.V(o.this, com.facetec.sdk.V.ID_SCAN_CALLBACK_CALLED, o.this.T.getStatus().toString());
            }
            FaceTecSessionActivity.D.processIDScanWhileFaceTecSDKWaits(o.this.T, new I(o.this));
        }

        @Override // com.facetec.sdk.ax
        final void Code() throws Throwable {
            byte[] bArrP;
            o.this.T.Z(this.Z);
            byte[][] bArrF = ai.f();
            byte[][] bArrG = ai.g();
            o.this.T.B(bArrF);
            o.this.T.I(bArrG);
            if (this.I) {
                bArrP = ai.t(this.Z, o.this.M, this.B, this.C);
            } else {
                JSONObject jSONObject = this.Code;
                bArrP = ai.p(this.Z, o.this.M, jSONObject != null ? jSONObject.toString() : "");
            }
            o.this.T.B(bArrP);
        }
    }

    static class C implements Runnable {
        private WeakReference<o> B;

        C(o oVar) {
            this.B = new WeakReference<>(oVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = this.B.get();
            if (oVar != null) {
                oVar.Code(true);
            }
        }
    }

    class Code extends B {
        Code(o oVar, boolean z2, boolean z3) {
            super(null, true, z2, z3);
        }
    }

    class D extends ax {
        private final boolean I;

        D(boolean z2) {
            super(null);
            o.this.M();
            this.I = z2;
        }

        @Override // com.facetec.sdk.ax
        protected final void B() {
            o.r(o.this);
            o.p(o.this);
        }

        @Override // com.facetec.sdk.ax
        final void Code() {
            if (n.V()) {
                o.this.ai = ai.j();
                o.this.aq = ai.i();
                if (o.this.aq.length > 0) {
                    o.this.W = BitmapFactory.decodeByteArray(o.this.aq[0], 0, o.this.aq[0].length);
                }
            }
            try {
                if (this.I) {
                    o.this.aI.Z(new FaceTecSessionResult(FaceTecSessionStatus.SESSION_UNSUCCESSFUL, o.this.ai, o.this.aq, ai.k()), n.I);
                }
            } catch (Exception unused) {
            }
            o.this.aI.Code();
            if (o.this.D != null) {
                o.this.D.Code();
            }
        }
    }

    class F extends ax {
        F() {
            super(null);
        }

        @Override // com.facetec.sdk.ax
        protected final void B() {
            o.u(o.this);
            FaceTecSessionResult faceTecSessionResult = new FaceTecSessionResult(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, o.this.ai, o.this.aq, o.this.am);
            faceTecSessionResult.I(ad.V);
            if (FaceTecSessionActivity.B == null) {
                o.this.I(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, (FaceTecIDScanStatus) null);
                return;
            }
            o.x(o.this);
            o.this.Q = faceTecSessionResult;
            if (o.this.Q.getStatus() != null) {
                a.V(o.this, com.facetec.sdk.V.FACESCAN_CALLBACK_CALLED, o.this.Q.getStatus().toString());
            }
            FaceTecSessionActivity.B.processSessionWhileFaceTecSDKWaits(faceTecSessionResult, new V(o.this));
        }

        @Override // com.facetec.sdk.ax
        final void Code() {
            try {
                o.this.am = ai.k();
            } catch (Exception e2) {
                ce.I(e2.getMessage());
            }
            if (n.V() && o.this.as) {
                o.this.ai = ai.j();
                o.this.aq = ai.i();
                if (o.this.aq.length > 0) {
                    o.this.W = BitmapFactory.decodeByteArray(o.this.aq[0], 0, o.this.aq[0].length);
                }
            }
            o.this.aI.Code();
            if (o.this.D != null) {
                o.this.D.Code();
            }
        }
    }

    static class I implements FaceTecIDScanResultCallback {
        private final WeakReference<o> Z;

        I(o oVar) {
            this.Z = new WeakReference<>(oVar);
        }

        @Override // com.facetec.sdk.FaceTecIDScanResultCallback
        public final void cancel() {
            o oVar = this.Z.get();
            if (o.V((Activity) oVar)) {
                this.Z.clear();
                oVar.r();
            }
        }

        @Override // com.facetec.sdk.FaceTecIDScanResultCallback
        public final boolean proceedToNextStep(String str) {
            o oVar = this.Z.get();
            if (o.V((Activity) oVar)) {
                return oVar.I(str);
            }
            return false;
        }

        @Override // com.facetec.sdk.FaceTecIDScanResultCallback
        public final void uploadMessageOverride(String str) {
            o oVar = this.Z.get();
            if (o.V((Activity) oVar)) {
                oVar.Code(str);
            }
        }

        @Override // com.facetec.sdk.FaceTecIDScanResultCallback
        public final void uploadProgress(float f2) {
            o oVar = this.Z.get();
            if (o.V((Activity) oVar)) {
                oVar.Code(f2);
            }
        }
    }

    enum L {
        NOT_STARTED,
        PRE_SESSION_STARTED,
        ZOOM_SESSION_STARTED
    }

    static class V implements FaceTecFaceScanResultCallback {
        private final WeakReference<o> Z;

        V(o oVar) {
            this.Z = new WeakReference<>(oVar);
        }

        private o Code(boolean z2) {
            o oVar = this.Z.get();
            if (z2) {
                this.Z.clear();
            }
            return oVar;
        }

        @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
        public final void cancel() {
            o oVarCode = Code(true);
            if (o.V((Activity) oVarCode)) {
                a.V(oVarCode, com.facetec.sdk.V.DEVELOPER_USED_FACESCAN_CALLBACK, "cancel");
                oVarCode.I(oVarCode.Q.getStatus(), (FaceTecIDScanStatus) null);
            }
        }

        @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
        public final boolean proceedToNextStep(String str) {
            return proceedToNextStep(str, FaceTecIDScanNextStep.SELECTION_SCREEN);
        }

        @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
        public final boolean proceedToNextStep(String str, FaceTecIDScanNextStep faceTecIDScanNextStep) {
            o oVarCode = Code(true);
            if (o.V((Activity) oVarCode)) {
                return oVarCode.I(str, faceTecIDScanNextStep);
            }
            return false;
        }

        @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
        public final void retry() {
            o oVarCode = Code(true);
            if (o.V((Activity) oVarCode)) {
                oVarCode.m();
            }
        }

        @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
        public final void succeed() {
            succeed(FaceTecIDScanNextStep.SELECTION_SCREEN);
        }

        @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
        public final void succeed(FaceTecIDScanNextStep faceTecIDScanNextStep) {
            o oVarCode = Code(true);
            if (o.V((Activity) oVarCode)) {
                oVarCode.V(faceTecIDScanNextStep);
            }
        }

        @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
        public final void uploadMessageOverride(String str) {
            o oVarCode = Code(false);
            if (o.V((Activity) oVarCode)) {
                oVarCode.Code(str);
            }
        }

        @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
        public final void uploadProgress(float f2) {
            o oVarCode = Code(false);
            if (o.V((Activity) oVarCode)) {
                oVarCode.Code(f2);
            }
        }
    }

    enum Z {
        FRONT,
        BACK
    }

    o() {
    }

    public void A() throws Exception {
        M();
        if (this.aC) {
            if (cb.F(this)) {
                Code(FaceTecSessionStatus.LOCKED_OUT);
            }
            cb.V(this);
        }
        if (this.ak == null || getFragmentManager().findFragmentByTag("RetryZoom") == null) {
            if (this.ak == null) {
                this.ak = as.c();
            }
            if (this.aC) {
                FragmentManager fragmentManager = getFragmentManager();
                CX.ud();
                fragmentManager.beginTransaction().add(this.aL, this.ak, "RetryZoom").commitAllowingStateLoss();
            } else {
                FragmentManager fragmentManager2 = getFragmentManager();
                CX.ud();
                FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager2.beginTransaction();
                int i2 = this.aL;
                as asVar = this.ak;
                CX.ud();
                fragmentTransactionBeginTransaction.replace(i2, asVar, "RetryZoom").commitAllowingStateLoss();
            }
        } else {
            this.ak.V(this);
        }
        this.aC = false;
        if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            Code(300, 0);
        }
        Z(1000);
    }

    public void B(int i2) {
        com.facetec.sdk.L.V(new Throwable("FaceTec SDK has experienced an unexpected camera error."));
        a.V(this, com.facetec.sdk.V.CAMERA_ERROR, "IDScan: zoomCamera is null unexpectedly ".concat(String.valueOf(i2)));
        B(this.Q.getStatus(), FaceTecIDScanStatus.CAMERA_ERROR);
    }

    private void B(FaceTecIDScanNextStep faceTecIDScanNextStep) throws Exception {
        Z(faceTecIDScanNextStep);
        this.aw = false;
        if (this.ah == null) {
            return;
        }
        runOnUiThread(new AnonymousClass34(this.ah));
    }

    public synchronized void B(FaceTecSessionStatus faceTecSessionStatus, FaceTecIDScanStatus faceTecIDScanStatus) {
        this.av = false;
        if (u() && faceTecIDScanStatus != FaceTecIDScanStatus.SKIPPED) {
            this.ax = false;
        } else {
            if (this.aY) {
                I(faceTecSessionStatus, faceTecIDScanStatus);
                return;
            }
            this.au = true;
            this.av = false;
            I(faceTecSessionStatus, faceTecIDScanStatus);
        }
    }

    public void C(boolean z2) {
        this.az = !z2;
        bb.B(this.f3281m, R.string.FaceTec_idscan_review_id_front_instruction_message);
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.42
            private /* synthetic */ boolean I;

            AnonymousClass42(boolean z22) {
                z = z22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                int i3 = 0;
                if (z) {
                    i2 = 4;
                } else {
                    o.this.f3287s.animate().alpha(1.0f).setDuration(100L);
                    i2 = 0;
                    i3 = 4;
                }
                o.this.f3292x.setVisibility(i3);
                o.this.f3288t.setVisibility(i3);
                o.this.f3281m.setVisibility(i3);
                o.this.G.setVisibility(i2);
                if (o.this.R) {
                    o.this.f3286r.setVisibility(i2);
                } else {
                    o.this.f3286r.setVisibility(4);
                }
                o.this.f3285q.setVisibility(i2);
            }
        });
    }

    public synchronized void Code(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        if (FaceTecSessionActivity.D == null) {
            I(this.Q.getStatus(), (FaceTecIDScanStatus) null);
            return;
        }
        if (faceTecIDScanNextStep == FaceTecIDScanNextStep.SKIP) {
            B(this.Q.getStatus(), FaceTecIDScanStatus.SKIPPED);
            return;
        }
        this.au = false;
        if (this.Z != null && hasWindowFocus()) {
            B(faceTecIDScanNextStep);
        }
    }

    private synchronized void Code(FaceTecSessionStatus faceTecSessionStatus) {
        B(faceTecSessionStatus, (FaceTecIDScanStatus) null);
    }

    public void Code(boolean z2) {
        boolean z3;
        synchronized (this) {
            if (this.Z != null) {
                this.Z.D();
                if (z2) {
                    ad.I();
                    this.Z = null;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
        }
        if (z3) {
            Thread thread = new Thread(new C(this));
            thread.setPriority(10);
            thread.start();
        }
    }

    private void Code(boolean z2, FaceTecIDScanRetryMode faceTecIDScanRetryMode, String str) {
        a.V(this, com.facetec.sdk.V.DEVELOPER_USED_ID_SCAN_CALLBACK, "retry");
        this.aM++;
        this.aF = true;
        this.ay = false;
        this.R = !z2;
        this.P = faceTecIDScanRetryMode;
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.27
            private /* synthetic */ boolean B;
            private /* synthetic */ String V;

            /* JADX INFO: renamed from: com.facetec.sdk.o$27$4 */
            final class AnonymousClass4 implements Runnable {
                AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    if (o.this.isFinishing() || !o.this.hasWindowFocus() || o.this.ah == null) {
                        return;
                    }
                    o.this.E();
                }
            }

            AnonymousClass27(boolean z22, String str2) {
                z = z22;
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.ah != null) {
                    o.this.ah.I(z, str, new Runnable() { // from class: com.facetec.sdk.o.27.4
                        AnonymousClass4() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            if (o.this.isFinishing() || !o.this.hasWindowFocus() || o.this.ah == null) {
                                return;
                            }
                            o.this.E();
                        }
                    });
                }
            }
        });
    }

    public void E() throws Throwable {
        this.aF = false;
        if (this.aM >= 5) {
            I(this.Q.getStatus(), FaceTecIDScanStatus.UNSUCCESS);
            return;
        }
        T();
        int i2 = this.ah != null ? LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE : 0;
        if (this.ah != null) {
            this.ah.Z(new av(this.ah) { // from class: com.facetec.sdk.o.45
                AnonymousClass45(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                final void B() throws Exception {
                    o.this.Z(200);
                }
            });
        }
        Class<?> cls = Class.forName(Xg.qd("8F=LJEA\fNS\u000f.RSUKY", (short) (C1580rY.Xd() ^ (-608)), (short) (C1580rY.Xd() ^ (-24224))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 10151);
        short sXd2 = (short) (C1607wl.Xd() ^ 22326);
        int[] iArr = new int["NY\u0018\u007f\u0003*>\t;ZJN\u000b".length()];
        QB qb = new QB("NY\u0018\u007f\u0003*>\t;ZJN\u000b");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            AnonymousClass53 anonymousClass53 = new AnonymousClass53();
            Class<?> cls2 = Class.forName(ZO.xd("\nr7\u001c~J::\u0018]D<\b \"\\rz", (short) (C1580rY.Xd() ^ (-16077)), (short) (C1580rY.Xd() ^ (-3666))));
            Class<?>[] clsArr2 = {Class.forName(C1626yg.Ud("o|-C3\u0002h\u000b\tH.eSzSJ\u001d\t", (short) (OY.Xd() ^ 10642), (short) (OY.Xd() ^ 23906))), Long.TYPE};
            Object[] objArr2 = {anonymousClass53, Long.valueOf(i2)};
            Method method = cls2.getMethod(Ig.wd("C|1L1%\nM\u0006`c", (short) (ZN.Xd() ^ 9192)), clsArr2);
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

    static /* synthetic */ void E(o oVar) {
        if (oVar.aW) {
            return;
        }
        oVar.aW = true;
        float fCode = ba.Code();
        float fV = ba.V();
        int iV = (int) (ce.V(ba.Code) * fCode * fV);
        int iV2 = (int) (ce.V(ba.Z) * fCode * fV);
        int iZ = ba.Z();
        float f2 = iZ;
        float f3 = f2 / 2.0f;
        int iRound = Math.round(f3);
        int iRound2 = Math.round(f3);
        int i2 = (int) (ba.f2967g * fCode * fV);
        int I2 = ba.I();
        int i3 = (int) (ba.f2970j * fCode * fV);
        int i4 = (int) (ba.f2969i * fCode * fV);
        int iRound3 = Math.round(f3);
        int iRound4 = Math.round((ce.V(ba.o()) * fV) / 2.0f);
        oVar.f3279k.setPadding(iRound4, iRound4, iRound4, iRound4);
        oVar.f3288t.setPadding(iRound4, iRound4, iRound4, iRound4);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) oVar.J.getLayoutParams();
        layoutParams.setMargins(iZ, 0, iZ, iZ);
        oVar.J.setLayoutParams(layoutParams);
        oVar.J.requestLayout();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) oVar.K.getLayoutParams();
        layoutParams2.setMargins(iZ, 0, iZ, iZ);
        ((ViewGroup.LayoutParams) layoutParams2).height = iV2;
        oVar.K.setLayoutParams(layoutParams2);
        oVar.K.requestLayout();
        oVar.f3291w.setLayoutParams(new LinearLayout.LayoutParams(-1, iV2));
        oVar.f3291w.requestLayout();
        new LinearLayout.LayoutParams(-1, iV2).setMargins(0, 0, 0, iZ);
        float fV2 = (Resources.getSystem().getDisplayMetrics().widthPixels * ba.V()) - (iZ << 1);
        int i5 = (int) fV2;
        oVar.J.getLayoutParams().width = i5;
        oVar.J.requestLayout();
        oVar.f3286r.getLayoutParams().width = i5;
        oVar.f3286r.requestLayout();
        float fMin = Math.min(Math.max(iV2, fV2 / 2.0f), (fV2 - f2) / 2.0f);
        oVar.findViewById(R.id.reviewButtonSeparator).getLayoutParams().width = (int) ((oVar.f3276h.getWidth() - (fMin * 2.0f)) / 3.0f);
        int i6 = (int) fMin;
        oVar.f3290v.getLayoutParams().width = i6;
        oVar.f3284p.getLayoutParams().width = i6;
        ((LinearLayout.LayoutParams) oVar.f3290v.getLayoutParams()).weight = 0.0f;
        ((LinearLayout.LayoutParams) oVar.f3284p.getLayoutParams()).weight = 0.0f;
        oVar.f3290v.requestLayout();
        oVar.f3284p.requestLayout();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) oVar.f3293y.getLayoutParams();
        layoutParams3.setMargins(iRound, iRound, 0, iRound);
        layoutParams3.setMarginStart(iRound);
        layoutParams3.setMarginEnd(iRound);
        oVar.f3293y.setLayoutParams(layoutParams3);
        oVar.f3293y.setPadding(iRound, iRound, iRound, iRound);
        oVar.f3293y.getLayoutParams().height = iV;
        oVar.f3293y.getLayoutParams().width = iV;
        oVar.f3293y.requestLayout();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) oVar.G.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams4).width = -2;
        ((ViewGroup.LayoutParams) layoutParams4).height = -2;
        layoutParams4.setMargins(0, iRound, iRound, iRound);
        layoutParams4.setMarginStart(iRound);
        layoutParams4.setMarginEnd(iRound);
        oVar.G.setLayoutParams(layoutParams4);
        oVar.G.setPadding(iRound2, iRound2, iRound2, iRound2);
        oVar.G.getLayoutParams().height = iV;
        oVar.G.getLayoutParams().width = iV;
        oVar.G.requestLayout();
        if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) {
            ((RelativeLayout.LayoutParams) oVar.G.getLayoutParams()).addRule(20);
        } else {
            ((RelativeLayout.LayoutParams) oVar.G.getLayoutParams()).addRule(21);
        }
        float f4 = i2;
        oVar.f3291w.setTextSize(2, f4);
        oVar.f3290v.setTextSize(2, f4);
        oVar.f3284p.setTextSize(2, f4);
        oVar.f3286r.setTextSize(2, f4);
        oVar.aN.setTextSize(2, I2);
        float f5 = i3;
        oVar.f3285q.setTextSize(2, f5);
        oVar.f3281m.setTextSize(2, f5);
        oVar.f3285q.setPadding(iRound3, iRound3, iRound3, iRound3);
        oVar.f3281m.setPadding(iRound3, iRound3, iRound3, iRound3);
        oVar.f3287s.setTextSize(2, i4);
        int iZ2 = ba.Z();
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) oVar.aN.getLayoutParams();
        layoutParams5.setMarginStart(iZ2);
        layoutParams5.setMarginEnd(iZ2);
        oVar.aN.setLayoutParams(layoutParams5);
        oVar.aN.requestLayout();
    }

    private void F(boolean z2) {
        runOnUiThread(new AnonymousClass37(z2));
    }

    public void G() throws Exception {
        this.aD = false;
        FragmentManager fragmentManager = getFragmentManager();
        CX.ud();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        this.aj = w.V(this.bb);
        fragmentTransactionBeginTransaction.setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(this.aL, this.aj, "OCRConfirmation").commitAllowingStateLoss();
        Z(1000);
    }

    static /* synthetic */ boolean G(o oVar) {
        oVar.ay = true;
        return true;
    }

    static /* synthetic */ void H(o oVar) {
        Z(oVar.f3286r, new Runnable() { // from class: com.facetec.sdk.o.54
            AnonymousClass54() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.this.I(false);
            }
        });
        Z(oVar.f3284p, new Runnable() { // from class: com.facetec.sdk.o.55
            AnonymousClass55() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o oVar2 = o.this;
                oVar2.findViewById(oVar2.f3284p.getId());
                oVar2.s();
            }
        });
        Z(oVar.f3290v, new Runnable() { // from class: com.facetec.sdk.o.60
            AnonymousClass60() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o oVar2 = o.this;
                oVar2.findViewById(oVar2.f3290v.getId());
                oVar2.w();
            }
        });
        Z(oVar.f3291w, new Runnable() { // from class: com.facetec.sdk.o.59
            AnonymousClass59() {
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o oVar2 = o.this;
                oVar2.findViewById(oVar2.f3291w.getId());
                oVar2.t();
            }
        });
    }

    private boolean H() {
        if ((this.ah != null && getFragmentManager().findFragmentByTag("Results") != null && !this.aP && !this.aE) || (this.aj != null && getFragmentManager().findFragmentByTag("OCRConfirmation") != null)) {
            return false;
        }
        ImageView imageView = (this.f3275g == null || FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) ? (this.ak == null || getFragmentManager().findFragmentByTag("RetryZoom") == null) ? (this.al == null || getFragmentManager().findFragmentByTag("PreEnroll") == null) ? (this.ah == null || getFragmentManager().findFragmentByTag("Results") == null || !(this.aP || this.aE)) ? (this.D == null || getFragmentManager().findFragmentByTag("Zoom") == null) ? this.aY ? this.f3293y : null : this.D.Code : this.ah.f2915j : this.al.B : this.ak.B : this.f3275g;
        if (imageView != null) {
            return imageView.getVisibility() == 0 && imageView.getAlpha() > 0.0f && imageView.isEnabled();
        }
        a.V(this, com.facetec.sdk.V.DEFINITELY_BUG_IF_SEEN, "Unexpected Scenario: isCancelButtonVisibleAndEnabled -> cancelButton == null");
        return true;
    }

    private void I(int i2) throws Throwable {
        if (isFinishing()) {
            return;
        }
        as asVarC = as.c();
        Handler handler = this.Code;
        AnonymousClass11 anonymousClass11 = new Runnable() { // from class: com.facetec.sdk.o.11
            private /* synthetic */ as Z;

            AnonymousClass11(as asVarC2) {
                asVar = asVarC2;
            }

            @Override // java.lang.Runnable
            public final void run() throws Exception {
                if (o.this.isFinishing()) {
                    return;
                }
                FragmentManager fragmentManager = o.this.getFragmentManager();
                CX.ud();
                FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                int i22 = o.this.aL;
                as asVar = asVar;
                CX.ud();
                fragmentTransactionBeginTransaction.replace(i22, asVar, "RetryZoom").commitAllowingStateLoss();
                o.this.ak = asVar;
            }
        };
        long j2 = i2;
        Class<?> cls = Class.forName(EO.Od(" |B.m\u00152%Fk\"\\AN>i09", (short) (C1633zX.Xd() ^ (-3513))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1607wl.Xd() ^ 13558);
        int[] iArr = new int["yo\u0004m9vjvn4Wyqpbbkc".length()];
        QB qb = new QB("yo\u0004m9vjvn4Wyqpbbkc");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i3));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {anonymousClass11, Long.valueOf(j2)};
        Method method = cls.getMethod(C1593ug.zd("\u007f\u007f\u0005\u0007Wy\u0002w\u0011}}", (short) (FB.Xd() ^ 13246), (short) (FB.Xd() ^ 21502)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private synchronized void J() {
        g.Z zV = V();
        ai.d();
        float fK = K();
        this.bm = fK;
        if (fK > 0.70000005f) {
            this.f3270bo = true;
            Z(fK, 0.6f, 0);
        }
        if (zV == g.Z.GRANTED) {
            be beVar = this.aB;
            if (beVar == null) {
                V(1);
                return;
            } else {
                beVar.I(new Runnable() { // from class: com.facetec.sdk.o.10
                    AnonymousClass10() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f3271c.animate().alpha(0.0f).setDuration(300L).setListener(null).start();
                    }
                });
                this.aB.Z();
            }
        }
        this.al = p.Z(zV);
        FragmentManager fragmentManager = getFragmentManager();
        CX.ud();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        int i2 = this.aL;
        p pVar = this.al;
        String strOd = C1561oA.od("CdV5]`\\XW", (short) (FB.Xd() ^ 22112));
        CX.ud();
        fragmentTransactionBeginTransaction.replace(i2, pVar, strOd).commitAllowingStateLoss();
        this.f3271c.setAlpha(1.0f);
        this.f3268a.setVisibility(8);
        this.f3268a.setAlpha(0.0f);
        this.f3274f.setAlpha(0.0f);
        this.af.setAlpha(0.0f);
        this.f3269b.setAlpha(0.0f);
        this.C.setAlpha(0.0f);
        this.f3272d.setAlpha(0.0f);
        this.I.setAlpha(0.0f);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("\f\u001a\u0011 \u001e\u0019\u0015_\"'b\u0002&')\u001f-", (short) (FB.Xd() ^ 11809))).getDeclaredMethod(Wg.Zd("H~e5\u0011O,p\u001cr+xk", (short) (C1607wl.Xd() ^ 10220), (short) (C1607wl.Xd() ^ 20344)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Object[] objArr2 = {new Runnable() { // from class: com.facetec.sdk.o.8

                /* JADX INFO: renamed from: com.facetec.sdk.o$8$2 */
                final class AnonymousClass2 implements Animator.AnimatorListener, Runnable {
                    AnonymousClass2() {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (o.this.V() != g.Z.GRANTED) {
                            return;
                        }
                        o.this.f3268a.setVisibility(0);
                        o.this.f3268a.setAlpha(1.0f);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(o.this.I, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.f3269b, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.f3272d, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.af, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.f3278j, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.f3274f, "alpha", 1.0f), ObjectAnimator.ofFloat(o.this.C, "alpha", 1.0f));
                        animatorSet.setDuration(800L);
                        animatorSet.addListener(this);
                        animatorSet.start();
                        if (o.this.f3275g != null) {
                            o.this.f3275g.animate().alpha(1.0f).setDuration(800L).setListener(null).start();
                        }
                    }
                }

                AnonymousClass8() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (o.this.u()) {
                        return;
                    }
                    o.this.runOnUiThread(new AnonymousClass2());
                }
            }, 400L};
            Method method = Class.forName(C1561oA.Xd("0>5DB=9\u0004FK\u0007\"<JAJDR", (short) (Od.Xd() ^ (-21367)))).getMethod(Qg.kd("(&))w\u0018\u001e\u0012)\u0014\u0012", (short) (C1607wl.Xd() ^ 27948), (short) (C1607wl.Xd() ^ 29617)), Class.forName(Wg.vd("!\u0017/\u0019h&\u001e*&k\u0013510&&\u0013\u000b", (short) (ZN.Xd() ^ 13150))), Long.TYPE);
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

    static /* synthetic */ boolean J(o oVar) {
        oVar.aP = false;
        return false;
    }

    private float K() throws Throwable {
        float f2 = getWindow().getAttributes().screenBrightness;
        if (f2 >= 0.0f) {
            return f2;
        }
        short sXd = (short) (C1633zX.Xd() ^ (-5988));
        short sXd2 = (short) (C1633zX.Xd() ^ (-7608));
        int[] iArr = new int["*6+84-'o$/-2\"*/g{'%*\u001a,'".length()];
        QB qb = new QB("*6+84-'o$/-2\"*/g{'%*\u001a,'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.ud(".+9\u0007205%-2\u000f!.)%.\u001c(", (short) (Od.Xd() ^ (-9393))), new Class[0]);
            try {
                method.setAccessible(true);
                if (Settings.System.getInt((ContentResolver) method.invoke(this, objArr), C1561oA.yd("/ 0$\u001d'\u0019\u001d&\u001e\u001d\u001f$\u001f\u0017&?,;>,.", (short) (C1607wl.Xd() ^ 5238))) != 1) {
                    return N();
                }
                try {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.Yd("BPGVTOK\u0016LYY`R\\c\u001e4aahZnk", (short) (OY.Xd() ^ 1389))).getMethod(Xg.qd("WVf6ccj\\fmL`oljues", (short) (C1580rY.Xd() ^ (-21992)), (short) (C1580rY.Xd() ^ (-16507))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        ContentResolver contentResolver = (ContentResolver) method2.invoke(this, objArr2);
                        short sXd3 = (short) (Od.Xd() ^ (-27154));
                        short sXd4 = (short) (Od.Xd() ^ (-27190));
                        int[] iArr2 = new int["2\b|V<\"pYS? nWD!\u0006d]=\u001b\u000fk5\u001e\u0007y".length()];
                        QB qb2 = new QB("2\b|V<\"pYS? nWD!\u0006d]=\u001b\u000fk5\u001e\u0007y");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                            i3++;
                        }
                        return Settings.System.getFloat(contentResolver, new String(iArr2, 0, i3));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Settings.SettingNotFoundException unused) {
                    return N();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Settings.SettingNotFoundException unused2) {
            return 0.5f;
        }
    }

    public void M() {
        Handler handler = this.aX;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.aX = null;
        }
    }

    private float N() throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("S\u0017\u000b\u00168\u0002PVL[DpU\u0003\u001bG\f4y!J';", (short) (Od.Xd() ^ (-30366)), (short) (Od.Xd() ^ (-5825)))).getMethod(C1626yg.Ud("5yXll\u0001<\u000e&(bqL\u001bwGbB", (short) (C1499aX.Xd() ^ (-21800)), (short) (C1499aX.Xd() ^ (-30546))), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(this, objArr);
            short sXd = (short) (ZN.Xd() ^ 29741);
            int[] iArr = new int["g\u007f=c+_p#lG?&c[zj\u0012".length()];
            QB qb = new QB("g\u007f=c+_p#lG?&c[zj\u0012");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            return Settings.System.getInt(contentResolver, new String(iArr, 0, i2)) / 255.0f;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public synchronized void O() {
        Y();
        be beVar = this.aB;
        if (beVar != null) {
            beVar.I();
            this.aB = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0128 A[Catch: all -> 0x02f3, TryCatch #0 {, blocks: (B:89:0x0001, B:93:0x0009, B:95:0x000d, B:98:0x0013, B:100:0x0018, B:101:0x004a, B:102:0x0051, B:103:0x00b9, B:105:0x00bf, B:106:0x00d8, B:107:0x00e3, B:109:0x00ec, B:110:0x00f0, B:112:0x00f2, B:113:0x00f6, B:114:0x00f7, B:116:0x0102, B:118:0x0106, B:119:0x0115, B:121:0x0124, B:127:0x0176, B:124:0x0149, B:126:0x015a, B:129:0x01a2, B:131:0x01a8, B:132:0x01c0, B:133:0x01ed, B:135:0x01f3, B:136:0x020c, B:137:0x0246, B:141:0x0250, B:142:0x0254, B:143:0x0255, B:145:0x025f, B:146:0x02b8, B:148:0x02be, B:149:0x02d8, B:150:0x02e3, B:152:0x02ec, B:153:0x02f0, B:123:0x0128), top: B:159:0x0001, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x015a A[Catch: all -> 0x02f3, TryCatch #0 {, blocks: (B:89:0x0001, B:93:0x0009, B:95:0x000d, B:98:0x0013, B:100:0x0018, B:101:0x004a, B:102:0x0051, B:103:0x00b9, B:105:0x00bf, B:106:0x00d8, B:107:0x00e3, B:109:0x00ec, B:110:0x00f0, B:112:0x00f2, B:113:0x00f6, B:114:0x00f7, B:116:0x0102, B:118:0x0106, B:119:0x0115, B:121:0x0124, B:127:0x0176, B:124:0x0149, B:126:0x015a, B:129:0x01a2, B:131:0x01a8, B:132:0x01c0, B:133:0x01ed, B:135:0x01f3, B:136:0x020c, B:137:0x0246, B:141:0x0250, B:142:0x0254, B:143:0x0255, B:145:0x025f, B:146:0x02b8, B:148:0x02be, B:149:0x02d8, B:150:0x02e3, B:152:0x02ec, B:153:0x02f0, B:123:0x0128), top: B:159:0x0001, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0255 A[Catch: all -> 0x02f3, TryCatch #0 {, blocks: (B:89:0x0001, B:93:0x0009, B:95:0x000d, B:98:0x0013, B:100:0x0018, B:101:0x004a, B:102:0x0051, B:103:0x00b9, B:105:0x00bf, B:106:0x00d8, B:107:0x00e3, B:109:0x00ec, B:110:0x00f0, B:112:0x00f2, B:113:0x00f6, B:114:0x00f7, B:116:0x0102, B:118:0x0106, B:119:0x0115, B:121:0x0124, B:127:0x0176, B:124:0x0149, B:126:0x015a, B:129:0x01a2, B:131:0x01a8, B:132:0x01c0, B:133:0x01ed, B:135:0x01f3, B:136:0x020c, B:137:0x0246, B:141:0x0250, B:142:0x0254, B:143:0x0255, B:145:0x025f, B:146:0x02b8, B:148:0x02be, B:149:0x02d8, B:150:0x02e3, B:152:0x02ec, B:153:0x02f0, B:123:0x0128), top: B:159:0x0001, inners: #1, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void P() {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.o.P():void");
    }

    private void Q() {
        Handler handler = this.B;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.B = null;
        }
    }

    public void R() throws Exception {
        if (isFinishing()) {
            return;
        }
        FragmentManager fragmentManager = getFragmentManager();
        CX.ud();
        fragmentManager.beginTransaction().remove(this.ah).commitAllowingStateLoss();
        this.ah = null;
    }

    private void T() throws Throwable {
        Q();
        Handler handler = new Handler();
        this.B = handler;
        AnonymousClass26 anonymousClass26 = new Runnable() { // from class: com.facetec.sdk.o.26
            AnonymousClass26() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.v(o.this);
            }
        };
        Class<?> cls = Class.forName(Xg.qd(",:1@>95\u007fBG\u0003\u001e8F=F@N", (short) (OY.Xd() ^ 25494), (short) (OY.Xd() ^ 28374)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (ZN.Xd() ^ 7135);
        short sXd2 = (short) (ZN.Xd() ^ 18437);
        int[] iArr = new int["ddPZ/LWc\"\b#&ED\u000e-\u001eu".length()];
        QB qb = new QB("ddPZ/LWc\"\b#&ED\u000e-\u001eu");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {anonymousClass26, 600000L};
        Method method = cls.getMethod(ZO.xd("\n'9^^w\u000e7YF\u000f", (short) (OY.Xd() ^ 31576), (short) (OY.Xd() ^ 11536)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private synchronized void U() throws bi {
        this.D = bq.Code((String) null);
        if (this.aB == null) {
            this.aB = be.Z(this.f3268a, this, false);
        }
        this.aB.V(this.Z);
    }

    static /* synthetic */ String V(cl clVar) {
        int i2 = AnonymousClass63.S[clVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : "ConnectionError" : "ResponseError" : "InvalidMrzKey" : "Unknown";
    }

    private void V(int i2) {
        com.facetec.sdk.L.V(new Throwable("FaceTec SDK has experienced an unexpected camera error."));
        a.V(this, com.facetec.sdk.V.CAMERA_ERROR, "FaceScan: zoomCamera is null unexpectedly ".concat(String.valueOf(i2)));
        B(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
    }

    private void V(boolean z2) {
        if (this.aA) {
            return;
        }
        this.aA = true;
        new D(z2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static boolean V(Activity activity) {
        return (activity == null || activity.isFinishing()) ? false : true;
    }

    public void W() {
        Y();
        this.bn = new TimerTask() { // from class: com.facetec.sdk.o.31
            AnonymousClass31() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                if (o.this.aB != null) {
                    o.this.aB.I(false);
                }
            }
        };
        Timer timer = new Timer();
        this.ba = timer;
        timer.scheduleAtFixedRate(this.bn, 6000L, 6000L);
    }

    public void X() {
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.38
            AnonymousClass38() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                bb.B(o.this.f3285q, R.string.FaceTec_idscan_capture_id_front_instruction_message);
                o.this.G.setImageResource(ba.at());
                o.this.f3277i.setVisibility(0);
                o.this.f3285q.setVisibility(0);
                int iZ = ba.Z();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) o.this.A.getLayoutParams();
                float f2 = iZ;
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ((o.this.f3282n.Code().top - o.this.A.getHeight()) - f2);
                o.this.A.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = (RelativeLayout) o.this.findViewById(R.id.focusMessageContainer);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (o.this.f3282n.Code().bottom + f2);
                relativeLayout.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout2 = (RelativeLayout) o.this.findViewById(R.id.idScanCroppedFrame);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
                ((ViewGroup.LayoutParams) layoutParams3).height = (int) (((double) relativeLayout2.getWidth()) / 1.59d);
                relativeLayout2.setLayoutParams(layoutParams3);
            }
        });
    }

    private void Y() {
        Timer timer = this.ba;
        if (timer != null) {
            timer.cancel();
            this.ba = null;
        }
        TimerTask timerTask = this.bn;
        if (timerTask != null) {
            timerTask.cancel();
            this.bn = null;
        }
    }

    public void Z(float f2, float f3, int i2) {
        int i3 = this.bk ? 750 : ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        ValueAnimator valueAnimator = this.bg;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.bg.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
        this.bg = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(i3);
        this.bg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.o.6
            AnonymousClass6() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                WindowManager.LayoutParams attributes = o.this.getWindow().getAttributes();
                attributes.screenBrightness = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                o.this.getWindow().setAttributes(attributes);
            }
        });
        this.bg.setInterpolator(new LinearInterpolator());
        this.bg.setStartDelay(i2);
        this.bg.addListener(new AnimatorListenerAdapter() { // from class: com.facetec.sdk.o.7
            private /* synthetic */ float V;
            private /* synthetic */ float Z;

            AnonymousClass7(float f32, float f22) {
                f = f32;
                f = f22;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (o.this.f3270bo || o.this.bk) {
                    o.e(o.this);
                    o.d(o.this);
                } else if (o.this.ag && ai.L() == ah.ZOOM_CLOSE && !o.this.bh && f == 0.8f) {
                    o.h(o.this);
                    o.this.Z(0.5f, 0.8f, 1000);
                } else if (o.this.ag) {
                    o.this.Z(f, f, 1000);
                }
            }
        });
        this.bg.start();
    }

    public void Z(int i2) throws Exception {
        if (this.ah == null || isFinishing()) {
            return;
        }
        if (i2 == 0) {
            R();
            return;
        }
        short sXd = (short) (C1499aX.Xd() ^ (-3167));
        short sXd2 = (short) (C1499aX.Xd() ^ (-24445));
        int[] iArr = new int["\u0017q6\u0012l!,U\u001d\u0003RZ/wR#H".length()];
        QB qb = new QB("\u0017q6\u0012l!,U\u001d\u0003RZ/wR#H");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i3)).getDeclaredMethod(Ig.wd("l\u001d\u001cR\u001cw\u000f\u0002j@=\u0016p", (short) (C1633zX.Xd() ^ (-11336))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            AnonymousClass30 anonymousClass30 = new av(this.ah) { // from class: com.facetec.sdk.o.30
                AnonymousClass30(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                public final void B() throws Exception {
                    o.this.R();
                }
            };
            Class<?> cls = Class.forName(EO.Od(")c=1p0M(=\u0013ec,-!\u0011/T", (short) (C1633zX.Xd() ^ (-26808))));
            Class<?>[] clsArr = {Class.forName(C1561oA.Qd("+!5\u001fj(\u001c( e\t+#\"\u0014\u0014\u001d\u0015", (short) (FB.Xd() ^ 9548))), Long.TYPE};
            Object[] objArr2 = {anonymousClass30, Long.valueOf(i2)};
            Method method = cls.getMethod(C1593ug.zd("%%*,|\u001f'\u001d6##", (short) (FB.Xd() ^ 3530), (short) (FB.Xd() ^ 422)), clsArr);
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

    private void Z(FaceTecIDScanNextStep faceTecIDScanNextStep) throws Exception {
        if (this.Z == null) {
            return;
        }
        if (this.D != null) {
            FragmentManager fragmentManager = getFragmentManager();
            short sXd = (short) (C1580rY.Xd() ^ (-29367));
            int[] iArr = new int["l\u0001\u007f|".length()];
            QB qb = new QB("l\u0001\u007f|");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            if (fragmentManager.findFragmentByTag(new String(iArr, 0, i2)) != null) {
                FragmentManager fragmentManager2 = getFragmentManager();
                CX.ud();
                fragmentManager2.beginTransaction().remove(this.D).commitAllowingStateLoss();
            }
            this.D = null;
        }
        this.Q = new FaceTecSessionResult(this.Q.getStatus(), this.ai, this.aq, this.am);
        if (this.aa == L.ZOOM_SESSION_STARTED) {
            this.Z.V(true);
        }
        this.aY = true;
        this.M = UUID.randomUUID().toString();
        this.Z.Z(this.br);
        aa();
        short sXd2 = (short) (OY.Xd() ^ 30218);
        int[] iArr2 = new int["%3*972.x;@{\u001b?@B8F".length()];
        QB qb2 = new QB("%3*972.x;@{\u001b?@B8F");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (OY.Xd() ^ 5330);
        short sXd4 = (short) (OY.Xd() ^ 2387);
        int[] iArr3 = new int["t)i\u0010U#i\u0005i\u001fa\u0014b".length()];
        QB qb3 = new QB("t)i\u0010U#i\u0005i\u001fa\u0014b");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.B = handler;
            AnonymousClass39 anonymousClass39 = new Runnable() { // from class: com.facetec.sdk.o.39
                AnonymousClass39() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.v(o.this);
                }
            };
            Class<?> cls2 = Class.forName(C1561oA.Xd("\u0013!\u0018'% \u001cf).i\u0005\u001f-$-'5", (short) (OY.Xd() ^ 1914)));
            Class<?>[] clsArr2 = {Class.forName(Wg.vd("\u001b\u0013%\u0011Z\u001a\f\u001a\u0010Wx\u001d\u0013\u0014\u0004\u0006\r\u0007", (short) (Od.Xd() ^ (-15628)))), Long.TYPE};
            Object[] objArr2 = {anonymousClass39, 600000L};
            short sXd5 = (short) (FB.Xd() ^ 7591);
            short sXd6 = (short) (FB.Xd() ^ 18830);
            int[] iArr4 = new int["\u0001~\u0002\u0002Ppvj\u0002lj".length()];
            QB qb4 = new QB("\u0001~\u0002\u0002Ppvj\u0002lj");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(((sXd5 + i5) + xuXd4.CK(iKK4)) - sXd6);
                i5++;
            }
            Method method = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
                F(faceTecIDScanNextStep == FaceTecIDScanNextStep.SELECTION_SCREEN);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static void Z(bf bfVar, Runnable runnable) {
        bfVar.setOnClickListenerRunnable(new Runnable() { // from class: com.facetec.sdk.o.58
            private /* synthetic */ Runnable Z;

            AnonymousClass58(Runnable runnable2) {
                runnable = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    public void Z(boolean z2, boolean z3) throws Throwable {
        if (this.bp || this.aP) {
            return;
        }
        if (this.aH == null) {
            this.aH = new y(this.ah);
        }
        if (this.aJ == null) {
            this.aJ = cf.Z(this);
        }
        cf cfVar = this.aJ;
        if (cfVar == null) {
            Z(false);
            return;
        }
        if (this.bi) {
            return;
        }
        try {
            if (!cfVar.I(getClass(), this.aK) || z2) {
                return;
            }
            y yVar = this.aH;
            if (yVar.Code.getActivity() != null) {
                yVar.Code.getActivity().runOnUiThread(yVar.new AnonymousClass5(yVar.Code, z3));
            }
        } catch (Exception unused) {
        }
    }

    private void aa() {
        be.f2975a = this.O.getWidth();
        be.f2977d = this.O.getHeight();
        be beVar = this.aB;
        View viewCode = beVar != null ? beVar.Code() : null;
        ba.I(this.f3271c);
        this.f3271c.animate().alpha(1.0f).setDuration(300L).setListener(null).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.32
            private /* synthetic */ View B;

            AnonymousClass32(View viewCode2) {
                view = viewCode2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view = view;
                if (view != null) {
                    view.setVisibility(4);
                }
                o.this.f3273e.setVisibility(4);
            }
        }).start();
        O();
        try {
            this.aB = be.Z(this.O, this, true);
        } catch (bi e2) {
            com.facetec.sdk.L.V(e2);
            e2.getMessage();
            a.V(this, com.facetec.sdk.V.CAMERA_ERROR, new StringBuilder("IDScanCameraSetupError with message: ").append(e2.getMessage()).toString());
            B(this.Q.getStatus(), FaceTecIDScanStatus.CAMERA_ERROR);
        }
        this.O.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.o.35
            AnonymousClass35() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!o.this.az || motionEvent.getAction() != 0 || !o.this.f3282n.Code().contains(motionEvent.getX(), motionEvent.getY())) {
                    return true;
                }
                try {
                    if (o.this.aB == null) {
                        return true;
                    }
                    o.this.W();
                    o.this.aB.Code(motionEvent, o.this.O);
                    o.this.H.Code(motionEvent.getX(), motionEvent.getY(), null);
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }
        });
    }

    private void ab() {
        this.f3284p.setEnabled(false, true);
        this.f3290v.setEnabled(false, true);
        this.f3286r.setEnabled(false, true);
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.49
            AnonymousClass49() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                float fV = ce.V(20) * ba.Code() * ba.V();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(o.this.K, (Property<RelativeLayout, Float>) View.TRANSLATION_Y, fV), ObjectAnimator.ofFloat(o.this.A, (Property<RelativeLayout, Float>) View.TRANSLATION_Y, -fV));
                animatorSet.setDuration(500L);
                animatorSet.start();
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(o.this.K, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(o.this.A, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(o.this.f3287s, (Property<TextView, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(o.this.G, (Property<ImageView, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(o.this.f3293y, (Property<ImageView, Float>) View.ALPHA, 0.0f));
                animatorSet2.setDuration(500L);
                animatorSet2.start();
                if (o.this.f3275g != null) {
                    o.this.f3275g.animate().alpha(0.0f).setDuration(500L).start();
                }
            }
        });
    }

    public void ac() {
        boolean z2;
        int iRound;
        int iRound2;
        int iRound3;
        this.aN.setTypeface(FaceTecSDK.V.Code.headerFont);
        this.f3281m.setTypeface(FaceTecSDK.V.Code.subtextFont);
        this.f3285q.setTypeface(FaceTecSDK.V.Code.subtextFont);
        this.f3287s.setTypeface(FaceTecSDK.V.Code.captureScreenFocusMessageFont);
        this.aN.setLineSpacing(0.0f, ba.V);
        bb.B(this.aN, R.string.FaceTec_idscan_type_selection_header);
        bb.B(this.f3291w, R.string.FaceTec_action_continue);
        float fCode = ba.Code() * ba.V();
        int iRound4 = Math.round(ce.V(ba.I) * fCode);
        int iAA = ba.aA();
        boolean z3 = true;
        if (!FaceTecSDK.V.Code.showSelectionScreenBrandingImage || iAA == 0) {
            this.aR.setVisibility(8);
            iRound4 = 0;
            z2 = false;
            iRound = 0;
        } else {
            iRound = ba.aQ() ? Math.round((ce.V(ba.Code) * fCode) + (ba.Z() / 2.0f)) : 0;
            this.aR.setImageDrawable(ContextCompat.getDrawable(this, iAA));
            this.aR.setVisibility(0);
            z2 = true;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.aT.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).height = iRound4;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iRound;
        this.aT.setLayoutParams(layoutParams);
        int iAz = ba.az();
        if (z2 || !FaceTecSDK.V.Code.showSelectionScreenDocumentImage || iAz == 0) {
            this.aQ.setVisibility(8);
            iRound2 = 0;
            iRound3 = 0;
            z3 = false;
        } else {
            iRound2 = Math.round(ce.V(ba.I) * fCode);
            iRound3 = Math.round(ba.Z());
            this.aQ.setImageDrawable(ContextCompat.getDrawable(this, iAz));
            this.aQ.setVisibility(0);
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.aU.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams2).height = iRound2;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = z3 ? iRound3 : 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iRound3;
        this.aU.setLayoutParams(layoutParams2);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.facetec_idscan_capture_instructions_background);
        ba.B(this, this.f3285q, drawable, ba.au());
        ba.B(this, this.f3285q, drawable, ba.Code(this, ba.as()), (int) (ce.V(ba.j()) * ba.V()), (int) (ce.V(ba.l()) * ba.V()));
        this.f3285q.setBackground(drawable);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.facetec_idscan_review_instructions_background);
        ba.B(this, this.f3281m, drawable2, ba.ao());
        ba.B(this, this.f3281m, drawable2, ba.Code(this, ba.ap()), (int) (ce.V(ba.i()) * ba.V()), (int) (ce.V(ba.m()) * ba.V()));
        this.f3281m.setBackground(drawable2);
        ba.V(this.aN);
        ba.S(this.f3285q);
        ba.Code(this.f3281m);
        ba.L(this.f3287s);
        bb.B(this.f3287s, R.string.FaceTec_idscan_capture_tap_to_focus_message);
        ba.C(this.aZ);
        this.f3280l.setBackgroundColor(ba.Z(this));
        this.f3286r.setupButtonForIdentityCheck();
        this.f3284p.setupButtonForIdentityCheck();
        this.f3290v.setupButtonForIdentityCheck();
        this.f3291w.setupButtonForIdentityCheck();
        bb.B(this.f3286r, R.string.FaceTec_action_take_photo);
        bb.B(this.f3284p, R.string.FaceTec_action_retake_photo);
        bb.B(this.f3290v, R.string.FaceTec_action_accept_photo);
        if (ba.aQ()) {
            this.f3293y.setImageDrawable(ContextCompat.getDrawable(this, ba.ay()));
            this.f3293y.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.o.46
                AnonymousClass46() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        o.this.f3293y.setAlpha(1.0f);
                        o.this.f3293y.setEnabled(false);
                        o.this.f3290v.setEnabled(false, true);
                        o.this.f3284p.setEnabled(false, true);
                        o.this.f3286r.setEnabled(false, true);
                        o.this.I(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, FaceTecIDScanStatus.USER_CANCELED);
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            this.f3293y.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.o.51
                AnonymousClass51() {
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        o.this.f3293y.setAlpha(0.4f);
                    } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > o.this.f3293y.getWidth() + o.this.f3293y.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > o.this.f3293y.getHeight() + o.this.f3293y.getTop() + 10) {
                        o.this.f3293y.setAlpha(1.0f);
                    } else if (motionEvent.getAction() == 1) {
                        o.this.f3293y.performClick();
                    }
                    return true;
                }
            });
        }
        int i2 = AnonymousClass63.I[FaceTecSDK.V.f2853d.V.ordinal()];
        if (i2 == 2) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f3293y.getLayoutParams();
            layoutParams3.removeRule(20);
            layoutParams3.addRule(21);
            this.f3293y.setLayoutParams(layoutParams3);
        } else if (i2 == 3 || i2 == 4) {
            this.f3293y.setVisibility(8);
        }
        this.f3293y.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.o.52
            AnonymousClass52() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                o.E(o.this);
            }
        });
    }

    public void ae() {
        cf cfVar = this.aJ;
        if (cfVar != null) {
            if (!this.bi) {
                try {
                    cfVar.V();
                } catch (Exception unused) {
                }
            }
            this.aJ = null;
        }
    }

    static /* synthetic */ boolean d(o oVar) {
        oVar.bk = false;
        return false;
    }

    static /* synthetic */ boolean e(o oVar) {
        oVar.f3270bo = false;
        return false;
    }

    static /* synthetic */ boolean h(o oVar) {
        oVar.bh = true;
        return true;
    }

    static /* synthetic */ void p(o oVar) {
        FaceTecSessionActivity faceTecSessionActivity;
        oVar.ak = (as) oVar.getFragmentManager().findFragmentByTag("RetryZoom");
        if (oVar.ak == null || oVar.ak.f2934a == null) {
            return;
        }
        at atVar = oVar.ak.f2934a;
        if (atVar.f2942d != null || (faceTecSessionActivity = (FaceTecSessionActivity) atVar.getActivity()) == null) {
            return;
        }
        atVar.f2942d = faceTecSessionActivity.W;
        atVar.B.setAlpha(0.0f);
        atVar.I();
        atVar.B.animate().alpha(1.0f).setDuration(400L).setListener(null);
    }

    static /* synthetic */ boolean r(o oVar) {
        oVar.aA = false;
        return false;
    }

    public synchronized boolean u() {
        if (!this.au) {
            if (!isFinishing()) {
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ boolean u(o oVar) {
        oVar.av = false;
        return false;
    }

    static /* synthetic */ void v(o oVar) {
        oVar.I(oVar.Q.getStatus(), FaceTecIDScanStatus.TIMED_OUT);
    }

    static /* synthetic */ boolean x(o oVar) {
        oVar.ax = true;
        return true;
    }

    private void z() {
        if (FaceTecSessionActivity.D == null || !this.aY) {
            return;
        }
        be beVar = this.aB;
        if (beVar != null) {
            beVar.Z(false);
            ImageView imageView = this.G;
            if (imageView != null) {
                imageView.setImageResource(ba.at());
            }
        }
        this.aS = false;
    }

    @Override // com.facetec.sdk.g
    final synchronized void B() {
        boolean z2 = this.aY;
        if (z2) {
            z();
            return;
        }
        if (this.ap) {
            return;
        }
        this.ap = true;
        if (this.au) {
            return;
        }
        if (z2) {
            a.V(this, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecIDScanStatus.CONTEXT_SWITCH.toString());
            return;
        }
        if (!u()) {
            this.aI.Code(this, a.Z.SESSION_CONTEXT_SWITCH);
            V(false);
        }
        a.V(this, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.CONTEXT_SWITCH.toString());
    }

    final void B(JSONObject jSONObject) throws Exception {
        Z(0);
        ap.Code code = ap.Code.USER_CONFIRMED_INFO;
        this.X = code;
        this.ah = ap.Code(true, code);
        FragmentManager fragmentManager = getFragmentManager();
        CX.ud();
        fragmentManager.beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(this.aL, this.ah, "Results").commitAllowingStateLoss();
        new B(this, jSONObject).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facetec.sdk.g
    final void C() {
        this.D = bq.Code((String) null);
        this.as = false;
        ai.I();
        bq.B = true;
        P();
    }

    protected final void Code(float f2) {
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.24
            private /* synthetic */ float Code;

            AnonymousClass24(float f22) {
                f = f22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.ah != null) {
                    o.this.ah.V(f);
                }
            }
        });
    }

    @Override // com.facetec.sdk.g
    final void Code(int i2) {
        a.V(this, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder().append(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.toString()).append(": ").append(i2).toString());
        B(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
    }

    final void Code(int i2, int i3) {
        ImageView imageView = this.f3275g;
        if (imageView != null) {
            imageView.animate().alpha(1.0f).setDuration(i2).setStartDelay(i3).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.50
                AnonymousClass50() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.f3275g.setEnabled(true);
                }
            }).start();
        }
    }

    protected final void Code(String str) {
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.22
            private /* synthetic */ String Code;

            AnonymousClass22(String str2) {
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.ah != null) {
                    o.this.ah.B(str);
                }
            }
        });
    }

    @Override // com.facetec.sdk.g
    final void D() {
        this.as = true;
        if (!n.Z() || this.ar) {
            return;
        }
        com.facetec.sdk.Z.B(this);
        this.ar = true;
    }

    @Override // com.facetec.sdk.g
    final void F() {
        M();
        if (bq.B) {
            this.aI.Code(this, a.Z.PRE_SESSION_PHASE_2_TIMEOUT);
        } else {
            this.aI.Code(this, a.Z.PRE_SESSION_PHASE_1_TIMEOUT);
        }
        this.ai = null;
        this.aq = null;
        this.am = null;
        try {
            boolean z2 = ai.i().length != 0;
            V(false);
            this.Z.F();
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(yg.hg.Vd("o{p}yrl5ux2Oqppdp", (short) (C1580rY.Xd() ^ (-15673)), (short) (C1580rY.Xd() ^ (-4981)))).getDeclaredMethod(C1561oA.ud("olzRelpMonnbn", (short) (C1633zX.Xd() ^ (-6345))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                new Handler((Looper) declaredMethod.invoke(null, objArr));
                this.ak = (as) getFragmentManager().findFragmentByTag(C1561oA.yd("^r\u0003\u0002\u0002cyzq", (short) (C1633zX.Xd() ^ (-17289))));
                this.al = (p) getFragmentManager().findFragmentByTag(C1561oA.Yd(";^R3]b`^_", (short) (C1607wl.Xd() ^ 7687)));
                if (this.ak != null) {
                    if (!this.ak.a() || (this.ak.a() && !z2)) {
                        this.ak.V(this);
                        return;
                    } else {
                        this.ak.Code(false, 500, 0);
                        this.ak.Code.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                    }
                } else if (this.al != null) {
                    if (!z2) {
                        this.al.V(this);
                        return;
                    } else {
                        this.al.Code(false, 500, 0);
                        this.al.Code.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                    }
                }
                I(500);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            com.facetec.sdk.L.V(th);
            a.V(this, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder().append(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.toString()).append(Xg.qd("v]", (short) (Od.Xd() ^ (-11670)), (short) (Od.Xd() ^ (-11823)))).append(th.getMessage()).toString());
            Code(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
        }
    }

    final synchronized void I(FaceTecSessionStatus faceTecSessionStatus, FaceTecIDScanStatus faceTecIDScanStatus) {
        if (this.av) {
            return;
        }
        M();
        boolean z2 = true;
        if (FaceTecSessionActivity.B != null && !this.ax) {
            FaceTecSessionResult faceTecSessionResult = new FaceTecSessionResult(faceTecSessionStatus, this.ai, this.aq, this.am);
            this.Q = faceTecSessionResult;
            this.ax = true;
            if (faceTecSessionResult.getStatus() != null) {
                a.V(this, com.facetec.sdk.V.FACESCAN_CALLBACK_CALLED, this.Q.getStatus().toString());
            }
            FaceTecSessionActivity.B.processSessionWhileFaceTecSDKWaits(this.Q, new V(this));
        }
        if (FaceTecSessionActivity.D != null && !this.ay) {
            FaceTecIDScanResult faceTecIDScanResult = new FaceTecIDScanResult(faceTecIDScanStatus);
            this.T = faceTecIDScanResult;
            this.ay = true;
            if (faceTecIDScanResult.getStatus() != null) {
                a.V(this, com.facetec.sdk.V.ID_SCAN_CALLBACK_CALLED, this.T.getStatus().toString());
            }
            FaceTecSessionActivity.D.processIDScanWhileFaceTecSDKWaits(this.T, new I(this));
        }
        this.au = true;
        if (!this.at) {
            Intent intent = new Intent();
            try {
                Code(false);
                this.aI.Code();
                bt.I(faceTecSessionStatus, this);
                switch (AnonymousClass63.V[faceTecSessionStatus.ordinal()]) {
                    case 1:
                        br.B(this, bp.ZOOM_EVENT_VERIFY_SESSION_SUCCESS);
                        break;
                    case 2:
                        br.B(this, bp.ZOOM_EVENT_VERIFY_SESSION_FAIL);
                        break;
                    case 3:
                        br.B(this, bp.ZOOM_EVENT_VERIFY_SESSION_FAIL);
                        break;
                    case 5:
                        br.B(this, bp.ZOOM_EVENT_VERIFY_SESSION_CANCEL);
                        break;
                    case 6:
                        br.B(this, bp.ZOOM_EVENT_VERIFY_SESSION_CANCEL);
                        break;
                    case 7:
                        br.B(this, bp.ZOOM_EVENT_VERIFY_SESSION_CANCEL);
                        break;
                    case 8:
                        br.B(this, bp.ZOOM_EVENT_VERIFY_SESSION_FAIL);
                        break;
                    case 9:
                        br.B(this, bp.ZOOM_EVENT_VERIFY_SESSION_FAIL);
                        break;
                }
                FaceTecSessionResult faceTecSessionResult2 = new FaceTecSessionResult(faceTecSessionStatus, this.ai, this.aq, this.am);
                faceTecSessionResult2.I(ad.V);
                intent.putExtra(FaceTecSDK.EXTRA_SESSION_RESULTS, faceTecSessionResult2);
                if (FaceTecSessionActivity.D != null) {
                    O();
                    intent.putExtra(FaceTecSDK.EXTRA_ID_SCAN_RESULTS, this.T);
                }
                this.Q = faceTecSessionResult2;
            } catch (Throwable th) {
                com.facetec.sdk.L.V(th);
            }
            FaceTecSessionActivity.B = null;
            FaceTecSessionActivity.D = null;
            setResult(-1, intent);
            finish();
            this.at = true;
            try {
            } catch (Exception e2) {
                com.facetec.sdk.L.V(e2);
            }
            if (!be.V(this).booleanValue() || faceTecIDScanStatus != null) {
                z2 = false;
            }
            if (faceTecSessionStatus == FaceTecSessionStatus.SESSION_UNSUCCESSFUL) {
                int i2 = FaceTecSDK.V.exitAnimationUnsuccessResourceID;
                if (FaceTecSDK.V.exitAnimationUnsuccessResourceID == -1) {
                    i2 = z2 ? R.anim.facetec_fade_out : 0;
                }
                overridePendingTransition(0, i2);
                return;
            }
            if (faceTecSessionStatus == FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY) {
                int i3 = FaceTecSDK.V.exitAnimationSuccessResourceID;
                if (FaceTecSDK.V.exitAnimationSuccessResourceID == -1) {
                    i3 = z2 ? R.anim.facetec_fade_out : 0;
                }
                overridePendingTransition(0, i3);
                return;
            }
            overridePendingTransition(0, 0);
        }
    }

    final void I(boolean z2) throws Throwable {
        Y();
        T();
        this.ab = false;
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.41
            final /* synthetic */ boolean B;

            /* JADX INFO: renamed from: com.facetec.sdk.o$41$4 */
            final class AnonymousClass4 implements Runnable {
                AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.f3289u.setVisibility(4);
                    if (z) {
                        return;
                    }
                    o.this.f3287s.animate().alpha(0.0f).setDuration(100L);
                }
            }

            AnonymousClass41(boolean z22) {
                z = z22;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.this.f3290v.setEnabled(false, true);
                o.this.f3284p.setEnabled(false, true);
                o.this.f3286r.setEnabled(false, true);
                o.this.f3286r.setVisibility(4);
                o.this.f3289u.setVisibility(0);
                Handler handler = new Handler();
                Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.o.41.4
                    AnonymousClass4() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f3289u.setVisibility(4);
                        if (z) {
                            return;
                        }
                        o.this.f3287s.animate().alpha(0.0f).setDuration(100L);
                    }
                }, 100L};
                Method method = Class.forName(EO.Od("\u00018 \u0016\naxIf.f^G^L2Pg", (short) (OY.Xd() ^ 32297))).getMethod(C1593ug.zd("eejl=_g]vcc", (short) (OY.Xd() ^ 5218), (short) (OY.Xd() ^ 6756)), Class.forName(C1561oA.Qd("tj~h4qeqi/Rtlk]]f^", (short) (C1633zX.Xd() ^ (-9362)))), Long.TYPE);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        });
        be beVar = this.aB;
        if (beVar == null) {
            B(9);
            return;
        }
        if (this.aS) {
            beVar.Z(false);
        }
        if (!z22) {
            this.aB.Code(true);
            ai.n();
        }
        this.az = false;
        if (z22) {
            w();
        } else {
            C(true);
            runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.43
                AnonymousClass43() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.f3290v.setEnabled(true, true);
                    o.this.f3284p.setEnabled(true, true);
                }
            });
        }
    }

    protected final boolean I(String str) {
        boolean zOptBoolean;
        boolean zOptBoolean2;
        boolean zOptBoolean3;
        boolean zOptBoolean4;
        try {
            JSONObject jSONObject = new JSONObject(ai.J(str, true));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                r();
                return false;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("flags");
            if (jSONObjectOptJSONObject2 == null) {
                r();
                return false;
            }
            int iOptInt = jSONObjectOptJSONObject2.optInt("nextStep");
            boolean zOptBoolean5 = jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS);
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("resultsFlags");
            if (jSONObjectOptJSONObject3 != null) {
                zOptBoolean2 = jSONObjectOptJSONObject3.optBoolean("matchedHighlyEnough");
                zOptBoolean3 = jSONObjectOptJSONObject3.optBoolean("wasFullID");
                zOptBoolean4 = jSONObjectOptJSONObject3.optBoolean("idTypeNotSupported");
                zOptBoolean = jSONObjectOptJSONObject3.optBoolean("overzoomedDocument");
            } else {
                zOptBoolean = false;
                zOptBoolean2 = false;
                zOptBoolean3 = false;
                zOptBoolean4 = false;
            }
            boolean z2 = iOptInt <= 2;
            int i2 = this.aV;
            boolean z3 = i2 == 1 || i2 == 2;
            this.aV = iOptInt;
            h hVar = this.f3282n;
            if (hVar != null && z2) {
                if (zOptBoolean) {
                    hVar.I();
                } else {
                    hVar.B();
                }
                X();
            }
            aq aqVar = aq.UNKNOWN;
            if (!zOptBoolean5) {
                aqVar = zOptBoolean4 ? aq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED : !zOptBoolean3 ? aq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE : !zOptBoolean2 ? aq.IDSCAN_RETRY_FACE_DID_NOT_MATCH : aq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH;
            } else if (iOptInt == 1) {
                aqVar = aq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT;
            } else if (iOptInt == 3) {
                aqVar = this.aE ? this.bc ? aq.IDSCAN_SKIP_OR_ERROR_NFC : aq.IDSCAN_SUCCESS_NFC : z3 ? aq.IDSCAN_SUCCESS_BACK_SIDE : aq.IDSCAN_SUCCESS_FRONT_SIDE;
            } else if (iOptInt == 4) {
                aqVar = aq.IDSCAN_SUCCESS_USER_CONFIRMATION;
            } else if (iOptInt == 5) {
                aqVar = aq.IDSCAN_SUCCESS_FRONT_SIDE;
            }
            if (iOptInt == 3 && this.aE) {
                aqVar = this.bc ? aq.IDSCAN_SKIP_OR_ERROR_NFC : aq.IDSCAN_SUCCESS_NFC;
            }
            this.U = ba.I(aqVar);
            if (iOptInt == 4) {
                a.V(this, com.facetec.sdk.V.DEVELOPER_USED_ID_SCAN_CALLBACK, "succeed");
                this.aM++;
                runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.29

                    /* JADX INFO: renamed from: com.facetec.sdk.o$29$5 */
                    final class AnonymousClass5 implements Runnable {
                        AnonymousClass5() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            o.this.I(o.this.Q.getStatus(), o.this.T.getStatus());
                        }
                    }

                    AnonymousClass29() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.O.setVisibility(4);
                        if (o.this.ah != null) {
                            o.this.ah.I(true, o.this.U, new Runnable() { // from class: com.facetec.sdk.o.29.5
                                AnonymousClass5() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    o.this.I(o.this.Q.getStatus(), o.this.T.getStatus());
                                }
                            });
                        }
                    }
                });
                return true;
            }
            if (iOptInt == 0) {
                this.E = Z.FRONT;
                Code(false, FaceTecIDScanRetryMode.FRONT, this.U);
            } else if (iOptInt == 1) {
                this.E = Z.BACK;
                Code(true, FaceTecIDScanRetryMode.BACK, this.U);
            } else if (iOptInt == 2) {
                this.E = Z.BACK;
                Code(false, FaceTecIDScanRetryMode.BACK, this.U);
            } else if (iOptInt == 3) {
                this.Z.C();
                this.bb = jSONObjectOptJSONObject;
                this.aD = true;
                a.V(this, com.facetec.sdk.V.DEVELOPER_USED_ID_SCAN_CALLBACK, "succeed");
                this.aM++;
                runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.28

                    /* JADX INFO: renamed from: com.facetec.sdk.o$28$2 */
                    final class AnonymousClass2 implements Runnable {
                        AnonymousClass2() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            if (o.this.isFinishing() || !o.this.hasWindowFocus()) {
                                return;
                            }
                            o.this.G();
                        }
                    }

                    AnonymousClass28() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.O.setVisibility(4);
                        o.this.f3276h.setVisibility(8);
                        if (o.this.ah != null) {
                            o.this.ah.I(true, o.this.U, new Runnable() { // from class: com.facetec.sdk.o.28.2
                                AnonymousClass2() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    if (o.this.isFinishing() || !o.this.hasWindowFocus()) {
                                        return;
                                    }
                                    o.this.G();
                                }
                            });
                        }
                    }
                });
            } else if (iOptInt == 5) {
                this.aK = jSONObjectOptJSONObject.optString("mrzKey");
                O();
                this.aE = true;
                runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.62

                    /* JADX INFO: renamed from: com.facetec.sdk.o$62$3 */
                    final class AnonymousClass3 implements Runnable {
                        AnonymousClass3() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            o.this.Z(false, false);
                        }
                    }

                    AnonymousClass62() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.O.setVisibility(4);
                        o.this.f3268a.setVisibility(4);
                        if (o.this.ah != null) {
                            o.this.ah.I(true, o.this.U, new Runnable() { // from class: com.facetec.sdk.o.62.3
                                AnonymousClass3() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    o.this.Z(false, false);
                                }
                            });
                        }
                    }
                });
            } else {
                r();
            }
            return false;
        } catch (JSONException e2) {
            e2.printStackTrace();
            I((FaceTecSessionStatus) null, (FaceTecIDScanStatus) null);
            return false;
        }
    }

    protected final boolean I(String str, FaceTecIDScanNextStep faceTecIDScanNextStep) {
        try {
            if (new JSONObject(ai.J(str, false)).optBoolean(FirebaseAnalytics.Param.SUCCESS, false)) {
                V(faceTecIDScanNextStep);
                return true;
            }
            m();
            return false;
        } catch (JSONException unused) {
            m();
            return false;
        }
    }

    @Override // com.facetec.sdk.g
    final synchronized void L() {
        this.aI.Code(this, a.Z.USER_FAILED);
        this.ai = null;
        this.aq = null;
        this.am = null;
        try {
            V(true);
            this.Z.L();
            this.ak = as.c();
            Handler handler = new Handler();
            AnonymousClass12 anonymousClass12 = new av(this.D) { // from class: com.facetec.sdk.o.12
                AnonymousClass12(Fragment fragment) {
                    super(fragment);
                }

                @Override // com.facetec.sdk.av
                public final void B() throws Exception {
                    o.this.A();
                }
            };
            Class<?> cls = Class.forName(Jg.Wd("~\u0006\"adx)t,\nJWVaI7\"-", (short) (OY.Xd() ^ 32088), (short) (OY.Xd() ^ 19822)));
            Class<?>[] clsArr = {Class.forName(ZO.xd("Vtd01F\u0014)t`\u0011U\u000f\u00159kmv", (short) (C1499aX.Xd() ^ (-21394)), (short) (C1499aX.Xd() ^ (-10310)))), Long.TYPE};
            Object[] objArr = {anonymousClass12, 400L};
            short sXd = (short) (Od.Xd() ^ (-23255));
            short sXd2 = (short) (Od.Xd() ^ (-27024));
            int[] iArr = new int["1X\u0004Cbi,y qd".length()];
            QB qb = new QB("1X\u0004Cbi,y qd");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            com.facetec.sdk.L.V(th);
            a.V(this, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder().append(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.toString()).append(Ig.wd("\u0018%", (short) (C1607wl.Xd() ^ 12364))).append(th.getMessage()).toString());
            Code(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
        }
    }

    @Override // com.facetec.sdk.g
    final void S() {
        M();
        this.aI.Code(this, a.Z.SESSION_TIMEOUT);
        this.ai = null;
        this.aq = null;
        this.am = null;
        try {
            V(false);
            this.Z.L();
            I(400);
        } catch (Throwable th) {
            com.facetec.sdk.L.V(th);
            a.V(this, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder().append(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.toString()).append(": ").append(th.getMessage()).toString());
            Code(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
        }
    }

    protected final void V(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        a.V(this, com.facetec.sdk.V.DEVELOPER_USED_FACESCAN_CALLBACK, "succeed");
        if (FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            bg.B(this, bg.V.SUCCESS);
        } else if (!bg.V) {
            SharedPreferences.Editor editorEdit = bg.B.edit();
            editorEdit.putBoolean("facetecMoveCloserSoundHasBeenPlayed", true);
            editorEdit.apply();
        }
        if (FaceTecSessionActivity.D != null) {
            this.aw = true;
        }
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.23
            final /* synthetic */ FaceTecIDScanNextStep I;

            /* JADX INFO: renamed from: com.facetec.sdk.o$23$5 */
            final class AnonymousClass5 implements Runnable {
                AnonymousClass5() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.Code(faceTecIDScanNextStep);
                }
            }

            AnonymousClass23(FaceTecIDScanNextStep faceTecIDScanNextStep2) {
                faceTecIDScanNextStep = faceTecIDScanNextStep2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.ah != null) {
                    o.this.ah.I(true, FaceTecCustomization.overrideResultScreenSuccessMessage, new Runnable() { // from class: com.facetec.sdk.o.23.5
                        AnonymousClass5() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            o.this.Code(faceTecIDScanNextStep);
                        }
                    });
                }
            }
        });
    }

    @Override // com.facetec.sdk.g
    final void V(String str) {
        if (this.aY) {
            I(this.Q.getStatus(), FaceTecIDScanStatus.CAMERA_ERROR);
        } else {
            B(FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (FaceTecIDScanStatus) null);
        }
        if (str != null) {
            a.V(this, com.facetec.sdk.V.CAMERA_ERROR, "onCameraError with message: ".concat(String.valueOf(str)));
        }
    }

    @Override // com.facetec.sdk.g
    final synchronized void Z() {
        bt.Z(this);
        this.aI.Code(this, a.Z.USER_WAS_SUCCESSFUL);
        this.ai = null;
        this.aq = null;
        this.am = null;
        try {
            cb.Code(this);
            this.au = true;
            this.av = true;
            if (FaceTecSessionActivity.B != null) {
                this.ah = ap.Code(false, this.X);
                if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                    v();
                }
                Handler handler = new Handler();
                AnonymousClass13 anonymousClass13 = new av(this.D) { // from class: com.facetec.sdk.o.13
                    AnonymousClass13(Fragment fragment) {
                        super(fragment);
                    }

                    @Override // com.facetec.sdk.av
                    public final void B() throws Exception {
                        FragmentManager fragmentManager = o.this.getFragmentManager();
                        CX.ud();
                        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                        int i2 = o.this.aL;
                        ap apVar = o.this.ah;
                        CX.ud();
                        fragmentTransactionBeginTransaction.replace(i2, apVar, "Results").addToBackStack("zoom").commitAllowingStateLoss();
                    }
                };
                Class<?> cls = Class.forName(EO.Od("2i\u0012H\\#i,\u0018`\u0019Q\u0019 .T\u0002)", (short) (C1580rY.Xd() ^ (-9452))));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (C1607wl.Xd() ^ 10595);
                int[] iArr = new int["\\RfP\u001cYMYQ\u0017:\\TSEENF".length()];
                QB qb = new QB("\\RfP\u001cYMYQ\u0017:\\TSEENF");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                clsArr[1] = Long.TYPE;
                Object[] objArr = {anonymousClass13, 400L};
                Method method = cls.getMethod(C1593ug.zd("$$)+{\u001e&\u001c5\"\"", (short) (C1633zX.Xd() ^ (-9327)), (short) (C1633zX.Xd() ^ (-23405))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                bg.B(this, bg.V.UPLOADING);
            }
            new F().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (Throwable th) {
            com.facetec.sdk.L.V(th);
            com.facetec.sdk.V v2 = com.facetec.sdk.V.SEVERE_ERROR;
            StringBuilder sbAppend = new StringBuilder().append(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.toString());
            short sXd2 = (short) (ZN.Xd() ^ 19262);
            int[] iArr2 = new int["C(".length()];
            QB qb2 = new QB("C(");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            a.V(this, v2, sbAppend.append(new String(iArr2, 0, i3)).append(th.getMessage()).toString());
            Code(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
        }
    }

    final void Z(boolean z2) throws Throwable {
        this.aH.Z();
        this.bp = true;
        String strB = z2 ? ba.B(x.FINISHED_WITH_SUCCESS) : ba.B(x.FINISHED_WITH_ERROR);
        Handler handler = new Handler();
        Object[] objArr = {new AnonymousClass61(this.ah, z2, strB), 800L};
        Method method = Class.forName(C1561oA.Kd("kyp\u007f}xt?\u0002\u0007B]w\u0006|\u0006\u007f\u000e", (short) (C1607wl.Xd() ^ 16519))).getMethod(C1561oA.Xd("\u0007\u0007\f\u000e^\u0001\t~\u0018\u0005\u0005", (short) (C1580rY.Xd() ^ (-28417))), Class.forName(Wg.Zd("BQ\u000e<'HCtL\u0017\"G^A8\u0015FI", (short) (OY.Xd() ^ 11701), (short) (OY.Xd() ^ 517))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facetec.sdk.g
    final void a() {
        this.aI.Code(this, a.Z.USER_CANCELLED);
        a.V(this, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.USER_CANCELLED.toString());
        B(FaceTecSessionStatus.USER_CANCELLED, (FaceTecIDScanStatus) null);
    }

    @Override // com.facetec.sdk.g
    final synchronized void b() {
        this.aI.Code(this, a.Z.USER_CANCELLED);
        a.V(this, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.USER_CANCELLED.toString());
        B(FaceTecSessionStatus.USER_CANCELLED, (FaceTecIDScanStatus) null);
    }

    @Override // com.facetec.sdk.g
    final synchronized void c() {
        if (this.Code != null) {
            this.Code.removeCallbacks(null);
        }
        if (this.aY) {
            Code(false);
            FaceTecIDScanStatus faceTecIDScanStatus = FaceTecIDScanStatus.USER_CANCELED;
            if (!this.as) {
                B(this.Q.getStatus(), faceTecIDScanStatus);
                return;
            } else {
                this.aI.Code(this, a.Z.USER_CANCELLED);
                ax.Z(new Runnable() { // from class: com.facetec.sdk.o.20
                    private /* synthetic */ FaceTecIDScanStatus I;

                    AnonymousClass20(FaceTecIDScanStatus faceTecIDScanStatus2) {
                        faceTecIDScanStatus = faceTecIDScanStatus2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o oVar = o.this;
                        oVar.B(oVar.Q.getStatus(), faceTecIDScanStatus);
                    }
                });
                return;
            }
        }
        this.aI.Code(this, a.Z.USER_CANCELLED);
        V(false);
        if (this.aa == L.PRE_SESSION_STARTED) {
            this.Z.F();
        } else if (this.aa == L.ZOOM_SESSION_STARTED) {
            this.Z.V(true);
        }
        try {
            I(400);
        } catch (Throwable th) {
            com.facetec.sdk.L.V(th);
            a.V(this, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder("Unknown error: ").append(th.getMessage()).toString());
            B(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
        }
    }

    @Override // com.facetec.sdk.g
    final synchronized void d() {
        a.V(this, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.USER_CANCELLED.toString());
        if (this.Z == null) {
            return;
        }
        this.Z.F();
        this.Z.V(true);
        if (!this.Z.Code((Context) this)) {
            Code(bo.f3044h);
        }
        this.ak.e();
    }

    @Override // com.facetec.sdk.g
    final void e() {
        ai.I();
        bq.B = true;
        P();
    }

    @Override // com.facetec.sdk.g
    final synchronized void f() {
        if (this.aY) {
            I(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, FaceTecIDScanStatus.SUCCESS);
        } else {
            I(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, (FaceTecIDScanStatus) null);
        }
    }

    @Override // com.facetec.sdk.g
    final synchronized void g() {
        Code(false);
        a.V(this, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED.toString());
        if (this.aY) {
            B(this.Q.getStatus(), FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED);
        } else {
            B(FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED, (FaceTecIDScanStatus) null);
        }
    }

    final void h() {
        if (this.ae == null) {
            this.ae = Integer.valueOf(ba.Code(this, FaceTecSDK.V.C.backgroundColor));
        }
        if (this.ad == null) {
            this.ad = Integer.valueOf(ba.Code(this, FaceTecSDK.V.D.backgroundColors));
        }
        if (this.ac == null) {
            this.ac = Integer.valueOf(ba.Code(this, FaceTecSDK.V.S.borderColor));
        }
        runOnUiThread(new AnonymousClass4());
    }

    @Override // com.facetec.sdk.g
    final void i() {
        I(FaceTecSessionStatus.CAMERA_PERMISSION_DENIED, (FaceTecIDScanStatus) null);
    }

    final void j() {
        if (FaceTecSDK.Z == FaceTecSDK.Code.LOW_LIGHT) {
            return;
        }
        FaceTecSDK.Z = FaceTecSDK.Code.LOW_LIGHT;
        ai.B("fnkey_ZOOMSDK_LIGHTINGMODE", 0);
        ai.r();
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.67
            AnonymousClass67() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.n();
                o.this.h();
            }
        });
    }

    final void k() {
        this.ag = false;
        this.f3270bo = true;
        Z(K(), 0.5f, 0);
    }

    final void l() {
        Code(false);
        if (this.Code != null) {
            this.Code.removeCallbacks(null);
        }
        if (!this.as) {
            B(FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (FaceTecIDScanStatus) null);
        } else {
            this.aI.Code(this, a.Z.USER_CANCELLED);
            ax.Z(new Runnable() { // from class: com.facetec.sdk.o.17
                AnonymousClass17() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.B(FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (FaceTecIDScanStatus) null);
                }
            });
        }
    }

    protected final void m() {
        a.V(this, com.facetec.sdk.V.DEVELOPER_USED_FACESCAN_CALLBACK, "retry");
        this.au = false;
        this.av = false;
        this.ax = false;
        if (this.Z != null) {
            this.Z.V(true);
        }
        this.aC = true;
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.25

            /* JADX INFO: renamed from: com.facetec.sdk.o$25$2 */
            final class AnonymousClass2 implements Runnable {
                AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    if (o.this.isFinishing() || !o.this.hasWindowFocus()) {
                        return;
                    }
                    o.this.A();
                }
            }

            AnonymousClass25() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.ah != null) {
                    o.this.ah.I(false, null, new Runnable() { // from class: com.facetec.sdk.o.25.2
                        AnonymousClass2() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            if (o.this.isFinishing() || !o.this.hasWindowFocus()) {
                                return;
                            }
                            o.this.A();
                        }
                    });
                }
            }
        });
    }

    final void n() {
        this.ag = false;
        this.f3270bo = true;
        Z(K(), 0.8f, 0);
    }

    final void o() {
        this.ag = false;
        this.bh = false;
        ValueAnimator valueAnimator = this.bg;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.bg.removeAllUpdateListeners();
        }
    }

    @Override // android.app.Activity
    public synchronized void onBackPressed() {
        if (u()) {
            return;
        }
        if (H()) {
            if (this.aY) {
                this.f3291w.setEnabled(false, true);
                this.f3290v.setEnabled(false, true);
                this.f3284p.setEnabled(false, true);
                this.f3286r.setEnabled(false, true);
                I(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, FaceTecIDScanStatus.USER_CANCELED);
                return;
            }
            if (this.ao != null) {
                I(this.ao, (FaceTecIDScanStatus) null);
                return;
            }
            if (Code()) {
                B(false);
                I(FaceTecSessionStatus.CAMERA_PERMISSION_DENIED, (FaceTecIDScanStatus) null);
            } else if (this.ak != null && getFragmentManager().findFragmentByTag("RetryZoom") != null) {
                ((e) getFragmentManager().findFragmentByTag("RetryZoom")).Code();
            } else if (this.al == null || getFragmentManager().findFragmentByTag("PreEnroll") == null) {
                c();
            } else {
                a();
            }
        }
    }

    @Override // android.app.Activity
    protected synchronized void onCreate(Bundle bundle) {
        Object obj;
        int identifier;
        int identifier2;
        int identifier3;
        int identifier4;
        super.onCreate(null);
        if (bundle != null) {
            setResult(0);
            finish();
            return;
        }
        bb.B(this);
        ba.aR();
        if (FaceTecSessionActivity.B == null) {
            bu.I(Wg.vd("#=>?5EB1:GF;HF\u00189A5A3EIn;:77a+-f2\u001e1)\u001d)%#],\u001d'\u001aX,\u001f\u001bL\u000f\u001a\u0018$$!#\b\u0018\u0012\u0014Hm\b\t\u0003p\u0001}tdjLx\u0007xs\u000e}X\u0005qXl\u007f\u007fswajwvkxv/4+*$(", (short) (ZN.Xd() ^ 20532)));
            setResult(0);
            finish();
            return;
        }
        this.aI = new S();
        ad.B();
        bg.B(this);
        a.V(this, com.facetec.sdk.V.FULL_SESSION_START, null);
        Window window = getWindow();
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        short sXd = (short) (Od.Xd() ^ (-18797));
        short sXd2 = (short) (Od.Xd() ^ (-25665));
        int[] iArr = new int["_k`mib\\%YdbgW_d\u001d1\\Z_Oa\\".length()];
        QB qb = new QB("_k`mib\\%YdbgW_d\u001d1\\Z_Oa\\");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(yg.hg.Vd("\u000b\b\u0016a\u0010\u000f\n\u0006~{\u000e\u0002\u0007\u0005^\u0003y\u0002", (short) (C1499aX.Xd() ^ (-29822)), (short) (C1499aX.Xd() ^ (-26582))), new Class[0]);
        o oVar = this;
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(oVar, objArr);
            short sXd3 = (short) (C1499aX.Xd() ^ (-31893));
            int[] iArr2 = new int["#/$1-& h\u001d(&+\u001b#(`\"\u001e]o\u001e\u001d\u0018\u0014\r\n\u001c\u0010\u0015\u0013l\u0011\b\u0010".length()];
            QB qb2 = new QB("#/$1-& h\u001d(&+\u001b#(`\"\u001e]o\u001e\u001d\u0018\u0014\r\n\u001c\u0010\u0015\u0013l\u0011\b\u0010");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            String str = new String(iArr2, 0, i3);
            short sXd4 = (short) (C1633zX.Xd() ^ (-17254));
            int[] iArr3 = new int["\u0007\f\u0004\t\u0018".length()];
            QB qb3 = new QB("\u0007\f\u0004\t\u0018");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                i4++;
            }
            String str2 = new String(iArr3, 0, i4);
            try {
                Class<?> cls = Class.forName(str);
                Field field = 1 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            boolean z2 = (((Integer) obj).intValue() & 2) != 0;
            boolean booleanExtra = oVar.getIntent().getBooleanExtra(C1561oA.Yd("VlmlSEM1hnyhjuo^qp\u0004\u0002uh{\u0002x\u0005\u000e", (short) (Od.Xd() ^ (-21395))), false);
            if (!z2 && !booleanExtra) {
                oVar.getWindow().addFlags(8192);
            }
            if (FaceTecCustomization.activityThemeId != 0) {
                oVar.setTheme(FaceTecCustomization.activityThemeId);
            }
            Intent intent = oVar.getIntent();
            short sXd5 = (short) (FB.Xd() ^ 24027);
            short sXd6 = (short) (FB.Xd() ^ 12380);
            int[] iArr4 = new int["\u001a\u0010\u0011\u0010Q\u0018\u000b\u0019\u001e\u000e\u001c}\u0011 !\u0018\u001f\u001f\u0006\"\u001f\u001a$".length()];
            QB qb4 = new QB("\u001a\u0010\u0011\u0010Q\u0018\u000b\u0019\u001e\u000e\u001c}\u0011 !\u0018\u001f\u001f\u0006\"\u001f\u001a$");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) + sXd6);
                i5++;
            }
            String stringExtra = intent.getStringExtra(new String(iArr4, 0, i5));
            oVar.F = stringExtra;
            if (stringExtra == null) {
                oVar.F = "";
            }
            oVar.setContentView(R.layout.facetec_main_activity);
            oVar.aL = R.id.signupContainer;
            oVar.f3274f = oVar.findViewById(R.id.zoomFrameShadowView);
            oVar.C = (RelativeLayout) oVar.findViewById(R.id.outerContainer);
            oVar.f3268a = (RelativeLayout) oVar.findViewById(R.id.faceScanCameraContainer);
            oVar.f3271c = (RelativeLayout) oVar.findViewById(R.id.faceScanCameraTransitionView);
            oVar.f3273e = (RelativeLayout) oVar.findViewById(R.id.faceScanCameraLayout);
            oVar.f3269b = (RelativeLayout) oVar.findViewById(R.id.signupContainer);
            oVar.f3272d = (RelativeLayout) oVar.findViewById(R.id.borderCover);
            oVar.f3278j = (RelativeLayout) oVar.findViewById(R.id.subZoomFrame);
            oVar.aO = (LinearLayout) oVar.findViewById(R.id.brandingLogoContainer);
            oVar.findViewById(R.id.zoomSessionLayout);
            oVar.f3283o = (RelativeLayout) oVar.findViewById(R.id.idScanTypeLayout);
            oVar.f3279k = (RelativeLayout) oVar.findViewById(R.id.idScanCameraLayout);
            oVar.f3282n = (h) oVar.findViewById(R.id.idCaptureFrameView);
            oVar.f3281m = (TextView) oVar.findViewById(R.id.idScanReviewInstructionsText);
            oVar.f3285q = (TextView) oVar.findViewById(R.id.idScanCaptureInstructionsText);
            oVar.f3287s = (TextView) oVar.findViewById(R.id.tapToFocusMessageText);
            oVar.f3288t = (ImageView) oVar.findViewById(R.id.reviewImageView);
            oVar.f3286r = (bf) oVar.findViewById(R.id.takePictureButton);
            oVar.f3284p = (bf) oVar.findViewById(R.id.retakePictureButton);
            oVar.f3290v = (bf) oVar.findViewById(R.id.acceptPictureButton);
            oVar.f3289u = (RelativeLayout) oVar.findViewById(R.id.shutterEffectContainer);
            oVar.f3292x = (LinearLayout) oVar.findViewById(R.id.reviewButtonsContainer);
            oVar.G = (ImageView) oVar.findViewById(R.id.flashButton);
            oVar.f3276h = (RelativeLayout) oVar.findViewById(R.id.idScanLayout);
            oVar.O = (RelativeLayout) oVar.findViewById(R.id.idScanCameraContainer);
            oVar.f3277i = (RelativeLayout) oVar.findViewById(R.id.idScanInterfaceLayout);
            oVar.f3293y = (ImageView) oVar.findViewById(R.id.idScanCancelButton);
            oVar.f3291w = (bf) oVar.findViewById(R.id.idScanContinueButton);
            oVar.aN = (TextView) oVar.findViewById(R.id.idScanSelectionHeader);
            oVar.aR = (ImageView) oVar.findViewById(R.id.idScanSelectionBrandingImage);
            oVar.J = (LinearLayout) oVar.findViewById(R.id.idScanSelectionButtonLayout);
            oVar.K = (RelativeLayout) oVar.findViewById(R.id.idScanInterfaceButtonLayout);
            oVar.aZ = (RelativeLayout) oVar.findViewById(R.id.idScanTypeLayoutBackground);
            oVar.N = (RelativeLayout) oVar.findViewById(R.id.idScanTypeLayoutContent);
            oVar.aT = (LinearLayout) oVar.findViewById(R.id.idScanSelectionBrandingImageLayout);
            oVar.f3280l = (RelativeLayout) oVar.findViewById(R.id.idScanCameraTransitionView);
            oVar.aU = (LinearLayout) oVar.findViewById(R.id.idScanSelectionDocumentImageLayout);
            oVar.aQ = (ImageView) oVar.findViewById(R.id.idScanSelectionDocumentImage);
            oVar.A = (RelativeLayout) oVar.findViewById(R.id.idScanInstructionsContainer);
            oVar.f3294z = (LinearLayout) oVar.findViewById(R.id.idScanSelectionMainLayout);
            oVar.H = (k) oVar.findViewById(R.id.idScanFocusAnimationView);
            try {
                try {
                    try {
                        FaceTecSDK.setCustomization(ba.V(FaceTecSDK.V));
                        bn.I = FaceTecSDK.V.D.subtextFont;
                        FaceTecCustomization faceTecCustomization = FaceTecSDK.V;
                        bn.Code = FaceTecSDK.V.D.headerFont;
                        n.V(oVar);
                        ai.y(FaceTecSDK.V.f2854e);
                        j.Z();
                        oVar.V = (RelativeLayout) oVar.findViewById(R.id.backgroundCover);
                        oVar.V.setAlpha(0.0f);
                        if (FaceTecSDK.V.S.backgroundColor == 0) {
                            oVar.V.setBackgroundColor(oVar.getResources().getColor(R.color.facetec_outline_shadow_dark));
                        } else {
                            oVar.V.setBackgroundColor(FaceTecSDK.V.S.backgroundColor);
                        }
                        oVar.I = oVar.findViewById(R.id.backgroundColor);
                        ba.V(oVar.findViewById(R.id.backgroundColor));
                        oVar.Code = new Handler();
                        int iB = ba.B(oVar);
                        int I2 = ba.I(oVar);
                        int iCode = FaceTecSDK.V.C.brandingImage != 0 ? FaceTecSDK.V.C.brandingImage : ba.Code(oVar, Jg.Wd("1 \u0019,.\u0018%\u0019(-,\u001c\u001a\u0014\u0012'\r\u000b!\u0011\n", (short) (OY.Xd() ^ 11796), (short) (OY.Xd() ^ 21072)), R.drawable.facetec_internal_your_app_logo);
                        int iCode2 = FaceTecSDK.V.f2853d.customImage != 0 ? FaceTecSDK.V.f2853d.customImage : ba.Code(oVar, ZO.xd("GE\u0012L\n\u0007o\r\u0014\u0005P29`", (short) (C1580rY.Xd() ^ (-31889)), (short) (C1580rY.Xd() ^ (-24952))), R.drawable.facetec_internal_cancel);
                        boolean z3 = FaceTecSDK.V.f2853d.V != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED && iCode2 == 0;
                        if (FaceTecSessionActivity.B != null && (I2 == 0 || iCode == 0)) {
                            z3 = true;
                        }
                        if (iB == 0) {
                            z3 = true;
                        }
                        if (z3) {
                            oVar.B(FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES, (FaceTecIDScanStatus) null);
                            return;
                        }
                        FaceTecSDK.V.D.retryScreenIdealImage = iB;
                        FaceTecSDK.V.D.cameraPermissionsScreenImage = I2;
                        FaceTecSDK.V.C.brandingImage = iCode;
                        FaceTecSDK.V.f2853d.customImage = iCode2;
                        if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM && FaceTecSDK.V.f2853d.Z != null) {
                            ImageView imageView = (ImageView) oVar.findViewById(R.id.customLocationBackButton);
                            oVar.f3275g = imageView;
                            imageView.setAlpha(0.0f);
                            oVar.f3275g.setVisibility(0);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart((int) ce.V(FaceTecSDK.V.f2853d.Z.left));
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ce.V(FaceTecSDK.V.f2853d.Z.top);
                            ((ViewGroup.LayoutParams) layoutParams).width = (int) ce.V(FaceTecSDK.V.f2853d.Z.right);
                            ((ViewGroup.LayoutParams) layoutParams).height = (int) ce.V(FaceTecSDK.V.f2853d.Z.bottom);
                            oVar.f3275g.setLayoutParams(layoutParams);
                            if (FaceTecSDK.V.f2853d.customImage != 0) {
                                oVar.f3275g.setImageDrawable(ContextCompat.getDrawable(oVar, ba.ay()));
                            }
                            oVar.f3275g.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.o.1
                                AnonymousClass1() {
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Callback.onClick_enter(view);
                                    try {
                                        o.this.f3275g.setAlpha(1.0f);
                                        o.this.onBackPressed();
                                        o.this.f3275g.setEnabled(false);
                                    } finally {
                                        Callback.onClick_exit();
                                    }
                                }
                            });
                            oVar.f3275g.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.o.3
                                AnonymousClass3() {
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    if (motionEvent.getAction() == 0) {
                                        o.this.f3275g.setAlpha(0.4f);
                                    } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > o.this.f3275g.getWidth() + o.this.f3275g.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > o.this.f3275g.getHeight() + o.this.f3275g.getTop() + 10) {
                                        o.this.f3275g.setAlpha(1.0f);
                                    } else if (motionEvent.getAction() == 1) {
                                        o.this.f3275g.performClick();
                                    }
                                    return true;
                                }
                            });
                        }
                        if (FaceTecSessionActivity.D != null) {
                            if (FaceTecSDK.V.Code.selectionScreenBrandingImage != 0) {
                                identifier = FaceTecSDK.V.Code.selectionScreenBrandingImage;
                            } else {
                                Resources resources = oVar.getResources();
                                String strUd = C1626yg.Ud("\u0011ubH\u0006xc\u001e!]K\u001d\"nBKmt>\t%\u001c;\u000f\u00123:ix+", (short) (Od.Xd() ^ (-29331)), (short) (Od.Xd() ^ (-22771)));
                                String strWd = Ig.wd("+h\n;]\u0002,L", (short) (C1580rY.Xd() ^ (-24774)));
                                Class<?> cls2 = Class.forName(EO.Od("=\u001b#PM\u0005[\u0005u%\"Ffy7O)G\u001fl\u0018wQ", (short) (C1607wl.Xd() ^ 18435)));
                                Class<?>[] clsArr = new Class[0];
                                Object[] objArr2 = new Object[0];
                                short sXd7 = (short) (C1633zX.Xd() ^ (-31685));
                                int[] iArr5 = new int["VSa<LMTINK3EPG".length()];
                                QB qb5 = new QB("VSa<LMTINK3EPG");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(sXd7 + sXd7 + sXd7 + i6 + xuXd5.CK(iKK5));
                                    i6++;
                                }
                                Method method2 = cls2.getMethod(new String(iArr5, 0, i6), clsArr);
                                try {
                                    method2.setAccessible(true);
                                    if (resources.getIdentifier(strUd, strWd, (String) method2.invoke(oVar, objArr2)) != 0) {
                                        Resources resources2 = oVar.getResources();
                                        String strZd = C1593ug.zd("\u0004\u007f\u0003\u0006\u0016\b\u0007\u0004\b\u0019\t\u0017\u000e\u0014\u001a\u0014\r\u001b\u001f\u0018!\u0012\u001d\u0019\u0015\u001a \u001e\u001d&", (short) (ZN.Xd() ^ 6305), (short) (ZN.Xd() ^ 27942));
                                        String strOd = C1561oA.od("?L:O88A9", (short) (OY.Xd() ^ 26744));
                                        Object[] objArr3 = new Object[0];
                                        Method method3 = Class.forName(C1561oA.Kd("Yg^mkfb-cppwisz5Kxx\u007fq\u0006\u0003", (short) (C1580rY.Xd() ^ (-6722)))).getMethod(Wg.Zd("\u0001;l9\r'\"V\u0001e\u0013TCs", (short) (OY.Xd() ^ 15380), (short) (OY.Xd() ^ 11667)), new Class[0]);
                                        oVar = oVar;
                                        try {
                                            method3.setAccessible(true);
                                            identifier = resources2.getIdentifier(strZd, strOd, (String) method3.invoke(oVar, objArr3));
                                        } catch (InvocationTargetException e2) {
                                            throw e2.getCause();
                                        }
                                    } else {
                                        Resources resources3 = oVar.getResources();
                                        short sXd8 = (short) (C1607wl.Xd() ^ 23125);
                                        int[] iArr6 = new int["\n\u0006\t\f\u001c\u000e\r\n\u0015\u001b\"\u0014\"\u001f\u0013\u001f\u0013\u0017(\u0018&\u001d#)#\u001c*.'0!,($)/-,5".length()];
                                        QB qb6 = new QB("\n\u0006\t\f\u001c\u000e\r\n\u0015\u001b\"\u0014\"\u001f\u0013\u001f\u0013\u0017(\u0018&\u001d#)#\u001c*.'0!,($)/-,5");
                                        int i7 = 0;
                                        while (qb6.YK()) {
                                            int iKK6 = qb6.KK();
                                            Xu xuXd6 = Xu.Xd(iKK6);
                                            iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (sXd8 + i7));
                                            i7++;
                                        }
                                        String str3 = new String(iArr6, 0, i7);
                                        short sXd9 = (short) (C1633zX.Xd() ^ (-19513));
                                        int[] iArr7 = new int["\b\u0015\u0003\u0018\t\t\u0012\n".length()];
                                        QB qb7 = new QB("\b\u0015\u0003\u0018\t\t\u0012\n");
                                        int i8 = 0;
                                        while (qb7.YK()) {
                                            int iKK7 = qb7.KK();
                                            Xu xuXd7 = Xu.Xd(iKK7);
                                            iArr7[i8] = xuXd7.fK((sXd9 ^ i8) + xuXd7.CK(iKK7));
                                            i8++;
                                        }
                                        String str4 = new String(iArr7, 0, i8);
                                        Object[] objArr4 = new Object[0];
                                        Method method4 = Class.forName(Qg.kd("y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v", (short) (C1580rY.Xd() ^ (-4216)), (short) (C1580rY.Xd() ^ (-18642)))).getMethod(yg.hg.Vd("DAO*:;B7<9!3>5", (short) (OY.Xd() ^ 12847), (short) (OY.Xd() ^ 935)), new Class[0]);
                                        oVar = oVar;
                                        try {
                                            method4.setAccessible(true);
                                            identifier = resources3.getIdentifier(str3, str4, (String) method4.invoke(oVar, objArr4));
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e4) {
                                    throw e4.getCause();
                                }
                            }
                            if (FaceTecSDK.V.Code.selectionScreenDocumentImage != 0) {
                                identifier2 = FaceTecSDK.V.Code.selectionScreenDocumentImage;
                            } else {
                                Resources resources4 = oVar.getResources();
                                String strUd2 = C1561oA.ud("LFGHVFC>BL?PG>FK", (short) (C1633zX.Xd() ^ (-15699)));
                                short sXd10 = (short) (Od.Xd() ^ (-20526));
                                int[] iArr8 = new int["cp^s\\\\e]".length()];
                                QB qb8 = new QB("cp^s\\\\e]");
                                int i9 = 0;
                                while (qb8.YK()) {
                                    int iKK8 = qb8.KK();
                                    Xu xuXd8 = Xu.Xd(iKK8);
                                    iArr8[i9] = xuXd8.fK(xuXd8.CK(iKK8) - (sXd10 ^ i9));
                                    i9++;
                                }
                                String str5 = new String(iArr8, 0, i9);
                                Object[] objArr5 = new Object[0];
                                Method method5 = Class.forName(C1561oA.Yd("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013", (short) (OY.Xd() ^ 26755))).getMethod(Xg.qd("\f\u000b\u001bw\n\r\u0016\r\u0014\u0013|\u0011\u001e\u0017", (short) (Od.Xd() ^ (-12232)), (short) (Od.Xd() ^ (-28722))), new Class[0]);
                                o oVar2 = oVar;
                                try {
                                    method5.setAccessible(true);
                                    if (resources4.getIdentifier(strUd2, str5, (String) method5.invoke(oVar2, objArr5)) != 0) {
                                        Resources resources5 = oVar2.getResources();
                                        short sXd11 = (short) (Od.Xd() ^ (-3570));
                                        short sXd12 = (short) (Od.Xd() ^ (-31846));
                                        int[] iArr9 = new int["\u0010Z=^OX9V;nC\u0001ZjRy".length()];
                                        QB qb9 = new QB("\u0010Z=^OX9V;nC\u0001ZjRy");
                                        int i10 = 0;
                                        while (qb9.YK()) {
                                            int iKK9 = qb9.KK();
                                            Xu xuXd9 = Xu.Xd(iKK9);
                                            iArr9[i10] = xuXd9.fK(xuXd9.CK(iKK9) - ((i10 * sXd12) ^ sXd11));
                                            i10++;
                                        }
                                        String str6 = new String(iArr9, 0, i10);
                                        String strXd = ZO.xd("@']b5\u0012\u0012,", (short) (OY.Xd() ^ 27898), (short) (OY.Xd() ^ 13286));
                                        Object[] objArr6 = new Object[0];
                                        Method method6 = Class.forName(C1626yg.Ud("X\u0006\u00190vM)r_9Jw(;bi$\u001a3F\u0003\rn", (short) (OY.Xd() ^ 28189), (short) (OY.Xd() ^ 8233))).getMethod(Ig.wd("V#D;,ya\u001f~{b\u0018yk", (short) (FB.Xd() ^ 16383)), new Class[0]);
                                        oVar = oVar2;
                                        try {
                                            method6.setAccessible(true);
                                            identifier2 = resources5.getIdentifier(str6, strXd, (String) method6.invoke(oVar, objArr6));
                                        } catch (InvocationTargetException e5) {
                                            throw e5.getCause();
                                        }
                                    } else {
                                        Resources resources6 = oVar2.getResources();
                                        String strOd2 = EO.Od("\u001faw\u001fx'~d*`fs080\u001cSP6@\rc7F\u0017", (short) (C1580rY.Xd() ^ (-28808)));
                                        String strQd = C1561oA.Qd("\u0016#\u0011&\u000f\u000f\u0018\u0010", (short) (Od.Xd() ^ (-10156)));
                                        Class<?> cls3 = Class.forName(C1593ug.zd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74", (short) (C1499aX.Xd() ^ (-14015)), (short) (C1499aX.Xd() ^ (-24921))));
                                        Class<?>[] clsArr2 = new Class[0];
                                        Object[] objArr7 = new Object[0];
                                        short sXd13 = (short) (OY.Xd() ^ 681);
                                        int[] iArr10 = new int["<9G\"23:/41\u0019+6-".length()];
                                        QB qb10 = new QB("<9G\"23:/41\u0019+6-");
                                        int i11 = 0;
                                        while (qb10.YK()) {
                                            int iKK10 = qb10.KK();
                                            Xu xuXd10 = Xu.Xd(iKK10);
                                            iArr10[i11] = xuXd10.fK(sXd13 + sXd13 + i11 + xuXd10.CK(iKK10));
                                            i11++;
                                        }
                                        Method method7 = cls3.getMethod(new String(iArr10, 0, i11), clsArr2);
                                        oVar = oVar2;
                                        try {
                                            method7.setAccessible(true);
                                            identifier2 = resources6.getIdentifier(strOd2, strQd, (String) method7.invoke(oVar, objArr7));
                                        } catch (InvocationTargetException e6) {
                                            throw e6.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e7) {
                                    throw e7.getCause();
                                }
                            }
                            if (FaceTecSDK.V.Code.activeTorchButtonImage != 0) {
                                identifier3 = FaceTecSDK.V.Code.activeTorchButtonImage;
                            } else {
                                Resources resources7 = oVar.getResources();
                                String strKd = C1561oA.Kd("d`cfvhgdgj|r\u0001pk\u0002}\u0002sy", (short) (ZN.Xd() ^ 10918));
                                String strZd2 = Wg.Zd("\u007fY%s>\u0018Nr", (short) (ZN.Xd() ^ 23529), (short) (ZN.Xd() ^ 26101));
                                short sXd14 = (short) (C1499aX.Xd() ^ (-8152));
                                int[] iArr11 = new int["\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB".length()];
                                QB qb11 = new QB("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB");
                                int i12 = 0;
                                while (qb11.YK()) {
                                    int iKK11 = qb11.KK();
                                    Xu xuXd11 = Xu.Xd(iKK11);
                                    iArr11[i12] = xuXd11.fK(xuXd11.CK(iKK11) - (sXd14 + i12));
                                    i12++;
                                }
                                Object[] objArr8 = new Object[0];
                                Method method8 = Class.forName(new String(iArr11, 0, i12)).getMethod(Wg.vd("\u001b\u001a&\u0003\u0019\u001c!\u0018#\"\b\u001c-&", (short) (FB.Xd() ^ 30894)), new Class[0]);
                                o oVar3 = oVar;
                                try {
                                    method8.setAccessible(true);
                                    if (resources7.getIdentifier(strKd, strZd2, (String) method8.invoke(oVar3, objArr8)) != 0) {
                                        Resources resources8 = oVar3.getResources();
                                        String strKd2 = Qg.kd("ystu\u0004spklm}q}kdxrtdh", (short) (ZN.Xd() ^ 3524), (short) (ZN.Xd() ^ 20281));
                                        String strVd = yg.hg.Vd("+8&;$$-%", (short) (C1633zX.Xd() ^ (-13988)), (short) (C1633zX.Xd() ^ (-27871)));
                                        short sXd15 = (short) (C1633zX.Xd() ^ (-28729));
                                        int[] iArr12 = new int["-9.;70*r'205%-2j~*(-\u001d/*".length()];
                                        QB qb12 = new QB("-9.;70*r'205%-2j~*(-\u001d/*");
                                        int i13 = 0;
                                        while (qb12.YK()) {
                                            int iKK12 = qb12.KK();
                                            Xu xuXd12 = Xu.Xd(iKK12);
                                            iArr12[i13] = xuXd12.fK(sXd15 + i13 + xuXd12.CK(iKK12));
                                            i13++;
                                        }
                                        Object[] objArr9 = new Object[0];
                                        Method method9 = Class.forName(new String(iArr12, 0, i13)).getMethod(C1561oA.yd("\u0013\u0012\"~\u0011\u0014\u001d\u0014\u000b\ns\b\u0015\u000e", (short) (FB.Xd() ^ 30283)), new Class[0]);
                                        oVar = oVar3;
                                        try {
                                            method9.setAccessible(true);
                                            identifier3 = resources8.getIdentifier(strKd2, strVd, (String) method9.invoke(oVar, objArr9));
                                        } catch (InvocationTargetException e8) {
                                            throw e8.getCause();
                                        }
                                    } else {
                                        Resources resources9 = oVar3.getResources();
                                        String strYd = C1561oA.Yd("4036F874?EL>LI=I=@CUKYIDZVZLR", (short) (C1499aX.Xd() ^ (-8360)));
                                        String strQd2 = Xg.qd(".=-D/1<6", (short) (FB.Xd() ^ 15533), (short) (FB.Xd() ^ 13813));
                                        Object[] objArr10 = new Object[0];
                                        Method method10 = Class.forName(Jg.Wd("<~r8*\u0016L\u000f:uqq\u0014\u0016\u0012\u0003\r3edK\u0016\u0007", (short) (ZN.Xd() ^ 4237), (short) (ZN.Xd() ^ 5253))).getMethod(ZO.xd(" \u0016k\u0006O\u00039]jsh?d3", (short) (C1633zX.Xd() ^ (-21247)), (short) (C1633zX.Xd() ^ (-9880))), new Class[0]);
                                        oVar = oVar3;
                                        try {
                                            method10.setAccessible(true);
                                            identifier3 = resources9.getIdentifier(strYd, strQd2, (String) method10.invoke(oVar, objArr10));
                                        } catch (InvocationTargetException e9) {
                                            throw e9.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e10) {
                                    throw e10.getCause();
                                }
                            }
                            if (FaceTecSDK.V.Code.inactiveTorchButtonImage != 0) {
                                identifier4 = FaceTecSDK.V.Code.inactiveTorchButtonImage;
                            } else {
                                Resources resources10 = oVar.getResources();
                                String strUd3 = C1626yg.Ud("+\u0016\u0017(F^'4I\u0004AoUhtR\u0013p;9SG", (short) (C1580rY.Xd() ^ (-26603)), (short) (C1580rY.Xd() ^ (-13837)));
                                String strWd2 = Ig.wd("+\tICU\u00024T", (short) (OY.Xd() ^ 31287));
                                Object[] objArr11 = new Object[0];
                                Method method11 = Class.forName(EO.Od("\fP*\u0013\n8IM%0'\u00154AUwA\n##VDX", (short) (C1607wl.Xd() ^ 29437))).getMethod(C1561oA.Qd("+(6\u0011!\")\u001e# \b\u001a%\u001c", (short) (Od.Xd() ^ (-16067))), new Class[0]);
                                o oVar4 = oVar;
                                try {
                                    method11.setAccessible(true);
                                    if (resources10.getIdentifier(strUd3, strWd2, (String) method11.invoke(oVar4, objArr11)) != 0) {
                                        Resources resources11 = oVar4.getResources();
                                        String strZd3 = C1593ug.zd("WSVYi[ZWbh\\_qgue`vrvhn", (short) (C1580rY.Xd() ^ (-5721)), (short) (C1580rY.Xd() ^ (-6808)));
                                        String strOd3 = C1561oA.od("y\u0007t\nrr{s", (short) (ZN.Xd() ^ 1200));
                                        Object[] objArr12 = new Object[0];
                                        Method method12 = Class.forName(C1561oA.Kd("\u001a(\u001f.,'#m$118*4;u\f99@2FC", (short) (C1607wl.Xd() ^ 23847))).getMethod(Wg.Zd("0B\u0017'uH\u0012H\u0010NL\u001ce\u0012", (short) (ZN.Xd() ^ 19258), (short) (ZN.Xd() ^ 28817)), new Class[0]);
                                        oVar = oVar4;
                                        try {
                                            method12.setAccessible(true);
                                            identifier4 = resources11.getIdentifier(strZd3, strOd3, (String) method12.invoke(oVar, objArr12));
                                        } catch (InvocationTargetException e11) {
                                            throw e11.getCause();
                                        }
                                    } else {
                                        Resources resources12 = oVar4.getResources();
                                        String strXd2 = C1561oA.Xd("\\X[^n`_\\gmtftqeqepvjm\u007fu\u0004sn\u0005\u0001\u0005v|", (short) (C1499aX.Xd() ^ (-20501)));
                                        short sXd16 = (short) (C1607wl.Xd() ^ 15753);
                                        int[] iArr13 = new int["4C3J-/:4".length()];
                                        QB qb13 = new QB("4C3J-/:4");
                                        int i14 = 0;
                                        while (qb13.YK()) {
                                            int iKK13 = qb13.KK();
                                            Xu xuXd13 = Xu.Xd(iKK13);
                                            iArr13[i14] = xuXd13.fK((sXd16 ^ i14) + xuXd13.CK(iKK13));
                                            i14++;
                                        }
                                        String str7 = new String(iArr13, 0, i14);
                                        Object[] objArr13 = new Object[0];
                                        Method method13 = Class.forName(Qg.kd("8D9FB;5}2=;@08=u\n538(:5", (short) (C1499aX.Xd() ^ (-6180)), (short) (C1499aX.Xd() ^ (-14421)))).getMethod(yg.hg.Vd("C@N)9:A6;8 2=4", (short) (ZN.Xd() ^ 22015), (short) (ZN.Xd() ^ 4010)), new Class[0]);
                                        oVar = oVar4;
                                        try {
                                            method13.setAccessible(true);
                                            identifier4 = resources12.getIdentifier(strXd2, str7, (String) method13.invoke(oVar, objArr13));
                                        } catch (InvocationTargetException e12) {
                                            throw e12.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e13) {
                                    throw e13.getCause();
                                }
                            }
                            if (identifier3 == 0 || identifier4 == 0) {
                                oVar.B(FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES, (FaceTecIDScanStatus) null);
                                return;
                            } else {
                                FaceTecSDK.V.Code.selectionScreenDocumentImage = identifier2;
                                FaceTecSDK.V.Code.selectionScreenBrandingImage = identifier;
                                FaceTecSDK.V.Code.activeTorchButtonImage = identifier3;
                                FaceTecSDK.V.Code.inactiveTorchButtonImage = identifier4;
                            }
                        }
                        FaceTecSDKStatus status = FaceTecSDK.getStatus(oVar);
                        if (status != FaceTecSDKStatus.INITIALIZED) {
                            switch (AnonymousClass63.Z[status.ordinal()]) {
                                case 1:
                                    a.V(oVar, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID.toString());
                                    oVar.B(FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID, (FaceTecIDScanStatus) null);
                                    return;
                                case 2:
                                    a.V(oVar, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED.toString());
                                    oVar.B(FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED, (FaceTecIDScanStatus) null);
                                    return;
                                case 3:
                                    a.V(oVar, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.GRACE_PERIOD_EXCEEDED.toString());
                                    oVar.B(FaceTecSessionStatus.GRACE_PERIOD_EXCEEDED, (FaceTecIDScanStatus) null);
                                    return;
                                case 4:
                                    a.V(oVar, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.LOCKED_OUT.toString());
                                    oVar.B(FaceTecSessionStatus.LOCKED_OUT, (FaceTecIDScanStatus) null);
                                    return;
                                case 5:
                                    a.V(oVar, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.ENCRYPTION_KEY_INVALID.toString());
                                    oVar.B(FaceTecSessionStatus.ENCRYPTION_KEY_INVALID, (FaceTecIDScanStatus) null);
                                    return;
                                case 6:
                                    a.V(oVar, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED.toString());
                                    oVar.B(FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED, (FaceTecIDScanStatus) null);
                                    return;
                                case 7:
                                    a.V(oVar, com.facetec.sdk.V.NON_FATAL_ERROR, FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED.toString());
                                    oVar.B(FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED, (FaceTecIDScanStatus) null);
                                    return;
                                default:
                                    bu.I(new StringBuilder(C1561oA.ud("\u000b6;1(1h5_22\u001e./Y,\u001d*)\u001e#!Q(\u0019#\u0016L\u001f\u001f\u000b\u001d\u001d\u001a_D", (short) (ZN.Xd() ^ 5654))).append(status.name()).toString());
                                    a.V(oVar, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder(C1561oA.yd("\u0011<E;.7r?uHL8DEsF#03()'[2/90f55%7c`*\u000f", (short) (C1633zX.Xd() ^ (-24546)))).append(status.name()).toString());
                                    oVar.B(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
                                    return;
                            }
                        }
                        ai.a(n.C(), n.I);
                        oVar.Y = (ImageView) oVar.findViewById(R.id.brandingLogoBottom);
                        oVar.f3278j.setAlpha(0.0f);
                        if (FaceTecSDK.V.C.brandingImage != 0 && FaceTecSDK.V.C.showBrandingImage) {
                            oVar.Y.setImageDrawable(ContextCompat.getDrawable(oVar, FaceTecSDK.V.C.brandingImage));
                            oVar.Y.setVisibility(0);
                            if ((oVar.getResources().getConfiguration().screenLayout & 15) >= 3) {
                                oVar.aO.setWeightSum(1.0f);
                                oVar.Y.setMaxHeight((int) ce.V(50));
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) oVar.Y.getLayoutParams();
                                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) ce.V(ba.B);
                                layoutParams2.gravity = 48;
                                oVar.Y.setLayoutParams(layoutParams2);
                                oVar.Y.requestLayout();
                                oVar.aO.requestLayout();
                            }
                        }
                        View viewFindViewById = oVar.findViewById(R.id.overlayBackgroundView);
                        oVar.af = viewFindViewById;
                        viewFindViewById.setAlpha(0.0f);
                        ba.Z(oVar.af);
                        if (FaceTecSDK.V.vocalGuidanceCustomization.mode != FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
                            oVar.af.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.o.5
                                AnonymousClass5() {
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    if (motionEvent.getAction() == 1) {
                                        if (o.this.getFragmentManager().findFragmentByTag("PreEnroll") != null) {
                                            e eVar = (e) o.this.getFragmentManager().findFragmentByTag("PreEnroll");
                                            if (eVar.I == null || p.f3295c) {
                                                return true;
                                            }
                                            if (eVar.I.isEnabled()) {
                                                bg.B(o.this, bg.V.GET_READY_PRESS_BUTTON_TAPPING);
                                            } else {
                                                bg.B(o.this, bg.V.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                                            }
                                        } else if (o.this.getFragmentManager().findFragmentByTag("RetryZoom") != null) {
                                            e eVar2 = (e) o.this.getFragmentManager().findFragmentByTag("RetryZoom");
                                            if (eVar2.I == null || as.f2933j) {
                                                return true;
                                            }
                                            if (eVar2.I.isEnabled()) {
                                                bg.B(o.this, bg.V.GET_READY_PRESS_BUTTON_TAPPING);
                                            } else if (((as) eVar2).f2936d == 1) {
                                                bg.B(o.this, bg.V.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                                            }
                                        } else if (o.this.getFragmentManager().findFragmentByTag("Zoom") != null) {
                                            if (o.this.aa != L.ZOOM_SESSION_STARTED) {
                                                if (((bq) o.this.getFragmentManager().findFragmentByTag("Zoom")).B() == ak.FRAME_YOUR_FACE) {
                                                    bg.B(o.this, bg.V.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                                                }
                                            } else if (ai.L() == ah.ZOOM_CLOSE) {
                                                if (ai.a() == ac.MOVE_FACE_CLOSER) {
                                                    bg.B(o.this, bg.V.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING);
                                                } else if (ai.a() != ac.HOLD_STEADY) {
                                                    bg.B(o.this, bg.V.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                                                }
                                            } else if (ai.L() == ah.ZOOM_FAR && ai.a() != ac.HOLD_STEADY) {
                                                bg.B(o.this, bg.V.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                                            }
                                        }
                                    }
                                    return true;
                                }
                            });
                        }
                        oVar.Z = ad.Code((Activity) oVar);
                        be.Code(oVar);
                        ba.B();
                        if (FaceTecSessionActivity.D != null) {
                            oVar.ac();
                        }
                        br.V(oVar, bp.ZOOM_EVENT_VERIFY_SESSION_START, oVar.bf);
                        ax.Z(new Runnable() { // from class: com.facetec.sdk.o.9
                            AnonymousClass9() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ai.Code();
                                ai.x(com.facetec.sdk.Z.Code());
                                ai.B("fnkey_ZOOMSDK_LIGHTINGMODE", 1);
                            }
                        });
                        int iV = (int) (ce.V(ba.D()) * ba.V());
                        ba.C();
                        if (ba.V() < 1.0f) {
                            float fZ = be.Z(oVar);
                            int i15 = Resources.getSystem().getDisplayMetrics().widthPixels;
                            int i16 = (int) (((double) Resources.getSystem().getDisplayMetrics().widthPixels) * ((double) fZ));
                            float fV = ba.V();
                            float f2 = i15;
                            oVar.S = fV * f2;
                            oVar.L = i16 * fV;
                            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) oVar.S, (int) oVar.L);
                            float f3 = oVar.S;
                            layoutParams3.setMargins(((int) (f2 - f3)) / 2, (iV / 2) + 10, ((int) (f2 - f3)) / 2, 0);
                            oVar.C.setLayoutParams(layoutParams3);
                            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(((int) oVar.S) + iV, ((int) oVar.L) + iV);
                            float f4 = oVar.S;
                            float f5 = iV;
                            layoutParams4.setMargins(((int) (f2 - (f4 + f5))) / 2, 10, ((int) (f2 - (f4 + f5))) / 2, 0);
                            oVar.f3272d.setLayoutParams(layoutParams4);
                            ((RelativeLayout) oVar.f3274f.getParent()).setLayoutParams(layoutParams4);
                            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) oVar.S, (int) oVar.L);
                            layoutParams5.setMargins(0, 0, 0, 0);
                            oVar.f3273e.setLayoutParams(layoutParams5);
                            oVar.O.setLayoutParams(layoutParams5);
                            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) oVar.S, (int) oVar.L);
                            layoutParams6.setMargins(0, 0, 0, 0);
                            oVar.f3269b.setLayoutParams(layoutParams6);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            float fV2 = ce.V(ba.o()) * fV;
                            gradientDrawable.setCornerRadius(fV2);
                            int iCode3 = ba.Code(oVar, FaceTecSDK.V.S.borderColor);
                            gradientDrawable.setStroke(iV, iCode3);
                            oVar.C.setBackground(gradientDrawable);
                            oVar.f3272d.setBackground(gradientDrawable);
                            oVar.C.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                            oVar.C.setClipToOutline(true);
                            if (FaceTecSDK.V.S.elevation > 0) {
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                gradientDrawable2.setCornerRadius(fV2);
                                gradientDrawable2.setStroke(iV, iCode3);
                                gradientDrawable2.setColor(ba.Code(oVar, ba.G()));
                                oVar.f3274f.setBackground(gradientDrawable2);
                                oVar.f3274f.setElevation(ce.V(FaceTecSDK.V.S.elevation));
                                oVar.f3274f.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                                oVar.f3274f.setClipToOutline(false);
                                oVar.f3274f.requestLayout();
                            }
                        }
                        ba.B(oVar.f3271c);
                        if (oVar.V() == g.Z.GRANTED) {
                            oVar.U();
                        }
                        try {
                            be.V(oVar);
                        } catch (bi e14) {
                            e14.printStackTrace();
                        }
                        oVar.J();
                    } catch (Throwable th2) {
                        com.facetec.sdk.L.V(th2);
                        a.V(oVar, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder(C1561oA.Yd("\u0001\u001b\u0019\u001d\u001f( R\u0019'(&*rY", (short) (ZN.Xd() ^ 14374))).append(th2.getMessage()).toString());
                        oVar.B(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
                    }
                } catch (bx e15) {
                    com.facetec.sdk.L.V(e15);
                    e15.getMessage();
                    a.V(oVar, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder(Xg.qd("s\u000e\f\u0010\u0012\u001b\u0013E\f\u001a\u001b\u0019\u001deL", (short) (OY.Xd() ^ 17107), (short) (OY.Xd() ^ 8631))).append(e15.getMessage()).toString());
                    oVar.B(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
                }
            } catch (bi e16) {
                com.facetec.sdk.L.V(e16);
                e16.getMessage();
                a.V(oVar, com.facetec.sdk.V.CAMERA_ERROR, new StringBuilder(Jg.Wd("K/\u0005&|\u0016\u001d\rb\tO{\r\u001d", (short) (OY.Xd() ^ OlympusMakernoteDirectory.TAG_LIGHT_VALUE_PERIPHERY), (short) (OY.Xd() ^ 23304))).append(e16.getMessage()).toString());
                oVar.B(FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (FaceTecIDScanStatus) null);
            }
        } catch (InvocationTargetException e17) {
            throw e17.getCause();
        }
    }

    @Override // com.facetec.sdk.g, android.app.Activity
    protected synchronized void onDestroy() {
        super.onDestroy();
        Y();
        Q();
        bg.V();
        FaceTecSDK.Z = FaceTecSDK.Code.NORMAL;
        if (this.aa == L.PRE_SESSION_STARTED) {
            ai.f(true);
        } else if (this.aa == L.ZOOM_SESSION_STARTED) {
            ai.e(true);
        }
        this.aa = L.NOT_STARTED;
        z();
        if (this.Code != null) {
            this.Code.removeCallbacksAndMessages(null);
        }
        if (this.bg != null && K() != this.bm) {
            this.bk = true;
            Z(K(), this.bm, 0);
            Handler handler = new Handler();
            Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.o.64
                AnonymousClass64() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (o.this.bg != null) {
                        o.this.bg.cancel();
                        o.this.bg.removeAllUpdateListeners();
                    }
                }
            }, 800L};
            Method method = Class.forName(ZO.xd("\u000f\b[7B]\u001dY\"cn>Z?\u001eG\u001d&", (short) (C1633zX.Xd() ^ (-3311)), (short) (C1633zX.Xd() ^ (-31926)))).getMethod(Ig.wd("o@Tw}I>\u001an\r\u0010", (short) (C1580rY.Xd() ^ (-27362))), Class.forName(C1626yg.Ud(" \b\u007fW<p9<@\u001br;dn\u0017t\u001ep", (short) (ZN.Xd() ^ 9731), (short) (ZN.Xd() ^ 7949))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        O();
        M();
        this.D = null;
    }

    public void onFlashButtonPressed(View view) {
        if (this.aB == null) {
            B(6);
            return;
        }
        view.setEnabled(false);
        this.f3286r.setEnabled(false, true);
        view.postDelayed(new Runnable() { // from class: com.facetec.sdk.o.48
            private /* synthetic */ View I;

            AnonymousClass48(View view2) {
                view = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                view.setEnabled(true);
                o.this.f3286r.setEnabled(true, true);
            }
        }, 1000L);
        boolean z2 = this.aS;
        this.aS = !z2;
        if (z2) {
            this.G.setImageResource(ba.at());
        } else {
            this.G.setImageResource(ba.ar());
        }
        this.aB.Z(this.aS);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        cf cfVar = this.aJ;
        if (cfVar != null) {
            this.aP = true;
            if (cfVar.I(intent, this.bs)) {
                y yVar = this.aH;
                if (yVar.Code.getActivity() != null) {
                    yVar.Code.getActivity().runOnUiThread(yVar.new AnonymousClass1(yVar.Code));
                }
            }
        }
    }

    @Override // com.facetec.sdk.g, android.app.Activity
    protected synchronized void onPause() {
        super.onPause();
        p();
        if (this.aE) {
            this.aG = true;
        }
        if (be.Code) {
            return;
        }
        if (isFinishing()) {
            Handler handler = this.Code;
            Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.o.21
                AnonymousClass21() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.O();
                }
            }};
            Method method = Class.forName(EO.Od("t'\u0011\u0002\u0019o\t\\x;uoWp|e\u0003\u0014", (short) (ZN.Xd() ^ 29905))).getMethod(C1593ug.zd("<<AC\u0011E\u0018ECCJ&>*O@QB", (short) (OY.Xd() ^ 24336), (short) (OY.Xd() ^ 31315)), Class.forName(C1561oA.Qd("vl\u0001j6sgsk1Tvnm__h`", (short) (C1499aX.Xd() ^ (-28412)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else if (!Code()) {
            B();
        }
        M();
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public synchronized void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        B(false);
        if (i2 == 0) {
            try {
                SharedPreferences.Editor editorEdit = n.C(this).edit();
                editorEdit.putBoolean("cameraPermissionsShown", true);
                editorEdit.apply();
                if (iArr.length != 1 || iArr[0] != 0) {
                    a.V(this, com.facetec.sdk.V.CAMERA_ERROR, FaceTecSessionStatus.CAMERA_PERMISSION_DENIED.toString());
                    B(FaceTecSessionStatus.CAMERA_PERMISSION_DENIED, (FaceTecIDScanStatus) null);
                    return;
                }
                U();
                if (this.aB == null) {
                    V(4);
                    return;
                }
                runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.16
                    AnonymousClass16() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f3268a.setVisibility(0);
                        o.this.f3268a.setAlpha(1.0f);
                    }
                });
                this.aB.I(new Runnable() { // from class: com.facetec.sdk.o.19
                    AnonymousClass19() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f3271c.animate().alpha(0.0f).setDuration(300L).setListener(null).start();
                    }
                });
                this.aB.Z();
                this.al.a();
            } catch (Exception e2) {
                com.facetec.sdk.L.V(e2);
                a.V(this, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder("Camera Permission Request Error: ").append(e2.getMessage()).toString());
                B(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            }
        }
    }

    @Override // com.facetec.sdk.g, android.app.Activity
    protected synchronized void onResume() {
        super.onResume();
        this.bi = false;
        be beVar = this.aB;
        if (beVar != null && beVar.getClass() == bm.class) {
            ((bm) this.aB).S();
        }
        if (be.Code && !this.ab && !this.aE) {
            findViewById(this.f3284p.getId());
            s();
        }
        if (this.aG) {
            this.aG = false;
            q();
        }
        if (!this.ap) {
            if (!this.aE) {
                Handler handler = new Handler();
                Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.o.18

                    /* JADX INFO: renamed from: com.facetec.sdk.o$18$1 */
                    final class AnonymousClass1 implements Runnable {
                        AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (o.this.E == null || o.this.f3281m == null) {
                                return;
                            }
                            bb.B(o.this.f3281m, R.string.FaceTec_idscan_review_id_front_instruction_message);
                        }
                    }

                    AnonymousClass18() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.18.1
                            AnonymousClass1() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (o.this.E == null || o.this.f3281m == null) {
                                    return;
                                }
                                bb.B(o.this.f3281m, R.string.FaceTec_idscan_review_id_front_instruction_message);
                            }
                        });
                    }
                }, 100L};
                Method method = Class.forName(C1561oA.Kd("q\u007fv\u0006\u0004~zE\b\rHc}\f\u0003\f\u0006\u0014", (short) (C1580rY.Xd() ^ (-17096)))).getMethod(C1561oA.Xd("//46\u0007)1'@--", (short) (C1633zX.Xd() ^ (-26770))), Class.forName(Wg.Zd("dx=95)Mk\u0014o#w\u007fUW\nC/", (short) (C1607wl.Xd() ^ 23083), (short) (C1607wl.Xd() ^ 29235))), Long.TYPE);
                method.setAccessible(true);
                method.invoke(handler, objArr);
            }
            return;
        }
        this.ap = false;
        if (this.aY) {
            aa();
        } else {
            try {
                this.Z = ad.Code((Activity) this);
                if (!this.aw) {
                    U();
                    this.aB.Z();
                }
                if (!u()) {
                    if (this.aw) {
                        return;
                    }
                    if (this.aC) {
                        return;
                    }
                    if (this.aF) {
                        return;
                    }
                    if (this.aD) {
                        return;
                    } else {
                        A();
                    }
                }
            } catch (Throwable th) {
                com.facetec.sdk.L.V(th);
                a.V(this, com.facetec.sdk.V.SEVERE_ERROR, new StringBuilder(C1561oA.od("F^Z\\\\cY\nNZYUW\u001e\u0003", (short) (C1580rY.Xd() ^ (-15096)))).append(th.getMessage()).toString());
                B(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            }
        }
        if (!this.aE && be.Code) {
            Handler handler2 = new Handler();
            Object[] objArr2 = {new Runnable() { // from class: com.facetec.sdk.o.18

                /* JADX INFO: renamed from: com.facetec.sdk.o$18$1 */
                final class AnonymousClass1 implements Runnable {
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (o.this.E == null || o.this.f3281m == null) {
                            return;
                        }
                        bb.B(o.this.f3281m, R.string.FaceTec_idscan_review_id_front_instruction_message);
                    }
                }

                AnonymousClass18() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.18.1
                        AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (o.this.E == null || o.this.f3281m == null) {
                                return;
                            }
                            bb.B(o.this.f3281m, R.string.FaceTec_idscan_review_id_front_instruction_message);
                        }
                    });
                }
            }, 100L};
            Method method2 = Class.forName(C1561oA.Kd("q\u007fv\u0006\u0004~zE\b\rHc}\f\u0003\f\u0006\u0014", (short) (C1580rY.Xd() ^ (-17096)))).getMethod(C1561oA.Xd("//46\u0007)1'@--", (short) (C1633zX.Xd() ^ (-26770))), Class.forName(Wg.Zd("dx=95)Mk\u0014o#w\u007fUW\nC/", (short) (C1607wl.Xd() ^ 23083), (short) (C1607wl.Xd() ^ 29235))), Long.TYPE);
            try {
                method2.setAccessible(true);
                method2.invoke(handler2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return;
    }

    @Override // android.app.Activity
    protected synchronized void onStop() {
        super.onStop();
        ae();
        this.bi = true;
        if (!be.Code && !this.aw && !this.aC && !this.ax) {
            Code(true);
            M();
            be beVar = this.aB;
            if (beVar == null || beVar.getClass() != bm.class) {
                O();
            }
        }
    }

    @Override // com.facetec.sdk.g, android.app.Activity, android.view.Window.Callback
    public synchronized void onWindowFocusChanged(boolean z2) {
        if (z2) {
            if (!u()) {
                if (this.aw) {
                    B(FaceTecIDScanNextStep.SELECTION_SCREEN);
                    return;
                }
                if (this.aC) {
                    A();
                } else if (this.aF) {
                    E();
                } else if (this.aD) {
                    G();
                }
            }
        } else if (!Code() && !isFinishing()) {
            B();
        }
    }

    final void p() {
        Timer timer = this.be;
        if (timer != null) {
            timer.cancel();
            this.be = null;
        }
        TimerTask timerTask = this.bj;
        if (timerTask != null) {
            timerTask.cancel();
            this.bj = null;
        }
    }

    final void q() {
        p();
        this.bj = new TimerTask() { // from class: com.facetec.sdk.o.40
            AnonymousClass40() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() throws Throwable {
                if (cf.I(o.this)) {
                    o.this.Z(false, true);
                    o.this.p();
                }
            }
        };
        Timer timer = new Timer();
        this.be = timer;
        timer.scheduleAtFixedRate(this.bj, 250L, 500L);
    }

    protected final void r() {
        a.V(this, com.facetec.sdk.V.DEVELOPER_USED_ID_SCAN_CALLBACK, "cancel");
        I(this.Q.getStatus(), this.T.getStatus());
    }

    final void s() throws Throwable {
        if (this.aB == null) {
            B(7);
            return;
        }
        ai.l(true, true);
        this.ab = true;
        W();
        this.aB.Z();
        if (this.aS) {
            this.aB.Z(true);
        }
        T();
        C(false);
        this.f3284p.setEnabled(false, true);
        this.f3290v.setEnabled(false, true);
        this.f3286r.setEnabled(true, true);
        this.f3286r.setVisibility(0);
        if (this.E == Z.FRONT) {
            bb.B(this.f3285q, R.string.FaceTec_idscan_capture_id_front_instruction_message);
        } else if (this.E == Z.BACK) {
            bb.B(this.f3285q, R.string.FaceTec_idscan_capture_id_back_instruction_message);
        }
    }

    final void t() throws Throwable {
        if (this.Z == null) {
            return;
        }
        this.f3291w.setEnabled(false, true);
        X();
        T();
        W();
        this.ab = true;
        this.Z.Z(cf.Code(this));
        this.bd = 0;
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.o.44

            /* JADX INFO: renamed from: com.facetec.sdk.o$44$2 */
            final class AnonymousClass2 implements Runnable {
                AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o.this.f3283o.setVisibility(8);
                }
            }

            AnonymousClass44() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.f3283o.animate().alpha(0.0f).setDuration(300L).setListener(null).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.44.2
                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f3283o.setVisibility(8);
                    }
                }).start();
            }
        });
    }

    final void v() {
        ImageView imageView = this.f3275g;
        if (imageView != null) {
            imageView.setEnabled(false);
            this.f3275g.animate().alpha(0.0f).setDuration(300L).setStartDelay(0L).start();
        }
    }

    final void w() {
        if (this.aB == null) {
            B(8);
            return;
        }
        this.f3290v.setEnabled(false, true);
        this.f3284p.setEnabled(false, true);
        this.f3293y.setEnabled(false);
        this.aS = false;
        this.G.setImageResource(ba.at());
        this.G.setEnabled(false);
        Q();
        ab();
        this.f3282n.B(new Runnable() { // from class: com.facetec.sdk.o.47

            /* JADX INFO: renamed from: com.facetec.sdk.o$47$1 */
            final class AnonymousClass1 implements Runnable {
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    o.this.f3282n.V();
                    o oVar = o.this;
                    oVar.K.setAlpha(1.0f);
                    oVar.A.setAlpha(1.0f);
                    oVar.f3287s.setAlpha(1.0f);
                    oVar.G.setAlpha(1.0f);
                    oVar.f3293y.setAlpha(1.0f);
                    oVar.K.setTranslationY(0.0f);
                    oVar.A.setTranslationY(0.0f);
                    o.this.Z(0);
                    if (o.this.E == Z.FRONT) {
                        o.this.X = ap.Code.FRONT_SIDE;
                    } else {
                        o.this.X = ap.Code.BACK_SIDE;
                    }
                    o.this.ah = ap.Code(true, o.this.X);
                    FragmentManager fragmentManager = o.this.getFragmentManager();
                    CX.ud();
                    fragmentManager.beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                    if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                        o.this.v();
                    }
                    new B(o.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                }
            }

            AnonymousClass47() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.this.f3276h.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: com.facetec.sdk.o.47.1
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        o.this.f3282n.V();
                        o oVar = o.this;
                        oVar.K.setAlpha(1.0f);
                        oVar.A.setAlpha(1.0f);
                        oVar.f3287s.setAlpha(1.0f);
                        oVar.G.setAlpha(1.0f);
                        oVar.f3293y.setAlpha(1.0f);
                        oVar.K.setTranslationY(0.0f);
                        oVar.A.setTranslationY(0.0f);
                        o.this.Z(0);
                        if (o.this.E == Z.FRONT) {
                            o.this.X = ap.Code.FRONT_SIDE;
                        } else {
                            o.this.X = ap.Code.BACK_SIDE;
                        }
                        o.this.ah = ap.Code(true, o.this.X);
                        FragmentManager fragmentManager = o.this.getFragmentManager();
                        CX.ud();
                        fragmentManager.beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(o.this.aL, o.this.ah, "Results").commitAllowingStateLoss();
                        if (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                            o.this.v();
                        }
                        new B(o.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                });
            }
        });
    }

    final void x() throws Throwable {
        this.bd++;
        if (this.ah != null && this.bd > 5) {
            Z(false);
            return;
        }
        Z(true, false);
        y yVar = this.aH;
        if (yVar.Code.getActivity() != null) {
            yVar.Code.getActivity().runOnUiThread(yVar.new AnonymousClass2(yVar.Code));
        }
    }

    final void y() throws Throwable {
        this.aH.Z();
        this.bp = true;
        this.bc = true;
        String strB = ba.B(x.SKIPPED);
        Handler handler = new Handler();
        AnonymousClass57 anonymousClass57 = new AnonymousClass57(this.ah, strB);
        short sXd = (short) (C1607wl.Xd() ^ 32403);
        int[] iArr = new int["<J=LFA9\u0004RW\u000f*@NAJ0>".length()];
        QB qb = new QB("<J=LFA9\u0004RW\u000f*@NAJ0>");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {anonymousClass57, 800L};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(yg.hg.Vd("\u0011\u000f\u0012\u0012`\u0001\u0007z\u0012|z", (short) (OY.Xd() ^ 9883), (short) (OY.Xd() ^ 19819)), Class.forName(Qg.kd("7-A+v4(4,q\u00157/.  )!", (short) (Od.Xd() ^ (-17788)), (short) (Od.Xd() ^ (-29848)))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
