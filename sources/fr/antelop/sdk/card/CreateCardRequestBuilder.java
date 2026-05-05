package fr.antelop.sdk.card;

import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.k;
import o.d.d;
import o.ed.a;
import o.z.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class CreateCardRequestBuilder {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f18929a = 0;

    /* JADX INFO: renamed from: b */
    public static int f18930b = 0;

    /* JADX INFO: renamed from: c */
    private static int f18931c = 0;

    /* JADX INFO: renamed from: d */
    private static int f18932d = 0;

    /* JADX INFO: renamed from: e */
    private static long f18933e = 0;
    private String bin;
    private int binLength;
    private String cardholderName;
    private String cvx2;
    private String expiryDate;
    private String financialAccountLabel;
    private String financialAccountNumber;
    private String idemiaAuthCode;
    private byte[] idemiaCipheredCardInformation;
    private String issuerCardId;
    private String issuerData;
    private String lastDigits;
    private byte[] mdesFundingAccountInfo;
    private String mdesPushAccountReceipt;
    private byte[] mdesTav;
    private String pan;
    private CreateCardRequestPanSource panSource;
    private boolean requireTermsAndConditionsApproval;
    private a secureCvx2;
    private a securePan;
    private byte[] vtsEncPaymentInstrument;

    private static String $$g(short s2, short s3, byte b2) {
        int i2 = 114 - (s3 * 7);
        byte[] bArr = $$c;
        int i3 = s2 * 3;
        int i4 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i2;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i4];
            i4++;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18930b = -1737691962;
        f18929a = -725042128;
        init$0();
        f18932d = 0;
        f18931c = 1;
        f18933e = -90584299504707833L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r9, short r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 4
            int r8 = 4 - r0
            byte[] r7 = fr.antelop.sdk.card.CreateCardRequestBuilder.$$a
            int r6 = r9 + 98
            int r5 = r10 * 3
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r7 != 0) goto L29
            r0 = r5
            r1 = r8
            r2 = r3
        L14:
            int r8 = r8 + r0
            int r1 = r1 + 1
        L17:
            byte r0 = (byte) r8
            r4[r2] = r0
            if (r2 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L24:
            int r2 = r2 + 1
            r0 = r7[r1]
            goto L14
        L29:
            r2 = r3
            r1 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.CreateCardRequestBuilder.f(byte, short, int, java.lang.Object[]):void");
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f18933e ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i6 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f18933e)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = d.a((ViewConfiguration.getEdgeSlop() >> 16) + 229, (char) (View.resolveSize(0, 0) + 51004), (ViewConfiguration.getWindowTouchSlop() >> 8) + 9, 1749983833, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(674 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 522683165, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i7 = $11 + 59;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i9 = $10 + 75;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = fr.antelop.sdk.card.CreateCardRequestBuilder.$$d
            int r0 = r11 + 4
            int r1 = 49 - r10
            int r7 = r9 + 97
            byte[] r6 = new byte[r1]
            int r5 = 48 - r10
            r4 = 0
            if (r8 != 0) goto L2b
            r7 = r5
            r1 = r0
            r3 = r4
        L12:
            int r7 = r7 + r0
            int r7 = r7 + 1
            r0 = r1
            r2 = r3
        L17:
            byte r1 = (byte) r7
            r6[r2] = r1
            int r1 = r0 + 1
            int r3 = r2 + 1
            if (r2 != r5) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r4)
            r12[r4] = r0
            return
        L28:
            r0 = r8[r1]
            goto L12
        L2b:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.CreateCardRequestBuilder.h(short, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{119, -27, 45, 98};
        $$b = 16;
    }

    static void init$1() {
        $$d = new byte[]{53, 102, 82, Ascii.ETB, Ascii.VT, -69, 50, Ascii.FF, 5, -16, 6, 2, 0, -67, 68, -16, 6, MessagePack.Code.FALSE, 69, -3, -18, Ascii.FF, 4, -19, 1, 16, -12, 5, -2, -65, 57, -6, 1, MessagePack.Code.EXT16, Ascii.EM, Ascii.SUB, 1, -18, Ascii.GS, -18, Ascii.FF, 4, -19, 1, 16, -12, 5, -2, -28, 32, -16, 10, -66, 52, 3, MessagePack.Code.BIN32, 50, Ascii.VT, -69, 50, Ascii.FF, 5, -16, 6, 2, 0, -67, 68, -16, 6, MessagePack.Code.FALSE, 53, 4, -3, 1, 10, -20, 10, -10, -3, 16, -15, MessagePack.Code.EXT32, Ascii.DC4, 40, -4, -7, 7, -24, Ascii.SUB, MessagePack.Code.NEGFIXINT_PREFIX, 16, Ascii.ETB, MessagePack.Code.STR8, 17, Ascii.FF, 3, -14, -7, 1};
        $$e = 101;
    }

    static void init$2() {
        $$c = new byte[]{Ascii.EM, -93, 95, -122};
        $$f = 221;
    }

    public final c build() {
        int i2 = 2 % 2;
        c cVar = new c(this);
        int i3 = f18932d + 7;
        f18931c = i3 % 128;
        if (i3 % 2 != 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBin() {
        int i2 = 2 % 2;
        int i3 = f18932d + 117;
        int i4 = i3 % 128;
        f18931c = i4;
        int i5 = i3 % 2;
        String str = this.bin;
        int i6 = i4 + 73;
        f18932d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return str;
    }

    public final int getBinLength() {
        int i2 = 2 % 2;
        int i3 = f18932d;
        int i4 = i3 + 39;
        f18931c = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.binLength;
        int i7 = i3 + 53;
        f18931c = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCardholderName() {
        int i2 = 2 % 2;
        int i3 = f18932d;
        int i4 = i3 + 97;
        f18931c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.cardholderName;
        int i6 = i3 + 83;
        f18931c = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getCvx2() {
        int i2 = 2 % 2;
        int i3 = f18931c;
        int i4 = i3 + 23;
        f18932d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.cvx2;
        int i6 = i3 + 53;
        f18932d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getExpiryDate() {
        int i2 = 2 % 2;
        int i3 = f18931c + 65;
        f18932d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.expiryDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFinancialAccountLabel() {
        int i2 = 2 % 2;
        int i3 = f18932d;
        int i4 = i3 + 9;
        f18931c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.financialAccountLabel;
        int i6 = i3 + 25;
        f18931c = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFinancialAccountNumber() {
        int i2 = 2 % 2;
        int i3 = f18931c;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18932d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.financialAccountNumber;
        int i5 = i3 + 7;
        f18932d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIdemiaAuthCode() {
        int i2 = 2 % 2;
        int i3 = f18931c + 81;
        f18932d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.idemiaAuthCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final byte[] getIdemiaCipheredCardInformation() {
        int i2 = 2 % 2;
        int i3 = f18932d + 7;
        int i4 = i3 % 128;
        f18931c = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        byte[] bArr = this.idemiaCipheredCardInformation;
        int i5 = i4 + 85;
        f18932d = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    public final String getIssuerAccountId() {
        int i2 = 2 % 2;
        int i3 = f18931c + 9;
        f18932d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.issuerCardId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIssuerCardId() {
        int i2 = 2 % 2;
        int i3 = f18932d + 57;
        f18931c = i3 % 128;
        if (i3 % 2 != 0) {
            return this.issuerCardId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIssuerData() {
        int i2 = 2 % 2;
        int i3 = f18931c;
        int i4 = i3 + 79;
        f18932d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.issuerData;
        int i6 = i3 + 89;
        f18932d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0615  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getLastDigits() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.CreateCardRequestBuilder.getLastDigits():java.lang.String");
    }

    public final byte[] getMdesFundingAccountInfo() {
        int i2 = 2 % 2;
        int i3 = f18932d + 115;
        f18931c = i3 % 128;
        if (i3 % 2 != 0) {
            return this.mdesFundingAccountInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMdesPushAccountReceipt() {
        int i2 = 2 % 2;
        int i3 = f18932d;
        int i4 = i3 + 101;
        f18931c = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.mdesPushAccountReceipt;
        int i5 = i3 + 17;
        f18931c = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] getMdesTav() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.CreateCardRequestBuilder.getMdesTav():byte[]");
    }

    public final String getPan() {
        int i2 = 2 % 2;
        int i3 = f18932d + 27;
        f18931c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pan;
        if (i4 == 0) {
            int i5 = 44 / 0;
        }
        return str;
    }

    public final CreateCardRequestPanSource getPanSource() {
        int i2 = 2 % 2;
        int i3 = f18932d + 63;
        int i4 = i3 % 128;
        f18931c = i4;
        int i5 = i3 % 2;
        CreateCardRequestPanSource createCardRequestPanSource = this.panSource;
        int i6 = i4 + 7;
        f18932d = i6 % 128;
        if (i6 % 2 == 0) {
            return createCardRequestPanSource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final a getSecureCvx2() {
        int i2 = 2 % 2;
        int i3 = f18932d + 53;
        f18931c = i3 % 128;
        if (i3 % 2 != 0) {
            return this.secureCvx2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final a getSecurePan() {
        int i2 = 2 % 2;
        int i3 = f18931c;
        int i4 = i3 + 121;
        f18932d = i4 % 128;
        int i5 = i4 % 2;
        a aVar = this.securePan;
        int i6 = i3 + 87;
        f18932d = i6 % 128;
        if (i6 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    public final byte[] getVtsEncPaymentInstrument() {
        int i2 = 2 % 2;
        int i3 = f18932d + 87;
        int i4 = i3 % 128;
        f18931c = i4;
        int i5 = i3 % 2;
        byte[] bArr = this.vtsEncPaymentInstrument;
        int i6 = i4 + 29;
        f18932d = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateCardRequestBuilder requireTermsAndConditionsApproval(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f18931c;
        int i4 = i3 + 73;
        f18932d = i4 % 128;
        if (i4 % 2 != 0) {
            this.requireTermsAndConditionsApproval = z2;
            throw null;
        }
        this.requireTermsAndConditionsApproval = z2;
        int i5 = i3 + 27;
        f18932d = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final boolean requiresTermsAndConditionsApproval() {
        int i2 = 2 % 2;
        int i3 = f18931c + 45;
        f18932d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.requireTermsAndConditionsApproval;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateCardRequestBuilder setBin(String str) {
        int i2 = 2 % 2;
        int i3 = f18931c + 71;
        int i4 = i3 % 128;
        f18932d = i4;
        int i5 = i3 % 2;
        this.bin = str;
        int i6 = i4 + 113;
        f18931c = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final CreateCardRequestBuilder setBinLength(int i2) {
        int i3 = 2 % 2;
        int i4 = f18932d + 45;
        int i5 = i4 % 128;
        f18931c = i5;
        if (i4 % 2 == 0) {
            this.binLength = i2;
            throw null;
        }
        this.binLength = i2;
        int i6 = i5 + 65;
        f18932d = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setCardholderName(String str) {
        int i2 = 2 % 2;
        int i3 = f18931c + 103;
        f18932d = i3 % 128;
        if (i3 % 2 == 0) {
            this.cardholderName = str;
            return this;
        }
        this.cardholderName = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateCardRequestBuilder setCvx2(String str) {
        int i2 = 2 % 2;
        int i3 = f18931c + 101;
        f18932d = i3 % 128;
        if (i3 % 2 != 0) {
            this.cvx2 = str;
            int i4 = 59 / 0;
        } else {
            this.cvx2 = str;
        }
        return this;
    }

    public final CreateCardRequestBuilder setCvx2(a aVar) {
        int i2 = 2 % 2;
        int i3 = f18932d + 29;
        int i4 = i3 % 128;
        f18931c = i4;
        if (i3 % 2 == 0) {
            this.secureCvx2 = aVar;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.secureCvx2 = aVar;
        int i5 = i4 + 15;
        f18932d = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setExpiryDate(String str) {
        int i2 = 2 % 2;
        int i3 = f18932d + 85;
        int i4 = i3 % 128;
        f18931c = i4;
        int i5 = i3 % 2;
        this.expiryDate = str;
        int i6 = i4 + 17;
        f18932d = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final CreateCardRequestBuilder setFinancialAccountLabel(String str) {
        int i2 = 2 % 2;
        int i3 = f18932d + 87;
        int i4 = i3 % 128;
        f18931c = i4;
        int i5 = i3 % 2;
        this.financialAccountLabel = str;
        int i6 = i4 + 55;
        f18932d = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setFinancialAccountNumber(String str) {
        int i2 = 2 % 2;
        int i3 = f18932d + 69;
        int i4 = i3 % 128;
        f18931c = i4;
        int i5 = i3 % 2;
        this.financialAccountNumber = str;
        int i6 = i4 + 35;
        f18932d = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setIdemiaAuthenticationCode(String str) {
        int i2 = 2 % 2;
        int i3 = f18932d + 115;
        int i4 = i3 % 128;
        f18931c = i4;
        int i5 = i3 % 2;
        this.idemiaAuthCode = str;
        int i6 = i4 + 85;
        f18932d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 41 / 0;
        }
        return this;
    }

    public final CreateCardRequestBuilder setIdemiaCipheredCardInformation(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f18931c + 107;
        int i4 = i3 % 128;
        f18932d = i4;
        if (i3 % 2 != 0) {
            this.idemiaCipheredCardInformation = bArr;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.idemiaCipheredCardInformation = bArr;
        int i5 = i4 + 93;
        f18931c = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setIssuerAccountId(String str) {
        int i2 = 2 % 2;
        int i3 = f18932d;
        int i4 = i3 + 69;
        f18931c = i4 % 128;
        if (i4 % 2 == 0) {
            this.issuerCardId = str;
            int i5 = 41 / 0;
        } else {
            this.issuerCardId = str;
        }
        int i6 = i3 + 27;
        f18931c = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setIssuerCardId(String str) {
        int i2 = 2 % 2;
        int i3 = f18932d + 57;
        int i4 = i3 % 128;
        f18931c = i4;
        int i5 = i3 % 2;
        this.issuerCardId = str;
        int i6 = i4 + 65;
        f18932d = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateCardRequestBuilder setIssuerData(String str) {
        int i2 = 2 % 2;
        int i3 = f18931c + 101;
        f18932d = i3 % 128;
        if (i3 % 2 == 0) {
            this.issuerData = str;
            return this;
        }
        this.issuerData = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateCardRequestBuilder setLastDigits(String str) {
        int i2 = 2 % 2;
        int i3 = f18932d + 103;
        f18931c = i3 % 128;
        if (i3 % 2 != 0) {
            this.lastDigits = str;
            return this;
        }
        this.lastDigits = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateCardRequestBuilder setMdesFundingAccountInfo(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f18931c + 5;
        int i4 = i3 % 128;
        f18932d = i4;
        if (i3 % 2 != 0) {
            this.mdesFundingAccountInfo = bArr;
            throw null;
        }
        this.mdesFundingAccountInfo = bArr;
        int i5 = i4 + 53;
        f18931c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return this;
    }

    public final CreateCardRequestBuilder setMdesPushAccountReceipt(String str) {
        int i2 = 2 % 2;
        int i3 = f18931c + 59;
        int i4 = i3 % 128;
        f18932d = i4;
        int i5 = i3 % 2;
        this.mdesPushAccountReceipt = str;
        int i6 = i4 + 97;
        f18931c = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setMdesTav(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f18931c + 5;
        f18932d = i3 % 128;
        if (i3 % 2 == 0) {
            this.mdesTav = bArr;
            return this;
        }
        this.mdesTav = bArr;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateCardRequestBuilder setPan(String str) {
        int i2 = 2 % 2;
        int i3 = f18931c + 73;
        int i4 = i3 % 128;
        f18932d = i4;
        int i5 = i3 % 2;
        this.pan = str;
        int i6 = i4 + 81;
        f18931c = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateCardRequestBuilder setPan(a aVar) {
        int i2 = 2 % 2;
        int i3 = f18932d;
        int i4 = i3 + 51;
        f18931c = i4 % 128;
        int i5 = i4 % 2;
        this.securePan = aVar;
        int i6 = i3 + 69;
        f18931c = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setPanSource(CreateCardRequestPanSource createCardRequestPanSource) {
        int i2 = 2 % 2;
        int i3 = f18931c;
        int i4 = i3 + 39;
        f18932d = i4 % 128;
        int i5 = i4 % 2;
        this.panSource = createCardRequestPanSource;
        int i6 = i3 + 123;
        f18932d = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final CreateCardRequestBuilder setVtsEncPaymentInstrument(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f18932d + 81;
        f18931c = i3 % 128;
        if (i3 % 2 != 0) {
            this.vtsEncPaymentInstrument = bArr;
            return this;
        }
        this.vtsEncPaymentInstrument = bArr;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
