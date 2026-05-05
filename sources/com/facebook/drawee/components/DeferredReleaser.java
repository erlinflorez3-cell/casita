package com.facebook.drawee.components;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1580rY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeferredReleaser {

    @Nullable
    private static DeferredReleaser sInstance = null;

    public interface Releasable {
        void release();
    }

    public static synchronized DeferredReleaser getInstance() {
        if (sInstance == null) {
            sInstance = new DeferredReleaserConcurrentImpl();
        }
        return sInstance;
    }

    static boolean isOnUiThread() throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-2773));
        short sXd2 = (short) (C1580rY.Xd() ^ (-29712));
        int[] iArr = new int["Y\u0014;v\u001eEqhd\u0016\u0002M\u001bHz\u001d@".length()];
        QB qb = new QB("Y\u0014;v\u001eEqhd\u0016\u0002M\u001bHz\u001d@");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Xd("PO_9NW]<`acYg", (short) (C1580rY.Xd() ^ (-16803))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Looper) declaredMethod.invoke(null, objArr)).getThread() == Thread.currentThread();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public abstract void cancelDeferredRelease(Releasable releasable);

    public abstract void scheduleDeferredRelease(Releasable releasable);
}
