package yg;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.tQ */
/* JADX INFO: loaded from: classes9.dex */
public class C1585tQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        String strWd = Jg.Wd(Global.SEMICOLON, (short) (C1607wl.Xd() ^ ((1893402417 ^ 2103907648) ^ 230437512)), (short) (C1607wl.Xd() ^ ((1423035337 ^ 48938451) ^ 1446721670)));
        if (strWd.length() > ((49631463 ^ 1846585269) ^ 1827010379)) {
            Jg.wd(strWd.length());
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(ZO.xd("\u0016d@>Q", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (705079976 ^ (-462415998)))), (short) (C1607wl.Xd() ^ ((658027347 ^ 1919081420) ^ 1431970590)))).getDeclaredMethod(C1626yg.Ud("M\u001d", (short) (Od.Xd() ^ (180236309 ^ (-180249706))), (short) (Od.Xd() ^ ((2000315890 ^ 489340095) ^ (-1779469954)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            if (C1589uF.Xd == null) {
                JN.Xd = JX.Kd + 1;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Ig.wd("h\t;o\u001a", (short) (C1607wl.Xd() ^ (172892873 ^ 172910894)))).getDeclaredMethod(EO.Od("\u0011W", (short) (ZN.Xd() ^ (2017685068 ^ 2017682763))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                for (int length = (590961254 ^ 2117753080) ^ 1560478362; length > 0; length = (length - C1544kF.Kd.length()) - 2) {
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(C1561oA.Qd("jW\u001db>", (short) (C1580rY.Xd() ^ (1621556341 ^ (-1621540671))))).getDeclaredMethod(C1593ug.zd("TJ", (short) (C1633zX.Xd() ^ (629025861 ^ (-629030110))), (short) (C1633zX.Xd() ^ ((1763669359 ^ 167105197) ^ (-1626006016)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    C1584tK.Kd = C1561oA.od("qqn", (short) (Od.Xd() ^ (1062760143 ^ (-1062733157))));
                    IK.Yd = "" + C1584tK.Kd;
                    short sXd = (short) (C1633zX.Xd() ^ (41793492 ^ (-41784693)));
                    int[] iArr = new int[">-t<\u001a".length()];
                    QB qb = new QB(">-t<\u001a");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                        i2++;
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Wg.Zd("~\u0007", (short) (C1499aX.Xd() ^ ((1041599556 ^ 1299614945) ^ (-1935894626))), (short) (C1499aX.Xd() ^ ((471045598 ^ 901104615) ^ (-698754134)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        C1589uF.Xd = "";
                        short sXd2 = (short) (Od.Xd() ^ (403403795 ^ (-403383271)));
                        int[] iArr2 = new int["C;Q=\u000bQDCVTLX^\u0014:ML_]Q?O]T`_".length()];
                        QB qb2 = new QB("C;Q=\u000bQDCVTLX^\u0014:ML_]Q?O]T`_");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                            i3++;
                        }
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(new String(iArr2, 0, i3)).getConstructor(new Class[0]);
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

    public C1585tQ() {
        int iReverseBytes = Integer.reverseBytes(NX.Xd);
        if (iReverseBytes < 0 && Jg.YX(C1546kX.Xd) && (C1623yX.Kd.hashCode() ^ iReverseBytes) == 0) {
            Qg.od(JK.Xd + IK.Yd.lastIndexOf(Wg.vd("`]SR", (short) (C1499aX.Xd() ^ ((2058423008 ^ 476323004) ^ (-1725258738))))));
        }
    }

    public static void Od() throws Exception {
        if (Math.abs(JK.Xd) + 1 > JX.Kd * 2) {
            C1603vu.Xd = (float) (((double) C1603vu.Xd) * Double.longBitsToDouble((6229597503495692562L ^ 5663667177554973636L) ^ 2817761608544448694L));
            if (C1603vu.Xd > 0.0f) {
                C1603vu.Xd -= C1598vY.Kd.length();
            } else {
                C1603vu.Xd *= Float.intBitsToFloat((2122263182 ^ 1731854170) ^ (-1496918572));
            }
        }
        CX.ud();
        if (C1587uA.Kd.length() != 0) {
            C1603vu.Xd = r1.length();
        }
        C1585tQ c1585tQ = new C1585tQ();
        int i2 = ud;
        int i3 = od;
        if (EO.zd(C1603vu.Xd)) {
            EO.Xd(C1603vu.Xd);
            C1626yg.Kd(C1603vu.Xd + Float.intBitsToFloat((1133646990 ^ 678760965) ^ 1416038027));
        }
        c1585tQ.yK(i2, i3);
    }

    public static String Qd() {
        return Qg.kd("kX\u001ec?", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (871204446 ^ (-935762722)))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (1662958962 ^ 545630534))));
    }

    public static int Xd() {
        return 0;
    }

    public static int od() {
        return 0;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        if (Wg.oX(C1589uF.Xd)) {
            IK.Yd = "";
        }
        if (z2) {
            int i2 = IK.Kd;
            for (int i3 = 0; i3 < (1832008364 ^ 1832008358); i3 = i3 + 2 + 1) {
                String str = C1584tK.Kd;
                C1603vu.Xd -= str.length();
                C1537jK.Yd = str;
            }
            if (Math.abs(JK.Xd) + 1 > JX.Kd * 2) {
                C1603vu.Xd = (float) (((double) C1603vu.Xd) * Double.longBitsToDouble(C1499aX.Kd() ^ (5832348251051865388L ^ 2473791228991418272L)));
                if (C1603vu.Xd > 0.0f) {
                    C1603vu.Xd -= C1598vY.Kd.length();
                } else {
                    C1603vu.Xd *= Float.intBitsToFloat(C1633zX.Xd() ^ (1288771243 ^ 2030013792));
                }
            }
            CX.ud();
            if (C1587uA.Kd.length() != 0) {
                C1603vu.Xd = r1.length();
            }
            C1585tQ c1585tQ = new C1585tQ();
            int i4 = ud;
            int i5 = od;
            if (EO.zd(C1603vu.Xd)) {
                EO.Xd(C1603vu.Xd);
                C1626yg.Kd(C1603vu.Xd + Float.intBitsToFloat(ZN.Xd() ^ (568023111 ^ 768698039)));
            }
            c1585tQ.yK(i4, i5);
            double dCeil = Math.ceil(C1603vu.Xd);
            if (dCeil == 0.0d && hg.KX(JN.Xd) && dCeil > C1603vu.Xd) {
                Jg.wd(C1584tK.Kd.lastIndexOf(((int) dCeil) + 16));
                return;
            }
            return;
        }
        String strXd = ZO.xd("J]$", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864711807))), (short) (C1633zX.Xd() ^ (FB.Xd() ^ (975581370 ^ (-1707703822)))));
        int i6 = Integer.parseInt(strXd);
        while (C1593ug.Ud(i6)) {
            for (int i7 = i6; i7 < strXd.length() - 8; i7++) {
                if (Jg.YX(i7) || Jg.YX(NX.Xd)) {
                    C1603vu.Xd -= IK.Kd;
                }
            }
            if (i6 <= strXd.length() || i6 >= 0) {
                break;
            }
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1626yg.Ud("l\b$T5", (short) (Od.Xd() ^ ((1860774040 ^ 655280142) ^ (-1239919161))), (short) (Od.Xd() ^ ((1548877749 ^ 1700394017) ^ (-956826883))))).getDeclaredMethod(Ig.wd("(\u0002", (short) (C1580rY.Xd() ^ ((699780403 ^ 508827832) ^ (-937530932)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            IK.Yd = String.valueOf(EO.Od("$\u007f\u00111", (short) (OY.Xd() ^ (1299370699 ^ 1299376637))));
            Class<?> cls = Class.forName(C1561oA.Qd("\u0012~D\ne", (short) (FB.Xd() ^ ((831993858 ^ 1804592792) ^ 1511579313))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (ZN.Xd() ^ ((1407506412 ^ 1799174106) ^ 953792999));
            short sXd2 = (short) (ZN.Xd() ^ (971612643 ^ 971626966));
            int[] iArr = new int[">*".length()];
            QB qb = new QB(">*");
            int i8 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i8] = xuXd.fK((xuXd.CK(iKK) - (sXd + i8)) - sXd2);
                i8++;
            }
            Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr, 0, i8), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                String str3 = (String) declaredMethod2.invoke(null, objArr2);
                (Xg.Kd + C1561oA.od("VJVIQSM", (short) (C1633zX.Xd() ^ ((1114121336 ^ 1171374352) ^ (-129611716))))).length();
                int iCeil = (int) Math.ceil(Math.abs((((double) C1603vu.Xd) * 4.0d) / 3.141d));
                if (iCeil < 0) {
                    double d2 = -3.140000104904175d;
                    double dSin = Math.sin(C1620yF.Xd);
                    double dCos = Math.cos(((double) JK.Xd) * 1.1d);
                    double dSin2 = Math.sin(Math.random());
                    while (true) {
                        if (d2 <= dCos && ((double) iCeil) * dSin < dSin2) {
                            break;
                        }
                        C1544kF.Kd = C1561oA.Kd("njOqphnh", (short) (OY.Xd() ^ (262329163 ^ 262339352)));
                        d2 -= 1.0d;
                        if (dSin > d2) {
                            IK.Kd = NX.Xd + (C1598vY.Kd.length() * ((int) dSin2));
                            break;
                        }
                    }
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
        return (1296144042 ^ 1923116937) ^ 1071774067;
    }

    public static String yd() {
        return hg.Vd("+?", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207812422))), (short) (C1633zX.Xd() ^ (FB.Xd() ^ (2094496994 ^ (-590884227)))));
    }

    public static boolean zd() {
        return true;
    }

    @Override // yg.RY
    public void FK() throws Throwable {
        boolean z2 = yd;
        if (Math.random() * Double.longBitsToDouble(8761855400069786228L ^ 4161709855687535220L) < 0.0d) {
            switch (C1537jK.Kd) {
                case 1:
                    C1603vu.Xd += C1603vu.Xd;
                case 2:
                    C1603vu.Xd += C1603vu.Xd;
                case 3:
                    C1603vu.Xd -= C1603vu.Xd * Float.intBitsToFloat(475225578 ^ (-598516246));
                    break;
            }
        }
        if (z2) {
            C1603vu.Xd = C1598vY.Kd.length();
            int i2 = 1714743079 ^ 1714743085;
            if (Math.random() * Double.longBitsToDouble(ZN.Yd() ^ 8081343175765671664L) < 0.0d) {
                Tg.Yd(JK.Xd * C1603vu.Xd);
            }
            Class<?> cls = Class.forName(Wg.vd("\u0006t<v[", (short) (ZN.Xd() ^ (1963612920 ^ 1963592095))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method declaredMethod = cls.getDeclaredMethod(Qg.kd("\u0017\u0004", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864701097))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134261669))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                int i3 = JK.Xd + YX.Kd;
                float f2 = (JX.Kd * i3) + i3;
                C1620yF.Xd = JN.Xd;
                C1620yF.Xd = i3 - ((YX.Kd * 2) - C1526hF.Xd);
                short sXd = (short) (OY.Xd() ^ ((960748181 ^ 376132297) ^ 791208393));
                short sXd2 = (short) (OY.Xd() ^ (337165819 ^ 337154336));
                int[] iArr = new int["<)n\u000b\u0010".length()];
                QB qb = new QB("<)n\u000b\u0010");
                int i4 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK) + sXd2);
                    i4++;
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(new String(iArr, 0, i4)).getDeclaredMethod(C1561oA.ud("A3", (short) (Od.Xd() ^ (1611705670 ^ (-1611699940)))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(null, objArr2);
                    if (C1623yX.Kd == null) {
                        IK.Kd = C1546kX.Xd + 1;
                    }
                    QK();
                    for (int i5 = (635137928 ^ 1921061368) ^ 1465548404; i5 > 0; i5 -= 2) {
                        C1626yg.Kd(i5);
                    }
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (Qg.Zd(JK.Xd) && C1593ug.Ud(0)) {
            Jg.wd(1);
            Jg.wd(1);
            String str = C1537jK.Yd;
            short sXd3 = (short) (C1580rY.Xd() ^ (2047998287 ^ (-2047999252)));
            int[] iArr2 = new int["QSOGUWSK".length()];
            QB qb2 = new QB("QSOGUWSK");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i6));
                i6++;
            }
            Jg.wd(str.compareTo(new String(iArr2, 0, i6)));
        }
        StringBuilder sbAppend = new StringBuilder().append(C1584tK.Kd);
        short sXd4 = (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1982051383 ^ (-1202356629))));
        int[] iArr3 = new int["`\t\u0013\u0011\u0017\u0013\u001fi".length()];
        QB qb3 = new QB("`\t\u0013\u0011\u0017\u0013\u001fi");
        int i7 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i7] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i7));
            i7++;
        }
        int length = sbAppend.append(new String(iArr3, 0, i7)).toString().length();
        do {
            switch (length) {
                case 97:
                    length = 0;
                    Xg.qd("@FBN", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (1540657201 ^ (-71013502)))), (short) (C1499aX.Xd() ^ ((1784846761 ^ 856492155) ^ (-1500484516))));
                    break;
                default:
                    length -= (C1587uA.Kd.length() * Math.abs(C1546kX.Xd)) + 1;
                    break;
            }
        } while (length < 0);
        boolean zUd = GF.ud();
        C1620yF.Xd = 0;
        if (zUd) {
            return;
        }
        int i8 = Qd;
        SecureRandom secureRandom = wd;
        int i9 = 1061204056 ^ 1061204028;
        int i10 = C1526hF.Xd;
        while (C1593ug.Ud(i10)) {
            C1593ug.Qd(Integer.numberOfLeadingZeros(IK.Kd));
        }
        int iNextInt = secureRandom.nextInt(i9);
        for (int iXd = ZN.Xd() ^ (422800537 ^ 716788330); iXd > 0 && C1593ug.Ud(C1607wl.Xd() ^ (1999254000 ^ 426649401)); iXd -= 4) {
            EO.Xd(iXd);
        }
        if (i8 > iNextInt) {
            int length2 = (Xg.Kd + Jg.Wd("{}fA\u0016tYv", (short) (C1633zX.Xd() ^ ((53082254 ^ 913882363) ^ (-894533059))), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134247539)))).length();
            do {
                switch (length2) {
                    case 97:
                        length2 = 0;
                        short sXd5 = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134260833));
                        short sXd6 = (short) (C1633zX.Xd() ^ (2070395190 ^ (-2070385167)));
                        int[] iArr4 = new int["\u0014}C&".length()];
                        QB qb4 = new QB("\u0014}C&");
                        int i11 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i11] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((i11 * sXd6) + sXd5)));
                            i11++;
                        }
                        new String(iArr4, 0, i11);
                        break;
                    default:
                        length2 -= (C1537jK.Yd.length() * Math.abs(C1617xo.Xd)) + 1;
                        break;
                }
            } while (length2 < 0);
            int i12 = 1881026950 ^ 1881026956;
            if (Math.random() * Double.longBitsToDouble((7634354437403257696L ^ 1550313981179876165L) ^ 4334853951029868581L) < 0.0d) {
                Tg.Yd(JK.Xd * C1603vu.Xd);
            }
            Class<?> cls2 = Class.forName(C1626yg.Ud("M\u001157\u0007", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (558382059 ^ (-314719795)))), (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864683539)))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf(i12)};
            Method declaredMethod3 = cls2.getDeclaredMethod(Ig.wd(")q", (short) (C1633zX.Xd() ^ ((756144634 ^ 335711973) ^ (-957576963)))), clsArr2);
            try {
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(null, objArr3);
                int i13 = JK.Xd + YX.Kd;
                float f3 = (JX.Kd * i13) + i13;
                C1620yF.Xd = JN.Xd;
                C1620yF.Xd = i13 - ((YX.Kd * 2) - C1526hF.Xd);
                short sXd7 = (short) (C1499aX.Xd() ^ (1384933049 ^ (-1384931374)));
                int[] iArr5 = new int["b\b2--".length()];
                QB qb5 = new QB("b\b2--");
                int i14 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i14] = xuXd5.fK((C1561oA.Xd[i14 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + i14)) + xuXd5.CK(iKK5));
                    i14++;
                }
                Object[] objArr4 = new Object[0];
                Method declaredMethod4 = Class.forName(new String(iArr5, 0, i14)).getDeclaredMethod(C1561oA.Qd("0\"", (short) (OY.Xd() ^ ((2034948539 ^ 1493354325) ^ 541590046))), new Class[0]);
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
