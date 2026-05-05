package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes2.dex */
public class PaddedBlockCipher extends BufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        int iProcessBlock;
        int iProcessBlock2;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                iProcessBlock2 = 0;
            } else {
                if ((blockSize * 2) + i2 > bArr.length) {
                    throw new DataLengthException("output buffer too short");
                }
                iProcessBlock2 = this.cipher.processBlock(this.buf, 0, bArr, i2);
                this.bufOff = 0;
            }
            byte b2 = (byte) (blockSize - this.bufOff);
            while (this.bufOff < blockSize) {
                this.buf[this.bufOff] = b2;
                this.bufOff++;
            }
            iProcessBlock = iProcessBlock2 + this.cipher.processBlock(this.buf, 0, bArr, i2 + iProcessBlock2);
        } else {
            if (this.bufOff != blockSize) {
                throw new DataLengthException("last block incomplete in decryption");
            }
            int iProcessBlock3 = this.cipher.processBlock(this.buf, 0, this.buf, 0);
            this.bufOff = 0;
            int i3 = this.buf[blockSize - 1] & 255;
            if (i3 < 0 || i3 > blockSize) {
                throw new InvalidCipherTextException("pad block corrupted");
            }
            iProcessBlock = iProcessBlock3 - i3;
            System.arraycopy(this.buf, 0, bArr, i2, iProcessBlock);
        }
        reset();
        return iProcessBlock;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i2) {
        int length;
        int i3 = i2 + this.bufOff;
        int length2 = i3 % this.buf.length;
        if (length2 != 0) {
            i3 -= length2;
            length = this.buf.length;
        } else {
            if (!this.forEncryption) {
                return i3;
            }
            length = this.buf.length;
        }
        return i3 + length;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i2) {
        int i3 = i2 + this.bufOff;
        int length = i3 % this.buf.length;
        return length == 0 ? i3 - this.buf.length : i3 - length;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
    public int processByte(byte b2, byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        int i3 = 0;
        if (this.bufOff == this.buf.length) {
            int iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr, i2);
            this.bufOff = 0;
            i3 = iProcessBlock;
        }
        byte[] bArr2 = this.buf;
        int i4 = this.bufOff;
        this.bufOff = i4 + 1;
        bArr2[i4] = b2;
        return i3;
    }

    @Override // org.spongycastle.crypto.BufferedBlockCipher
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
        int iProcessBlock = 0;
        if (i3 > length) {
            System.arraycopy(bArr, i2, this.buf, this.bufOff, length);
            int iProcessBlock2 = this.cipher.processBlock(this.buf, 0, bArr2, i4);
            this.bufOff = 0;
            i3 -= length;
            i2 += length;
            iProcessBlock = iProcessBlock2;
            while (i3 > this.buf.length) {
                iProcessBlock += this.cipher.processBlock(bArr, i2, bArr2, i4 + iProcessBlock);
                i3 -= blockSize;
                i2 += blockSize;
            }
        }
        System.arraycopy(bArr, i2, this.buf, this.bufOff, i3);
        this.bufOff += i3;
        return iProcessBlock;
    }
}
