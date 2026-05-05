package fr.antelop.sdk.authentication;

import androidx.webkit.ProxyConfig;
import o.g.d;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomerAuthenticationIssuerPasscode extends CustomerAuthenticationCredentials {
    private static final int MAX_CRYPTOGRAM_EXTRA_DATA_LENGTH = 1024;
    private static final int MAX_CRYPTOGRAM_LENGTH = 8192;
    private static final int MAX_ISSUER_PASSCODE_LENGTH = 8;
    private static final int MIN_CRYPTOGRAM_EXTRA_DATA_LENGTH = 0;
    private static final int MIN_CRYPTOGRAM_LENGTH = 0;
    private static final int MIN_ISSUER_PASSCODE_LENGTH = 4;
    private final d cryptogram;
    private final byte[] cryptogramExtraData;
    private final d passcode;

    public CustomerAuthenticationIssuerPasscode(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.passcode = new d(bArr);
        this.cryptogram = new d(bArr2);
        this.cryptogramExtraData = bArr3;
    }

    public final d getCryptogram() {
        return this.cryptogram;
    }

    public final byte[] getCryptogramExtraData() {
        return this.cryptogramExtraData;
    }

    public final d getPasscode() {
        return this.passcode;
    }

    public final boolean isValid() {
        int iE = this.passcode.e();
        int iE2 = this.cryptogram.e();
        boolean z2 = this.passcode.b() && iE >= 4 && iE <= 8;
        boolean z3 = iE2 > 0 && iE2 <= 8192;
        byte[] bArr = this.cryptogramExtraData;
        return z2 && z3 && (bArr == null || (bArr.length > 0 && bArr.length <= 1024));
    }

    public final String toString() {
        String string = "";
        for (int i2 = 0; i2 < getPasscode().e(); i2++) {
            string = new StringBuilder().append(string).append(ProxyConfig.MATCH_ALL_SCHEMES).toString();
        }
        return new StringBuilder("CustomerAuthenticationIssuerPasscode{passcode='").append(string).append(", cryptogram='").append(getCryptogram()).append("', cryptogramExtraData='").append(getCryptogramExtraData()).append("'}").toString();
    }
}
