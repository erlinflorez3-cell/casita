package yg;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ZY {
    public static byte[] Xd(long j2, int i2) throws Throwable {
        Class<?> cls = Class.forName(EO.Od("\u0005L`\u0001\u0007", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831077149)))));
        Class<?>[] clsArr = new Class[OY.Xd() ^ 69929194];
        clsArr[0] = Long.TYPE;
        clsArr[1] = Integer.TYPE;
        Object[] objArr = new Object[Od.Xd() ^ (1775767765 ^ 774210690)];
        objArr[0] = Long.valueOf(j2);
        objArr[1] = Integer.valueOf(i2);
        short sXd = (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849982809)));
        int[] iArr = new int["_j".length()];
        QB qb = new QB("_j");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            if (bArr != null) {
                return bArr;
            }
            throw new IOException();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
