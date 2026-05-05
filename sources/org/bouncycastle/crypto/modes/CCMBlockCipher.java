package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class CCMBlockCipher implements AEADBlockCipher {
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private CipherParameters keyParam;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();

    private class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public ExposedByteArrayOutputStream() {
        }

        public byte[] getBuffer() {
            return this.buf;
        }
    }

    public CCMBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.macBlock = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int calculateMac(byte[] bArr, int i2, int i3, byte[] bArr2) {
        CBCBlockCipherMac cBCBlockCipherMac = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
        cBCBlockCipherMac.init(this.keyParam);
        byte[] bArr3 = new byte[16];
        if (hasAssociatedText()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        byte b2 = bArr3[0];
        int i4 = 2;
        int macSize = (cBCBlockCipherMac.getMacSize() - 2) / 2;
        byte b3 = (byte) (b2 | (((macSize + 7) - (macSize | 7)) << 3));
        bArr3[0] = b3;
        byte[] bArr4 = this.nonce;
        bArr3[0] = (byte) (b3 | ((-1) - (((-1) - (14 - bArr4.length)) | ((-1) - 7))));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i5 = i3;
        int i6 = 1;
        while (i5 > 0) {
            bArr3[16 - i6] = (byte) (255 & i5);
            i5 >>>= 8;
            i6++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        if (hasAssociatedText()) {
            int associatedTextLength = getAssociatedTextLength();
            if (associatedTextLength < 65280) {
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 24));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 16));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
                i4 = 6;
            }
            byte[] bArr5 = this.initialAssociatedText;
            if (bArr5 != null) {
                cBCBlockCipherMac.update(bArr5, 0, bArr5.length);
            }
            if (this.associatedText.size() > 0) {
                cBCBlockCipherMac.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
            }
            int i7 = (i4 + associatedTextLength) % 16;
            if (i7 != 0) {
                while (i7 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i7++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i2, i3);
        return cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    private int getAssociatedTextLength() {
        int size = this.associatedText.size();
        byte[] bArr = this.initialAssociatedText;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private boolean hasAssociatedText() {
        return getAssociatedTextLength() > 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i2) throws InvalidCipherTextException, IllegalStateException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i2);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        int i2 = this.macSize;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.macBlock, 0, bArr, 0, i2);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i2) {
        int size = i2 + this.data.size();
        if (this.forEncryption) {
            return size + this.macSize;
        }
        int i3 = this.macSize;
        if (size < i3) {
            return 0;
        }
        return size - i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i2) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        this.forEncryption = z2;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + cipherParameters.getClass().getName());
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.macBlock.length / 2;
            parameters = parametersWithIV.getParameters();
        }
        if (parameters != null) {
            this.keyParam = parameters;
        }
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b2) {
        this.associatedText.write(b2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i2, int i3) {
        this.associatedText.write(bArr, i2, i3);
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b2, byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        this.data.write(b2);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws IllegalStateException, DataLengthException {
        if (bArr.length < i2 + i3) {
            throw new DataLengthException("Input buffer too short");
        }
        this.data.write(bArr, i2, i3);
        return 0;
    }

    public int processPacket(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        int i5;
        if (this.keyParam == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.nonce;
        int length = bArr3.length;
        int i6 = 15 - length;
        if (i6 < 4 && i3 >= (1 << (i6 * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr4 = new byte[this.blockSize];
        bArr4[0] = (byte) ((-1) - (((-1) - (14 - length)) | ((-1) - 7)));
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        SICBlockCipher sICBlockCipher = new SICBlockCipher(this.cipher);
        sICBlockCipher.init(this.forEncryption, new ParametersWithIV(this.keyParam, bArr4));
        if (!this.forEncryption) {
            int i7 = this.macSize;
            if (i3 < i7) {
                throw new InvalidCipherTextException("data too short");
            }
            int i8 = i3 - i7;
            if (bArr2.length < i8 + i4) {
                throw new OutputLengthException("Output buffer too short.");
            }
            int i9 = i2 + i8;
            System.arraycopy(bArr, i9, this.macBlock, 0, i7);
            byte[] bArr5 = this.macBlock;
            sICBlockCipher.processBlock(bArr5, 0, bArr5, 0);
            int i10 = this.macSize;
            while (true) {
                byte[] bArr6 = this.macBlock;
                if (i10 == bArr6.length) {
                    break;
                }
                bArr6[i10] = 0;
                i10++;
            }
            int i11 = i2;
            int i12 = i4;
            while (true) {
                i5 = this.blockSize;
                if (i11 >= i9 - i5) {
                    break;
                }
                sICBlockCipher.processBlock(bArr, i11, bArr2, i12);
                int i13 = this.blockSize;
                i12 += i13;
                i11 += i13;
            }
            byte[] bArr7 = new byte[i5];
            int i14 = i8 - (i11 - i2);
            System.arraycopy(bArr, i11, bArr7, 0, i14);
            sICBlockCipher.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i12, i14);
            byte[] bArr8 = new byte[this.blockSize];
            calculateMac(bArr2, i4, i8, bArr8);
            if (Arrays.constantTimeAreEqual(this.macBlock, bArr8)) {
                return i8;
            }
            throw new InvalidCipherTextException("mac check in CCM failed");
        }
        int i15 = this.macSize + i3;
        if (bArr2.length < i15 + i4) {
            throw new OutputLengthException("Output buffer too short.");
        }
        calculateMac(bArr, i2, i3, this.macBlock);
        byte[] bArr9 = new byte[this.blockSize];
        sICBlockCipher.processBlock(this.macBlock, 0, bArr9, 0);
        int i16 = i2;
        int i17 = i4;
        while (true) {
            int i18 = i2 + i3;
            int i19 = this.blockSize;
            if (i16 >= i18 - i19) {
                byte[] bArr10 = new byte[i19];
                int i20 = i18 - i16;
                System.arraycopy(bArr, i16, bArr10, 0, i20);
                sICBlockCipher.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i17, i20);
                System.arraycopy(bArr9, 0, bArr2, i4 + i3, this.macSize);
                return i15;
            }
            sICBlockCipher.processBlock(bArr, i16, bArr2, i17);
            int i21 = this.blockSize;
            i17 += i21;
            i16 += i21;
        }
    }

    public byte[] processPacket(byte[] bArr, int i2, int i3) throws InvalidCipherTextException, IllegalStateException {
        int i4;
        if (this.forEncryption) {
            i4 = this.macSize + i3;
        } else {
            int i5 = this.macSize;
            if (i3 < i5) {
                throw new InvalidCipherTextException("data too short");
            }
            i4 = i3 - i5;
        }
        byte[] bArr2 = new byte[i4];
        processPacket(bArr, i2, i3, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        this.cipher.reset();
        this.associatedText.reset();
        this.data.reset();
    }
}
