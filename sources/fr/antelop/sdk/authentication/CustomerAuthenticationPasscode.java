package fr.antelop.sdk.authentication;

import o.g.d;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomerAuthenticationPasscode extends CustomerAuthenticationCredentials {
    private static final int MAX_PASSCODE_LENGTH = 8;
    private static final int MIN_PASSCODE_LENGTH = 4;
    private final d value;

    public CustomerAuthenticationPasscode(byte[] bArr) {
        this.value = new d(bArr);
    }

    public final d getValue() {
        return this.value;
    }

    public final boolean isValid() {
        int iE = this.value.e();
        return this.value.b() && iE >= 4 && iE <= 8;
    }
}
