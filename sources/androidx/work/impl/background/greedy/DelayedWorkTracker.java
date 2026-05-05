package androidx.work.impl.background.greedy;

import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class DelayedWorkTracker {
    static final String TAG = Logger.tagWithPrefix("DelayedWorkTracker");
    final GreedyScheduler mGreedyScheduler;
    private final RunnableScheduler mRunnableScheduler;
    private final Map<String, Runnable> mRunnables = new HashMap();

    public DelayedWorkTracker(GreedyScheduler scheduler, RunnableScheduler runnableScheduler) {
        this.mGreedyScheduler = scheduler;
        this.mRunnableScheduler = runnableScheduler;
    }

    public void schedule(final WorkSpec workSpec) {
        Runnable runnableRemove = this.mRunnables.remove(workSpec.id);
        if (runnableRemove != null) {
            this.mRunnableScheduler.cancel(runnableRemove);
        }
        AnonymousClass1 anonymousClass1 = new Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
            final /* synthetic */ WorkSpec val$workSpec;

            AnonymousClass1(final WorkSpec workSpec2) {
                val$workSpec = workSpec2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.get().debug(DelayedWorkTracker.TAG, "Scheduling work " + val$workSpec.id);
                DelayedWorkTracker.this.mGreedyScheduler.schedule(val$workSpec);
            }
        };
        this.mRunnables.put(workSpec2.id, anonymousClass1);
        this.mRunnableScheduler.scheduleWithDelay(workSpec2.calculateNextRunTime() - System.currentTimeMillis(), anonymousClass1);
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.greedy.DelayedWorkTracker$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ WorkSpec val$workSpec;

        AnonymousClass1(final WorkSpec workSpec2) {
            val$workSpec = workSpec2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.get().debug(DelayedWorkTracker.TAG, "Scheduling work " + val$workSpec.id);
            DelayedWorkTracker.this.mGreedyScheduler.schedule(val$workSpec);
        }
    }

    public void unschedule(String workSpecId) {
        Runnable runnableRemove = this.mRunnables.remove(workSpecId);
        if (runnableRemove != null) {
            this.mRunnableScheduler.cancel(runnableRemove);
        }
    }
}
