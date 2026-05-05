package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public interface PrimitiveSink {
    PrimitiveSink putBoolean(boolean b2);

    PrimitiveSink putByte(byte b2);

    PrimitiveSink putBytes(ByteBuffer bytes);

    PrimitiveSink putBytes(byte[] bytes);

    PrimitiveSink putBytes(byte[] bytes, int off, int len);

    PrimitiveSink putChar(char c2);

    PrimitiveSink putDouble(double d2);

    PrimitiveSink putFloat(float f2);

    PrimitiveSink putInt(int i2);

    PrimitiveSink putLong(long l2);

    PrimitiveSink putShort(short s2);

    PrimitiveSink putString(CharSequence charSequence, Charset charset);

    PrimitiveSink putUnencodedChars(CharSequence charSequence);
}
