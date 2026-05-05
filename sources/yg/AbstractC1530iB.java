package yg;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: yg.iB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1530iB {
    protected static final Object Xd = null;

    static {
        Object obj = new Object();
        String strWd = Jg.Wd("Gm\u001c\u00119", (short) (ZN.Xd() ^ ((1015114750 ^ 760441599) ^ 298982904)), (short) (ZN.Xd() ^ ((2102367346 ^ 1235645120) ^ 887718616)));
        int iXd = FB.Xd() ^ (791319882 ^ 1891997206);
        short sXd = (short) (C1607wl.Xd() ^ (1957064666 ^ 1957046644));
        short sXd2 = (short) (C1607wl.Xd() ^ iXd);
        int[] iArr = new int["x\u0013".length()];
        QB qb = new QB("x\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            field.set(null, obj);
        } catch (Throwable th) {
        }
    }
}
