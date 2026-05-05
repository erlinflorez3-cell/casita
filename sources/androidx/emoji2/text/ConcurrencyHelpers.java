package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes4.dex */
class ConcurrencyHelpers {
    private static final int FONT_LOAD_TIMEOUT_SECONDS = 15;

    public static /* synthetic */ boolean $r8$lambda$mCEi04OcFi8gu0FD463twzV2nG8(Handler handler, Runnable runnable) throws Throwable {
        Object[] objArr = {runnable};
        Method method = Class.forName(C1561oA.Qd("IUJWSLF\u000fOR\f%=I>E=I", (short) (FB.Xd() ^ 5155))).getMethod(C1561oA.od("(&))", (short) (C1580rY.Xd() ^ (-23951))), Class.forName(C1593ug.zd("{s\nuC\u0003x\u0007\u0001Hm\u0012\f\r\u0001\u0003\u000e\b", (short) (OY.Xd() ^ 12639), (short) (OY.Xd() ^ 29444))));
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(handler, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private ConcurrencyHelpers() {
    }

    static ThreadPoolExecutor createBackgroundPriorityExecutor(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ConcurrencyHelpers.lambda$createBackgroundPriorityExecutor$0(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static /* synthetic */ Thread lambda$createBackgroundPriorityExecutor$0(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    static Handler mainHandlerAsync() throws Throwable {
        if (Build.VERSION.SDK_INT >= 28) {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Kd("UcZigb^)kp,Koprhv", (short) (Od.Xd() ^ (-12912)))).getDeclaredMethod(Wg.Zd("'\u0015SYXQ\u0002x/<EMg", (short) (OY.Xd() ^ 24061), (short) (OY.Xd() ^ 21568)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                return Handler28Impl.createAsync((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Object[] objArr2 = new Object[0];
        Method declaredMethod2 = Class.forName(C1561oA.Xd("KYP_]XT\u001faf\"Aefh^l", (short) (C1607wl.Xd() ^ 29049))).getDeclaredMethod(Wg.vd("PO_9NW]<PQSIW", (short) (C1499aX.Xd() ^ (-2085))), new Class[0]);
        try {
            declaredMethod2.setAccessible(true);
            return new Handler((Looper) declaredMethod2.invoke(null, objArr2));
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Deprecated
    static Executor convertHandlerToExecutor(final Handler handler) {
        Objects.requireNonNull(handler);
        return new Executor() { // from class: androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) throws Throwable {
                ConcurrencyHelpers.$r8$lambda$mCEi04OcFi8gu0FD463twzV2nG8(handler, runnable);
            }
        };
    }

    static class Handler28Impl {
        private Handler28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
