package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("^}l(Ykvxz\u0001vU\u0006sn\u0002miik#iTafVgrb__OLRLLZRHH6jTSbbZ^\u0005yFJtME5Q\u0002@\u007fOC<Hi\u0010@.)<84Dr6C=<k7\u001b1\u0019f++\u001d!o&//!4./\u000f\u0019\u001cVj\u001f\t\b''\u001f#!N#\u0016\u000e\u00037e\u0005\txY\u001a\b\u0003\u0016\u0012\u000e\u000e\u00108wq|zlrn\u0001zTvq~~nnjj")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public interface ListeningExecutorService extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    ListenableFuture<?> submit(Runnable task);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    <T> ListenableFuture<T> submit(Runnable task, @ParametricNullness T result);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    <T> ListenableFuture<T> submit(Callable<T> task);
}
