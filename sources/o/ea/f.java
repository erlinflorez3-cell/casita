package o.ea;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.a.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f23508a = 0;

    /* JADX INFO: renamed from: b */
    public static int f23509b = 0;

    /* JADX INFO: renamed from: c */
    public static int f23510c = 0;

    /* JADX INFO: renamed from: d */
    public static int f23511d = 0;

    /* JADX INFO: renamed from: e */
    public static int f23512e = 0;

    /* JADX INFO: renamed from: f */
    private static char[] f23513f = null;

    /* JADX INFO: renamed from: g */
    private static char[] f23514g = null;

    /* JADX INFO: renamed from: h */
    public static int f23515h = 0;

    /* JADX INFO: renamed from: i */
    private static int f23516i = 0;

    /* JADX INFO: renamed from: j */
    private static long f23517j = 0;

    /* JADX INFO: renamed from: l */
    private static int f23518l = 0;

    /* JADX INFO: renamed from: m */
    private static int f23519m = 0;

    /* JADX INFO: renamed from: n */
    private static int f23520n = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, short r11) {
        /*
            int r0 = r11 * 4
            int r8 = 3 - r0
            int r7 = r9 + 99
            byte[] r6 = o.ea.f.$$a
            int r0 = r10 * 3
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L28
            r0 = r7
            r7 = r5
            r2 = r3
        L14:
            int r7 = r7 + r0
            r1 = r2
        L16:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r4[r1] = r0
            int r8 = r8 + 1
            if (r2 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r6[r8]
            goto L14
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.f.$$c(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23515h = 1897781860;
        f23512e = -227736238;
        f23511d = 2087957568;
        f23508a = 772385604;
        f23510c = -615855323;
        f23509b = -534762328;
        f23520n = 0;
        f23519m = 1;
        f23516i = 0;
        f23518l = 1;
        c();
        int i2 = f23520n + 45;
        f23519m = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        String str;
        String strIntern;
        int i2 = 2 % 2;
        if (!a()) {
            return null;
        }
        try {
            Object[] objArr2 = new Object[1];
            o((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 56 - TextUtils.indexOf("", "", 0), Color.alpha(0) + 113, objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            o((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 169, 15 - ExpandableListView.getPackedPositionType(0L), objArr3);
            String strIntern3 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k("\u0000\u0000\u0001\u0001\u0001", new int[]{49, 5, 0, 2}, true, objArr4);
            String strIntern4 = ((String) objArr4[0]).intern();
            try {
                Object[] objArr5 = new Object[1];
                k("\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{54, 16, 63, 0}, false, objArr5);
                if (((String) objArr5[0]).intern().isEmpty()) {
                    Object[] objArr6 = new Object[1];
                    k("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{70, 16, 62, 0}, false, objArr6);
                    str = (String) objArr6[0];
                } else {
                    Object[] objArr7 = new Object[1];
                    k("\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{54, 16, 63, 0}, false, objArr7);
                    str = (String) objArr7[0];
                }
                String strIntern5 = str.intern();
                if (o.en.b.c().a()) {
                    strIntern = o.en.b.c().n();
                } else {
                    Object[] objArr8 = new Object[1];
                    o((char) View.MeasureSpec.makeMeasureSpec(0, 0), (-1) - TextUtils.indexOf((CharSequence) "", '0'), 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr8);
                    strIntern = ((String) objArr8[0]).intern();
                }
                c.a();
                String strB = b.b();
                Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                String str2 = Build.MANUFACTURER;
                c.a();
                int iMyPid = Process.myPid();
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i3 = b.f23485f * (-1024127643);
                b.f23485f = i3;
                int i4 = b.f23487h * (-607832951);
                b.f23487h = i4;
                String str3 = String.format(strIntern2, strIntern3, strIntern4, strIntern5, strIntern, strB, numValueOf, str2, (String) b.a(iElapsedRealtime, -545900019, iMyPid, new Object[0], i4, i3, 545900022), Build.DEVICE, Build.BOOTLOADER, Build.FINGERPRINT);
                if (!a()) {
                    return null;
                }
                int i5 = f23518l + 35;
                f23516i = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr9 = new Object[1];
                k("\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{86, 6, 0, 2}, false, objArr9);
                c(((String) objArr9[0]).intern(), str3);
                int i7 = f23516i + 117;
                f23518l = i7 % 128;
                int i8 = i7 % 2;
                return null;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String a(String str) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f23518l;
        int i4 = i3 + 61;
        f23516i = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (str == null) {
            int i5 = i3 + 21;
            f23516i = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        k("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{36, 13, 0, 0}, true, new Object[1]);
        if (!str.contains(((String) r1[0]).intern())) {
            int i7 = f23516i + 23;
            f23518l = i7 % 128;
            if (i7 % 2 != 0) {
                return str;
            }
            throw null;
        }
        TextUtils.indexOf("", "");
        View.combineMeasuredStates(0, 0);
        TextUtils.indexOf("", "");
        Object[] objArr = new Object[1];
        o((char) (Drawable.resolveOpacity(0, 0) + 19896), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, 29 - ExpandableListView.getPackedPositionType(0L), objArr);
        Matcher matcher = Pattern.compile(((String) objArr[0]).intern(), 8).matcher(str);
        if (!matcher.find()) {
            return str;
        }
        int i8 = f23516i + 105;
        f23518l = i8 % 128;
        if (i8 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            o((char) ((-1) / (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 45 >> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), '|' % AndroidCharacter.getMirror('w'), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            o((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') - 28, objArr3);
            obj = objArr3[0];
        }
        return matcher.replaceFirst(((String) obj).intern());
    }

    public static boolean a() {
        int i2 = 2 % 2;
        int i3 = f23518l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f23516i = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 71;
        f23518l = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 75 / 0;
        }
        return false;
    }

    private static String b(String str, String str2, char c2) {
        Object[] objArr = {str, str2, Character.valueOf(c2)};
        int i2 = f23509b * 1757014809;
        f23509b = i2;
        int i3 = f23510c * 396359521;
        f23510c = i3;
        int iNextInt = new Random().nextInt();
        int i4 = f23508a * 1174537503;
        f23508a = i4;
        return (String) d(i2, i3, objArr, -549329241, iNextInt, 549329241, i4);
    }

    public static void b() throws Throwable {
        int i2 = (-498977415) * f23511d;
        f23511d = i2;
        int i3 = 620257954 * f23512e;
        f23512e = i3;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i4 = f23515h * 1539730836;
        f23515h = i4;
        d(i2, i3, new Object[0], 1138136590, iFreeMemory, -1138136589, i4);
    }

    public static void b(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23518l + 117;
        f23516i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        k(null, new int[]{0, 7, 107, 2}, true, objArr);
        ((String) objArr[0]).intern();
        Object[] objArr2 = {str, str2, 'W'};
        int i5 = f23509b * 1757014809;
        f23509b = i5;
        int i6 = f23510c * 396359521;
        f23510c = i6;
        int iNextInt = new Random().nextInt();
        int i7 = f23508a * 1174537503;
        f23508a = i7;
        int i8 = f23516i + 117;
        f23518l = i8 % 128;
        int i9 = i8 % 2;
    }

    static void c() {
        f23514g = new char[]{56409, 56364, 56411, 56410, 56407, 56400, 56415, 56497, 56559, 56528, 56524, 56524, 56524, 56567, 56528, 56524, 56567, 56528, 56516, 56521, 56489, 56490, 56497, 56523, 56516, 56490, 56497, 56523, 56560, 56528, 56485, 56521, 56517, 56516, 56524, 56523, 56465, 56513, 56554, 56554, 56530, 56542, 56557, 56550, 56558, 56561, 56558, 56550, 56515, 56471, 56496, 56499, 56497, 56498, 56504, 56561, 56559, 56558, 56560, 56559, 56558, 56559, 56557, 56560, 56330, 56352, 56354, 56355, 56355, 56329, 56503, 56558, 56557, 56557, 56558, 56557, 56557, 56558, 56556, 56556, 56558, 56558, 56558, 56558, 56558, 56558, 56498, 56555, 56543, 56541, 56555, 56551};
        f23513f = new char[]{38044, 7711, 33198, 2902, 38098, 7751, 33250, 55656, 21430, 52243, 18161, 62298, 28126, 59067, 4891, 36302, 1651, 45262, 11683, 42568, 53448, 19768, 51082, 28898, 60686, 26534, 36896, 2774, 34665, 12292, 43712, 10071, 20923, 51728, 18283, 61896, 38096, 7694, 33195, 2889, 48866, 8294, 43779, 24227, 49270, 19403, 64886, 24603, 60400, 40304, 128, 35376, 15704, 41152, 10856, 56728, 38070, 7695, 33184, 2895, 48885, 8234, 43819, 24244, 49236, 19397, 64880, 24599, 60339, 40254, 203, 35445, 15644, 41168, 10850, 56730, 18226, 51882, 32177, 59198, 27353, 7184, 34722, 2714, 48247, 10169, 43266, 23743, 51073, 18759, 64743, 26185, 59890, 37674, 1602, 35322, 13074, 42749, 10339, 54038, 18110, 51247, 29654, 58682, 26683, 5006, 34168, 2202, 45623, 9721, 43202, 21114, 50578, 20234, 62147, 26004, 61238, 37560, 1101, 36851, 12950, 42058, 12263, 53577, 17586, 52783, 28945, 58618, 28178, 4490, 39714, 3646, 45495, 15164, 44747, 20601, 56087, 20176, 61538, 31647, 60769, 37034, 7111, 36137, 12434, 47690, 11687, 53385, 23090, 52714, 30479, 64186, 28122, 5967, 39601, 3091, 47026, 14634, 44098, 22522, 55668, 19661, 63090, 31040, 60658, 38442, 6535, 33641, 13842, 38018, 7704, 33197, 2910, 48831, 8302, 43779, 24236, 49243, 19420, 64875, 24607, 60348, 40238, 195};
        f23517j = 7804688836212629098L;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r9, java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.f.c(java.lang.String, java.lang.Object):void");
    }

    public static /* synthetic */ Object d(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = (-1) - (((-1) - ((-1) - (((-1) - i6) & ((-1) - i8)))) & ((-1) - i9));
        int i11 = ~((-1) - (((-1) - i2) & ((-1) - i8)));
        int i12 = ~i6;
        int i13 = ~(i8 | i9);
        int i14 = (i13 + i12) - (i13 & i12);
        int i15 = i6 + i4 + i3 + ((-1537480081) * i5) + ((-1176924877) * i7);
        int i16 = i15 * i15;
        int i17 = (((-324914750) * i6) - 1179058176) + ((-1443770816) * i4) + (1588055615 * i10) + (i11 * (-1588055615)) + ((-1588055615) * i14) + (1263140864 * i3) + (1226178560 * i5) + ((-1044512768) * i7) + (1201733632 * i16);
        int i18 = (i6 * 1018573086) + 1206756779 + (i4 * 1018572224) + (i10 * (-431)) + (i11 * 431) + (i14 * 431) + (i3 * 1018572655) + (i5 * (-758184159)) + (i7 * (-595421667)) + (i16 * (-1647378432));
        return i17 + ((i18 * i18) * 1518272512) != 1 ? e(objArr) : a(objArr);
    }

    public static void d(String str, String str2) throws Throwable {
        Object objD;
        int i2 = 2 % 2;
        int i3 = f23516i + 7;
        f23518l = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            k(null, new int[]{0, 7, 107, 2}, false, objArr);
            ((String) objArr[0]).intern();
            int i4 = f23509b * 1757014809;
            f23509b = i4;
            int i5 = f23510c * 396359521;
            f23510c = i5;
            int iNextInt = new Random().nextInt();
            int i6 = f23508a * 1174537503;
            f23508a = i6;
            objD = d(i4, i5, new Object[]{str, str2, 'r'}, -549329241, iNextInt, 549329241, i6);
        } else {
            Object[] objArr2 = new Object[1];
            k(null, new int[]{0, 7, 107, 2}, true, objArr2);
            ((String) objArr2[0]).intern();
            int i7 = f23509b * 1757014809;
            f23509b = i7;
            int i8 = f23510c * 396359521;
            f23510c = i8;
            int iNextInt2 = new Random().nextInt();
            int i9 = f23508a * 1174537503;
            f23508a = i9;
            objD = d(i7, i8, new Object[]{str, str2, 'E'}, -549329241, iNextInt2, 549329241, i9);
        }
        int i10 = f23516i + 95;
        f23518l = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static void d(String str, String str2, Throwable th) throws Throwable {
        Object objD;
        int i2 = 2 % 2;
        int i3 = f23518l + 109;
        f23516i = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            k(null, new int[]{0, 7, 107, 2}, true, objArr);
            ((String) objArr[0]).intern();
            int i4 = f23509b * 1757014809;
            f23509b = i4;
            int i5 = f23510c * 396359521;
            f23510c = i5;
            int iNextInt = new Random().nextInt();
            int i6 = f23508a * 1174537503;
            f23508a = i6;
            objD = d(i4, i5, new Object[]{str, str2, (char) 11}, -549329241, iNextInt, 549329241, i6);
        } else {
            Object[] objArr2 = new Object[1];
            k(null, new int[]{0, 7, 107, 2}, true, objArr2);
            ((String) objArr2[0]).intern();
            int i7 = f23509b * 1757014809;
            f23509b = i7;
            int i8 = f23510c * 396359521;
            f23510c = i8;
            int iNextInt2 = new Random().nextInt();
            int i9 = f23508a * 1174537503;
            f23508a = i9;
            objD = d(i7, i8, new Object[]{str, str2, 'W'}, -549329241, iNextInt2, 549329241, i9);
        }
        int i10 = f23518l + 21;
        f23516i = i10 % 128;
        int i11 = i10 % 2;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        String string;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        char cCharValue = ((Character) objArr[2]).charValue();
        int i2 = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jNanoTime = System.nanoTime();
        Locale localeD = g.d();
        Object[] objArr2 = new Object[1];
        k("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{7, 23, 0, 6}, false, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        k("\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{30, 6, 0, 1}, false, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis / 1000);
        Long lValueOf2 = Long.valueOf(jCurrentTimeMillis % 1000);
        Long lValueOf3 = Long.valueOf((jNanoTime / 1000) % 1000);
        Character chValueOf = Character.valueOf(cCharValue);
        if (str == null) {
            int i3 = f23516i + 89;
            f23518l = i3 % 128;
            int i4 = i3 % 2;
            string = "";
        } else {
            StringBuilder sbAppend = new StringBuilder().append(str);
            Object[] objArr4 = new Object[1];
            o((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 4, 2 - ExpandableListView.getPackedPositionChild(0L), objArr4);
            string = sbAppend.append(((String) objArr4[0]).intern()).toString();
        }
        String str3 = String.format(localeD, strIntern, strIntern2, lValueOf, lValueOf2, lValueOf3, chValueOf, string, str2);
        int i5 = f23516i + 125;
        f23518l = i5 % 128;
        if (i5 % 2 != 0) {
            return str3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void e(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23518l + 63;
        f23516i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        k(null, new int[]{0, 7, 107, 2}, true, objArr);
        ((String) objArr[0]).intern();
        Object[] objArr2 = {null, str, 'E'};
        int i5 = f23509b * 1757014809;
        f23509b = i5;
        int i6 = f23510c * 396359521;
        f23510c = i6;
        int iNextInt = new Random().nextInt();
        int i7 = f23508a * 1174537503;
        f23508a = i7;
        int i8 = f23516i + 79;
        f23518l = i8 % 128;
        int i9 = i8 % 2;
    }

    public static void e(String str, String str2, Throwable th) throws Throwable {
        Object objD;
        int i2 = 2 % 2;
        int i3 = f23516i + 19;
        f23518l = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            k(null, new int[]{0, 7, 107, 2}, true, objArr);
            ((String) objArr[0]).intern();
            int i4 = f23509b * 1757014809;
            f23509b = i4;
            int i5 = f23510c * 396359521;
            f23510c = i5;
            int iNextInt = new Random().nextInt();
            int i6 = f23508a * 1174537503;
            f23508a = i6;
            objD = d(i4, i5, new Object[]{str, str2, (char) 24}, -549329241, iNextInt, 549329241, i6);
        } else {
            Object[] objArr2 = new Object[1];
            k(null, new int[]{0, 7, 107, 2}, true, objArr2);
            ((String) objArr2[0]).intern();
            int i7 = f23509b * 1757014809;
            f23509b = i7;
            int i8 = f23510c * 396359521;
            f23510c = i8;
            int iNextInt2 = new Random().nextInt();
            int i9 = f23508a * 1174537503;
            f23508a = i9;
            objD = d(i7, i8, new Object[]{str, str2, 'E'}, -549329241, iNextInt2, 549329241, i9);
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.CR, MessagePack.Code.FALSE, -97, -84};
        $$b = 36;
    }

    private static void k(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 65;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        o.a.m mVar = new o.a.m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = f23514g;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        objA = o.d.d.a((Process.myPid() >> 22) + 249, (char) ((SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(i6) + 12, 1376582792, false, $$c((byte) 17, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    i6 = 0;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr, i7, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i8) {
                int i12 = $10 + 107;
                $11 = i12 % 128;
                if (i12 % 2 != 0 ? bArr[mVar.f19943d] != 1 : bArr[mVar.f19943d] != 0) {
                    int i13 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(1632715197);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(835 - TextUtils.indexOf((CharSequence) "", '0'), (char) (27279 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1210801192, false, $$c((byte) 21, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = $11 + 75;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(120026474);
                    if (objA3 == null) {
                        objA3 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, (char) Drawable.resolveOpacity(0, 0), 9 - TextUtils.lastIndexOf("", '0', 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 21, (char) (35715 - (KeyEvent.getMaxKeyCode() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            int i17 = $11 + 111;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            char[] cArr5 = new char[i8];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i19 = i8 - i10;
            System.arraycopy(cArr5, 0, cArr3, i19, i10);
            System.arraycopy(cArr5, i10, cArr3, 0, i19);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i8];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i8 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i9 > 0) {
            int i20 = 0;
            while (true) {
                mVar.f19943d = i20;
                if (mVar.f19943d >= i8) {
                    break;
                }
                int i21 = $11 + 79;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i20 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void o(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f23513f[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - ExpandableListView.getPackedPositionType(0L), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f23517j), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(TextUtils.indexOf("", "") + 766, (char) (View.resolveSizeAndState(0, 0, 0) + 12470), View.combineMeasuredStates(0, 0) + 12, 1946853218, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(388 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 39570797, false, $$c((byte) 6, b6, b6), new Class[]{Object.class, Object.class});
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
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a(387 - View.combineMeasuredStates(0, 0), (char) TextUtils.getCapsMode("", 0, 0), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 39570797, false, $$c((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i6 = $10 + 101;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = new String(cArr);
        int i8 = $10 + 91;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 74 / 0;
            objArr[0] = str;
        }
    }
}
