package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
class CalleeHandler {
    private CalleeHandler() {
    }

    static Handler create() throws Throwable {
        if (Looper.myLooper() != null) {
            return new Handler();
        }
        short sXd = (short) (Od.Xd() ^ (-304));
        int[] iArr = new int["t\u0003y\t\u0007\u0002}H\u000b\u0010Kj\u000f\u0010\u0012\b\u0016".length()];
        QB qb = new QB("t\u0003y\t\u0007\u0002}H\u000b\u0010Kj\u000f\u0010\u0012\b\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Xg.qd("*)9\u0013(17\u0016:;=3A", (short) (Od.Xd() ^ (-12303)), (short) (Od.Xd() ^ (-12880))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
