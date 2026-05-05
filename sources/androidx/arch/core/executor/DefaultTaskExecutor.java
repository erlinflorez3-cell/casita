package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTaskExecutor extends TaskExecutor {
    private volatile Handler mMainHandler;
    private final Object mLock = new Object();
    private final ExecutorService mDiskIO = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: androidx.arch.core.executor.DefaultTaskExecutor.1
        private static final String THREAD_NAME_STEM = "arch_disk_io_";
        private final AtomicInteger mThreadId = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(THREAD_NAME_STEM + this.mThreadId.getAndIncrement());
            return thread;
        }
    });

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(Runnable runnable) {
        this.mDiskIO.execute(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(Runnable runnable) throws Throwable {
        if (this.mMainHandler == null) {
            synchronized (this.mLock) {
                if (this.mMainHandler == null) {
                    Class<?> cls = Class.forName(C1626yg.Ud("\u0006\u0010t\u001eSl]\u001c}Pmw1sBK\b", (short) (C1633zX.Xd() ^ (-25817)), (short) (C1633zX.Xd() ^ (-4042))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd = (short) (ZN.Xd() ^ 9977);
                    int[] iArr = new int["!{\u0017\u000eg\"\u0001=178M+".length()];
                    QB qb = new QB("!{\u0017\u000eg\"\u0001=178M+");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                        i2++;
                    }
                    Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        this.mMainHandler = createAsync((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
        Handler handler = this.mMainHandler;
        Object[] objArr2 = {runnable};
        Method method = Class.forName(EO.Od("eAKw'M\u0014lyQ\n\u0002jqO5\u0004\u0003", (short) (C1499aX.Xd() ^ (-14511)))).getMethod(C1593ug.zd("CCHJ", (short) (C1607wl.Xd() ^ 8263), (short) (C1607wl.Xd() ^ 19398)), Class.forName(C1561oA.Qd("C9M7\u0003@4@8}!C;:,,5-", (short) (FB.Xd() ^ 27829))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Jg.Wd("\u000fK848\"T\fTG}\u0013t[ZHS", (short) (C1580rY.Xd() ^ (-9946)), (short) (C1580rY.Xd() ^ (-22787)))).getDeclaredMethod(ZO.xd("9\u0019K4\u001dSEu22\u0004lw", (short) (C1499aX.Xd() ^ (-14983)), (short) (C1499aX.Xd() ^ (-5333))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Looper) declaredMethod.invoke(null, objArr)).getThread() == Thread.currentThread();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Handler createAsync(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
