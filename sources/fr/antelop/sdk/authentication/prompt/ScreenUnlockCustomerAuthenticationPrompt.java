package fr.antelop.sdk.authentication.prompt;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.imageutils.JfifUtil;
import java.lang.reflect.Method;
import o.a.g;
import o.a.h;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class ScreenUnlockCustomerAuthenticationPrompt extends CustomerAuthenticationPrompt {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f18835a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f18836b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f18837c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f18838d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f18839e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18840f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f18841g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18842h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18843i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f18844j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18845k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f18846m = 0;
    private final String subtitle;
    private final String title;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$l(short r9, byte r10, int r11) {
        /*
            int r0 = r10 * 2
            int r8 = r0 + 4
            int r7 = 111 - r11
            int r1 = r9 * 3
            int r0 = 1 - r1
            byte[] r6 = fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPrompt.$$j
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            r2 = -1
            if (r6 != 0) goto L29
            r0 = r3
            r1 = r8
        L16:
            int r8 = r8 + r0
            int r1 = r1 + 1
        L19:
            int r2 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r2 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r6[r1]
            goto L16
        L29:
            r1 = r8
            r8 = r7
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPrompt.$$l(short, byte, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f18846m = 965094903;
        f18845k = -1719523712;
        init$0();
        f18844j = 0;
        f18843i = 1;
        f18842h = 0;
        f18840f = 1;
        d();
        f18838d = new char[]{64532};
        f18835a = (char) 51646;
        int i2 = f18844j + 83;
        f18843i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    ScreenUnlockCustomerAuthenticationPrompt(String str, String str2) {
        this.title = str;
        this.subtitle = str2;
    }

    static void d() {
        f18837c = (char) 57208;
        f18836b = (char) 32194;
        f18839e = (char) 543;
        f18841g = (char) 54749;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:82|27)|(1:29)(4:30|87|31|(9:33|34|83|40|(1:42)(7:46|89|47|48|(6:86|52|(2:54|56)(1:55)|57|(5:59|84|60|61|67)(2:65|66)|(2:70|71))|72|73)|43|(0)|72|73)(1:35))|39|83|40|(0)(0)|43|(0)|72|73) */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0432 A[Catch: Exception -> 0x042e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x042e, blocks: (B:40:0x0401, B:46:0x0432, B:48:0x0464, B:50:0x046c, B:51:0x0472, B:47:0x043c), top: B:83:0x0401, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0473 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] d(int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.ScreenUnlockCustomerAuthenticationPrompt.d(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$d = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
        $$e = 31;
    }

    static void init$1() {
        $$j = new byte[]{90, -73, MessagePack.Code.BIN8, 52};
        $$k = 221;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 125;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i7 = $11 + 63;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr3[1] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d << 1];
            } else {
                cArr3[i6] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
            }
            int i8 = $10 + 5;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 58224;
            int i11 = i6;
            while (i11 < 16) {
                int i12 = $11 + 111;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i10) ^ ((c3 << 4) + ((char) (((long) f18839e) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f18841g)};
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 270, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1995022631, false, $$l(b2, b3, (byte) ((b3 + 42) - (42 & b3))), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) f18837c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f18836b)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = d.a(Color.green(0) + 270, (char) ((-1) - MotionEvent.axisFromString("")), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1995022631, false, $$l(b4, b5, (byte) (42 | b5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = d.a(269 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2074123590, false, $$l(b6, b7, (byte) (39 | b7)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void r(byte b2, byte b3, short s2, Object[] objArr) {
        int i2 = 4 - (b3 * 2);
        byte[] bArr = $$d;
        int i3 = 100 - (s2 * 3);
        int i4 = b2 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i2];
                i2++;
            }
        }
    }

    private static void s(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 67;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f18838d;
        int i8 = 421932776;
        float f2 = 0.0f;
        int i9 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = d.a(i8);
                    if (objA == null) {
                        int deadChar = 270 - KeyEvent.getDeadChar(0, 0);
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int i11 = 12 - (ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1));
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = d.a(deadChar, modifierMetaStateMask, i11, -811348851, false, $$l(b3, b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 9)))), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i8 = 421932776;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f18835a)};
        Object objA2 = d.a(421932776);
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = d.a(271 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 12, -811348851, false, $$l(b5, b6, (byte) ((b6 + 9) - (9 & b6))), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i9];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i9] = (char) (hVar.f19925a - b2);
                    i4 = 2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i9] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 825, (char) KeyEvent.keyCodeFromString(""), 11 - (Process.myTid() >> 22), -611683395, false, $$l(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i12 = $11 + 113;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = d.a(View.MeasureSpec.getSize(0) + JfifUtil.MARKER_SOS, (char) ((-1) - MotionEvent.axisFromString("")), (Process.myTid() >> 22) + 11, 212688716, false, $$l(b9, b10, (byte) (b10 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i14];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i15 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i16 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i15];
                        cArr4[hVar.f19926b + 1] = cArr2[i16];
                    } else {
                        int i17 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i18 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i17];
                        i9 = 1;
                        cArr4[hVar.f19926b + 1] = cArr2[i18];
                        int i19 = $11 + 107;
                        $10 = i19 % 128;
                        i4 = 2;
                        int i20 = i19 % 2;
                    }
                    i4 = 2;
                    i9 = 1;
                }
                hVar.f19926b += i4;
            }
        }
        for (int i21 = 0; i21 < i2; i21++) {
            int i22 = $10 + 41;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        String str3 = new String(cArr4);
        int i24 = $11 + 37;
        $10 = i24 % 128;
        if (i24 % 2 == 0) {
            objArr[0] = str3;
        } else {
            int i25 = 91 / 0;
            objArr[0] = str3;
        }
    }

    public final String getSubtitle() {
        int i2 = 2 % 2;
        int i3 = f18842h + 91;
        int i4 = i3 % 128;
        f18840f = i4;
        int i5 = i3 % 2;
        String str = this.subtitle;
        int i6 = i4 + 83;
        f18842h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getTitle() {
        int i2 = 2 % 2;
        int i3 = f18840f + 17;
        f18842h = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        if (i4 != 0) {
            int i5 = 90 / 0;
        }
        return str;
    }
}
