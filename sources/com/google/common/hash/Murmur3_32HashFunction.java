package com.google.common.hash;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
@ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;
    static final HashFunction MURMUR3_32 = new Murmur3_32HashFunction(0, false);
    static final HashFunction MURMUR3_32_FIXED = new Murmur3_32HashFunction(0, true);
    static final HashFunction GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(Hashing.GOOD_FAST_HASH_SEED, true);

    private static final class Murmur3_32Hasher extends AbstractHasher {
        private long buffer;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private int f3508h1;
        private int shift;
        private int length = 0;
        private boolean isDone = false;

        Murmur3_32Hasher(int seed) {
            this.f3508h1 = seed;
        }

        private void update(int nBytes, long update) {
            long j2 = this.buffer;
            int i2 = this.shift;
            long j3 = (-1) - (((-1) - (((-1) - (((-1) - update) | ((-1) - 4294967295L))) << i2)) & ((-1) - j2));
            this.buffer = j3;
            int i3 = i2 + (nBytes * 8);
            this.shift = i3;
            this.length += nBytes;
            if (i3 >= 32) {
                this.f3508h1 = Murmur3_32HashFunction.mixH1(this.f3508h1, Murmur3_32HashFunction.mixK1((int) j3));
                this.buffer >>>= 32;
                this.shift -= 32;
            }
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            Preconditions.checkState(!this.isDone);
            this.isDone = true;
            int iMixK1 = this.f3508h1 ^ Murmur3_32HashFunction.mixK1((int) this.buffer);
            this.f3508h1 = iMixK1;
            return Murmur3_32HashFunction.fmix(iMixK1, this.length);
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b2) {
            update(1, (-1) - (((-1) - b2) | ((-1) - 255)));
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer buffer) {
            ByteOrder byteOrderOrder = buffer.order();
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            while (buffer.remaining() >= 4) {
                putInt(buffer.getInt());
            }
            while (buffer.hasRemaining()) {
                putByte(buffer.get());
            }
            buffer.order(byteOrderOrder);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bytes, int off, int len) {
            Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i2 = 0;
            while (true) {
                int i3 = i2 + 4;
                if (i3 > len) {
                    break;
                }
                update(4, Murmur3_32HashFunction.getIntLittleEndian(bytes, i2 + off));
                i2 = i3;
            }
            while (i2 < len) {
                putByte(bytes[off + i2]);
                i2++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putChar(char c2) {
            update(2, c2);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putInt(int i2) {
            update(4, i2);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putLong(long l2) {
            update(4, (int) l2);
            update(4, l2 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putString(CharSequence input, Charset charset) {
            if (!Charsets.UTF_8.equals(charset)) {
                return super.putString(input, charset);
            }
            int length = input.length();
            int i2 = 0;
            while (true) {
                int i3 = i2 + 4;
                if (i3 > length) {
                    break;
                }
                char cCharAt = input.charAt(i2);
                char cCharAt2 = input.charAt(i2 + 1);
                char cCharAt3 = input.charAt(i2 + 2);
                char cCharAt4 = input.charAt(i2 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                int i4 = (cCharAt2 << '\b') | cCharAt;
                int i5 = cCharAt3 << 16;
                int i6 = (i4 + i5) - (i4 & i5);
                int i7 = cCharAt4 << 24;
                update(4, (i6 + i7) - (i6 & i7));
                i2 = i3;
            }
            while (i2 < length) {
                char cCharAt5 = input.charAt(i2);
                if (cCharAt5 < 128) {
                    update(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    update(2, Murmur3_32HashFunction.charToTwoUtf8Bytes(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    update(3, Murmur3_32HashFunction.charToThreeUtf8Bytes(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(input, i2);
                    if (iCodePointAt == cCharAt5) {
                        putBytes(input.subSequence(i2, length).toString().getBytes(charset));
                        return this;
                    }
                    i2++;
                    update(4, Murmur3_32HashFunction.codePointToFourUtf8Bytes(iCodePointAt));
                }
                i2++;
            }
            return this;
        }
    }

    Murmur3_32HashFunction(int seed, boolean supplementaryPlaneFix) {
        this.seed = seed;
        this.supplementaryPlaneFix = supplementaryPlaneFix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c2) {
        long j2 = c2 >>> '\f';
        long j3 = (-1) - (((-1) - ((j2 + 224) - (j2 & 224))) & ((-1) - ((long) (((-1) - (((-1) - ((-1) - (((-1) - (c2 >>> 6)) | ((-1) - 63)))) & ((-1) - 128))) << 8))));
        int i2 = (c2 + '?') - (c2 | '?');
        return j3 | ((long) (((i2 + 128) - (i2 & 128)) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c2) {
        long j2 = c2 >>> 6;
        int i2 = c2 & '?';
        return ((j2 + 192) - (j2 & 192)) | ((long) (((i2 + 128) - (i2 & 128)) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int codePoint) {
        long j2 = ((long) (codePoint >>> 18)) | 240;
        int i2 = codePoint >>> 12;
        long j3 = (((long) ((i2 + 63) - (i2 | 63))) | 128) << 8;
        int i3 = codePoint >>> 6;
        return ((j2 + j3) - (j2 & j3)) | (((-1) - (((-1) - ((long) ((i3 + 63) - (i3 | 63)))) & ((-1) - 128))) << 16) | ((((long) ((-1) - (((-1) - codePoint) | ((-1) - 63)))) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashCode fmix(int h12, int length) {
        int i2 = h12 ^ length;
        int i3 = (i2 ^ (i2 >>> 16)) * (-2048144789);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i4 ^ (i4 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] input, int offset) {
        return Ints.fromBytes(input[offset + 3], input[offset + 2], input[offset + 1], input[offset]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int h12, int k1) {
        return (Integer.rotateLeft(h12 ^ k1, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int k1) {
        return Integer.rotateLeft(k1 * (-862048943), 15) * C2;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 32;
    }

    public boolean equals(@CheckForNull Object object) {
        if (!(object instanceof Murmur3_32HashFunction)) {
            return false;
        }
        Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) object;
        return this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] input, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, input.length);
        int iMixH1 = this.seed;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > len) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1(getIntLittleEndian(input, i3 + off)));
            i3 = i4;
        }
        int i5 = 0;
        while (i3 < len) {
            i2 ^= UnsignedBytes.toInt(input[off + i3]) << i5;
            i3++;
            i5 += 8;
        }
        return fmix(mixK1(i2) ^ iMixH1, len);
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int input) {
        return fmix(mixH1(this.seed, mixK1(input)), 4);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long input) {
        return fmix(mixH1(mixH1(this.seed, mixK1((int) input)), mixK1((int) (input >>> 32))), 8);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence input, Charset charset) {
        if (!Charsets.UTF_8.equals(charset)) {
            return hashBytes(input.toString().getBytes(charset));
        }
        int length = input.length();
        int iMixH1 = this.seed;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + 4;
            if (i5 > length) {
                break;
            }
            char cCharAt = input.charAt(i3);
            char cCharAt2 = input.charAt(i3 + 1);
            char cCharAt3 = input.charAt(i3 + 2);
            char cCharAt4 = input.charAt(i3 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            int i6 = (-1) - (((-1) - ((cCharAt2 << '\b') | cCharAt)) & ((-1) - (cCharAt3 << 16)));
            int i7 = cCharAt4 << 24;
            iMixH1 = mixH1(iMixH1, mixK1((i6 + i7) - (i6 & i7)));
            i4 += 4;
            i3 = i5;
        }
        long jCharToThreeUtf8Bytes = 0;
        while (i3 < length) {
            char cCharAt5 = input.charAt(i3);
            if (cCharAt5 < 128) {
                jCharToThreeUtf8Bytes |= ((long) cCharAt5) << i2;
                i2 += 8;
                i4++;
            } else if (cCharAt5 < 2048) {
                long jCharToTwoUtf8Bytes = charToTwoUtf8Bytes(cCharAt5) << i2;
                jCharToThreeUtf8Bytes = (jCharToThreeUtf8Bytes + jCharToTwoUtf8Bytes) - (jCharToThreeUtf8Bytes & jCharToTwoUtf8Bytes);
                i2 += 16;
                i4 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jCharToThreeUtf8Bytes = (-1) - (((-1) - jCharToThreeUtf8Bytes) & ((-1) - (charToThreeUtf8Bytes(cCharAt5) << i2)));
                i2 += 24;
                i4 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(input, i3);
                if (iCodePointAt == cCharAt5) {
                    return hashBytes(input.toString().getBytes(charset));
                }
                i3++;
                jCharToThreeUtf8Bytes |= codePointToFourUtf8Bytes(iCodePointAt) << i2;
                if (this.supplementaryPlaneFix) {
                    i2 += 32;
                }
                i4 += 4;
            }
            if (i2 >= 32) {
                iMixH1 = mixH1(iMixH1, mixK1((int) jCharToThreeUtf8Bytes));
                jCharToThreeUtf8Bytes >>>= 32;
                i2 -= 32;
            }
            i3++;
        }
        return fmix(mixK1((int) jCharToThreeUtf8Bytes) ^ iMixH1, i4);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence input) {
        int iMixK1 = this.seed;
        for (int i2 = 1; i2 < input.length(); i2 += 2) {
            iMixK1 = mixH1(iMixK1, mixK1((-1) - ((65535 - input.charAt(i2 - 1)) & ((-1) - (input.charAt(i2) << 16)))));
        }
        if ((-1) - (((-1) - input.length()) | ((-1) - 1)) == 1) {
            iMixK1 ^= mixK1(input.charAt(input.length() - 1));
        }
        return fmix(iMixK1, input.length() * 2);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_32Hasher(this.seed);
    }

    public String toString() {
        return "Hashing.murmur3_32(" + this.seed + ")";
    }
}
