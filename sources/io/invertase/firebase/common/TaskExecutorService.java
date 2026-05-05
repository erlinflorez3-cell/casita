package io.invertase.firebase.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1580rY;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class TaskExecutorService {
    private static final String KEEP_ALIVE_SECONDS_KEY = "android_task_executor_keep_alive_seconds";
    private static final String MAXIMUM_POOL_SIZE_KEY = "android_task_executor_maximum_pool_size";
    private static final Map<String, ExecutorService> executors = new HashMap();
    private final RejectedExecutionHandler executeInFallback = new RejectedExecutionHandler() { // from class: io.invertase.firebase.common.TaskExecutorService$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            this.f$0.lambda$new$0(runnable, threadPoolExecutor);
        }
    };
    private final int keepAliveSeconds;
    private final int maximumPoolSize;
    private final String name;

    TaskExecutorService(String str) {
        this.name = str;
        ReactNativeFirebaseJSON sharedInstance = ReactNativeFirebaseJSON.getSharedInstance();
        this.maximumPoolSize = sharedInstance.getIntValue(MAXIMUM_POOL_SIZE_KEY, 1);
        this.keepAliveSeconds = sharedInstance.getIntValue(KEEP_ALIVE_SECONDS_KEY, 3);
    }

    private ExecutorService getNewExecutor(boolean z2) throws Throwable {
        if (!z2) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.maximumPoolSize, this.keepAliveSeconds, TimeUnit.SECONDS, new SynchronousQueue());
            threadPoolExecutor.setRejectedExecutionHandler(this.executeInFallback);
            return threadPoolExecutor;
        }
        short sXd = (short) (ZN.Xd() ^ 9086);
        short sXd2 = (short) (ZN.Xd() ^ 22448);
        int[] iArr = new int["W\bV\u0014AEy\"u#j\u007f4D_m\u0011-\u000e@\u000bWJ=\t[/J&f".length()];
        QB qb = new QB("W\bV\u0014AEy\"u#j\u007f4D_m\u0011-\u000e@\u000bWJ=\t[/J&f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Ig.wd("m\u0017UV*rU0j~\u0013=\u0002qV~in\u0012Z\u001bO6", (short) (C1580rY.Xd() ^ (-16976))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return (ExecutorService) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        getTransactionalExecutor().execute(runnable);
    }

    public ExecutorService getExecutor() {
        return getExecutor(this.maximumPoolSize <= 1, "");
    }

    public ExecutorService getExecutor(boolean z2, String str) {
        String executorName = getExecutorName(z2, str);
        Map<String, ExecutorService> map = executors;
        synchronized (map) {
            ExecutorService executorService = map.get(executorName);
            if (executorService != null) {
                return executorService;
            }
            ExecutorService newExecutor = getNewExecutor(z2);
            map.put(executorName, newExecutor);
            return newExecutor;
        }
    }

    public String getExecutorName(boolean z2, String str) {
        return z2 ? this.name + "TransactionalExecutor" + str : this.name + "Executor" + str;
    }

    public ExecutorService getTransactionalExecutor() {
        return getExecutor(true, "");
    }

    public ExecutorService getTransactionalExecutor(String str) {
        if (this.maximumPoolSize == 0) {
            str = "";
        }
        return getExecutor(true, str);
    }

    public void removeExecutor(String str) {
        Map<String, ExecutorService> map = executors;
        synchronized (map) {
            ExecutorService executorService = map.get(str);
            if (executorService != null) {
                executorService.shutdownNow();
                map.remove(str);
            }
        }
    }

    public void shutdown() {
        Map<String, ExecutorService> map = executors;
        synchronized (map) {
            for (String str : new ArrayList(map.keySet())) {
                if (str.startsWith(this.name)) {
                    removeExecutor(str);
                } else {
                    executors.remove(str);
                }
            }
        }
    }
}
