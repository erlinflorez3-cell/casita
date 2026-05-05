package androidx.core.os;

import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessCompat {
    private ProcessCompat() {
    }

    public static boolean isApplicationUid(int i2) {
        return Api24Impl.isApplicationUid(i2);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isApplicationUid(int i2) {
            return Process.isApplicationUid(i2);
        }
    }

    static class Api19Impl {
        private static Method sMethodUserHandleIsAppMethod = null;
        private static boolean sResolved = false;
        private static final Object sResolvedLock = new Object();

        private Api19Impl() {
        }

        static boolean isApplicationUid(int i2) {
            try {
                synchronized (sResolvedLock) {
                    if (!sResolved) {
                        sResolved = true;
                        sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = sMethodUserHandleIsAppMethod;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i2));
                    if (bool == null) {
                        throw new NullPointerException();
                    }
                    return bool.booleanValue();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return true;
        }
    }
}
