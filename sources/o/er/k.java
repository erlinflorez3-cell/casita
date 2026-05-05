package o.er;

import android.os.Process;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25017a = 1850716710;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25018b = -914922823;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25019c = 1817599669;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25020d = -1449884297;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25021e = 1299116388;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25022g = 69897809;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f25023k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f25024l = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25025f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f25027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25028j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f25029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f25030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f25031o;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f25025f = str;
        this.f25028j = str2;
        this.f25026h = str3;
        this.f25027i = str4;
        this.f25030n = str5;
        this.f25029m = str6;
        this.f25031o = str7;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        k kVar = (k) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25024l;
        int i4 = i3 + 27;
        f25023k = i4 % 128;
        int i5 = i4 % 2;
        String str = kVar.f25025f;
        int i6 = ((-1) - (((-1) - i3) | ((-1) - 39))) + ((i3 + 39) - (i3 & 39));
        f25023k = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
        return str;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i3;
        int i10 = i8 | i9;
        int i11 = ~i5;
        int i12 = (~((i10 + i11) - (i10 & i11))) | (~((-1) - (((-1) - ((-1) - (((-1) - i7) & ((-1) - i3)))) & ((-1) - i5))));
        int i13 = (-1) - (((-1) - (~((-1) - (((-1) - i9) & ((-1) - i5))))) & ((-1) - (~(i9 | i7))));
        int i14 = (~((-1) - (((-1) - i5) & ((-1) - i3)))) | i7;
        int i15 = i7 + i3 + i2 + (1661237432 * i6) + (961048624 * i4);
        int i16 = i15 * i15;
        int i17 = ((119520104 * i7) - 281083904) + ((-1329838950) * i3) + (i12 * 724679527) + (724679527 * i13) + ((-724679527) * i14) + ((-605159424) * i2) + ((-1559232512) * i6) + (1553989632 * i4) + (2020540416 * i16);
        int i18 = (i7 * (-2040814728)) + 92927091 + (i3 * (-2040813538)) + (i12 * (-595)) + (i13 * (-595)) + (i14 * 595) + (i2 * (-2040814133)) + (i6 * (-1614655000)) + (i4 * 500164112) + (i16 * 184877056);
        int i19 = i17 + (i18 * i18 * 1800994816);
        if (i19 == 1) {
            return d(objArr);
        }
        if (i19 != 2) {
            return b(objArr);
        }
        k kVar = (k) objArr[0];
        int i20 = 2 % 2;
        int i21 = f25024l;
        int i22 = i21 + 11;
        f25023k = i22 % 128;
        int i23 = i22 % 2;
        String str = kVar.f25030n;
        int i24 = ((-1) - (((-1) - i21) | ((-1) - 47))) + ((i21 + 47) - (i21 & 47));
        f25023k = i24 % 128;
        int i25 = i24 % 2;
        return str;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        k kVar = (k) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25024l;
        int i4 = ((5 | i3) << 1) - (i3 ^ 5);
        int i5 = i4 % 128;
        f25023k = i5;
        int i6 = i4 % 2;
        String str = kVar.f25029m;
        int i7 = i5 + 123;
        f25024l = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String a() {
        int i2 = f25019c * (-1583409397);
        f25019c = i2;
        int iMyTid = Process.myTid();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = (-1155363413) * f25022g;
        f25022g = i3;
        return (String) c(iMyTid, 357010820, i3, i2, new Object[]{this}, iMaxMemory, -357010818);
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f25024l;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 11))) + ((i3 + 11) - (11 & i3));
        f25023k = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f25028j;
        int i5 = (i3 & 37) + ((-1) - (((-1) - i3) & ((-1) - 37)));
        f25023k = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String c() {
        int iNextInt = new Random().nextInt();
        int iMyPid = Process.myPid();
        int i2 = f25018b * (-91568461);
        f25018b = i2;
        int i3 = (-1816306970) * f25017a;
        f25017a = i3;
        return (String) c(iMyPid, 2051927583, i3, iNextInt, new Object[]{this}, i2, -2051927583);
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f25024l;
        int i4 = (((i3 + 19) - (19 & i3)) << 1) - (i3 ^ 19);
        f25023k = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f25026h;
        if (i5 == 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f25023k;
        int i4 = i3 + 109;
        f25024l = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f25027i;
        int i6 = (i3 & 73) + ((i3 + 73) - (i3 & 73));
        f25024l = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
        return str;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = f25023k;
        int i4 = (i3 ^ 67) + (((i3 + 67) - (67 | i3)) << 1);
        f25024l = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f25031o;
        int i6 = i3 + 107;
        f25024l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String j() {
        int priority = Thread.currentThread().getPriority();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f25021e * (-460678624);
        f25021e = i3;
        int i4 = 1879643041 * f25020d;
        f25020d = i4;
        return (String) c(i2, -377784092, i4, priority, new Object[]{this}, i3, 377784093);
    }
}
