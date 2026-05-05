package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zzaw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public class MLTaskExecutor {
    private static final Object zza = new Object();
    private static MLTaskExecutor zzb = null;
    private final Handler zzc;

    private MLTaskExecutor(Looper looper) {
        this.zzc = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    public static MLTaskExecutor getInstance() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (zza) {
            if (zzb == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                zzb = new MLTaskExecutor(handlerThread.getLooper());
            }
            mLTaskExecutor = zzb;
        }
        return mLTaskExecutor;
    }

    public static Executor workerThreadExecutor() {
        return zzh.zza;
    }

    public Handler getHandler() {
        return this.zzc;
    }

    public <ResultT> Task<ResultT> scheduleCallable(final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        scheduleRunnable(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzf
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (MlKitException e2) {
                    taskCompletionSource2.setException(e2);
                } catch (Exception e3) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e3));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public void scheduleRunnable(Runnable runnable) {
        workerThreadExecutor().execute(runnable);
    }

    public void scheduleRunnableDelayed(Runnable runnable, long j2) throws Throwable {
        Handler handler = this.zzc;
        Class<?> cls = Class.forName(C1561oA.Kd("LZQ`^YU bg#>Xf]f`n", (short) (C1580rY.Xd() ^ (-17677))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1580rY.Xd() ^ (-20429));
        short sXd2 = (short) (C1580rY.Xd() ^ (-3505));
        int[] iArr = new int["__\u0016[H}\u0015\u000b\u0016exE\u000f:\u000eE1#".length()];
        QB qb = new QB("__\u0016[H}\u0015\u000b\u0016exE\u000f:\u000eE1#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {runnable, Long.valueOf(j2)};
        Method method = cls.getMethod(C1561oA.Xd("338:\u000b-5+D11", (short) (Od.Xd() ^ (-3805))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public <ResultT> Task<ResultT> scheduleTaskCallable(Callable<Task<ResultT>> callable) {
        return (Task<ResultT>) scheduleCallable(callable).continueWithTask(zzaw.zza(), new Continuation() { // from class: com.google.mlkit.common.sdkinternal.zzg
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (Task) task.getResult();
            }
        });
    }
}
