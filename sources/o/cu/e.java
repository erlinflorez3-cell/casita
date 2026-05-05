package o.cu;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.f;
import o.fg.d;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends b<d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f22662a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22663b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f22664c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22665d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f22666e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22667f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22668g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22669j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(byte r7, int r8, short r9) {
        /*
            int r2 = r7 * 4
            int r1 = 1 - r2
            int r0 = r8 * 6
            int r8 = r0 + 67
            int r0 = r9 + 4
            byte[] r7 = o.cu.e.$$d
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2b
            r8 = r4
            r1 = r0
            r2 = r5
        L16:
            int r8 = r8 + r0
            r0 = r1
            r3 = r2
        L19:
            byte r2 = (byte) r8
            int r1 = r0 + 1
            r6[r3] = r2
            int r2 = r3 + 1
            if (r3 != r4) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L28:
            r0 = r7[r1]
            goto L16
        L2b:
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cu.e.$$f(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22667f = 0;
        f22669j = 1;
        f22665d = 0;
        f22668g = 1;
        c();
        TextUtils.indexOf("", "", 0, 0);
        int i2 = f22667f + 31;
        f22669j = i2 % 128;
        int i3 = i2 % 2;
    }

    static void c() {
        f22666e = new char[]{2097, 2093, 2075, 2072, 2089, 2074, 2091, 2088, 2108, 2053, 2065, 2078, 2099, 2106, 2090, 2073, 2069, 2064};
        f22663b = 2040400268;
        f22662a = true;
        f22664c = true;
    }

    private static void h(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            int i5 = $10 + 125;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f22666e;
        if (cArr2 != null) {
            int i7 = $10 + 5;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 63;
                $10 = i10 % 128;
                if (i10 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(593 - (Process.myTid() >> 22), (char) (13181 - ExpandableListView.getPackedPositionType(0L)), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -1225586509, false, $$f(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i9 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                    Object objA2 = o.d.d.a(1618406102);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(593 - KeyEvent.getDeadChar(0, 0), (char) (13181 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10, -1225586509, false, $$f(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i3 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f22663b)};
        Object objA3 = o.d.d.a(-1503702982);
        if (objA3 == null) {
            objA3 = o.d.d.a(Color.rgb(0, 0, 0) + 16777248, (char) TextUtils.getOffsetAfter("", 0), KeyEvent.keyCodeFromString("") + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
        if (f22664c) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA4 = o.d.d.a(458 - View.resolveSize(0, 0), (char) Color.argb(0, 0, 0, 0), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1923924106, false, $$f(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f22662a) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            String str5 = new String(cArr5);
            int i11 = $10 + 59;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            objArr[0] = str5;
            return;
        }
        int i13 = $10 + 85;
        $11 = i13 % 128;
        int i14 = i13 % 2;
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i15 = $10 + 3;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = fVar.f19922a;
                int i17 = fVar.f19923e;
                cArr6[i16] = (char) (cArr2[cArr[fVar.f19922a] % i2] / iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objA5 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 458, (char) Color.green(0), 10 - MotionEvent.axisFromString(""), -1923924106, false, $$f(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr7 = {fVar, fVar};
                Object objA6 = o.d.d.a(1540807955);
                if (objA6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 1);
                    objA6 = o.d.d.a(TextUtils.indexOf("", "") + 458, (char) ((Process.getThreadPriority(0) + 20) >> 6), 11 - TextUtils.getTrimmedLength(""), -1923924106, false, $$f(b10, b11, (byte) (-b11)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            int i18 = $10 + 31;
            $11 = i18 % 128;
            int i19 = i18 % 2;
        }
        String str6 = new String(cArr6);
        int i20 = $11 + 63;
        $10 = i20 % 128;
        int i21 = i20 % 2;
        objArr[0] = str6;
    }

    static void init$0() {
        $$d = new byte[]{93, -2, -4, -85};
        $$e = 96;
    }

    @Override // o.cu.b
    protected final d c(short s2, int i2, byte[] bArr) throws Throwable {
        String strIntern;
        Object obj;
        int i3 = 2 % 2;
        int i4 = f22665d + 87;
        f22668g = i4 % 128;
        int i5 = i4 % 2;
        if (!(!o.ea.f.a())) {
            int i6 = f22665d + 99;
            f22668g = i6 % 128;
            if (i6 % 2 == 0) {
                Object[] objArr = new Object[1];
                h(84 >>> Process.getGidForName(""), null, null, "\u0086\u0085\u0088\u0082\u0085\u008e\u008a\u0085\u008d\u0084\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0086\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                h(12047 >>> (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1)), null, null, "\u008a\u0085\u008d\u0084\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0092\u0091\u0090\u008f", objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                h(126 - Process.getGidForName(""), null, null, "\u0086\u0085\u0088\u0082\u0085\u008e\u008a\u0085\u008d\u0084\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0086\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                h(128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, null, "\u008a\u0085\u008d\u0084\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0092\u0091\u0090\u008f", objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        d dVar = new d(true, o.ff.b.f25845c, s2);
        dVar.a(i2);
        dVar.c(bArr);
        int i7 = f22665d + 77;
        f22668g = i7 % 128;
        int i8 = i7 % 2;
        return dVar;
    }
}
