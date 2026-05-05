package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yg.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1555mK {
    private C1555mK() {
    }

    public static byte[] Xd(long j2, int i2) throws Throwable {
        short sXd = (short) (FB.Xd() ^ (OY.Xd() ^ (1792107004 ^ 1861885959)));
        short sXd2 = (short) (FB.Xd() ^ (1196092331 ^ 1196088367));
        int[] iArr = new int[" uc^\u001d".length()];
        QB qb = new QB(" uc^\u001d");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[ZN.Xd() ^ (1024395126 ^ 243612036)];
        clsArr[0] = Long.TYPE;
        clsArr[1] = Integer.TYPE;
        Object[] objArr = new Object[(731875195 ^ 751561624) ^ 122973409];
        objArr[0] = Long.valueOf(j2);
        objArr[1] = Integer.valueOf(i2);
        Method declaredMethod = cls.getDeclaredMethod(Ig.wd("\u007f\u001cF_|O\u001c", (short) (C1580rY.Xd() ^ ((1500120191 ^ 1532182919) ^ (-37318133)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
