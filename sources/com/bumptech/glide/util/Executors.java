package com.bumptech.glide.util;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class Executors {
    private static final Executor MAIN_THREAD_EXECUTOR = new Executor() { // from class: com.bumptech.glide.util.Executors.1
        private final Handler handler;

        AnonymousClass1() throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(ZO.xd("D\u0011o\u0006SA9h\u0003]q|\u000fOlMm", (short) (C1633zX.Xd() ^ (-27251)), (short) (C1633zX.Xd() ^ (-6865)))).getDeclaredMethod(C1626yg.Ud("]:!{R\u007fjv<!\fV\u0004", (short) (C1633zX.Xd() ^ (-32103)), (short) (C1633zX.Xd() ^ (-8003))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) throws Throwable {
            Handler handler = this.handler;
            Class<?> cls = Class.forName(Ig.wd(" _A=h\u000ej\u001a\u0015>p3}\u0007\u0007.Nk", (short) (FB.Xd() ^ 12046)));
            Class<?>[] clsArr = {Class.forName(EO.Od(":ib,\"\u0015\u001cc~8T[\u0003\u0007wa )", (short) (ZN.Xd() ^ 18775)))};
            Object[] objArr = {runnable};
            short sXd = (short) (ZN.Xd() ^ 7970);
            int[] iArr = new int[".,//".length()];
            QB qb = new QB(".,//");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
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
    };
    private static final Executor DIRECT_EXECUTOR = new Executor() { // from class: com.bumptech.glide.util.Executors.2
        AnonymousClass2() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: com.bumptech.glide.util.Executors$1 */
    class AnonymousClass1 implements Executor {
        private final Handler handler;

        AnonymousClass1() throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(ZO.xd("D\u0011o\u0006SA9h\u0003]q|\u000fOlMm", (short) (C1633zX.Xd() ^ (-27251)), (short) (C1633zX.Xd() ^ (-6865)))).getDeclaredMethod(C1626yg.Ud("]:!{R\u007fjv<!\fV\u0004", (short) (C1633zX.Xd() ^ (-32103)), (short) (C1633zX.Xd() ^ (-8003))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) throws Throwable {
            Handler handler = this.handler;
            Class<?> cls = Class.forName(Ig.wd(" _A=h\u000ej\u001a\u0015>p3}\u0007\u0007.Nk", (short) (FB.Xd() ^ 12046)));
            Class<?>[] clsArr = {Class.forName(EO.Od(":ib,\"\u0015\u001cc~8T[\u0003\u0007wa )", (short) (ZN.Xd() ^ 18775)))};
            Object[] objArr = {runnable};
            short sXd = (short) (ZN.Xd() ^ 7970);
            int[] iArr = new int[".,//".length()];
            QB qb = new QB(".,//");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
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
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.Executors$2 */
    class AnonymousClass2 implements Executor {
        AnonymousClass2() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private Executors() {
    }

    public static Executor directExecutor() {
        return DIRECT_EXECUTOR;
    }

    public static Executor mainThreadExecutor() {
        return MAIN_THREAD_EXECUTOR;
    }

    public static void shutdownAndAwaitTermination(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            if (executorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, TimeUnit.SECONDS)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e2) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e2);
        }
    }
}
