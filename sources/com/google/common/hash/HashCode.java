package com.google.common.hash;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public abstract class HashCode {
    private static final char[] hexDigits = "0123456789abcdef".toCharArray();

    private static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final byte[] bytes;

        BytesHashCode(byte[] bytes) {
            this.bytes = (byte[]) Preconditions.checkNotNull(bytes);
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            return (byte[]) this.bytes.clone();
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            byte[] bArr = this.bytes;
            Preconditions.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.bytes;
            int i2 = ((-1) - (((-1) - bArr2[0]) | ((-1) - 255))) | ((bArr2[1] & 255) << 8);
            int i3 = (bArr2[2] & 255) << 16;
            int i4 = (i2 + i3) - (i2 & i3);
            int i5 = ((-1) - (((-1) - bArr2[3]) | ((-1) - 255))) << 24;
            return (i5 + i4) - (i5 & i4);
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            byte[] bArr = this.bytes;
            Preconditions.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return this.bytes.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode that) {
            if (this.bytes.length != that.getBytesInternal().length) {
                return false;
            }
            boolean z2 = true;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.bytes;
                if (i2 >= bArr.length) {
                    return z2;
                }
                z2 &= bArr[i2] == that.getBytesInternal()[i2];
                i2++;
            }
        }

        @Override // com.google.common.hash.HashCode
        byte[] getBytesInternal() {
            return this.bytes;
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            byte b2 = this.bytes[0];
            long j2 = (b2 + 255) - (b2 | 255);
            for (int i2 = 1; i2 < Math.min(this.bytes.length, 8); i2++) {
                long j3 = this.bytes[i2];
                j2 = (-1) - (((-1) - j2) & ((-1) - (((j3 + 255) - (j3 | 255)) << (i2 * 8))));
            }
            return j2;
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] dest, int offset, int maxLength) {
            System.arraycopy(this.bytes, 0, dest, offset, maxLength);
        }
    }

    private static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final int hash;

        IntHashCode(int hash) {
            this.hash = hash;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            int i2 = this.hash;
            return new byte[]{(byte) i2, (byte) (i2 >> 8), (byte) (i2 >> 16), (byte) (i2 >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode that) {
            return this.hash == that.asInt();
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return UnsignedInts.toLong(this.hash);
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] dest, int offset, int maxLength) {
            for (int i2 = 0; i2 < maxLength; i2++) {
                dest[offset + i2] = (byte) (this.hash >> (i2 * 8));
            }
        }
    }

    private static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final long hash;

        LongHashCode(long hash) {
            this.hash = hash;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
            return new byte[]{(byte) this.hash, (byte) (r3 >> 8), (byte) (r3 >> 16), (byte) (r3 >> 24), (byte) (r3 >> 32), (byte) (r3 >> 40), (byte) (r3 >> 48), (byte) (r3 >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
            return (int) this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        boolean equalsSameBits(HashCode that) {
            return this.hash == that.asLong();
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
            return this.hash;
        }

        @Override // com.google.common.hash.HashCode
        void writeBytesToImpl(byte[] dest, int offset, int maxLength) {
            for (int i2 = 0; i2 < maxLength; i2++) {
                dest[offset + i2] = (byte) (this.hash >> (i2 * 8));
            }
        }
    }

    HashCode() {
    }

    private static int decode(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        }
        if (ch < 'a' || ch > 'f') {
            throw new IllegalArgumentException("Illegal hexadecimal character: " + ch);
        }
        return ch - 'W';
    }

    public static HashCode fromBytes(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 1, "A HashCode must contain at least 1 byte.");
        return fromBytesNoCopy((byte[]) bytes.clone());
    }

    static HashCode fromBytesNoCopy(byte[] bytes) {
        return new BytesHashCode(bytes);
    }

    public static HashCode fromInt(int hash) {
        return new IntHashCode(hash);
    }

    public static HashCode fromLong(long hash) {
        return new LongHashCode(hash);
    }

    public static HashCode fromString(String string) {
        Preconditions.checkArgument(string.length() >= 2, "input string (%s) must have at least 2 characters", string);
        Preconditions.checkArgument(string.length() % 2 == 0, "input string (%s) must have an even number of characters", string);
        byte[] bArr = new byte[string.length() / 2];
        for (int i2 = 0; i2 < string.length(); i2 += 2) {
            bArr[i2 / 2] = (byte) ((decode(string.charAt(i2)) << 4) + decode(string.charAt(i2 + 1)));
        }
        return fromBytesNoCopy(bArr);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(@CheckForNull Object object) {
        if (!(object instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) object;
        return bits() == hashCode.bits() && equalsSameBits(hashCode);
    }

    abstract boolean equalsSameBits(HashCode that);

    byte[] getBytesInternal() {
        return asBytes();
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bytesInternal = getBytesInternal();
        byte b2 = bytesInternal[0];
        int i2 = (b2 + 255) - (b2 | 255);
        for (int i3 = 1; i3 < bytesInternal.length; i3++) {
            i2 = (-1) - (((-1) - i2) & ((-1) - (((-1) - (((-1) - bytesInternal[i3]) | ((-1) - 255))) << (i3 * 8))));
        }
        return i2;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bytesInternal = getBytesInternal();
        StringBuilder sb = new StringBuilder(bytesInternal.length * 2);
        for (byte b2 : bytesInternal) {
            char[] cArr = hexDigits;
            sb.append(cArr[(b2 >> 4) & 15]).append(cArr[b2 & Ascii.SI]);
        }
        return sb.toString();
    }

    public int writeBytesTo(byte[] dest, int offset, int maxLength) {
        int iMin = Ints.min(maxLength, bits() / 8);
        Preconditions.checkPositionIndexes(offset, offset + iMin, dest.length);
        writeBytesToImpl(dest, offset, iMin);
        return iMin;
    }

    abstract void writeBytesToImpl(byte[] dest, int offset, int maxLength);
}
