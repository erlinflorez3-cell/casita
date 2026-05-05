package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class BufferMemoryChunk implements MemoryChunk, Closeable {
    private static final String TAG = "BufferMemoryChunk";

    @Nullable
    private ByteBuffer mBuffer;
    private final long mId = System.identityHashCode(this);
    private final int mSize;

    public BufferMemoryChunk(int i2) {
        this.mBuffer = ByteBuffer.allocateDirect(i2);
        this.mSize = i2;
    }

    private void doCopy(int i2, MemoryChunk memoryChunk, int i3, int i4) {
        if (!(memoryChunk instanceof BufferMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Preconditions.checkState(!isClosed());
        Preconditions.checkState(!memoryChunk.isClosed());
        Preconditions.checkNotNull(this.mBuffer);
        MemoryChunkUtil.checkBounds(i2, memoryChunk.getSize(), i3, i4, this.mSize);
        this.mBuffer.position(i2);
        ByteBuffer byteBuffer = (ByteBuffer) Preconditions.checkNotNull(memoryChunk.getByteBuffer());
        byteBuffer.position(i3);
        byte[] bArr = new byte[i4];
        this.mBuffer.get(bArr, 0, i4);
        byteBuffer.put(bArr, 0, i4);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.mBuffer = null;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public void copy(int i2, MemoryChunk memoryChunk, int i3, int i4) {
        Preconditions.checkNotNull(memoryChunk);
        if (memoryChunk.getUniqueId() == getUniqueId()) {
            String str = "Copying from BufferMemoryChunk " + Long.toHexString(getUniqueId()) + " to BufferMemoryChunk " + Long.toHexString(memoryChunk.getUniqueId()) + " which are the same ";
            Preconditions.checkArgument(false);
        }
        if (memoryChunk.getUniqueId() < getUniqueId()) {
            synchronized (memoryChunk) {
                synchronized (this) {
                    doCopy(i2, memoryChunk, i3, i4);
                }
            }
        } else {
            synchronized (this) {
                synchronized (memoryChunk) {
                    doCopy(i2, memoryChunk, i3, i4);
                }
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    @Nullable
    public synchronized ByteBuffer getByteBuffer() {
        return this.mBuffer;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int getSize() {
        return this.mSize;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getUniqueId() {
        return this.mId;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized boolean isClosed() {
        return this.mBuffer == null;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized byte read(int i2) {
        Preconditions.checkState(!isClosed());
        Preconditions.checkArgument(Boolean.valueOf(i2 >= 0));
        Preconditions.checkArgument(Boolean.valueOf(i2 < this.mSize));
        Preconditions.checkNotNull(this.mBuffer);
        return this.mBuffer.get(i2);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized int read(int i2, byte[] bArr, int i3, int i4) {
        int iAdjustByteCount;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(!isClosed());
        Preconditions.checkNotNull(this.mBuffer);
        iAdjustByteCount = MemoryChunkUtil.adjustByteCount(i2, i4, this.mSize);
        MemoryChunkUtil.checkBounds(i2, bArr.length, i3, iAdjustByteCount, this.mSize);
        this.mBuffer.position(i2);
        this.mBuffer.get(bArr, i3, iAdjustByteCount);
        return iAdjustByteCount;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized int write(int i2, byte[] bArr, int i3, int i4) {
        int iAdjustByteCount;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(!isClosed());
        Preconditions.checkNotNull(this.mBuffer);
        iAdjustByteCount = MemoryChunkUtil.adjustByteCount(i2, i4, this.mSize);
        MemoryChunkUtil.checkBounds(i2, bArr.length, i3, iAdjustByteCount, this.mSize);
        this.mBuffer.position(i2);
        this.mBuffer.put(bArr, i3, iAdjustByteCount);
        return iAdjustByteCount;
    }
}
