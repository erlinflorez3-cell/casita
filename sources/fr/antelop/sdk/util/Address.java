package fr.antelop.sdk.util;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.m;
import o.a.q;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class Address {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f19608a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19609b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f19610c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f19611d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f19612e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f19613f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f19614g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f19615h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19616i = 0;
    private final String administrativeArea;
    private final String countryCode;
    private final String line1;
    private final String line2;
    private final String locality;
    private final String postalCode;

    public static class Builder {
        private String administrativeArea;
        private String countryCode;
        private String line1;
        private String line2;
        private String locality;
        private String postalCode;

        public Address build() {
            return new Address(this.line1, this.line2, this.administrativeArea, this.countryCode, this.locality, this.postalCode);
        }

        public Builder setAdministrativeArea(String str) {
            this.administrativeArea = str;
            return this;
        }

        public Builder setCountryCode(String str) {
            this.countryCode = str;
            return this;
        }

        public Builder setLine1(String str) {
            this.line1 = str;
            return this;
        }

        public Builder setLine2(String str) {
            this.line2 = str;
            return this;
        }

        public Builder setLocality(String str) {
            this.locality = str;
            return this;
        }

        public Builder setPostalCode(String str) {
            this.postalCode = str;
            return this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r9, byte r10, int r11) {
        /*
            int r8 = 120 - r11
            byte[] r7 = fr.antelop.sdk.util.Address.$$c
            int r0 = r10 * 4
            int r6 = r0 + 1
            int r0 = r9 * 2
            int r5 = 3 - r0
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L2b
            r1 = r8
            r2 = r3
            r0 = r5
        L14:
            int r5 = r5 + r1
            r1 = r2
            r8 = r5
            r5 = r0
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            int r0 = r5 + 1
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r1 = r7[r0]
            r5 = r8
            goto L14
        L2b:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.util.Address.$$e(int, byte, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19615h = -2002135539;
        f19614g = 92072300;
        f19613f = -846334597;
        init$0();
        f19609b = 0;
        f19616i = 1;
        f19612e = 0;
        f19608a = 1;
        d();
        f19611d = 1870880818375127872L;
        int i2 = f19616i + 49;
        f19609b = i2 % 128;
        int i3 = i2 % 2;
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        this.line1 = str;
        this.line2 = str2;
        this.administrativeArea = str3;
        this.countryCode = str4;
        this.locality = str5;
        this.postalCode = str6;
    }

    static void d() {
        f19610c = new char[]{56506, 56558, 56551, 56550, 56555, 56538, 56537, 56558, 56558, 56553, 56548, 56555, 56556, 56548, 56550, 56558, 56539, 56532, 56547, 56505, 56555, 56550, 56551, 56558, 56555, 56547, 56532, 56539, 56560, 56538, 56534, 56554, 56555, 56558, 56558, 56549, 56556, 56496, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56526, 56561, 56528, 56505, 56532, 56547, 56555, 56558, 56505, 56555, 56548, 56546, 56553, 56563, 56553, 56553, 56561, 56553, 56555, 56562, 56563, 56556, 56521, 56523, 56554, 56555, 56550, 56546, 56553, 56563, 56529, 56523, 56558, 56555, 56547, 56548, 56521, 56525, 56552, 56553, 56560, 56555, 56552, 56525, 56529, 56566, 56566, 56529, 56324, 56711, 56710, 56502, 56552, 56548, 56521, 56527, 56561, 56560, 56553, 56521, 56529, 56566, 56566, 56529, 56525, 56552, 56555, 56560, 56553, 56552, 56525, 56522, 56557, 56563, 56553, 56546, 56548, 56546, 56546, 56553, 56551, 56545, 56471, 56523, 56554, 56555, 56550, 56546, 56553, 56563, 56529, 56523, 56558, 56555, 56547, 56548, 56521, 56525, 56552, 56553, 56560, 56555, 56552, 56525, 56529, 56566, 56566, 56529, 56526, 56558, 56551, 56547, 56554, 56555, 56550, 56546, 56553, 56563};
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:87|29)|(1:31)(4:32|85|33|(8:35|88|41|(1:43)(7:47|89|48|49|(5:77|53|(1:55)(5:61|83|62|63|(2:59|60))|56|(2:59|60))|67|68)|44|(0)|67|68)(1:36))|40|88|41|(0)(0)|44|(0)|67|68) */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x040c A[Catch: Exception -> 0x0408, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0408, blocks: (B:41:0x03dd, B:47:0x040c, B:49:0x0436, B:51:0x043e, B:52:0x0444, B:48:0x0416), top: B:88:0x03dd, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0445 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] d(int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.util.Address.d(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$b = 68;
    }

    static void init$1() {
        $$c = new byte[]{45, 113, 111, 122};
        $$d = 102;
    }

    private static void j(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = $10 + 3;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i9 = 0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        char[] cArr = f19610c;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                int i15 = $11 + 33;
                $10 = i15 % 128;
                if (i15 % i5 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                        Object objA = d.a(-2071388435);
                        if (objA == null) {
                            byte b2 = (byte) i9;
                            objA = d.a(TextUtils.getCapsMode("", i9, i9) + 249, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, 1376582792, false, $$e(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        cArr2[i14] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i14])};
                    Object objA2 = d.a(-2071388435);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = d.a(249 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.red(0) + 11, 1376582792, false, $$e(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE});
                    }
                    cArr2[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                }
                i14++;
                i5 = 2;
                i9 = 0;
            }
            int i16 = $10 + 63;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 4 % 3;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i11];
        System.arraycopy(cArr, i10, cArr3, 0, i11);
        if (bArr != null) {
            int i18 = $11 + 123;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr4 = new char[i11];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i11) {
                if (bArr[mVar.f19943d] == 1) {
                    int i20 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = d.a(120026474);
                    if (objA3 == null) {
                        objA3 = d.a(11 - (Process.myTid() >> 22), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i20] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                } else {
                    int i21 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = d.a(1632715197);
                    if (objA4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA4 = d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 837, (char) ((-16749937) - Color.rgb(0, 0, 0)), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1210801192, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i21] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = d.a(Drawable.resolveOpacity(0, 0) + 21, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35715), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i13 > 0) {
            int i22 = $10 + 55;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            char[] cArr5 = new char[i11];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i11);
            int i24 = i11 - i13;
            System.arraycopy(cArr5, 0, cArr3, i24, i13);
            System.arraycopy(cArr5, i13, cArr3, 0, i24);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i11];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i11) {
                    break;
                }
                int i25 = $10 + 97;
                $11 = i25 % 128;
                if (i25 % 2 == 0) {
                    cArr6[mVar.f19943d] = cArr3[mVar.f19943d * i11];
                    i4 = mVar.f19943d;
                    i3 = 1;
                } else {
                    i3 = 1;
                    cArr6[mVar.f19943d] = cArr3[(i11 - mVar.f19943d) - 1];
                    i4 = mVar.f19943d;
                }
                i2 = i4 + i3;
            }
            cArr3 = cArr6;
        }
        if (i12 > 0) {
            mVar.f19943d = 0;
            int i26 = $10 + 33;
            $11 = i26 % 128;
            int i27 = i26 % 2;
            while (mVar.f19943d < i11) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                mVar.f19943d++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r8, int r9, int r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 3
            int r8 = 100 - r0
            byte[] r7 = fr.antelop.sdk.util.Address.$$a
            int r0 = r9 * 4
            int r6 = 1 - r0
            int r0 = r10 * 2
            int r5 = r0 + 4
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L2d
            r0 = r5
            r2 = r3
        L15:
            int r8 = r8 + r5
            int r5 = r0 + 1
        L18:
            byte r0 = (byte) r8
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L27:
            r1 = r7[r5]
            r0 = r5
            r5 = r8
            r8 = r1
            goto L15
        L2d:
            r2 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.util.Address.k(int, int, int, java.lang.Object[]):void");
    }

    private static void l(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = null;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 21;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str2.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i5 = $10 + 91;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(View.combineMeasuredStates(0, 0) + 731, (char) (7932 - ((byte) KeyEvent.getModifierMetaStateMask())), Color.alpha(0) + 11, 355847088, false, $$e(b2, b3, (byte) ((b3 + 49) - (49 & b3))), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f19611d ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a((ViewConfiguration.getTapTimeout() >> 16) + 836, (char) (27278 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Color.red(0) + 11, -2145994442, false, $$e(b4, b5, (byte) (42 | b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i8 = $11 + 101;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 836, (char) ((Process.myTid() >> 22) + 27279), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, -2145994442, false, $$e(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 42)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public final String getAdministrativeArea() {
        int i2 = 2 % 2;
        int i3 = f19612e + 83;
        f19608a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.administrativeArea;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCountryCode() {
        int i2 = 2 % 2;
        int i3 = f19612e + 89;
        f19608a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.countryCode;
        }
        throw null;
    }

    public final String getLine1() {
        int i2 = 2 % 2;
        int i3 = f19608a;
        int i4 = i3 + 99;
        f19612e = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.line1;
        int i5 = i3 + 31;
        f19612e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLine2() {
        int i2 = 2 % 2;
        int i3 = f19608a + 109;
        int i4 = i3 % 128;
        f19612e = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.line2;
        int i5 = i4 + 55;
        f19608a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLocality() {
        int i2 = 2 % 2;
        int i3 = f19608a + 99;
        f19612e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.locality;
        }
        throw null;
    }

    public final String getPostalCode() {
        int i2 = 2 % 2;
        int i3 = f19608a + 105;
        int i4 = i3 % 128;
        f19612e = i4;
        int i5 = i3 % 2;
        String str = this.postalCode;
        int i6 = i4 + 117;
        f19608a = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
