package yg;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class Uo {
    public static Jl Xd() {
        Object obj;
        short sXd = (short) (FB.Xd() ^ ((1119014659 ^ 1861448116) ^ 742516807));
        int[] iArr = new int[" \u000fVs\u0017".length()];
        QB qb = new QB(" \u000fVs\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strQd = Xg.qd("gW", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (915608293 ^ (-1490492592)))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ (1126307850 ^ 1923821624))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        return (Jl) obj;
    }
}
