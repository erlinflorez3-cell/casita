package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class MessageBufferU extends MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ByteBuffer wrap;

    private MessageBufferU(Object obj, long j2, int i2, ByteBuffer byteBuffer) {
        super(obj, j2, i2);
        this.wrap = byteBuffer;
    }

    MessageBufferU(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.wrap = byteBuffer.slice();
    }

    MessageBufferU(byte[] bArr, int i2, int i3) {
        super(bArr, i2, i3);
        this.wrap = ByteBuffer.wrap(bArr, i2, i3).slice();
    }

    private void resetBufferPosition() {
        this.wrap.position(0);
        this.wrap.limit(this.size);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public byte[] array() {
        if (hasArray()) {
            return this.wrap.array();
        }
        return null;
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void copyTo(int i2, MessageBuffer messageBuffer, int i3, int i4) {
        try {
            this.wrap.position(i2);
            messageBuffer.putByteBuffer(i3, this.wrap, i4);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public boolean getBoolean(int i2) {
        return this.wrap.get(i2) != 0;
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public byte getByte(int i2) {
        return this.wrap.get(i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void getBytes(int i2, int i3, ByteBuffer byteBuffer) {
        try {
            this.wrap.position(i2);
            this.wrap.limit(i2 + i3);
            byteBuffer.put(this.wrap);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void getBytes(int i2, byte[] bArr, int i3, int i4) {
        try {
            this.wrap.position(i2);
            this.wrap.get(bArr, i3, i4);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public double getDouble(int i2) {
        return this.wrap.getDouble(i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public float getFloat(int i2) {
        return this.wrap.getFloat(i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public int getInt(int i2) {
        return this.wrap.getInt(i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public long getLong(int i2) {
        return this.wrap.getLong(i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public short getShort(int i2) {
        return this.wrap.getShort(i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public boolean hasArray() {
        return !this.wrap.isDirect();
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putBoolean(int i2, boolean z2) {
        this.wrap.put(i2, z2 ? (byte) 1 : (byte) 0);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putByte(int i2, byte b2) {
        this.wrap.put(i2, b2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putByteBuffer(int i2, ByteBuffer byteBuffer, int i3) {
        if (byteBuffer.hasArray()) {
            putBytes(i2, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i3);
            byteBuffer.position(byteBuffer.position() + i3);
            return;
        }
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i3);
            this.wrap.position(i2);
            this.wrap.put(byteBuffer);
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putBytes(int i2, byte[] bArr, int i3, int i4) {
        try {
            this.wrap.position(i2);
            this.wrap.put(bArr, i3, i4);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putDouble(int i2, double d2) {
        this.wrap.putDouble(i2, d2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putFloat(int i2, float f2) {
        this.wrap.putFloat(i2, f2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putInt(int i2, int i3) {
        this.wrap.putInt(i2, i3);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putLong(int i2, long j2) {
        this.wrap.putLong(i2, j2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putMessageBuffer(int i2, MessageBuffer messageBuffer, int i3, int i4) {
        putByteBuffer(i2, messageBuffer.sliceAsByteBuffer(i3, i4), i4);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putShort(int i2, short s2) {
        this.wrap.putShort(i2, s2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public MessageBufferU slice(int i2, int i3) {
        if (i2 == 0 && i3 == size()) {
            return this;
        }
        int i4 = i2 + i3;
        Preconditions.checkArgument(i4 <= size());
        try {
            this.wrap.position(i2);
            this.wrap.limit(i4);
            return new MessageBufferU(this.base, ((long) i2) + this.address, i3, this.wrap.slice());
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, this.size);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public ByteBuffer sliceAsByteBuffer(int i2, int i3) {
        try {
            this.wrap.position(i2);
            this.wrap.limit(i2 + i3);
            return this.wrap.slice();
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public byte[] toByteArray() {
        int size = size();
        byte[] bArr = new byte[size];
        getBytes(0, bArr, 0, size);
        return bArr;
    }
}
