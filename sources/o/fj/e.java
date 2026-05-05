package o.fj;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import o.a.l;
import o.a.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f25939a = 0;

    /* JADX INFO: renamed from: b */
    public static int f25940b = 0;

    /* JADX INFO: renamed from: c */
    public static int f25941c = 0;

    /* JADX INFO: renamed from: d */
    public static int f25942d = 0;

    /* JADX INFO: renamed from: e */
    public static int f25943e = 0;

    /* JADX INFO: renamed from: j */
    public static int f25944j = 0;

    /* JADX INFO: renamed from: k */
    private static long f25945k = 0;

    /* JADX INFO: renamed from: o */
    private static char[] f25946o = null;

    /* JADX INFO: renamed from: p */
    private static int[] f25947p = null;

    /* JADX INFO: renamed from: q */
    public static int f25948q = 0;

    /* JADX INFO: renamed from: r */
    public static int f25949r = 0;

    /* JADX INFO: renamed from: s */
    private static int f25950s = 0;

    /* JADX INFO: renamed from: t */
    private static int f25951t = 0;

    /* JADX INFO: renamed from: f */
    private List<o.dq.c> f25952f = Collections.emptyList();

    /* JADX INFO: renamed from: g */
    private boolean f25953g;

    /* JADX INFO: renamed from: h */
    private boolean f25954h;

    /* JADX INFO: renamed from: i */
    private boolean f25955i;

    /* JADX INFO: renamed from: l */
    private boolean f25956l;

    /* JADX INFO: renamed from: m */
    private c f25957m;

    /* JADX INFO: renamed from: n */
    private b f25958n;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r8, byte r9, short r10) {
        /*
            int r8 = 121 - r8
            int r0 = r9 * 2
            int r7 = 3 - r0
            int r0 = r10 * 4
            int r6 = 1 - r0
            byte[] r5 = o.fj.e.$$c
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L29
            r1 = r7
            r2 = r3
        L13:
            int r8 = r8 + r7
            r7 = r1
        L15:
            byte r0 = (byte) r8
            r4[r2] = r0
            int r1 = r7 + 1
            int r2 = r2 + 1
            if (r2 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r5[r1]
            r7 = r8
            r8 = r0
            goto L13
        L29:
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fj.e.$$g(byte, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f25949r = 1150929719;
        f25948q = 1202222769;
        init$0();
        f25944j = -1696653685;
        f25939a = -1999058607;
        f25943e = -372990260;
        f25942d = -93926488;
        f25940b = -1379655156;
        f25941c = 1811695755;
        f25950s = 0;
        f25951t = 1;
        f25946o = new char[]{13923, 19163, 53000, 16469, 50353, 23032, 55852, 24365, 54229, 21534, 59658, 28044, 61167, 25402, 58484, 30942, 64799, 32358, 62128, 30712, 34861, 3434, 64351, 34791, 564, 36201, 2445, 38084, 5904, 37393, 7911, 39201, 9320, 41165, 9195, 44566, 10568, 46574, 12344, 45936, 16276, 47826, 17702, 49237, 19702, 53034, 19063, 54917, 52418, 45155, 13757, 47862, 15896, 41820, 8351, 42465, 10601, 44734, 5099, 38677, 5206, 39307, 7895, 33393, 1982, 34024, 38040, 59428, 28138, 58038, 26112, 64269, 30937, 64925, 28973, 63155, 19335, 53078, 19477, 49613, 18069, 55846, 3109, 28806, 62723, 31239, 65265, 25508, 57452, 25902, 59796, 28252, 54091, 22509, 54451, 22883, 56943, 17049, 51026, 17430, 51449, 19960, 45644, 14113, 48011, 14422, 7024, 26565, 57869, 28019, 59835, 29940, 63281, 29311, 65228, 31001, 50245, 16547, 50156, 20018, 51548, 21952, 53249, 21343, 14812, 17697, 49385, 20405, 51968, 22025, 54743, 20635, 56383, 23475, 59065, 25154, 57612, 27868, 60380, 30510, 62182, 29110, 64856, 30721, 34776, 657, 36395, 3566, 35006, 5122, 37655, 7901, 10133, 23359, 56999, 20902, 54622, 18454, 52184, 20097, 49720, 17897, 63651, 31830, 65302};
        f25945k = -8192876926848407483L;
        f25947p = new int[]{1346054675, 61424333, -1388300922, -593720582, 334075690, 640383197, -1298850471, 1271340421, -1960039389, -521530328, -226647335, -594012621, 739266358, 984747882, -1172600610, 799869249, 1845314985, 158320311};
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ec A[Catch: all -> 0x04fe, TryCatch #4 {all -> 0x04fe, blocks: (B:178:0x03df, B:180:0x03ec, B:181:0x0425), top: B:228:0x03df, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x053a A[Catch: all -> 0x05a2, TryCatch #1 {all -> 0x05a2, blocks: (B:191:0x052d, B:193:0x053a, B:194:0x0577), top: B:223:0x052d, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0611  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] a(android.content.Context r22, int r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fj.e.a(android.content.Context, int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fj.e.b(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~((-1) - (((-1) - i4) & ((-1) - i5)));
        int i9 = i2 | i8;
        int i10 = ~i2;
        int i11 = (~((i5 + i10) - (i5 & i10))) | i4;
        int i12 = i4 + i2 + i7 + ((-1932811043) * i3) + (1521317780 * i6);
        int i13 = i12 * i12;
        int i14 = ((i4 * (-919556932)) - 154402816) + ((-919556932) * i2) + ((-1121407813) * i8) + (i9 * 1121407813) + (1121407813 * i11) + (201850880 * i7) + ((-2098724864) * i3) + ((-1398800384) * i6) + ((-1444151296) * i13);
        int i15 = (i4 * 1794637580) + 2133191799 + (i2 * 1794637580) + (i8 * (-161)) + (i9 * 161) + (i11 * 161) + (i7 * 1794637741) + (i3 * (-1844343719)) + (i6 * (-1188939004)) + (i13 * (-394526720));
        int i16 = i14 + (i15 * i15 * 821297152);
        if (i16 != 1) {
            return i16 != 2 ? b(objArr) : d(objArr);
        }
        e eVar = (e) objArr[0];
        c cVar = (c) objArr[1];
        int i17 = 2 % 2;
        int i18 = f25950s;
        int i19 = i18 + 111;
        f25951t = i19 % 128;
        int i20 = i19 % 2;
        eVar.f25957m = cVar;
        int i21 = i18 + 45;
        f25951t = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        e eVar = (e) objArr[0];
        b bVar = (b) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25950s;
        int i4 = i3 + 121;
        f25951t = i4 % 128;
        int i5 = i4 % 2;
        eVar.f25958n = bVar;
        int i6 = i3 + 69;
        f25951t = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{82, 42, -87, -21};
        $$b = 128;
    }

    static void init$1() {
        $$d = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
        $$e = 30;
    }

    static void init$2() {
        $$c = new byte[]{111, -103, -70, 103};
        $$f = 26;
    }

    private static void u(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f25947p;
        long j2 = 0;
        double d2 = 0.0d;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 13;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(675 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d2 ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionChild(j2) + 13, -328001469, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i8++;
                    j2 = 0;
                    d2 = 0.0d;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 103;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f25947p;
        if (iArr5 != null) {
            int i11 = $11 + 75;
            int i12 = i11 % 128;
            $10 = i12;
            int i13 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = i12 + 3;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i16])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = b4;
                    objA2 = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 676, (char) (ViewConfiguration.getPressedStateDuration() >> 16), MotionEvent.axisFromString("") + 13, -328001469, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i16] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i16++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            int i17 = $11 + 29;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i19 = 0;
            for (int i20 = 16; i19 < i20; i20 = 16) {
                lVar.f19942e ^= iArr4[i19];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    int i21 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 301;
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 52697);
                    int iResolveSize = View.resolveSize(0, 0) + 11;
                    byte b6 = (byte) ($$f & 7);
                    byte b7 = (byte) (b6 - 2);
                    objA3 = o.d.d.a(i21, packedPositionType, iResolveSize, -1416256172, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i19++;
            }
            int i22 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i22;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i23 = lVar.f19942e;
            int i24 = lVar.f19940a;
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
                int size = 229 - View.MeasureSpec.getSize(0);
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 51004);
                int iIndexOf = 9 - TextUtils.indexOf("", "", 0);
                byte length4 = (byte) $$c.length;
                byte b8 = (byte) (length4 - 4);
                objA4 = o.d.d.a(size, fadingEdgeLength, iIndexOf, -330018025, false, $$g(length4, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i2);
        int i25 = $11 + 11;
        $10 = i25 % 128;
        int i26 = i25 % 2;
        objArr[0] = str;
    }

    private static void v(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i6 = $11 + 107;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 99;
            $11 = i8 % 128;
            if (i8 % i4 == 0) {
                int i9 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f25946o[i2 * i9])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(743 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12 - Color.argb(0, 0, 0, 0), 632508977, false, $$g((byte) ($$f - 4), b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(f25945k), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 766, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12470), 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1946853218, false, $$g((byte) ($$f - 5), b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i9] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(387 - View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 18 - TextUtils.indexOf("", "", 0), 39570797, false, $$g((byte) ($$f & 116), b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f25946o[i2 + i10])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 743, (char) TextUtils.indexOf("", ""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 632508977, false, $$g((byte) ($$f - 4), b5, b5), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(f25945k), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b6 = (byte) 0;
                    objA5 = o.d.d.a(766 - Gravity.getAbsoluteGravity(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 12471), 12 - Color.green(0), 1946853218, false, $$g((byte) ($$f - 5), b6, b6), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 387;
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iRed = Color.red(0) + 18;
                    int i11 = $$f;
                    byte b7 = (byte) 0;
                    objA6 = o.d.d.a(doubleTapTimeout, c3, iRed, 39570797, false, $$g((byte) ((i11 + 116) - (i11 | 116)), b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i12 = $11 + 43;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b8 = (byte) 0;
                objA7 = o.d.d.a(388 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 39570797, false, $$g((byte) ($$f & 116), b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private static void w(short s2, short s3, byte b2, Object[] objArr) {
        int i2 = s3 + 97;
        int i3 = 3 - (b2 * 2);
        byte[] bArr = $$a;
        int i4 = s2 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + i2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            i3++;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 += bArr[i3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void x(byte r8, short r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r9 * 2
            int r7 = r0 + 97
            byte[] r6 = o.fj.e.$$d
            int r0 = r10 * 2
            int r5 = 4 - r0
            int r1 = r8 * 2
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r6 != 0) goto L2d
            r0 = r7
            r1 = r3
            r7 = r2
        L18:
            int r7 = r7 + r0
            int r5 = r5 + 1
        L1b:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L28:
            int r1 = r1 + 1
            r0 = r6[r5]
            goto L18
        L2d:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fj.e.x(byte, short, short, java.lang.Object[]):void");
    }

    public final void a(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f25951t + 81;
        int i4 = i3 % 128;
        f25950s = i4;
        if (i3 % 2 != 0) {
            this.f25953g = z2;
            int i5 = 58 / 0;
        } else {
            this.f25953g = z2;
        }
        int i6 = i4 + 111;
        f25951t = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean a() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f25950s + 5;
        int i4 = i3 % 128;
        f25951t = i4;
        if (i3 % 2 == 0) {
            z2 = this.f25954h;
            int i5 = 65 / 0;
        } else {
            z2 = this.f25954h;
        }
        int i6 = i4 + 15;
        f25950s = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final void b(c cVar) {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f25940b * 589618332;
        f25940b = i3;
        int i4 = f25942d * 1486431314;
        f25942d = i4;
        c(1873578411, i4, -1873578410, i2, (int) Process.getElapsedCpuTime(), new Object[]{this, cVar}, i3);
    }

    public final void b(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f25951t;
        int i4 = i3 + 63;
        f25950s = i4 % 128;
        if (i4 % 2 != 0) {
            this.f25956l = z2;
            throw null;
        }
        this.f25956l = z2;
        int i5 = i3 + 55;
        f25950s = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean b() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f25951t + 97;
        int i4 = i3 % 128;
        f25950s = i4;
        if (i3 % 2 != 0) {
            z2 = this.f25956l;
            int i5 = 34 / 0;
        } else {
            z2 = this.f25956l;
        }
        int i6 = i4 + 43;
        f25951t = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final List<o.dq.c> c() {
        List<o.dq.c> list;
        int i2 = 2 % 2;
        int i3 = f25950s;
        int i4 = i3 + 57;
        f25951t = i4 % 128;
        if (i4 % 2 == 0) {
            list = this.f25952f;
            int i5 = 63 / 0;
        } else {
            list = this.f25952f;
        }
        int i6 = i3 + 83;
        f25951t = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
        return list;
    }

    public final void c(List<o.dq.c> list) {
        int i2 = 2 % 2;
        int i3 = f25950s + 67;
        int i4 = i3 % 128;
        f25951t = i4;
        if (i3 % 2 == 0) {
            this.f25952f = list;
            int i5 = 64 / 0;
        } else {
            this.f25952f = list;
        }
        int i6 = i4 + 111;
        f25950s = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f25950s + 83;
        int i4 = i3 % 128;
        f25951t = i4;
        int i5 = i3 % 2;
        this.f25954h = z2;
        int i6 = i4 + 123;
        f25950s = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f25951t;
        int i4 = i3 + 71;
        f25950s = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f25955i;
        int i6 = i3 + 27;
        f25950s = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final void e(b bVar) {
        int i2 = f25943e * 1313410593;
        f25943e = i2;
        int i3 = f25939a * (-1428871075);
        f25939a = i3;
        int iMyTid = Process.myTid();
        int i4 = f25944j * (-490041921);
        f25944j = i4;
        c(-1548073825, iMyTid, 1548073827, i2, i4, new Object[]{this, bVar}, i3);
    }

    public final void e(boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z2)};
        int id = (int) Thread.currentThread().getId();
        int i2 = f25941c * 1901926681;
        f25941c = i2;
        c(-1835443082, (int) Runtime.getRuntime().freeMemory(), 1835443082, id, (int) Runtime.getRuntime().maxMemory(), objArr, i2);
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f25950s;
        int i4 = i3 + 29;
        f25951t = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f25953g;
        int i6 = i3 + 53;
        f25951t = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final c f() {
        int i2 = 2 % 2;
        int i3 = f25950s;
        int i4 = i3 + 63;
        f25951t = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        c cVar = this.f25957m;
        int i5 = i3 + 29;
        f25951t = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    public final b j() {
        int i2 = 2 % 2;
        int i3 = f25951t + 87;
        f25950s = i3 % 128;
        int i4 = i3 % 2;
        b bVar = this.f25958n;
        if (i4 != 0) {
            int i5 = 73 / 0;
        }
        return bVar;
    }
}
