package org.spongycastle.openpgp.operator.bc;

import java.io.IOException;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.bcpg.ECDHPublicBCPGKey;
import org.spongycastle.bcpg.ECSecretBCPGKey;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.BufferedAsymmetricBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.operator.PGPDataDecryptor;
import org.spongycastle.openpgp.operator.PGPPad;
import org.spongycastle.openpgp.operator.PublicKeyDataDecryptorFactory;
import org.spongycastle.openpgp.operator.RFC6637Utils;

/* JADX INFO: loaded from: classes2.dex */
public class BcPublicKeyDataDecryptorFactory implements PublicKeyDataDecryptorFactory {
    private BcPGPKeyConverter keyConverter = new BcPGPKeyConverter();
    private PGPPrivateKey privKey;

    public BcPublicKeyDataDecryptorFactory(PGPPrivateKey pGPPrivateKey) {
        this.privKey = pGPPrivateKey;
    }

    @Override // org.spongycastle.openpgp.operator.PGPDataDecryptorFactory
    public PGPDataDecryptor createDataDecryptor(boolean z2, int i2, byte[] bArr) throws PGPException {
        return BcUtil.createDataDecryptor(z2, BcImplProvider.createBlockCipher(i2), bArr);
    }

    @Override // org.spongycastle.openpgp.operator.PublicKeyDataDecryptorFactory
    public byte[] recoverSessionData(int i2, byte[][] bArr) throws PGPException {
        try {
            if (i2 == 18) {
                ECDHPublicBCPGKey eCDHPublicBCPGKey = (ECDHPublicBCPGKey) this.privKey.getPublicKeyPacket().getKey();
                X9ECParameters byOID = NISTNamedCurves.getByOID(eCDHPublicBCPGKey.getCurveOID());
                byte[] bArr2 = bArr[0];
                int i3 = (((((-1) - (((-1) - bArr2[0]) | ((-1) - 255))) << 8) + ((-1) - (((-1) - bArr2[1]) | ((-1) - 255)))) + 7) / 8;
                byte[] bArr3 = new byte[i3];
                System.arraycopy(bArr2, 2, bArr3, 0, i3);
                int i4 = bArr2[i3 + 2];
                byte[] bArr4 = new byte[i4];
                System.arraycopy(bArr2, i3 + 3, bArr4, 0, i4);
                Wrapper wrapperCreateWrapper = BcImplProvider.createWrapper(eCDHPublicBCPGKey.getSymmetricKeyAlgorithm());
                wrapperCreateWrapper.init(false, new KeyParameter(new RFC6637KDFCalculator(new BcPGPDigestCalculatorProvider().get(eCDHPublicBCPGKey.getHashAlgorithm()), eCDHPublicBCPGKey.getSymmetricKeyAlgorithm()).createKey(byOID.getCurve().decodePoint(bArr3).multiply(((ECSecretBCPGKey) this.privKey.getPrivateKeyDataPacket()).getX()).normalize(), RFC6637Utils.createUserKeyingMaterial(this.privKey.getPublicKeyPacket(), new BcKeyFingerprintCalculator()))));
                return PGPPad.unpadSessionData(wrapperCreateWrapper.unwrap(bArr4, 0, i4));
            }
            AsymmetricBlockCipher asymmetricBlockCipherCreatePublicKeyCipher = BcImplProvider.createPublicKeyCipher(i2);
            AsymmetricKeyParameter privateKey = this.keyConverter.getPrivateKey(this.privKey);
            BufferedAsymmetricBlockCipher bufferedAsymmetricBlockCipher = new BufferedAsymmetricBlockCipher(asymmetricBlockCipherCreatePublicKeyCipher);
            bufferedAsymmetricBlockCipher.init(false, privateKey);
            if (i2 == 2 || i2 == 1) {
                byte[] bArr5 = bArr[0];
                bufferedAsymmetricBlockCipher.processBytes(bArr5, 2, bArr5.length - 2);
            } else {
                int iBitLength = (((ElGamalPrivateKeyParameters) new BcPGPKeyConverter().getPrivateKey(this.privKey)).getParameters().getP().bitLength() + 7) / 8;
                byte[] bArr6 = new byte[iBitLength];
                byte[] bArr7 = bArr[0];
                if (bArr7.length - 2 > iBitLength) {
                    bufferedAsymmetricBlockCipher.processBytes(bArr7, 3, bArr7.length - 3);
                } else {
                    System.arraycopy(bArr7, 2, bArr6, iBitLength - (bArr7.length - 2), bArr7.length - 2);
                    bufferedAsymmetricBlockCipher.processBytes(bArr6, 0, iBitLength);
                }
                byte[] bArr8 = bArr[1];
                for (int i5 = 0; i5 != iBitLength; i5++) {
                    bArr6[i5] = 0;
                }
                if (bArr8.length - 2 > iBitLength) {
                    bufferedAsymmetricBlockCipher.processBytes(bArr8, 3, bArr8.length - 3);
                } else {
                    System.arraycopy(bArr8, 2, bArr6, iBitLength - (bArr8.length - 2), bArr8.length - 2);
                    bufferedAsymmetricBlockCipher.processBytes(bArr6, 0, iBitLength);
                }
            }
            return bufferedAsymmetricBlockCipher.doFinal();
        } catch (IOException e2) {
            throw new PGPException("exception creating user keying material: " + e2.getMessage(), e2);
        } catch (InvalidCipherTextException e3) {
            throw new PGPException("exception encrypting session info: " + e3.getMessage(), e3);
        }
    }
}
