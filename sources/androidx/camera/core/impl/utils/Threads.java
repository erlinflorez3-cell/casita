package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public final class Threads {
    private static final long TIMEOUT_RUN_ON_MAIN_MS = 30000;

    private Threads() {
    }

    public static boolean isMainThread() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd("-;2A?:6\u0001CH\u0004#GHJ@N", (short) (C1580rY.Xd() ^ (-28781)), (short) (C1580rY.Xd() ^ (-28392)))).getDeclaredMethod(Jg.Wd("6T\u001e8\u0007\u0011\u0010oK/*_(", (short) (ZN.Xd() ^ 3741), (short) (ZN.Xd() ^ 11070)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Looper) declaredMethod.invoke(null, objArr)).getThread() == Thread.currentThread();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static void checkMainThread() {
        Preconditions.checkState(isMainThread(), "Not in application's main thread");
    }

    public static void checkBackgroundThread() {
        Preconditions.checkState(isBackgroundThread(), "In application's main thread");
    }

    public static void runOnMain(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        Handler mainHandler = getMainHandler();
        Class<?> cls = Class.forName(ZO.xd("\u001b0wA\u0012ZOF\u0001}[\n\u000b/L\u001a&\u0011", (short) (OY.Xd() ^ 7526), (short) (OY.Xd() ^ 19641)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 29647);
        short sXd2 = (short) (ZN.Xd() ^ 29725);
        int[] iArr = new int["5QM&,\u000fM_2Tnv\u001aR7GZ\u001b".length()];
        QB qb = new QB("5QM&,\u000fM_2Tnv\u001aR7GZ\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(Ig.wd("P\u007fqW", (short) (C1499aX.Xd() ^ (-29090))), clsArr);
        try {
            method.setAccessible(true);
            Preconditions.checkState(((Boolean) method.invoke(mainHandler, objArr)).booleanValue(), EO.Od("V!B_*o\u0012/hY$Iwv\u001e\u0015<\u0007|-s-\r]O\u001bm;\u001a", (short) (OY.Xd() ^ 11676)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void runOnMainSync(final Runnable runnable) throws Throwable {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Handler mainHandler = getMainHandler();
        Runnable runnable2 = new Runnable() { // from class: androidx.camera.core.impl.utils.Threads$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Threads.lambda$runOnMainSync$0(runnable, countDownLatch);
            }
        };
        short sXd = (short) (C1499aX.Xd() ^ (-20424));
        int[] iArr = new int["nzo|xqk4tw1Jbncjbn".length()];
        QB qb = new QB("nzo|xqk4tw1Jbncjbn");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {runnable2};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("zx{{", (short) (OY.Xd() ^ 13546)), Class.forName(C1593ug.zd("yq\bsA\u0001v\u0005~Fk\u0010\n\u000b~\u0001\f\u0006", (short) (C1580rY.Xd() ^ (-23974)), (short) (C1580rY.Xd() ^ (-10055)))));
        try {
            method.setAccessible(true);
            Preconditions.checkState(((Boolean) method.invoke(mainHandler, objArr)).booleanValue(), C1561oA.Kd("\u00160$&1+f<8i;;@BnD@q@5>DvLAL@=A", (short) (C1607wl.Xd() ^ 30995)));
            try {
                if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                } else {
                    throw new IllegalStateException(Wg.Zd("U\u0015\u0006i\\\u000f;S\u00107TV-aXl(H|i\bJ'\u001e|e\u0011y,+\u0001++S4fR", (short) (OY.Xd() ^ 10184), (short) (OY.Xd() ^ 31570)));
                }
            } catch (InterruptedException e2) {
                throw new InterruptedRuntimeException(e2);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static /* synthetic */ void lambda$runOnMainSync$0(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    private static Handler getMainHandler() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.yd("ftgvxsk6lq)Hpqoeg", (short) (C1633zX.Xd() ^ (-16655)))).getDeclaredMethod(C1561oA.Yd("\u0014\u0013#|\u0012\u001b!\u007f$%'\u001d+", (short) (C1633zX.Xd() ^ (-20732))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
