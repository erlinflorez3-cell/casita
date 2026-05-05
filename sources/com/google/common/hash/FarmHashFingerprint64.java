package com.google.common.hash;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    FarmHashFingerprint64() {
    }

    static long fingerprint(byte[] bytes, int offset, int length) {
        return length <= 32 ? length <= 16 ? hashLength0to16(bytes, offset, length) : hashLength17to32(bytes, offset, length) : length <= 64 ? hashLength33To64(bytes, offset, length) : hashLength65Plus(bytes, offset, length);
    }

    private static long hashLength0to16(byte[] bytes, int offset, int length) {
        if (length >= 8) {
            long j2 = (((long) length) * 2) + K2;
            long jLoad64 = LittleEndianByteArray.load64(bytes, offset) + K2;
            long jLoad642 = LittleEndianByteArray.load64(bytes, (offset + length) - 8);
            return hashLength16((Long.rotateRight(jLoad642, 37) * j2) + jLoad64, (Long.rotateRight(jLoad64, 25) + jLoad642) * j2, j2);
        }
        if (length >= 4) {
            return hashLength16(((long) length) + ((((long) LittleEndianByteArray.load32(bytes, offset)) & 4294967295L) << 3), ((long) LittleEndianByteArray.load32(bytes, (offset + length) - 4)) & 4294967295L, ((long) (length * 2)) + K2);
        }
        if (length <= 0) {
            return K2;
        }
        return shiftMix((((long) ((bytes[offset] & 255) + (((-1) - (((-1) - bytes[(length >> 1) + offset]) | ((-1) - 255))) << 8))) * K2) ^ (((long) (length + (((-1) - (((-1) - bytes[offset + (length - 1)]) | ((-1) - 255))) << 2))) * K0)) * K2;
    }

    private static long hashLength16(long u2, long v2, long mul) {
        long j2 = (u2 ^ v2) * mul;
        long j3 = ((j2 ^ (j2 >>> 47)) ^ v2) * mul;
        return (j3 ^ (j3 >>> 47)) * mul;
    }

    private static long hashLength17to32(byte[] bytes, int offset, int length) {
        long j2 = (((long) length) * 2) + K2;
        long jLoad64 = LittleEndianByteArray.load64(bytes, offset) * K1;
        long jLoad642 = LittleEndianByteArray.load64(bytes, offset + 8);
        int i2 = offset + length;
        long jLoad643 = LittleEndianByteArray.load64(bytes, i2 - 8) * j2;
        return hashLength16((LittleEndianByteArray.load64(bytes, i2 - 16) * K2) + Long.rotateRight(jLoad64 + jLoad642, 43) + Long.rotateRight(jLoad643, 30), jLoad643 + jLoad64 + Long.rotateRight(jLoad642 + K2, 18), j2);
    }

    private static long hashLength33To64(byte[] bytes, int offset, int length) {
        long j2 = (((long) length) * 2) + K2;
        long jLoad64 = LittleEndianByteArray.load64(bytes, offset) * K2;
        long jLoad642 = LittleEndianByteArray.load64(bytes, offset + 8);
        int i2 = offset + length;
        long jLoad643 = LittleEndianByteArray.load64(bytes, i2 - 8) * j2;
        long jRotateRight = Long.rotateRight(jLoad64 + jLoad642, 43) + Long.rotateRight(jLoad643, 30) + (LittleEndianByteArray.load64(bytes, i2 - 16) * K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad643 + Long.rotateRight(jLoad642 + K2, 18) + jLoad64, j2);
        long jLoad644 = LittleEndianByteArray.load64(bytes, offset + 16) * j2;
        long jLoad645 = LittleEndianByteArray.load64(bytes, offset + 24);
        long jLoad646 = (jRotateRight + LittleEndianByteArray.load64(bytes, i2 - 32)) * j2;
        return hashLength16(((jHashLength16 + LittleEndianByteArray.load64(bytes, i2 - 24)) * j2) + Long.rotateRight(jLoad644 + jLoad645, 43) + Long.rotateRight(jLoad646, 30), jLoad644 + Long.rotateRight(jLoad645 + jLoad64, 18) + jLoad646, j2);
    }

    private static long hashLength65Plus(byte[] bytes, int offset, int length) {
        int i2 = offset;
        long j2 = 81;
        long jLoad64 = (j2 * K1) + 113;
        long jShiftMix = shiftMix((jLoad64 * K2) + 113) * K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jLoad642 = (j2 * K2) + LittleEndianByteArray.load64(bytes, i2);
        int i3 = length - 1;
        int i4 = i2 + ((i3 / 64) * 64);
        int i5 = (i3 + 63) - (i3 | 63);
        int i6 = i4 + i5;
        int i7 = i6 - 63;
        while (true) {
            long jRotateRight = Long.rotateRight(jLoad642 + jLoad64 + jArr[0] + LittleEndianByteArray.load64(bytes, i2 + 8), 37) * K1;
            long jRotateRight2 = Long.rotateRight(jLoad64 + jArr[1] + LittleEndianByteArray.load64(bytes, i2 + 48), 42) * K1;
            long j3 = jRotateRight ^ jArr2[1];
            jLoad64 = jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bytes, i2 + 40);
            jLoad642 = Long.rotateRight(jShiftMix + jArr2[0], 33) * K1;
            weakHashLength32WithSeeds(bytes, i2, jArr[1] * K1, j3 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bytes, i2 + 32, jLoad642 + jArr2[1], jLoad64 + LittleEndianByteArray.load64(bytes, i2 + 16), jArr2);
            i2 += 64;
            if (i2 == i4) {
                long j4 = K1 + (((j3 + 255) - (j3 | 255)) << 1);
                long j5 = jArr2[0] + ((long) i5);
                jArr2[0] = j5;
                long j6 = jArr[0] + j5;
                jArr[0] = j6;
                jArr2[0] = jArr2[0] + j6;
                long jRotateRight3 = Long.rotateRight(jLoad642 + jLoad64 + jArr[0] + LittleEndianByteArray.load64(bytes, i6 - 55), 37) * j4;
                long jRotateRight4 = Long.rotateRight(jLoad64 + jArr[1] + LittleEndianByteArray.load64(bytes, i6 - 15), 42) * j4;
                long j7 = jRotateRight3 ^ (jArr2[1] * 9);
                long jLoad643 = jRotateRight4 + (jArr[0] * 9) + LittleEndianByteArray.load64(bytes, i6 - 23);
                long jRotateRight5 = Long.rotateRight(j3 + jArr2[0], 33) * j4;
                weakHashLength32WithSeeds(bytes, i7, jArr[1] * j4, j7 + jArr2[0], jArr);
                weakHashLength32WithSeeds(bytes, i6 - 31, jRotateRight5 + jArr2[1], jLoad643 + LittleEndianByteArray.load64(bytes, i6 - 47), jArr2);
                return hashLength16(hashLength16(jArr[0], jArr2[0], j4) + (shiftMix(jLoad643) * K0) + j7, hashLength16(jArr[1], jArr2[1], j4) + jRotateRight5, j4);
            }
            jShiftMix = j3;
        }
    }

    private static long shiftMix(long val) {
        return val ^ (val >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bytes, int offset, long seedA, long seedB, long[] output) {
        long jLoad64 = LittleEndianByteArray.load64(bytes, offset);
        long jLoad642 = LittleEndianByteArray.load64(bytes, offset + 8);
        long jLoad643 = LittleEndianByteArray.load64(bytes, offset + 16);
        long jLoad644 = LittleEndianByteArray.load64(bytes, offset + 24);
        long j2 = seedA + jLoad64;
        long j3 = jLoad642 + j2 + jLoad643;
        long jRotateRight = Long.rotateRight(seedB + j2 + jLoad644, 21) + Long.rotateRight(j3, 44);
        output[0] = j3 + jLoad644;
        output[1] = jRotateRight + j2;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] input, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, input.length);
        return HashCode.fromLong(fingerprint(input, off, len));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
