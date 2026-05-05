package org.spongycastle.openpgp.operator.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHKey;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.bcpg.ECDHPublicBCPGKey;
import org.spongycastle.bcpg.PublicKeyPacket;
import org.spongycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.PGPPublicKey;
import org.spongycastle.openpgp.operator.PGPDataDecryptor;
import org.spongycastle.openpgp.operator.PGPPad;
import org.spongycastle.openpgp.operator.PublicKeyDataDecryptorFactory;
import org.spongycastle.openpgp.operator.RFC6637Utils;

/* JADX INFO: loaded from: classes2.dex */
public class JcePublicKeyDataDecryptorFactoryBuilder {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private OperatorHelper contentHelper = new OperatorHelper(new DefaultJcaJceHelper());
    private JcaPGPKeyConverter keyConverter = new JcaPGPKeyConverter();
    private JcaKeyFingerprintCalculator fingerprintCalculator = new JcaKeyFingerprintCalculator();

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] decryptSessionData(int i2, PrivateKey privateKey, byte[][] bArr) throws PGPException {
        Cipher cipherCreatePublicKeyCipher = this.helper.createPublicKeyCipher(i2);
        try {
            cipherCreatePublicKeyCipher.init(2, privateKey);
            if (i2 == 2 || i2 == 1) {
                byte[] bArr2 = bArr[0];
                cipherCreatePublicKeyCipher.update(bArr2, 2, bArr2.length - 2);
            } else {
                int iBitLength = (((DHKey) privateKey).getParams().getP().bitLength() + 7) / 8;
                byte[] bArr3 = new byte[iBitLength];
                byte[] bArr4 = bArr[0];
                if (bArr4.length - 2 > iBitLength) {
                    cipherCreatePublicKeyCipher.update(bArr4, 3, bArr4.length - 3);
                } else {
                    System.arraycopy(bArr4, 2, bArr3, iBitLength - (bArr4.length - 2), bArr4.length - 2);
                    cipherCreatePublicKeyCipher.update(bArr3);
                }
                byte[] bArr5 = bArr[1];
                for (int i3 = 0; i3 != iBitLength; i3++) {
                    bArr3[i3] = 0;
                }
                if (bArr5.length - 2 > iBitLength) {
                    cipherCreatePublicKeyCipher.update(bArr5, 3, bArr5.length - 3);
                } else {
                    System.arraycopy(bArr5, 2, bArr3, iBitLength - (bArr5.length - 2), bArr5.length - 2);
                    cipherCreatePublicKeyCipher.update(bArr3);
                }
            }
            try {
                return cipherCreatePublicKeyCipher.doFinal();
            } catch (Exception e2) {
                throw new PGPException("exception decrypting session data", e2);
            }
        } catch (InvalidKeyException e3) {
            throw new PGPException("error setting asymmetric cipher", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] decryptSessionData(JcaPGPKeyConverter jcaPGPKeyConverter, PGPPrivateKey pGPPrivateKey, byte[][] bArr) throws PGPException {
        PublicKeyPacket publicKeyPacket = pGPPrivateKey.getPublicKeyPacket();
        ECDHPublicBCPGKey eCDHPublicBCPGKey = (ECDHPublicBCPGKey) publicKeyPacket.getKey();
        X9ECParameters byOID = NISTNamedCurves.getByOID(eCDHPublicBCPGKey.getCurveOID());
        byte[] bArr2 = bArr[0];
        int i2 = bArr2[0];
        int i3 = ((i2 + 255) - (i2 | 255)) << 8;
        int i4 = bArr2[1];
        int i5 = ((i3 + ((i4 + 255) - (i4 | 255))) + 7) / 8;
        byte[] bArr3 = new byte[i5];
        System.arraycopy(bArr2, 2, bArr3, 0, i5);
        int i6 = bArr2[i5 + 2];
        byte[] bArr4 = new byte[i6];
        System.arraycopy(bArr2, i5 + 3, bArr4, 0, i6);
        ECPoint eCPointDecodePoint = byOID.getCurve().decodePoint(bArr3);
        try {
            byte[] bArrCreateUserKeyingMaterial = RFC6637Utils.createUserKeyingMaterial(publicKeyPacket, this.fingerprintCalculator);
            KeyAgreement keyAgreementCreateKeyAgreement = this.helper.createKeyAgreement(RFC6637Utils.getAgreementAlgorithm(publicKeyPacket));
            keyAgreementCreateKeyAgreement.init(jcaPGPKeyConverter.getPrivateKey(pGPPrivateKey), new UserKeyingMaterialSpec(bArrCreateUserKeyingMaterial));
            keyAgreementCreateKeyAgreement.doPhase(jcaPGPKeyConverter.getPublicKey(new PGPPublicKey(new PublicKeyPacket(18, new Date(), new ECDHPublicBCPGKey(eCDHPublicBCPGKey.getCurveOID(), eCPointDecodePoint, eCDHPublicBCPGKey.getHashAlgorithm(), eCDHPublicBCPGKey.getSymmetricKeyAlgorithm())), this.fingerprintCalculator)), true);
            SecretKey secretKeyGenerateSecret = keyAgreementCreateKeyAgreement.generateSecret(RFC6637Utils.getKeyEncryptionOID(eCDHPublicBCPGKey.getSymmetricKeyAlgorithm()).getId());
            Cipher cipherCreateKeyWrapper = this.helper.createKeyWrapper(eCDHPublicBCPGKey.getSymmetricKeyAlgorithm());
            cipherCreateKeyWrapper.init(4, secretKeyGenerateSecret);
            return PGPPad.unpadSessionData(cipherCreateKeyWrapper.unwrap(bArr4, "Session", 3).getEncoded());
        } catch (IOException e2) {
            throw new PGPException("error setting asymmetric cipher", e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new PGPException("error setting asymmetric cipher", e3);
        } catch (InvalidKeyException e4) {
            throw new PGPException("error setting asymmetric cipher", e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new PGPException("error setting asymmetric cipher", e5);
        } catch (GeneralSecurityException e6) {
            throw new PGPException("error setting asymmetric cipher", e6);
        }
    }

    public PublicKeyDataDecryptorFactory build(final PrivateKey privateKey) {
        return new PublicKeyDataDecryptorFactory() { // from class: org.spongycastle.openpgp.operator.jcajce.JcePublicKeyDataDecryptorFactoryBuilder.1
            @Override // org.spongycastle.openpgp.operator.PGPDataDecryptorFactory
            public PGPDataDecryptor createDataDecryptor(boolean z2, int i2, byte[] bArr) throws PGPException {
                return JcePublicKeyDataDecryptorFactoryBuilder.this.contentHelper.createDataDecryptor(z2, i2, bArr);
            }

            @Override // org.spongycastle.openpgp.operator.PublicKeyDataDecryptorFactory
            public byte[] recoverSessionData(int i2, byte[][] bArr) throws PGPException {
                if (i2 != 18) {
                    return JcePublicKeyDataDecryptorFactoryBuilder.this.decryptSessionData(i2, privateKey, bArr);
                }
                throw new PGPException("ECDH requires use of PGPPrivateKey for decryption");
            }
        };
    }

    public PublicKeyDataDecryptorFactory build(final PGPPrivateKey pGPPrivateKey) {
        return new PublicKeyDataDecryptorFactory() { // from class: org.spongycastle.openpgp.operator.jcajce.JcePublicKeyDataDecryptorFactoryBuilder.2
            @Override // org.spongycastle.openpgp.operator.PGPDataDecryptorFactory
            public PGPDataDecryptor createDataDecryptor(boolean z2, int i2, byte[] bArr) throws PGPException {
                return JcePublicKeyDataDecryptorFactoryBuilder.this.contentHelper.createDataDecryptor(z2, i2, bArr);
            }

            @Override // org.spongycastle.openpgp.operator.PublicKeyDataDecryptorFactory
            public byte[] recoverSessionData(int i2, byte[][] bArr) throws PGPException {
                if (i2 == 18) {
                    JcePublicKeyDataDecryptorFactoryBuilder jcePublicKeyDataDecryptorFactoryBuilder = JcePublicKeyDataDecryptorFactoryBuilder.this;
                    return jcePublicKeyDataDecryptorFactoryBuilder.decryptSessionData(jcePublicKeyDataDecryptorFactoryBuilder.keyConverter, pGPPrivateKey, bArr);
                }
                JcePublicKeyDataDecryptorFactoryBuilder jcePublicKeyDataDecryptorFactoryBuilder2 = JcePublicKeyDataDecryptorFactoryBuilder.this;
                return jcePublicKeyDataDecryptorFactoryBuilder2.decryptSessionData(i2, jcePublicKeyDataDecryptorFactoryBuilder2.keyConverter.getPrivateKey(pGPPrivateKey), bArr);
            }
        };
    }

    public JcePublicKeyDataDecryptorFactoryBuilder setContentProvider(String str) {
        this.contentHelper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcePublicKeyDataDecryptorFactoryBuilder setContentProvider(Provider provider) {
        this.contentHelper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JcePublicKeyDataDecryptorFactoryBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        this.keyConverter.setProvider(str);
        this.contentHelper = this.helper;
        return this;
    }

    public JcePublicKeyDataDecryptorFactoryBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        this.keyConverter.setProvider(provider);
        this.contentHelper = this.helper;
        return this;
    }
}
