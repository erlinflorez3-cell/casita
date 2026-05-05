package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class JY {
    private JY() {
    }

    public static boolean Xd() throws Throwable {
        short sXd = (short) (OY.Xd() ^ (OY.Xd() ^ 69942929));
        int iXd = OY.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1626yg.Ud("[U\u001ciI", sXd, (short) (iXd ^ (2073466801 ^ 2073486194)))).getDeclaredMethod(Ig.wd(":y}+3", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1145337173 ^ 62495195)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
