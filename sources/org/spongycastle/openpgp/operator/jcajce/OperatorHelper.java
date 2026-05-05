package org.spongycastle.openpgp.operator.jcajce;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.InputStream;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PGPDataDecryptor;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;

/* JADX INFO: loaded from: classes2.dex */
class OperatorHelper {
    private JcaJceHelper helper;

    OperatorHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    private Signature createSignature(String str) throws PGPException {
        try {
            return this.helper.createSignature(str);
        } catch (GeneralSecurityException e2) {
            throw new PGPException("cannot create signature: " + e2.getMessage(), e2);
        }
    }

    public AlgorithmParameters createAlgorithmParameters(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.createAlgorithmParameters(str);
    }

    Cipher createCipher(String str) throws PGPException {
        try {
            return this.helper.createCipher(str);
        } catch (GeneralSecurityException e2) {
            throw new PGPException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    PGPDataDecryptor createDataDecryptor(boolean z2, int i2, byte[] bArr) throws PGPException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, PGPUtil.getSymmetricCipherName(i2));
            final Cipher cipherCreateStreamCipher = createStreamCipher(i2, z2);
            if (z2) {
                cipherCreateStreamCipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipherCreateStreamCipher.getBlockSize()]));
            } else {
                cipherCreateStreamCipher.init(2, secretKeySpec);
            }
            return new PGPDataDecryptor() { // from class: org.spongycastle.openpgp.operator.jcajce.OperatorHelper.1
                @Override // org.spongycastle.openpgp.operator.PGPDataDecryptor
                public int getBlockSize() {
                    return cipherCreateStreamCipher.getBlockSize();
                }

                @Override // org.spongycastle.openpgp.operator.PGPDataDecryptor
                public InputStream getInputStream(InputStream inputStream) {
                    return new CipherInputStream(inputStream, cipherCreateStreamCipher);
                }

                @Override // org.spongycastle.openpgp.operator.PGPDataDecryptor
                public PGPDigestCalculator getIntegrityCalculator() {
                    return new SHA1PGPDigestCalculator();
                }
            };
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("Exception creating cipher", e3);
        }
    }

    MessageDigest createDigest(int i2) throws GeneralSecurityException, PGPException {
        return this.helper.createDigest(PGPUtil.getDigestName(i2));
    }

    public KeyAgreement createKeyAgreement(String str) throws GeneralSecurityException {
        return this.helper.createKeyAgreement(str);
    }

    KeyFactory createKeyFactory(String str) throws GeneralSecurityException, PGPException {
        return this.helper.createKeyFactory(str);
    }

    public KeyPairGenerator createKeyPairGenerator(String str) throws GeneralSecurityException {
        return this.helper.createKeyPairGenerator(str);
    }

    Cipher createKeyWrapper(int i2) throws PGPException {
        try {
            switch (i2) {
                case 7:
                case 8:
                case 9:
                    return this.helper.createCipher("AESWrap");
                case 10:
                default:
                    throw new PGPException("unknown wrap algorithm: " + i2);
                case 11:
                case 12:
                case 13:
                    return this.helper.createCipher("CamelliaWrap");
            }
        } catch (GeneralSecurityException e2) {
            throw new PGPException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    Cipher createPublicKeyCipher(int i2) throws PGPException {
        if (i2 == 1 || i2 == 2) {
            return createCipher("RSA/ECB/PKCS1Padding");
        }
        if (i2 != 16) {
            if (i2 == 17) {
                throw new PGPException("Can't use DSA for encryption.");
            }
            if (i2 == 19) {
                throw new PGPException("Can't use ECDSA for encryption.");
            }
            if (i2 != 20) {
                throw new PGPException("unknown asymmetric algorithm: " + i2);
            }
        }
        return createCipher("ElGamal/ECB/PKCS1Padding");
    }

    public Signature createSignature(int i2, int i3) throws PGPException {
        String str;
        if (i2 == 1 || i2 == 3) {
            str = "RSA";
        } else if (i2 == 16) {
            str = "ElGamal";
        } else if (i2 == 17) {
            str = "DSA";
        } else if (i2 != 19) {
            if (i2 != 20) {
                throw new PGPException("unknown algorithm tag in signature:" + i2);
            }
            str = "ElGamal";
        } else {
            str = "ECDSA";
        }
        return createSignature(PGPUtil.getDigestName(i3) + "with" + str);
    }

    Cipher createStreamCipher(int i2, boolean z2) throws PGPException {
        return createCipher(PGPUtil.getSymmetricCipherName(i2) + RemoteSettings.FORWARD_SLASH_STRING + (z2 ? "CFB" : "OpenPGPCFB") + "/NoPadding");
    }
}
