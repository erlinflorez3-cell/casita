package fr.antelop.sdk.authentication.prompt;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPrompt;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.q;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class PinCustomerAuthenticationPromptBuilder extends CustomerAuthenticationPromptBuilder {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18830a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18831b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f18832c = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f18833f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18834g = 0;
    private String biometryFallbackAccessibilityHint;
    private String biometryFallbackAccessibilityLabel;
    private String closeAccessibilityLabel;
    private String deleteAccessibilityHint;
    private String deleteAccessibilityLabel;
    private String digitsCounterAccessibilityLabel;
    private String digitsCounterAccessibilityValueFormat;
    private PinCustomerAuthenticationPrompt.InvalidPinMessageProvider invalidPinMessageProvider;
    private boolean pinCheckDisabled;
    private String subtitle;
    private String title;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$l(int r7, short r8, int r9) {
        /*
            int r2 = r8 * 2
            int r1 = 1 - r2
            int r0 = r7 * 4
            int r8 = 4 - r0
            int r0 = r9 * 7
            int r3 = 78 - r0
            byte[] r7 = fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder.$$j
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2d
            r3 = r8
            r0 = r4
            r2 = r5
        L18:
            int r8 = r8 + 1
            int r0 = -r0
            int r3 = r3 + r0
            r1 = r2
        L1d:
            byte r0 = (byte) r3
            r6[r1] = r0
            int r2 = r1 + 1
            if (r1 != r4) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L2a:
            r0 = r7[r8]
            goto L18
        L2d:
            r1 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder.$$l(int, short, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18834g = 606527973;
        f18833f = 1320059577;
        init$0();
        f18831b = 0;
        f18830a = 1;
        f18832c = 834682992162756370L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 3
            int r8 = 4 - r0
            int r0 = r10 * 5
            int r7 = 106 - r0
            int r6 = r9 * 2
            int r0 = r6 + 1
            byte[] r5 = fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder.$$a
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L2f
            r2 = r8
            r7 = r6
            r1 = r3
        L16:
            int r8 = r8 + r7
            int r0 = r2 + 1
            r7 = r8
            r8 = r0
        L1b:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L28:
            int r1 = r1 + 1
            r0 = r5[r8]
            r2 = r8
            r8 = r0
            goto L16
        L2f:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder.h(int, int, short, java.lang.Object[]):void");
    }

    private static void i(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 87;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = $10 + 109;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(731 - Color.red(0), (char) ((Process.myPid() >> 22) + 7933), Color.red(0) + 11, 355847088, false, $$l(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f18832c ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(836 - View.resolveSizeAndState(0, 0, 0), (char) (27279 - Color.argb(0, 0, 0, 0)), 10 - TextUtils.lastIndexOf("", '0', 0), -2145994442, false, $$l(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $11 + 45;
                $10 = i9 % 128;
                int i10 = i9 % 2;
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
                objA3 = d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 835, (char) (27279 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 11 - View.resolveSizeAndState(0, 0, 0), -2145994442, false, $$l(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$b = 167;
    }

    static void init$1() {
        $$g = new byte[]{5, Ascii.SO, 124, -17, MessagePack.Code.FALSE, Base64.padSymbol, MessagePack.Code.EXT32, 57};
        $$h = 70;
    }

    static void init$2() {
        $$j = new byte[]{119, -86, Ascii.SYN, 102};
        $$k = 41;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r0 = r8 * 4
            int r6 = r0 + 4
            int r0 = r9 * 11
            int r5 = 111 - r0
            byte[] r4 = fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder.$$g
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L2c
            r0 = r6
            r1 = r2
        L15:
            int r6 = r6 + 1
            int r5 = r5 + r0
            int r5 = r5 + (-3)
        L1a:
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r10[r2] = r0
            return
        L27:
            int r1 = r1 + 1
            r0 = r4[r6]
            goto L15
        L2c:
            r1 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder.j(int, short, byte, java.lang.Object[]):void");
    }

    @Override // fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder
    public final /* synthetic */ CustomerAuthenticationPrompt build() {
        int i2 = 2 % 2;
        int i3 = f18830a + 13;
        f18831b = i3 % 128;
        int i4 = i3 % 2;
        PinCustomerAuthenticationPrompt pinCustomerAuthenticationPromptBuild = build();
        int i5 = f18830a + 57;
        f18831b = i5 % 128;
        if (i5 % 2 == 0) {
            return pinCustomerAuthenticationPromptBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder
    public final PinCustomerAuthenticationPrompt build() {
        int i2 = 2 % 2;
        PinCustomerAuthenticationPrompt pinCustomerAuthenticationPrompt = new PinCustomerAuthenticationPrompt(this.title, this.subtitle, this.invalidPinMessageProvider, this.closeAccessibilityLabel, this.deleteAccessibilityLabel, this.deleteAccessibilityHint, this.digitsCounterAccessibilityLabel, this.digitsCounterAccessibilityValueFormat, this.biometryFallbackAccessibilityLabel, this.biometryFallbackAccessibilityHint, this.pinCheckDisabled);
        int i3 = f18831b + 71;
        f18830a = i3 % 128;
        int i4 = i3 % 2;
        return pinCustomerAuthenticationPrompt;
    }

    public final PinCustomerAuthenticationPromptBuilder setBiometryFallbackAccessibilityHint(String str) {
        int i2 = 2 % 2;
        int i3 = f18831b;
        int i4 = i3 + 77;
        f18830a = i4 % 128;
        if (i4 % 2 == 0) {
            this.biometryFallbackAccessibilityHint = str;
            int i5 = 43 / 0;
        } else {
            this.biometryFallbackAccessibilityHint = str;
        }
        int i6 = i3 + 7;
        f18830a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 71 / 0;
        }
        return this;
    }

    public final PinCustomerAuthenticationPromptBuilder setBiometryFallbackAccessibilityLabel(String str) {
        int i2 = 2 % 2;
        int i3 = f18830a + 105;
        int i4 = i3 % 128;
        f18831b = i4;
        int i5 = i3 % 2;
        this.biometryFallbackAccessibilityLabel = str;
        int i6 = i4 + 35;
        f18830a = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final PinCustomerAuthenticationPromptBuilder setCloseAccessibilityLabel(String str) {
        int i2 = 2 % 2;
        int i3 = f18831b + 63;
        f18830a = i3 % 128;
        if (i3 % 2 != 0) {
            this.closeAccessibilityLabel = str;
            return this;
        }
        this.closeAccessibilityLabel = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PinCustomerAuthenticationPromptBuilder setDeleteAccessibilityHint(String str) {
        int i2 = 2 % 2;
        int i3 = f18831b;
        int i4 = i3 + 55;
        f18830a = i4 % 128;
        if (i4 % 2 == 0) {
            this.deleteAccessibilityHint = str;
            int i5 = 33 / 0;
        } else {
            this.deleteAccessibilityHint = str;
        }
        int i6 = i3 + 89;
        f18830a = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final PinCustomerAuthenticationPromptBuilder setDeleteAccessibilityLabel(String str) {
        int i2 = 2 % 2;
        int i3 = f18830a;
        int i4 = i3 + 27;
        f18831b = i4 % 128;
        int i5 = i4 % 2;
        this.deleteAccessibilityLabel = str;
        int i6 = i3 + 81;
        f18831b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 14 / 0;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070 A[PHI: r11
  0x0070: PHI (r11v5 long) = (r11v1 long), (r11v11 long) binds: [B:24:0x02da, B:8:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder setDigitsCounterAccessibilityLabel(java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder.setDigitsCounterAccessibilityLabel(java.lang.String):fr.antelop.sdk.authentication.prompt.PinCustomerAuthenticationPromptBuilder");
    }

    public final PinCustomerAuthenticationPromptBuilder setDigitsCounterAccessibilityValueFormat(String str) {
        int i2 = 2 % 2;
        int i3 = f18831b + 49;
        int i4 = i3 % 128;
        f18830a = i4;
        if (i3 % 2 == 0) {
            this.digitsCounterAccessibilityValueFormat = str;
            throw null;
        }
        this.digitsCounterAccessibilityValueFormat = str;
        int i5 = i4 + 125;
        f18831b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final PinCustomerAuthenticationPromptBuilder setInvalidPinMessageProvider(PinCustomerAuthenticationPrompt.InvalidPinMessageProvider invalidPinMessageProvider) {
        int i2 = 2 % 2;
        int i3 = f18831b;
        int i4 = i3 + 35;
        f18830a = i4 % 128;
        int i5 = i4 % 2;
        this.invalidPinMessageProvider = invalidPinMessageProvider;
        int i6 = i3 + 55;
        f18830a = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final PinCustomerAuthenticationPromptBuilder setPinCheckDisabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f18830a;
        int i4 = i3 + 19;
        f18831b = i4 % 128;
        int i5 = i4 % 2;
        this.pinCheckDisabled = z2;
        int i6 = i3 + 121;
        f18831b = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final PinCustomerAuthenticationPromptBuilder setSubtitle(String str) {
        int i2 = 2 % 2;
        int i3 = f18830a + 113;
        f18831b = i3 % 128;
        if (i3 % 2 != 0) {
            this.subtitle = str;
            int i4 = 53 / 0;
        } else {
            this.subtitle = str;
        }
        return this;
    }

    public final PinCustomerAuthenticationPromptBuilder setTitle(String str) {
        int i2 = 2 % 2;
        int i3 = f18830a + 55;
        f18831b = i3 % 128;
        if (i3 % 2 != 0) {
            this.title = str;
            int i4 = 21 / 0;
        } else {
            this.title = str;
        }
        return this;
    }
}
