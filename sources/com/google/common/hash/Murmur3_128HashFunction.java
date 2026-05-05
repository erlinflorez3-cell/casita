package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
@ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);

    private static final class Murmur3_128Hasher extends AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private long f3507h1;
        private long h2;
        private int length;

        Murmur3_128Hasher(int seed) {
            super(16);
            long j2 = seed;
            this.f3507h1 = j2;
            this.h2 = j2;
            this.length = 0;
        }

        private void bmix64(long k1, long k2) {
            long jMixK1 = mixK1(k1) ^ this.f3507h1;
            this.f3507h1 = jMixK1;
            long jRotateLeft = Long.rotateLeft(jMixK1, 27);
            long j2 = this.h2;
            this.f3507h1 = ((jRotateLeft + j2) * 5) + 1390208809;
            long jMixK2 = mixK2(k2) ^ j2;
            this.h2 = jMixK2;
            this.h2 = ((Long.rotateLeft(jMixK2, 31) + this.f3507h1) * 5) + 944331445;
        }

        private static long fmix64(long k2) {
            long j2 = (k2 ^ (k2 >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        private static long mixK1(long k1) {
            return Long.rotateLeft(k1 * C1, 31) * C2;
        }

        private static long mixK2(long k2) {
            return Long.rotateLeft(k2 * C2, 33) * C1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode makeHash() {
            long j2 = this.f3507h1;
            int i2 = this.length;
            long j3 = this.h2 ^ ((long) i2);
            long j4 = (j2 ^ ((long) i2)) + j3;
            this.f3507h1 = j4;
            this.h2 = j3 + j4;
            this.f3507h1 = fmix64(j4);
            long jFmix64 = fmix64(this.h2);
            long j5 = this.f3507h1 + jFmix64;
            this.f3507h1 = j5;
            this.h2 = jFmix64 + j5;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f3507h1).putLong(this.h2).array());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(ByteBuffer bb) {
            bmix64(bb.getLong(), bb.getLong());
            this.length += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(ByteBuffer bb) {
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            this.length += bb.remaining();
            long j9 = 0;
            switch (bb.remaining()) {
                case 1:
                    j8 = 0;
                    j2 = j8 ^ ((long) UnsignedBytes.toInt(bb.get(0)));
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 2:
                    j7 = 0;
                    j8 = j7 ^ (((long) UnsignedBytes.toInt(bb.get(1))) << 8);
                    j2 = j8 ^ ((long) UnsignedBytes.toInt(bb.get(0)));
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 3:
                    j6 = 0;
                    j7 = j6 ^ (((long) UnsignedBytes.toInt(bb.get(2))) << 16);
                    j8 = j7 ^ (((long) UnsignedBytes.toInt(bb.get(1))) << 8);
                    j2 = j8 ^ ((long) UnsignedBytes.toInt(bb.get(0)));
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 4:
                    j5 = 0;
                    j6 = j5 ^ (((long) UnsignedBytes.toInt(bb.get(3))) << 24);
                    j7 = j6 ^ (((long) UnsignedBytes.toInt(bb.get(2))) << 16);
                    j8 = j7 ^ (((long) UnsignedBytes.toInt(bb.get(1))) << 8);
                    j2 = j8 ^ ((long) UnsignedBytes.toInt(bb.get(0)));
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 5:
                    j4 = 0;
                    j5 = j4 ^ (((long) UnsignedBytes.toInt(bb.get(4))) << 32);
                    j6 = j5 ^ (((long) UnsignedBytes.toInt(bb.get(3))) << 24);
                    j7 = j6 ^ (((long) UnsignedBytes.toInt(bb.get(2))) << 16);
                    j8 = j7 ^ (((long) UnsignedBytes.toInt(bb.get(1))) << 8);
                    j2 = j8 ^ ((long) UnsignedBytes.toInt(bb.get(0)));
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 6:
                    j3 = 0;
                    j4 = j3 ^ (((long) UnsignedBytes.toInt(bb.get(5))) << 40);
                    j5 = j4 ^ (((long) UnsignedBytes.toInt(bb.get(4))) << 32);
                    j6 = j5 ^ (((long) UnsignedBytes.toInt(bb.get(3))) << 24);
                    j7 = j6 ^ (((long) UnsignedBytes.toInt(bb.get(2))) << 16);
                    j8 = j7 ^ (((long) UnsignedBytes.toInt(bb.get(1))) << 8);
                    j2 = j8 ^ ((long) UnsignedBytes.toInt(bb.get(0)));
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 7:
                    j3 = ((long) UnsignedBytes.toInt(bb.get(6))) << 48;
                    j4 = j3 ^ (((long) UnsignedBytes.toInt(bb.get(5))) << 40);
                    j5 = j4 ^ (((long) UnsignedBytes.toInt(bb.get(4))) << 32);
                    j6 = j5 ^ (((long) UnsignedBytes.toInt(bb.get(3))) << 24);
                    j7 = j6 ^ (((long) UnsignedBytes.toInt(bb.get(2))) << 16);
                    j8 = j7 ^ (((long) UnsignedBytes.toInt(bb.get(1))) << 8);
                    j2 = j8 ^ ((long) UnsignedBytes.toInt(bb.get(0)));
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 8:
                    j2 = bb.getLong();
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 9:
                    j9 ^= (long) UnsignedBytes.toInt(bb.get(8));
                    j2 = bb.getLong();
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 10:
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(9))) << 8;
                    j9 ^= (long) UnsignedBytes.toInt(bb.get(8));
                    j2 = bb.getLong();
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 11:
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(10))) << 16;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(9))) << 8;
                    j9 ^= (long) UnsignedBytes.toInt(bb.get(8));
                    j2 = bb.getLong();
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 12:
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(11))) << 24;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(10))) << 16;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(9))) << 8;
                    j9 ^= (long) UnsignedBytes.toInt(bb.get(8));
                    j2 = bb.getLong();
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 13:
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(12))) << 32;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(11))) << 24;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(10))) << 16;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(9))) << 8;
                    j9 ^= (long) UnsignedBytes.toInt(bb.get(8));
                    j2 = bb.getLong();
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 14:
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(13))) << 40;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(12))) << 32;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(11))) << 24;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(10))) << 16;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(9))) << 8;
                    j9 ^= (long) UnsignedBytes.toInt(bb.get(8));
                    j2 = bb.getLong();
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                case 15:
                    j9 = ((long) UnsignedBytes.toInt(bb.get(14))) << 48;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(13))) << 40;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(12))) << 32;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(11))) << 24;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(10))) << 16;
                    j9 ^= ((long) UnsignedBytes.toInt(bb.get(9))) << 8;
                    j9 ^= (long) UnsignedBytes.toInt(bb.get(8));
                    j2 = bb.getLong();
                    this.f3507h1 = mixK1(j2) ^ this.f3507h1;
                    this.h2 ^= mixK2(j9);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    Murmur3_128HashFunction(int seed) {
        this.seed = seed;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(@CheckForNull Object object) {
        return (object instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) object).seed;
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.seed + ")";
    }
}
