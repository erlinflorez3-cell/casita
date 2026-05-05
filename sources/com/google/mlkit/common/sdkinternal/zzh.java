package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;

/* JADX INFO: loaded from: classes7.dex */
enum zzh implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws Throwable {
        Handler handler = MLTaskExecutor.getInstance().zzc;
        Object[] objArr = {runnable};
        Method method = Class.forName(EO.Od("\u001aW=1~>c6O%cU:?W;a\u0003", (short) (FB.Xd() ^ 24497))).getMethod(C1593ug.zd("88=?", (short) (C1607wl.Xd() ^ 8054), (short) (C1607wl.Xd() ^ 16512)), Class.forName(C1561oA.Qd("4*>(s1%1)n\u00124,+\u001d\u001d&\u001e", (short) (C1633zX.Xd() ^ (-760)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
