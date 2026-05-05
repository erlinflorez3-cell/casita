package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.AuthenticatedSafe;
import org.bouncycastle.asn1.pkcs.CertBag;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedData;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.pkcs.SafeBag;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12StoreParameter;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private ASN1ObjectIdentifier certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs;
    private ASN1ObjectIdentifier keyAlgorithm;
    private IgnoresCaseHashtable keys;
    protected SecureRandom random;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private Hashtable localIds = new Hashtable();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();

    public static class BCPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new BouncyCastleProvider(), pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    public static class BCPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore3DES() {
            super(new BouncyCastleProvider(), pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd3_KeyTripleDES_CBC);
        }
    }

    private class CertId {
        byte[] id;

        CertId(PublicKey publicKey) {
            this.id = PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).getKeyIdentifier();
        }

        CertId(byte[] bArr) {
            this.id = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return Arrays.areEqual(this.id, ((CertId) obj).id);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.id);
        }
    }

    public static class DefPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(null, pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    public static class DefPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore3DES() {
            super(null, pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd3_KeyTripleDES_CBC);
        }
    }

    private static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        DefaultSecretKeyProvider() {
            HashMap map = new HashMap();
            map.put(new ASN1ObjectIdentifier("1.2.840.113533.7.66.10"), Integers.valueOf(128));
            map.put(PKCSObjectIdentifiers.des_EDE3_CBC, Integers.valueOf(192));
            map.put(NISTObjectIdentifiers.id_aes128_CBC, Integers.valueOf(128));
            map.put(NISTObjectIdentifiers.id_aes192_CBC, Integers.valueOf(192));
            map.put(NISTObjectIdentifiers.id_aes256_CBC, Integers.valueOf(256));
            map.put(NTTObjectIdentifiers.id_camellia128_cbc, Integers.valueOf(128));
            map.put(NTTObjectIdentifiers.id_camellia192_cbc, Integers.valueOf(192));
            map.put(NTTObjectIdentifiers.id_camellia256_cbc, Integers.valueOf(256));
            map.put(CryptoProObjectIdentifiers.gostR28147_gcfb, Integers.valueOf(256));
            this.KEY_SIZES = Collections.unmodifiableMap(map);
        }

        public int getKeySize(AlgorithmIdentifier algorithmIdentifier) {
            Integer num = (Integer) this.KEY_SIZES.get(algorithmIdentifier.getAlgorithm());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    private static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String lowerCase = str == null ? null : Strings.toLowerCase(str);
            String str2 = (String) this.keys.get(lowerCase);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(lowerCase, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }
    }

    public PKCS12KeyStoreSpi(Provider provider, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) throws Throwable {
        CertificateFactory certificateFactory;
        this.keys = new IgnoresCaseHashtable();
        this.certs = new IgnoresCaseHashtable();
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.ud("#\u0019-\u0017b'\u0018\u0015&\"\u0018\"&Y}\u000f\f\u001d\u0019\u000bv\u0005\u0011\u0006\u0010\r", (short) (ZN.Xd() ^ 11991))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.keyAlgorithm = aSN1ObjectIdentifier;
            this.certAlgorithm = aSN1ObjectIdentifier2;
            short sXd = (short) (C1633zX.Xd() ^ (-31895));
            int[] iArr = new int[",\u0003\u0007\u0003\u0011".length()];
            QB qb = new QB(",\u0003\u0007\u0003\u0011");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                if (provider != null) {
                    Class<?> cls = Class.forName(C1561oA.Yd("1)?+x?21DB:FL\u00028;IL\u0007\u001d@NQGEIDCWI+GJ\\X\\d", (short) (FB.Xd() ^ 22989)));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(Xg.qd("og}i7vlzt<b\u0005\u0004{\u0002{", (short) (OY.Xd() ^ 28630), (short) (OY.Xd() ^ OlympusMakernoteDirectory.TAG_FIELD_COUNT)));
                    clsArr[1] = Class.forName(Jg.Wd("@5q\u0010{x\u000eJ\u0004s\nLth-\u0007#\u001d7q\u0016Y", (short) (ZN.Xd() ^ 9195), (short) (ZN.Xd() ^ 9644)));
                    Object[] objArr2 = {str, provider};
                    short sXd2 = (short) (OY.Xd() ^ 24409);
                    short sXd3 = (short) (OY.Xd() ^ 29166);
                    int[] iArr2 = new int["Inj\u001as?G\u0013O/F".length()];
                    QB qb2 = new QB("Inj\u001as?G\u0013O/F");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                        i3++;
                    }
                    Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    Class<?> cls2 = Class.forName(C1626yg.Ud("o6 TR\u0016o\u0016L-F\u0012+,/We\u001fys3yc\u000f$^1u\\\u0019l\fC/$D\u0003", (short) (ZN.Xd() ^ 10465), (short) (ZN.Xd() ^ 18716)));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(Ig.wd("(h\u001a&)3\u0016h?\u0013@}M@'7", (short) (C1499aX.Xd() ^ (-20574))));
                    Object[] objArr3 = {str};
                    Method declaredMethod2 = cls2.getDeclaredMethod(EO.Od("q7\u0014Q\u001f`u#^HD", (short) (C1499aX.Xd() ^ (-12284))), clsArr2);
                    try {
                        declaredMethod2.setAccessible(true);
                        certificateFactory = (CertificateFactory) declaredMethod2.invoke(null, objArr3);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                this.certFact = certificateFactory;
            } catch (Exception e4) {
                throw new IllegalArgumentException(C1561oA.Qd("PMY\u0011]\bJXJEWG\u0001CDPQ{A;<LFHNs\u007fq", (short) (Od.Xd() ^ (-9496))) + e4.toString());
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i2, char[] cArr, boolean z2, byte[] bArr2) throws Exception {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i2);
        Mac macCreateMac = this.helper.createMac(aSN1ObjectIdentifier.getId());
        macCreateMac.init(new PKCS12Key(cArr, z2), pBEParameterSpec);
        macCreateMac.update(bArr2);
        return macCreateMac.doFinal();
    }

    private Cipher createCipher(int i2, char[] cArr, AlgorithmIdentifier algorithmIdentifier) throws NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec gOST28147ParameterSpec;
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
        SecretKey secretKeyGenerateSecret = pBKDF2Params.isDefaultPrf() ? secretKeyFactoryCreateSecretKeyFactory.generateSecret(new PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), keySizeProvider.getKeySize(algorithmIdentifier2))) : secretKeyFactoryCreateSecretKeyFactory.generateSecret(new PBKDF2KeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), keySizeProvider.getKeySize(algorithmIdentifier2), pBKDF2Params.getPrf()));
        Cipher cipher = Cipher.getInstance(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof ASN1OctetString) {
            gOST28147ParameterSpec = new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets());
        } else {
            GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
            gOST28147ParameterSpec = new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV());
        }
        cipher.init(i2, secretKeyGenerateSecret, gOST28147ParameterSpec);
        return cipher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SubjectKeyIdentifier createSubjectKeyId(PublicKey publicKey) {
        try {
            return new SubjectKeyIdentifier(getDigest(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    private void doStore(OutputStream outputStream, char[] cArr, boolean z2) throws Throwable {
        String strYd;
        boolean z3;
        boolean z4;
        boolean z5;
        if (cArr == null) {
            throw new NullPointerException(Wg.vd("\u001b=n@2EFKDH;wLOKLIGDD\u0001HRV\u000562+<\r\u001c\u001e\r9TiDfbfZ$", (short) (C1580rY.Xd() ^ (-27938))));
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Enumeration enumerationKeys = this.keys.keys();
        while (enumerationKeys.hasMoreElements()) {
            byte[] bArr = new byte[20];
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr};
            Method method = Class.forName(C1593ug.zd("rj\u0001l:\u0001sr\u0006\u0004{\b\u000eCi|{\u000f\r\u0001n~\r\u0004\u0010\u000f", (short) (C1499aX.Xd() ^ (-14294)), (short) (C1499aX.Xd() ^ (-21415)))).getMethod(C1561oA.od("=3E@\rC=-:", (short) (C1607wl.Xd() ^ 3780)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                String str = (String) enumerationKeys.nextElement();
                PrivateKey privateKey = (PrivateKey) this.keys.get(str);
                PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, 1024);
                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(this.keyAlgorithm, pKCS12PBEParams.toASN1Primitive()), wrapKey(this.keyAlgorithm.getId(), privateKey, pKCS12PBEParams, cArr));
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                if (privateKey instanceof PKCS12BagAttributeCarrier) {
                    PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) privateKey;
                    DERBMPString dERBMPString = (DERBMPString) pKCS12BagAttributeCarrier.getBagAttribute(pkcs_9_at_friendlyName);
                    if (dERBMPString == null || !dERBMPString.getString().equals(str)) {
                        pKCS12BagAttributeCarrier.setBagAttribute(pkcs_9_at_friendlyName, new DERBMPString(str));
                    }
                    if (pKCS12BagAttributeCarrier.getBagAttribute(pkcs_9_at_localKeyId) == null) {
                        Certificate certificateEngineGetCertificate = engineGetCertificate(str);
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = pkcs_9_at_localKeyId;
                        Class<?> cls = Class.forName(C1561oA.Kd("vn\u0005p>\u0005wv\n\b\u007f\f\u0012G}\u0001\u000f\u0012Lb\u0006\u0014\u0017\r\u000b\u000f\n\t\u001d\u000f", (short) (ZN.Xd() ^ 31626)));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr2 = new Object[0];
                        short sXd = (short) (Od.Xd() ^ (-10729));
                        short sXd2 = (short) (Od.Xd() ^ (-31078));
                        int[] iArr = new int[" 6G+d`nw}l\u00117".length()];
                        QB qb = new QB(" 6G+d`nw}l\u00117");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                            i2++;
                        }
                        Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                        try {
                            method2.setAccessible(true);
                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, createSubjectKeyId((PublicKey) method2.invoke(certificateEngineGetCertificate, objArr2)));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
                    z5 = false;
                    while (bagAttributeKeys.hasMoreElements()) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
                        aSN1EncodableVector3.add(aSN1ObjectIdentifier2);
                        aSN1EncodableVector3.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier2)));
                        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector3));
                        z5 = true;
                    }
                } else {
                    z5 = false;
                }
                if (!z5) {
                    ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                    Certificate certificateEngineGetCertificate2 = engineGetCertificate(str);
                    aSN1EncodableVector4.add(pkcs_9_at_localKeyId);
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Xd("iawc1wji|zr~\u0005:ps\u0002\u0005?Ux\u0007\n\u007f}\u0002|{\u0010\u0002", (short) (OY.Xd() ^ 11740))).getMethod(Wg.vd(";8J%E1>:?&CV", (short) (OY.Xd() ^ 12370)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        aSN1EncodableVector4.add(new DERSet(createSubjectKeyId((PublicKey) method3.invoke(certificateEngineGetCertificate2, objArr3))));
                        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector4));
                        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
                        aSN1EncodableVector5.add(pkcs_9_at_friendlyName);
                        aSN1EncodableVector5.add(new DERSet(new DERBMPString(str)));
                        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector5));
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                aSN1EncodableVector.add(new SafeBag(pkcs8ShroudedKeyBag, encryptedPrivateKeyInfo.toASN1Primitive(), new DERSet(aSN1EncodableVector2)));
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        DERSequence dERSequence = new DERSequence(aSN1EncodableVector);
        String strKd = Qg.kd("UUa", (short) (C1499aX.Xd() ^ (-9691)), (short) (C1499aX.Xd() ^ (-15032)));
        BEROctetString bEROctetString = new BEROctetString(dERSequence.getEncoded(strKd));
        byte[] bArr2 = new byte[20];
        SecureRandom secureRandom2 = this.random;
        Class<?> cls2 = Class.forName(hg.Vd("\u0006{\u0010yE\nzw\t\u0005z\u0005\t<`qn\u007f{mYgshro", (short) (FB.Xd() ^ 15852), (short) (FB.Xd() ^ 18237)));
        Class<?>[] clsArr2 = {byte[].class};
        Object[] objArr4 = {bArr2};
        short sXd3 = (short) (ZN.Xd() ^ 6160);
        int[] iArr2 = new int["@6HC\u0010F@0=".length()];
        QB qb2 = new QB("@6HC\u0010F@0=");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method4 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
        try {
            method4.setAccessible(true);
            method4.invoke(secureRandom2, objArr4);
            ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(this.certAlgorithm, new PKCS12PBEParams(bArr2, 1024).toASN1Primitive());
            Hashtable hashtable = new Hashtable();
            Enumeration enumerationKeys2 = this.keys.keys();
            while (true) {
                boolean zHasMoreElements = enumerationKeys2.hasMoreElements();
                strYd = C1561oA.yd("Fruqo\u001cdllwossk'iv\u0003\b{suro\u000e}U:", (short) (C1499aX.Xd() ^ (-23191)));
                if (!zHasMoreElements) {
                    break;
                }
                try {
                    String str2 = (String) enumerationKeys2.nextElement();
                    Object objEngineGetCertificate = engineGetCertificate(str2);
                    ASN1ObjectIdentifier aSN1ObjectIdentifier3 = x509Certificate;
                    Object[] objArr5 = new Object[0];
                    Method method5 = Class.forName(C1561oA.Yd("OG]I\u0017]POb`Xdj VYgj%;^loecgbaug", (short) (FB.Xd() ^ 9453))).getMethod(Xg.qd("IHX*TJWMOO", (short) (Od.Xd() ^ (-17461)), (short) (Od.Xd() ^ (-4993))), new Class[0]);
                    try {
                        method5.setAccessible(true);
                        CertBag certBag = new CertBag(aSN1ObjectIdentifier3, new DEROctetString((byte[]) method5.invoke(objEngineGetCertificate, objArr5)));
                        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
                        if (objEngineGetCertificate instanceof PKCS12BagAttributeCarrier) {
                            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) objEngineGetCertificate;
                            DERBMPString dERBMPString2 = (DERBMPString) pKCS12BagAttributeCarrier2.getBagAttribute(pkcs_9_at_friendlyName);
                            if (dERBMPString2 == null || !dERBMPString2.getString().equals(str2)) {
                                pKCS12BagAttributeCarrier2.setBagAttribute(pkcs_9_at_friendlyName, new DERBMPString(str2));
                            }
                            if (pKCS12BagAttributeCarrier2.getBagAttribute(pkcs_9_at_localKeyId) == null) {
                                ASN1ObjectIdentifier aSN1ObjectIdentifier4 = pkcs_9_at_localKeyId;
                                Object[] objArr6 = new Object[0];
                                Method method6 = Class.forName(Jg.Wd("GZ\n0\u0019xF`,%X=^p}<'\u0001VI$-l{Rs\b?p{", (short) (Od.Xd() ^ (-23752)), (short) (Od.Xd() ^ (-18183)))).getMethod(ZO.xd("\u000f,juK%\\hB\u0017\u000e+", (short) (ZN.Xd() ^ 14958), (short) (ZN.Xd() ^ 19737)), new Class[0]);
                                try {
                                    method6.setAccessible(true);
                                    pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier4, createSubjectKeyId((PublicKey) method6.invoke(objEngineGetCertificate, objArr6)));
                                } catch (InvocationTargetException e5) {
                                    throw e5.getCause();
                                }
                            }
                            Enumeration bagAttributeKeys2 = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                            z4 = false;
                            while (bagAttributeKeys2.hasMoreElements()) {
                                ASN1ObjectIdentifier aSN1ObjectIdentifier5 = (ASN1ObjectIdentifier) bagAttributeKeys2.nextElement();
                                ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
                                aSN1EncodableVector8.add(aSN1ObjectIdentifier5);
                                aSN1EncodableVector8.add(new DERSet(pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier5)));
                                aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector8));
                                z4 = true;
                            }
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
                            aSN1EncodableVector9.add(pkcs_9_at_localKeyId);
                            short sXd4 = (short) (C1607wl.Xd() ^ 27904);
                            short sXd5 = (short) (C1607wl.Xd() ^ OlympusImageProcessingMakernoteDirectory.TagKeystoneValue);
                            int[] iArr3 = new int["7\u0003CM\\pHd#@c;\u001a4K'rR\u0018X9\u00140O\u0002<J'\u0015t".length()];
                            QB qb3 = new QB("7\u0003CM\\pHd#@c;\u001a4K'rR\u0018X9\u00140O\u0002<J'\u0015t");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                                i4++;
                            }
                            Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                            Object[] objArr7 = new Object[0];
                            Method method7 = cls3.getMethod(Ig.wd("=\u000f*4X\u007f[Oq\u0010\">", (short) (C1499aX.Xd() ^ (-20247))), new Class[0]);
                            try {
                                method7.setAccessible(true);
                                aSN1EncodableVector9.add(new DERSet(createSubjectKeyId((PublicKey) method7.invoke(objEngineGetCertificate, objArr7))));
                                aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector9));
                                ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                                aSN1EncodableVector10.add(pkcs_9_at_friendlyName);
                                aSN1EncodableVector10.add(new DERSet(new DERBMPString(str2)));
                                aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector10));
                            } catch (InvocationTargetException e6) {
                                throw e6.getCause();
                            }
                        }
                        aSN1EncodableVector6.add(new SafeBag(certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector7)));
                        hashtable.put(objEngineGetCertificate, objEngineGetCertificate);
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                } catch (CertificateEncodingException e8) {
                    throw new IOException(strYd + e8.toString());
                }
            }
            Enumeration enumerationKeys3 = this.certs.keys();
            while (enumerationKeys3.hasMoreElements()) {
                try {
                    String str3 = (String) enumerationKeys3.nextElement();
                    Object obj = (Certificate) this.certs.get(str3);
                    if (this.keys.get(str3) == null) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = x509Certificate;
                        Class<?> cls4 = Class.forName(EO.Od("U\u0002;D\f\u0006IBv6%T\b@\u0004.o\u0012d1\u0017\u007fWH\u0019\bc/\u001c~", (short) (C1633zX.Xd() ^ (-28036))));
                        Class<?>[] clsArr3 = new Class[0];
                        Object[] objArr8 = new Object[0];
                        short sXd6 = (short) (C1499aX.Xd() ^ (-5746));
                        int[] iArr4 = new int["\u0014\u0011\u001fn\u0017\u000b\u0016\n\n\b".length()];
                        QB qb4 = new QB("\u0014\u0011\u001fn\u0017\u000b\u0016\n\n\b");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                            i5++;
                        }
                        Method method8 = cls4.getMethod(new String(iArr4, 0, i5), clsArr3);
                        try {
                            method8.setAccessible(true);
                            CertBag certBag2 = new CertBag(aSN1ObjectIdentifier6, new DEROctetString((byte[]) method8.invoke(obj, objArr8)));
                            ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
                            if (obj instanceof PKCS12BagAttributeCarrier) {
                                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) obj;
                                DERBMPString dERBMPString3 = (DERBMPString) pKCS12BagAttributeCarrier3.getBagAttribute(pkcs_9_at_friendlyName);
                                if (dERBMPString3 == null || !dERBMPString3.getString().equals(str3)) {
                                    pKCS12BagAttributeCarrier3.setBagAttribute(pkcs_9_at_friendlyName, new DERBMPString(str3));
                                }
                                Enumeration bagAttributeKeys3 = pKCS12BagAttributeCarrier3.getBagAttributeKeys();
                                z3 = false;
                                while (bagAttributeKeys3.hasMoreElements()) {
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier7 = (ASN1ObjectIdentifier) bagAttributeKeys3.nextElement();
                                    if (!aSN1ObjectIdentifier7.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
                                        aSN1EncodableVector12.add(aSN1ObjectIdentifier7);
                                        aSN1EncodableVector12.add(new DERSet(pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier7)));
                                        aSN1EncodableVector11.add(new DERSequence(aSN1EncodableVector12));
                                        z3 = true;
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
                                aSN1EncodableVector13.add(pkcs_9_at_friendlyName);
                                aSN1EncodableVector13.add(new DERSet(new DERBMPString(str3)));
                                aSN1EncodableVector11.add(new DERSequence(aSN1EncodableVector13));
                            }
                            aSN1EncodableVector6.add(new SafeBag(certBag, certBag2.toASN1Primitive(), new DERSet(aSN1EncodableVector11)));
                            hashtable.put(obj, obj);
                        } catch (InvocationTargetException e9) {
                            throw e9.getCause();
                        }
                    }
                } catch (CertificateEncodingException e10) {
                    throw new IOException(strYd + e10.toString());
                }
            }
            Set usedCertificateSet = getUsedCertificateSet();
            Enumeration enumerationKeys4 = this.chainCerts.keys();
            while (enumerationKeys4.hasMoreElements()) {
                try {
                    Object obj2 = (Certificate) this.chainCerts.get((CertId) enumerationKeys4.nextElement());
                    if (usedCertificateSet.contains(obj2) && hashtable.get(obj2) == null) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = x509Certificate;
                        Object[] objArr9 = new Object[0];
                        Method method9 = Class.forName(C1593ug.zd("91G3\u0001G:9LJBNT\n@CQT\u000f%HVYOMQLK_Q", (short) (ZN.Xd() ^ 16788), (short) (ZN.Xd() ^ 19954))).getMethod(C1561oA.od("1.<\f4(3''%", (short) (C1580rY.Xd() ^ (-23140))), new Class[0]);
                        try {
                            method9.setAccessible(true);
                            CertBag certBag3 = new CertBag(aSN1ObjectIdentifier8, new DEROctetString((byte[]) method9.invoke(obj2, objArr9)));
                            ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
                            if (obj2 instanceof PKCS12BagAttributeCarrier) {
                                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier4 = (PKCS12BagAttributeCarrier) obj2;
                                Enumeration bagAttributeKeys4 = pKCS12BagAttributeCarrier4.getBagAttributeKeys();
                                while (bagAttributeKeys4.hasMoreElements()) {
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier9 = (ASN1ObjectIdentifier) bagAttributeKeys4.nextElement();
                                    if (!aSN1ObjectIdentifier9.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
                                        aSN1EncodableVector15.add(aSN1ObjectIdentifier9);
                                        aSN1EncodableVector15.add(new DERSet(pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier9)));
                                        aSN1EncodableVector14.add(new DERSequence(aSN1EncodableVector15));
                                    }
                                }
                            }
                            aSN1EncodableVector6.add(new SafeBag(certBag, certBag3.toASN1Primitive(), new DERSet(aSN1EncodableVector14)));
                        } catch (InvocationTargetException e11) {
                            throw e11.getCause();
                        }
                    }
                } catch (CertificateEncodingException e12) {
                    throw new IOException(strYd + e12.toString());
                }
            }
            AuthenticatedSafe authenticatedSafe = new AuthenticatedSafe(new ContentInfo[]{new ContentInfo(data, bEROctetString), new ContentInfo(encryptedData, new EncryptedData(data, algorithmIdentifier, new BEROctetString(cryptData(true, algorithmIdentifier, cArr, false, new DERSequence(aSN1EncodableVector6).getEncoded(strKd)))).toASN1Primitive())});
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            (z2 ? new DEROutputStream(byteArrayOutputStream) : new BEROutputStream(byteArrayOutputStream)).writeObject(authenticatedSafe);
            ContentInfo contentInfo = new ContentInfo(data, new BEROctetString(byteArrayOutputStream.toByteArray()));
            byte[] bArr3 = new byte[20];
            SecureRandom secureRandom3 = this.random;
            Object[] objArr10 = {bArr3};
            Method method10 = Class.forName(C1561oA.Kd("qi\u007fk9\u007frq\u0005\u0003z\u0007\rBh{z\u000e\f\u007fm}\f\u0003\u000f\u000e", (short) (C1633zX.Xd() ^ (-13462)))).getMethod(Wg.Zd("jZv\u001a0\u000f\u0013+\u0002", (short) (C1633zX.Xd() ^ (-20528)), (short) (C1633zX.Xd() ^ (-32645))), byte[].class);
            try {
                method10.setAccessible(true);
                method10.invoke(secureRandom3, objArr10);
                try {
                    (z2 ? new DEROutputStream(outputStream) : new BEROutputStream(outputStream)).writeObject(new Pfx(contentInfo, new MacData(new DigestInfo(new AlgorithmIdentifier(id_SHA1, DERNull.INSTANCE), calculatePbeMac(id_SHA1, bArr3, 1024, cArr, false, ((ASN1OctetString) contentInfo.getContent()).getOctets())), bArr3, 1024)));
                } catch (Exception e13) {
                    throw new IOException(C1561oA.Xd("drsqu$huu{}|\u0001o\u0002w}w1_TWO6", (short) (C1607wl.Xd() ^ 26313)) + e13.toString());
                }
            } catch (InvocationTargetException e14) {
                throw e14.getCause();
            }
        } catch (InvocationTargetException e15) {
            throw e15.getCause();
        }
    }

    private static byte[] getDigest(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        Digest digestCreateSHA1 = DigestFactory.createSHA1();
        byte[] bArr = new byte[digestCreateSHA1.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        digestCreateSHA1.update(bytes, 0, bytes.length);
        digestCreateSHA1.doFinal(bArr, 0);
        return bArr;
    }

    private Set getUsedCertificateSet() throws Throwable {
        HashSet hashSet = new HashSet();
        Enumeration enumerationKeys = this.keys.keys();
        while (enumerationKeys.hasMoreElements()) {
            Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationKeys.nextElement());
            for (int i2 = 0; i2 != certificateArrEngineGetCertificateChain.length; i2++) {
                hashSet.add(certificateArrEngineGetCertificateChain[i2]);
            }
        }
        Enumeration enumerationKeys2 = this.certs.keys();
        while (enumerationKeys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) enumerationKeys2.nextElement()));
        }
        return hashSet;
    }

    protected byte[] cryptData(boolean z2, AlgorithmIdentifier algorithmIdentifier, char[] cArr, boolean z3, byte[] bArr) throws IOException {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        int i2 = z2 ? 1 : 2;
        if (!algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            if (!algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
                throw new IOException("unknown PBE algorithm: " + algorithm);
            }
            try {
                return createCipher(i2, cArr, algorithmIdentifier).doFinal(bArr);
            } catch (Exception e2) {
                throw new IOException("exception decrypting data - " + e2.toString());
            }
        }
        PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
        new PBEKeySpec(cArr);
        try {
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            PKCS12Key pKCS12Key = new PKCS12Key(cArr, z3);
            Cipher cipherCreateCipher = this.helper.createCipher(algorithm.getId());
            cipherCreateCipher.init(i2, pKCS12Key, pBEParameterSpec);
            return cipherCreateCipher.doFinal(bArr);
        } catch (Exception e3) {
            throw new IOException("exception decrypting data - " + e3.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws Throwable {
        Key key = (Key) this.keys.remove(str);
        Certificate certificate = (Certificate) this.certs.remove(str);
        if (certificate != null) {
            Hashtable hashtable = this.chainCerts;
            Class<?> cls = Class.forName(Qg.kd("H>R<\bL=:KG=GK~34@Ay\u000e/;<0,.'$6&", (short) (C1633zX.Xd() ^ (-4578)), (short) (C1633zX.Xd() ^ (-20350))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1499aX.Xd() ^ (-25092));
            short sXd2 = (short) (C1499aX.Xd() ^ (-21187));
            int[] iArr = new int["\u0010\r\u001bu\u001a\u0006\u000f\u000b\u0004j\u0004\u0017".length()];
            QB qb = new QB("\u0010\r\u001bu\u001a\u0006\u000f\u000b\u0004j\u0004\u0017");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                hashtable.remove(new CertId((PublicKey) method.invoke(certificate, objArr)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (key != null) {
            String str2 = (String) this.localIds.remove(str);
            if (str2 != null) {
                certificate = (Certificate) this.keyCerts.remove(str2);
            }
            if (certificate != null) {
                Hashtable hashtable2 = this.chainCerts;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.ud("5+?)t9*'84*48k !-.fz\u001c()\u001d\u0019\u001b\u0014\u0011#\u0013", (short) (C1580rY.Xd() ^ (-28194)))).getMethod(C1561oA.yd("\u001d\u001a,\u0007/\u001b($!\b%8", (short) (C1499aX.Xd() ^ (-20211))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    hashtable2.remove(new CertId((PublicKey) method2.invoke(certificate, objArr2)));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificate.");
        }
        Certificate certificate = (Certificate) this.certs.get(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.localIds.get(str);
        return (Certificate) (str2 != null ? this.keyCerts.get(str2) : this.keyCerts.get(str));
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) throws Throwable {
        Enumeration enumerationElements = this.certs.elements();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationElements.hasMoreElements()) {
            Certificate certificate2 = (Certificate) enumerationElements.nextElement();
            String str = (String) enumerationKeys.nextElement();
            Class<?> cls = Class.forName(C1561oA.Yd("91G3\u0001G:9LJBNT\n@CQT\u000f%HVYOMQLK_Q", (short) (C1580rY.Xd() ^ (-7578))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1580rY.Xd() ^ (-21587));
            short sXd2 = (short) (C1580rY.Xd() ^ (-15274));
            int[] iArr = new int["!\u0019/\u001bh(\u001e,&m\u0010$-)(:".length()];
            QB qb = new QB("!\u0019/\u001bh(\u001e,&m\u0010$-)(:");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {certificate};
            Method method = cls.getMethod(Jg.Wd("YN\"\u001a\u0016)", (short) (Od.Xd() ^ (-905)), (short) (Od.Xd() ^ (-22073))), clsArr);
            try {
                method.setAccessible(true);
                if (((Boolean) method.invoke(certificate2, objArr)).booleanValue()) {
                    return str;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Enumeration enumerationElements2 = this.keyCerts.elements();
        Enumeration enumerationKeys2 = this.keyCerts.keys();
        while (enumerationElements2.hasMoreElements()) {
            Certificate certificate3 = (Certificate) enumerationElements2.nextElement();
            String str2 = (String) enumerationKeys2.nextElement();
            Object[] objArr2 = {certificate};
            Method method2 = Class.forName(ZO.xd("F|\u0007l[=\u0011r$\u0010.+\f7>3D?#ex%?u\u0013Q\u0002><\u001f", (short) (Od.Xd() ^ (-1105)), (short) (Od.Xd() ^ (-32329)))).getMethod(Ig.wd("3\u0014g6V\b", (short) (OY.Xd() ^ 8183)), Class.forName(C1626yg.Ud("w\u0011M\u0004`|0\u0004y._\u0012\u0005\u0010I|", (short) (OY.Xd() ^ 11654), (short) (OY.Xd() ^ 31318))));
            try {
                method2.setAccessible(true);
                if (((Boolean) method2.invoke(certificate3, objArr2)).booleanValue()) {
                    return str2;
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineGetCertificateChain(java.lang.String):java.security.cert.Certificate[]");
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            throw new NullPointerException("alias == null");
        }
        if (this.keys.get(str) == null && this.certs.get(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [org.bouncycastle.asn1.ASN1OctetString] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24, types: [org.bouncycastle.asn1.ASN1OctetString] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void engineLoad(java.io.InputStream r24, char[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineLoad(java.io.InputStream, char[]):void");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws Throwable {
        if (this.keys.get(str) == null) {
            this.certs.put(str, certificate);
            Hashtable hashtable = this.chainCerts;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("iawc1wji|zr~\u0005:ps\u0002\u0005?Ux\u0007\n\u007f}\u0002|{\u0010\u0002", (short) (OY.Xd() ^ 14961))).getMethod(Wg.vd("\n\u0007\u0015o\u0014\u007f\t\u0005}d}\u0011", (short) (FB.Xd() ^ 20819)), new Class[0]);
            try {
                method.setAccessible(true);
                hashtable.put(new CertId((PublicKey) method.invoke(certificate, objArr)), certificate);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        short sXd = (short) (C1633zX.Xd() ^ (-17558));
        short sXd2 = (short) (C1633zX.Xd() ^ (-25556));
        int[] iArr = new int["h{w\u0004u/w\u0001,l*tm\u0001&jrwtz vgqd\u001bna]\u0017dVaX\u0012".length()];
        QB qb = new QB("h{w\u0004u/w\u0001,l*tm\u0001&jrwtz vgqd\u001bna]\u0017dVaX\u0012");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr2 = {new String(iArr, 0, i2) + str + hg.Vd("\u0015", (short) (C1499aX.Xd() ^ (-11436)), (short) (C1499aX.Xd() ^ (-3688)))};
        Constructor<?> constructor = Class.forName(C1561oA.ud("@6J4\u007fD52C?5?Cv\u0013,?\u0018824&\u00057!\",/#(&", (short) (C1580rY.Xd() ^ (-16737)))).getConstructor(Class.forName(C1561oA.yd(")!3\u001fh(\u001a(.u\u0018:5-/)", (short) (ZN.Xd() ^ 25974))));
        try {
            constructor.setAccessible(true);
            throw ((KeyStoreException) constructor.newInstance(objArr2));
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
        boolean z2 = key instanceof PrivateKey;
        if (!z2) {
            short sXd = (short) (ZN.Xd() ^ 19555);
            int[] iArr = new int["Jl\u0017KyM\u000b0\u007f\n\u0016d\u007fRSeos\u0017[\u001fR*]\u001dmK@EV\u001d\u000f][\u0013/2\u001e\u000f".length()];
            QB qb = new QB("Jl\u0017KyM\u000b0\u007f\n\u0016d\u007fRSeos\u0017[\u001fR*]\u001dmK@EV\u001d\u000f][\u0013/2\u001e\u000f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Object[] objArr = {new String(iArr, 0, i2)};
            Constructor<?> constructor = Class.forName(EO.Od("b*O[ydD,u \u001bB2^]T5~z\u0010I\u0013V\u0010A\u0011|U\"xe", (short) (OY.Xd() ^ 31986))).getConstructor(Class.forName(C1561oA.Qd("\u0007|\u0011zF\u0004w\u0004{Ae\u0006\u0003x|t", (short) (C1580rY.Xd() ^ (-3441)))));
            try {
                constructor.setAccessible(true);
                throw ((KeyStoreException) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (!z2 || certificateArr != null) {
            if (this.keys.get(str) != null) {
                engineDeleteEntry(str);
            }
            this.keys.put(str, key);
            if (certificateArr != null) {
                this.certs.put(str, certificateArr[0]);
                for (int i3 = 0; i3 != certificateArr.length; i3++) {
                    Hashtable hashtable = this.chainCerts;
                    Certificate certificate = certificateArr[i3];
                    Object[] objArr2 = new Object[0];
                    Method method = Class.forName(ZO.xd("V\u0003L_{zB)jHc;\u0011ILs\u0013Y\bBa\u0016\b K\u000b\u0004Wz(", (short) (FB.Xd() ^ 9057), (short) (FB.Xd() ^ 7597))).getMethod(C1626yg.Ud("\f}\u0006Y\u0002k=\u0006\u007fN-\u0005", (short) (ZN.Xd() ^ 13219), (short) (ZN.Xd() ^ 3207)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        hashtable.put(new CertId((PublicKey) method.invoke(certificate, objArr2)), certificateArr[i3]);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                return;
            }
            return;
        }
        String strYd = C1561oA.Yd("\u0007\t:~\u0002\u0010\u0013\t\u0007\u000b\u0006\u0005\u0019\u000bF\u000b\u0011\u000b\u0014\u001aL\u0014\u001e\"P\"%\u001d+\u0017+\u001dX% 5", (short) (C1633zX.Xd() ^ (-23485)));
        Class<?> cls = Class.forName(Xg.qd("B:P<\nPCBUSKW]\u00131La<^Z^R3gSVbg]dd", (short) (ZN.Xd() ^ 5307), (short) (ZN.Xd() ^ 10863)));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (Od.Xd() ^ (-12697));
        short sXd3 = (short) (Od.Xd() ^ (-26673));
        int[] iArr2 = new int["R>8\u00012.0yX|\b\u001e`5\u001fu".length()];
        QB qb2 = new QB("R>8\u00012.0yX|\b\u001e`5\u001fu");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd3) ^ sXd2));
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i4));
        Object[] objArr3 = {strYd};
        Constructor<?> constructor2 = cls.getConstructor(clsArr);
        try {
            constructor2.setAccessible(true);
            throw ((KeyStoreException) constructor2.newInstance(objArr3));
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
        doStore(outputStream, cArr, false);
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws Throwable {
        PKCS12StoreParameter pKCS12StoreParameter;
        char[] cArr;
        if (loadStoreParameter == null) {
            short sXd = (short) (C1499aX.Xd() ^ (-20078));
            int[] iArr = new int["U\u001e\u000e\u001e\f\u0017OG\b\u0018\fC\u0006\u0003\u000f\u000e\u000e\u0012<}\u007f9\u0007\r\u0003\u0002".length()];
            QB qb = new QB("U\u001e\u000e\u001e\f\u0017OG\b\u0018\fC\u0006\u0003\u000f\u000e\u000e\u0012<}\u007f9\u0007\r\u0003\u0002");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            throw new IllegalArgumentException(new String(iArr, 0, i2));
        }
        boolean z2 = loadStoreParameter instanceof PKCS12StoreParameter;
        if (!z2 && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            throw new IllegalArgumentException(C1593ug.zd("\u0019;lAD@AAEHt<FJx\u0001K=O?L\u0007\u0001QI\u0004Y_WM\t", (short) (ZN.Xd() ^ 29107), (short) (ZN.Xd() ^ 7020)) + loadStoreParameter.getClass().getName());
        }
        if (z2) {
            pKCS12StoreParameter = (PKCS12StoreParameter) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            OutputStream outputStream = jDKPKCS12StoreParameter.getOutputStream();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("\t~\u0013|H\r}z\f\b}\b\f?[t\b`\u0001z|n,SufhVvprdN^n\\g^l\\h", (short) (C1607wl.Xd() ^ 32334))).getMethod(C1561oA.Kd("\u0018\u0017'\u0004'%+\u001d\u001c.$++\u000e 2\"/(8*8", (short) (C1580rY.Xd() ^ (-31833))), new Class[0]);
            try {
                method.setAccessible(true);
                pKCS12StoreParameter = new PKCS12StoreParameter(outputStream, (KeyStore.ProtectionParameter) method.invoke(loadStoreParameter, objArr), jDKPKCS12StoreParameter.isUseDEREncoding());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        short sXd2 = (short) (Od.Xd() ^ (-25849));
        short sXd3 = (short) (Od.Xd() ^ (-1361));
        int[] iArr2 = new int["yt(\u0019\u0004o Dtw\r]\u0001[v7*J\n\u000b,EC\u0012SKl\"a\u0003\u0004\u001df=la\f*w\u000f:".length()];
        QB qb2 = new QB("yt(\u0019\u0004o Dtw\r]\u0001[v7*J\n\u000b,EC\u0012SKl\"a\u0003\u0004\u001df=la\f*w\u000f:");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Xd("BAQ.QOUGFXNUU8J\\LYRbTb", (short) (Od.Xd() ^ (-24815))), new Class[0]);
        try {
            method2.setAccessible(true);
            KeyStore.ProtectionParameter protectionParameter = (KeyStore.ProtectionParameter) method2.invoke(loadStoreParameter, objArr2);
            if (protectionParameter == null) {
                cArr = null;
            } else {
                if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                    throw new IllegalArgumentException(hg.Vd("+KzMNHGEGHr8@Bn>?;?/,<053c3#3!,#1!-Y(\u001eV*.$\u0018Q", (short) (ZN.Xd() ^ 2629), (short) (ZN.Xd() ^ 14987)) + protectionParameter.getClass().getName());
                }
                KeyStore.PasswordProtection passwordProtection = (KeyStore.PasswordProtection) protectionParameter;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Wg.vd("\u001e\u0016,\u0018e,\u001f\u001e1/'39n\r(\u001dw\u001a\u0016\u001a\u000eMz\r !&\u001f#\u0016\u0003\u0006\u0004\n{z\r\u0003\n\n", (short) (C1607wl.Xd() ^ 3413))).getMethod(Qg.kd("C@N)9JILCE6", (short) (Od.Xd() ^ (-17344)), (short) (Od.Xd() ^ (-13743))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    cArr = (char[]) method3.invoke(passwordProtection, objArr3);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            doStore(pKCS12StoreParameter.getOutputStream(), cArr, pKCS12StoreParameter.isForDEREncoding());
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    protected PrivateKey unwrapKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, char[] cArr, boolean z2) throws IOException {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            if (!algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                if (algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
                    return (PrivateKey) createCipher(4, cArr, algorithmIdentifier).unwrap(bArr, "", 2);
                }
                throw new IOException("exception unwrapping private key - cannot recognise: " + algorithm);
            }
            PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            Cipher cipherCreateCipher = this.helper.createCipher(algorithm.getId());
            cipherCreateCipher.init(4, new PKCS12Key(cArr, z2), pBEParameterSpec);
            return (PrivateKey) cipherCreateCipher.unwrap(bArr, "", 2);
        } catch (Exception e2) {
            throw new IOException("exception unwrapping private key - " + e2.toString());
        }
    }

    protected byte[] wrapKey(String str, Key key, PKCS12PBEParams pKCS12PBEParams, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            Cipher cipherCreateCipher = this.helper.createCipher(str);
            cipherCreateCipher.init(3, secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherCreateCipher.wrap(key);
        } catch (Exception e2) {
            throw new IOException("exception encrypting data - " + e2.toString());
        }
    }
}
