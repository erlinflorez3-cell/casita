package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
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
        
            r1 = java.lang.Thread.interrupted();
            r0 = (r6 + (r1 ? 1 : 0)) - (r6 & (r1 ? 1 : 0));
            r6 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r0 != 1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        
            r4 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        
            com.google.common.util.concurrent.SequentialExecutor.log.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.task, (java.lang.Throwable) r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
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
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L90
                java.util.Deque r2 = com.google.common.util.concurrent.SequentialExecutor.access$100(r0)     // Catch: java.lang.Throwable -> L90
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L90
                if (r7 != 0) goto L24
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L8d
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.common.util.concurrent.SequentialExecutor.access$200(r0)     // Catch: java.lang.Throwable -> L8d
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L8d
                if (r1 != r0) goto L17
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L8d
                goto L6d
            L17:
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L8d
                com.google.common.util.concurrent.SequentialExecutor.access$308(r0)     // Catch: java.lang.Throwable -> L8d
                com.google.common.util.concurrent.SequentialExecutor r1 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L8d
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L8d
                com.google.common.util.concurrent.SequentialExecutor.access$202(r1, r0)     // Catch: java.lang.Throwable -> L8d
                r7 = 1
            L24:
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L8d
                java.util.Deque r0 = com.google.common.util.concurrent.SequentialExecutor.access$100(r0)     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L8d
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L8d
                r8.task = r0     // Catch: java.lang.Throwable -> L8d
                if (r0 != 0) goto L35
                goto L7b
            L35:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L8d
                boolean r1 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L90
                int r0 = r6 + r1
                r6 = r6 & r1
                int r0 = r0 - r6
                r6 = 1
                if (r0 != r6) goto L43
            L41:
                r5 = 0
                goto L45
            L43:
                r6 = 0
                goto L41
            L45:
                java.lang.Runnable r0 = r8.task     // Catch: java.lang.RuntimeException -> L4b java.lang.Throwable -> L77
                r0.run()     // Catch: java.lang.RuntimeException -> L4b java.lang.Throwable -> L77
                goto L6a
            L4b:
                r4 = move-exception
                java.util.logging.Logger r3 = com.google.common.util.concurrent.SequentialExecutor.access$400()     // Catch: java.lang.Throwable -> L77
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L77
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
                r1.<init>()     // Catch: java.lang.Throwable -> L77
                java.lang.String r0 = "Exception while executing runnable "
                java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L77
                java.lang.Runnable r0 = r8.task     // Catch: java.lang.Throwable -> L77
                java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L77
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L77
                r3.log(r2, r0, r4)     // Catch: java.lang.Throwable -> L77
            L6a:
                r8.task = r5     // Catch: java.lang.Throwable -> L90
                goto L2
            L6d:
                if (r6 == 0) goto L76
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L76:
                return
            L77:
                r0 = move-exception
                r8.task = r5     // Catch: java.lang.Throwable -> L90
                throw r0     // Catch: java.lang.Throwable -> L90
            L7b:
                com.google.common.util.concurrent.SequentialExecutor r1 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L8d
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L8d
                com.google.common.util.concurrent.SequentialExecutor.access$202(r1, r0)     // Catch: java.lang.Throwable -> L8d
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L8d
                if (r6 == 0) goto L8c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L8c:
                return
            L8d:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L8d
                throw r0     // Catch: java.lang.Throwable -> L90
            L90:
                r1 = move-exception
                if (r6 == 0) goto L9a
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L9a:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
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
    public void execute(final Runnable task) {
        Preconditions.checkNotNull(task);
        synchronized (this.queue) {
            if (this.workerRunningState == WorkerRunningState.RUNNING || this.workerRunningState == WorkerRunningState.QUEUED) {
                this.queue.add(task);
                return;
            }
            long j2 = this.workerRunCount;
            Runnable runnable = new Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    task.run();
                }

                public String toString() {
                    return task.toString();
                }
            };
            this.queue.add(runnable);
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
                    boolean z2 = (this.workerRunningState == WorkerRunningState.IDLE || this.workerRunningState == WorkerRunningState.QUEUING) && this.queue.removeLastOccurrence(runnable);
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
