package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yg.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1548kl {
    private C1548kl() {
    }

    public static boolean Kd(long j2) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1206016419 ^ (-1952998223))));
        int[] iArr = new int["zi1xq".length()];
        QB qb = new QB("zi1xq");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(j2)};
        Method declaredMethod = cls.getDeclaredMethod(Xg.qd("CuDEN", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (1714423454 ^ (-141842155)))), (short) (Od.Xd() ^ (ZN.Xd() ^ (2047474928 ^ (-1233377271))))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String Xd(int i2) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("{h.sj", (short) (Od.Xd() ^ (766620641 ^ (-766612528)))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        short sXd = (short) (C1607wl.Xd() ^ (FB.Xd() ^ (533772977 ^ 1077918654)));
        int[] iArr = new int["L?GYQ".length()];
        QB qb = new QB("L?GYQ");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean Yd(String str) throws Throwable {
        Object[] objArr = {str};
        Method declaredMethod = Class.forName(Jg.Wd("\u007f\u0001f\u0007\u001e", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (879522026 ^ (-1512589796)))), (short) (C1633zX.Xd() ^ ((594124241 ^ 534969953) ^ (-1015747075))))).getDeclaredMethod(C1626yg.Ud(";{Qjd?\u0016", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (1576978801 ^ (-699373932)))), (short) (C1607wl.Xd() ^ ((501091203 ^ 1354360134) ^ 1298650303))), Class.forName(ZO.xd("U\u0011s\n4\t\u000fC]i\t| \u0004{Z", (short) (C1607wl.Xd() ^ ((773204393 ^ 1466309485) ^ 2037401736)), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (1294121806 ^ 2125004583))))));
        try {
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
