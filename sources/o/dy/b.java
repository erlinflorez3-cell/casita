package o.dy;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23441a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f23442b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23443c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23444d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f23445e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23446h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23447j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, short r8, byte r9) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 1
            int r7 = r7 + 4
            int r0 = r9 + 102
            byte[] r6 = o.dy.b.$$a
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r6 != 0) goto L26
            r3 = r7
            r2 = r4
        L11:
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L14:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r2 != r8) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L21:
            int r3 = r3 + 1
            r0 = r6[r3]
            goto L11
        L26:
            r1 = r4
            r3 = r7
            r7 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dy.b.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23447j = 0;
        f23446h = 1;
        f23444d = 0;
        f23441a = 1;
        b();
        f23445e = new b();
        int i2 = f23446h + 25;
        f23447j = i2 % 128;
        int i3 = i2 % 2;
    }

    private b() {
    }

    static void b() {
        f23442b = new char[]{64598, 64576, 64614, 64578, 64604, 64587, 64625, 64631, 64605, 64606, 64584, 64588, 64592, 64612, 64579, 64514, 64629, 64582, 64630, 64599, 64536, 64586, 64577, 64597, 64593};
        f23443c = (char) 51642;
    }

    private static void f(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int length;
        char[] cArr;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 77;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        h hVar = new h();
        char[] cArr3 = f23442b;
        int i8 = 421932776;
        long j2 = 0;
        int i9 = -1;
        char c2 = 11;
        if (cArr3 != null) {
            int i10 = $11 + 21;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
                i4 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objA = o.d.d.a(i8);
                    if (objA == null) {
                        byte b3 = (byte) i9;
                        byte b4 = (byte) (b3 + 1);
                        objA = o.d.d.a(269 - ImageFormat.getBitsPerPixel(0), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)) + 11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr[i4] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i4++;
                    int i11 = $11 + 111;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i8 = 421932776;
                    j2 = 0;
                    i9 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f23443c)};
        Object objA2 = o.d.d.a(421932776);
        if (objA2 == null) {
            byte b5 = (byte) (-1);
            byte b6 = (byte) (b5 + 1);
            objA2 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 270, (char) View.resolveSize(0, 0), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr2[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i13 = $11 + 105;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr2[hVar.f19926b];
                hVar.f19925a = cArr2[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    int i15 = $11 + 77;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b] = (char) (hVar.f19925a / b2);
                    } else {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    }
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objA3 = o.d.d.a(825 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (Process.myPid() >> 22) + 11, -611683395, false, $$c(b7, b8, (byte) ((b8 + 9) - (9 & b8))), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i16 = $10 + 77;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) (-1);
                            byte b10 = (byte) (b9 + 1);
                            c2 = 11;
                            objA4 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 217, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 10 - TextUtils.lastIndexOf("", '0', 0, 0), 212688716, false, $$c(b9, b10, (byte) ((-1) - (((-1) - b10) & ((-1) - 7)))), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i18 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr3[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr3[i18];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i19 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i20 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr3[i19];
                            cArr4[hVar.f19926b + 1] = cArr3[i20];
                        } else {
                            int i21 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i22 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr3[i21];
                            cArr4[hVar.f19926b + 1] = cArr3[i22];
                        }
                    }
                }
                hVar.f19926b += 2;
            }
        }
        for (int i23 = 0; i23 < i2; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{120, 70, -13, MessagePack.Code.FIXEXT4};
        $$b = 240;
    }

    @Override // o.dy.d
    public final String a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23441a + 79;
        f23444d = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f(TextUtils.getOffsetBefore("", 0) + 3, "\u0014\t㙶", (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 125), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f23444d + 111;
        f23441a = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        f(TextUtils.indexOf("", "") + 54, "\u000b\u0006\u000f\u000e\u0003\n\u0007\u0014\u0001\u0016\u0007\u0014\u000e\u0015\u0010\u0001\n\u0005\u0006\u0002\u000b\u0014\u0015\u0004\u0006\u0002\u0001\u0014\u000e\u0011\u0010\u0002\u0010\u0017\u000e\u0011\u0010\u0002\t\u0001\u0015\u0003\b\u0004\u0004\u0015\u0011\u000f\u0004\u000b\r\u0006\u0000\u0014", (byte) (126 - TextUtils.getCapsMode("", 0, 0)), objArr);
        String string = sb.append(((String) objArr[0]).intern()).append(a()).append("'}").toString();
        int i3 = f23444d + 55;
        f23441a = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
