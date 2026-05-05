package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements Hasher {
    AbstractHasher() {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBoolean(boolean z2) {
        return putByte(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(ByteBuffer b2) {
        if (b2.hasArray()) {
            putBytes(b2.array(), b2.arrayOffset() + b2.position(), b2.remaining());
            Java8Compatibility.position(b2, b2.limit());
        } else {
            for (int iRemaining = b2.remaining(); iRemaining > 0; iRemaining--) {
                putByte(b2.get());
            }
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bytes) {
        return putBytes(bytes, 0, bytes.length);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bytes, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        for (int i2 = 0; i2 < len; i2++) {
            putByte(bytes[off + i2]);
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putChar(char c2) {
        putByte((byte) c2);
        putByte((byte) (c2 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putDouble(double d2) {
        return putLong(Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putFloat(float f2) {
        return putInt(Float.floatToRawIntBits(f2));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putInt(int i2) {
        putByte((byte) i2);
        putByte((byte) (i2 >>> 8));
        putByte((byte) (i2 >>> 16));
        putByte((byte) (i2 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putLong(long l2) {
        for (int i2 = 0; i2 < 64; i2 += 8) {
            putByte((byte) (l2 >>> i2));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher
    public <T> Hasher putObject(@ParametricNullness T instance, Funnel<? super T> funnel) {
        funnel.funnel(instance, this);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putShort(short s2) {
        putByte((byte) s2);
        putByte((byte) (s2 >>> 8));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putString(CharSequence charSequence, Charset charset) {
        return putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            putChar(charSequence.charAt(i2));
        }
        return this;
    }
}
