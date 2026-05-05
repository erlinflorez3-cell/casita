package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LK implements Runnable {
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int iXd = C1580rY.Xd() ^ (1682836874 ^ (-1439113899));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Xd("0\u001ff\u000b'", (short) (FB.Xd() ^ iXd))).getDeclaredMethod(Wg.vd("bm", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69958851)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
