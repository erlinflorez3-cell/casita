package org.bouncycastle.jcajce.provider.keystore.bc;

import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
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
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.io.DigestInputStream;
import org.bouncycastle.crypto.io.DigestOutputStream;
import org.bouncycastle.crypto.io.MacInputStream;
import org.bouncycastle.crypto.io.MacOutputStream;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;
import org.bouncycastle.util.io.TeeOutputStream;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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

        @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
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

        @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws Throwable {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            byte[] bArr = new byte[20];
            int iNextInt = (this.random.nextInt() & 1023) + 1024;
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr};
            Method method = Class.forName(C1561oA.Xd("nf|h6|on\u0002\u007fw\u0004\n?exw\u000b\t|jz\t\u007f\f\u000b", (short) (Od.Xd() ^ (-12902)))).getMethod(Wg.vd("`Xhe0h`Rm", (short) (C1633zX.Xd() ^ (-24110))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                dataOutputStream.writeInt(this.version);
                dataOutputStream.writeInt(20);
                dataOutputStream.write(bArr);
                dataOutputStream.writeInt(iNextInt);
                CipherOutputStream cipherOutputStream = new CipherOutputStream(dataOutputStream, makePBECipher(Qg.kd("WHJ[lviSG?>j_Npg]_h\\ 533", (short) (C1580rY.Xd() ^ (-28350)), (short) (C1580rY.Xd() ^ (-31453))), 1, cArr, bArr, iNextInt));
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
            Class<?> cls = Class.forName(hg.Vd("(\u001e2\u001cg,\u001d\u001a+'\u001d'+^\u0003\u0014\u0011\"\u001e\u0010{\n\u0016\u000b\u0015\u0012", (short) (C1607wl.Xd() ^ 30207), (short) (C1607wl.Xd() ^ 27668)));
            Class<?>[] clsArr = {Long.TYPE};
            Object[] objArr = {Long.valueOf(jCurrentTimeMillis)};
            Method method = cls.getMethod(C1561oA.ud("$\u0015#\u0001\u0012\u0011\u000f", (short) (C1499aX.Xd() ^ (-1306))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                SecureRandom secureRandom2 = BcKeyStoreSpi.this.random;
                short sXd = (short) (Od.Xd() ^ (-9142));
                int[] iArr = new int["\u001b\u0011%\u000fZ\u001f\u0010\r\u001e\u001a\u0010\u001a\u001eQu\u0007\u0004\u0015\u0011\u0003n|\t}\b\u0005".length()];
                QB qb = new QB("\u001b\u0011%\u000fZ\u001f\u0010\r\u001e\u001a\u0010\u001a\u001eQu\u0007\u0004\u0015\u0011\u0003n|\t}\b\u0005");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                Class<?> cls2 = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr2 = {byte[].class};
                Object[] objArr2 = {bArr};
                short sXd2 = (short) (C1499aX.Xd() ^ (-29120));
                int[] iArr2 = new int["{s\b\u0005S\f\by\t".length()];
                QB qb2 = new QB("{s\b\u0005S\f\by\t");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(secureRandom2, objArr2);
                    int iNextInt = (BcKeyStoreSpi.this.random.nextInt() & 1023) + 1024;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(20);
                    dataOutputStream.write(bArr);
                    dataOutputStream.writeInt(iNextInt);
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, BcKeyStoreSpi.this.makePBECipher(Xg.qd("\u0013\u0006\n\u001d0<1\u001d\u0013\r\u000e<3\u0003}\u001d8M)H@HE?\u001f!0\u000b\"\"$", (short) (C1580rY.Xd() ^ (-6462)), (short) (C1580rY.Xd() ^ (-25866))), 1, cArr, bArr, iNextInt)));
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
        short sXd = (short) (C1580rY.Xd() ^ (-1766));
        int[] iArr = new int["(o\u0007\u001a6 ud)J\u0012\u0005Y\u00025/rp74d=2&tx".length()];
        QB qb = new QB("(o\u0007\u001a6 ud)J\u0012\u0005Y\u00025/rp74d=2&tx");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
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
            Class<?> cls = Class.forName(C1561oA.Qd("F<P:\u0006J;8IE;EI|12>?w\f-9:.*,%\"4$\u0004\u001e\u001f/)+1", (short) (FB.Xd() ^ 19703)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1593ug.zd("( 6\"o,3r\u000f58>>\u001e@?30=", (short) (OY.Xd() ^ 6558), (short) (OY.Xd() ^ 25379)));
            Object[] objArr = {byteArrayInputStream};
            short sXd = (short) (OY.Xd() ^ 9166);
            int[] iArr = new int["mjrhtbtdAbnoc_aZWiY".length()];
            QB qb = new QB("mjrhtbtdAbnoc_aZWiY");
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
            Class<?> cls = Class.forName(C1561oA.Kd("ph~j8~qp\u0004\u0002y\u0006\fAwz\t\fF\\\u007f\u000e\u0011\u0007\u0005\t\u0004\u0003\u0017\t", (short) (FB.Xd() ^ 28210)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-29930));
            short sXd2 = (short) (C1633zX.Xd() ^ (-24400));
            int[] iArr = new int["hg{Q?1B|C?".length()];
            QB qb = new QB("hg{Q?1B|C?");
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
                byte[] bArr = (byte[]) method.invoke(certificate, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Xd("\u001c\u0014*\u0016c*\u001d\u001c/-%17l#&47q\b+9<204/.B4", (short) (OY.Xd() ^ 15915))).getMethod(Wg.vd("\f\t\u001by\u001a\u0010\b", (short) (FB.Xd() ^ LeicaMakernoteDirectory.TAG_CCD_BOARD_VERSION)), new Class[0]);
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
        dataOutputStream.write(key instanceof PrivateKey ? 0 : key instanceof PublicKey ? 1 : 2);
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
                Object[] objArr = {certificate};
                Method method = Class.forName(Qg.kd("\u0014\n\u001e\bS\u0018\t\u0006\u0017\u0013\t\u0013\u0017J~\u007f\f\rEYz\u0007\b{wyro\u0002q", (short) (C1633zX.Xd() ^ (-26002)), (short) (C1633zX.Xd() ^ (-8046)))).getMethod(C1561oA.ud("ZehS]c", (short) (C1499aX.Xd() ^ (-5560))), Class.forName(hg.Vd("\u0011\u0007\u001b\u0005P\u000e\u0002\u000e\u0006Kk}\u0005~{\f", (short) (C1499aX.Xd() ^ (-3697)), (short) (C1499aX.Xd() ^ (-28547)))));
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
                    short sXd = (short) (C1633zX.Xd() ^ (-24838));
                    int[] iArr = new int["&\u001c4\u001em2'$95/9At-.\u001e\u001f[o\u0015!&\u001a\u001a\u001c\u0019\u0016,\u001c".length()];
                    QB qb = new QB("&\u001c4\u001em2'$95/9At-.\u001e\u001f[o\u0015!&\u001a\u001a\u001c\u0019\u0016,\u001c");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                        i2++;
                    }
                    Object[] objArr2 = {certificate};
                    Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("\n\u0017\u001c\t\u0015\u001d", (short) (C1580rY.Xd() ^ (-1347)), (short) (C1580rY.Xd() ^ (-1450))), Class.forName(C1561oA.Yd("\u0015\r#\u000f\\\u001c\u0012 \u001aa\u0004\u0018!\u001d\u001c.", (short) (C1580rY.Xd() ^ (-4379)))));
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
        CipherParameters cipherParametersGenerateDerivedMacParameters = pKCS12ParametersGenerator.generateDerivedMacParameters(i2 != 2 ? hMac.getMacSize() : hMac.getMacSize() * 8);
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
        Object[] objArr = {Jg.Wd("5t7xY8#\u0002\u0002WG\u001a|[3\u00046\fr5$>\bc\\q\u0012\u0018J1C^\u0011~4\u0012y;\u0011\u007f(pF@w", (short) (C1499aX.Xd() ^ (-21070)), (short) (C1499aX.Xd() ^ (-21188))) + str};
        Constructor<?> constructor = Class.forName(ZO.xd("\u0013\u0018\u000659U9E,\nn=4c\u001a\u0017`C*h\u0014\u0013#Z5\u0002+gvI(", (short) (ZN.Xd() ^ 28923), (short) (ZN.Xd() ^ 26308))).getConstructor(Class.forName(C1626yg.Ud("\u001d>;\u001cO\u0011g\t\u007f}~6\u0019\u0019S\u0018", (short) (C1580rY.Xd() ^ (-17627)), (short) (C1580rY.Xd() ^ (-7694)))));
        try {
            constructor.setAccessible(true);
            throw ((KeyStoreException) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Throwable {
        if (!(key instanceof PrivateKey) || certificateArr != null) {
            try {
                this.table.put(str, new StoreEntry(str, key, cArr, certificateArr));
                return;
            } catch (Exception e2) {
                Object[] objArr = {e2.toString()};
                Constructor<?> constructor = Class.forName(C1593ug.zd("1)?+x?21DB:FL\u0002 ;P+MIMA\"VBEQVLSS", (short) (OY.Xd() ^ 29675), (short) (OY.Xd() ^ 9241))).getConstructor(Class.forName(C1561oA.od("MCWA\rJ>JB\b,LI?C;", (short) (Od.Xd() ^ (-10478)))));
                try {
                    constructor.setAccessible(true);
                    throw ((KeyStoreException) constructor.newInstance(objArr));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
        String strWd = Ig.wd("?r\u0011=N6LY\u001f\u0003v>\u0003\u0002D)ex(\u0015\u007f}% \u000bw\u001bY\u0001\u001dDV=\"3\t", (short) (ZN.Xd() ^ 13125));
        short sXd = (short) (C1633zX.Xd() ^ (-16412));
        int[] iArr = new int["zAZgf\u0001H)}\u0019\b;\u000fG2t]+\u0007<\u0002/'`}}-i\u000b%:".length()];
        QB qb = new QB("zAZgf\u0001H)}\u0019\b;\u000fG2t]+\u0007<\u0002/'`}}-i\u000b%:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr2 = {strWd};
        Constructor<?> constructor2 = Class.forName(new String(iArr, 0, i2)).getConstructor(Class.forName(C1561oA.Qd("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012\u000f\u0005\t\u0001", (short) (Od.Xd() ^ (-8494)))));
        try {
            constructor2.setAccessible(true);
            throw ((KeyStoreException) constructor2.newInstance(objArr2));
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
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
        int iNextInt = (this.random.nextInt() & 1023) + 1024;
        SecureRandom secureRandom = this.random;
        Object[] objArr = {bArr};
        Method method = Class.forName(C1561oA.Kd("\u001e\u0016,\u0018e,\u001f\u001e1/'39n\u0015(':8,\u001a*8/;:", (short) (C1633zX.Xd() ^ (-25956)))).getMethod(Wg.Zd("\u001f\"P7 QWC\\", (short) (C1580rY.Xd() ^ (-13846)), (short) (C1580rY.Xd() ^ (-11674))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            dataOutputStream.writeInt(this.version);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(iNextInt);
            HMac hMac = new HMac(new SHA1Digest());
            MacOutputStream macOutputStream = new MacOutputStream(hMac);
            PKCS12ParametersGenerator pKCS12ParametersGenerator = new PKCS12ParametersGenerator(new SHA1Digest());
            byte[] bArrPKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
            pKCS12ParametersGenerator.init(bArrPKCS12PasswordToBytes, bArr, iNextInt);
            hMac.init(pKCS12ParametersGenerator.generateDerivedMacParameters(this.version < 2 ? hMac.getMacSize() : hMac.getMacSize() * 8));
            for (int i2 = 0; i2 != bArrPKCS12PasswordToBytes.length; i2++) {
                bArrPKCS12PasswordToBytes[i2] = 0;
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
        Hashtable hashtable;
        StoreEntry storeEntry;
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
                Certificate certificateDecodeCertificate = decodeCertificate(dataInputStream);
                hashtable = this.table;
                storeEntry = new StoreEntry(utf, date, 1, certificateDecodeCertificate);
            } else if (i2 == 2) {
                Key keyDecodeKey = decodeKey(dataInputStream);
                hashtable = this.table;
                storeEntry = new StoreEntry(utf, date, 2, keyDecodeKey, certificateArr);
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new RuntimeException("Unknown object type in store.");
                }
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                this.table.put(utf, new StoreEntry(utf, date, i2, bArr, certificateArr));
            }
            hashtable.put(utf, storeEntry);
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

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }
}
