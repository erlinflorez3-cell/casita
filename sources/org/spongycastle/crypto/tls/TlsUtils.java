package org.spongycastle.crypto.tls;

import androidx.core.view.ViewCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.KeyUsage;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;
import org.spongycastle.util.io.Streams;

/* JADX INFO: loaded from: classes2.dex */
public class TlsUtils {
    public static final byte[] EMPTY_BYTES = new byte[0];
    public static final short[] EMPTY_SHORTS = new short[0];
    public static final int[] EMPTY_INTS = new int[0];
    public static final long[] EMPTY_LONGS = new long[0];
    public static final Integer EXT_signature_algorithms = Integers.valueOf(13);
    static final byte[] SSL_CLIENT = {67, 76, 78, 84};
    static final byte[] SSL_SERVER = {83, 82, 86, 82};
    static final byte[][] SSL3_CONST = genSSL3Const();

    public static byte[] PRF(TlsContext tlsContext, byte[] bArr, String str, byte[] bArr2, int i2) {
        if (tlsContext.getServerVersion().isSSL()) {
            throw new IllegalStateException("No PRF available for SSLv3 session");
        }
        byte[] byteArray = Strings.toByteArray(str);
        byte[] bArrConcat = concat(byteArray, bArr2);
        int prfAlgorithm = tlsContext.getSecurityParameters().getPrfAlgorithm();
        if (prfAlgorithm == 0) {
            return PRF_legacy(bArr, byteArray, bArrConcat, i2);
        }
        Digest digestCreatePRFHash = createPRFHash(prfAlgorithm);
        byte[] bArr3 = new byte[i2];
        hmac_hash(digestCreatePRFHash, bArr, bArrConcat, bArr3);
        return bArr3;
    }

    public static byte[] PRF_legacy(byte[] bArr, String str, byte[] bArr2, int i2) {
        byte[] byteArray = Strings.toByteArray(str);
        return PRF_legacy(bArr, byteArray, concat(byteArray, bArr2), i2);
    }

    static byte[] PRF_legacy(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        int length = (bArr.length + 1) / 2;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, length);
        System.arraycopy(bArr, bArr.length - length, bArr5, 0, length);
        byte[] bArr6 = new byte[i2];
        byte[] bArr7 = new byte[i2];
        hmac_hash(createHash((short) 1), bArr4, bArr3, bArr6);
        hmac_hash(createHash((short) 2), bArr5, bArr3, bArr7);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr6[i3] = (byte) (bArr6[i3] ^ bArr7[i3]);
        }
        return bArr6;
    }

    public static void addSignatureAlgorithmsExtension(Hashtable hashtable, Vector vector) throws IOException {
        hashtable.put(EXT_signature_algorithms, createSignatureAlgorithmsExtension(vector));
    }

    static byte[] calculateKeyBlock(TlsContext tlsContext, int i2) {
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        byte[] masterSecret = securityParameters.getMasterSecret();
        byte[] bArrConcat = concat(securityParameters.getServerRandom(), securityParameters.getClientRandom());
        return isSSL(tlsContext) ? calculateKeyBlock_SSL(masterSecret, bArrConcat, i2) : PRF(tlsContext, masterSecret, "key expansion", bArrConcat, i2);
    }

    static byte[] calculateKeyBlock_SSL(byte[] bArr, byte[] bArr2, int i2) {
        Digest digestCreateHash = createHash((short) 1);
        Digest digestCreateHash2 = createHash((short) 2);
        int digestSize = digestCreateHash.getDigestSize();
        int digestSize2 = digestCreateHash2.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        byte[] bArr4 = new byte[i2 + digestSize];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            byte[] bArr5 = SSL3_CONST[i4];
            digestCreateHash2.update(bArr5, 0, bArr5.length);
            digestCreateHash2.update(bArr, 0, bArr.length);
            digestCreateHash2.update(bArr2, 0, bArr2.length);
            digestCreateHash2.doFinal(bArr3, 0);
            digestCreateHash.update(bArr, 0, bArr.length);
            digestCreateHash.update(bArr3, 0, digestSize2);
            digestCreateHash.doFinal(bArr4, i3);
            i3 += digestSize;
            i4++;
        }
        return Arrays.copyOfRange(bArr4, 0, i2);
    }

    static byte[] calculateMasterSecret(TlsContext tlsContext, byte[] bArr) {
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        byte[] sessionHash = securityParameters.extendedMasterSecret ? securityParameters.getSessionHash() : concat(securityParameters.getClientRandom(), securityParameters.getServerRandom());
        if (isSSL(tlsContext)) {
            return calculateMasterSecret_SSL(bArr, sessionHash);
        }
        return PRF(tlsContext, bArr, securityParameters.extendedMasterSecret ? "extended master secret" : "master secret", sessionHash, 48);
    }

    static byte[] calculateMasterSecret_SSL(byte[] bArr, byte[] bArr2) {
        Digest digestCreateHash = createHash((short) 1);
        Digest digestCreateHash2 = createHash((short) 2);
        int digestSize = digestCreateHash.getDigestSize();
        int digestSize2 = digestCreateHash2.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        byte[] bArr4 = new byte[digestSize * 3];
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            byte[] bArr5 = SSL3_CONST[i3];
            digestCreateHash2.update(bArr5, 0, bArr5.length);
            digestCreateHash2.update(bArr, 0, bArr.length);
            digestCreateHash2.update(bArr2, 0, bArr2.length);
            digestCreateHash2.doFinal(bArr3, 0);
            digestCreateHash.update(bArr, 0, bArr.length);
            digestCreateHash.update(bArr3, 0, digestSize2);
            digestCreateHash.doFinal(bArr4, i2);
            i2 += digestSize;
        }
        return bArr4;
    }

    static byte[] calculateVerifyData(TlsContext tlsContext, String str, byte[] bArr) {
        if (isSSL(tlsContext)) {
            return bArr;
        }
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        return PRF(tlsContext, securityParameters.getMasterSecret(), str, bArr, securityParameters.getVerifyDataLength());
    }

    public static void checkUint16(int i2) throws IOException {
        if (!isValidUint16(i2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint16(long j2) throws IOException {
        if (!isValidUint16(j2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint24(int i2) throws IOException {
        if (!isValidUint24(i2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint24(long j2) throws IOException {
        if (!isValidUint24(j2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint32(long j2) throws IOException {
        if (!isValidUint32(j2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint48(long j2) throws IOException {
        if (!isValidUint48(j2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint64(long j2) throws IOException {
        if (!isValidUint64(j2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint8(int i2) throws IOException {
        if (!isValidUint8(i2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint8(long j2) throws IOException {
        if (!isValidUint8(j2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint8(short s2) throws IOException {
        if (!isValidUint8(s2)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static Digest cloneHash(short s2, Digest digest) {
        switch (s2) {
            case 1:
                return new MD5Digest((MD5Digest) digest);
            case 2:
                return new SHA1Digest((SHA1Digest) digest);
            case 3:
                return new SHA224Digest((SHA224Digest) digest);
            case 4:
                return new SHA256Digest((SHA256Digest) digest);
            case 5:
                return new SHA384Digest((SHA384Digest) digest);
            case 6:
                return new SHA512Digest((SHA512Digest) digest);
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Digest clonePRFHash(int i2, Digest digest) {
        return i2 != 0 ? cloneHash(getHashAlgorithmForPRFAlgorithm(i2), digest) : new CombinedHash((CombinedHash) digest);
    }

    static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static Digest createHash(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        return signatureAndHashAlgorithm == null ? new CombinedHash() : createHash(signatureAndHashAlgorithm.getHash());
    }

    public static Digest createHash(short s2) {
        switch (s2) {
            case 1:
                return new MD5Digest();
            case 2:
                return new SHA1Digest();
            case 3:
                return new SHA224Digest();
            case 4:
                return new SHA256Digest();
            case 5:
                return new SHA384Digest();
            case 6:
                return new SHA512Digest();
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Digest createPRFHash(int i2) {
        return i2 != 0 ? createHash(getHashAlgorithmForPRFAlgorithm(i2)) : new CombinedHash();
    }

    public static byte[] createSignatureAlgorithmsExtension(Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeSupportedSignatureAlgorithms(vector, false, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static TlsSigner createTlsSigner(short s2) {
        if (s2 == 1) {
            return new TlsRSASigner();
        }
        if (s2 == 2) {
            return new TlsDSSSigner();
        }
        if (s2 == 64) {
            return new TlsECDSASigner();
        }
        throw new IllegalArgumentException("'clientCertificateType' is not a type with signing capability");
    }

    public static byte[] encodeOpaque8(byte[] bArr) throws IOException {
        checkUint8(bArr.length);
        return Arrays.prepend(bArr, (byte) bArr.length);
    }

    public static void encodeSupportedSignatureAlgorithms(Vector vector, boolean z2, OutputStream outputStream) throws IOException {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        }
        int size = vector.size() * 2;
        checkUint16(size);
        writeUint16(size, outputStream);
        for (int i2 = 0; i2 < vector.size(); i2++) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) vector.elementAt(i2);
            if (!z2 && signatureAndHashAlgorithm.getSignature() == 0) {
                throw new IllegalArgumentException("SignatureAlgorithm.anonymous MUST NOT appear in the signature_algorithms extension");
            }
            signatureAndHashAlgorithm.encode(outputStream);
        }
    }

    public static byte[] encodeUint16ArrayWithUint16Length(int[] iArr) throws IOException {
        byte[] bArr = new byte[(iArr.length * 2) + 2];
        writeUint16ArrayWithUint16Length(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] encodeUint8ArrayWithUint8Length(short[] sArr) throws IOException {
        byte[] bArr = new byte[sArr.length + 1];
        writeUint8ArrayWithUint8Length(sArr, bArr, 0);
        return bArr;
    }

    private static byte[][] genSSL3Const() {
        byte[][] bArr = new byte[10][];
        int i2 = 0;
        while (i2 < 10) {
            int i3 = i2 + 1;
            byte[] bArr2 = new byte[i3];
            Arrays.fill(bArr2, (byte) (i2 + 65));
            bArr[i2] = bArr2;
            i2 = i3;
        }
        return bArr;
    }

    public static int getCipherType(int i2) throws IOException {
        int encryptionAlgorithm = getEncryptionAlgorithm(i2);
        switch (encryptionAlgorithm) {
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
                return 1;
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 2;
            default:
                switch (encryptionAlgorithm) {
                    case 100:
                    case 101:
                        return 0;
                    case 102:
                        return 2;
                    default:
                        throw new TlsFatalAlert((short) 80);
                }
        }
    }

    static short getClientCertificateType(Certificate certificate, Certificate certificate2) throws IOException {
        if (certificate.isEmpty()) {
            return (short) -1;
        }
        org.spongycastle.asn1.x509.Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            if (asymmetricKeyParameterCreateKey.isPrivate()) {
                throw new TlsFatalAlert((short) 80);
            }
            if (asymmetricKeyParameterCreateKey instanceof RSAKeyParameters) {
                validateKeyUsage(certificateAt, 128);
                return (short) 1;
            }
            if (asymmetricKeyParameterCreateKey instanceof DSAPublicKeyParameters) {
                validateKeyUsage(certificateAt, 128);
                return (short) 2;
            }
            if (!(asymmetricKeyParameterCreateKey instanceof ECPublicKeyParameters)) {
                throw new TlsFatalAlert((short) 43);
            }
            validateKeyUsage(certificateAt, 128);
            return (short) 64;
        } catch (Exception e2) {
            throw new TlsFatalAlert((short) 43, e2);
        }
    }

    public static Vector getDefaultDSSSignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 2));
    }

    public static Vector getDefaultECDSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 3));
    }

    public static Vector getDefaultRSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 1));
    }

    public static Vector getDefaultSupportedSignatureAlgorithms() {
        short[] sArr = {2, 3, 4, 5, 6};
        short[] sArr2 = {1, 2, 3};
        Vector vector = new Vector();
        for (int i2 = 0; i2 < 3; i2++) {
            for (int i3 = 0; i3 < 5; i3++) {
                vector.addElement(new SignatureAndHashAlgorithm(sArr[i3], sArr2[i2]));
            }
        }
        return vector;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0048 A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0049 A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getEncryptionAlgorithm(int r6) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.TlsUtils.getEncryptionAlgorithm(int):int");
    }

    public static byte[] getExtensionData(Hashtable hashtable, Integer num) {
        if (hashtable == null) {
            return null;
        }
        return (byte[]) hashtable.get(num);
    }

    public static short getHashAlgorithmForPRFAlgorithm(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("legacy PRF not a valid algorithm");
        }
        if (i2 == 1) {
            return (short) 4;
        }
        if (i2 == 2) {
            return (short) 5;
        }
        throw new IllegalArgumentException("unknown PRFAlgorithm");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getKeyExchangeAlgorithm(int r2) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.TlsUtils.getKeyExchangeAlgorithm(int):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getMACAlgorithm(int r3) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.TlsUtils.getMACAlgorithm(int):int");
    }

    public static ProtocolVersion getMinimumVersion(int i2) {
        switch (i2) {
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                break;
            default:
                switch (i2) {
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                        break;
                    default:
                        switch (i2) {
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                            case 160:
                            case 161:
                            case 162:
                            case 163:
                            case 164:
                            case 165:
                                break;
                            default:
                                switch (i2) {
                                    case 168:
                                    case 169:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case 173:
                                        break;
                                    default:
                                        switch (i2) {
                                            case 186:
                                            case 187:
                                            case 188:
                                            case 189:
                                            case 190:
                                            case 191:
                                            case 192:
                                            case 193:
                                            case 194:
                                            case 195:
                                            case 196:
                                            case 197:
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 49187:
                                                    case 49188:
                                                    case 49189:
                                                    case 49190:
                                                    case 49191:
                                                    case 49192:
                                                    case 49193:
                                                    case 49194:
                                                    case 49195:
                                                    case 49196:
                                                    case 49197:
                                                    case 49198:
                                                    case 49199:
                                                    case 49200:
                                                    case 49201:
                                                    case 49202:
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 49266:
                                                            case 49267:
                                                            case 49268:
                                                            case 49269:
                                                            case 49270:
                                                            case 49271:
                                                            case 49272:
                                                            case 49273:
                                                            case 49274:
                                                            case 49275:
                                                            case 49276:
                                                            case 49277:
                                                            case 49278:
                                                            case 49279:
                                                            case 49280:
                                                            case 49281:
                                                            case 49282:
                                                            case 49283:
                                                            case 49284:
                                                            case 49285:
                                                            case 49286:
                                                            case 49287:
                                                            case 49288:
                                                            case 49289:
                                                            case 49290:
                                                            case 49291:
                                                            case 49292:
                                                            case 49293:
                                                            case 49294:
                                                            case 49295:
                                                            case 49296:
                                                            case 49297:
                                                            case 49298:
                                                            case 49299:
                                                                break;
                                                            default:
                                                                switch (i2) {
                                                                    case 49308:
                                                                    case 49309:
                                                                    case 49310:
                                                                    case 49311:
                                                                    case 49312:
                                                                    case 49313:
                                                                    case 49314:
                                                                    case 49315:
                                                                    case 49316:
                                                                    case 49317:
                                                                    case 49318:
                                                                    case 49319:
                                                                    case 49320:
                                                                    case 49321:
                                                                    case 49322:
                                                                    case 49323:
                                                                    case 49324:
                                                                    case 49325:
                                                                    case 49326:
                                                                    case 49327:
                                                                        break;
                                                                    default:
                                                                        switch (i2) {
                                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52243 */:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52244 */:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52245 */:
                                                                                break;
                                                                            default:
                                                                                return ProtocolVersion.SSLv3;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        return ProtocolVersion.TLSv12;
    }

    public static ASN1ObjectIdentifier getOIDForHashAlgorithm(short s2) {
        switch (s2) {
            case 1:
                return PKCSObjectIdentifiers.md5;
            case 2:
                return X509ObjectIdentifiers.id_SHA1;
            case 3:
                return NISTObjectIdentifiers.id_sha224;
            case 4:
                return NISTObjectIdentifiers.id_sha256;
            case 5:
                return NISTObjectIdentifiers.id_sha384;
            case 6:
                return NISTObjectIdentifiers.id_sha512;
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Vector getSignatureAlgorithmsExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = getExtensionData(hashtable, EXT_signature_algorithms);
        if (extensionData == null) {
            return null;
        }
        return readSignatureAlgorithmsExtension(extensionData);
    }

    public static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(TlsContext tlsContext, TlsSignerCredentials tlsSignerCredentials) throws IOException {
        if (!isTLSv12(tlsContext)) {
            return null;
        }
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = tlsSignerCredentials.getSignatureAndHashAlgorithm();
        if (signatureAndHashAlgorithm != null) {
            return signatureAndHashAlgorithm;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static boolean hasExpectedEmptyExtensionData(Hashtable hashtable, Integer num, short s2) throws IOException {
        byte[] extensionData = getExtensionData(hashtable, num);
        if (extensionData == null) {
            return false;
        }
        if (extensionData.length == 0) {
            return true;
        }
        throw new TlsFatalAlert(s2);
    }

    public static boolean hasSigningCapability(short s2) {
        return s2 == 1 || s2 == 2 || s2 == 64;
    }

    static void hmac_hash(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        HMac hMac = new HMac(digest);
        hMac.init(new KeyParameter(bArr));
        int digestSize = digest.getDigestSize();
        int length = ((bArr3.length + digestSize) - 1) / digestSize;
        int macSize = hMac.getMacSize();
        byte[] bArr4 = new byte[macSize];
        byte[] bArr5 = new byte[hMac.getMacSize()];
        byte[] bArr6 = bArr2;
        int i2 = 0;
        while (i2 < length) {
            hMac.update(bArr6, 0, bArr6.length);
            hMac.doFinal(bArr4, 0);
            hMac.update(bArr4, 0, macSize);
            hMac.update(bArr2, 0, bArr2.length);
            hMac.doFinal(bArr5, 0);
            int i3 = digestSize * i2;
            System.arraycopy(bArr5, 0, bArr3, i3, Math.min(digestSize, bArr3.length - i3));
            i2++;
            bArr6 = bArr4;
        }
    }

    public static TlsSession importSession(byte[] bArr, SessionParameters sessionParameters) {
        return new TlsSessionImpl(bArr, sessionParameters);
    }

    public static boolean isAEADCipherSuite(int i2) throws IOException {
        return 2 == getCipherType(i2);
    }

    public static boolean isBlockCipherSuite(int i2) throws IOException {
        return 1 == getCipherType(i2);
    }

    public static boolean isSSL(TlsContext tlsContext) {
        return tlsContext.getServerVersion().isSSL();
    }

    public static boolean isSignatureAlgorithmsExtensionAllowed(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isStreamCipherSuite(int i2) throws IOException {
        return getCipherType(i2) == 0;
    }

    public static boolean isTLSv11(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv11.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv11(TlsContext tlsContext) {
        return isTLSv11(tlsContext.getServerVersion());
    }

    public static boolean isTLSv12(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv12(TlsContext tlsContext) {
        return isTLSv12(tlsContext.getServerVersion());
    }

    public static boolean isValidCipherSuiteForVersion(int i2, ProtocolVersion protocolVersion) {
        return getMinimumVersion(i2).isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isValidUint16(int i2) {
        return (65535 & i2) == i2;
    }

    public static boolean isValidUint16(long j2) {
        return (WebSocketProtocol.PAYLOAD_SHORT_MAX + j2) - (WebSocketProtocol.PAYLOAD_SHORT_MAX | j2) == j2;
    }

    public static boolean isValidUint24(int i2) {
        return (-1) - (((-1) - ViewCompat.MEASURED_SIZE_MASK) | ((-1) - i2)) == i2;
    }

    public static boolean isValidUint24(long j2) {
        return (16777215 + j2) - (16777215 | j2) == j2;
    }

    public static boolean isValidUint32(long j2) {
        return (4294967295L + j2) - (4294967295L | j2) == j2;
    }

    public static boolean isValidUint48(long j2) {
        return (-1) - (((-1) - 281474976710655L) | ((-1) - j2)) == j2;
    }

    public static boolean isValidUint64(long j2) {
        return true;
    }

    public static boolean isValidUint8(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 255)) == i2;
    }

    public static boolean isValidUint8(long j2) {
        return (-1) - (((-1) - 255) | ((-1) - j2)) == j2;
    }

    public static boolean isValidUint8(short s2) {
        return (255 & s2) == s2;
    }

    public static Vector parseSupportedSignatureAlgorithms(boolean z2, InputStream inputStream) throws IOException {
        int uint16 = readUint16(inputStream);
        if (uint16 < 2 || (-1) - (((-1) - uint16) | ((-1) - 1)) != 0) {
            throw new TlsFatalAlert((short) 50);
        }
        int i2 = uint16 / 2;
        Vector vector = new Vector(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = SignatureAndHashAlgorithm.parse(inputStream);
            if (!z2 && signatureAndHashAlgorithm.getSignature() == 0) {
                throw new TlsFatalAlert((short) 47);
            }
            vector.addElement(signatureAndHashAlgorithm);
        }
        return vector;
    }

    public static ASN1Primitive readASN1Object(byte[] bArr) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        ASN1Primitive object = aSN1InputStream.readObject();
        if (object == null) {
            throw new TlsFatalAlert((short) 50);
        }
        if (aSN1InputStream.readObject() == null) {
            return object;
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static byte[] readAllOrNothing(int i2, InputStream inputStream) throws IOException {
        if (i2 < 1) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i2];
        int fully = Streams.readFully(inputStream, bArr);
        if (fully == 0) {
            return null;
        }
        if (fully == i2) {
            return bArr;
        }
        throw new EOFException();
    }

    public static ASN1Primitive readDERObject(byte[] bArr) throws IOException {
        ASN1Primitive aSN1Object = readASN1Object(bArr);
        if (Arrays.areEqual(aSN1Object.getEncoded("DER"), bArr)) {
            return aSN1Object;
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static void readFully(byte[] bArr, InputStream inputStream) throws IOException {
        int length = bArr.length;
        if (length > 0 && length != Streams.readFully(inputStream, bArr)) {
            throw new EOFException();
        }
    }

    public static byte[] readFully(int i2, InputStream inputStream) throws IOException {
        if (i2 < 1) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i2];
        if (i2 == Streams.readFully(inputStream, bArr)) {
            return bArr;
        }
        throw new EOFException();
    }

    public static byte[] readOpaque16(InputStream inputStream) throws IOException {
        return readFully(readUint16(inputStream), inputStream);
    }

    public static byte[] readOpaque24(InputStream inputStream) throws IOException {
        return readFully(readUint24(inputStream), inputStream);
    }

    public static byte[] readOpaque8(InputStream inputStream) throws IOException {
        return readFully(readUint8(inputStream), inputStream);
    }

    public static Vector readSignatureAlgorithmsExtension(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Vector supportedSignatureAlgorithms = parseSupportedSignatureAlgorithms(false, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        return supportedSignatureAlgorithms;
    }

    public static int readUint16(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        if (i3 >= 0) {
            return i3 | (i2 << 8);
        }
        throw new EOFException();
    }

    public static int readUint16(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        int i3 = ((b2 + 255) - (b2 | 255)) << 8;
        int i4 = bArr[i2 + 1] & 255;
        return (i4 + i3) - (i4 & i3);
    }

    public static int[] readUint16Array(int i2, InputStream inputStream) throws IOException {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = readUint16(inputStream);
        }
        return iArr;
    }

    public static int readUint24(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        if (i4 < 0) {
            throw new EOFException();
        }
        int i5 = (i2 << 16) | (i3 << 8);
        return (i4 + i5) - (i4 & i5);
    }

    public static int readUint24(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        int i3 = ((b2 + 255) - (b2 | 255)) << 16;
        byte b3 = bArr[i2 + 1];
        return (bArr[i2 + 2] & 255) | ((-1) - (((-1) - i3) & ((-1) - (((b3 + 255) - (b3 | 255)) << 8))));
    }

    public static long readUint32(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        if (i5 < 0) {
            throw new EOFException();
        }
        int i6 = i2 << 2;
        int i7 = i3 << 16;
        int i8 = (i6 + i7) - (i6 & i7);
        int i9 = i4 << 8;
        return (-1) - (((-1) - ((long) (i5 | ((i8 + i9) - (i8 & i9))))) | ((-1) - 4294967295L));
    }

    public static long readUint32(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        int i3 = (((b2 + 255) - (b2 | 255)) << 24) | (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 16);
        int i4 = (bArr[i2 + 2] & 255) << 8;
        long j2 = (-1) - (((-1) - (bArr[i2 + 3] & 255)) & ((-1) - ((i3 + i4) - (i3 & i4))));
        return (j2 + 4294967295L) - (j2 | 4294967295L);
    }

    public static long readUint48(InputStream inputStream) throws IOException {
        return (-1) - (((-1) - ((((long) readUint24(inputStream)) & 4294967295L) << 24)) & ((-1) - ((-1) - (((-1) - 4294967295L) | ((-1) - ((long) readUint24(inputStream)))))));
    }

    public static long readUint48(byte[] bArr, int i2) {
        int uint24 = readUint24(bArr, i2);
        long j2 = ((-1) - (((-1) - ((long) uint24)) | ((-1) - 4294967295L))) << 24;
        long uint242 = ((long) readUint24(bArr, i2 + 3)) & 4294967295L;
        return (uint242 + j2) - (uint242 & j2);
    }

    public static short readUint8(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 >= 0) {
            return (short) i2;
        }
        throw new EOFException();
    }

    public static short readUint8(byte[] bArr, int i2) {
        return bArr[i2];
    }

    public static short[] readUint8Array(int i2, InputStream inputStream) throws IOException {
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = readUint8(inputStream);
        }
        return sArr;
    }

    public static ProtocolVersion readVersion(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        if (i3 >= 0) {
            return ProtocolVersion.get(i2, i3);
        }
        throw new EOFException();
    }

    public static ProtocolVersion readVersion(byte[] bArr, int i2) throws IOException {
        byte b2 = bArr[i2];
        return ProtocolVersion.get((b2 + 255) - (b2 | 255), (-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255)));
    }

    public static int readVersionRaw(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        if (i3 < 0) {
            throw new EOFException();
        }
        int i4 = i2 << 8;
        return (i3 + i4) - (i3 & i4);
    }

    public static int readVersionRaw(byte[] bArr, int i2) throws IOException {
        return (-1) - (((-1) - bArr[i2 + 1]) & ((-1) - (bArr[i2] << 8)));
    }

    static void trackHashAlgorithms(TlsHandshakeHash tlsHandshakeHash, Vector vector) {
        if (vector != null) {
            for (int i2 = 0; i2 < vector.size(); i2++) {
                tlsHandshakeHash.trackHashAlgorithm(((SignatureAndHashAlgorithm) vector.elementAt(i2)).getHash());
            }
        }
    }

    static void validateKeyUsage(org.spongycastle.asn1.x509.Certificate certificate, int i2) throws IOException {
        KeyUsage keyUsageFromExtensions;
        Extensions extensions = certificate.getTBSCertificate().getExtensions();
        if (extensions != null && (keyUsageFromExtensions = KeyUsage.fromExtensions(extensions)) != null && (-1) - (((-1) - (keyUsageFromExtensions.getBytes()[0] & 255)) | ((-1) - i2)) != i2) {
            throw new TlsFatalAlert((short) 46);
        }
    }

    private static Vector vectorOfOne(Object obj) {
        Vector vector = new Vector(1);
        vector.addElement(obj);
        return vector;
    }

    public static void verifySupportedSignatureAlgorithm(Vector vector, SignatureAndHashAlgorithm signatureAndHashAlgorithm) throws IOException {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        }
        if (signatureAndHashAlgorithm == null) {
            throw new IllegalArgumentException("'signatureAlgorithm' cannot be null");
        }
        if (signatureAndHashAlgorithm.getSignature() != 0) {
            for (int i2 = 0; i2 < vector.size(); i2++) {
                SignatureAndHashAlgorithm signatureAndHashAlgorithm2 = (SignatureAndHashAlgorithm) vector.elementAt(i2);
                if (signatureAndHashAlgorithm2.getHash() == signatureAndHashAlgorithm.getHash() && signatureAndHashAlgorithm2.getSignature() == signatureAndHashAlgorithm.getSignature()) {
                    return;
                }
            }
        }
        throw new TlsFatalAlert((short) 47);
    }

    public static void writeGMTUnixTime(byte[] bArr, int i2) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        bArr[i2] = (byte) (iCurrentTimeMillis >>> 24);
        bArr[i2 + 1] = (byte) (iCurrentTimeMillis >>> 16);
        bArr[i2 + 2] = (byte) (iCurrentTimeMillis >>> 8);
        bArr[i2 + 3] = (byte) iCurrentTimeMillis;
    }

    public static void writeOpaque16(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint16(bArr.length);
        writeUint16(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque24(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint24(bArr.length);
        writeUint24(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque8(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint8(bArr.length);
        writeUint8(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeUint16(int i2, OutputStream outputStream) throws IOException {
        outputStream.write(i2 >>> 8);
        outputStream.write(i2);
    }

    public static void writeUint16(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >>> 8);
        bArr[i3 + 1] = (byte) i2;
    }

    public static void writeUint16Array(int[] iArr, OutputStream outputStream) throws IOException {
        for (int i2 : iArr) {
            writeUint16(i2, outputStream);
        }
    }

    public static void writeUint16Array(int[] iArr, byte[] bArr, int i2) throws IOException {
        for (int i3 : iArr) {
            writeUint16(i3, bArr, i2);
            i2 += 2;
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, OutputStream outputStream) throws IOException {
        int length = iArr.length * 2;
        checkUint16(length);
        writeUint16(length, outputStream);
        writeUint16Array(iArr, outputStream);
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, byte[] bArr, int i2) throws IOException {
        int length = iArr.length * 2;
        checkUint16(length);
        writeUint16(length, bArr, i2);
        writeUint16Array(iArr, bArr, i2 + 2);
    }

    public static void writeUint24(int i2, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (i2 >>> 16));
        outputStream.write((byte) (i2 >>> 8));
        outputStream.write((byte) i2);
    }

    public static void writeUint24(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >>> 16);
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
    }

    public static void writeUint32(long j2, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) j2);
    }

    public static void writeUint32(long j2, byte[] bArr, int i2) {
        bArr[i2] = (byte) (j2 >>> 24);
        bArr[i2 + 1] = (byte) (j2 >>> 16);
        bArr[i2 + 2] = (byte) (j2 >>> 8);
        bArr[i2 + 3] = (byte) j2;
    }

    public static void writeUint48(long j2, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) j2);
    }

    public static void writeUint48(long j2, byte[] bArr, int i2) {
        bArr[i2] = (byte) (j2 >>> 40);
        bArr[i2 + 1] = (byte) (j2 >>> 32);
        bArr[i2 + 2] = (byte) (j2 >>> 24);
        bArr[i2 + 3] = (byte) (j2 >>> 16);
        bArr[i2 + 4] = (byte) (j2 >>> 8);
        bArr[i2 + 5] = (byte) j2;
    }

    public static void writeUint64(long j2, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (j2 >>> 56));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) j2);
    }

    public static void writeUint64(long j2, byte[] bArr, int i2) {
        bArr[i2] = (byte) (j2 >>> 56);
        bArr[i2 + 1] = (byte) (j2 >>> 48);
        bArr[i2 + 2] = (byte) (j2 >>> 40);
        bArr[i2 + 3] = (byte) (j2 >>> 32);
        bArr[i2 + 4] = (byte) (j2 >>> 24);
        bArr[i2 + 5] = (byte) (j2 >>> 16);
        bArr[i2 + 6] = (byte) (j2 >>> 8);
        bArr[i2 + 7] = (byte) j2;
    }

    public static void writeUint8(int i2, OutputStream outputStream) throws IOException {
        outputStream.write(i2);
    }

    public static void writeUint8(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
    }

    public static void writeUint8(short s2, OutputStream outputStream) throws IOException {
        outputStream.write(s2);
    }

    public static void writeUint8(short s2, byte[] bArr, int i2) {
        bArr[i2] = (byte) s2;
    }

    public static void writeUint8Array(short[] sArr, OutputStream outputStream) throws IOException {
        for (short s2 : sArr) {
            writeUint8(s2, outputStream);
        }
    }

    public static void writeUint8Array(short[] sArr, byte[] bArr, int i2) throws IOException {
        for (short s2 : sArr) {
            writeUint8(s2, bArr, i2);
            i2++;
        }
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, OutputStream outputStream) throws IOException {
        checkUint8(sArr.length);
        writeUint8(sArr.length, outputStream);
        writeUint8Array(sArr, outputStream);
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, byte[] bArr, int i2) throws IOException {
        checkUint8(sArr.length);
        writeUint8(sArr.length, bArr, i2);
        writeUint8Array(sArr, bArr, i2 + 1);
    }

    public static void writeVersion(ProtocolVersion protocolVersion, OutputStream outputStream) throws IOException {
        outputStream.write(protocolVersion.getMajorVersion());
        outputStream.write(protocolVersion.getMinorVersion());
    }

    public static void writeVersion(ProtocolVersion protocolVersion, byte[] bArr, int i2) {
        bArr[i2] = (byte) protocolVersion.getMajorVersion();
        bArr[i2 + 1] = (byte) protocolVersion.getMinorVersion();
    }
}
