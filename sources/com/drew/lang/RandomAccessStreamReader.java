package com.drew.lang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class RandomAccessStreamReader extends RandomAccessReader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_CHUNK_LENGTH = 2048;
    private final int _chunkLength;
    private final ArrayList<byte[]> _chunks;
    private boolean _isStreamFinished;
    private final InputStream _stream;
    private long _streamLength;

    public RandomAccessStreamReader(InputStream inputStream) {
        this(inputStream, 2048, -1L);
    }

    public RandomAccessStreamReader(InputStream inputStream, int i2) {
        this(inputStream, i2, -1L);
    }

    public RandomAccessStreamReader(InputStream inputStream, int i2, long j2) {
        this._chunks = new ArrayList<>();
        inputStream.getClass();
        if (i2 <= 0) {
            throw new IllegalArgumentException("chunkLength must be greater than zero");
        }
        this._chunkLength = i2;
        this._stream = inputStream;
        this._streamLength = j2;
    }

    @Override // com.drew.lang.RandomAccessReader
    public byte getByte(int i2) throws IOException {
        int i3 = this._chunkLength;
        int i4 = i2 / i3;
        return this._chunks.get(i4)[i2 % i3];
    }

    @Override // com.drew.lang.RandomAccessReader
    public byte[] getBytes(int i2, int i3) throws IOException {
        validateIndex(i2, i3);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i3 != 0) {
            int i5 = this._chunkLength;
            int i6 = i2 % i5;
            int iMin = Math.min(i3, i5 - i6);
            System.arraycopy(this._chunks.get(i2 / i5), i6, bArr, i4, iMin);
            i3 -= iMin;
            i2 += iMin;
            i4 += iMin;
        }
        return bArr;
    }

    @Override // com.drew.lang.RandomAccessReader
    public long getLength() throws IOException {
        long j2 = this._streamLength;
        if (j2 != -1) {
            return j2;
        }
        isValidIndex(Integer.MAX_VALUE, 1);
        return this._streamLength;
    }

    @Override // com.drew.lang.RandomAccessReader
    protected boolean isValidIndex(int i2, int i3) throws IOException {
        int i4;
        if (i2 < 0 || i3 < 0) {
            return false;
        }
        long j2 = (((long) i2) + ((long) i3)) - 1;
        if (j2 > 2147483647L) {
            return false;
        }
        int i5 = (int) j2;
        if (this._isStreamFinished) {
            return ((long) i5) < this._streamLength;
        }
        int i6 = i5 / this._chunkLength;
        while (i6 >= this._chunks.size()) {
            byte[] bArr = new byte[this._chunkLength];
            int i7 = 0;
            while (!this._isStreamFinished && i7 != (i4 = this._chunkLength)) {
                int i8 = this._stream.read(bArr, i7, i4 - i7);
                if (i8 == -1) {
                    this._isStreamFinished = true;
                    int size = (this._chunks.size() * this._chunkLength) + i7;
                    if (this._streamLength == -1) {
                        this._streamLength = size;
                    }
                    if (i5 >= this._streamLength) {
                        this._chunks.add(bArr);
                        return false;
                    }
                } else {
                    i7 += i8;
                }
            }
            this._chunks.add(bArr);
        }
        return true;
    }

    @Override // com.drew.lang.RandomAccessReader
    public int toUnshiftedOffset(int i2) {
        return i2;
    }

    @Override // com.drew.lang.RandomAccessReader
    protected void validateIndex(int i2, int i3) throws IOException {
        if (i2 < 0) {
            throw new BufferBoundsException(String.format("Attempt to read from buffer using a negative index (%d)", Integer.valueOf(i2)));
        }
        if (i3 < 0) {
            throw new BufferBoundsException("Number of requested bytes must be zero or greater");
        }
        if ((((long) i2) + ((long) i3)) - 1 > 2147483647L) {
            throw new BufferBoundsException(String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (!isValidIndex(i2, i3)) {
            throw new BufferBoundsException(i2, i3, this._streamLength);
        }
    }
}
