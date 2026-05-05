package o.ea;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23542a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23543b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f23544c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23545d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23546e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23547g = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, byte r10) {
        /*
            int r7 = r10 + 102
            int r0 = r8 * 2
            int r6 = 3 - r0
            byte[] r5 = o.ea.i.$$a
            int r1 = r9 * 3
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L2a
            r1 = r3
            r0 = r6
        L15:
            int r6 = r6 + r7
            r7 = r6
            r6 = r0
        L18:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r0 = r6 + 1
            int r1 = r1 + 1
            r6 = r5[r0]
            goto L15
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.i.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23546e = 0;
        f23547g = 1;
        f23543b = 0;
        f23545d = 1;
        e();
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        int i2 = f23546e + 101;
        f23547g = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b4, code lost:
    
        r1 = o.ea.i.f23543b + 97;
        o.ea.i.f23545d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bd, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0061, code lost:
    
        if (r5.matches(((java.lang.String) r0[0]).intern()) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0063, code lost:
    
        r1 = o.ea.i.f23543b + 43;
        o.ea.i.f23545d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b2, code lost:
    
        if (r5.matches(((java.lang.String) r0[0]).intern()) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r14) throws java.lang.Throwable {
        /*
            r7 = 2
            int r0 = r7 % r7
            int r0 = o.ea.i.f23545d
            int r5 = r0 + 123
            int r0 = r5 % 128
            o.ea.i.f23543b = r0
            int r5 = r5 % r7
            java.lang.String r4 = "\n\u000e\u0001\u000b\f\r\u0003\u0005\u0005\u0006\u000f\u000e\b\u0003㗵"
            r3 = 8
            r1 = -1916120846(0xffffffff8dca50f2, float:-1.2468698E-30)
            r0 = 691068131(0x2930dce3, float:3.927144E-14)
            r6 = 0
            r2 = 1
            if (r5 == 0) goto L6d
            java.lang.Object[] r8 = new java.lang.Object[]{r14}
            int r12 = o.ea.m.f23563d
            int r12 = r12 * r0
            o.ea.m.f23563d = r12
            int r10 = o.ea.m.f23561b
            int r10 = r10 * r1
            o.ea.m.f23561b = r10
            int r14 = android.os.Process.myUid()
            long r0 = android.os.SystemClock.uptimeMillis()
            int r9 = (int) r0
            r13 = 327535505(0x1385cb91, float:3.3774652E-27)
            r11 = -327535505(0xffffffffec7a346f, float:-1.20991626E27)
            java.lang.Object r5 = o.ea.m.c(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r5 = (java.lang.String) r5
            int r0 = android.view.ViewConfiguration.getScrollBarSize()
            int r0 = r0 + (-52)
            int r3 = r3 >>> r0
            float r1 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 92
            int r0 = r0 << r1
            byte r1 = (byte) r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            f(r3, r4, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r5.matches(r0)
            if (r0 != 0) goto Lb4
        L63:
            int r0 = o.ea.i.f23543b
            int r1 = r0 + 43
            int r0 = r1 % 128
            o.ea.i.f23545d = r0
            int r1 = r1 % r7
            return r6
        L6d:
            java.lang.Object[] r8 = new java.lang.Object[]{r14}
            int r12 = o.ea.m.f23563d
            int r12 = r12 * r0
            o.ea.m.f23563d = r12
            int r10 = o.ea.m.f23561b
            int r10 = r10 * r1
            o.ea.m.f23561b = r10
            int r14 = android.os.Process.myUid()
            long r0 = android.os.SystemClock.uptimeMillis()
            int r9 = (int) r0
            r13 = 327535505(0x1385cb91, float:3.3774652E-27)
            r11 = -327535505(0xffffffffec7a346f, float:-1.20991626E27)
            java.lang.Object r5 = o.ea.m.c(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r5 = (java.lang.String) r5
            int r0 = android.view.ViewConfiguration.getScrollBarSize()
            int r0 = r0 >> r3
            int r3 = 15 - r0
            float r1 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = r0 + 54
            byte r1 = (byte) r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            f(r3, r4, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r5.matches(r0)
            if (r0 == 0) goto L63
        Lb4:
            int r0 = o.ea.i.f23543b
            int r1 = r0 + 97
            int r0 = r1 % 128
            o.ea.i.f23545d = r0
            int r1 = r1 % r7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ea.i.b(java.lang.String):boolean");
    }

    static void e() {
        f23544c = new char[]{64600, 64540, 64513, 64526, 64606, 64531, 64635, 64632, 64599, 64638, 64633, 64528, 64520, 64532, 64521, 64533};
        f23542a = (char) 51643;
    }

    private static void f(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = $10 + 47;
        $11 = i6 % 128;
        Object obj = null;
        Object obj2 = str2;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i7 = $10 + 63;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            obj2 = charArray;
        }
        char[] cArr = (char[]) obj2;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f23544c;
        int i9 = 421932776;
        int i10 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 117;
                $11 = i12 % 128;
                if (i12 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                        Object objA = o.d.d.a(i9);
                        if (objA == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA = o.d.d.a(270 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getTapTimeout() >> 16) + 11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i11] = ((Character) ((Method) objA).invoke(obj, objArr2)).charValue();
                        i4 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i11])};
                    Object objA2 = o.d.d.a(421932776);
                    if (objA2 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) View.MeasureSpec.getSize(0), 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i11++;
                    i4 = 2;
                    obj = null;
                }
                i9 = 421932776;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f23542a)};
        Object objA3 = o.d.d.a(421932776);
        char c2 = '\b';
        if (objA3 == null) {
            byte b7 = (byte) 0;
            byte b8 = b7;
            objA3 = o.d.d.a(270 - Color.blue(0), (char) (ViewConfiguration.getTouchSlop() >> 8), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -811348851, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i13 = $11 + 97;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i10];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i10] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = hVar;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = hVar;
                    objArr5[9] = hVar;
                    objArr5[c2] = Integer.valueOf(cCharValue);
                    objArr5[7] = hVar;
                    objArr5[6] = hVar;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = hVar;
                    objArr5[3] = hVar;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[i10] = hVar;
                    objArr5[0] = hVar;
                    Object objA4 = o.d.d.a(219124184);
                    if (objA4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objA4 = o.d.d.a(825 - TextUtils.indexOf("", ""), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, -611683395, false, $$c(b9, b10, (byte) (9 | b10)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                        Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA5 = o.d.d.a(-634864343);
                        if (objA5 == null) {
                            int keyRepeatDelay = 218 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int iMyPid = 11 - (Process.myPid() >> 22);
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            String str$$c = $$c(b11, b12, (byte) (7 | b12));
                            c2 = '\b';
                            objA5 = o.d.d.a(keyRepeatDelay, trimmedLength, iMyPid, 212688716, false, str$$c, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                        int i16 = $11 + 25;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        c2 = '\b';
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i18 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i18];
                            cArr4[hVar.f19926b + 1] = cArr2[i19];
                        } else {
                            int i20 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i21 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i20];
                            i10 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i21];
                        }
                    }
                    i10 = 1;
                }
                hVar.f19926b += 2;
            }
        }
        for (int i22 = 0; i22 < i2; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{39, 50, 101, -97};
        $$b = 49;
    }
}
