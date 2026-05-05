package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.Od;
import yg.Xg;

/* JADX INFO: loaded from: classes4.dex */
public class WorkManagerTaskExecutor implements TaskExecutor {
    private final SerialExecutorImpl mBackgroundExecutor;
    private final Executor mMainThreadExecutor;
    final Handler mMainThreadHandler;

    public WorkManagerTaskExecutor(Executor backgroundExecutor) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd("0>5DB=9\u0004FK\u0007&JKMCQ", (short) (C1633zX.Xd() ^ (-29849)), (short) (C1633zX.Xd() ^ (-15744)))).getDeclaredMethod(Jg.Wd("\u0014s\b#<\b\u00102V\u001a\u007fwI", (short) (C1499aX.Xd() ^ (-20656)), (short) (C1499aX.Xd() ^ (-4132))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mMainThreadHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.mMainThreadExecutor = new Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
                @Override // java.util.concurrent.Executor
                public void execute(Runnable command) throws Throwable {
                    Handler handler = WorkManagerTaskExecutor.this.mMainThreadHandler;
                    Object[] objArr2 = {command};
                    Method method = Class.forName(C1561oA.ud(" ,!.*#\u001de&)b{\u0014 \u0015\u001c\u0014 ", (short) (C1499aX.Xd() ^ (-8029)))).getMethod(C1561oA.Yd("yy~\u0001", (short) (C1607wl.Xd() ^ 3230)), Class.forName(C1561oA.yd("\u0017\u000f%\u0011V\u0016\f\u001a\fSx\u001d\u000f\u0010\u0004\u0006\t\u0003", (short) (Od.Xd() ^ (-7319)))));
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            };
            this.mBackgroundExecutor = new SerialExecutorImpl(backgroundExecutor);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public SerialExecutorImpl getSerialTaskExecutor() {
        return this.mBackgroundExecutor;
    }
}
