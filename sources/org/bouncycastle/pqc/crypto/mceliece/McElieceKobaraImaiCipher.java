package org.bouncycastle.pqc.crypto.mceliece;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions;
import yg.C1561oA;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceKobaraImaiCipher implements MessageEncryptor {
    private static final String DEFAULT_PRNG_NAME = "SHA1PRNG";
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    public static final byte[] PUBLIC_CONSTANT = "a predetermined public constant".getBytes();
    private boolean forEncryption;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27763k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27764n;
    private SecureRandom sr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27765t;

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PublicKeyParameters.getDigest());
        this.f27764n = mcElieceCCA2PublicKeyParameters.getN();
        this.f27763k = mcElieceCCA2PublicKeyParameters.getK();
        this.f27765t = mcElieceCCA2PublicKeyParameters.getT();
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        this.forEncryption = z2;
        if (!z2) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PrivateKeyParameters;
            initCipherDecrypt(mcElieceCCA2PrivateKeyParameters);
            return;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcElieceCCA2PublicKeyParameters;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
            return;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Jg.Wd("\u0005V(QRv%a@{O\u0019REG\u0018b3l>_-vK#_", (short) (FB.Xd() ^ 5782), (short) (FB.Xd() ^ 20850))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.sr = (SecureRandom) constructor.newInstance(objArr);
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = Utils.getDigest(mcElieceCCA2PrivateKeyParameters.getDigest());
        this.f27764n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f27763k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f27765t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.forEncryption) {
            throw new IllegalStateException("cipher initialised for decryption");
        }
        int i2 = this.f27764n >> 3;
        if (bArr.length < i2) {
            throw new InvalidCipherTextException("Bad Padding: Ciphertext too short.");
        }
        int digestSize = this.messDigest.getDigestSize();
        int i3 = this.f27763k >> 3;
        int length = bArr.length - i2;
        if (length > 0) {
            byte[][] bArrSplit = ByteUtils.split(bArr, length);
            bArr2 = bArrSplit[0];
            bArr = bArrSplit[1];
        } else {
            bArr2 = new byte[0];
        }
        GF2Vector[] gF2VectorArrDecryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f27764n, bArr));
        byte[] encoded = gF2VectorArrDecryptionPrimitive[0].getEncoded();
        GF2Vector gF2Vector = gF2VectorArrDecryptionPrimitive[1];
        if (encoded.length > i3) {
            encoded = ByteUtils.subArray(encoded, 0, i3);
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(ByteUtils.concatenate(bArr2, Conversions.decode(this.f27764n, this.f27765t, gF2Vector)), encoded);
        int length2 = bArrConcatenate.length - digestSize;
        byte[][] bArrSplit2 = ByteUtils.split(bArrConcatenate, digestSize);
        byte[] bArr3 = bArrSplit2[0];
        byte[] bArr4 = bArrSplit2[1];
        byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.update(bArr4, 0, bArr4.length);
        this.messDigest.doFinal(bArr5, 0);
        for (int i4 = digestSize - 1; i4 >= 0; i4--) {
            bArr5[i4] = (byte) (bArr5[i4] ^ bArr3[i4]);
        }
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr5);
        byte[] bArr6 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr6);
        for (int i5 = length2 - 1; i5 >= 0; i5--) {
            bArr6[i5] = (byte) (bArr6[i5] ^ bArr4[i5]);
        }
        byte[] bArr7 = PUBLIC_CONSTANT;
        byte[][] bArrSplit3 = ByteUtils.split(bArr6, length2 - bArr7.length);
        byte[] bArr8 = bArrSplit3[0];
        if (ByteUtils.equals(bArrSplit3[1], bArr7)) {
            return bArr8;
        }
        throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) throws Throwable {
        if (!this.forEncryption) {
            short sXd = (short) (Od.Xd() ^ (-31014));
            int[] iArr = new int["\u0018P\n&jBWiKJ[j/4%M\u0006'\u000b\u0016[\u000f\u001afP&\u0014I*|Y<\u0017".length()];
            QB qb = new QB("\u0018P\n&jBWiKJ[j/4%M\u0006'\u000b\u0016[\u000f\u001afP&\u0014I*|Y<\u0017");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            throw new IllegalStateException(new String(iArr, 0, i2));
        }
        int digestSize = this.messDigest.getDigestSize();
        int i3 = this.f27763k >> 3;
        int iBitLength = (IntegerFunctions.binomial(this.f27764n, this.f27765t).bitLength() - 1) >> 3;
        byte[] bArr2 = PUBLIC_CONSTANT;
        int length = ((i3 + iBitLength) - digestSize) - bArr2.length;
        if (bArr.length > length) {
            length = bArr.length;
        }
        int length2 = bArr2.length + length;
        int i4 = ((length2 + digestSize) - i3) - iBitLength;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        byte[] bArr4 = new byte[digestSize];
        SecureRandom secureRandom = this.sr;
        Class<?> cls = Class.forName(ZO.xd("gOF2\n\u000fBzD|\u00130bsf-0\u0001m~NS\u000e?cf", (short) (Od.Xd() ^ (-26575)), (short) (Od.Xd() ^ (-30454))));
        Class<?>[] clsArr = {byte[].class};
        Object[] objArr = {bArr4};
        short sXd2 = (short) (Od.Xd() ^ (-24480));
        short sXd3 = (short) (Od.Xd() ^ (-16512));
        int[] iArr2 = new int["2J~0f\b)\u0006{".length()];
        QB qb2 = new QB("2J~0f\b)\u0006{");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i5 * sXd3))) + xuXd2.CK(iKK2));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
            digestRandomGenerator.addSeedMaterial(bArr4);
            byte[] bArr5 = new byte[length2];
            digestRandomGenerator.nextBytes(bArr5);
            for (int i6 = length2 - 1; i6 >= 0; i6--) {
                bArr5[i6] = (byte) (bArr5[i6] ^ bArr3[i6]);
            }
            byte[] bArr6 = new byte[this.messDigest.getDigestSize()];
            this.messDigest.update(bArr5, 0, length2);
            this.messDigest.doFinal(bArr6, 0);
            for (int i7 = digestSize - 1; i7 >= 0; i7--) {
                bArr6[i7] = (byte) (bArr6[i7] ^ bArr4[i7]);
            }
            byte[] bArrConcatenate = ByteUtils.concatenate(bArr6, bArr5);
            byte[] bArr7 = new byte[0];
            if (i4 > 0) {
                bArr7 = new byte[i4];
                System.arraycopy(bArrConcatenate, 0, bArr7, 0, i4);
            }
            byte[] bArr8 = new byte[iBitLength];
            System.arraycopy(bArrConcatenate, i4, bArr8, 0, iBitLength);
            byte[] bArr9 = new byte[i3];
            System.arraycopy(bArrConcatenate, iBitLength + i4, bArr9, 0, i3);
            byte[] encoded = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, GF2Vector.OS2VP(this.f27763k, bArr9), Conversions.encode(this.f27764n, this.f27765t, bArr8)).getEncoded();
            return i4 > 0 ? ByteUtils.concatenate(bArr7, encoded) : encoded;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
