package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class XF {
    private static final int Kd = 27;
    private static final int Xd = 4;
    private static final int Yd = 0;

    public static void Xd(Wd wd) {
        int iXd = C1580rY.Xd() ^ (-831067163);
        int iXd2 = FB.Xd() ^ 1609527080;
        Class<?> cls = Class.forName(Wg.Zd("$\u0012+E{", (short) (C1633zX.Xd() ^ ((58278555 ^ 2011618937) ^ (-1956633433))), (short) (C1633zX.Xd() ^ (1992546730 ^ (-1992542130)))));
        Class<?>[] clsArr = new Class[ZN.Xd() ^ 864698100];
        clsArr[0] = Integer.TYPE;
        clsArr[1] = Integer.TYPE;
        clsArr[C1607wl.Xd() ^ (3284358 ^ 1853230686)] = Integer.TYPE;
        clsArr[FB.Xd() ^ (1736614548 ^ 946720164)] = Class.forName(C1561oA.Xd("{j2\\j", (short) (C1607wl.Xd() ^ ((730324129 ^ 1659180173) ^ 1231208003))));
        Object[] objArr = new Object[Od.Xd() ^ 1207800913];
        objArr[0] = Integer.valueOf(iXd2);
        objArr[1] = 0;
        objArr[(1778372902 ^ 511937803) ^ 2004638767] = Integer.valueOf(iXd);
        objArr[ZN.Xd() ^ 864698099] = wd;
        Method declaredMethod = cls.getDeclaredMethod(Wg.vd("dt", (short) (OY.Xd() ^ (1281346353 ^ 1281341406))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            short sXd = (short) (C1580rY.Xd() ^ ((457136369 ^ 690969301) ^ (-839929124)));
            int iXd3 = C1580rY.Xd();
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Qg.kd("\u0012~D|_", sXd, (short) (iXd3 ^ (1144358339 ^ (-1144377077))))).getDeclaredMethod(hg.Vd("7A", (short) (ZN.Xd() ^ (250023650 ^ 250020564)), (short) (ZN.Xd() ^ (569821359 ^ 569834558))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(null, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
