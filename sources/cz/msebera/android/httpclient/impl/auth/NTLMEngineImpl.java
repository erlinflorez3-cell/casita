package cz.msebera.android.httpclient.impl.auth;

import cz.msebera.android.httpclient.Consts;
import cz.msebera.android.httpclient.extras.Base64;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
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

/* JADX INFO: loaded from: classes5.dex */
final class NTLMEngineImpl implements NTLMEngine {
    static final int FLAG_DOMAIN_PRESENT = 4096;
    static final int FLAG_REQUEST_128BIT_KEY_EXCH = 536870912;
    static final int FLAG_REQUEST_56BIT_ENCRYPTION = Integer.MIN_VALUE;
    static final int FLAG_REQUEST_ALWAYS_SIGN = 32768;
    static final int FLAG_REQUEST_EXPLICIT_KEY_EXCH = 1073741824;
    static final int FLAG_REQUEST_LAN_MANAGER_KEY = 128;
    static final int FLAG_REQUEST_NTLM2_SESSION = 524288;
    static final int FLAG_REQUEST_NTLMv1 = 512;
    static final int FLAG_REQUEST_OEM_ENCODING = 2;
    static final int FLAG_REQUEST_SEAL = 32;
    static final int FLAG_REQUEST_SIGN = 16;
    static final int FLAG_REQUEST_TARGET = 4;
    static final int FLAG_REQUEST_UNICODE_ENCODING = 1;
    static final int FLAG_REQUEST_VERSION = 33554432;
    static final int FLAG_TARGETINFO_PRESENT = 8388608;
    static final int FLAG_WORKSTATION_PRESENT = 8192;
    private static final byte[] MAGIC_TLS_SERVER_ENDPOINT;
    static final int MSV_AV_CHANNEL_BINDINGS = 10;
    static final int MSV_AV_DNS_COMPUTER_NAME = 3;
    static final int MSV_AV_DNS_DOMAIN_NAME = 4;
    static final int MSV_AV_DNS_TREE_NAME = 5;
    static final int MSV_AV_EOL = 0;
    static final int MSV_AV_FLAGS = 6;
    static final int MSV_AV_FLAGS_ACCOUNT_AUTH_CONSTAINED = 1;
    static final int MSV_AV_FLAGS_MIC = 2;
    static final int MSV_AV_FLAGS_UNTRUSTED_TARGET_SPN = 4;
    static final int MSV_AV_NB_COMPUTER_NAME = 1;
    static final int MSV_AV_NB_DOMAIN_NAME = 2;
    static final int MSV_AV_SINGLE_HOST = 8;
    static final int MSV_AV_TARGET_NAME = 9;
    static final int MSV_AV_TIMESTAMP = 7;
    private static final SecureRandom RND_GEN;
    private static final byte[] SEAL_MAGIC_CLIENT;
    private static final byte[] SEAL_MAGIC_SERVER;
    private static final byte[] SIGNATURE;
    private static final byte[] SIGN_MAGIC_CLIENT;
    private static final byte[] SIGN_MAGIC_SERVER;
    private static final String TYPE_1_MESSAGE;
    private static final Charset UNICODE_LITTLE_UNMARKED = Charset.forName(hg.Vd(".F@9D88\u001e:DC:2!97*:2+)", (short) (C1499aX.Xd() ^ (-30692)), (short) (C1499aX.Xd() ^ (-32370))));
    private static final Charset DEFAULT_CHARSET = Consts.ASCII;

    protected static class CipherGen {
        protected final byte[] challenge;
        protected byte[] clientChallenge;
        protected byte[] clientChallenge2;
        protected final long currentTime;
        protected final String domain;
        protected byte[] lanManagerSessionKey;
        protected byte[] lm2SessionResponse;
        protected byte[] lmHash;
        protected byte[] lmResponse;
        protected byte[] lmUserSessionKey;
        protected byte[] lmv2Hash;
        protected byte[] lmv2Response;
        protected byte[] ntlm2SessionResponse;
        protected byte[] ntlm2SessionResponseUserSessionKey;
        protected byte[] ntlmHash;
        protected byte[] ntlmResponse;
        protected byte[] ntlmUserSessionKey;
        protected byte[] ntlmv2Blob;
        protected byte[] ntlmv2Hash;
        protected byte[] ntlmv2Response;
        protected byte[] ntlmv2UserSessionKey;
        protected final String password;
        protected final Random random;
        protected byte[] secondaryKey;
        protected final String target;
        protected final byte[] targetInformation;
        protected byte[] timestamp;
        protected final String user;

        @Deprecated
        public CipherGen(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2);
        }

        @Deprecated
        public CipherGen(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2, bArr3, bArr4, bArr5, bArr6);
        }

        public CipherGen(Random random, long j2, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(random, j2, str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }

        public CipherGen(Random random, long j2, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.lmHash = null;
            this.lmResponse = null;
            this.ntlmHash = null;
            this.ntlmResponse = null;
            this.ntlmv2Hash = null;
            this.lmv2Hash = null;
            this.lmv2Response = null;
            this.ntlmv2Blob = null;
            this.ntlmv2Response = null;
            this.ntlm2SessionResponse = null;
            this.lm2SessionResponse = null;
            this.lmUserSessionKey = null;
            this.ntlmUserSessionKey = null;
            this.ntlmv2UserSessionKey = null;
            this.ntlm2SessionResponseUserSessionKey = null;
            this.lanManagerSessionKey = null;
            this.random = random;
            this.currentTime = j2;
            this.domain = str;
            this.target = str4;
            this.user = str2;
            this.password = str3;
            this.challenge = bArr;
            this.targetInformation = bArr2;
            this.clientChallenge = bArr3;
            this.clientChallenge2 = bArr4;
            this.secondaryKey = bArr5;
            this.timestamp = bArr6;
        }

        public byte[] getClientChallenge() throws NTLMEngineException {
            if (this.clientChallenge == null) {
                this.clientChallenge = NTLMEngineImpl.makeRandomChallenge(this.random);
            }
            return this.clientChallenge;
        }

        public byte[] getClientChallenge2() throws NTLMEngineException {
            if (this.clientChallenge2 == null) {
                this.clientChallenge2 = NTLMEngineImpl.makeRandomChallenge(this.random);
            }
            return this.clientChallenge2;
        }

        public byte[] getLM2SessionResponse() throws NTLMEngineException {
            if (this.lm2SessionResponse == null) {
                byte[] clientChallenge = getClientChallenge();
                byte[] bArr = new byte[24];
                this.lm2SessionResponse = bArr;
                System.arraycopy(clientChallenge, 0, bArr, 0, clientChallenge.length);
                byte[] bArr2 = this.lm2SessionResponse;
                Arrays.fill(bArr2, clientChallenge.length, bArr2.length, (byte) 0);
            }
            return this.lm2SessionResponse;
        }

        public byte[] getLMHash() throws NTLMEngineException {
            if (this.lmHash == null) {
                this.lmHash = NTLMEngineImpl.lmHash(this.password);
            }
            return this.lmHash;
        }

        public byte[] getLMResponse() throws NTLMEngineException {
            if (this.lmResponse == null) {
                this.lmResponse = NTLMEngineImpl.lmResponse(getLMHash(), this.challenge);
            }
            return this.lmResponse;
        }

        public byte[] getLMUserSessionKey() throws NTLMEngineException {
            if (this.lmUserSessionKey == null) {
                this.lmUserSessionKey = new byte[16];
                System.arraycopy(getLMHash(), 0, this.lmUserSessionKey, 0, 8);
                Arrays.fill(this.lmUserSessionKey, 8, 16, (byte) 0);
            }
            return this.lmUserSessionKey;
        }

        public byte[] getLMv2Hash() throws NTLMEngineException {
            if (this.lmv2Hash == null) {
                this.lmv2Hash = NTLMEngineImpl.lmv2Hash(this.domain, this.user, getNTLMHash());
            }
            return this.lmv2Hash;
        }

        public byte[] getLMv2Response() throws NTLMEngineException {
            if (this.lmv2Response == null) {
                this.lmv2Response = NTLMEngineImpl.lmv2Response(getLMv2Hash(), this.challenge, getClientChallenge());
            }
            return this.lmv2Response;
        }

        public byte[] getLanManagerSessionKey() throws NTLMEngineException {
            if (this.lanManagerSessionKey == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(getLMHash(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, 14, (byte) -67);
                    Key keyCreateDESKey = NTLMEngineImpl.createDESKey(bArr, 0);
                    Key keyCreateDESKey2 = NTLMEngineImpl.createDESKey(bArr, 7);
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(getLMResponse(), 0, bArr2, 0, 8);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, keyCreateDESKey);
                    byte[] bArrDoFinal = cipher.doFinal(bArr2);
                    Cipher cipher2 = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher2.init(1, keyCreateDESKey2);
                    byte[] bArrDoFinal2 = cipher2.doFinal(bArr2);
                    byte[] bArr3 = new byte[16];
                    this.lanManagerSessionKey = bArr3;
                    System.arraycopy(bArrDoFinal, 0, bArr3, 0, bArrDoFinal.length);
                    System.arraycopy(bArrDoFinal2, 0, this.lanManagerSessionKey, bArrDoFinal.length, bArrDoFinal2.length);
                } catch (Exception e2) {
                    throw new NTLMEngineException(e2.getMessage(), e2);
                }
            }
            return this.lanManagerSessionKey;
        }

        public byte[] getNTLM2SessionResponse() throws NTLMEngineException {
            if (this.ntlm2SessionResponse == null) {
                this.ntlm2SessionResponse = NTLMEngineImpl.ntlm2SessionResponse(getNTLMHash(), this.challenge, getClientChallenge());
            }
            return this.ntlm2SessionResponse;
        }

        public byte[] getNTLM2SessionResponseUserSessionKey() throws NTLMEngineException {
            if (this.ntlm2SessionResponseUserSessionKey == null) {
                byte[] lM2SessionResponse = getLM2SessionResponse();
                byte[] bArr = this.challenge;
                byte[] bArr2 = new byte[bArr.length + lM2SessionResponse.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                System.arraycopy(lM2SessionResponse, 0, bArr2, this.challenge.length, lM2SessionResponse.length);
                this.ntlm2SessionResponseUserSessionKey = NTLMEngineImpl.hmacMD5(bArr2, getNTLMUserSessionKey());
            }
            return this.ntlm2SessionResponseUserSessionKey;
        }

        public byte[] getNTLMHash() throws NTLMEngineException {
            if (this.ntlmHash == null) {
                this.ntlmHash = NTLMEngineImpl.ntlmHash(this.password);
            }
            return this.ntlmHash;
        }

        public byte[] getNTLMResponse() throws NTLMEngineException {
            if (this.ntlmResponse == null) {
                this.ntlmResponse = NTLMEngineImpl.lmResponse(getNTLMHash(), this.challenge);
            }
            return this.ntlmResponse;
        }

        public byte[] getNTLMUserSessionKey() throws NTLMEngineException {
            if (this.ntlmUserSessionKey == null) {
                MD4 md4 = new MD4();
                md4.update(getNTLMHash());
                this.ntlmUserSessionKey = md4.getOutput();
            }
            return this.ntlmUserSessionKey;
        }

        public byte[] getNTLMv2Blob() throws NTLMEngineException {
            if (this.ntlmv2Blob == null) {
                this.ntlmv2Blob = NTLMEngineImpl.createBlob(getClientChallenge2(), this.targetInformation, getTimestamp());
            }
            return this.ntlmv2Blob;
        }

        public byte[] getNTLMv2Hash() throws NTLMEngineException {
            if (this.ntlmv2Hash == null) {
                this.ntlmv2Hash = NTLMEngineImpl.ntlmv2Hash(this.domain, this.user, getNTLMHash());
            }
            return this.ntlmv2Hash;
        }

        public byte[] getNTLMv2Response() throws NTLMEngineException {
            if (this.ntlmv2Response == null) {
                this.ntlmv2Response = NTLMEngineImpl.lmv2Response(getNTLMv2Hash(), this.challenge, getNTLMv2Blob());
            }
            return this.ntlmv2Response;
        }

        public byte[] getNTLMv2UserSessionKey() throws NTLMEngineException {
            if (this.ntlmv2UserSessionKey == null) {
                byte[] nTLMv2Hash = getNTLMv2Hash();
                byte[] bArr = new byte[16];
                System.arraycopy(getNTLMv2Response(), 0, bArr, 0, 16);
                this.ntlmv2UserSessionKey = NTLMEngineImpl.hmacMD5(bArr, nTLMv2Hash);
            }
            return this.ntlmv2UserSessionKey;
        }

        public byte[] getSecondaryKey() throws NTLMEngineException {
            if (this.secondaryKey == null) {
                this.secondaryKey = NTLMEngineImpl.makeSecondaryKey(this.random);
            }
            return this.secondaryKey;
        }

        public byte[] getTimestamp() {
            if (this.timestamp == null) {
                long j2 = (this.currentTime + 11644473600000L) * 10000;
                this.timestamp = new byte[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    this.timestamp[i2] = (byte) j2;
                    j2 >>>= 8;
                }
            }
            return this.timestamp;
        }
    }

    static class HMACMD5 {
        protected final byte[] ipad;
        protected final MessageDigest md5;
        protected final byte[] opad;

        HMACMD5(byte[] bArr) {
            MessageDigest md5 = NTLMEngineImpl.getMD5();
            this.md5 = md5;
            this.ipad = new byte[64];
            this.opad = new byte[64];
            int length = bArr.length;
            if (length > 64) {
                md5.update(bArr);
                bArr = md5.digest();
                length = bArr.length;
            }
            int i2 = 0;
            while (i2 < length) {
                this.ipad[i2] = (byte) (54 ^ bArr[i2]);
                this.opad[i2] = (byte) (92 ^ bArr[i2]);
                i2++;
            }
            while (i2 < 64) {
                this.ipad[i2] = 54;
                this.opad[i2] = 92;
                i2++;
            }
            this.md5.reset();
            this.md5.update(this.ipad);
        }

        byte[] getOutput() {
            byte[] bArrDigest = this.md5.digest();
            this.md5.update(this.opad);
            return this.md5.digest(bArrDigest);
        }

        void update(byte[] bArr) {
            this.md5.update(bArr);
        }

        void update(byte[] bArr, int i2, int i3) {
            this.md5.update(bArr, i2, i3);
        }
    }

    static class Handle {
        private final byte[] exportedSessionKey;
        private final boolean isConnection;
        final Mode mode;
        private final Cipher rc4;
        private byte[] sealingKey;
        int sequenceNumber = 0;
        private byte[] signingKey;

        Handle(byte[] bArr, Mode mode, boolean z2) throws NTLMEngineException {
            this.exportedSessionKey = bArr;
            this.isConnection = z2;
            this.mode = mode;
            try {
                MessageDigest md5 = NTLMEngineImpl.getMD5();
                MessageDigest md52 = NTLMEngineImpl.getMD5();
                md5.update(bArr);
                md52.update(bArr);
                if (mode == Mode.CLIENT) {
                    md5.update(NTLMEngineImpl.SIGN_MAGIC_CLIENT);
                    md52.update(NTLMEngineImpl.SEAL_MAGIC_CLIENT);
                } else {
                    md5.update(NTLMEngineImpl.SIGN_MAGIC_SERVER);
                    md52.update(NTLMEngineImpl.SEAL_MAGIC_SERVER);
                }
                this.signingKey = md5.digest();
                this.sealingKey = md52.digest();
                this.rc4 = initCipher();
            } catch (Exception e2) {
                throw new NTLMEngineException(e2.getMessage(), e2);
            }
        }

        private void advanceMessageSequence() throws NTLMEngineException {
            if (!this.isConnection) {
                MessageDigest md5 = NTLMEngineImpl.getMD5();
                md5.update(this.sealingKey);
                byte[] bArr = new byte[4];
                NTLMEngineImpl.writeULong(bArr, this.sequenceNumber, 0);
                md5.update(bArr);
                this.sealingKey = md5.digest();
                initCipher();
            }
            this.sequenceNumber++;
        }

        private byte[] computeSignature(byte[] bArr) {
            byte[] bArr2 = new byte[16];
            bArr2[0] = 1;
            bArr2[1] = 0;
            bArr2[2] = 0;
            bArr2[3] = 0;
            HMACMD5 hmacmd5 = new HMACMD5(this.signingKey);
            hmacmd5.update(NTLMEngineImpl.encodeLong(this.sequenceNumber));
            hmacmd5.update(bArr);
            byte[] bArr3 = new byte[8];
            System.arraycopy(hmacmd5.getOutput(), 0, bArr3, 0, 8);
            System.arraycopy(encrypt(bArr3), 0, bArr2, 4, 8);
            NTLMEngineImpl.encodeLong(bArr2, 12, this.sequenceNumber);
            return bArr2;
        }

        private byte[] decrypt(byte[] bArr) {
            return this.rc4.update(bArr);
        }

        private byte[] encrypt(byte[] bArr) {
            return this.rc4.update(bArr);
        }

        private Cipher initCipher() throws NTLMEngineException {
            try {
                Cipher cipher = Cipher.getInstance("RC4");
                if (this.mode == Mode.CLIENT) {
                    cipher.init(1, new SecretKeySpec(this.sealingKey, "RC4"));
                } else {
                    cipher.init(2, new SecretKeySpec(this.sealingKey, "RC4"));
                }
                return cipher;
            } catch (Exception e2) {
                throw new NTLMEngineException(e2.getMessage(), e2);
            }
        }

        private boolean validateSignature(byte[] bArr, byte[] bArr2) {
            return Arrays.equals(bArr, computeSignature(bArr2));
        }

        public byte[] decryptAndVerifySignedMessage(byte[] bArr) throws NTLMEngineException {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            int length = bArr.length - 16;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 16, bArr3, 0, length);
            byte[] bArrDecrypt = decrypt(bArr3);
            if (!validateSignature(bArr2, bArrDecrypt)) {
                throw new NTLMEngineException("Wrong signature");
            }
            advanceMessageSequence();
            return bArrDecrypt;
        }

        public byte[] getSealingKey() {
            return this.sealingKey;
        }

        public byte[] getSigningKey() {
            return this.signingKey;
        }

        public byte[] signAndEncryptMessage(byte[] bArr) throws NTLMEngineException {
            byte[] bArrEncrypt = encrypt(bArr);
            byte[] bArrComputeSignature = computeSignature(bArr);
            byte[] bArr2 = new byte[bArrComputeSignature.length + bArrEncrypt.length];
            System.arraycopy(bArrComputeSignature, 0, bArr2, 0, bArrComputeSignature.length);
            System.arraycopy(bArrEncrypt, 0, bArr2, bArrComputeSignature.length, bArrEncrypt.length);
            advanceMessageSequence();
            return bArr2;
        }
    }

    static class MD4 {
        protected int A = 1732584193;
        protected int B = -271733879;
        protected int C = -1732584194;
        protected int D = 271733878;
        protected long count = 0;
        protected final byte[] dataBuffer = new byte[64];

        MD4() {
        }

        byte[] getOutput() {
            int i2 = (int) ((-1) - (((-1) - this.count) | ((-1) - 63)));
            int i3 = i2 < 56 ? 56 - i2 : 120 - i2;
            byte[] bArr = new byte[i3 + 8];
            bArr[0] = -128;
            for (int i4 = 0; i4 < 8; i4++) {
                bArr[i3 + i4] = (byte) ((this.count * 8) >>> (i4 * 8));
            }
            update(bArr);
            byte[] bArr2 = new byte[16];
            NTLMEngineImpl.writeULong(bArr2, this.A, 0);
            NTLMEngineImpl.writeULong(bArr2, this.B, 4);
            NTLMEngineImpl.writeULong(bArr2, this.C, 8);
            NTLMEngineImpl.writeULong(bArr2, this.D, 12);
            return bArr2;
        }

        protected void processBuffer() {
            int[] iArr = new int[16];
            for (int i2 = 0; i2 < 16; i2++) {
                byte[] bArr = this.dataBuffer;
                int i3 = i2 * 4;
                int i4 = (bArr[i3] & 255) + ((bArr[i3 + 1] & 255) << 8);
                byte b2 = bArr[i3 + 2];
                iArr[i2] = i4 + (((b2 + 255) - (b2 | 255)) << 16) + (((-1) - (((-1) - bArr[i3 + 3]) | ((-1) - 255))) << 24);
            }
            int i5 = this.A;
            int i6 = this.B;
            int i7 = this.C;
            int i8 = this.D;
            round1(iArr);
            round2(iArr);
            round3(iArr);
            this.A += i5;
            this.B += i6;
            this.C += i7;
            this.D += i8;
        }

        protected void round1(int[] iArr) {
            int iRotintlft = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.F(this.B, this.C, this.D) + iArr[0], 3);
            this.A = iRotintlft;
            int iRotintlft2 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.F(iRotintlft, this.B, this.C) + iArr[1], 7);
            this.D = iRotintlft2;
            int iRotintlft3 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.F(iRotintlft2, this.A, this.B) + iArr[2], 11);
            this.C = iRotintlft3;
            int iRotintlft4 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.F(iRotintlft3, this.D, this.A) + iArr[3], 19);
            this.B = iRotintlft4;
            int iRotintlft5 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.F(iRotintlft4, this.C, this.D) + iArr[4], 3);
            this.A = iRotintlft5;
            int iRotintlft6 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.F(iRotintlft5, this.B, this.C) + iArr[5], 7);
            this.D = iRotintlft6;
            int iRotintlft7 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.F(iRotintlft6, this.A, this.B) + iArr[6], 11);
            this.C = iRotintlft7;
            int iRotintlft8 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.F(iRotintlft7, this.D, this.A) + iArr[7], 19);
            this.B = iRotintlft8;
            int iRotintlft9 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.F(iRotintlft8, this.C, this.D) + iArr[8], 3);
            this.A = iRotintlft9;
            int iRotintlft10 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.F(iRotintlft9, this.B, this.C) + iArr[9], 7);
            this.D = iRotintlft10;
            int iRotintlft11 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.F(iRotintlft10, this.A, this.B) + iArr[10], 11);
            this.C = iRotintlft11;
            int iRotintlft12 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.F(iRotintlft11, this.D, this.A) + iArr[11], 19);
            this.B = iRotintlft12;
            int iRotintlft13 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.F(iRotintlft12, this.C, this.D) + iArr[12], 3);
            this.A = iRotintlft13;
            int iRotintlft14 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.F(iRotintlft13, this.B, this.C) + iArr[13], 7);
            this.D = iRotintlft14;
            int iRotintlft15 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.F(iRotintlft14, this.A, this.B) + iArr[14], 11);
            this.C = iRotintlft15;
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.F(iRotintlft15, this.D, this.A) + iArr[15], 19);
        }

        protected void round2(int[] iArr) {
            int iRotintlft = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.G(this.B, this.C, this.D) + iArr[0] + 1518500249, 3);
            this.A = iRotintlft;
            int iRotintlft2 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.G(iRotintlft, this.B, this.C) + iArr[4] + 1518500249, 5);
            this.D = iRotintlft2;
            int iRotintlft3 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.G(iRotintlft2, this.A, this.B) + iArr[8] + 1518500249, 9);
            this.C = iRotintlft3;
            int iRotintlft4 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.G(iRotintlft3, this.D, this.A) + iArr[12] + 1518500249, 13);
            this.B = iRotintlft4;
            int iRotintlft5 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.G(iRotintlft4, this.C, this.D) + iArr[1] + 1518500249, 3);
            this.A = iRotintlft5;
            int iRotintlft6 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.G(iRotintlft5, this.B, this.C) + iArr[5] + 1518500249, 5);
            this.D = iRotintlft6;
            int iRotintlft7 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.G(iRotintlft6, this.A, this.B) + iArr[9] + 1518500249, 9);
            this.C = iRotintlft7;
            int iRotintlft8 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.G(iRotintlft7, this.D, this.A) + iArr[13] + 1518500249, 13);
            this.B = iRotintlft8;
            int iRotintlft9 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.G(iRotintlft8, this.C, this.D) + iArr[2] + 1518500249, 3);
            this.A = iRotintlft9;
            int iRotintlft10 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.G(iRotintlft9, this.B, this.C) + iArr[6] + 1518500249, 5);
            this.D = iRotintlft10;
            int iRotintlft11 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.G(iRotintlft10, this.A, this.B) + iArr[10] + 1518500249, 9);
            this.C = iRotintlft11;
            int iRotintlft12 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.G(iRotintlft11, this.D, this.A) + iArr[14] + 1518500249, 13);
            this.B = iRotintlft12;
            int iRotintlft13 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.G(iRotintlft12, this.C, this.D) + iArr[3] + 1518500249, 3);
            this.A = iRotintlft13;
            int iRotintlft14 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.G(iRotintlft13, this.B, this.C) + iArr[7] + 1518500249, 5);
            this.D = iRotintlft14;
            int iRotintlft15 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.G(iRotintlft14, this.A, this.B) + iArr[11] + 1518500249, 9);
            this.C = iRotintlft15;
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.G(iRotintlft15, this.D, this.A) + iArr[15] + 1518500249, 13);
        }

        protected void round3(int[] iArr) {
            int iRotintlft = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.H(this.B, this.C, this.D) + iArr[0] + 1859775393, 3);
            this.A = iRotintlft;
            int iRotintlft2 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.H(iRotintlft, this.B, this.C) + iArr[8] + 1859775393, 9);
            this.D = iRotintlft2;
            int iRotintlft3 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.H(iRotintlft2, this.A, this.B) + iArr[4] + 1859775393, 11);
            this.C = iRotintlft3;
            int iRotintlft4 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.H(iRotintlft3, this.D, this.A) + iArr[12] + 1859775393, 15);
            this.B = iRotintlft4;
            int iRotintlft5 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.H(iRotintlft4, this.C, this.D) + iArr[2] + 1859775393, 3);
            this.A = iRotintlft5;
            int iRotintlft6 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.H(iRotintlft5, this.B, this.C) + iArr[10] + 1859775393, 9);
            this.D = iRotintlft6;
            int iRotintlft7 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.H(iRotintlft6, this.A, this.B) + iArr[6] + 1859775393, 11);
            this.C = iRotintlft7;
            int iRotintlft8 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.H(iRotintlft7, this.D, this.A) + iArr[14] + 1859775393, 15);
            this.B = iRotintlft8;
            int iRotintlft9 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.H(iRotintlft8, this.C, this.D) + iArr[1] + 1859775393, 3);
            this.A = iRotintlft9;
            int iRotintlft10 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.H(iRotintlft9, this.B, this.C) + iArr[9] + 1859775393, 9);
            this.D = iRotintlft10;
            int iRotintlft11 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.H(iRotintlft10, this.A, this.B) + iArr[5] + 1859775393, 11);
            this.C = iRotintlft11;
            int iRotintlft12 = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.H(iRotintlft11, this.D, this.A) + iArr[13] + 1859775393, 15);
            this.B = iRotintlft12;
            int iRotintlft13 = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.H(iRotintlft12, this.C, this.D) + iArr[3] + 1859775393, 3);
            this.A = iRotintlft13;
            int iRotintlft14 = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.H(iRotintlft13, this.B, this.C) + iArr[11] + 1859775393, 9);
            this.D = iRotintlft14;
            int iRotintlft15 = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.H(iRotintlft14, this.A, this.B) + iArr[7] + 1859775393, 11);
            this.C = iRotintlft15;
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.H(iRotintlft15, this.D, this.A) + iArr[15] + 1859775393, 15);
        }

        void update(byte[] bArr) {
            byte[] bArr2;
            int i2 = (int) (this.count & 63);
            int i3 = 0;
            while (true) {
                int length = (bArr.length - i3) + i2;
                bArr2 = this.dataBuffer;
                if (length < bArr2.length) {
                    break;
                }
                int length2 = bArr2.length - i2;
                System.arraycopy(bArr, i3, bArr2, i2, length2);
                this.count += (long) length2;
                i3 += length2;
                processBuffer();
                i2 = 0;
            }
            if (i3 < bArr.length) {
                int length3 = bArr.length - i3;
                System.arraycopy(bArr, i3, bArr2, i2, length3);
                this.count += (long) length3;
            }
        }
    }

    enum Mode {
        CLIENT,
        SERVER
    }

    static class NTLMMessage {
        protected int currentOutputPosition;
        protected byte[] messageContents;

        NTLMMessage() {
            this.messageContents = null;
            this.currentOutputPosition = 0;
        }

        NTLMMessage(String str, int i2) throws NTLMEngineException {
            this(Base64.decode(str.getBytes(NTLMEngineImpl.DEFAULT_CHARSET), 2), i2);
        }

        NTLMMessage(byte[] bArr, int i2) throws NTLMEngineException {
            this.currentOutputPosition = 0;
            this.messageContents = bArr;
            if (bArr.length < NTLMEngineImpl.SIGNATURE.length) {
                throw new NTLMEngineException("NTLM message decoding error - packet too short");
            }
            for (int i3 = 0; i3 < NTLMEngineImpl.SIGNATURE.length; i3++) {
                if (this.messageContents[i3] != NTLMEngineImpl.SIGNATURE[i3]) {
                    throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                }
            }
            int uLong = readULong(NTLMEngineImpl.SIGNATURE.length);
            if (uLong != i2) {
                throw new NTLMEngineException("NTLM type " + Integer.toString(i2) + " message expected - instead got type " + Integer.toString(uLong));
            }
            this.currentOutputPosition = this.messageContents.length;
        }

        protected void addByte(byte b2) {
            byte[] bArr = this.messageContents;
            int i2 = this.currentOutputPosition;
            bArr[i2] = b2;
            this.currentOutputPosition = i2 + 1;
        }

        protected void addBytes(byte[] bArr) {
            if (bArr == null) {
                return;
            }
            for (byte b2 : bArr) {
                byte[] bArr2 = this.messageContents;
                int i2 = this.currentOutputPosition;
                bArr2[i2] = b2;
                this.currentOutputPosition = i2 + 1;
            }
        }

        protected void addULong(int i2) {
            addByte((byte) (255 & i2));
            addByte((byte) ((i2 >> 8) & 255));
            int i3 = i2 >> 16;
            addByte((byte) ((i3 + 255) - (i3 | 255)));
            addByte((byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255))));
        }

        protected void addUShort(int i2) {
            addByte((byte) (255 & i2));
            int i3 = i2 >> 8;
            addByte((byte) ((i3 + 255) - (i3 | 255)));
        }

        protected void buildMessage() {
            throw new RuntimeException("Message builder not implemented for " + getClass().getName());
        }

        public byte[] getBytes() {
            if (this.messageContents == null) {
                buildMessage();
            }
            byte[] bArr = this.messageContents;
            int length = bArr.length;
            int i2 = this.currentOutputPosition;
            if (length > i2) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                this.messageContents = bArr2;
            }
            return this.messageContents;
        }

        protected int getMessageLength() {
            return this.currentOutputPosition;
        }

        protected int getPreambleLength() {
            return NTLMEngineImpl.SIGNATURE.length + 4;
        }

        public String getResponse() {
            return new String(Base64.encode(getBytes(), 2), Consts.ASCII);
        }

        protected void prepareResponse(int i2, int i3) {
            this.messageContents = new byte[i2];
            this.currentOutputPosition = 0;
            addBytes(NTLMEngineImpl.SIGNATURE);
            addULong(i3);
        }

        protected byte readByte(int i2) throws NTLMEngineException {
            byte[] bArr = this.messageContents;
            if (bArr.length >= i2 + 1) {
                return bArr[i2];
            }
            throw new NTLMEngineException("NTLM: Message too short");
        }

        protected void readBytes(byte[] bArr, int i2) throws NTLMEngineException {
            byte[] bArr2 = this.messageContents;
            if (bArr2.length < bArr.length + i2) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            System.arraycopy(bArr2, i2, bArr, 0, bArr.length);
        }

        protected byte[] readSecurityBuffer(int i2) throws NTLMEngineException {
            return NTLMEngineImpl.readSecurityBuffer(this.messageContents, i2);
        }

        protected int readULong(int i2) throws NTLMEngineException {
            return NTLMEngineImpl.readULong(this.messageContents, i2);
        }

        protected int readUShort(int i2) throws NTLMEngineException {
            return NTLMEngineImpl.readUShort(this.messageContents, i2);
        }
    }

    static class Type1Message extends NTLMMessage {
        private final byte[] domainBytes;
        private final int flags;
        private final byte[] hostBytes;

        Type1Message() {
            this.hostBytes = null;
            this.domainBytes = null;
            this.flags = getDefaultFlags();
        }

        Type1Message(String str, String str2) throws NTLMEngineException {
            this(str, str2, null);
        }

        Type1Message(String str, String str2, Integer num) throws NTLMEngineException {
            this.flags = num == null ? getDefaultFlags() : num.intValue();
            String strConvertHost = NTLMEngineImpl.convertHost(str2);
            String strConvertDomain = NTLMEngineImpl.convertDomain(str);
            this.hostBytes = strConvertHost != null ? strConvertHost.getBytes(NTLMEngineImpl.UNICODE_LITTLE_UNMARKED) : null;
            this.domainBytes = strConvertDomain != null ? strConvertDomain.toUpperCase(Locale.ROOT).getBytes(NTLMEngineImpl.UNICODE_LITTLE_UNMARKED) : null;
        }

        private int getDefaultFlags() {
            return -1576500735;
        }

        @Override // cz.msebera.android.httpclient.impl.auth.NTLMEngineImpl.NTLMMessage
        protected void buildMessage() {
            byte[] bArr = this.domainBytes;
            int length = bArr != null ? bArr.length : 0;
            byte[] bArr2 = this.hostBytes;
            int length2 = bArr2 != null ? bArr2.length : 0;
            prepareResponse(length2 + 40 + length, 1);
            addULong(this.flags);
            addUShort(length);
            addUShort(length);
            addULong(length2 + 40);
            addUShort(length2);
            addUShort(length2);
            addULong(40);
            addUShort(261);
            addULong(2600);
            addUShort(3840);
            byte[] bArr3 = this.hostBytes;
            if (bArr3 != null) {
                addBytes(bArr3);
            }
            byte[] bArr4 = this.domainBytes;
            if (bArr4 != null) {
                addBytes(bArr4);
            }
        }
    }

    static class Type2Message extends NTLMMessage {
        protected final byte[] challenge;
        protected final int flags;
        protected String target;
        protected byte[] targetInfo;

        Type2Message(String str) throws NTLMEngineException {
            this(Base64.decode(str.getBytes(NTLMEngineImpl.DEFAULT_CHARSET), 2));
        }

        Type2Message(byte[] bArr) throws NTLMEngineException {
            super(bArr, 2);
            byte[] bArr2 = new byte[8];
            this.challenge = bArr2;
            readBytes(bArr2, 24);
            int uLong = readULong(20);
            this.flags = uLong;
            this.target = null;
            if (getMessageLength() >= 20) {
                byte[] securityBuffer = readSecurityBuffer(12);
                if (securityBuffer.length != 0) {
                    this.target = new String(securityBuffer, NTLMEngineImpl.getCharset(uLong));
                }
            }
            this.targetInfo = null;
            if (getMessageLength() >= 48) {
                byte[] securityBuffer2 = readSecurityBuffer(40);
                if (securityBuffer2.length != 0) {
                    this.targetInfo = securityBuffer2;
                }
            }
        }

        byte[] getChallenge() {
            return this.challenge;
        }

        int getFlags() {
            return this.flags;
        }

        String getTarget() {
            return this.target;
        }

        byte[] getTargetInfo() {
            return this.targetInfo;
        }
    }

    static class Type3Message extends NTLMMessage {
        protected final boolean computeMic;
        protected final byte[] domainBytes;
        protected final byte[] exportedSessionKey;
        protected final byte[] hostBytes;
        protected byte[] lmResp;
        protected byte[] ntResp;
        protected final byte[] sessionKey;
        protected final byte[] type1Message;
        protected final int type2Flags;
        protected final byte[] type2Message;
        protected final byte[] userBytes;

        Type3Message(String str, String str2, String str3, String str4, byte[] bArr, int i2, String str5, byte[] bArr2) throws NTLMEngineException {
            this(str, str2, str3, str4, bArr, i2, str5, bArr2, null, null, null);
        }

        Type3Message(String str, String str2, String str3, String str4, byte[] bArr, int i2, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws NTLMEngineException {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, str4, bArr, i2, str5, bArr2, certificate, bArr3, bArr4);
        }

        Type3Message(Random random, long j2, String str, String str2, String str3, String str4, byte[] bArr, int i2, String str5, byte[] bArr2) throws NTLMEngineException {
            this(random, j2, str, str2, str3, str4, bArr, i2, str5, bArr2, null, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v9 */
        Type3Message(Random random, long j2, String str, String str2, String str3, String str4, byte[] bArr, int i2, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws Throwable {
            byte[] bArrAddGssMicAvsToTargetInfo;
            if (random == null) {
                throw new NTLMEngineException("Random generator not available");
            }
            this.type2Flags = i2;
            this.type1Message = bArr3;
            this.type2Message = bArr4;
            String strConvertHost = NTLMEngineImpl.convertHost(str2);
            String strConvertDomain = NTLMEngineImpl.convertDomain(str);
            int lanManagerSessionKey = 0;
            if (certificate != null) {
                bArrAddGssMicAvsToTargetInfo = addGssMicAvsToTargetInfo(bArr2, certificate);
                this.computeMic = true;
            } else {
                this.computeMic = false;
                bArrAddGssMicAvsToTargetInfo = bArr2;
            }
            CipherGen cipherGen = new CipherGen(random, j2, strConvertDomain, str3, str4, bArr, str5, bArrAddGssMicAvsToTargetInfo);
            try {
                if ((8388608 + i2) - (8388608 | i2) != 0 && bArr2 != null && str5 != null) {
                    this.ntResp = cipherGen.getNTLMv2Response();
                    this.lmResp = cipherGen.getLMv2Response();
                    lanManagerSessionKey = (i2 & 128) != 0 ? cipherGen.getLanManagerSessionKey() : cipherGen.getNTLMv2UserSessionKey();
                } else if ((-1) - (((-1) - 524288) | ((-1) - i2)) != 0) {
                    this.ntResp = cipherGen.getNTLM2SessionResponse();
                    this.lmResp = cipherGen.getLM2SessionResponse();
                    lanManagerSessionKey = (i2 + 128) - (i2 | 128) != 0 ? cipherGen.getLanManagerSessionKey() : cipherGen.getNTLM2SessionResponseUserSessionKey();
                } else {
                    this.ntResp = cipherGen.getNTLMResponse();
                    this.lmResp = cipherGen.getLMResponse();
                    lanManagerSessionKey = (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? cipherGen.getLanManagerSessionKey() : cipherGen.getNTLMUserSessionKey();
                }
            } catch (NTLMEngineException unused) {
                this.ntResp = new byte[lanManagerSessionKey];
                this.lmResp = cipherGen.getLMResponse();
                lanManagerSessionKey = (i2 + 128) - (i2 | 128) != 0 ? cipherGen.getLanManagerSessionKey() : cipherGen.getLMUserSessionKey();
            }
            if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
                if ((1073741824 & i2) != 0) {
                    byte[] secondaryKey = cipherGen.getSecondaryKey();
                    this.exportedSessionKey = secondaryKey;
                    this.sessionKey = NTLMEngineImpl.RC4(secondaryKey, lanManagerSessionKey);
                } else {
                    this.sessionKey = lanManagerSessionKey;
                    this.exportedSessionKey = lanManagerSessionKey;
                }
            } else {
                if (this.computeMic) {
                    throw new NTLMEngineException("Cannot sign/seal: no exported session key");
                }
                this.sessionKey = null;
                this.exportedSessionKey = null;
            }
            Charset charset = NTLMEngineImpl.getCharset(i2);
            this.hostBytes = strConvertHost != null ? strConvertHost.getBytes(charset) : null;
            this.domainBytes = strConvertDomain != null ? strConvertDomain.toUpperCase(Locale.ROOT).getBytes(charset) : null;
            this.userBytes = str3.getBytes(charset);
        }

        private byte[] addGssMicAvsToTargetInfo(byte[] bArr, Certificate certificate) throws Throwable {
            byte[] bArr2 = new byte[bArr.length + 28];
            int length = bArr.length;
            int i2 = length - 4;
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            NTLMEngineImpl.writeUShort(bArr2, 6, i2);
            NTLMEngineImpl.writeUShort(bArr2, 4, length - 2);
            NTLMEngineImpl.writeULong(bArr2, 2, length);
            NTLMEngineImpl.writeUShort(bArr2, 10, length + 4);
            NTLMEngineImpl.writeUShort(bArr2, 16, length + 6);
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Xd("( 6\"o6)(;91=Cx/2@C}\u00147EH><@;:N@", (short) (Od.Xd() ^ (-14400)))).getMethod(Wg.vd("/,>\u000e:.=1%#", (short) (OY.Xd() ^ 30910)), new Class[0]);
                try {
                    method.setAccessible(true);
                    byte[] bArrDigest = MessageDigest.getInstance(Qg.kd("th`KOQQ", (short) (C1499aX.Xd() ^ (-32020)), (short) (C1499aX.Xd() ^ (-19050)))).digest((byte[]) method.invoke(certificate, objArr));
                    byte[] bArr3 = new byte[NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length + 20 + bArrDigest.length];
                    NTLMEngineImpl.writeULong(bArr3, 53, 16);
                    System.arraycopy(NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT, 0, bArr3, 20, NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length);
                    System.arraycopy(bArrDigest, 0, bArr3, NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length + 20, bArrDigest.length);
                    System.arraycopy(NTLMEngineImpl.getMD5().digest(bArr3), 0, bArr2, length + 8, 16);
                    return bArr2;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new NTLMEngineException(e3.getMessage(), e3);
            } catch (CertificateEncodingException e4) {
                throw new NTLMEngineException(e4.getMessage(), e4);
            }
        }

        @Override // cz.msebera.android.httpclient.impl.auth.NTLMEngineImpl.NTLMMessage
        protected void buildMessage() {
            int i2;
            int length = this.ntResp.length;
            int length2 = this.lmResp.length;
            byte[] bArr = this.domainBytes;
            int length3 = bArr != null ? bArr.length : 0;
            byte[] bArr2 = this.hostBytes;
            int length4 = bArr2 != null ? bArr2.length : 0;
            int length5 = this.userBytes.length;
            byte[] bArr3 = this.sessionKey;
            int length6 = bArr3 != null ? bArr3.length : 0;
            int i3 = (this.computeMic ? 16 : 0) + 72;
            int i4 = i3 + length2;
            int i5 = i4 + length;
            int i6 = i5 + length3;
            int i7 = i6 + length5;
            int i8 = i7 + length4;
            prepareResponse(i8 + length6, 3);
            addUShort(length2);
            addUShort(length2);
            addULong(i3);
            addUShort(length);
            addUShort(length);
            addULong(i4);
            addUShort(length3);
            addUShort(length3);
            addULong(i5);
            addUShort(length5);
            addUShort(length5);
            addULong(i6);
            addUShort(length4);
            addUShort(length4);
            addULong(i7);
            addUShort(length6);
            addUShort(length6);
            addULong(i8);
            addULong(this.type2Flags);
            addUShort(261);
            addULong(2600);
            addUShort(3840);
            if (this.computeMic) {
                i2 = this.currentOutputPosition;
                this.currentOutputPosition += 16;
            } else {
                i2 = -1;
            }
            addBytes(this.lmResp);
            addBytes(this.ntResp);
            addBytes(this.domainBytes);
            addBytes(this.userBytes);
            addBytes(this.hostBytes);
            byte[] bArr4 = this.sessionKey;
            if (bArr4 != null) {
                addBytes(bArr4);
            }
            if (this.computeMic) {
                HMACMD5 hmacmd5 = new HMACMD5(this.exportedSessionKey);
                hmacmd5.update(this.type1Message);
                hmacmd5.update(this.type2Message);
                hmacmd5.update(this.messageContents);
                byte[] output = hmacmd5.getOutput();
                System.arraycopy(output, 0, this.messageContents, i2, output.length);
            }
        }

        public byte[] getEncryptedRandomSessionKey() {
            return this.sessionKey;
        }

        public byte[] getExportedSessionKey() {
            return this.exportedSessionKey;
        }
    }

    static {
        SecureRandom secureRandom;
        String strUd = C1561oA.ud("\u0017\u000b\u0003q\u0010\u0011\f\u0004", (short) (Od.Xd() ^ (-23655)));
        try {
            Class<?> cls = Class.forName(C1561oA.yd("\u0002y\fwI\u0010~}\u0005\u0003v\u0003\rBdw\u000b\u001e\u0018\f}\u000e\u0018\u000f\u000f\u000e", (short) (C1580rY.Xd() ^ (-8757))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Yd("$\u001c2\u001ek+!/)p\u001798060", (short) (C1499aX.Xd() ^ (-14179))));
            Object[] objArr = {strUd};
            Method declaredMethod = cls.getDeclaredMethod(Xg.qd("edtJpvxftjm", (short) (Od.Xd() ^ (-26566)), (short) (Od.Xd() ^ (-21299))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                secureRandom = (SecureRandom) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
            secureRandom = null;
        }
        RND_GEN = secureRandom;
        SIGNATURE = getNullTerminatedAsciiString(Jg.Wd("o\tDa-|\u0001", (short) (Od.Xd() ^ (-30929)), (short) (Od.Xd() ^ (-4622))));
        SIGN_MAGIC_SERVER = getNullTerminatedAsciiString(ZO.xd("~\u000bqbttN>\u0012YO\u000by}r1<\u001c,I8\u001b\u0004XNgH{\u001eN=S\fy\u001c\u001dh>dCAZ\u0002lg~\b\u0004z\"[MA\u0003_,)R", (short) (FB.Xd() ^ 1802), (short) (FB.Xd() ^ 28536)));
        SIGN_MAGIC_CLIENT = getNullTerminatedAsciiString(C1626yg.Ud("\u0017\u001f@gnQqOpc],w.\u0002\u0016ZU#<\u0010Il5M\u0010\u001ezd;{OBm\u0014\u000ff>}xz\u0011G]dC8X+G\u001a\tkTgOdN", (short) (FB.Xd() ^ 25248), (short) (FB.Xd() ^ 32292)));
        short sXd = (short) (C1499aX.Xd() ^ (-16321));
        int[] iArr = new int["y\u001c\\w%~MVgt\u0007Oq>\u000bDm\u00050C\u0016\u007f\u001d\u0018Gu\\\tne;L\u0004W{<#\u007f\u0018F\nsQad0\u001cx~Un\u001d\n}\u001f>Ku".length()];
        QB qb = new QB("y\u001c\\w%~MVgt\u0007Oq>\u000bDm\u00050C\u0016\u007f\u001d\u0018Gu\\\tne;L\u0004W{<#\u007f\u0018F\nsQad0\u001cx~Un\u001d\n}\u001f>Ku");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        SEAL_MAGIC_SERVER = getNullTerminatedAsciiString(new String(iArr, 0, i2));
        short sXd2 = (short) (ZN.Xd() ^ 22013);
        int[] iArr2 = new int["*kM'o#03JQe,PG}`?(m@\u0002\u0004[TMBW\u000e>@k86C\u007fJj\u00167[-\u0012tv\u0001bo!\u000b\"\u0018p\u0016%d@I3".length()];
        QB qb2 = new QB("*kM'o#03JQe,PG}`?(m@\u0002\u0004[TMBW\u000e>@k86C\u007fJj\u00167[-\u0012tv\u0001bo!\u000b\"\u0018p\u0016%d@I3");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        SEAL_MAGIC_CLIENT = getNullTerminatedAsciiString(new String(iArr2, 0, i3));
        MAGIC_TLS_SERVER_ENDPOINT = C1561oA.Qd("ULR\u000bPAMP>J\u0004;C8\u007fB@9=B\u0007", (short) (C1607wl.Xd() ^ 16739)).getBytes(Consts.ASCII);
        TYPE_1_MESSAGE = new Type1Message().getResponse();
    }

    NTLMEngineImpl() {
    }

    static int F(int i2, int i3, int i4) {
        return ((-1) - (((-1) - (~i2)) | ((-1) - i4))) | (i3 & i2);
    }

    static int G(int i2, int i3, int i4) {
        return (-1) - (((-1) - (i2 & ((-1) - (((-1) - i3) & ((-1) - i4))))) & ((-1) - (i3 & i4)));
    }

    static int H(int i2, int i3, int i4) {
        return (i2 ^ i3) ^ i4;
    }

    static byte[] RC4(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr2, "RC4"));
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            throw new NTLMEngineException(e2.getMessage(), e2);
        }
    }

    public static String convertDomain(String str) {
        return stripDotSuffix(str);
    }

    public static String convertHost(String str) {
        return stripDotSuffix(str);
    }

    public static byte[] createBlob(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr3.length + 20 + bArr2.length + 4];
        System.arraycopy(new byte[]{1, 1, 0, 0}, 0, bArr4, 0, 4);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, 4, 4);
        System.arraycopy(bArr3, 0, bArr4, 8, bArr3.length);
        int length = bArr3.length;
        System.arraycopy(bArr, 0, bArr4, 8 + length, 8);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, length + 16, 4);
        int i2 = length + 20;
        System.arraycopy(bArr2, 0, bArr4, i2, bArr2.length);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, i2 + bArr2.length, 4);
        return bArr4;
    }

    public static Key createDESKey(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i2, bArr2, 0, 7);
        byte b2 = bArr2[0];
        byte b3 = bArr2[1];
        byte b4 = (byte) ((-1) - (((-1) - (b2 << 7)) & ((-1) - ((255 & b3) >>> 1))));
        int i3 = b3 << 6;
        byte b5 = bArr2[2];
        int i4 = ((-1) - (((-1) - b5) | ((-1) - 255))) >>> 2;
        byte b6 = (byte) ((i3 + i4) - (i3 & i4));
        byte b7 = bArr2[3];
        byte b8 = (byte) ((b5 << 5) | ((255 & b7) >>> 3));
        byte b9 = bArr2[4];
        byte b10 = (byte) ((b7 << 4) | ((255 & b9) >>> 4));
        byte b11 = bArr2[5];
        byte b12 = (byte) ((-1) - (((-1) - (((-1) - (((-1) - b11) | ((-1) - 255))) >>> 5)) & ((-1) - (b9 << 3))));
        int i5 = b11 << 2;
        byte b13 = bArr2[6];
        byte[] bArr3 = {b2, b4, b6, b8, b10, b12, (byte) ((-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - b13) | ((-1) - 255))) >>> 6)))), (byte) (b13 << 1)};
        oddParity(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    public static void encodeLong(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) ((i3 + 255) - (255 | i3));
        bArr[i2 + 1] = (byte) ((i3 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((-1) - (((-1) - (i3 >> 16)) | ((-1) - 255)));
        bArr[i2 + 3] = (byte) ((i3 >> 24) & 255);
    }

    public static byte[] encodeLong(int i2) {
        byte[] bArr = new byte[4];
        encodeLong(bArr, 0, i2);
        return bArr;
    }

    public static Charset getCharset(int i2) throws NTLMEngineException {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0) {
            return DEFAULT_CHARSET;
        }
        Charset charset = UNICODE_LITTLE_UNMARKED;
        if (charset != null) {
            return charset;
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    static MessageDigest getMD5() {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("MD5 message digest doesn't seem to exist - fatal error: " + e2.getMessage(), e2);
        }
    }

    private static byte[] getNullTerminatedAsciiString(String str) {
        byte[] bytes = str.getBytes(Consts.ASCII);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        return bArr;
    }

    static String getType1Message(String str, String str2) {
        return TYPE_1_MESSAGE;
    }

    static String getType3Message(String str, String str2, String str3, String str4, byte[] bArr, int i2, String str5, byte[] bArr2) throws NTLMEngineException {
        return new Type3Message(str4, str3, str, str2, bArr, i2, str5, bArr2).getResponse();
    }

    static String getType3Message(String str, String str2, String str3, String str4, byte[] bArr, int i2, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws NTLMEngineException {
        return new Type3Message(str4, str3, str, str2, bArr, i2, str5, bArr2, certificate, bArr3, bArr4).getResponse();
    }

    static byte[] hmacMD5(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        HMACMD5 hmacmd5 = new HMACMD5(bArr2);
        hmacmd5.update(bArr);
        return hmacmd5.getOutput();
    }

    public static byte[] lmHash(String str) throws NTLMEngineException {
        try {
            byte[] bytes = str.toUpperCase(Locale.ROOT).getBytes(Consts.ASCII);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key keyCreateDESKey = createDESKey(bArr, 0);
            Key keyCreateDESKey2 = createDESKey(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(Consts.ASCII);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, keyCreateDESKey);
            byte[] bArrDoFinal = cipher.doFinal(bytes2);
            cipher.init(1, keyCreateDESKey2);
            byte[] bArrDoFinal2 = cipher.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArrDoFinal, 0, bArr2, 0, 8);
            System.arraycopy(bArrDoFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e2) {
            throw new NTLMEngineException(e2.getMessage(), e2);
        }
    }

    public static byte[] lmResponse(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key keyCreateDESKey = createDESKey(bArr3, 0);
            Key keyCreateDESKey2 = createDESKey(bArr3, 7);
            Key keyCreateDESKey3 = createDESKey(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, keyCreateDESKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            cipher.init(1, keyCreateDESKey2);
            byte[] bArrDoFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, keyCreateDESKey3);
            byte[] bArrDoFinal3 = cipher.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(bArrDoFinal, 0, bArr4, 0, 8);
            System.arraycopy(bArrDoFinal2, 0, bArr4, 8, 8);
            System.arraycopy(bArrDoFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e2) {
            throw new NTLMEngineException(e2.getMessage(), e2);
        }
    }

    public static byte[] lmv2Hash(String str, String str2, byte[] bArr) throws NTLMEngineException {
        Charset charset = UNICODE_LITTLE_UNMARKED;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        hmacmd5.update(str2.toUpperCase(Locale.ROOT).getBytes(charset));
        if (str != null) {
            hmacmd5.update(str.toUpperCase(Locale.ROOT).getBytes(charset));
        }
        return hmacmd5.getOutput();
    }

    public static byte[] lmv2Response(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        hmacmd5.update(bArr2);
        hmacmd5.update(bArr3);
        byte[] output = hmacmd5.getOutput();
        byte[] bArr4 = new byte[output.length + bArr3.length];
        System.arraycopy(output, 0, bArr4, 0, output.length);
        System.arraycopy(bArr3, 0, bArr4, output.length, bArr3.length);
        return bArr4;
    }

    public static byte[] makeRandomChallenge(Random random) {
        byte[] bArr = new byte[8];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    public static byte[] makeSecondaryKey(Random random) {
        byte[] bArr = new byte[16];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    static byte[] ntlm2SessionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NTLMEngineException {
        try {
            MessageDigest md5 = getMD5();
            md5.update(bArr2);
            md5.update(bArr3);
            byte[] bArr4 = new byte[8];
            System.arraycopy(md5.digest(), 0, bArr4, 0, 8);
            return lmResponse(bArr, bArr4);
        } catch (Exception e2) {
            if (e2 instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e2);
            }
            throw new NTLMEngineException(e2.getMessage(), e2);
        }
    }

    public static byte[] ntlmHash(String str) throws NTLMEngineException {
        Charset charset = UNICODE_LITTLE_UNMARKED;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        byte[] bytes = str.getBytes(charset);
        MD4 md4 = new MD4();
        md4.update(bytes);
        return md4.getOutput();
    }

    public static byte[] ntlmv2Hash(String str, String str2, byte[] bArr) throws NTLMEngineException {
        Charset charset = UNICODE_LITTLE_UNMARKED;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        hmacmd5.update(str2.toUpperCase(Locale.ROOT).getBytes(charset));
        if (str != null) {
            hmacmd5.update(str.getBytes(charset));
        }
        return hmacmd5.getOutput();
    }

    private static void oddParity(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            if (((((((((b2 >>> 7) ^ (b2 >>> 6)) ^ (b2 >>> 5)) ^ (b2 >>> 4)) ^ (b2 >>> 3)) ^ (b2 >>> 2)) ^ (b2 >>> 1)) & 1) == 0) {
                bArr[i2] = (byte) ((-1) - (((-1) - b2) & ((-1) - 1)));
            } else {
                bArr[i2] = (byte) (b2 & (-2));
            }
        }
    }

    public static byte[] readSecurityBuffer(byte[] bArr, int i2) {
        int uShort = readUShort(bArr, i2);
        int uLong = readULong(bArr, i2 + 4);
        if (bArr.length < uLong + uShort) {
            return new byte[uShort];
        }
        byte[] bArr2 = new byte[uShort];
        System.arraycopy(bArr, uLong, bArr2, 0, uShort);
        return bArr2;
    }

    public static int readULong(byte[] bArr, int i2) {
        if (bArr.length < i2 + 4) {
            return 0;
        }
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8) | (((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16);
    }

    public static int readUShort(byte[] bArr, int i2) {
        if (bArr.length < i2 + 2) {
            return 0;
        }
        int i3 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        int i4 = ((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8;
        return (i4 + i3) - (i4 & i3);
    }

    static int rotintlft(int i2, int i3) {
        int i4 = i2 << i3;
        int i5 = i2 >>> (32 - i3);
        return (i5 + i4) - (i5 & i4);
    }

    private static String stripDotSuffix(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(46);
        return iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
    }

    static void writeULong(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) (255 & i2);
        bArr[i3 + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i3 + 2] = (byte) ((i2 >> 16) & 255);
        int i4 = i2 >> 24;
        bArr[i3 + 3] = (byte) ((i4 + 255) - (i4 | 255));
    }

    static void writeUShort(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) ((-1) - (((-1) - i2) | ((-1) - 255)));
        bArr[i3 + 1] = (byte) ((-1) - (((-1) - (i2 >> 8)) | ((-1) - 255)));
    }

    @Override // cz.msebera.android.httpclient.impl.auth.NTLMEngine
    public String generateType1Msg(String str, String str2) throws NTLMEngineException {
        return getType1Message(str2, str);
    }

    @Override // cz.msebera.android.httpclient.impl.auth.NTLMEngine
    public String generateType3Msg(String str, String str2, String str3, String str4, String str5) throws NTLMEngineException {
        Type2Message type2Message = new Type2Message(str5);
        return getType3Message(str, str2, str4, str3, type2Message.getChallenge(), type2Message.getFlags(), type2Message.getTarget(), type2Message.getTargetInfo());
    }
}
