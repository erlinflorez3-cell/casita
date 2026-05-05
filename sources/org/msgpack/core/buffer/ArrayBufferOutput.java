package org.msgpack.core.buffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayBufferOutput implements MessageBufferOutput {
    private final int bufferSize;
    private MessageBuffer lastBuffer;
    private final List<MessageBuffer> list;

    public ArrayBufferOutput() {
        this(8192);
    }

    public ArrayBufferOutput(int i2) {
        this.bufferSize = i2;
        this.list = new ArrayList();
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i2, int i3) {
        this.list.add(MessageBuffer.wrap(bArr, i2, i3));
    }

    public void clear() {
        this.list.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int getSize() {
        Iterator<MessageBuffer> it = this.list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i2) {
        MessageBuffer messageBuffer = this.lastBuffer;
        if (messageBuffer != null && messageBuffer.size() > i2) {
            return this.lastBuffer;
        }
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(Math.max(this.bufferSize, i2));
        this.lastBuffer = messageBufferAllocate;
        return messageBufferAllocate;
    }

    public List<MessageBuffer> toBufferList() {
        return new ArrayList(this.list);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[getSize()];
        int size = 0;
        for (MessageBuffer messageBuffer : this.list) {
            messageBuffer.getBytes(0, bArr, size, messageBuffer.size());
            size += messageBuffer.size();
        }
        return bArr;
    }

    public MessageBuffer toMessageBuffer() {
        return this.list.size() == 1 ? this.list.get(0) : this.list.isEmpty() ? MessageBuffer.allocate(0) : MessageBuffer.wrap(toByteArray());
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i2, int i3) {
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(i3);
        messageBufferAllocate.putBytes(0, bArr, i2, i3);
        this.list.add(messageBufferAllocate);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i2) {
        this.list.add(this.lastBuffer.slice(0, i2));
        if (this.lastBuffer.size() - i2 <= this.bufferSize / 4) {
            this.lastBuffer = null;
        } else {
            MessageBuffer messageBuffer = this.lastBuffer;
            this.lastBuffer = messageBuffer.slice(i2, messageBuffer.size() - i2);
        }
    }
}
