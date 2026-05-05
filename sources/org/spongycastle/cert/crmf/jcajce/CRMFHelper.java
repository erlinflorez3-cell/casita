package org.spongycastle.cert.crmf.jcajce;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.cert.crmf.CRMFException;
import org.spongycastle.cms.CMSAlgorithm;
import org.spongycastle.jcajce.util.AlgorithmParametersUtils;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
class CRMFHelper {
    protected static final Map BASE_CIPHER_NAMES;
    protected static final Map CIPHER_ALG_NAMES;
    protected static final Map DIGEST_ALG_NAMES;
    protected static final Map KEY_ALG_NAMES;
    protected static final Map MAC_ALG_NAMES;
    private JcaJceHelper helper;

    interface JCECallback {
        Object doInJCE() throws CRMFException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException;
    }

    static {
        HashMap map = new HashMap();
        BASE_CIPHER_NAMES = map;
        HashMap map2 = new HashMap();
        CIPHER_ALG_NAMES = map2;
        HashMap map3 = new HashMap();
        DIGEST_ALG_NAMES = map3;
        HashMap map4 = new HashMap();
        KEY_ALG_NAMES = map4;
        HashMap map5 = new HashMap();
        MAC_ALG_NAMES = map5;
        map.put(PKCSObjectIdentifiers.des_EDE3_CBC, "DESEDE");
        map.put(NISTObjectIdentifiers.id_aes128_CBC, "AES");
        map.put(NISTObjectIdentifiers.id_aes192_CBC, "AES");
        map.put(NISTObjectIdentifiers.id_aes256_CBC, "AES");
        map2.put(CMSAlgorithm.DES_EDE3_CBC, "DESEDE/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.AES128_CBC, "AES/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.AES192_CBC, "AES/CBC/PKCS5Padding");
        map2.put(CMSAlgorithm.AES256_CBC, "AES/CBC/PKCS5Padding");
        map2.put(new ASN1ObjectIdentifier(PKCSObjectIdentifiers.rsaEncryption.getId()), "RSA/ECB/PKCS1Padding");
        map3.put(OIWObjectIdentifiers.idSHA1, "SHA1");
        map3.put(NISTObjectIdentifiers.id_sha224, "SHA224");
        map3.put(NISTObjectIdentifiers.id_sha256, McElieceCCA2ParameterSpec.DEFAULT_MD);
        map3.put(NISTObjectIdentifiers.id_sha384, "SHA384");
        map3.put(NISTObjectIdentifiers.id_sha512, "SHA512");
        map5.put(IANAObjectIdentifiers.hmacSHA1, "HMACSHA1");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA1, "HMACSHA1");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA224, "HMACSHA224");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA256, "HMACSHA256");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA384, "HMACSHA384");
        map5.put(PKCSObjectIdentifiers.id_hmacWithSHA512, "HMACSHA512");
        map4.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        map4.put(X9ObjectIdentifiers.id_dsa, "DSA");
    }

    CRMFHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    static Object execute(JCECallback jCECallback) throws CRMFException {
        try {
            return jCECallback.doInJCE();
        } catch (InvalidAlgorithmParameterException e2) {
            throw new CRMFException("algorithm parameters invalid.", e2);
        } catch (InvalidKeyException e3) {
            throw new CRMFException("key invalid in message.", e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new CRMFException("can't find algorithm.", e4);
        } catch (NoSuchProviderException e5) {
            throw new CRMFException("can't find provider.", e5);
        } catch (InvalidParameterSpecException e6) {
            throw new CRMFException("MAC algorithm parameter spec invalid.", e6);
        } catch (NoSuchPaddingException e7) {
            throw new CRMFException("required padding not supported.", e7);
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

    Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
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
            throw new CRMFException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    Cipher createContentCipher(final Key key, final AlgorithmIdentifier algorithmIdentifier) throws CRMFException {
        return (Cipher) execute(new JCECallback() { // from class: org.spongycastle.cert.crmf.jcajce.CRMFHelper.1
            @Override // org.spongycastle.cert.crmf.jcajce.CRMFHelper.JCECallback
            public Object doInJCE() throws CRMFException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
                Cipher cipherCreateCipher = CRMFHelper.this.createCipher(algorithmIdentifier.getAlgorithm());
                ASN1Primitive aSN1Primitive = (ASN1Primitive) algorithmIdentifier.getParameters();
                ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                if (aSN1Primitive != null && !(aSN1Primitive instanceof ASN1Null)) {
                    try {
                        AlgorithmParameters algorithmParametersCreateAlgorithmParameters = CRMFHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                        try {
                            AlgorithmParametersUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, aSN1Primitive);
                            cipherCreateCipher.init(2, key, algorithmParametersCreateAlgorithmParameters);
                        } catch (IOException e2) {
                            throw new CRMFException("error decoding algorithm parameters.", e2);
                        }
                    } catch (NoSuchAlgorithmException e3) {
                        if (!algorithm.equals(CMSAlgorithm.DES_EDE3_CBC) && !algorithm.equals(CMSAlgorithm.IDEA_CBC) && !algorithm.equals(CMSAlgorithm.AES128_CBC) && !algorithm.equals(CMSAlgorithm.AES192_CBC) && !algorithm.equals(CMSAlgorithm.AES256_CBC)) {
                            throw e3;
                        }
                        cipherCreateCipher.init(2, key, new IvParameterSpec(ASN1OctetString.getInstance(aSN1Primitive).getOctets()));
                    }
                } else if (algorithm.equals(CMSAlgorithm.DES_EDE3_CBC) || algorithm.equals(CMSAlgorithm.IDEA_CBC) || algorithm.equals(CMSAlgorithm.CAST5_CBC)) {
                    cipherCreateCipher.init(2, key, new IvParameterSpec(new byte[8]));
                } else {
                    cipherCreateCipher.init(2, key);
                }
                return cipherCreateCipher;
            }
        });
    }

    MessageDigest createDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        try {
            String str = (String) DIGEST_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createDigest(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createDigest(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new CRMFException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    KeyFactory createKeyFactory(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
        try {
            String str = (String) KEY_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyFactory(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyFactory(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new CRMFException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    public KeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
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
            throw new CRMFException("cannot create key generator: " + e2.getMessage(), e2);
        }
    }

    Mac createMac(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CRMFException {
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
            throw new CRMFException("cannot create mac: " + e2.getMessage(), e2);
        }
    }

    AlgorithmParameters generateParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, SecureRandom secureRandom) throws Throwable {
        String strXd = ZO.xd("\rbR9Ocp\u001eh]xZ\u0017 e#\u0006C@[\r#*LZ7+_3", (short) (C1607wl.Xd() ^ 2864), (short) (C1607wl.Xd() ^ 31332));
        try {
            AlgorithmParameterGenerator algorithmParameterGeneratorCreateAlgorithmParameterGenerator = createAlgorithmParameterGenerator(aSN1ObjectIdentifier);
            if (aSN1ObjectIdentifier.equals(CMSAlgorithm.RC2_CBC)) {
                byte[] bArr = new byte[8];
                Object[] objArr = {bArr};
                Method method = Class.forName(C1626yg.Ud("b^~S\u001a6\u001e\\XPy}fc.m@\r\fR\\\u0019h;\u0012:", (short) (C1633zX.Xd() ^ (-27974)), (short) (C1633zX.Xd() ^ (-30386)))).getMethod(Ig.wd(")Z_4ASjkF", (short) (C1633zX.Xd() ^ (-25988))), byte[].class);
                try {
                    method.setAccessible(true);
                    method.invoke(secureRandom, objArr);
                    try {
                        algorithmParameterGeneratorCreateAlgorithmParameterGenerator.init(new RC2ParameterSpec(secretKey.getEncoded().length * 8, bArr), secureRandom);
                    } catch (InvalidAlgorithmParameterException e2) {
                        throw new CRMFException(strXd + e2, e2);
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            return algorithmParameterGeneratorCreateAlgorithmParameterGenerator.generateParameters();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e4) {
            throw new CRMFException(EO.Od("9\u0004\u001d?c\u001clc\tn4]z|\u0014#dkL\u0016|M)2\u0001i=\u0018\"b1\u001evbt? \u000b5\r\t{&;9b\u0015^yA", (short) (Od.Xd() ^ (-25693))) + e4, e4);
        }
    }

    AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters) throws CRMFException {
        ASN1Encodable aSN1EncodableExtractParameters;
        if (algorithmParameters != null) {
            try {
                aSN1EncodableExtractParameters = AlgorithmParametersUtils.extractParameters(algorithmParameters);
            } catch (IOException e2) {
                throw new CRMFException("cannot encode parameters: " + e2.getMessage(), e2);
            }
        } else {
            aSN1EncodableExtractParameters = DERNull.INSTANCE;
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, aSN1EncodableExtractParameters);
    }

    PublicKey toPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws CRMFException {
        try {
            return createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (Exception e2) {
            throw new CRMFException("invalid key: " + e2.getMessage(), e2);
        }
    }
}
