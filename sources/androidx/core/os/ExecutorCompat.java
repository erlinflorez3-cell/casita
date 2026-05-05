package androidx.core.os;

import android.os.Handler;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorCompat {
    public static Executor create(Handler handler) {
        return new HandlerExecutor(handler);
    }

    private ExecutorCompat() {
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
            Class<?> cls = Class.forName(C1561oA.od("`lanjc]&fi#<T`U\\T`", (short) (C1580rY.Xd() ^ (-9409))));
            Class<?>[] clsArr = {Class.forName(C1561oA.Kd("\u0010\b\u001e\nW\u0017\r\u001b\u0015\\\u0002& !\u0015\u0017\"\u001c", (short) (C1633zX.Xd() ^ (-32688))))};
            Object[] objArr = {runnable2};
            short sXd = (short) (Od.Xd() ^ (-31465));
            short sXd2 = (short) (Od.Xd() ^ (-24628));
            int[] iArr = new int["\f^v\u0004".length()];
            QB qb = new QB("\f^v\u0004");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(handler, objArr)).booleanValue()) {
                    throw new RejectedExecutionException(this.mHandler + C1561oA.Xd("Y$/\\1'556,2,e+7@8", (short) (FB.Xd() ^ 30905)));
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
