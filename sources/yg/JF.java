package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class JF {
    private static final int Kd = 4;
    private static final long Qd = 0;
    private static final int Xd = 4;
    private static int Yd = 0;
    private static int od = 0;
    private static int ud = 0;
    private static final byte[] wd = null;
    private static final long yd = 0;

    static {
        Object obj;
        long jLongValue;
        Object obj2;
        int iXd = OY.Xd() ^ (-69950897);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1593ug.zd("B1x\u0016\u0013", (short) (C1499aX.Xd() ^ (1905135777 ^ (-1905131542))), (short) (C1499aX.Xd() ^ iXd))).getDeclaredMethod(C1561oA.od("VE", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134241802)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
            String strKd = C1561oA.Kd("_N\u001630", (short) (Od.Xd() ^ (856337952 ^ (-856353044))));
            short sXd = (short) (ZN.Xd() ^ ((1020440521 ^ 1112190259) ^ 2123912478));
            short sXd2 = (short) (ZN.Xd() ^ (312335107 ^ 312313382));
            int[] iArr = new int["\b\u000e".length()];
            QB qb = new QB("\b\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            Integer numValueOf = Integer.valueOf(iIntValue);
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                field.set(null, numValueOf);
            } catch (Throwable th) {
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Xd("]L\u00141.", (short) (C1607wl.Xd() ^ (66589994 ^ 66611152)))).getDeclaredMethod(Wg.vd("\u007f\u0011", (short) (FB.Xd() ^ ((1409867283 ^ 122486908) ^ 1397083657))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                int iIntValue2 = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                String strKd2 = Qg.kd("UB\b#\u001e", (short) (C1499aX.Xd() ^ (1381097524 ^ (-1381089193))), (short) (C1499aX.Xd() ^ ((15438520 ^ 866738832) ^ (-860017142))));
                short sXd3 = (short) (Od.Xd() ^ (564798806 ^ (-564818369)));
                short sXd4 = (short) (Od.Xd() ^ (593852219 ^ (-593835963)));
                int[] iArr2 = new int["8&".length()];
                QB qb2 = new QB("8&");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                Integer numValueOf2 = Integer.valueOf(iIntValue2);
                try {
                    Class<?> cls2 = Class.forName(strKd2);
                    Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                    field2.setAccessible(true);
                    field2.set(null, numValueOf2);
                } catch (Throwable th2) {
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(C1561oA.ud("WD\n% ", (short) (C1499aX.Xd() ^ (292258211 ^ (-292259956))))).getDeclaredMethod(C1561oA.yd("\u000e#", (short) (Od.Xd() ^ (1570535274 ^ (-1570526315)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    int iIntValue3 = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    String strYd = C1561oA.Yd("\u001c\u000bRol", (short) (C1607wl.Xd() ^ ((411147888 ^ 1917806637) ^ 1791927387)));
                    short sXd5 = (short) (ZN.Xd() ^ (1704025063 ^ 1704005229));
                    short sXd6 = (short) (ZN.Xd() ^ ((1906863699 ^ 271663633) ^ 1637443294));
                    int[] iArr3 = new int["Ua".length()];
                    QB qb3 = new QB("Ua");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd5 + i4)) + sXd6);
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    Integer numValueOf3 = Integer.valueOf(iIntValue3);
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
                        field3.setAccessible(true);
                        field3.set(null, numValueOf3);
                    } catch (Throwable th3) {
                    }
                    byte[] bArr = new byte[(279005015 ^ 1948111004) ^ 1690081225];
                    // fill-array-data instruction
                    bArr[0] = 65;
                    bArr[1] = 88;
                    String strWd = Jg.Wd("o\u001c\t\u00179", (short) (C1607wl.Xd() ^ (1098601222 ^ 1098591686)), (short) (C1607wl.Xd() ^ (1727166613 ^ 1727149082)));
                    String strXd = ZO.xd("+m", (short) (C1633zX.Xd() ^ (1355346890 ^ (-1355340773))), (short) (C1633zX.Xd() ^ ((399010860 ^ 1589714201) ^ (-1225347863))));
                    try {
                        Class<?> cls4 = Class.forName(strWd);
                        Field field4 = 0 != 0 ? cls4.getField(strXd) : cls4.getDeclaredField(strXd);
                        field4.setAccessible(true);
                        field4.set(null, bArr);
                    } catch (Throwable th4) {
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(C1626yg.Ud("p\u0011\u001d]^", (short) (Od.Xd() ^ (2078948131 ^ (-2078939196))), (short) (Od.Xd() ^ ((1081173663 ^ 487856837) ^ (-1566912856))))).getDeclaredMethod(Ig.wd("V+", (short) (C1580rY.Xd() ^ (1026807746 ^ (-1026786354)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        long jLongValue2 = ((Long) declaredMethod4.invoke(null, objArr4)).longValue();
                        String strOd = EO.Od("EzQ\u00107", (short) (C1633zX.Xd() ^ (1753254945 ^ (-1753253418))));
                        String strQd = C1561oA.Qd("ew", (short) (Od.Xd() ^ (1142988080 ^ (-1142985747))));
                        Long lValueOf = Long.valueOf(jLongValue2);
                        try {
                            Class<?> cls5 = Class.forName(strOd);
                            Field field5 = 0 != 0 ? cls5.getField(strQd) : cls5.getDeclaredField(strQd);
                            field5.setAccessible(true);
                            field5.set(null, lValueOf);
                        } catch (Throwable th5) {
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String strZd = C1593ug.zd("\u0006t<YV", (short) (C1607wl.Xd() ^ ((159129470 ^ 1265739690) ^ 1108189960)), (short) (C1607wl.Xd() ^ (1926484127 ^ 1926477250)));
                        String strOd2 = C1561oA.od("7I", (short) (C1499aX.Xd() ^ (949826502 ^ (-949832842))));
                        try {
                            Class<?> cls6 = Class.forName(strZd);
                            Field field6 = 0 != 0 ? cls6.getField(strOd2) : cls6.getDeclaredField(strOd2);
                            field6.setAccessible(true);
                            obj = field6.get(null);
                        } catch (Throwable th6) {
                            obj = null;
                        }
                        if (jCurrentTimeMillis > ((Long) obj).longValue()) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            String strKd3 = C1561oA.Kd("XG\u000f,)", (short) (OY.Xd() ^ ((2145720048 ^ 592313511) ^ 1554553474)));
                            short sXd7 = (short) (C1633zX.Xd() ^ ((259837432 ^ 1484001790) ^ (-1460206304)));
                            short sXd8 = (short) (C1633zX.Xd() ^ (24197637 ^ (-24209945)));
                            int[] iArr4 = new int["]1".length()];
                            QB qb4 = new QB("]1");
                            int i5 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i5] = xuXd4.fK(((i5 * sXd8) ^ sXd7) + xuXd4.CK(iKK4));
                                i5++;
                            }
                            String str4 = new String(iArr4, 0, i5);
                            try {
                                Class<?> cls7 = Class.forName(strKd3);
                                Field field7 = 0 != 0 ? cls7.getField(str4) : cls7.getDeclaredField(str4);
                                field7.setAccessible(true);
                                obj2 = field7.get(null);
                            } catch (Throwable th7) {
                                obj2 = null;
                            }
                            jLongValue = (jCurrentTimeMillis2 - ((Long) obj2).longValue()) % (5836884629439913560L ^ 5845452803959153063L);
                        } else {
                            jLongValue = 0;
                        }
                        String strXd2 = C1561oA.Xd("\u0014\u0003Jgd", (short) (OY.Xd() ^ ((1174391627 ^ 1852268387) ^ 731427452)));
                        String strVd = Wg.vd(">*", (short) (OY.Xd() ^ (835356625 ^ 835360304)));
                        Long lValueOf2 = Long.valueOf(jLongValue);
                        try {
                            Class<?> cls8 = Class.forName(strXd2);
                            Field field8 = 0 != 0 ? cls8.getField(strVd) : cls8.getDeclaredField(strVd);
                            field8.setAccessible(true);
                            field8.set(null, lValueOf2);
                        } catch (Throwable th8) {
                        }
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

    private static void Kd(BF bf, long j2, LY ly) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (1398854201 ^ (-1398850983)));
        short sXd2 = (short) (Od.Xd() ^ ((2050107784 ^ 242887330) ^ (-1950881052)));
        int[] iArr = new int["\u0011\u007fG\\a".length()];
        QB qb = new QB("\u0011\u007fG\\a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[FB.Xd() ^ (432448247 ^ 1177144774)];
        int iXd = C1499aX.Xd() ^ (-1134263458);
        clsArr[0] = Class.forName(Jg.Wd("rX\u0015+f", (short) (ZN.Xd() ^ (1039006715 ^ 1038978001)), (short) (ZN.Xd() ^ iXd)));
        clsArr[1] = Long.TYPE;
        Object[] objArr = new Object[(874145827 ^ 1618256530) ^ 1416546995];
        objArr[0] = ly;
        objArr[1] = Long.valueOf(j2);
        Method method = cls.getMethod(ZO.xd("4\u0017", (short) (Od.Xd() ^ (FB.Xd() ^ (1942184826 ^ (-741093578)))), (short) (Od.Xd() ^ (2091689932 ^ (-2091701695)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(bf, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int Qe() {
        return 2031766861 ^ 2031766859;
    }

    public static int Ue() {
        return (63245713 ^ 171602349) ^ 167738430;
    }

    private static long Xd() {
        return (7937293061038569834L ^ 1479360536842002276L) ^ 8836434143737439758L;
    }

    private static void Yd(TK tk, LY ly) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("$\u0011V{q", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849964086)))));
        Class<?>[] clsArr = {Class.forName(C1561oA.yd("\u0003q5Tf", (short) (Od.Xd() ^ (2038472302 ^ (-2038489759)))))};
        Object[] objArr = {ly};
        short sXd = (short) (ZN.Xd() ^ (998313587 ^ 998340713));
        int[] iArr = new int["kC".length()];
        QB qb = new QB("kC");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(tk, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static byte[] od(List<BF> list, List<TK> list2, byte[] bArr) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if (list.isEmpty()) {
            return null;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Qg.kd("'\u0014Yv\u0003", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609507442)), (short) (ZN.Xd() ^ ((823287924 ^ 22819955) ^ 810433233)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            LY ly = (LY) constructor.newInstance(objArr);
            BF bf = list.get(0);
            String strVd = hg.Vd("\u001b\bM`c", (short) (C1633zX.Xd() ^ ((1389869007 ^ 697365054) ^ (-2068280038))), (short) (C1633zX.Xd() ^ (2016246823 ^ (-2016223794))));
            String strUd = C1561oA.ud("\u0017\u0003", (short) (Od.Xd() ^ ((457515525 ^ 1115536661) ^ (-1496888929))));
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(bf);
            } catch (Throwable th) {
                obj = null;
            }
            long jLongValue = ((Long) obj).longValue();
            String strYd = C1561oA.yd("-\u001a_z}", (short) (C1499aX.Xd() ^ ((1093572939 ^ 1011117721) ^ (-2104133827))));
            short sXd = (short) (C1633zX.Xd() ^ ((500124093 ^ 1577157807) ^ (-1137613504)));
            int[] iArr = new int["Th".length()];
            QB qb = new QB("Th");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls2 = Class.forName(strYd);
                Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            long jLongValue2 = jLongValue - ((Long) obj2).longValue();
            if (jLongValue2 < 0) {
                jLongValue2 = 0;
            }
            int size = list.size();
            int size2 = list2.size();
            Class<?> cls3 = Class.forName(Xg.qd("`O\u001741", (short) (C1607wl.Xd() ^ ((2013022096 ^ 212298240) ^ 2069589895)), (short) (C1607wl.Xd() ^ ((1466966831 ^ 802950719) ^ 2024544500))));
            Class<?>[] clsArr = new Class[(1003133643 ^ 1200305535) ^ 2084679601];
            clsArr[0] = byte[].class;
            clsArr[1] = Long.TYPE;
            clsArr[(794379168 ^ 1620179817) ^ 1338554571] = Integer.TYPE;
            clsArr[1571372395 ^ 1571372392] = Integer.TYPE;
            clsArr[1324629026 ^ 1324629030] = Class.forName(Jg.Wd("NbxjH", (short) (C1499aX.Xd() ^ ((2065185376 ^ 2026789557) ^ (-64357005))), (short) (C1499aX.Xd() ^ (1608122237 ^ (-1608103810)))));
            Object[] objArr2 = new Object[900102822 ^ 900102819];
            objArr2[0] = bArr;
            objArr2[1] = Long.valueOf(jLongValue2);
            objArr2[(249282895 ^ 419465481) ^ 400246852] = Integer.valueOf(size);
            objArr2[(882104546 ^ 1834344418) ^ 1506150147] = Integer.valueOf(size2);
            objArr2[(681756399 ^ 1512416756) ^ 1921475359] = ly;
            short sXd2 = (short) (Od.Xd() ^ (1863859866 ^ (-1863844647)));
            short sXd3 = (short) (Od.Xd() ^ ((1991963174 ^ 1662298798) ^ (-363728991)));
            int[] iArr2 = new int["9\"".length()];
            QB qb2 = new QB("9\"");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            Method declaredMethod = cls3.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr2);
                for (BF bf2 : list) {
                    String strUd2 = C1626yg.Ud("k@Gy\u0002", (short) (C1607wl.Xd() ^ ((337857433 ^ 394997379) ^ 61371841)), (short) (C1607wl.Xd() ^ ((436688500 ^ 1121507808) ^ 1491068423)));
                    String strWd = Ig.wd("s(", (short) (Od.Xd() ^ (341985609 ^ (-341988463))));
                    try {
                        Class<?> cls4 = Class.forName(strUd2);
                        Field field3 = 1 != 0 ? cls4.getField(strWd) : cls4.getDeclaredField(strWd);
                        field3.setAccessible(true);
                        obj3 = field3.get(bf2);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    long jLongValue3 = ((Long) obj3).longValue();
                    String strOd = EO.Od("u,FD\n", (short) (C1607wl.Xd() ^ ((655953535 ^ 1372941956) ^ 1993099564)));
                    String strQd = C1561oA.Qd("1C", (short) (ZN.Xd() ^ (1916236197 ^ 1916224328)));
                    try {
                        Class<?> cls5 = Class.forName(strOd);
                        Field field4 = 0 != 0 ? cls5.getField(strQd) : cls5.getDeclaredField(strQd);
                        field4.setAccessible(true);
                        obj4 = field4.get(null);
                    } catch (Throwable th4) {
                        obj4 = null;
                    }
                    long jLongValue4 = (jLongValue3 - ((Long) obj4).longValue()) - jLongValue2;
                    if (jLongValue4 < 0) {
                        jLongValue4 = 0;
                    }
                    Class<?> cls6 = Class.forName(C1593ug.zd("fU\u001d:7", (short) (C1580rY.Xd() ^ ((852998723 ^ 1463172176) ^ (-1709301909))), (short) (C1580rY.Xd() ^ ((1329202109 ^ 849594911) ^ (-2107237961)))));
                    Class<?>[] clsArr2 = new Class[(1780648612 ^ 1408131703) ^ 969730256];
                    clsArr2[0] = Class.forName(C1561oA.od("gT\u001a-0", (short) (OY.Xd() ^ ((1786723153 ^ 869499454) ^ 1504485164))));
                    clsArr2[1] = Long.TYPE;
                    int i4 = 941376954 ^ 941376952;
                    short sXd4 = (short) (Od.Xd() ^ (1049991487 ^ (-1049988123)));
                    int[] iArr3 = new int["\u0016\u0005Lky".length()];
                    QB qb3 = new QB("\u0016\u0005Lky");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i5));
                        i5++;
                    }
                    clsArr2[i4] = Class.forName(new String(iArr3, 0, i5));
                    Object[] objArr3 = new Object[(739758372 ^ 890407885) ^ 419781354];
                    objArr3[0] = bf2;
                    objArr3[1] = Long.valueOf(jLongValue4);
                    objArr3[(1341290587 ^ 1622782178) ^ 793495739] = ly;
                    Method declaredMethod2 = cls6.getDeclaredMethod(Wg.Zd("\u0019{", (short) (FB.Xd() ^ (1190725101 ^ 1190743606)), (short) (FB.Xd() ^ ((1243260845 ^ 1168657979) ^ 263384707))), clsArr2);
                    try {
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(null, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                for (TK tk : list2) {
                    Class<?> cls7 = Class.forName(C1561oA.Xd("5$k\t\u0006", (short) (FB.Xd() ^ ((1229459727 ^ 332992225) ^ 1519484158))));
                    Class<?>[] clsArr3 = new Class[(1725020078 ^ 110102385) ^ 1614917853];
                    short sXd5 = (short) (FB.Xd() ^ (1308635459 ^ 1308637873));
                    int[] iArr4 = new int["m\\ G;".length()];
                    QB qb4 = new QB("m\\ G;");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK((sXd5 ^ i6) + xuXd4.CK(iKK4));
                        i6++;
                    }
                    clsArr3[0] = Class.forName(new String(iArr4, 0, i6));
                    short sXd6 = (short) (FB.Xd() ^ ((1015582335 ^ 1228358358) ^ 1975508393));
                    short sXd7 = (short) (FB.Xd() ^ ((1543351174 ^ 923796713) ^ 1827534736));
                    int[] iArr5 = new int["\u0005q7T`".length()];
                    QB qb5 = new QB("\u0005q7T`");
                    int i7 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i7] = xuXd5.fK(((sXd6 + i7) + xuXd5.CK(iKK5)) - sXd7);
                        i7++;
                    }
                    clsArr3[1] = Class.forName(new String(iArr5, 0, i7));
                    Object[] objArr4 = new Object[(2112367515 ^ 2141248789) ^ 38336140];
                    objArr4[0] = tk;
                    objArr4[1] = ly;
                    Method declaredMethod3 = cls7.getDeclaredMethod(hg.Vd("[e", (short) (FB.Xd() ^ (304347639 ^ 304341632)), (short) (FB.Xd() ^ (92541339 ^ 92551789))), clsArr3);
                    try {
                        declaredMethod3.setAccessible(true);
                        declaredMethod3.invoke(null, objArr4);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                return ly.toByteArray();
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static void ud(byte[] bArr, long j2, int i2, int i3, LY ly) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String strUd = C1626yg.Ud("ox\rtu", (short) (FB.Xd() ^ ((910982839 ^ 1215035939) ^ 2116529759)), (short) (FB.Xd() ^ ((382685131 ^ 1440608215) ^ 1125305402)));
        short sXd = (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (436451333 ^ (-1503181711))));
        int[] iArr = new int["*f".length()];
        QB qb = new QB("*f");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd + i4)));
            i4++;
        }
        String str = new String(iArr, 0, i4);
        try {
            Class<?> cls = Class.forName(strUd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        ly.write((byte[]) obj);
        long j3 = 1468773526095522095L ^ 1468773526095522091L;
        Class<?> cls2 = Class.forName(EO.Od("\u0015[$^\u0004", (short) (C1499aX.Xd() ^ ((942851519 ^ 491940915) ^ (-627103205)))));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(j3)};
        Method method = cls2.getMethod(C1561oA.Qd("0(", (short) (OY.Xd() ^ ((98567587 ^ 617520826) ^ 556718552))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(ly, objArr);
            Class<?> cls3 = Class.forName(C1593ug.zd("\u0002p8We", (short) (ZN.Xd() ^ (1070286061 ^ 1070272009)), (short) (ZN.Xd() ^ ((1300697200 ^ 1094907483) ^ 214280574))));
            Class<?>[] clsArr2 = {Long.TYPE};
            Object[] objArr2 = {Long.valueOf(j3)};
            Method method2 = cls3.getMethod(C1561oA.od(">6", (short) (Od.Xd() ^ (1243984962 ^ (-1244001771)))), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(ly, objArr2);
                short sXd2 = (short) (ZN.Xd() ^ ((586194319 ^ 2143615076) ^ 1563716500));
                int[] iArr2 = new int["[J\u0012/,".length()];
                QB qb2 = new QB("[J\u0012/,");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i5));
                    i5++;
                }
                String str2 = new String(iArr2, 0, i5);
                String strZd = Wg.Zd("++", (short) (C1607wl.Xd() ^ ((556314503 ^ 372818201) ^ 923817118)), (short) (C1607wl.Xd() ^ ((1733233601 ^ 895226829) ^ 1377000757)));
                try {
                    Class<?> cls4 = Class.forName(str2);
                    Field field2 = 0 != 0 ? cls4.getField(strZd) : cls4.getDeclaredField(strZd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                long jIntValue = ((Integer) obj2).intValue();
                short sXd3 = (short) (C1499aX.Xd() ^ (1081154456 ^ (-1081153367)));
                int[] iArr3 = new int["0\u001ff\u0006\u0014".length()];
                QB qb3 = new QB("0\u001ff\u0006\u0014");
                int i6 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i6));
                    i6++;
                }
                Class<?> cls5 = Class.forName(new String(iArr3, 0, i6));
                Class<?>[] clsArr3 = {Long.TYPE};
                Object[] objArr3 = {Long.valueOf(jIntValue)};
                short sXd4 = (short) (ZN.Xd() ^ (461556259 ^ 461538792));
                int[] iArr4 = new int["LF".length()];
                QB qb4 = new QB("LF");
                int i7 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i7] = xuXd4.fK((sXd4 ^ i7) + xuXd4.CK(iKK4));
                    i7++;
                }
                Method method3 = cls5.getMethod(new String(iArr4, 0, i7), clsArr3);
                try {
                    method3.setAccessible(true);
                    method3.invoke(ly, objArr3);
                    String strKd = Qg.kd("{h.ID", (short) (Od.Xd() ^ ((242363640 ^ 1841711301) ^ (-1672746150))), (short) (Od.Xd() ^ (372921855 ^ (-372900288))));
                    String strVd = hg.Vd("p^", (short) (C1607wl.Xd() ^ (805771432 ^ 805773458)), (short) (C1607wl.Xd() ^ ((932085334 ^ 1724879355) ^ 1363277875)));
                    try {
                        Class<?> cls6 = Class.forName(strKd);
                        Field field3 = 0 != 0 ? cls6.getField(strVd) : cls6.getDeclaredField(strVd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    long jIntValue2 = ((Integer) obj3).intValue();
                    Class<?> cls7 = Class.forName(C1561oA.ud("mZ =I", (short) (ZN.Xd() ^ (505074467 ^ 505077621))));
                    Class<?>[] clsArr4 = {Long.TYPE};
                    Object[] objArr4 = {Long.valueOf(jIntValue2)};
                    Method method4 = cls7.getMethod(C1561oA.yd("!\u0019", (short) (Od.Xd() ^ (523653724 ^ (-523646444)))), clsArr4);
                    try {
                        method4.setAccessible(true);
                        method4.invoke(ly, objArr4);
                        String strYd = C1561oA.Yd("H7~\u001c\u0019", (short) (C1633zX.Xd() ^ (1219328839 ^ (-1219311419))));
                        String strQd = Xg.qd("\u000e\u0004", (short) (FB.Xd() ^ ((759495397 ^ 1517717636) ^ 1999775716)), (short) (FB.Xd() ^ ((618947228 ^ 179384203) ^ 777352443)));
                        try {
                            Class<?> cls8 = Class.forName(strYd);
                            Field field4 = 0 != 0 ? cls8.getField(strQd) : cls8.getDeclaredField(strQd);
                            field4.setAccessible(true);
                            obj4 = field4.get(null);
                        } catch (Throwable th4) {
                            obj4 = null;
                        }
                        long jIntValue3 = ((Integer) obj4).intValue();
                        Class<?> cls9 = Class.forName(Jg.Wd("7kiy}", (short) (ZN.Xd() ^ ((907031811 ^ 657099184) ^ 289058843)), (short) (ZN.Xd() ^ (277989554 ^ 277991156))));
                        Class<?>[] clsArr5 = {Long.TYPE};
                        Object[] objArr5 = {Long.valueOf(jIntValue3)};
                        Method method5 = cls9.getMethod(ZO.xd("#Y", (short) (C1499aX.Xd() ^ ((1457427437 ^ 1139065483) ^ (-356151154))), (short) (C1499aX.Xd() ^ ((520343730 ^ 224924483) ^ (-309036336)))), clsArr5);
                        try {
                            method5.setAccessible(true);
                            method5.invoke(ly, objArr5);
                            String strUd2 = C1626yg.Ud("\n]\u0007\u0001\u0013", (short) (OY.Xd() ^ (1487732754 ^ 1487744213)), (short) (OY.Xd() ^ (821055144 ^ 821049483)));
                            String strWd = Ig.wd("Qk", (short) (C1607wl.Xd() ^ (1450131222 ^ 1450118488)));
                            try {
                                Class<?> cls10 = Class.forName(strUd2);
                                Field field5 = 0 != 0 ? cls10.getField(strWd) : cls10.getDeclaredField(strWd);
                                field5.setAccessible(true);
                                obj5 = field5.get(null);
                            } catch (Throwable th5) {
                                obj5 = null;
                            }
                            long jLongValue = ((Long) obj5).longValue();
                            short sXd5 = (short) (C1580rY.Xd() ^ ((455017814 ^ 1492838733) ^ (-1139119270)));
                            int[] iArr5 = new int["\u0004\u0019OT\f".length()];
                            QB qb5 = new QB("\u0004\u0019OT\f");
                            int i8 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i8] = xuXd5.fK((C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i8)) + xuXd5.CK(iKK5));
                                i8++;
                            }
                            Class<?> cls11 = Class.forName(new String(iArr5, 0, i8));
                            Class<?>[] clsArr6 = {Long.TYPE};
                            Object[] objArr6 = {Long.valueOf(jLongValue)};
                            Method method6 = cls11.getMethod(C1561oA.Qd("!\u0019", (short) (C1580rY.Xd() ^ ((1978054373 ^ 1200095309) ^ (-846108397)))), clsArr6);
                            try {
                                method6.setAccessible(true);
                                method6.invoke(ly, objArr6);
                                ly.write(bArr);
                                short sXd6 = (short) (C1580rY.Xd() ^ (1257238956 ^ (-1257234031)));
                                short sXd7 = (short) (C1580rY.Xd() ^ ((1218542868 ^ 297041286) ^ (-1494578769)));
                                int[] iArr6 = new int["q`(GU".length()];
                                QB qb6 = new QB("q`(GU");
                                int i9 = 0;
                                while (qb6.YK()) {
                                    int iKK6 = qb6.KK();
                                    Xu xuXd6 = Xu.Xd(iKK6);
                                    iArr6[i9] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd6 + i9)) - sXd7);
                                    i9++;
                                }
                                Class<?> cls12 = Class.forName(new String(iArr6, 0, i9));
                                Class<?>[] clsArr7 = {Long.TYPE};
                                Object[] objArr7 = {Long.valueOf(j2)};
                                Method method7 = cls12.getMethod(C1561oA.od("sk", (short) (OY.Xd() ^ (35639224 ^ 35620650))), clsArr7);
                                try {
                                    method7.setAccessible(true);
                                    method7.invoke(ly, objArr7);
                                    Class<?> cls13 = Class.forName(C1561oA.Kd(",\u001bb\u0002\u0010", (short) (ZN.Xd() ^ (414534939 ^ 414534095))));
                                    Class<?>[] clsArr8 = {Long.TYPE};
                                    Object[] objArr8 = {Long.valueOf(i2)};
                                    Method method8 = cls13.getMethod(Wg.Zd("\u007f>", (short) (Od.Xd() ^ ((1815751349 ^ 724599487) ^ (-1191884125))), (short) (Od.Xd() ^ ((855208108 ^ 366251381) ^ (-657316027)))), clsArr8);
                                    try {
                                        method8.setAccessible(true);
                                        method8.invoke(ly, objArr8);
                                        Class<?> cls14 = Class.forName(C1561oA.Xd("wf.M[", (short) (C1580rY.Xd() ^ ((1169071855 ^ 1714670194) ^ (-597503009)))));
                                        Class<?>[] clsArr9 = {Long.TYPE};
                                        Object[] objArr9 = {Long.valueOf(i3)};
                                        Method method9 = cls14.getMethod(Wg.vd("qk", (short) (FB.Xd() ^ ((912215075 ^ 992959227) ^ 225474224))), clsArr9);
                                        try {
                                            method9.setAccessible(true);
                                            method9.invoke(ly, objArr9);
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
                        } catch (InvocationTargetException e6) {
                            throw e6.getCause();
                        }
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                } catch (InvocationTargetException e8) {
                    throw e8.getCause();
                }
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        } catch (InvocationTargetException e10) {
            throw e10.getCause();
        }
    }

    public static int ue() {
        return 0;
    }
}
