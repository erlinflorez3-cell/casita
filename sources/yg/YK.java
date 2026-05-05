package yg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class YK extends TK {
    protected BF Xd;

    public YK(BF bf, EnumC1506bu enumC1506bu) {
        Object obj;
        Object obj2;
        super(enumC1506bu);
        String strQd = Xg.qd("\r{Cob", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (442091548 ^ (-701758911)))), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207823388))));
        short sXd = (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849953398));
        short sXd2 = (short) (C1607wl.Xd() ^ (405311005 ^ 405309120));
        int[] iArr = new int["g\u0005".length()];
        QB qb = new QB("g\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            field.set(this, bf);
        } catch (Throwable th) {
        }
        String strXd = ZO.xd("?\u0015z-\u0003", (short) (C1580rY.Xd() ^ ((1224003694 ^ 1345437767) ^ (-415567367))), (short) (C1580rY.Xd() ^ (975705407 ^ (-975718020))));
        String strUd = C1626yg.Ud("o8", (short) (Od.Xd() ^ (1727085510 ^ (-1727102008))), (short) (Od.Xd() ^ (1460645139 ^ (-1460657036))));
        try {
            Class<?> cls2 = Class.forName(strXd);
            Field field2 = 0 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
            field2.setAccessible(true);
            obj = field2.get(this);
        } catch (Throwable th2) {
            obj = null;
        }
        BF bf2 = (BF) obj;
        String strWd = Ig.wd("\u007f\u0016\u000bNy", (short) (OY.Xd() ^ (1601469351 ^ 1601446034)));
        short sXd3 = (short) (FB.Xd() ^ (2036284949 ^ 2036269769));
        int[] iArr2 = new int[")\r".length()];
        QB qb2 = new QB(")\r");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        try {
            Class<?> cls3 = Class.forName(strWd);
            Field field3 = 1 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
            field3.setAccessible(true);
            obj2 = field3.get(bf2);
        } catch (Throwable th3) {
            obj2 = null;
        }
        ((ArrayList) obj2).add(this);
    }

    @Override // yg.TK
    public void tK(LY ly) throws Throwable {
        Object obj;
        Object obj2;
        super.tK(ly);
        short sXd = (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (414951946 ^ 724675656)));
        int[] iArr = new int[";(m\u0018\t".length()];
        QB qb = new QB(";(m\u0018\t");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strZd = C1593ug.zd(":G", (short) (OY.Xd() ^ (FB.Xd() ^ 1609499440)), (short) (OY.Xd() ^ (C1607wl.Xd() ^ (122718227 ^ 1762969682))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        BF bf = (BF) obj;
        String strOd = C1561oA.od("F3x\f\u000f", (short) (C1499aX.Xd() ^ ((349745789 ^ 1560618052) ^ (-1239261459))));
        String strKd = C1561oA.Kd("@M", (short) (C1607wl.Xd() ^ ((888751446 ^ 1403951766) ^ 1733808118)));
        try {
            Class<?> cls2 = Class.forName(strOd);
            Field field2 = 1 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
            field2.setAccessible(true);
            obj2 = field2.get(bf);
        } catch (Throwable th2) {
            obj2 = null;
        }
        long jLongValue = ((Long) obj2).longValue();
        Class<?> cls3 = Class.forName(Wg.Zd("V{SO.", (short) (C1607wl.Xd() ^ ((1170065555 ^ 680547363) ^ 1831704860)), (short) (C1607wl.Xd() ^ ((344533117 ^ 397222187) ^ 52723577))));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(jLongValue)};
        Method method = cls3.getMethod(C1561oA.Xd("\b\u0002", (short) (C1633zX.Xd() ^ ((203465687 ^ 986582645) ^ (-921619464)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(ly, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
