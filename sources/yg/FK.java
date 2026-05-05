package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class FK extends AbstractC1552lK {
    FK() {
    }

    protected List<VX> vY() throws Throwable {
        short sXd = (short) (ZN.Xd() ^ (FB.Xd() ^ (1124392490 ^ 485196985)));
        int[] iArr = new int["\u0013\u007fE}`".length()];
        QB qb = new QB("\u0013\u007fE}`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.yd(">X", (short) (Od.Xd() ^ (Od.Xd() ^ (-1207814650)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return (List) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // yg.AbstractC1552lK
    protected /* bridge */ /* synthetic */ Object yY() throws Throwable {
        int iXd = OY.Xd() ^ (-69945346);
        int iXd2 = C1580rY.Xd() ^ (1819782534 ^ 1576968954);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("\u000bw=TX", (short) (Od.Xd() ^ iXd), (short) (Od.Xd() ^ iXd2))).getDeclaredMethod(hg.Vd("\u0015v", (short) (Od.Xd() ^ (OY.Xd() ^ (484301900 ^ (-418823765)))), (short) (Od.Xd() ^ ((1596283027 ^ 1451133914) ^ (-157018114)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return (List) declaredMethod.invoke(this, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
