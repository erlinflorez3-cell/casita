package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryExecutorService implements ISentryExecutorService {
    private final ScheduledExecutorService executorService;

    private static final class SentryExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        private SentryExecutorServiceThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("SentryExecutorServiceThreadFactory-");
            int i2 = this.cnt;
            this.cnt = i2 + 1;
            Thread thread = new Thread(runnable, sb.append(i2).toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public SentryExecutorService() {
        this(Executors.newSingleThreadScheduledExecutor(new SentryExecutorServiceThreadFactory()));
    }

    SentryExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.executorService = scheduledExecutorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[Catch: all -> 0x002e, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x0010, B:9:0x001a, B:10:0x0020, B:11:0x002c), top: B:18:0x0003, inners: #0 }] */
    @Override // io.sentry.ISentryExecutorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close(long r4) {
        /*
            r3 = this;
            java.util.concurrent.ScheduledExecutorService r2 = r3.executorService
            monitor-enter(r2)
            java.util.concurrent.ScheduledExecutorService r0 = r3.executorService     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L2c
            java.util.concurrent.ScheduledExecutorService r0 = r3.executorService     // Catch: java.lang.Throwable -> L2e
            r0.shutdown()     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ScheduledExecutorService r1 = r3.executorService     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            boolean r0 = r1.awaitTermination(r4, r0)     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            if (r0 != 0) goto L2c
            java.util.concurrent.ScheduledExecutorService r0 = r3.executorService     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            r0.shutdownNow()     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L2e
            goto L2c
        L20:
            java.util.concurrent.ScheduledExecutorService r0 = r3.executorService     // Catch: java.lang.Throwable -> L2e
            r0.shutdownNow()     // Catch: java.lang.Throwable -> L2e
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2e
            r0.interrupt()     // Catch: java.lang.Throwable -> L2e
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.SentryExecutorService.close(long):void");
    }

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> schedule(Runnable runnable, long j2) {
        return this.executorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.executorService.submit(runnable);
    }

    @Override // io.sentry.ISentryExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.executorService.submit(callable);
    }
}
