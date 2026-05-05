package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public final class AndroidSchedulers {
    private static final Scheduler MAIN_THREAD = RxAndroidPlugins.initMainThreadScheduler(new Callable<Scheduler>() { // from class: io.reactivex.android.schedulers.AndroidSchedulers.1
        AnonymousClass1() {
        }

        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return MainHolder.DEFAULT;
        }
    });

    /* JADX INFO: renamed from: io.reactivex.android.schedulers.AndroidSchedulers$1 */
    static class AnonymousClass1 implements Callable<Scheduler> {
        AnonymousClass1() {
        }

        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return MainHolder.DEFAULT;
        }
    }

    private static final class MainHolder {
        static final Scheduler DEFAULT;

        static {
            Class<?> cls = Class.forName(Ig.wd("\u000fm5'|2EF5\rME6@%w\\", (short) (C1580rY.Xd() ^ (-14074))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-31370));
            int[] iArr = new int["q6YX\u0017K\u001c\u0011\u007fSR%\u0002".length()];
            QB qb = new QB("q6YX\u0017K\u001c\u0011\u007fSR%\u0002");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                DEFAULT = new HandlerScheduler(new Handler((Looper) declaredMethod.invoke(null, objArr)), false);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private MainHolder() {
        }
    }

    private AndroidSchedulers() {
        throw new AssertionError("No instances.");
    }

    public static Scheduler from(Looper looper) {
        return from(looper, false);
    }

    public static Scheduler from(Looper looper, boolean z2) {
        if (looper != null) {
            return new HandlerScheduler(new Handler(looper), z2);
        }
        throw new NullPointerException("looper == null");
    }

    public static Scheduler mainThread() {
        return RxAndroidPlugins.onMainThreadScheduler(MAIN_THREAD);
    }
}
