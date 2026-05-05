package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public final class Utils {
    private static final int BACKGROUND_TIMEOUT_MILLIS = 4000;
    private static final int MAIN_TIMEOUT_MILLIS = 3000;
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    @Deprecated
    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws Throwable {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return Utils.lambda$awaitEvenIfOnMainThread$0(countDownLatch, task2);
            }
        });
        Class<?> cls = Class.forName(C1561oA.Xd("q\u007fv\u0006\u0004~zE\b\rHg\f\r\u000f\u0005\u0013", (short) (C1499aX.Xd() ^ (-25755))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 14802);
        int[] iArr = new int["\u000b\b\u0016m\u0001\b\fh\u001b\u001a\u001a\u000e\u001a".length()];
        QB qb = new QB("\u000b\b\u0016m\u0001\b\fh\u001b\u001a\u001a\u000e\u001a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            if (((Looper) declaredMethod.invoke(null, objArr)) == Looper.myLooper()) {
                countDownLatch.await(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
            }
            if (task.isSuccessful()) {
                return task.getResult();
            }
            if (!task.isCanceled()) {
                if (task.isComplete()) {
                    throw new IllegalStateException(task.getException());
                }
                throw new TimeoutException();
            }
            short sXd2 = (short) (C1499aX.Xd() ^ (-9847));
            short sXd3 = (short) (C1499aX.Xd() ^ (-27505));
            int[] iArr2 = new int["gs\u0005{/w\u0001,lv{mhj~$fcocdjb`".length()];
            QB qb2 = new QB("gs\u0005{/w\u0001,lv{mhj~$fcocdjb`");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            throw new CancellationException(new String(iArr2, 0, i3));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j2, TimeUnit timeUnit) {
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j2);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static /* synthetic */ Object lambda$awaitEvenIfOnMainThread$0(CountDownLatch countDownLatch, Task task) throws Exception {
        countDownLatch.countDown();
        return null;
    }
}
