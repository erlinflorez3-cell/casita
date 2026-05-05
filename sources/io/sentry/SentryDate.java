package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SentryDate implements Comparable<SentryDate> {
    @Override // java.lang.Comparable
    public int compareTo(SentryDate sentryDate) {
        return Long.valueOf(nanoTimestamp()).compareTo(Long.valueOf(sentryDate.nanoTimestamp()));
    }

    public long diff(SentryDate sentryDate) {
        return nanoTimestamp() - sentryDate.nanoTimestamp();
    }

    public final boolean isAfter(SentryDate sentryDate) {
        return diff(sentryDate) > 0;
    }

    public final boolean isBefore(SentryDate sentryDate) {
        return diff(sentryDate) < 0;
    }

    public long laterDateNanosTimestampByDiff(SentryDate sentryDate) {
        return (sentryDate == null || compareTo(sentryDate) >= 0) ? nanoTimestamp() : sentryDate.nanoTimestamp();
    }

    public abstract long nanoTimestamp();
}
