package org.spongycastle.jcajce.provider.keystore.pkcs12;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.BEROctetString;
import org.spongycastle.asn1.BEROutputStream;
import org.spongycastle.asn1.DERBMPString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DEROutputStream;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.GOST28147Parameters;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.ntt.NTTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.AuthenticatedSafe;
import org.spongycastle.asn1.pkcs.CertBag;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.EncryptedData;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.pkcs.MacData;
import org.spongycastle.asn1.pkcs.PBES2Parameters;
import org.spongycastle.asn1.pkcs.PBKDF2Params;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.Pfx;
import org.spongycastle.asn1.pkcs.SafeBag;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.asn1.x509.SubjectKeyIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.jcajce.PKCS12Key;
import org.spongycastle.jcajce.PKCS12StoreParameter;
import org.spongycastle.jcajce.spec.GOST28147ParameterSpec;
import org.spongycastle.jcajce.spec.PBKDF2KeySpec;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.interfaces.BCKeyStore;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.provider.JDKPKCS12StoreParameter;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;
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
        this.keys = new IgnoresCaseHashtable();
        this.certs = new IgnoresCaseHashtable();
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Xd("E=S?\rSFEXVNZ`\u0016<ONa_SAQ_Vba", (short) (Od.Xd() ^ (-16006)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.keyAlgorithm = aSN1ObjectIdentifier;
            this.certAlgorithm = aSN1ObjectIdentifier2;
            short sXd = (short) (C1633zX.Xd() ^ (-7351));
            int[] iArr = new int["c8B<@".length()];
            QB qb = new QB("c8B<@");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                if (provider != null) {
                    Class<?> cls = Class.forName(Qg.kd("H>R<\bL=:KG=GK~34@Ay\u000e/;<0,.'$6&\u0006 !1+-3", (short) (OY.Xd() ^ 15593), (short) (OY.Xd() ^ 3666)));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(hg.Vd("+!5\u001fj(\u001c( e\n*'\u001d!\u0019", (short) (OY.Xd() ^ 16359), (short) (OY.Xd() ^ 16060)));
                    clsArr[1] = Class.forName(C1561oA.ud("UK_I\u0015YJGXTJTX\f-NJPB<<H", (short) (C1633zX.Xd() ^ (-10170))));
                    Object[] objArr2 = {str, provider};
                    Method declaredMethod = cls.getDeclaredMethod(C1561oA.yd("dcoEgmkYsih", (short) (FB.Xd() ^ 13813)), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        this.certFact = (CertificateFactory) declaredMethod.invoke(null, objArr2);
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Class<?> cls2 = Class.forName(C1561oA.Yd("KCYE\u0013YLK^\\T`f\u001cRUcf!7Zhka_c^]qcEadvrv~", (short) (C1633zX.Xd() ^ (-6417))));
                Class<?>[] clsArr2 = new Class[1];
                short sXd2 = (short) (C1580rY.Xd() ^ (-26604));
                short sXd3 = (short) (C1580rY.Xd() ^ (-4292));
                int[] iArr2 = new int["bZp\\*i_mg/Uwvntn".length()];
                QB qb2 = new QB("bZp\\*i_mg/Uwvntn");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                    i3++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr3 = {str};
                Method declaredMethod2 = cls2.getDeclaredMethod(Jg.Wd("*Dm`\u001d@[k\u0013$A", (short) (C1499aX.Xd() ^ (-9773)), (short) (C1499aX.Xd() ^ (-24391))), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    this.certFact = (CertificateFactory) declaredMethod2.invoke(null, objArr3);
                    return;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                throw new IllegalArgumentException(ZO.xd("\u0011t)\u000f?~\u0017\t<0{\u001d\u001cb6RB$=PE4\u0006\f'7/\t", (short) (OY.Xd() ^ 6244), (short) (OY.Xd() ^ 21046)) + e4.toString());
            }
            throw new IllegalArgumentException(ZO.xd("\u0011t)\u000f?~\u0017\t<0{\u001d\u001cb6RB$=PE4\u0006\f'7/\t", (short) (OY.Xd() ^ 6244), (short) (OY.Xd() ^ 21046)) + e4.toString());
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
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
        SecretKey secretKeyGenerateSecret = pBKDF2Params.isDefaultPrf() ? secretKeyFactoryCreateSecretKeyFactory.generateSecret(new PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), keySizeProvider.getKeySize(algorithmIdentifier2))) : secretKeyFactoryCreateSecretKeyFactory.generateSecret(new PBKDF2KeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), keySizeProvider.getKeySize(algorithmIdentifier2), pBKDF2Params.getPrf()));
        Cipher cipher = Cipher.getInstance(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof ASN1OctetString) {
            cipher.init(i2, secretKeyGenerateSecret, new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets()));
        } else {
            GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
            cipher.init(i2, secretKeyGenerateSecret, new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV()));
        }
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
        String strVd;
        boolean z3;
        boolean z4;
        boolean z5;
        if (cArr == null) {
            short sXd = (short) (C1580rY.Xd() ^ (-23770));
            int[] iArr = new int["\u001b;j:*;:=46'a45/.)% \u001eX\u001e&(T\u0004}t\u0004R__Lv\u0010#{\u001c\u0016\u0018\nQ".length()];
            QB qb = new QB("\u001b;j:*;:=46'a45/.)% \u001eX\u001e&(T\u0004}t\u0004R__Lv\u0010#{\u001c\u0016\u0018\nQ");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            throw new NullPointerException(new String(iArr, 0, i2));
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Enumeration enumerationKeys = this.keys.keys();
        while (enumerationKeys.hasMoreElements()) {
            byte[] bArr = new byte[20];
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr};
            Method method = Class.forName(C1626yg.Ud("t\u0003ud\u0019I\u001eiUwV\u001a\u001a\rh]\u00021\u0004`&;FP\t&", (short) (C1633zX.Xd() ^ (-22710)), (short) (C1633zX.Xd() ^ (-26660)))).getMethod(Ig.wd("[\u0019\nj\u000f\u00114-\u0018", (short) (OY.Xd() ^ 22086)), byte[].class);
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
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(EO.Od("\u00148A\u0007EWW\bD0'\u0012EuQ4u\u0004g'\u0004;M@W\t'm\r2", (short) (ZN.Xd() ^ 15829))).getMethod(C1561oA.Qd("\t\u0006\u0014n\u0013~\b\u0004|c|\u0010", (short) (C1499aX.Xd() ^ (-31536))), new Class[0]);
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
                    Method method3 = Class.forName(C1593ug.zd("5-C/|C65HF>JP\u0006<?MP\u000b!DRUKIMHG[M", (short) (ZN.Xd() ^ 32215), (short) (ZN.Xd() ^ 18138))).getMethod(C1561oA.od("85C\u001eB.73,\u0013,?", (short) (FB.Xd() ^ AuthApiStatusCodes.AUTH_APP_CERT_ERROR)), new Class[0]);
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
        String strKd = C1561oA.Kd(" \"0", (short) (Od.Xd() ^ (-27330)));
        BEROctetString bEROctetString = new BEROctetString(dERSequence.getEncoded(strKd));
        byte[] bArr2 = new byte[20];
        SecureRandom secureRandom2 = this.random;
        short sXd2 = (short) (C1499aX.Xd() ^ (-4913));
        short sXd3 = (short) (C1499aX.Xd() ^ (-15709));
        int[] iArr2 = new int["]\u00185\u0018PU\u000f9CO>u26GQW-Q<14x6}k".length()];
        QB qb2 = new QB("]\u00185\u0018PU\u000f9CO>u26GQW-Q<14x6}k");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr4 = {bArr2};
        Method method4 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Xd("!\u0019-*x1-\u001f.", (short) (C1499aX.Xd() ^ (-29333))), byte[].class);
        try {
            method4.setAccessible(true);
            method4.invoke(secureRandom2, objArr4);
            ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(this.certAlgorithm, new PKCS12PBEParams(bArr2, 1024).toASN1Primitive());
            Hashtable hashtable = new Hashtable();
            Enumeration enumerationKeys2 = this.keys.keys();
            while (true) {
                boolean zHasMoreElements = enumerationKeys2.hasMoreElements();
                strVd = Wg.vd("\u001eJMIO{DL4?7;C;v9NZ_SSUROUE\u001d\u0002", (short) (Od.Xd() ^ (-25405)));
                if (!zHasMoreElements) {
                    break;
                }
                try {
                    String str2 = (String) enumerationKeys2.nextElement();
                    Object objEngineGetCertificate = engineGetCertificate(str2);
                    ASN1ObjectIdentifier aSN1ObjectIdentifier3 = x509Certificate;
                    short sXd4 = (short) (C1607wl.Xd() ^ 6818);
                    short sXd5 = (short) (C1607wl.Xd() ^ 2677);
                    int[] iArr3 = new int["B8L6\u0002F74EA7AEx-.:;s\b)56*&(!\u001e0 ".length()];
                    QB qb3 = new QB("B8L6\u0002F74EA7AEx-.:;s\b)56*&(!\u001e0 ");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                        i4++;
                    }
                    Object[] objArr5 = new Object[0];
                    Method method5 = Class.forName(new String(iArr3, 0, i4)).getMethod(hg.Vd("+(6\u0006.\"-!!\u001f", (short) (C1607wl.Xd() ^ 28780), (short) (C1607wl.Xd() ^ 24187)), new Class[0]);
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
                                Method method6 = Class.forName(C1561oA.ud("2(<&q6'$51'15h\u001d\u001e*+cw\u0019%&\u001a\u0016\u0018\u0011\u000e \u0010", (short) (ZN.Xd() ^ 6940))).getMethod(C1561oA.yd("\u007f~\u000fk\u0012\u007f\u000b\t\u0004l\b\u001d", (short) (FB.Xd() ^ 27427)), new Class[0]);
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
                            Object[] objArr7 = new Object[0];
                            Method method7 = Class.forName(C1561oA.Yd("LDZF\u0014ZML_]Uag\u001dSVdg\"8[ilb`d_^rd", (short) (C1633zX.Xd() ^ (-9416)))).getMethod(Xg.qd("BAQ.TBMKF/J_", (short) (C1580rY.Xd() ^ (-25133)), (short) (C1580rY.Xd() ^ (-3211))), new Class[0]);
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
                    throw new IOException(strVd + e8.toString());
                }
            }
            Enumeration enumerationKeys3 = this.certs.keys();
            while (enumerationKeys3.hasMoreElements()) {
                try {
                    String str3 = (String) enumerationKeys3.nextElement();
                    Object obj = (Certificate) this.certs.get(str3);
                    if (this.keys.get(str3) == null) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = x509Certificate;
                        Class<?> cls = Class.forName(Jg.Wd("ek{s;q^iv|^fv,LKcN\u0003\u0007\">=!\u0017!(%!\u0011", (short) (ZN.Xd() ^ 31518), (short) (ZN.Xd() ^ 8399)));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr8 = new Object[0];
                        short sXd6 = (short) (C1580rY.Xd() ^ (-29673));
                        short sXd7 = (short) (C1580rY.Xd() ^ (-5615));
                        int[] iArr4 = new int["/oy^\u001eBg*\u001c]".length()];
                        QB qb4 = new QB("/oy^\u001eBg*\u001c]");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd7) + sXd6)));
                            i5++;
                        }
                        Method method8 = cls.getMethod(new String(iArr4, 0, i5), clsArr);
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
                    throw new IOException(strVd + e10.toString());
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
                        Method method9 = Class.forName(C1626yg.Ud("U#I;\\%[\u00139>:\u0010+S_?DD|cSfgO! \u000e]\u0015\u0011", (short) (C1580rY.Xd() ^ (-7594)), (short) (C1580rY.Xd() ^ (-13577)))).getMethod(Ig.wd("\u0013:5{{\u001c\nl'[", (short) (C1499aX.Xd() ^ (-4399))), new Class[0]);
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
                    throw new IOException(strVd + e12.toString());
                }
            }
            AuthenticatedSafe authenticatedSafe = new AuthenticatedSafe(new ContentInfo[]{new ContentInfo(data, bEROctetString), new ContentInfo(encryptedData, new EncryptedData(data, algorithmIdentifier, new BEROctetString(cryptData(true, algorithmIdentifier, cArr, false, new DERSequence(aSN1EncodableVector6).getEncoded(strKd)))).toASN1Primitive())});
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            (z2 ? new DEROutputStream(byteArrayOutputStream) : new BEROutputStream(byteArrayOutputStream)).writeObject(authenticatedSafe);
            ContentInfo contentInfo = new ContentInfo(data, new BEROctetString(byteArrayOutputStream.toByteArray()));
            byte[] bArr3 = new byte[20];
            SecureRandom secureRandom3 = this.random;
            Class<?> cls2 = Class.forName(EO.Od("\u0003HmvUW\u001b\u0014T\u0004v\"Q\u0016%[u\u0006Z%Q8\u001f\u0011k=", (short) (C1633zX.Xd() ^ (-31117))));
            Class<?>[] clsArr2 = {byte[].class};
            Object[] objArr10 = {bArr3};
            short sXd8 = (short) (ZN.Xd() ^ 2984);
            int[] iArr5 = new int["$\u001a,'s*$\u0014!".length()];
            QB qb5 = new QB("$\u001a,'s*$\u0014!");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(sXd8 + sXd8 + sXd8 + i6 + xuXd5.CK(iKK5));
                i6++;
            }
            Method method10 = cls2.getMethod(new String(iArr5, 0, i6), clsArr2);
            try {
                method10.setAccessible(true);
                method10.invoke(secureRandom3, objArr10);
                try {
                    (z2 ? new DEROutputStream(outputStream) : new BEROutputStream(outputStream)).writeObject(new Pfx(contentInfo, new MacData(new DigestInfo(new AlgorithmIdentifier(id_SHA1, DERNull.INSTANCE), calculatePbeMac(id_SHA1, bArr3, 1024, cArr, false, ((ASN1OctetString) contentInfo.getContent()).getOctets())), bArr3, 1024)));
                } catch (Exception e13) {
                    throw new IOException(C1593ug.zd("\u0011\u001f \u001e\"P\u0015\"\"(*)-\u001c.$*$]\f\u0001\u0004{b", (short) (C1580rY.Xd() ^ (-13713)), (short) (C1580rY.Xd() ^ (-14820))) + e13.toString());
                }
            } catch (InvocationTargetException e14) {
                throw e14.getCause();
            }
        } catch (InvocationTargetException e15) {
            throw e15.getCause();
        }
    }

    private static byte[] getDigest(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        sHA1Digest.update(bytes, 0, bytes.length);
        sHA1Digest.doFinal(bArr, 0);
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
            Class<?> cls = Class.forName(C1561oA.Kd("E=S?\rSFEXVNZ`\u0016LO]`\u001b1Tbe[Y]XWk]", (short) (C1499aX.Xd() ^ (-19655))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-8505));
            short sXd2 = (short) (C1633zX.Xd() ^ (-26871));
            int[] iArr = new int["P\u00032>\u0004%Yn\u0001|W\n".length()];
            QB qb = new QB("P\u00032>\u0004%Yn\u0001|W\n");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
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
                Method method2 = Class.forName(C1561oA.Xd("\u0011\t\u001f\u000bX\u001f\u0012\u0011$\"\u001a&,a\u0018\u001b),f| .1'%)$#7)", (short) (Od.Xd() ^ (-890)))).getMethod(Wg.vd("\u0018\u0017#\u007f*\u0018\u001f\u001d\ft\f!", (short) (C1607wl.Xd() ^ 24431)), new Class[0]);
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
        return str2 != null ? (Certificate) this.keyCerts.get(str2) : (Certificate) this.keyCerts.get(str);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) throws Throwable {
        Enumeration enumerationElements = this.certs.elements();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationElements.hasMoreElements()) {
            Certificate certificate2 = (Certificate) enumerationElements.nextElement();
            String str = (String) enumerationKeys.nextElement();
            Object[] objArr = {certificate};
            Method method = Class.forName(Qg.kd("\t~\u0013|H\r}z\f\b}\b\f?st\u0001\u0002:No{|plngdvf", (short) (C1580rY.Xd() ^ (-12247)), (short) (C1580rY.Xd() ^ (-25072)))).getMethod(C1561oA.ud("DOR=GM", (short) (OY.Xd() ^ 28472)), Class.forName(hg.Vd("f\\pZ&cWc[!ASZTQa", (short) (C1580rY.Xd() ^ (-18838)), (short) (C1580rY.Xd() ^ (-14315)))));
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
            Method method2 = Class.forName(C1561oA.yd(";1I3\u0003G<9>:4>Fy23ST\u0011%JV[O?A>;QA", (short) (C1607wl.Xd() ^ 24883))).getMethod(Xg.qd(")6;(4<", (short) (C1580rY.Xd() ^ (-6666)), (short) (C1580rY.Xd() ^ (-7750))), Class.forName(C1561oA.Yd("ZRhT\"aWe_'I]fbas", (short) (C1607wl.Xd() ^ 5119))));
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineGetCertificateChain(java.lang.String):java.security.cert.Certificate[]");
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
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25, types: [org.spongycastle.asn1.ASN1OctetString] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v29, types: [org.spongycastle.asn1.ASN1OctetString] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v32 */
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
            Method dump skipped, instruction units count: 2075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineLoad(java.io.InputStream, char[]):void");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws Throwable {
        if (this.keys.get(str) != null) {
            Object[] objArr = {C1561oA.Kd("H][i]\u0019cn\u001c^\u001ejez\"hryx\u0001(\u0001s\u007ft-\u0003wu1\u0001t\u0002z6", (short) (C1607wl.Xd() ^ 22974)) + str + Wg.Zd(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (short) (FB.Xd() ^ 23218), (short) (FB.Xd() ^ 20499))};
            Constructor<?> constructor = Class.forName(C1561oA.Xd("4,B.{B54GE=IO\u0005#>S.PLPD%YEHTYOVV", (short) (FB.Xd() ^ 22379))).getConstructor(Class.forName(Wg.vd("yo\u0004mA~r~~Dh\t\u000e\u0004\b\u007f", (short) (C1499aX.Xd() ^ (-24304)))));
            try {
                constructor.setAccessible(true);
                throw ((KeyStoreException) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.certs.put(str, certificate);
        Hashtable hashtable = this.chainCerts;
        Object[] objArr2 = new Object[0];
        Method method = Class.forName(C1593ug.zd("\u0016\u000e$\u0010]$\u0017\u0016)'\u001f+1f\u001d .1k\u0002%36,*.)(<.", (short) (C1499aX.Xd() ^ (-1289)), (short) (C1499aX.Xd() ^ (-23262)))).getMethod(C1561oA.od("b_mHlXa]V=Vi", (short) (C1633zX.Xd() ^ (-14128))), new Class[0]);
        try {
            method.setAccessible(true);
            hashtable.put(new CertId((PublicKey) method.invoke(certificate, objArr2)), certificate);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
        boolean z2 = key instanceof PrivateKey;
        if (!z2) {
            Object[] objArr = {Xg.qd("}yr\u0004bdS\u0019%\u001c+X(*0\\1401158d466u\u001a=5C/C5\u001c7LG", (short) (C1499aX.Xd() ^ (-28460)), (short) (C1499aX.Xd() ^ (-13409)))};
            Constructor<?> constructor = Class.forName(Jg.Wd("Aod@L`2!3@\u001a\u0015Z^ZdxbcQ\u0014W\u00179$6\"\u0016M#\u0003", (short) (Od.Xd() ^ (-15748)), (short) (Od.Xd() ^ (-26199)))).getConstructor(Class.forName(ZO.xd(" a}\u0004WK\u001a(T5s0\u0019\n\u0003$", (short) (OY.Xd() ^ 12887), (short) (OY.Xd() ^ 5290))));
            try {
                constructor.setAccessible(true);
                throw ((KeyStoreException) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (z2 && certificateArr == null) {
            Object[] objArr2 = {Qg.kd("''V\u0019\u001a&'\u001b\u0017\u0019\u0012\u000f!\u0011J\r\u0011\t\u0010\u0014D\n\u0012\u0014@\u0010\u0011\u0007\u0013|\u000f~8\u0003{\u000f", (short) (C1607wl.Xd() ^ 19191), (short) (C1607wl.Xd() ^ 25198))};
            Constructor<?> constructor2 = Class.forName(hg.Vd("C9M7\u0003G85FB8BFy\u0016/B\u001b;57)\b:$%/2&+)", (short) (ZN.Xd() ^ 25164), (short) (ZN.Xd() ^ 32217))).getConstructor(Class.forName(C1561oA.ud("D:N8\u0004A5A9~#C@6:2", (short) (FB.Xd() ^ 5149))));
            try {
                constructor2.setAccessible(true);
                throw ((KeyStoreException) constructor2.newInstance(objArr2));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (this.keys.get(str) != null) {
            engineDeleteEntry(str);
        }
        this.keys.put(str, key);
        if (certificateArr != null) {
            this.certs.put(str, certificateArr[0]);
            for (int i2 = 0; i2 != certificateArr.length; i2++) {
                Hashtable hashtable = this.chainCerts;
                Certificate certificate = certificateArr[i2];
                Object[] objArr3 = new Object[0];
                Method method = Class.forName(C1561oA.yd("{s\u0006qC\nxw~|p|\u0007<nqsv-Cjxwm_cZYqc", (short) (C1580rY.Xd() ^ (-24293)))).getMethod(C1561oA.Yd("BAQ.TBMKF/J_", (short) (Od.Xd() ^ (-21900))), new Class[0]);
                try {
                    method.setAccessible(true);
                    hashtable.put(new CertId((PublicKey) method.invoke(certificate, objArr3)), certificateArr[i2]);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
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
            short sXd = (short) (C1633zX.Xd() ^ (-18212));
            int[] iArr = new int["\u0005OASCP\u000b\u0005GYO\tMLZ[]c\u0010SW\u0013bjbc".length()];
            QB qb = new QB("\u0005OASCP\u000b\u0005GYO\tMLZ[]c\u0010SW\u0013bjbc");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            throw new IllegalArgumentException(new String(iArr, 0, i2));
        }
        boolean z2 = loadStoreParameter instanceof PKCS12StoreParameter;
        if (!z2 && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            throw new IllegalArgumentException(C1626yg.Ud("h(Bq1\u0003yN\u0002N.e\u0016*rp56)Z3\u0010@/VaAV1\u0001\u000f", (short) (FB.Xd() ^ 2842), (short) (FB.Xd() ^ 14186)) + loadStoreParameter.getClass().getName());
        }
        if (z2) {
            pKCS12StoreParameter = (PKCS12StoreParameter) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            OutputStream outputStream = jDKPKCS12StoreParameter.getOutputStream();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("D\to2\u000f 6;'odU0^WW/\u0003{\u000fu#\u000e8\u0004\u007f#D\u0016!F]^\u0018@s\u0010*4\u0015$", (short) (ZN.Xd() ^ 19228))).getMethod(EO.Od("^*IK@aP,`$\u001d;&}r]\u001a\u001ck\u0013; ", (short) (C1580rY.Xd() ^ (-20645))), new Class[0]);
            try {
                method.setAccessible(true);
                pKCS12StoreParameter = new PKCS12StoreParameter(outputStream, (KeyStore.ProtectionParameter) method.invoke(loadStoreParameter, objArr), jDKPKCS12StoreParameter.isUseDEREncoding());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Class<?> cls = Class.forName(C1561oA.Qd("C9M7\u0003G85FB8BFy\u0016/B\u001b;57)f\u000e0!#\u00111+-\u001f\t\u0019)\u0017\"\u0019'\u0017#", (short) (C1580rY.Xd() ^ (-13911))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd2 = (short) (OY.Xd() ^ 4171);
        short sXd3 = (short) (OY.Xd() ^ 3667);
        int[] iArr2 = new int["\u0005\u0004\u0014p\u0014\u0012\u0018\n\t\u001b\u0011\u0018\u0018z\r\u001f\u000f\u001c\u0015%\u0017%".length()];
        QB qb2 = new QB("\u0005\u0004\u0014p\u0014\u0012\u0018\n\t\u001b\u0011\u0018\u0018z\r\u001f\u000f\u001c\u0015%\u0017%");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method2.setAccessible(true);
            KeyStore.ProtectionParameter protectionParameter = (KeyStore.ProtectionParameter) method2.invoke(loadStoreParameter, objArr2);
            if (protectionParameter == null) {
                cArr = null;
            } else {
                if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                    throw new IllegalArgumentException(Wg.Zd("\u000em`q6o1n#\u0004Qy%\u0006U\u00058s:i*t,p!1#r&r!z<k:&7lhz2r*#", (short) (ZN.Xd() ^ 15302), (short) (ZN.Xd() ^ 4841)) + protectionParameter.getClass().getName());
                }
                KeyStore.PasswordProtection passwordProtection = (KeyStore.PasswordProtection) protectionParameter;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.od("NDXB\u000eRC@QMCMQ\u0005!:M&F@B4q\u001d->=@79*\u0015626&#3',*", (short) (FB.Xd() ^ 3318))).getMethod(C1561oA.Kd("[ZjGYlmrkob", (short) (C1607wl.Xd() ^ 24506)), new Class[0]);
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

    @Override // org.spongycastle.jce.interfaces.BCKeyStore
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
