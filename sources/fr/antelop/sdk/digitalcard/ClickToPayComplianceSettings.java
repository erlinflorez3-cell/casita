package fr.antelop.sdk.digitalcard;

import android.os.Process;
import android.os.SystemClock;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationDomain;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import o.er.n;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class ClickToPayComplianceSettings {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19025a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19026b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f19027c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f19028d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f19029e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f19030f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19031i = 0;
    private final n innerClickToPayComplianceSettings;

    public static class Builder {
        private String privacyUri;
        private String tncUri;

        public ClickToPayComplianceSettings build() throws WalletValidationException {
            String str = this.privacyUri;
            if (str == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`privacyUri` is null");
            }
            if (str.length() > 120) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_COMPLIANCE_SETTINGS, "`privacyUri` length is longer than 120 chars.");
            }
            String str2 = this.tncUri;
            if (str2 == null) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_CUSTOMER_PROFILE, "`tncUri` is null");
            }
            if (str2.length() <= 120) {
                return new ClickToPayComplianceSettings(new n(this.privacyUri, this.tncUri));
            }
            throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CLICK_TO_PAY_COMPLIANCE_SETTINGS, "`tncUri` length is longer than 120 chars.");
        }

        public Builder setPrivacyUri(String str) {
            this.privacyUri = str;
            return this;
        }

        public Builder setTncUri(String str) {
            this.tncUri = str;
            return this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r6, short r7, int r8) {
        /*
            int r3 = r8 * 3
            int r2 = 1 - r3
            byte[] r8 = fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings.$$c
            int r0 = r6 * 6
            int r0 = r0 + 67
            int r1 = r7 * 2
            int r7 = r1 + 4
            byte[] r6 = new byte[r2]
            r5 = 0
            int r4 = 0 - r3
            if (r8 != 0) goto L2e
            r1 = r7
            r3 = r5
        L17:
            int r0 = -r0
            int r0 = r0 + r7
            int r7 = r1 + 1
        L1b:
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            r2 = r8[r7]
            int r3 = r3 + 1
            r1 = r7
            r7 = r0
            r0 = r2
            goto L17
        L2e:
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings.$$g(short, short, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f19030f = -168560359;
        init$0();
        f19029e = 0;
        f19031i = 1;
        f19028d = new char[]{2111, 2080, 2106, 2092, 2081, 2087, 2144, 2093, 2125, 2071, 2090, 2107, 2083, 2141, 2082, 2109, 2085, 2094, 2124, 2084, 2088, 2105, 2118, 2086, 2143, 2122, 2091};
        f19026b = 2040400286;
        f19025a = true;
        f19027c = true;
    }

    public ClickToPayComplianceSettings(n nVar) {
        this.innerClickToPayComplianceSettings = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 3
            int r8 = 4 - r0
            int r0 = 101 - r7
            int r7 = r6 * 4
            int r1 = r7 + 1
            byte[] r6 = fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L2b
            r3 = r4
            r2 = r7
        L13:
            int r0 = -r0
            int r0 = r0 + r2
            int r8 = r8 + 1
        L17:
            byte r1 = (byte) r0
            r5[r3] = r1
            if (r3 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L24:
            int r3 = r3 + 1
            r1 = r6[r8]
            r2 = r0
            r0 = r1
            goto L13
        L2b:
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings.g(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int[] r21, java.lang.String r22, int r23, java.lang.String r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings.h(int[], java.lang.String, int, java.lang.String, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{42, MessagePack.Code.FLOAT64, -71, 92};
        $$b = 7;
    }

    static void init$1() {
        $$d = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32, -14, 66, MessagePack.Code.FLOAT64, -15, -8, Ascii.CR, -9, -5, -3, 64, -71, Ascii.CR, -9, 59, MessagePack.Code.EXT16, -7, 0, -4, -13, 17, -13, 7, 0, -19, Ascii.FF, 52, MessagePack.Code.FIXEXT4, -21, -11, -4, -3, Ascii.DC2, -13, 39, MessagePack.Code.NEGFIXINT_PREFIX, -19, Ascii.FF, Ascii.DC4, MessagePack.Code.FIXEXT8, 6, 9, -5, -15, 33, MessagePack.Code.ARRAY32, -6, 9, -8, -1, 72, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.FLOAT64, 10, -5, 6, -3, -15};
        $$e = 131;
    }

    static void init$2() {
        $$c = new byte[]{74, -74, 100, -77};
        $$f = 238;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(byte r9, byte r10, byte r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings.$$d
            int r0 = r11 * 5
            int r1 = 102 - r0
            int r0 = r9 * 57
            int r2 = 60 - r0
            int r0 = r10 * 57
            int r7 = r0 + 1
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L30
            r0 = r2
            r1 = r7
            r4 = r5
        L16:
            int r2 = -r2
            int r1 = r1 + r2
            int r1 = r1 + (-2)
            r3 = r4
            r2 = r0
        L1c:
            int r0 = r2 + 1
            int r4 = r3 + 1
            byte r2 = (byte) r1
            r6[r3] = r2
            if (r4 != r7) goto L2d
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r12[r5] = r0
            return
        L2d:
            r2 = r8[r0]
            goto L16
        L30:
            r3 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings.j(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x05e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final o.er.n getInnerClickToPayComplianceSettings() {
        /*
            Method dump skipped, instruction units count: 2036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.ClickToPayComplianceSettings.getInnerClickToPayComplianceSettings():o.er.n");
    }

    public final String getPrivacyUri() {
        int i2 = 2 % 2;
        int i3 = f19031i + 29;
        f19029e = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerClickToPayComplianceSettings.a();
            throw null;
        }
        String strA = this.innerClickToPayComplianceSettings.a();
        int i4 = f19031i + 25;
        f19029e = i4 % 128;
        int i5 = i4 % 2;
        return strA;
    }

    public final String getTncUri() {
        String str;
        int i2 = 2 % 2;
        int i3 = f19029e + 73;
        f19031i = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerClickToPayComplianceSettings};
            int i4 = n.f25090b * 366820712;
            n.f25090b = i4;
            int i5 = n.f25092d * (-107017395);
            n.f25092d = i5;
            str = (String) n.b(i4, (int) SystemClock.elapsedRealtime(), Process.myUid(), objArr, 445238705, i5, -445238705);
            int i6 = 5 / 0;
        } else {
            Object[] objArr2 = {this.innerClickToPayComplianceSettings};
            int i7 = n.f25090b * 366820712;
            n.f25090b = i7;
            int i8 = n.f25092d * (-107017395);
            n.f25092d = i8;
            str = (String) n.b(i7, (int) SystemClock.elapsedRealtime(), Process.myUid(), objArr2, 445238705, i8, -445238705);
        }
        int i9 = f19031i + 7;
        f19029e = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 67 / 0;
        }
        return str;
    }
}
