package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
final class HandlerScheduledExecutorService extends AbstractExecutorService implements ScheduledExecutorService {
    private static ThreadLocal<ScheduledExecutorService> sThreadLocalInstance = new ThreadLocal<ScheduledExecutorService>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.1
        @Override // java.lang.ThreadLocal
        public ScheduledExecutorService initialValue() throws Throwable {
            Looper looperMyLooper = Looper.myLooper();
            short sXd = (short) (C1580rY.Xd() ^ (-13019));
            int[] iArr = new int["O[P]YRL\u0015UX\u0012/QPPDP".length()];
            QB qb = new QB("O[P]YRL\u0015UX\u0012/QPPDP");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (C1499aX.Xd() ^ (-32367));
            int[] iArr2 = new int["\u0018\u0015'~\u000e\u0015\u001dy\u0018\u0017\u001b\u000f\u0017".length()];
            QB qb2 = new QB("\u0018\u0015'~\u000e\u0015\u001dy\u0018\u0017\u001b\u000f\u0017");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                    return CameraXExecutors.mainThreadExecutor();
                }
                if (Looper.myLooper() != null) {
                    return new HandlerScheduledExecutorService(new Handler(Looper.myLooper()));
                }
                return null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    };
    private final Handler mHandler;

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    HandlerScheduledExecutorService(Handler handler) {
        this.mHandler = handler;
    }

    static ScheduledExecutorService currentThreadExecutor() {
        ScheduledExecutorService scheduledExecutorService = sThreadLocalInstance.get();
        if (scheduledExecutorService == null) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("Current thread has no looper!");
            }
            HandlerScheduledExecutorService handlerScheduledExecutorService = new HandlerScheduledExecutorService(new Handler(looperMyLooper));
            sThreadLocalInstance.set(handlerScheduledExecutorService);
            return handlerScheduledExecutorService;
        }
        return scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, long j2, TimeUnit timeUnit) {
        return schedule(new Callable<Void>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.2
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        }, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) throws Throwable {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j2, timeUnit);
        HandlerScheduledFuture handlerScheduledFuture = new HandlerScheduledFuture(this.mHandler, jUptimeMillis, callable);
        Handler handler = this.mHandler;
        Class<?> cls = Class.forName(Wg.vd("Zf[hd]W `c\u001d6NZOVnz", (short) (C1580rY.Xd() ^ (-24303))));
        Class<?>[] clsArr = {Class.forName(Qg.kd("\u001b\u0011%\u000fZ\u0018\f\u0018\u0010Ux\u001b\u0013\u0012\u0004\u0004\r\u0005", (short) (C1580rY.Xd() ^ (-25098)), (short) (C1580rY.Xd() ^ (-8791)))), Long.TYPE};
        Object[] objArr = {handlerScheduledFuture, Long.valueOf(jUptimeMillis)};
        Method method = cls.getMethod(hg.Vd("\" ##n!\u007f\u0014\u0017\u000e", (short) (FB.Xd() ^ 23173), (short) (FB.Xd() ^ 10669)), clsArr);
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(handler, objArr)).booleanValue() ? handlerScheduledFuture : Futures.immediateFailedScheduledFuture(createPostFailedException());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) throws Throwable {
        Handler handler = this.mHandler;
        Object[] objArr = {runnable};
        Method method = Class.forName(C1561oA.Kd("]kbqojf1sx4Oiwnwq\u007f", (short) (C1499aX.Xd() ^ (-9318)))).getMethod(C1561oA.Xd("WW\\^", (short) (Od.Xd() ^ (-23891))), Class.forName(Wg.Zd("VQzJ4B<b/#\u0015?U'=\u0013;3", (short) (C1607wl.Xd() ^ 19727), (short) (C1607wl.Xd() ^ 18167))));
        try {
            method.setAccessible(true);
            if (!((Boolean) method.invoke(handler, objArr)).booleanValue()) {
                throw createPostFailedException();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private RejectedExecutionException createPostFailedException() {
        return new RejectedExecutionException(this.mHandler + " is shutting down");
    }

    private static class HandlerScheduledFuture<V> implements RunnableScheduledFuture<V> {
        final AtomicReference<CallbackToFutureAdapter.Completer<V>> mCompleter = new AtomicReference<>(null);
        private final ListenableFuture<V> mDelegate;
        private final long mRunAtMillis;
        private final Callable<V> mTask;

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        HandlerScheduledFuture(final Handler handler, long j2, final Callable<V> callable) {
            this.mRunAtMillis = j2;
            this.mTask = callable;
            this.mDelegate = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<V>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public Object attachCompleter(CallbackToFutureAdapter.Completer<V> completer) throws RejectedExecutionException {
                    completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (HandlerScheduledFuture.this.mCompleter.getAndSet(null) != null) {
                                handler.removeCallbacks(HandlerScheduledFuture.this);
                            }
                        }
                    }, CameraXExecutors.directExecutor());
                    HandlerScheduledFuture.this.mCompleter.set(completer);
                    return "HandlerScheduledFuture-" + callable.toString();
                }
            });
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.mRunAtMillis - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed delayed) {
            return Long.compare(getDelay(TimeUnit.MILLISECONDS), delayed.getDelay(TimeUnit.MILLISECONDS));
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            CallbackToFutureAdapter.Completer andSet = this.mCompleter.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.set(this.mTask.call());
                } catch (Exception e2) {
                    andSet.setException(e2);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z2) {
            return this.mDelegate.cancel(z2);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.mDelegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.mDelegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return this.mDelegate.get();
        }

        @Override // java.util.concurrent.Future
        public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.mDelegate.get(j2, timeUnit);
        }
    }
}
