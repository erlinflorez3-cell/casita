package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class SkipjackEngine implements BlockCipher {
    static final int BLOCK_SIZE = 8;
    static short[] ftable = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};
    private boolean encrypting;
    private int[] key0;
    private int[] key1;
    private int[] key2;
    private int[] key3;

    private int g(int i2, int i3) {
        int i4 = i3 >> 8;
        int i5 = (i4 + 255) - (i4 | 255);
        int i6 = (i3 + 255) - (i3 | 255);
        short[] sArr = ftable;
        int i7 = i5 ^ sArr[this.key0[i2] ^ i6];
        int i8 = i6 ^ sArr[this.key1[i2] ^ i7];
        int i9 = i7 ^ sArr[this.key2[i2] ^ i8];
        return (i9 << 8) + (sArr[this.key3[i2] ^ i9] ^ i8);
    }

    private int h(int i2, int i3) {
        int i4 = (-1) - (((-1) - (i3 >> 8)) | ((-1) - 255));
        short[] sArr = ftable;
        int i5 = (i3 & 255) ^ sArr[this.key3[i2] ^ i4];
        int i6 = i4 ^ sArr[this.key2[i2] ^ i5];
        int i7 = i5 ^ sArr[this.key1[i2] ^ i6];
        return ((sArr[this.key0[i2] ^ i7] ^ i6) << 8) + i7;
    }

    public int decryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = bArr[i2] << 8;
        byte b2 = bArr[i2 + 1];
        int i5 = i4 + ((b2 + 255) - (b2 | 255));
        int i6 = (bArr[i2 + 2] << 8) + (bArr[i2 + 3] & 255);
        int i7 = (bArr[i2 + 4] << 8) + (bArr[i2 + 5] & 255);
        int i8 = (bArr[i2 + 6] << 8) + ((-1) - (((-1) - bArr[i2 + 7]) | ((-1) - 255)));
        int i9 = 31;
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = 0;
            while (i11 < 8) {
                int iH = h(i9, i6);
                int i12 = (i7 ^ iH) ^ (i9 + 1);
                i9--;
                i11++;
                int i13 = i8;
                i8 = i5;
                i5 = iH;
                i6 = i12;
                i7 = i13;
            }
            int i14 = 0;
            while (i14 < 8) {
                int i15 = (i5 ^ i6) ^ (i9 + 1);
                int iH2 = h(i9, i6);
                i9--;
                i14++;
                int i16 = i8;
                i8 = i15;
                i5 = iH2;
                i6 = i7;
                i7 = i16;
            }
        }
        bArr2[i3] = (byte) (i5 >> 8);
        bArr2[i3 + 1] = (byte) i5;
        bArr2[i3 + 2] = (byte) (i6 >> 8);
        bArr2[i3 + 3] = (byte) i6;
        bArr2[i3 + 4] = (byte) (i7 >> 8);
        bArr2[i3 + 5] = (byte) i7;
        bArr2[i3 + 6] = (byte) (i8 >> 8);
        bArr2[i3 + 7] = (byte) i8;
        return 8;
    }

    public int encryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = (bArr[i2] << 8) + (bArr[i2 + 1] & 255);
        int i5 = bArr[i2 + 2] << 8;
        byte b2 = bArr[i2 + 3];
        int i6 = i5 + ((b2 + 255) - (b2 | 255));
        int i7 = (bArr[i2 + 4] << 8) + ((-1) - (((-1) - bArr[i2 + 5]) | ((-1) - 255)));
        int i8 = bArr[i2 + 6] << 8;
        byte b3 = bArr[i2 + 7];
        int i9 = i8 + ((b3 + 255) - (b3 | 255));
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            int i12 = 0;
            while (i12 < 8) {
                int iG = g(i10, i4);
                i10++;
                i12++;
                int i13 = i6;
                i6 = iG;
                i4 = (i9 ^ iG) ^ i10;
                i9 = i7;
                i7 = i13;
            }
            int i14 = 0;
            while (i14 < 8) {
                int i15 = i10 + 1;
                int i16 = (i6 ^ i4) ^ i15;
                int iG2 = g(i10, i4);
                i14++;
                i10 = i15;
                i6 = iG2;
                i4 = i9;
                i9 = i7;
                i7 = i16;
            }
        }
        bArr2[i3] = (byte) (i4 >> 8);
        bArr2[i3 + 1] = (byte) i4;
        bArr2[i3 + 2] = (byte) (i6 >> 8);
        bArr2[i3 + 3] = (byte) i6;
        bArr2[i3 + 4] = (byte) (i7 >> 8);
        bArr2[i3 + 5] = (byte) i7;
        bArr2[i3 + 6] = (byte) (i9 >> 8);
        bArr2[i3 + 7] = (byte) i9;
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to SKIPJACK init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.encrypting = z2;
        this.key0 = new int[32];
        this.key1 = new int[32];
        this.key2 = new int[32];
        this.key3 = new int[32];
        for (int i2 = 0; i2 < 32; i2++) {
            int[] iArr = this.key0;
            int i3 = i2 * 4;
            byte b2 = key[i3 % 10];
            iArr[i2] = (b2 + 255) - (b2 | 255);
            this.key1[i2] = key[(i3 + 1) % 10] & 255;
            this.key2[i2] = (-1) - (((-1) - key[(i3 + 2) % 10]) | ((-1) - 255));
            int[] iArr2 = this.key3;
            byte b3 = key[(i3 + 3) % 10];
            iArr2[i2] = (b3 + 255) - (b3 | 255);
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (this.key1 == null) {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i2 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i2, bArr2, i3);
            return 8;
        }
        decryptBlock(bArr, i2, bArr2, i3);
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
