package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.BloomFilter;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T object, Funnel<? super T> funnel, int numHashFunctions, LockFreeBitArray bits) {
            long jBitSize = bits.bitSize();
            long jAsLong = Hashing.murmur3_128().hashObject(object, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            for (int i4 = 1; i4 <= numHashFunctions; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!bits.get(((long) i5) % jBitSize)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t2, Funnel<? super T> funnel, int i2, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            long jAsLong = Hashing.murmur3_128().hashObject(t2, funnel).asLong();
            int i3 = (int) jAsLong;
            int i4 = (int) (jAsLong >>> 32);
            ?? r3 = 0;
            int i5 = 1;
            while (i5 <= i2) {
                int i6 = (i5 * i4) + i3;
                if (i6 < 0) {
                    i6 = ~i6;
                }
                int i7 = (-1) - (((-1) - r3) & ((-1) - (lockFreeBitArray.set(((long) i6) % jBitSize) ? 1 : 0)));
                boolean z2 = true;
                if (i7 != 1) {
                    z2 = false;
                }
                i5++;
                r3 = z2;
            }
            return r3;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bytes) {
            return Longs.fromBytes(bytes[7], bytes[6], bytes[5], bytes[4], bytes[3], bytes[2], bytes[1], bytes[0]);
        }

        private long upperEight(byte[] bytes) {
            return Longs.fromBytes(bytes[15], bytes[14], bytes[13], bytes[12], bytes[11], bytes[10], bytes[9], bytes[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T object, Funnel<? super T> funnel, int numHashFunctions, LockFreeBitArray bits) {
            long jBitSize = bits.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(object, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            for (int i2 = 0; i2 < numHashFunctions; i2++) {
                if (!bits.get((Long.MAX_VALUE & jLowerEight) % jBitSize)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T object, Funnel<? super T> funnel, int numHashFunctions, LockFreeBitArray bits) {
            long jBitSize = bits.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(object, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            boolean z2 = false;
            for (int i2 = 0; i2 < numHashFunctions; i2++) {
                z2 |= bits.set(((-1) - (((-1) - Long.MAX_VALUE) | ((-1) - jLowerEight))) % jBitSize);
                jLowerEight += jUpperEight;
            }
            return z2;
        }
    };

    static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final LongAddable bitCount;
        final AtomicLongArray data;

        LockFreeBitArray(long bits) {
            Preconditions.checkArgument(bits > 0, "data length is zero!");
            this.data = new AtomicLongArray(Ints.checkedCast(LongMath.divide(bits, 64L, RoundingMode.CEILING)));
            this.bitCount = LongAddables.create();
        }

        LockFreeBitArray(long[] data) {
            Preconditions.checkArgument(data.length > 0, "data length is zero!");
            this.data = new AtomicLongArray(data);
            this.bitCount = LongAddables.create();
            long jBitCount = 0;
            for (long j2 : data) {
                jBitCount += (long) Long.bitCount(j2);
            }
            this.bitCount.add(jBitCount);
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = atomicLongArray.get(i2);
            }
            return jArr;
        }

        long bitCount() {
            return this.bitCount.sum();
        }

        long bitSize() {
            return ((long) this.data.length()) * 64;
        }

        LockFreeBitArray copy() {
            return new LockFreeBitArray(toPlainArray(this.data));
        }

        int dataLength() {
            return this.data.length();
        }

        public boolean equals(@CheckForNull Object o2) {
            if (o2 instanceof LockFreeBitArray) {
                return Arrays.equals(toPlainArray(this.data), toPlainArray(((LockFreeBitArray) o2).data));
            }
            return false;
        }

        boolean get(long bitIndex) {
            long j2 = this.data.get((int) (bitIndex >>> 6));
            long j3 = 1 << ((int) bitIndex);
            return (j3 + j2) - (j3 | j2) != 0;
        }

        public int hashCode() {
            return Arrays.hashCode(toPlainArray(this.data));
        }

        void putAll(LockFreeBitArray other) {
            Preconditions.checkArgument(this.data.length() == other.data.length(), "BitArrays must be of equal length (%s != %s)", this.data.length(), other.data.length());
            for (int i2 = 0; i2 < this.data.length(); i2++) {
                putData(i2, other.data.get(i2));
            }
        }

        void putData(int i2, long longValue) {
            long j2;
            long j3;
            do {
                j2 = this.data.get(i2);
                j3 = (-1) - (((-1) - j2) & ((-1) - longValue));
                if (j2 == j3) {
                    return;
                }
            } while (!this.data.compareAndSet(i2, j2, j3));
            this.bitCount.add(Long.bitCount(j3) - Long.bitCount(j2));
        }

        boolean set(long bitIndex) {
            long j2;
            long j3;
            if (get(bitIndex)) {
                return false;
            }
            int i2 = (int) (bitIndex >>> 6);
            long j4 = 1 << ((int) bitIndex);
            do {
                j2 = this.data.get(i2);
                j3 = (j2 + j4) - (j2 & j4);
                if (j2 == j3) {
                    return false;
                }
            } while (!this.data.compareAndSet(i2, j2, j3));
            this.bitCount.increment();
            return true;
        }
    }
}
