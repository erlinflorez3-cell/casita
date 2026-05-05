package yg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yg.kp */
/* JADX INFO: loaded from: classes.dex */
public class C1549kp extends YK {
    public final String Kd;
    public final String Yd;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1549kp(BF bf, String str, String str2) {
        Object obj;
        String strKd = Qg.kd("6#h\u001c.", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (474933127 ^ (-801422682)))), (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1345065801 ^ 1638214944))));
        String strVd = hg.Vd("*\u0018", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864712001)), (short) (ZN.Xd() ^ (OY.Xd() ^ (1096414978 ^ 1165160283))));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        super(bf, (EnumC1506bu) obj);
        String strUd = C1561oA.ud("S@\u0006BF", (short) (C1607wl.Xd() ^ ((1217918750 ^ 778483798) ^ 1727075842)));
        String strYd = C1561oA.yd("8R", (short) (C1633zX.Xd() ^ (1787353998 ^ (-1787358589))));
        try {
            Class<?> cls2 = Class.forName(strUd);
            Field field2 = 1 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
            field2.setAccessible(true);
            field2.set(this, str);
        } catch (Throwable th2) {
        }
        String strYd2 = C1561oA.Yd("'\u0016]\u001c\"", (short) (C1580rY.Xd() ^ (1004547926 ^ (-1004567625))));
        String strQd = Xg.qd("&2", (short) (FB.Xd() ^ ((1922925739 ^ 515394311) ^ 1814407432)), (short) (FB.Xd() ^ (1054556024 ^ 1054552530)));
        try {
            Class<?> cls3 = Class.forName(strYd2);
            Field field3 = 1 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
            field3.setAccessible(true);
            field3.set(this, str2);
        } catch (Throwable th3) {
        }
    }

    @Override // yg.TK
    public int hashCode() {
        Object obj;
        Object obj2;
        int iXd = (((OY.Xd() ^ (725070402 ^ 790411949)) * 31) + super.hashCode()) * 31;
        String strXd = C1561oA.Xd("%\u0014[\u001a ", (short) (C1580rY.Xd() ^ ((1818659131 ^ 573231720) ^ (-1313621847))));
        String strVd = Wg.vd("[u", (short) (Od.Xd() ^ (OY.Xd() ^ (-69930706))));
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 1 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        int iHashCode = (iXd + ((String) obj).hashCode()) * 31;
        String strKd = Qg.kd("\u0010|B~\u0003", (short) (C1499aX.Xd() ^ (1425482465 ^ (-1425500330))), (short) (C1499aX.Xd() ^ ((1527260329 ^ 686841949) ^ (-1945649506))));
        short sXd = (short) (Od.Xd() ^ ((1927261208 ^ 164195036) ^ (-2065093679)));
        short sXd2 = (short) (Od.Xd() ^ (1244476218 ^ (-1244466586)));
        int[] iArr = new int["pz".length()];
        QB qb = new QB("pz");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls2 = Class.forName(strKd);
            Field field2 = 1 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
            field2.setAccessible(true);
            obj2 = field2.get(this);
        } catch (Throwable th2) {
            obj2 = null;
        }
        return iHashCode + ((String) obj2).hashCode();
    }

    @Override // yg.YK, yg.TK
    public void tK(LY ly) throws Throwable {
        Object obj;
        Object obj2;
        super.tK(ly);
        String strWd = Jg.Wd("\u001eoVr'", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831086182)), (short) (C1580rY.Xd() ^ ((380785178 ^ 699236345) ^ (-1059016240))));
        String strXd = ZO.xd(">\b", (short) (Od.Xd() ^ (ZN.Xd() ^ (1118028834 ^ (-1898547642)))), (short) (Od.Xd() ^ (9545669 ^ (-9554462))));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 1 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        Object[] objArr = {(String) obj};
        Method method = Class.forName(C1626yg.Ud("]I\\G^", (short) (Od.Xd() ^ ((1096830908 ^ 595699797) ^ (-1658960354))), (short) (Od.Xd() ^ ((783013992 ^ 738774640) ^ (-44262438))))).getMethod(EO.Od("\u001e8", (short) (C1580rY.Xd() ^ (1155259892 ^ (-1155249244)))), Class.forName(Ig.wd("i\u0012ckgQ0\u001bQ9f OBYi", (short) (C1580rY.Xd() ^ ((1059523881 ^ 212906841) ^ (-865569361))))));
        try {
            method.setAccessible(true);
            method.invoke(ly, objArr);
            String strQd = C1561oA.Qd("wd*fj", (short) (C1633zX.Xd() ^ ((1699888059 ^ 397006375) ^ (-1929086396))));
            short sXd = (short) (C1580rY.Xd() ^ (847655815 ^ (-847650424)));
            short sXd2 = (short) (C1580rY.Xd() ^ (79155359 ^ (-79153834)));
            int[] iArr = new int["\u0001\r".length()];
            QB qb = new QB("\u0001\r");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls2 = Class.forName(strQd);
                Field field2 = 1 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                field2.setAccessible(true);
                obj2 = field2.get(this);
            } catch (Throwable th2) {
                obj2 = null;
            }
            String str2 = (String) obj2;
            short sXd3 = (short) (C1499aX.Xd() ^ ((302812412 ^ 1715444877) ^ (-1949532066)));
            int[] iArr2 = new int["P=\u0003 ,".length()];
            QB qb2 = new QB("P=\u0003 ,");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Object[] objArr2 = {str2};
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.Zd("p@", (short) (C1633zX.Xd() ^ ((831118439 ^ 1826010131) ^ (-1566524854))), (short) (C1633zX.Xd() ^ ((809298576 ^ 514260334) ^ (-781866493)))), Class.forName(C1561oA.Kd("nf|h6ukys;a\u0004\u0003z\u0001z", (short) (C1607wl.Xd() ^ ((1072264813 ^ 1601972006) ^ 1620406960)))));
            try {
                method2.setAccessible(true);
                method2.invoke(ly, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
