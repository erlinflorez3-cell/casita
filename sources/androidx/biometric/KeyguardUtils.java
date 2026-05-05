package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes.dex */
class KeyguardUtils {
    private KeyguardUtils() {
    }

    static KeyguardManager getKeyguardManager(Context context) {
        return Api23Impl.getKeyguardManager(context);
    }

    static boolean isDeviceSecuredWithCredential(Context context) {
        KeyguardManager keyguardManager = getKeyguardManager(context);
        if (keyguardManager == null) {
            return false;
        }
        return Api23Impl.isDeviceSecure(keyguardManager);
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static KeyguardManager getKeyguardManager(Context context) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Qd("\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bSg\u0013\u0011\u0016\u0006\u0018\u0013", (short) (Od.Xd() ^ (-23197))));
            Class<?>[] clsArr = {Class.forName(C1593ug.zd("#\u001b1\u001dj* .(o\u00060&9:", (short) (C1580rY.Xd() ^ (-28530)), (short) (C1580rY.Xd() ^ (-22229))))};
            Object[] objArr = {KeyguardManager.class};
            short sXd = (short) (C1580rY.Xd() ^ (-16112));
            int[] iArr = new int["XUcAf__OV;LX[MFG".length()];
            QB qb = new QB("XUcAf__OV;LX[MFG");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                return (KeyguardManager) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static boolean isDeviceSecure(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    private static class Api16Impl {
        private Api16Impl() {
        }

        static boolean isKeyguardSecure(KeyguardManager keyguardManager) {
            return keyguardManager.isKeyguardSecure();
        }
    }
}
