package o.ch;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.a.o;
import o.a.q;
import o.cn.e;
import o.ei.d;
import o.en.f;
import o.et.b;
import o.et.c;
import o.et.g;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e<b> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f22392a = 0;

    /* JADX INFO: renamed from: b */
    public static int f22393b = 0;

    /* JADX INFO: renamed from: c */
    public static int f22394c = 0;

    /* JADX INFO: renamed from: d */
    public static int f22395d = 0;

    /* JADX INFO: renamed from: e */
    private static long f22396e = 0;

    /* JADX INFO: renamed from: f */
    private static int f22397f = 0;

    /* JADX INFO: renamed from: g */
    private static int f22398g = 0;

    /* JADX INFO: renamed from: h */
    private static int f22399h = 0;

    /* JADX INFO: renamed from: i */
    private static long f22400i = 0;

    /* JADX INFO: renamed from: j */
    private static char[] f22401j = null;

    /* JADX INFO: renamed from: n */
    private static int f22402n = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, byte r11) {
        /*
            byte[] r8 = o.ch.a.$$a
            int r2 = r11 * 4
            int r1 = 1 - r2
            int r7 = r10 + 71
            int r0 = r9 * 2
            int r6 = 4 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2a
            r0 = r3
            r2 = r4
        L15:
            int r6 = r6 + 1
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L1a:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r8[r6]
            goto L15
        L2a:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ch.a.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22395d = 266066349;
        f22392a = 1655684012;
        f22394c = -772292986;
        f22393b = -1638328738;
        f22397f = 0;
        f22402n = 1;
        f22399h = 0;
        f22398g = 1;
        c();
        ViewConfiguration.getScrollFriction();
        int i2 = f22397f + 13;
        f22402n = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        String str3 = (String) objArr[4];
        int i2 = 2 % 2;
        int i3 = f22398g + 101;
        f22399h = i3 % 128;
        int i4 = i3 % 2;
        b bVarD = d(str, str2, iIntValue, str3);
        if (i4 != 0) {
            int i5 = 17 / 0;
        }
        return bVarD;
    }

    private static b b(b bVar, o.ef.a aVar, int i2, String str) throws Throwable {
        int i3 = 2 % 2;
        b bVar2 = new b(b.a(bVar.k(), i2), bVar.g(), bVar.f(), str);
        bVar2.d(true);
        Object[] objArr = new Object[1];
        k("ॣ锼㇞\udc6b砰Ҭꍌ俬", 40032 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        Object[] objArr2 = {bVar2, o.dl.b.c(aVar.D(((String) objArr[0]).intern()))};
        int i4 = (int) Runtime.getRuntime().totalMemory();
        int id = (int) Thread.currentThread().getId();
        int i5 = c.f25341f * 1595628892;
        c.f25341f = i5;
        c.d(-1863692548, objArr2, i4, 1863692548, id, i5, Process.myUid());
        Object[] objArr3 = new Object[1];
        l((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58372), 8 - (ViewConfiguration.getEdgeSlop() >> 16), 2 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        Object[] objArr4 = {bVar2, aVar.D(((String) objArr3[0]).intern())};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i6 = c.f25349r * 1770900040;
        c.f25349r = i6;
        int i7 = c.f25350s * 1440287991;
        c.f25350s = i7;
        int i8 = c.f25351t * 985966497;
        c.f25351t = i8;
        c.d(486595506, objArr4, iUptimeMillis, -486595502, i6, i7, i8);
        byte[] bArrE = e(bVar2.C());
        if (bArrE == null) {
            Object[] objArr5 = new Object[1];
            l((char) (Color.rgb(0, 0, 0) + 16777216), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, View.resolveSize(0, 0) + 44, objArr5);
            throw new f(((String) objArr5[0]).intern());
        }
        bVar2.e(bArrE);
        int iMyPid = Process.myPid();
        int i9 = c.f25353v * 1073314991;
        c.f25353v = i9;
        int iMyTid = Process.myTid();
        int i10 = c.f25354w * 1986112249;
        c.f25354w = i10;
        bVar2.b(o.dl.b.a((byte[]) c.d(-1168717246, new Object[]{bVar2}, iMyPid, 1168717251, i9, iMyTid, i10), bVar2.B()));
        byte[] bArrC = bVar2.C();
        Object[] objArr6 = new Object[1];
        k("द\uee68읛볠", ExpandableListView.getPackedPositionGroup(0L) + 59197, objArr6);
        bVar2.a(d.d(bArrC, ((String) objArr6[0]).intern()));
        bVar2.g(bVar.M());
        bVar2.j(bVar.N());
        bVar2.e(bVar.b());
        Object[] objArr7 = {bVar2, Integer.valueOf(bVar.c())};
        int iMyTid2 = Process.myTid();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i11 = b.f25339i * (-1021380914);
        b.f25339i = i11;
        int i12 = b.f25337g * (-1997134821);
        b.f25337g = i12;
        b.b(1126453636, i12, iElapsedRealtime, iMyTid2, i11, -1126453636, objArr7);
        int i13 = b.f25340j * (-1575480416);
        b.f25340j = i13;
        int i14 = b.f25338h * 718567752;
        b.f25338h = i14;
        bVar2.d(((Byte) b.b(-1231883028, new Random().nextInt(), i14, i13, (int) Runtime.getRuntime().maxMemory(), 1231883029, new Object[]{bVar})).byteValue());
        bVar2.b(bVar.J());
        bVar2.c(bVar.L());
        int i15 = f22399h + 55;
        f22398g = i15 % 128;
        int i16 = i15 % 2;
        return bVar2;
    }

    private static b c(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        int i3 = 2 % 2;
        Object[] objArr = new Object[1];
        k("ृᱷ⍠㙰嵨恫睩驴ꅚ둊\udb40", 5382 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        o.ef.a aVarX = aVar.x(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        l((char) (13737 - TextUtils.indexOf("", "", 0, 0)), ViewConfiguration.getWindowTouchSlop() >> 8, 8 - KeyEvent.getDeadChar(0, 0), objArr2);
        Object[] objArr3 = {aVarX, ((String) objArr2[0]).intern()};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i4 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = i4;
        o.ef.a aVarD = ((o.ef.c) o.ef.a.a(-1398121910, objArr3, iMyUid, i4, 1398121917, iUptimeMillis, iElapsedRealtime)).d(0);
        b bVar = new b(str, str2, i2, str3);
        bVar.d(false);
        Object[] objArr4 = new Object[1];
        k("ॣ锼㇞\udc6b砰Ҭꍌ俬", (ViewConfiguration.getJumpTapTimeout() >> 16) + 40031, objArr4);
        Object[] objArr5 = {bVar, o.dl.b.c(aVarD.D(((String) objArr4[0]).intern()))};
        int i5 = (int) Runtime.getRuntime().totalMemory();
        int id = (int) Thread.currentThread().getId();
        int i6 = c.f25341f * 1595628892;
        c.f25341f = i6;
        c.d(-1863692548, objArr5, i5, 1863692548, id, i6, Process.myUid());
        Object[] objArr6 = new Object[1];
        l((char) ((KeyEvent.getMaxKeyCode() >> 16) + 58373), 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
        Object[] objArr7 = {bVar, aVarD.D(((String) objArr6[0]).intern())};
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i7 = c.f25349r * 1770900040;
        c.f25349r = i7;
        int i8 = c.f25350s * 1440287991;
        c.f25350s = i8;
        int i9 = c.f25351t * 985966497;
        c.f25351t = i9;
        c.d(486595506, objArr7, iUptimeMillis2, -486595502, i7, i8, i9);
        byte[] bArrE = e(bVar.C());
        if (bArrE == null) {
            Object[] objArr8 = new Object[1];
            l((char) View.MeasureSpec.getMode(0), 10 - ExpandableListView.getPackedPositionChild(0L), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, objArr8);
            throw new f(((String) objArr8[0]).intern());
        }
        bVar.e(bArrE);
        int iMyPid = Process.myPid();
        int i10 = c.f25353v * 1073314991;
        c.f25353v = i10;
        int iMyTid = Process.myTid();
        int i11 = c.f25354w * 1986112249;
        c.f25354w = i11;
        bVar.b(o.dl.b.a((byte[]) c.d(-1168717246, new Object[]{bVar}, iMyPid, 1168717251, i10, iMyTid, i11), bVar.B()));
        byte[] bArrC = bVar.C();
        Object[] objArr9 = new Object[1];
        k("द\uee68읛볠", View.MeasureSpec.getSize(0) + 59197, objArr9);
        bVar.a(d.d(bArrC, ((String) objArr9[0]).intern()));
        Object[] objArr10 = new Object[1];
        k("ॖ尲ꏮ\uf68c屖ꏨ\uf6bd屟ꌏ\uf680屪ꌝ\uf6c2屾ꌅ\uf6d3嶗ꍍ", 21840 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10);
        o.ef.a aVarX2 = aVarX.x(((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        l((char) TextUtils.getOffsetBefore("", 0), 56 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 12 - (ViewConfiguration.getScrollBarSize() >> 8), objArr11);
        o.ef.a aVarX3 = aVarX2.x(((String) objArr11[0]).intern());
        Object[] objArr12 = new Object[1];
        k("ु䜏閂\ue217ゅ脪\udfb6", 20089 - (ViewConfiguration.getScrollBarSize() >> 8), objArr12);
        Object[] objArr13 = {aVarX2, ((String) objArr12[0]).intern()};
        int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int iMyUid2 = Process.myUid();
        int i12 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = i12;
        Object[] objArr14 = new Object[1];
        k("॰苰Ṝ\uabff✴납䰀\ud98a嗯\ue178竀\uf677莼ἡꢙ␉", 35729 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr14);
        byte[] bArrD = aVarX3.D(((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        k("॰櫖츇≇螾ײַ彊낷ᓥ蠼", 25523 - TextUtils.indexOf("", "", 0), objArr15);
        byte[] bArrZ = aVarX3.z(((String) objArr15[0]).intern());
        if (bArrZ == null) {
            int i13 = f22398g + 31;
            f22399h = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            bArrZ = new byte[]{-1, -1, -1, -1, -1, -1};
        }
        Object[] objArr16 = new Object[1];
        l((char) (ViewConfiguration.getEdgeSlop() >> 16), (Process.myTid() >> 22) + 67, Drawable.resolveOpacity(0, 0) + 20, objArr16);
        Object[] objArr17 = {aVarX3, ((String) objArr16[0]).intern(), -1};
        int priority = Thread.currentThread().getPriority();
        int i14 = o.ef.a.f23777k * (-845283131);
        o.ef.a.f23777k = i14;
        int iIntValue = ((Integer) o.ef.a.a(1647814368, objArr17, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i14)).intValue();
        Object[] objArr18 = new Object[1];
        l((char) (Process.myPid() >> 22), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 87, 14 - TextUtils.lastIndexOf("", '0', 0, 0), objArr18);
        Object[] objArr19 = {aVarX3, ((String) objArr18[0]).intern(), -1};
        int priority2 = Thread.currentThread().getPriority();
        int i15 = o.ef.a.f23777k * (-845283131);
        o.ef.a.f23777k = i15;
        int iIntValue2 = ((Integer) o.ef.a.a(1647814368, objArr19, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority2, i15)).intValue();
        Object[] objArr20 = new Object[1];
        k("ॷ鞍㒐", ((Process.getThreadPriority(0) + 20) >> 6) + 40693, objArr20);
        Object[] objArr21 = {aVarX3, ((String) objArr20[0]).intern()};
        int i16 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i16;
        String strConcat = (String) o.ef.a.a(-781664457, objArr21, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i16, Thread.currentThread().getPriority());
        if (strConcat.length() % 2 != 0) {
            Object[] objArr22 = new Object[1];
            k("ण", TextUtils.getCapsMode("", 0, 0) + 19447, objArr22);
            strConcat = ((String) objArr22[0]).intern().concat(strConcat);
        }
        int i17 = o.dl.d.f23185c * 447039506;
        o.dl.d.f23185c = i17;
        int priority3 = Thread.currentThread().getPriority();
        int iMyUid3 = Process.myUid();
        int i18 = o.dl.d.f23187e * 1037703823;
        o.dl.d.f23187e = i18;
        byte bByteValue = ((Byte) o.dl.d.c(708803393, iMyUid3, i18, priority3, i17, -708803392, new Object[]{strConcat})).byteValue();
        Object[] objArr23 = new Object[1];
        l((char) (View.MeasureSpec.getMode(0) + 10281), 103 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr23);
        o.ef.a aVarX4 = aVarX3.x(((String) objArr23[0]).intern());
        Object[] objArr24 = new Object[1];
        l((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + PanasonicMakernoteDirectory.TAG_BURST_SPEED, 3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr24);
        byte[] bArrD2 = aVarX4.D(((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        l((char) TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getSize(0) + 122, (-16777213) - Color.rgb(0, 0, 0), objArr25);
        byte[] bArrD3 = d(bArrD2, aVarX4.D(((String) objArr25[0]).intern()));
        Object[] objArr26 = new Object[1];
        k("॰ᕄㄚ左秮薳ꁓ찓\ue8e7\uf4b9႙㽇嬓柛莽꾏쩗협\uf2daẶ㪊奒攖臲궳", 7219 - KeyEvent.getDeadChar(0, 0), objArr26);
        String strIntern = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        k("ड\ue632", ImageFormat.getBitsPerPixel(0) + 61284, objArr27);
        Object[] objArr28 = {aVarX3, strIntern, ((String) objArr27[0]).intern()};
        int i19 = o.ef.a.f23773g * 1081559339;
        o.ef.a.f23773g = i19;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i20 = o.ef.a.f23772f * (-1705304066);
        o.ef.a.f23772f = i20;
        int iIntValue3 = Integer.valueOf((String) o.ef.a.a(1581939473, objArr28, i20, (int) SystemClock.uptimeMillis(), -1581939469, i19, iMaxMemory), 16).intValue();
        bVar.g(bArrD);
        bVar.j(bArrZ);
        bVar.e(iIntValue);
        Object[] objArr29 = {bVar, Integer.valueOf(iIntValue2)};
        int iMyTid2 = Process.myTid();
        int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
        int i21 = b.f25339i * (-1021380914);
        b.f25339i = i21;
        int i22 = b.f25337g * (-1997134821);
        b.f25337g = i22;
        b.b(1126453636, i22, iElapsedRealtime3, iMyTid2, i21, -1126453636, objArr29);
        bVar.d(bByteValue);
        bVar.b(bArrD3);
        bVar.c(iIntValue3);
        int i23 = f22398g + 29;
        f22399h = i23 % 128;
        int i24 = i23 % 2;
        return bVar;
    }

    static void c() {
        f22396e = -7082079512212274084L;
        f22401j = new char[]{41227, 49178, 25386, 33325, 9563, 17519, 59209, 1613, 28817, 4485, 45756, 38035, 62867, 22176, 47021, 4319, 29124, 54005, 13297, 39955, 64772, 24118, 49001, 6271, 31078, 55896, 15149, 34177, 59058, 18350, 41183, 457, 25315, 50084, 11287, 36111, 61051, 20282, 43100, 2394, 27245, 52069, 21912, 46756, 6054, 28884, 53633, 13040, 37877, 64539, 23816, 48762, 7981, 30811, 55616, 38049, 62867, 22197, 47010, 4319, 29121, 54013, 13286, 39998, 64778, 24108, 48936, 38039, 62875, 22176, 47016, 4292, 29126, 53984, 13292, 39957, 64773, 24071, 48957, 6230, 31069, 55929, 15230, 34186, 59068, 18348, 41173, 38023, 62864, 22193, 47014, 4307, 29176, 53984, 13293, 39944, 64782, 24107, 48929, 6225, 31043, 55928, 48278, 56715, 32426, 40892, 14554, 23004, 64254, 7149, 46081, 54534, 30254, 38670, 12408, 20840, 62074, 4960, 44426, 38035, 62858, 22176, 38035, 62853, 22204, 17759, 9284, 58104, 33764, 40018, 64835, 13521, 21964};
        f22400i = -2798638323479153181L;
    }

    public static /* synthetic */ Object d(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ((i4 + i8) - (i4 & i8)) | (~i3);
        int i10 = ~i4;
        int i11 = ~((i8 + i10) - (i8 & i10));
        int i12 = ~((i3 + i8) - (i3 & i8));
        int i13 = (i12 + i11) - (i12 & i11);
        int i14 = i5 + i4 + i7 + ((-92689393) * i6) + (1942122663 * i2);
        int i15 = i14 * i14;
        int i16 = (((-665130586) * i5) - 357761024) + ((-674687396) * i4) + (4778405 * i9) + (i10 * (-4778405)) + ((-4778405) * i13) + ((-669908992) * i7) + ((-1056047104) * i6) + ((-742522880) * i2) + ((-592117760) * i15);
        int i17 = (i5 * 1048061654) + 1366922925 + (i4 * 1048062268) + (i9 * (-307)) + (i10 * 307) + (i13 * 307) + (i7 * 1048061961) + (i6 * 439444615) + (i2 * (-1279783457)) + (i15 * 173867008);
        return i16 + ((i17 * i17) * (-1898250240)) != 1 ? e(objArr) : b(objArr);
    }

    private static b d(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        b bVar = new b(str, str2, i2, str3);
        int i4 = f22398g + 25;
        f22399h = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return bVar;
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22398g + 99;
        f22399h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        l((char) (53653 - Drawable.resolveOpacity(0, 0)), 124 - TextUtils.lastIndexOf("", '0', 0, 0), 3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        byte[] bArrC = d.c(((String) objArr[0]).intern(), bArr);
        Object[] objArr2 = new Object[1];
        l((char) (30259 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 126 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, objArr2);
        byte[] bArrC2 = d.c(((String) objArr2[0]).intern(), bArr2);
        Object[] objArr3 = new Object[1];
        l((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2200), 129 - View.MeasureSpec.getMode(0), View.getDefaultSize(0, 0) + 2, objArr3);
        byte[] bArrC3 = d.c(((String) objArr3[0]).intern(), bArrC, bArrC2);
        int i5 = f22398g + 43;
        f22399h = i5 % 128;
        if (i5 % 2 == 0) {
            return bArrC3;
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        int iIntValue = ((Number) objArr[1]).intValue();
        o.ef.a aVar = (o.ef.a) objArr[2];
        int i2 = 2 % 2;
        int i3 = f22399h + 39;
        f22398g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = new Object[1];
        k("ृᱷ⍠㙰嵨恫睩驴ꅚ둊\udb40", 5380 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        o.ef.a aVarX = aVar.x(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        l((char) (Color.rgb(0, 0, 0) + 16790953), ViewConfiguration.getScrollBarFadeDuration() >> 16, 8 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        Object[] objArr4 = {aVarX, ((String) objArr3[0]).intern()};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i5 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = i5;
        o.ef.a aVarD = ((o.ef.c) o.ef.a.a(-1398121910, objArr4, iMyUid, i5, 1398121917, iUptimeMillis, iElapsedRealtime)).d(iIntValue);
        int i6 = f22399h + 13;
        f22398g = i6 % 128;
        if (i6 % 2 != 0) {
            return aVarD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static byte[] e(byte[] bArr) throws Throwable {
        Object obj;
        d next;
        String strD;
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = f22398g + 69;
        f22399h = i3 % 128;
        int i4 = i3 % 2;
        Iterator<d> it = d.e(bArr, 2).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                int i5 = f22399h + 33;
                f22398g = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 7 / 0;
                }
                return null;
            }
            int i7 = f22399h + 107;
            f22398g = i7 % 128;
            int i8 = i7 % 2;
            next = it.next();
            strD = next.d();
            objArr = new Object[1];
            l((char) (40987 - (ViewConfiguration.getTapTimeout() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 131, 3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        } while (!strD.equals(((String) objArr[0]).intern()));
        int i9 = f22398g + 107;
        f22399h = i9 % 128;
        if (i9 % 2 == 0) {
            Object[] objArr2 = {next};
            int i10 = d.f23913b * (-1487198784);
            d.f23913b = i10;
            int iMyTid = Process.myTid();
            int i11 = d.f23912a * (-767436786);
            d.f23912a = i11;
            int i12 = d.f23915d * 1088204935;
            d.f23915d = i12;
            return (byte[]) d.b(i12, -898244639, objArr2, i10, 898244639, iMyTid, i11);
        }
        Object[] objArr3 = {next};
        int i13 = d.f23913b * (-1487198784);
        d.f23913b = i13;
        int iMyTid2 = Process.myTid();
        int i14 = d.f23912a * (-767436786);
        d.f23912a = i14;
        int i15 = d.f23915d * 1088204935;
        d.f23915d = i15;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{68, -108, -67, 58};
        $$b = 31;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        int i4 = $11 + 1;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (qVar.f19948a < cArr.length) {
            int i6 = $11 + 49;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(731 - Color.red(0), (char) (View.resolveSize(0, 0) + 7933), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, 355847088, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f22396e ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = o.d.d.a(836 - KeyEvent.keyCodeFromString(""), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27279), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, -2145994442, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 7))), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        int i9 = $10 + 99;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        while (qVar.f19948a < cArr.length) {
            int i11 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    objA3 = o.d.d.a(837 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27279), 11 - TextUtils.indexOf("", ""), -2145994442, false, $$c(b5, (byte) (7 | b5), b5), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objA3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr5 = {qVar, qVar};
            Object objA4 = o.d.d.a(1452497747);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                objA4 = o.d.d.a(835 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (27279 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2145994442, false, $$c(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 7))), b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    private static void l(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22401j[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(742 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 632508977, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 28))), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f22400i), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 766, (char) (ExpandableListView.getPackedPositionType(0L) + 12470), 12 - TextUtils.getOffsetBefore("", 0), 1946853218, false, $$c(b3, (byte) (29 | b3), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 387, (char) TextUtils.indexOf("", "", 0), 17 - TextUtils.lastIndexOf("", '0'), 39570797, false, $$c(b4, (byte) (34 | b4), b4), new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 19;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b5 = (byte) 0;
                objA4 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 387, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 39570797, false, $$c(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 34))), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i8 = $10 + 7;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.cl.c
    public final /* synthetic */ o.eq.b a(String str, String str2, int i2, String str3) {
        Object[] objArr = {this, str, str2, Integer.valueOf(i2), str3};
        int i3 = f22392a * (-8728108);
        f22392a = i3;
        int iNextInt = new Random().nextInt();
        int iMyUid = Process.myUid();
        int i4 = f22395d * 1265442465;
        f22395d = i4;
        return (o.eq.b) d(objArr, i4, i3, -461309135, 461309136, iMyUid, iNextInt);
    }

    @Override // o.cn.e
    public final /* synthetic */ g a(g gVar, o.ef.a aVar, int i2, String str, o.ef.a aVar2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22398g + 87;
        f22399h = i4 % 128;
        b bVar = (b) gVar;
        if (i4 % 2 != 0) {
            b(bVar, aVar, i2, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b bVarB = b(bVar, aVar, i2, str);
        int i5 = f22399h + 37;
        f22398g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return bVarB;
    }

    @Override // o.cn.e
    public final /* synthetic */ g b(String str, String str2, int i2, String str3, o.ef.a aVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22398g + 89;
        f22399h = i4 % 128;
        if (i4 % 2 == 0) {
            return c(str, str2, i2, str3, aVar);
        }
        c(str, str2, i2, str3, aVar);
        throw null;
    }

    @Override // o.cn.e
    public final boolean b(int i2, o.ef.a aVar) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f22398g + 11;
        f22399h = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = new Object[1];
        k("ृᱷ⍠㙰嵨恫睩驴ꅚ둊\udb40", 5381 - View.resolveSize(0, 0), objArr);
        o.ef.a aVarX = aVar.x(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        l((char) (13737 - ExpandableListView.getPackedPositionType(0L)), Process.myPid() >> 22, TextUtils.getOffsetAfter("", 0) + 8, objArr2);
        Object[] objArr3 = {aVarX, ((String) objArr2[0]).intern()};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i6 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = i6;
        int i7 = i2 + 1;
        Object[] objArr4 = {(o.ef.c) o.ef.a.a(-1398121910, objArr3, iMyUid, i6, 1398121917, iUptimeMillis, iElapsedRealtime)};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i8 = o.ef.c.f23799b * 1567746851;
        o.ef.c.f23799b = i8;
        int i9 = o.ef.c.f23798a * 1136425123;
        o.ef.c.f23798a = i9;
        if (i7 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i9, i8, -1513293186, elapsedCpuTime, 1513293186, objArr4)).intValue()) {
            return false;
        }
        int i10 = f22398g + 47;
        f22399h = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    @Override // o.cn.e
    public final o.ef.a c(int i2, o.ef.a aVar) throws o.ef.b {
        Object[] objArr = {this, Integer.valueOf(i2), aVar};
        int i3 = f22393b * 1525510385;
        f22393b = i3;
        int i4 = f22394c * 1457950745;
        f22394c = i4;
        return (o.ef.a) d(objArr, Process.myTid(), i3, 998097943, -998097943, new Random().nextInt(), i4);
    }

    @Override // o.cn.e
    public final List<o.cl.b> d(o.ef.c cVar) throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        new o.dh.e();
        int i3 = 0;
        while (true) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = o.ef.c.f23799b * 1567746851;
            o.ef.c.f23799b = i4;
            int i5 = 1136425123 * o.ef.c.f23798a;
            o.ef.c.f23798a = i5;
            if (i3 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i5, i4, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                return arrayList;
            }
            int i6 = f22399h + 125;
            f22398g = i6 % 128;
            int i7 = i6 % 2;
            o.ef.a aVarD = cVar.d(i3);
            Object[] objArr = new Object[1];
            k("ॺ⓪", Color.red(0) + 11677, objArr);
            Object[] objArr2 = {aVarD, ((String) objArr[0]).intern()};
            int i8 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i8;
            String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i8, Thread.currentThread().getPriority());
            if (str.length() != 4) {
                Object[] objArr3 = new Object[1];
                k("ॣ㝽畿덍\uf14a㼊紬묙滑⟦旡ꏅ\ue187⿽淡ꮛ\ue98dរ呼鉢큖Ṍ屹騸\ud81e؇䓺苴샓\u0ee9䲵諢좟\uf699㒃畹덻\uf150", 15886 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
                throw new f(((String) objArr3[0]).intern());
            }
            Object[] objArr4 = {str.substring(0, 2)};
            int i9 = o.dl.d.f23185c * 447039506;
            o.dl.d.f23185c = i9;
            int priority = Thread.currentThread().getPriority();
            int iMyUid = Process.myUid();
            int i10 = o.dl.d.f23187e * 1037703823;
            o.dl.d.f23187e = i10;
            byte bByteValue = ((Byte) o.dl.d.c(708803393, iMyUid, i10, priority, i9, -708803392, objArr4)).byteValue();
            Object[] objArr5 = {str.substring(2, 4)};
            int i11 = o.dl.d.f23185c * 447039506;
            o.dl.d.f23185c = i11;
            int priority2 = Thread.currentThread().getPriority();
            int iMyUid2 = Process.myUid();
            int i12 = o.dl.d.f23187e * 1037703823;
            o.dl.d.f23187e = i12;
            byte bByteValue2 = ((Byte) o.dl.d.c(708803393, iMyUid2, i12, priority2, i11, -708803392, objArr5)).byteValue();
            Object[] objArr6 = new Object[1];
            k("॥ᑓ㌽帅緲", (ViewConfiguration.getEdgeSlop() >> 16) + 7457, objArr6);
            byte[] bArrD = aVarD.D(((String) objArr6[0]).intern());
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i13 = o.dh.a.f23009a * (-2093433746);
            o.dh.a.f23009a = i13;
            arrayList.add(new o.cl.b(bByteValue, bByteValue2, d.b(bArrD, (byte[]) o.dh.a.a(195285494, iElapsedRealtime, new Random().nextInt(1524627709), new Object[0], i13, -195285492, (int) SystemClock.uptimeMillis()))));
            i3++;
            int i14 = f22398g + 65;
            f22399h = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    @Override // o.cn.e
    public final o.ef.c d(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22399h + 81;
        f22398g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        k("ृᱷ⍠㙰嵨恫睩驴ꅚ둊\udb40", 5382 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        o.ef.a aVarX = aVar.x(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        k("ॖ尲ꏮ\uf68c屖ꏨ\uf6bd屟ꌏ\uf680屪ꌝ\uf6c2屾ꌅ\uf6d3嶗ꍍ", 21839 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        o.ef.a aVarX2 = aVarX.x(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k("ु䜏閂\ue217ゅ脪\udfb6", 20088 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
        Object[] objArr4 = {aVarX2, ((String) objArr3[0]).intern()};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int iMyUid = Process.myUid();
        int i5 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = i5;
        o.ef.c cVar = (o.ef.c) o.ef.a.a(-1398121910, objArr4, iMyUid, i5, 1398121917, iUptimeMillis, iElapsedRealtime);
        int i6 = f22398g + 103;
        f22399h = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }

    @Override // o.cn.e
    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f22399h + 47;
        f22398g = i3 % 128;
        return i3 % 2 == 0;
    }
}
