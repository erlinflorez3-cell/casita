package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class QQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        Wg.kd(String.valueOf(C1617xo.Xd));
        Class<?> cls = Class.forName(C1561oA.Qd("kX\u001e@?", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207817095)))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = C1607wl.Xd() ^ (1096082724 ^ (-789640861));
        int iXd2 = C1607wl.Xd() ^ (-1849960147);
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["xc".length()];
        QB qb = new QB("xc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            int i3 = JN.Xd;
            Jg.wd(i3);
            if (Qg.Zd(C1620yF.Xd) && Jg.YX(i3)) {
                XN.Kd = 0;
                YX.Kd = 0;
                JK.Xd = 0;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.od("mZ BA", (short) (FB.Xd() ^ ((469345146 ^ 1075379411) ^ 1541500626)))).getDeclaredMethod(C1561oA.Kd("0=", (short) (C1499aX.Xd() ^ ((1432222967 ^ 639163235) ^ (-1933905999)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                if (C1623yX.Kd == null) {
                    C1623yX.Kd.replaceAll(Wg.Zd("fW9\u007fa\u001e~", (short) (C1499aX.Xd() ^ (1184917377 ^ (-1184897368))), (short) (C1499aX.Xd() ^ ((1319550777 ^ 1516898342) ^ (-348978155)))), C1561oA.Xd("\u0019\u001f\u0016\u0018,", (short) (ZN.Xd() ^ (1117780890 ^ 1117752823))));
                }
                short sXd3 = (short) (OY.Xd() ^ (88836147 ^ 88855665));
                int[] iArr2 = new int["%\u0012[}x".length()];
                QB qb2 = new QB("%\u0012[}x");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK((sXd3 ^ i4) + xuXd2.CK(iKK2));
                    i4++;
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(new String(iArr2, 0, i4)).getDeclaredMethod(Qg.kd("ZH", (short) (FB.Xd() ^ (1157050466 ^ 1157057284)), (short) (FB.Xd() ^ ((155883091 ^ 1873103988) ^ 1727004100))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    if (C1623yX.Kd.length() != 0) {
                        C1603vu.Xd = r1.length();
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(hg.Vd("\u001a\u0007Lnm", (short) (OY.Xd() ^ (1781294298 ^ 1781283028)), (short) (OY.Xd() ^ ((116723037 ^ 685074790) ^ 773855923)))).getDeclaredMethod(C1561oA.ud("ma", (short) (Od.Xd() ^ (815293765 ^ (-815295065)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        int i5 = JN.Xd + XN.Kd;
                        float f2 = (XN.Kd * i5) + i5;
                        C1537jK.Kd = XN.Kd;
                        C1620yF.Xd = i5 - ((IK.Kd * 2) - C1546kX.Xd);
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(C1561oA.yd("ZPhR\u001a^SPmicmm!IZcttfN\\lawt", (short) (C1607wl.Xd() ^ ((589043846 ^ 1559394685) ^ 2146326276)))).getConstructor(new Class[0]);
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

    public QQ() {
        Ug.vd(C1623yX.Kd);
    }

    public static void Od() throws Exception {
        C1603vu.Xd = Xg.Kd.length();
        CX.ud();
        int i2 = JN.Xd + C1546kX.Xd;
        float f2 = (JN.Xd * i2) + i2;
        C1620yF.Xd = JK.Xd;
        XN.Kd = i2 - ((NX.Xd * 2) - JK.Xd);
        QQ qq = new QQ();
        int i3 = ud;
        int i4 = od;
        Ug.vd(C1544kF.Kd);
        qq.yK(i3, i4);
    }

    public static String Qd() {
        return C1561oA.Yd("\u0018\u0007Nrs", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134246015)));
    }

    public static int Xd() {
        return C1633zX.Xd() ^ (595749754 ^ (-1473449771));
    }

    public static int od() {
        return 1842606341 ^ 1842606346;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        short sXd = (short) (FB.Xd() ^ (1564468622 ^ 1564470161));
        int[] iArr = new int["\u0019h8\u0013\u0015AV\f]{\u0001g22,P\u001d\u0015".length()];
        QB qb = new QB("\u0019h8\u0013\u0015AV\f]{\u0001g22,P\u001d\u0015");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        if (Wg.oX(new String(iArr, 0, i2))) {
            IK.Yd = "";
            C1526hF.Xd = 0;
            C1603vu.Xd = 0.0f;
        }
        if (z2) {
            short sXd2 = (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (649815787 ^ (-1696596142))));
            int[] iArr2 = new int["\u0014\u0014\u0016\u0016".length()];
            QB qb2 = new QB("\u0014\u0014\u0016\u0016");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            C1623yX.Kd = String.valueOf(new String(iArr2, 0, i3));
            C1603vu.Xd = Xg.Kd.length();
            CX.ud();
            int i4 = JN.Xd + C1546kX.Xd;
            float f2 = (JN.Xd * i4) + i4;
            C1620yF.Xd = JK.Xd;
            XN.Kd = i4 - ((NX.Xd * 2) - JK.Xd);
            QQ qq = new QQ();
            int i5 = ud;
            int i6 = od;
            Ug.vd(C1544kF.Kd);
            qq.yK(i5, i6);
            if (Qg.Zd(YX.Kd)) {
                EO.Xd(Float.intBitsToFloat((1934730639 ^ 1314383504) ^ 32735632));
                return;
            }
            return;
        }
        if (Qg.Zd(C1537jK.Kd) && C1593ug.Ud(0)) {
            Jg.wd(1);
            Jg.wd(1);
            Jg.wd(IK.Yd.compareTo(C1593ug.zd("%''\u001f)++#", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (875522545 ^ 1516971717))), (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609518867)))));
        }
        short sXd3 = (short) (Od.Xd() ^ (FB.Xd() ^ (-1609502912)));
        int[] iArr3 = new int["\\I\u000f10".length()];
        QB qb3 = new QB("\\I\u000f10");
        int i7 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i7] = xuXd3.fK(sXd3 + sXd3 + i7 + xuXd3.CK(iKK3));
            i7++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr3, 0, i7)).getDeclaredMethod(C1561oA.Kd(")=", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (1192449381 ^ 76044163)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            for (int i8 = 738848634 ^ 738848626; i8 > 0; i8 -= 4) {
                EO.Xd(i8);
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Wg.Zd("PU~F\u001d", (short) (ZN.Xd() ^ (1860727033 ^ 1860727462)), (short) (ZN.Xd() ^ (2063268940 ^ 2063238159)))).getDeclaredMethod(C1561oA.Xd("8$", (short) (Od.Xd() ^ ((89457341 ^ 1599438150) ^ (-1509953765)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                int i9 = C1617xo.Xd;
                while (C1593ug.Ud(i9)) {
                    C1593ug.Qd(Integer.numberOfLeadingZeros(C1537jK.Kd));
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
        return 581536743 ^ 581536731;
    }

    public static String yd() {
        int iXd = C1499aX.Xd() ^ (1754888694 ^ 721561352);
        int iXd2 = C1607wl.Xd() ^ (-1849978998);
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["|\u0013".length()];
        QB qb = new QB("|\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
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
        if (C1623yX.Kd == null) {
            C1526hF.Xd = 0;
        }
        if (z2) {
            Wg.kd(C1523gX.Kd);
            int i2 = (126682717 ^ 636889123) ^ 578498164;
            int i3 = XN.Kd;
            while (C1593ug.Ud(Integer.lowestOneBit(IK.Kd)) && C1587uA.Kd.length() < 0) {
                Xg.ud(i3);
            }
            Class<?> cls = Class.forName(hg.Vd("s`&^A", (short) (C1499aX.Xd() ^ (528819000 ^ (-528826640))), (short) (C1499aX.Xd() ^ ((23928264 ^ 2143833623) ^ (-2124769023)))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.ud("ub", (short) (C1633zX.Xd() ^ (1137624659 ^ (-1137626310)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                if (Qg.Zd(C1526hF.Xd)) {
                    EO.Xd(0.01f);
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.yd("|k3jX", (short) (Od.Xd() ^ (1775410164 ^ (-1775418551))))).getDeclaredMethod(C1561oA.Yd("\u0002\u0016", (short) (FB.Xd() ^ ((379471281 ^ 1953377605) ^ 1659924092))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(null, objArr2);
                    if (Xg.xd(C1603vu.Xd - C1603vu.Xd)) {
                        Qg.od(new Float(C1603vu.Xd).intValue() % 13);
                    }
                    QK();
                    float f2 = C1603vu.Xd;
                    if (Math.random() == Math.ceil(f2)) {
                        C1617xo.Xd = (int) (C1617xo.Xd - ((2.0f * f2) - IK.Kd));
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
        if (Math.random() * Double.longBitsToDouble(OY.Kd() ^ (-7633422560244594456L)) < 0.0d) {
            C1546kX.Xd = C1617xo.Xd - ((JN.Xd * 2) - JX.Kd);
        }
        String str = C1523gX.Kd;
        if (str == null) {
            C1523gX.Kd.replaceAll(Xg.qd("IJK\u001b\u001cPQ", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951471909))), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864698161))), Jg.Wd("\n?h\u0019\u001e", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609507182))), (short) (C1499aX.Xd() ^ (1748868277 ^ (-1748865023)))));
            ZO.Od(str);
        }
        boolean zUd = GF.ud();
        if (Xg.xd(C1603vu.Xd - C1603vu.Xd)) {
            Qg.od(new Float(C1603vu.Xd).intValue() % 13);
        }
        if (zUd) {
            return;
        }
        int i4 = Qd;
        SecureRandom secureRandom = wd;
        int i5 = 195360729 ^ 195360701;
        String strXd = ZO.xd("]", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (576127942 ^ (-1705687321)))), (short) (C1499aX.Xd() ^ ((1282091812 ^ 439559790) ^ (-1448616911))));
        if (strXd.length() > ((923196644 ^ 709548153) ^ 491521156)) {
            Jg.wd(strXd.length());
        }
        int iNextInt = secureRandom.nextInt(i5);
        if (ZO.lX(C1626yg.Ud("ou]Pe{\u0019c\n.", (short) (C1580rY.Xd() ^ ((1844744774 ^ 1527726463) ^ (-922472606))), (short) (C1580rY.Xd() ^ (375675500 ^ (-375678457)))))) {
            C1584tK.Kd = "";
            C1617xo.Xd = 0;
            C1603vu.Xd = 0.0f;
        }
        if (i4 > iNextInt) {
            int i6 = JX.Kd;
            String str2 = IK.Yd;
            for (int i7 = 0; i7 < str2.length(); i7 += 2) {
                int length = str2.length();
                if (str2 == null) {
                    break;
                }
                C1598vY.Kd = str2;
                ZO.Od(str2);
                if (Wg.oX(str2) || length >= 0) {
                    break;
                }
            }
            int iXd = FB.Xd() ^ 1609527097;
            int i8 = XN.Kd;
            while (C1593ug.Ud(Integer.lowestOneBit(IK.Kd)) && C1587uA.Kd.length() < 0) {
                Xg.ud(i8);
            }
            Class<?> cls2 = Class.forName(Ig.wd(">^\u0015-F", (short) (C1633zX.Xd() ^ ((636656885 ^ 1468762455) ^ (-1920547238)))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf(iXd)};
            Method declaredMethod3 = cls2.getDeclaredMethod(EO.Od("l\b", (short) (ZN.Xd() ^ ((624161855 ^ 180441666) ^ 804444174))), clsArr2);
            try {
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(null, objArr3);
                if (Qg.Zd(C1526hF.Xd)) {
                    EO.Xd(0.01f);
                }
                Object[] objArr4 = new Object[0];
                Method declaredMethod4 = Class.forName(C1561oA.Qd("WD\n?+", (short) (C1580rY.Xd() ^ (1705801150 ^ (-1705802637))))).getDeclaredMethod(C1593ug.zd("5I", (short) (C1607wl.Xd() ^ (889087417 ^ 889091786)), (short) (C1607wl.Xd() ^ (1203904650 ^ 1203900835))), new Class[0]);
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
