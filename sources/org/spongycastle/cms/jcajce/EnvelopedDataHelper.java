package org.spongycastle.cms.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.pkcs.PBKDF2Params;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.RC2CBCParameter;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cms.CMSAlgorithm;
import org.spongycastle.cms.CMSEnvelopedDataGenerator;
import org.spongycastle.cms.CMSException;
import org.spongycastle.operator.DefaultSecretKeySizeProvider;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.SecretKeySizeProvider;
import org.spongycastle.operator.SymmetricKeyUnwrapper;
import org.spongycastle.operator.jcajce.JceAsymmetricKeyUnwrapper;
import org.spongycastle.operator.jcajce.JceKTSKeyUnwrapper;
import yg.C1561oA;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class EnvelopedDataHelper {
    protected static final Map BASE_CIPHER_NAMES;
    protected static final Map CIPHER_ALG_NAMES;
    protected static final SecretKeySizeProvider KEY_SIZE_PROVIDER = DefaultSecretKeySizeProvider.INSTANCE;
    protected static final Map MAC_ALG_NAMES;
    private static final short[] rc2Ekb;
    private static final short[] rc2Table;
    private JcaJceExtHelper helper;

    /* JADX INFO: renamed from: org.spongycastle.cms.jcajce.EnvelopedDataHelper$1 */
    class AnonymousClass1 implements JCECallback {
        final /* synthetic */ AlgorithmIdentifier val$encryptionAlgID;
        final /* synthetic */ Key val$sKey;

        AnonymousClass1(AlgorithmIdentifier algorithmIdentifier, Key key) {
            algorithmIdentifier = algorithmIdentifier;
            key = key;
        }

        @Override // org.spongycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
        public Object doInJCE() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, CMSException, InvalidAlgorithmParameterException {
            Cipher cipherCreateCipher = EnvelopedDataHelper.this.createCipher(algorithmIdentifier.getAlgorithm());
            ASN1Encodable parameters = algorithmIdentifier.getParameters();
            String id = algorithmIdentifier.getAlgorithm().getId();
            if (parameters != null && !(parameters instanceof ASN1Null)) {
                try {
                    AlgorithmParameters algorithmParametersCreateAlgorithmParameters = EnvelopedDataHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                    CMSUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, parameters);
                    cipherCreateCipher.init(2, key, algorithmParametersCreateAlgorithmParameters);
                } catch (NoSuchAlgorithmException e2) {
                    if (!id.equals(CMSAlgorithm.DES_CBC.getId()) && !id.equals(CMSEnvelopedDataGenerator.DES_EDE3_CBC) && !id.equals("1.3.6.1.4.1.188.7.1.1.2") && !id.equals(CMSEnvelopedDataGenerator.AES128_CBC) && !id.equals(CMSEnvelopedDataGenerator.AES192_CBC) && !id.equals(CMSEnvelopedDataGenerator.AES256_CBC)) {
                        throw e2;
                    }
                    cipherCreateCipher.init(2, key, new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets()));
                }
            } else if (id.equals(CMSAlgorithm.DES_CBC.getId()) || id.equals(CMSEnvelopedDataGenerator.DES_EDE3_CBC) || id.equals("1.3.6.1.4.1.188.7.1.1.2") || id.equals("1.2.840.113533.7.66.10")) {
                cipherCreateCipher.init(2, key, new IvParameterSpec(new byte[8]));
            } else {
                cipherCreateCipher.init(2, key);
            }
            return cipherCreateCipher;
        }
    }

    /* JADX INFO: renamed from: org.spongycastle.cms.jcajce.EnvelopedDataHelper$2 */
    class AnonymousClass2 implements JCECallback {
        final /* synthetic */ AlgorithmIdentifier val$macAlgId;
        final /* synthetic */ Key val$sKey;

        AnonymousClass2(AlgorithmIdentifier algorithmIdentifier, Key key) {
            algorithmIdentifier = algorithmIdentifier;
            key = key;
        }

        @Override // org.spongycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
        public Object doInJCE() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, CMSException, InvalidAlgorithmParameterException {
            Mac macCreateMac = EnvelopedDataHelper.this.createMac(algorithmIdentifier.getAlgorithm());
            ASN1Encodable parameters = algorithmIdentifier.getParameters();
            algorithmIdentifier.getAlgorithm().getId();
            if (parameters == null || (parameters instanceof ASN1Null)) {
                macCreateMac.init(key);
            } else {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = EnvelopedDataHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                CMSUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, parameters);
                macCreateMac.init(key, algorithmParametersCreateAlgorithmParameters.getParameterSpec(IvParameterSpec.class));
            }
            return macCreateMac;
        }
    }

    interface JCECallback {
        Object doInJCE() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, CMSException, InvalidAlgorithmParameterException;
    }

    static {
        HashMap map = new HashMap();
        BASE_CIPHER_NAMES = map;
        HashMap map2 = new HashMap();
        CIPHER_ALG_NAMES = map2;
        HashMap map3 = new HashMap();
        MAC_ALG_NAMES = map3;
        map.put(CMSAlgorithm.DES_CBC, "DES");
        map.put(CMSAlgorithm.DES_EDE3_CBC, "DESEDE");
        map.put(CMSAlgorithm.AES128_CBC, "AES");
        map.put(CMSAlgorithm.AES192_CBC, "AES");
        map.put(CMSAlgorithm.AES256_CBC, "AES");
        map.put(CMSAlgorithm.RC2_CBC, "RC2");
        map.put(CMSAlgorithm.CAST5_CBC, "CAST5");
        map.put(CMSAlgorithm.CAMELLIA128_CBC, "Camellia");
        map.put(CMSAlgorithm.CAMELLIA192_CBC, "Camellia");
        map.put(CMSAlgorithm.CAMELLIA256_CBC, "Camellia");
        map.put(CMSAlgorithm.SEED_CBC, "SEED");
        map.put(PKCSObjectIdentifiers.rc4, "RC4");
        map2.put(CMSAlgorithm.DES_CBC, "DES/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.RC2_CBC, "RC2/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.DES_EDE3_CBC, "DESEDE/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.AES128_CBC, "AES/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.AES192_CBC, "AES/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.AES256_CBC, "AES/CBC/PKCS5Padding");
        map2.put(PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
        map2.put(CMSAlgorithm.CAST5_CBC, "CAST5/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.CAMELLIA128_CBC, "Camellia/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.CAMELLIA192_CBC, "Camellia/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.CAMELLIA256_CBC, "Camellia/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.SEED_CBC, "SEED/CBC/PKCS5Padding");
        map2.put(PKCSObjectIdentifiers.rc4, "RC4");
        map3.put(CMSAlgorithm.DES_EDE3_CBC, "DESEDEMac");
        map3.put(CMSAlgorithm.AES128_CBC, "AESMac");
        map3.put(CMSAlgorithm.AES192_CBC, "AESMac");
        map3.put(CMSAlgorithm.AES256_CBC, "AESMac");
        map3.put(CMSAlgorithm.RC2_CBC, "RC2Mac");
        rc2Table = new short[]{189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, 114, 140, 8, 21, 110, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, 111, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        rc2Ekb = new short[]{93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, 111, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};
    }

    EnvelopedDataHelper(JcaJceExtHelper jcaJceExtHelper) {
        this.helper = jcaJceExtHelper;
    }

    static Object execute(JCECallback jCECallback) throws CMSException {
        try {
            return jCECallback.doInJCE();
        } catch (InvalidAlgorithmParameterException e2) {
            throw new CMSException("algorithm parameters invalid.", e2);
        } catch (InvalidKeyException e3) {
            throw new CMSException("key invalid in message.", e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new CMSException("can't find algorithm.", e4);
        } catch (NoSuchProviderException e5) {
            throw new CMSException("can't find provider.", e5);
        } catch (InvalidParameterSpecException e6) {
            throw new CMSException("MAC algorithm parameter spec invalid.", e6);
        } catch (NoSuchPaddingException e7) {
            throw new CMSException("required padding not supported.", e7);
        }
    }

    byte[] calculateDerivedKey(int i2, char[] cArr, AlgorithmIdentifier algorithmIdentifier, int i3) throws CMSException {
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(algorithmIdentifier.getParameters());
        try {
            return (i2 == 0 ? this.helper.createSecretKeyFactory("PBKDF2with8BIT") : this.helper.createSecretKeyFactory("PBKDF2")).generateSecret(new PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), i3)).getEncoded();
        } catch (GeneralSecurityException e2) {
            throw new CMSException("Unable to calculate dervied key from password: " + e2.getMessage(), e2);
        }
    }

    AlgorithmParameterGenerator createAlgorithmParameterGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws GeneralSecurityException {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.helper.createAlgorithmParameterGenerator(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.helper.createAlgorithmParameterGenerator(aSN1ObjectIdentifier.getId());
    }

    AlgorithmParameters createAlgorithmParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws NoSuchAlgorithmException, NoSuchProviderException {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.helper.createAlgorithmParameters(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.helper.createAlgorithmParameters(aSN1ObjectIdentifier.getId());
    }

    public JceAsymmetricKeyUnwrapper createAsymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        return this.helper.createAsymmetricUnwrapper(algorithmIdentifier, privateKey);
    }

    public JceKTSKeyUnwrapper createAsymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        return this.helper.createAsymmetricUnwrapper(algorithmIdentifier, privateKey, bArr, bArr2);
    }

    Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) CIPHER_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new CMSException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    public Cipher createContentCipher(Key key, AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        return (Cipher) execute(new JCECallback() { // from class: org.spongycastle.cms.jcajce.EnvelopedDataHelper.1
            final /* synthetic */ AlgorithmIdentifier val$encryptionAlgID;
            final /* synthetic */ Key val$sKey;

            AnonymousClass1(AlgorithmIdentifier algorithmIdentifier2, Key key2) {
                algorithmIdentifier = algorithmIdentifier2;
                key = key2;
            }

            @Override // org.spongycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
            public Object doInJCE() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, CMSException, InvalidAlgorithmParameterException {
                Cipher cipherCreateCipher = EnvelopedDataHelper.this.createCipher(algorithmIdentifier.getAlgorithm());
                ASN1Encodable parameters = algorithmIdentifier.getParameters();
                String id = algorithmIdentifier.getAlgorithm().getId();
                if (parameters != null && !(parameters instanceof ASN1Null)) {
                    try {
                        AlgorithmParameters algorithmParametersCreateAlgorithmParameters = EnvelopedDataHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                        CMSUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, parameters);
                        cipherCreateCipher.init(2, key, algorithmParametersCreateAlgorithmParameters);
                    } catch (NoSuchAlgorithmException e2) {
                        if (!id.equals(CMSAlgorithm.DES_CBC.getId()) && !id.equals(CMSEnvelopedDataGenerator.DES_EDE3_CBC) && !id.equals("1.3.6.1.4.1.188.7.1.1.2") && !id.equals(CMSEnvelopedDataGenerator.AES128_CBC) && !id.equals(CMSEnvelopedDataGenerator.AES192_CBC) && !id.equals(CMSEnvelopedDataGenerator.AES256_CBC)) {
                            throw e2;
                        }
                        cipherCreateCipher.init(2, key, new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets()));
                    }
                } else if (id.equals(CMSAlgorithm.DES_CBC.getId()) || id.equals(CMSEnvelopedDataGenerator.DES_EDE3_CBC) || id.equals("1.3.6.1.4.1.188.7.1.1.2") || id.equals("1.2.840.113533.7.66.10")) {
                    cipherCreateCipher.init(2, key, new IvParameterSpec(new byte[8]));
                } else {
                    cipherCreateCipher.init(2, key);
                }
                return cipherCreateCipher;
            }
        });
    }

    Mac createContentMac(Key key, AlgorithmIdentifier algorithmIdentifier) throws CMSException {
        return (Mac) execute(new JCECallback() { // from class: org.spongycastle.cms.jcajce.EnvelopedDataHelper.2
            final /* synthetic */ AlgorithmIdentifier val$macAlgId;
            final /* synthetic */ Key val$sKey;

            AnonymousClass2(AlgorithmIdentifier algorithmIdentifier2, Key key2) {
                algorithmIdentifier = algorithmIdentifier2;
                key = key2;
            }

            @Override // org.spongycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
            public Object doInJCE() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, CMSException, InvalidAlgorithmParameterException {
                Mac macCreateMac = EnvelopedDataHelper.this.createMac(algorithmIdentifier.getAlgorithm());
                ASN1Encodable parameters = algorithmIdentifier.getParameters();
                algorithmIdentifier.getAlgorithm().getId();
                if (parameters == null || (parameters instanceof ASN1Null)) {
                    macCreateMac.init(key);
                } else {
                    AlgorithmParameters algorithmParametersCreateAlgorithmParameters = EnvelopedDataHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                    CMSUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, parameters);
                    macCreateMac.init(key, algorithmParametersCreateAlgorithmParameters.getParameterSpec(IvParameterSpec.class));
                }
                return macCreateMac;
            }
        });
    }

    KeyAgreement createKeyAgreement(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyAgreement(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyAgreement(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new CMSException("cannot create key agreement: " + e2.getMessage(), e2);
        }
    }

    public KeyFactory createKeyFactory(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyFactory(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyFactory(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new CMSException("cannot create key factory: " + e2.getMessage(), e2);
        }
    }

    public KeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyGenerator(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new CMSException("cannot create key generator: " + e2.getMessage(), e2);
        }
    }

    KeyPairGenerator createKeyPairGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyPairGenerator(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new CMSException("cannot create key pair generator: " + e2.getMessage(), e2);
        }
    }

    Mac createMac(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            String str = (String) MAC_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createMac(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createMac(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new CMSException("cannot create mac: " + e2.getMessage(), e2);
        }
    }

    Cipher createRFC3211Wrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str == null) {
            throw new CMSException("no name for " + aSN1ObjectIdentifier);
        }
        try {
            return this.helper.createCipher(str + "RFC3211Wrap");
        } catch (GeneralSecurityException e2) {
            throw new CMSException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    SecretKeyFactory createSecretKeyFactory(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.createSecretKeyFactory(str);
    }

    public SymmetricKeyUnwrapper createSymmetricUnwrapper(AlgorithmIdentifier algorithmIdentifier, SecretKey secretKey) {
        return this.helper.createSymmetricUnwrapper(algorithmIdentifier, secretKey);
    }

    AlgorithmParameters generateParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, SecureRandom secureRandom) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 29460);
        short sXd2 = (short) (ZN.Xd() ^ 7629);
        int[] iArr = new int["n\u0013\u000bZ1YO>~/Q9\"\u001eqh\u000b]|Z! \u0017\u001a\u000eFh?Z".length()];
        QB qb = new QB("n\u0013\u000bZ1YO>~/Q9\"\u001eqh\u000b]|Z! \u0017\u001a\u000eFh?Z");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            AlgorithmParameterGenerator algorithmParameterGeneratorCreateAlgorithmParameterGenerator = createAlgorithmParameterGenerator(aSN1ObjectIdentifier);
            if (aSN1ObjectIdentifier.equals(CMSAlgorithm.RC2_CBC)) {
                byte[] bArr = new byte[8];
                Object[] objArr = {bArr};
                Method method = Class.forName(Ig.wd("5vW9\u001b+?K6\nxkAq\u0011\u0004HR&}$l&\u001aRz", (short) (Od.Xd() ^ (-9608)))).getMethod(EO.Od("\\\fMd\u001a\u0007aBw", (short) (Od.Xd() ^ (-29437))), byte[].class);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom, objArr);
                    try {
                        algorithmParameterGeneratorCreateAlgorithmParameterGenerator.init(new RC2ParameterSpec(secretKey.getEncoded().length * 8, bArr), secureRandom);
                    } catch (InvalidAlgorithmParameterException e2) {
                        throw new CMSException(str + e2, e2);
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            return algorithmParameterGeneratorCreateAlgorithmParameterGenerator.generateParameters();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e4) {
            throw new CMSException(C1561oA.Qd("2D./9<053c&4&!3'+#Z\u001b%\u001f&(\u001e(\u001b\u001fP \u0010 \u000e\u0019\u0010\u001e\u000e\u001aF\r\n\u0012\b\u0014\u0002\u0014\u000e\u0010V;", (short) (FB.Xd() ^ 15579)) + e4, e4);
        }
    }

    AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters) throws CMSException {
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, algorithmParameters != null ? CMSUtils.extractParameters(algorithmParameters) : DERNull.INSTANCE);
    }

    public AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new DEROctetString(((IvParameterSpec) algorithmParameterSpec).getIV()));
        }
        if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
            throw new IllegalStateException("unknown parameter spec: " + algorithmParameterSpec);
        }
        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
        int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
        if (effectiveKeyBits == -1) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RC2CBCParameter(rC2ParameterSpec.getIV()));
        }
        int i2 = effectiveKeyBits;
        if (effectiveKeyBits < 256) {
            i2 = rc2Table[effectiveKeyBits];
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RC2CBCParameter(i2, rC2ParameterSpec.getIV()));
    }

    String getBaseCipherName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        return str == null ? aSN1ObjectIdentifier.getId() : str;
    }

    public Key getJceKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), getBaseCipherName(aSN1ObjectIdentifier));
        }
        throw new IllegalArgumentException("unknown generic key type");
    }

    Key getJceKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), "ENC");
        }
        throw new IllegalArgumentException("unknown generic key type");
    }

    public void keySizeCheck(AlgorithmIdentifier algorithmIdentifier, Key key) throws CMSException {
        byte[] encoded;
        int keySize = KEY_SIZE_PROVIDER.getKeySize(algorithmIdentifier);
        if (keySize > 0) {
            try {
                encoded = key.getEncoded();
            } catch (Exception unused) {
                encoded = null;
            }
            if (encoded != null && encoded.length * 8 != keySize) {
                throw new CMSException("Expected key size for algorithm OID not found in recipient.");
            }
        }
    }
}
