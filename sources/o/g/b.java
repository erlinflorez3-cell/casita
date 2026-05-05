package o.g;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f26183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f26184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f26186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f26187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ b[] f26188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f26189g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26190h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f26191i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f26192j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f26193k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26194l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26195m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f26196n = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, int r10) {
        /*
            int r0 = r10 * 6
            int r1 = 73 - r0
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r7 = o.g.b.$$a
            int r2 = r9 + 4
            byte[] r6 = new byte[r0]
            r5 = 0
            if (r7 != 0) goto L2a
            r4 = r8
            r0 = r2
            r3 = r5
        L14:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L17:
            byte r0 = (byte) r1
            r6[r3] = r0
            if (r3 != r8) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L22:
            int r0 = r2 + 1
            r2 = r7[r0]
            int r3 = r3 + 1
            r4 = r1
            goto L14
        L2a:
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.b.$$c(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26194l = 0;
        f26196n = 1;
        f26193k = 0;
        f26195m = 1;
        e();
        Object[] objArr = new Object[1];
        o((ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, null, "\u008a\u0085\u0089\u0088\u0087\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        f26186d = new b(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        o(127 - Gravity.getAbsoluteGravity(0, 0), null, null, "\u008a\u0088\u008f\u008e\u0085\u008d\u008b\u0089\u0088\u008b\u008c\u008b\u0081", objArr2);
        f26183a = new b(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        o(KeyEvent.normalizeMetaState(0) + 127, null, null, "\u008a\u0088\u008f\u008e\u0085\u008d\u0096\u0095\u008a\u0085\u008e\u0094\u0088\u0093\u0093\u0092\u0091\u008e\u0088\u0090\u0085\u0084\u0083\u0082\u0081", objArr3);
        f26185c = new b(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        o(Color.blue(0) + 127, null, null, "\u0082\u0092\u008e\u0083\u008e\u0091\u008a\u0088\u008f\u008e\u0085\u008d\u0096\u0095\u008b\u0085\u008a\u008a\u0099\u0098\u0094\u0088\u0097\u0085\u0084\u0083\u0082\u0081", objArr4);
        f26184b = new b(((String) objArr4[0]).intern(), 3);
        Object[] objArr5 = new Object[1];
        o(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, null, "\u0082\u0094\u0085\u008e\u008b\u0092\u0088\u009a\u008a\u0088\u008f\u008e\u0085\u008d\u0096\u0095\u008b\u0085\u008a\u008a\u0099\u0098\u0094\u0088\u0097\u0085\u0084\u0083\u0082\u0081", objArr5);
        f26187e = new b(((String) objArr5[0]).intern(), 4);
        f26188f = a();
        int i2 = f26196n + 107;
        f26194l = i2 % 128;
        int i3 = i2 % 2;
    }

    private b(String str, int i2) {
    }

    private static /* synthetic */ b[] a() {
        int i2 = 2 % 2;
        int i3 = f26195m + 1;
        f26193k = i3 % 128;
        if (i3 % 2 == 0) {
            return new b[]{f26186d, f26183a, f26185c, f26184b, f26187e};
        }
        b[] bVarArr = new b[4];
        bVarArr[1] = f26186d;
        bVarArr[1] = f26183a;
        bVarArr[2] = f26185c;
        bVarArr[5] = f26184b;
        bVarArr[4] = f26187e;
        return bVarArr;
    }

    static void e() {
        f26191i = new char[]{2447, 2145, 2163, 2173, 2175, 2451, 2150, 2149, 2157, 2174, 2148, 2169, 2439, 2158, 2170, 2436, 2433, 2159, 2146, 2144, 2448, 2155, 2460, 2160, 2171, 2449};
        f26190h = 2040400338;
        f26192j = true;
        f26189g = true;
    }

    static void init$0() {
        $$a = new byte[]{52, 50, -24, MessagePack.Code.MAP16};
        $$b = 195;
    }

    private static void o(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
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
            int i4 = $10 + 33;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f26191i;
        int i6 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(Color.red(i6) + 593, (char) (TextUtils.indexOf((CharSequence) "", '0') + 13182), TextUtils.indexOf("", "") + 11, -1225586509, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    i6 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f26190h)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 11 - TextUtils.getTrimmedLength(""), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f26189g) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA3 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 459, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, -1923924106, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (f26192j) {
            int i8 = $11 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i10 = $11 + 89;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 5 % 2;
            }
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA4 = o.d.d.a(458 - Color.blue(0), (char) (MotionEvent.axisFromString("") + 1), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1923924106, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = 0;
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i12;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i12 = fVar.f19922a + 1;
            }
        }
    }

    public static b valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f26193k + 5;
        f26195m = i3 % 128;
        int i4 = i3 % 2;
        b bVar = (b) Enum.valueOf(b.class, str);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f26195m + 115;
        f26193k = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return bVar;
    }

    public static b[] values() {
        int i2 = 2 % 2;
        int i3 = f26193k + 97;
        f26195m = i3 % 128;
        int i4 = i3 % 2;
        b[] bVarArr = (b[]) f26188f.clone();
        int i5 = f26193k + 77;
        f26195m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return bVarArr;
    }
}
