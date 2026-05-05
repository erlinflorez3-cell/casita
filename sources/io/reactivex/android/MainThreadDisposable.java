package io.reactivex.android;

import android.os.Looper;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MainThreadDisposable implements Disposable {
    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    public static void verifyMainThread() throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("y\b~\u000e\f\u0007\u0003M\u0010\u0015Po\u0014\u0015\u0017\r\u001b", (short) (Od.Xd() ^ (-7863)))).getDeclaredMethod(Xg.qd("54D\u001e3<B!EFH>L", (short) (C1607wl.Xd() ^ 15748), (short) (C1607wl.Xd() ^ 30924)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                return;
            }
            short sXd = (short) (FB.Xd() ^ 5238);
            short sXd2 = (short) (FB.Xd() ^ 10462);
            int[] iArr = new int["\u0003\u001b|C$\u0017aA^\tip\u0011y\r6\u0012s](\t%N/CmG\u001d5h2!\u0004\u000bH\u000eyN%\n'B;\u0010\u001aW\u0017\u000f\u0018".length()];
            QB qb = new QB("\u0003\u001b|C$\u0017aA^\tip\u0011y\r6\u0012s](\t%N/CmG\u001d5h2!\u0004\u000bH\u000eyN%\n'B;\u0010\u001aW\u0017\u000f\u0018");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            throw new IllegalStateException(new String(iArr, 0, i2) + Thread.currentThread().getName());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() throws Throwable {
        if (this.unsubscribed.compareAndSet(false, true)) {
            Looper looperMyLooper = Looper.myLooper();
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(ZO.xd("y\u000fcR(\bP3\\\u000f\rL\u0001:t\u001a'", (short) (OY.Xd() ^ 22065), (short) (OY.Xd() ^ 27677))).getDeclaredMethod(C1626yg.Ud("|_X\r%\u0018Mam\u0018k|0", (short) (ZN.Xd() ^ 9485), (short) (ZN.Xd() ^ 22404)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                    onDispose();
                } else {
                    AndroidSchedulers.mainThread().scheduleDirect(new Runnable() { // from class: io.reactivex.android.MainThreadDisposable.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MainThreadDisposable.this.onDispose();
                        }
                    });
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.unsubscribed.get();
    }

    protected abstract void onDispose();
}
