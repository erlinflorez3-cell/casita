package org.msgpack.core.buffer;

import java.io.IOException;
import java.io.OutputStream;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class OutputStreamBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private OutputStream out;

    public OutputStreamBufferOutput(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    public OutputStreamBufferOutput(OutputStream outputStream, int i2) {
        this.out = (OutputStream) Preconditions.checkNotNull(outputStream, "output is null");
        this.buffer = MessageBuffer.allocate(i2);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i2, int i3) throws IOException {
        write(bArr, i2, i3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i2) throws IOException {
        if (this.buffer.size() < i2) {
            this.buffer = MessageBuffer.allocate(i2);
        }
        return this.buffer;
    }

    public OutputStream reset(OutputStream outputStream) throws IOException {
        OutputStream outputStream2 = this.out;
        this.out = outputStream;
        return outputStream2;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.out.write(bArr, i2, i3);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i2) throws IOException {
        write(this.buffer.array(), this.buffer.arrayOffset(), i2);
    }
}
