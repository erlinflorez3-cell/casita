package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.rQ */
/* JADX INFO: loaded from: classes9.dex */
public class C1579rQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        Qg.od(0);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1593ug.zd("p_'lL", (short) (Od.Xd() ^ (OY.Xd() ^ (-69957433))), (short) (Od.Xd() ^ ((954779968 ^ 19908465) ^ (-969364597))))).getDeclaredMethod(C1561oA.od("ZC", (short) (Od.Xd() ^ (Od.Xd() ^ (-1207799000)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            if (Xg.xd(C1603vu.Xd - C1603vu.Xd)) {
                Qg.od(new Float(C1603vu.Xd).intValue() % 13);
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Kd("8'n4\u0014", (short) (OY.Xd() ^ (857311341 ^ 857337286)))).getDeclaredMethod(Wg.Zd("\u0005\\", (short) (ZN.Xd() ^ (2063834618 ^ 2063829233)), (short) (ZN.Xd() ^ ((1779238736 ^ 24287068) ^ 1803532814))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                String strXd = C1561oA.Xd(")*+.", (short) (C1499aX.Xd() ^ ((1838000842 ^ 284302083) ^ (-2105530753))));
                int i2 = Integer.parseInt(strXd);
                do {
                    String str = Wg.vd("\u0012\u0011\u0010E\r", (short) (Od.Xd() ^ (227866602 ^ (-227842641)))) + IK.Yd;
                    C1537jK.Yd = Xg.Kd + str + Qg.kd("\u0006", (short) (ZN.Xd() ^ ((2044787714 ^ 1540031980) ^ 573288346)), (short) (ZN.Xd() ^ (1188232286 ^ 1188217596)));
                    if (str.length() >= 0) {
                        break;
                    }
                    ZO.Od(str);
                    i2--;
                } while (i2 > strXd.length());
                Class<?> cls = Class.forName(hg.Vd("vc)lJ", (short) (C1607wl.Xd() ^ (712349105 ^ 712370388)), (short) (C1607wl.Xd() ^ (1463353167 ^ 1463329617))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd = (short) (OY.Xd() ^ (759253237 ^ 759262883));
                int[] iArr = new int["SG".length()];
                QB qb = new QB("SG");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
                    i3++;
                }
                Method declaredMethod3 = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    if (C1523gX.Kd == null) {
                        C1584tK.Kd.replaceAll(C1561oA.yd("onm;:lk", (short) (OY.Xd() ^ ((1708005115 ^ 1746527672) ^ 232237132))), C1561oA.Yd("\u0002\b~\u0001\u0015", (short) (C1607wl.Xd() ^ (514432887 ^ 514433670))));
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(Xg.qd("\u0003q9~^", (short) (FB.Xd() ^ (1891749702 ^ 1891744694)), (short) (FB.Xd() ^ (555897479 ^ 555909080)))).getDeclaredMethod(Jg.Wd("\f+", (short) (FB.Xd() ^ (801224109 ^ 801233036)), (short) (FB.Xd() ^ ((1405321721 ^ 1154541732) ^ 387149459))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        int i4 = JX.Kd;
                        while (C1593ug.Ud(i4)) {
                            C1593ug.Qd(Integer.numberOfLeadingZeros(C1546kX.Xd));
                        }
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(ZO.xd("%R\\69s&N&1\u0011Wi'u5\u000e{![!C\u0010y<\u000e", (short) (OY.Xd() ^ (2057734897 ^ 2057741811)), (short) (OY.Xd() ^ ((1065755462 ^ 214598848) ^ 860654585)))).getConstructor(new Class[0]);
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

    public C1579rQ() {
        if (EO.zd(C1603vu.Xd)) {
            EO.Xd(C1603vu.Xd);
            C1626yg.Kd(C1603vu.Xd + Float.intBitsToFloat(C1499aX.Xd() ^ (790590840 ^ (-1392775788))));
        }
    }

    public static void Od() throws Exception {
        if (C1589uF.Xd == null) {
            C1617xo.Xd = C1537jK.Kd + 1;
        }
        CX.ud();
        C1598vY.Kd = C1561oA.Xd(";A=I", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207816651))));
        C1579rQ c1579rQ = new C1579rQ();
        int i2 = ud;
        int i3 = od;
        if (C1589uF.Xd == null) {
            YX.Kd = 0;
        }
        c1579rQ.yK(i2, i3);
    }

    public static String Qd() {
        return C1626yg.Ud("\u0012_]W\u0004", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864706870))), (short) (C1580rY.Xd() ^ ((346415025 ^ 907034672) ^ (-582332164))));
    }

    public static int Xd() {
        return 1396445266 ^ 1396445238;
    }

    public static int od() {
        return (1865934275 ^ 456234363) ^ 1946579076;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        int i2 = C1620yF.Xd;
        for (int i3 = 0; i3 < (FB.Xd() ^ (727900031 ^ 1955442758)); i3 = i3 + 2 + 1) {
            String str = C1587uA.Kd;
            C1603vu.Xd -= str.length();
            Xg.Kd = str;
        }
        if (z2) {
            int i4 = JK.Xd;
            while (C1593ug.Ud(Integer.lowestOneBit(C1617xo.Xd)) && C1598vY.Kd.length() < 0) {
                Xg.ud(i4);
            }
            if (C1589uF.Xd == null) {
                C1617xo.Xd = C1537jK.Kd + 1;
            }
            CX.ud();
            C1598vY.Kd = Wg.vd("\\`Zd", (short) (OY.Xd() ^ ((1552449572 ^ 794168595) ^ 1943969671)));
            C1579rQ c1579rQ = new C1579rQ();
            int i5 = ud;
            int i6 = od;
            if (C1589uF.Xd == null) {
                YX.Kd = 0;
            }
            c1579rQ.yK(i5, i6);
            double dCeil = Math.ceil(C1603vu.Xd);
            if (dCeil == 0.0d && hg.KX(IK.Kd) && dCeil > C1603vu.Xd) {
                Jg.wd(C1537jK.Yd.lastIndexOf(((int) dCeil) + 16));
                return;
            }
            return;
        }
        C1626yg.Kd(C1603vu.Xd);
        EO.Xd(C1603vu.Xd);
        int iXd = ZN.Xd() ^ (-864706190);
        int iXd2 = C1580rY.Xd() ^ (440402756 ^ 734612816);
        short sXd = (short) (C1633zX.Xd() ^ iXd);
        short sXd2 = (short) (C1633zX.Xd() ^ iXd2);
        int[] iArr = new int["cP\u0016Y7".length()];
        QB qb = new QB("cP\u0016Y7");
        int i7 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i7] = xuXd.fK(((sXd + i7) + xuXd.CK(iKK)) - sXd2);
            i7++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i7)).getDeclaredMethod(hg.Vd("bt", (short) (Od.Xd() ^ (Od.Xd() ^ (1424899671 ^ (-320068384)))), (short) (Od.Xd() ^ (1840488263 ^ (-1840491710)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            String strUd = C1561oA.ud("DHBL", (short) (C1580rY.Xd() ^ ((1623037884 ^ 25215002) ^ (-1631398892))));
            IK.Yd = strUd;
            Ig.qd(strUd);
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.yd("\u007fl2uS", (short) (C1633zX.Xd() ^ (158000047 ^ (-157978829))))).getDeclaredMethod(C1561oA.Yd("^J", (short) (C1607wl.Xd() ^ ((1380937408 ^ 1710453953) ^ 935081644))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str3 = (String) declaredMethod2.invoke(null, objArr2);
                if (EO.zd(C1603vu.Xd)) {
                    EO.Xd(C1603vu.Xd);
                    C1626yg.Kd(C1603vu.Xd + 1.0f);
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
        return C1633zX.Xd() ^ (-1951491135);
    }

    public static String yd() {
        return Ig.wd("wA", (short) (C1499aX.Xd() ^ (621019343 ^ (-621051054))));
    }

    public static boolean zd() {
        return false;
    }

    @Override // yg.RY
    public void FK() throws Exception {
        boolean z2 = yd;
        for (int i2 = (1247138859 ^ 982636013) ^ 1891893698; i2 > 0; i2 -= 2) {
            C1626yg.Kd(i2);
        }
        if (z2) {
            if (Xg.xd(C1603vu.Xd - C1603vu.Xd)) {
                Qg.od(new Float(C1603vu.Xd).intValue() % 13);
            }
            int i3 = 1431667791 ^ 1431667781;
            String strWd = Jg.Wd("4+.+", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951467151))), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (987319318 ^ (-189792695)))));
            int i4 = Integer.parseInt(strWd);
            do {
                String str = ZO.xd("3b\u001ao^", (short) (FB.Xd() ^ (C1607wl.Xd() ^ (1390607620 ^ 1017564681))), (short) (FB.Xd() ^ (ZN.Xd() ^ (80085291 ^ 927757393)))) + C1623yX.Kd;
                StringBuilder sbAppend = new StringBuilder().append(C1523gX.Kd).append(str);
                int iXd = FB.Xd() ^ (-1609514754);
                int iXd2 = FB.Xd() ^ (-1609504528);
                short sXd = (short) (C1633zX.Xd() ^ iXd);
                short sXd2 = (short) (C1633zX.Xd() ^ iXd2);
                int[] iArr = new int[",".length()];
                QB qb = new QB(",");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i5 * sXd2))) + xuXd.CK(iKK));
                    i5++;
                }
                C1537jK.Yd = sbAppend.append(new String(iArr, 0, i5)).toString();
                if (str.length() >= 0) {
                    break;
                }
                ZO.Od(str);
                i4--;
            } while (i4 > strWd.length());
            short sXd3 = (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831066961));
            int[] iArr2 = new int["\u00185,\u0003e".length()];
            QB qb2 = new QB("\u00185,\u0003e");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd3 + i6)));
                i6++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i6));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i3)};
            Method declaredMethod = cls.getDeclaredMethod(EO.Od("\u00151", (short) (ZN.Xd() ^ (106815242 ^ 106822735))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                int length = XN.Kd + C1587uA.Kd.length();
                if (Tg.Wd(length) && length > Math.tan(C1603vu.Xd)) {
                    C1593ug.Qd(length);
                }
                CX.ud();
                C1626yg.Kd(C1603vu.Xd);
                EO.Xd(C1603vu.Xd);
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.Qd("q^$NE", (short) (C1607wl.Xd() ^ (103685810 ^ 103686329)))).getDeclaredMethod(C1593ug.zd("%\u001f", (short) (C1607wl.Xd() ^ (1907109188 ^ 1907099870)), (short) (C1607wl.Xd() ^ ((1408783220 ^ 1530191611) ^ 147633504))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    String str2 = (String) declaredMethod2.invoke(null, objArr2);
                    int length2 = (C1623yX.Kd + C1561oA.od("Iowswq{D", (short) (ZN.Xd() ^ (807221771 ^ 807211889)))).length();
                    do {
                        switch (length2) {
                            case 97:
                                length2 = 0;
                                C1561oA.Kd("jplx", (short) (C1633zX.Xd() ^ ((431827687 ^ 779431477) ^ (-935880403))));
                                break;
                            default:
                                length2 -= (IK.Yd.length() * Math.abs(C1526hF.Xd)) + 1;
                                break;
                        }
                    } while (length2 < 0);
                    Object[] objArr3 = new Object[0];
                    Method declaredMethod3 = Class.forName(Wg.Zd("C6y\u001a\u0007", (short) (C1499aX.Xd() ^ (565442889 ^ (-565438622))), (short) (C1499aX.Xd() ^ ((541138780 ^ 2086831620) ^ (-1545854734))))).getDeclaredMethod(C1561oA.Xd("\u0010z", (short) (C1607wl.Xd() ^ ((928550442 ^ 30358987) ^ 915930732))), new Class[0]);
                    try {
                        declaredMethod3.setAccessible(true);
                        String str3 = (String) declaredMethod3.invoke(null, objArr3);
                        C1626yg.Kd(C1603vu.Xd);
                        EO.Xd(C1603vu.Xd);
                        Object[] objArr4 = new Object[0];
                        Constructor<?> constructor = Class.forName(Wg.vd("h^r\\0teb{wmw\u00047[lQb^PDR^Seb", (short) (OY.Xd() ^ ((124187159 ^ 1728554041) ^ 1616983274)))).getConstructor(new Class[0]);
                        try {
                            constructor.setAccessible(true);
                            int iNextInt = ((SecureRandom) constructor.newInstance(objArr4)).nextInt((1093308946 ^ 694975276) ^ 398005953);
                            Kp kp = new Kp(iNextInt, str2, str3);
                            long id = kp.getId();
                            int i7 = ((iNextInt ^ ((293787738 ^ 1173523758) ^ 1435957822)) << 7) ^ 65;
                            long j2 = (2772417306739935050L ^ 1534826654027935015L) ^ 3689950507667024530L;
                            int i8 = (1365424442 ^ 1688974595) ^ 902368297;
                            int i9 = Integer.parseInt(Qg.kd("\u000e\u001b\u0017\n\t", (short) (C1607wl.Xd() ^ ((1246825780 ^ 20512101) ^ 1265210664)), (short) (C1607wl.Xd() ^ (1420182302 ^ 1420194273))), i8) ^ ((int) ((j2 + id) - (j2 | id)));
                            Class<?> cls2 = Class.forName(C1561oA.ud("J7|\u0011%", (short) (C1580rY.Xd() ^ ((17552697 ^ 642532125) ^ (-659008359)))));
                            Class<?>[] clsArr2 = {Integer.TYPE};
                            Object[] objArr5 = {Integer.valueOf(i9 + (((i9 << (Integer.parseInt(hg.Vd("ejt", (short) (C1633zX.Xd() ^ ((1184292658 ^ 1343861040) ^ (-378496312))), (short) (C1633zX.Xd() ^ ((349878891 ^ 439612235) ^ (-250163365)))), i8) - 650)) + i9) * ((i9 << 2) + i9)))};
                            Method declaredMethod4 = cls2.getDeclaredMethod(C1561oA.yd("hu", (short) (C1499aX.Xd() ^ ((1792673754 ^ 900367109) ^ (-1601227635)))), clsArr2);
                            try {
                                declaredMethod4.setAccessible(true);
                                int iIntValue = (i7 ^ ((Integer) declaredMethod4.invoke(null, objArr5)).intValue()) ^ ((Integer.parseInt(C1561oA.Yd("\u0014\u0015", (short) (FB.Xd() ^ (1373156223 ^ 1373145864))), i8) + 20) << ((byte) ((-1) - (((-1) - ((4050175781847688579L ^ 2502133241800848790L) ^ 1912975989816135706L)) | ((-1) - id)))));
                                Class<?> cls3 = Class.forName(Xg.qd("4#j\u0001\u0017", (short) (Od.Xd() ^ (628568953 ^ (-628585589))), (short) (Od.Xd() ^ (878052604 ^ (-878060793)))));
                                Class<?>[] clsArr3 = {Integer.TYPE};
                                Object[] objArr6 = {Integer.valueOf(iIntValue)};
                                Method declaredMethod5 = cls3.getDeclaredMethod(Jg.Wd("i\u0004", (short) (C1499aX.Xd() ^ (1921354312 ^ (-1921357000))), (short) (C1499aX.Xd() ^ (1248641431 ^ (-1248652579)))), clsArr3);
                                try {
                                    declaredMethod5.setAccessible(true);
                                    int iIntValue2 = ((Integer) declaredMethod5.invoke(null, objArr6)).intValue();
                                    synchronized (CX.Xd) {
                                        long id2 = kp.getId();
                                        StringBuilder sbAppend2 = new StringBuilder().append("").append(iIntValue2);
                                        String strXd = ZO.xd("7", (short) (C1580rY.Xd() ^ ((1350553513 ^ 277155652) ^ (-1090188240))), (short) (C1580rY.Xd() ^ (376485149 ^ (-376501213))));
                                        StringBuilder sbAppend3 = new StringBuilder().append(sbAppend2.append(strXd).toString());
                                        Class<?> cls4 = Class.forName(C1626yg.Ud("If/O\u0011", (short) (C1607wl.Xd() ^ (443795016 ^ 443787273)), (short) (C1607wl.Xd() ^ ((961585291 ^ 1666698222) ^ 1510413957))));
                                        Class<?>[] clsArr4 = {Integer.TYPE};
                                        Object[] objArr7 = {Integer.valueOf((int) id2)};
                                        short sXd4 = (short) (C1633zX.Xd() ^ (970464673 ^ (-970474635)));
                                        int[] iArr3 = new int["rZ".length()];
                                        QB qb3 = new QB("rZ");
                                        int i10 = 0;
                                        while (qb3.YK()) {
                                            int iKK3 = qb3.KK();
                                            Xu xuXd3 = Xu.Xd(iKK3);
                                            iArr3[i10] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i10 % C1561oA.Xd.length] ^ (sXd4 + i10)));
                                            i10++;
                                        }
                                        Method declaredMethod6 = cls4.getDeclaredMethod(new String(iArr3, 0, i10), clsArr4);
                                        try {
                                            declaredMethod6.setAccessible(true);
                                            StringBuilder sbAppend4 = new StringBuilder().append((sbAppend3.append(((Integer) declaredMethod6.invoke(null, objArr7)).intValue()).append(strXd).toString() + str2 + strXd) + str3 + strXd);
                                            long jLongValue = 0;
                                            try {
                                                jLongValue = ((Long) Class.forName(EO.Od("-nQ%)$-z\"Mlt\u0019(5 ", (short) (C1580rY.Xd() ^ (877805658 ^ (-877817517))))).getMethod(C1561oA.Qd("/@<;-5:\u0019-0'\u000e)+*&/", (short) (FB.Xd() ^ ((1186083189 ^ 336932884) ^ 1386698922))), new Class[0]).invoke(null, new Object[0])).longValue();
                                            } catch (Exception e2) {
                                            }
                                            CX.Xd.add(CX.qd(sbAppend4.append(jLongValue).toString()));
                                            kp.start();
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    }
                                    int i11 = 0;
                                    String strZd = C1593ug.zd("C7D", (short) (FB.Xd() ^ ((242787548 ^ 1683725159) ^ 1780703235)), (short) (FB.Xd() ^ ((1970785772 ^ 358771684) ^ 1612031410)));
                                    while (true) {
                                        if (Ug.BX(C1589uF.Xd)) {
                                            C1544kF.Kd = strZd;
                                            JK.Xd = 0;
                                            C1603vu.Xd = 0.0f;
                                            i11 += C1537jK.Kd;
                                            if (i11 != strZd.length()) {
                                                Qg.od(i11);
                                            }
                                        }
                                    }
                                    QK();
                                    int i12 = JK.Xd;
                                    while (C1593ug.Ud(Integer.lowestOneBit(C1617xo.Xd)) && C1537jK.Yd.length() < 0) {
                                        Xg.ud(i12);
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
        for (int iXd3 = Od.Xd() ^ 1207800918; iXd3 > 0 && C1593ug.Ud(451630443 ^ 451629176); iXd3 -= 4) {
            EO.Xd(iXd3);
        }
        IK.Yd = C1561oA.od(":>8B", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609531321)));
        boolean zUd = GF.ud();
        C1617xo.Xd = 0;
        if (zUd) {
            return;
        }
        int i13 = Qd;
        SecureRandom secureRandom = wd;
        int iXd4 = OY.Xd() ^ 69929100;
        C1626yg.Kd(C1603vu.Xd + C1603vu.Xd);
        Qg.od(new Float(C1603vu.Xd).intValue() % 34);
        int iNextInt2 = secureRandom.nextInt(iXd4);
        if (C1544kF.Kd.length() != 0 && Ig.uX(C1587uA.Kd)) {
            C1603vu.Xd = r1.length();
            JX.Kd = 0;
        }
        if (i13 > iNextInt2) {
            Xg.ud(C1603vu.Xd);
            Jg.wd(C1537jK.Kd);
            int iXd5 = ZN.Xd() ^ 864698106;
            String strKd = C1561oA.Kd("RSTW", (short) (C1499aX.Xd() ^ (1010409447 ^ (-1010430734))));
            int i14 = Integer.parseInt(strKd);
            do {
                StringBuilder sb = new StringBuilder();
                short sXd5 = (short) (OY.Xd() ^ (694865054 ^ 694875205));
                short sXd6 = (short) (OY.Xd() ^ ((1465689564 ^ 42523118) ^ 1439976833));
                int[] iArr4 = new int["\u001a3#\b ".length()];
                QB qb4 = new QB("\u001a3#\b ");
                int i15 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i15] = xuXd4.fK(((i15 * sXd6) ^ sXd5) + xuXd4.CK(iKK4));
                    i15++;
                }
                String string = sb.append(new String(iArr4, 0, i15)).append(C1623yX.Kd).toString();
                C1537jK.Yd = C1523gX.Kd + string + C1561oA.Xd("^", (short) (C1607wl.Xd() ^ (827365869 ^ 827379881)));
                if (string.length() >= 0) {
                    break;
                }
                ZO.Od(string);
                i14--;
            } while (i14 > strKd.length());
            Class<?> cls5 = Class.forName(Wg.vd("\u0012~D|_", (short) (FB.Xd() ^ ((955254141 ^ 1248994473) ^ 1921141055))));
            Class<?>[] clsArr5 = {Integer.TYPE};
            Object[] objArr8 = {Integer.valueOf(iXd5)};
            Method declaredMethod7 = cls5.getDeclaredMethod(Qg.kd("\u001e\u000b", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69942990))), (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (91771740 ^ (-921829506))))), clsArr5);
            try {
                declaredMethod7.setAccessible(true);
                declaredMethod7.invoke(null, objArr8);
                int length3 = XN.Kd + C1587uA.Kd.length();
                if (Tg.Wd(length3) && length3 > Math.tan(C1603vu.Xd)) {
                    C1593ug.Qd(length3);
                }
                CX.ud();
                C1626yg.Kd(C1603vu.Xd);
                EO.Xd(C1603vu.Xd);
                Object[] objArr9 = new Object[0];
                Method declaredMethod8 = Class.forName(hg.Vd("\u0016\u0003Hri", (short) (C1499aX.Xd() ^ ((785073821 ^ 1607275254) ^ (-1896225164))), (short) (C1499aX.Xd() ^ (52945743 ^ (-52948251))))).getDeclaredMethod(C1561oA.ud("2*", (short) (C1633zX.Xd() ^ (1242069665 ^ (-1242055957)))), new Class[0]);
                try {
                    declaredMethod8.setAccessible(true);
                    String str4 = (String) declaredMethod8.invoke(null, objArr9);
                    int length4 = (C1623yX.Kd + C1561oA.yd("\u0004,20:6>\t", (short) (C1633zX.Xd() ^ (532380958 ^ (-532356073))))).length();
                    do {
                        switch (length4) {
                            case 97:
                                length4 = 0;
                                short sXd7 = (short) (C1633zX.Xd() ^ (129894818 ^ (-129904783)));
                                int[] iArr5 = new int["djfr".length()];
                                QB qb5 = new QB("djfr");
                                int i16 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i16] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd7 + sXd7) + sXd7) + i16));
                                    i16++;
                                }
                                new String(iArr5, 0, i16);
                                break;
                            default:
                                length4 -= (IK.Yd.length() * Math.abs(C1526hF.Xd)) + 1;
                                break;
                        }
                    } while (length4 < 0);
                    Object[] objArr10 = new Object[0];
                    Method declaredMethod9 = Class.forName(Xg.qd("C2y&\u001f", (short) (C1499aX.Xd() ^ ((1586742222 ^ 147023325) ^ (-1448133805))), (short) (C1499aX.Xd() ^ ((1078980028 ^ 2091980474) ^ (-1023312828))))).getDeclaredMethod(Jg.Wd("Gx", (short) (FB.Xd() ^ (1755798065 ^ 1755784363)), (short) (FB.Xd() ^ (1614642534 ^ 1614619833))), new Class[0]);
                    try {
                        declaredMethod9.setAccessible(true);
                        String str5 = (String) declaredMethod9.invoke(null, objArr10);
                        C1626yg.Kd(C1603vu.Xd);
                        EO.Xd(C1603vu.Xd);
                        Object[] objArr11 = new Object[0];
                        Constructor<?> constructor2 = Class.forName(ZO.xd("\tS3\u0015KEGs4wK\u007f;t\u0004\u0003hos*H~QRR\u0010", (short) (FB.Xd() ^ (1433770340 ^ 1433779423)), (short) (FB.Xd() ^ (1806428997 ^ 1806419853)))).getConstructor(new Class[0]);
                        try {
                            constructor2.setAccessible(true);
                            int iNextInt3 = ((SecureRandom) constructor2.newInstance(objArr11)).nextInt((1258974919 ^ 1322312426) ^ 2049274834);
                            Kp kp2 = new Kp(iNextInt3, str4, str5);
                            long id3 = kp2.getId();
                            int i17 = ((iNextInt3 ^ (96846417 ^ 69430555)) << 7) ^ 65;
                            long j3 = (3049361831912339259L ^ 9110658415387937501L) ^ 6070304607657786649L;
                            int i18 = 1202159650 ^ 1202159666;
                            int i19 = Integer.parseInt(C1626yg.Ud("z\u0001_M5", (short) (C1580rY.Xd() ^ (184125004 ^ (-184145666))), (short) (C1580rY.Xd() ^ (1811715891 ^ (-1811721021)))), i18) ^ ((int) ((j3 + id3) - (j3 | id3)));
                            Class<?> cls6 = Class.forName(EO.Od(")G0in", (short) (Od.Xd() ^ ((295308462 ^ 187890010) ^ (-447251502)))));
                            Class<?>[] clsArr6 = {Integer.TYPE};
                            Object[] objArr12 = {Integer.valueOf(i19 + (((i19 << (Integer.parseInt(Ig.wd(";\u0013*", (short) (C1499aX.Xd() ^ (961698608 ^ (-961692459)))), i18) - 650)) + i19) * ((i19 << 2) + i19)))};
                            Method declaredMethod10 = cls6.getDeclaredMethod(C1561oA.Qd("LW", (short) (ZN.Xd() ^ ((1915456368 ^ 1437005316) ^ 663568762))), clsArr6);
                            try {
                                declaredMethod10.setAccessible(true);
                                long j4 = (8672485892529962736L ^ 2328848705769693008L) ^ 6344270565587706287L;
                                int iIntValue3 = (i17 ^ ((Integer) declaredMethod10.invoke(null, objArr12)).intValue()) ^ ((Integer.parseInt(C1593ug.zd("!\"", (short) (C1607wl.Xd() ^ (1765101906 ^ 1765082453)), (short) (C1607wl.Xd() ^ (445503867 ^ 445498059))), i18) + 20) << ((byte) ((j4 + id3) - (j4 | id3))));
                                Class<?> cls7 = Class.forName(C1561oA.od("VC\t\u001d1", (short) (C1580rY.Xd() ^ (1995883197 ^ (-1995874079)))));
                                Class<?>[] clsArr7 = {Integer.TYPE};
                                Object[] objArr13 = {Integer.valueOf(iIntValue3)};
                                Method declaredMethod11 = cls7.getDeclaredMethod(C1561oA.Kd("\u001c)", (short) (C1580rY.Xd() ^ ((1598777194 ^ 1783520572) ^ (-889547281)))), clsArr7);
                                try {
                                    declaredMethod11.setAccessible(true);
                                    int iIntValue4 = ((Integer) declaredMethod11.invoke(null, objArr13)).intValue();
                                    synchronized (CX.Xd) {
                                        long id4 = kp2.getId();
                                        StringBuilder sbAppend5 = new StringBuilder().append("").append(iIntValue4);
                                        String strZd2 = Wg.Zd("4", (short) (OY.Xd() ^ ((2057529011 ^ 74884619) ^ 2127927937)), (short) (OY.Xd() ^ ((1788305680 ^ 1464634431) ^ 1037810068)));
                                        StringBuilder sbAppend6 = new StringBuilder().append(sbAppend5.append(strZd2).toString());
                                        Class<?> cls8 = Class.forName(C1561oA.Xd("<+r\t\u001f", (short) (C1580rY.Xd() ^ (80762462 ^ (-80764990)))));
                                        Class<?>[] clsArr8 = {Integer.TYPE};
                                        Object[] objArr14 = {Integer.valueOf((int) id4)};
                                        Method declaredMethod12 = cls8.getDeclaredMethod(Wg.vd("y\u0007", (short) (Od.Xd() ^ ((1875789532 ^ 1859790942) ^ (-18109718)))), clsArr8);
                                        try {
                                            declaredMethod12.setAccessible(true);
                                            StringBuilder sbAppend7 = new StringBuilder().append((sbAppend6.append(((Integer) declaredMethod12.invoke(null, objArr14)).intValue()).append(strZd2).toString() + str4 + strZd2) + str5 + strZd2);
                                            long jLongValue2 = 0;
                                            try {
                                                jLongValue2 = ((Long) Class.forName(Qg.kd("si}g3pdph.Rwpp`g", (short) (FB.Xd() ^ (586285915 ^ 586292033)), (short) (FB.Xd() ^ ((640416220 ^ 156808421) ^ 796084191)))).getMethod(hg.Vd("N_[ZLTY8LOF-HJIEN", (short) (OY.Xd() ^ (2049151796 ^ 2049173963)), (short) (OY.Xd() ^ (151846625 ^ 151824592))), new Class[0]).invoke(null, new Object[0])).longValue();
                                            } catch (Exception e10) {
                                            }
                                            CX.Xd.add(CX.qd(sbAppend7.append(jLongValue2).toString()));
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
