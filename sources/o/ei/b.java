package o.ei;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23874a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23875b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23876c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f23877d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f23878f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f23879g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f23880h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f23881i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r8, short r9, short r10) {
        /*
            int r7 = r9 + 4
            int r6 = r10 * 2
            int r1 = r6 + 1
            int r0 = r8 * 4
            int r5 = 120 - r0
            byte[] r4 = o.ei.b.$$c
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L27
            r0 = r6
            r1 = r2
        L13:
            int r0 = -r0
            int r5 = r5 + r0
        L15:
            int r7 = r7 + 1
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r6) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r4[r7]
            goto L13
        L27:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ei.b.$$e(short, short, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f23881i = 1556137194;
        f23880h = -1960106894;
        f23879g = 1672165678;
        f23878f = 119443987;
        f23876c = -1025847145;
        init$0();
        f23875b = 0;
        f23874a = 1;
        f23877d = new char[]{56498, 56548, 56556, 56555, 56548, 56553, 56558, 56558, 56537, 56538, 56555, 56550, 56551, 56558, 56555, 56547, 56532, 56539, 56558, 56345, 56359, 56340, 56343, 56566, 56356, 56353, 56568, 56345, 56352, 56347, 56358, 56347, 56339, 56361, 56356, 56343, 56345, 56508, 56564, 56566, 56571, 56567, 56561, 56532, 56537, 56572, 56539, 56516, 56543, 56558, 56566, 56569, 56559, 56497, 56572, 56351, 56358, 56357, 56350, 56348, 56356, 56348, 56348, 56358, 56348, 56341, 56343, 56350, 56323, 56324, 56361, 56361, 56324, CharCompanionObject.MIN_LOW_SURROGATE, 56347, 56350, 56355, 56348, 56347, CharCompanionObject.MIN_LOW_SURROGATE, 56572, 56343, 56342, 56350, 56353, 56574, 56324, 56358, 56348, 56341, 56345, 56350, 56349, 56539, 56374, 56373, 56503, 56560, 56555, 56552, 56525, 56529, 56566, 56566, 56529, 56521, 56553, 56560, 56561, 56527, 56521, 56548, 56552, 56551, 56545, 56551, 56553, 56546, 56546, 56548, 56546, 56553, 56563, 56557, 56522, 56525, 56552, 56472, 56573, 56442, 56435, 56431, 56438, 56439, 56434, 56430, 56437, 56447, 56413, 56407, 56438, 56439, 56434, 56430, 56437, 56447, 56413, 56407, 56442, 56439, 56431, 56432, 56405, 56409, 56436, 56437, 56444, 56439, 56436, 56409, 56413, 56706, 56706, 56413};
    }

    public static BigDecimal a(byte[] bArr, c cVar) {
        int defaultFractionDigits;
        int i2 = 2 % 2;
        int i3 = f23874a + 67;
        f23875b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (cVar == null) {
            return o.dl.d.b(bArr);
        }
        if (cVar.e() != -1) {
            defaultFractionDigits = cVar.e();
            int i4 = f23874a + 45;
            f23875b = i4 % 128;
            int i5 = i4 % 2;
        } else {
            defaultFractionDigits = Currency.getInstance(cVar.c()).getDefaultFractionDigits();
        }
        return o.dl.d.b(bArr).movePointLeft(defaultFractionDigits);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:95|41)|(1:43)(4:45|91|46|(8:48|96|53|(1:55)(7:56|100|57|58|(6:97|64|(1:66)(6:67|98|68|69|74|(2:76|(2:78|79)))|73|74|(0))|80|81)|62|(0)|80|81)(1:49))|44|96|53|(0)(0)|62|(0)|80|81) */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x018f: ARITH (r9 I:??[int, boolean]) = (r8 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:21:0x018f */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04b1 A[Catch: Exception -> 0x04e7, TRY_LEAVE, TryCatch #4 {Exception -> 0x04e7, blocks: (B:53:0x048c, B:56:0x04b1, B:58:0x04d8, B:60:0x04e0, B:61:0x04e6, B:57:0x04bb), top: B:96:0x048c, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] e(int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ei.b.e(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{7, 42, -92, 85};
        $$b = 67;
    }

    static void init$1() {
        $$c = new byte[]{65, 52, MessagePack.Code.UINT64, -121};
        $$d = 81;
    }

    private static void j(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 85;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        Object bytes = str2;
        if (str2 != null) {
            int i8 = i4 + 83;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 0 / 0;
                bytes = str2.getBytes("ISO-8859-1");
            } else {
                bytes = str2.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        char[] cArr = f23877d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                int i15 = $11 + 125;
                $10 = i15 % 128;
                int i16 = i15 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        int bitsPerPixel = 248 - ImageFormat.getBitsPerPixel(i7);
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int offsetBefore = TextUtils.getOffsetBefore("", i7) + 11;
                        byte b2 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 7)));
                        byte b3 = (byte) (-b2);
                        objA = o.d.d.a(bitsPerPixel, keyRepeatTimeout, offsetBefore, 1376582792, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i14] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i14++;
                    i2 = 2;
                    i7 = 0;
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
        char[] cArr3 = new char[i11];
        System.arraycopy(cArr, i10, cArr3, 0, i11);
        if (bArr != null) {
            char[] cArr4 = new char[i11];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i11) {
                int i17 = $10 + 25;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i19 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(View.resolveSize(0, 0) + 11, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i19] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i20 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA3 = o.d.d.a(836 - Color.alpha(0), (char) (27279 - View.getDefaultSize(0, 0)), 11 - TextUtils.getOffsetBefore("", 0), -1210801192, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i20] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - Color.red(0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35715), Gravity.getAbsoluteGravity(0, 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i13 > 0) {
            char[] cArr5 = new char[i11];
            System.arraycopy(cArr3, 0, cArr5, 0, i11);
            int i21 = i11 - i13;
            System.arraycopy(cArr5, 0, cArr3, i21, i13);
            System.arraycopy(cArr5, i13, cArr3, 0, i21);
        }
        if (z2) {
            int i22 = $10 + 63;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            char[] cArr6 = new char[i11];
            int i24 = 0;
            while (true) {
                mVar.f19943d = i24;
                if (mVar.f19943d >= i11) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i11 - mVar.f19943d) - 1];
                i24 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i12 > 0) {
            int i25 = 0;
            while (true) {
                mVar.f19943d = i25;
                if (mVar.f19943d >= i11) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i25 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void k(byte b2, short s2, int i2, Object[] objArr) {
        int i3 = (i2 * 4) + 100;
        int i4 = (b2 * 2) + 4;
        byte[] bArr = $$a;
        int i5 = s2 * 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i4;
            i3 += bArr[i4];
            i4 = i7 + 1;
        }
    }
}
