package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public final class JavaMemoryCollector implements IPerformanceSnapshotCollector {
    private final Runtime runtime = Runtime.getRuntime();

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(PerformanceCollectionData performanceCollectionData) {
        performanceCollectionData.addMemoryData(new MemoryCollectionData(System.currentTimeMillis(), this.runtime.totalMemory() - this.runtime.freeMemory()));
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
    }
}
