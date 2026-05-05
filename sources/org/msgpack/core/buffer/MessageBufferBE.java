package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class MessageBufferBE extends MessageBuffer {
    private MessageBufferBE(Object obj, long j2, int i2) {
        super(obj, j2, i2);
    }

    MessageBufferBE(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    MessageBufferBE(byte[] bArr, int i2, int i3) {
        super(bArr, i2, i3);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public double getDouble(int i2) {
        return unsafe.getDouble(this.base, this.address + ((long) i2));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public float getFloat(int i2) {
        return unsafe.getFloat(this.base, this.address + ((long) i2));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public int getInt(int i2) {
        return unsafe.getInt(this.base, this.address + ((long) i2));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public long getLong(int i2) {
        return unsafe.getLong(this.base, this.address + ((long) i2));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public short getShort(int i2) {
        return unsafe.getShort(this.base, this.address + ((long) i2));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putDouble(int i2, double d2) {
        unsafe.putDouble(this.base, this.address + ((long) i2), d2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putInt(int i2, int i3) {
        unsafe.putInt(this.base, this.address + ((long) i2), i3);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putLong(int i2, long j2) {
        unsafe.putLong(this.base, this.address + ((long) i2), j2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putShort(int i2, short s2) {
        unsafe.putShort(this.base, this.address + ((long) i2), s2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public MessageBufferBE slice(int i2, int i3) {
        if (i2 == 0 && i3 == size()) {
            return this;
        }
        Preconditions.checkArgument(i2 + i3 <= size());
        return new MessageBufferBE(this.base, this.address + ((long) i2), i3);
    }
}
