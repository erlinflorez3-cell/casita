package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        zzadVar.zza();
        return (TResult) zza(task);
    }

    public static <TResult> TResult await(Task<TResult> task, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        if (zzadVar.zzb(j2, timeUnit)) {
            return (TResult) zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @Deprecated
    public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    public static <TResult> Task<TResult> forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    public static <TResult> Task<TResult> forException(Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzwVar = new zzw();
        zzaf zzafVar = new zzaf(collection.size(), zzwVar);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            zzb(it2.next(), zzafVar);
        }
        return zzwVar;
    }

    public static Task<Void> whenAll(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(null) : whenAll(Arrays.asList(taskArr));
    }

    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
        return whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
    }

    public static Task<List<Task<?>>> whenAllComplete(Executor executor, Collection<? extends Task<?>> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.emptyList()) : whenAll(collection).continueWithTask(executor, new zzab(collection));
    }

    public static Task<List<Task<?>>> whenAllComplete(Executor executor, Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.emptyList()) : whenAllComplete(executor, Arrays.asList(taskArr));
    }

    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.emptyList()) : whenAllComplete(Arrays.asList(taskArr));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> collection) {
        return whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Executor executor, Collection<? extends Task> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.emptyList()) : (Task<List<TResult>>) whenAll((Collection<? extends Task<?>>) collection).continueWith(executor, new zzaa(collection));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Executor executor, Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.emptyList()) : whenAllSuccess(executor, Arrays.asList(taskArr));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.emptyList()) : whenAllSuccess(Arrays.asList(taskArr));
    }

    public static <T> Task<T> withTimeout(Task<T> task, long j2, TimeUnit timeUnit) throws Throwable {
        Preconditions.checkNotNull(task, C1626yg.Ud("\u000f*\u000220Eob5;cgR}\b[\n:\u000bAV", (short) (FB.Xd() ^ 28013), (short) (FB.Xd() ^ 17140)));
        boolean z2 = j2 > 0;
        short sXd = (short) (OY.Xd() ^ 22981);
        int[] iArr = new int["%\r\\?V'L}$ndQM\fx\u0014+\u0016p@\u0005\u001f\\A".length()];
        QB qb = new QB("%\r\\?V'L}$ndQM\fx\u0014+\u0016p@\u0005\u001f\\A");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Preconditions.checkArgument(z2, new String(iArr, 0, i2));
        Preconditions.checkNotNull(timeUnit, EO.Od("G2F\\%\u0014+E8Yc;\b9\ffIblw\n\u007fXKC", (short) (C1607wl.Xd() ^ 20580)));
        final zzb zzbVar = new zzb();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        Class<?> cls = Class.forName(C1561oA.Qd("8D9FB;5}>Az\u0018:99-9", (short) (FB.Xd() ^ 25516)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1607wl.Xd() ^ 12924);
        short sXd3 = (short) (C1607wl.Xd() ^ 32176);
        int[] iArr2 = new int["\u001a\u0019)\u0003\u0018!'\u0006*+-#1".length()];
        QB qb2 = new QB("\u001a\u0019)\u0003\u0018!'\u0006*+-#1");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            final com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza((Looper) declaredMethod.invoke(null, objArr));
            zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.trySetException(new TimeoutException());
                }
            }, timeUnit.toMillis(j2));
            task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    zzaVar.removeCallbacksAndMessages(null);
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    if (task2.isSuccessful()) {
                        taskCompletionSource2.trySetResult(task2.getResult());
                    } else {
                        if (task2.isCanceled()) {
                            zzbVar.zza();
                            return;
                        }
                        Exception exception = task2.getException();
                        exception.getClass();
                        taskCompletionSource2.trySetException(exception);
                    }
                }
            });
            return taskCompletionSource.getTask();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Object zza(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzae zzaeVar) {
        task.addOnSuccessListener(TaskExecutors.zza, zzaeVar);
        task.addOnFailureListener(TaskExecutors.zza, zzaeVar);
        task.addOnCanceledListener(TaskExecutors.zza, zzaeVar);
    }
}
