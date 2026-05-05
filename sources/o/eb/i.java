package o.eb;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23634a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f23635b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f23636c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23637d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f23638e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f23639f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f23640g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23641h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f23642i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f23643j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r8, int r9, short r10) {
        /*
            int r0 = r10 * 4
            int r7 = 3 - r0
            byte[] r6 = o.eb.i.$$c
            int r0 = r8 * 6
            int r5 = 73 - r0
            int r4 = r9 * 2
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = -1
            if (r6 != 0) goto L29
            r0 = r4
            r1 = r7
        L15:
            int r7 = r7 + r0
        L16:
            int r2 = r2 + 1
            byte r0 = (byte) r7
            r3[r2] = r0
            int r1 = r1 + 1
            if (r2 != r4) goto L26
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            return r1
        L26:
            r0 = r6[r1]
            goto L15
        L29:
            r1 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.i.$$e(int, int, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f23643j = 1335816658;
        f23642i = -1813193718;
        f23640g = 1749743546;
        f23639f = -1887587491;
        init$0();
        f23634a = 0;
        f23641h = 1;
        f23636c = new char[]{2498, 2504, 2553, 2502, 2523, 2486, 2500, 2507, 2552, 2508, 2511, 2520, 2505, 2521, 2484, 2522, 2535, 2319, 2316, 2482, 2496, 2497, 2524, 2509, 2503, 2314};
        f23637d = 2040400189;
        f23638e = true;
        f23635b = true;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x015b: ARITH (r9 I:??[int, boolean]) = (r8 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:10:0x015b */
    /* JADX WARN: Removed duplicated region for block: B:71:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] e(int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.i.e(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{111, MessagePack.Code.MAP16, MessagePack.Code.TRUE, Ascii.DC4};
        $$b = 44;
    }

    static void init$1() {
        $$c = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$d = 109;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object obj = null;
        Object bytes = str4;
        if (str4 != null) {
            int i4 = $10 + 121;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str4.getBytes("ISO-8859-1");
                obj.hashCode();
                throw null;
            }
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            int i5 = $10 + 45;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f23636c;
        long j2 = 0;
        int i6 = 0;
        if (cArr2 != null) {
            int i7 = $10 + 65;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        int iAlpha = Color.alpha(i6) + 593;
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 13181);
                        int i10 = 12 - (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1));
                        byte b2 = (byte) ($$d & 3);
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(iAlpha, trimmedLength, i10, -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    j2 = 0;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $10 + 15;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f23637d)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - View.resolveSize(0, 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f23635b) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 458, (char) KeyEvent.keyCodeFromString(""), Drawable.resolveOpacity(0, 0) + 11, -1923924106, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            String str5 = new String(cArr4);
            int i13 = $11 + 87;
            $10 = i13 % 128;
            if (i13 % 2 == 0) {
                objArr[0] = str5;
                return;
            } else {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        int i14 = 0;
        if (f23638e) {
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i15 = $10 + 93;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a(458 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 11, -1923924106, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i17 = $11 + 9;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i14;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i19 = $11 + 105;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[fVar.f19923e >>> fVar.f19922a] + i2] + iIntValue);
                i14 = fVar.f19922a % 0;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i14 = fVar.f19922a + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(byte r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            int r8 = r10 * 2
            int r1 = r8 + 1
            byte[] r7 = o.eb.i.$$a
            int r0 = r9 * 3
            int r6 = 4 - r0
            int r0 = r11 * 2
            int r5 = 100 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r7 != 0) goto L2f
            r2 = r6
            r5 = r8
            r1 = r3
        L16:
            int r6 = r6 + r5
            int r0 = r2 + 1
            r5 = r6
            r6 = r0
        L1b:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r8) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L28:
            int r1 = r1 + 1
            r0 = r7[r6]
            r2 = r6
            r6 = r0
            goto L16
        L2f:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.i.l(byte, int, int, java.lang.Object[]):void");
    }
}
