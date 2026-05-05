package com.drew.lang;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class StreamReader extends SequentialReader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long _pos;
    private final InputStream _stream;

    public StreamReader(InputStream inputStream) {
        inputStream.getClass();
        this._stream = inputStream;
        this._pos = 0L;
    }

    private long skipInternal(long j2) throws IOException {
        long j3 = 0;
        while (j3 != j2) {
            long jSkip = this._stream.skip(j2 - j3);
            j3 += jSkip;
            if (jSkip == 0) {
                break;
            }
        }
        this._pos += j3;
        return j3;
    }

    @Override // com.drew.lang.SequentialReader
    public int available() {
        try {
            return this._stream.available();
        } catch (IOException unused) {
            return 0;
        }
    }

    @Override // com.drew.lang.SequentialReader
    public byte getByte() throws IOException {
        int i2 = this._stream.read();
        if (i2 == -1) {
            throw new EOFException("End of data reached.");
        }
        this._pos++;
        return (byte) i2;
    }

    @Override // com.drew.lang.SequentialReader
    public void getBytes(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 != i3) {
            int i5 = this._stream.read(bArr, i2 + i4, i3 - i4);
            if (i5 == -1) {
                throw new EOFException("End of data reached.");
            }
            i4 += i5;
        }
        this._pos += (long) i4;
    }

    @Override // com.drew.lang.SequentialReader
    public byte[] getBytes(int i2) throws IOException {
        try {
            byte[] bArr = new byte[i2];
            getBytes(bArr, 0, i2);
            return bArr;
        } catch (OutOfMemoryError unused) {
            throw new EOFException("End of data reached.");
        }
    }

    @Override // com.drew.lang.SequentialReader
    public long getPosition() {
        return this._pos;
    }

    @Override // com.drew.lang.SequentialReader
    public void skip(long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("n must be zero or greater.");
        }
        long jSkipInternal = skipInternal(j2);
        if (jSkipInternal != j2) {
            throw new EOFException(String.format("Unable to skip. Requested %d bytes but only %d remained.", Long.valueOf(j2), Long.valueOf(jSkipInternal)));
        }
    }

    @Override // com.drew.lang.SequentialReader
    public boolean trySkip(long j2) throws IOException {
        if (j2 >= 0) {
            return skipInternal(j2) == j2;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }
}
