package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Ql {
    private Ql() {
    }

    public static void Kd() throws Throwable {
        int iXd = C1633zX.Xd() ^ (552384382 ^ 1421716691);
        int iXd2 = C1499aX.Xd();
        Object[] objArr = new Object[0];
        int iXd3 = ZN.Xd() ^ (1193152771 ^ 1955879409);
        Method declaredMethod = Class.forName(Xg.qd("D3zB;", (short) (iXd2 ^ ((2098786485 ^ 1077480004) ^ (-1025630051))), (short) (C1499aX.Xd() ^ iXd))).getDeclaredMethod(Jg.Wd("S0m*[>K", (short) (OY.Xd() ^ ((1016749442 ^ 2014467762) ^ 1149792752)), (short) (OY.Xd() ^ iXd3)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void Xd() throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951484317));
        int[] iArr = new int["+\u0018a'\u001a".length()];
        QB qb = new QB("+\u0018a'\u001a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Yd("\rsh", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831065990)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void Yd() throws Throwable {
        int iXd = FB.Xd() ^ (153069594 ^ (-1458607480));
        int iXd2 = Od.Xd() ^ (-1207801096);
        short sXd = (short) (C1499aX.Xd() ^ iXd);
        short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
        int[] iArr = new int["2xcc?".length()];
        QB qb = new QB("2xcc?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd3 = C1633zX.Xd() ^ (1688944294 ^ (-284850288));
        short sXd3 = (short) (ZN.Xd() ^ ((1387298052 ^ 984751629) ^ 1744977543));
        short sXd4 = (short) (ZN.Xd() ^ iXd3);
        int[] iArr2 = new int["H(do@78 ".length()];
        QB qb2 = new QB("H(do@78 ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void od() throws Throwable {
        int iXd = C1607wl.Xd() ^ (386713542 ^ 2034818100);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Qd("zg-ri", (short) (C1607wl.Xd() ^ iXd))).getDeclaredMethod(C1593ug.zd("v|\u0005", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849957621)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849953093))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void ud() throws Throwable {
        int iXd = C1607wl.Xd() ^ (-1849955476);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("w\u001a\u0011x&", (short) (C1580rY.Xd() ^ iXd))).getDeclaredMethod(EO.Od("\u0003:\u0001\u0016tb", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (476925025 ^ (-769944551))))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
