package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class zzu implements Executor {
    private final Handler zza;

    public zzu() throws Throwable {
        Class<?> cls = Class.forName(C1561oA.od("?K@MIB<\u0005EH\u0002\u001fA@@4@", (short) (C1580rY.Xd() ^ (-1393))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-25169));
        int[] iArr = new int["\u0004\u0003\u0013l\u0002\u000b\u0011o\u0014\u0015\u0017\r\u001b".length()];
        QB qb = new QB("\u0004\u0003\u0013l\u0002\u000b\u0011o\u0014\u0015\u0017\r\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            this.zza = new com.google.android.gms.internal.tasks.zza((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws Throwable {
        Handler handler = this.zza;
        Class<?> cls = Class.forName(Wg.Zd("\u007f\u0001d`KO8q~v=GNEI?FG", (short) (Od.Xd() ^ (-21189)), (short) (Od.Xd() ^ (-29289))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1633zX.Xd() ^ (-14692));
        int[] iArr = new int["}u\fwE\u0005z\t\u0003Jo\u0014\u000e\u000f\u0003\u0005\u0010\n".length()];
        QB qb = new QB("}u\fwE\u0005z\t\u0003Jo\u0014\u000e\u000f\u0003\u0005\u0010\n");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(Wg.vd("5568", (short) (ZN.Xd() ^ 11233)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
