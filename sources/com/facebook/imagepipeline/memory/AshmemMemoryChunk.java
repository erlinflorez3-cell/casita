package com.facebook.imagepipeline.memory;

import android.os.SharedMemory;
import android.system.ErrnoException;
import com.facebook.common.internal.Preconditions;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class AshmemMemoryChunk implements MemoryChunk, Closeable {
    private static final String TAG = "AshmemMemoryChunk";

    @Nullable
    private ByteBuffer mByteBuffer;
    private final long mId;

    @Nullable
    private SharedMemory mSharedMemory;

    public AshmemMemoryChunk() {
        this.mSharedMemory = null;
        this.mByteBuffer = null;
        this.mId = System.identityHashCode(this);
    }

    public AshmemMemoryChunk(int i2) {
        Preconditions.checkArgument(Boolean.valueOf(i2 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create(TAG, i2);
            this.mSharedMemory = sharedMemoryCreate;
            this.mByteBuffer = sharedMemoryCreate.mapReadWrite();
            this.mId = System.identityHashCode(this);
        } catch (ErrnoException e2) {
            throw new RuntimeException("Fail to create AshmemMemory", e2);
        }
    }

    private void doCopy(int i2, MemoryChunk memoryChunk, int i3, int i4) {
        if (!(memoryChunk instanceof AshmemMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Preconditions.checkState(!isClosed());
        Preconditions.checkState(!memoryChunk.isClosed());
        Preconditions.checkNotNull(this.mByteBuffer);
        Preconditions.checkNotNull(memoryChunk.getByteBuffer());
        MemoryChunkUtil.checkBounds(i2, memoryChunk.getSize(), i3, i4, getSize());
        this.mByteBuffer.position(i2);
        memoryChunk.getByteBuffer().position(i3);
        byte[] bArr = new byte[i4];
        this.mByteBuffer.get(bArr, 0, i4);
        memoryChunk.getByteBuffer().put(bArr, 0, i4);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory sharedMemory = this.mSharedMemory;
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            ByteBuffer byteBuffer = this.mByteBuffer;
            if (byteBuffer != null) {
                SharedMemory.unmap(byteBuffer);
            }
            this.mByteBuffer = null;
            this.mSharedMemory = null;
        }
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public void copy(int i2, MemoryChunk memoryChunk, int i3, int i4) {
        Preconditions.checkNotNull(memoryChunk);
        if (memoryChunk.getUniqueId() == getUniqueId()) {
            String str = "Copying from AshmemMemoryChunk " + Long.toHexString(getUniqueId()) + " to AshmemMemoryChunk " + Long.toHexString(memoryChunk.getUniqueId()) + " which are the same ";
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
    public ByteBuffer getByteBuffer() {
        return this.mByteBuffer;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public int getSize() {
        Preconditions.checkNotNull(this.mSharedMemory);
        return this.mSharedMemory.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public long getUniqueId() {
        return this.mId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0009  */
    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.mByteBuffer     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L9
            android.os.SharedMemory r0 = r1.mSharedMemory     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto Lc
        L9:
            r0 = 1
        La:
            monitor-exit(r1)
            return r0
        Lc:
            r0 = 0
            goto La
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.AshmemMemoryChunk.isClosed():boolean");
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized byte read(int i2) {
        Preconditions.checkState(!isClosed());
        Preconditions.checkArgument(Boolean.valueOf(i2 >= 0));
        Preconditions.checkArgument(Boolean.valueOf(i2 < getSize()));
        Preconditions.checkNotNull(this.mByteBuffer);
        return this.mByteBuffer.get(i2);
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized int read(int i2, byte[] bArr, int i3, int i4) {
        int iAdjustByteCount;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkNotNull(this.mByteBuffer);
        iAdjustByteCount = MemoryChunkUtil.adjustByteCount(i2, i4, getSize());
        MemoryChunkUtil.checkBounds(i2, bArr.length, i3, iAdjustByteCount, getSize());
        this.mByteBuffer.position(i2);
        this.mByteBuffer.get(bArr, i3, iAdjustByteCount);
        return iAdjustByteCount;
    }

    @Override // com.facebook.imagepipeline.memory.MemoryChunk
    public synchronized int write(int i2, byte[] bArr, int i3, int i4) {
        int iAdjustByteCount;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkNotNull(this.mByteBuffer);
        iAdjustByteCount = MemoryChunkUtil.adjustByteCount(i2, i4, getSize());
        MemoryChunkUtil.checkBounds(i2, bArr.length, i3, iAdjustByteCount, getSize());
        this.mByteBuffer.position(i2);
        this.mByteBuffer.put(bArr, i3, iAdjustByteCount);
        return iAdjustByteCount;
    }
}
