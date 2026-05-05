package com.drew.lang;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public class RandomAccessFileReader extends RandomAccessReader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int _baseOffset;
    private int _currentIndex;
    private final RandomAccessFile _file;
    private final long _length;

    public RandomAccessFileReader(RandomAccessFile randomAccessFile) throws IOException {
        this(randomAccessFile, 0);
    }

    public RandomAccessFileReader(RandomAccessFile randomAccessFile, int i2) throws IOException {
        randomAccessFile.getClass();
        this._file = randomAccessFile;
        this._baseOffset = i2;
        this._length = randomAccessFile.length();
    }

    private void seek(int i2) throws IOException {
        if (i2 == this._currentIndex) {
            return;
        }
        this._file.seek(i2);
        this._currentIndex = i2;
    }

    @Override // com.drew.lang.RandomAccessReader
    public byte getByte(int i2) throws IOException {
        if (i2 != this._currentIndex) {
            seek(i2);
        }
        int i3 = this._file.read();
        if (i3 < 0) {
            throw new BufferBoundsException("Unexpected end of file encountered.");
        }
        this._currentIndex++;
        return (byte) i3;
    }

    @Override // com.drew.lang.RandomAccessReader
    public byte[] getBytes(int i2, int i3) throws IOException {
        validateIndex(i2, i3);
        if (i2 != this._currentIndex) {
            seek(i2);
        }
        byte[] bArr = new byte[i3];
        int i4 = this._file.read(bArr);
        this._currentIndex += i4;
        if (i4 == i3) {
            return bArr;
        }
        throw new BufferBoundsException("Unexpected end of file encountered.");
    }

    @Override // com.drew.lang.RandomAccessReader
    public long getLength() {
        return this._length;
    }

    @Override // com.drew.lang.RandomAccessReader
    protected boolean isValidIndex(int i2, int i3) throws IOException {
        return i3 >= 0 && i2 >= 0 && (((long) i2) + ((long) i3)) - 1 < this._length;
    }

    @Override // com.drew.lang.RandomAccessReader
    public int toUnshiftedOffset(int i2) {
        return i2 + this._baseOffset;
    }

    @Override // com.drew.lang.RandomAccessReader
    protected void validateIndex(int i2, int i3) throws IOException {
        if (!isValidIndex(i2, i3)) {
            throw new BufferBoundsException(i2, i3, this._length);
        }
    }
}
