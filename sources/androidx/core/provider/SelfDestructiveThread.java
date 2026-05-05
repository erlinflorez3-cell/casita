package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import io.sentry.ProfilingTraceData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private final int mDestructAfterMillisec;
    private Handler mHandler;
    private final int mPriority;
    private HandlerThread mThread;
    private final String mThreadName;
    private final Object mLock = new Object();
    private Handler.Callback mCallback = new Handler.Callback() { // from class: androidx.core.provider.SelfDestructiveThread.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                SelfDestructiveThread.this.onDestruction();
                return true;
            }
            if (i2 != 1) {
                return true;
            }
            SelfDestructiveThread.this.onInvokeRunnable((Runnable) message.obj);
            return true;
        }
    };
    private int mGeneration = 0;

    public interface ReplyCallback<T> {
        void onReply(T t2);
    }

    public SelfDestructiveThread(String str, int i2, int i3) {
        this.mThreadName = str;
        this.mPriority = i2;
        this.mDestructAfterMillisec = i3;
    }

    public boolean isRunning() {
        boolean z2;
        synchronized (this.mLock) {
            z2 = this.mThread != null;
        }
        return z2;
    }

    public int getGeneration() {
        int i2;
        synchronized (this.mLock) {
            i2 = this.mGeneration;
        }
        return i2;
    }

    private void post(Runnable runnable) {
        synchronized (this.mLock) {
            if (this.mThread == null) {
                HandlerThread handlerThread = new HandlerThread(this.mThreadName, this.mPriority);
                this.mThread = handlerThread;
                handlerThread.start();
                this.mHandler = new Handler(this.mThread.getLooper(), this.mCallback);
                this.mGeneration++;
            }
            this.mHandler.removeMessages(0);
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> void postAndReply(final Callable<T> callable, final ReplyCallback<T> replyCallback) throws Throwable {
        final Handler handlerCreate = CalleeHandler.create();
        post(new Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                final Object objCall;
                try {
                    objCall = callable.call();
                } catch (Exception unused) {
                    objCall = null;
                }
                Handler handler = handlerCreate;
                Runnable runnable = new Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        replyCallback.onReply(objCall);
                    }
                };
                Class<?> cls = Class.forName(C1561oA.Kd("\u0007\u0015\f\u001b\u0019\u0014\u0010Z\u001d\"]x\u0013!\u0018!\u001b)", (short) (C1607wl.Xd() ^ 25268)));
                Class<?>[] clsArr = {Class.forName(Wg.Zd("\u0004l\u001avg@%Zi n\"\u00119<3ep", (short) (C1607wl.Xd() ^ 10538), (short) (C1607wl.Xd() ^ 13983)))};
                Object[] objArr = {runnable};
                short sXd = (short) (Od.Xd() ^ (-21677));
                int[] iArr = new int["uuz|".length()];
                QB qb = new QB("uuz|");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
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
        });
    }

    public <T> T postAndWait(final Callable<T> callable, int i2) throws InterruptedException {
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        post(new Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    atomicReference.set(callable.call());
                } catch (Exception unused) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    conditionNewCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        } finally {
            reentrantLock.unlock();
        }
    }

    void onInvokeRunnable(Runnable runnable) {
        runnable.run();
        synchronized (this.mLock) {
            this.mHandler.removeMessages(0);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.mDestructAfterMillisec);
        }
    }

    void onDestruction() {
        synchronized (this.mLock) {
            if (this.mHandler.hasMessages(1)) {
                return;
            }
            this.mThread.quit();
            this.mThread = null;
            this.mHandler = null;
        }
    }
}
