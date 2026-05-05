package o.g;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import o.a.l;
import o.g.a;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f26237a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26238c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26239e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f26240b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f26241d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r8, int r9, short r10) {
        /*
            int r0 = r8 * 2
            int r8 = 121 - r0
            int r0 = r10 + 4
            byte[] r7 = o.g.i.$$h
            int r1 = r9 * 3
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2a
            r8 = r6
            r1 = r0
            r3 = r4
        L14:
            int r0 = -r0
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L18:
            int r1 = r0 + 1
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r3 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r7[r1]
            goto L14
        L2a:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.i.$$j(int, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f26239e = 0;
        f26238c = 1;
        f26237a = new int[]{-1603651752, 1321065449, -1810369601, -681484028, -1570957393, -956236799, 995210812, -162610210, -430449080, 1946972792, 240468710, 628615565, -170881081, -1697239306, 1811884816, 1779160462, 170792573, -1869508315};
    }

    public i(a.b bVar, Date date, d dVar, d dVar2, byte[] bArr) {
        super(bVar, date, dVar);
        this.f26241d = dVar2;
        if (bArr != null) {
            this.f26240b = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f26240b = null;
        }
    }

    static void init$0() {
        $$a = new byte[]{37, 121, MessagePack.Code.MAP32, 74};
        $$b = 42;
    }

    static void init$1() {
        $$d = new byte[]{Utf8.REPLACEMENT_BYTE, -81, -107, -8};
        $$e = 200;
    }

    static void init$2() {
        $$h = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$i = 152;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r8, byte r9, int r10, java.lang.Object[] r11) {
        /*
            byte[] r7 = o.g.i.$$a
            int r0 = r9 * 2
            int r6 = r0 + 4
            int r5 = 101 - r8
            int r1 = r10 * 2
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L2b
            r1 = r2
            r0 = r3
        L15:
            int r5 = r5 + r1
            int r6 = r6 + 1
            r1 = r0
        L19:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L28:
            r1 = r7[r6]
            goto L15
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.i.k(int, byte, int, java.lang.Object[]):void");
    }

    private static void n(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f26237a;
        char c2 = '0';
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        int deadChar = 675 - KeyEvent.getDeadChar(i5, i5);
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int iLastIndexOf = 11 - TextUtils.lastIndexOf("", c2);
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objA = o.d.d.a(deadChar, cIndexOf, iLastIndexOf, -328001469, false, $$j(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    c2 = '0';
                    i4 = 989264422;
                    i5 = 0;
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
        int[] iArr5 = f26237a;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $11 + 111;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 675, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.argb(0, 0, 0, 0) + 12, -328001469, false, $$j(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i7--;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i7])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 675, (char) Color.argb(0, 0, 0, 0), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -328001469, false, $$j(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i7++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i9 = $11 + 65;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i11 = $11 + 67;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < 16) {
                lVar.f19942e ^= iArr4[i13];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objA4 = o.d.d.a(301 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (52698 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -1416256172, false, $$j(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i13++;
                int i14 = $11 + 87;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 2 / 4;
                }
            }
            int i16 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i16;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i17 = lVar.f19942e;
            int i18 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                byte b10 = (byte) 2;
                byte b11 = (byte) (b10 - 2);
                objA5 = o.d.d.a(229 - Color.argb(0, 0, 0, 0), (char) (51004 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (-16777207) - Color.rgb(0, 0, 0), -330018025, false, $$j(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 2
            int r8 = 98 - r0
            int r2 = r6 * 3
            int r1 = 1 - r2
            int r0 = r7 * 3
            int r7 = 4 - r0
            byte[] r6 = o.g.i.$$d
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2f
            r0 = r3
            r8 = r7
            r2 = r4
        L18:
            int r0 = -r0
            int r7 = r7 + 1
            int r8 = r8 + r0
            r1 = r2
        L1d:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L2c
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L2c:
            r0 = r6[r7]
            goto L18
        L2f:
            r1 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.i.o(int, short, byte, java.lang.Object[]):void");
    }

    @Override // o.g.a
    public final byte[] a() {
        byte[] bArr;
        int i2 = 2 % 2;
        int i3 = f26239e + 43;
        f26238c = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {m().a()};
            int iNextInt = new Random().nextInt();
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = o.by.b.f21798b * 486364844;
            o.by.b.f21798b = i4;
            bArr = (byte[]) o.by.b.c(iNextInt, 148913438, objArr, elapsedCpuTime, i4, (int) Thread.currentThread().getId(), -148913437);
            int i5 = 21 / 0;
        } else {
            Object[] objArr2 = {m().a()};
            int iNextInt2 = new Random().nextInt();
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i6 = o.by.b.f21798b * 486364844;
            o.by.b.f21798b = i6;
            bArr = (byte[]) o.by.b.c(iNextInt2, 148913438, objArr2, elapsedCpuTime2, i6, (int) Thread.currentThread().getId(), -148913437);
        }
        int i7 = f26238c + 69;
        f26239e = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 27 / 0;
        }
        return bArr;
    }

    @Override // o.g.a
    public final o.m.i b() {
        int i2 = 2 % 2;
        int i3 = f26239e + 45;
        f26238c = i3 % 128;
        if (i3 % 2 == 0) {
            o.m.c.d().g();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.m.i iVarG = o.m.c.d().g();
        int i4 = f26239e + 79;
        f26238c = i4 % 128;
        int i5 = i4 % 2;
        return iVarG;
    }

    @Override // o.g.a
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26238c + 27;
        f26239e = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrD = this.f26241d.a().d();
        if (i4 != 0) {
            Object[] objArr = {bArrD, 99};
            Method declaredMethod = Class.forName(C1561oA.Kd("HVM\\ZUQ\u001cddZ^!6Vi\\.-", (short) (OY.Xd() ^ 13268))).getDeclaredMethod(Wg.Zd("?k4xB*!\u001d5.\u0010\u000f{\r", (short) (C1607wl.Xd() ^ 32275), (short) (C1607wl.Xd() ^ 31337)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Object[] objArr2 = {bArrD, 10};
        Method declaredMethod2 = Class.forName(C1561oA.Xd("\u0004\u0012\t\u0018\u0016\u0011\rW  \u0016\u001a\\q\u0012%\u0018ih", (short) (C1499aX.Xd() ^ (-19291)))).getDeclaredMethod(Wg.vd("\u0007\u0011\u0003\u0010\u0002\u0004o\fl\u000f\n\u0002\u0004}", (short) (C1580rY.Xd() ^ (-21072))), byte[].class, Integer.TYPE);
        try {
            declaredMethod2.setAccessible(true);
            return (String) declaredMethod2.invoke(null, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // o.g.a
    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f26238c + 99;
        f26239e = i3 % 128;
        int i4 = i3 % 2;
        o.by.b bVarA = m().a();
        if (i4 == 0) {
            return bVarA.d();
        }
        bVarA.d();
        throw null;
    }

    @Override // o.g.a
    public final byte[] e() {
        int i2 = 2 % 2;
        int i3 = f26238c + 97;
        f26239e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {m().a()};
        int iNextInt = new Random().nextInt();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = o.by.b.f21798b * 486364844;
        o.by.b.f21798b = i5;
        byte[] bArr = (byte[]) o.by.b.c(iNextInt, 148913438, objArr, elapsedCpuTime, i5, (int) Thread.currentThread().getId(), -148913437);
        int i6 = f26238c + 115;
        f26239e = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x061d  */
    @Override // o.g.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String j() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.i.j():java.lang.String");
    }
}
