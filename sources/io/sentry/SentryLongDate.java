package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryLongDate extends SentryDate {
    private final long nanos;

    public SentryLongDate(long j2) {
        this.nanos = j2;
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return this.nanos;
    }
}
