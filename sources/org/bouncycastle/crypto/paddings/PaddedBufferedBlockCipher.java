package org.bouncycastle.crypto.paddings;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes6.dex */
public class PaddedBufferedBlockCipher extends BufferedBlockCipher {
    BlockCipherPadding padding;

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this.cipher = blockCipher;
        this.padding = blockCipherPadding;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i2) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        int iPadCount;
        int iProcessBlock;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                iProcessBlock = 0;
            } else {
                if ((blockSize * 2) + i2 > bArr.length) {
                    reset();
                    throw new OutputLengthException("output buffer too short");
                }
                iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr, i2);
                this.bufOff = 0;
            }
            this.padding.addPadding(this.buf, this.bufOff);
            iPadCount = iProcessBlock + this.cipher.processBlock(this.buf, 0, bArr, i2 + iProcessBlock);
        } else {
            if (this.bufOff != blockSize) {
                reset();
                throw new DataLengthException("last block incomplete in decryption");
            }
            int iProcessBlock2 = this.cipher.processBlock(this.buf, 0, this.buf, 0);
            this.bufOff = 0;
            try {
                iPadCount = iProcessBlock2 - this.padding.padCount(this.buf);
                System.arraycopy(this.buf, 0, bArr, i2, iPadCount);
            } finally {
                reset();
            }
        }
        return iPadCount;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
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

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i2) {
        int i3 = i2 + this.bufOff;
        int length = i3 % this.buf.length;
        return length == 0 ? Math.max(0, i3 - this.buf.length) : i3 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.forEncryption = z2;
        reset();
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.padding.init(parametersWithRandom.getRandom());
            blockCipher = this.cipher;
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.padding.init(null);
            blockCipher = this.cipher;
        }
        blockCipher.init(z2, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
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

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws IllegalStateException, DataLengthException {
        if (i3 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i3);
        if (updateOutputSize > 0 && updateOutputSize + i4 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
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
