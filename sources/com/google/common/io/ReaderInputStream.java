package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class ReaderInputStream extends InputStream {
    private ByteBuffer byteBuffer;
    private CharBuffer charBuffer;
    private boolean doneFlushing;
    private boolean draining;
    private final CharsetEncoder encoder;
    private boolean endOfInput;
    private final Reader reader;
    private final byte[] singleByte;

    ReaderInputStream(Reader reader, Charset charset, int bufferSize) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), bufferSize);
    }

    ReaderInputStream(Reader reader, CharsetEncoder encoder, int bufferSize) {
        this.singleByte = new byte[1];
        this.reader = (Reader) Preconditions.checkNotNull(reader);
        this.encoder = (CharsetEncoder) Preconditions.checkNotNull(encoder);
        Preconditions.checkArgument(bufferSize > 0, "bufferSize must be positive: %s", bufferSize);
        encoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(bufferSize);
        this.charBuffer = charBufferAllocate;
        Java8Compatibility.flip(charBufferAllocate);
        this.byteBuffer = ByteBuffer.allocate(bufferSize);
    }

    private static int availableCapacity(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private int drain(byte[] b2, int off, int len) {
        int iMin = Math.min(len, this.byteBuffer.remaining());
        this.byteBuffer.get(b2, off, iMin);
        return iMin;
    }

    private static CharBuffer grow(CharBuffer buf) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(buf.array(), buf.capacity() * 2));
        Java8Compatibility.position(charBufferWrap, buf.position());
        Java8Compatibility.limit(charBufferWrap, buf.limit());
        return charBufferWrap;
    }

    private void readMoreChars() throws IOException {
        if (availableCapacity(this.charBuffer) == 0) {
            if (this.charBuffer.position() > 0) {
                Java8Compatibility.flip(this.charBuffer.compact());
            } else {
                this.charBuffer = grow(this.charBuffer);
            }
        }
        int iLimit = this.charBuffer.limit();
        int i2 = this.reader.read(this.charBuffer.array(), iLimit, availableCapacity(this.charBuffer));
        if (i2 == -1) {
            this.endOfInput = true;
        } else {
            Java8Compatibility.limit(this.charBuffer, iLimit + i2);
        }
    }

    private void startDraining(boolean overflow) {
        Java8Compatibility.flip(this.byteBuffer);
        if (overflow && this.byteBuffer.remaining() == 0) {
            this.byteBuffer = ByteBuffer.allocate(this.byteBuffer.capacity() * 2);
        } else {
            this.draining = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.singleByte) == 1) {
            return UnsignedBytes.toInt(this.singleByte[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r4 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r1 = r9 + r10
            int r0 = r8.length
            com.google.common.base.Preconditions.checkPositionIndexes(r9, r1, r0)
            r6 = 0
            if (r10 != 0) goto La
            return r6
        La:
            boolean r5 = r7.endOfInput
            r4 = r6
        Ld:
            boolean r0 = r7.draining
            if (r0 == 0) goto L2c
            int r1 = r9 + r4
            int r0 = r10 - r4
            int r0 = r7.drain(r8, r1, r0)
            int r4 = r4 + r0
            if (r4 == r10) goto L20
            boolean r0 = r7.doneFlushing
            if (r0 == 0) goto L25
        L20:
            if (r4 <= 0) goto L23
        L22:
            return r4
        L23:
            r4 = -1
            goto L22
        L25:
            r7.draining = r6
            java.nio.ByteBuffer r0 = r7.byteBuffer
            com.google.common.io.Java8Compatibility.clear(r0)
        L2c:
            boolean r0 = r7.doneFlushing
            if (r0 == 0) goto L5f
            java.nio.charset.CoderResult r2 = java.nio.charset.CoderResult.UNDERFLOW
        L32:
            boolean r0 = r2.isOverflow()
            r1 = 1
            if (r0 == 0) goto L3d
            r7.startDraining(r1)
            goto Ld
        L3d:
            boolean r0 = r2.isUnderflow()
            if (r0 == 0) goto L55
            if (r5 == 0) goto L4b
            r7.doneFlushing = r1
            r7.startDraining(r6)
            goto Ld
        L4b:
            boolean r0 = r7.endOfInput
            if (r0 == 0) goto L51
            r5 = r1
            goto L2c
        L51:
            r7.readMoreChars()
            goto L2c
        L55:
            boolean r0 = r2.isError()
            if (r0 == 0) goto L2c
            r2.throwException()
            return r6
        L5f:
            if (r5 == 0) goto L6a
            java.nio.charset.CharsetEncoder r1 = r7.encoder
            java.nio.ByteBuffer r0 = r7.byteBuffer
            java.nio.charset.CoderResult r2 = r1.flush(r0)
            goto L32
        L6a:
            java.nio.charset.CharsetEncoder r3 = r7.encoder
            java.nio.CharBuffer r2 = r7.charBuffer
            java.nio.ByteBuffer r1 = r7.byteBuffer
            boolean r0 = r7.endOfInput
            java.nio.charset.CoderResult r2 = r3.encode(r2, r1, r0)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.ReaderInputStream.read(byte[], int, int):int");
    }
}
