package o.bg;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.google.common.base.Ascii;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.dd.g;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21082a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f21083c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f21084d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f21085e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21086i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static byte[] f21087k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static short[] f21088l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21089m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21090n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21091o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f21092p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f21093q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f21094r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f21095s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f21096t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f21097u = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f21098b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f21099f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21101h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21102j = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f21100g = new b();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r8, short r9, byte r10) {
        /*
            byte[] r7 = o.bg.c.$$c
            int r6 = r10 + 4
            int r5 = 104 - r9
            int r1 = r8 * 3
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L27
            r0 = r5
            r1 = r3
            r5 = r2
        L14:
            int r5 = r5 + r0
        L15:
            int r6 = r6 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r7[r6]
            goto L14
        L27:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bg.c.$$e(int, short, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f21097u = -479811385;
        f21096t = -116721012;
        f21095s = 2065133840;
        f21093q = 511615547;
        f21092p = -1338099003;
        init$0();
        f21083c = -1450178540;
        f21082a = 1966679975;
        f21085e = 119536822;
        f21084d = -1702165176;
        f21091o = 0;
        f21094r = 1;
        f21086i = -1587640118;
        f21090n = 1150422452;
        f21089m = -186965118;
        f21087k = new byte[]{87, 60, 50, MessagePack.Code.INT32, Base64.padSymbol, 52, MessagePack.Code.TRUE, 60, -17, Ascii.DC2, MessagePack.Code.UINT32, Base64.padSymbol, MessagePack.Code.TRUE, 49, MessagePack.Code.INT8, 62, -30, Ascii.DC2, MessagePack.Code.EXT32, 84, 86, -91, 91, -87, 72, -90, 122, -119, 88, 114, -124, -94, 94, -82, 80, 83, -79, 90, 113, MessagePack.Code.FIXARRAY_PREFIX, 126, -94, -107, 56, -121, MessagePack.Code.FALSE, 73, 120, 121, 126, -115, 117, -114, 98, -118, -123, -123, 104, 121, -110, 108, -127, -114, 116, -121, 122, -107, -77, 79, 126, -126, -127, -123, 104, 121, MessagePack.Code.FALSE, 79, 117, -108, 122, -122, -78, 68, -128, 112, 123, -118, 125, -69, 59, 125, -127, MessagePack.Code.TRUE, 71, MessagePack.Code.NIL, MessagePack.Code.NIL, 107, -120, -114, 125, 118, -124, 126, 113, -115, 117, 117, -104, -119, 121, 64, -76, 112, -128, -117, 122, -115, 75, MessagePack.Code.FLOAT64, -115, 113, 51, -69, -125, -118, 117, 54, 69, 102, -15, Ascii.RS, -10, -9, Ascii.VT, 8, Ascii.FF, -31, -16, 75, MessagePack.Code.BIN32, -9, Ascii.VT, 8, Ascii.FF, -31, -16, 75, MessagePack.Code.BIN32, -4, Ascii.GS, -13, Ascii.SI, 59, MessagePack.Code.UINT16, 9, -7, -14, 3, -12, 50, -78, -12, 8, 74};
    }

    public c(e eVar) {
        this.f21098b = eVar;
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = ~i2;
        int i11 = (-1) - (((-1) - (~((i9 + i10) - (i9 & i10)))) & ((-1) - i8));
        int i12 = ~(i5 | i6);
        int i13 = (i2 + i12) - (i2 & i12);
        int i14 = (~((i2 + i6) - (i2 & i6))) | ((-1) - (((-1) - ((~((-1) - (((-1) - ((i8 + i9) - (i8 & i9))) & ((-1) - i10)))) | i12)) & ((-1) - (~((i5 + i2) - (i5 & i2))))));
        int i15 = i5 + i6 + i4 + (1272450877 * i3) + ((-51365948) * i7);
        int i16 = i15 * i15;
        int i17 = ((-261444822) * i5) + 922746880 + ((-1437248296) * i6) + ((-1175803474) * i11) + (i13 * 587901737) + (587901737 * i14) + ((-849346560) * i4) + ((-1881145344) * i3) + ((-578813952) * i7) + ((-124846080) * i16);
        int i18 = (i5 * 1187242746) + 1002376400 + (i6 * 1187242392) + (i11 * (-354)) + (i13 * 177) + (i14 * 177) + (i4 * 1187242569) + (i3 * (-1484311963)) + (i7 * 1141305060) + (i16 * 516358144);
        if (i17 + (i18 * i18 * (-861863936)) == 1) {
            return e(objArr);
        }
        c cVar = (c) objArr[0];
        int i19 = 2 % 2;
        int i20 = f21091o + 57;
        f21094r = i20 % 128;
        if (i20 % 2 == 0) {
            cVar.f21102j = true;
            cVar.f21099f = null;
            Object[] objArr2 = {cVar.f21100g};
            int i21 = b.f21069j * (-1147357663);
            b.f21069j = i21;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i22 = b.f21066g * (-2117190377);
            b.f21066g = i22;
            int i23 = b.f21067h * 1957287060;
            b.f21067h = i23;
            b.c(961351511, objArr2, i21, i23, i22, -961351509, iMaxMemory);
        } else {
            cVar.f21102j = true;
            cVar.f21099f = null;
            Object[] objArr3 = {cVar.f21100g};
            int i24 = b.f21069j * (-1147357663);
            b.f21069j = i24;
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i25 = b.f21066g * (-2117190377);
            b.f21066g = i25;
            int i26 = b.f21067h * 1957287060;
            b.f21067h = i26;
            b.c(961351511, objArr3, i24, i26, i25, -961351509, iMaxMemory2);
        }
        int i27 = f21091o + 67;
        f21094r = i27 % 128;
        int i28 = i27 % 2;
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:28|(2:89|29)|(2:31|(3:33|90|34))(4:37|95|38|(7:40|92|46|(2:48|49)(4:52|87|53|54)|(5:100|58|(1:60)(5:71|101|72|73|(2:63|(1:65)(0)))|61|(0))|77|78)(1:41))|45|92|46|(0)(0)|(0)|77|78) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x05f8, code lost:
    
        if (r1 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x05fa, code lost:
    
        r3 = r4 + 11;
        o.bg.c.f21094r = r3 % 128;
        r3 = r3 % 2;
        r4 = new java.lang.Object[]{new int[]{r25 ^ (r25 << 5)}, new int[]{r24}, r1, new int[]{r24 ^ 20}};
        r6 = o.bg.c.f21097u * 164860317;
        o.bg.c.f21097u = r6;
        r5 = ~((-16542646) | r6);
        r25 = r25 + (((((-1075127621) + (((r5 + 6824737) - (r5 & 6824737)) * (-140))) + ((~(((-9717909) + r6) - ((-9717909) & r6))) * 70)) + (((~((-1) - (((-1) - r6) & ((-1) - 694690667)))) | (-697583839)) * 70)) + 16);
        r25 = r25 ^ (r25 << 13);
        r25 = r25 ^ (r25 >>> 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x066b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x066c, code lost:
    
        if (r1 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0598 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x053f A[Catch: Exception -> 0x053b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x053b, blocks: (B:46:0x04ef, B:52:0x053f, B:54:0x0589, B:56:0x0591, B:57:0x0597, B:53:0x0549), top: B:92:0x04ef, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] b(int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bg.c.b(int, int):java.lang.Object[]");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f21091o + 67;
        int i4 = i3 % 128;
        f21094r = i4;
        int i5 = i3 % 2;
        boolean z2 = cVar.f21102j;
        int i6 = i4 + 5;
        f21091o = i6 % 128;
        if (i6 % 2 == 0) {
            return Boolean.valueOf(z2);
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{8, -110, 120, 122};
        $$b = 247;
    }

    static void init$1() {
        $$c = new byte[]{113, 60, -124, 107};
        $$d = 139;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void v(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bg.c.v(short, int, int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(int r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            int r8 = r11 * 3
            int r1 = r8 + 1
            int r0 = r9 * 3
            int r7 = 4 - r0
            byte[] r6 = o.bg.c.$$a
            int r0 = r10 * 4
            int r5 = 100 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L2c
            r0 = r7
            r2 = r3
        L15:
            int r7 = r7 + 1
            int r0 = -r0
            int r5 = r5 + r0
            r1 = r2
        L1a:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r8) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L29:
            r0 = r6[r7]
            goto L15
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bg.c.w(int, int, int, java.lang.Object[]):void");
    }

    public final String a() {
        int i2 = 2 % 2;
        String str = this.f21101h;
        if (str != null) {
            int i3 = f21091o + 3;
            f21094r = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        int i5 = f21091o + 3;
        f21094r = i5 % 128;
        if (i5 % 2 != 0) {
            return "";
        }
        throw null;
    }

    public final e b() {
        int i2 = 2 % 2;
        int i3 = f21094r + 19;
        int i4 = i3 % 128;
        f21091o = i4;
        int i5 = i3 % 2;
        e eVar = this.f21098b;
        int i6 = i4 + 35;
        f21094r = i6 % 128;
        int i7 = i6 % 2;
        return eVar;
    }

    public final void b(Context context, o.en.b bVar, o.fj.e eVar) {
        int i2 = 2 % 2;
        if (!eVar.d()) {
            int i3 = f21094r + 41;
            f21091o = i3 % 128;
            int i4 = i3 % 2;
            this.f21102j = false;
            this.f21099f = a.f21048q;
        }
        this.f21100g.b(eVar.e());
        if (!(!eVar.a())) {
            Object[] objArr = {this.f21100g, context, bVar, g.f22880y};
            int i5 = b.f21063c * (-1736728553);
            b.f21063c = i5;
            int i6 = b.f21064d * 798932806;
            b.f21064d = i6;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i7 = b.f21061a * 1360672158;
            b.f21061a = i7;
            b.c(-717841723, objArr, i5, i7, iElapsedRealtime, 717841723, i6);
            return;
        }
        if (eVar.j().j()) {
            Object[] objArr2 = {this.f21100g, context, bVar, g.f22859d};
            int i8 = b.f21063c * (-1736728553);
            b.f21063c = i8;
            int i9 = b.f21064d * 798932806;
            b.f21064d = i9;
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i10 = b.f21061a * 1360672158;
            b.f21061a = i10;
            b.c(-717841723, objArr2, i8, i10, iElapsedRealtime2, 717841723, i9);
            return;
        }
        Object[] objArr3 = {eVar.j()};
        int i11 = o.fj.b.f25900a * 2074538373;
        o.fj.b.f25900a = i11;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int priority = Thread.currentThread().getPriority();
        int i12 = o.fj.b.f25905f * (-1617323965);
        o.fj.b.f25905f = i12;
        if (!((Boolean) o.fj.b.e(-1239314065, iMaxMemory, i11, 1239314066, objArr3, i12, priority)).booleanValue()) {
            int i13 = f21091o + 71;
            f21094r = i13 % 128;
            int i14 = i13 % 2;
            if (!eVar.b()) {
                return;
            }
        }
        Object[] objArr4 = {this.f21100g, context, bVar, g.f22858c};
        int i15 = b.f21063c * (-1736728553);
        b.f21063c = i15;
        int i16 = b.f21064d * 798932806;
        b.f21064d = i16;
        int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
        int i17 = b.f21061a * 1360672158;
        b.f21061a = i17;
        b.c(-717841723, objArr4, i15, i17, iElapsedRealtime3, 717841723, i16);
        int i18 = f21094r + 39;
        f21091o = i18 % 128;
        int i19 = i18 % 2;
    }

    public final a c() {
        int i2 = 2 % 2;
        int i3 = f21091o + 13;
        int i4 = i3 % 128;
        f21094r = i4;
        int i5 = i3 % 2;
        a aVar = this.f21099f;
        int i6 = i4 + 69;
        f21091o = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return aVar;
    }

    public final void c(a aVar, String str) {
        int i2 = 2 % 2;
        int i3 = f21094r;
        int i4 = i3 + 117;
        f21091o = i4 % 128;
        int i5 = i4 % 2;
        this.f21102j = false;
        this.f21099f = aVar;
        this.f21101h = str;
        int i6 = i3 + 17;
        f21091o = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void d(a aVar) {
        int i2 = 2 % 2;
        int i3 = f21094r + 29;
        int i4 = i3 % 128;
        f21091o = i4;
        int i5 = i3 % 2;
        this.f21102j = false;
        this.f21099f = aVar;
        this.f21101h = null;
        int i6 = i4 + 103;
        f21094r = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean d() {
        int i2 = f21082a * 1232037242;
        f21082a = i2;
        int iMyUid = Process.myUid();
        int i3 = f21083c * 1942342535;
        f21083c = i3;
        return ((Boolean) a(i2, i3, iMyUid, -1017985026, new Object[]{this}, 1017985027, new Random().nextInt())).booleanValue();
    }

    public final b e() {
        int i2 = 2 % 2;
        int i3 = f21091o + 11;
        f21094r = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f21100g;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void j() {
        int i2 = f21084d * 408235578;
        f21084d = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int priority = Thread.currentThread().getPriority();
        int i3 = f21085e * (-1327944260);
        f21085e = i3;
        a(i2, priority, iElapsedRealtime, -1640167031, new Object[]{this}, 1640167031, i3);
    }
}
