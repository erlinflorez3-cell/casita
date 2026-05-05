package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityLifecycleTimeSpan implements Comparable<ActivityLifecycleTimeSpan> {
    private final TimeSpan onCreate = new TimeSpan();
    private final TimeSpan onStart = new TimeSpan();

    @Override // java.lang.Comparable
    public int compareTo(ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        int iCompare = Long.compare(this.onCreate.getStartUptimeMs(), activityLifecycleTimeSpan.onCreate.getStartUptimeMs());
        return iCompare == 0 ? Long.compare(this.onStart.getStartUptimeMs(), activityLifecycleTimeSpan.onStart.getStartUptimeMs()) : iCompare;
    }

    public final TimeSpan getOnCreate() {
        return this.onCreate;
    }

    public final TimeSpan getOnStart() {
        return this.onStart;
    }
}
