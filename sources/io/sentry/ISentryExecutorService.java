package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public interface ISentryExecutorService {
    void close(long j2);

    boolean isClosed();

    Future<?> schedule(Runnable runnable, long j2) throws RejectedExecutionException;

    Future<?> submit(Runnable runnable) throws RejectedExecutionException;

    <T> Future<T> submit(Callable<T> callable) throws RejectedExecutionException;
}
