package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class wQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        int i2 = JK.Xd + IK.Kd;
        float f2 = (C1546kX.Xd * i2) + i2;
        C1546kX.Xd = C1617xo.Xd;
        C1526hF.Xd = i2 - ((JX.Kd * 2) - JX.Kd);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(ZO.xd("qcfgW", (short) (ZN.Xd() ^ (921452844 ^ 921436710)), (short) (ZN.Xd() ^ (551323092 ^ 551323516)))).getDeclaredMethod(C1626yg.Ud("j ", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (209614325 ^ (-1072958125)))), (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849956719)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            if (Ig.uX(C1589uF.Xd)) {
                Wg.kd(Xg.Kd);
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Ig.wd("j2\tp\u0019", (short) (ZN.Xd() ^ (1907919889 ^ 1907934950)))).getDeclaredMethod(EO.Od(":{", (short) (C1499aX.Xd() ^ ((540059110 ^ 954621044) ^ (-416722555)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                C1544kF.Kd = String.valueOf(C1561oA.Qd("RRTT", (short) (ZN.Xd() ^ ((1744433974 ^ 1338617120) ^ 674235081))));
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(C1593ug.zd("\u007fn6\u0001[", (short) (C1499aX.Xd() ^ ((2138397834 ^ 1961275126) ^ (-194219976))), (short) (C1499aX.Xd() ^ ((2057955579 ^ 1625070240) ^ (-443905577))))).getDeclaredMethod(C1561oA.od(";/", (short) (C1580rY.Xd() ^ ((1951390923 ^ 153087100) ^ (-2102401590)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    C1623yX.Kd = C1561oA.Kd("132", (short) (C1633zX.Xd() ^ (1510377495 ^ (-1510396926))));
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(Wg.Zd("86I$J", (short) (ZN.Xd() ^ (1522929356 ^ 1522932566)), (short) (ZN.Xd() ^ (43887553 ^ 43904337)))).getDeclaredMethod(C1561oA.Xd("mz", (short) (C1633zX.Xd() ^ (1483230377 ^ (-1483230034)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        C1626yg.Kd(C1603vu.Xd);
                        if (C1593ug.Ud(IK.Kd)) {
                            EO.Xd(0 - 1);
                        }
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(Wg.vd("vn\u0005p>\u0005wvywo{\u00027]p\u007f\u0013\u0011\u0005r\u0003\u0011\b\u0004\u0003", (short) (OY.Xd() ^ ((2084641773 ^ 1729541748) ^ 458725510)))).getConstructor(new Class[0]);
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

    public wQ() {
        if (Math.random() * Double.longBitsToDouble(3393224625984208917L ^ 8020391768130682901L) < 0.0d) {
            Tg.Yd(XN.Kd * C1603vu.Xd);
        }
    }

    public static void Od() throws Exception {
        C1537jK.Kd = 1;
        CX.ud();
        int iReverseBytes = Integer.reverseBytes(IK.Kd);
        if (iReverseBytes < 0 && Jg.YX(IK.Kd) && (Xg.Kd.hashCode() ^ iReverseBytes) == 0) {
            Qg.od(YX.Kd + C1589uF.Xd.lastIndexOf(ZO.xd("JW\u0003c", (short) (C1499aX.Xd() ^ (1709464696 ^ (-1709451994))), (short) (C1499aX.Xd() ^ (517354754 ^ (-517346880))))));
        }
        wQ wQVar = new wQ();
        int i2 = ud;
        int i3 = od;
        int i4 = YX.Kd;
        while (C1593ug.Ud(i4)) {
            C1593ug.Qd(Integer.numberOfLeadingZeros(C1620yF.Xd));
        }
        wQVar.yK(i2, i3);
    }

    public static String Qd() {
        int iXd = ZN.Xd() ^ (1155651186 ^ 2003563159);
        int iXd2 = Od.Xd() ^ (1439872605 ^ 305079066);
        short sXd = (short) (C1607wl.Xd() ^ iXd);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr = new int["\u0005q7\u007fX".length()];
        QB qb = new QB("\u0005q7\u007fX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static int Xd() {
        return FB.Xd() ^ 1609527055;
    }

    public static int od() {
        return 0;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        if (Wg.oX(C1623yX.Kd)) {
            IK.Yd = C1537jK.Yd + C1626yg.Ud(";uS\f\b%W\u0016", (short) (ZN.Xd() ^ (872270657 ^ 872258873)), (short) (ZN.Xd() ^ ((554890639 ^ 1674082249) ^ 1121621540)));
        }
        if (z2) {
            switch (C1546kX.Xd % 8) {
                case 0:
                    Ug.vd(C1587uA.Kd);
                    break;
                case 1:
                    Ig.qd(Xg.Kd);
                default:
                    Qg.od(0);
                    break;
            }
            C1537jK.Kd = 1;
            CX.ud();
            int iReverseBytes = Integer.reverseBytes(IK.Kd);
            if (iReverseBytes < 0 && Jg.YX(IK.Kd) && (Xg.Kd.hashCode() ^ iReverseBytes) == 0) {
                Qg.od(YX.Kd + C1589uF.Xd.lastIndexOf(Ig.wd("\u0001*\tz", (short) (FB.Xd() ^ ((919931816 ^ 1295117838) ^ 2078584232)))));
            }
            wQ wQVar = new wQ();
            int i2 = ud;
            int i3 = od;
            int i4 = YX.Kd;
            while (C1593ug.Ud(i4)) {
                C1593ug.Qd(Integer.numberOfLeadingZeros(C1620yF.Xd));
            }
            wQVar.yK(i2, i3);
            int length = (IK.Yd + EO.Od("\u0003y\u0005)n?\u001eG", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864706349))))).length();
            do {
                switch (length) {
                    case 97:
                        length = 0;
                        C1561oA.Qd("uys}", (short) (C1633zX.Xd() ^ (292307635 ^ (-292294924))));
                        break;
                    default:
                        length -= (C1544kF.Kd.length() * Math.abs(JK.Xd)) + 1;
                        break;
                }
            } while (length < 0);
            return;
        }
        if (Qg.Zd(JK.Xd) && C1593ug.Ud(0)) {
            Jg.wd(1);
            Jg.wd(1);
            Jg.wd(C1523gX.Kd.compareTo(C1593ug.zd("BDD<FHH@", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951479055)), (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831063490)))));
        }
        short sXd = (short) (C1499aX.Xd() ^ ((12354528 ^ 288327673) ^ (-294853217)));
        int[] iArr = new int["<)n7\u0010".length()];
        QB qb = new QB("<)n7\u0010");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + sXd + i5 + xuXd.CK(iKK));
            i5++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i5)).getDeclaredMethod(C1561oA.Kd("\u007f\u0014", (short) (C1499aX.Xd() ^ (182840308 ^ (-182829469)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            String strZd = Wg.Zd("\n\u0015\u001e/", (short) (C1499aX.Xd() ^ (1759924928 ^ (-1759931378))), (short) (C1499aX.Xd() ^ ((1425214648 ^ 1849307395) ^ (-986258862))));
            C1523gX.Kd = strZd;
            Ig.qd(strZd);
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Xd("'\u0016](\u0003", (short) (C1580rY.Xd() ^ ((776365431 ^ 1805630417) ^ (-1171911958))))).getDeclaredMethod(Wg.vd("cM", (short) (Od.Xd() ^ ((554050242 ^ 226495795) ^ (-747011328)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                Xg.ud(C1603vu.Xd);
                Jg.wd(YX.Kd);
                CX.yd(str, str2);
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
        int iXd = C1499aX.Xd() ^ (693057128 ^ (-1792299578));
        int iXd2 = C1580rY.Xd() ^ (-831068749);
        short sXd = (short) (ZN.Xd() ^ iXd);
        short sXd2 = (short) (ZN.Xd() ^ iXd2);
        int[] iArr = new int["\u001d1".length()];
        QB qb = new QB("\u001d1");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static boolean zd() {
        return true;
    }

    @Override // yg.RY
    public void FK() throws Throwable {
        boolean z2 = yd;
        if (ZO.lX(Qg.kd("\u0004\u0012\u0018\u000e\u0011ihgfi", (short) (OY.Xd() ^ (FB.Xd() ^ 1609528405)), (short) (OY.Xd() ^ (1648849512 ^ 1648842522))))) {
            C1623yX.Kd = "";
            XN.Kd = 0;
            C1603vu.Xd = 0.0f;
        }
        if (z2) {
            if (C1598vY.Kd != null) {
                JN.Xd = C1623yX.Kd.hashCode();
            }
            int iXd = OY.Xd() ^ (47634113 ^ 117300771);
            int i2 = C1537jK.Kd;
            for (int i3 = 0; i3 < (C1499aX.Xd() ^ (324331607 ^ (-1355779919))); i3++) {
                String str = C1523gX.Kd;
                C1603vu.Xd -= str.length();
                C1544kF.Kd = str;
                if (str == null) {
                    break;
                }
                ZO.Od(str);
                if (Wg.oX(str)) {
                    break;
                }
            }
            Class<?> cls = Class.forName(hg.Vd("ZG\rE(", (short) (OY.Xd() ^ (729084920 ^ 729073014)), (short) (OY.Xd() ^ (ZN.Xd() ^ 864693223))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(iXd)};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.ud("\u0017\u0004", (short) (C1607wl.Xd() ^ (204527616 ^ 204527613))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                StringBuilder sbAppend = new StringBuilder().append(C1544kF.Kd);
                short sXd = (short) (ZN.Xd() ^ (1164521745 ^ 1164509421));
                int[] iArr = new int["\u001f\u001b\u007f\"\u0019\u0011\u0017\u0011".length()];
                QB qb = new QB("\u001f\u001b\u007f\"\u0019\u0011\u0017\u0011");
                int i4 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i4));
                    i4++;
                }
                if (sbAppend.append(new String(iArr, 0, i4)).toString().length() >= 0 && Ug.BX(C1598vY.Kd)) {
                    NX.Xd = 0;
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.Yd("tc+jP", (short) (FB.Xd() ^ (913607680 ^ 913607744)))).getDeclaredMethod(Xg.qd("=-", (short) (C1499aX.Xd() ^ ((1986038651 ^ 1541621575) ^ (-763608908))), (short) (C1499aX.Xd() ^ ((1966694476 ^ 800177702) ^ (-1518915851)))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(null, objArr2);
                    int i5 = C1537jK.Kd;
                    while (C1593ug.Ud(i5)) {
                        C1593ug.Qd(Integer.numberOfLeadingZeros(XN.Kd));
                    }
                    QK();
                    String str2 = IK.Yd;
                    if (str2 == null) {
                        IK.Yd.replaceAll(Jg.Wd("Iy^\u0015ytY", (short) (OY.Xd() ^ ((618046216 ^ 1837851072) ^ 1230881782)), (short) (OY.Xd() ^ (2040874365 ^ 2040859722))), ZO.xd("=V\u0017iW", (short) (C1580rY.Xd() ^ (989739479 ^ (-989741489))), (short) (C1580rY.Xd() ^ (770393587 ^ (-770397883)))));
                        ZO.Od(str2);
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
        (C1544kF.Kd + C1626yg.Ud("7\u0002n7+9c", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (1381497337 ^ 1007931392))), (short) (ZN.Xd() ^ (OY.Xd() ^ (401096387 ^ 331562809))))).length();
        int iCeil = (int) Math.ceil(Math.abs((((double) C1603vu.Xd) * Double.longBitsToDouble(C1499aX.Kd() ^ (5837230665190057082L ^ 6649052938344807574L))) / Double.longBitsToDouble((4482415510571803576L ^ 8132330392547523003L) ^ 1073627523563714903L)));
        if (iCeil < 0) {
            double dLongBitsToDouble = Double.longBitsToDouble(ZN.Yd() ^ (-1119517837442269456L));
            double dSin = Math.sin(C1620yF.Xd);
            double dCos = Math.cos(((double) NX.Xd) * Double.longBitsToDouble(ZN.Yd() ^ (5846997062134831696L ^ 6821440016789486906L)));
            double dSin2 = Math.sin(Math.random());
            while (true) {
                if (dLongBitsToDouble <= dCos && ((double) iCeil) * dSin < dSin2) {
                    break;
                }
                C1584tK.Kd = Ig.wd("h\u0017+j?\t_/", (short) (FB.Xd() ^ ((1003922109 ^ 1758261862) ^ 1394216955)));
                dLongBitsToDouble -= Double.longBitsToDouble(Od.Kd() ^ (283870067156547500L ^ 1736210512767017977L));
                if (dSin > dLongBitsToDouble) {
                    C1620yF.Xd += C1544kF.Kd.length() * ((int) dSin2);
                    break;
                }
            }
        }
        if (EO.zd(C1603vu.Xd)) {
            EO.Xd(C1603vu.Xd);
            C1626yg.Kd(C1603vu.Xd + Float.intBitsToFloat(Od.Xd() ^ 2021495893));
        }
        boolean zUd = GF.ud();
        if (C1589uF.Xd == null) {
            C1546kX.Xd = 0;
        }
        if (zUd) {
            return;
        }
        int i6 = Qd;
        SecureRandom secureRandom = wd;
        int i7 = 1538914983 ^ 1538915011;
        if ((Xg.Kd + EO.Od("OtFPU)B[", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (1380272422 ^ (-1006700073)))))).length() >= 0 && Ug.BX(C1587uA.Kd)) {
            C1537jK.Kd = 0;
        }
        int iNextInt = secureRandom.nextInt(i7);
        String str3 = C1589uF.Xd + C1561oA.Qd("\u000e\u0019\u0017\u0016\f\t\u0019\r\u0012\u0010b\u0015\b\n\u0001\u0001\r", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1772583051 ^ (-1479411664)))));
        while (C1593ug.Ud(C1620yF.Xd) && ((!Qg.Zd(JX.Kd) || str3.matches(C1593ug.zd("FWUHL", (short) (C1580rY.Xd() ^ ((1535964520 ^ 1406669432) ^ (-139771576))), (short) (C1580rY.Xd() ^ ((1722810549 ^ 1723682244) ^ (-861177)))))) && str3.matches(C1561oA.od("\u000e\u0019\u001b\u001a\u001c\u0016\u0019\t\u0007", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (41521142 ^ (-1816001913)))))))) {
        }
        if (i6 > iNextInt) {
            EO.Xd(C1603vu.Xd);
            int i8 = 1279785574 ^ 1279785580;
            int i9 = C1537jK.Kd;
            for (int i10 = 0; i10 < ((1463732956 ^ 174459323) ^ 1566098285); i10++) {
                String str4 = C1523gX.Kd;
                C1603vu.Xd -= str4.length();
                C1544kF.Kd = str4;
                if (str4 == null) {
                    break;
                }
                ZO.Od(str4);
                if (Wg.oX(str4)) {
                    break;
                }
            }
            Class<?> cls2 = Class.forName(C1561oA.Kd("\u0002p8rW", (short) (FB.Xd() ^ (OY.Xd() ^ 69939597))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf(i8)};
            Method declaredMethod3 = cls2.getDeclaredMethod(Wg.Zd("ln", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831089734)), (short) (C1499aX.Xd() ^ ((1698393006 ^ 334434625) ^ (-1993625058)))), clsArr2);
            try {
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(null, objArr3);
                if ((C1544kF.Kd + C1561oA.Xd("@<!CB:@:", (short) (Od.Xd() ^ ((1373348570 ^ 667063561) ^ (-1981372729))))).length() >= 0 && Ug.BX(C1598vY.Kd)) {
                    NX.Xd = 0;
                }
                Class<?> cls3 = Class.forName(Wg.vd(",\u0019^\u001c\u007f", (short) (C1580rY.Xd() ^ (714243132 ^ (-714241715)))));
                Class<?>[] clsArr3 = new Class[0];
                Object[] objArr4 = new Object[0];
                short sXd2 = (short) (FB.Xd() ^ (1466447252 ^ 1466460107));
                short sXd3 = (short) (FB.Xd() ^ (1155661054 ^ 1155630692));
                int[] iArr2 = new int["bP".length()];
                QB qb2 = new QB("bP");
                int i11 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i11] = xuXd2.fK(((sXd2 + i11) + xuXd2.CK(iKK2)) - sXd3);
                    i11++;
                }
                Method declaredMethod4 = cls3.getDeclaredMethod(new String(iArr2, 0, i11), clsArr3);
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
