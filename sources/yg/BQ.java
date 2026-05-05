package yg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes9.dex */
public class BQ {
    public static int[] Kd = null;
    public static String Xd = null;
    public static String[] Yd = null;
    public static final String[] ud = null;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("\u0018Zlfr", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (1480923670 ^ (-739536036)))))).getDeclaredMethod(EO.Od("~u", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831091391)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            String strQd = C1561oA.Qd("@-r\u0006\u0014", (short) (C1633zX.Xd() ^ ((1662654821 ^ 1588051630) ^ (-1035833874))));
            String strZd = C1593ug.zd("?L", (short) (FB.Xd() ^ ((1392537428 ^ 1105184149) ^ 316641622)), (short) (FB.Xd() ^ ((885128527 ^ 2108822488) ^ 1232321157)));
            try {
                Class<?> cls = Class.forName(strQd);
                Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                field.setAccessible(true);
                field.set(null, str);
            } catch (Throwable th) {
            }
            short sXd = (short) (FB.Xd() ^ (577912816 ^ 577917331));
            int[] iArr = new int[">IF\u00068FE@<EE?|/=<.686,8r'/#43$1j|+*{$&$\u001a&\u0001\u0013%\u0019%\u0013".length()];
            QB qb = new QB(">IF\u00068FE@<EE?|/=<.686,8r'/#43$1j|+*{$&$\u001a&\u0001\u0013%\u0019%\u0013");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String[] strArr = {Wg.Zd("\t\u000fTY\"y=5xFo\u001e#>%k&S\u000eS.\u0017\u0017vFy]\"~ ,\u000biM\u0010i\u0013S", (short) (C1580rY.Xd() ^ (340287743 ^ (-340275250))), (short) (C1580rY.Xd() ^ (1393694819 ^ (-1393697447)))), new String(iArr, 0, i2), C1561oA.Kd("!.-n#341/:<8w,<=1;??7E\u0002H;INB=@\n/CLOUG6IW\\PKN", (short) (C1499aX.Xd() ^ (1775602363 ^ (-1775614471))))};
            String strXd = C1561oA.Xd("xg/DT", (short) (Od.Xd() ^ ((1400622629 ^ 431236058) ^ (-1255129055))));
            String strVd = Wg.vd("}m", (short) (OY.Xd() ^ ((623244602 ^ 1006417794) ^ 517566801)));
            try {
                Class<?> cls2 = Class.forName(strXd);
                Field field2 = 0 != 0 ? cls2.getField(strVd) : cls2.getDeclaredField(strVd);
                field2.setAccessible(true);
                field2.set(null, strArr);
            } catch (Throwable th2) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String Kd() {
        return C1593ug.zd("&2", (short) (C1607wl.Xd() ^ (1717270090 ^ 1717265596)), (short) (C1607wl.Xd() ^ (1465473863 ^ 1465469960)));
    }

    public static String Kx() {
        return Qg.kd("EPM\rB>RDPB=E:6\u000273G9E72:/+*87", (short) (OY.Xd() ^ ((620625006 ^ 2066767373) ^ 1607305074)), (short) (OY.Xd() ^ (580384020 ^ 580384219)));
    }

    public static String Xd() {
        return C1561oA.Qd("\u0016\u0003H[i", (short) (C1633zX.Xd() ^ ((777583162 ^ 879608999) ^ (-439696762))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.reflect.Method] */
    public static void Yd() throws Throwable {
        Method declaredMethod;
        if (hg.Qd()) {
            return;
        }
        C1594uo c1594uo = new C1594uo();
        Object[] objArr = {c1594uo};
        Method declaredMethod2 = Class.forName(C1561oA.od("jW\u001d0>", (short) (OY.Xd() ^ (Od.Xd() ^ 1207814061)))).getDeclaredMethod(Wg.Zd(";g", (short) (FB.Xd() ^ (1633645043 ^ 1633628567)), (short) (FB.Xd() ^ ((1966996084 ^ 521192535) ^ 1781349811))), Class.forName(C1561oA.Kd("SB\nRM", (short) (Od.Xd() ^ (C1499aX.Xd() ^ (1964330583 ^ 915295523))))));
        try {
            declaredMethod2.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod2.invoke(null, objArr)).booleanValue();
            int i2 = (0 + (zBooleanValue ? 1 : 0)) - (0 & (zBooleanValue ? 1 : 0)) != 1 ? 0 : 1;
            Class<?> cls = Class.forName(C1561oA.Xd("}l4IY", (short) (C1607wl.Xd() ^ (2095270138 ^ 2095270850))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1499aX.Xd() ^ (1705760384 ^ (-1705747439)));
            int[] iArr = new int["WF\nRQ".length()];
            QB qb = new QB("WF\nRQ");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i3));
            Object[] objArr2 = {c1594uo};
            Method declaredMethod3 = cls.getDeclaredMethod(Qg.kd("~v", (short) (Od.Xd() ^ ((1189771605 ^ 1449713823) ^ (-277009780))), (short) (Od.Xd() ^ (1796292036 ^ (-1796280838)))), clsArr);
            try {
                declaredMethod3.setAccessible(true);
                boolean zBooleanValue2 = ((Boolean) declaredMethod3.invoke(null, objArr2)).booleanValue();
                int i4 = (i2 + (zBooleanValue2 ? 1 : 0)) - (i2 & (zBooleanValue2 ? 1 : 0)) != 1 ? 0 : 1;
                Object[] objArr3 = {c1594uo};
                Method declaredMethod4 = Class.forName(hg.Vd("?,q\u0005\u0013", (short) (C1633zX.Xd() ^ ((1013487983 ^ 523799011) ^ (-592475242))), (short) (C1633zX.Xd() ^ (1714866414 ^ (-1714880028))))).getDeclaredMethod(C1561oA.yd("O<", (short) (C1607wl.Xd() ^ (376179695 ^ 376200314))), Class.forName(C1561oA.ud("XE\u000bQJ", (short) (C1499aX.Xd() ^ (1759745833 ^ (-1759755839))))));
                try {
                    declaredMethod4.setAccessible(true);
                    int i5 = (-1) - (((-1) - i4) & ((-1) - (((Boolean) declaredMethod4.invoke(null, objArr3)).booleanValue() ? 1 : 0))) != 1 ? 0 : 1;
                    Object[] objArr4 = {c1594uo};
                    Method declaredMethod5 = Class.forName(C1561oA.Yd("K:\u0002\u0017'", (short) (C1499aX.Xd() ^ ((1863710446 ^ 965041468) ^ (-1452312010))))).getDeclaredMethod(Jg.Wd("Y9", (short) (C1580rY.Xd() ^ (1185953287 ^ (-1185949910))), (short) (C1580rY.Xd() ^ (1664320819 ^ (-1664349028)))), Class.forName(Xg.qd("VE\rUP", (short) (ZN.Xd() ^ (1607499638 ^ 1607469456)), (short) (ZN.Xd() ^ ((1613574320 ^ 1397102702) ^ 862675697)))));
                    try {
                        declaredMethod5.setAccessible(true);
                        if (!((-1) - (((-1) - i5) & ((-1) - (((Boolean) declaredMethod5.invoke(null, objArr4)).booleanValue() ? 1 : 0))) == 1)) {
                            String strXd = C1561oA.Xd("J9\u0001+D", (short) (OY.Xd() ^ ((679467199 ^ 1468194412) ^ 2147296965)));
                            String strVd = Wg.vd("<I", (short) (C1499aX.Xd() ^ (1853024985 ^ (-1853009298))));
                            try {
                                Class<?> cls2 = Class.forName(strXd);
                                boolean z2 = false;
                                try {
                                    strVd = cls2.getDeclaredMethod(strVd, new Class[0]);
                                    declaredMethod = strVd;
                                } catch (NoSuchMethodException e2) {
                                    z2 = true;
                                    declaredMethod = cls2.getDeclaredMethod(strVd, Class.forName(Qg.kd("lxmzvoi2fqotdlq*>igl\\ni", (short) (FB.Xd() ^ (922450750 ^ 922448180)), (short) (FB.Xd() ^ (410175704 ^ 410178882)))));
                                }
                                if (!z2) {
                                    declaredMethod.invoke(null, new Object[0]);
                                    return;
                                }
                                Object[] objArr5 = new Object[1];
                                Class<?> cls3 = Class.forName(hg.Vd("J7|F&", (short) (C1633zX.Xd() ^ ((919460610 ^ 1166834715) ^ (-1933684408))), (short) (C1633zX.Xd() ^ (85626995 ^ (-85630631)))));
                                Class<?>[] clsArr2 = new Class[0];
                                Object[] objArr6 = new Object[0];
                                short sXd2 = (short) (FB.Xd() ^ (1852415026 ^ 1852411436));
                                int[] iArr2 = new int["/:".length()];
                                QB qb2 = new QB("/:");
                                int i6 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i6] = xuXd2.fK(sXd2 + i6 + xuXd2.CK(iKK2));
                                    i6++;
                                }
                                Method declaredMethod6 = cls3.getDeclaredMethod(new String(iArr2, 0, i6), clsArr2);
                                try {
                                    declaredMethod6.setAccessible(true);
                                    objArr5[0] = (Context) declaredMethod6.invoke(null, objArr6);
                                    declaredMethod.invoke(null, objArr5);
                                    return;
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            } catch (InvocationTargetException e4) {
                                C1597vN.Xd(e4.getTargetException());
                                return;
                            } catch (Exception e5) {
                                return;
                            }
                        }
                        Class<?> cls4 = Class.forName(ZO.xd("<\t)2\u001c", (short) (Od.Xd() ^ (493932357 ^ (-493918764))), (short) (Od.Xd() ^ ((1309056008 ^ 335312148) ^ (-1576721884)))));
                        Class<?>[] clsArr3 = new Class[1692350065 ^ 1692350069];
                        clsArr3[0] = Integer.TYPE;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2139838098 ^ 2139838096] = Integer.TYPE;
                        clsArr3[(1652449747 ^ 1389716748) ^ 816514268] = Class.forName(C1626yg.Ud("C\u001eSeY", (short) (C1633zX.Xd() ^ ((1368468100 ^ 1389043662) ^ (-56248474))), (short) (C1633zX.Xd() ^ ((733992788 ^ 1468318674) ^ (-2084251170)))));
                        Object[] objArr7 = new Object[(747892160 ^ 1650828846) ^ 1324764138];
                        objArr7[0] = Integer.valueOf(1508261218 ^ 1508261246);
                        objArr7[1] = Integer.valueOf((1560749229 ^ 881491343) ^ 1770193319);
                        objArr7[299677303 ^ 299677301] = 1;
                        objArr7[1548454789 ^ 1548454790] = c1594uo;
                        Method declaredMethod7 = cls4.getDeclaredMethod(Ig.wd("\u001bs", (short) (C1633zX.Xd() ^ (1815305152 ^ (-1815286810)))), clsArr3);
                        try {
                            declaredMethod7.setAccessible(true);
                            boolean zBooleanValue3 = ((Boolean) declaredMethod7.invoke(null, objArr7)).booleanValue();
                            String strOd = EO.Od("G\u0007\u001b(N", (short) (ZN.Xd() ^ (1193402464 ^ 1193392218)));
                            String strQd = C1561oA.Qd("M<", (short) (ZN.Xd() ^ (289440554 ^ 289456343)));
                            short sXd3 = (short) (C1633zX.Xd() ^ (591419859 ^ (-591415274)));
                            short sXd4 = (short) (C1633zX.Xd() ^ (85840281 ^ (-85844809)));
                            int[] iArr3 = new int["\u0012\u0001H\u0003g".length()];
                            QB qb3 = new QB("\u0012\u0001H\u0003g");
                            int i7 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i7] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i7)) - sXd4);
                                i7++;
                            }
                            Class<?> cls5 = Class.forName(new String(iArr3, 0, i7));
                            Class<?>[] clsArr4 = new Class[1215464187 ^ 1215464184];
                            clsArr4[0] = Class.forName(C1561oA.od("\u0006{\u0010yE\u0003v\u0003z@d\u0005\u0002w{s", (short) (FB.Xd() ^ ((726629249 ^ 511833019) ^ 902758006))));
                            clsArr4[1] = Class.forName(C1561oA.Kd("<4J6\u0004C9GA\t/QPHNH", (short) (FB.Xd() ^ (414899427 ^ 414893611))));
                            clsArr4[202374508 ^ 202374510] = Boolean.TYPE;
                            Object[] objArr8 = new Object[1410928567 ^ 1410928564];
                            objArr8[0] = strOd;
                            objArr8[1] = strQd;
                            objArr8[2093392208 ^ 2093392210] = Boolean.valueOf(zBooleanValue3);
                            short sXd5 = (short) (ZN.Xd() ^ (2116622786 ^ 2116617049));
                            short sXd6 = (short) (ZN.Xd() ^ (1595109337 ^ 1595088912));
                            int[] iArr4 = new int["\u001bf".length()];
                            QB qb4 = new QB("\u001bf");
                            int i8 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i8] = xuXd4.fK(((i8 * sXd6) ^ sXd5) + xuXd4.CK(iKK4));
                                i8++;
                            }
                            Method declaredMethod8 = cls5.getDeclaredMethod(new String(iArr4, 0, i8), clsArr4);
                            try {
                                declaredMethod8.setAccessible(true);
                                declaredMethod8.invoke(null, objArr8);
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
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        } catch (InvocationTargetException e11) {
            throw e11.getCause();
        }
    }

    public static boolean kd(C1594uo c1594uo) throws Throwable {
        Object obj;
        Object obj2;
        ApplicationInfo applicationInfoXd = UB.Xd();
        XA xa = new XA();
        Class<?> cls = Class.forName(Ig.wd("H(*e@\u0006bq\u0001\"\u0019G\n\u000f\u000fgqn\u0005}f \bzbRE]c2nuG0", (short) (OY.Xd() ^ ((1473827669 ^ 740750182) ^ 2080269462))));
        Class<?>[] clsArr = new Class[Od.Xd() ^ 1207800919];
        short sXd = (short) (C1607wl.Xd() ^ ((119891405 ^ 272724249) ^ 392435638));
        int[] iArr = new int[".\u0002\b<b\u0019e2(YJmY\f8Stp9>".length()];
        QB qb = new QB(".\u0002\b<b\u0019e2(YJmY\f8Stp9>");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Class.forName(C1561oA.Qd("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X|\u001d\u001a\u0010\u0014\f", (short) (C1633zX.Xd() ^ (1830315663 ^ (-1830303046)))));
        Object[] objArr = new Object[Od.Xd() ^ (802827272 ^ 1747433567)];
        objArr[0] = xa;
        objArr[1] = "";
        Method method = cls.getMethod(C1593ug.zd("Xjcg", (short) (ZN.Xd() ^ ((1209422506 ^ 697926884) ^ 1636823070)), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (420708542 ^ (-681231508))))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(applicationInfoXd, objArr);
            if (xa.GK() != null) {
                return false;
            }
            String strOd = C1561oA.od(".\u001b`\u0007\u0015", (short) (C1607wl.Xd() ^ (1602267900 ^ 1602277928)));
            String strKd = C1561oA.Kd("VF", (short) (C1607wl.Xd() ^ (929982413 ^ 929961726)));
            try {
                Class<?> cls2 = Class.forName(strOd);
                Field field = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            Ud ud2 = (Ud) obj;
            String strZd = Wg.Zd("'KD0f", (short) (FB.Xd() ^ ((168494081 ^ 1600200439) ^ 1433028893)), (short) (FB.Xd() ^ (1593879998 ^ 1593875983)));
            String strXd = C1561oA.Xd("$:", (short) (FB.Xd() ^ (1720534460 ^ 1720527837)));
            try {
                Class<?> cls3 = Class.forName(strZd);
                Field field2 = 0 != 0 ? cls3.getField(strXd) : cls3.getDeclaredField(strXd);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            c1594uo.RY(ud2, (EnumC1514eY) obj2);
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void od() throws Exception {
        CX.ud();
        short sXd = (short) (FB.Xd() ^ (Od.Xd() ^ (845264740 ^ 1973159158)));
        int[] iArr = new int["\u0001o7LT".length()];
        QB qb = new QB("\u0001o7LT");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Yd("LY", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (1292154263 ^ (-1227862444))))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Xg.qd("hW\u001f4D", (short) (C1499aX.Xd() ^ (1806879153 ^ (-1806874654))), (short) (C1499aX.Xd() ^ (556673404 ^ (-556689350))))).getDeclaredMethod(Jg.Wd("q4", (short) (FB.Xd() ^ ((573181186 ^ 2077880097) ^ 1509156033)), (short) (FB.Xd() ^ (1804883031 ^ 1804880300))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                Object[] objArr3 = new Object[0];
                Constructor<?> constructor = Class.forName(ZO.xd("O$\u0010njV8\f5,mi\u000fAj%\b Z\u000fd3c:\u0013\u0003", (short) (C1580rY.Xd() ^ (62940215 ^ (-62918478))), (short) (C1580rY.Xd() ^ (1053997043 ^ (-1053999654))))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    int iNextInt = ((SecureRandom) constructor.newInstance(objArr3)).nextInt(691125684 ^ 1456357963);
                    Kp kp = new Kp(iNextInt, str, str2);
                    int i3 = ((iNextInt ^ ((799691286 ^ 1503929518) ^ 2011748850)) << 7) ^ 65;
                    int i4 = 1353556995 ^ 1353557011;
                    int i5 = Integer.parseInt(C1626yg.Ud("pN$j\u0012", (short) (C1607wl.Xd() ^ ((1093316215 ^ 2129148023) ^ 1069742515)), (short) (C1607wl.Xd() ^ ((1885819286 ^ 211569154) ^ 2096843905))), i4) ^ ((int) ((-1) - (((-1) - ((753827301969936424L ^ 2772339598935539035L) ^ 3174885741971242380L)) | ((-1) - kp.getId()))));
                    Class<?> cls = Class.forName(EO.Od("A\u007f\u0014\nN", (short) (C1499aX.Xd() ^ ((2025997587 ^ 1625312770) ^ (-404913135)))));
                    Class<?>[] clsArr = {Integer.TYPE};
                    Object[] objArr4 = {Integer.valueOf(i5 + (((i5 << (Integer.parseInt(Ig.wd("\u001apM", (short) (C1499aX.Xd() ^ (1948568256 ^ (-1948561536)))), i4) - 650)) + i5) * ((i5 << 2) + i5)))};
                    Method declaredMethod3 = cls.getDeclaredMethod(C1561oA.Qd("r}", (short) (C1633zX.Xd() ^ ((1341017034 ^ 1036770614) ^ (-1915060524)))), clsArr);
                    try {
                        declaredMethod3.setAccessible(true);
                        int iIntValue = (i3 ^ ((Integer) declaredMethod3.invoke(null, objArr4)).intValue()) ^ ((Integer.parseInt(C1593ug.zd("]^", (short) (ZN.Xd() ^ (1343055762 ^ 1343056821)), (short) (ZN.Xd() ^ (2107626562 ^ 2107628744))), i4) + 20) << ((byte) ((4660927790886281412L ^ 4660927790886281419L) & r14)));
                        Class<?> cls2 = Class.forName(C1561oA.od("\u0007s9Ma", (short) (OY.Xd() ^ (1183231425 ^ 1183221879))));
                        Class<?>[] clsArr2 = {Integer.TYPE};
                        Object[] objArr5 = {Integer.valueOf(iIntValue)};
                        Method declaredMethod4 = cls2.getDeclaredMethod(C1561oA.Kd("FS", (short) (Od.Xd() ^ ((563315109 ^ 970538583) ^ (-407538544)))), clsArr2);
                        try {
                            declaredMethod4.setAccessible(true);
                            int iIntValue2 = ((Integer) declaredMethod4.invoke(null, objArr5)).intValue();
                            synchronized (CX.Xd) {
                                long id = kp.getId();
                                StringBuilder sbAppend = new StringBuilder().append("").append(iIntValue2);
                                String strZd = Wg.Zd("+", (short) (C1633zX.Xd() ^ ((153440498 ^ 1007203926) ^ (-892175343))), (short) (C1633zX.Xd() ^ ((1119417996 ^ 1917987370) ^ (-820692702))));
                                StringBuilder sbAppend2 = new StringBuilder().append(sbAppend.append(strZd).toString());
                                int i6 = (int) id;
                                short sXd2 = (short) (Od.Xd() ^ (1937964484 ^ (-1937945083)));
                                int[] iArr2 = new int["]L\u0014*@".length()];
                                QB qb2 = new QB("]L\u0014*@");
                                int i7 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i7));
                                    i7++;
                                }
                                Class<?> cls3 = Class.forName(new String(iArr2, 0, i7));
                                Class<?>[] clsArr3 = {Integer.TYPE};
                                Object[] objArr6 = {Integer.valueOf(i6)};
                                Method declaredMethod5 = cls3.getDeclaredMethod(Wg.vd(";F", (short) (C1580rY.Xd() ^ ((765293440 ^ 1237539814) ^ (-1683910541)))), clsArr3);
                                try {
                                    declaredMethod5.setAccessible(true);
                                    StringBuilder sbAppend3 = new StringBuilder().append((sbAppend2.append(((Integer) declaredMethod5.invoke(null, objArr6)).intValue()).append(strZd).toString() + str + strZd) + str2 + strZd);
                                    long jLongValue = 0;
                                    try {
                                        jLongValue = ((Long) Class.forName(Qg.kd("mcwa-j^jb(LqjjZa", (short) (FB.Xd() ^ (2085793227 ^ 2085794929)), (short) (FB.Xd() ^ (16114601 ^ 16115262)))).getMethod(hg.Vd("&732$,1\u0010$'\u001e\u0005 \"!\u001d&", (short) (C1580rY.Xd() ^ ((1392536812 ^ 1618939938) ^ (-863991305))), (short) (C1580rY.Xd() ^ (1703539010 ^ (-1703541301)))), new Class[0]).invoke(null, new Object[0])).longValue();
                                    } catch (Exception e2) {
                                    }
                                    CX.Xd.add(CX.qd(sbAppend3.append(jLongValue).toString()));
                                    kp.start();
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
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
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }

    public static boolean qd(C1594uo c1594uo) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ApplicationInfo applicationInfoXd = UB.Xd();
        String strVd = Wg.vd("t\u0003y\t\u0007\u0002}Hn{{\u0003t~\u0006@sq3Gwxus^]qgnnJp\u001a$", (short) (ZN.Xd() ^ ((1911324425 ^ 2024869856) ^ 157109502)));
        String strKd = Qg.kd("puiny", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (550419581 ^ 1666556691))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ (1394754065 ^ 280579020))));
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 1 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            obj = field.get(applicationInfoXd);
        } catch (Throwable th) {
            obj = null;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = (1111431069 ^ 1940180027) ^ 823909286;
        if ((-1) - (((-1) - iIntValue) | ((-1) - i2)) != i2) {
            short sXd = (short) (C1633zX.Xd() ^ (1162552513 ^ (-1162565648)));
            short sXd2 = (short) (C1633zX.Xd() ^ ((1601297042 ^ 278870643) ^ (-1341044746)));
            int[] iArr = new int["vc)O]".length()];
            QB qb = new QB("vc)O]");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                i3++;
            }
            String str = new String(iArr, 0, i3);
            String strUd = C1561oA.ud("\u001e\f", (short) (ZN.Xd() ^ ((1916718547 ^ 1298639522) ^ 1062813321)));
            try {
                Class<?> cls2 = Class.forName(str);
                Field field2 = 0 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                field2.setAccessible(true);
                obj4 = field2.get(null);
            } catch (Throwable th2) {
                obj4 = null;
            }
            Ud ud2 = (Ud) obj4;
            String strYd = C1561oA.yd("fS\u001dSJ", (short) (C1580rY.Xd() ^ ((994274657 ^ 1548074575) ^ (-1728511562))));
            String strYd2 = C1561oA.Yd("\u0013'", (short) (Od.Xd() ^ (2002576139 ^ (-2002583538))));
            try {
                Class<?> cls3 = Class.forName(strYd);
                Field field3 = 0 != 0 ? cls3.getField(strYd2) : cls3.getDeclaredField(strYd2);
                field3.setAccessible(true);
                obj5 = field3.get(null);
            } catch (Throwable th3) {
                obj5 = null;
            }
            c1594uo.RY(ud2, (EnumC1514eY) obj5);
            return true;
        }
        int i4 = (816974442 ^ 1542456627) ^ 1801588569;
        if ((-1) - (((-1) - iIntValue) | ((-1) - i4)) != i4) {
            return false;
        }
        String strQd = Xg.qd("\bv>fv", (short) (C1580rY.Xd() ^ (572811700 ^ (-572794956))), (short) (C1580rY.Xd() ^ ((706686506 ^ 1751353421) ^ (-1115458034))));
        String strWd = Jg.Wd("\r\u0011", (short) (ZN.Xd() ^ (440295426 ^ 440280428)), (short) (ZN.Xd() ^ ((1340542331 ^ 96125993) ^ 1247650673)));
        try {
            Class<?> cls4 = Class.forName(strQd);
            Field field4 = 0 != 0 ? cls4.getField(strWd) : cls4.getDeclaredField(strWd);
            field4.setAccessible(true);
            obj2 = field4.get(null);
        } catch (Throwable th4) {
            obj2 = null;
        }
        Ud ud3 = (Ud) obj2;
        short sXd3 = (short) (C1499aX.Xd() ^ ((1165951521 ^ 221671943) ^ (-1212755891)));
        short sXd4 = (short) (C1499aX.Xd() ^ ((655609902 ^ 537885002) ^ (-119335041)));
        int[] iArr2 = new int["rOL-\n".length()];
        QB qb2 = new QB("rOL-\n");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd4) + sXd3)));
            i5++;
        }
        String str2 = new String(iArr2, 0, i5);
        short sXd5 = (short) (C1607wl.Xd() ^ ((1056861466 ^ 1428235151) ^ 1809808323));
        short sXd6 = (short) (C1607wl.Xd() ^ (443456738 ^ 443455438));
        int[] iArr3 = new int["F@".length()];
        QB qb3 = new QB("F@");
        int i6 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i6] = xuXd3.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i6 * sXd6))) + xuXd3.CK(iKK3));
            i6++;
        }
        String str3 = new String(iArr3, 0, i6);
        try {
            Class<?> cls5 = Class.forName(str2);
            Field field5 = 0 != 0 ? cls5.getField(str3) : cls5.getDeclaredField(str3);
            field5.setAccessible(true);
            obj3 = field5.get(null);
        } catch (Throwable th5) {
            obj3 = null;
        }
        c1594uo.RY(ud3, (EnumC1514eY) obj3);
        return true;
    }

    public static boolean vd(C1594uo c1594uo) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ApplicationInfo applicationInfoXd = UB.Xd();
        if (applicationInfoXd == null) {
            return false;
        }
        String strQd = C1561oA.Qd("\u0012\u001e\u0013 \u001c\u0015\u000fW\f\u0017\u0015\u001a\n\u0012\u0017O\u0011\rL^\r\f\u0007\u0003{x\u000b~\u0004\u0002[\u007fv~", (short) (FB.Xd() ^ (OY.Xd() ^ (144603981 ^ 213195251))));
        String strZd = C1593ug.zd("\f\n\u001e\fo\u0016 ", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831091308))), (short) (FB.Xd() ^ (FB.Xd() ^ (750499523 ^ 1934944982))));
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 1 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(applicationInfoXd);
        } catch (Throwable th) {
            obj = null;
        }
        String strOd = C1561oA.od("UaVc_XR\u001bOZX]MUZ\u0013TP\u0010\"POJF?<NBGE\u001fC:B", (short) (C1607wl.Xd() ^ ((1528960540 ^ 1089507004) ^ 466807098)));
        short sXd = (short) (C1607wl.Xd() ^ (1906213189 ^ 1906235314));
        int[] iArr = new int["USgU9_i".length()];
        QB qb = new QB("USgU9_i");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls2 = Class.forName(strOd);
            Field field2 = 1 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
            field2.setAccessible(true);
            obj2 = field2.get(applicationInfoXd);
        } catch (Throwable th2) {
            obj2 = null;
        }
        try {
            String name = new File((String) obj2).getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getName();
            short sXd2 = (short) (C1633zX.Xd() ^ ((1443673686 ^ 37179521) ^ (-1413198171)));
            short sXd3 = (short) (C1633zX.Xd() ^ (1920159353 ^ (-1920160436)));
            int[] iArr2 = new int["X\ta}p".length()];
            QB qb2 = new QB("X\ta}p");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            Class<?> cls3 = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = new Object[0];
            Method declaredMethod = cls3.getDeclaredMethod(C1561oA.Xd("y\u0007", (short) (OY.Xd() ^ (1838418397 ^ 1838439004))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                Context context = (Context) declaredMethod.invoke(null, objArr);
                Object[] objArr2 = new Object[0];
                Method method = Class.forName(Wg.vd("\u007f\u000e\u0005\u0014\n\u0005\u0001K\n\u0017\u0017\u001e\b\u0012\u0019SQ~~\u0006o\u0004\u0001", (short) (C1580rY.Xd() ^ ((780042693 ^ 1092923169) ^ (-1868193874))))).getMethod(Qg.kd("2/=\u0018()0%*'\u000f!,#", (short) (ZN.Xd() ^ (1332694568 ^ 1332681622)), (short) (ZN.Xd() ^ ((978838800 ^ 729991705) ^ 299181688))), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (name.equals((String) method.invoke(context, objArr2))) {
                        return false;
                    }
                    HashMap map = new HashMap();
                    String strVd = hg.Vd("kX\u001eY0", (short) (C1607wl.Xd() ^ (868655388 ^ 868649489)), (short) (C1607wl.Xd() ^ (1867368895 ^ 1867370581)));
                    String strUd = C1561oA.ud("(\u0016", (short) (FB.Xd() ^ (1540414312 ^ 1540391556)));
                    try {
                        Class<?> cls4 = Class.forName(strVd);
                        Field field3 = 0 != 0 ? cls4.getField(strUd) : cls4.getDeclaredField(strUd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    map.put(((EnumC1535jB) obj3).toString(), name);
                    String strYd = C1561oA.yd("ra)QY", (short) (C1580rY.Xd() ^ (552006941 ^ (-551977144))));
                    String strYd2 = C1561oA.Yd("K;", (short) (ZN.Xd() ^ ((22191921 ^ 628193954) ^ 606334439)));
                    try {
                        Class<?> cls5 = Class.forName(strYd);
                        Field field4 = 0 != 0 ? cls5.getField(strYd2) : cls5.getDeclaredField(strYd2);
                        field4.setAccessible(true);
                        obj4 = field4.get(null);
                    } catch (Throwable th4) {
                        obj4 = null;
                    }
                    Ud ud2 = (Ud) obj4;
                    String strQd2 = Xg.qd("^M\u0015MB", (short) (FB.Xd() ^ (1132559087 ^ 1132540623)), (short) (FB.Xd() ^ ((1447198339 ^ 1969463618) ^ 589403076)));
                    String strWd = Jg.Wd("^\n", (short) (FB.Xd() ^ (1906824111 ^ 1906813090)), (short) (FB.Xd() ^ (951876428 ^ 951846871)));
                    try {
                        Class<?> cls6 = Class.forName(strQd2);
                        Field field5 = 0 != 0 ? cls6.getField(strWd) : cls6.getDeclaredField(strWd);
                        field5.setAccessible(true);
                        obj5 = field5.get(null);
                    } catch (Throwable th5) {
                        obj5 = null;
                    }
                    c1594uo.zY(ud2, (EnumC1514eY) obj5, map);
                    return true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (NullPointerException e4) {
            return false;
        }
    }

    public static boolean wd(C1594uo c1594uo) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Bundle bundle = UB.Xd().metaData;
        if (bundle != null) {
            String string = bundle.getString(hg.Vd("CNK\u000b=KJEAJJD\u00024BA3;=;1=w8:0-.2$.\u000f!,#", (short) (C1580rY.Xd() ^ ((966190197 ^ 1281894184) ^ (-1979639997))), (short) (C1580rY.Xd() ^ (1178872696 ^ (-1178861767)))));
            String string2 = bundle.getString(C1561oA.ud("'2/n!/.)%..(e\u0018&%\u0017\u001f!\u001f\u0015![\u001c\u001e\u0014\u0011\u0012\u0016\b\u0012w\r\n\u0010\u0002\u0014\u0014\u0010\u0002\u000f", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951486209)))));
            if ((string != null && !string.isEmpty()) || (string2 != null && !string2.isEmpty())) {
                String strYd = C1561oA.yd("%\u0012[\u0002\u0014", (short) (C1499aX.Xd() ^ (2042368809 ^ (-2042373300))));
                String strYd2 = C1561oA.Yd("\u0013\u001f", (short) (Od.Xd() ^ ((2006402112 ^ 1760456044) ^ (-528052651))));
                try {
                    Class<?> cls = Class.forName(strYd);
                    Field field = 0 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
                    field.setAccessible(true);
                    obj8 = field.get(null);
                } catch (Throwable th) {
                    obj8 = null;
                }
                Ud ud2 = (Ud) obj8;
                String strQd = Xg.qd("cR\u001aRG", (short) (ZN.Xd() ^ (498670255 ^ 498695913)), (short) (ZN.Xd() ^ ((1536240417 ^ 939301143) ^ 1819138836)));
                String strWd = Jg.Wd("\rg", (short) (C1607wl.Xd() ^ ((681643509 ^ 331259372) ^ 991923387)), (short) (C1607wl.Xd() ^ ((707247893 ^ 1170229962) ^ 1877451286)));
                try {
                    Class<?> cls2 = Class.forName(strQd);
                    Field field2 = 0 != 0 ? cls2.getField(strWd) : cls2.getDeclaredField(strWd);
                    field2.setAccessible(true);
                    obj9 = field2.get(null);
                } catch (Throwable th2) {
                    obj9 = null;
                }
                c1594uo.RY(ud2, (EnumC1514eY) obj9);
                return true;
            }
        }
        CRC32 crc32 = new CRC32();
        String strXd = ZO.xd("Hb\u0006\u000ey", (short) (OY.Xd() ^ (1589223188 ^ 1589228409)), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (984403286 ^ (-1325246031)))));
        String strUd = C1626yg.Ud("\u001bm", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (1321473735 ^ (-982864462)))), (short) (FB.Xd() ^ ((842747556 ^ 1860330183) ^ 1557731325)));
        try {
            Class<?> cls3 = Class.forName(strXd);
            Field field3 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
            field3.setAccessible(true);
            obj = field3.get(null);
        } catch (Throwable th3) {
            obj = null;
        }
        for (String str : (String[]) obj) {
            try {
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(Ig.wd("D|\u0011PH", (short) (ZN.Xd() ^ (1466374869 ^ 1466381952)))).getDeclaredMethod(EO.Od("D\u0019", (short) (C1633zX.Xd() ^ ((1876630531 ^ 2125106096) ^ (-292676956)))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    Context context = (Context) declaredMethod.invoke(null, objArr);
                    Object[] objArr2 = new Object[0];
                    Method method = Class.forName(C1561oA.Qd("P\\Q^ZSM\u0016JUSXHPU\u000e\"MKP@RM", (short) (C1633zX.Xd() ^ (128654327 ^ (-128659024))))).getMethod(C1593ug.zd("\u0017\u0016&u \u0016)*\u0004(\u001b\u001f!/", (short) (Od.Xd() ^ (1846079339 ^ (-1846067341))), (short) (Od.Xd() ^ ((1868258958 ^ 207321821) ^ (-1660958624)))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Class.forName(str, false, (ClassLoader) method.invoke(context, objArr2));
                        crc32.update(str.getBytes());
                        long value = crc32.getValue();
                        crc32.reset();
                        HashMap map = new HashMap();
                        short sXd = (short) (OY.Xd() ^ ((1039028726 ^ 1225925189) ^ 1962679369));
                        int[] iArr = new int["6#h$z".length()];
                        QB qb = new QB("6#h$z");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                            i2++;
                        }
                        String str2 = new String(iArr, 0, i2);
                        String strKd = C1561oA.Kd("\u000b\u0017", (short) (C1633zX.Xd() ^ (2078327543 ^ (-2078338047))));
                        try {
                            Class<?> cls4 = Class.forName(str2);
                            Field field4 = 0 != 0 ? cls4.getField(strKd) : cls4.getDeclaredField(strKd);
                            field4.setAccessible(true);
                            obj5 = field4.get(null);
                        } catch (Throwable th4) {
                            obj5 = null;
                        }
                        map.put(((EnumC1535jB) obj5).toString(), Long.toHexString(value));
                        String strZd = Wg.Zd("|\u0012i>^", (short) (FB.Xd() ^ (972847039 ^ 972839929)), (short) (FB.Xd() ^ ((1755617565 ^ 1432039424) ^ 1040184745)));
                        String strXd2 = C1561oA.Xd("dp", (short) (C1633zX.Xd() ^ ((1409097556 ^ 1021309016) ^ (-1864548686))));
                        try {
                            Class<?> cls5 = Class.forName(strZd);
                            Field field5 = 0 != 0 ? cls5.getField(strXd2) : cls5.getDeclaredField(strXd2);
                            field5.setAccessible(true);
                            obj6 = field5.get(null);
                        } catch (Throwable th5) {
                            obj6 = null;
                        }
                        Ud ud3 = (Ud) obj6;
                        String strVd = Wg.vd("\u001f\u000eQ\n\u0003", (short) (FB.Xd() ^ ((130158611 ^ 1898859673) ^ 1995206052)));
                        String strKd2 = Qg.kd("BL", (short) (ZN.Xd() ^ (1591157452 ^ 1591161117)), (short) (ZN.Xd() ^ ((424041699 ^ 1321798628) ^ 1468991218)));
                        try {
                            Class<?> cls6 = Class.forName(strVd);
                            Field field6 = 0 != 0 ? cls6.getField(strKd2) : cls6.getDeclaredField(strKd2);
                            field6.setAccessible(true);
                            obj7 = field6.get(null);
                        } catch (Throwable th6) {
                            obj7 = null;
                        }
                        c1594uo.zY(ud3, (EnumC1514eY) obj7, map);
                        return true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (ClassNotFoundException e4) {
            }
        }
        Object[] objArr3 = new Object[0];
        Method declaredMethod2 = Class.forName(hg.Vd("F3xB\"", (short) (C1499aX.Xd() ^ (1409761250 ^ (-1409752164))), (short) (C1499aX.Xd() ^ ((476563538 ^ 1492975754) ^ (-1150978696))))).getDeclaredMethod(C1561oA.ud("al", (short) (C1607wl.Xd() ^ ((537484579 ^ 204888967) ^ 742353416))), new Class[0]);
        try {
            declaredMethod2.setAccessible(true);
            Context context2 = (Context) declaredMethod2.invoke(null, objArr3);
            short sXd2 = (short) (C1633zX.Xd() ^ (1743164188 ^ (-1743179367)));
            int[] iArr2 = new int["#1$3-( j\u001d*&-\u001b%(b\u0015B>E3G@".length()];
            QB qb2 = new QB("#1$3-( j\u001d*&-\u001b%(b\u0015B>E3G@");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            Object[] objArr4 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Yd("WVfCUXaX_^H\\ib", (short) (FB.Xd() ^ (556482575 ^ 556498236))), new Class[0]);
            try {
                method2.setAccessible(true);
                String str3 = (String) method2.invoke(context2, objArr4);
                String strQd2 = Xg.qd("sb*?O", (short) (FB.Xd() ^ ((1260345600 ^ 1315587059) ^ 91567356)), (short) (FB.Xd() ^ ((989918534 ^ 488684217) ^ 639651753)));
                String strWd2 = Jg.Wd("LC", (short) (C1633zX.Xd() ^ (1209823199 ^ (-1209801276))), (short) (C1633zX.Xd() ^ ((738106925 ^ 358203245) ^ (-1051153792))));
                try {
                    Class<?> cls7 = Class.forName(strQd2);
                    Field field7 = 0 != 0 ? cls7.getField(strWd2) : cls7.getDeclaredField(strWd2);
                    field7.setAccessible(true);
                    obj2 = field7.get(null);
                } catch (Throwable th7) {
                    obj2 = null;
                }
                if (((String) obj2).equals(str3)) {
                    return false;
                }
                String strXd3 = ZO.xd("qA`O\f", (short) (C1499aX.Xd() ^ ((1891451135 ^ 255336938) ^ (-2139432375))), (short) (C1499aX.Xd() ^ ((1586047137 ^ 402658002) ^ (-1183415562))));
                String strUd2 = C1626yg.Ud("\u001eF", (short) (ZN.Xd() ^ ((10696446 ^ 922340159) ^ 911917803)), (short) (ZN.Xd() ^ (872240137 ^ 872247673)));
                try {
                    Class<?> cls8 = Class.forName(strXd3);
                    Field field8 = 0 != 0 ? cls8.getField(strUd2) : cls8.getDeclaredField(strUd2);
                    field8.setAccessible(true);
                    obj3 = field8.get(null);
                } catch (Throwable th8) {
                    obj3 = null;
                }
                Ud ud4 = (Ud) obj3;
                short sXd3 = (short) (ZN.Xd() ^ ((327300887 ^ 1268494248) ^ 1478092902));
                int[] iArr3 = new int["@\u0001\u00131R".length()];
                QB qb3 = new QB("@\u0001\u00131R");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd3 + i4)));
                    i4++;
                }
                String str4 = new String(iArr3, 0, i4);
                String strOd = EO.Od("&J", (short) (C1499aX.Xd() ^ ((330664773 ^ 2076204635) ^ (-1752535727))));
                try {
                    Class<?> cls9 = Class.forName(str4);
                    Field field9 = 0 != 0 ? cls9.getField(strOd) : cls9.getDeclaredField(strOd);
                    field9.setAccessible(true);
                    obj4 = field9.get(null);
                } catch (Throwable th9) {
                    obj4 = null;
                }
                c1594uo.RY(ud4, (EnumC1514eY) obj4);
                return true;
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }
}
