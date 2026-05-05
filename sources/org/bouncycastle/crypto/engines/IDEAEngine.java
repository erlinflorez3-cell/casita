package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes6.dex */
public class IDEAEngine implements BlockCipher {
    private static final int BASE = 65537;
    protected static final int BLOCK_SIZE = 8;
    private static final int MASK = 65535;
    private int[] workingKey = null;

    private int bytesToWord(byte[] bArr, int i2) {
        int i3 = bArr[i2] << 8;
        byte b2 = bArr[i2 + 1];
        return ((i3 + 65280) - (i3 | 65280)) + ((b2 + 255) - (b2 | 255));
    }

    private int[] expandKey(byte[] bArr) {
        int i2;
        int[] iArr = new int[52];
        int i3 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i3 >= 8) {
                break;
            }
            iArr[i3] = bytesToWord(bArr, i3 * 2);
            i3++;
        }
        for (i2 = 8; i2 < 52; i2++) {
            int i4 = i2 & 7;
            if (i4 < 6) {
                int i5 = (-1) - (((-1) - (((-1) - (((-1) - iArr[i2 - 7]) | ((-1) - 127))) << 9)) & ((-1) - (iArr[i2 - 6] >> 7)));
                iArr[i2] = (i5 + 65535) - (i5 | 65535);
            } else if (i4 == 6) {
                int i6 = (iArr[i2 - 7] & 127) << 9;
                int i7 = iArr[i2 - 14] >> 7;
                iArr[i2] = (-1) - (((-1) - ((i6 + i7) - (i6 & i7))) | ((-1) - 65535));
            } else {
                int i8 = iArr[i2 - 15];
                iArr[i2] = (-1) - (((-1) - ((((i8 + 127) - (i8 | 127)) << 9) | (iArr[i2 - 14] >> 7))) | ((-1) - 65535));
            }
        }
        return iArr;
    }

    private int[] generateWorkingKey(boolean z2, byte[] bArr) {
        return z2 ? expandKey(bArr) : invertKey(expandKey(bArr));
    }

    private void ideaFunc(int[] iArr, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int iBytesToWord = bytesToWord(bArr, i2);
        int iBytesToWord2 = bytesToWord(bArr, i2 + 2);
        int iBytesToWord3 = bytesToWord(bArr, i2 + 4);
        int iBytesToWord4 = bytesToWord(bArr, i2 + 6);
        int i4 = 0;
        int i5 = 0;
        while (i4 < 8) {
            int iMul = mul(iBytesToWord, iArr[i5]);
            int i6 = (iBytesToWord2 + iArr[i5 + 1]) & 65535;
            int i7 = (-1) - (((-1) - (iBytesToWord3 + iArr[i5 + 2])) | ((-1) - 65535));
            int iMul2 = mul(iBytesToWord4, iArr[i5 + 3]);
            int i8 = i5 + 5;
            int iMul3 = mul(i7 ^ iMul, iArr[i5 + 4]);
            i5 += 6;
            int iMul4 = mul(((i6 ^ iMul2) + iMul3) & 65535, iArr[i8]);
            int i9 = 65535 & (iMul3 + iMul4);
            iBytesToWord = iMul ^ iMul4;
            iBytesToWord4 = iMul2 ^ i9;
            i4++;
            iBytesToWord3 = i6 ^ i9;
            iBytesToWord2 = i7 ^ iMul4;
        }
        wordToBytes(mul(iBytesToWord, iArr[i5]), bArr2, i3);
        wordToBytes(iBytesToWord3 + iArr[i5 + 1], bArr2, i3 + 2);
        wordToBytes(iBytesToWord2 + iArr[i5 + 2], bArr2, i3 + 4);
        wordToBytes(mul(iBytesToWord4, iArr[i5 + 3]), bArr2, i3 + 6);
    }

    private int[] invertKey(int[] iArr) {
        int[] iArr2 = new int[52];
        int iMulInv = mulInv(iArr[0]);
        int iAddInv = addInv(iArr[1]);
        int iAddInv2 = addInv(iArr[2]);
        iArr2[51] = mulInv(iArr[3]);
        iArr2[50] = iAddInv2;
        iArr2[49] = iAddInv;
        int i2 = 48;
        iArr2[48] = iMulInv;
        int i3 = 4;
        for (int i4 = 1; i4 < 8; i4++) {
            int i5 = iArr[i3];
            iArr2[i2 - 1] = iArr[i3 + 1];
            iArr2[i2 - 2] = i5;
            int iMulInv2 = mulInv(iArr[i3 + 2]);
            int iAddInv3 = addInv(iArr[i3 + 3]);
            int i6 = i3 + 5;
            int iAddInv4 = addInv(iArr[i3 + 4]);
            i3 += 6;
            iArr2[i2 - 3] = mulInv(iArr[i6]);
            iArr2[i2 - 4] = iAddInv3;
            iArr2[i2 - 5] = iAddInv4;
            i2 -= 6;
            iArr2[i2] = iMulInv2;
        }
        int i7 = iArr[i3];
        iArr2[i2 - 1] = iArr[i3 + 1];
        iArr2[i2 - 2] = i7;
        int iMulInv3 = mulInv(iArr[i3 + 2]);
        int iAddInv5 = addInv(iArr[i3 + 3]);
        int iAddInv6 = addInv(iArr[i3 + 4]);
        iArr2[i2 - 3] = mulInv(iArr[i3 + 5]);
        iArr2[i2 - 4] = iAddInv6;
        iArr2[i2 - 5] = iAddInv5;
        iArr2[i2 - 6] = iMulInv3;
        return iArr2;
    }

    private int mul(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = BASE - i3;
        } else if (i3 == 0) {
            i4 = BASE - i2;
        } else {
            int i5 = i2 * i3;
            int i6 = (-1) - (((-1) - i5) | ((-1) - 65535));
            int i7 = i5 >>> 16;
            i4 = (i6 - i7) + (i6 < i7 ? 1 : 0);
        }
        return (i4 + 65535) - (i4 | 65535);
    }

    private int mulInv(int i2) {
        if (i2 < 2) {
            return i2;
        }
        int i3 = BASE / i2;
        int i4 = BASE % i2;
        int i5 = 1;
        while (i4 != 1) {
            int i6 = i2 / i4;
            i2 %= i4;
            i5 = (-1) - (((-1) - (i5 + (i6 * i3))) | ((-1) - 65535));
            if (i2 == 1) {
                return i5;
            }
            int i7 = i4 / i2;
            i4 %= i2;
            i3 = (-1) - (((-1) - (i3 + (i7 * i5))) | ((-1) - 65535));
        }
        return (1 - i3) & 65535;
    }

    private void wordToBytes(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >>> 8);
        bArr[i3 + 1] = (byte) i2;
    }

    int addInv(int i2) {
        int i3 = 0 - i2;
        return (i3 + 65535) - (i3 | 65535);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + cipherParameters.getClass().getName());
        }
        this.workingKey = generateWorkingKey(z2, ((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i2 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        ideaFunc(iArr, bArr, i2, bArr2, i3);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
