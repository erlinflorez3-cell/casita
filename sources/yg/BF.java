package yg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class BF {
    public long Kd;
    public final int Qd;
    public long Xd;
    public ArrayList<TK> Yd;
    public final int od;
    public final int ud;
    public final long wd;
    public final long yd;

    public BF(int i2, int i3, int i4, long j2) {
        ArrayList arrayList = new ArrayList();
        String strOd = C1561oA.od("8%j}\u0001", (short) (OY.Xd() ^ (1718047174 ^ 1718051780)));
        String strKd = C1561oA.Kd("=I", (short) (ZN.Xd() ^ (1211869381 ^ 1211886146)));
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 1 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            field.set(this, arrayList);
        } catch (Throwable th) {
        }
        String strZd = Wg.Zd("`\u0001\u000b\u000eT", (short) (C1580rY.Xd() ^ (1252159108 ^ (-1252156998))), (short) (C1580rY.Xd() ^ (72451898 ^ (-72471884))));
        String strXd = C1561oA.Xd("\u0005z", (short) (C1633zX.Xd() ^ (1614918795 ^ (-1614913935))));
        Integer numValueOf = Integer.valueOf(i2);
        try {
            Class<?> cls2 = Class.forName(strZd);
            Field field2 = 1 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
            field2.setAccessible(true);
            field2.set(this, numValueOf);
        } catch (Throwable th2) {
        }
        short sXd = (short) (C1580rY.Xd() ^ ((791766063 ^ 131069097) ^ (-687780502)));
        int[] iArr = new int["\u007fn2GP".length()];
        QB qb = new QB("\u007fn2GP");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((sXd ^ i5) + xuXd.CK(iKK));
            i5++;
        }
        String str = new String(iArr, 0, i5);
        String strKd2 = Qg.kd("jX", (short) (ZN.Xd() ^ ((2084868966 ^ 1611456260) ^ 474495554)), (short) (ZN.Xd() ^ ((1250939537 ^ 270853568) ^ 1521187534)));
        Integer numValueOf2 = Integer.valueOf(i3);
        try {
            Class<?> cls3 = Class.forName(str);
            Field field3 = 1 != 0 ? cls3.getField(strKd2) : cls3.getDeclaredField(strKd2);
            field3.setAccessible(true);
            field3.set(this, numValueOf2);
        } catch (Throwable th3) {
        }
        String strVd = hg.Vd("P=\u0003\u0016\u0019", (short) (C1607wl.Xd() ^ ((90826922 ^ 1690109403) ^ 1641332990)), (short) (C1607wl.Xd() ^ (1734831526 ^ 1734834992)));
        String strUd = C1561oA.ud("\u0002\u0014", (short) (OY.Xd() ^ ((834530418 ^ 2097789600) ^ 1286879419)));
        Integer numValueOf3 = Integer.valueOf(i4);
        try {
            Class<?> cls4 = Class.forName(strVd);
            Field field4 = 1 != 0 ? cls4.getField(strUd) : cls4.getDeclaredField(strUd);
            field4.setAccessible(true);
            field4.set(this, numValueOf3);
        } catch (Throwable th4) {
        }
        String strYd = C1561oA.yd("n[!4?", (short) (C1607wl.Xd() ^ ((1866917763 ^ 203200921) ^ 1666858387)));
        String strYd2 = C1561oA.Yd("\u0002o", (short) (C1607wl.Xd() ^ (2036718554 ^ 2036699556)));
        Long lValueOf = Long.valueOf(j2);
        try {
            Class<?> cls5 = Class.forName(strYd);
            Field field5 = 1 != 0 ? cls5.getField(strYd2) : cls5.getDeclaredField(strYd2);
            field5.setAccessible(true);
            field5.set(this, lValueOf);
        } catch (Throwable th5) {
        }
        long j3 = (-1) - (((-1) - (i3 << 3)) & ((-1) - i4));
        String strQd = Xg.qd(")\u0018_ty", (short) (C1633zX.Xd() ^ ((683767453 ^ 1488507003) ^ (-1887039095))), (short) (C1633zX.Xd() ^ ((1982400393 ^ 1923984323) ^ (-75823640))));
        short sXd2 = (short) (C1499aX.Xd() ^ (1982670909 ^ (-1982683742)));
        short sXd3 = (short) (C1499aX.Xd() ^ ((2072977152 ^ 1167798679) ^ (-1041515247)));
        int[] iArr2 = new int["\u0018:".length()];
        QB qb2 = new QB("\u0018:");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - ((i6 * sXd3) ^ sXd2));
            i6++;
        }
        String str2 = new String(iArr2, 0, i6);
        Long lValueOf2 = Long.valueOf(j3);
        try {
            Class<?> cls6 = Class.forName(strQd);
            Field field6 = 1 != 0 ? cls6.getField(str2) : cls6.getDeclaredField(str2);
            field6.setAccessible(true);
            field6.set(this, lValueOf2);
        } catch (Throwable th6) {
        }
        String strXd2 = ZO.xd("O^\u000f(`", (short) (FB.Xd() ^ (2145452897 ^ 2145464648)), (short) (FB.Xd() ^ ((1247572017 ^ 287731729) ^ 1534737958)));
        short sXd4 = (short) (C1633zX.Xd() ^ ((1355892956 ^ 1360361981) ^ (-29638950)));
        short sXd5 = (short) (C1633zX.Xd() ^ ((343741732 ^ 764727395) ^ (-971624003)));
        int[] iArr3 = new int["\u001ar".length()];
        QB qb3 = new QB("\u001ar");
        int i7 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i7] = xuXd3.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i7 * sXd5))) + xuXd3.CK(iKK3));
            i7++;
        }
        String str3 = new String(iArr3, 0, i7);
        try {
            Class<?> cls7 = Class.forName(strXd2);
            Field field7 = 1 != 0 ? cls7.getField(str3) : cls7.getDeclaredField(str3);
            field7.setAccessible(true);
            field7.set(this, 1L);
        } catch (Throwable th7) {
        }
    }

    public void ZX(LY ly, long j2) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        String strXd = C1561oA.Xd("hW\u001f49", (short) (C1607wl.Xd() ^ ((1242493272 ^ 2109290853) ^ 934787661)));
        String strVd = Wg.vd("ZF", (short) (FB.Xd() ^ ((278025591 ^ 1779518501) ^ 2055406680)));
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 1 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        long jLongValue = ((Long) obj).longValue();
        Class<?> cls2 = Class.forName(Qg.kd("N;\u0001\u001e*", (short) (C1499aX.Xd() ^ ((2047175841 ^ 1914065442) ^ (-135466846))), (short) (C1499aX.Xd() ^ ((1210889297 ^ 1070604518) ^ (-2013053392)))));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(jLongValue)};
        short sXd = (short) (C1607wl.Xd() ^ (299966388 ^ 299974595));
        short sXd2 = (short) (C1607wl.Xd() ^ ((1089246387 ^ 1139651718) ^ 50399380));
        int[] iArr = new int["c[".length()];
        QB qb = new QB("c[");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls2.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(ly, objArr);
            String strUd = C1561oA.ud("ZG\r #", (short) (OY.Xd() ^ ((1473953963 ^ 1672099626) ^ 879815455)));
            String strYd = C1561oA.yd("0&", (short) (OY.Xd() ^ ((1769969368 ^ 763476683) ^ 1157508565)));
            try {
                Class<?> cls3 = Class.forName(strUd);
                Field field2 = 1 != 0 ? cls3.getField(strYd) : cls3.getDeclaredField(strYd);
                field2.setAccessible(true);
                obj2 = field2.get(this);
            } catch (Throwable th2) {
                obj2 = null;
            }
            long jIntValue = ((Integer) obj2).intValue();
            short sXd3 = (short) (OY.Xd() ^ (939420434 ^ 939412503));
            int[] iArr2 = new int["bQ\u00198F".length()];
            QB qb2 = new QB("bQ\u00198F");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                i3++;
            }
            Class<?> cls4 = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr2 = {Long.TYPE};
            Object[] objArr2 = {Long.valueOf(jIntValue)};
            Method method2 = cls4.getMethod(Xg.qd("\r\u0007", (short) (C1580rY.Xd() ^ (101912157 ^ (-101935560))), (short) (C1580rY.Xd() ^ ((36203563 ^ 1648013049) ^ (-1611826282)))), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(ly, objArr2);
                Class<?> cls5 = Class.forName(Jg.Wd("J\u0015z\u0015\u0003", (short) (C1580rY.Xd() ^ ((1760541414 ^ 22510632) ^ (-1773708560))), (short) (C1580rY.Xd() ^ (191151636 ^ (-191160679)))));
                Class<?>[] clsArr3 = {Long.TYPE};
                Object[] objArr3 = {Long.valueOf(j2)};
                Method method3 = cls5.getMethod(ZO.xd("\u0006h", (short) (C1633zX.Xd() ^ (1346480383 ^ (-1346492329))), (short) (C1633zX.Xd() ^ (1935966965 ^ (-1935982900)))), clsArr3);
                try {
                    method3.setAccessible(true);
                    method3.invoke(ly, objArr3);
                    String strUd2 = C1626yg.Ud("_T.9(", (short) (ZN.Xd() ^ (955786986 ^ 955786762)), (short) (ZN.Xd() ^ (1192344245 ^ 1192330724)));
                    String strWd = Ig.wd("]&", (short) (C1633zX.Xd() ^ (1119885749 ^ (-1119895576))));
                    try {
                        Class<?> cls6 = Class.forName(strUd2);
                        Field field3 = 1 != 0 ? cls6.getField(strWd) : cls6.getDeclaredField(strWd);
                        field3.setAccessible(true);
                        obj3 = field3.get(this);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    long jLongValue2 = ((Long) obj3).longValue();
                    long j3 = (469611764595338452L ^ 2420886366464086523L) ^ 2818358619847705296L;
                    long j4 = (jLongValue2 + j3) - (jLongValue2 | j3);
                    Class<?> cls7 = Class.forName(EO.Od("\u0004)_\\\u0014", (short) (C1633zX.Xd() ^ (785432601 ^ (-785436044)))));
                    Class<?>[] clsArr4 = {Long.TYPE};
                    Object[] objArr4 = {Long.valueOf(j4)};
                    Method method4 = cls7.getMethod(C1561oA.Qd("\b\u007f", (short) (Od.Xd() ^ (1834158961 ^ (-1834168866)))), clsArr4);
                    try {
                        method4.setAccessible(true);
                        method4.invoke(ly, objArr4);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public int hashCode() throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i2 = (1633590661 ^ 1633590658) * 31;
        String strZd = C1593ug.zd("O>\u0006\u001b ", (short) (C1633zX.Xd() ^ ((644653104 ^ 37636546) ^ (-609410001))), (short) (C1633zX.Xd() ^ ((278340371 ^ 1391123066) ^ (-1115544659))));
        short sXd = (short) (ZN.Xd() ^ (FB.Xd() ^ (1024609736 ^ 1660760585)));
        int[] iArr = new int["2&".length()];
        QB qb = new QB("2&");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        int iIntValue = (i2 + ((Integer) obj).intValue()) * 31;
        String strKd = C1561oA.Kd("fU\u001d27", (short) (C1499aX.Xd() ^ ((1911162850 ^ 1398366546) ^ (-582177588))));
        String strZd2 = Wg.Zd("\u0019N", (short) (C1607wl.Xd() ^ (1222002017 ^ 1221995864)), (short) (C1607wl.Xd() ^ ((1036524929 ^ 1936491396) ^ 1319407390)));
        try {
            Class<?> cls2 = Class.forName(strKd);
            Field field2 = 1 != 0 ? cls2.getField(strZd2) : cls2.getDeclaredField(strZd2);
            field2.setAccessible(true);
            obj2 = field2.get(this);
        } catch (Throwable th2) {
            obj2 = null;
        }
        int iIntValue2 = (iIntValue + ((Integer) obj2).intValue()) * 31;
        String strXd = C1561oA.Xd("C2y\u000f\u0014", (short) (C1499aX.Xd() ^ ((1553516630 ^ 163062319) ^ (-1428199756))));
        String strVd = Wg.vd("9M", (short) (C1633zX.Xd() ^ ((388925359 ^ 776208559) ^ (-963286688))));
        try {
            Class<?> cls3 = Class.forName(strXd);
            Field field3 = 1 != 0 ? cls3.getField(strVd) : cls3.getDeclaredField(strVd);
            field3.setAccessible(true);
            obj3 = field3.get(this);
        } catch (Throwable th3) {
            obj3 = null;
        }
        int iIntValue3 = (iIntValue2 + ((Integer) obj3).intValue()) * 31;
        String strKd2 = Qg.kd("aN\u0014'*", (short) (FB.Xd() ^ ((1083002328 ^ 865582275) ^ 1931122669)), (short) (FB.Xd() ^ ((1955493889 ^ 1953483657) ^ 14801551)));
        String strVd2 = hg.Vd("aK", (short) (C1607wl.Xd() ^ ((1357307593 ^ 2075932557) ^ 727359741)), (short) (C1607wl.Xd() ^ (447777838 ^ 447777190)));
        try {
            Class<?> cls4 = Class.forName(strKd2);
            Field field4 = 1 != 0 ? cls4.getField(strVd2) : cls4.getDeclaredField(strVd2);
            field4.setAccessible(true);
            obj4 = field4.get(this);
        } catch (Throwable th4) {
            obj4 = null;
        }
        int iLongValue = (iIntValue3 + ((int) ((-1) - (((-1) - ((Long) obj4).longValue()) | ((-1) - (1552114447430452092L ^ (-1552114447430452093L))))))) * 31;
        String strUd = C1561oA.ud("UB\b\u001b\u001e", (short) (FB.Xd() ^ (1491467304 ^ 1491447878)));
        String strYd = C1561oA.yd("_K", (short) (C1580rY.Xd() ^ (473570033 ^ (-473571940))));
        try {
            Class<?> cls5 = Class.forName(strUd);
            Field field5 = 1 != 0 ? cls5.getField(strYd) : cls5.getDeclaredField(strYd);
            field5.setAccessible(true);
            obj5 = field5.get(this);
        } catch (Throwable th5) {
            obj5 = null;
        }
        int iLongValue2 = iLongValue + ((int) (((Long) obj5).longValue() >>> (1629495717 ^ 1629495685)));
        String strYd2 = C1561oA.Yd("5$k\u0001\u0006", (short) (C1499aX.Xd() ^ ((1763002550 ^ 765045287) ^ (-1150058808))));
        String strQd = Xg.qd(";G", (short) (OY.Xd() ^ (1144073186 ^ 1144078001)), (short) (OY.Xd() ^ (1561059166 ^ 1561060125)));
        try {
            Class<?> cls6 = Class.forName(strYd2);
            Field field6 = 1 != 0 ? cls6.getField(strQd) : cls6.getDeclaredField(strQd);
            field6.setAccessible(true);
            obj6 = field6.get(this);
        } catch (Throwable th6) {
            obj6 = null;
        }
        for (TK tk : (ArrayList) obj6) {
            int i4 = iLongValue2 * 31;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("i|w\u000e4", (short) (ZN.Xd() ^ ((1046469336 ^ 1768438484) ^ 1463258294)), (short) (ZN.Xd() ^ (771229308 ^ 771256140)))).getMethod(ZO.xd("Z{lm6\\e_", (short) (Od.Xd() ^ (1828914834 ^ (-1828921268))), (short) (Od.Xd() ^ ((728249573 ^ 806304470) ^ (-459751228)))), new Class[0]);
            try {
                method.setAccessible(true);
                iLongValue2 = i4 + ((Integer) method.invoke(tk, objArr)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return iLongValue2;
    }

    public TK jX(Wd wd) throws Throwable {
        Class<?> cls = Class.forName(Ig.wd("Gna$W", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207828182))));
        Class<?>[] clsArr = {Class.forName(EO.Od("x\u0010\tE\u0002", (short) (FB.Xd() ^ (1643890819 ^ 1643888961))))};
        Object[] objArr = {this};
        short sXd = (short) (C1607wl.Xd() ^ ((1686635962 ^ 739542493) ^ 1218237136));
        int[] iArr = new int["\u0003\u0006".length()];
        QB qb = new QB("\u0003\u0006");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return (YK) method.invoke(wd, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
