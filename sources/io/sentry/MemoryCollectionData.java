package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public final class MemoryCollectionData {
    final long timestampMillis;
    final long usedHeapMemory;
    final long usedNativeMemory;

    public MemoryCollectionData(long j2, long j3) {
        this(j2, j3, -1L);
    }

    public MemoryCollectionData(long j2, long j3, long j4) {
        this.timestampMillis = j2;
        this.usedHeapMemory = j3;
        this.usedNativeMemory = j4;
    }

    public long getTimestampMillis() {
        return this.timestampMillis;
    }

    public long getUsedHeapMemory() {
        return this.usedHeapMemory;
    }

    public long getUsedNativeMemory() {
        return this.usedNativeMemory;
    }
}
