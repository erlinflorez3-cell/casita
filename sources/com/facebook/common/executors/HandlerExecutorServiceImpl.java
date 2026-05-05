package com.facebook.common.executors;

import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class HandlerExecutorServiceImpl extends AbstractExecutorService implements HandlerExecutorService {
    private final Handler mHandler;

    public HandlerExecutorServiceImpl(Handler handler) {
        this.mHandler = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) throws Throwable {
        Handler handler = this.mHandler;
        Object[] objArr = {runnable};
        Method method = Class.forName(EO.Od("5\u0014\fA^.|&+Br3\u001c+!N\u001d\u0014", (short) (C1633zX.Xd() ^ (-1788)))).getMethod(C1593ug.zd("MMRT", (short) (C1607wl.Xd() ^ 7649), (short) (C1607wl.Xd() ^ 8517)), Class.forName(C1561oA.Qd("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X{\u001e\u0016\u0015\u0007\u0007\u0010\b", (short) (ZN.Xd() ^ 5092))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.common.executors.HandlerExecutorService
    public boolean isHandlerThread() {
        return Thread.currentThread() == this.mHandler.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public <T> ScheduledFutureImpl<T> newTaskFor(Runnable runnable, @Nullable T t2) {
        return new ScheduledFutureImpl<>(this.mHandler, runnable, t2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public <T> ScheduledFutureImpl<T> newTaskFor(Callable<T> callable) {
        return new ScheduledFutureImpl<>(this.mHandler, callable);
    }

    @Override // com.facebook.common.executors.HandlerExecutorService
    public void quit() {
        this.mHandler.getLooper().quit();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) throws Throwable {
        ScheduledFutureImpl scheduledFutureImplNewTaskFor = newTaskFor(runnable, (Object) null);
        Handler handler = this.mHandler;
        long millis = timeUnit.toMillis(j2);
        Class<?> cls = Class.forName(C1561oA.od("DPERNGA\nJM\u0007 8D9@8D", (short) (C1633zX.Xd() ^ (-27270))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (Od.Xd() ^ (-15360));
        int[] iArr = new int["XPfR _Uc]%Jnhi]_jd".length()];
        QB qb = new QB("XPfR _Uc]%Jnhi]_jd");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {scheduledFutureImplNewTaskFor, Long.valueOf(millis)};
        Method method = cls.getMethod(Wg.Zd("\"@b\u0003p1Vj\u0001\f)", (short) (FB.Xd() ^ 32541), (short) (FB.Xd() ^ 32433)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            return scheduledFutureImplNewTaskFor;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) throws Throwable {
        ScheduledFutureImpl scheduledFutureImplNewTaskFor = newTaskFor((Callable) callable);
        Handler handler = this.mHandler;
        long millis = timeUnit.toMillis(j2);
        Class<?> cls = Class.forName(C1561oA.Xd("KYP_]XT\u001faf\"=We\\e_m", (short) (C1499aX.Xd() ^ (-11713))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (FB.Xd() ^ 7775);
        int[] iArr = new int["\u001a\u0010$\u000ea\u001f\u0013\u001f\u001fd\b**)\u001b\u001b\f\u0004".length()];
        QB qb = new QB("\u001a\u0010$\u000ea\u001f\u0013\u001f\u001fd\b**)\u001b\u001b\f\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {scheduledFutureImplNewTaskFor, Long.valueOf(millis)};
        Method method = cls.getMethod(Qg.kd("0.11\u007f &\u001a1\u001c\u001a", (short) (C1607wl.Xd() ^ 30445), (short) (C1607wl.Xd() ^ 6257)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            return scheduledFutureImplNewTaskFor;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, (Object) null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> ScheduledFuture<T> submit(Runnable runnable, @Nullable T t2) throws Throwable {
        runnable.getClass();
        ScheduledFutureImpl<T> scheduledFutureImplNewTaskFor = newTaskFor(runnable, (Object) t2);
        execute(scheduledFutureImplNewTaskFor);
        return scheduledFutureImplNewTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> ScheduledFuture<T> submit(Callable<T> callable) throws Throwable {
        callable.getClass();
        ScheduledFutureImpl<T> scheduledFutureImplNewTaskFor = newTaskFor((Callable) callable);
        execute(scheduledFutureImplNewTaskFor);
        return scheduledFutureImplNewTaskFor;
    }
}
