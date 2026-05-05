package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class UserManagerCompat {
    private UserManagerCompat() {
    }

    public static boolean isUserUnlocked(Context context) {
        return Api24Impl.isUserUnlocked(context);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isUserUnlocked(Context context) throws Throwable {
            Class<?> cls = Class.forName(hg.Vd("^j_lha[$XcafV^c\u001c0[Y^N`[", (short) (ZN.Xd() ^ 26599), (short) (ZN.Xd() ^ 24585)));
            Class<?>[] clsArr = {Class.forName(C1561oA.ud("xn\u0003l8uium3Gocts", (short) (FB.Xd() ^ 2065)))};
            Object[] objArr = {UserManager.class};
            short sXd = (short) (C1633zX.Xd() ^ (-30153));
            int[] iArr = new int["\b\u0007\u0017v\u0016\u0011\u0013\u0005\u0006l\u007f\u000e\u000b~y|".length()];
            QB qb = new QB("\b\u0007\u0017v\u0016\u0011\u0013\u0005\u0006l\u007f\u000e\u000b~y|");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                return ((UserManager) method.invoke(context, objArr)).isUserUnlocked();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
