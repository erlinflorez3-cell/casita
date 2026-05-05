package io.cobrowse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
final class JSONRequestExecutor {

    private static class JSONRequestExecutorSingleton {
        private static final Executor INSTANCE;

        static {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Kd("\"\u001a0\u001ci22(,n%22(;9:.8?y\u0012F43FFBFH", (short) (C1633zX.Xd() ^ (-5198)))).getDeclaredMethod(Wg.Zd("r\u0014\u0007<3$}\\6\u0011\u0006i=%\tCWnN;\u001a\u007fd", (short) (C1499aX.Xd() ^ (-19640)), (short) (C1499aX.Xd() ^ (-18190))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                INSTANCE = (ExecutorService) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private JSONRequestExecutorSingleton() {
        }
    }

    JSONRequestExecutor() {
    }

    static Executor reuse() {
        return JSONRequestExecutorSingleton.INSTANCE;
    }
}
