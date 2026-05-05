package org.spongycastle.openpgp.operator.bc;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PBEDataDecryptorFactory;
import org.spongycastle.openpgp.operator.PGPDataDecryptor;

/* JADX INFO: loaded from: classes2.dex */
public class BcPBEDataDecryptorFactory extends PBEDataDecryptorFactory {
    public BcPBEDataDecryptorFactory(char[] cArr, BcPGPDigestCalculatorProvider bcPGPDigestCalculatorProvider) {
        super(cArr, bcPGPDigestCalculatorProvider);
    }

    @Override // org.spongycastle.openpgp.operator.PGPDataDecryptorFactory
    public PGPDataDecryptor createDataDecryptor(boolean z2, int i2, byte[] bArr) throws PGPException {
        return BcUtil.createDataDecryptor(z2, BcImplProvider.createBlockCipher(i2), bArr);
    }

    @Override // org.spongycastle.openpgp.operator.PBEDataDecryptorFactory
    public byte[] recoverSessionData(int i2, byte[] bArr, byte[] bArr2) throws PGPException {
        if (bArr2 != null) {
            try {
                if (bArr2.length > 0) {
                    BlockCipher blockCipherCreateBlockCipher = BcImplProvider.createBlockCipher(i2);
                    BufferedBlockCipher bufferedBlockCipherCreateSymmetricKeyWrapper = BcUtil.createSymmetricKeyWrapper(false, blockCipherCreateBlockCipher, bArr, new byte[blockCipherCreateBlockCipher.getBlockSize()]);
                    byte[] bArr3 = new byte[bArr2.length];
                    bufferedBlockCipherCreateSymmetricKeyWrapper.doFinal(bArr3, bufferedBlockCipherCreateSymmetricKeyWrapper.processBytes(bArr2, 0, bArr2.length, bArr3, 0));
                    return bArr3;
                }
            } catch (Exception e2) {
                throw new PGPException("Exception recovering session info", e2);
            }
        }
        byte[] bArr4 = new byte[bArr.length + 1];
        bArr4[0] = (byte) i2;
        System.arraycopy(bArr, 0, bArr4, 1, bArr.length);
        return bArr4;
    }
}
