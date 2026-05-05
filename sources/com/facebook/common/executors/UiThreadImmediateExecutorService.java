package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.Od;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class UiThreadImmediateExecutorService extends HandlerExecutorServiceImpl {

    @Nullable
    private static UiThreadImmediateExecutorService sInstance = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private UiThreadImmediateExecutorService() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(hg.Vd("\u001c(\u001d*&\u001f\u0019a\"%^{\u001e\u001d\u001d\u0011\u001d", (short) (Od.Xd() ^ (-6613)), (short) (Od.Xd() ^ (-9323)))).getDeclaredMethod(C1561oA.ud("-*8\u0010#*.\u000b-,, ,", (short) (ZN.Xd() ^ 24071)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            super(new Handler((Looper) declaredMethod.invoke(null, objArr)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static UiThreadImmediateExecutorService getInstance() {
        if (sInstance == null) {
            sInstance = new UiThreadImmediateExecutorService();
        }
        return sInstance;
    }

    @Override // com.facebook.common.executors.HandlerExecutorServiceImpl, java.util.concurrent.Executor
    public void execute(Runnable runnable) throws Throwable {
        if (isHandlerThread()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
