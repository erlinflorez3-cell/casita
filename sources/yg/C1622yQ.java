package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.yQ */
/* JADX INFO: loaded from: classes9.dex */
public class C1622yQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        if (Wg.oX(C1561oA.od("\u007f~}|{zhrdck-,+*)('", (short) (Od.Xd() ^ (1741920312 ^ (-1741917613)))))) {
            C1523gX.Kd = "";
            JN.Xd = 0;
            C1603vu.Xd = 0.0f;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("B1xE\u001e", (short) (OY.Xd() ^ (ZN.Xd() ^ (450685667 ^ 693536020))))).getDeclaredMethod(Wg.Zd("NS", (short) (C1633zX.Xd() ^ (1354265766 ^ (-1354256570))), (short) (C1633zX.Xd() ^ ((2096548274 ^ 294479665) ^ (-1836831682)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            int i2 = JN.Xd;
            while (C1593ug.Ud(Integer.lowestOneBit(XN.Kd)) && C1587uA.Kd.length() < 0) {
                Xg.ud(i2);
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Xd("\"\u0011X%}", (short) (OY.Xd() ^ (944857086 ^ 944858834)))).getDeclaredMethod(Wg.vd("SI", (short) (C1580rY.Xd() ^ (2106132476 ^ (-2106140872)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                if (Ig.uX(C1623yX.Kd)) {
                    Wg.kd(C1523gX.Kd);
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(Qg.kd("eR\u0018b9", (short) (C1633zX.Xd() ^ (426478261 ^ (-426486360))), (short) (C1633zX.Xd() ^ ((685923699 ^ 915802042) ^ (-510937506))))).getDeclaredMethod(hg.Vd("\u0004\u000f", (short) (C1633zX.Xd() ^ ((1352739260 ^ 231125017) ^ (-1567076503))), (short) (C1633zX.Xd() ^ ((888596696 ^ 854823124) ^ (-100998933)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    if (C1623yX.Kd == null) {
                        C1623yX.Kd.replaceAll(C1561oA.ud("y\u0012\fED", (short) (C1607wl.Xd() ^ ((69460625 ^ 147431841) ^ 216689798))), C1561oA.yd("\u0013\u0012", (short) (C1499aX.Xd() ^ (506733434 ^ (-506748819)))));
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(C1561oA.Yd("\u0011\u007fG\u0014l", (short) (C1633zX.Xd() ^ (1774842856 ^ (-1774821246))))).getDeclaredMethod(Xg.qd("N>", (short) (C1633zX.Xd() ^ ((1517617991 ^ 1355356886) ^ (-180104837))), (short) (C1633zX.Xd() ^ (1100121777 ^ (-1100148689)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        String str = IK.Yd;
                        if (str != null) {
                            Qg.od(str.indexOf((595115849 ^ 1852859717) ^ 1292425839));
                        }
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(Jg.Wd("\u001auQ%\u00071i~g+\u0007\u0019\u0015 LC615z^tj%\u0005\n", (short) (OY.Xd() ^ ((850933564 ^ 784821644) ^ 478091727)), (short) (OY.Xd() ^ (2109982351 ^ 2109975237)))).getConstructor(new Class[0]);
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

    public C1622yQ() {
        int i2 = 0;
        short sXd = (short) (FB.Xd() ^ (C1607wl.Xd() ^ (10691154 ^ 1860662600)));
        short sXd2 = (short) (FB.Xd() ^ ((1182956491 ^ 1125851414) ^ 93922098));
        int[] iArr = new int[">\u0001u".length()];
        QB qb = new QB(">\u0001u");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        while (true) {
            if (!Ug.BX(C1598vY.Kd)) {
                break;
            }
            C1537jK.Yd = str;
            YX.Kd = 0;
            C1603vu.Xd = 0.0f;
            i2 += C1546kX.Xd;
            if (i2 != str.length()) {
                Qg.od(i2);
                break;
            }
        }
    }

    public static void Od() throws Exception {
        if ((C1544kF.Kd + C1561oA.Xd("\r\tm\u0010\u000f\u0007\r\u0007", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831064512))))).length() >= 0 && Ug.BX(IK.Yd)) {
            NX.Xd = 0;
        }
        CX.ud();
        Ug.vd(C1587uA.Kd);
        C1622yQ c1622yQ = new C1622yQ();
        int i2 = ud;
        int i3 = od;
        int iReverseBytes = Integer.reverseBytes(C1617xo.Xd);
        if (iReverseBytes < 0 && Jg.YX(C1620yF.Xd) && (C1598vY.Kd.hashCode() ^ iReverseBytes) == 0) {
            Qg.od(YX.Kd + C1623yX.Kd.lastIndexOf(Wg.vd("daWV", (short) (C1580rY.Xd() ^ ((1200425672 ^ 1531163716) ^ (-483315849))))));
        }
        c1622yQ.yK(i2, i3);
    }

    public static String Qd() {
        return C1626yg.Ud("\u001aV(zq", (short) (FB.Xd() ^ (ZN.Xd() ^ (1329477172 ^ 2092192895))), (short) (FB.Xd() ^ ((610093223 ^ 880959127) ^ 283077177)));
    }

    public static int Xd() {
        return 0;
    }

    public static int od() {
        return 0;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        C1626yg.Kd(C1603vu.Xd + C1603vu.Xd);
        Qg.od(new Float(C1603vu.Xd).intValue() % 34);
        if (z2) {
            if (Wg.oX(C1587uA.Kd)) {
                IK.Yd = "";
            }
            if ((C1544kF.Kd + Qg.kd("B<\u001f?<26.", (short) (C1607wl.Xd() ^ ((838736390 ^ 1832247693) ^ 1556845193)), (short) (C1607wl.Xd() ^ (1497992733 ^ 1497993666)))).length() >= 0 && Ug.BX(IK.Yd)) {
                NX.Xd = 0;
            }
            CX.ud();
            Ug.vd(C1587uA.Kd);
            C1622yQ c1622yQ = new C1622yQ();
            int i2 = ud;
            int i3 = od;
            int iReverseBytes = Integer.reverseBytes(C1617xo.Xd);
            if (iReverseBytes < 0 && Jg.YX(C1620yF.Xd) && (C1598vY.Kd.hashCode() ^ iReverseBytes) == 0) {
                Qg.od(YX.Kd + C1623yX.Kd.lastIndexOf(hg.Vd("\u0007\u0004ut", (short) (ZN.Xd() ^ ((1388806487 ^ 458920193) ^ 1235032608)), (short) (ZN.Xd() ^ (1359414448 ^ 1359413321)))));
            }
            c1622yQ.yK(i2, i3);
            if (C1589uF.Xd == null) {
                C1537jK.Yd.replaceAll(C1561oA.ud("m\u0006\u007f98", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951488694)))), C1561oA.yd("IH", (short) (C1580rY.Xd() ^ (1791457374 ^ (-1791435404)))));
                return;
            }
            return;
        }
        int i4 = 0;
        String strYd = C1561oA.Yd(" \u0014!", (short) (FB.Xd() ^ ((2026493992 ^ 94106124) ^ 2102532164)));
        while (true) {
            if (!Ug.BX(C1537jK.Yd)) {
                break;
            }
            IK.Yd = strYd;
            C1537jK.Kd = 0;
            C1603vu.Xd = 0.0f;
            i4 += C1546kX.Xd;
            if (i4 != strYd.length()) {
                Qg.od(i4);
                break;
            }
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd(".\u001dd1\n", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (432811148 ^ (-1839019910)))), (short) (ZN.Xd() ^ ((1293871566 ^ 1399414472) ^ 511158698)))).getDeclaredMethod(Jg.Wd("n<", (short) (ZN.Xd() ^ (779434313 ^ 779423668)), (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849970082))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            if (Math.random() * 100.0d < 0.0d) {
                YX.Kd = NX.Xd - ((NX.Xd * 2) - JK.Xd);
            }
            short sXd = (short) (C1633zX.Xd() ^ (955968355 ^ (-955968256)));
            short sXd2 = (short) (C1633zX.Xd() ^ (1067823360 ^ (-1067838857)));
            int[] iArr = new int["nV\"vh".length()];
            QB qb = new QB("nV\"vh");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd2) + sXd)));
                i5++;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(new String(iArr, 0, i5)).getDeclaredMethod(C1626yg.Ud("nz", (short) (C1633zX.Xd() ^ (71833342 ^ (-71830428))), (short) (C1633zX.Xd() ^ (1533245740 ^ (-1533229139)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                int i6 = 0;
                while (true) {
                    if (i6 >= NX.Xd % 8 && i6 <= i6 + i6) {
                        CX.yd(str, str2);
                        return;
                    } else {
                        C1546kX.Xd = i6 + 1;
                        i6 = i6 + 68 + 1;
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static int ud() {
        return (2089277475 ^ 589604087) ^ 1604549834;
    }

    public static String yd() {
        return Ig.wd("\u001cc", (short) (ZN.Xd() ^ (OY.Xd() ^ (469362087 ^ 533896068))));
    }

    public static boolean zd() {
        return true;
    }

    @Override // yg.RY
    public void FK() throws Throwable {
        boolean z2 = yd;
        if (Wg.oX(C1587uA.Kd)) {
            Xg.Kd = C1523gX.Kd + Ig.wd("u,\u0010p-o\u0017\u0019", (short) (C1580rY.Xd() ^ ((604142758 ^ 1139744823) ^ (-1743594276))));
        }
        if (z2) {
            if (IK.Yd.length() != 0 && Ig.uX(C1589uF.Xd)) {
                C1603vu.Xd = r1.length();
                C1617xo.Xd = 0;
            }
            int i2 = (1981512668 ^ 1242615161) ^ 1007400623;
            String str = C1537jK.Yd;
            if (str == null) {
                String str2 = C1623yX.Kd;
                String strOd = EO.Od("f\u0019\u00075du\n", (short) (Od.Xd() ^ (563842654 ^ (-563861557))));
                short sXd = (short) (ZN.Xd() ^ ((1719483033 ^ 1434391243) ^ 855770609));
                int[] iArr = new int["{\u007ftt\u0007".length()];
                QB qb = new QB("{\u007ftt\u0007");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                    i3++;
                }
                str2.replaceAll(strOd, new String(iArr, 0, i3));
                ZO.Od(str);
            }
            Class<?> cls = Class.forName(C1593ug.zd("J9\u0001; ", (short) (C1580rY.Xd() ^ (1634081747 ^ (-1634076555))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (1950419492 ^ 937046987)))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.od("/\u001c", (short) (C1580rY.Xd() ^ (1046260790 ^ (-1046266438)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                if (C1623yX.Kd == null) {
                    while (C1593ug.Ud(C1620yF.Xd)) {
                        Jg.YX(YX.Kd);
                    }
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.Kd("!\u0010W\u0003|", (short) (C1580rY.Xd() ^ (1058555328 ^ (-1058544029))))).getDeclaredMethod(Wg.Zd("\u001c*", (short) (C1499aX.Xd() ^ ((1415133447 ^ 574437873) ^ (-1986293286))), (short) (C1499aX.Xd() ^ (568589491 ^ (-568573569)))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(null, objArr2);
                    C1537jK.Yd = String.valueOf(C1561oA.Xd("\u000b\r\u0011\u0013", (short) (C1633zX.Xd() ^ (626724591 ^ (-626752227)))));
                    QK();
                    if (Wg.oX(C1623yX.Kd)) {
                        C1587uA.Kd = "";
                        return;
                    }
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (Math.abs(C1620yF.Xd) + 1 > C1620yF.Xd * 2) {
            C1603vu.Xd = (float) (((double) C1603vu.Xd) * Double.longBitsToDouble(C1499aX.Kd() ^ 8260734013100235404L));
            if (C1603vu.Xd > 0.0f) {
                C1603vu.Xd -= C1584tK.Kd.length();
            } else {
                C1603vu.Xd *= Float.intBitsToFloat(649429774 ^ (-1724546290));
            }
        }
        if (C1584tK.Kd.length() != 0 && Ig.uX(C1589uF.Xd)) {
            C1603vu.Xd = r1.length();
            JK.Xd = 0;
        }
        boolean zUd = GF.ud();
        Tg.Yd(0.0f);
        if (zUd) {
            return;
        }
        int i4 = Qd;
        SecureRandom secureRandom = wd;
        int iXd = C1633zX.Xd() ^ (833582779 ^ (-1174278892));
        int i5 = C1617xo.Xd;
        for (int i6 = 0; i6 > (Od.Xd() ^ (566009120 ^ 1715538303)); i6++) {
            String str3 = C1587uA.Kd;
            C1603vu.Xd -= str3.length() * 2;
            C1537jK.Yd = str3;
        }
        int iNextInt = secureRandom.nextInt(iXd);
        short sXd2 = (short) (OY.Xd() ^ (1465782480 ^ 1465802993));
        int[] iArr2 = new int["tvvx".length()];
        QB qb2 = new QB("tvvx");
        int i7 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i7] = xuXd2.fK((sXd2 ^ i7) + xuXd2.CK(iKK2));
            i7++;
        }
        C1589uF.Xd = String.valueOf(new String(iArr2, 0, i7));
        if (i4 > iNextInt) {
            for (int i8 = (590333104 ^ 2083540873) ^ 1595902781; i8 > 0; i8 -= 2) {
                C1626yg.Kd(i8);
            }
            int iXd2 = C1580rY.Xd() ^ (-831067157);
            String str4 = C1537jK.Yd;
            if (str4 == null) {
                C1623yX.Kd.replaceAll(Qg.kd("utsA@rq", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (2038754206 ^ 232101536))), (short) (C1580rY.Xd() ^ (1320246355 ^ (-1320250290)))), hg.Vd("\u000e\u0012\u0007\u0007\u0019", (short) (OY.Xd() ^ ((1847038862 ^ 9620174) ^ 1854224069)), (short) (OY.Xd() ^ (OY.Xd() ^ 69944976))));
                ZO.Od(str4);
            }
            Class<?> cls2 = Class.forName(C1561oA.ud("D1v/\u0012", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1412139860 ^ 1705172400)))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf(iXd2)};
            Method declaredMethod3 = cls2.getDeclaredMethod(C1561oA.yd("ta", (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1877733641 ^ 805627211)))), clsArr2);
            try {
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(null, objArr3);
                if (C1623yX.Kd == null) {
                    while (C1593ug.Ud(C1620yF.Xd)) {
                        Jg.YX(YX.Kd);
                    }
                }
                short sXd3 = (short) (FB.Xd() ^ (603299457 ^ 603296431));
                int[] iArr3 = new int["(\u0017^\n\u0004".length()];
                QB qb3 = new QB("(\u0017^\n\u0004");
                int i9 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i9] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i9));
                    i9++;
                }
                Object[] objArr4 = new Object[0];
                Method declaredMethod4 = Class.forName(new String(iArr3, 0, i9)).getDeclaredMethod(Xg.qd("\u0017\r", (short) (OY.Xd() ^ (1167729325 ^ 1167736858)), (short) (OY.Xd() ^ (114771309 ^ 114764344))), new Class[0]);
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
