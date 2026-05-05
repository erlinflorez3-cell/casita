package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public final class CpuCollectionData {
    final double cpuUsagePercentage;
    final long timestampMillis;

    public CpuCollectionData(long j2, double d2) {
        this.timestampMillis = j2;
        this.cpuUsagePercentage = d2;
    }

    public double getCpuUsagePercentage() {
        return this.cpuUsagePercentage;
    }

    public long getTimestampMillis() {
        return this.timestampMillis;
    }
}
