package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ScheduledExecutorService;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.Ig;

/* JADX INFO: loaded from: classes.dex */
final class MainThreadExecutor {
    private static volatile ScheduledExecutorService sInstance = null;

    private MainThreadExecutor() {
    }

    static ScheduledExecutorService getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (MainThreadExecutor.class) {
            if (sInstance == null) {
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(Ig.wd("m'I\t\u001b@aXSI{\u0006ZVQ&Z", (short) (C1580rY.Xd() ^ (-836)))).getDeclaredMethod(EO.Od("J\u0018v1Gt(/\ngl=6", (short) (C1607wl.Xd() ^ 12752)), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    sInstance = new HandlerScheduledExecutorService(new Handler((Looper) declaredMethod.invoke(null, objArr)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return sInstance;
    }
}
