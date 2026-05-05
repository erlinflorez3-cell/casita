package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.google.common.io.ByteStreams.1
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b2) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] b2) {
            Preconditions.checkNotNull(b2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b2, int off, int len) {
            Preconditions.checkNotNull(b2);
            Preconditions.checkPositionIndexes(off, len + off, b2.length);
        }
    };
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

    private static class ByteArrayDataInputStream implements ByteArrayDataInput {
        final DataInput input;

        ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
            this.input = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.input.readByte();
            } catch (EOFException e2) {
                throw new IllegalStateException(e2);
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.input.readChar();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.input.readDouble();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.input.readFloat();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] b2) {
            try {
                this.input.readFully(b2);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] b2, int off, int len) {
            try {
                this.input.readFully(b2, off, len);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.input.readInt();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        @CheckForNull
        public String readLine() {
            try {
                return this.input.readLine();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.input.readLong();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.input.readShort();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readUTF() {
            try {
                return this.input.readUTF();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int n2) {
            try {
                return this.input.skipBytes(n2);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    private static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        final ByteArrayOutputStream byteArrayOutputStream;
        final DataOutput output;

        ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
            this.output = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.byteArrayOutputStream.toByteArray();
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int b2) {
            try {
                this.output.write(b2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] b2) {
            try {
                this.output.write(b2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] b2, int off, int len) {
            try {
                this.output.write(b2, off, len);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean v2) {
            try {
                this.output.writeBoolean(v2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int v2) {
            try {
                this.output.writeByte(v2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(String s2) {
            try {
                this.output.writeBytes(s2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int v2) {
            try {
                this.output.writeChar(v2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(String s2) {
            try {
                this.output.writeChars(s2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double v2) {
            try {
                this.output.writeDouble(v2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float v2) {
            try {
                this.output.writeFloat(v2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int v2) {
            try {
                this.output.writeInt(v2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long v2) {
            try {
                this.output.writeLong(v2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int v2) {
            try {
                this.output.writeShort(v2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(String s2) {
            try {
                this.output.writeUTF(s2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    private static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        LimitedInputStream(InputStream in, long limit) {
            super(in);
            this.mark = -1L;
            Preconditions.checkNotNull(in);
            Preconditions.checkArgument(limit >= 0, "limit must be non-negative");
            this.left = limit;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(this.in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int readLimit) {
            this.in.mark(readLimit);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left == 0) {
                return -1;
            }
            int i2 = this.in.read();
            if (i2 != -1) {
                this.left--;
            }
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] b2, int off, int len) throws IOException {
            long j2 = this.left;
            if (j2 == 0) {
                return -1;
            }
            int i2 = this.in.read(b2, off, (int) Math.min(len, j2));
            if (i2 != -1) {
                this.left -= (long) i2;
            }
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new IOException("Mark not set");
            }
            this.in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long n2) throws IOException {
            long jSkip = this.in.skip(Math.min(n2, this.left));
            this.left -= jSkip;
            return jSkip;
        }
    }

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> bufs, int totalLen) {
        if (bufs.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = bufs.remove();
        if (bArrRemove.length == totalLen) {
            return bArrRemove;
        }
        int length = totalLen - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, totalLen);
        while (length > 0) {
            byte[] bArrRemove2 = bufs.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, totalLen - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static long copy(InputStream from, OutputStream to) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to);
        byte[] bArrCreateBuffer = createBuffer();
        long j2 = 0;
        while (true) {
            int i2 = from.read(bArrCreateBuffer);
            if (i2 == -1) {
                return j2;
            }
            to.write(bArrCreateBuffer, 0, i2);
            j2 += (long) i2;
        }
    }

    public static long copy(ReadableByteChannel from, WritableByteChannel to) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to);
        long jWrite = 0;
        if (!(from instanceof FileChannel)) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(createBuffer());
            while (from.read(byteBufferWrap) != -1) {
                Java8Compatibility.flip(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) to.write(byteBufferWrap);
                }
                Java8Compatibility.clear(byteBufferWrap);
            }
            return jWrite;
        }
        FileChannel fileChannel = (FileChannel) from;
        long jPosition = fileChannel.position();
        long j2 = jPosition;
        while (true) {
            long jTransferTo = fileChannel.transferTo(j2, 524288L, to);
            j2 += jTransferTo;
            fileChannel.position(j2);
            if (jTransferTo <= 0 && j2 >= fileChannel.size()) {
                return j2 - jPosition;
            }
        }
    }

    static byte[] createBuffer() {
        return new byte[8192];
    }

    public static long exhaust(InputStream in) throws IOException {
        byte[] bArrCreateBuffer = createBuffer();
        long j2 = 0;
        while (true) {
            long j3 = in.read(bArrCreateBuffer);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
        }
    }

    public static InputStream limit(InputStream in, long limit) {
        return new LimitedInputStream(in, limit);
    }

    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new ByteArrayDataInputStream((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    public static ByteArrayDataInput newDataInput(byte[] bytes) {
        return newDataInput(new ByteArrayInputStream(bytes));
    }

    public static ByteArrayDataInput newDataInput(byte[] bytes, int start) {
        Preconditions.checkPositionIndex(start, bytes.length);
        return newDataInput(new ByteArrayInputStream(bytes, start, bytes.length - start));
    }

    public static ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static ByteArrayDataOutput newDataOutput(int size) {
        if (size >= 0) {
            return newDataOutput(new ByteArrayOutputStream(size));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(size)));
    }

    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }

    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    public static int read(InputStream in, byte[] b2, int off, int len) throws IOException {
        Preconditions.checkNotNull(in);
        Preconditions.checkNotNull(b2);
        if (len < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(len)));
        }
        Preconditions.checkPositionIndexes(off, off + len, b2.length);
        int i2 = 0;
        while (i2 < len) {
            int i3 = in.read(b2, off + i2, len - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }

    @ParametricNullness
    public static <T> T readBytes(InputStream input, ByteProcessor<T> processor) throws IOException {
        int i2;
        Preconditions.checkNotNull(input);
        Preconditions.checkNotNull(processor);
        byte[] bArrCreateBuffer = createBuffer();
        do {
            i2 = input.read(bArrCreateBuffer);
            if (i2 == -1) {
                break;
            }
        } while (processor.processBytes(bArrCreateBuffer, 0, i2));
        return processor.getResult();
    }

    public static void readFully(InputStream in, byte[] b2) throws IOException {
        readFully(in, b2, 0, b2.length);
    }

    public static void readFully(InputStream in, byte[] b2, int off, int len) throws IOException {
        int i2 = read(in, b2, off, len);
        if (i2 != len) {
            throw new EOFException("reached end of stream after reading " + i2 + " bytes; " + len + " bytes expected");
        }
    }

    public static void skipFully(InputStream in, long n2) throws IOException {
        long jSkipUpTo = skipUpTo(in, n2);
        if (jSkipUpTo < n2) {
            throw new EOFException("reached end of stream after skipping " + jSkipUpTo + " bytes; " + n2 + " bytes expected");
        }
    }

    private static long skipSafely(InputStream in, long n2) throws IOException {
        int iAvailable = in.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return in.skip(Math.min(iAvailable, n2));
    }

    static long skipUpTo(InputStream in, long n2) throws IOException {
        byte[] bArr = null;
        long j2 = 0;
        while (j2 < n2) {
            long j3 = n2 - j2;
            long jSkipSafely = skipSafely(in, j3);
            if (jSkipSafely == 0) {
                int iMin = (int) Math.min(j3, 8192L);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jSkipSafely = in.read(bArr, 0, iMin);
                if (jSkipSafely == -1) {
                    break;
                }
            }
            j2 += jSkipSafely;
        }
        return j2;
    }

    public static byte[] toByteArray(InputStream in) throws IOException {
        Preconditions.checkNotNull(in);
        return toByteArrayInternal(in, new ArrayDeque(20), 0);
    }

    static byte[] toByteArray(InputStream in, long expectedSize) throws IOException {
        Preconditions.checkArgument(expectedSize >= 0, "expectedSize (%s) must be non-negative", expectedSize);
        if (expectedSize > 2147483639) {
            throw new OutOfMemoryError(expectedSize + " bytes is too large to fit in a byte array");
        }
        int i2 = (int) expectedSize;
        byte[] bArr = new byte[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = i2 - i3;
            int i5 = in.read(bArr, i4, i3);
            if (i5 == -1) {
                return Arrays.copyOf(bArr, i4);
            }
            i3 -= i5;
        }
        int i6 = in.read();
        if (i6 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i6});
        return toByteArrayInternal(in, arrayDeque, i2 + 1);
    }

    private static byte[] toByteArrayInternal(InputStream in, Queue<byte[]> bufs, int totalLen) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(totalLen) * 2));
        while (totalLen < MAX_ARRAY_LEN) {
            int iMin2 = Math.min(iMin, MAX_ARRAY_LEN - totalLen);
            byte[] bArr = new byte[iMin2];
            bufs.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = in.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return combineBuffers(bufs, totalLen);
                }
                i2 += i3;
                totalLen += i3;
            }
            iMin = IntMath.saturatedMultiply(iMin, iMin < 4096 ? 4 : 2);
        }
        if (in.read() == -1) {
            return combineBuffers(bufs, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
