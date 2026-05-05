package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes6.dex */
public class NISTCTSBlockCipher extends BufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;
    private final int type;

    public NISTCTSBlockCipher(int i2, BlockCipher blockCipher) {
        this.type = i2;
        this.cipher = new CBCBlockCipher(blockCipher);
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buf = new byte[blockSize * 2];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i2) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (this.bufOff + i2 > bArr.length) {
            throw new DataLengthException("output buffer to small in doFinal");
        }
        int blockSize = this.cipher.getBlockSize();
        int i3 = this.bufOff - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.forEncryption) {
            if (this.bufOff < blockSize) {
                throw new DataLengthException("need at least one block of input for NISTCTS");
            }
            if (this.bufOff > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                int i4 = this.type;
                if (i4 == 2 || i4 == 3) {
                    this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    System.arraycopy(this.buf, blockSize, bArr3, 0, i3);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (this.type == 2 && i3 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i2, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i2 + blockSize, i3);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i2, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i2 + blockSize, i3);
                    }
                } else {
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i2, i3);
                    System.arraycopy(this.buf, this.bufOff - i3, bArr3, 0, i3);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i2 + i3, blockSize);
                }
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i2, blockSize);
            }
        } else {
            if (this.bufOff < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[blockSize];
            if (this.bufOff > blockSize) {
                int i5 = this.type;
                if (i5 == 3 || (i5 == 2 && (this.buf.length - this.bufOff) % blockSize != 0)) {
                    if (this.cipher instanceof CBCBlockCipher) {
                        ((CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
                    } else {
                        this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    }
                    for (int i6 = blockSize; i6 != this.bufOff; i6++) {
                        int i7 = i6 - blockSize;
                        bArr4[i7] = (byte) (bArr2[i7] ^ this.buf[i6]);
                    }
                    System.arraycopy(this.buf, blockSize, bArr2, 0, i3);
                    this.cipher.processBlock(bArr2, 0, bArr, i2);
                } else {
                    ((CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, this.bufOff - blockSize, bArr4, 0);
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    if (i3 != blockSize) {
                        System.arraycopy(bArr4, i3, bArr2, i3, blockSize - i3);
                    }
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i2, blockSize);
                    for (int i8 = 0; i8 != i3; i8++) {
                        bArr4[i8] = (byte) (bArr4[i8] ^ this.buf[i8]);
                    }
                }
                System.arraycopy(bArr4, 0, bArr, i2 + blockSize, i3);
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i2, blockSize);
            }
        }
        int i9 = this.bufOff;
        reset();
        return i9;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i2) {
        return i2 + this.bufOff;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i2) {
        int i3 = i2 + this.bufOff;
        int length = i3 % this.buf.length;
        return length == 0 ? i3 - this.buf.length : i3 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b2, byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        int i3 = 0;
        if (this.bufOff == this.buf.length) {
            int iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr, i2);
            System.arraycopy(this.buf, this.blockSize, this.buf, 0, this.blockSize);
            this.bufOff = this.blockSize;
            i3 = iProcessBlock;
        }
        byte[] bArr2 = this.buf;
        int i4 = this.bufOff;
        this.bufOff = i4 + 1;
        bArr2[i4] = b2;
        return i3;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws IllegalStateException, DataLengthException {
        if (i3 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i3);
        if (updateOutputSize > 0 && updateOutputSize + i4 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int length = this.buf.length - this.bufOff;
        int i5 = 0;
        if (i3 > length) {
            System.arraycopy(bArr, i2, this.buf, this.bufOff, length);
            int iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr2, i4);
            System.arraycopy(this.buf, blockSize, this.buf, 0, blockSize);
            this.bufOff = blockSize;
            i3 -= length;
            i2 += length;
            while (i3 > blockSize) {
                System.arraycopy(bArr, i2, this.buf, this.bufOff, blockSize);
                iProcessBlock += this.cipher.processBlock(this.buf, 0, bArr2, i4 + iProcessBlock);
                System.arraycopy(this.buf, blockSize, this.buf, 0, blockSize);
                i3 -= blockSize;
                i2 += blockSize;
            }
            i5 = iProcessBlock;
        }
        System.arraycopy(bArr, i2, this.buf, this.bufOff, i3);
        this.bufOff += i3;
        return i5;
    }
}
