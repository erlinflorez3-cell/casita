package org.msgpack.core.buffer;

import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayBufferInput implements MessageBufferInput {
    private MessageBuffer buffer;
    private boolean isEmpty;

    public ArrayBufferInput(MessageBuffer messageBuffer) {
        this.buffer = messageBuffer;
        if (messageBuffer == null) {
            this.isEmpty = true;
        } else {
            this.isEmpty = false;
        }
    }

    public ArrayBufferInput(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ArrayBufferInput(byte[] bArr, int i2, int i3) {
        this(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null"), i2, i3));
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.buffer = null;
        this.isEmpty = true;
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.isEmpty) {
            return null;
        }
        this.isEmpty = true;
        return this.buffer;
    }

    public MessageBuffer reset(MessageBuffer messageBuffer) {
        MessageBuffer messageBuffer2 = this.buffer;
        this.buffer = messageBuffer;
        if (messageBuffer == null) {
            this.isEmpty = true;
        } else {
            this.isEmpty = false;
        }
        return messageBuffer2;
    }

    public void reset(byte[] bArr) {
        reset(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null")));
    }

    public void reset(byte[] bArr, int i2, int i3) {
        reset(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null"), i2, i3));
    }
}
