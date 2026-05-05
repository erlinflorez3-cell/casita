package o.dj;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.f;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f23135b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f23136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h[] f23137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f23138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f23139f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23140g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23141h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f23142i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23143j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f23144l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f23145n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23146a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, short r10) {
        /*
            int r0 = r8 * 6
            int r8 = r0 + 67
            int r0 = r9 * 2
            int r7 = r0 + 1
            byte[] r6 = o.dj.h.$$a
            int r0 = r10 * 3
            int r5 = 4 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L2b
            r1 = r5
            r2 = r3
        L15:
            int r5 = r5 + 1
            int r8 = r8 + r1
            r1 = r2
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r0 = r6[r5]
            r1 = r8
            r8 = r0
            goto L15
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dj.h.$$c(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23144l = 0;
        f23145n = 1;
        f23140g = 0;
        f23141h = 1;
        e();
        Object[] objArr = new Object[1];
        Object obj = null;
        k(ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u0084\u0083\u0082\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, null, "\u0087\u0086\u0085\u0081", objArr2);
        f23136c = new h(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k(127 - (ViewConfiguration.getTapTimeout() >> 16), null, null, "\u0089\u0088\u0084", objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        k((ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, null, "\u0089\u0088\u0084", objArr4);
        f23138e = new h(strIntern2, 1, ((String) objArr4[0]).intern());
        f23137d = a();
        int i2 = f23145n + 3;
        f23144l = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private h(String str, int i2, String str2) {
        this.f23146a = str2;
    }

    private static /* synthetic */ h[] a() {
        int i2 = 2 % 2;
        int i3 = f23140g + 15;
        f23141h = i3 % 128;
        h[] hVarArr = new h[2];
        if (i3 % 2 == 0) {
            hVarArr[1] = f23136c;
            hVarArr[0] = f23138e;
        } else {
            hVarArr[0] = f23136c;
            hVarArr[1] = f23138e;
        }
        return hVarArr;
    }

    static void e() {
        f23135b = new char[]{2347, 2338, 2339, 2325, 2306, 2307, 2549, 2341, 2343};
        f23143j = 2040400230;
        f23142i = true;
        f23139f = true;
    }

    static void init$0() {
        $$a = new byte[]{111, MessagePack.Code.MAP16, MessagePack.Code.TRUE, Ascii.DC4};
        $$b = 150;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
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
        char[] cArr2 = (char[]) charArray;
        f fVar = new f();
        char[] cArr3 = f23135b;
        long j2 = 0;
        if (cArr3 != null) {
            int i4 = $10 + 45;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(Color.blue(0) + 593, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13181), (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) + 10, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $10 + 35;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f23143j)};
        Object objA2 = o.d.d.a(-1503702982);
        float f2 = 0.0f;
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - Color.blue(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f23139f) {
            int i8 = $11 + 33;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i10 = $10 + 85;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[fVar.f19922a] = (char) (cArr3[bArr[fVar.f19923e % fVar.f19922a] >> i2] % iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA3 = o.d.d.a(Color.rgb(0, 0, 0) + 16777674, (char) (ImageFormat.getBitsPerPixel(0) + 1), 11 - ExpandableListView.getPackedPositionType(0L), -1923924106, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objA4 = o.d.d.a(View.MeasureSpec.getSize(0) + 458, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11 - TextUtils.getCapsMode("", 0, 0), -1923924106, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            String str5 = new String(cArr4);
            int i11 = $10 + 123;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            objArr[0] = str5;
            return;
        }
        if (!f23142i) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr2.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i12 = $10 + 81;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr6[fVar.f19922a] = (char) (cArr3[cArr2[fVar.f19923e >>> fVar.f19922a] / i2] >> iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objA5 = o.d.d.a((TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)) + 458, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), -1923924106, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr7 = {fVar, fVar};
                Object objA6 = o.d.d.a(1540807955);
                if (objA6 == null) {
                    byte b10 = (byte) 1;
                    byte b11 = (byte) (b10 - 1);
                    objA6 = o.d.d.a(457 - Process.getGidForName(""), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 11 - KeyEvent.keyCodeFromString(""), -1923924106, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            f2 = 0.0f;
        }
        objArr[0] = new String(cArr6);
    }

    public static h valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f23141h + 5;
        f23140g = i3 % 128;
        int i4 = i3 % 2;
        h hVar = (h) Enum.valueOf(h.class, str);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f23141h + 43;
        f23140g = i5 % 128;
        int i6 = i5 % 2;
        return hVar;
    }

    public static h[] values() {
        int i2 = 2 % 2;
        int i3 = f23140g + 125;
        f23141h = i3 % 128;
        int i4 = i3 % 2;
        h[] hVarArr = f23137d;
        if (i4 != 0) {
            return (h[]) hVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
