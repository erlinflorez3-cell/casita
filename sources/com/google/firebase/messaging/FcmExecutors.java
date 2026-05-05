package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.threads.PoolableExecutors;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
class FcmExecutors {
    private static final String THREAD_FILE = "Firebase-Messaging-File";
    static final String THREAD_FILE_IO = "Firebase-Messaging-File-Io";
    private static final String THREAD_INIT = "Firebase-Messaging-Init";
    private static final String THREAD_INTENT_HANDLE = "Firebase-Messaging-Intent-Handle";
    private static final String THREAD_NETWORK_IO = "Firebase-Messaging-Network-Io";
    static final String THREAD_RPC_TASK = "Firebase-Messaging-Rpc-Task";
    private static final String THREAD_TASK = "Firebase-Messaging-Task";
    private static final String THREAD_TOPICS_IO = "Firebase-Messaging-Topics-Io";

    private FcmExecutors() {
    }

    private static Executor newCachedSingleThreadExecutor(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    static ExecutorService newFileExecutor() throws Throwable {
        Object[] objArr = {new NamedThreadFactory(EO.Od("rFC\u0014qNzm\u0011r\u000btD>Z<fon.\r=\u0012", (short) (OY.Xd() ^ 31593)))};
        Method declaredMethod = Class.forName(C1561oA.Qd("\u0011\u0007\u001b\u0005P\u0017\u0015\t\u000bK\u007f\u000b\t|\u000e\n\tz\u0003\b@V\ttq\u0003\u0001z||", (short) (ZN.Xd() ^ 13762))).getDeclaredMethod(C1561oA.od("\u0019\u000f z\u0010\u0014\f\u0010\bu\t\u0012\u0004~\u0001`\u0013~{\r\u000b\u0005\u0007", (short) (Od.Xd() ^ (-16575))), Class.forName(C1593ug.zd("\u0004{\u0012}K\u0014\u0014\n\u000eP\u0007\u0014\u0014\n\u001d\u001b\u001c\u0010\u001a![\u0003\u0018#\u0017\u0014\u0018z\u0017\u001a,(,4", (short) (C1607wl.Xd() ^ 7760), (short) (C1607wl.Xd() ^ 2533))));
        try {
            declaredMethod.setAccessible(true);
            return (ExecutorService) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static Executor newFileIOExecutor() {
        return newCachedSingleThreadExecutor(THREAD_FILE_IO);
    }

    static ScheduledExecutorService newInitExecutor() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(THREAD_INIT));
    }

    static ExecutorService newIntentHandleExecutor() {
        return PoolableExecutors.factory().newSingleThreadExecutor(new NamedThreadFactory(THREAD_INTENT_HANDLE), ThreadPriority.HIGH_SPEED);
    }

    static ExecutorService newNetworkIOExecutor() throws Throwable {
        Object[] objArr = {new NamedThreadFactory(C1561oA.Kd("s\u0018\"\u0016\u0014\u0014'\u001ab\u0004\u001d,-\u001c#&,&l\u000f'7;482t\u00129", (short) (C1633zX.Xd() ^ (-20570))))};
        Method declaredMethod = Class.forName(Wg.Zd("uLn\u000fvS?Ik\u001be\r\u0002\u0004Kgt\u001dA\\CoB\u001b.\u001cPXPp", (short) (FB.Xd() ^ 17836), (short) (FB.Xd() ^ 11759))).getDeclaredMethod(Wg.vd("\u0005|\u0010l\u0004\n\u0004\nscx\u0004wtxZ\u001f\r\f\u001f\u001f\u001b\u001f", (short) (C1580rY.Xd() ^ (-7498))), Class.forName(C1561oA.Xd("RJ`L\u001abbX\\\u001fUbbXkij^ho*QfqebfIehzvz\u0003", (short) (ZN.Xd() ^ 15507))));
        try {
            declaredMethod.setAccessible(true);
            return (ExecutorService) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static Executor newRpcTasksExecutor() {
        return newCachedSingleThreadExecutor(THREAD_RPC_TASK);
    }

    static ExecutorService newTaskExecutor() throws Throwable {
        Object[] objArr = {new NamedThreadFactory(Qg.kd("\u000e08*&$5&l\f#0/\u001c!\"&\u001eb\t\u0015&\u001d", (short) (C1607wl.Xd() ^ 26219), (short) (C1607wl.Xd() ^ 10017)))};
        Method declaredMethod = Class.forName(hg.Vd("NDXB\u000eTRFH\t=HF:KGF8@E}\u0014F2/@>8::", (short) (FB.Xd() ^ 107), (short) (FB.Xd() ^ 1341))).getDeclaredMethod(C1561oA.yd("#\u001b.\u000b\u001a \u001a \"\u0012'2\u001e\u001b\u001f\u0001\u001d\u000b\n\u001d\u0015\u0011\u0015", (short) (C1580rY.Xd() ^ (-1035))), Class.forName(C1561oA.ud("3)='r97+-m\"-+\u001f0,+\u001d%*b\b\u001b$\u0016\u0011\u0013s\u000e\u000f\u001f\u0019\u001b!", (short) (C1580rY.Xd() ^ (-31689)))));
        try {
            declaredMethod.setAccessible(true);
            return (ExecutorService) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static ScheduledExecutorService newTopicsSyncExecutor() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(THREAD_TOPICS_IO));
    }
}
