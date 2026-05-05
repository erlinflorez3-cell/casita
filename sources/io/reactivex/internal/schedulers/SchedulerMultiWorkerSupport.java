package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;

/* JADX INFO: loaded from: classes6.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i2, Scheduler.Worker worker);
    }

    void createWorkers(int i2, WorkerCallback workerCallback);
}
