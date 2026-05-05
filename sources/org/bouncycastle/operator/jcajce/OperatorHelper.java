package org.bouncycastle.operator.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Integers;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
class OperatorHelper {
    private static final Map asymmetricWrapperAlgNames;
    private static final Map oids;
    private static final Map symmetricKeyAlgNames;
    private static final Map symmetricWrapperAlgNames;
    private static final Map symmetricWrapperKeySizes;
    private JcaJceHelper helper;

    private static class OpCertificateException extends CertificateException {
        private Throwable cause;

        public OpCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    static {
        HashMap map = new HashMap();
        oids = map;
        HashMap map2 = new HashMap();
        asymmetricWrapperAlgNames = map2;
        HashMap map3 = new HashMap();
        symmetricWrapperAlgNames = map3;
        HashMap map4 = new HashMap();
        symmetricKeyAlgNames = map4;
        HashMap map5 = new HashMap();
        symmetricWrapperKeySizes = map5;
        map.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        map.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        map.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        map.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        map.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
        map.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410");
        map.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512WITHPLAIN-ECDSA");
        map.put(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160WITHPLAIN-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1WITHCVC-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224WITHCVC-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256WITHCVC-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384WITHCVC-ECDSA");
        map.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512WITHCVC-ECDSA");
        map.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        map.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        map.put(new ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1WITHECDSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
        map.put(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
        map.put(OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        map.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        map.put(NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
        map.put(NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
        map.put(OIWObjectIdentifiers.idSHA1, "SHA-1");
        map.put(NISTObjectIdentifiers.id_sha224, "SHA-224");
        map.put(NISTObjectIdentifiers.id_sha256, "SHA-256");
        map.put(NISTObjectIdentifiers.id_sha384, "SHA-384");
        map.put(NISTObjectIdentifiers.id_sha512, "SHA-512");
        map.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        map.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        map.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        map2.put(PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
        map3.put(PKCSObjectIdentifiers.id_alg_CMS3DESwrap, "DESEDEWrap");
        map3.put(PKCSObjectIdentifiers.id_alg_CMSRC2wrap, "RC2Wrap");
        map3.put(NISTObjectIdentifiers.id_aes128_wrap, "AESWrap");
        map3.put(NISTObjectIdentifiers.id_aes192_wrap, "AESWrap");
        map3.put(NISTObjectIdentifiers.id_aes256_wrap, "AESWrap");
        map3.put(NTTObjectIdentifiers.id_camellia128_wrap, "CamelliaWrap");
        map3.put(NTTObjectIdentifiers.id_camellia192_wrap, "CamelliaWrap");
        map3.put(NTTObjectIdentifiers.id_camellia256_wrap, "CamelliaWrap");
        map3.put(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap, "SEEDWrap");
        map3.put(PKCSObjectIdentifiers.des_EDE3_CBC, "DESede");
        map5.put(PKCSObjectIdentifiers.id_alg_CMS3DESwrap, Integers.valueOf(192));
        map5.put(NISTObjectIdentifiers.id_aes128_wrap, Integers.valueOf(128));
        map5.put(NISTObjectIdentifiers.id_aes192_wrap, Integers.valueOf(192));
        map5.put(NISTObjectIdentifiers.id_aes256_wrap, Integers.valueOf(256));
        map5.put(NTTObjectIdentifiers.id_camellia128_wrap, Integers.valueOf(128));
        map5.put(NTTObjectIdentifiers.id_camellia192_wrap, Integers.valueOf(192));
        map5.put(NTTObjectIdentifiers.id_camellia256_wrap, Integers.valueOf(256));
        map5.put(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap, Integers.valueOf(128));
        map5.put(PKCSObjectIdentifiers.des_EDE3_CBC, Integers.valueOf(192));
        map4.put(NISTObjectIdentifiers.aes, "AES");
        map4.put(NISTObjectIdentifiers.id_aes128_CBC, "AES");
        map4.put(NISTObjectIdentifiers.id_aes192_CBC, "AES");
        map4.put(NISTObjectIdentifiers.id_aes256_CBC, "AES");
        map4.put(PKCSObjectIdentifiers.des_EDE3_CBC, "DESede");
        map4.put(PKCSObjectIdentifiers.RC2_CBC, "RC2");
    }

    OperatorHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    private static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int iIndexOf = digestName.indexOf(45);
        return (iIndexOf <= 0 || digestName.startsWith("SHA3")) ? MessageDigestUtils.getDigestName(aSN1ObjectIdentifier) : digestName.substring(0, iIndexOf) + digestName.substring(iIndexOf + 1);
    }

    private static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !DERNull.INSTANCE.equals(parameters) && algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            return getDigestName(RSASSAPSSparams.getInstance(parameters).getHashAlgorithm().getAlgorithm()) + "WITHRSAANDMGF1";
        }
        Map map = oids;
        boolean zContainsKey = map.containsKey(algorithmIdentifier.getAlgorithm());
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        return zContainsKey ? (String) map.get(algorithm) : algorithm.getId();
    }

    public X509Certificate convertCertificate(X509CertificateHolder x509CertificateHolder) throws Throwable {
        try {
            CertificateFactory certificateFactoryCreateCertificateFactory = this.helper.createCertificateFactory(C1626yg.Ud("/5\u0001Eh", (short) (FB.Xd() ^ 970), (short) (FB.Xd() ^ 14682)));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(x509CertificateHolder.getEncoded());
            Class<?> cls = Class.forName(Ig.wd("vE(od\\~\u0005k)\"\u000b`\u001b8\u001dt`r,\u0013h\u0018\t+Vm\u001bXVW\u0014.X\u0002Fj", (short) (Od.Xd() ^ (-23297))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(EO.Od("9^$5##\u0013\u001c\u000e5;X\"xLf\u0006\u0006L", (short) (C1607wl.Xd() ^ 16744)));
            Object[] objArr = {byteArrayInputStream};
            Method method = cls.getMethod(C1561oA.Qd("]ZbXdRdT1R^_SOQJGYI", (short) (ZN.Xd() ^ 25581)), clsArr);
            try {
                method.setAccessible(true);
                return (X509Certificate) ((Certificate) method.invoke(certificateFactoryCreateCertificateFactory, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            throw new OpCertificateException(C1561oA.od("&#/..2\\# .X\u001d%\u0019$\u0018\u0018\u0016P\u0016\u001e \u001aK\u001a\u0010H\u000b\f\u0018\u0019\r\t\u000b\u0004\u0001\u0013\u0003V;", (short) (OY.Xd() ^ 22866)) + e3.getMessage(), e3);
        } catch (NoSuchProviderException e4) {
            throw new OpCertificateException(C1593ug.zd("DCQRTZ\u0007NRXO\fSORd`dl\u0014ehfnb^`n7\u001e", (short) (OY.Xd() ^ 19690), (short) (OY.Xd() ^ 6014)) + e4.getMessage(), e4);
        }
    }

    public PublicKey convertPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws OperatorCreationException {
        try {
            return this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (IOException e2) {
            throw new OperatorCreationException("cannot get encoded form of key: " + e2.getMessage(), e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new OperatorCreationException("cannot create key factory: " + e3.getMessage(), e3);
        } catch (NoSuchProviderException e4) {
            throw new OperatorCreationException("cannot find factory provider: " + e4.getMessage(), e4);
        } catch (InvalidKeySpecException e5) {
            throw new OperatorCreationException("cannot create key factory: " + e5.getMessage(), e5);
        }
    }

    AlgorithmParameters createAlgorithmParameters(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException {
        if (algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.rsaEncryption)) {
            return null;
        }
        try {
            AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(algorithmIdentifier.getAlgorithm().getId());
            try {
                algorithmParametersCreateAlgorithmParameters.init(algorithmIdentifier.getParameters().toASN1Primitive().getEncoded());
                return algorithmParametersCreateAlgorithmParameters;
            } catch (IOException e2) {
                throw new OperatorCreationException("cannot initialise algorithm parameters: " + e2.getMessage(), e2);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (NoSuchProviderException e3) {
            throw new OperatorCreationException("cannot create algorithm parameters: " + e3.getMessage(), e3);
        }
    }

    Cipher createAsymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier, Map map) throws OperatorCreationException {
        try {
            String str = !map.isEmpty() ? (String) map.get(aSN1ObjectIdentifier) : null;
            if (str == null) {
                str = (String) asymmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            }
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                    if (str.equals("RSA/ECB/PKCS1Padding")) {
                        try {
                            return this.helper.createCipher("RSA/NONE/PKCS1Padding");
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                    return this.helper.createCipher(aSN1ObjectIdentifier.getId());
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new OperatorCreationException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    MessageDigest createDigest(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException {
        try {
            return this.helper.createDigest(MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm()));
        } catch (NoSuchAlgorithmException e2) {
            Map map = oids;
            if (map.get(algorithmIdentifier.getAlgorithm()) == null) {
                throw e2;
            }
            return this.helper.createDigest((String) map.get(algorithmIdentifier.getAlgorithm()));
        }
    }

    public Signature createRawSignature(AlgorithmIdentifier algorithmIdentifier) {
        try {
            String signatureName = getSignatureName(algorithmIdentifier);
            String str = "NONE" + signatureName.substring(signatureName.indexOf("WITH"));
            Signature signatureCreateSignature = this.helper.createSignature(str);
            if (algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(str);
                AlgorithmParametersUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, algorithmIdentifier.getParameters());
                signatureCreateSignature.setParameter((PSSParameterSpec) algorithmParametersCreateAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
            }
            return signatureCreateSignature;
        } catch (Exception unused) {
            return null;
        }
    }

    Signature createSignature(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException {
        try {
            return this.helper.createSignature(getSignatureName(algorithmIdentifier));
        } catch (NoSuchAlgorithmException e2) {
            Map map = oids;
            if (map.get(algorithmIdentifier.getAlgorithm()) == null) {
                throw e2;
            }
            return this.helper.createSignature((String) map.get(algorithmIdentifier.getAlgorithm()));
        }
    }

    Cipher createSymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            String str = (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e2) {
            throw new OperatorCreationException("cannot create cipher: " + e2.getMessage(), e2);
        }
    }

    String getKeyAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) symmetricKeyAlgNames.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    int getKeySizeInBits(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ((Integer) symmetricWrapperKeySizes.get(aSN1ObjectIdentifier)).intValue();
    }

    String getWrappingAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
    }
}
