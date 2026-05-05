package fr.antelop.sdk.authentication;

import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomerDeviceBiometricAuthenticationCredentials extends CustomerAuthenticationCredentials {
    private final Cipher cipher;

    public CustomerDeviceBiometricAuthenticationCredentials(Cipher cipher) {
        this.cipher = cipher;
    }

    public final Cipher getCipher() {
        return this.cipher;
    }
}
