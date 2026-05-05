package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Gu {
    private Gu() {
    }

    public static void Kd() throws Throwable {
        int iXd = Od.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("fU\u001dd]", (short) (iXd ^ (150359097 ^ (-150351236))))).getDeclaredMethod(Xg.qd("cggbp", (short) (Od.Xd() ^ ((1193728791 ^ 1226227331) ^ (-238052013))), (short) (Od.Xd() ^ ((1212398344 ^ 1722077066) ^ (-786908682)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static long Xd() throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831063558));
        int iXd = C1633zX.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Jg.Wd("\u0014\u0002)LE", sXd, (short) (iXd ^ (1135328103 ^ (-1135340008))))).getDeclaredMethod(ZO.xd("#E1Jg", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831083302)), (short) (C1633zX.Xd() ^ ((1149406561 ^ 764967395) ^ (-1763370720)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Long) declaredMethod.invoke(null, objArr)).longValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void Yd() throws Throwable {
        Class<?> cls = Class.forName(C1626yg.Ud("u\n\u001fUz", (short) (C1499aX.Xd() ^ ((2072552648 ^ 999948721) ^ (-1074967115))), (short) (C1499aX.Xd() ^ ((1244263134 ^ 858475682) ^ (-2030224146)))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ ((1628593412 ^ 449161762) ^ (-2077721471)));
        int[] iArr = new int["G\u0006Ih:kJ\u0011".length()];
        QB qb = new QB("G\u0006Ih:kJ\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
