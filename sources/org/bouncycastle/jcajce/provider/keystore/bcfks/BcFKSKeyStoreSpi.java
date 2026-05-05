package org.bouncycastle.jcajce.provider.keystore.bcfks;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.EncryptedObjectStoreData;
import org.bouncycastle.asn1.bc.EncryptedPrivateKeyData;
import org.bouncycastle.asn1.bc.EncryptedSecretKeyData;
import org.bouncycastle.asn1.bc.ObjectData;
import org.bouncycastle.asn1.bc.ObjectDataSequence;
import org.bouncycastle.asn1.bc.ObjectStore;
import org.bouncycastle.asn1.bc.ObjectStoreData;
import org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck;
import org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck;
import org.bouncycastle.asn1.bc.SecretKeyData;
import org.bouncycastle.asn1.cms.CCMParameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;
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
class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final BigInteger CERTIFICATE;
    private static final BigInteger PRIVATE_KEY;
    private static final BigInteger PROTECTED_PRIVATE_KEY;
    private static final BigInteger PROTECTED_SECRET_KEY;
    private static final BigInteger SECRET_KEY;
    private static final Map<String, ASN1ObjectIdentifier> oidMap;
    private static final Map<ASN1ObjectIdentifier, String> publicAlgMap;
    private Date creationDate;
    private AlgorithmIdentifier hmacAlgorithm;
    private KeyDerivationFunc hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private final BouncyCastleProvider provider;
    private final Map<String, ObjectData> entries = new HashMap();
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();

    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(null);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws Throwable {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
            super.engineStore(outputStream, cArr);
        }
    }

    private static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        ExtKeyStoreException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new BouncyCastleProvider());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws Throwable {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
            super.engineStore(outputStream, cArr);
        }
    }

    static {
        HashMap map = new HashMap();
        oidMap = map;
        HashMap map2 = new HashMap();
        publicAlgMap = map2;
        map.put("DESEDE", OIWObjectIdentifiers.desEDE);
        map.put("TRIPLEDES", OIWObjectIdentifiers.desEDE);
        map.put("TDEA", OIWObjectIdentifiers.desEDE);
        map.put("HMACSHA1", PKCSObjectIdentifiers.id_hmacWithSHA1);
        map.put("HMACSHA224", PKCSObjectIdentifiers.id_hmacWithSHA224);
        map.put("HMACSHA256", PKCSObjectIdentifiers.id_hmacWithSHA256);
        map.put("HMACSHA384", PKCSObjectIdentifiers.id_hmacWithSHA384);
        map.put("HMACSHA512", PKCSObjectIdentifiers.id_hmacWithSHA512);
        map2.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        map2.put(X9ObjectIdentifiers.id_ecPublicKey, "EC");
        map2.put(OIWObjectIdentifiers.elGamalAlgorithm, "DH");
        map2.put(PKCSObjectIdentifiers.dhKeyAgreement, "DH");
        map2.put(X9ObjectIdentifiers.id_dsa, "DSA");
        CERTIFICATE = BigInteger.valueOf(0L);
        PRIVATE_KEY = BigInteger.valueOf(1L);
        SECRET_KEY = BigInteger.valueOf(2L);
        PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3L);
        PROTECTED_SECRET_KEY = BigInteger.valueOf(4L);
    }

    BcFKSKeyStoreSpi(BouncyCastleProvider bouncyCastleProvider) {
        this.provider = bouncyCastleProvider;
    }

    private byte[] calculateMac(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, KeyDerivationFunc keyDerivationFunc, char[] cArr) throws NoSuchAlgorithmException, IOException {
        String id = algorithmIdentifier.getAlgorithm().getId();
        BouncyCastleProvider bouncyCastleProvider = this.provider;
        Mac mac = bouncyCastleProvider != null ? Mac.getInstance(id, bouncyCastleProvider) : Mac.getInstance(id);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            mac.init(new SecretKeySpec(generateKey(keyDerivationFunc, "INTEGRITY_CHECK", cArr), id));
            return mac.doFinal(bArr);
        } catch (InvalidKeyException e2) {
            throw new IOException("Cannot set up MAC calculation: " + e2.getMessage());
        }
    }

    private EncryptedPrivateKeyData createPrivateKeySequence(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, Certificate[] certificateArr) throws Throwable {
        org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[certificateArr.length];
        for (int i2 = 0; i2 != certificateArr.length; i2++) {
            Certificate certificate = certificateArr[i2];
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("q)x\u001c?Ea(\t6wK\u0017{kF\u0002DX&~L\u0019L\u0002W\u001a>\u001a[", (short) (FB.Xd() ^ 10824), (short) (FB.Xd() ^ 28016))).getMethod(ZO.xd("D?K\u0011\u001a\u0005\u000b\u000f\u0001c", (short) (C1499aX.Xd() ^ (-24054)), (short) (C1499aX.Xd() ^ (-14116))), new Class[0]);
            try {
                method.setAccessible(true);
                certificateArr2[i2] = org.bouncycastle.asn1.x509.Certificate.getInstance((byte[]) method.invoke(certificate, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return new EncryptedPrivateKeyData(encryptedPrivateKeyInfo, certificateArr2);
    }

    private Certificate decodeCertificate(Object obj) throws Throwable {
        BouncyCastleProvider bouncyCastleProvider = this.provider;
        String strUd = C1626yg.Ud("\u0010\u001cIz>", (short) (FB.Xd() ^ 18272), (short) (FB.Xd() ^ 30301));
        if (bouncyCastleProvider == null) {
            short sXd = (short) (FB.Xd() ^ 25137);
            int[] iArr = new int["\u0007~\u0015\u0001N\u0015\b\u0007\u001a\u0018\u0010\u001c\"W\u000e\u0011\u001f\"\\r\u0016$'\u001d\u001b\u001f\u001a\u0019-\u001f\u0001\u001d 2.2:".length()];
            QB qb = new QB("\u0007~\u0015\u0001N\u0015\b\u0007\u001a\u0018\u0010\u001c\"W\u000e\u0011\u001f\"\\r\u0016$'\u001d\u001b\u001f\u001a\u0019-\u001f\u0001\u001d 2.2:");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            try {
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Wg.vd("F>T@\u0006E;IK\u00139[RJPJ", (short) (Od.Xd() ^ (-28466))));
                Object[] objArr = {strUd};
                Method declaredMethod = cls.getDeclaredMethod(Qg.kd("\u0015\u0012 s\u0018\u001c\u001c\b\u0014\b\t", (short) (ZN.Xd() ^ 2185), (short) (ZN.Xd() ^ 19932)), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded());
                    Class<?> cls2 = Class.forName(hg.Vd("cYmW#gXUfbXbf\u001aNO[\\\u0015)JVWKGIB?QA!;<LFHN", (short) (Od.Xd() ^ (-7921)), (short) (Od.Xd() ^ (-29740))));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(C1561oA.ud("!\u0017+\u0015`\u001b ]w\u001c\u001d!\u001f|\u001d\u001a\f\u0007\u0012", (short) (OY.Xd() ^ 20051)));
                    Object[] objArr2 = {byteArrayInputStream};
                    Method method = cls2.getMethod(C1561oA.yd("LKQISCSE0S]`RPPK6J8", (short) (OY.Xd() ^ 15902)), clsArr2);
                    try {
                        method.setAccessible(true);
                        return (Certificate) method.invoke(certificateFactory, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Class<?> cls3 = Class.forName(Ig.wd("\u0015<M\u0012;\\lwW\"Bg\u001d_5Q\u0019!\u0013P/`|m'Vn7Xwt(Z\u0002\\*E", (short) (FB.Xd() ^ 13893)));
            Class<?>[] clsArr3 = new Class[2];
            clsArr3[0] = Class.forName(EO.Od(";\rc/#6?d ;V]*#(\b", (short) (OY.Xd() ^ 13111)));
            short sXd2 = (short) (FB.Xd() ^ 8891);
            int[] iArr2 = new int["}s\bq=\u0002ro\u0001|r|\u00014Uvrxjddp".length()];
            QB qb2 = new QB("}s\bq=\u0002ro\u0001|r|\u00014Uvrxjddp");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr3[1] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr3 = {strUd, bouncyCastleProvider};
            Method declaredMethod2 = cls3.getDeclaredMethod(C1593ug.zd("UTd:`fhVdZ]", (short) (C1499aX.Xd() ^ (-30346)), (short) (C1499aX.Xd() ^ (-10045))), clsArr3);
            try {
                declaredMethod2.setAccessible(true);
                CertificateFactory certificateFactory2 = (CertificateFactory) declaredMethod2.invoke(null, objArr3);
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded());
                Class<?> cls4 = Class.forName(C1561oA.od("{q\u0006o;\u007fpm~zpz~2fgst-Abnoc_aZWiY9STd^`f", (short) (C1607wl.Xd() ^ 19500)));
                Class<?>[] clsArr4 = new Class[1];
                clsArr4[0] = Class.forName(C1561oA.Kd(";3I5\u0003?F\u0006\"HKQQ1SRFCP", (short) (C1580rY.Xd() ^ (-19950))));
                Object[] objArr4 = {byteArrayInputStream2};
                Method method2 = cls4.getMethod(Wg.Zd("~\u001cTjHf\u0019Wd&\u0004%I\u00146_.`\u0001", (short) (ZN.Xd() ^ 11960), (short) (ZN.Xd() ^ 23525)), clsArr4);
                try {
                    method2.setAccessible(true);
                    return (Certificate) method2.invoke(certificateFactory2, objArr4);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private byte[] decryptData(String str, AlgorithmIdentifier algorithmIdentifier, char[] cArr, byte[] bArr) throws IOException {
        Cipher cipher;
        AlgorithmParameters algorithmParameters;
        if (!algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_PBES2)) {
            throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        EncryptionScheme encryptionScheme = pBES2Parameters.getEncryptionScheme();
        if (!encryptionScheme.getAlgorithm().equals(NISTObjectIdentifiers.id_aes256_CCM)) {
            throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
        }
        try {
            CCMParameters cCMParameters = CCMParameters.getInstance(encryptionScheme.getParameters());
            BouncyCastleProvider bouncyCastleProvider = this.provider;
            if (bouncyCastleProvider == null) {
                cipher = Cipher.getInstance("AES/CCM/NoPadding");
                algorithmParameters = AlgorithmParameters.getInstance("CCM");
            } else {
                cipher = Cipher.getInstance("AES/CCM/NoPadding", bouncyCastleProvider);
                algorithmParameters = AlgorithmParameters.getInstance("CCM", this.provider);
            }
            algorithmParameters.init(cCMParameters.getEncoded());
            KeyDerivationFunc keyDerivationFunc = pBES2Parameters.getKeyDerivationFunc();
            if (cArr == null) {
                cArr = new char[0];
            }
            cipher.init(2, new SecretKeySpec(generateKey(keyDerivationFunc, str, cArr), "AES"), algorithmParameters);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            throw new IOException(e2.toString());
        }
    }

    private Date extractCreationDate(ObjectData objectData, Date date) {
        try {
            return objectData.getCreationDate().getDate();
        } catch (ParseException unused) {
            return date;
        }
    }

    private byte[] generateKey(KeyDerivationFunc keyDerivationFunc, String str, char[] cArr) throws IOException {
        byte[] bArrPKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        byte[] bArrPKCS12PasswordToBytes2 = PBEParametersGenerator.PKCS12PasswordToBytes(str.toCharArray());
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA512Digest());
        if (!keyDerivationFunc.getAlgorithm().equals(PKCSObjectIdentifiers.id_PBKDF2)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
        if (!pBKDF2Params.getPrf().getAlgorithm().equals(PKCSObjectIdentifiers.id_hmacWithSHA512)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF.");
        }
        pKCS5S2ParametersGenerator.init(Arrays.concatenate(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(pBKDF2Params.getKeyLength().intValue() * 8)).getKey();
    }

    private KeyDerivationFunc generatePkbdAlgorithmIdentifier(int i2) throws Throwable {
        byte[] bArr = new byte[64];
        SecureRandom defaultSecureRandom = getDefaultSecureRandom();
        short sXd = (short) (Od.Xd() ^ (-28142));
        int[] iArr = new int["e]s_-sfexvnz\u00016\\on\u0002\u007fsaq\u007fv\u0003\u0002".length()];
        QB qb = new QB("e]s_-sfexvnz\u00016\\on\u0002\u007fsaq\u007fv\u0003\u0002");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        Object[] objArr = {bArr};
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Xg.qd("5-A>\rEA3B", (short) (C1580rY.Xd() ^ (-21823)), (short) (C1580rY.Xd() ^ (-14879))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(defaultSecureRandom, objArr);
            return new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr, 1024, i2, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private SecureRandom getDefaultSecureRandom() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Jg.Wd("\u001dI\u0016_d>jD\u0010\u0003Q\u001axa!oF\u000e\u0004Sy]#7zn", (short) (C1499aX.Xd() ^ (-18626)), (short) (C1499aX.Xd() ^ (-28725)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            return (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String getPublicKeyAlg(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = publicAlgMap.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    private void verifyMac(byte[] bArr, PbkdMacIntegrityCheck pbkdMacIntegrityCheck, char[] cArr) throws NoSuchAlgorithmException, IOException {
        if (!Arrays.constantTimeAreEqual(calculateMac(bArr, pbkdMacIntegrityCheck.getMacAlgorithm(), pbkdMacIntegrityCheck.getPbkdAlgorithm(), cArr), pbkdMacIntegrityCheck.getMac())) {
            throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed.");
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        final Iterator it = new HashSet(this.entries.keySet()).iterator();
        return new Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it.next();
            }
        };
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (str != null) {
            return this.entries.containsKey(str);
        }
        throw new NullPointerException("alias value is null");
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.entries.get(str) == null) {
            return;
        }
        this.privateKeyCache.remove(str);
        this.entries.remove(str);
        this.lastModifiedDate = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
            return decodeCertificate(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0]);
        }
        if (objectData.getType().equals(CERTIFICATE)) {
            return decodeCertificate(objectData.getData());
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) throws Throwable {
        if (certificate == null) {
            return null;
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("m _\u0010_\"bsWX*\u0001;\u0017$b\u0010jNxAo\u0005\u0015Hjef8w", (short) (ZN.Xd() ^ 28692), (short) (ZN.Xd() ^ 21))).getMethod(C1626yg.Ud("\u0018sg\u0003GD=3W\u0007", (short) (Od.Xd() ^ (-20953)), (short) (Od.Xd() ^ (-24388))), new Class[0]);
            try {
                method.setAccessible(true);
                byte[] bArr = (byte[]) method.invoke(certificate, objArr);
                for (String str : this.entries.keySet()) {
                    ObjectData objectData = this.entries.get(str);
                    if (objectData.getType().equals(CERTIFICATE)) {
                        if (Arrays.areEqual(objectData.getData(), bArr)) {
                            return str;
                        }
                    } else if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                        try {
                            if (Arrays.areEqual(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0].toASN1Primitive().getEncoded(), bArr)) {
                                return str;
                            }
                        } catch (IOException unused) {
                            continue;
                        }
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        if (!objectData.getType().equals(PRIVATE_KEY) && !objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
            return null;
        }
        org.bouncycastle.asn1.x509.Certificate[] certificateChain = EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain();
        int length = certificateChain.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i2 = 0; i2 != length; i2++) {
            x509CertificateArr[i2] = decodeCertificate(certificateChain[i2]);
        }
        return x509CertificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        try {
            return objectData.getLastModifiedDate().getDate();
        } catch (ParseException unused) {
            return new Date();
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        if (!objectData.getType().equals(PRIVATE_KEY) && !objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
            if (!objectData.getType().equals(SECRET_KEY) && !objectData.getType().equals(PROTECTED_SECRET_KEY)) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
            }
            EncryptedSecretKeyData encryptedSecretKeyData = EncryptedSecretKeyData.getInstance(objectData.getData());
            try {
                SecretKeyData secretKeyData = SecretKeyData.getInstance(decryptData("SECRET_KEY_ENCRYPTION", encryptedSecretKeyData.getKeyEncryptionAlgorithm(), cArr, encryptedSecretKeyData.getEncryptedKeyData()));
                return (this.provider != null ? SecretKeyFactory.getInstance(secretKeyData.getKeyAlgorithm().getId(), this.provider) : SecretKeyFactory.getInstance(secretKeyData.getKeyAlgorithm().getId())).generateSecret(new SecretKeySpec(secretKeyData.getKeyBytes(), secretKeyData.getKeyAlgorithm().getId()));
            } catch (Exception e2) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e2.getMessage());
            }
        }
        PrivateKey privateKey = this.privateKeyCache.get(str);
        if (privateKey != null) {
            return privateKey;
        }
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(EncryptedPrivateKeyData.getInstance(objectData.getData()).getEncryptedPrivateKeyInfo());
        try {
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(decryptData("PRIVATE_KEY_ENCRYPTION", encryptedPrivateKeyInfo.getEncryptionAlgorithm(), cArr, encryptedPrivateKeyInfo.getEncryptedData()));
            PrivateKey privateKeyGeneratePrivate = (this.provider != null ? KeyFactory.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().getId(), this.provider) : KeyFactory.getInstance(getPublicKeyAlg(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()))).generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
            this.privateKeyCache.put(str, privateKeyGeneratePrivate);
            return privateKeyGeneratePrivate;
        } catch (Exception e3) {
            throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e3.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            return objectData.getType().equals(CERTIFICATE);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return false;
        }
        BigInteger type = objectData.getType();
        return type.equals(PRIVATE_KEY) || type.equals(SECRET_KEY) || type.equals(PROTECTED_PRIVATE_KEY) || type.equals(PROTECTED_SECRET_KEY);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
        ObjectStoreData objectStoreData;
        this.entries.clear();
        this.privateKeyCache.clear();
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.hmacAlgorithm = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(64);
            return;
        }
        ObjectStore objectStore = ObjectStore.getInstance(new ASN1InputStream(inputStream).readObject());
        ObjectStoreIntegrityCheck integrityCheck = objectStore.getIntegrityCheck();
        if (integrityCheck.getType() != 0) {
            throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
        }
        PbkdMacIntegrityCheck pbkdMacIntegrityCheck = PbkdMacIntegrityCheck.getInstance(integrityCheck.getIntegrityCheck());
        this.hmacAlgorithm = pbkdMacIntegrityCheck.getMacAlgorithm();
        this.hmacPkbdAlgorithm = pbkdMacIntegrityCheck.getPbkdAlgorithm();
        verifyMac(objectStore.getStoreData().toASN1Primitive().getEncoded(), pbkdMacIntegrityCheck, cArr);
        ASN1Encodable storeData = objectStore.getStoreData();
        if (storeData instanceof EncryptedObjectStoreData) {
            EncryptedObjectStoreData encryptedObjectStoreData = (EncryptedObjectStoreData) storeData;
            objectStoreData = ObjectStoreData.getInstance(decryptData("STORE_ENCRYPTION", encryptedObjectStoreData.getEncryptionAlgorithm(), cArr, encryptedObjectStoreData.getEncryptedContent().getOctets()));
        } else {
            objectStoreData = ObjectStoreData.getInstance(storeData);
        }
        try {
            this.creationDate = objectStoreData.getCreationDate().getDate();
            this.lastModifiedDate = objectStoreData.getLastModifiedDate().getDate();
            if (!objectStoreData.getIntegrityAlgorithm().equals(this.hmacAlgorithm)) {
                throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
            }
            Iterator<ASN1Encodable> it = objectStoreData.getObjectDataSequence().iterator();
            while (it.hasNext()) {
                ObjectData objectData = ObjectData.getInstance(it.next());
                this.entries.put(objectData.getIdentifier(), objectData);
            }
        } catch (ParseException unused) {
            throw new IOException("BCFKS KeyStore unable to parse store data information.");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws Throwable {
        Date dateExtractCreationDate;
        ObjectData objectData = this.entries.get(str);
        Date date = new Date();
        if (objectData == null) {
            dateExtractCreationDate = date;
        } else {
            if (!objectData.getType().equals(CERTIFICATE)) {
                Object[] objArr = {Ig.wd("8\u000e\u001dG\u001d\r\"2gv\u00183gN;\u0004fT\r\u000fS2|CQ\u0016av50T\u0012\u001aG\u0017T@!J*\u0016\u00070wHi\u000e:<N", (short) (C1607wl.Xd() ^ 2459)) + str};
                Constructor<?> constructor = Class.forName(EO.Od(">\u0006\u001d/\u001c\u0007\\J\u0010@\u000e~RxuvO#\r_%t:q\u001ftb\u001b\u0002Z=", (short) (C1499aX.Xd() ^ (-15305)))).getConstructor(Class.forName(C1561oA.Qd("\u0018\u000e\"\fW\u0015\t\u0015\rRv\u0017\u0014\n\u000e\u0006", (short) (C1633zX.Xd() ^ (-8276)))));
                try {
                    constructor.setAccessible(true);
                    throw ((KeyStoreException) constructor.newInstance(objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            dateExtractCreationDate = extractCreationDate(objectData, date);
        }
        try {
            Map<String, ObjectData> map = this.entries;
            BigInteger bigInteger = CERTIFICATE;
            Class<?> cls = Class.forName(C1593ug.zd("\u001d\u0015+\u0017d+\u001e\u001d0.&28m$'58r\t,:=3150/C5", (short) (C1499aX.Xd() ^ (-9441)), (short) (C1499aX.Xd() ^ (-15764))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (FB.Xd() ^ 9014);
            int[] iArr = new int["+(6\u0006.\"-!!\u001f".length()];
            QB qb = new QB("+(6\u0006.\"-!!\u001f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                map.put(str, new ObjectData(bigInteger, str, dateExtractCreationDate, date, (byte[]) method.invoke(certificate, objArr2), null));
                this.lastModifiedDate = date;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (CertificateEncodingException e4) {
            short sXd2 = (short) (C1580rY.Xd() ^ (-30432));
            int[] iArr2 = new int["RTX^g5a|\u0012l\u000f\u000b\u000f\u0003>\u0015\u000f\u0003\u0005\u0010\nE\u001b\u0017H\u0012\f\u001a\u0011\u001a\u0014O\u0014\u0017%(\u001e\u001c \u001b\u001a. u\\".length()];
            QB qb2 = new QB("RTX^g5a|\u0012l\u000f\u000b\u000f\u0003>\u0015\u000f\u0003\u0005\u0010\nE\u001b\u0017H\u0012\f\u001a\u0011\u001a\u0014O\u0014\u0017%(\u001e\u001c \u001b\u001a. u\\");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            throw new ExtKeyStoreException(new String(iArr2, 0, i3) + e4.getMessage(), e4);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
        byte[] bArrDoFinal;
        char[] cArr2 = cArr;
        short sXd = (short) (FB.Xd() ^ 18747);
        short sXd2 = (short) (FB.Xd() ^ 32293);
        int[] iArr = new int["m6\u001aV=Q=/a\u0003\u00057\u0019[NP\u0006c;zWS]\u000fL!x6\u0011js\u0006\u001aS0~J\tj\u0016H,)p".length()];
        QB qb = new QB("m6\u001aV=Q=/a\u0003\u00057\u0019[NP\u0006c;zWS]\u000fL!x6\u0011js\u0006\u001aS0~J\tj\u0016H,)p");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        Date date = new Date();
        ObjectData objectData = this.entries.get(str);
        Date dateExtractCreationDate = objectData != null ? extractCreationDate(objectData, date) : date;
        this.privateKeyCache.remove(str);
        boolean z2 = key instanceof PrivateKey;
        short sXd3 = (short) (C1499aX.Xd() ^ (-31271));
        int[] iArr2 = new int["248>G\u0015A\\qLnjnb\u001edxdgsxnuu(|~z~v|v0\u0002\u0005|\u000bv\u000b|8\u0005\u007f\u0015V=".length()];
        QB qb2 = new QB("248>G\u0015A\\qLnjnb\u001edxdgsxnuu(|~z~v|v0\u0002\u0005|\u000bv\u000b|8\u0005\u007f\u0015V=");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        String str3 = new String(iArr2, 0, i3);
        short sXd4 = (short) (C1499aX.Xd() ^ (-921));
        int[] iArr3 = new int["kp\u007f".length()];
        QB qb3 = new QB("kp\u007f");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
            i4++;
        }
        String str4 = new String(iArr3, 0, i4);
        String strKd = Qg.kd("EHU0CBK,JjJZ\\[_c[", (short) (OY.Xd() ^ 16272), (short) (OY.Xd() ^ 32405));
        if (z2) {
            if (certificateArr == null) {
                Object[] objArr = {C1561oA.ud("{{}\u0002\tT~\u0018+\u0004$\u001e \u0012K\u001d\u000f\u001a\u001d\u0010\u0018\n\u0017B\u0003@\u0003\u0004\u0010\u0011\u0005\u0001\u0003{x\u000bz4vzry}.s{}*yzp|fxh\"lex\u001eppjlZ_\\$", (short) (C1499aX.Xd() ^ (-4428)))};
                Constructor<?> constructor = Class.forName(C1561oA.yd("!\u0019+\u0017`'\u0016\u001542&24i\u0004\u001f@\u001b955)\u0006:25=B4;7", (short) (ZN.Xd() ^ 31062))).getConstructor(Class.forName(C1561oA.Yd("og}i7vlzt<b\u0005\u0004{\u0002{", (short) (OY.Xd() ^ 5892))));
                try {
                    constructor.setAccessible(true);
                    throw ((KeyStoreException) constructor.newInstance(objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            try {
                byte[] encoded = key.getEncoded();
                KeyDerivationFunc keyDerivationFuncGeneratePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(32);
                String strVd = hg.Vd("\u0011\u0012\b\u0014}\u0010\u007f\u0019\u0004|\u0010\u0015y\u0002u\u0004\n\u007f\u0003v{y", (short) (C1607wl.Xd() ^ 14713), (short) (C1607wl.Xd() ^ 10760));
                if (cArr2 == null) {
                    cArr2 = new char[0];
                }
                byte[] bArrGenerateKey = generateKey(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, strVd, cArr2);
                BouncyCastleProvider bouncyCastleProvider = this.provider;
                Cipher cipher = bouncyCastleProvider == null ? Cipher.getInstance(strKd) : Cipher.getInstance(strKd, bouncyCastleProvider);
                cipher.init(1, new SecretKeySpec(bArrGenerateKey, str4));
                this.entries.put(str, new ObjectData(PRIVATE_KEY, str, dateExtractCreationDate, date, createPrivateKeySequence(new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_CCM, CCMParameters.getInstance(cipher.getParameters().getEncoded())))), cipher.doFinal(encoded)), certificateArr).getEncoded(), null));
            } catch (Exception e3) {
                throw new ExtKeyStoreException(str3 + e3.toString(), e3);
            }
        } else {
            if (!(key instanceof SecretKey)) {
                String strZd = C1593ug.zd("\u001c\u001e\"(1~+F[6XTXL\b^XLNYS\u000fd`\u0012eYXe^fbt`\u001chcx.", (short) (Od.Xd() ^ (-9707)), (short) (Od.Xd() ^ (-22059)));
                Class<?> cls = Class.forName(C1561oA.od("dZnX$hYVgcYcg\u001b7Pc<\\VXJ)[EFPSGLJ", (short) (OY.Xd() ^ 15094)));
                Class<?>[] clsArr = new Class[1];
                short sXd5 = (short) (OY.Xd() ^ 30569);
                int[] iArr4 = new int["nf|h6ukys;a\u0004\u0003z\u0001z".length()];
                QB qb4 = new QB("nf|h6ukys;a\u0004\u0003z\u0001z");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
                    i5++;
                }
                clsArr[0] = Class.forName(new String(iArr4, 0, i5));
                Object[] objArr2 = {strZd};
                Constructor<?> constructor2 = cls.getConstructor(clsArr);
                try {
                    constructor2.setAccessible(true);
                    throw ((KeyStoreException) constructor2.newInstance(objArr2));
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
            if (certificateArr != null) {
                Object[] objArr3 = {Ig.wd("Z\u000b>\\s\u001c\u001d\rjQn\u0012*%]\u00056Ot\u007fN\u001fRMB\u0013eOvhK3\u000efq\u001f~wg\u0012[F\rx~<>\u0006\u001f+\u001c\u0012g^\u00121B\u0010\f{\b^", (short) (FB.Xd() ^ 3687))};
                Constructor<?> constructor3 = Class.forName(EO.Od("Ca+;\u00125\u0001H6D;b7w\u001bT\u000e\u007fZk*ZV\u0010&R\u00012_xB", (short) (C1580rY.Xd() ^ (-29840)))).getConstructor(Class.forName(C1561oA.Qd("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012\u000f\u0005\t\u0001", (short) (FB.Xd() ^ 21787))));
                try {
                    constructor3.setAccessible(true);
                    throw ((KeyStoreException) constructor3.newInstance(objArr3));
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            try {
                byte[] encoded2 = key.getEncoded();
                KeyDerivationFunc keyDerivationFuncGeneratePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(32);
                String strQd = Xg.qd("\"\u0015\u0014$\u0018(4!\u001c18\u001f)\u001f/7/4*11", (short) (Od.Xd() ^ (-19755)), (short) (Od.Xd() ^ (-16898)));
                if (cArr2 == null) {
                    cArr2 = new char[0];
                }
                byte[] bArrGenerateKey2 = generateKey(keyDerivationFuncGeneratePkbdAlgorithmIdentifier2, strQd, cArr2);
                BouncyCastleProvider bouncyCastleProvider2 = this.provider;
                Cipher cipher2 = bouncyCastleProvider2 == null ? Cipher.getInstance(strKd) : Cipher.getInstance(strKd, bouncyCastleProvider2);
                cipher2.init(1, new SecretKeySpec(bArrGenerateKey2, str4));
                String upperCase = Strings.toUpperCase(key.getAlgorithm());
                if (upperCase.indexOf(str4) > -1) {
                    bArrDoFinal = cipher2.doFinal(new SecretKeyData(NISTObjectIdentifiers.aes, encoded2).getEncoded());
                } else {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = oidMap.get(upperCase);
                    if (aSN1ObjectIdentifier == null) {
                        String str5 = str2 + upperCase + Jg.Wd("\u00041F\u001ezV\u0019k=n0$xs", (short) (C1633zX.Xd() ^ (-570)), (short) (C1633zX.Xd() ^ (-19785)));
                        Class<?> cls2 = Class.forName(ZO.xd("^\u0011\u0018 Hm7/.\u001b\u0018\u0018zO\b\u0017%\u0017\":JulP\fMOwDqE", (short) (C1499aX.Xd() ^ (-14759)), (short) (C1499aX.Xd() ^ (-26847))));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[0] = Class.forName(C1626yg.Ud("2\u0019\u001e['zM\u001c\u000367\u0016!W9\u0018", (short) (Od.Xd() ^ (-11686)), (short) (Od.Xd() ^ (-1742))));
                        Object[] objArr4 = {str5};
                        Constructor<?> constructor4 = cls2.getConstructor(clsArr2);
                        try {
                            constructor4.setAccessible(true);
                            throw ((KeyStoreException) constructor4.newInstance(objArr4));
                        } catch (InvocationTargetException e6) {
                            throw e6.getCause();
                        }
                    }
                    bArrDoFinal = cipher2.doFinal(new SecretKeyData(aSN1ObjectIdentifier, encoded2).getEncoded());
                }
                this.entries.put(str, new ObjectData(SECRET_KEY, str, dateExtractCreationDate, date, new EncryptedSecretKeyData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier2, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_CCM, CCMParameters.getInstance(cipher2.getParameters().getEncoded())))), bArrDoFinal).getEncoded(), null));
            } catch (Exception e7) {
                throw new ExtKeyStoreException(str3 + e7.toString(), e7);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        Date date = new Date();
        ObjectData objectData = this.entries.get(str);
        Date dateExtractCreationDate = objectData != null ? extractCreationDate(objectData, date) : date;
        if (certificateArr != null) {
            try {
                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    date = date;
                    this.entries.put(str, new ObjectData(PROTECTED_PRIVATE_KEY, str, dateExtractCreationDate, date, createPrivateKeySequence(encryptedPrivateKeyInfo, certificateArr).getEncoded(), null));
                } catch (Exception e2) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e2.toString(), e2);
                }
            } catch (Exception e3) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e3);
            }
        } else {
            try {
                this.entries.put(str, new ObjectData(PROTECTED_SECRET_KEY, str, dateExtractCreationDate, date, bArr, null));
            } catch (Exception e4) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e4.toString(), e4);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
        ObjectData[] objectDataArr = (ObjectData[]) this.entries.values().toArray(new ObjectData[this.entries.size()]);
        KeyDerivationFunc keyDerivationFuncGeneratePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(32);
        byte[] bArrGenerateKey = generateKey(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, Wg.Zd("\u0007!*;{k_z-J'k}\u0005X-", (short) (C1580rY.Xd() ^ (-26106)), (short) (C1580rY.Xd() ^ (-32648))), cArr != null ? cArr : new char[0]);
        ObjectStoreData objectStoreData = new ObjectStoreData(this.hmacAlgorithm, this.creationDate, this.lastModifiedDate, new ObjectDataSequence(objectDataArr), null);
        try {
            BouncyCastleProvider bouncyCastleProvider = this.provider;
            String strXd = C1561oA.Xd("\u0003\b\u0017s\t\n\u0015w\u0018:\u001c.239?9", (short) (ZN.Xd() ^ 19881));
            Cipher cipher = bouncyCastleProvider == null ? Cipher.getInstance(strXd) : Cipher.getInstance(strXd, bouncyCastleProvider);
            cipher.init(1, new SecretKeySpec(bArrGenerateKey, Wg.vd("\b\r\u0018", (short) (OY.Xd() ^ 13097))));
            EncryptedObjectStoreData encryptedObjectStoreData = new EncryptedObjectStoreData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncGeneratePkbdAlgorithmIdentifier, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_CCM, CCMParameters.getInstance(cipher.getParameters().getEncoded())))), cipher.doFinal(objectStoreData.getEncoded()));
            PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(this.hmacPkbdAlgorithm.getParameters());
            byte[] bArr = new byte[pBKDF2Params.getSalt().length];
            SecureRandom defaultSecureRandom = getDefaultSecureRandom();
            short sXd = (short) (ZN.Xd() ^ 28389);
            short sXd2 = (short) (ZN.Xd() ^ 23027);
            int[] iArr = new int["\u0007|\u0011zF\u000b{x\n\u0006{\u0006\n=aro\u0001|nZhtisp".length()];
            QB qb = new QB("\u0007|\u0011zF\u000b{x\n\u0006{\u0006\n=aro\u0001|nZhtisp");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr = {bArr};
            short sXd3 = (short) (C1633zX.Xd() ^ (-30998));
            short sXd4 = (short) (C1633zX.Xd() ^ (-28982));
            int[] iArr2 = new int["g]oj7mgWd".length()];
            QB qb2 = new QB("g]oj7mgWd");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(defaultSecureRandom, objArr);
                this.hmacPkbdAlgorithm = new KeyDerivationFunc(this.hmacPkbdAlgorithm.getAlgorithm(), new PBKDF2Params(bArr, pBKDF2Params.getIterationCount().intValue(), pBKDF2Params.getKeyLength().intValue(), pBKDF2Params.getPrf()));
                outputStream.write(new ObjectStore(encryptedObjectStoreData, new ObjectStoreIntegrityCheck(new PbkdMacIntegrityCheck(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)))).getEncoded());
                outputStream.flush();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvalidKeyException e3) {
            throw new IOException(e3.toString());
        } catch (BadPaddingException e4) {
            throw new IOException(e4.toString());
        } catch (IllegalBlockSizeException e5) {
            throw new IOException(e5.toString());
        } catch (NoSuchPaddingException e6) {
            throw new NoSuchAlgorithmException(e6.toString());
        }
    }
}
