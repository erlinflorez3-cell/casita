package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public enum UiExecutor implements Executor {
    INSTANCE;

    private static final Handler HANDLER;

    static {
        Class<?> cls = Class.forName(ZO.xd("}u\u0018h+5\u001b\"\u000fz;I7|x9f", (short) (C1580rY.Xd() ^ (-495)), (short) (C1580rY.Xd() ^ (-12495))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 1788);
        short sXd2 = (short) (FB.Xd() ^ 2738);
        int[] iArr = new int["\u001f\u001fl\u0012\u0012;]^\u000bn7&8".length()];
        QB qb = new QB("\u001f\u001fl\u0012\u0012;]^\u000bn7&8");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            HANDLER = new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) throws Throwable {
        Handler handler = HANDLER;
        short sXd = (short) (C1607wl.Xd() ^ 22010);
        int[] iArr = new int["\u000fl2'\u0002\u001eC3%,j`.+'\fGL".length()];
        QB qb = new QB("\u000fl2'\u0002\u001eC3%,j`.+'\fGL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = {runnable};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("\u0019\u0017\u001a\u001a", (short) (C1633zX.Xd() ^ (-27190))), Class.forName(EO.Od("\u00117.}JMj\bSj%2YK>&Tc", (short) (OY.Xd() ^ 19595))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
