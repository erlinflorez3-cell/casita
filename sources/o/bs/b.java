package o.bs;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.j;
import o.a.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21601a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21602b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21603c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static short[] f21604d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f21605e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21606f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int[] f21607g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21608h = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, short r8, short r9) {
        /*
            int r1 = r7 + 4
            int r0 = r9 * 2
            int r7 = r0 + 1
            byte[] r6 = o.bs.b.$$a
            int r5 = r8 + 103
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L26
            r2 = r3
            r0 = r1
        L11:
            int r1 = r1 + r5
            r5 = r1
            r1 = r0
        L14:
            int r0 = r1 + 1
            byte r1 = (byte) r5
            r4[r2] = r1
            int r2 = r2 + 1
            if (r2 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            r1 = r6[r0]
            goto L11
        L26:
            r2 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bs.b.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21608h = 0;
        f21606f = 1;
        f21603c = 1436530211;
        f21602b = 1150422509;
        f21601a = 219117576;
        f21605e = new byte[]{89, -72, 124, -70, 103, -80, 85, 56, MessagePack.Code.STR16, 52, MessagePack.Code.BIN16, 84, MessagePack.Code.BIN16, MessagePack.Code.ARRAY16, 99, MessagePack.Code.NIL, -7, MessagePack.Code.UINT8, -80, -11, -77, -3, MessagePack.Code.UINT32, -18, -77, -79, -4, -73, -30, MessagePack.Code.FALSE, -26, -25, -74, MessagePack.Code.EXT32, -20, MessagePack.Code.UINT16, -123, -119, -117, 119, -97, 125, 113, -118, -113, -127, 48, -93, 62, 52, -81, 34, -104, 55, 51, 58, 53, -87, -92, -85, 70, -90, -95, MessagePack.Code.STR8, MessagePack.Code.UINT16, -12, -110, MessagePack.Code.MAP32, MessagePack.Code.STR32, MessagePack.Code.INT8, MessagePack.Code.STR16, MessagePack.Code.EXT32, -21, -26, -105, MessagePack.Code.MAP16, MessagePack.Code.FIXEXT2, MessagePack.Code.NEVER_USED, MessagePack.Code.ARRAY32, MessagePack.Code.EXT32, MessagePack.Code.FIXEXT2, MessagePack.Code.NIL, 5, -93, 5, Ascii.US, -103, -9, -103, -103, MessagePack.Code.UINT64, -103, -109, -102, MessagePack.Code.NEVER_USED, MessagePack.Code.MAP32, -101, 94, -100, 110, 118, 98, 107, 116, 80, 116, 120, 82, 111, 105, 95, -106, -7, -1, -97, -13, -109, -31, -88, -31, -65, -77, 105, -70, 106, 82, -77, 83, -72, -77, -67, 97, 83, -77, 103, -68, -76, -9, 68, -6, -11, 89, 89, 8, 89, 91, -5, 111, Ascii.DC4, 77, -15, 87, -5, -4, 5, 68, -30, -9, 99, -1, 107, -9, 96, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115};
        f21607g = new int[]{1020321709, -2132695683, -886966603, -1915268811, 509504478, -1382880617, 1113673712, -1245074620, -766981741, -1138305995, 1185777238, -498107258, -1337254825, 1371097513, -306604191, 1592591717, 637939545, -319232476};
    }

    b() {
    }

    static o.ef.a a(o.dq.c cVar) throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        int iActiveCount = Thread.activeCount();
        int id = (int) Thread.currentThread().getId();
        int i3 = o.dq.c.U * (-320049133);
        o.dq.c.U = i3;
        if (((o.ei.c) o.dq.c.e(i3, (int) Runtime.getRuntime().freeMemory(), new Object[]{cVar}, -189024806, iActiveCount, 189024832, id)) != null) {
            Object[] objArr = new Object[1];
            i((short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 109), (-286112687) - ImageFormat.getBitsPerPixel(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1235055906, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 88, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 87), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int iActiveCount2 = Thread.activeCount();
            int id2 = (int) Thread.currentThread().getId();
            int i4 = o.dq.c.U * (-320049133);
            o.dq.c.U = i4;
            aVar.c(strIntern, ((o.ei.c) o.dq.c.e(i4, (int) Runtime.getRuntime().freeMemory(), new Object[]{cVar}, -189024806, iActiveCount2, 189024832, id2)).a());
            int i5 = f21606f + 51;
            f21608h = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr2 = new Object[1];
        j(new int[]{304931551, 1661437657, 2100164987, 422796630}, 6 - Color.blue(0), objArr2);
        aVar.a(((String) objArr2[0]).intern(), cVar.e());
        Object[] objArr3 = new Object[1];
        i((short) (127 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (-286112680) - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1235055905, TextUtils.lastIndexOf("", '0', 0, 0) - 91, (byte) ((-60) - TextUtils.lastIndexOf("", '0')), objArr3);
        aVar.c(((String) objArr3[0]).intern(), cVar.s().getTime());
        Object[] objArr4 = new Object[1];
        i((short) (TextUtils.lastIndexOf("", '0', 0) - 21), TextUtils.getTrimmedLength("") - 286112676, (-1235055905) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 90, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 56), objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        o.dq.c.ab = o.dq.c.ab * (-349012037);
        int iNextInt = new Random().nextInt(1939314254);
        o.dq.c.Y = o.dq.c.Y * 1430505636;
        aVar.a(strIntern2, o.dq.c.e(r20, new Random().nextInt(1203971282), new Object[]{cVar}, 1142185313, r24, -1142185285, iNextInt));
        Object[] objArr5 = new Object[1];
        j(new int[]{-1629070078, 1672574299, -2110701921, -1165219523, 1312752698, -135860575}, 9 - ImageFormat.getBitsPerPixel(0), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        int priority = Thread.currentThread().getPriority();
        int iNextInt2 = new Random().nextInt(1277365266);
        int iMyUid = Process.myUid();
        o.dq.c.af = o.dq.c.af * (-682706040);
        aVar.a(strIntern3, o.dq.c.e(iMyUid, r21, new Object[]{cVar}, 1073598465, priority, -1073598435, iNextInt2));
        Object[] objArr6 = new Object[1];
        i((short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 90), View.MeasureSpec.getMode(0) - 286112670, (-1235055906) - KeyEvent.getDeadChar(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 75, (byte) (26 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr6);
        String strIntern4 = ((String) objArr6[0]).intern();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        o.dq.c.X = o.dq.c.X * (-1846170485);
        aVar.a(strIntern4, o.dq.c.e(Process.myPid(), Thread.currentThread().getPriority(), new Object[]{cVar}, 191638324, elapsedCpuTime, -191638299, r26));
        Object[] objArr7 = new Object[1];
        i((short) ((-4) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getTrimmedLength("") - 286112650, TextUtils.indexOf("", "", 0, 0) - 1235055902, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 85, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2), objArr7);
        aVar.a(((String) objArr7[0]).intern(), (Object) cVar.t());
        Object[] objArr8 = new Object[1];
        j(new int[]{-506760803, 1870399929, 1692282796, -1193567691}, 8 - KeyEvent.normalizeMetaState(0), objArr8);
        String strIntern5 = ((String) objArr8[0]).intern();
        int id3 = (int) Thread.currentThread().getId();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        aVar.a(strIntern5, o.dq.c.e((int) SystemClock.uptimeMillis(), new Random().nextInt(300912412), new Object[]{cVar}, 2098923982, id3, -2098923965, iFreeMemory));
        Object[] objArr9 = new Object[1];
        i((short) (View.MeasureSpec.getSize(0) - 111), KeyEvent.normalizeMetaState(0) - 286112640, (-1235055904) - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "") - 78, (byte) ((-75) - KeyEvent.getDeadChar(0, 0)), objArr9);
        aVar.a(((String) objArr9[0]).intern(), (Object) cVar.x());
        Object[] objArr10 = new Object[1];
        j(new int[]{-1079623515, -1142011822, -1143652231, 1446002274, -625737791, 759613286, 2017212767, -232774782}, 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr10);
        aVar.a(((String) objArr10[0]).intern(), (Object) cVar.d());
        Object[] objArr11 = new Object[1];
        i((short) (48 - (Process.myTid() >> 22)), (-286112624) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-1235055896) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-76) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 124), objArr11);
        aVar.a(((String) objArr11[0]).intern(), (Object) cVar.u());
        Object[] objArr12 = new Object[1];
        j(new int[]{-1629070078, 1672574299, -1960365898, -728130160}, KeyEvent.normalizeMetaState(0) + 8, objArr12);
        aVar.a(((String) objArr12[0]).intern(), (Object) cVar.g());
        Object[] objArr13 = new Object[1];
        j(new int[]{-1629070078, 1672574299, 126313138, -1503558501, -1280206206, 477953951, 1480225272, 1834606296}, 16 - Color.blue(0), objArr13);
        aVar.a(((String) objArr13[0]).intern(), (Object) cVar.n());
        Object[] objArr14 = new Object[1];
        i((short) (TextUtils.getCapsMode("", 0, 0) + 44), (ViewConfiguration.getLongPressTimeout() >> 16) - 286112604, (-1235055896) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), AndroidCharacter.getMirror('0') - 136, (byte) ((-75) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr14);
        String strIntern6 = ((String) objArr14[0]).intern();
        int i7 = o.dq.c.J * (-224016517);
        o.dq.c.J = i7;
        int iMyPid = Process.myPid();
        int i8 = o.dq.c.K * 1241218984;
        o.dq.c.K = i8;
        int i9 = o.dq.c.M * (-727703704);
        o.dq.c.M = i9;
        aVar.c(strIntern6, ((Double) o.dq.c.e(i8, i9, new Object[]{cVar}, 1215566857, i7, -1215566837, iMyPid)).doubleValue());
        Object[] objArr15 = new Object[1];
        i((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 77), Gravity.getAbsoluteGravity(0, 0) - 286112597, (-1235055897) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 87, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 98), objArr15);
        aVar.c(((String) objArr15[0]).intern(), cVar.j());
        Object[] objArr16 = new Object[1];
        i((short) ((ViewConfiguration.getTapTimeout() >> 16) - 110), TextUtils.getCapsMode("", 0, 0) - 286112589, KeyEvent.getDeadChar(0, 0) - 1235055903, (ViewConfiguration.getWindowTouchSlop() >> 8) - 84, (byte) (KeyEvent.keyCodeFromString("") + 126), objArr16);
        aVar.a(((String) objArr16[0]).intern(), (Object) cVar.y());
        int i10 = o.dq.c.f23243c * (-757789931);
        o.dq.c.f23243c = i10;
        int iMyPid2 = Process.myPid();
        int id4 = (int) Thread.currentThread().getId();
        int i11 = o.dq.c.f23247g * 1964400815;
        o.dq.c.f23247g = i11;
        int iIntValue = ((Integer) o.dq.c.e(id4, i11, new Object[]{cVar}, -974755526, i10, 974755527, iMyPid2)).intValue();
        if (iIntValue != -1) {
            int i12 = f21606f + 97;
            f21608h = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr17 = new Object[1];
            j(new int[]{-1771464077, 445885993, 891189980, -1872897813}, ((Process.getThreadPriority(0) + 20) >> 6) + 6, objArr17);
            aVar.c(((String) objArr17[0]).intern(), iIntValue);
        }
        Object[] objArr18 = new Object[1];
        j(new int[]{-47640603, -1146937421, -1329765877, -1757705559}, 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr18);
        aVar.c(((String) objArr18[0]).intern(), 0);
        Object[] objArr19 = new Object[1];
        j(new int[]{-1501383405, 1518535727}, 3 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr19);
        String strIntern7 = ((String) objArr19[0]).intern();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i14 = o.dq.c.f23254n * (-377402477);
        o.dq.c.f23254n = i14;
        int i15 = o.dq.c.f23253m * (-1415752980);
        o.dq.c.f23253m = i15;
        aVar.c(strIntern7, ((Integer) o.dq.c.e(i15, (int) Runtime.getRuntime().maxMemory(), new Object[]{cVar}, 1034189197, iMaxMemory, -1034189191, i14)).intValue());
        Object[] objArr20 = new Object[1];
        i((short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38), (-286112577) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) - 1218278673, (ViewConfiguration.getScrollBarSize() >> 8) - 92, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 4), objArr20);
        aVar.c(((String) objArr20[0]).intern(), ((o.dq.d) o.dq.c.e((int) SystemClock.elapsedRealtime(), (int) Runtime.getRuntime().freeMemory(), new Object[]{cVar}, 1977012666, Thread.currentThread().getPriority(), -1977012663, new Random().nextInt(1090238166))).c());
        Object[] objArr21 = new Object[1];
        i((short) ((Process.myPid() >> 22) + 55), (ViewConfiguration.getEdgeSlop() >> 16) - 286112575, (-1235055901) - TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionType(0L) - 86, (byte) ((-94) - (ViewConfiguration.getEdgeSlop() >> 16)), objArr21);
        String strIntern8 = ((String) objArr21[0]).intern();
        int i16 = o.dq.c.f23257q * 93949810;
        o.dq.c.f23257q = i16;
        int i17 = o.dq.c.f23260t * 1875310279;
        o.dq.c.f23260t = i17;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i18 = o.dq.c.f23256p * (-2084082294);
        o.dq.c.f23256p = i18;
        aVar.b(strIntern8, ((Boolean) o.dq.c.e(iUptimeMillis, i18, new Object[]{cVar}, -339688243, i16, 339688251, i17)).booleanValue());
        Object[] objArr22 = new Object[1];
        j(new int[]{1548430553, -534997822, 781389502, -1595516154, -2111059128, -1792990489, 262730871, -1795560182, -1727486635, -403670559}, TextUtils.indexOf((CharSequence) "", '0', 0) + 20, objArr22);
        aVar.b(((String) objArr22[0]).intern(), cVar.G());
        Object[] objArr23 = new Object[1];
        j(new int[]{152489048, -1321245886, -2102581278, -262621458, 1339877576, -767539759, -1424874179, -279909593, 151209417, 32605461}, TextUtils.getTrimmedLength("") + 19, objArr23);
        String strIntern9 = ((String) objArr23[0]).intern();
        int id5 = (int) Thread.currentThread().getId();
        int iMyUid2 = Process.myUid();
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i19 = o.dq.c.f23258r * 1296178575;
        o.dq.c.f23258r = i19;
        aVar.b(strIntern9, ((Boolean) o.dq.c.e(iUptimeMillis2, i19, new Object[]{cVar}, -623077117, id5, 623077126, iMyUid2)).booleanValue());
        Object[] objArr24 = new Object[1];
        i((short) ((-15) - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.getTrimmedLength("") - 286112566, (-1235055891) - TextUtils.lastIndexOf("", '0'), Color.argb(0, 0, 0, 0) - 78, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 36), objArr24);
        String strIntern10 = ((String) objArr24[0]).intern();
        int iNextInt3 = new Random().nextInt(509633913);
        int iMyPid3 = Process.myPid();
        int i20 = o.dq.c.f23241a * (-890089949);
        o.dq.c.f23241a = i20;
        int i21 = o.dq.c.f23245e * (-1519906128);
        o.dq.c.f23245e = i21;
        aVar.b(strIntern10, ((Boolean) o.dq.c.e(i20, i21, new Object[]{cVar}, -1160227292, iNextInt3, 1160227292, iMyPid3)).booleanValue());
        Object[] objArr25 = new Object[1];
        i((short) ((-39) - TextUtils.indexOf("", "", 0)), (-286112549) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-1235055908) - Process.getGidForName(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 86, (byte) ((-88) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr25);
        aVar.a(((String) objArr25[0]).intern(), (Object) cVar.J());
        Object[] objArr26 = new Object[1];
        i((short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 81), (-286112539) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1235055896, (ViewConfiguration.getJumpTapTimeout() >> 16) - 78, (byte) ((-57) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr26);
        aVar.a(((String) objArr26[0]).intern(), (Object) cVar.v());
        return aVar;
    }

    private static void i(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        long j2;
        int i5;
        boolean z3;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f21602b)};
            Object objA = o.d.d.a(-727631768);
            int i7 = -1;
            if (objA == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (-b3);
                objA = o.d.d.a(Process.getGidForName("") + 239, (char) (44531 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 35969549, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 93;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z2 = true;
            } else {
                int i10 = $11 + 65;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                z2 = false;
            }
            if (z2) {
                byte[] bArr = f21605e;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) i7;
                            byte b6 = (byte) (b5 + 1);
                            objA2 = o.d.d.a(628 - View.resolveSizeAndState(0, 0, 0), (char) (28650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - TextUtils.indexOf("", "", 0, 0), 1621469864, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i12++;
                        i7 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f21605e;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f21603c)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (-b7);
                        objA3 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 237, (char) (44531 - Color.alpha(0)), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), 35969549, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f21602b) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f21604d[i2 + ((int) (((long) f21603c) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f21602b) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                int i13 = ((i2 + iIntValue) - 2) + ((int) (((long) f21603c) ^ j2));
                if (z2) {
                    int i14 = $11 + 5;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                jVar.f19936d = i13 + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f21601a), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 5359), 11 - Color.alpha(0), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f21605e;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i16 = $10 + 9;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i19 = $10 + 27;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z3) {
                        byte[] bArr6 = f21605e;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f21604d;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void init$0() {
        $$a = new byte[]{65, 52, MessagePack.Code.UINT64, -121};
        $$b = 171;
    }

    private static void j(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21607g;
        int i4 = 989264422;
        int i5 = -1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 79;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        objA = o.d.d.a(675 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) + 12, -328001469, false, $$c(b2, (byte) ((-1) - (((-1) - b2) | ((-1) - 18))), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = 989264422;
                    i5 = -1;
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
        int[] iArr5 = f21607g;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = o.d.d.a(TextUtils.getOffsetAfter("", i6) + 675, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 12, -328001469, false, $$c(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 18))), (byte) 0), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i10++;
                int i11 = $10 + 23;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i6 = 0;
            }
            int i13 = $11 + 3;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            iArr5 = iArr6;
            i6 = 0;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            int i15 = $10 + 41;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                lVar.f19942e ^= iArr4[i17];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b4 = (byte) (-1);
                    objA3 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 301, (char) (52697 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 11, -1416256172, false, $$c(b4, (byte) (16 & b4), (byte) 0), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i17++;
            }
            int i19 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i19;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i20 = lVar.f19942e;
            int i21 = lVar.f19940a;
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
                byte b5 = (byte) (-1);
                objA4 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 229, (char) (51003 - TextUtils.lastIndexOf("", '0')), 9 - (Process.myPid() >> 22), -330018025, false, $$c(b5, (byte) ((b5 + Ascii.SO) - (14 | b5)), (byte) 0), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
