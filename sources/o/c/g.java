package o.c;

import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import java.util.Random;
import o.bh.a;

/* JADX INFO: loaded from: classes6.dex */
final class g {

    /* JADX INFO: renamed from: a */
    public static int f21997a = 1866941946;

    /* JADX INFO: renamed from: b */
    public static int f21998b = 882024845;

    /* JADX INFO: renamed from: c */
    public static int f21999c = 1043067398;

    /* JADX INFO: renamed from: d */
    public static int f22000d = -1653479713;

    /* JADX INFO: renamed from: e */
    public static int f22001e = 1318063359;

    /* JADX INFO: renamed from: h */
    public static int f22002h = 27494424;

    /* JADX INFO: renamed from: i */
    public static int f22003i = -759692822;

    /* JADX INFO: renamed from: j */
    public static int f22004j = 827266115;

    /* JADX INFO: renamed from: s */
    private static int f22005s = 1;

    /* JADX INFO: renamed from: t */
    private static int f22006t = 0;

    /* JADX INFO: renamed from: f */
    private final Context f22007f;

    /* JADX INFO: renamed from: g */
    private final e f22008g;

    /* JADX INFO: renamed from: k */
    private final a.InterfaceC0341a f22009k;

    /* JADX INFO: renamed from: l */
    private final o.i.d f22010l;

    /* JADX INFO: renamed from: m */
    private final Handler f22011m;

    /* JADX INFO: renamed from: n */
    private final o.h.d f22012n;

    /* JADX INFO: renamed from: o */
    private final b f22013o;

    g(Context context, e eVar, a.InterfaceC0341a interfaceC0341a, b bVar, o.i.d dVar, o.h.d dVar2, Handler handler) {
        this.f22007f = context;
        this.f22008g = eVar;
        this.f22009k = interfaceC0341a;
        this.f22013o = bVar;
        this.f22010l = dVar;
        this.f22012n = dVar2;
        this.f22011m = handler;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22006t;
        int i4 = i3 + 9;
        f22005s = i4 % 128;
        int i5 = i4 % 2;
        Context context = gVar.f22007f;
        int i6 = (i3 ^ 121) + (((i3 + 121) - (i3 | 121)) << 1);
        f22005s = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 55 / 0;
        }
        return context;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22005s;
        int i4 = ((i3 + 63) - (63 | i3)) + (i3 | 63);
        f22006t = i4 % 128;
        int i5 = i4 % 2;
        Handler handler = gVar.f22011m;
        if (i5 == 0) {
            return handler;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object d(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~((i7 + i2) - (i7 & i2));
        int i9 = (-1) - (((-1) - i5) & ((-1) - i8));
        int i10 = ~i5;
        int i11 = (~((i2 + i10) - (i2 & i10))) | i7;
        int i12 = i7 + i5 + i6 + ((-1932811043) * i4) + (1521317780 * i3);
        int i13 = i12 * i12;
        int i14 = ((i7 * (-919556932)) - 154402816) + ((-919556932) * i5) + ((-1121407813) * i8) + (i9 * 1121407813) + (1121407813 * i11) + (201850880 * i6) + ((-2098724864) * i4) + ((-1398800384) * i3) + ((-1444151296) * i13);
        int i15 = (i7 * 1794637580) + 2133191799 + (i5 * 1794637580) + (i8 * (-161)) + (i9 * 161) + (i11 * 161) + (i6 * 1794637741) + (i4 * (-1844343719)) + (i3 * (-1188939004)) + (i13 * (-394526720));
        int i16 = i14 + (i15 * i15 * 821297152);
        if (i16 == 1) {
            return c(objArr);
        }
        if (i16 == 2) {
            return e(objArr);
        }
        if (i16 == 3) {
            return b(objArr);
        }
        g gVar = (g) objArr[0];
        int i17 = 2 % 2;
        int i18 = f22005s + 3;
        int i19 = i18 % 128;
        f22006t = i19;
        int i20 = i18 % 2;
        if (gVar.f22010l == null) {
            int i21 = (((i19 + 5) - (5 & i19)) << 1) - (i19 ^ 5);
            int i22 = i21 % 128;
            f22005s = i22;
            int i23 = i21 % 2;
            if (gVar.f22012n == null) {
                int i24 = (((i22 + 37) - (37 & i22)) << 1) - (i22 ^ 37);
                f22006t = i24 % 128;
                int i25 = i24 % 2;
                return true;
            }
        }
        int i26 = f22005s + 93;
        f22006t = i26 % 128;
        int i27 = i26 % 2;
        return false;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        g gVar = (g) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22006t + 69;
        int i4 = i3 % 128;
        f22005s = i4;
        int i5 = i3 % 2;
        o.h.d dVar = gVar.f22012n;
        int i6 = i4 + 45;
        f22006t = i6 % 128;
        if (i6 % 2 == 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final o.h.d a() {
        int i2 = f22000d * (-507266951);
        f22000d = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = (-1574887624) * f21997a;
        f21997a = i4;
        return (o.h.d) d(i2, new Object[]{this}, Process.myUid(), i4, -491854243, i3, 491854245);
    }

    final boolean b() {
        int iActiveCount = Thread.activeCount();
        int i2 = f22001e * 1064173618;
        f22001e = i2;
        return ((Boolean) d(iActiveCount, new Object[]{this}, new Random().nextInt(), (int) Runtime.getRuntime().totalMemory(), -218606638, i2, 218606638)).booleanValue();
    }

    final Context c() {
        int i2 = f22002h * (-1804521718);
        f22002h = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = (-46183980) * f22003i;
        f22003i = i3;
        int i4 = f22004j * 118451907;
        f22004j = i4;
        return (Context) d(i2, new Object[]{this}, i4, i3, 1393938958, iElapsedRealtime, -1393938955);
    }

    final o.i.d d() {
        int i2 = 2 % 2;
        int i3 = f22005s;
        int i4 = ((109 | i3) << 1) - (i3 ^ 109);
        f22006t = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.i.d dVar = this.f22010l;
        int i5 = (((i3 + 117) - (117 & i3)) << 1) - (i3 ^ 117);
        f22006t = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    final b e() {
        int i2 = 2 % 2;
        int i3 = f22006t + 95;
        int i4 = i3 % 128;
        f22005s = i4;
        int i5 = i3 % 2;
        b bVar = this.f22013o;
        int i6 = ((13 | i4) << 1) - (i4 ^ 13);
        f22006t = i6 % 128;
        if (i6 % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    public final e f() {
        int i2 = 2 % 2;
        int i3 = f22005s + 101;
        int i4 = i3 % 128;
        f22006t = i4;
        int i5 = i3 % 2;
        e eVar = this.f22008g;
        int i6 = (i4 & 75) + ((i4 + 75) - (i4 & 75));
        f22005s = i6 % 128;
        if (i6 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final a.InterfaceC0341a h() {
        int i2 = 2 % 2;
        int i3 = f22005s;
        int i4 = (i3 & 19) + (i3 | 19);
        int i5 = i4 % 128;
        f22006t = i5;
        int i6 = i4 % 2;
        a.InterfaceC0341a interfaceC0341a = this.f22009k;
        int i7 = i5 + 69;
        f22005s = i7 % 128;
        if (i7 % 2 != 0) {
            return interfaceC0341a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Handler i() {
        int i2 = f21999c * 1488862647;
        f21999c = i2;
        int priority = Thread.currentThread().getPriority();
        int iNextInt = new Random().nextInt();
        int i3 = f21998b * (-1873876582);
        f21998b = i3;
        return (Handler) d(i2, new Object[]{this}, i3, iNextInt, -367277091, priority, 367277092);
    }
}
