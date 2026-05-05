package androidx.camera.core.impl.utils.executor;

import androidx.core.util.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class SequentialExecutor implements Executor {
    private static final String TAG = "SequentialExecutor";
    private final Executor mExecutor;
    final Deque<Runnable> mQueue = new ArrayDeque();
    private final QueueWorker mWorker = new QueueWorker();
    WorkerRunningState mWorkerRunningState = WorkerRunningState.IDLE;
    long mWorkerRunCount = 0;

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    SequentialExecutor(Executor executor) {
        this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.mQueue) {
            if (this.mWorkerRunningState == WorkerRunningState.RUNNING || this.mWorkerRunningState == WorkerRunningState.QUEUED) {
                this.mQueue.add(runnable);
                return;
            }
            long j2 = this.mWorkerRunCount;
            Runnable runnable2 = new Runnable() { // from class: androidx.camera.core.impl.utils.executor.SequentialExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            };
            this.mQueue.add(runnable2);
            this.mWorkerRunningState = WorkerRunningState.QUEUING;
            try {
                this.mExecutor.execute(this.mWorker);
                if (this.mWorkerRunningState != WorkerRunningState.QUEUING) {
                    return;
                }
                synchronized (this.mQueue) {
                    if (this.mWorkerRunCount == j2 && this.mWorkerRunningState == WorkerRunningState.QUEUING) {
                        this.mWorkerRunningState = WorkerRunningState.QUEUED;
                    }
                }
            } catch (Error | RuntimeException e2) {
                synchronized (this.mQueue) {
                    boolean z2 = (this.mWorkerRunningState == WorkerRunningState.IDLE || this.mWorkerRunningState == WorkerRunningState.QUEUING) && this.mQueue.removeLastOccurrence(runnable2);
                    if (!(e2 instanceof RejectedExecutionException) || z2) {
                        throw e2;
                    }
                }
            }
        }
    }

    final class QueueWorker implements Runnable {
        QueueWorker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e2) {
                synchronized (SequentialExecutor.this.mQueue) {
                    SequentialExecutor.this.mWorkerRunningState = WorkerRunningState.IDLE;
                    throw e2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        
            r6 = r6 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            r4.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        
            androidx.camera.core.Logger.e(androidx.camera.core.impl.utils.executor.SequentialExecutor.TAG, "Exception while executing runnable " + r4, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void workOnQueue() {
            /*
                r8 = this;
                r7 = 0
                r6 = r7
            L2:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L72
                java.util.Deque<java.lang.Runnable> r5 = r0.mQueue     // Catch: java.lang.Throwable -> L72
                monitor-enter(r5)     // Catch: java.lang.Throwable -> L72
                if (r7 != 0) goto L23
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L6f
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r0.mWorkerRunningState     // Catch: java.lang.Throwable -> L6f
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L6f
                if (r1 != r0) goto L13
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6f
                goto L5b
            L13:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r4 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L6f
                long r2 = r4.mWorkerRunCount     // Catch: java.lang.Throwable -> L6f
                r0 = 1
                long r2 = r2 + r0
                r4.mWorkerRunCount = r2     // Catch: java.lang.Throwable -> L6f
                androidx.camera.core.impl.utils.executor.SequentialExecutor r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L6f
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L6f
                r1.mWorkerRunningState = r0     // Catch: java.lang.Throwable -> L6f
                r7 = 1
            L23:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L6f
                java.util.Deque<java.lang.Runnable> r0 = r0.mQueue     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r4 = r0.poll()     // Catch: java.lang.Throwable -> L6f
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L6f
                if (r4 != 0) goto L37
                androidx.camera.core.impl.utils.executor.SequentialExecutor r1 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L6f
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L6f
                r1.mWorkerRunningState = r0     // Catch: java.lang.Throwable -> L6f
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6f
                goto L65
            L37:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6f
                boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L72
                r6 = r6 | r0
                r4.run()     // Catch: java.lang.RuntimeException -> L41 java.lang.Throwable -> L72
                goto L2
            L41:
                r3 = move-exception
                java.lang.String r2 = "SequentialExecutor"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
                r1.<init>()     // Catch: java.lang.Throwable -> L72
                java.lang.String r0 = "Exception while executing runnable "
                java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L72
                java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L72
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L72
                androidx.camera.core.Logger.e(r2, r0, r3)     // Catch: java.lang.Throwable -> L72
                goto L2
            L5b:
                if (r6 == 0) goto L64
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L64:
                return
            L65:
                if (r6 == 0) goto L6e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L6e:
                return
            L6f:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6f
                throw r0     // Catch: java.lang.Throwable -> L72
            L72:
                r1 = move-exception
                if (r6 == 0) goto L7c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L7c:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker.workOnQueue():void");
        }
    }
}
