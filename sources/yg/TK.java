package yg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class TK {
    public final int Xd;

    protected TK(EnumC1506bu enumC1506bu) throws Throwable {
        int iXd = C1499aX.Xd() ^ (251722642 ^ 1285259767);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("hh_sE", (short) (Od.Xd() ^ ((1513600497 ^ 1721243986) ^ (-1018148002))), (short) (Od.Xd() ^ iXd))).getMethod(C1561oA.Xd("U_", (short) (C1633zX.Xd() ^ (365345386 ^ (-365331094)))), new Class[0]);
        try {
            method.setAccessible(true);
            int iIntValue = ((Integer) method.invoke(enumC1506bu, objArr)).intValue();
            String strVd = Wg.vd("aN\u0018=7", (short) (Od.Xd() ^ ((1681117018 ^ 177130383) ^ (-1857881914))));
            String strKd = Qg.kd("\u0010\u001b", (short) (ZN.Xd() ^ ((1712135524 ^ 1444865109) ^ 806607924)), (short) (ZN.Xd() ^ ((1917685631 ^ 123625751) ^ 1964236637)));
            Integer numValueOf = Integer.valueOf(iIntValue);
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 1 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
                field.setAccessible(true);
                field.set(this, numValueOf);
            } catch (Throwable th) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public int hashCode() {
        Object obj;
        String strQd = Xg.qd("\u0003q9`X", (short) (C1499aX.Xd() ^ (1504062010 ^ (-1504074521))), (short) (C1499aX.Xd() ^ (2037979660 ^ (-2038000186))));
        String strWd = Jg.Wd("\u000e\u001f", (short) (C1499aX.Xd() ^ ((1256308454 ^ 701253452) ^ (-1663947553))), (short) (C1499aX.Xd() ^ (325607275 ^ (-325588378))));
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 1 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return ((Integer) obj).intValue();
    }

    public void tK(LY ly) throws Throwable {
        Object obj;
        int iXd = FB.Xd() ^ (2137119409 ^ (-546215700));
        short sXd = (short) (C1499aX.Xd() ^ (734533819 ^ (-734540104)));
        short sXd2 = (short) (C1499aX.Xd() ^ iXd);
        int[] iArr = new int["]J\u00105+".length()];
        QB qb = new QB("]J\u00105+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strUd = C1561oA.ud("3>", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831089717))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        long jIntValue = ((Integer) obj).intValue();
        Class<?> cls2 = Class.forName(C1561oA.yd("F3|\u001a*", (short) (OY.Xd() ^ (407215189 ^ 407238732))));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(jIntValue)};
        Method method = cls2.getMethod(C1561oA.Yd("c]", (short) (C1607wl.Xd() ^ (1154085160 ^ 1154065712))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(ly, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
