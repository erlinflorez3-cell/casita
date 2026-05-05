package org.spongycastle.jcajce.provider.keystore.bc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.generators.PKCS12ParametersGenerator;
import org.spongycastle.crypto.io.DigestInputStream;
import org.spongycastle.crypto.io.DigestOutputStream;
import org.spongycastle.crypto.io.MacInputStream;
import org.spongycastle.crypto.io.MacOutputStream;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.interfaces.BCKeyStore;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.Streams;
import org.spongycastle.util.io.TeeOutputStream;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class BcKeyStoreSpi extends KeyStoreSpi implements BCKeyStore {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    private static final String KEY_CIPHER = "PBEWithSHAAnd3-KeyTripleDES-CBC";
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    private static final int KEY_SALT_SIZE = 20;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final String STORE_CIPHER = "PBEWithSHAAndTwofish-CBC";
    private static final int STORE_SALT_SIZE = 20;
    private static final int STORE_VERSION = 2;
    private final JcaJceHelper helper;
    protected SecureRandom random;
    protected Hashtable table = new Hashtable();
    protected int version;

    public static class BouncyCastleStore extends BcKeyStoreSpi {
        public BouncyCastleStore() {
            super(1);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            this.table.clear();
            if (inputStream == null) {
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int i2 = dataInputStream.readInt();
            if (i2 != 2 && i2 != 0 && i2 != 1) {
                throw new IOException("Wrong version of key store.");
            }
            int i3 = dataInputStream.readInt();
            byte[] bArr = new byte[i3];
            if (i3 != 20) {
                throw new IOException("Key store corrupted.");
            }
            dataInputStream.readFully(bArr);
            int i4 = dataInputStream.readInt();
            if (i4 < 0 || i4 > 4096) {
                throw new IOException("Key store corrupted.");
            }
            CipherInputStream cipherInputStream = new CipherInputStream(dataInputStream, makePBECipher(i2 == 0 ? "OldPBEWithSHAAndTwofish-CBC" : BcKeyStoreSpi.STORE_CIPHER, 2, cArr, bArr, i4));
            SHA1Digest sHA1Digest = new SHA1Digest();
            loadStore(new DigestInputStream(cipherInputStream, sHA1Digest));
            byte[] bArr2 = new byte[sHA1Digest.getDigestSize()];
            sHA1Digest.doFinal(bArr2, 0);
            byte[] bArr3 = new byte[sHA1Digest.getDigestSize()];
            Streams.readFully(cipherInputStream, bArr3);
            if (Arrays.constantTimeAreEqual(bArr2, bArr3)) {
                return;
            }
            this.table.clear();
            throw new IOException("KeyStore integrity check failed.");
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            byte[] bArr = new byte[20];
            int iNextInt = ((-1) - (((-1) - this.random.nextInt()) | ((-1) - 1023))) + 1024;
            SecureRandom secureRandom = this.random;
            Class<?> cls = Class.forName(C1626yg.Ud("8`W>$PtF)p<dW3l\u00106\t>\\1S\u001fBZZ", (short) (C1580rY.Xd() ^ (-25527)), (short) (C1580rY.Xd() ^ (-32723))));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr = {bArr};
            short sXd = (short) (C1580rY.Xd() ^ (-10415));
            int[] iArr = new int["\u0019GL%ZTwhG".length()];
            QB qb = new QB("\u0019GL%ZTwhG");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                dataOutputStream.writeInt(this.version);
                dataOutputStream.writeInt(20);
                dataOutputStream.write(bArr);
                dataOutputStream.writeInt(iNextInt);
                CipherOutputStream cipherOutputStream = new CipherOutputStream(dataOutputStream, makePBECipher(EO.Od("\u0018;0\u001e`I]G\u0018`^m3-8\u000e*K\r}}K,)", (short) (C1499aX.Xd() ^ (-19027))), 1, cArr, bArr, iNextInt));
                DigestOutputStream digestOutputStream = new DigestOutputStream(new SHA1Digest());
                saveStore(new TeeOutputStream(cipherOutputStream, digestOutputStream));
                cipherOutputStream.write(digestOutputStream.getDigest());
                cipherOutputStream.close();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public static class Std extends BcKeyStoreSpi {
        public Std() {
            super(2);
        }
    }

    private class StoreEntry {
        String alias;
        Certificate[] certChain;
        Date date;
        Object obj;
        int type;

        StoreEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Exception {
            this.date = new Date();
            this.type = 4;
            this.alias = str;
            this.certChain = certificateArr;
            byte[] bArr = new byte[20];
            SecureRandom secureRandom = BcKeyStoreSpi.this.random;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Class<?> cls = Class.forName(C1561oA.Qd("xn\u0003l8|mj{wmw{/Sdarn`LZf[eb", (short) (C1499aX.Xd() ^ (-32564))));
            Class<?>[] clsArr = {Long.TYPE};
            Object[] objArr = {Long.valueOf(jCurrentTimeMillis)};
            Method method = cls.getMethod(C1593ug.zd("\u000f\u0002\u0012q\u0005\u0006\u0006", (short) (C1580rY.Xd() ^ (-2796)), (short) (C1580rY.Xd() ^ (-14612))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                SecureRandom secureRandom2 = BcKeyStoreSpi.this.random;
                Class<?> cls2 = Class.forName(C1561oA.od(".$8\"m2# 1-#-1d\t\u001a\u0017($\u0016\u0002\u0010\u001c\u0011\u001b\u0018", (short) (C1499aX.Xd() ^ (-14313))));
                Class<?>[] clsArr2 = {byte[].class};
                Object[] objArr2 = {bArr};
                short sXd = (short) (C1580rY.Xd() ^ (-20044));
                int[] iArr = new int["\u0005|\u0011\u000e\\\u0015\u0011\u0003\u0012".length()];
                QB qb = new QB("\u0005|\u0011\u000e\\\u0015\u0011\u0003\u0012");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                Method method2 = cls2.getMethod(new String(iArr, 0, i2), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(secureRandom2, objArr2);
                    int iNextInt = BcKeyStoreSpi.this.random.nextInt();
                    int i3 = ((iNextInt + 1023) - (iNextInt | 1023)) + 1024;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(20);
                    dataOutputStream.write(bArr);
                    dataOutputStream.writeInt(i3);
                    short sXd2 = (short) (ZN.Xd() ^ 5307);
                    short sXd3 = (short) (ZN.Xd() ^ 13540);
                    int[] iArr2 = new int["0\"dvJ\u0015\t1e^ M\u0003\u000f\tfBVp\u000fC\n\u0006@^_3\\b\u0013$".length()];
                    QB qb2 = new QB("0\"dvJ\u0015\t1e^ M\u0003\u000f\tfBVp\u000fC\n\u0006@^_3\\b\u0013$");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                        i4++;
                    }
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, BcKeyStoreSpi.this.makePBECipher(new String(iArr2, 0, i4), 1, cArr, bArr, i3)));
                    BcKeyStoreSpi.this.encodeKey(key, dataOutputStream2);
                    dataOutputStream2.close();
                    this.obj = byteArrayOutputStream.toByteArray();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        StoreEntry(String str, Certificate certificate) {
            this.date = new Date();
            this.type = 1;
            this.alias = str;
            this.obj = certificate;
            this.certChain = null;
        }

        StoreEntry(String str, Date date, int i2, Object obj) {
            new Date();
            this.alias = str;
            this.date = date;
            this.type = i2;
            this.obj = obj;
        }

        StoreEntry(String str, Date date, int i2, Object obj, Certificate[] certificateArr) {
            new Date();
            this.alias = str;
            this.date = date;
            this.type = i2;
            this.obj = obj;
            this.certChain = certificateArr;
        }

        StoreEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            this.date = new Date();
            this.type = 3;
            this.alias = str;
            this.obj = bArr;
            this.certChain = certificateArr;
        }

        String getAlias() {
            return this.alias;
        }

        Certificate[] getCertificateChain() {
            return this.certChain;
        }

        Date getDate() {
            return this.date;
        }

        Object getObject() {
            return this.obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.security.Key] */
        Object getObject(char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException {
            Key keyDecodeKey;
            String strDecodeKey = "no match";
            if (cArr == null || cArr.length == 0) {
                Object obj = this.obj;
                if (obj instanceof Key) {
                    return obj;
                }
            }
            if (this.type != 4) {
                throw new RuntimeException("forget something!");
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) this.obj));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                try {
                    strDecodeKey = BcKeyStoreSpi.this.decodeKey(new DataInputStream(new CipherInputStream(dataInputStream, BcKeyStoreSpi.this.makePBECipher(BcKeyStoreSpi.KEY_CIPHER, 2, cArr, bArr, dataInputStream.readInt()))));
                    return strDecodeKey;
                } catch (Exception unused) {
                    DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) this.obj));
                    byte[] bArr2 = new byte[dataInputStream2.readInt()];
                    dataInputStream2.readFully(bArr2);
                    int i2 = dataInputStream2.readInt();
                    try {
                        keyDecodeKey = BcKeyStoreSpi.this.decodeKey(new DataInputStream(new CipherInputStream(dataInputStream2, BcKeyStoreSpi.this.makePBECipher("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, i2))));
                    } catch (Exception unused2) {
                        DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) this.obj));
                        bArr2 = new byte[dataInputStream3.readInt()];
                        dataInputStream3.readFully(bArr2);
                        i2 = dataInputStream3.readInt();
                        keyDecodeKey = BcKeyStoreSpi.this.decodeKey(new DataInputStream(new CipherInputStream(dataInputStream3, BcKeyStoreSpi.this.makePBECipher("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, i2))));
                    }
                    if (keyDecodeKey == null) {
                        throw new UnrecoverableKeyException(strDecodeKey);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(bArr2.length);
                    dataOutputStream.write(bArr2);
                    dataOutputStream.writeInt(i2);
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, BcKeyStoreSpi.this.makePBECipher(BcKeyStoreSpi.KEY_CIPHER, 1, cArr, bArr2, i2)));
                    BcKeyStoreSpi.this.encodeKey(keyDecodeKey, dataOutputStream2);
                    dataOutputStream2.close();
                    this.obj = byteArrayOutputStream.toByteArray();
                    return keyDecodeKey;
                }
            } catch (Exception unused3) {
                throw new UnrecoverableKeyException(strDecodeKey);
            }
        }

        int getType() {
            return this.type;
        }
    }

    public static class Version1 extends BcKeyStoreSpi {
        public Version1() {
            super(1);
        }
    }

    public BcKeyStoreSpi(int i2) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-14657));
        int[] iArr = new int["YOcM\u0019]NK\\XNX\\\u00104EBSOA-;G<FC".length()];
        QB qb = new QB("YOcM\u0019]NK\\XNX\\\u00104EBSOA-;G<FC");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i3)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.helper = new BCJcaJceHelper();
            this.version = i2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Certificate decodeCertificate(DataInputStream dataInputStream) throws Throwable {
        String utf = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        try {
            CertificateFactory certificateFactoryCreateCertificateFactory = this.helper.createCertificateFactory(utf);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Class<?> cls = Class.forName(C1561oA.yd("si\u0002k;\u007ftq\u0007\u0003|\u0007\u000fBz{kl)=bnsggifcyiMgL\\Z\\f", (short) (OY.Xd() ^ 793)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Yd("\u000e\u0006\u001c\bU\u0012\u0019Xt\u001b\u001e$$\u0004&%\u0019\u0016#", (short) (C1499aX.Xd() ^ (-1017))));
            Object[] objArr = {byteArrayInputStream};
            short sXd = (short) (ZN.Xd() ^ 12867);
            short sXd2 = (short) (ZN.Xd() ^ 2743);
            int[] iArr = new int["\u0004\u0003\r\u0005\u0013\u0003\u0017\tg\u000b\u0019\u001c\u0012\u0010\u0014\u000f\u000e\"\u0014".length()];
            QB qb = new QB("\u0004\u0003\r\u0005\u0013\u0003\u0017\tg\u000b\u0019\u001c\u0012\u0010\u0014\u000f\u000e\"\u0014");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                return (Certificate) method.invoke(certificateFactoryCreateCertificateFactory, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (NoSuchProviderException e3) {
            throw new IOException(e3.toString());
        } catch (CertificateException e4) {
            throw new IOException(e4.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Key decodeKey(DataInputStream dataInputStream) throws IOException {
        KeySpec pKCS8EncodedKeySpec;
        int i2 = dataInputStream.read();
        String utf = dataInputStream.readUTF();
        String utf2 = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        if (utf.equals("PKCS#8") || utf.equals("PKCS8")) {
            pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        } else {
            if (!utf.equals("X.509") && !utf.equals("X509")) {
                if (utf.equals("RAW")) {
                    return new SecretKeySpec(bArr, utf2);
                }
                throw new IOException("Key format " + utf + " not recognised!");
            }
            pKCS8EncodedKeySpec = new X509EncodedKeySpec(bArr);
        }
        try {
            if (i2 == 0) {
                return this.helper.createKeyFactory(utf2).generatePrivate(pKCS8EncodedKeySpec);
            }
            if (i2 == 1) {
                return this.helper.createKeyFactory(utf2).generatePublic(pKCS8EncodedKeySpec);
            }
            if (i2 == 2) {
                return this.helper.createSecretKeyFactory(utf2).generateSecret(pKCS8EncodedKeySpec);
            }
            throw new IOException("Key type " + i2 + " not recognised!");
        } catch (Exception e2) {
            throw new IOException("Exception creating key: " + e2.toString());
        }
    }

    private void encodeCertificate(Certificate certificate, DataOutputStream dataOutputStream) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("a.\t);H\u0010S+_\u001clGA>uH\u0010!{c&o*|E\u0005:\u0013Y", (short) (OY.Xd() ^ 13078), (short) (OY.Xd() ^ 18038))).getMethod(ZO.xd(":8\u001d(t6gY.H", (short) (ZN.Xd() ^ 165), (short) (ZN.Xd() ^ 14010)), new Class[0]);
            try {
                method.setAccessible(true);
                byte[] bArr = (byte[]) method.invoke(certificate, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1626yg.Ud("\rkW%xiE\u007f!x\u0001>\u0003\u001f\"\u000ej\u000f@:Gxs\f\u0014-5\u001a\u0017y", (short) (ZN.Xd() ^ 16899), (short) (ZN.Xd() ^ 25158))).getMethod(Ig.wd("o\u001e\u001d^1k\u000f", (short) (FB.Xd() ^ 9283)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    dataOutputStream.writeUTF((String) method2.invoke(certificate, objArr2));
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(bArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (CertificateEncodingException e4) {
            throw new IOException(e4.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void encodeKey(Key key, DataOutputStream dataOutputStream) throws IOException {
        byte[] encoded = key.getEncoded();
        if (key instanceof PrivateKey) {
            dataOutputStream.write(0);
        } else if (key instanceof PublicKey) {
            dataOutputStream.write(1);
        } else {
            dataOutputStream.write(2);
        }
        dataOutputStream.writeUTF(key.getFormat());
        dataOutputStream.writeUTF(key.getAlgorithm());
        dataOutputStream.writeInt(encoded.length);
        dataOutputStream.write(encoded);
    }

    static Provider getBouncyCastleProvider() {
        return Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) != null ? Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) : new BouncyCastleProvider();
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        return this.table.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return this.table.get(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.table.get(str) == null) {
            return;
        }
        this.table.remove(str);
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry == null) {
            return null;
        }
        if (storeEntry.getType() == 1) {
            return (Certificate) storeEntry.getObject();
        }
        Certificate[] certificateChain = storeEntry.getCertificateChain();
        if (certificateChain != null) {
            return certificateChain[0];
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) throws Throwable {
        Enumeration enumerationElements = this.table.elements();
        while (enumerationElements.hasMoreElements()) {
            StoreEntry storeEntry = (StoreEntry) enumerationElements.nextElement();
            if (storeEntry.getObject() instanceof Certificate) {
                Certificate certificate2 = (Certificate) storeEntry.getObject();
                Class<?> cls = Class.forName(EO.Od("#hM\u001f='Ck4$\u001f\u0002q\u001e5S-#7\"zb\u0005\u007f\u0003\u00182\u000101", (short) (Od.Xd() ^ (-30465))));
                Class<?>[] clsArr = {Class.forName(C1561oA.Qd("\u0015\u000b\u001f\tT\u0012\u0006\u0012\nOo\u0002\t\u0003\u007f\u0010", (short) (C1607wl.Xd() ^ 20079)))};
                Object[] objArr = {certificate};
                short sXd = (short) (OY.Xd() ^ 2146);
                short sXd2 = (short) (OY.Xd() ^ 11860);
                int[] iArr = new int["z\b\ry\u0006\u000e".length()];
                QB qb = new QB("z\b\ry\u0006\u000e");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    if (((Boolean) method.invoke(certificate2, objArr)).booleanValue()) {
                        return storeEntry.getAlias();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                Certificate[] certificateChain = storeEntry.getCertificateChain();
                if (certificateChain != null) {
                    Certificate certificate3 = certificateChain[0];
                    Object[] objArr2 = {certificate};
                    Method method2 = Class.forName(C1561oA.od("\b}\u0012{G\f|y\u000b\u0007|\u0007\u000b>rs\u007f\u00019Mnz{okmfcue", (short) (C1633zX.Xd() ^ (-8983)))).getMethod(Wg.Zd("-\u0019\rcZJ", (short) (FB.Xd() ^ 14910), (short) (FB.Xd() ^ 8349)), Class.forName(C1561oA.Kd("c[q]+j`nh0Rfokj|", (short) (Od.Xd() ^ (-23655)))));
                    try {
                        method2.setAccessible(true);
                        if (((Boolean) method2.invoke(certificate3, objArr2)).booleanValue()) {
                            return storeEntry.getAlias();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null) {
            return storeEntry.getCertificateChain();
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry != null) {
            return storeEntry.getDate();
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry == null || storeEntry.getType() == 1) {
            return null;
        }
        return (Key) storeEntry.getObject(cArr);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        return storeEntry != null && storeEntry.getType() == 1;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        return (storeEntry == null || storeEntry.getType() == 1) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws Throwable {
        this.table.clear();
        if (inputStream == null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int i2 = dataInputStream.readInt();
        if (i2 != 2 && i2 != 0 && i2 != 1) {
            throw new IOException("Wrong version of key store.");
        }
        int i3 = dataInputStream.readInt();
        if (i3 <= 0) {
            throw new IOException("Invalid salt detected");
        }
        byte[] bArr = new byte[i3];
        dataInputStream.readFully(bArr);
        int i4 = dataInputStream.readInt();
        HMac hMac = new HMac(new SHA1Digest());
        if (cArr == null || cArr.length == 0) {
            loadStore(dataInputStream);
            dataInputStream.readFully(new byte[hMac.getMacSize()]);
            return;
        }
        byte[] bArrPKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        PKCS12ParametersGenerator pKCS12ParametersGenerator = new PKCS12ParametersGenerator(new SHA1Digest());
        pKCS12ParametersGenerator.init(bArrPKCS12PasswordToBytes, bArr, i4);
        CipherParameters cipherParametersGenerateDerivedMacParameters = i2 != 2 ? pKCS12ParametersGenerator.generateDerivedMacParameters(hMac.getMacSize()) : pKCS12ParametersGenerator.generateDerivedMacParameters(hMac.getMacSize() * 8);
        Arrays.fill(bArrPKCS12PasswordToBytes, (byte) 0);
        hMac.init(cipherParametersGenerateDerivedMacParameters);
        loadStore(new MacInputStream(dataInputStream, hMac));
        byte[] bArr2 = new byte[hMac.getMacSize()];
        hMac.doFinal(bArr2, 0);
        byte[] bArr3 = new byte[hMac.getMacSize()];
        dataInputStream.readFully(bArr3);
        if (Arrays.constantTimeAreEqual(bArr2, bArr3)) {
            return;
        }
        this.table.clear();
        throw new IOException("KeyStore integrity check failed.");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws Throwable {
        StoreEntry storeEntry = (StoreEntry) this.table.get(str);
        if (storeEntry == null || storeEntry.getType() == 1) {
            this.table.put(str, new StoreEntry(str, certificate));
            return;
        }
        Object[] objArr = {C1561oA.Xd("A<QxMOKOC~AMTHEI_\u0007PJ]\u000bM\rYTi\u0011Wahgo\u0017obnc\u001c^jhat\"", (short) (OY.Xd() ^ 14363)) + str};
        Constructor<?> constructor = Class.forName(Wg.vd("\t\u0001\u0017\u0003H\u000f\u0002\u0001\f\n\u0002\u000e\fA_z(\u0003%!\u001d\u0011q&\n\r\u0019\u001e\f\u0013\u0013", (short) (ZN.Xd() ^ 30755))).getConstructor(Class.forName(Qg.kd("{q\u0006o;xlxp6Zzwmqi", (short) (C1607wl.Xd() ^ 19736), (short) (C1607wl.Xd() ^ 10820))));
        try {
            constructor.setAccessible(true);
            throw ((KeyStoreException) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
        if ((key instanceof PrivateKey) && certificateArr == null) {
            String strVd = hg.Vd("oo\u001fabnoc_aZWiY\u0013UYQX\\\rRZ\\\tXYO[EWG\u0001KDW", (short) (OY.Xd() ^ 4314), (short) (OY.Xd() ^ 11322));
            Class<?> cls = Class.forName(C1561oA.ud("1';%p5&#40&04g\u0004\u001d0\t)#%\u0017u(\u0012\u0013\u001d \u0014\u0019\u0017", (short) (OY.Xd() ^ 26416)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1607wl.Xd() ^ 17370);
            int[] iArr = new int["\f\u0004\u001a\u0006S\u0013\t\u0017\u0011X~! \u0018\u001e\u0018".length()];
            QB qb = new QB("\f\u0004\u001a\u0006S\u0013\t\u0017\u0011X~! \u0018\u001e\u0018");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {strVd};
            Constructor<?> constructor = cls.getConstructor(clsArr);
            try {
                constructor.setAccessible(true);
                throw ((KeyStoreException) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        try {
            this.table.put(str, new StoreEntry(str, key, cArr, certificateArr));
        } catch (Exception e3) {
            String string = e3.toString();
            short sXd2 = (short) (FB.Xd() ^ 4265);
            int[] iArr2 = new int["<4J6\u0004J=<OMEQW\r+F[6XTXL-aMP\\aW^^".length()];
            QB qb2 = new QB("<4J6\u0004J=<OMEQW\r+F[6XTXL-aMP\\aW^^");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr2 = new Class[1];
            short sXd3 = (short) (ZN.Xd() ^ 10902);
            short sXd4 = (short) (ZN.Xd() ^ 17980);
            int[] iArr3 = new int[":2H4\u0002A7E?\u0007-ONFLF".length()];
            QB qb3 = new QB(":2H4\u0002A7E?\u0007-ONFLF");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                i4++;
            }
            clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
            Object[] objArr2 = {string};
            Constructor<?> constructor2 = cls2.getConstructor(clsArr2);
            try {
                constructor2.setAccessible(true);
                throw ((KeyStoreException) constructor2.newInstance(objArr2));
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        this.table.put(str, new StoreEntry(str, bArr, certificateArr));
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.table.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        byte[] bArr = new byte[20];
        int iNextInt = this.random.nextInt();
        int i2 = ((iNextInt + 1023) - (iNextInt | 1023)) + 1024;
        SecureRandom secureRandom = this.random;
        short sXd = (short) (C1499aX.Xd() ^ (-26179));
        short sXd2 = (short) (C1499aX.Xd() ^ (-18719));
        int[] iArr = new int[">\u001d}p\tU3x\u0017[_R#_Pi3-6pf=64\u000b\u0010".length()];
        QB qb = new QB(">\u001d}p\tU3x\u0017[_R#_Pi3-6pf=64\u000b\u0010");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = {byte[].class};
        Object[] objArr = {bArr};
        short sXd3 = (short) (ZN.Xd() ^ 31861);
        short sXd4 = (short) (ZN.Xd() ^ 22604);
        int[] iArr2 = new int["yT4&ZNOl\u0015".length()];
        QB qb2 = new QB("yT4&ZNOl\u0015");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd4) + sXd3)));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            dataOutputStream.writeInt(this.version);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(i2);
            HMac hMac = new HMac(new SHA1Digest());
            MacOutputStream macOutputStream = new MacOutputStream(hMac);
            PKCS12ParametersGenerator pKCS12ParametersGenerator = new PKCS12ParametersGenerator(new SHA1Digest());
            byte[] bArrPKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
            pKCS12ParametersGenerator.init(bArrPKCS12PasswordToBytes, bArr, i2);
            if (this.version < 2) {
                hMac.init(pKCS12ParametersGenerator.generateDerivedMacParameters(hMac.getMacSize()));
            } else {
                hMac.init(pKCS12ParametersGenerator.generateDerivedMacParameters(hMac.getMacSize() * 8));
            }
            for (int i5 = 0; i5 != bArrPKCS12PasswordToBytes.length; i5++) {
                bArrPKCS12PasswordToBytes[i5] = 0;
            }
            saveStore(new TeeOutputStream(dataOutputStream, macOutputStream));
            byte[] bArr2 = new byte[hMac.getMacSize()];
            hMac.doFinal(bArr2, 0);
            dataOutputStream.write(bArr2);
            dataOutputStream.close();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected void loadStore(InputStream inputStream) throws Throwable {
        Certificate[] certificateArr;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int i2 = dataInputStream.read(); i2 > 0; i2 = dataInputStream.read()) {
            String utf = dataInputStream.readUTF();
            Date date = new Date(dataInputStream.readLong());
            int i3 = dataInputStream.readInt();
            if (i3 != 0) {
                certificateArr = new Certificate[i3];
                for (int i4 = 0; i4 != i3; i4++) {
                    certificateArr[i4] = decodeCertificate(dataInputStream);
                }
            } else {
                certificateArr = null;
            }
            if (i2 == 1) {
                this.table.put(utf, new StoreEntry(utf, date, 1, decodeCertificate(dataInputStream)));
            } else if (i2 == 2) {
                this.table.put(utf, new StoreEntry(utf, date, 2, decodeKey(dataInputStream), certificateArr));
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new RuntimeException("Unknown object type in store.");
                }
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                this.table.put(utf, new StoreEntry(utf, date, i2, bArr, certificateArr));
            }
        }
    }

    protected Cipher makePBECipher(String str, int i2, char[] cArr, byte[] bArr, int i3) throws IOException {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
            SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i3);
            Cipher cipherCreateCipher = this.helper.createCipher(str);
            cipherCreateCipher.init(i2, secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherCreateCipher;
        } catch (Exception e2) {
            throw new IOException("Error initialising store of key store: " + e2);
        }
    }

    protected void saveStore(OutputStream outputStream) throws Throwable {
        Enumeration enumerationElements = this.table.elements();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        while (true) {
            if (!enumerationElements.hasMoreElements()) {
                dataOutputStream.write(0);
                return;
            }
            StoreEntry storeEntry = (StoreEntry) enumerationElements.nextElement();
            dataOutputStream.write(storeEntry.getType());
            dataOutputStream.writeUTF(storeEntry.getAlias());
            dataOutputStream.writeLong(storeEntry.getDate().getTime());
            Certificate[] certificateChain = storeEntry.getCertificateChain();
            if (certificateChain == null) {
                dataOutputStream.writeInt(0);
            } else {
                dataOutputStream.writeInt(certificateChain.length);
                for (int i2 = 0; i2 != certificateChain.length; i2++) {
                    encodeCertificate(certificateChain[i2], dataOutputStream);
                }
            }
            int type = storeEntry.getType();
            if (type == 1) {
                encodeCertificate((Certificate) storeEntry.getObject(), dataOutputStream);
            } else if (type == 2) {
                encodeKey((Key) storeEntry.getObject(), dataOutputStream);
            } else {
                if (type != 3 && type != 4) {
                    throw new RuntimeException("Unknown object type in store.");
                }
                byte[] bArr = (byte[]) storeEntry.getObject();
                dataOutputStream.writeInt(bArr.length);
                dataOutputStream.write(bArr);
            }
        }
    }

    @Override // org.spongycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }
}
