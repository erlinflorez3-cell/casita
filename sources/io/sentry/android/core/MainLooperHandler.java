package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.Qg;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
final class MainLooperHandler {
    private final Handler handler;

    /* JADX WARN: Illegal instructions before constructor call */
    MainLooperHandler() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("\\h]jf_Y\"be\u001f<^]]Q]", (short) (C1633zX.Xd() ^ (-28456)), (short) (C1633zX.Xd() ^ (-3580)))).getDeclaredMethod(hg.Vd("c`nFY`dAcbbVb", (short) (Od.Xd() ^ (-27002)), (short) (Od.Xd() ^ (-26300))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    MainLooperHandler(Looper looper) {
        this.handler = new Handler(looper);
    }

    public Thread getThread() {
        return this.handler.getLooper().getThread();
    }

    public void post(Runnable runnable) throws Throwable {
        Handler handler = this.handler;
        Object[] objArr = {runnable};
        Method method = Class.forName(C1561oA.ud("iujwslf/or,E]i^e]i", (short) (C1580rY.Xd() ^ (-21998)))).getMethod(C1561oA.Yd("ggln", (short) (Od.Xd() ^ (-12899))), Class.forName(C1561oA.yd("QI_K\u0019XN\\V\u001eCgabVXC=", (short) (C1607wl.Xd() ^ 14538))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
