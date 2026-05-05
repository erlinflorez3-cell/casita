package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class vQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        String strZd = Wg.Zd(",-\u000ep", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (731118417 ^ (-437959149)))), (short) (FB.Xd() ^ ((1999274678 ^ 1170616210) ^ 854361728)));
        int i2 = Integer.parseInt(strZd);
        do {
            StringBuilder sb = new StringBuilder();
            short sXd = (short) (ZN.Xd() ^ (168430258 ^ 168431219));
            int[] iArr = new int["TUV\u000eW".length()];
            QB qb = new QB("TUV\u000eW");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                i3++;
            }
            String string = sb.append(new String(iArr, 0, i3)).append(C1623yX.Kd).toString();
            C1598vY.Kd = C1544kF.Kd + string + Wg.vd("\f", (short) (Od.Xd() ^ (1338067391 ^ (-1338049456))));
            if (string.length() >= 0) {
                break;
            }
            ZO.Od(string);
            i2--;
        } while (i2 > strZd.length());
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("^K\u0011X2", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134260795))), (short) (OY.Xd() ^ (982383496 ^ 982358380)))).getDeclaredMethod(hg.Vd(">'", (short) (OY.Xd() ^ (402894188 ^ 402914212)), (short) (OY.Xd() ^ (1597384395 ^ 1597404299))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            if (Ig.uX(C1584tK.Kd)) {
                Wg.kd(C1587uA.Kd);
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.ud("q^$kE", (short) (FB.Xd() ^ (481672639 ^ 481673455)))).getDeclaredMethod(C1561oA.yd("\u0019\u0007", (short) (OY.Xd() ^ ((88371908 ^ 676357716) ^ 756294857))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                Qg.od(0);
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(C1561oA.Yd("\"\u0011X\"}", (short) (Od.Xd() ^ ((1083018094 ^ 202175834) ^ (-1283542065))))).getDeclaredMethod(Xg.qd("~\f", (short) (Od.Xd() ^ (141460256 ^ (-141465912))), (short) (Od.Xd() ^ (1816063424 ^ (-1816047055)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    if (C1623yX.Kd.length() != 0 && Ig.uX(C1537jK.Yd)) {
                        C1603vu.Xd = r1.length();
                        C1537jK.Kd = 0;
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(Jg.Wd(";e\n\u0001j", (short) (OY.Xd() ^ ((234686226 ^ 1020308150) ^ 825067812)), (short) (OY.Xd() ^ (1199977230 ^ 1199991436)))).getDeclaredMethod(ZO.xd("I\u0012", (short) (Od.Xd() ^ (622991568 ^ (-623003288))), (short) (Od.Xd() ^ (1151310970 ^ (-1151329670)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        int i4 = IK.Kd;
                        while (C1593ug.Ud(Integer.lowestOneBit(JX.Kd)) && Xg.Kd.length() < 0) {
                            Xg.ud(i4);
                        }
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(C1626yg.Ud("{\u0004h\u0019Sl\u0012]<O\"na=hW\u0015bt\u000em3_;pH", (short) (C1580rY.Xd() ^ ((1864227528 ^ 1189123373) ^ (-704455226))), (short) (C1580rY.Xd() ^ (2069072023 ^ (-2069074571))))).getConstructor(new Class[0]);
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

    public vQ() {
        if (C1544kF.Kd.length() != 0) {
            C1603vu.Xd = r1.length();
        }
    }

    public static void Od() throws Exception {
        C1584tK.Kd = Wg.vd("<>9", (short) (ZN.Xd() ^ (1032728178 ^ 1032736823)));
        CX.ud();
        int i2 = 0;
        String strKd = Qg.kd("\u001c\u000e\u0019", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (112322714 ^ (-1760937982)))), (short) (C1580rY.Xd() ^ ((923188660 ^ 1613303053) ^ (-1462734190))));
        while (true) {
            if (!Ug.BX(Xg.Kd)) {
                break;
            }
            IK.Yd = strKd;
            NX.Xd = 0;
            C1603vu.Xd = 0.0f;
            i2 += IK.Kd;
            if (i2 != strKd.length()) {
                Qg.od(i2);
                break;
            }
        }
        vQ vQVar = new vQ();
        int i3 = ud;
        int i4 = od;
        if (Math.abs(JX.Kd) + 1 > NX.Xd * 2) {
            C1603vu.Xd = (float) (((double) C1603vu.Xd) * Double.longBitsToDouble((3399993439362078451L ^ 5391316060281908268L) ^ 6489353389138573503L));
            if (C1603vu.Xd > 0.0f) {
                C1603vu.Xd -= C1584tK.Kd.length();
            } else {
                C1603vu.Xd *= Float.intBitsToFloat(ZN.Xd() ^ (1794519597 ^ (-419689251)));
            }
        }
        vQVar.yK(i3, i4);
    }

    public static String Qd() {
        return Ig.wd("5[N5U", (short) (C1607wl.Xd() ^ ((1321526084 ^ 202258950) ^ 1120575114)));
    }

    public static int Xd() {
        return 2036171200 ^ 2036171260;
    }

    public static int od() {
        return 0;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        String str = C1537jK.Yd;
        if (str != null) {
            Qg.od(str.indexOf(1185384019 ^ 1185383984));
        }
        if (z2) {
            if (Qg.Zd(C1617xo.Xd) && C1593ug.Ud(0)) {
                Jg.wd(1);
                Jg.wd(1);
                Jg.wd(Xg.Kd.compareTo(hg.Vd("jjh^ffdZ", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134253182)), (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69950034))))));
            }
            C1584tK.Kd = C1561oA.ud("\f\f\t", (short) (Od.Xd() ^ ((584530386 ^ 757665217) ^ (-268306947))));
            CX.ud();
            int i2 = 0;
            String strYd = C1561oA.yd("\u001b\u000f\u001c", (short) (C1633zX.Xd() ^ (570256261 ^ (-570232730))));
            while (true) {
                if (!Ug.BX(Xg.Kd)) {
                    break;
                }
                IK.Yd = strYd;
                NX.Xd = 0;
                C1603vu.Xd = 0.0f;
                i2 += IK.Kd;
                if (i2 != strYd.length()) {
                    Qg.od(i2);
                    break;
                }
            }
            vQ vQVar = new vQ();
            int i3 = ud;
            int i4 = od;
            if (Math.abs(JX.Kd) + 1 > NX.Xd * 2) {
                C1603vu.Xd = (float) (((double) C1603vu.Xd) * Double.longBitsToDouble(C1607wl.Qd() ^ (5636499765545284053L ^ 5104028263694803055L)));
                if (C1603vu.Xd > 0.0f) {
                    C1603vu.Xd -= C1584tK.Kd.length();
                } else {
                    C1603vu.Xd *= Float.intBitsToFloat(C1607wl.Xd() ^ (883821038 ^ (-446031308)));
                }
            }
            vQVar.yK(i3, i4);
            String strYd2 = C1561oA.Yd("ihl", (short) (C1499aX.Xd() ^ ((510778806 ^ 1588935425) ^ (-1086622825))));
            int i5 = Integer.parseInt(strYd2);
            while (C1593ug.Ud(i5)) {
                for (int i6 = i5; i6 < strYd2.length() - 8; i6++) {
                    if (Jg.YX(i6) || Jg.YX(IK.Kd)) {
                        C1603vu.Xd -= NX.Xd;
                    }
                }
                if (i5 <= strYd2.length() || i5 >= 0) {
                    return;
                }
            }
            return;
        }
        int i7 = C1526hF.Xd;
        while (C1593ug.Ud(i7)) {
            C1593ug.Qd(Integer.numberOfLeadingZeros(NX.Xd));
        }
        Class<?> cls = Class.forName(Xg.qd("\fzB\fg", (short) (Od.Xd() ^ (850076437 ^ (-850099690))), (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134254394))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = OY.Xd() ^ (1961013907 ^ 1892265264);
        int iXd2 = C1633zX.Xd() ^ (233987527 ^ (-2040748651));
        short sXd = (short) (C1607wl.Xd() ^ iXd);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr = new int["k\"".length()];
        QB qb = new QB("k\"");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK(xuXd.CK(iKK) - ((i8 * sXd2) ^ sXd));
            i8++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i8), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            if (C1584tK.Kd == null) {
                while (C1593ug.Ud(IK.Kd)) {
                    Jg.YX(C1620yF.Xd);
                }
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(ZO.xd("(,\u0002Uj", (short) (OY.Xd() ^ (743394108 ^ 743403143)), (short) (OY.Xd() ^ (1406523035 ^ 1406517100)))).getDeclaredMethod(C1626yg.Ud("\u0011\f", (short) (C1580rY.Xd() ^ (693940003 ^ (-693948647))), (short) (C1580rY.Xd() ^ (962545055 ^ (-962549798)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str3 = (String) declaredMethod2.invoke(null, objArr2);
                for (int i9 = (495640147 ^ 1836217585) ^ 1895344810; i9 > 0; i9 -= 4) {
                    EO.Xd(i9);
                }
                CX.yd(str2, str3);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static int ud() {
        return 129054197 ^ 129054097;
    }

    public static String yd() {
        return EO.Od("nU", (short) (OY.Xd() ^ (2127770504 ^ 2127762108)));
    }

    public static boolean zd() {
        return false;
    }

    @Override // yg.RY
    public void FK() throws Exception {
        boolean z2 = yd;
        if (Qg.Zd(JN.Xd)) {
            EO.Xd(Float.intBitsToFloat((1670758759 ^ 144241033) ^ 1475932769));
        }
        if (z2) {
            C1626yg.Kd(C1603vu.Xd + C1603vu.Xd);
            Qg.od(new Float(C1603vu.Xd).intValue() % 34);
            int iXd = C1633zX.Xd() ^ (644522251 ^ (-1379648822));
            int i2 = YX.Kd;
            while (C1593ug.Ud(i2)) {
                C1593ug.Qd(Integer.numberOfLeadingZeros(C1537jK.Kd));
            }
            Class<?> cls = Class.forName(Ig.wd("\u0007&\u001d|~", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1005099133 ^ 2081759714)))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(iXd)};
            Method declaredMethod = cls.getDeclaredMethod(EO.Od("\u00174", (short) (FB.Xd() ^ (FB.Xd() ^ (189795239 ^ 1421832065)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                if (Math.random() * 100.0d < 0.0d) {
                    switch (C1546kX.Xd) {
                        case 1:
                            C1603vu.Xd += C1603vu.Xd;
                        case 2:
                            C1603vu.Xd += C1603vu.Xd;
                        case 3:
                            C1603vu.Xd -= C1603vu.Xd * (-2.0f);
                            break;
                    }
                }
                CX.ud();
                Tg.Yd(0.0f);
                Class<?> cls2 = Class.forName(C1561oA.Qd("\u0011}C\u0004d", (short) (C1633zX.Xd() ^ ((486373953 ^ 1313966203) ^ (-1387038502)))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (2045171440 ^ (-2045163416)));
                short sXd2 = (short) (C1633zX.Xd() ^ ((1143739836 ^ 410083849) ^ (-1549600713)));
                int[] iArr = new int["(5".length()];
                QB qb = new QB("(5");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                    i3++;
                }
                Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr, 0, i3), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    String str = (String) declaredMethod2.invoke(null, objArr2);
                    short sXd3 = (short) (C1607wl.Xd() ^ (441929691 ^ 441929192));
                    int[] iArr2 = new int["YYV".length()];
                    QB qb2 = new QB("YYV");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(sXd3 + sXd3 + i4 + xuXd2.CK(iKK2));
                        i4++;
                    }
                    Xg.Kd = new String(iArr2, 0, i4);
                    C1623yX.Kd = "" + C1523gX.Kd;
                    Object[] objArr3 = new Object[0];
                    Method declaredMethod3 = Class.forName(C1561oA.Kd("'\u0016] \u0003", (short) (FB.Xd() ^ (1572392 ^ 1571558)))).getDeclaredMethod(Wg.Zd("v)", (short) (C1607wl.Xd() ^ ((2040848424 ^ 205505380) ^ 1973114900)), (short) (C1607wl.Xd() ^ ((151351649 ^ 973201279) ^ 855938559))), new Class[0]);
                    try {
                        declaredMethod3.setAccessible(true);
                        String str2 = (String) declaredMethod3.invoke(null, objArr3);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= JN.Xd % 16 && i5 <= i5 + i5) {
                                Object[] objArr4 = new Object[0];
                                Constructor<?> constructor = Class.forName(C1561oA.Xd("+#9%r9,+><4@F{\"54GE9'7E<HG", (short) (Od.Xd() ^ ((914803652 ^ 1827260628) ^ (-1517230567))))).getConstructor(new Class[0]);
                                try {
                                    constructor.setAccessible(true);
                                    int iNextInt = ((SecureRandom) constructor.newInstance(objArr4)).nextInt(346249754 ^ 1801233893);
                                    Kp kp = new Kp(iNextInt, str, str2);
                                    int i6 = ((iNextInt ^ ((1167653435 ^ 2143923159) ^ 1001914022)) << 7) ^ 65;
                                    int i7 = 297583203 ^ 297583219;
                                    int i8 = Integer.parseInt(Wg.vd("hwujc", (short) (C1607wl.Xd() ^ ((1252913783 ^ 510792460) ^ 1423957842))), i7) ^ ((int) ((-1) - (((-1) - ((2514046698761908750L ^ 4180297868378410279L) ^ 1792668927784320982L)) | ((-1) - kp.getId()))));
                                    Class<?> cls3 = Class.forName(hg.Vd("ub(<P", (short) (C1499aX.Xd() ^ ((174267223 ^ 604744049) ^ (-778613231))), (short) (C1499aX.Xd() ^ ((391654714 ^ 2035227512) ^ (-1847011514)))));
                                    Class<?>[] clsArr3 = {Integer.TYPE};
                                    Object[] objArr5 = {Integer.valueOf(i8 + (((i8 << (Integer.parseInt(Qg.kd("\u0018\u001d'", (short) (C1633zX.Xd() ^ (2124546513 ^ (-2124555872))), (short) (C1633zX.Xd() ^ ((1433507205 ^ 1192976165) ^ (-308971728)))), i7) - 650)) + i8) * ((i8 << 2) + i8)))};
                                    Method declaredMethod4 = cls3.getDeclaredMethod(C1561oA.ud("cn", (short) (C1580rY.Xd() ^ ((1590566149 ^ 1557434346) ^ (-35317864)))), clsArr3);
                                    try {
                                        declaredMethod4.setAccessible(true);
                                        int iIntValue = (i6 ^ ((Integer) declaredMethod4.invoke(null, objArr5)).intValue()) ^ ((Integer.parseInt(C1561oA.yd("\f\r", (short) (C1607wl.Xd() ^ ((1817425140 ^ 1713371748) ^ 172765880))), i7) + 20) << ((byte) ((1141402404454448183L ^ 1141402404454448184L) & r14)));
                                        Class<?> cls4 = Class.forName(C1561oA.Yd("]L\u0014*@", (short) (C1607wl.Xd() ^ ((797490877 ^ 1021114651) ^ 324292112))));
                                        Class<?>[] clsArr4 = {Integer.TYPE};
                                        Object[] objArr6 = {Integer.valueOf(iIntValue)};
                                        short sXd4 = (short) (OY.Xd() ^ (1714876865 ^ 1714870284));
                                        short sXd5 = (short) (OY.Xd() ^ (976230401 ^ 976227227));
                                        int[] iArr3 = new int["\u0017$".length()];
                                        QB qb3 = new QB("\u0017$");
                                        int i9 = 0;
                                        while (qb3.YK()) {
                                            int iKK3 = qb3.KK();
                                            Xu xuXd3 = Xu.Xd(iKK3);
                                            iArr3[i9] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i9)) + sXd5);
                                            i9++;
                                        }
                                        Method declaredMethod5 = cls4.getDeclaredMethod(new String(iArr3, 0, i9), clsArr4);
                                        try {
                                            declaredMethod5.setAccessible(true);
                                            int iIntValue2 = ((Integer) declaredMethod5.invoke(null, objArr6)).intValue();
                                            synchronized (CX.Xd) {
                                                long id = kp.getId();
                                                StringBuilder sbAppend = new StringBuilder().append("").append(iIntValue2);
                                                String strWd = Jg.Wd("\u0012", (short) (FB.Xd() ^ ((757527461 ^ 1549434598) ^ 1903994412)), (short) (FB.Xd() ^ ((1443333713 ^ 318682322) ^ 1157198085)));
                                                StringBuilder sbAppend2 = new StringBuilder().append(sbAppend.append(strWd).toString());
                                                Class<?> cls5 = Class.forName(ZO.xd("G\u001e\\ab", (short) (FB.Xd() ^ ((1997518363 ^ 1799481197) ^ 474876973)), (short) (FB.Xd() ^ ((1699874759 ^ 1149197947) ^ 556603826))));
                                                Class<?>[] clsArr5 = {Integer.TYPE};
                                                Object[] objArr7 = {Integer.valueOf((int) id)};
                                                Method declaredMethod6 = cls5.getDeclaredMethod(C1626yg.Ud("9\u0012", (short) (Od.Xd() ^ ((390946307 ^ 820571631) ^ (-665158495))), (short) (Od.Xd() ^ ((1645822106 ^ 1959879664) ^ (-382207739)))), clsArr5);
                                                try {
                                                    declaredMethod6.setAccessible(true);
                                                    StringBuilder sbAppend3 = new StringBuilder().append((sbAppend2.append(((Integer) declaredMethod6.invoke(null, objArr7)).intValue()).append(strWd).toString() + str + strWd) + str2 + strWd);
                                                    long jLongValue = 0;
                                                    try {
                                                        Class<?> cls6 = Class.forName(Ig.wd("\u001cd\b\u001a71y~!'FvBQ\n3", (short) (C1607wl.Xd() ^ (1238653900 ^ 1238662611))));
                                                        short sXd6 = (short) (Od.Xd() ^ (316771222 ^ (-316793777)));
                                                        int[] iArr4 = new int["=\u001diGL\u0003+4)>2:\"%/O'".length()];
                                                        QB qb4 = new QB("=\u001diGL\u0003+4)>2:\"%/O'");
                                                        int i10 = 0;
                                                        while (qb4.YK()) {
                                                            int iKK4 = qb4.KK();
                                                            Xu xuXd4 = Xu.Xd(iKK4);
                                                            iArr4[i10] = xuXd4.fK((C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i10)) + xuXd4.CK(iKK4));
                                                            i10++;
                                                        }
                                                        jLongValue = ((Long) cls6.getMethod(new String(iArr4, 0, i10), new Class[0]).invoke(null, new Object[0])).longValue();
                                                    } catch (Exception e2) {
                                                    }
                                                    CX.Xd.add(CX.qd(sbAppend3.append(jLongValue).toString()));
                                                    kp.start();
                                                } catch (InvocationTargetException e3) {
                                                    throw e3.getCause();
                                                }
                                            }
                                            EO.Xd(C1603vu.Xd);
                                            QK();
                                            switch (JX.Kd % 8) {
                                                case 0:
                                                    Ug.vd(C1523gX.Kd);
                                                    return;
                                                case 1:
                                                    Ig.qd(C1537jK.Yd);
                                                    break;
                                            }
                                            Qg.od(0);
                                            return;
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
                            short sXd7 = (short) (FB.Xd() ^ ((558397696 ^ 1075001409) ^ 1633377056));
                            short sXd8 = (short) (FB.Xd() ^ ((607667658 ^ 17166561) ^ 624807071));
                            int[] iArr5 = new int["r\u0012$~".length()];
                            QB qb5 = new QB("r\u0012$~");
                            int i11 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i11] = xuXd5.fK(((i11 * sXd8) ^ sXd7) + xuXd5.CK(iKK5));
                                i11++;
                            }
                            String str3 = new String(iArr5, 0, i11);
                            float f2 = Float.parseFloat(str3);
                            Tg.Yd(f2);
                            if (f2 > 0.0f || f2 < i5 * 5628 || Ug.BX(str3)) {
                                EO.Xd(f2);
                            }
                            i5 = i5 + 128 + 1;
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
        } else {
            String str4 = C1523gX.Kd;
            if (str4.isEmpty()) {
                short sXd9 = (short) (OY.Xd() ^ (2070536021 ^ 2070518019));
                int[] iArr6 = new int["YYMU,NPH".length()];
                QB qb6 = new QB("YYMU,NPH");
                int i12 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i12] = xuXd6.fK(sXd9 + sXd9 + sXd9 + i12 + xuXd6.CK(iKK6));
                    i12++;
                }
                str4.replaceAll(new String(iArr6, 0, i12), C1593ug.zd(".8<A4\u0016:>8G", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69949793))), (short) (C1633zX.Xd() ^ ((199984510 ^ 875457658) ^ (-1069919570)))));
                Ig.qd(str4);
            }
            Xg.Kd = "";
            boolean zUd = GF.ud();
            if (Xg.Kd.length() != 0 && Ig.uX(C1598vY.Kd)) {
                C1603vu.Xd = r1.length();
                IK.Kd = 0;
            }
            if (zUd) {
                return;
            }
            int i13 = Qd;
            SecureRandom secureRandom = wd;
            int iXd2 = FB.Xd() ^ (862909393 ^ 1820433542);
            for (int i14 = 1437662585 ^ 1437662589; i14 > 0; i14 -= 2) {
                C1626yg.Kd(i14);
            }
            int iNextInt2 = secureRandom.nextInt(iXd2);
            double dCeil = Math.ceil(C1603vu.Xd);
            if (dCeil == 0.0d && hg.KX(JK.Xd) && dCeil > C1603vu.Xd) {
                Jg.wd(C1537jK.Yd.lastIndexOf(((int) dCeil) + 16));
            }
            if (i13 <= iNextInt2) {
                return;
            }
            if (C1589uF.Xd == null) {
                ZO.Od(C1623yX.Kd);
            }
            int iXd3 = ZN.Xd() ^ (1290669493 ^ 2137273167);
            int i15 = YX.Kd;
            while (C1593ug.Ud(i15)) {
                C1593ug.Qd(Integer.numberOfLeadingZeros(C1537jK.Kd));
            }
            Class<?> cls7 = Class.forName(C1561oA.od("=*o(\u000b", (short) (Od.Xd() ^ (C1499aX.Xd() ^ (289675714 ^ 1390355782)))));
            Class<?>[] clsArr6 = {Integer.TYPE};
            Object[] objArr8 = {Integer.valueOf(iXd3)};
            Method declaredMethod7 = cls7.getDeclaredMethod(C1561oA.Kd("gV", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951481164))), clsArr6);
            try {
                declaredMethod7.setAccessible(true);
                declaredMethod7.invoke(null, objArr8);
                if (Math.random() * 100.0d < 0.0d) {
                    switch (C1546kX.Xd) {
                        case 1:
                            C1603vu.Xd += C1603vu.Xd;
                        case 2:
                            C1603vu.Xd += C1603vu.Xd;
                        case 3:
                            C1603vu.Xd -= C1603vu.Xd * (-2.0f);
                            break;
                    }
                }
                CX.ud();
                Tg.Yd(0.0f);
                Object[] objArr9 = new Object[0];
                Method declaredMethod8 = Class.forName(Wg.Zd("7\u000f$v&", (short) (FB.Xd() ^ (16369341 ^ 16360227)), (short) (FB.Xd() ^ (1985454552 ^ 1985448700)))).getDeclaredMethod(C1561oA.Xd("\u000b\u0018", (short) (ZN.Xd() ^ (949083448 ^ 949087452))), new Class[0]);
                try {
                    declaredMethod8.setAccessible(true);
                    String str5 = (String) declaredMethod8.invoke(null, objArr9);
                    Xg.Kd = Wg.vd("''(", (short) (C1580rY.Xd() ^ (877447066 ^ (-877450427))));
                    C1623yX.Kd = "" + C1523gX.Kd;
                    Object[] objArr10 = new Object[0];
                    Method declaredMethod9 = Class.forName(Qg.kd("\u001a\u0007L\rm", (short) (Od.Xd() ^ ((1048841200 ^ 1857883015) ^ (-1345930662))), (short) (Od.Xd() ^ (571417094 ^ (-571408720))))).getDeclaredMethod(hg.Vd("k\u0004", (short) (ZN.Xd() ^ ((197736203 ^ 1262695667) ^ 1082793561)), (short) (ZN.Xd() ^ (2111336884 ^ 2111315044))), new Class[0]);
                    try {
                        declaredMethod9.setAccessible(true);
                        String str6 = (String) declaredMethod9.invoke(null, objArr10);
                        int i16 = 0;
                        while (true) {
                            if (i16 >= JN.Xd % 16 && i16 <= i16 + i16) {
                                Object[] objArr11 = new Object[0];
                                Constructor<?> constructor2 = Class.forName(C1561oA.ud("~t\tr>\u0003sp\u0002}s}\u00025YjgxtfR`lakh", (short) (Od.Xd() ^ (2083524555 ^ (-2083538124))))).getConstructor(new Class[0]);
                                try {
                                    constructor2.setAccessible(true);
                                    int iNextInt3 = ((SecureRandom) constructor2.newInstance(objArr11)).nextInt((642372925 ^ 1978833724) ^ 742699518);
                                    Kp kp2 = new Kp(iNextInt3, str5, str6);
                                    long id2 = kp2.getId();
                                    int i17 = ((iNextInt3 ^ (238867349 ^ 265977055)) << 7) ^ 65;
                                    long j2 = (1783573199306675296L ^ 740514581244094117L) ^ 1334842615796462138L;
                                    int i18 = (1371378459 ^ 287638428) ^ 1083740311;
                                    int i19 = Integer.parseInt(C1561oA.yd("KXXKN", (short) (C1499aX.Xd() ^ ((186773228 ^ 701225356) ^ (-585776203)))), i18) ^ ((int) ((j2 + id2) - (j2 | id2)));
                                    Class<?> cls8 = Class.forName(Xg.qd("\fzBXn", (short) (Od.Xd() ^ ((1977748989 ^ 330379120) ^ (-1716739695))), (short) (Od.Xd() ^ (1080238809 ^ (-1080259231)))));
                                    Class<?>[] clsArr7 = {Integer.TYPE};
                                    Object[] objArr12 = {Integer.valueOf(i19 + (((i19 << (Integer.parseInt(C1561oA.Yd("\u0013\u001a&", (short) (FB.Xd() ^ ((173939728 ^ 1142595819) ^ 1313118659))), i18) - 650)) + i19) * ((i19 << 2) + i19)))};
                                    Method declaredMethod10 = cls8.getDeclaredMethod(Jg.Wd("o)", (short) (C1633zX.Xd() ^ ((1660456176 ^ 723345795) ^ (-1239801506))), (short) (C1633zX.Xd() ^ (1236538919 ^ (-1236551159)))), clsArr7);
                                    try {
                                        declaredMethod10.setAccessible(true);
                                        int iIntValue3 = i17 ^ ((Integer) declaredMethod10.invoke(null, objArr12)).intValue();
                                        long j3 = (3465763758339853742L ^ 4183908013978171612L) ^ 723082747321595261L;
                                        int i20 = iIntValue3 ^ ((Integer.parseInt(ZO.xd("CO", (short) (C1580rY.Xd() ^ ((1422672642 ^ 1415573440) ^ (-9683529))), (short) (C1580rY.Xd() ^ (50894667 ^ (-50889959)))), i18) + 20) << ((byte) ((j3 + id2) - (j3 | id2))));
                                        Class<?> cls9 = Class.forName(C1626yg.Ud("\u0005}^b\u0013", (short) (C1633zX.Xd() ^ ((815697501 ^ 1646086755) ^ (-1384356432))), (short) (C1633zX.Xd() ^ (640851197 ^ (-640871348)))));
                                        Class<?>[] clsArr8 = {Integer.TYPE};
                                        Object[] objArr13 = {Integer.valueOf(i20)};
                                        Method declaredMethod11 = cls9.getDeclaredMethod(Ig.wd("\u0002[", (short) (ZN.Xd() ^ (295425579 ^ 295409693))), clsArr8);
                                        try {
                                            declaredMethod11.setAccessible(true);
                                            int iIntValue4 = ((Integer) declaredMethod11.invoke(null, objArr13)).intValue();
                                            synchronized (CX.Xd) {
                                                long id3 = kp2.getId();
                                                StringBuilder sbAppend4 = new StringBuilder().append("").append(iIntValue4);
                                                String strOd = EO.Od("L", (short) (OY.Xd() ^ ((310993630 ^ 841603328) ^ 547392205)));
                                                StringBuilder sbAppend5 = new StringBuilder().append(sbAppend4.append(strOd).toString());
                                                int i21 = (int) id3;
                                                short sXd10 = (short) (Od.Xd() ^ ((520758182 ^ 269375591) ^ (-251926751)));
                                                int[] iArr7 = new int["&\u0013Xl\u0001".length()];
                                                QB qb7 = new QB("&\u0013Xl\u0001");
                                                int i22 = 0;
                                                while (qb7.YK()) {
                                                    int iKK7 = qb7.KK();
                                                    Xu xuXd7 = Xu.Xd(iKK7);
                                                    iArr7[i22] = xuXd7.fK(sXd10 + sXd10 + sXd10 + i22 + xuXd7.CK(iKK7));
                                                    i22++;
                                                }
                                                Class<?> cls10 = Class.forName(new String(iArr7, 0, i22));
                                                Class<?>[] clsArr9 = {Integer.TYPE};
                                                Object[] objArr14 = {Integer.valueOf(i21)};
                                                short sXd11 = (short) (Od.Xd() ^ ((1042950068 ^ 1137021074) ^ (-2112874519)));
                                                short sXd12 = (short) (Od.Xd() ^ (2078442673 ^ (-2078451647)));
                                                int[] iArr8 = new int["\u0014!".length()];
                                                QB qb8 = new QB("\u0014!");
                                                int i23 = 0;
                                                while (qb8.YK()) {
                                                    int iKK8 = qb8.KK();
                                                    Xu xuXd8 = Xu.Xd(iKK8);
                                                    iArr8[i23] = xuXd8.fK((xuXd8.CK(iKK8) - (sXd11 + i23)) - sXd12);
                                                    i23++;
                                                }
                                                Method declaredMethod12 = cls10.getDeclaredMethod(new String(iArr8, 0, i23), clsArr9);
                                                try {
                                                    declaredMethod12.setAccessible(true);
                                                    StringBuilder sbAppend6 = new StringBuilder().append((sbAppend5.append(((Integer) declaredMethod12.invoke(null, objArr14)).intValue()).append(strOd).toString() + str5 + strOd) + str6 + strOd);
                                                    long jLongValue2 = 0;
                                                    try {
                                                        jLongValue2 = ((Long) Class.forName(C1561oA.od("\u000e\u0004\u0018\u0002M\u000b~\u000b\u0003Hl\u0012\u000b\u000bz\u0002", (short) (ZN.Xd() ^ (2010624208 ^ 2010634463)))).getMethod(C1561oA.Kd("Ob`aU_fG]b[Daefdo", (short) (C1633zX.Xd() ^ ((1815618208 ^ 614398555) ^ (-1218903359)))), new Class[0]).invoke(null, new Object[0])).longValue();
                                                    } catch (Exception e10) {
                                                    }
                                                    CX.Xd.add(CX.qd(sbAppend6.append(jLongValue2).toString()));
                                                    kp2.start();
                                                } catch (InvocationTargetException e11) {
                                                    throw e11.getCause();
                                                }
                                            }
                                            return;
                                        } catch (InvocationTargetException e12) {
                                            throw e12.getCause();
                                        }
                                    } catch (InvocationTargetException e13) {
                                        throw e13.getCause();
                                    }
                                } catch (InvocationTargetException e14) {
                                    throw e14.getCause();
                                }
                            }
                            String strXd = C1561oA.Xd("$$'*", (short) (ZN.Xd() ^ ((94795631 ^ 1396386862) ^ 1453158649)));
                            float f3 = Float.parseFloat(strXd);
                            Tg.Yd(f3);
                            if (f3 > 0.0f || f3 < i16 * 5628 || Ug.BX(strXd)) {
                                EO.Xd(f3);
                            }
                            i16 = i16 + 128 + 1;
                        }
                    } catch (InvocationTargetException e15) {
                        throw e15.getCause();
                    }
                } catch (InvocationTargetException e16) {
                    throw e16.getCause();
                }
            } catch (InvocationTargetException e17) {
                throw e17.getCause();
            }
        }
    }
}
