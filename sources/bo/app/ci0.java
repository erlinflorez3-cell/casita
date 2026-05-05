package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.managers.BrazeGeofenceManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class ci0 implements l10 {
    public final xy A;
    public final kn B;
    public final iu C;
    public final cs D;
    public final v80 E;

    /* JADX INFO: renamed from: a */
    public final Context f382a;

    /* JADX INFO: renamed from: b */
    public final BrazeConfigurationProvider f383b;

    /* JADX INFO: renamed from: c */
    public final p00 f384c;

    /* JADX INFO: renamed from: d */
    public final s60 f385d;

    /* JADX INFO: renamed from: e */
    public final o00 f386e;

    /* JADX INFO: renamed from: f */
    public final String f387f;

    /* JADX INFO: renamed from: g */
    public final String f388g;

    /* JADX INFO: renamed from: h */
    public final vb0 f389h;

    /* JADX INFO: renamed from: i */
    public uh0 f390i;

    /* JADX INFO: renamed from: j */
    public zq f391j;

    /* JADX INFO: renamed from: k */
    public final vw f392k;

    /* JADX INFO: renamed from: l */
    public final xs f393l;

    /* JADX INFO: renamed from: m */
    public final iw f394m;

    /* JADX INFO: renamed from: n */
    public final zo f395n;

    /* JADX INFO: renamed from: o */
    public final ci f396o;

    /* JADX INFO: renamed from: p */
    public final kx f397p;

    /* JADX INFO: renamed from: q */
    public final b70 f398q;

    /* JADX INFO: renamed from: r */
    public final k90 f399r;

    /* JADX INFO: renamed from: s */
    public final yf f400s;

    /* JADX INFO: renamed from: t */
    public final y60 f401t;

    /* JADX INFO: renamed from: u */
    public final la0 f402u;

    /* JADX INFO: renamed from: v */
    public final tf f403v;

    /* JADX INFO: renamed from: w */
    public final cg0 f404w;

    /* JADX INFO: renamed from: x */
    public final BrazeGeofenceManager f405x;

    /* JADX INFO: renamed from: y */
    public final zd f406y;

    /* JADX INFO: renamed from: z */
    public final gy f407z;

    public ci0(Context context, e50 e50Var, BrazeConfigurationProvider brazeConfigurationProvider, v00 v00Var, p00 p00Var, z00 z00Var, s60 s60Var, boolean z2, boolean z3, o00 o00Var, boolean z4) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 30423);
        int[] iArr = new int[":\u001b'MI\u000eqK\u00191()&!\u0001\u0012kc".length()];
        QB qb = new QB(":\u001b'MI\u000eqK\u00191()&!\u0001\u0012kc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        short sXd2 = (short) (OY.Xd() ^ 24684);
        int[] iArr2 = new int["B`P<S&?@\u001e\u0012\u001b[(#@\u0013FXld!a<=}%".length()];
        QB qb2 = new QB("B`P<S&?@\u001e\u0012\u001b[(#@\u0013FXld!a<=}%");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Intrinsics.checkNotNullParameter(e50Var, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, C1561oA.Qd("DOMDFCPL:L@EC$EAG933?", (short) (C1607wl.Xd() ^ 15397)));
        Intrinsics.checkNotNullParameter(v00Var, C1593ug.zd(">ROAOL@L&XHRY6\\JUS^TR`", (short) (FB.Xd() ^ 29674), (short) (FB.Xd() ^ 31018)));
        Intrinsics.checkNotNullParameter(p00Var, C1561oA.od("ss\u0004unoRlWxtzlffr", (short) (C1580rY.Xd() ^ (-32639))));
        Intrinsics.checkNotNullParameter(z00Var, C1561oA.Kd("/#&)465%9/66\r+?-\u001d@>F:68F", (short) (C1607wl.Xd() ^ 10223)));
        Intrinsics.checkNotNullParameter(s60Var, Wg.Zd(">y>y\u001c\fY\u001do\u001dp>X;\u000fG\u0014P$", (short) (C1607wl.Xd() ^ 3628), (short) (C1607wl.Xd() ^ 14244)));
        Intrinsics.checkNotNullParameter(o00Var, C1561oA.Xd("9;MA<?\u001f=Q?/RPXLHJX", (short) (C1499aX.Xd() ^ (-23115))));
        this.f382a = context;
        this.f383b = brazeConfigurationProvider;
        this.f384c = p00Var;
        this.f385d = s60Var;
        this.f386e = o00Var;
        this.f387f = e50Var.a();
        this.f388g = g().getBrazeApiKey().toString();
        ka0 ka0Var = new ka0(b());
        ju juVar = new ju(b());
        this.f389h = new vb0(b(), a());
        this.f392k = new vw(ka0Var, true);
        this.f393l = new xs(b(), p(), v(), q(), a());
        new w90(b(), p(), v());
        cv cvVar = new cv(new tc0(b(), q(), a()), p());
        this.f395n = new zo(b(), p(), new ao(b()));
        Context contextB = b();
        vw vwVarP = p();
        Context contextB2 = b();
        Object[] objArr = {Wg.vd("=I?QE", (short) (C1580rY.Xd() ^ (-8230)))};
        Method method = Class.forName(Qg.kd("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (C1499aX.Xd() ^ (-24061)), (short) (C1499aX.Xd() ^ (-618)))).getMethod(C1561oA.ud("YVdBg``PW<MY\\NGH", (short) (Od.Xd() ^ (-12787))), Class.forName(yg.hg.Vd(">4H2};/;3x\u001d=:04,", (short) (C1633zX.Xd() ^ (-6471)), (short) (C1633zX.Xd() ^ (-5113)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(contextB2, objArr);
            short sXd3 = (short) (ZN.Xd() ^ 16324);
            int[] iArr3 = new int["%-%&R\u0017\u0016$-/5a\u001d!\\!\b\u001b\u001dI\u0017\u0013D\u0014\u001e\u001e]  \u0018\u0019M\u000b\u0011\t~2t\u0003y\u0011\u000f\n\u0006H|\r\u000e4HtjtpQf|pwv|".length()];
            QB qb3 = new QB("%-%&R\u0017\u0016$-/5a\u001d!\\!\b\u001b\u001dI\u0017\u0013D\u0014\u001e\u001e]  \u0018\u0019M\u000b\u0011\t~2t\u0003y\u0011\u000f\n\u0006H|\r\u000e4HtjtpQf|pwv|");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 ^ i4));
                i4++;
            }
            Intrinsics.checkNotNull(objInvoke, new String(iArr3, 0, i4));
            this.f396o = new ci(contextB, cvVar, vwVarP, v00Var, (AlarmManager) objInvoke, g().getSessionTimeoutSeconds(), g().isSessionStartBasedTimeoutEnabled());
            this.f397p = new kx(new ex(new pc0(b(), q(), a()), p()));
            this.f398q = new b70(b(), p(), v(), a(), q());
            this.f399r = new k90(b(), q(), a());
            this.f400s = new yf(b(), p(), v());
            this.f401t = new y60(b(), a(), q());
            this.f402u = new la0(b(), q(), a());
            this.f403v = new tf(b(), q(), a(), f(), p(), g(), v(), l(), e(), ka0Var, t(), r(), s());
            this.f404w = new cg0(b(), d(), p(), v00Var, g(), q(), a());
            this.f405x = new BrazeGeofenceManager(b(), a(), d(), g(), v(), p());
            this.f406y = new zd(b(), d(), g());
            this.f407z = new gy(b(), a(), q(), p(), v00Var, v(), d());
            this.A = new xy(b(), q(), d());
            this.B = new kn(b(), q(), a(), d());
            y70 y70Var = new y70(c00.a(), p(), v00Var, n(), v(), h(), d(), juVar);
            this.C = new iu(p(), d(), 0);
            this.D = new cs(this);
            this.E = new v80(k(), y70Var, z2, z4);
            if (Intrinsics.areEqual(q(), "")) {
                a(new uh0(b(), z00Var, ka0Var));
                a(new zq(b()));
            } else {
                a(new uh0(b(), z00Var, ka0Var, q(), a()));
                a(new zq(b(), q(), a()));
            }
            i().a(z3);
            this.f394m = new iw(b(), c(), p(), d(), x(), j(), w(), w().b(), l(), o(), v00Var, g(), h(), u(), v(), m(), r());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String a() {
        return this.f388g;
    }

    public final void a(uh0 uh0Var) {
        Intrinsics.checkNotNullParameter(uh0Var, "<set-?>");
        this.f390i = uh0Var;
    }

    public final void a(zq zqVar) {
        Intrinsics.checkNotNullParameter(zqVar, "<set-?>");
        this.f391j = zqVar;
    }

    public final Context b() {
        return this.f382a;
    }

    public final zd c() {
        return this.f406y;
    }

    public final h00 d() {
        return this.f403v;
    }

    public final yf e() {
        return this.f400s;
    }

    public final ci f() {
        return this.f396o;
    }

    public final BrazeConfigurationProvider g() {
        return this.f383b;
    }

    public final kn h() {
        return this.B;
    }

    public final zo i() {
        return this.f395n;
    }

    public final zq j() {
        zq zqVar = this.f391j;
        if (zqVar != null) {
            return zqVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
        return null;
    }

    public final cs k() {
        return this.D;
    }

    public final kx l() {
        return this.f397p;
    }

    public final gy m() {
        return this.f407z;
    }

    public final xy n() {
        return this.A;
    }

    public final BrazeGeofenceManager o() {
        return this.f405x;
    }

    public final vw p() {
        return this.f392k;
    }

    public final String q() {
        return this.f387f;
    }

    public final s60 r() {
        return this.f385d;
    }

    public final y60 s() {
        return this.f401t;
    }

    public final b70 t() {
        return this.f398q;
    }

    public final la0 u() {
        return this.f402u;
    }

    public final vb0 v() {
        return this.f389h;
    }

    public final cg0 w() {
        return this.f404w;
    }

    public final uh0 x() {
        uh0 uh0Var = this.f390i;
        if (uh0Var != null) {
            return uh0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userCache");
        return null;
    }
}
