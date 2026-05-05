package o.er;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.digitalcard.ClickToPayCardProfile;
import java.lang.reflect.Method;
import java.util.Random;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements o.ea.a<ClickToPayCardProfile> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f25097b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f25098c = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25099f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25100g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f25101h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25102i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f25103j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25104a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f25106e;

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f25107a = -679261802;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f25108b = -816174684;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f25109c = 1225589063;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f25110d = 12765487;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f25111e = 707974831;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f25112h = 1512314324;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f25113i = -1191884438;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f25114k = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f25115o = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f25116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f25117g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f25118j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f25119l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f25120m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f25121n;

        public e(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f25116f = str;
            this.f25117g = str2;
            this.f25118j = str3;
            this.f25119l = str4;
            this.f25121n = str5;
            this.f25120m = str6;
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            e eVar = (e) objArr[0];
            int i2 = 2 % 2;
            int i3 = f25115o;
            int i4 = (i3 ^ 121) + (((-1) - (((-1) - i3) | ((-1) - 121))) << 1);
            f25114k = i4 % 128;
            int i5 = i4 % 2;
            String str = eVar.f25121n;
            if (i5 == 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            e eVar = (e) objArr[0];
            int i2 = 2 % 2;
            int i3 = f25115o;
            int i4 = ((-1) - (((-1) - i3) | ((-1) - 125))) + ((i3 + 125) - (125 & i3));
            f25114k = i4 % 128;
            int i5 = i4 % 2;
            String str = eVar.f25118j;
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = ((-1) - (((-1) - i3) | ((-1) - 19))) + ((-1) - (((-1) - i3) & ((-1) - 19)));
            f25114k = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
            int i8 = ~i7;
            int i9 = ~i2;
            int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
            int i11 = ~i5;
            int i12 = ~((-1) - (((-1) - i9) & ((-1) - i11)));
            int i13 = (i10 + i12) - (i10 & i12);
            int i14 = (~(i5 | ((-1) - (((-1) - i9) & ((-1) - i7))))) | (~((i8 + i2) - (i8 & i2))) | (~((i11 + i8) - (i11 & i8)));
            int i15 = i7 + i2 + i6 + ((-1336646162) * i4) + (1706069763 * i3);
            int i16 = i15 * i15;
            int i17 = ((i7 * (-1709230891)) - 203685888) + ((-1709230891) * i2) + ((-1137600936) * i13) + (568800468 * i12) + ((-568800468) * i14) + (2016935936 * i6) + ((-602931200) * i4) + ((-1331167232) * i3) + ((-1604583424) * i16);
            int i18 = ((i7 * 112646815) - 831444653) + (i2 * 112646815) + (i13 * 520) + (i12 * (-260)) + (i14 * 260) + (i6 * 112647075) + (i4 * (-2078048118)) + (i3 * (-2015059991)) + (i16 * (-829161472));
            int i19 = i17 + (i18 * i18 * (-1266417664));
            if (i19 == 1) {
                return a(objArr);
            }
            if (i19 != 2) {
                return b(objArr);
            }
            e eVar = (e) objArr[0];
            int i20 = 2 % 2;
            int i21 = f25114k;
            int i22 = ((i21 + 35) - (35 | i21)) + ((i21 + 35) - (i21 & 35));
            int i23 = i22 % 128;
            f25115o = i23;
            int i24 = i22 % 2;
            String str = eVar.f25119l;
            int i25 = ((-1) - (((-1) - i23) | ((-1) - 77))) + (i23 | 77);
            f25114k = i25 % 128;
            int i26 = i25 % 2;
            return str;
        }

        public final String a() {
            int i2 = f25108b * (-315355158);
            f25108b = i2;
            int i3 = f25109c * 1761739739;
            f25109c = i3;
            int i4 = f25110d * 1489632990;
            f25110d = i4;
            return (String) d(1099404672, (int) Process.getElapsedCpuTime(), i4, i2, new Object[]{this}, i3, -1099404672);
        }

        public final String b() {
            int i2 = f25107a * (-2020098597);
            f25107a = i2;
            int i3 = f25111e * 461577263;
            f25111e = i3;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            return (String) d(581231350, new Random().nextInt(), iElapsedRealtime, i2, new Object[]{this}, i3, -581231349);
        }

        public final String c() {
            int i2 = 2 % 2;
            int i3 = f25114k;
            int i4 = ((-1) - (((-1) - i3) | ((-1) - 7))) + ((i3 + 7) - (7 & i3));
            f25115o = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f25116f;
            int i6 = ((-1) - (((-1) - i3) | ((-1) - 121))) + ((-1) - (((-1) - i3) & ((-1) - 121)));
            f25115o = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final String d() {
            String str;
            int i2 = 2 % 2;
            int i3 = f25115o;
            int i4 = (((i3 + 99) - (99 & i3)) << 1) - (i3 ^ 99);
            f25114k = i4 % 128;
            if (i4 % 2 != 0) {
                str = this.f25117g;
                int i5 = 42 / 0;
            } else {
                str = this.f25117g;
            }
            int i6 = (((-1) - (((-1) - i3) & ((-1) - 65))) << 1) - (i3 ^ 65);
            f25114k = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final String e() {
            int i2 = f25112h * 918936327;
            f25112h = i2;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i3 = 1875991940 * f25113i;
            f25113i = i3;
            return (String) d(-764060794, i3, iFreeMemory, i2, new Object[]{this}, iElapsedRealtime, 764060796);
        }

        public final String i() {
            int i2 = 2 % 2;
            int i3 = f25115o;
            int i4 = ((i3 + 45) - (45 | i3)) + (i3 | 45);
            f25114k = i4 % 128;
            if (i4 % 2 == 0) {
                return this.f25120m;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r6, short r7, byte r8) {
        /*
            int r1 = r8 + 99
            int r3 = r6 * 4
            int r2 = 1 - r3
            int r0 = r7 * 4
            int r0 = 4 - r0
            byte[] r8 = o.er.o.$$c
            byte[] r7 = new byte[r2]
            r6 = 0
            int r5 = 0 - r3
            if (r8 != 0) goto L2d
            r2 = r5
            r4 = r0
            r3 = r6
        L16:
            int r1 = -r0
            int r1 = r1 + r2
            int r0 = r4 + 1
        L1a:
            byte r2 = (byte) r1
            r7[r3] = r2
            if (r3 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            return r0
        L25:
            int r3 = r3 + 1
            r2 = r8[r0]
            r4 = r0
            r0 = r2
            r2 = r1
            goto L16
        L2d:
            r3 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.o.$$e(byte, short, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f25103j = -932458023;
        f25101h = 1320909132;
        f25100g = -959981645;
        init$0();
        f25102i = 0;
        f25099f = 1;
        f25097b = new char[]{64743, 12257, 23282, 34239, 45212, 58231, 3649, 14637, 25611, 38656, 50133, 61141, 6576, 17548, 30563, 41545, 52538, 63543, 11026, 38021, 18319, 12963, 60882, 55531, 35600, 26173, 20848, 3197, 65404, 43950, 34467, 29120, 11499, 7965, 51761, 42327, 36956, 38035, 18304, 12974, 60884, 55533, 35607, 26174, 20760, 3197, 65405, 43972, 34434, 29127, 11516, 7951, 51761, 12878, 57614, 37920, 19270, 32318, 11654, 49324, 63447, 43759, 23032, 3349, 8314, 55125, 35432, 47499, 27824, 966, 13970, 58861, 39175, 19504, 25422, 5728, 50571, 63654, 45042, 17114, 29152, 9475, 55359, 36684, 41579, 20885, 1186, 15277, 61127, 40432, 45326, 25644, 6999, 51013, 5208, 24931, 38109, 18334, 12984, 60873, 55521, 35665, 26153, 20815, 3169, 65313, 43905, 34467, 29136, 11504, 7967, 51770, 42269, 36936, 17278, 16276, 60067, 50653, 45311, 25385, 24119, 2336, 58443, 55140, 33678, 32443, 10718, 63912, 15245, 59597, 40419, 17029, 30717, 9285, 51567, 65044, 41772, 20539, 1238, 10681, 56982, 33707, 45128, 25971, 2565, 16209, 60462, 37060, 17907, 27277, 8099, 52296, 61797, 42545, 19214, 30756, 11475, 53741, 34435, 43944, 22597, 3425, 12917, 59160};
        f25098c = -1106407514593212434L;
    }

    public o(String str, String str2, e eVar) {
        this.f25105d = str;
        this.f25104a = str2;
        this.f25106e = eVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:98|33|(9:36|37|38|97|52|(2:54|61)(4:55|95|56|57)|(5:90|63|(2:66|(1:68)(1:64))(4:74|93|75|76)|69|(2:72|73))|80|81)(5:39|99|40|(1:42)(1:45)|(2:44|48)(9:46|47|38|97|52|(0)(0)|(0)|80|81))|34|37|38|97|52|(0)(0)|(0)|80|81) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0490 A[Catch: Exception -> 0x04da, TRY_LEAVE, TryCatch #4 {Exception -> 0x04da, blocks: (B:52:0x0462, B:55:0x0490, B:57:0x04cb, B:59:0x04d3, B:60:0x04d9, B:56:0x049a), top: B:97:0x0462, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] e(int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.o.e(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{35, 9, MessagePack.Code.STR32, -91};
        $$b = 59;
    }

    static void init$1() {
        $$c = new byte[]{4, 39, -92, -86};
        $$d = 103;
    }

    private static void k(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f25097b[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - ExpandableListView.getPackedPositionGroup(0L), (char) ExpandableListView.getPackedPositionGroup(0L), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 632508977, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f25098c), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 766, (char) (12470 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 12, 1946853218, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - Color.argb(0, 0, 0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 18, 39570797, false, $$e(b6, b7, (byte) ((b7 + 6) - (6 & b7))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 103;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(TextUtils.getTrimmedLength("") + 387, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), View.getDefaultSize(0, 0) + 18, 39570797, false, $$e(b8, b9, (byte) ((b9 + 6) - (6 & b9))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i10 = $10 + 93;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(short r9, short r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 2
            int r8 = 3 - r0
            int r0 = r9 * 4
            int r7 = r0 + 100
            byte[] r6 = o.er.o.$$a
            int r1 = r10 * 3
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            r2 = -1
            if (r6 != 0) goto L2d
            r0 = r3
            r1 = r8
        L18:
            int r8 = r8 + r0
        L19:
            int r2 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r2 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L28:
            int r1 = r1 + 1
            r0 = r6[r1]
            goto L18
        L2d:
            r1 = r8
            r8 = r7
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.o.l(short, short, int, java.lang.Object[]):void");
    }

    public final e a() {
        int i2 = 2 % 2;
        int i3 = f25102i + 41;
        f25099f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f25106e;
        }
        throw null;
    }

    public final ClickToPayCardProfile b() {
        int i2 = 2 % 2;
        ClickToPayCardProfile clickToPayCardProfile = new ClickToPayCardProfile(this);
        int i3 = f25102i + 45;
        f25099f = i3 % 128;
        int i4 = i3 % 2;
        return clickToPayCardProfile;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f25102i + 77;
        int i4 = i3 % 128;
        f25099f = i4;
        int i5 = i3 % 2;
        String str = this.f25105d;
        int i6 = i4 + 41;
        f25102i = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f25099f + 87;
        f25102i = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f25104a;
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        return str;
    }

    @Override // o.ea.a
    public final /* synthetic */ ClickToPayCardProfile e() {
        int i2 = 2 % 2;
        int i3 = f25099f + 15;
        f25102i = i3 % 128;
        int i4 = i3 % 2;
        ClickToPayCardProfile clickToPayCardProfileB = b();
        int i5 = f25102i + 7;
        f25099f = i5 % 128;
        int i6 = i5 % 2;
        return clickToPayCardProfileB;
    }
}
