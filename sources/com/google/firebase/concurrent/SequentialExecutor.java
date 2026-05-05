package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
final class SequentialExecutor implements Executor {
    private static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    private final Deque<Runnable> queue = new ArrayDeque();
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;
    private long workerRunCount = 0;
    private final QueueWorker worker = new QueueWorker();

    private final class QueueWorker implements Runnable {

        @CheckForNull
        Runnable task;

        private QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            r0 = (-1) - (((-1) - r6) & ((-1) - (java.lang.Thread.interrupted() ? 1 : 0)));
            r6 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (r0 != 1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            r4 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            com.google.firebase.concurrent.SequentialExecutor.log.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.task, (java.lang.Throwable) r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
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
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L93
                java.util.Deque r2 = com.google.firebase.concurrent.SequentialExecutor.access$100(r0)     // Catch: java.lang.Throwable -> L93
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L93
                if (r7 != 0) goto L24
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L90
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.firebase.concurrent.SequentialExecutor.access$200(r0)     // Catch: java.lang.Throwable -> L90
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L90
                if (r1 != r0) goto L17
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
                goto L70
            L17:
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L90
                com.google.firebase.concurrent.SequentialExecutor.access$308(r0)     // Catch: java.lang.Throwable -> L90
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L90
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L90
                com.google.firebase.concurrent.SequentialExecutor.access$202(r1, r0)     // Catch: java.lang.Throwable -> L90
                r7 = 1
            L24:
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L90
                java.util.Deque r0 = com.google.firebase.concurrent.SequentialExecutor.access$100(r0)     // Catch: java.lang.Throwable -> L90
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L90
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L90
                r8.task = r0     // Catch: java.lang.Throwable -> L90
                if (r0 != 0) goto L35
                goto L7e
            L35:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
                boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L93
                int r1 = (-1) - r6
                int r0 = (-1) - r0
                r1 = r1 & r0
                int r0 = (-1) - r1
                r6 = 1
                if (r0 != r6) goto L46
            L44:
                r5 = 0
                goto L48
            L46:
                r6 = 0
                goto L44
            L48:
                java.lang.Runnable r0 = r8.task     // Catch: java.lang.RuntimeException -> L4e java.lang.Throwable -> L7a
                r0.run()     // Catch: java.lang.RuntimeException -> L4e java.lang.Throwable -> L7a
                goto L6d
            L4e:
                r4 = move-exception
                java.util.logging.Logger r3 = com.google.firebase.concurrent.SequentialExecutor.access$400()     // Catch: java.lang.Throwable -> L7a
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L7a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
                r1.<init>()     // Catch: java.lang.Throwable -> L7a
                java.lang.String r0 = "Exception while executing runnable "
                java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L7a
                java.lang.Runnable r0 = r8.task     // Catch: java.lang.Throwable -> L7a
                java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L7a
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
                r3.log(r2, r0, r4)     // Catch: java.lang.Throwable -> L7a
            L6d:
                r8.task = r5     // Catch: java.lang.Throwable -> L93
                goto L2
            L70:
                if (r6 == 0) goto L79
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L79:
                return
            L7a:
                r0 = move-exception
                r8.task = r5     // Catch: java.lang.Throwable -> L93
                throw r0     // Catch: java.lang.Throwable -> L93
            L7e:
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L90
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L90
                com.google.firebase.concurrent.SequentialExecutor.access$202(r1, r0)     // Catch: java.lang.Throwable -> L90
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
                if (r6 == 0) goto L8f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L8f:
                return
            L90:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
                throw r0     // Catch: java.lang.Throwable -> L93
            L93:
                r1 = move-exception
                if (r6 == 0) goto L9d
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L9d:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e2) {
                synchronized (SequentialExecutor.this.queue) {
                    SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e2;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.task;
            return runnable != null ? "SequentialExecutorWorker{running=" + runnable + "}" : "SequentialExecutorWorker{state=" + SequentialExecutor.this.workerRunningState + "}";
        }
    }

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j2 = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j2;
        return j2;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            if (this.workerRunningState == WorkerRunningState.RUNNING || this.workerRunningState == WorkerRunningState.QUEUED) {
                this.queue.add(runnable);
                return;
            }
            long j2 = this.workerRunCount;
            Runnable runnable2 = new Runnable() { // from class: com.google.firebase.concurrent.SequentialExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }

                public String toString() {
                    return runnable.toString();
                }
            };
            this.queue.add(runnable2);
            this.workerRunningState = WorkerRunningState.QUEUING;
            try {
                this.executor.execute(this.worker);
                if (this.workerRunningState != WorkerRunningState.QUEUING) {
                    return;
                }
                synchronized (this.queue) {
                    if (this.workerRunCount == j2 && this.workerRunningState == WorkerRunningState.QUEUING) {
                        this.workerRunningState = WorkerRunningState.QUEUED;
                    }
                }
            } catch (Error | RuntimeException e2) {
                synchronized (this.queue) {
                    boolean z2 = (this.workerRunningState == WorkerRunningState.IDLE || this.workerRunningState == WorkerRunningState.QUEUING) && this.queue.removeLastOccurrence(runnable2);
                    if (!(e2 instanceof RejectedExecutionException) || z2) {
                        throw e2;
                    }
                }
            }
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.executor + "}";
    }
}
