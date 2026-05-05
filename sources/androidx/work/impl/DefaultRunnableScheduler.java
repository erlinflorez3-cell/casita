package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultRunnableScheduler implements RunnableScheduler {
    private final Handler mHandler;

    public DefaultRunnableScheduler() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.yd("AOBQKF>\tGL\u0004#CDB8b", (short) (FB.Xd() ^ 26621))).getDeclaredMethod(C1561oA.Yd("zy\ncx\u0002\bf\u000b\f\u000e\u0004\u0012", (short) (C1633zX.Xd() ^ (-13327))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mHandler = HandlerCompat.createAsync((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public DefaultRunnableScheduler(Handler handler) {
        this.mHandler = handler;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long delayInMillis, Runnable runnable) throws Throwable {
        Handler handler = this.mHandler;
        Class<?> cls = Class.forName(Xg.qd("gul{ytp;}\u0003>Ys\u0002x\u0002{\n", (short) (C1633zX.Xd() ^ (-32265)), (short) (C1633zX.Xd() ^ (-20662))));
        Class<?>[] clsArr = {Class.forName(Jg.Wd("I\u0013u3O`#\u000bKdND\u0015o0\u0004M\u0019", (short) (C1633zX.Xd() ^ (-26223)), (short) (C1633zX.Xd() ^ (-31894)))), Long.TYPE};
        Object[] objArr = {runnable, Long.valueOf(delayInMillis)};
        short sXd = (short) (Od.Xd() ^ (-4410));
        short sXd2 = (short) (Od.Xd() ^ (-28698));
        int[] iArr = new int["z0|;WT=6\bM_".length()];
        QB qb = new QB("z0|;WT=6\bM_");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }
}
