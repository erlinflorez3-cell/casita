package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
final class HandlerScheduler extends Scheduler {
    private final boolean async;
    private final Handler handler;

    private static final class HandlerWorker extends Scheduler.Worker {
        private final boolean async;
        private volatile boolean disposed;
        private final Handler handler;

        HandlerWorker(Handler handler, boolean z2) {
            this.handler = handler;
            this.async = z2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.handler.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.disposed) {
                return Disposables.disposed();
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(this.handler, RxJavaPlugins.onSchedule(runnable));
            Message messageObtain = Message.obtain(this.handler, scheduledRunnable);
            messageObtain.obj = this;
            if (this.async) {
                messageObtain.setAsynchronous(true);
            }
            this.handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j2));
            if (!this.disposed) {
                return scheduledRunnable;
            }
            this.handler.removeCallbacks(scheduledRunnable);
            return Disposables.disposed();
        }
    }

    private static final class ScheduledRunnable implements Runnable, Disposable {
        private final Runnable delegate;
        private volatile boolean disposed;
        private final Handler handler;

        ScheduledRunnable(Handler handler, Runnable runnable) {
            this.handler = handler;
            this.delegate = runnable;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.handler.removeCallbacks(this);
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.delegate.run();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }
    }

    HandlerScheduler(Handler handler, boolean z2) {
        this.handler = handler;
        this.async = z2;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        return new HandlerWorker(this.handler, this.async);
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j2, TimeUnit timeUnit) throws Throwable {
        if (runnable == null) {
            throw new NullPointerException(Wg.Zd("\u0011#\u001dX\u0001G0\u0006\u0017\u0014[", (short) (ZN.Xd() ^ 28622), (short) (ZN.Xd() ^ 28032)));
        }
        if (timeUnit == null) {
            throw new NullPointerException(C1561oA.Kd("+%!-Ywx\\,4,-", (short) (Od.Xd() ^ (-7752))));
        }
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(this.handler, RxJavaPlugins.onSchedule(runnable));
        Handler handler = this.handler;
        long millis = timeUnit.toMillis(j2);
        Class<?> cls = Class.forName(C1561oA.Qd("]i^kg`Z#cf 9Q]RYQ]", (short) (C1607wl.Xd() ^ 15404)));
        Class<?>[] clsArr = {Class.forName(C1593ug.zd("\u0010\b\u001e\nW\u0017\r\u001b\u0015\\\u0002& !\u0015\u0017\"\u001c", (short) (C1499aX.Xd() ^ (-6475)), (short) (C1499aX.Xd() ^ (-1175)))), Long.TYPE};
        Object[] objArr = {scheduledRunnable, Long.valueOf(millis)};
        Method method = cls.getMethod(C1561oA.od("QORR!AG;R=;", (short) (C1499aX.Xd() ^ (-2532))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            return scheduledRunnable;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
