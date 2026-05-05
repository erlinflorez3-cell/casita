package org.bouncycastle.crypto.digests;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imageutils.JfifUtil;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes9.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private static final int[] SBOX = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, Mp4VideoDirectory.TAG_COMPRESSION_TYPE, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, JfifUtil.MARKER_RST7, 194, 46, 75, 254, 87, 21, PanasonicMakernoteDirectory.TAG_BURST_SPEED, 55, 229, 159, 240, 74, JfifUtil.MARKER_SOS, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, JfifUtil.MARKER_SOI, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, Mp4VideoDirectory.TAG_COLOR_TABLE, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, Mp4VideoDirectory.TAG_FRAME_RATE, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, Mp4VideoDirectory.TAG_OPCOLOR, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, Mp4VideoDirectory.TAG_DEPTH, 165, 226, 97, 179, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, JfifUtil.MARKER_APP1, 22, 58, 105, 9, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 182, 208, 237, 204, 66, 152, 164, 40, 92, 248, 134};
    private static final long[] C0 = new long[256];
    private static final long[] C1 = new long[256];
    private static final long[] C2 = new long[256];
    private static final long[] C3 = new long[256];
    private static final long[] C4 = new long[256];
    private static final long[] C5 = new long[256];
    private static final long[] C6 = new long[256];
    private static final long[] C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    public WhirlpoolDigest() {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = SBOX[i2];
            int iMaskWithReductionPolynomial = maskWithReductionPolynomial(i3 << 1);
            int iMaskWithReductionPolynomial2 = maskWithReductionPolynomial(iMaskWithReductionPolynomial << 1);
            int i4 = iMaskWithReductionPolynomial2 ^ i3;
            int iMaskWithReductionPolynomial3 = maskWithReductionPolynomial(iMaskWithReductionPolynomial2 << 1);
            int i5 = iMaskWithReductionPolynomial3 ^ i3;
            C0[i2] = packIntoLong(i3, i3, iMaskWithReductionPolynomial2, i3, iMaskWithReductionPolynomial3, i4, iMaskWithReductionPolynomial, i5);
            C1[i2] = packIntoLong(i5, i3, i3, iMaskWithReductionPolynomial2, i3, iMaskWithReductionPolynomial3, i4, iMaskWithReductionPolynomial);
            C2[i2] = packIntoLong(iMaskWithReductionPolynomial, i5, i3, i3, iMaskWithReductionPolynomial2, i3, iMaskWithReductionPolynomial3, i4);
            C3[i2] = packIntoLong(i4, iMaskWithReductionPolynomial, i5, i3, i3, iMaskWithReductionPolynomial2, i3, iMaskWithReductionPolynomial3);
            C4[i2] = packIntoLong(iMaskWithReductionPolynomial3, i4, iMaskWithReductionPolynomial, i5, i3, i3, iMaskWithReductionPolynomial2, i3);
            C5[i2] = packIntoLong(i3, iMaskWithReductionPolynomial3, i4, iMaskWithReductionPolynomial, i5, i3, i3, iMaskWithReductionPolynomial2);
            C6[i2] = packIntoLong(iMaskWithReductionPolynomial2, i3, iMaskWithReductionPolynomial3, i4, iMaskWithReductionPolynomial, i5, i3, i3);
            C7[i2] = packIntoLong(i3, iMaskWithReductionPolynomial2, i3, iMaskWithReductionPolynomial3, i4, iMaskWithReductionPolynomial, i5, i3);
        }
        this._rc[0] = 0;
        for (int i6 = 1; i6 <= 10; i6++) {
            int i7 = (i6 - 1) * 8;
            long[] jArr = this._rc;
            long j2 = C0[i7] & (-72057594037927936L);
            long j3 = C1[i7 + 1];
            long j4 = ((j2 ^ ((j3 + 71776119061217280L) - (j3 | 71776119061217280L))) ^ (C2[i7 + 2] & 280375465082880L)) ^ ((-1) - (((-1) - C3[i7 + 3]) | ((-1) - 1095216660480L)));
            long j5 = C4[i7 + 4];
            jArr[i6] = (((j4 ^ ((j5 + 4278190080L) - (j5 | 4278190080L))) ^ ((-1) - (((-1) - C5[i7 + 5]) | ((-1) - 16711680)))) ^ (C6[i7 + 6] & 65280)) ^ ((-1) - (((-1) - C7[i7 + 7]) | ((-1) - 255)));
        }
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        reset(whirlpoolDigest);
    }

    private long bytesToLongFromBuffer(byte[] bArr, int i2) {
        long j2 = ((-1) - (((-1) - ((long) bArr[i2])) | ((-1) - 255))) << 56;
        long j3 = bArr[i2 + 1];
        long j4 = ((j3 + 255) - (j3 | 255)) << 48;
        long j5 = ((j2 + j4) - (j2 & j4)) | ((((long) bArr[i2 + 2]) & 255) << 40);
        long j6 = (((long) bArr[i2 + 3]) & 255) << 32;
        long j7 = ((-1) - (((-1) - ((j5 + j6) - (j5 & j6))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 4])) | ((-1) - 255))) << 24)))) | (((-1) - (((-1) - ((long) bArr[i2 + 5])) | ((-1) - 255))) << 16);
        long j8 = bArr[i2 + 6];
        return (-1) - (((-1) - (((long) bArr[i2 + 7]) & 255)) & ((-1) - (j7 | (((j8 + 255) - (j8 | 255)) << 8))));
    }

    private void convertLongToByteArray(long j2, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 8; i3++) {
            bArr[i2 + i3] = (byte) ((-1) - (((-1) - (j2 >> (56 - (i3 * 8)))) | ((-1) - 255)));
        }
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < 32; i2++) {
            short s2 = this._bitCount[i2];
            bArr[i2] = (byte) ((s2 + 255) - (s2 | 255));
        }
        return bArr;
    }

    private void finish() {
        byte[] bArrCopyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i2 = this._bufferPos;
        int i3 = i2 + 1;
        this._bufferPos = i3;
        bArr[i2] = (byte) (bArr[i2] | 128);
        if (i3 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArrCopyBitLength, 0, this._buffer, 32, bArrCopyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i2 = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i3 = ((-1) - (((-1) - sArr[length]) | ((-1) - 255))) + EIGHT[length] + i2;
            i2 = i3 >>> 8;
            sArr[length] = (short) (i3 & 255);
        }
    }

    private int maskWithReductionPolynomial(int i2) {
        return ((long) i2) >= 256 ? i2 ^ 285 : i2;
    }

    private long packIntoLong(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return (((((((((long) i3) << 48) ^ (((long) i2) << 56)) ^ (((long) i4) << 40)) ^ (((long) i5) << 32)) ^ (((long) i6) << 24)) ^ (((long) i7) << 16)) ^ (((long) i8) << 8)) ^ ((long) i9);
    }

    private void processFilledBuffer(byte[] bArr, int i2) {
        for (int i3 = 0; i3 < this._state.length; i3++) {
            this._block[i3] = bytesToLongFromBuffer(this._buffer, i3 * 8);
        }
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i2) {
        finish();
        for (int i3 = 0; i3 < 8; i3++) {
            convertLongToByteArray(this._hash[i3], bArr, (i3 * 8) + i2);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    protected void processBlock() {
        long[] jArr;
        for (int i2 = 0; i2 < 8; i2++) {
            long[] jArr2 = this._state;
            long j2 = this._block[i2];
            long[] jArr3 = this._K;
            long j3 = this._hash[i2];
            jArr3[i2] = j3;
            jArr2[i2] = j2 ^ j3;
        }
        for (int i3 = 1; i3 <= 10; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                long[] jArr4 = this._L;
                jArr4[i4] = 0;
                long[] jArr5 = C0;
                long[] jArr6 = this._K;
                long j4 = jArr5[((int) (jArr6[(-1) - (((-1) - i4) | ((-1) - 7))] >>> 56)) & 255];
                jArr4[i4] = j4;
                long[] jArr7 = C1;
                int i5 = i4 - 1;
                int i6 = (int) (jArr6[(i5 + 7) - (i5 | 7)] >>> 48);
                long j5 = jArr7[(i6 + 255) - (i6 | 255)] ^ j4;
                jArr4[i4] = j5;
                long j6 = j5 ^ C2[((int) (jArr6[(-1) - (((-1) - (i4 - 2)) | ((-1) - 7))] >>> 40)) & 255];
                jArr4[i4] = j6;
                int i7 = i4 - 3;
                long j7 = j6 ^ C3[((int) (jArr6[(i7 + 7) - (i7 | 7)] >>> 32)) & 255];
                jArr4[i4] = j7;
                int i8 = i4 - 4;
                long j8 = j7 ^ C4[(-1) - (((-1) - ((int) (jArr6[(i8 + 7) - (i8 | 7)] >>> 24))) | ((-1) - 255))];
                jArr4[i4] = j8;
                long[] jArr8 = C5;
                int i9 = (int) (jArr6[(-1) - (((-1) - (i4 - 5)) | ((-1) - 7))] >>> 16);
                long j9 = j8 ^ jArr8[(i9 + 255) - (i9 | 255)];
                jArr4[i4] = j9;
                long[] jArr9 = C6;
                int i10 = (int) (jArr6[(i4 - 6) & 7] >>> 8);
                long j10 = j9 ^ jArr9[(i10 + 255) - (i10 | 255)];
                jArr4[i4] = j10;
                jArr4[i4] = j10 ^ C7[(-1) - (((-1) - ((int) jArr6[(i4 - 7) & 7])) | ((-1) - 255))];
            }
            long[] jArr10 = this._L;
            long[] jArr11 = this._K;
            System.arraycopy(jArr10, 0, jArr11, 0, jArr11.length);
            long[] jArr12 = this._K;
            jArr12[0] = jArr12[0] ^ this._rc[i3];
            int i11 = 0;
            while (true) {
                jArr = this._L;
                if (i11 < 8) {
                    long j11 = this._K[i11];
                    jArr[i11] = j11;
                    long[] jArr13 = C0;
                    long[] jArr14 = this._state;
                    long j12 = jArr13[(-1) - (((-1) - ((int) (jArr14[7 & i11] >>> 56))) | ((-1) - 255))] ^ j11;
                    jArr[i11] = j12;
                    int i12 = i11 - 1;
                    long j13 = j12 ^ C1[(-1) - (((-1) - ((int) (jArr14[(i12 + 7) - (i12 | 7)] >>> 48))) | ((-1) - 255))];
                    jArr[i11] = j13;
                    int i13 = i11 - 2;
                    long j14 = j13 ^ C2[((int) (jArr14[(i13 + 7) - (i13 | 7)] >>> 40)) & 255];
                    jArr[i11] = j14;
                    long j15 = j14 ^ C3[(-1) - (((-1) - ((int) (jArr14[(-1) - (((-1) - (i11 - 3)) | ((-1) - 7))] >>> 32))) | ((-1) - 255))];
                    jArr[i11] = j15;
                    long[] jArr15 = C4;
                    int i14 = i11 - 4;
                    int i15 = (int) (jArr14[(i14 + 7) - (i14 | 7)] >>> 24);
                    long j16 = j15 ^ jArr15[(i15 + 255) - (i15 | 255)];
                    jArr[i11] = j16;
                    long[] jArr16 = C5;
                    int i16 = (int) (jArr14[(i11 - 5) & 7] >>> 16);
                    long j17 = j16 ^ jArr16[(i16 + 255) - (i16 | 255)];
                    jArr[i11] = j17;
                    long j18 = j17 ^ C6[(-1) - (((-1) - ((int) (jArr14[(i11 - 6) & 7] >>> 8))) | ((-1) - 255))];
                    jArr[i11] = j18;
                    int i17 = i11 - 7;
                    jArr[i11] = j18 ^ C7[(-1) - (((-1) - ((int) jArr14[(i17 + 7) - (i17 | 7)])) | ((-1) - 255))];
                    i11++;
                }
            }
            long[] jArr17 = this._state;
            System.arraycopy(jArr, 0, jArr17, 0, jArr17.length);
        }
        for (int i18 = 0; i18 < 8; i18++) {
            long[] jArr18 = this._hash;
            jArr18[i18] = jArr18[i18] ^ (this._state[i18] ^ this._block[i18]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this._buffer;
        int i2 = this._bufferPos;
        bArr[i2] = b2;
        int i3 = i2 + 1;
        this._bufferPos = i3;
        if (i3 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
    }
}
