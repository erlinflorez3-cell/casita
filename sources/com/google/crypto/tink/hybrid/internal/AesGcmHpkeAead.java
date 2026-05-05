package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
final class AesGcmHpkeAead implements HpkeAead {
    private final int keyLength;

    AesGcmHpkeAead(int keyLength) throws InvalidAlgorithmParameterException {
        if (keyLength != 16 && keyLength != 32) {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + keyLength);
        }
        this.keyLength = keyLength;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() throws GeneralSecurityException {
        int i2 = this.keyLength;
        if (i2 == 16) {
            return HpkeUtil.AES_128_GCM_AEAD_ID;
        }
        if (i2 == 32) {
            return HpkeUtil.AES_256_GCM_AEAD_ID;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
        return this.keyLength;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getNonceLength() {
        return 12;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] open(byte[] key, byte[] nonce, byte[] ciphertext, byte[] associatedData) throws GeneralSecurityException {
        if (key.length == this.keyLength) {
            return new InsecureNonceAesGcmJce(key, false).decrypt(nonce, ciphertext, associatedData);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + key.length);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] key, byte[] nonce, byte[] plaintext, byte[] associatedData) throws GeneralSecurityException {
        if (key.length == this.keyLength) {
            return new InsecureNonceAesGcmJce(key, false).encrypt(nonce, plaintext, associatedData);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + key.length);
    }
}
