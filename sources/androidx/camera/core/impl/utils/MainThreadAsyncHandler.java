package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public final class MainThreadAsyncHandler {
    private static volatile Handler sHandler = null;

    public static Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (MainThreadAsyncHandler.class) {
            if (sHandler == null) {
                Class<?> cls = Class.forName(Wg.vd("\u0014\"\u0019(\u001e\u0019\u0015_*/j\n&')\u001f5", (short) (ZN.Xd() ^ 30283)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (Od.Xd() ^ (-22024));
                short sXd2 = (short) (Od.Xd() ^ (-12929));
                int[] iArr = new int["\u001c\u0019'~\u0012\u0019\u001dy\u001c\u001b\u001b\u000f\u001b".length()];
                QB qb = new QB("\u001c\u0019'~\u0012\u0019\u001dy\u001c\u001b\u001b\u000f\u001b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    sHandler = HandlerCompat.createAsync((Looper) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return sHandler;
    }

    private MainThreadAsyncHandler() {
    }
}
