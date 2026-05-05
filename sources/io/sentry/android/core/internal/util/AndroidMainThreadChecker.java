package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.protocol.SentryThread;
import io.sentry.util.thread.IMainThreadChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes6.dex */
public final class AndroidMainThreadChecker implements IMainThreadChecker {
    private static final AndroidMainThreadChecker instance = new AndroidMainThreadChecker();

    private AndroidMainThreadChecker() {
    }

    public static AndroidMainThreadChecker getInstance() {
        return instance;
    }

    @Override // io.sentry.util.thread.IMainThreadChecker
    public boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.IMainThreadChecker
    public boolean isMainThread(long j2) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Xd("\n\u0018\u000f\u001e\u001c\u0017\u0013] %`\u007f$%'\u001d+", (short) (C1633zX.Xd() ^ (-14816)))).getDeclaredMethod(Wg.vd("RQ]7HQS2RSQGQ", (short) (Od.Xd() ^ (-15068))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Looper) declaredMethod.invoke(null, objArr)).getThread().getId() == j2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // io.sentry.util.thread.IMainThreadChecker
    public boolean isMainThread(SentryThread sentryThread) {
        Long id = sentryThread.getId();
        return id != null && isMainThread(id.longValue());
    }

    @Override // io.sentry.util.thread.IMainThreadChecker
    public boolean isMainThread(Thread thread) {
        return isMainThread(thread.getId());
    }
}
