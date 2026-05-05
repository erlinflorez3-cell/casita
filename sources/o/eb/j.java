package o.eb;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j {
    private static final byte[] $$o = null;
    private static final int $$p = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static final String TAG;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f23644a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23645b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23646c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23647d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23648e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23649g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23650j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$q(byte r8, byte r9, short r10) {
        /*
            int r0 = r8 * 2
            int r8 = 5 - r0
            byte[] r7 = o.eb.j.$$o
            int r6 = 122 - r10
            int r0 = r9 * 4
            int r5 = r0 + 1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L28
            r0 = r5
            r2 = r3
        L13:
            int r0 = -r0
            int r6 = r6 + r0
            int r8 = r8 + 1
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r7[r8]
            goto L13
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.j.$$q(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23650j = 0;
        f23649g = 1;
        f23645b = 0;
        f23648e = 1;
        b();
        Object[] objArr = new Object[1];
        A((char) (View.MeasureSpec.getMode(0) + 17774), "놬憰Ỹ憺칞矟朎參ᱝ\udb34鴈\ue2d6⾕迮곢", "\u0000\u0000\u0000\u0000", "៛\uf8ef渞蝅", (ViewConfiguration.getWindowTouchSlop() >> 8) + 519630615, objArr);
        TAG = ((String) objArr[0]).intern();
        int i2 = f23649g + 71;
        f23650j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }

    private static void A(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + 55;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object obj = str4;
        if (str4 != null) {
            char[] charArray3 = str4.toCharArray();
            int i7 = $10 + 47;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            obj = charArray3;
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) obj).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i9 = $10 + 55;
            $11 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 107;
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int edgeSlop = 11 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b2 = $$o[0];
                    byte b3 = b2;
                    objA = o.d.d.a(iLastIndexOf, cResolveOpacity, edgeSlop, -155898465, false, $$q(b2, b3, (byte) ((b3 + 57) - (57 & b3))), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 847;
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 6488);
                    int windowTouchSlop = 12 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b4 = $$o[0];
                    byte b5 = b4;
                    objA2 = o.d.d.a(i11, trimmedLength, windowTouchSlop, -694521287, false, $$q(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 54)))), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    int iResolveOpacity = 458 - Drawable.resolveOpacity(0, 0);
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 11;
                    byte b6 = $$o[0];
                    byte b7 = b6;
                    objA3 = o.d.d.a(iResolveOpacity, threadPriority, longPressTimeout, 1804962841, false, $$q(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 56)))), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    int iAlpha = 639 - Color.alpha(0);
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 65100);
                    int mode = 12 - View.MeasureSpec.getMode(0);
                    byte b8 = $$o[0];
                    byte b9 = b8;
                    String str$$q = $$q(b8, b9, b9);
                    i3 = 2;
                    objA4 = o.d.d.a(iAlpha, keyRepeatDelay, mode, 1636969060, false, str$$q, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f23644a ^ 740602047300126166L)) ^ ((long) ((int) (((long) f23647d) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f23646c) ^ 740602047300126166L))));
                iVar.f19932b++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    static void b() {
        f23644a = 740602047300126166L;
        f23647d = -1233812187;
        f23646c = (char) 17878;
    }

    static void init$0() {
        $$o = new byte[]{0, -128, Ascii.EM, 70, MessagePack.Code.FIXEXT4};
        $$p = 125;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23648e + 39;
        f23645b = i3 % 128;
        if (i3 % 2 != 0) {
            super.equals(obj);
            throw null;
        }
        boolean zEquals = super.equals(obj);
        int i4 = f23648e + 77;
        f23645b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23645b + 5;
        f23648e = i3 % 128;
        if (i3 % 2 != 0) {
            super.finalize();
            return;
        }
        super.finalize();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f23645b + 33;
        f23648e = i3 % 128;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int iHashCode = super.hashCode();
        int i4 = f23648e + 59;
        f23645b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return iHashCode;
    }

    public abstract void onDisplayCancelled();

    public abstract void onDisplayImpossible(o.by.c cVar);

    public abstract void onDisplaySuccess();

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f23645b + 45;
        f23648e = i3 % 128;
        if (i3 % 2 != 0) {
            return super.toString();
        }
        super.toString();
        throw null;
    }
}
