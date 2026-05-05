package o.cp;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.l;
import o.ea.f;
import o.ef.a;
import o.ei.d;
import o.et.g;
import o.et.j;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends o.cn.e<j> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f22544a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f22545b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f22546c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f22547d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f22548e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f22549f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22550g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22551h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22552i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22553j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f22554k = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r8, byte r9, short r10) {
        /*
            byte[] r7 = o.cp.e.$$c
            int r0 = r10 * 4
            int r6 = 1 - r0
            int r5 = 121 - r9
            int r0 = r8 * 2
            int r4 = r0 + 4
            byte[] r3 = new byte[r6]
            r2 = 0
            if (r7 != 0) goto L28
            r5 = r4
            r0 = r6
            r1 = r2
        L14:
            int r0 = -r0
            int r4 = r4 + 1
            int r5 = r5 + r0
        L18:
            byte r0 = (byte) r5
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r0 = r7[r4]
            goto L14
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cp.e.$$j(short, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f22554k = -332812665;
        init$0();
        f22545b = -1216204871;
        f22544a = -1716597778;
        f22548e = -219260278;
        f22547d = 170395401;
        f22550g = 0;
        f22552i = 1;
        f22551h = 0;
        f22553j = 1;
        c();
        ViewConfiguration.getScrollFriction();
        int i2 = f22550g + 7;
        f22552i = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i7;
        int i9 = ~i6;
        int i10 = ~(i8 | i9 | (~i4));
        int i11 = (i7 + i6) - (i7 & i6);
        int i12 = ~((i11 + i4) - (i11 & i4));
        int i13 = (i10 + i12) - (i10 & i12);
        int i14 = ~((-1) - (((-1) - i9) & ((-1) - i7)));
        int i15 = ~((i9 + i4) - (i9 & i4));
        int i16 = (i15 + i14) - (i15 & i14);
        int i17 = (-1) - (((-1) - (~((i4 + i6) - (i4 & i6)))) & ((-1) - i7));
        int i18 = i7 + i6 + i2 + (1661237432 * i3) + (961048624 * i5);
        int i19 = i18 * i18;
        int i20 = ((119520104 * i7) - 281083904) + ((-1329838950) * i6) + (i13 * 724679527) + (724679527 * i16) + ((-724679527) * i17) + ((-605159424) * i2) + ((-1559232512) * i3) + (1553989632 * i5) + (2020540416 * i19);
        int i21 = (i7 * (-2040814728)) + 92927091 + (i6 * (-2040813538)) + (i13 * (-595)) + (i16 * (-595)) + (i17 * 595) + (i2 * (-2040814133)) + (i3 * (-1614655000)) + (i5 * 500164112) + (i19 * 184877056);
        if (i20 + (i21 * i21 * 1800994816) != 1) {
            return c(objArr);
        }
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        String str3 = (String) objArr[4];
        int i22 = 2 % 2;
        int i23 = f22551h + 87;
        f22553j = i23 % 128;
        int i24 = i23 % 2;
        j jVarD = d(str, str2, iIntValue, str3);
        int i25 = f22553j + 95;
        f22551h = i25 % 128;
        int i26 = i25 % 2;
        return jVarD;
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[1];
        int i2 = 2 % 2;
        int i3 = f22551h + 9;
        f22553j = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = new Object[1];
        l(new int[]{903182682, 1740020761, 1817301152, 1650928898, 1568948449, 322221880, 104198545, -1863179875}, 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        a aVarX = aVar.x(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        n("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{66, 22, 194, 0}, false, objArr3);
        a aVarX2 = aVarX.x(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        n("\u0001\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{217, 7, 189, 1}, true, objArr4);
        Object[] objArr5 = {aVarX2, ((String) objArr4[0]).intern()};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i5 = a.f23780n * (-1229108307);
        a.f23780n = i5;
        o.ef.c cVar = (o.ef.c) a.a(-1398121910, objArr5, iMyUid, i5, 1398121917, iUptimeMillis, iElapsedRealtime);
        int i6 = f22551h + 99;
        f22553j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 43 / 0;
        }
        return cVar;
    }

    private static j c(j jVar, a aVar, int i2, String str, a aVar2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22553j + 113;
        f22551h = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = new Object[1];
        n("\u0001\u0000\u0001", new int[]{88, 3, 108, 2}, true, objArr);
        byte[] bArrZ = aVar.z(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        l(new int[]{2141220699, 1551307718, -678946257, -2024219669, 204891392, -772652236}, ImageFormat.getBitsPerPixel(0) + 11, objArr2);
        byte[] bArrZ2 = aVar.z(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        n("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{98, 11, 0, 6}, true, objArr3);
        byte[] bArrZ3 = aVar.z(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        l(new int[]{-769129106, 941696706, -257899908, -1766643421, 1100613337, 1588452420}, 10 - Color.argb(0, 0, 0, 0), objArr4);
        byte[] bArrZ4 = aVar.z(((String) objArr4[0]).intern());
        if (bArrZ != null && bArrZ2 != null && bArrZ3 != null) {
            int i6 = f22551h + 73;
            f22553j = i6 % 128;
            int i7 = i6 % 2;
            if (bArrZ4 != null) {
                j jVar2 = new j(j.a(jVar.k(), i2), jVar.g(), jVar.f(), str);
                jVar2.e(bArrZ);
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i8 = o.et.c.f25349r * 1770900040;
                o.et.c.f25349r = i8;
                int i9 = o.et.c.f25350s * 1440287991;
                o.et.c.f25350s = i9;
                int i10 = o.et.c.f25351t * 985966497;
                o.et.c.f25351t = i10;
                o.et.c.d(486595506, new Object[]{jVar2, bArrZ2}, iUptimeMillis, -486595502, i8, i9, i10);
                jVar2.b(bArrZ3);
                jVar2.j(bArrZ4);
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int iMyUid = Process.myUid();
                int i11 = g.D * 1890576045;
                g.D = i11;
                Object[] objArr5 = {jVar2, (String) g.b(1844286791, (int) SystemClock.elapsedRealtime(), iMyUid, new Object[]{jVar}, iMaxMemory, i11, -1844286790)};
                int i12 = g.f25370x * 1529702424;
                g.f25370x = i12;
                int i13 = g.C * 24801271;
                g.C = i13;
                int i14 = g.A * 1514048028;
                g.A = i14;
                int i15 = g.B * (-1276446810);
                g.B = i15;
                g.b(1622000802, i15, i13, objArr5, i12, i14, -1622000802);
                jVar2.g((byte[]) jVar.M().clone());
                jVar2.i(jVar.O());
                Object[] objArr6 = new Object[1];
                l(new int[]{903182682, 1740020761, 1817301152, 1650928898, 1568948449, 322221880, 104198545, -1863179875}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr6);
                a aVarX = aVar2.x(((String) objArr6[0]).intern());
                Object[] objArr7 = new Object[1];
                n("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{66, 22, 194, 0}, false, objArr7);
                a aVarX2 = aVarX.x(((String) objArr7[0]).intern());
                int iMyPid = Process.myPid();
                int i16 = o.et.c.f25353v * 1073314991;
                o.et.c.f25353v = i16;
                int iMyTid = Process.myTid();
                int i17 = o.et.c.f25354w * 1986112249;
                o.et.c.f25354w = i17;
                byte[] bArr = (byte[]) o.et.c.d(-1168717246, new Object[]{jVar2}, iMyPid, 1168717251, i16, iMyTid, i17);
                Object[] objArr8 = new Object[1];
                n("\u0000\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{91, 7, 169, 0}, true, objArr8);
                Object[] objArr9 = {jVar2, o.dl.b.e(bArr, aVarX2.D(((String) objArr8[0]).intern()))};
                int i18 = (int) Runtime.getRuntime().totalMemory();
                int id = (int) Thread.currentThread().getId();
                int i19 = o.et.c.f25341f * 1595628892;
                o.et.c.f25341f = i19;
                o.et.c.d(-1863692548, objArr9, i18, 1863692548, id, i19, Process.myUid());
                Object[] objArr10 = {jVar2, (byte[]) jVar.B().clone()};
                int i20 = (int) Runtime.getRuntime().totalMemory();
                int id2 = (int) Thread.currentThread().getId();
                int i21 = o.et.c.f25341f * 1595628892;
                o.et.c.f25341f = i21;
                o.et.c.d(-1863692548, objArr10, i20, 1863692548, id2, i21, Process.myUid());
                jVar2.c(jVar.L());
                jVar2.i((byte[]) jVar.K().clone());
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i22 = o.et.c.f25345n * 655284246;
                o.et.c.f25345n = i22;
                int i23 = o.et.c.f25344m * 705755884;
                o.et.c.f25344m = i23;
                int i24 = o.et.c.f25346o * (-100553870);
                o.et.c.f25346o = i24;
                jVar2.b(((Short) o.et.c.d(1163887627, new Object[]{jVar}, elapsedCpuTime, -1163887626, i22, i23, i24)).shortValue());
                byte[] bArrC = jVar2.C();
                Object[] objArr11 = new Object[1];
                n("\u0000\u0000\u0000\u0001", new int[]{182, 4, 0, 4}, true, objArr11);
                jVar2.a(d.d(bArrC, ((String) objArr11[0]).intern()));
                jVar2.d(true);
                return jVar2;
            }
        }
        if (f.a()) {
            Object[] objArr12 = new Object[1];
            l(new int[]{-117555238, -284549904, -143243436, 30377613, -1473137726, -22306372, 471293979, 1772582103, -768061279, -1368945678}, KeyEvent.getDeadChar(0, 0) + 19, objArr12);
            String strIntern = ((String) objArr12[0]).intern();
            Object[] objArr13 = new Object[1];
            l(new int[]{-1396171269, 440457921, 599615028, -655488648, -1751604713, 1961965199, -987945044, -329938625, 1016822886, -744747269, -1965057834, -1672742120, 1254090976, -1881350545, 821598719, 1857413848, -1942429474, 1859453986, -1625681761, 1804944123, -1067348285, -1904905899, -1347472335, 1206186707, -1078192121, -106009985, -581649746, -1957748308, 1451628435, -1966407740, -1708998402, -1121054947, 1416674058, 734382853, -434946850, -1429862120, -1839995636, -1262474907, 1569549125, -1626500, -1402061449, 1679441913, 2146850327, 946227358, -214009177, 1512524444, -1637458030, 1959148628, 481002320, 186863212, -317346737, 1243372305, -1883011037, 86567112}, 108 - (Process.myPid() >> 22), objArr13);
            f.c(strIntern, ((String) objArr13[0]).intern());
        }
        return null;
    }

    static void c() {
        f22546c = new int[]{92295728, -345554860, 1766337622, -2126213496, 2092700931, -479148780, -1497629382, -84197600, -535909437, -1562298050, -1949095723, 855658469, -1546598236, -303136398, 2093642854, 313640289, -430306939, -1392927579};
        f22549f = new char[]{56496, 56554, 56554, 56530, 56537, 56558, 56558, 56557, 56558, 56553, 56500, 56558, 56558, 56561, 56559, 56548, 56531, 56530, 56553, 56555, 56534, 56534, 56548, 56550, 56552, 56332, 56728, 56735, 56737, 56713, 56719, 56744, 56743, 56743, 56745, 56747, 56724, 56719, 56735, 56730, 56500, 56550, 56548, 56555, 56557, 56559, 56563, 56555, 56539, 56539, 56534, 56539, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56547, 56547, 56516, 56329, 56322, 56338, 56747, 56752, 56755, 56748, 56740, 56749, 56754, 56746, 56750, 56757, 56739, 56730, 56751, 56757, 56747, 56747, 56755, 56734, 56724, 56748, 56748, 56554, 56401, 56398, 56329, 56719, 56445, 56446, 56725, 56730, 56729, 56505, 56556, 56539, 56544, 56559, 56555, 56550, 56556, 56560, 56558, 56559, 56500, 56558, 56557, 56554, 56553, 56536, 56534, 56554, 56554, 56530, 56532, 56548, 56556, 56554, 56550, 56552, 56539, 56513, 56526, 56557, 56553, 56547, 56501, 56554, 56555, 56554, 56541, 56548, 56562, 56560, 56559, 56560, 56563, 56556, 56548, 56550, 56558, 56548, 56548, 56538, 56533, 56556, 56542, 56535, 56554, 56331, 56726, 56431, 56432, 56729, 56725, 56724, 56728, 56725, 56726, 56734, 56729, 56723, 56730, 56723, 56718, 56722, 56718, 56426, 56424, 56720, 56728, 56726, 56722, 56718, 56714, 56722, 56726, 56482, 56507, 56508, 56509, 56506, 56554, 56551, 56560, 56555, 56556, 56560, 56550, 56545, 56554, 56554, 56530, 56540, 56561, 56553, 56553, 56563, 56557, 56536, 56545, 56563, 56556, 56552, 56560, 56555, 56546, 56554, 56561, 56558, 56537, 56532, 56343, 56751, 56744, 56744, 56749, 56742, 56737, 56502, 56553, 56556, 56563, 56566, 56550, 56512, 56528, 56561, 56526, 56521, 56550, 56556, 56560, 56555, 56553, 56551, 56550, 56551, 56553, 56557, 56535, 56502, 56555, 56558, 56560, 56550, 56547, 56539, 56539, 56548, 56556, 56561, 56552, 56550, 56552, 56549, 56501, 56549, 56555, 56555, 56519, 56525, 56550, 56551, 56554, 56522, 56512, 56550, 56566, 56563, 56556, 56553, 56473, 56496, 56495};
    }

    private static j d(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        j jVar = new j(str, str2, i2, str3);
        int i4 = f22553j + 87;
        f22551h = i4 % 128;
        if (i4 % 2 == 0) {
            return jVar;
        }
        throw null;
    }

    private static j e(String str, String str2, int i2, String str3, a aVar) throws Throwable {
        int iIntValue;
        int i3 = 2 % 2;
        j jVar = new j(str, str2, i2, str3);
        Object[] objArr = new Object[1];
        l(new int[]{903182682, 1740020761, 1817301152, 1650928898, 1568948449, 322221880, 104198545, -1863179875}, (ViewConfiguration.getTapTimeout() >> 16) + 16, objArr);
        a aVarX = aVar.x(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        n("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{0, 10, 0, 0}, true, objArr2);
        a aVarX2 = aVarX.x(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        n("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{10, 15, 0, 12}, false, objArr3);
        Object[] objArr4 = {aVarX2, ((String) objArr3[0]).intern()};
        int i4 = a.f23782p * (-1576737484);
        a.f23782p = i4;
        Object[] objArr5 = {jVar, (String) a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority())};
        int i5 = g.f25370x * 1529702424;
        g.f25370x = i5;
        int i6 = g.C * 24801271;
        g.C = i6;
        int i7 = g.A * 1514048028;
        g.A = i7;
        int i8 = g.B * (-1276446810);
        g.B = i8;
        g.b(1622000802, i8, i6, objArr5, i5, i7, -1622000802);
        Object[] objArr6 = new Object[1];
        n("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{25, 15, 182, 0}, false, objArr6);
        jVar.g(aVarX2.D(((String) objArr6[0]).intern()));
        Object[] objArr7 = new Object[1];
        l(new int[]{2054286295, 352423563, 1366254189, -1616176132, -110998210, -701078333}, KeyEvent.getDeadChar(0, 0) + 11, objArr7);
        Object[] objArr8 = {aVarX2, ((String) objArr7[0]).intern()};
        int i9 = a.f23782p * (-1576737484);
        a.f23782p = i9;
        j.e.valueOf((String) a.a(-781664457, objArr8, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority()));
        Object[] objArr9 = new Object[1];
        l(new int[]{-1766735421, 1901910519, -1606981870, 260416856, -110998210, -701078333}, View.getDefaultSize(0, 0) + 11, objArr9);
        Object[] objArr10 = {aVarX2, ((String) objArr9[0]).intern()};
        int i10 = a.f23782p * (-1576737484);
        a.f23782p = i10;
        j.c.valueOf((String) a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i10, Thread.currentThread().getPriority()));
        Object[] objArr11 = new Object[1];
        n("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{40, 23, 0, 1}, true, objArr11);
        aVarX2.h(((String) objArr11[0]).intern());
        Object[] objArr12 = new Object[1];
        n("\u0000\u0000\u0001", new int[]{63, 3, 26, 1}, false, objArr12);
        Object[] objArr13 = {aVarX2, ((String) objArr12[0]).intern()};
        int i11 = a.f23782p * (-1576737484);
        a.f23782p = i11;
        jVar.i((String) a.a(-781664457, objArr13, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i11, Thread.currentThread().getPriority()));
        Object[] objArr14 = new Object[1];
        n("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{66, 22, 194, 0}, false, objArr14);
        a aVarX3 = aVarX.x(((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        n("\u0001\u0000\u0001", new int[]{88, 3, 108, 2}, true, objArr15);
        jVar.e(aVarX3.D(((String) objArr15[0]).intern()));
        int iMyPid = Process.myPid();
        int i12 = o.et.c.f25353v * 1073314991;
        o.et.c.f25353v = i12;
        int iMyTid = Process.myTid();
        int i13 = o.et.c.f25354w * 1986112249;
        o.et.c.f25354w = i13;
        byte[] bArr = (byte[]) o.et.c.d(-1168717246, new Object[]{jVar}, iMyPid, 1168717251, i12, iMyTid, i13);
        Object[] objArr16 = new Object[1];
        n("\u0000\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{91, 7, 169, 0}, true, objArr16);
        Object[] objArr17 = {jVar, o.dl.b.e(bArr, aVarX3.D(((String) objArr16[0]).intern()))};
        int i14 = (int) Runtime.getRuntime().totalMemory();
        int id = (int) Thread.currentThread().getId();
        int i15 = o.et.c.f25341f * 1595628892;
        o.et.c.f25341f = i15;
        o.et.c.d(-1863692548, objArr17, i14, 1863692548, id, i15, Process.myUid());
        Object[] objArr18 = new Object[1];
        l(new int[]{2141220699, 1551307718, -678946257, -2024219669, 204891392, -772652236}, (ViewConfiguration.getTapTimeout() >> 16) + 10, objArr18);
        Object[] objArr19 = {jVar, aVarX3.D(((String) objArr18[0]).intern())};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i16 = o.et.c.f25349r * 1770900040;
        o.et.c.f25349r = i16;
        int i17 = o.et.c.f25350s * 1440287991;
        o.et.c.f25350s = i17;
        int i18 = o.et.c.f25351t * 985966497;
        o.et.c.f25351t = i18;
        o.et.c.d(486595506, objArr19, iUptimeMillis, -486595502, i16, i17, i18);
        Object[] objArr20 = new Object[1];
        n("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{98, 11, 0, 6}, true, objArr20);
        jVar.b(aVarX3.D(((String) objArr20[0]).intern()));
        Object[] objArr21 = new Object[1];
        n("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{109, 22, 0, 0}, true, objArr21);
        Object objA = aVarX3.a(((String) objArr21[0]).intern());
        if (objA instanceof String) {
            int i19 = f22553j + 83;
            f22551h = i19 % 128;
            int i20 = i19 % 2;
            try {
                iIntValue = Integer.valueOf((String) objA, 16).intValue();
            } catch (NumberFormatException unused) {
                Object[] objArr22 = new Object[1];
                l(new int[]{224897777, 1249671257, 690211399, 1555464410, -438197735, 1875924072, 1845014337, -320024106, 627559323, -1346546470, -545930203, 1202168706, 425490743, -115641331, 887524436, 582415380, 439524382, -2016608099, 638429934, -124603974, 99862568, -1888373523, 257548157, 1367488543, 1022312743, 788086077}, 49 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr22);
                throw new o.en.f(((String) objArr22[0]).intern());
            }
        } else {
            if (!(objA instanceof Integer)) {
                Object[] objArr23 = new Object[1];
                l(new int[]{224897777, 1249671257, 690211399, 1555464410, -438197735, 1875924072, 1845014337, -320024106, 627559323, -1346546470, -545930203, 1202168706, 425490743, -115641331, 887524436, 582415380, 2074845703, -1086400322, -353024604, -876077447, 224897777, 1249671257, 690211399, 1555464410, 173694214, 1092421834, 1476418967, 1642067370}, (ViewConfiguration.getLongPressTimeout() >> 16) + 54, objArr23);
                throw new o.en.f(((String) objArr23[0]).intern());
            }
            int i21 = f22551h + 31;
            f22553j = i21 % 128;
            int i22 = i21 % 2;
            iIntValue = ((Integer) objA).intValue();
        }
        jVar.c(iIntValue);
        Object[] objArr24 = new Object[1];
        l(new int[]{-1307244118, -1552318066, -131648743, -423298522, -581649746, -1957748308, 1451628435, -1966407740, -376626082, -1005154827, -1209237191, 1917261617}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21, objArr24);
        jVar.i(aVarX3.D(((String) objArr24[0]).intern()));
        Object[] objArr25 = new Object[1];
        l(new int[]{-63774330, 1111552988, -52686653, -423945440}, 8 - (Process.myPid() >> 22), objArr25);
        Object[] objArr26 = {aVarX3, ((String) objArr25[0]).intern()};
        int i23 = a.f23782p * (-1576737484);
        a.f23782p = i23;
        j.b.valueOf((String) a.a(-781664457, objArr26, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i23, Thread.currentThread().getPriority()));
        Object[] objArr27 = new Object[1];
        l(new int[]{1192157300, -1051214884, -117898332, -670719620, 1451628435, -1966407740, 1423417608, 1192007585}, 13 - Color.argb(0, 0, 0, 0), objArr27);
        Object[] objArr28 = {aVarX3, ((String) objArr27[0]).intern()};
        int i24 = a.f23782p * (-1576737484);
        a.f23782p = i24;
        j.d.valueOf((String) a.a(-781664457, objArr28, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i24, Thread.currentThread().getPriority()));
        Object[] objArr29 = new Object[1];
        l(new int[]{1669543383, -2019123752, 1850661687, 200698107, 1629110101, -2098228035, 936927835, -160947619}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, objArr29);
        aVarX3.D(((String) objArr29[0]).intern());
        Object[] objArr30 = new Object[1];
        l(new int[]{-1122691386, 1777461944, 2067854889, 551312992, -961907413, -1670407223, -469426303, -1842213838, -2117638536, 1620301003}, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr30);
        aVarX3.h(((String) objArr30[0]).intern());
        Object[] objArr31 = new Object[1];
        n("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{131, 23, 0, 13}, false, objArr31);
        aVarX3.h(((String) objArr31[0]).intern());
        int iMyPid2 = Process.myPid();
        int i25 = o.et.c.f25353v * 1073314991;
        o.et.c.f25353v = i25;
        int iMyTid2 = Process.myTid();
        int i26 = o.et.c.f25354w * 1986112249;
        o.et.c.f25354w = i26;
        short sA = o.dl.b.a((byte[]) o.et.c.d(-1168717246, new Object[]{jVar}, iMyPid2, 1168717251, i25, iMyTid2, i26), jVar.B());
        if (sA == 0) {
            Object[] objArr32 = new Object[1];
            n("\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{154, 28, 168, 11}, false, objArr32);
            throw new o.en.f(((String) objArr32[0]).intern());
        }
        jVar.b(sA);
        byte[] bArrC = jVar.C();
        Object[] objArr33 = new Object[1];
        n("\u0000\u0000\u0000\u0001", new int[]{182, 4, 0, 4}, true, objArr33);
        jVar.a(d.d(bArrC, ((String) objArr33[0]).intern()));
        return jVar;
    }

    static void init$0() {
        $$a = new byte[]{40, 101, 74, -30};
        $$b = 71;
    }

    static void init$1() {
        $$d = new byte[]{Ascii.GS, 50, -104, 42};
        $$e = 249;
    }

    static void init$2() {
        $$c = new byte[]{125, 113, 52, MessagePack.Code.FLOAT32};
        $$i = 217;
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22546c;
        char c2 = '0';
        int i5 = 989264422;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = $10 + 59;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + i6;
                $11 = i11 % 128;
                int i12 = i11 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.lastIndexOf("", c2, 0, 0) + 676, (char) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, -328001469, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i10++;
                    i3 = 2;
                    c2 = '0';
                    i5 = 989264422;
                    i6 = 1;
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
        int[] iArr5 = f22546c;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 7;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr5[i13])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i7;
                    byte b5 = b4;
                    objA2 = o.d.d.a(674 - ImageFormat.getBitsPerPixel(i7), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.getDeadChar(i7, i7) + 12, -328001469, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i13++;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i7, iArr4, i7, length2);
        lVar.f19941d = i7;
        while (lVar.f19941d < iArr.length) {
            cArr[i7] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                lVar.f19942e ^= iArr4[i16];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 2);
                    objA3 = o.d.d.a(TextUtils.getOffsetAfter("", 0) + 301, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + MessagePack.Code.STR16), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1416256172, false, $$j(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i16++;
            }
            int i18 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i18;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i19 = lVar.f19942e;
            int i20 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                int iLastIndexOf = 228 - TextUtils.lastIndexOf("", '0', 0, 0);
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 51004);
                int edgeSlop = 9 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte length4 = (byte) $$c.length;
                objA4 = o.d.d.a(iLastIndexOf, cNormalizeMetaState, edgeSlop, -330018025, false, $$j((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i21 = $11 + 69;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:14:0x0045, B:16:0x0056, B:17:0x008b, B:35:0x00da, B:37:0x00f2, B:38:0x0122, B:50:0x01ae, B:52:0x01bf, B:53:0x01f5, B:43:0x013f, B:45:0x0158, B:46:0x0197), top: B:76:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158 A[Catch: all -> 0x0207, TryCatch #0 {all -> 0x0207, blocks: (B:14:0x0045, B:16:0x0056, B:17:0x008b, B:35:0x00da, B:37:0x00f2, B:38:0x0122, B:50:0x01ae, B:52:0x01bf, B:53:0x01f5, B:43:0x013f, B:45:0x0158, B:46:0x0197), top: B:76:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(java.lang.String r23, int[] r24, boolean r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cp.e.n(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r2 = r6 * 4
            int r1 = 1 - r2
            int r0 = r7 * 2
            int r7 = 4 - r0
            byte[] r6 = o.cp.e.$$a
            int r0 = r8 * 5
            int r5 = 106 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L2d
            r0 = r2
            r1 = r3
        L17:
            int r0 = -r0
            int r5 = r5 + r0
            int r7 = r7 + 1
        L1b:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L28:
            int r1 = r1 + 1
            r0 = r6[r7]
            goto L17
        L2d:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cp.e.p(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int r8, byte r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r9 * 4
            int r7 = 4 - r0
            byte[] r6 = o.cp.e.$$d
            int r0 = r10 * 2
            int r5 = 97 - r0
            int r1 = r8 * 2
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r6 != 0) goto L2e
            r1 = r5
            r0 = r3
            r5 = r2
        L18:
            int r5 = r5 + r1
            int r7 = r7 + 1
            r1 = r0
        L1c:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L2b:
            r1 = r6[r7]
            goto L18
        L2e:
            r1 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cp.e.q(int, byte, short, java.lang.Object[]):void");
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        Object[] objArr = {this, str, str2, Integer.valueOf(i2), str3};
        int id = (int) Thread.currentThread().getId();
        int iActiveCount = Thread.activeCount();
        int i3 = f22545b * 265249065;
        f22545b = i3;
        return (o.eq.b) a(iActiveCount, i3, id, (int) Runtime.getRuntime().freeMemory(), -1157470851, objArr, 1157470852);
    }

    @Override // o.cn.e
    public final /* synthetic */ g a(g gVar, a aVar, int i2, String str, a aVar2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22553j + 125;
        f22551h = i4 % 128;
        int i5 = i4 % 2;
        j jVarC = c((j) gVar, aVar, i2, str, aVar2);
        int i6 = f22551h + 39;
        f22553j = i6 % 128;
        int i7 = i6 % 2;
        return jVarC;
    }

    @Override // o.cn.e
    public final /* synthetic */ g b(String str, String str2, int i2, String str3, a aVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22551h + 67;
        f22553j = i4 % 128;
        int i5 = i4 % 2;
        j jVarE = e(str, str2, i2, str3, aVar);
        int i6 = f22551h + 19;
        f22553j = i6 % 128;
        if (i6 % 2 != 0) {
            return jVarE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.cn.e
    public final boolean b(int i2, a aVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22551h;
        int i5 = i4 + 3;
        f22553j = i5 % 128;
        int i6 = i5 % 2;
        if (i2 != 0) {
            int i7 = i4 + 51;
            int i8 = i7 % 128;
            f22553j = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 95;
            f22551h = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }
        Object[] objArr = new Object[1];
        l(new int[]{903182682, 1740020761, 1817301152, 1650928898, 1568948449, 322221880, 104198545, -1863179875}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr);
        a aVarX = aVar.x(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        n("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{66, 22, 194, 0}, false, objArr2);
        a aVarX2 = aVarX.x(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        n("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{186, 31, 0, 8}, true, objArr3);
        return aVarX2.C(((String) objArr3[0]).intern());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        if (r6.C(((java.lang.String) r0[0]).intern()) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        r0 = new java.lang.Object[1];
        n("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{186, 31, 0, 8}, true, r0);
        r2 = r6.x(((java.lang.String) r0[0]).intern());
        r1 = o.cp.e.f22551h + 125;
        o.cp.e.f22553j = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        r0 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r0 = new java.lang.Object[1];
        l(new int[]{903182682, 1740020761, 1817301152, 1650928898, 1568948449, 322221880, 104198545, -1863179875}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 16, r0);
        r4 = r13.x(((java.lang.String) r0[0]).intern());
        r1 = new java.lang.Object[1];
        n("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{66, 22, 194, 0}, false, r1);
        r6 = r4.x(((java.lang.String) r1[0]).intern());
        r0 = new java.lang.Object[1];
        n("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{186, 31, 0, 8}, true, r0);
     */
    @Override // o.cn.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ef.a c(int r12, o.ef.a r13) throws java.lang.Throwable {
        /*
            r11 = this;
            r10 = 2
            int r0 = r10 % r10
            int r0 = o.cp.e.f22553j
            int r1 = r0 + 79
            int r0 = r1 % 128
            o.cp.e.f22551h = r0
            int r1 = r1 % r10
            r9 = 0
            r3 = 0
            if (r1 == 0) goto L16
            r0 = 24
            int r0 = r0 / r3
            if (r12 == 0) goto L19
        L15:
            return r9
        L16:
            if (r12 == 0) goto L19
            goto L15
        L19:
            r8 = 8
            int[] r2 = new int[r8]
            r2 = {x009a: FILL_ARRAY_DATA , data: [903182682, 1740020761, 1817301152, 1650928898, 1568948449, 322221880, 104198545, -1863179875} // fill-array
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            int r0 = r0 >> 16
            int r1 = r0 + 16
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            l(r2, r1, r0)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ef.a r4 = r13.x(r0)
            r2 = 22
            r1 = 194(0xc2, float:2.72E-43)
            r0 = 66
            int[] r2 = new int[]{r0, r2, r1, r3}
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001"
            n(r0, r2, r3, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ef.a r6 = r4.x(r0)
            r5 = 186(0xba, float:2.6E-43)
            r4 = 31
            int[] r1 = new int[]{r5, r4, r3, r8}
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r2 = "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000"
            n(r2, r1, r7, r0)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r6.C(r0)
            if (r0 == r7) goto L75
            return r9
        L75:
            int[] r1 = new int[]{r5, r4, r3, r8}
            java.lang.Object[] r0 = new java.lang.Object[r7]
            n(r2, r1, r7, r0)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ef.a r2 = r6.x(r0)
            int r0 = o.cp.e.f22551h
            int r1 = r0 + 125
            int r0 = r1 % 128
            o.cp.e.f22553j = r0
            int r1 = r1 % r10
            if (r1 != 0) goto L98
            r0 = 58
            int r0 = r0 / r3
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cp.e.c(int, o.ef.a):o.ef.a");
    }

    @Override // o.cn.e
    public final o.ef.c d(a aVar) throws o.ef.b {
        int iNextInt = new Random().nextInt(1261017679);
        int i2 = 2000980487 * f22547d;
        f22547d = i2;
        int i3 = (-130160563) * f22548e;
        f22548e = i3;
        int i4 = (-315551684) * f22544a;
        f22544a = i4;
        return (o.ef.c) a(i2, i3, iNextInt, i4, -103623734, new Object[]{this, aVar}, 103623734);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0282  */
    /* JADX WARN: Type inference failed for: r3v65, types: [boolean, int] */
    @Override // o.cn.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cp.e.e():boolean");
    }
}
