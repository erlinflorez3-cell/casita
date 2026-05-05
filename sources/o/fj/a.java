package o.fj;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.l;
import o.a.m;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f25888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f25889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f25890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f25891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f25892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f25893k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f25894l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char[] f25895m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ a[] f25896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f25897o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f25898p = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f25899s = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r2 = r8 * 3
            int r1 = 1 - r2
            int r8 = r7 + 4
            int r0 = 121 - r6
            byte[] r7 = o.fj.a.$$a
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2a
            r2 = r8
            r3 = r5
        L13:
            int r0 = -r0
            int r0 = r0 + r8
            r8 = r2
        L16:
            int r2 = r8 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L23:
            r1 = r7[r2]
            int r3 = r3 + 1
            r8 = r0
            r0 = r1
            goto L13
        L2a:
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fj.a.$$c(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25898p = 0;
        f25899s = 1;
        f25894l = 0;
        f25897o = 1;
        a();
        Object[] objArr = new Object[1];
        q("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{0, 11, 50, 0}, true, objArr);
        f25883a = new a(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        q("\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", new int[]{11, 10, 20, 2}, false, objArr2);
        f25886d = new a(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        q("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{21, 13, 0, 0}, false, objArr3);
        f25887e = new a(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        q("\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{34, 22, 0, 0}, true, objArr4);
        f25885c = new a(((String) objArr4[0]).intern(), 3);
        Object[] objArr5 = new Object[1];
        q("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{56, 14, 93, 14}, false, objArr5);
        f25884b = new a(((String) objArr5[0]).intern(), 4);
        Object[] objArr6 = new Object[1];
        q("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{70, 24, 0, 0}, true, objArr6);
        f25890h = new a(((String) objArr6[0]).intern(), 5);
        Object[] objArr7 = new Object[1];
        q("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{94, 17, 0, 3}, true, objArr7);
        f25891i = new a(((String) objArr7[0]).intern(), 6);
        Object[] objArr8 = new Object[1];
        r(new int[]{-539080005, 2120978510, -1178746853, 1910754950, -1325418031, 1340239255, -1448813409, 2123943094}, TextUtils.indexOf("", "", 0) + 15, objArr8);
        f25892j = new a(((String) objArr8[0]).intern(), 7);
        Object[] objArr9 = new Object[1];
        r(new int[]{-539080005, 2120978510, 1475333010, -531222771, -1823209965, 1071958722, 2038818240, -547636295, -1277327384, 1363592756, 298987759, 1975738127, 34449661, -874994063, -1358392948, -1152030180, 617163652, -1597021576, 1852595231, -482028443}, View.MeasureSpec.makeMeasureSpec(0, 0) + 38, objArr9);
        f25888f = new a(((String) objArr9[0]).intern(), 8);
        Object[] objArr10 = new Object[1];
        q("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{111, 29, 0, 1}, true, objArr10);
        f25889g = new a(((String) objArr10[0]).intern(), 9);
        f25896n = c();
        int i2 = f25899s + 37;
        f25898p = i2 % 128;
        int i3 = i2 % 2;
    }

    private a(String str, int i2) {
    }

    static void a() {
        f25895m = new char[]{56523, 56342, 56350, 56350, 56346, 56346, 56326, 56326, 56349, 56347, 56324, 56508, 56568, 56551, 56550, 56573, 56575, 56556, 56561, 56573, 56571, 56481, 56530, 56553, 56555, 56530, 56530, 56555, 56558, 56559, 56555, 56554, 56556, 56548, 56498, 56548, 56555, 56557, 56559, 56563, 56555, 56539, 56544, 56558, 56556, 56558, 56554, 56555, 56559, 56558, 56555, 56530, 56530, 56555, 56553, 56530, 56528, 56367, 56390, 56392, 56367, 56367, 56392, 56395, 56396, 56392, 56391, 56395, 56392, 56391, 56498, 56548, 56550, 56557, 56556, 56555, 56556, 56549, 56539, 56546, 56566, 56559, 56536, 56543, 56561, 56553, 56553, 56563, 56557, 56536, 56538, 56555, 56553, 56530, 56505, 56553, 56530, 56532, 56556, 56554, 56546, 56554, 56546, 56551, 56557, 56550, 56558, 56561, 56558, 56534, 56532, 56481, 56531, 56548, 56556, 56554, 56546, 56554, 56546, 56545, 56558, 56556, 56558, 56554, 56551, 56559, 56560, 56554, 56554, 56539, 56542, 56561, 56553, 56553, 56563, 56557, 56536, 56538, 56555, 56553};
        f25893k = new int[]{1982969942, -910118025, 1850721968, 232119289, 1138838299, -2040108458, 1526297323, -1026980098, -846073878, 1519295497, -2109762392, 449255362, -1342923648, 1183810482, -796217903, -1403710758, -399552476, 795486692};
    }

    private static /* synthetic */ a[] c() {
        int i2 = 2 % 2;
        int i3 = f25897o + 53;
        int i4 = i3 % 128;
        f25894l = i4;
        int i5 = i3 % 2;
        a[] aVarArr = {f25883a, f25886d, f25887e, f25885c, f25884b, f25890h, f25891i, f25892j, f25888f, f25889g};
        int i6 = i4 + 69;
        f25897o = i6 % 128;
        if (i6 % 2 != 0) {
            return aVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
        $$b = 8;
    }

    private static void q(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = f25895m;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        objA = o.d.d.a(249 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1376582792, false, $$c((byte) ($$b - 3), b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i10 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 12, (char) View.getDefaultSize(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i3 = 2;
                } else {
                    int i11 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (-b3);
                        objA3 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 836, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27278), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1210801192, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    int i12 = $10 + 55;
                    $11 = i12 % 128;
                    i3 = 2;
                    int i13 = i12 % 2;
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = new Object[i3];
                objArr5[1] = mVar;
                objArr5[0] = mVar;
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 35715), 11 - Color.blue(0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i14 = $11 + 75;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i6];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i16 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i16, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i16);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i6];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i17 = $11 + 3;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 0;
            while (true) {
                mVar.f19943d = i19;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i19 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void r(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f25893k;
        char c2 = '0';
        int i5 = 989264422;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 71;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) i7;
                            byte b3 = (byte) (b2 - 1);
                            objA = o.d.d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 675, (char) ((-1) - TextUtils.lastIndexOf("", c2, i7, i7)), TextUtils.getOffsetBefore("", i7) + 12, -328001469, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(674 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) View.resolveSize(0, 0), 12 - (Process.myTid() >> 22), -328001469, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                i3 = 2;
                c2 = '0';
                i5 = 989264422;
                i7 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f25893k;
        if (iArr5 != null) {
            int i10 = $10 + 73;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                Object objA3 = o.d.d.a(989264422);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(675 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (MotionEvent.axisFromString("") + i6), 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -328001469, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i12++;
                i6 = 1;
            }
            int i13 = $10 + 49;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            iArr5 = iArr6;
        }
        char c3 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c3] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i15 = 0;
            while (i15 < 16) {
                int i16 = $10 + 95;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    lVar.f19942e ^= iArr4[i15];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 301;
                        char c4 = (char) (52698 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11;
                        byte b8 = (byte) ($$b >>> 2);
                        byte b9 = (byte) (b8 - 3);
                        objA4 = o.d.d.a(keyRepeatTimeout, c4, scrollDefaultDelay, -1416256172, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i15 += 91;
                } else {
                    lVar.f19942e ^= iArr4[i15];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 301;
                        char c5 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 52696);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 11;
                        byte b10 = (byte) ($$b >>> 2);
                        byte b11 = (byte) (b10 - 3);
                        objA5 = o.d.d.a(keyRepeatDelay, c5, packedPositionGroup, -1416256172, false, $$c(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i15++;
                }
            }
            int i17 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i17;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i18 = lVar.f19942e;
            int i19 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 230;
                char cGreen = (char) (Color.green(0) + 51004);
                int deadChar = 9 - KeyEvent.getDeadChar(0, 0);
                byte length4 = (byte) $$a.length;
                byte b12 = (byte) (length4 - 5);
                objA6 = o.d.d.a(iLastIndexOf, cGreen, deadChar, -330018025, false, $$c(length4, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public static a valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f25897o + 7;
        f25894l = i3 % 128;
        int i4 = i3 % 2;
        a aVar = (a) Enum.valueOf(a.class, str);
        int i5 = f25897o + 85;
        f25894l = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static a[] values() {
        int i2 = 2 % 2;
        int i3 = f25894l + 117;
        f25897o = i3 % 128;
        int i4 = i3 % 2;
        a[] aVarArr = f25896n;
        if (i4 != 0) {
            return (a[]) aVarArr.clone();
        }
        throw null;
    }
}
