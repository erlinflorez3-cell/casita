package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.mQ */
/* JADX INFO: loaded from: classes9.dex */
public class C1556mQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        int i2 = C1546kX.Xd + YX.Kd;
        float f2 = (C1546kX.Xd * i2) + i2;
        JX.Kd = NX.Xd;
        JN.Xd = i2 - ((IK.Kd * 2) - XN.Kd);
        Class<?> cls = Class.forName(EO.Od("]%9T0", (short) (OY.Xd() ^ (80193937 ^ 80199731))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (701715617 ^ (-701708043)));
        int[] iArr = new int["\bp".length()];
        QB qb = new QB("\bp");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            Ug.vd(C1598vY.Kd);
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1593ug.zd(" \u000fV\u0017{", (short) (ZN.Xd() ^ ((293472342 ^ 828389448) ^ 538841028)), (short) (ZN.Xd() ^ ((978942596 ^ 1816897807) ^ 1444084534)))).getDeclaredMethod(C1561oA.od("ju", (short) (Od.Xd() ^ (1382892874 ^ (-1382896156)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                Wg.kd(String.valueOf(JX.Kd));
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(C1561oA.Kd("\"\u0011X\u0019}", (short) (Od.Xd() ^ (622685268 ^ (-622660486))))).getDeclaredMethod(Wg.Zd("Gs", (short) (C1580rY.Xd() ^ (901599528 ^ (-901601888))), (short) (C1580rY.Xd() ^ ((696723092 ^ 187681498) ^ (-581498871)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    Qg.od(0);
                    short sXd2 = (short) (C1607wl.Xd() ^ ((1227827736 ^ 1351844442) ^ 431816036));
                    int[] iArr2 = new int["\u0005s;{`".length()];
                    QB qb2 = new QB("\u0005s;{`");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i4));
                        i4++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr2, 0, i4));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr4 = new Object[0];
                    short sXd3 = (short) (C1633zX.Xd() ^ ((1396069243 ^ 181282277) ^ (-1509435817)));
                    int[] iArr3 = new int["|j".length()];
                    QB qb3 = new QB("|j");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK((sXd3 ^ i5) + xuXd3.CK(iKK3));
                        i5++;
                    }
                    Method declaredMethod4 = cls2.getDeclaredMethod(new String(iArr3, 0, i5), clsArr2);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        Qg.od(0);
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(Qg.kd("#\u0019-\u0017b'\u0018\u0015&\"\u0018\"&Y}\u000f\f\u001d\u0019\u000bv\u0005\u0011\u0006\u0010\r", (short) (C1580rY.Xd() ^ (2065830055 ^ (-2065838517))), (short) (C1580rY.Xd() ^ (731731217 ^ (-731731853))))).getConstructor(new Class[0]);
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

    public C1556mQ() {
        if (Qg.Zd(JK.Xd)) {
            EO.Xd(Float.intBitsToFloat(C1607wl.Xd() ^ 1387385173));
        }
    }

    public static void Od() throws Exception {
        if (C1584tK.Kd == null) {
            XN.Kd = C1620yF.Xd + 1;
        }
        CX.ud();
        if (Math.random() * Double.longBitsToDouble(FB.ud() ^ 4216636951080431411L) < 0.0d) {
            Tg.Yd(JX.Kd * C1603vu.Xd);
        }
        C1556mQ c1556mQ = new C1556mQ();
        int i2 = ud;
        int i3 = od;
        int i4 = 0;
        while (true) {
            if (i4 >= C1620yF.Xd % 8 && i4 <= i4 + i4) {
                c1556mQ.yK(i2, i3);
                return;
            } else {
                JN.Xd = i4 + 1;
                i4 = i4 + 68 + 1;
            }
        }
    }

    public static String Qd() {
        return hg.Vd("\u0017\u0004I\bj", (short) (C1607wl.Xd() ^ (1166991454 ^ 1166966891)), (short) (C1607wl.Xd() ^ (1791198857 ^ 1791217709)));
    }

    public static int Xd() {
        return 0;
    }

    public static int od() {
        return 0;
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        int i2 = IK.Kd;
        while (C1593ug.Ud(Integer.lowestOneBit(JN.Xd)) && C1598vY.Kd.length() < 0) {
            Xg.ud(i2);
        }
        if (!z2) {
            if (Math.random() * Double.longBitsToDouble((8250147156667128958L ^ 3511400658558935697L) ^ 188141196159074031L) < 0.0d) {
                NX.Xd = YX.Kd - ((IK.Kd * 2) - XN.Kd);
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(EO.Od("}B\u0019r\u000f", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1460678402 ^ 591491867))))).getDeclaredMethod(C1561oA.Qd("FX", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951494728))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                String str = (String) declaredMethod.invoke(null, objArr);
                if (C1587uA.Kd != null) {
                    JX.Kd = C1587uA.Kd.hashCode();
                }
                short sXd = (short) (C1633zX.Xd() ^ ((378833422 ^ 770628015) ^ (-997875832)));
                short sXd2 = (short) (C1633zX.Xd() ^ ((911580260 ^ 1130134440) ^ (-1963569668)));
                int[] iArr = new int["l[#cH".length()];
                QB qb = new QB("l[#cH");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                    i3++;
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(new String(iArr, 0, i3)).getDeclaredMethod(C1561oA.od("v`", (short) (ZN.Xd() ^ ((1877578556 ^ 257245176) ^ 1622971393))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    String str2 = (String) declaredMethod2.invoke(null, objArr2);
                    String str3 = Xg.Kd;
                    if (str3 != null) {
                        NX.Xd = str3.hashCode();
                    }
                    CX.yd(str, str2);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (Ig.uX(C1598vY.Kd)) {
            Wg.kd(C1587uA.Kd);
        }
        if (C1584tK.Kd == null) {
            XN.Kd = C1620yF.Xd + 1;
        }
        CX.ud();
        if (Math.random() * Double.longBitsToDouble(OY.Kd() ^ (6511728290443392733L ^ (-3724779527351140811L))) < 0.0d) {
            Tg.Yd(JX.Kd * C1603vu.Xd);
        }
        C1556mQ c1556mQ = new C1556mQ();
        int i4 = ud;
        int i5 = od;
        int i6 = 0;
        while (true) {
            if (i6 >= C1620yF.Xd % 8 && i6 <= i6 + i6) {
                c1556mQ.yK(i4, i5);
                EO.Xd(C1603vu.Xd);
                return;
            } else {
                JN.Xd = i6 + 1;
                i6 = i6 + 68 + 1;
            }
        }
    }

    public static int ud() {
        return 253468470 ^ 253468456;
    }

    public static String yd() {
        return C1561oA.ud("\u000f#", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (659824863 ^ (-383602163)))));
    }

    public static boolean zd() {
        return true;
    }

    @Override // yg.RY
    public void FK() throws Throwable {
        boolean z2 = yd;
        Qg.od(0);
        if (z2) {
            for (int iXd = C1580rY.Xd() ^ (-831067163); iXd > 0; iXd -= 2) {
                C1626yg.Kd(iXd);
            }
            int iXd2 = FB.Xd() ^ (406748418 ^ 1204884027);
            for (int i2 = 0; i2 < IK.Kd % 4 && i2 > i2 * i2; i2++) {
                String strZd = Wg.Zd("\u001aiKj", (short) (ZN.Xd() ^ ((354291191 ^ 1835429840) ^ 2021136987)), (short) (ZN.Xd() ^ (Od.Xd() ^ (2025168803 ^ 1061713457))));
                float f2 = Float.parseFloat(strZd);
                Tg.Yd(f2);
                if (f2 > 0.0f || f2 < i2 * 1024 || Ug.BX(strZd)) {
                    EO.Xd(f2);
                    break;
                }
            }
            Class<?> cls = Class.forName(C1561oA.Xd("l[#]B", (short) (FB.Xd() ^ (OY.Xd() ^ (1107316328 ^ 1177231285)))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(iXd2)};
            Method declaredMethod = cls.getDeclaredMethod(Wg.vd("aP", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69951789))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                if (Wg.oX(Qg.kd("=<;:98&0\"!)jihgfed", (short) (ZN.Xd() ^ (1807208533 ^ 1807199008)), (short) (ZN.Xd() ^ (613685752 ^ 613704143))))) {
                    C1523gX.Kd = "";
                    NX.Xd = 0;
                    C1603vu.Xd = 0.0f;
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(hg.Vd("I6{\u001b\u001d", (short) (FB.Xd() ^ (1801090741 ^ 1801074264)), (short) (FB.Xd() ^ (34975568 ^ 34989638)))).getDeclaredMethod(C1561oA.ud("MA", (short) (C1580rY.Xd() ^ (928720724 ^ (-928732185)))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(null, objArr2);
                    Tg.Yd(0.0f);
                    QK();
                    if (C1544kF.Kd.length() != 0) {
                        C1603vu.Xd = r1.length();
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
        Ug.vd(C1598vY.Kd);
        if (Wg.oX(Xg.Kd)) {
            C1598vY.Kd = C1589uF.Xd + C1561oA.yd("L<MLOFH9", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (76030649 ^ (-10682622)))));
        }
        boolean zUd = GF.ud();
        if ((C1523gX.Kd + C1561oA.Yd("wsXzyqwq", (short) (OY.Xd() ^ (ZN.Xd() ^ 864709842)))).length() >= 0 && Ug.BX(C1584tK.Kd)) {
            JN.Xd = 0;
        }
        if (zUd) {
            return;
        }
        int i3 = Qd;
        SecureRandom secureRandom = wd;
        int iXd3 = Od.Xd() ^ (470805603 ^ 1542617170);
        C1626yg.Kd(C1603vu.Xd);
        if (C1593ug.Ud(C1546kX.Xd)) {
            EO.Xd(0 - 1);
        }
        int iNextInt = secureRandom.nextInt(iXd3);
        if (Wg.oX(C1537jK.Yd)) {
            StringBuilder sbAppend = new StringBuilder().append(C1523gX.Kd);
            int iXd4 = Od.Xd() ^ (669711098 ^ (-1612138307));
            short sXd = (short) (C1499aX.Xd() ^ (286632 ^ (-270669)));
            short sXd2 = (short) (C1499aX.Xd() ^ iXd4);
            int[] iArr = new int["~p\u0004\u0005\n\u0003\u0007y".length()];
            QB qb = new QB("~p\u0004\u0005\n\u0003\u0007y");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) + sXd2);
                i4++;
            }
            C1587uA.Kd = sbAppend.append(new String(iArr, 0, i4)).toString();
        }
        if (i3 > iNextInt) {
            if (Wg.oX(Jg.Wd("%!VL\u0001v;zc\u0019\u0016/l`\u0017\r`\u0017", (short) (C1499aX.Xd() ^ (20132273 ^ (-20146318))), (short) (C1499aX.Xd() ^ (958981857 ^ (-958966306)))))) {
                C1623yX.Kd = "";
                C1546kX.Xd = 0;
                C1603vu.Xd = 0.0f;
            }
            int iXd5 = FB.Xd() ^ (1099784019 ^ 509751402);
            for (int i5 = 0; i5 < IK.Kd % 4 && i5 > i5 * i5; i5++) {
                String strXd = ZO.xd("ukgM", (short) (FB.Xd() ^ (1063530340 ^ 1063547403)), (short) (FB.Xd() ^ ((1033823814 ^ 637152130) ^ 409261869)));
                float f3 = Float.parseFloat(strXd);
                Tg.Yd(f3);
                if (f3 > 0.0f || f3 < i5 * 1024 || Ug.BX(strXd)) {
                    EO.Xd(f3);
                    break;
                }
            }
            Class<?> cls2 = Class.forName(C1626yg.Ud("--=g>", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134241259))), (short) (FB.Xd() ^ ((262301932 ^ 2018727277) ^ 2012289428))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr3 = {Integer.valueOf(iXd5)};
            Method declaredMethod3 = cls2.getDeclaredMethod(Ig.wd("]}", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609502046)))), clsArr2);
            try {
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(null, objArr3);
                short sXd3 = (short) (C1607wl.Xd() ^ ((1773640006 ^ 227289235) ^ 1681642467));
                int[] iArr2 = new int["U(uVU\u0002\u0015H\u001a>A&pnj\rYW".length()];
                QB qb2 = new QB("U(uVU\u0002\u0015H\u001a>A&pnj\rYW");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i6)) + xuXd2.CK(iKK2));
                    i6++;
                }
                if (Wg.oX(new String(iArr2, 0, i6))) {
                    C1523gX.Kd = "";
                    NX.Xd = 0;
                    C1603vu.Xd = 0.0f;
                }
                Object[] objArr4 = new Object[0];
                Method declaredMethod4 = Class.forName(C1561oA.Qd("q^$CE", (short) (C1607wl.Xd() ^ (1298783977 ^ 1298782797)))).getDeclaredMethod(C1593ug.zd("H>", (short) (Od.Xd() ^ (1304254129 ^ (-1304237295))), (short) (Od.Xd() ^ ((653325436 ^ 258450793) ^ (-697793599)))), new Class[0]);
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
