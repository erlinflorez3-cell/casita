package o.at;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import fr.antelop.sdk.digitalcard.VirtualCardNumberOption;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.GregorianCalendar;
import o.a.l;
import o.a.o;
import o.ab.e;
import o.ab.j;
import o.bg.c;
import o.cg.b;
import o.cg.f;
import o.ep.h;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e<InterfaceC0334a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char[] f20633k = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f20634p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f20635q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static long f20636r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f20637s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f20638t = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f20639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f20640g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    o.i.d f20641j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    VirtualCardNumberOption f20642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f20643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f20644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    h f20645o;

    /* JADX INFO: renamed from: o.at.a$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20646a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20647b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f20648e = 0;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20647b = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20648e;
                int i3 = (i2 & 51) + ((-1) - (((-1) - i2) & ((-1) - 51)));
                f20646a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20647b[o.bg.a.aB.ordinal()] = 2;
                int i6 = f20646a + 83;
                f20648e = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: o.at.a$a, reason: collision with other inner class name */
    public interface InterfaceC0334a {
        void a(c cVar);

        void c(String str);
    }

    static final class d extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$k = null;
        private static final int $$l = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20649b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20650c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20651d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int[] f20652f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static long f20653g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f20654h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f20655i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static char[] f20656j = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static int f20657m = 0;

        private static String $$m(byte b2, byte b3, short s2) {
            byte[] bArr = $$k;
            int i2 = b2 * 3;
            int i3 = (s2 * 4) + 4;
            int i4 = 121 - b3;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i4 += -i2;
                i3++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i4;
                if (i5 == i2) {
                    return new String(bArr2, 0);
                }
                i4 += -bArr[i3];
                i3++;
            }
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            f20654h = 907111381;
            f20650c = -1754941623;
            f20649b = 899931757;
            f20651d = -309787179;
            f20655i = 0;
            f20657m = 1;
            f20656j = new char[]{38033, 5947, 37857, 8098, 39530, 1584, 33478, 3724, 35140, 17254, 49368, 17430, 51282, 19849, 53700, 21760, 55679, 24250, 58099, 26146, 60013, 28582, 62227, 30551, 62611, 30941, 64523, '@', 38033, 5928, 37878, 8103, 39511, 1585, 3508, 36355, 2775, 34470, 832, 40723, 7129, 38817, 4211, 44037, 10481, 42112, 8572, 48607, 14734, 47689, 13831, 45766, 20108, 38043, 5933, 3741, 36139, 2548, 34228, 'Y', 39999, 6388, 38021, 4957, 44817, 38047, 5928, 37884, 8083, 39551, 1580, 33533, 3722, 35140, 13589, 45519, 15797, 47171, 9440, 41130, 9058, 44848, 14735, 47672, 16108, 45701, 14191, 43817, 12265, 41883, 9299, 38917, 7381, 37039, 5447, 35305, 3517, 38035, 5927, 37856, 8113, 39537, 1596, 33524, 3777, 35141, 13586, 45458, 15784, 47183, 9470, 41148, 9058, 44847, 11226, 55224, 21116, 56845, 23246, 38039, 5925, 37861, 8115, 39533, 1584, 33524, 3773, 35151, 13568, 45520, 15759, 47199, 9440, 41133, 27314, 59650, 28120, 57736, 25626, 63507, 31963, 61611, 30567, 52069, 20421, 50088, 18031, 56019, 24199, 56640};
            f20653g = 4249659526709974857L;
            f20652f = new int[]{-287035134, 336234936, -560664547, 1246483581, -443316868, -375799510, -609013955, 505333799, 630158396, 822006883, 153820120, -2007459252, -647118378, 721852497, 1096372497, -1324592397, -723866710, -118767670};
        }

        d(a aVar) {
            super(aVar, true);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void A(int r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r0 = r7 * 5
                int r7 = 106 - r0
                byte[] r6 = o.at.a.d.$$a
                int r0 = r8 * 4
                int r5 = 4 - r0
                int r1 = r9 * 2
                int r0 = 1 - r1
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r6 != 0) goto L2d
                r1 = r2
                r0 = r3
            L17:
                int r5 = r5 + 1
                int r7 = r7 + r1
                r1 = r0
            L1b:
                byte r0 = (byte) r7
                r4[r1] = r0
                int r0 = r1 + 1
                if (r1 != r2) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r10[r3] = r0
                return
            L2a:
                r1 = r6[r5]
                goto L17
            L2d:
                r1 = r3
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.at.a.d.A(int, short, int, java.lang.Object[]):void");
        }

        private static void B(byte b2, int i2, short s2, Object[] objArr) {
            int i3 = (i2 * 10) + 101;
            int i4 = b2 + 4;
            int i5 = s2 * 5;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[6 - i5];
            int i6 = 5 - i5;
            int i7 = -1;
            if (bArr == null) {
                i3 = (i4 + (-i6)) - 9;
                i4 = i4;
            }
            while (true) {
                i7++;
                int i8 = i4 + 1;
                bArr2[i7] = (byte) i3;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3 = (i3 + (-bArr[i8])) - 9;
                    i4 = i8;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws Throwable {
            String str;
            Object objA;
            int i8 = ~i4;
            int i9 = ~((-1) - (((-1) - i8) & ((-1) - i6)));
            int i10 = ~i3;
            int i11 = (~((i10 + i4) - (i10 & i4))) | i9;
            int i12 = ~i6;
            int i13 = (i12 + i4) - (i12 & i4);
            int i14 = i11 | (~i13);
            int i15 = i8 | i3;
            int i16 = i9 | (~i15);
            int i17 = (~(i6 | i15)) | (~((-1) - (((-1) - ((-1) - (((-1) - i8) & ((-1) - i10)))) & ((-1) - i12))));
            int i18 = ~((i13 + i3) - (i13 & i3));
            int i19 = (i17 + i18) - (i17 & i18);
            int i20 = i4 + i3 + i2 + ((-1254723898) * i5) + ((-1667789834) * i7);
            int i21 = i20 * i20;
            int i22 = ((i4 * (-402395399)) - 1316031342) + (i3 * (-402392591)) + (i14 * (-936)) + (i16 * 1872) + (i19 * 936) + ((-402393527) * i2) + ((-1219896714) * i5) + ((-610841306) * i7) + (i21 * (-825819136));
            if (((-534547663) * i4) + 1379663872 + ((-481802647) * i3) + ((-17581672) * i14) + (35163344 * i16) + (17581672 * i19) + ((-499384320) * i2) + ((-1033371648) * i5) + ((-106430464) * i7) + (1552875520 * i21) + (i22 * i22 * (-1063190528)) != 1) {
                return c(objArr);
            }
            d dVar = (d) objArr[0];
            o.ef.a aVar = (o.ef.a) objArr[1];
            int i23 = 2 % 2;
            int i24 = f20655i + 3;
            f20657m = i24 % 128;
            int i25 = i24 % 2;
            Object[] objArr2 = new Object[1];
            v((char) TextUtils.getTrimmedLength(""), 53 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Gravity.getAbsoluteGravity(0, 0) + 2, objArr2);
            Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
            int i26 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i26;
            String str2 = (String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i26, Thread.currentThread().getPriority());
            Object[] objArr4 = new Object[1];
            z(new int[]{-1580019866, -525485506, 617665951, -1764770854}, (Process.myPid() >> 22) + 6, objArr4);
            h.e eVar = (h.e) aVar.e(h.e.class, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            z(new int[]{1997689333, -1598506651, -545751221, -1631308895, -1871770276, 1821749670, 2084036605, -1669709549}, 13 - View.combineMeasuredStates(0, 0), objArr5);
            Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
            int i27 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i27;
            String str3 = (String) o.ef.a.a(-781664457, objArr6, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i27, Thread.currentThread().getPriority());
            Object[] objArr7 = new Object[1];
            z(new int[]{1907690509, 2091124251}, (Process.myPid() >> 22) + 3, objArr7);
            Object[] objArr8 = {aVar, ((String) objArr7[0]).intern()};
            int i28 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i28;
            String str4 = (String) o.ef.a.a(-781664457, objArr8, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i28, Thread.currentThread().getPriority());
            Object[] objArr9 = new Object[1];
            v((char) (39426 - ((byte) KeyEvent.getModifierMetaStateMask())), Color.alpha(0) + 55, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, objArr9);
            Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
            int i29 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i29;
            String str5 = (String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i29, Thread.currentThread().getPriority());
            Object[] objArr11 = new Object[1];
            z(new int[]{2056191808, 11236935, 2134333091, 632205024, 437112728, -2111167638}, 9 - TextUtils.lastIndexOf("", '0', 0), objArr11);
            Object[] objArr12 = {aVar, ((String) objArr11[0]).intern()};
            int i30 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i30;
            String str6 = (String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i30, Thread.currentThread().getPriority());
            Object[] objArr13 = new Object[1];
            z(new int[]{-1359373830, 1277534448, 1404112868, 1209751060}, View.resolveSizeAndState(0, 0, 0) + 6, objArr13);
            Object[] objArr14 = {aVar, ((String) objArr13[0]).intern()};
            int i31 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i31;
            String str7 = (String) o.ef.a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i31, Thread.currentThread().getPriority());
            Object[] objArr15 = new Object[1];
            z(new int[]{-280873147, 1293720363}, TextUtils.getCapsMode("", 0, 0) + 4, objArr15);
            Object[] objArr16 = {aVar, ((String) objArr15[0]).intern()};
            int i32 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i32;
            String str8 = (String) o.ef.a.a(-781664457, objArr16, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i32, Thread.currentThread().getPriority());
            Object[] objArr17 = new Object[1];
            z(new int[]{-1213466780, 1855126467, 1170329368, 1412890793, 1816185138, 2110401061}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, objArr17);
            Date dateE = aVar.e(((String) objArr17[0]).intern(), false);
            Object[] objArr18 = new Object[1];
            v((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 64, Color.red(0) + 17, objArr18);
            Integer numG = aVar.g(((String) objArr18[0]).intern());
            Object[] objArr19 = new Object[1];
            v((char) (44303 - TextUtils.lastIndexOf("", '0', 0)), 82 - View.resolveSizeAndState(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 15, objArr19);
            Date dateE2 = aVar.e(((String) objArr19[0]).intern(), false);
            if (((a) dVar.e()).f20644n) {
                int i33 = f20655i + 21;
                f20657m = i33 % 128;
                if (i33 % 2 == 0) {
                    Object[] objArr20 = new Object[1];
                    z(new int[]{1670317747, -655923570, -280038101, 1576596265, 1971202535, -873389799}, 30 >>> Color.green(1), objArr20);
                    Object[] objArr21 = {aVar, ((String) objArr20[0]).intern()};
                    int i34 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i34;
                    objA = o.ef.a.a(-781664457, objArr21, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i34, Thread.currentThread().getPriority());
                } else {
                    Object[] objArr22 = new Object[1];
                    z(new int[]{1670317747, -655923570, -280038101, 1576596265, 1971202535, -873389799}, Color.green(0) + 11, objArr22);
                    Object[] objArr23 = {aVar, ((String) objArr22[0]).intern()};
                    int i35 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i35;
                    objA = o.ef.a.a(-781664457, objArr23, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i35, Thread.currentThread().getPriority());
                }
                str = (String) objA;
            } else {
                str = null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            int i36 = Integer.parseInt(str6.substring(0, 2));
            int i37 = Integer.parseInt(str6.substring(2, 4));
            gregorianCalendar.set(1, i36 + 2000);
            gregorianCalendar.set(2, i37);
            gregorianCalendar.set(5, 0);
            gregorianCalendar.set(11, 0);
            gregorianCalendar.set(12, 0);
            gregorianCalendar.set(13, 0);
            gregorianCalendar.set(14, 0);
            gregorianCalendar.roll(11, false);
            gregorianCalendar.roll(12, false);
            gregorianCalendar.roll(13, false);
            gregorianCalendar.roll(14, false);
            Date time = gregorianCalendar.getTime();
            if (dateE2 == null || dateE2.getTime() >= time.getTime()) {
                dateE2 = time;
            } else {
                int i38 = f20657m + 125;
                f20655i = i38 % 128;
                int i39 = i38 % 2;
            }
            ((a) dVar.e()).f20645o = new h(str2, eVar, str3, str4, str5, dateE2, str7, str8, dateE, numG);
            ((a) dVar.e()).f20643m = str;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object c(Object[] objArr) {
            d dVar = (d) objArr[0];
            int i2 = 2 % 2;
            int i3 = f20657m + 55;
            f20655i = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = ((a) dVar.e()).f20644n;
            if (i4 == 0) {
                return Boolean.valueOf(z2);
            }
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{42, -91, MessagePack.Code.MAP16, 103};
            $$b = CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY;
        }

        static void init$1() {
            $$d = new byte[]{40, 101, 74, -30, 56, MessagePack.Code.TRUE, -29, Utf8.REPLACEMENT_BYTE, MessagePack.Code.NEVER_USED};
            $$e = 57;
        }

        static void init$2() {
            $$k = new byte[]{97, 98, -19, -80};
            $$l = 235;
        }

        private static void v(char c2, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            o oVar = new o();
            long[] jArr = new long[i3];
            int i5 = 0;
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i6 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f20656j[i2 + i6])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        int gidForName = 11 - Process.getGidForName("");
                        byte b2 = (byte) i5;
                        String str$$m = $$m(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 22))), b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Integer.TYPE;
                        objA = o.d.d.a(741 - TextUtils.lastIndexOf("", '0'), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), gidForName, 632508977, false, str$$m, clsArr);
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(f20653g), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(TextUtils.indexOf("", "") + 766, (char) (Color.rgb(0, 0, 0) + 16789686), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, 1946853218, false, $$m(b3, (byte) (21 | b3), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(387 - (Process.myTid() >> 22), (char) Color.alpha(0), 18 - TextUtils.getTrimmedLength(""), 39570797, false, $$m(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 16))), b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    i5 = 0;
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
            int i7 = $10 + 105;
            $11 = i7 % 128;
            while (true) {
                int i8 = i7 % 2;
                if (oVar.f19947b >= i3) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(387 - Color.argb(0, 0, 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 39570797, false, $$m(b5, (byte) ((b5 + 16) - (16 & b5)), b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                i7 = $10 + 3;
                $11 = i7 % 128;
            }
        }

        private static void z(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2;
            int i4 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f20652f;
            int i5 = 989264422;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 101;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a((Process.myPid() >> 22) + 675, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.getMode(0) + 12, -328001469, false, $$m(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i7++;
                        i3 = 2;
                        i5 = 989264422;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f20652f;
            long j2 = 0;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i6;
                        byte b5 = b4;
                        objA2 = o.d.d.a(676 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), (char) Color.red(i6), 11 - Process.getGidForName(""), -328001469, false, $$m(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i10++;
                    j2 = 0;
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i6, iArr4, i6, length2);
            lVar.f19941d = i6;
            while (lVar.f19941d < iArr.length) {
                int i11 = $10 + 79;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i13 = 0;
                while (i13 < 16) {
                    int i14 = $11 + 57;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        lVar.f19942e ^= iArr4[i13];
                        Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA3 = o.d.d.a(2098218801);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 2);
                            objA3 = o.d.d.a(301 - KeyEvent.getDeadChar(0, 0), (char) ((Process.myPid() >> 22) + 52697), 11 - View.MeasureSpec.getSize(0), -1416256172, false, $$m(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                        i13 += 113;
                    } else {
                        lVar.f19942e ^= iArr4[i13];
                        Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA4 = o.d.d.a(2098218801);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 2);
                            objA4 = o.d.d.a(301 - (Process.myPid() >> 22), (char) (52697 - KeyEvent.normalizeMetaState(0)), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1416256172, false, $$m(b8, b9, (byte) (b9 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue2;
                        i13++;
                    }
                }
                int i15 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i15;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i16 = lVar.f19942e;
                int i17 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr6 = {lVar, lVar};
                Object objA5 = o.d.d.a(986820978);
                if (objA5 == null) {
                    int touchSlop = 229 - (ViewConfiguration.getTouchSlop() >> 8);
                    char cMakeMeasureSpec = (char) (51004 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int i18 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8;
                    byte length4 = (byte) $$k.length;
                    objA5 = o.d.d.a(touchSlop, cMakeMeasureSpec, i18, -330018025, false, $$m((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            String str = new String(cArr2, 0, i2);
            int i19 = $11 + 39;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            objArr[0] = str;
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v((char) (55206 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, 18 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            b bVar = new b(context, 39, ((String) objArr[0]).intern());
            int i3 = f20657m + 53;
            f20655i = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 21 / 0;
            }
            return bVar;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = f20650c * (-2117670577);
            f20650c = i2;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyPid = Process.myPid();
            int i3 = f20654h * (-353689219);
            f20654h = i3;
            a(iElapsedRealtime, -610807433, 610807434, iMyPid, new Object[]{this, aVar}, i2, i3);
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20657m + 25;
            f20655i = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 5001) {
                return o.bg.a.aA;
            }
            if (i2 == 5002) {
                return o.bg.a.aB;
            }
            o.bg.a aVarB = super.b(i2);
            int i6 = f20657m + 53;
            f20655i = i6 % 128;
            int i7 = i6 % 2;
            return aVarB;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x02b0  */
        @Override // o.ab.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(o.bg.c r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1114
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.at.a.d.b(o.bg.c):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20655i + 63;
            f20657m = i3 % 128;
            if (i3 % 2 != 0) {
                InterfaceC0334a interfaceC0334aG = ((a) e()).g();
                h hVar = ((a) e()).f20645o;
                interfaceC0334aG.c(((a) e()).f20643m);
            } else {
                InterfaceC0334a interfaceC0334aG2 = ((a) e()).g();
                h hVar2 = ((a) e()).f20645o;
                interfaceC0334aG2.c(((a) e()).f20643m);
                int i4 = 11 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            o.cg.j jVar = new o.cg.j(((a) e()).f20639f, ((a) e()).f20641j);
            int i3 = f20655i + 31;
            f20657m = i3 % 128;
            if (i3 % 2 != 0) {
                return jVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v((char) (Color.rgb(0, 0, 0) + 16777216), 27 - Process.getGidForName(""), 6 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((a) e()).f20640g);
            Object[] objArr2 = new Object[1];
            z(new int[]{-280873147, 1293720363}, 4 - ExpandableListView.getPackedPositionType(0L), objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) ((a) e()).f20642l.getName());
            Object[] objArr3 = new Object[1];
            z(new int[]{1754374166, 1645628758, -1260796910, -1947276107, 1536792238, 969045085, 1170329368, 1412890793}, 16 - View.MeasureSpec.getMode(0), objArr3);
            aVar.a(((String) objArr3[0]).intern(), (Object) ((a) e()).f20642l.getValidityDurationFormat());
            Object[] objArr4 = new Object[1];
            v((char) (39212 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 34, (ViewConfiguration.getEdgeSlop() >> 16) + 19, objArr4);
            aVar.a(((String) objArr4[0]).intern(), (Object) ((a) e()).f20642l.getMaxPaymentNumber());
            int i3 = f20657m + 63;
            f20655i = i3 % 128;
            if (i3 % 2 == 0) {
                return aVar;
            }
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20657m + 79;
            f20655i = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.getOffsetAfter("", 0), 9 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20657m + 89;
            f20655i = i5 % 128;
            if (i5 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20657m + 113;
            int i4 = i3 % 128;
            f20655i = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 11;
            f20657m = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20657m + 45;
            f20655i = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = AnonymousClass5.f20647b[f().c().ordinal()];
                throw null;
            }
            int i5 = AnonymousClass5.f20647b[f().c().ordinal()];
            if (i5 == 1) {
                j().c(h(), ((a) e()).f20640g);
                return;
            }
            if (i5 == 2) {
                j().d(h(), ((a) e()).f20640g);
                return;
            }
            super.s();
            int i6 = f20657m + 69;
            f20655i = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 95 / 0;
            }
        }

        @Override // o.ab.j
        public final boolean u() {
            int i2 = f20651d * (-43098063);
            f20651d = i2;
            int iMyPid = Process.myPid();
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i3 = f20649b * (-2095811682);
            f20649b = i3;
            return ((Boolean) a(iMyPid, -217676038, 217676038, iFreeMemory, new Object[]{this}, i2, i3)).booleanValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r8, byte r9, byte r10) {
        /*
            int r7 = 105 - r9
            int r0 = r10 * 4
            int r6 = 3 - r0
            byte[] r5 = o.at.a.$$d
            int r4 = r8 * 4
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r5 != 0) goto L27
            r0 = r4
            r7 = r6
            r1 = r2
        L14:
            int r6 = r6 + 1
            int r7 = r7 + r0
        L17:
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r4) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            r0 = r5[r6]
            int r1 = r1 + 1
            goto L14
        L27:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.at.a.$$j(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20634p = 0;
        f20638t = 1;
        f20637s = 0;
        f20635q = 1;
        l();
        View.combineMeasuredStates(0, 0);
        SystemClock.currentThreadTimeMillis();
        TypedValue.complexToFloat(0);
        ViewConfiguration.getScrollBarSize();
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getScrollFriction();
        int i2 = f20634p + 3;
        f20638t = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(Context context, InterfaceC0334a interfaceC0334a, o.en.b bVar) {
        super(context, interfaceC0334a, bVar, o.bg.e.f21118p);
    }

    static void init$0() {
        $$d = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED};
        $$e = 232;
    }

    static void l() {
        f20633k = new char[]{38065, 10075, 62241, 36610, 23530, 6096, 41862, 32364, 2628, 50690, 37395, 12022, 64219, 46732, 16742, 7491, 1777, 46369, 24928, 7542, 51612, 34227, 12739, 60429, 38939, 21573, 'u', 48348, 26876, 9386, 54028, 36658, 15168, 63359, 41863, 24497, 2985, 50708, 29220, 11862, 55869, 38604, 17035, 38033, 10075, 62241, 36610, 23530, 6096, 41862, 32364, 2628};
        f20636r = -378533817027778775L;
    }

    private d m() {
        int i2 = 2 % 2;
        d dVar = new d(this);
        int i3 = f20635q + 25;
        f20637s = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    private static void u(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f20633k[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 742, (char) TextUtils.getCapsMode("", 0, 0), 12 - TextUtils.indexOf("", "", 0), 632508977, false, $$j(b2, (byte) ((b2 + 6) - (6 & b2)), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f20636r), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 5);
                    objA2 = o.d.d.a(TextUtils.indexOf("", "", 0, 0) + 766, (char) (TextUtils.getTrimmedLength("") + 12470), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, 1946853218, false, $$j(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getTapTimeout() >> 16), (char) KeyEvent.keyCodeFromString(""), Process.getGidForName("") + 19, 39570797, false, $$j(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
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
            int i8 = $11 + 61;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA4 = o.d.d.a(Color.rgb(0, 0, 0) + 16777603, (char) TextUtils.getOffsetBefore("", 0), TextUtils.getOffsetAfter("", 0) + 18, 39570797, false, $$j(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i10 = $10 + 41;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20637s + 5;
        f20635q = i3 % 128;
        int i4 = i3 % 2;
        d dVarM = m();
        int i5 = f20635q + 89;
        f20637s = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return dVarM;
    }

    public final void d(o.i.d dVar, String str, String str2, VirtualCardNumberOption virtualCardNumberOption, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f20635q + 11;
        f20637s = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            u((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') - '0', 16 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            u((char) (TextUtils.lastIndexOf("", '0', 0) + 37480), 16 - TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0', 0) + 28, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(virtualCardNumberOption).toString());
        }
        this.f20641j = dVar;
        this.f20639f = str;
        this.f20640g = str2;
        this.f20642l = virtualCardNumberOption;
        this.f20644n = z2;
        a();
        int i4 = f20637s + 61;
        f20635q = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20635q + 103;
        f20637s = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        u((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), MotionEvent.axisFromString("") + 1, Color.red(0) + 16, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20635q + 113;
        f20637s = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return strIntern;
    }
}
