package fr.antelop.sdk.authentication.prompt;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.q;
import o.d.d;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CustomerAuthenticationPrompt {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18797b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18798d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f18799e = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f18800l = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, byte r7, byte r8) {
        /*
            int r0 = r8 * 7
            int r8 = 78 - r0
            int r2 = r7 * 2
            int r1 = 1 - r2
            byte[] r7 = fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt.$$c
            int r0 = r6 * 4
            int r6 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L2e
            r2 = r8
            r1 = r4
            r0 = r6
        L18:
            int r6 = r6 + r2
            r8 = r6
            r6 = r0
        L1b:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r0 = r6 + 1
            if (r1 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r2 = r7[r0]
            int r1 = r1 + 1
            r6 = r8
            goto L18
        L2e:
            r1 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt.$$i(int, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18800l = 702719824;
        init$0();
        f18798d = 0;
        f18797b = 1;
        f18799e = 8956603185790452364L;
    }

    static void init$0() {
        $$a = new byte[]{45, 113, 111, 122};
        $$b = 241;
    }

    static void init$1() {
        $$g = new byte[]{49, -6, 40, 32, -65, 76, -76, 52};
        $$h = 42;
    }

    static void init$2() {
        $$c = new byte[]{99, Ascii.EM, 0, 108};
        $$f = 120;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(int r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r10 * 4
            int r8 = 1 - r0
            byte[] r7 = fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt.$$a
            int r6 = r9 + 99
            int r0 = r11 * 3
            int r5 = r0 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L2a
            r0 = r6
            r6 = r8
            r2 = r3
        L14:
            int r6 = r6 + r0
            int r5 = r5 + 1
            r1 = r2
        L18:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L27:
            r0 = r7[r5]
            goto L14
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt.n(int, int, int, java.lang.Object[]):void");
    }

    private static void o(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 39;
        $10 = i5 % 128;
        Object charArray = str2;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i8 = $10 + 33;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 731;
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 7933);
                    int i11 = 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b2 = $$c[2];
                    byte b3 = b2;
                    objA = d.a(keyRepeatTimeout, packedPositionType, i11, 355847088, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i10] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f18799e ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    int iRgb = (-16776380) - Color.rgb(0, 0, 0);
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27280);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 12;
                    byte b4 = $$c[2];
                    byte b5 = b4;
                    objA2 = d.a(iRgb, cLastIndexOf, iIndexOf, -2145994442, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i12 = $11 + 15;
                $10 = i12 % 128;
                int i13 = i12 % 2;
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
            int i14 = $10 + 1;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = d.a(1452497747);
                if (objA3 == null) {
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 836;
                    char cIndexOf = (char) (27279 - TextUtils.indexOf("", ""));
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 11;
                    byte b6 = $$c[2];
                    byte b7 = b6;
                    objA3 = d.a(maximumDrawingCacheSize, cIndexOf, iIndexOf2, -2145994442, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i15 = 99 / 0;
            } else {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = d.a(1452497747);
                if (objA4 == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 836;
                    char c2 = (char) (27279 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int iResolveOpacity = 11 - Drawable.resolveOpacity(0, 0);
                    byte b8 = $$c[2];
                    byte b9 = b8;
                    objA4 = d.a(scrollDefaultDelay, c2, iResolveOpacity, -2145994442, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 * 12
            int r7 = r0 + 99
            int r2 = r6 * 4
            int r1 = 5 - r2
            int r0 = r8 * 4
            int r6 = r0 + 4
            byte[] r5 = fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt.$$g
            byte[] r4 = new byte[r1]
            int r3 = 4 - r2
            r2 = 0
            if (r5 != 0) goto L2c
            r0 = r3
            r1 = r2
        L17:
            int r6 = r6 + 1
            int r7 = r7 + r0
        L1a:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2)
            r9[r2] = r0
            return
        L27:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L17
        L2c:
            r1 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt.p(short, short, byte, java.lang.Object[]):void");
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f18798d + 11;
        f18797b = i3 % 128;
        if (i3 % 2 != 0) {
            return super.equals(obj);
        }
        super.equals(obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f18797b + 15;
        f18798d = i3 % 128;
        if (i3 % 2 == 0) {
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
        int i3 = f18797b + 13;
        f18798d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f18798d + 103;
        f18797b = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt.toString():java.lang.String");
    }
}
