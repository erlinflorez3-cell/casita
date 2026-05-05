package com.drew.lang;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class SequentialByteArrayReader extends SequentialReader {
    private final byte[] _bytes;
    private int _index;

    public SequentialByteArrayReader(byte[] bArr) {
        this(bArr, 0);
    }

    public SequentialByteArrayReader(byte[] bArr, int i2) {
        bArr.getClass();
        this._bytes = bArr;
        this._index = i2;
    }

    @Override // com.drew.lang.SequentialReader
    public int available() {
        return this._bytes.length - this._index;
    }

    @Override // com.drew.lang.SequentialReader
    public byte getByte() throws IOException {
        int i2 = this._index;
        byte[] bArr = this._bytes;
        if (i2 >= bArr.length) {
            throw new EOFException("End of data reached.");
        }
        this._index = i2 + 1;
        return bArr[i2];
    }

    @Override // com.drew.lang.SequentialReader
    public void getBytes(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this._index;
        long j2 = ((long) i4) + ((long) i3);
        byte[] bArr2 = this._bytes;
        if (j2 > bArr2.length) {
            throw new EOFException("End of data reached.");
        }
        System.arraycopy(bArr2, i4, bArr, i2, i3);
        this._index += i3;
    }

    @Override // com.drew.lang.SequentialReader
    public byte[] getBytes(int i2) throws IOException {
        int i3 = this._index;
        long j2 = ((long) i3) + ((long) i2);
        byte[] bArr = this._bytes;
        if (j2 > bArr.length) {
            throw new EOFException("End of data reached.");
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i3, bArr2, 0, i2);
        this._index += i2;
        return bArr2;
    }

    @Override // com.drew.lang.SequentialReader
    public long getPosition() {
        return this._index;
    }

    @Override // com.drew.lang.SequentialReader
    public void skip(long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("n must be zero or greater.");
        }
        int i2 = this._index;
        if (((long) i2) + j2 > this._bytes.length) {
            throw new EOFException("End of data reached.");
        }
        this._index = (int) (((long) i2) + j2);
    }

    @Override // com.drew.lang.SequentialReader
    public boolean trySkip(long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("n must be zero or greater.");
        }
        int i2 = this._index;
        long j3 = ((long) i2) + j2;
        byte[] bArr = this._bytes;
        if (j3 > bArr.length) {
            this._index = bArr.length;
            return false;
        }
        this._index = (int) (((long) i2) + j2);
        return true;
    }
}
