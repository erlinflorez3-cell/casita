package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes6.dex */
public class Shacal2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 32;
    private static final int[] K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private static final int ROUNDS = 64;
    private boolean forEncryption = false;
    private int[] workingKey = null;

    private void byteBlockToInts(byte[] bArr, int[] iArr, int i2, int i3) {
        while (i3 < 8) {
            int i4 = ((-1) - (((-1) - bArr[i2]) | ((-1) - 255))) << 24;
            int i5 = bArr[i2 + 1];
            int i6 = (((i5 + 255) - (i5 | 255)) << 16) | i4;
            int i7 = i2 + 3;
            int i8 = bArr[i2 + 2];
            int i9 = (((i8 + 255) - (i8 | 255)) << 8) | i6;
            i2 += 4;
            int i10 = bArr[i7] & 255;
            iArr[i3] = (i9 + i10) - (i9 & i10);
            i3++;
        }
    }

    private void bytes2ints(byte[] bArr, int[] iArr, int i2, int i3) {
        while (i3 < bArr.length / 4) {
            int i4 = bArr[i2];
            int i5 = (-1) - (((-1) - ((bArr[i2 + 1] & 255) << 16)) & ((-1) - (((i4 + 255) - (i4 | 255)) << 24)));
            int i6 = i2 + 3;
            int i7 = bArr[i2 + 2];
            int i8 = ((i7 + 255) - (i7 | 255)) << 8;
            i2 += 4;
            int i9 = bArr[i6];
            iArr[i3] = (-1) - (((-1) - ((i5 + i8) - (i5 & i8))) & ((-1) - ((i9 + 255) - (i9 | 255))));
            i3++;
        }
    }

    private void decryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i2, 0);
        for (int i4 = 63; i4 > -1; i4--) {
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = i6 >>> 2;
            int i8 = i6 << (-2);
            int i9 = ((i7 + i8) - (i7 & i8)) ^ ((i6 >>> 13) | (i6 << (-13)));
            int i10 = i6 >>> 22;
            int i11 = i6 << (-22);
            int i12 = i5 - (i9 ^ ((i10 + i11) - (i10 & i11)));
            int i13 = iArr[2];
            int i14 = iArr[3];
            int i15 = i12 - ((((-1) - (((-1) - i6) | ((-1) - i13))) ^ ((i6 + i14) - (i6 | i14))) ^ (i13 & i14));
            iArr[0] = i6;
            iArr[1] = i13;
            iArr[2] = i14;
            iArr[3] = iArr[4] - i15;
            int i16 = iArr[5];
            iArr[4] = i16;
            int i17 = iArr[6];
            iArr[5] = i17;
            int i18 = iArr[7];
            iArr[6] = i18;
            iArr[7] = (((i15 - K[i4]) - this.workingKey[i4]) - ((((-1) - (((-1) - (i16 >>> 6)) & ((-1) - (i16 << (-6))))) ^ ((-1) - (((-1) - (i16 >>> 11)) & ((-1) - (i16 << (-11)))))) ^ ((-1) - (((-1) - (i16 >>> 25)) & ((-1) - (i16 << (-25))))))) - (((i16 + i17) - (i16 | i17)) ^ ((-1) - (((-1) - (~i16)) | ((-1) - i18))));
        }
        ints2bytes(iArr, bArr2, i3);
    }

    private void encryptBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i2, 0);
        for (int i4 = 0; i4 < 64; i4++) {
            int i5 = iArr[4];
            int i6 = i5 >>> 11;
            int i7 = i5 << (-11);
            int i8 = (((i5 >>> 6) | (i5 << (-6))) ^ ((i6 + i7) - (i6 & i7))) ^ ((-1) - (((-1) - (i5 >>> 25)) & ((-1) - (i5 << (-25)))));
            int i9 = iArr[5];
            int i10 = ~i5;
            int i11 = iArr[6];
            int i12 = i8 + ((i5 & i9) ^ ((i10 + i11) - (i10 | i11))) + iArr[7] + K[i4] + this.workingKey[i4];
            iArr[7] = i11;
            iArr[6] = i9;
            iArr[5] = i5;
            iArr[4] = iArr[3] + i12;
            int i13 = iArr[2];
            iArr[3] = i13;
            int i14 = iArr[1];
            iArr[2] = i14;
            int i15 = iArr[0];
            iArr[1] = i15;
            int i16 = i15 >>> 2;
            int i17 = i15 << (-2);
            iArr[0] = i12 + ((((i16 + i17) - (i16 & i17)) ^ ((i15 >>> 13) | (i15 << (-13)))) ^ ((i15 >>> 22) | (i15 << (-22)))) + ((((i15 + i13) - (i15 | i13)) ^ ((-1) - (((-1) - i15) | ((-1) - i14)))) ^ ((i14 + i13) - (i14 | i13)));
        }
        ints2bytes(iArr, bArr2, i3);
    }

    private void ints2bytes(int[] iArr, byte[] bArr, int i2) {
        for (int i3 : iArr) {
            bArr[i2] = (byte) (i3 >>> 24);
            bArr[i2 + 1] = (byte) (i3 >>> 16);
            int i4 = i2 + 3;
            bArr[i2 + 2] = (byte) (i3 >>> 8);
            i2 += 4;
            bArr[i4] = (byte) i3;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Shacal2";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.forEncryption = z2;
        this.workingKey = new int[64];
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        if (this.workingKey == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        }
        if (i2 + 32 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 32 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i2, bArr2, i3);
            return 32;
        }
        decryptBlock(bArr, i2, bArr2, i3);
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public void setKey(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                bytes2ints(bArr, this.workingKey, 0, 0);
                for (int i2 = 16; i2 < 64; i2++) {
                    int[] iArr = this.workingKey;
                    int i3 = iArr[i2 - 2];
                    int i4 = ((i3 >>> 10) ^ (((-1) - (((-1) - (i3 >>> 17)) & ((-1) - (i3 << (-17))))) ^ ((i3 >>> 19) | (i3 << (-19))))) + iArr[i2 - 7];
                    int i5 = iArr[i2 - 15];
                    int i6 = i5 >>> 18;
                    int i7 = i5 << (-18);
                    iArr[i2] = i4 + ((i5 >>> 3) ^ (((i5 >>> 7) | (i5 << (-7))) ^ ((i6 + i7) - (i6 & i7)))) + iArr[i2 - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
    }
}
