package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieThreadFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes.dex */
public class LottieTask<T> {
    static final String DIRECT_EXECUTOR_PROPERTY_NAME = "lottie.testing.directExecutor";
    public static Executor EXECUTOR = null;
    private final Set<LottieListener<Throwable>> failureListeners;
    private final Handler handler;
    private volatile LottieResult<T> result;
    private final Set<LottieListener<T>> successListeners;

    private static class LottieFutureTask<T> extends FutureTask<LottieResult<T>> {
        private LottieTask<T> lottieTask;

        LottieFutureTask(LottieTask<T> lottieTask, Callable<LottieResult<T>> callable) {
            super(callable);
            this.lottieTask = lottieTask;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.lottieTask.setResult(get());
                } catch (InterruptedException | ExecutionException e2) {
                    this.lottieTask.setResult(new LottieResult(e2));
                }
            } finally {
                this.lottieTask = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty(DIRECT_EXECUTOR_PROPERTY_NAME))) {
            EXECUTOR = new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0();
        } else {
            EXECUTOR = Executors.newCachedThreadPool(new LottieThreadFactory());
        }
    }

    public LottieTask(T t2) throws Throwable {
        this.successListeners = new LinkedHashSet(1);
        this.failureListeners = new LinkedHashSet(1);
        short sXd = (short) (C1633zX.Xd() ^ (-29641));
        int[] iArr = new int["\u000e\u001c\u0013\"\u0018\u0013\u000fY\u0014\u0019Ts\u0010\u0011\u0013\t\u000f".length()];
        QB qb = new QB("\u000e\u001c\u0013\"\u0018\u0013\u000fY\u0014\u0019Ts\u0010\u0011\u0013\t\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Yd("lk{UjsyX|}\u007fu\u0004", (short) (C1499aX.Xd() ^ (-8884))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.result = null;
            setResult(new LottieResult<>(t2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    LottieTask(Callable<LottieResult<T>> callable, boolean z2) throws Throwable {
        this.successListeners = new LinkedHashSet(1);
        this.failureListeners = new LinkedHashSet(1);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd("\f\u001a\u0011 \u001e\u0019\u0015_\"'b\u0002&')\u001f-", (short) (OY.Xd() ^ 3417), (short) (OY.Xd() ^ 25695))).getDeclaredMethod(Jg.Wd("_lB\u0003&\u001di\"P\u001c\b\b|", (short) (C1580rY.Xd() ^ (-12596)), (short) (C1580rY.Xd() ^ (-21642))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.result = null;
            if (!z2) {
                EXECUTOR.execute(new LottieFutureTask(this, callable));
                return;
            }
            try {
                setResult(callable.call());
            } catch (Throwable th) {
                setResult(new LottieResult<>(th));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private synchronized void notifyFailureListeners(Throwable th) {
        ArrayList arrayList = new ArrayList(this.failureListeners);
        if (arrayList.isEmpty()) {
            Logger.warning("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LottieListener) it.next()).onResult(th);
        }
    }

    private void notifyListeners() throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        short sXd = (short) (OY.Xd() ^ 16544);
        short sXd2 = (short) (OY.Xd() ^ 4283);
        int[] iArr = new int[";\u0001c]Pi!\tkQJ\u000fl\u0002i !".length()];
        QB qb = new QB(";\u0001c]Pi!\tkQJ\u000fl\u0002i !");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1626yg.Ud("\u000f1eJ\u0010|B\u0016\f\u0011\"RE", (short) (C1607wl.Xd() ^ 20021), (short) (C1607wl.Xd() ^ 32372)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                notifyListenersInternal();
                return;
            }
            Handler handler = this.handler;
            Runnable runnable = new Runnable() { // from class: com.airbnb.lottie.LottieTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.notifyListenersInternal();
                }
            };
            short sXd3 = (short) (Od.Xd() ^ (-29545));
            int[] iArr2 = new int["U;?h=Z5v]\u0011M\u0006PSa\u000b_V".length()];
            QB qb2 = new QB("U;?h=Z5v]\u0011M\u0006PSa\u000b_V");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = {Class.forName(EO.Od("w@gq_K\f)l\u0018:;\u0003|G'\u0006\u0001", (short) (C1580rY.Xd() ^ (-14788))))};
            Object[] objArr2 = {runnable};
            short sXd4 = (short) (OY.Xd() ^ 10409);
            int[] iArr3 = new int["jhkk".length()];
            QB qb3 = new QB("jhkk");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void notifyListenersInternal() {
        LottieResult<T> lottieResult = this.result;
        if (lottieResult == null) {
            return;
        }
        if (lottieResult.getValue() != null) {
            notifySuccessListeners(lottieResult.getValue());
        } else {
            notifyFailureListeners(lottieResult.getException());
        }
    }

    private synchronized void notifySuccessListeners(T t2) {
        Iterator it = new ArrayList(this.successListeners).iterator();
        while (it.hasNext()) {
            ((LottieListener) it.next()).onResult(t2);
        }
    }

    public void setResult(LottieResult<T> lottieResult) throws Throwable {
        if (this.result != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.result = lottieResult;
        notifyListeners();
    }

    public synchronized LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
        LottieResult<T> lottieResult = this.result;
        if (lottieResult != null && lottieResult.getException() != null) {
            lottieListener.onResult(lottieResult.getException());
        }
        this.failureListeners.add(lottieListener);
        return this;
    }

    public synchronized LottieTask<T> addListener(LottieListener<T> lottieListener) {
        LottieResult<T> lottieResult = this.result;
        if (lottieResult != null && lottieResult.getValue() != null) {
            lottieListener.onResult(lottieResult.getValue());
        }
        this.successListeners.add(lottieListener);
        return this;
    }

    public LottieResult<T> getResult() {
        return this.result;
    }

    public synchronized LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
        this.failureListeners.remove(lottieListener);
        return this;
    }

    public synchronized LottieTask<T> removeListener(LottieListener<T> lottieListener) {
        this.successListeners.remove(lottieListener);
        return this;
    }
}
