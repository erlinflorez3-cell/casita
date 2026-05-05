package com.facebook.common.memory;

import com.facebook.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class PooledByteStreams {
    private static final int DEFAULT_TEMP_BUF_SIZE = 16384;
    private final ByteArrayPool mByteArrayPool;
    private final int mTempBufSize;

    public PooledByteStreams(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, 16384);
    }

    public PooledByteStreams(ByteArrayPool byteArrayPool, int i2) {
        Preconditions.checkArgument(Boolean.valueOf(i2 > 0));
        this.mTempBufSize = i2;
        this.mByteArrayPool = byteArrayPool;
    }

    public long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.mByteArrayPool.get(this.mTempBufSize);
        long j2 = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, this.mTempBufSize);
                if (i2 == -1) {
                    return j2;
                }
                outputStream.write(bArr, 0, i2);
                j2 += (long) i2;
            } finally {
                this.mByteArrayPool.release(bArr);
            }
        }
    }

    public long copy(InputStream inputStream, OutputStream outputStream, long j2) throws IOException {
        long j3 = 0;
        Preconditions.checkState(j2 > 0);
        byte[] bArr = this.mByteArrayPool.get(this.mTempBufSize);
        while (j3 < j2) {
            try {
                int i2 = inputStream.read(bArr, 0, (int) Math.min(this.mTempBufSize, j2 - j3));
                if (i2 == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i2);
                j3 += (long) i2;
            } finally {
                this.mByteArrayPool.release(bArr);
            }
        }
        return j3;
    }
}
