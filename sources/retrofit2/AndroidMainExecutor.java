package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes2.dex */
final class AndroidMainExecutor implements Executor {
    private final Handler handler;

    AndroidMainExecutor() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1593ug.zd("0>5DB=9\u0004FK\u0007&JKMCQ", (short) (C1607wl.Xd() ^ 26414), (short) (C1607wl.Xd() ^ 16412))).getDeclaredMethod(C1561oA.od("HES+>EI&HGG;G", (short) (C1499aX.Xd() ^ (-1173))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) throws Throwable {
        Handler handler = this.handler;
        Object[] objArr = {runnable};
        Method method = Class.forName(C1561oA.Kd("kyp\u007f}xt?\u0002\u0007B]w\u0006|\u0006\u007f\u000e", (short) (C1499aX.Xd() ^ (-13520)))).getMethod(C1561oA.Xd("qqvx", (short) (C1499aX.Xd() ^ (-4228))), Class.forName(Wg.Zd("~\u0002+\u001azE>_\\/gO\\h_t\u0003\b", (short) (Od.Xd() ^ (-26703)), (short) (Od.Xd() ^ (-21418)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
