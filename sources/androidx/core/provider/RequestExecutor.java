package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import io.sentry.ProfilingTraceData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
class RequestExecutor {
    private RequestExecutor() {
    }

    static <T> void execute(Executor executor, Callable<T> callable, Consumer<T> consumer) {
        executor.execute(new ReplyRunnable(CalleeHandler.create(), callable, consumer));
    }

    static <T> T submit(ExecutorService executorService, Callable<T> callable, int i2) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException unused) {
            throw new InterruptedException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        }
    }

    static ThreadPoolExecutor createDefaultExecutor(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor createHandlerExecutor(Handler handler) {
        return new HandlerExecutor(handler);
    }

    private static class HandlerExecutor implements Executor {
        private final Handler mHandler;

        HandlerExecutor(Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) throws Throwable {
            Handler handler = this.mHandler;
            Runnable runnable2 = (Runnable) Preconditions.checkNotNull(runnable);
            Class<?> cls = Class.forName(ZO.xd("\u000e\u001c(\u001d*}\"X{\u0016m\u0018;ic\u0019\u0003%", (short) (C1499aX.Xd() ^ (-24884)), (short) (C1499aX.Xd() ^ (-30247))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (OY.Xd() ^ 21428);
            short sXd2 = (short) (OY.Xd() ^ 11181);
            int[] iArr = new int["B\u007fP\u001a9AS\u0017~WoI\u0005\u001d'\u001b^J".length()];
            QB qb = new QB("B\u007fP\u001a9AS\u0017~WoI\u0005\u001d'\u001b^J");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {runnable2};
            Method method = cls.getMethod(Ig.wd("t;M\u0003", (short) (FB.Xd() ^ 4534)), clsArr);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(handler, objArr)).booleanValue()) {
                    throw new RejectedExecutionException(this.mHandler + EO.Od("72.7\u001bl\u001a\u0019s9<\u0017\u001el\u007ff\u0002", (short) (C1633zX.Xd() ^ (-19798))));
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static class ReplyRunnable<T> implements Runnable {
        private Callable<T> mCallable;
        private Consumer<T> mConsumer;
        private Handler mHandler;

        ReplyRunnable(Handler handler, Callable<T> callable, Consumer<T> consumer) {
            this.mCallable = callable;
            this.mConsumer = consumer;
            this.mHandler = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            T tCall;
            try {
                tCall = this.mCallable.call();
            } catch (Exception unused) {
                tCall = null;
            }
            Consumer<T> consumer = this.mConsumer;
            Handler handler = this.mHandler;
            Object[] objArr = {new Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                final /* synthetic */ Consumer val$consumer;
                final /* synthetic */ Object val$result;

                AnonymousClass1(Consumer consumer2, Object tCall2) {
                    consumer = consumer2;
                    obj = tCall2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    consumer.accept(obj);
                }
            }};
            Method method = Class.forName(C1561oA.Qd("]i^kg`Z#cf 9Q]RYQ]", (short) (C1633zX.Xd() ^ (-16959)))).getMethod(C1561oA.od("~|\u007f\u007f", (short) (Od.Xd() ^ (-2845))), Class.forName(C1593ug.zd("\u001b\u0013)\u0015b\"\u0018& g\r1+, \"-'", (short) (C1633zX.Xd() ^ (-30943)), (short) (C1633zX.Xd() ^ (-14693)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.RequestExecutor$ReplyRunnable$1 */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ Consumer val$consumer;
            final /* synthetic */ Object val$result;

            AnonymousClass1(Consumer consumer2, Object tCall2) {
                consumer = consumer2;
                obj = tCall2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                consumer.accept(obj);
            }
        }
    }

    private static class DefaultThreadFactory implements ThreadFactory {
        private int mPriority;
        private String mThreadName;

        DefaultThreadFactory(String str, int i2) {
            this.mThreadName = str;
            this.mPriority = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.mThreadName, this.mPriority);
        }

        private static class ProcessPriorityThread extends Thread {
            private final int mPriority;

            ProcessPriorityThread(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.mPriority = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.mPriority);
                super.run();
            }
        }
    }
}
