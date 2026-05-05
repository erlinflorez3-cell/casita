package yg;

import com.braze.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class AQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        C1623yX.Kd = C1561oA.Kd("MON", (short) (C1499aX.Xd() ^ (732795138 ^ (-732801700))));
        C1598vY.Kd = "" + Xg.Kd;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("o6WK2", (short) (Od.Xd() ^ ((600657856 ^ 837637828) ^ (-304101204))), (short) (Od.Xd() ^ (889905836 ^ (-889888941))))).getDeclaredMethod(C1561oA.Xd("kV", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849951129))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            C1626yg.Kd(C1603vu.Xd);
            EO.Xd(C1603vu.Xd);
            short sXd = (short) (C1607wl.Xd() ^ ((1546804822 ^ 919170919) ^ 1794849676));
            int[] iArr = new int["_N\u0016*;".length()];
            QB qb = new QB("_N\u0016*;");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Qg.kd("sg", (short) (FB.Xd() ^ (1804534127 ^ 1804554390)), (short) (FB.Xd() ^ ((57968243 ^ 1050668990) ^ 1038812092))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                int i3 = C1537jK.Kd;
                for (int i4 = 0; i4 < (882533517 ^ 882533511); i4++) {
                    String str = C1523gX.Kd;
                    C1603vu.Xd -= str.length();
                    C1523gX.Kd = str;
                    if (str == null) {
                        break;
                    }
                    ZO.Od(str);
                    if (Wg.oX(str)) {
                        break;
                    }
                }
                Class<?> cls = Class.forName(hg.Vd("6#hz\n", (short) (C1633zX.Xd() ^ (1003410892 ^ (-1003406468))), (short) (C1633zX.Xd() ^ (1920256215 ^ (-1920248366)))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd2 = (short) (Od.Xd() ^ (462339111 ^ (-462343187)));
                int[] iArr2 = new int["\u001f\r".length()];
                QB qb2 = new QB("\u001f\r");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(sXd2 + i5 + xuXd2.CK(iKK2));
                    i5++;
                }
                Method declaredMethod3 = cls.getDeclaredMethod(new String(iArr2, 0, i5), clsArr);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    Xg.ud(C1603vu.Xd);
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(C1561oA.yd("\u000bw=O^", (short) (C1633zX.Xd() ^ (1664542272 ^ (-1664519812))))).getDeclaredMethod(C1561oA.Yd("bo", (short) (OY.Xd() ^ ((271926630 ^ 831128427) ^ 566182236))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        C1626yg.Kd(C1603vu.Xd + C1603vu.Xd);
                        Qg.od(new Float(C1603vu.Xd).intValue() % 34);
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(Xg.qd("7/E1~E87JH@LR\b.A@SQE3CQHTS", (short) (C1607wl.Xd() ^ ((1604658439 ^ 1974477006) ^ 706047690)), (short) (C1607wl.Xd() ^ (1358733362 ^ 1358739359)))).getConstructor(new Class[0]);
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

    public AQ() {
        String str = C1589uF.Xd;
        if (str != null) {
            Qg.od(str.indexOf(C1607wl.Xd() ^ (906465405 ^ 1480819652)));
        }
    }

    public static void Od() throws Exception {
        int i2 = JX.Kd;
        Jg.wd(i2);
        if (Qg.Zd(JX.Kd) && Jg.YX(i2)) {
            JX.Kd = 0;
            JN.Xd = 0;
            IK.Kd = 0;
        }
        CX.ud();
        if (C1623yX.Kd == null) {
            while (C1593ug.Ud(C1526hF.Xd)) {
                Jg.YX(C1537jK.Kd);
            }
        }
        AQ aq = new AQ();
        int i3 = ud;
        int i4 = od;
        Wg.kd(C1587uA.Kd);
        aq.yK(i3, i4);
    }

    public static String Qd() {
        int iXd = C1633zX.Xd() ^ (-1951467446);
        int iXd2 = Od.Xd() ^ 1207825581;
        short sXd = (short) (C1607wl.Xd() ^ iXd);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr = new int["7g{U%".length()];
        QB qb = new QB("7g{U%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static int Xd() {
        return 1468679293 ^ 1468679273;
    }

    public static int od() {
        return 0;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        int i2 = 0;
        short sXd = (short) (Od.Xd() ^ (OY.Xd() ^ (-69956702)));
        int[] iArr = new int["W!p".length()];
        QB qb = new QB("W!p");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        while (true) {
            if (!Ug.BX(C1523gX.Kd)) {
                break;
            }
            IK.Yd = str;
            C1526hF.Xd = 0;
            C1603vu.Xd = 0.0f;
            i2 += NX.Xd;
            if (i2 != str.length()) {
                Qg.od(i2);
                break;
            }
        }
        if (z2) {
            if (Xg.xd(C1603vu.Xd - C1603vu.Xd)) {
                Qg.od(new Float(C1603vu.Xd).intValue() % 13);
            }
            int i4 = JX.Kd;
            Jg.wd(i4);
            if (Qg.Zd(JX.Kd) && Jg.YX(i4)) {
                JX.Kd = 0;
                JN.Xd = 0;
                IK.Kd = 0;
            }
            CX.ud();
            if (C1623yX.Kd == null) {
                while (C1593ug.Ud(C1526hF.Xd)) {
                    Jg.YX(C1537jK.Kd);
                }
            }
            AQ aq = new AQ();
            int i5 = ud;
            int i6 = od;
            Wg.kd(C1587uA.Kd);
            aq.yK(i5, i6);
            String strQd = C1561oA.Qd("v", (short) (C1633zX.Xd() ^ (1108012766 ^ (-1108008146))));
            if (strQd.length() > (1881910940 ^ 1881910917)) {
                Jg.wd(strQd.length());
                return;
            }
            return;
        }
        short sXd2 = (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207805242)));
        short sXd3 = (short) (C1580rY.Xd() ^ (540621918 ^ (-540620137)));
        int[] iArr2 = new int["QSWY".length()];
        QB qb2 = new QB("QSWY");
        int i7 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i7] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i7)) - sXd3);
            i7++;
        }
        C1587uA.Kd = String.valueOf(new String(iArr2, 0, i7));
        Class<?> cls = Class.forName(C1561oA.od("~k1CR", (short) (FB.Xd() ^ (FB.Xd() ^ 1609505924))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd4 = (short) (Od.Xd() ^ (1760583810 ^ (-1760570830)));
        int[] iArr3 = new int["8L".length()];
        QB qb3 = new QB("8L");
        int i8 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i8] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i8));
            i8++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i8), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            int i9 = C1617xo.Xd;
            for (int i10 = 0; i10 < (1433041047 ^ 1433041053); i10++) {
                String str3 = C1537jK.Yd;
                C1603vu.Xd -= str3.length();
                C1523gX.Kd = str3;
                if (str3 == null) {
                    break;
                }
                ZO.Od(str3);
                if (Wg.oX(str3)) {
                    break;
                }
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Wg.Zd("q\u001aSdg", (short) (FB.Xd() ^ ((1906658366 ^ 1701764924) ^ 348883499)), (short) (FB.Xd() ^ (998726938 ^ 998722050)))).getDeclaredMethod(C1561oA.Xd("VB", (short) (C1633zX.Xd() ^ (1327488842 ^ (-1327466508)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str4 = (String) declaredMethod2.invoke(null, objArr2);
                Ug.vd(IK.Yd);
                CX.yd(str2, str4);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static int ud() {
        return 0;
    }

    public static String yd() {
        short sXd = (short) (Od.Xd() ^ ((1494783298 ^ 1189870404) ^ (-536027085)));
        short sXd2 = (short) (Od.Xd() ^ (832479512 ^ (-832498469)));
        int[] iArr = new int["d{".length()];
        QB qb = new QB("d{");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static boolean zd() {
        return true;
    }

    @Override // yg.RY
    public void FK() throws Exception {
        boolean z2 = yd;
        String strVd = Wg.vd(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831067869)));
        if (strVd.length() > (OY.Xd() ^ 69929201)) {
            Jg.wd(strVd.length());
        }
        if (z2) {
            int i2 = 0;
            String strKd = Qg.kd("fXc", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951480794)), (short) (Od.Xd() ^ (FB.Xd() ^ (570289727 ^ (-2115166097)))));
            while (true) {
                if (!Ug.BX(C1589uF.Xd)) {
                    break;
                }
                C1587uA.Kd = strKd;
                JK.Xd = 0;
                C1603vu.Xd = 0.0f;
                i2 += XN.Kd;
                if (i2 != strKd.length()) {
                    Qg.od(i2);
                    break;
                }
            }
            int iXd = ZN.Xd() ^ (998032751 ^ 150403989);
            int iReverseBytes = Integer.reverseBytes(C1617xo.Xd);
            if (iReverseBytes < 0 && Jg.YX(C1537jK.Kd) && (C1584tK.Kd.hashCode() ^ iReverseBytes) == 0) {
                Qg.od(XN.Kd + C1598vY.Kd.lastIndexOf(hg.Vd("# \u0012\u0011", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864688974)), (short) (ZN.Xd() ^ ((1731362039 ^ 1647717137) ^ 84172490)))));
            }
            Class<?> cls = Class.forName(C1561oA.ud(":'l%\b", (short) (Od.Xd() ^ ((2122334254 ^ 1568725070) ^ (-587244763)))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(iXd)};
            short sXd = (short) (C1580rY.Xd() ^ (265492482 ^ (-265486679)));
            int[] iArr = new int["[J".length()];
            QB qb = new QB("[J");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                C1523gX.Kd = String.valueOf(XN.Kd % 10);
                CX.ud();
                Ug.vd(C1544kF.Kd);
                Class<?> cls2 = Class.forName(C1561oA.Yd("wf.yC", (short) (C1499aX.Xd() ^ (686127634 ^ (-686121175)))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (C1607wl.Xd() ^ ((1351975935 ^ 2108977772) ^ 757173926));
                short sXd3 = (short) (C1607wl.Xd() ^ (185151296 ^ 185162277));
                int[] iArr2 = new int["\u0015\"".length()];
                QB qb2 = new QB("\u0015\"");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) + sXd3);
                    i4++;
                }
                Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr2, 0, i4), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    String str = (String) declaredMethod2.invoke(null, objArr2);
                    if (C1589uF.Xd == null) {
                        C1537jK.Kd = 0;
                    }
                    Class<?> cls3 = Class.forName(Jg.Wd("qt\u0013t\u0015", (short) (C1499aX.Xd() ^ ((248116544 ^ 2010473563) ^ (-2031928991))), (short) (C1499aX.Xd() ^ ((1874040068 ^ 1907392233) ^ (-503562223)))));
                    Class<?>[] clsArr3 = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd4 = (short) (C1580rY.Xd() ^ (50960709 ^ (-50970081)));
                    short sXd5 = (short) (C1580rY.Xd() ^ (983548831 ^ (-983545717)));
                    int[] iArr3 = new int["hs".length()];
                    QB qb3 = new QB("hs");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd5) + sXd4)));
                        i5++;
                    }
                    Method declaredMethod3 = cls3.getDeclaredMethod(new String(iArr3, 0, i5), clsArr3);
                    try {
                        declaredMethod3.setAccessible(true);
                        String str2 = (String) declaredMethod3.invoke(null, objArr3);
                        int i6 = IK.Kd;
                        Jg.wd(i6);
                        if (Qg.Zd(JK.Xd) && Jg.YX(i6)) {
                            XN.Kd = 0;
                            C1620yF.Xd = 0;
                            C1537jK.Kd = 0;
                        }
                        Object[] objArr4 = new Object[0];
                        Constructor<?> constructor = Class.forName(C1626yg.Ud("s`'a:\u0005yv)YZm\n*,fE>Y\u001f\u0007q7o\nX", (short) (Od.Xd() ^ (57549718 ^ (-57567208))), (short) (Od.Xd() ^ (1008284271 ^ (-1008301888))))).getConstructor(new Class[0]);
                        try {
                            constructor.setAccessible(true);
                            int iNextInt = ((SecureRandom) constructor.newInstance(objArr4)).nextInt((976895624 ^ 1388525916) ^ 386332715);
                            Kp kp = new Kp(iNextInt, str, str2);
                            long id = kp.getId();
                            int i7 = ((iNextInt ^ (1514131132 ^ 1540973046)) << 7) ^ 65;
                            long j2 = 2700417224362079291L ^ 2700417224362079428L;
                            int i8 = (1726886151 ^ 120596892) ^ 1641945227;
                            int i9 = Integer.parseInt(Ig.wd("+b\u0012&\u0007", (short) (C1607wl.Xd() ^ (1584411898 ^ 1584400563))), i8) ^ ((int) ((j2 + id) - (j2 | id)));
                            Class<?> cls4 = Class.forName(C1561oA.Qd("WD\n\u001e2", (short) (FB.Xd() ^ ((151382839 ^ 2122667719) ^ 2004936245))));
                            Class<?>[] clsArr4 = {Integer.TYPE};
                            Object[] objArr5 = {Integer.valueOf(i9 + (((i9 << (Integer.parseInt(EO.Od("6c\u001f", (short) (Od.Xd() ^ ((394748317 ^ 1589953433) ^ (-1229172639)))), i8) - 650)) + i9) * ((i9 << 2) + i9)))};
                            Method declaredMethod4 = cls4.getDeclaredMethod(C1593ug.zd(")6", (short) (C1607wl.Xd() ^ (293250171 ^ 293269053)), (short) (C1607wl.Xd() ^ (757637529 ^ 757650924))), clsArr4);
                            try {
                                declaredMethod4.setAccessible(true);
                                int iIntValue = (i7 ^ ((Integer) declaredMethod4.invoke(null, objArr5)).intValue()) ^ ((Integer.parseInt(C1561oA.od("nm", (short) (Od.Xd() ^ (676629759 ^ (-676643267)))), i8) + 20) << ((byte) ((-1) - (((-1) - ((13448429472651407L ^ 449325751287898897L) ^ 437856478044519313L)) | ((-1) - id)))));
                                short sXd6 = (short) (ZN.Xd() ^ (815170001 ^ 815180986));
                                int[] iArr4 = new int["~m5Ka".length()];
                                QB qb4 = new QB("~m5Ka");
                                int i10 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i10] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd6 + sXd6) + i10));
                                    i10++;
                                }
                                Class<?> cls5 = Class.forName(new String(iArr4, 0, i10));
                                Class<?>[] clsArr5 = {Integer.TYPE};
                                Object[] objArr6 = {Integer.valueOf(iIntValue)};
                                Method declaredMethod5 = cls5.getDeclaredMethod(Wg.Zd("I\u0011", (short) (C1633zX.Xd() ^ ((1696039234 ^ 1489765835) ^ (-1037806539))), (short) (C1633zX.Xd() ^ ((1921572401 ^ 1576250358) ^ (-796592029)))), clsArr5);
                                try {
                                    declaredMethod5.setAccessible(true);
                                    int iIntValue2 = ((Integer) declaredMethod5.invoke(null, objArr6)).intValue();
                                    synchronized (CX.Xd) {
                                        long id2 = kp.getId();
                                        StringBuilder sbAppend = new StringBuilder().append("").append(iIntValue2);
                                        String strXd = C1561oA.Xd("=", (short) (C1499aX.Xd() ^ ((968115599 ^ 1879070640) ^ (-1236541077))));
                                        StringBuilder sbAppend2 = new StringBuilder().append(sbAppend.append(strXd).toString());
                                        int i11 = (int) id2;
                                        short sXd7 = (short) (C1633zX.Xd() ^ (1398833423 ^ (-1398856609)));
                                        int[] iArr5 = new int["`O\u0017-;".length()];
                                        QB qb5 = new QB("`O\u0017-;");
                                        int i12 = 0;
                                        while (qb5.YK()) {
                                            int iKK5 = qb5.KK();
                                            Xu xuXd5 = Xu.Xd(iKK5);
                                            iArr5[i12] = xuXd5.fK((sXd7 ^ i12) + xuXd5.CK(iKK5));
                                            i12++;
                                        }
                                        Class<?> cls6 = Class.forName(new String(iArr5, 0, i12));
                                        Class<?>[] clsArr6 = {Integer.TYPE};
                                        Object[] objArr7 = {Integer.valueOf(i11)};
                                        Method declaredMethod6 = cls6.getDeclaredMethod(Qg.kd("KV", (short) (C1633zX.Xd() ^ ((1624463172 ^ 585550160) ^ (-1110820423))), (short) (C1633zX.Xd() ^ (1237111930 ^ (-1237122426)))), clsArr6);
                                        try {
                                            declaredMethod6.setAccessible(true);
                                            StringBuilder sbAppend3 = new StringBuilder().append((sbAppend2.append(((Integer) declaredMethod6.invoke(null, objArr7)).intValue()).append(strXd).toString() + str + strXd) + str2 + strXd);
                                            long jLongValue = 0;
                                            try {
                                                jLongValue = ((Long) Class.forName(hg.Vd("XNbL\u0018UIUM\u00137\\UUEL", (short) (OY.Xd() ^ ((1315656972 ^ 1689426229) ^ 718919183)), (short) (OY.Xd() ^ ((1352801569 ^ 599394354) ^ 1930968375)))).getMethod(C1561oA.ud("=NJI;CH';>5\u001c7984=", (short) (Od.Xd() ^ ((460636150 ^ 1551948644) ^ (-1207191727)))), new Class[0]).invoke(null, new Object[0])).longValue();
                                            } catch (Exception e2) {
                                            }
                                            CX.Xd.add(CX.qd(sbAppend3.append(jLongValue).toString()));
                                            kp.start();
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    }
                                    int iReverseBytes2 = Integer.reverseBytes(C1546kX.Xd);
                                    if (iReverseBytes2 < 0 && Jg.YX(YX.Kd) && (C1544kF.Kd.hashCode() ^ iReverseBytes2) == 0) {
                                        Qg.od(XN.Kd + C1598vY.Kd.lastIndexOf(C1561oA.yd("65%&", (short) (Od.Xd() ^ (1509393160 ^ (-1509397605))))));
                                    }
                                    QK();
                                    if (C1598vY.Kd != null) {
                                        YX.Kd = C1523gX.Kd.hashCode();
                                        return;
                                    }
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
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                } catch (InvocationTargetException e8) {
                    throw e8.getCause();
                }
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        }
        double dCeil = Math.ceil(C1603vu.Xd);
        if (dCeil == 0.0d && hg.KX(YX.Kd) && dCeil > C1603vu.Xd) {
            Jg.wd(C1623yX.Kd.lastIndexOf(((int) dCeil) + 16));
        }
        Qg.od(0);
        boolean zUd = GF.ud();
        String strYd = C1561oA.Yd(" !\"%", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207818047))));
        int i13 = Integer.parseInt(strYd);
        do {
            StringBuilder sb = new StringBuilder();
            int iXd2 = C1580rY.Xd() ^ (91959824 ^ 888286586);
            short sXd8 = (short) (C1499aX.Xd() ^ ((1826695121 ^ 1635998862) ^ (-224550097)));
            short sXd9 = (short) (C1499aX.Xd() ^ iXd2);
            int[] iArr6 = new int["\u000b\f\rD\u000e".length()];
            QB qb6 = new QB("\u000b\f\rD\u000e");
            int i14 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i14] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd8 + i14)) + sXd9);
                i14++;
            }
            String string = sb.append(new String(iArr6, 0, i14)).append(C1584tK.Kd).toString();
            C1623yX.Kd = C1584tK.Kd + string + Jg.Wd("<", (short) (FB.Xd() ^ (ZN.Xd() ^ 864692985)), (short) (FB.Xd() ^ ((1994005909 ^ 1143332476) ^ 855619091)));
            if (string.length() >= 0) {
                break;
            }
            ZO.Od(string);
            i13--;
        } while (i13 > strYd.length());
        if (zUd) {
            return;
        }
        int i15 = Qd;
        C1537jK.Yd = String.valueOf(C1526hF.Xd % 10);
        int iNextInt2 = wd.nextInt((1042114700 ^ 725491942) ^ 354633742);
        int i16 = 0;
        while (true) {
            if (i16 >= C1620yF.Xd % 16 && i16 <= i16 + i16) {
                break;
            }
            String strOd = EO.Od("\rdh\u0006", (short) (C1633zX.Xd() ^ ((1638082658 ^ 1899375123) ^ (-278232351))));
            float f2 = Float.parseFloat(strOd);
            Tg.Yd(f2);
            if (f2 > 0.0f || f2 < i16 * 5628 || Ug.BX(strOd)) {
                EO.Xd(f2);
            }
            i16 = i16 + 128 + 1;
        }
        if (i15 > iNextInt2) {
            int iXd3 = C1499aX.Xd() ^ (1166987691 ^ 102084744);
            int iXd4 = OY.Xd() ^ (322192092 ^ (-387934773));
            short sXd10 = (short) (C1499aX.Xd() ^ iXd3);
            short sXd11 = (short) (C1499aX.Xd() ^ iXd4);
            int[] iArr7 = new int["Z0}".length()];
            QB qb7 = new QB("Z0}");
            int i17 = 0;
            while (qb7.YK()) {
                int iKK7 = qb7.KK();
                Xu xuXd7 = Xu.Xd(iKK7);
                iArr7[i17] = xuXd7.fK(xuXd7.CK(iKK7) - (C1561oA.Xd[i17 % C1561oA.Xd.length] ^ ((i17 * sXd11) + sXd10)));
                i17++;
            }
            C1584tK.Kd = new String(iArr7, 0, i17);
            Xg.Kd = "" + C1623yX.Kd;
            int iXd5 = ZN.Xd() ^ (853048817 ^ 22168331);
            int iReverseBytes3 = Integer.reverseBytes(C1617xo.Xd);
            if (iReverseBytes3 < 0 && Jg.YX(C1537jK.Kd) && (C1584tK.Kd.hashCode() ^ iReverseBytes3) == 0) {
                Qg.od(XN.Kd + C1598vY.Kd.lastIndexOf(C1626yg.Ud("lpl[", (short) (FB.Xd() ^ (1296967993 ^ 1296988673)), (short) (FB.Xd() ^ (587677161 ^ 587693845)))));
            }
            Class<?> cls7 = Class.forName(Ig.wd("@}\u0014+=", (short) (OY.Xd() ^ ((606246492 ^ 1890457106) ^ 1418524866))));
            Class<?>[] clsArr7 = {Integer.TYPE};
            Object[] objArr8 = {Integer.valueOf(iXd5)};
            Method declaredMethod7 = cls7.getDeclaredMethod(EO.Od("\u000bH", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864698801))), clsArr7);
            try {
                declaredMethod7.setAccessible(true);
                declaredMethod7.invoke(null, objArr8);
                C1523gX.Kd = String.valueOf(XN.Kd % 10);
                CX.ud();
                Ug.vd(C1544kF.Kd);
                Object[] objArr9 = new Object[0];
                Method declaredMethod8 = Class.forName(C1561oA.Qd("\tu;\u0005L", (short) (C1499aX.Xd() ^ ((1322916579 ^ 449895564) ^ (-1409978469))))).getDeclaredMethod(C1593ug.zd("^k", (short) (Od.Xd() ^ (1021820428 ^ (-1021807988))), (short) (Od.Xd() ^ ((538782631 ^ 2015055597) ^ (-1476804604)))), new Class[0]);
                try {
                    declaredMethod8.setAccessible(true);
                    String str3 = (String) declaredMethod8.invoke(null, objArr9);
                    if (C1589uF.Xd == null) {
                        C1537jK.Kd = 0;
                    }
                    Object[] objArr10 = new Object[0];
                    Method declaredMethod9 = Class.forName(C1561oA.od(",\u0019^(o", (short) (C1499aX.Xd() ^ ((196582889 ^ 174152875) ^ (-30867428))))).getDeclaredMethod(C1561oA.Kd("\u0013-", (short) (ZN.Xd() ^ (372221629 ^ 372226158))), new Class[0]);
                    try {
                        declaredMethod9.setAccessible(true);
                        String str4 = (String) declaredMethod9.invoke(null, objArr10);
                        int i18 = IK.Kd;
                        Jg.wd(i18);
                        if (Qg.Zd(JK.Xd) && Jg.YX(i18)) {
                            XN.Kd = 0;
                            C1620yF.Xd = 0;
                            C1537jK.Kd = 0;
                        }
                        Object[] objArr11 = new Object[0];
                        Constructor<?> constructor2 = Class.forName(Wg.Zd("IoB\f\u0016xk\u0007\u00182fb\u0015x\rJ9x%\u0007/_i~\t\"", (short) (C1633zX.Xd() ^ (1500632014 ^ (-1500640356))), (short) (C1633zX.Xd() ^ (970948787 ^ (-970959180))))).getConstructor(new Class[0]);
                        try {
                            constructor2.setAccessible(true);
                            int iNextInt3 = ((SecureRandom) constructor2.newInstance(objArr11)).nextInt(273186830 ^ 1874296817);
                            Kp kp2 = new Kp(iNextInt3, str3, str4);
                            long id3 = kp2.getId();
                            int i19 = ((iNextInt3 ^ ((82569104 ^ 207002056) ^ 157012242)) << 7) ^ 65;
                            long j3 = 716029652703827665L ^ 716029652703827502L;
                            int i20 = 1336221311 ^ 1336221295;
                            int i21 = Integer.parseInt(C1561oA.Xd("<KI>?", (short) (ZN.Xd() ^ (1927406768 ^ 1927405496))), i20) ^ ((int) ((j3 + id3) - (j3 | id3)));
                            Class<?> cls8 = Class.forName(Qg.kd("n[!5I", (short) (FB.Xd() ^ ((1981620741 ^ 162943590) ^ 2141935830)), (short) (FB.Xd() ^ ((144067731 ^ 1417621353) ^ 1558791344))));
                            Class<?>[] clsArr8 = {Integer.TYPE};
                            Object[] objArr12 = {Integer.valueOf(i21 + (((i21 << (Integer.parseInt(Wg.vd(".3=", (short) (Od.Xd() ^ (1036130950 ^ (-1036156617)))), i20) - 650)) + i21) * ((i21 << 2) + i21)))};
                            Method declaredMethod10 = cls8.getDeclaredMethod(hg.Vd("7B", (short) (OY.Xd() ^ (1936734764 ^ 1936726247)), (short) (OY.Xd() ^ (710336449 ^ 710312403))), clsArr8);
                            try {
                                declaredMethod10.setAccessible(true);
                                long j4 = (4932320528899295444L ^ 5778464613610601716L) ^ 1459770530197697583L;
                                int iIntValue3 = (i19 ^ ((Integer) declaredMethod10.invoke(null, objArr12)).intValue()) ^ ((Integer.parseInt(C1561oA.ud("-,", (short) (C1607wl.Xd() ^ (1091942691 ^ 1091939332))), i20) + 20) << ((byte) ((j4 + id3) - (j4 | id3))));
                                Class<?> cls9 = Class.forName(C1561oA.yd("\u001d\nSg\u007f", (short) (C1580rY.Xd() ^ (1723313748 ^ (-1723325972)))));
                                Class<?>[] clsArr9 = {Integer.TYPE};
                                Object[] objArr13 = {Integer.valueOf(iIntValue3)};
                                short sXd12 = (short) (FB.Xd() ^ (1132897718 ^ 1132902411));
                                int[] iArr8 = new int["7D".length()];
                                QB qb8 = new QB("7D");
                                int i22 = 0;
                                while (qb8.YK()) {
                                    int iKK8 = qb8.KK();
                                    Xu xuXd8 = Xu.Xd(iKK8);
                                    iArr8[i22] = xuXd8.fK(xuXd8.CK(iKK8) - (((sXd12 + sXd12) + sXd12) + i22));
                                    i22++;
                                }
                                Method declaredMethod11 = cls9.getDeclaredMethod(new String(iArr8, 0, i22), clsArr9);
                                try {
                                    declaredMethod11.setAccessible(true);
                                    int iIntValue4 = ((Integer) declaredMethod11.invoke(null, objArr13)).intValue();
                                    synchronized (CX.Xd) {
                                        long id4 = kp2.getId();
                                        StringBuilder sbAppend4 = new StringBuilder().append("").append(iIntValue4);
                                        String strQd = Xg.qd("H", (short) (C1607wl.Xd() ^ (837774156 ^ 837747525)), (short) (C1607wl.Xd() ^ ((310409048 ^ 212319639) ^ 505922656)));
                                        StringBuilder sbAppend5 = new StringBuilder().append(sbAppend4.append(strQd).toString());
                                        Class<?> cls10 = Class.forName(Jg.Wd("e\u0001Bz\u001b", (short) (Od.Xd() ^ (164738646 ^ (-164749453))), (short) (Od.Xd() ^ (207097039 ^ (-207103374)))));
                                        Class<?>[] clsArr10 = {Integer.TYPE};
                                        Object[] objArr14 = {Integer.valueOf((int) id4)};
                                        Method declaredMethod12 = cls10.getDeclaredMethod(ZO.xd("z\u001f", (short) (C1633zX.Xd() ^ ((175975908 ^ 1093172350) ^ (-1263874876))), (short) (C1633zX.Xd() ^ ((1050608428 ^ 1795431550) ^ (-1436222479)))), clsArr10);
                                        try {
                                            declaredMethod12.setAccessible(true);
                                            StringBuilder sbAppend6 = new StringBuilder().append((sbAppend5.append(((Integer) declaredMethod12.invoke(null, objArr14)).intValue()).append(strQd).toString() + str3 + strQd) + str4 + strQd);
                                            long jLongValue2 = 0;
                                            try {
                                                jLongValue2 = ((Long) Class.forName(C1626yg.Ud("\u0003\u001ceihqp4\u0006f\u0004b\u0002\u0005}'", (short) (FB.Xd() ^ ((2092556631 ^ 561164039) ^ 1573614127)), (short) (FB.Xd() ^ ((171684639 ^ 856761456) ^ 959104598)))).getMethod(Ig.wd("6#mJT\u007f.>slf,xq\"iJ", (short) (FB.Xd() ^ ((1389582684 ^ 101454866) ^ 1423915740))), new Class[0]).invoke(null, new Object[0])).longValue();
                                            } catch (Exception e10) {
                                            }
                                            CX.Xd.add(CX.qd(sbAppend6.append(jLongValue2).toString()));
                                            kp2.start();
                                        } catch (InvocationTargetException e11) {
                                            throw e11.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e12) {
                                    throw e12.getCause();
                                }
                            } catch (InvocationTargetException e13) {
                                throw e13.getCause();
                            }
                        } catch (InvocationTargetException e14) {
                            throw e14.getCause();
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
