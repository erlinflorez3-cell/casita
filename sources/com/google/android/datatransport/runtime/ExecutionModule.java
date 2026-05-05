package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Singleton;
import yg.C1580rY;
import yg.C1607wl;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
@Module
abstract class ExecutionModule {
    ExecutionModule() {
    }

    @Provides
    @Singleton
    static Executor executor() throws Throwable {
        Class<?> cls = Class.forName(Qg.kd("E;O9\u0005KI=?\u007f4?=1B>=/7<t\u000b=)&75/11", (short) (C1580rY.Xd() ^ (-16412)), (short) (C1580rY.Xd() ^ (-32687))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 7898);
        short sXd2 = (short) (C1607wl.Xd() ^ 20806);
        int[] iArr = new int["2(9\u0014)-%)!\u000f\"+\u001d\u0018\u001ay,\u0018\u0015&$\u001e ".length()];
        QB qb = new QB("2(9\u0014)-%)!\u000f\"+\u001d\u0018\u001ay,\u0018\u0015&$\u001e ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return new SafeLoggingExecutor((ExecutorService) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
