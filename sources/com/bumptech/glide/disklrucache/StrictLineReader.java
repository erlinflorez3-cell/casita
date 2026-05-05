package com.bumptech.glide.disklrucache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class StrictLineReader implements Closeable {
    private static final byte CR = 13;
    private static final byte LF = 10;
    private byte[] buf;
    private final Charset charset;
    private int end;
    private final InputStream in;
    private int pos;

    public StrictLineReader(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(Util.US_ASCII)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.in = inputStream;
        this.charset = charset;
        this.buf = new byte[i2];
    }

    public StrictLineReader(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void fillBuf() throws IOException {
        InputStream inputStream = this.in;
        byte[] bArr = this.buf;
        int i2 = inputStream.read(bArr, 0, bArr.length);
        if (i2 == -1) {
            throw new EOFException();
        }
        this.pos = 0;
        this.end = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.in) {
            if (this.buf != null) {
                this.buf = null;
                this.in.close();
            }
        }
    }

    public boolean hasUnterminatedLine() {
        return this.end == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String readLine() throws java.io.IOException {
        /*
            r8 = this;
            java.io.InputStream r4 = r8.in
            monitor-enter(r4)
            byte[] r0 = r8.buf     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L85
            int r1 = r8.pos     // Catch: java.lang.Throwable -> L8d
            int r0 = r8.end     // Catch: java.lang.Throwable -> L8d
            if (r1 < r0) goto L10
            r8.fillBuf()     // Catch: java.lang.Throwable -> L8d
        L10:
            int r7 = r8.pos     // Catch: java.lang.Throwable -> L8d
        L12:
            int r0 = r8.end     // Catch: java.lang.Throwable -> L8d
            r6 = 10
            if (r7 == r0) goto L46
            byte[] r1 = r8.buf     // Catch: java.lang.Throwable -> L8d
            r0 = r1[r7]     // Catch: java.lang.Throwable -> L8d
            if (r0 != r6) goto L42
            int r0 = r8.pos     // Catch: java.lang.Throwable -> L8d
            if (r7 == r0) goto L40
            int r5 = r7 + (-1)
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L8d
            r0 = 13
            if (r1 != r0) goto L40
        L2a:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L8d
            byte[] r2 = r8.buf     // Catch: java.lang.Throwable -> L8d
            int r1 = r8.pos     // Catch: java.lang.Throwable -> L8d
            int r5 = r5 - r1
            java.nio.charset.Charset r0 = r8.charset     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L8d
            r3.<init>(r2, r1, r5, r0)     // Catch: java.lang.Throwable -> L8d
            int r0 = r7 + 1
            r8.pos = r0     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8d
            goto L45
        L40:
            r5 = r7
            goto L2a
        L42:
            int r7 = r7 + 1
            goto L12
        L45:
            return r3
        L46:
            com.bumptech.glide.disklrucache.StrictLineReader$1 r5 = new com.bumptech.glide.disklrucache.StrictLineReader$1     // Catch: java.lang.Throwable -> L8d
            int r1 = r8.end     // Catch: java.lang.Throwable -> L8d
            int r0 = r8.pos     // Catch: java.lang.Throwable -> L8d
            int r1 = r1 - r0
            int r0 = r1 + 80
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L8d
        L52:
            byte[] r2 = r8.buf     // Catch: java.lang.Throwable -> L8d
            int r1 = r8.pos     // Catch: java.lang.Throwable -> L8d
            int r0 = r8.end     // Catch: java.lang.Throwable -> L8d
            int r0 = r0 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L8d
            r0 = -1
            r8.end = r0     // Catch: java.lang.Throwable -> L8d
            r8.fillBuf()     // Catch: java.lang.Throwable -> L8d
            int r3 = r8.pos     // Catch: java.lang.Throwable -> L8d
        L64:
            int r0 = r8.end     // Catch: java.lang.Throwable -> L8d
            if (r3 == r0) goto L52
            byte[] r2 = r8.buf     // Catch: java.lang.Throwable -> L8d
            r0 = r2[r3]     // Catch: java.lang.Throwable -> L8d
            if (r0 != r6) goto L81
            int r1 = r8.pos     // Catch: java.lang.Throwable -> L8d
            if (r3 == r1) goto L77
            int r0 = r3 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L8d
        L77:
            int r0 = r3 + 1
            r8.pos = r0     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8d
            goto L84
        L81:
            int r3 = r3 + 1
            goto L64
        L84:
            return r0
        L85:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "LineReader is closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            throw r1     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.StrictLineReader.readLine():java.lang.String");
    }
}
