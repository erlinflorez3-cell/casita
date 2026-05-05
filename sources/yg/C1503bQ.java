package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.bQ */
/* JADX INFO: loaded from: classes9.dex */
public class C1503bQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        if (Qg.Zd(JN.Xd)) {
            EO.Xd(Float.intBitsToFloat(C1633zX.Xd() ^ (-1215476543)));
        }
        Class<?> cls = Class.forName(C1561oA.ud("}j0cQ", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (1490031501 ^ 746672703)))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1114164728 ^ 32755639)));
        int[] iArr = new int["eP".length()];
        QB qb = new QB("eP");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            if (IK.Yd == null) {
                C1537jK.Kd = JK.Xd + 1;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Yd("\u0006t<qa", (short) (FB.Xd() ^ ((478537365 ^ 358739515) ^ 165961356)))).getDeclaredMethod(Xg.qd("CP", (short) (C1633zX.Xd() ^ ((1913483551 ^ 1164964486) ^ (-929229721))), (short) (C1633zX.Xd() ^ (1050508427 ^ (-1050502233)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                C1537jK.Yd = Jg.Wd("Pd\u0011", (short) (OY.Xd() ^ ((1607926364 ^ 1813119307) ^ 868580753)), (short) (OY.Xd() ^ (735002393 ^ 735002090)));
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(ZO.xd("\u0005\u0001X2\u000b", (short) (C1499aX.Xd() ^ (562222846 ^ (-562202354))), (short) (C1499aX.Xd() ^ (765081373 ^ (-765098986))))).getDeclaredMethod(C1626yg.Ud("T<", (short) (OY.Xd() ^ (374177648 ^ 374169446)), (short) (OY.Xd() ^ ((1192988727 ^ 893566201) ^ 1918461437))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    Ug.vd(C1584tK.Kd);
                    short sXd2 = (short) (ZN.Xd() ^ (265359378 ^ 265366479));
                    int[] iArr2 = new int["1s\u0006%Q".length()];
                    QB qb2 = new QB("1s\u0006%Q");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                        i3++;
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(EO.Od("\u00105", (short) (Od.Xd() ^ (1470933338 ^ (-1470952817)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        (IK.Yd + C1561oA.Qd("rfremoi", (short) (FB.Xd() ^ ((574523315 ^ 1096606520) ^ 1667391942)))).length();
                        int iCeil = (int) Math.ceil(Math.abs((((double) C1603vu.Xd) * 4.0d) / 3.141d));
                        if (iCeil < 0) {
                            double d2 = -3.140000104904175d;
                            double dSin = Math.sin(JN.Xd);
                            double dCos = Math.cos(((double) JN.Xd) * 1.1d);
                            double dSin2 = Math.sin(Math.random());
                            while (true) {
                                if (d2 <= dCos && ((double) iCeil) * dSin < dSin2) {
                                    break;
                                }
                                C1598vY.Kd = C1593ug.zd("\u0001|a\u0004\u0003z\u0001z", (short) (C1633zX.Xd() ^ (2015180461 ^ (-2015169866))), (short) (C1633zX.Xd() ^ ((913940469 ^ 752252595) ^ (-447738000))));
                                d2 -= 1.0d;
                                if (dSin > d2) {
                                    JN.Xd = C1620yF.Xd + (C1584tK.Kd.length() * ((int) dSin2));
                                    break;
                                }
                            }
                        }
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(C1561oA.od("\t~\u0013|H\r}z\f\b}\b\f?ctq\u0003~p\\jvkur", (short) (FB.Xd() ^ ((851023109 ^ 884307128) ^ 101511075)))).getConstructor(new Class[0]);
                        try {
                            constructor.setAccessible(true);
                            wd = (SecureRandom) constructor.newInstance(objArr5);
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
    }

    public C1503bQ() {
        Wg.kd(String.valueOf(YX.Kd));
    }

    public static void Od() throws Exception {
        short sXd = (short) (FB.Xd() ^ (1426186808 ^ 1426184177));
        int[] iArr = new int["\u001b!\u0019%".length()];
        QB qb = new QB("\u001b!\u0019%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        C1598vY.Kd = new String(iArr, 0, i2);
        CX.ud();
        int i3 = 0;
        while (true) {
            if (i3 >= JN.Xd % 16 && i3 <= i3 + i3) {
                break;
            }
            String strYd = C1561oA.Yd("\u001e\u001e!$", (short) (C1633zX.Xd() ^ (1097785234 ^ (-1097783676))));
            float f2 = Float.parseFloat(strYd);
            Tg.Yd(f2);
            if (f2 > 0.0f || f2 < i3 * 5628 || Ug.BX(strYd)) {
                EO.Xd(f2);
            }
            i3 = i3 + 128 + 1;
        }
        C1503bQ c1503bQ = new C1503bQ();
        int i4 = ud;
        int i5 = od;
        if (Math.random() * Double.longBitsToDouble(C1580rY.Kd() ^ (6793178685961819434L ^ 2043414976163790539L)) < 0.0d) {
            Tg.Yd(IK.Kd * C1603vu.Xd);
        }
        c1503bQ.yK(i4, i5);
    }

    public static String Qd() {
        return C1561oA.Kd("|k3hX", (short) (C1607wl.Xd() ^ ((2095508135 ^ 782241234) ^ 1380379437)));
    }

    public static int Xd() {
        return 1738400610 ^ 1738400518;
    }

    public static int od() {
        return 288177124 ^ 288177112;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        C1603vu.Xd = C1584tK.Kd.length();
        if (z2) {
            float f2 = C1603vu.Xd;
            if (Math.random() == Math.ceil(f2)) {
                JX.Kd = (int) (C1537jK.Kd - ((Float.intBitsToFloat(OY.Xd() ^ (2136808915 ^ 997594427)) * f2) - JK.Xd));
            }
            C1598vY.Kd = Xg.qd("?EAM", (short) (FB.Xd() ^ (FB.Xd() ^ (72381915 ^ 1539268380))), (short) (FB.Xd() ^ (C1607wl.Xd() ^ (1472452537 ^ 965182905))));
            CX.ud();
            int i2 = 0;
            while (true) {
                if (i2 >= JN.Xd % 16 && i2 <= i2 + i2) {
                    break;
                }
                String strQd = C1561oA.Qd("\u0012\u0010\u0011\u0012", (short) (FB.Xd() ^ (482638100 ^ 482616147)));
                float f3 = Float.parseFloat(strQd);
                Tg.Yd(f3);
                if (f3 > 0.0f || f3 < i2 * 5628 || Ug.BX(strQd)) {
                    EO.Xd(f3);
                }
                i2 = i2 + 128 + 1;
            }
            C1503bQ c1503bQ = new C1503bQ();
            int i3 = ud;
            int i4 = od;
            if (Math.random() * Double.longBitsToDouble(FB.ud() ^ 4216636951080431411L) < 0.0d) {
                Tg.Yd(IK.Kd * C1603vu.Xd);
            }
            c1503bQ.yK(i3, i4);
            if (Wg.oX(C1598vY.Kd)) {
                C1523gX.Kd = C1544kF.Kd + Jg.Wd("8_BZ,,\u007f\n", (short) (OY.Xd() ^ ((1344500099 ^ 142048435) ^ 1481927093)), (short) (OY.Xd() ^ ((1260941139 ^ 922616472) ^ 2111204861)));
                return;
            }
            return;
        }
        if (Math.random() * Double.longBitsToDouble(551113159338037637L ^ 5187287500739252613L) < 0.0d) {
            switch (C1620yF.Xd) {
                case 1:
                    C1603vu.Xd += C1603vu.Xd;
                case 2:
                    C1603vu.Xd += C1603vu.Xd;
                case 3:
                    C1603vu.Xd -= C1603vu.Xd * Float.intBitsToFloat(C1607wl.Xd() ^ (111107386 ^ (-1462022432)));
                    break;
            }
        }
        Class<?> cls = Class.forName(ZO.xd("z\u001a!\u0005m", (short) (FB.Xd() ^ (297659669 ^ 297635779)), (short) (FB.Xd() ^ ((1814406438 ^ 241348115) ^ 1648830697))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (1532359712 ^ (-1759495699))));
        short sXd2 = (short) (C1633zX.Xd() ^ ((900425091 ^ 28988550) ^ (-873553738)));
        int[] iArr = new int[">r".length()];
        QB qb = new QB(">r");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i5 * sXd2))) + xuXd.CK(iKK));
            i5++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i5), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            switch (IK.Kd % 8) {
                case 0:
                    Ug.vd(Xg.Kd);
                    break;
                case 1:
                    Ig.qd(C1544kF.Kd);
                default:
                    Qg.od(0);
                    break;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Ig.wd("%M\u0004\u0012e", (short) (C1607wl.Xd() ^ (910198865 ^ 910198523)))).getDeclaredMethod(EO.Od("\f>", (short) (C1499aX.Xd() ^ (447248305 ^ (-447248012)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                if (Qg.Zd(C1620yF.Xd)) {
                    EO.Xd(0.01f);
                }
                CX.yd(str, str2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static int ud() {
        return 1741015552 ^ 1741015612;
    }

    public static String yd() {
        int iXd = C1499aX.Xd() ^ 1134248439;
        return Wg.Zd("\u0019z", (short) (C1633zX.Xd() ^ ((385764416 ^ 1218905682) ^ (-1582920541))), (short) (C1633zX.Xd() ^ iXd));
    }

    public static boolean zd() {
        return false;
    }

    @Override // yg.RY
    public void FK() throws Throwable {
        boolean z2 = yd;
        if (Math.random() * Double.longBitsToDouble((8346975869805677660L ^ 6832527576150729153L) ^ 7880571423989706141L) < 0.0d) {
            JX.Kd = JN.Xd - ((YX.Kd * 2) - JN.Xd);
        }
        if (z2) {
            if (Wg.oX(C1544kF.Kd)) {
                C1584tK.Kd = "";
            }
            C1537jK.Yd = String.valueOf(C1561oA.od("??AA", (short) (OY.Xd() ^ (FB.Xd() ^ 1609530648))));
            Class<?> cls = Class.forName(C1561oA.Kd("G6}8\u001d", (short) (C1580rY.Xd() ^ (1721143990 ^ (-1721146632)))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf((1956745335 ^ 1029031958) ^ 1240750187)};
            Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("Db", (short) (C1580rY.Xd() ^ (1809356882 ^ (-1809375175))), (short) (C1580rY.Xd() ^ (343188253 ^ (-343193302)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                switch (C1546kX.Xd % 8) {
                    case 0:
                        Ug.vd(C1598vY.Kd);
                        break;
                    case 1:
                        Ig.qd(C1523gX.Kd);
                    default:
                        Qg.od(0);
                        break;
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.Xd(")\u0018_t\u0005", (short) (FB.Xd() ^ (1699532563 ^ 1699544784)))).getDeclaredMethod(Wg.vd("9/", (short) (ZN.Xd() ^ (1505718527 ^ 1505704136))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(null, objArr2);
                    if (Qg.kd("\u0019", (short) (FB.Xd() ^ ((1047657766 ^ 766689166) ^ 331574091)), (short) (FB.Xd() ^ ((1993925084 ^ 155323239) ^ 2140858465))).length() < ((1009334688 ^ 321751907) ^ 788837082)) {
                        IK.Kd = XN.Kd + (r3.length() - 4);
                    }
                    QK();
                    int i2 = C1546kX.Xd;
                    while (C1593ug.Ud(Integer.lowestOneBit(JX.Kd)) && C1589uF.Xd.length() < 0) {
                        Xg.ud(i2);
                    }
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (C1598vY.Kd == null) {
            ZO.Od(IK.Yd);
        }
        if ((C1587uA.Kd + hg.Vd("A;\u001e>;15-", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (1048278006 ^ (-2111837331)))), (short) (FB.Xd() ^ (C1633zX.Xd() ^ (2005273550 ^ (-64449011)))))).length() >= 0 && Ug.BX(C1598vY.Kd)) {
            C1617xo.Xd = 0;
        }
        boolean zUd = GF.ud();
        int i3 = C1546kX.Xd;
        while (C1593ug.Ud(Integer.lowestOneBit(C1546kX.Xd)) && C1584tK.Kd.length() < 0) {
            Xg.ud(i3);
        }
        if (zUd) {
            return;
        }
        int i4 = Qd;
        SecureRandom secureRandom = wd;
        int iXd = C1607wl.Xd() ^ 1849955262;
        if (Qg.Zd(C1526hF.Xd)) {
            EO.Xd(Float.intBitsToFloat(C1633zX.Xd() ^ (-1215476543)));
        }
        int iNextInt = secureRandom.nextInt(iXd);
        int i5 = C1546kX.Xd;
        Jg.wd(i5);
        if (Qg.Zd(NX.Xd) && Jg.YX(i5)) {
            JK.Xd = 0;
            JX.Kd = 0;
            IK.Kd = 0;
        }
        if (i4 > iNextInt) {
            float f2 = C1603vu.Xd;
            if (Math.random() == Math.ceil(f2)) {
                JK.Xd = (int) (JX.Kd - ((Float.intBitsToFloat(ZN.Xd() ^ (2007695576 ^ 69287464)) * f2) - C1617xo.Xd));
            }
            C1537jK.Yd = String.valueOf(C1561oA.ud("~~\u0001\u0001", (short) (C1580rY.Xd() ^ (1421546168 ^ (-1421548635)))));
            Class<?> cls2 = Class.forName(C1561oA.yd("\u0012~D|g", (short) (FB.Xd() ^ ((1734308370 ^ 812404210) ^ 1462968672))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf((901634316 ^ 803486141) ^ 442097851)};
            short sXd = (short) (Od.Xd() ^ (C1580rY.Xd() ^ (254863296 ^ 1052350114)));
            int[] iArr = new int["RA".length()];
            QB qb = new QB("RA");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i6));
                i6++;
            }
            Method declaredMethod3 = cls2.getDeclaredMethod(new String(iArr, 0, i6), clsArr2);
            try {
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(null, objArr3);
                switch (C1546kX.Xd % 8) {
                    case 0:
                        Ug.vd(C1598vY.Kd);
                        break;
                    case 1:
                        Ig.qd(C1523gX.Kd);
                    default:
                        Qg.od(0);
                        break;
                }
                short sXd2 = (short) (Od.Xd() ^ (233088379 ^ (-233086016)));
                short sXd3 = (short) (Od.Xd() ^ (1930771788 ^ (-1930785938)));
                int[] iArr2 = new int["RA\t\u001e.".length()];
                QB qb2 = new QB("RA\t\u001e.");
                int i7 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i7] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i7)) + sXd3);
                    i7++;
                }
                Object[] objArr4 = new Object[0];
                Method declaredMethod4 = Class.forName(new String(iArr2, 0, i7)).getDeclaredMethod(Jg.Wd("pC", (short) (OY.Xd() ^ ((2071815043 ^ 343279070) ^ 1862992927)), (short) (OY.Xd() ^ ((779650424 ^ 2007750617) ^ 1507025118))), new Class[0]);
                try {
                    declaredMethod4.setAccessible(true);
                    declaredMethod4.invoke(null, objArr4);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }
}
