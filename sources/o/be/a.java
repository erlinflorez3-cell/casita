package o.be;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f20935b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f20936d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f20937h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f20938i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f20939l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f20940m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f20941n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f20942p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20943a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20944c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20945e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r8, byte r9, short r10) {
        /*
            int r0 = r8 * 4
            int r8 = 3 - r0
            int r0 = r10 * 4
            int r7 = 1 - r0
            int r0 = r9 * 2
            int r0 = 121 - r0
            byte[] r6 = o.be.a.$$c
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2c
            r2 = r7
            r3 = r4
        L15:
            int r0 = -r0
            int r0 = r0 + r2
            r2 = r3
        L18:
            int r8 = r8 + 1
            byte r1 = (byte) r0
            int r3 = r2 + 1
            r5[r2] = r1
            if (r3 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r1 = r6[r8]
            r2 = r0
            r0 = r1
            goto L15
        L2c:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.be.a.$$e(byte, byte, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f20942p = -1911514589;
        f20941n = -1451210588;
        f20940m = 703320412;
        f20939l = -2043131342;
        f20937h = 1984296415;
        init$0();
        f20936d = 0;
        f20938i = 1;
        f20935b = new int[]{73164787, -1962433399, 2081393883, 1342723087, 1799269784, 1742716291, -789019550, -975009359, -1255877419, 1802816250, -738659684, 584572827, -1433558895, -645068554, 212716077, 1336297137, -290303377, -177743313};
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] b(android.content.Context r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.be.a.b(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{113, 60, -124, 107};
        $$b = 187;
    }

    static void init$1() {
        $$c = new byte[]{37, Ascii.SUB, MessagePack.Code.FLOAT32, 10};
        $$d = 60;
    }

    private static void q(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f20935b;
        int i4 = 989264422;
        long j2 = 0;
        float f2 = 0.0f;
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
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 675;
                        char c2 = (char) (1 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)));
                        int i7 = 12 - (TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(touchSlop, c2, i7, -328001469, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                    j2 = 0;
                    f2 = 0.0f;
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
        int[] iArr5 = f20935b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 31;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i5;
                        byte b5 = b4;
                        objA2 = o.d.d.a(View.resolveSize(i5, i5) + 675, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, -328001469, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(674 - Process.getGidForName(""), (char) ('0' - AndroidCharacter.getMirror('0')), ExpandableListView.getPackedPositionType(0L) + 12, -328001469, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i8++;
                }
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            cArr[i5] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $10 + 123;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                lVar.f19942e ^= iArr4[i10];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objA4 = o.d.d.a(301 - (Process.myTid() >> 22), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52697), TextUtils.indexOf("", "") + 11, -1416256172, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i10++;
            }
            int i14 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i14;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i15 = lVar.f19942e;
            int i16 = lVar.f19940a;
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
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 + 2);
                objA5 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 228, (char) (Color.alpha(0) + 51004), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, -330018025, false, $$e(b10, b11, (byte) (b11 - 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(byte r8, byte r9, short r10, java.lang.Object[] r11) {
        /*
            byte[] r7 = o.be.a.$$a
            int r6 = 101 - r8
            int r0 = r10 * 3
            int r5 = r0 + 4
            int r0 = r9 * 3
            int r4 = r0 + 1
            byte[] r3 = new byte[r4]
            r2 = 0
            if (r7 != 0) goto L2a
            r0 = r4
            r6 = r5
            r1 = r2
        L14:
            int r0 = -r0
            int r5 = r5 + 1
            int r6 = r6 + r0
        L18:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r11[r2] = r0
            return
        L27:
            r0 = r7[r5]
            goto L14
        L2a:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.be.a.r(byte, byte, short, java.lang.Object[]):void");
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f20936d + 57;
        int i4 = i3 % 128;
        f20938i = i4;
        int i5 = i3 % 2;
        String str = this.f20945e;
        int i6 = i4 + 93;
        f20936d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 69 / 0;
        }
        return str;
    }

    public final void a(String str) {
        int i2 = 2 % 2;
        int i3 = f20938i + 3;
        f20936d = i3 % 128;
        if (i3 % 2 == 0) {
            this.f20944c = str;
        } else {
            this.f20944c = str;
            int i4 = 80 / 0;
        }
    }

    public final void b(String str) {
        int i2 = 2 % 2;
        int i3 = f20936d + 97;
        int i4 = i3 % 128;
        f20938i = i4;
        int i5 = i3 % 2;
        this.f20943a = str;
        int i6 = i4 + 79;
        f20936d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f20938i + 31;
        int i4 = i3 % 128;
        f20936d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f20943a;
        int i5 = i4 + 3;
        f20938i = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void c(String str) {
        int i2 = 2 % 2;
        int i3 = f20936d;
        int i4 = i3 + 109;
        f20938i = i4 % 128;
        if (i4 % 2 == 0) {
            this.f20945e = str;
            int i5 = 13 / 0;
        } else {
            this.f20945e = str;
        }
        int i6 = i3 + 69;
        f20938i = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f20936d + 33;
        int i4 = i3 % 128;
        f20938i = i4;
        int i5 = i3 % 2;
        String str = this.f20944c;
        int i6 = i4 + 9;
        f20936d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
