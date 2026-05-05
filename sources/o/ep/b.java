package o.ep;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements o.en.a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ b[] f24424a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f24425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f24426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f24427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f24428f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f24429g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f24430h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f24431i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f24432j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24433b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, short r11) {
        /*
            int r0 = r11 * 3
            int r8 = r0 + 4
            byte[] r7 = o.ep.b.$$a
            int r0 = r9 * 2
            int r6 = 115 - r0
            int r1 = r10 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            r2 = -1
            if (r7 != 0) goto L2b
            r0 = r3
            r1 = r8
        L18:
            int r8 = r8 + r0
            int r1 = r1 + 1
        L1b:
            int r2 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r2 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r7[r1]
            goto L18
        L2b:
            r1 = r8
            r8 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.b.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24432j = 0;
        f24428f = 1;
        f24430h = 0;
        f24429g = 1;
        b();
        Object[] objArr = new Object[1];
        k(5 - TextUtils.indexOf((CharSequence) "", '0'), "\u0010\uffff\uffdd\u0001\u0012\u0005", true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 179, 3 - (Process.myTid() >> 22), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k(6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\f\ufffb\ufff7\ufff9\n\uffff", false, 152 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 2, objArr2);
        f24427e = new b(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k(8 - ImageFormat.getBitsPerPixel(0), "�\b\u000b\r￫￼�￼\u0006", true, 181 - MotionEvent.axisFromString(""), Color.argb(0, 0, 0, 0) + 5, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        k((ViewConfiguration.getScrollBarSize() >> 8) + 9, "\ufff9\b\n\b\u0005\ufffa\u0003\ufff9\ufffa", false, 152 - Process.getGidForName(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr4);
        f24425c = new b(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        k(TextUtils.lastIndexOf("", '0', 0) + 8, "￡\u0001\u0002\u0011\u0002\t\u0002", true, (-16777039) - Color.rgb(0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        k(7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0005\ufffe\r\ufffe��\ufffe", false, TextUtils.getCapsMode("", 0, 0) + 149, View.resolveSizeAndState(0, 0, 0) + 5, objArr6);
        f24426d = new b(strIntern3, 2, ((String) objArr6[0]).intern());
        f24424a = c();
        int i2 = f24428f + 75;
        f24432j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private b(String str, int i2, String str2) {
        this.f24433b = str2;
    }

    static void b() {
        f24431i = -1270219435;
    }

    private static /* synthetic */ b[] c() {
        int i2 = 2 % 2;
        int i3 = f24430h + 71;
        int i4 = i3 % 128;
        f24429g = i4;
        int i5 = i3 % 2;
        b[] bVarArr = {f24427e, f24425c, f24426d};
        int i6 = i4 + 45;
        f24430h = i6 % 128;
        int i7 = i6 % 2;
        return bVarArr;
    }

    static void init$0() {
        $$a = new byte[]{101, -104, -88, -105};
        $$b = 159;
    }

    private static void k(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $10 + 13;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f24431i)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 270, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 522;
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int windowTouchSlop = 12 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b4 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 1)));
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(iMakeMeasureSpec, doubleTapTimeout, windowTouchSlop, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i9 = $11 + 5;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i13 = $10 + 115;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 522;
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 13;
                    byte b6 = (byte) ($$b & 1);
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(pressedStateDuration, doubleTapTimeout2, iLastIndexOf, 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            int i15 = $11 + 67;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static b valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f24430h + 17;
        f24429g = i3 % 128;
        int i4 = i3 % 2;
        b bVar = (b) Enum.valueOf(b.class, str);
        if (i4 == 0) {
            int i5 = 58 / 0;
        }
        return bVar;
    }

    public static b[] values() {
        b[] bVarArr;
        int i2 = 2 % 2;
        int i3 = f24430h + 75;
        f24429g = i3 % 128;
        if (i3 % 2 == 0) {
            bVarArr = (b[]) f24424a.clone();
            int i4 = 97 / 0;
        } else {
            bVarArr = (b[]) f24424a.clone();
        }
        int i5 = f24430h + 33;
        f24429g = i5 % 128;
        int i6 = i5 % 2;
        return bVarArr;
    }

    @Override // o.en.a
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24430h;
        int i4 = i3 + 65;
        f24429g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f24433b;
        int i6 = i3 + 45;
        f24429g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f24430h + 41;
        int i4 = i3 % 128;
        f24429g = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f24433b;
        int i5 = i4 + 29;
        f24430h = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
