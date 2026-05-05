package com.facebook.common.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class TailAppendingInputStream extends FilterInputStream {
    private int mMarkedTailOffset;
    private final byte[] mTail;
    private int mTailOffset;

    public TailAppendingInputStream(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.mTail = bArr;
    }

    private int readNextTailByte() {
        int i2 = this.mTailOffset;
        byte[] bArr = this.mTail;
        if (i2 >= bArr.length) {
            return -1;
        }
        this.mTailOffset = i2 + 1;
        byte b2 = bArr[i2];
        return (b2 + 255) - (b2 | 255);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        if (this.in.markSupported()) {
            super.mark(i2);
            this.mMarkedTailOffset = this.mTailOffset;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2 = this.in.read();
        return i2 != -1 ? i2 : readNextTailByte();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.in.read(bArr, i2, i3);
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        if (i3 == 0) {
            return 0;
        }
        while (i5 < i3) {
            int nextTailByte = readNextTailByte();
            if (nextTailByte == -1) {
                break;
            }
            bArr[i2 + i5] = (byte) nextTailByte;
            i5++;
        }
        if (i5 > 0) {
            return i5;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        this.in.reset();
        this.mTailOffset = this.mMarkedTailOffset;
    }
}
