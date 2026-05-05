package com.google.common.hash;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {
    static final HashFunction FINGERPRINT_2011 = new Fingerprint2011();
    private static final long K0 = -6505348102511208375L;
    private static final long K1 = -8261664234251669945L;
    private static final long K2 = -4288712594273399085L;
    private static final long K3 = -4132994306676758123L;

    Fingerprint2011() {
    }

    static long fingerprint(byte[] bytes, int offset, int length) {
        long jMurmurHash64WithSeed = length <= 32 ? murmurHash64WithSeed(bytes, offset, length, -1397348546323613475L) : length <= 64 ? hashLength33To64(bytes, offset, length) : fullFingerprint(bytes, offset, length);
        long jLoad64 = K0;
        long jLoad642 = length >= 8 ? LittleEndianByteArray.load64(bytes, offset) : -6505348102511208375L;
        if (length >= 9) {
            jLoad64 = LittleEndianByteArray.load64(bytes, (offset + length) - 8);
        }
        long jHash128to64 = hash128to64(jMurmurHash64WithSeed + jLoad64, jLoad642);
        return (jHash128to64 == 0 || jHash128to64 == 1) ? jHash128to64 - 2 : jHash128to64;
    }

    private static long fullFingerprint(byte[] bytes, int offset, int length) {
        int i2 = offset;
        long jLoad64 = LittleEndianByteArray.load64(bytes, i2);
        int i3 = i2 + length;
        long jLoad642 = LittleEndianByteArray.load64(bytes, i3 - 16) ^ K1;
        long jLoad643 = LittleEndianByteArray.load64(bytes, i3 - 56) ^ K0;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j2 = length;
        weakHashLength32WithSeeds(bytes, i3 - 64, j2, jLoad642, jArr);
        weakHashLength32WithSeeds(bytes, i3 - 32, j2 * K1, K0, jArr2);
        long jShiftMix = jLoad643 + (shiftMix(jArr[1]) * K1);
        long jRotateRight = Long.rotateRight(jShiftMix + jLoad64, 39) * K1;
        long jRotateRight2 = Long.rotateRight(jLoad642, 33) * K1;
        int i4 = (-1) - (((-1) - (length - 1)) | ((-1) - (-64)));
        while (true) {
            long jRotateRight3 = Long.rotateRight(jRotateRight + jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bytes, i2 + 16), 37) * K1;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + LittleEndianByteArray.load64(bytes, i2 + 48), 42) * K1;
            long j3 = jRotateRight3 ^ jArr2[1];
            jRotateRight2 = jRotateRight4 ^ jArr[0];
            jRotateRight = Long.rotateRight(jShiftMix ^ jArr2[0], 33);
            weakHashLength32WithSeeds(bytes, i2, jArr[1] * K1, j3 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bytes, i2 + 32, jArr2[1] + jRotateRight, jRotateRight2, jArr2);
            i2 += 64;
            i4 -= 64;
            if (i4 == 0) {
                return hash128to64(hash128to64(jArr[0], jArr2[0]) + (shiftMix(jRotateRight2) * K1) + j3, hash128to64(jArr[1], jArr2[1]) + jRotateRight);
            }
            jShiftMix = j3;
        }
    }

    static long hash128to64(long high, long low) {
        long j2 = (low ^ high) * K3;
        long j3 = (high ^ (j2 ^ (j2 >>> 47))) * K3;
        return (j3 ^ (j3 >>> 47)) * K3;
    }

    private static long hashLength33To64(byte[] bytes, int offset, int length) {
        long jLoad64 = LittleEndianByteArray.load64(bytes, offset + 24);
        int i2 = offset + length;
        int i3 = i2 - 16;
        long jLoad642 = LittleEndianByteArray.load64(bytes, offset) + ((((long) length) + LittleEndianByteArray.load64(bytes, i3)) * K0);
        long jRotateRight = Long.rotateRight(jLoad642 + jLoad64, 52);
        long jRotateRight2 = Long.rotateRight(jLoad642, 37);
        long jLoad643 = jLoad642 + LittleEndianByteArray.load64(bytes, offset + 8);
        long jRotateRight3 = jRotateRight2 + Long.rotateRight(jLoad643, 7);
        int i4 = offset + 16;
        long jLoad644 = jLoad643 + LittleEndianByteArray.load64(bytes, i4);
        long j2 = jLoad64 + jLoad644;
        long jRotateRight4 = jRotateRight + Long.rotateRight(jLoad644, 31) + jRotateRight3;
        long jLoad645 = LittleEndianByteArray.load64(bytes, i4) + LittleEndianByteArray.load64(bytes, i2 - 32);
        long jLoad646 = LittleEndianByteArray.load64(bytes, i2 - 8);
        long jRotateRight5 = Long.rotateRight(jLoad645 + jLoad646, 52);
        long jRotateRight6 = Long.rotateRight(jLoad645, 37);
        long jLoad647 = jLoad645 + LittleEndianByteArray.load64(bytes, i2 - 24);
        long jRotateRight7 = jRotateRight6 + Long.rotateRight(jLoad647, 7);
        long jLoad648 = jLoad647 + LittleEndianByteArray.load64(bytes, i3);
        return shiftMix((shiftMix(((j2 + jRotateRight5 + Long.rotateRight(jLoad648, 31) + jRotateRight7) * K2) + ((jLoad646 + jLoad648 + jRotateRight4) * K0)) * K0) + jRotateRight4) * K2;
    }

    static long murmurHash64WithSeed(byte[] bytes, int offset, int length, long seed) {
        int i2 = (length - 8) - ((-8) | length);
        int i3 = length & 7;
        long jLoad64Safely = seed ^ (((long) length) * K3);
        for (int i4 = 0; i4 < i2; i4 += 8) {
            jLoad64Safely = (jLoad64Safely ^ (shiftMix(LittleEndianByteArray.load64(bytes, offset + i4) * K3) * K3)) * K3;
        }
        if (i3 != 0) {
            jLoad64Safely = (LittleEndianByteArray.load64Safely(bytes, offset + i2, i3) ^ jLoad64Safely) * K3;
        }
        return shiftMix(shiftMix(jLoad64Safely) * K3);
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
        long jRotateRight = Long.rotateRight(seedB + j2 + jLoad644, 51) + Long.rotateRight(j3, 23);
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
        return "Hashing.fingerprint2011()";
    }
}
