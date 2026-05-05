package androidx.camera.core.impl.utils.executor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import yg.C1499aX;
import yg.C1561oA;
import yg.Od;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
final class HighPriorityExecutor implements Executor {
    private static volatile Executor sExecutor = null;
    private final ExecutorService mHighPriorityService;

    HighPriorityExecutor() throws Throwable {
        Object[] objArr = {new ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.HighPriorityExecutor.1
            private static final String THREAD_NAME = "CameraX-camerax_high_priority";

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName(THREAD_NAME);
                return thread;
            }
        }};
        Method declaredMethod = Class.forName(hg.Vd("RH\\F\u0012XVJL\rALJ>OKJ<DI\u0002\u0018J63DB<>>", (short) (Od.Xd() ^ (-6900)), (short) (Od.Xd() ^ (-13059)))).getDeclaredMethod(C1561oA.yd("A7H#8<480\u001e1:,')\t[GDUSMO", (short) (Od.Xd() ^ (-2726))), Class.forName(C1561oA.ud(":0D.y@>24t)42&732$,1i\u000f\"+\u001d\u0018\u001az\u0015\u0016& \"(", (short) (C1499aX.Xd() ^ (-9142)))));
        try {
            declaredMethod.setAccessible(true);
            this.mHighPriorityService = (ExecutorService) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (HighPriorityExecutor.class) {
            if (sExecutor == null) {
                sExecutor = new HighPriorityExecutor();
            }
        }
        return sExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.mHighPriorityService.execute(runnable);
    }
}
