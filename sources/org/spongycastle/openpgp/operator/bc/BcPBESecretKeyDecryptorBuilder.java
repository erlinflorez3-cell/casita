package org.spongycastle.openpgp.operator.bc;

import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PBESecretKeyDecryptor;
import org.spongycastle.openpgp.operator.PGPDigestCalculatorProvider;

/* JADX INFO: loaded from: classes2.dex */
public class BcPBESecretKeyDecryptorBuilder {
    private PGPDigestCalculatorProvider calculatorProvider;

    public BcPBESecretKeyDecryptorBuilder(PGPDigestCalculatorProvider pGPDigestCalculatorProvider) {
        this.calculatorProvider = pGPDigestCalculatorProvider;
    }

    public PBESecretKeyDecryptor build(char[] cArr) {
        return new PBESecretKeyDecryptor(cArr, this.calculatorProvider) { // from class: org.spongycastle.openpgp.operator.bc.BcPBESecretKeyDecryptorBuilder.1
            @Override // org.spongycastle.openpgp.operator.PBESecretKeyDecryptor
            public byte[] recoverKeyData(int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws PGPException {
                try {
                    BufferedBlockCipher bufferedBlockCipherCreateSymmetricKeyWrapper = BcUtil.createSymmetricKeyWrapper(false, BcImplProvider.createBlockCipher(i2), bArr, bArr2);
                    byte[] bArr4 = new byte[i4];
                    bufferedBlockCipherCreateSymmetricKeyWrapper.doFinal(bArr4, bufferedBlockCipherCreateSymmetricKeyWrapper.processBytes(bArr3, i3, i4, bArr4, 0));
                    return bArr4;
                } catch (InvalidCipherTextException e2) {
                    throw new PGPException("decryption failed: " + e2.getMessage(), e2);
                }
            }
        };
    }
}
