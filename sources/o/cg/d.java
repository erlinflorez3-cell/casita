package o.cg;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f22277g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22278h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f22279i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f22280j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f22281k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f22282n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f22283o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o.bm.c f22284a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o.f.a f22289f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22287d = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22286c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f22288e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22285b = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r7, int r8, short r9) {
        /*
            int r0 = r7 * 6
            int r7 = 73 - r0
            byte[] r6 = o.cg.d.$$c
            int r0 = r8 * 2
            int r5 = 4 - r0
            int r1 = r9 * 3
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r6 != 0) goto L2a
            r0 = r5
            r1 = r3
        L17:
            int r5 = r5 + 1
            int r7 = r7 + r0
        L1a:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r6[r5]
            int r1 = r1 + 1
            goto L17
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.d.$$g(int, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f22281k = -499605366;
        init$0();
        f22282n = 0;
        f22283o = 1;
        f22279i = new char[]{2324, 2329, 2323, 2309, 2310, 2332, 2393, 2306, 2338, 2316, 2307, 2320, 2328, 2354, 2331, 2322, 2330, 2311, 2341, 2356, 2305, 2339, 2335, 2304, 2333, 2334, 2367, 2321, 2350, 2387, 2363};
        f22278h = 2040400247;
        f22280j = true;
        f22277g = true;
    }

    static void init$0() {
        $$a = new byte[]{74, -74, 100, -77};
        $$b = 207;
    }

    static void init$1() {
        $$d = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI, Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT8, -3, 54, MessagePack.Code.FALSE};
        $$e = 45;
    }

    static void init$2() {
        $$c = new byte[]{3, 32, 122, 114};
        $$f = JfifUtil.MARKER_RST7;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(int r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 3
            int r8 = r0 + 4
            byte[] r7 = o.cg.d.$$a
            int r0 = r10 * 3
            int r6 = 101 - r0
            int r5 = r9 * 4
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r7 != 0) goto L2e
            r6 = r5
            r2 = r8
            r1 = r3
        L16:
            int r0 = -r8
            int r6 = r6 + r0
            int r8 = r2 + 1
        L1a:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L27:
            r0 = r7[r8]
            int r1 = r1 + 1
            r2 = r8
            r8 = r0
            goto L16
        L2e:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.d.l(int, byte, short, java.lang.Object[]):void");
    }

    private static void m(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f22279i;
        if (cArr2 != null) {
            int i4 = $10 + 37;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        int maximumDrawingCacheSize = 593 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        char doubleTapTimeout = (char) (13181 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int iAlpha = Color.alpha(0) + 11;
                        byte b2 = (byte) ((-1) - (((-1) - $$f) | ((-1) - 1)));
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(maximumDrawingCacheSize, doubleTapTimeout, iAlpha, -1225586509, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(f22278h)};
        Object objA2 = o.d.d.a(-1503702982);
        long j2 = 0;
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - TextUtils.getCapsMode("", 0, 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "") + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f22277g) {
            int i7 = $10 + 117;
            $11 = i7 % 128;
            int i8 = i7 % 2;
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
                    objA3 = o.d.d.a(458 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 10, -1923924106, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                j2 = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f22280j) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i9 = $11 + 101;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e % 1) + fVar.f19922a] >>> i2] / iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a(458 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), 11 - Color.green(0), -1923924106, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA5 = o.d.d.a(459 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 11 - View.MeasureSpec.getSize(0), -1923924106, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            int i10 = $11 + 19;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(int r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.cg.d.$$d
            int r7 = r11 * 5
            int r1 = r7 + 1
            int r0 = r9 * 5
            int r6 = 8 - r0
            int r5 = r10 + 99
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r8 != 0) goto L2d
            r2 = r7
            r1 = r3
        L13:
            int r0 = -r5
            int r2 = r2 + r0
            int r5 = r2 + (-2)
        L17:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r6 = r6 + 1
            if (r1 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L26:
            int r1 = r1 + 1
            r0 = r8[r6]
            r2 = r5
            r5 = r0
            goto L13
        L2d:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.d.p(int, byte, short, java.lang.Object[]):void");
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f22282n + 3;
        int i4 = i3 % 128;
        f22283o = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f22286c;
        int i6 = i4 + 41;
        f22282n = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final o.bm.c b() {
        int i2 = 2 % 2;
        int i3 = f22283o + 11;
        int i4 = i3 % 128;
        f22282n = i4;
        int i5 = i3 % 2;
        o.bm.c cVar = this.f22284a;
        int i6 = i4 + 115;
        f22283o = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }

    public final long c() {
        int i2 = 2 % 2;
        int i3 = f22283o + 105;
        f22282n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f22287d;
        }
        int i4 = 33 / 0;
        return this.f22287d;
    }

    public final void c(o.bm.c cVar) {
        int i2 = 2 % 2;
        int i3 = f22282n + 27;
        f22283o = i3 % 128;
        if (i3 % 2 != 0) {
            this.f22284a = cVar;
        } else {
            this.f22284a = cVar;
            throw null;
        }
    }

    public final void c(c cVar) {
        int i2 = 2 % 2;
        int i3 = f22282n + 125;
        int i4 = i3 % 128;
        f22283o = i4;
        int i5 = i3 % 2;
        this.f22286c = false;
        this.f22288e = cVar;
        this.f22285b = null;
        int i6 = i4 + 43;
        f22282n = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void c(o.f.a aVar) {
        int i2 = 2 % 2;
        int i3 = f22283o + 81;
        f22282n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f22289f = aVar;
        } else {
            this.f22289f = aVar;
            throw null;
        }
    }

    public final o.f.a d() {
        int i2 = 2 % 2;
        int i3 = f22283o + 3;
        int i4 = i3 % 128;
        f22282n = i4;
        int i5 = i3 % 2;
        o.f.a aVar = this.f22289f;
        int i6 = i4 + 45;
        f22283o = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7 A[PHI: r14
  0x00b7: PHI (r14v7 long) = (r14v0 long), (r14v13 long) binds: [B:50:0x0460, B:12:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.cg.c e() {
        /*
            Method dump skipped, instruction units count: 1929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.d.e():o.cg.c");
    }

    public final void e(long j2) {
        int i2 = 2 % 2;
        int i3 = f22282n + 55;
        f22283o = i3 % 128;
        if (i3 % 2 != 0) {
            this.f22287d = j2;
        } else {
            this.f22287d = j2;
            throw null;
        }
    }
}
