package cz.msebera.android.httpclient.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes5.dex */
public class DeflateInputStream extends InputStream {
    private final InputStream sourceStream;

    static class DeflateStream extends InflaterInputStream {
        private boolean closed;

        public DeflateStream(InputStream inputStream, Inflater inflater) {
            super(inputStream, inflater);
            this.closed = false;
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.inf.end();
            super.close();
        }
    }

    public DeflateInputStream(InputStream inputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int i2 = pushbackInputStream.read();
        int i3 = pushbackInputStream.read();
        if (i2 == -1 || i3 == -1) {
            throw new ZipException("Unexpected end of stream");
        }
        pushbackInputStream.unread(i3);
        pushbackInputStream.unread(i2);
        int i4 = (-1) - (((-1) - i2) | ((-1) - 255));
        this.sourceStream = new DeflateStream(pushbackInputStream, new Inflater(((-1) - (((-1) - i2) | ((-1) - 15)) == 8 && ((i4 >> 4) & 15) <= 7 && ((i4 << 8) | ((-1) - (((-1) - i3) | ((-1) - 255)))) % 31 == 0) ? false : true));
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.sourceStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.sourceStream.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.sourceStream.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.sourceStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.sourceStream.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.sourceStream.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.sourceStream.read(bArr, i2, i3);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.sourceStream.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        return this.sourceStream.skip(j2);
    }
}
