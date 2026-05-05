package org.msgpack.core.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private WritableByteChannel channel;

    public ChannelBufferOutput(WritableByteChannel writableByteChannel) {
        this(writableByteChannel, 8192);
    }

    public ChannelBufferOutput(WritableByteChannel writableByteChannel, int i2) {
        this.channel = (WritableByteChannel) Preconditions.checkNotNull(writableByteChannel, "output channel is null");
        this.buffer = MessageBuffer.allocate(i2);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i2, int i3) throws IOException {
        write(bArr, i2, i3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i2) throws IOException {
        if (this.buffer.size() < i2) {
            this.buffer = MessageBuffer.allocate(i2);
        }
        return this.buffer;
    }

    public WritableByteChannel reset(WritableByteChannel writableByteChannel) throws IOException {
        WritableByteChannel writableByteChannel2 = this.channel;
        this.channel = writableByteChannel;
        return writableByteChannel2;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, i3);
        while (byteBufferWrap.hasRemaining()) {
            this.channel.write(byteBufferWrap);
        }
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i2) throws IOException {
        ByteBuffer byteBufferSliceAsByteBuffer = this.buffer.sliceAsByteBuffer(0, i2);
        while (byteBufferSliceAsByteBuffer.hasRemaining()) {
            this.channel.write(byteBufferSliceAsByteBuffer);
        }
    }
}
