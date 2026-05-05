package com.facebook.react.runtime.internal.bolts;

import com.facebook.react.interfaces.TaskInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class Task<TResult> implements TaskInterface<TResult> {
    private static volatile UnobservedExceptionHandler unobservedExceptionHandler = null;
    private boolean cancelled;
    private boolean complete;
    private Exception error;
    private boolean errorHasBeenObserved;
    private TResult result;
    private UnobservedErrorNotifier unobservedErrorNotifier;
    public static final Executor IMMEDIATE_EXECUTOR = Executors.IMMEDIATE;
    public static final Executor UI_THREAD_EXECUTOR = Executors.UI_THREAD;
    private static Task<?> TASK_NULL = new Task<>((Object) null);
    private static Task<Boolean> TASK_TRUE = new Task<>(true);
    private static Task<Boolean> TASK_FALSE = new Task<>(false);
    private static Task<?> TASK_CANCELLED = new Task<>(true);
    private final Object lock = new Object();
    private List<Continuation<TResult, Void>> continuations = new ArrayList();

    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    Task() {
    }

    private Task(TResult tresult) {
        trySetResult(tresult);
    }

    private Task(boolean z2) {
        if (z2) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, IMMEDIATE_EXECUTOR);
    }

    public static <TResult> Task<TResult> call(final Callable<TResult> callable, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            executor.execute(new Runnable() { // from class: com.facebook.react.runtime.internal.bolts.Task.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        taskCompletionSource.setResult(callable.call());
                    } catch (CancellationException unused) {
                        taskCompletionSource.setCancelled();
                    } catch (Exception e2) {
                        taskCompletionSource.setError(e2);
                    }
                }
            });
        } catch (Exception e2) {
            taskCompletionSource.setError(new ExecutorException(e2));
        }
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<TResult> cancelled() {
        return (Task<TResult>) TASK_CANCELLED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeAfterTask(final TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, Task<TContinuationResult>> continuation, final Task<TResult> task, Executor executor) {
        try {
            executor.execute(new Runnable() { // from class: com.facebook.react.runtime.internal.bolts.Task.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Task task2 = (Task) continuation.then(task);
                        if (task2 == null) {
                            taskCompletionSource.setResult(null);
                        } else {
                            task2.continueWith(new Continuation<TContinuationResult, Void>() { // from class: com.facebook.react.runtime.internal.bolts.Task.8.1
                                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                                public Void then(Task<TContinuationResult> task3) {
                                    if (task3.isCancelled()) {
                                        taskCompletionSource.setCancelled();
                                        return null;
                                    }
                                    if (task3.isFaulted()) {
                                        taskCompletionSource.setError(task3.getError());
                                        return null;
                                    }
                                    taskCompletionSource.setResult(task3.getResult());
                                    return null;
                                }
                            });
                        }
                    } catch (CancellationException unused) {
                        taskCompletionSource.setCancelled();
                    } catch (Exception e2) {
                        taskCompletionSource.setError(e2);
                    }
                }
            });
        } catch (Exception e2) {
            taskCompletionSource.setError(new ExecutorException(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeImmediately(final TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, TContinuationResult> continuation, final Task<TResult> task, Executor executor) {
        try {
            executor.execute(new Runnable() { // from class: com.facebook.react.runtime.internal.bolts.Task.7
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        taskCompletionSource.setResult(continuation.then(task));
                    } catch (CancellationException unused) {
                        taskCompletionSource.setCancelled();
                    } catch (Exception e2) {
                        taskCompletionSource.setError(e2);
                    }
                }
            });
        } catch (Exception e2) {
            taskCompletionSource.setError(new ExecutorException(e2));
        }
    }

    public static <TResult> TaskCompletionSource create() {
        new Task();
        return new TaskCompletionSource();
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setError(exc);
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == 0) {
            return (Task<TResult>) TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (Task<TResult>) TASK_TRUE : (Task<TResult>) TASK_FALSE;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(tresult);
        return taskCompletionSource.getTask();
    }

    public static UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return unobservedExceptionHandler;
    }

    private void runContinuations() {
        synchronized (this.lock) {
            Iterator<Continuation<TResult, Void>> it = this.continuations.iterator();
            while (it.hasNext()) {
                try {
                    it.next().then(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.continuations = null;
        }
    }

    public static void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler2) {
        unobservedExceptionHandler = unobservedExceptionHandler2;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(continuation, IMMEDIATE_EXECUTOR);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(final Continuation<TResult, TContinuationResult> continuation, final Executor executor) {
        boolean zIsCompleted;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            zIsCompleted = isCompleted();
            if (!zIsCompleted) {
                this.continuations.add(new Continuation<TResult, Void>() { // from class: com.facebook.react.runtime.internal.bolts.Task.3
                    @Override // com.facebook.react.runtime.internal.bolts.Continuation
                    public Void then(Task<TResult> task) {
                        Task.completeImmediately(taskCompletionSource, continuation, task, executor);
                        return null;
                    }
                });
            }
        }
        if (zIsCompleted) {
            completeImmediately(taskCompletionSource, continuation, this, executor);
        }
        return taskCompletionSource.getTask();
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(final Continuation<TResult, Task<TContinuationResult>> continuation, final Executor executor) {
        boolean zIsCompleted;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            zIsCompleted = isCompleted();
            if (!zIsCompleted) {
                this.continuations.add(new Continuation<TResult, Void>() { // from class: com.facebook.react.runtime.internal.bolts.Task.4
                    @Override // com.facebook.react.runtime.internal.bolts.Continuation
                    public Void then(Task<TResult> task) {
                        Task.completeAfterTask(taskCompletionSource, continuation, task, executor);
                        return null;
                    }
                });
            }
        }
        if (zIsCompleted) {
            completeAfterTask(taskCompletionSource, continuation, this, executor);
        }
        return taskCompletionSource.getTask();
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            if (this.error != null) {
                this.errorHasBeenObserved = true;
                UnobservedErrorNotifier unobservedErrorNotifier = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier != null) {
                    unobservedErrorNotifier.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            exc = this.error;
        }
        return exc;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isCancelled() {
        boolean z2;
        synchronized (this.lock) {
            z2 = this.cancelled;
        }
        return z2;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isCompleted() {
        boolean z2;
        synchronized (this.lock) {
            z2 = this.complete;
        }
        return z2;
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean isFaulted() {
        boolean z2;
        synchronized (this.lock) {
            z2 = getError() != null;
        }
        return z2;
    }

    public Task<Void> makeVoid() {
        return continueWithTask(new Continuation<TResult, Task<Void>>() { // from class: com.facebook.react.runtime.internal.bolts.Task.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public Task<Void> then(Task<TResult> task) throws Exception {
                return task.isCancelled() ? Task.cancelled() : task.isFaulted() ? Task.forError(task.getError()) : Task.forResult(null);
            }
        });
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        return onSuccess(continuation, IMMEDIATE_EXECUTOR);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(final Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        return continueWithTask(new Continuation<TResult, Task<TContinuationResult>>() { // from class: com.facebook.react.runtime.internal.bolts.Task.5
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public Task<TContinuationResult> then(Task<TResult> task) {
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWith(continuation);
            }
        }, executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(final Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        return continueWithTask(new Continuation<TResult, Task<TContinuationResult>>() { // from class: com.facebook.react.runtime.internal.bolts.Task.6
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public Task<TContinuationResult> then(Task<TResult> task) {
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWithTask(continuation);
            }
        }, executor);
    }

    boolean trySetCancelled() {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.cancelled = true;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    boolean trySetError(Exception exc) {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.error = exc;
            this.errorHasBeenObserved = false;
            this.lock.notifyAll();
            runContinuations();
            if (!this.errorHasBeenObserved && getUnobservedExceptionHandler() != null) {
                this.unobservedErrorNotifier = new UnobservedErrorNotifier(this);
            }
            return true;
        }
    }

    boolean trySetResult(TResult tresult) {
        synchronized (this.lock) {
            if (this.complete) {
                return false;
            }
            this.complete = true;
            this.result = tresult;
            this.lock.notifyAll();
            runContinuations();
            return true;
        }
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public void waitForCompletion() throws InterruptedException {
        synchronized (this.lock) {
            if (!isCompleted()) {
                this.lock.wait();
            }
        }
    }

    @Override // com.facebook.react.interfaces.TaskInterface
    public boolean waitForCompletion(long j2, TimeUnit timeUnit) throws InterruptedException {
        boolean zIsCompleted;
        synchronized (this.lock) {
            if (!isCompleted()) {
                this.lock.wait(timeUnit.toMillis(j2));
            }
            zIsCompleted = isCompleted();
        }
        return zIsCompleted;
    }
}
