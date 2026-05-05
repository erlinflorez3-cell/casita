package org.bouncycastle.crypto.signers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSalt;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public class ISO9796d2PSSSigner implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int hLen;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private int preMStart;
    private byte[] preSig;
    private int preTLength;
    private SecureRandom random;
    private byte[] recoveredMessage;
    private int saltLength;
    private byte[] standardSalt;
    private int trailer;

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i2) {
        this(asymmetricBlockCipher, digest, i2, false);
    }

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i2, boolean z2) {
        int iIntValue;
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        this.hLen = digest.getDigestSize();
        this.saltLength = i2;
        if (z2) {
            iIntValue = 188;
        } else {
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + digest.getAlgorithmName());
            }
            iIntValue = trailer.intValue();
        }
        this.trailer = iIntValue;
    }

    private void ItoOSP(int i2, byte[] bArr) {
        bArr[0] = (byte) (i2 >>> 24);
        bArr[1] = (byte) (i2 >>> 16);
        bArr[2] = (byte) (i2 >>> 8);
        bArr[3] = (byte) i2;
    }

    private void LtoOSP(long j2, byte[] bArr) {
        bArr[0] = (byte) (j2 >>> 56);
        bArr[1] = (byte) (j2 >>> 48);
        bArr[2] = (byte) (j2 >>> 40);
        bArr[3] = (byte) (j2 >>> 32);
        bArr[4] = (byte) (j2 >>> 24);
        bArr[5] = (byte) (j2 >>> 16);
        bArr[6] = (byte) (j2 >>> 8);
        bArr[7] = (byte) j2;
    }

    private void clearBlock(byte[] bArr) {
        for (int i2 = 0; i2 != bArr.length; i2++) {
            bArr[i2] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z2 = this.messageLength == bArr2.length;
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                z2 = false;
            }
        }
        return z2;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i2, int i3, int i4) {
        int i5;
        byte[] bArr2 = new byte[i4];
        byte[] bArr3 = new byte[this.hLen];
        byte[] bArr4 = new byte[4];
        this.digest.reset();
        int i6 = 0;
        while (true) {
            i5 = this.hLen;
            if (i6 >= i4 / i5) {
                break;
            }
            ItoOSP(i6, bArr4);
            this.digest.update(bArr, i2, i3);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i7 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i6 * i7, i7);
            i6++;
        }
        if (i5 * i6 < i4) {
            ItoOSP(i6, bArr4);
            this.digest.update(bArr, i2, i3);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i8 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i6 * i8, i4 - (i6 * i8));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws Throwable {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        byte[] bArr2 = new byte[8];
        LtoOSP(this.messageLength * 8, bArr2);
        this.digest.update(bArr2, 0, 8);
        this.digest.update(this.mBuf, 0, this.messageLength);
        this.digest.update(bArr, 0, digestSize);
        byte[] bArr3 = this.standardSalt;
        if (bArr3 == null) {
            bArr3 = new byte[this.saltLength];
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr3};
            Method method = Class.forName(C1561oA.Xd(" \u0018.\u001ag.! 31)5;p\u0017*)<:.\u001c,:1=<", (short) (OY.Xd() ^ 29653))).getMethod(Wg.vd("WMc^'][KT", (short) (OY.Xd() ^ 4746)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.digest.update(bArr3, 0, bArr3.length);
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        this.digest.doFinal(bArr4, 0);
        int i2 = this.trailer == 188 ? 1 : 2;
        byte[] bArr5 = this.block;
        int length = bArr5.length;
        int i3 = this.messageLength;
        int length2 = (((length - i3) - bArr3.length) - this.hLen) - i2;
        bArr5[length2 - 1] = 1;
        System.arraycopy(this.mBuf, 0, bArr5, length2, i3);
        System.arraycopy(bArr3, 0, this.block, length2 + this.messageLength, bArr3.length);
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, digestSize2, (this.block.length - this.hLen) - i2);
        for (int i4 = 0; i4 != bArrMaskGeneratorFunction1.length; i4++) {
            byte[] bArr6 = this.block;
            bArr6[i4] = (byte) (bArr6[i4] ^ bArrMaskGeneratorFunction1[i4]);
        }
        byte[] bArr7 = this.block;
        int length3 = bArr7.length;
        int i5 = this.hLen;
        System.arraycopy(bArr4, 0, bArr7, (length3 - i5) - i2, i5);
        int i6 = this.trailer;
        if (i6 == 188) {
            byte[] bArr8 = this.block;
            bArr8[bArr8.length - 1] = -68;
        } else {
            byte[] bArr9 = this.block;
            bArr9[bArr9.length - 2] = (byte) (i6 >>> 8);
            bArr9[bArr9.length - 1] = (byte) i6;
        }
        byte[] bArr10 = this.block;
        bArr10[0] = (byte) ((-1) - (((-1) - bArr10[0]) | ((-1) - 127)));
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr10, 0, bArr10.length);
        int i7 = this.messageLength;
        byte[] bArr11 = new byte[i7];
        this.recoveredMessage = bArr11;
        byte[] bArr12 = this.mBuf;
        this.fullMessage = i7 <= bArr12.length;
        System.arraycopy(bArr12, 0, bArr11, 0, bArr11.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
        this.messageLength = 0;
        return bArrProcessBlock;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.recoveredMessage;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.fullMessage;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        RSAKeyParameters rSAKeyParameters;
        SecureRandom random;
        int length = this.saltLength;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithRandom.getParameters();
            if (z2) {
                random = parametersWithRandom.getRandom();
                this.random = random;
            }
        } else if (cipherParameters instanceof ParametersWithSalt) {
            ParametersWithSalt parametersWithSalt = (ParametersWithSalt) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithSalt.getParameters();
            byte[] salt = parametersWithSalt.getSalt();
            this.standardSalt = salt;
            length = salt.length;
            if (salt.length != this.saltLength) {
                throw new IllegalArgumentException(Qg.kd("Bdr^\\\u0017iV`g\u0012Zc\u000f]S\fb\\XVN\u0006QIQIUH", (short) (C1633zX.Xd() ^ (-4772)), (short) (C1633zX.Xd() ^ (-13159))));
            }
        } else {
            rSAKeyParameters = (RSAKeyParameters) cipherParameters;
            if (z2) {
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(hg.Vd("bXlV\"fWTeaWae\u0019=NK\\XJ6DPEOL", (short) (C1499aX.Xd() ^ (-26600)), (short) (C1499aX.Xd() ^ (-29301)))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    random = (SecureRandom) constructor.newInstance(objArr);
                    this.random = random;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        this.cipher.init(z2, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.block = bArr;
        int i2 = this.trailer;
        int length2 = bArr.length;
        if (i2 == 188) {
            this.mBuf = new byte[((length2 - this.digest.getDigestSize()) - length) - 2];
        } else {
            this.mBuf = new byte[((length2 - this.digest.getDigestSize()) - length) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        byte[] bArr = this.mBuf;
        if (bArr != null) {
            clearBlock(bArr);
        }
        byte[] bArr2 = this.recoveredMessage;
        if (bArr2 != null) {
            clearBlock(bArr2);
            this.recoveredMessage = null;
        }
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        if (this.preSig == null) {
            int i2 = this.messageLength;
            byte[] bArr = this.mBuf;
            if (i2 < bArr.length) {
                this.messageLength = i2 + 1;
                bArr[i2] = b2;
                return;
            }
        }
        this.digest.update(b2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i2, int i3) {
        if (this.preSig == null) {
            while (i3 > 0 && this.messageLength < this.mBuf.length) {
                update(bArr[i2]);
                i2++;
                i3--;
            }
        }
        if (i3 > 0) {
            this.digest.update(bArr, i2, i3);
        }
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i2;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        int length = bArrProcessBlock.length;
        int i3 = this.keyBits;
        if (length < (i3 + 7) / 8) {
            int i4 = (i3 + 7) / 8;
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArrProcessBlock, 0, bArr2, i4 - bArrProcessBlock.length, bArrProcessBlock.length);
            clearBlock(bArrProcessBlock);
            bArrProcessBlock = bArr2;
        }
        byte b2 = bArrProcessBlock[bArrProcessBlock.length - 1];
        if ((((b2 + 255) - (b2 | 255)) ^ 188) == 0) {
            i2 = 1;
        } else {
            i2 = 2;
            int i5 = ((-1) - (((-1) - bArrProcessBlock[bArrProcessBlock.length - 2]) | ((-1) - 255))) << 8;
            byte b3 = bArrProcessBlock[bArrProcessBlock.length - 1];
            int i6 = (-1) - (((-1) - i5) & ((-1) - ((b3 + 255) - (b3 | 255))));
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            if (i6 != trailer.intValue()) {
                throw new IllegalStateException("signer initialised with wrong digest for trailer " + i6);
            }
        }
        this.digest.doFinal(new byte[this.hLen], 0);
        int length2 = bArrProcessBlock.length;
        int i7 = this.hLen;
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArrProcessBlock, (length2 - i7) - i2, i7, (bArrProcessBlock.length - i7) - i2);
        for (int i8 = 0; i8 != bArrMaskGeneratorFunction1.length; i8++) {
            bArrProcessBlock[i8] = (byte) (bArrProcessBlock[i8] ^ bArrMaskGeneratorFunction1[i8]);
        }
        byte b4 = bArrProcessBlock[0];
        bArrProcessBlock[0] = (byte) ((b4 + 127) - (b4 | 127));
        int i9 = 0;
        while (i9 != bArrProcessBlock.length && bArrProcessBlock[i9] != 1) {
            i9++;
        }
        int i10 = i9 + 1;
        if (i10 >= bArrProcessBlock.length) {
            clearBlock(bArrProcessBlock);
        }
        this.fullMessage = i10 > 1;
        byte[] bArr3 = new byte[(bArrMaskGeneratorFunction1.length - i10) - this.saltLength];
        this.recoveredMessage = bArr3;
        System.arraycopy(bArrProcessBlock, i10, bArr3, 0, bArr3.length);
        byte[] bArr4 = this.recoveredMessage;
        System.arraycopy(bArr4, 0, this.mBuf, 0, bArr4.length);
        this.preSig = bArr;
        this.preBlock = bArrProcessBlock;
        this.preMStart = i10;
        this.preTLength = i2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int i2 = this.hLen;
        byte[] bArr2 = new byte[i2];
        this.digest.doFinal(bArr2, 0);
        byte[] bArr3 = this.preSig;
        if (bArr3 == null) {
            try {
                updateWithRecoveredMessage(bArr);
            } catch (Exception unused) {
                return false;
            }
        } else if (!Arrays.areEqual(bArr3, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        byte[] bArr4 = this.preBlock;
        int i3 = this.preMStart;
        int i4 = this.preTLength;
        this.preSig = null;
        this.preBlock = null;
        byte[] bArr5 = new byte[8];
        LtoOSP(this.recoveredMessage.length * 8, bArr5);
        this.digest.update(bArr5, 0, 8);
        byte[] bArr6 = this.recoveredMessage;
        if (bArr6.length != 0) {
            this.digest.update(bArr6, 0, bArr6.length);
        }
        this.digest.update(bArr2, 0, i2);
        byte[] bArr7 = this.standardSalt;
        if (bArr7 != null) {
            this.digest.update(bArr7, 0, bArr7.length);
        } else {
            this.digest.update(bArr4, i3 + this.recoveredMessage.length, this.saltLength);
        }
        int digestSize = this.digest.getDigestSize();
        byte[] bArr8 = new byte[digestSize];
        this.digest.doFinal(bArr8, 0);
        int length = (bArr4.length - i4) - digestSize;
        boolean z2 = true;
        for (int i5 = 0; i5 != digestSize; i5++) {
            if (bArr8[i5] != bArr4[length + i5]) {
                z2 = false;
            }
        }
        clearBlock(bArr4);
        clearBlock(bArr8);
        if (!z2) {
            this.fullMessage = false;
            clearBlock(this.recoveredMessage);
            return false;
        }
        if (this.messageLength != 0) {
            if (!isSameAs(this.mBuf, this.recoveredMessage)) {
                clearBlock(this.mBuf);
                return false;
            }
            this.messageLength = 0;
        }
        clearBlock(this.mBuf);
        return true;
    }
}
