package o.bv;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.q;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$f = null;
    private static final int $$g = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f21723c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21724d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21725e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f21726g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f21727j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f21728k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f21729l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f21730m = 0;

    private static String $$h(int i2, byte b2, int i3) {
        int i4 = i3 + 4;
        byte[] bArr = $$f;
        int i5 = (b2 * 7) + 71;
        int i6 = i2 * 3;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i5 = i7 + (-i4);
            i4 = i4;
        }
        while (true) {
            i8++;
            int i9 = i4 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i9];
            i4 = i9;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f21730m = 40799399;
        f21729l = -1466389500;
        f21728k = 1172276159;
        f21727j = 1474607253;
        f21726g = 731547915;
        init$0();
        f21724d = 0;
        f21725e = 1;
        f21723c = -5817791604985199108L;
    }

    public static b d(Context context) throws Throwable {
        int i2 = 2 % 2;
        b bVarA = new h().a(context);
        int i3 = f21724d + 89;
        f21725e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return bVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x049f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] e(int r29, int r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bv.d.e(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{108, -10, -111, 117};
        $$b = 42;
    }

    static void init$1() {
        $$f = new byte[]{127, 52, 116, 98};
        $$g = 94;
    }

    private static void o(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(731 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (7933 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, 355847088, false, $$h(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() - (f21723c * 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(View.resolveSize(0, 0) + 836, (char) (27279 - (ViewConfiguration.getScrollBarSize() >> 8)), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2145994442, false, $$h(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = o.d.d.a(-1011865131);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 732, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7933), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, 355847088, false, $$h(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f21723c ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 837, (char) (View.getDefaultSize(0, 0) + 27279), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2145994442, false, $$h(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr6 = {qVar, qVar};
            Object objA5 = o.d.d.a(1452497747);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 + 1);
                objA5 = o.d.d.a(Color.blue(0) + 836, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27279), (Process.myPid() >> 22) + 11, -2145994442, false, $$h(b10, b11, (byte) (-b11)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        String str3 = new String(cArr2);
        int i7 = $11 + 65;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str3;
        } else {
            int i8 = 43 / 0;
            objArr[0] = str3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(byte r9, short r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 2
            int r8 = r0 + 1
            byte[] r7 = o.bv.d.$$a
            int r0 = r11 * 2
            int r6 = 100 - r0
            int r0 = r9 * 4
            int r5 = r0 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L2c
            r0 = r8
            r2 = r3
        L15:
            int r0 = -r0
            int r6 = r6 + r0
            int r5 = r5 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r8) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L29:
            r0 = r7[r5]
            goto L15
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bv.d.p(byte, short, int, java.lang.Object[]):void");
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f21725e + 77;
        f21724d = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        int i5 = f21725e + 83;
        f21724d = i5 % 128;
        if (i5 % 2 == 0) {
            return zEquals;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21724d + 47;
        f21725e = i3 % 128;
        int i4 = i3 % 2;
        super.finalize();
        int i5 = f21725e + 87;
        f21724d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f21724d + 65;
        f21725e = i3 % 128;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int iHashCode = super.hashCode();
        int i4 = f21725e + 9;
        f21724d = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f21724d + 63;
        f21725e = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        int i5 = f21724d + 85;
        f21725e = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
