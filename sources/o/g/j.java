package o.g;

import android.os.Process;
import android.os.SystemClock;
import java.util.Date;
import java.util.Random;
import o.g.a;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26242a = 1322967457;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f26243b = 1635950013;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26244c = 1390820739;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26245d = 1469262406;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26246e = 1497419582;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26247f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26248h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f26249j = 505858954;

    public j() {
        super(a.b.f26175c, new Date());
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f26248h;
        int i4 = i3 + 99;
        f26247f = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 19;
        f26247f = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f26248h + 29;
        f26247f = i3 % 128;
        if (i3 % 2 != 0) {
            o.m.i iVar = o.m.i.f26500i;
            throw null;
        }
        o.m.i iVar2 = o.m.i.f26500i;
        int i4 = f26247f;
        int i5 = (i4 ^ 111) + (((-1) - (((-1) - i4) | ((-1) - 111))) << 1);
        f26248h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return iVar2;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i4;
        int i9 = ~((~i3) | i8);
        int i10 = ~i5;
        int i11 = i9 | (~((i10 + i3) - (i10 & i3)));
        int i12 = ~((i4 + i3) - (i4 & i3));
        int i13 = (i11 + i12) - (i11 & i12);
        int i14 = (i8 + i3) - (i8 & i3);
        int i15 = (i10 + i14) - (i10 & i14);
        int i16 = i4 + i3 + i2 + ((-1542968645) * i7) + (1789173782 * i6);
        int i17 = i16 * i16;
        int i18 = (1553370224 * i4) + 752877568 + ((-368479342) * i3) + (i13 * 1186558865) + (1921849566 * i14) + (1186558865 * i15) + ((-1555038208) * i2) + (1802502144 * i7) + (148897792 * i6) + (289275904 * i17);
        int i19 = (i4 * (-930071408)) + 1959937684 + (i3 * (-930070194)) + (i13 * 607) + (i14 * (-1214)) + (i15 * 607) + (i2 * (-930070801)) + (i7 * 1059663509) + (i6 * (-1428764534)) + (i17 * 484573184);
        int i20 = i18 + (i19 * i19 * 411172864);
        if (i20 != 1) {
            return i20 != 2 ? c(objArr) : a(objArr);
        }
        int i21 = 2 % 2;
        int i22 = f26247f;
        int i23 = (i22 & 85) + ((i22 + 85) - (85 & i22));
        f26248h = i23 % 128;
        int i24 = i23 % 2;
        int i25 = (i22 ^ 67) + (((-1) - (((-1) - i22) | ((-1) - 67))) << 1);
        f26248h = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    @Override // o.g.a
    public final byte[] a() {
        int i2 = 2 % 2;
        int i3 = f26247f + 111;
        int i4 = i3 % 128;
        f26248h = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 5;
        f26247f = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.g.a
    public final o.m.i b() {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f26243b * (-1246282430);
        f26243b = i3;
        return (o.m.i) e(i2, 585322640, -585322640, iElapsedRealtime, (int) Thread.currentThread().getId(), new Object[]{this}, i3);
    }

    @Override // o.g.a
    public final String c() {
        int i2 = 2 % 2;
        int i3 = f26247f;
        int i4 = ((67 | i3) << 1) - (i3 ^ 67);
        f26248h = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 65;
        f26248h = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // o.g.a
    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f26248h + 125;
        int i4 = i3 % 128;
        f26247f = i4;
        if (i3 % 2 != 0) {
            int i5 = 35 / 0;
        }
        int i6 = ((69 | i4) << 1) - (i4 ^ 69);
        f26248h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return null;
    }

    @Override // o.g.a
    public final byte[] e() {
        int i2 = f26245d * 437373314;
        f26245d = i2;
        int i3 = f26242a * 2133450048;
        f26242a = i3;
        int i4 = f26249j * 1536996456;
        f26249j = i4;
        return (byte[]) e(i3, 1201920431, -1201920429, i2, (int) Runtime.getRuntime().maxMemory(), new Object[]{this}, i4);
    }

    @Override // o.g.a
    public final String j() {
        int i2 = f26244c * 279741650;
        f26244c = i2;
        int i3 = f26246e * 1115712226;
        f26246e = i3;
        int iMyTid = Process.myTid();
        return (String) e(i3, 2071756545, -2071756544, i2, new Random().nextInt(309335241), new Object[]{this}, iMyTid);
    }
}
