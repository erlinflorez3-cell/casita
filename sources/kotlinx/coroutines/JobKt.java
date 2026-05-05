package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|[\u000bl\u0003u\u0005Ud+^,$5I\u0012!", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|[\u000bl\u0003u\u0005Ud/X\u001ay7"}, d2 = {}, k = 4, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class JobKt {
    public static final CompletableJob Job(Job job) {
        return JobKt__JobKt.Job(job);
    }

    public static final void cancel(CoroutineContext coroutineContext, CancellationException cancellationException) {
        JobKt__JobKt.cancel(coroutineContext, cancellationException);
    }

    public static final void cancel(Job job, String str, Throwable th) {
        JobKt__JobKt.cancel(job, str, th);
    }

    public static final Object cancelAndJoin(Job job, Continuation<? super Unit> continuation) {
        return JobKt__JobKt.cancelAndJoin(job, continuation);
    }

    public static final void cancelChildren(CoroutineContext coroutineContext, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(coroutineContext, cancellationException);
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(job, cancellationException);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0017N\u0005H1z*e[[1\n^T0]a_H5\u0014|KV\u0006\u0006\u0006rO\tco|_$PNimxO+CF\u001b[_Saa\\z|G@\u001eKU#XZy5\u0010u\u0011{v0S\u0003;c7\u001c\u0011Z\u0015~\u0004Gm2Ff\u0004zV\u001d|~%\u0002i\rO=\u007f.T\u000e:^\u001e%#\f", replaceWith = @ReplaceWith(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    @InterfaceC1492Gx
    public static final void cancelFutureOnCancellation(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        JobKt__FutureKt.cancelFutureOnCancellation(cancellableContinuation, future);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return JobKt__JobKt.disposeOnCompletion(job, disposableHandle);
    }

    public static final void ensureActive(CoroutineContext coroutineContext) {
        JobKt__JobKt.ensureActive(coroutineContext);
    }

    public static final void ensureActive(Job job) {
        JobKt__JobKt.ensureActive(job);
    }

    public static final Job getJob(CoroutineContext coroutineContext) {
        return JobKt__JobKt.getJob(coroutineContext);
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z2, JobNode jobNode) {
        return JobKt__JobKt.invokeOnCompletion(job, z2, jobNode);
    }

    public static final boolean isActive(CoroutineContext coroutineContext) {
        return JobKt__JobKt.isActive(coroutineContext);
    }
}
