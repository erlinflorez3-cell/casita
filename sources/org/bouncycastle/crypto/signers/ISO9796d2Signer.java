package org.bouncycastle.crypto.signers;

import com.google.common.base.Ascii;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
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
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z2) {
        int iIntValue;
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
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

    private void clearBlock(byte[] bArr) {
        for (int i2 = 0; i2 != bArr.length; i2++) {
            bArr[i2] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z2;
        int i2 = this.messageLength;
        byte[] bArr3 = this.mBuf;
        if (i2 > bArr3.length) {
            z2 = bArr3.length <= bArr2.length;
            for (int i3 = 0; i3 != this.mBuf.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    z2 = false;
                }
            }
        } else {
            z2 = i2 == bArr2.length;
            for (int i4 = 0; i4 != bArr2.length; i4++) {
                if (bArr[i4] != bArr2[i4]) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    private boolean returnFalse(byte[] bArr) {
        clearBlock(this.mBuf);
        clearBlock(bArr);
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        int length;
        int i2;
        int i3;
        int i4;
        int digestSize = this.digest.getDigestSize();
        if (this.trailer == 188) {
            byte[] bArr = this.block;
            length = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, length);
            byte[] bArr2 = this.block;
            bArr2[bArr2.length - 1] = -68;
            i2 = 8;
        } else {
            byte[] bArr3 = this.block;
            length = (bArr3.length - digestSize) - 2;
            this.digest.doFinal(bArr3, length);
            byte[] bArr4 = this.block;
            int length2 = bArr4.length - 2;
            int i5 = this.trailer;
            bArr4[length2] = (byte) (i5 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i5;
            i2 = 16;
        }
        int i6 = this.messageLength;
        int i7 = ((((digestSize + i6) * 8) + i2) + 4) - this.keyBits;
        if (i7 > 0) {
            int i8 = i6 - ((i7 + 7) / 8);
            i3 = length - i8;
            System.arraycopy(this.mBuf, 0, this.block, i3, i8);
            this.recoveredMessage = new byte[i8];
            i4 = 96;
        } else {
            i3 = length - i6;
            System.arraycopy(this.mBuf, 0, this.block, i3, i6);
            this.recoveredMessage = new byte[this.messageLength];
            i4 = 64;
        }
        int i9 = i3 - 1;
        if (i9 > 0) {
            for (int i10 = i9; i10 != 0; i10--) {
                this.block[i10] = -69;
            }
            byte[] bArr5 = this.block;
            bArr5[i9] = (byte) (bArr5[i9] ^ 1);
            bArr5[0] = Ascii.VT;
            bArr5[0] = (byte) (11 | i4);
        } else {
            byte[] bArr6 = this.block;
            bArr6[0] = 10;
            bArr6[0] = (byte) ((-1) - (((-1) - 10) & ((-1) - i4)));
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr7 = this.block;
        byte[] bArrProcessBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        this.fullMessage = (-1) - (((-1) - i4) | ((-1) - 32)) == 0;
        byte[] bArr8 = this.mBuf;
        byte[] bArr9 = this.recoveredMessage;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
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
    public void init(boolean z2, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.cipher.init(z2, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.block = bArr;
        int i2 = this.trailer;
        int length = bArr.length;
        if (i2 == 188) {
            this.mBuf = new byte[(length - this.digest.getDigestSize()) - 2];
        } else {
            this.mBuf = new byte[(length - this.digest.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        clearBlock(this.mBuf);
        byte[] bArr = this.recoveredMessage;
        if (bArr != null) {
            clearBlock(bArr);
        }
        this.recoveredMessage = null;
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.digest.update(b2);
        int i2 = this.messageLength;
        byte[] bArr = this.mBuf;
        if (i2 < bArr.length) {
            bArr[i2] = b2;
        }
        this.messageLength = i2 + 1;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i2, int i3) {
        while (i3 > 0 && this.messageLength < this.mBuf.length) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
        this.digest.update(bArr, i2, i3);
        this.messageLength += i3;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i2;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        if ((((-1) - (((-1) - bArrProcessBlock[0]) | ((-1) - 192))) ^ 64) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        byte b2 = bArrProcessBlock[bArrProcessBlock.length - 1];
        if ((((b2 + Ascii.SI) - (b2 | Ascii.SI)) ^ 12) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        byte b3 = bArrProcessBlock[bArrProcessBlock.length - 1];
        if ((((b3 + 255) - (b3 | 255)) ^ 188) == 0) {
            i2 = 1;
        } else {
            i2 = 2;
            int i3 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | ((-1) - (((-1) - bArrProcessBlock[bArrProcessBlock.length - 1]) | ((-1) - 255)));
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            if (i3 != trailer.intValue()) {
                throw new IllegalStateException("signer initialised with wrong digest for trailer " + i3);
            }
        }
        int i4 = 0;
        while (i4 != bArrProcessBlock.length && ((bArrProcessBlock[i4] & Ascii.SI) ^ 10) != 0) {
            i4++;
        }
        int i5 = i4 + 1;
        int length = ((bArrProcessBlock.length - i2) - this.digest.getDigestSize()) - i5;
        if (length <= 0) {
            throw new InvalidCipherTextException("malformed block");
        }
        byte b4 = bArrProcessBlock[0];
        if ((b4 + 32) - (b4 | 32) == 0) {
            this.fullMessage = true;
            byte[] bArr2 = new byte[length];
            this.recoveredMessage = bArr2;
            System.arraycopy(bArrProcessBlock, i5, bArr2, 0, bArr2.length);
        } else {
            this.fullMessage = false;
            byte[] bArr3 = new byte[length];
            this.recoveredMessage = bArr3;
            System.arraycopy(bArrProcessBlock, i5, bArr3, 0, bArr3.length);
        }
        this.preSig = bArr;
        this.preBlock = bArrProcessBlock;
        Digest digest = this.digest;
        byte[] bArr4 = this.recoveredMessage;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.recoveredMessage;
        this.messageLength = bArr5.length;
        System.arraycopy(bArr5, 0, this.mBuf, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArrProcessBlock;
        int i2;
        byte[] bArr2 = this.preSig;
        if (bArr2 == null) {
            try {
                bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (!Arrays.areEqual(bArr2, bArr)) {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            bArrProcessBlock = this.preBlock;
            this.preSig = null;
            this.preBlock = null;
        }
        byte b2 = bArrProcessBlock[0];
        if ((((b2 + MessagePack.Code.NIL) - (b2 | MessagePack.Code.NIL)) ^ 64) == 0 && ((bArrProcessBlock[bArrProcessBlock.length - 1] & Ascii.SI) ^ 12) == 0) {
            if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
                i2 = 1;
            } else {
                i2 = 2;
                int i3 = ((-1) - (((-1) - bArrProcessBlock[bArrProcessBlock.length - 2]) | ((-1) - 255))) << 8;
                int i4 = bArrProcessBlock[bArrProcessBlock.length - 1] & 255;
                int i5 = (i3 + i4) - (i3 & i4);
                Integer trailer = ISOTrailers.getTrailer(this.digest);
                if (trailer == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                if (i5 != trailer.intValue()) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i5);
                }
            }
            int i6 = 0;
            while (i6 != bArrProcessBlock.length) {
                byte b3 = bArrProcessBlock[i6];
                if ((((b3 + Ascii.SI) - (b3 | Ascii.SI)) ^ 10) == 0) {
                    break;
                }
                i6++;
            }
            int i7 = i6 + 1;
            int digestSize = this.digest.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            int length = (bArrProcessBlock.length - i2) - digestSize;
            int i8 = length - i7;
            if (i8 <= 0) {
                return returnFalse(bArrProcessBlock);
            }
            if ((bArrProcessBlock[0] & 32) == 0) {
                this.fullMessage = true;
                if (this.messageLength > i8) {
                    return returnFalse(bArrProcessBlock);
                }
                this.digest.reset();
                this.digest.update(bArrProcessBlock, i7, i8);
                this.digest.doFinal(bArr3, 0);
                boolean z2 = true;
                for (int i9 = 0; i9 != digestSize; i9++) {
                    int i10 = length + i9;
                    byte b4 = (byte) (bArrProcessBlock[i10] ^ bArr3[i9]);
                    bArrProcessBlock[i10] = b4;
                    if (b4 != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return returnFalse(bArrProcessBlock);
                }
                byte[] bArr4 = new byte[i8];
                this.recoveredMessage = bArr4;
                System.arraycopy(bArrProcessBlock, i7, bArr4, 0, bArr4.length);
            } else {
                this.fullMessage = false;
                this.digest.doFinal(bArr3, 0);
                boolean z3 = true;
                for (int i11 = 0; i11 != digestSize; i11++) {
                    int i12 = length + i11;
                    byte b5 = (byte) (bArrProcessBlock[i12] ^ bArr3[i11]);
                    bArrProcessBlock[i12] = b5;
                    if (b5 != 0) {
                        z3 = false;
                    }
                }
                if (!z3) {
                    return returnFalse(bArrProcessBlock);
                }
                byte[] bArr5 = new byte[i8];
                this.recoveredMessage = bArr5;
                System.arraycopy(bArrProcessBlock, i7, bArr5, 0, bArr5.length);
            }
            if (this.messageLength != 0 && !isSameAs(this.mBuf, this.recoveredMessage)) {
                return returnFalse(bArrProcessBlock);
            }
            clearBlock(this.mBuf);
            clearBlock(bArrProcessBlock);
            return true;
        }
        return returnFalse(bArrProcessBlock);
    }
}
