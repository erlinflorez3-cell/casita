package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.aQ */
/* JADX INFO: loaded from: classes9.dex */
public class C1498aQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        C1523gX.Kd = Wg.vd("W]Ye", (short) (C1580rY.Xd() ^ (824993918 ^ (-824994056))));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd(":'l\u001f\u000e", (short) (C1633zX.Xd() ^ (1364724193 ^ (-1364726559))), (short) (C1633zX.Xd() ^ ((1693289159 ^ 602190077) ^ (-1191779186))))).getDeclaredMethod(hg.Vd("5\u001e", (short) (Od.Xd() ^ (FB.Xd() ^ (508576121 ^ (-1103054108)))), (short) (Od.Xd() ^ (ZN.Xd() ^ (-864706284)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            String strUd = C1561oA.ud("\u0011\u000e\u0010", (short) (Od.Xd() ^ ((549331203 ^ 1120823480) ^ (-1651520146))));
            int i2 = Integer.parseInt(strUd);
            while (C1593ug.Ud(i2)) {
                for (int i3 = i2; i3 < strUd.length() - 8; i3++) {
                    if (Jg.YX(i3) || Jg.YX(C1537jK.Kd)) {
                        C1603vu.Xd -= JX.Kd;
                    }
                }
                if (i2 <= strUd.length() || i2 >= 0) {
                    break;
                }
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.yd("_L\u0012D;", (short) (ZN.Xd() ^ (1077170579 ^ 1077167728)))).getDeclaredMethod(C1561oA.Yd("1'", (short) (C1499aX.Xd() ^ ((1692983861 ^ 987961939) ^ (-1577837888)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                int i4 = C1617xo.Xd + C1546kX.Xd;
                float f2 = (IK.Kd * i4) + i4;
                NX.Xd = NX.Xd;
                JX.Kd = i4 - ((XN.Kd * 2) - C1537jK.Kd);
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(Xg.qd("O>\u0006:+", (short) (ZN.Xd() ^ (1270889809 ^ 1270881764)), (short) (ZN.Xd() ^ ((523632556 ^ 1974012821) ^ 1788646067)))).getDeclaredMethod(Jg.Wd("\u001e.", (short) (FB.Xd() ^ ((1487359867 ^ 2110871741) ^ 628521398)), (short) (FB.Xd() ^ (344729696 ^ 344731723))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    if (Wg.oX(ZO.xd("*i-\u007fS\u000b/|`B\u001b\u0006dwYl\\`", (short) (C1607wl.Xd() ^ (560688256 ^ 560668596)), (short) (C1607wl.Xd() ^ (575586639 ^ 575593163))))) {
                        C1587uA.Kd = "";
                        C1526hF.Xd = 0;
                        C1603vu.Xd = 0.0f;
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(C1626yg.Ud("Eu{Tz", (short) (C1499aX.Xd() ^ ((2143884551 ^ 299634642) ^ (-1846873974))), (short) (C1499aX.Xd() ^ (1578479771 ^ (-1578476161))))).getDeclaredMethod(Ig.wd("z>", (short) (C1580rY.Xd() ^ ((192611186 ^ 1907974010) ^ (-2059553046)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        Xg.ud(C1603vu.Xd);
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(EO.Od("n\u001e\u0015[oz\u0015\u001a\u007fLYN\u0003)NFi\u001a>-]$\u001b\r{Q", (short) (C1633zX.Xd() ^ ((2086290436 ^ 1087050645) ^ (-1016147687))))).getConstructor(new Class[0]);
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

    public C1498aQ() {
        for (int i2 = (1298700482 ^ 92389626) ^ 1223252016; i2 > 0; i2 -= 4) {
            EO.Xd(i2);
        }
    }

    public static void Od() throws Exception {
        StringBuilder sbAppend = new StringBuilder().append(C1537jK.Yd);
        short sXd = (short) (FB.Xd() ^ (2000467867 ^ 2000479031));
        int[] iArr = new int["]W:ZWMQI".length()];
        QB qb = new QB("]W:ZWMQI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        if (sbAppend.append(new String(iArr, 0, i2)).toString().length() >= 0 && Ug.BX(C1537jK.Yd)) {
            C1617xo.Xd = 0;
        }
        CX.ud();
        C1598vY.Kd = String.valueOf(XN.Kd % 10);
        C1498aQ c1498aQ = new C1498aQ();
        int i3 = ud;
        int i4 = od;
        if (C1544kF.Kd == null) {
            Xg.Kd.replaceAll(C1561oA.yd("\u0012\u0011\u0014a\\\u000f\u0012", (short) (C1633zX.Xd() ^ (865355618 ^ (-865343852)))), C1561oA.Yd("%+\"$8", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (74362744 ^ (-937732006))))));
        }
        c1498aQ.yK(i3, i4);
    }

    public static String Qd() {
        return C1561oA.Qd("\u007fl2dS", (short) (Od.Xd() ^ (770882688 ^ (-770875961))));
    }

    public static int Xd() {
        return 1541270370 ^ 1541270366;
    }

    public static int od() {
        return 106565228 ^ 106565128;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        IK.Yd = Xg.qd("284@", (short) (C1607wl.Xd() ^ (1572427415 ^ 1572410745)), (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (1222015907 ^ (-2036299038)))));
        if (!z2) {
            C1587uA.Kd = EO.Od("8\u000b\u001a?", (short) (Od.Xd() ^ (1755902174 ^ (-1755895370))));
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Qd("M:\u007f2!", (short) (OY.Xd() ^ ((93460563 ^ 548879137) ^ 623189962)))).getDeclaredMethod(C1593ug.zd("z\u000f", (short) (FB.Xd() ^ ((2071985024 ^ 447811493) ^ 1640955322)), (short) (FB.Xd() ^ ((2050243697 ^ 777140915) ^ 1416001408))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                String str = (String) declaredMethod.invoke(null, objArr);
                int i2 = XN.Kd + NX.Xd;
                float f2 = (C1546kX.Xd * i2) + i2;
                C1617xo.Xd = C1620yF.Xd;
                JN.Xd = i2 - ((C1526hF.Xd * 2) - IK.Kd);
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.od("5\"g\u001a\t", (short) (C1607wl.Xd() ^ (303696999 ^ 303707382)))).getDeclaredMethod(C1561oA.Kd("\u0015\u0001", (short) (FB.Xd() ^ ((1209758934 ^ 499519934) ^ 1440571823))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    String str2 = (String) declaredMethod2.invoke(null, objArr2);
                    Wg.kd(String.valueOf(JN.Xd));
                    CX.yd(str, str2);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        int i3 = 0;
        String strWd = Jg.Wd("\u000b]\u0002", (short) (C1580rY.Xd() ^ ((332930002 ^ 101753087) ^ (-365465897))), (short) (C1580rY.Xd() ^ (211005276 ^ (-211021309))));
        while (true) {
            if (!Ug.BX(C1544kF.Kd)) {
                break;
            }
            C1598vY.Kd = strWd;
            C1546kX.Xd = 0;
            C1603vu.Xd = 0.0f;
            i3 += C1537jK.Kd;
            if (i3 != strWd.length()) {
                Qg.od(i3);
                break;
            }
        }
        if (new StringBuilder().append(C1537jK.Yd).append(ZO.xd("#c\n\u0004=\u007f\u0010_", (short) (C1607wl.Xd() ^ (63292831 ^ 63307679)), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951466469))))).toString().length() >= 0 && Ug.BX(C1537jK.Yd)) {
            C1617xo.Xd = 0;
        }
        CX.ud();
        C1598vY.Kd = String.valueOf(XN.Kd % 10);
        C1498aQ c1498aQ = new C1498aQ();
        int i4 = ud;
        int i5 = od;
        if (C1544kF.Kd == null) {
            Xg.Kd.replaceAll(C1626yg.Ud("[\t\n>MH\\", (short) (C1499aX.Xd() ^ (1306344421 ^ (-1306336375))), (short) (C1499aX.Xd() ^ ((522195762 ^ 64325301) ^ (-485878229)))), Ig.wd("?\u0016[:[", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (2017203754 ^ 1236622659)))));
        }
        c1498aQ.yK(i4, i5);
        int i6 = C1546kX.Xd;
        while (C1593ug.Ud(i6)) {
            C1593ug.Qd(Integer.numberOfLeadingZeros(JK.Xd));
        }
    }

    public static int ud() {
        return FB.Xd() ^ 1609527079;
    }

    public static String yd() {
        short sXd = (short) (C1580rY.Xd() ^ ((640657206 ^ 1733240245) ^ (-1096871195)));
        short sXd2 = (short) (C1580rY.Xd() ^ ((1339595298 ^ 393611996) ^ (-1487834103)));
        int[] iArr = new int["\u0004\u001a".length()];
        QB qb = new QB("\u0004\u001a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static boolean zd() {
        return false;
    }

    @Override // yg.RY
    public void FK() throws Throwable {
        boolean z2 = yd;
        int i2 = C1617xo.Xd;
        while (C1593ug.Ud(i2)) {
            C1593ug.Qd(Integer.numberOfLeadingZeros(C1526hF.Xd));
        }
        if (z2) {
            for (int i3 = (988973257 ^ 783467317) ^ 339758072; i3 > 0; i3 -= 2) {
                C1626yg.Kd(i3);
            }
            int iXd = C1607wl.Xd() ^ (268921489 ^ 2118351169);
            if (C1537jK.Yd == null) {
                C1584tK.Kd.replaceAll(Wg.Zd("DP\b+ds,", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951479615))), (short) (OY.Xd() ^ ((1210275351 ^ 892662329) ^ 2098708313))), C1561oA.Xd("28/1E", (short) (ZN.Xd() ^ ((800234497 ^ 1415908664) ^ 2077739185))));
            }
            Class<?> cls = Class.forName(Wg.vd("dQ\u001bS:", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (1708012309 ^ (-295658189))))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(iXd)};
            int iXd2 = OY.Xd() ^ (-69947895);
            int iXd3 = Od.Xd() ^ (-1207813331);
            short sXd = (short) (Od.Xd() ^ iXd2);
            short sXd2 = (short) (Od.Xd() ^ iXd3);
            int[] iArr = new int["\u0001m".length()];
            QB qb = new QB("\u0001m");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
                i4++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i4), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                int i5 = C1620yF.Xd;
                String str = C1589uF.Xd;
                for (int i6 = 0; i6 < str.length(); i6 += 2) {
                    int length = str.length();
                    if (str == null) {
                        break;
                    }
                    C1587uA.Kd = str;
                    ZO.Od(str);
                    if (Wg.oX(str) || length >= 0) {
                        break;
                    }
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(hg.Vd("\u0003o5vV", (short) (OY.Xd() ^ (194363314 ^ 194369666)), (short) (OY.Xd() ^ ((1715621558 ^ 73719140) ^ 1646698751)))).getDeclaredMethod(C1561oA.ud("aU", (short) (C1633zX.Xd() ^ ((659673172 ^ 958544843) ^ (-510889005)))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(null, objArr2);
                    String str2 = C1584tK.Kd;
                    if (str2 != null) {
                        Qg.od(str2.indexOf((1709703773 ^ 762660756) ^ 1218266538));
                    }
                    QK();
                    Xg.ud(C1603vu.Xd);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        Tg.Yd(0.0f);
        if (C1623yX.Kd == null) {
            NX.Xd = 0;
        }
        boolean zUd = GF.ud();
        if (Xg.Kd == null) {
            IK.Kd = C1617xo.Xd + 1;
        }
        if (zUd) {
            return;
        }
        int i7 = Qd;
        SecureRandom secureRandom = wd;
        int iXd4 = OY.Xd() ^ (235007287 ^ 170583483);
        if (Qg.Zd(C1620yF.Xd)) {
            EO.Xd(Float.intBitsToFloat(OY.Xd() ^ 940105698));
        }
        int iNextInt = secureRandom.nextInt(iXd4);
        String str3 = C1584tK.Kd;
        if (str3 != null) {
            Qg.od(str3.indexOf(383108777 ^ 383108810));
        }
        if (i7 > iNextInt) {
            if (Wg.oX(C1537jK.Yd)) {
                C1537jK.Yd = C1623yX.Kd + C1561oA.yd("xhyx{rte", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951487660))));
            }
            int iXd5 = FB.Xd() ^ (436879533 ^ 1172647828);
            if (C1537jK.Yd == null) {
                C1584tK.Kd.replaceAll(C1561oA.Yd("ABC\u0013\u0014HI", (short) (C1607wl.Xd() ^ (576242871 ^ 576252314))), Xg.qd("AG>@T", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (2084241336 ^ (-1336990792)))), (short) (C1580rY.Xd() ^ (1415857767 ^ (-1415849126)))));
            }
            short sXd3 = (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (457282677 ^ (-1490732215))));
            short sXd4 = (short) (ZN.Xd() ^ (1009006264 ^ 1009007756));
            int[] iArr2 = new int[",H\u0019\u00053".length()];
            QB qb2 = new QB(",H\u0019\u00053");
            int i8 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - ((i8 * sXd4) ^ sXd3));
                i8++;
            }
            Class<?> cls2 = Class.forName(new String(iArr2, 0, i8));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf(iXd5)};
            Method declaredMethod3 = cls2.getDeclaredMethod(ZO.xd(",v", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849977373))), (short) (C1580rY.Xd() ^ (49793914 ^ (-49793763)))), clsArr2);
            try {
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(null, objArr3);
                int i9 = C1620yF.Xd;
                String str4 = C1589uF.Xd;
                for (int i10 = 0; i10 < str4.length(); i10 += 2) {
                    int length2 = str4.length();
                    if (str4 == null) {
                        break;
                    }
                    C1587uA.Kd = str4;
                    ZO.Od(str4);
                    if (Wg.oX(str4) || length2 >= 0) {
                        break;
                    }
                }
                Object[] objArr4 = new Object[0];
                Method declaredMethod4 = Class.forName(C1626yg.Ud("\"\u0019\u001e\"\u0016", (short) (C1580rY.Xd() ^ (1991112213 ^ (-1991098671))), (short) (C1580rY.Xd() ^ (592895818 ^ (-592878586))))).getDeclaredMethod(Ig.wd("A\b", (short) (C1499aX.Xd() ^ ((1765265581 ^ 1309506354) ^ (-658176878)))), new Class[0]);
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
