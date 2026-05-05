package io.sentry;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryNanotimeDate extends SentryDate {
    private final Date date;
    private final long nanos;

    public SentryNanotimeDate() {
        this(DateUtils.getCurrentDateTime(), System.nanoTime());
    }

    public SentryNanotimeDate(Date date, long j2) {
        this.date = date;
        this.nanos = j2;
    }

    private long nanotimeDiff(SentryNanotimeDate sentryNanotimeDate, SentryNanotimeDate sentryNanotimeDate2) {
        return sentryNanotimeDate.nanoTimestamp() + (sentryNanotimeDate2.nanos - sentryNanotimeDate.nanos);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.sentry.SentryDate, java.lang.Comparable
    public int compareTo(SentryDate sentryDate) {
        if (!(sentryDate instanceof SentryNanotimeDate)) {
            return super.compareTo(sentryDate);
        }
        SentryNanotimeDate sentryNanotimeDate = (SentryNanotimeDate) sentryDate;
        long time = this.date.getTime();
        long time2 = sentryNanotimeDate.date.getTime();
        return time == time2 ? Long.valueOf(this.nanos).compareTo(Long.valueOf(sentryNanotimeDate.nanos)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.SentryDate
    public long diff(SentryDate sentryDate) {
        return sentryDate instanceof SentryNanotimeDate ? this.nanos - ((SentryNanotimeDate) sentryDate).nanos : super.diff(sentryDate);
    }

    @Override // io.sentry.SentryDate
    public long laterDateNanosTimestampByDiff(SentryDate sentryDate) {
        if (sentryDate == null || !(sentryDate instanceof SentryNanotimeDate)) {
            return super.laterDateNanosTimestampByDiff(sentryDate);
        }
        SentryNanotimeDate sentryNanotimeDate = (SentryNanotimeDate) sentryDate;
        return compareTo(sentryDate) < 0 ? nanotimeDiff(this, sentryNanotimeDate) : nanotimeDiff(sentryNanotimeDate, this);
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return DateUtils.dateToNanos(this.date);
    }
}
