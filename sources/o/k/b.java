package o.k;

import android.content.Context;
import android.content.res.Resources;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import fr.antelop.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Random;
import o.ea.m;
import o.g.a;
import o.k.e;
import o.l.a;
import o.l.c;
import o.m.d;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends c {
    private static char[] B = null;
    private static int C = 0;
    private static int E = 0;
    private static int F = 1;
    private static int G = 0;
    private static int H = 1;
    private static boolean I = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f26300k = -1063802583;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f26301l = 880029344;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f26302m = -442198380;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f26303n = -858824298;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f26304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f26305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f26306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f26307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f26308t;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static boolean f26309z = false;
    private final String A;
    private final d D;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FragmentManager f26310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f26311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f26312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e f26313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a f26314y;

    static {
        i();
        ViewConfiguration.getPressedStateDuration();
        f26305q = R.string.antelopConsentPromptName;
        f26304p = R.string.antelopConsentPromptDefaultTitle;
        f26306r = R.string.antelopConsentPromptDefaultSubtitle;
        f26308t = R.string.antelopConsentPromptSubmitButtonLabel;
        f26307s = R.drawable.antelopConsentPromptIcon;
        int i2 = H + 11;
        E = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public b(Context context, String str, String str2, d dVar) {
        super(c(context), f26307s);
        if (str == null) {
            Object[] objArr = {d(context)};
            int i2 = m.f23563d * 691068131;
            m.f23563d = i2;
            int i3 = m.f23561b * (-1916120846);
            m.f23561b = i3;
            this.f26312w = (String) m.c(objArr, (int) SystemClock.uptimeMillis(), i3, -327535505, i2, 327535505, Process.myUid());
        } else {
            int i4 = m.f23563d * 691068131;
            m.f23563d = i4;
            int i5 = m.f23561b * (-1916120846);
            m.f23561b = i5;
            this.f26312w = (String) m.c(new Object[]{str}, (int) SystemClock.uptimeMillis(), i5, -327535505, i4, 327535505, Process.myUid());
        }
        if (str2 == null) {
            Object[] objArr2 = {b(context)};
            int i6 = m.f23563d * 691068131;
            m.f23563d = i6;
            int i7 = m.f23561b * (-1916120846);
            m.f23561b = i7;
            this.f26311v = (String) m.c(objArr2, (int) SystemClock.uptimeMillis(), i7, -327535505, i6, 327535505, Process.myUid());
        } else {
            int i8 = m.f23563d * 691068131;
            m.f23563d = i8;
            int i9 = m.f23561b * (-1916120846);
            m.f23561b = i9;
            this.f26311v = (String) m.c(new Object[]{str2}, (int) SystemClock.uptimeMillis(), i9, -327535505, i8, 327535505, Process.myUid());
        }
        this.A = e(context);
        this.D = dVar;
    }

    private static String b(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = G + 83;
        F = i3 % 128;
        int i4 = i3 % 2;
        short sXd = (short) (C1499aX.Xd() ^ (-4145));
        int[] iArr = new int["\u001b) /-($n%229+5<v\r::A3GD".length()];
        QB qb = new QB("\u001b) /-($n%229+5<v\r::A3GD");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i5));
            i5++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(Xg.qd("\u0005\u0004\u0014r\u0007\u0016\u0013\u001a\u0018\n\r\u001c", (short) (C1499aX.Xd() ^ (-5450)), (short) (C1499aX.Xd() ^ (-13679))), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(f26306r);
            int i6 = G + 57;
            F = i6 % 128;
            int i7 = i6 % 2;
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 63;
        G = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("`Y/%\u0004uP\u007f\u0015\u0019we67\u001b<1W6$t}W", (short) (ZN.Xd() ^ 31881), (short) (ZN.Xd() ^ 20996))).getMethod(ZO.xd("P\u0007@m-\u001cp\u0003QI.i", (short) (OY.Xd() ^ 25593), (short) (OY.Xd() ^ 8571)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int i5 = f26305q;
            if (i4 == 0) {
                return resources.getString(i5);
            }
            resources.getString(i5);
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String d(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = G + 47;
        F = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("\u0012e.\u0003n\u0016uB,6s\u001c f\u0004\u000eI8,K\u0002\u00054", (short) (C1633zX.Xd() ^ (-2496)), (short) (C1633zX.Xd() ^ (-12031)))).getMethod(Ig.wd("q8\u0019Z\u0015n\u000b v77'", (short) (C1633zX.Xd() ^ (-27353))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int i5 = f26304p;
            if (i4 != 0) {
                return resources.getString(i5);
            }
            resources.getString(i5);
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~((-1) - (((-1) - (~i4)) & ((-1) - i7)));
        int i9 = ~i6;
        int i10 = ~((i9 + i7) - (i9 & i7));
        int i11 = (-1) - (((-1) - i8) & ((-1) - i10));
        int i12 = (-1) - (((-1) - (~((~i7) | i4))) & ((-1) - i8));
        int i13 = (i10 + i12) - (i10 & i12);
        int i14 = i7 + i4 + i2 + ((-1814252664) * i5) + (2073254503 * i3);
        int i15 = i14 * i14;
        int i16 = ((-223937157) * i7) + 1943797760 + (1745420935 * i4) + (i11 * 1162804602) + (1162804602 * i8) + ((-1162804602) * i13) + ((-1386741760) * i2) + ((-1631584256) * i5) + ((-1368915968) * i3) + ((-1053032448) * i15);
        int i17 = (i7 * (-1919122223)) + 1408767311 + (i4 * (-1919121035)) + (i11 * (-594)) + (i8 * (-594)) + (i13 * 594) + (i2 * (-1919121629)) + (i5 * (-390511720)) + (i3 * 1804971285) + (i15 * 255066112);
        if (i16 + (i17 * i17 * 379846656) != 1) {
            return e(objArr);
        }
        int i18 = 2 % 2;
        if (((c) objArr[1]) != null) {
            return false;
        }
        int i19 = F + 21;
        int i20 = i19 % 128;
        G = i20;
        int i21 = i19 % 2;
        int i22 = i20 + 79;
        F = i22 % 128;
        int i23 = i22 % 2;
        return true;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Exception {
        b bVar = (b) objArr[0];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        final a aVar = (a) objArr[4];
        int i2 = 2 % 2;
        bVar.f26313x = new e(bVar, new e.a() { // from class: o.k.b.5

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f26315c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f26316e = 0;

            @Override // o.k.e.a
            public final void b() {
                int i3 = 2 % 2;
                aVar.b(new o.g.e(a.b.f26175c, new Date()), b.this);
                int i4 = f26316e;
                int i5 = (i4 ^ 77) + ((i4 & 77) << 1);
                f26315c = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.k.e.a
            public final void d() {
                int i3 = 2 % 2;
                int i4 = f26316e;
                int i5 = ((37 | i4) << 1) - (i4 ^ 37);
                f26315c = i5 % 128;
                int i6 = i5 % 2;
                aVar.c(o.l.d.f26353b, b.this);
                int i7 = f26316e + 81;
                f26315c = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        bVar.f26310u = supportFragmentManager;
        bVar.f26314y = aVar;
        CX.ud();
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        e eVar = bVar.f26313x;
        CX.ud();
        Object obj = null;
        fragmentTransactionBeginTransaction.replace(iIntValue, eVar).addToBackStack(null).commit();
        int i3 = G + 55;
        F = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static String e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = F + 29;
        G = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("r)Q\b\u001dsJ\\l|y\u001e]p\u000ff V\u000e<g'A", (short) (C1580rY.Xd() ^ (-14064)))).getMethod(C1561oA.Qd("khvSermrn^_l", (short) (FB.Xd() ^ 13894)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(f26308t);
            if (i4 != 0) {
                int i5 = 75 / 0;
            }
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void i() {
        B = new char[]{2542, 2507, 2498, 2487, 2532, 2482, 2484, 2485, 2504, 2506, 2537, 2505};
        C = 2040400185;
        f26309z = true;
        I = true;
    }

    @Override // o.l.c
    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = F + 49;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 39;
        F = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return true;
    }

    @Override // o.l.c
    public final void e(FragmentActivity fragmentActivity, int i2, CancellationSignal cancellationSignal, o.l.a aVar) {
        Object[] objArr = {this, fragmentActivity, Integer.valueOf(i2), cancellationSignal, aVar};
        int iMyTid = Process.myTid();
        int i3 = f26300k * (-212824399);
        f26300k = i3;
        int i4 = f26301l * (-1674735129);
        f26301l = i4;
        e(i3, new Random().nextInt(), -1954979464, i4, objArr, iMyTid, 1954979464);
    }

    @Override // o.l.c
    public final boolean e(c cVar) {
        int i2 = f26303n * (-126653323);
        f26303n = i2;
        int iMyUid = Process.myUid();
        int iMyTid = Process.myTid();
        int i3 = (-581837133) * f26302m;
        f26302m = i3;
        return ((Boolean) e(iMyUid, i3, 846069814, iMyTid, new Object[]{this, cVar}, i2, -846069813)).booleanValue();
    }

    public final String f() {
        int i2 = 2 % 2;
        int i3 = F + 59;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        String str = this.f26311v;
        int i6 = i4 + 25;
        F = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = G + 39;
        int i4 = i3 % 128;
        F = i4;
        int i5 = i3 % 2;
        String str = this.A;
        int i6 = i4 + 47;
        G = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = F + 55;
        G = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f26312w;
        }
        throw null;
    }
}
