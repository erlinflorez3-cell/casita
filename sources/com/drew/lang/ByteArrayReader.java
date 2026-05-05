package com.drew.lang;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ByteArrayReader extends RandomAccessReader {
    private final int _baseOffset;
    private final byte[] _buffer;

    public ByteArrayReader(byte[] bArr) {
        this(bArr, 0);
    }

    public ByteArrayReader(byte[] bArr, int i2) {
        bArr.getClass();
        if (i2 < 0) {
            throw new IllegalArgumentException("Must be zero or greater");
        }
        this._buffer = bArr;
        this._baseOffset = i2;
    }

    @Override // com.drew.lang.RandomAccessReader
    public byte getByte(int i2) throws IOException {
        validateIndex(i2, 1);
        return this._buffer[i2 + this._baseOffset];
    }

    @Override // com.drew.lang.RandomAccessReader
    public byte[] getBytes(int i2, int i3) throws IOException {
        validateIndex(i2, i3);
        byte[] bArr = new byte[i3];
        System.arraycopy(this._buffer, i2 + this._baseOffset, bArr, 0, i3);
        return bArr;
    }

    @Override // com.drew.lang.RandomAccessReader
    public long getLength() {
        return this._buffer.length - this._baseOffset;
    }

    @Override // com.drew.lang.RandomAccessReader
    protected boolean isValidIndex(int i2, int i3) throws IOException {
        return i3 >= 0 && i2 >= 0 && (((long) i2) + ((long) i3)) - 1 < getLength();
    }

    @Override // com.drew.lang.RandomAccessReader
    public int toUnshiftedOffset(int i2) {
        return i2 + this._baseOffset;
    }

    @Override // com.drew.lang.RandomAccessReader
    protected void validateIndex(int i2, int i3) throws IOException {
        if (!isValidIndex(i2, i3)) {
            throw new BufferBoundsException(toUnshiftedOffset(i2), i3, this._buffer.length);
        }
    }
}
