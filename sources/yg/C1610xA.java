package yg;

import android.content.Context;
import android.net.LocalSocketAddress;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: yg.xA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1610xA {
    private static final int Kd = 100;
    private static byte[] Od = null;
    private static final long Qd = 22528;
    private static String[] Vd = null;
    private static final long[] Wd = null;
    private static final int Xd = 31;
    private static final int Yd = 512;
    private static String[] kd = null;
    private static final long od = 12288;
    private static String[] qd = null;
    private static final long ud = 512;
    private static C1582sX vd = null;
    private static C1582sX wd = null;
    private static Set<WF> yd = null;
    private static String[] zd = null;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Qd("\u001c\tN\u0018_", (short) (C1607wl.Xd() ^ ((273418392 ^ 1667919342) ^ 1931878492)))).getDeclaredMethod(C1593ug.zd(",z", (short) (OY.Xd() ^ (ZN.Xd() ^ 864687017)), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831083734)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String[] strArr = (String[]) declaredMethod.invoke(null, objArr);
            String strOd = C1561oA.od("eR\u0018a)", (short) (C1607wl.Xd() ^ (760151150 ^ 760123711)));
            String strKd = C1561oA.Kd("jU", (short) (C1633zX.Xd() ^ (43037381 ^ (-43047472))));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
                field.setAccessible(true);
                field.set(null, strArr);
            } catch (Throwable th) {
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Wg.Zd("1U,j\u001b", (short) (Od.Xd() ^ ((595135147 ^ 1741142971) ^ (-1153340562))), (short) (Od.Xd() ^ ((1872439239 ^ 2082695050) ^ (-330831075))))).getDeclaredMethod(C1561oA.Xd("\u001e|", (short) (C1607wl.Xd() ^ ((650634352 ^ 1773927720) ^ 1333550212))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String[] strArr2 = (String[]) declaredMethod2.invoke(null, objArr2);
                short sXd = (short) (C1607wl.Xd() ^ (1205404384 ^ 1205432069));
                int[] iArr = new int["<+r>\b".length()];
                QB qb = new QB("<+r>\b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strKd2 = Qg.kd("Xe", (short) (ZN.Xd() ^ ((1593233019 ^ 337517151) ^ 1256753716)), (short) (ZN.Xd() ^ ((862210747 ^ 1625000550) ^ 1405085535)));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strKd2) : cls2.getDeclaredField(strKd2);
                    field2.setAccessible(true);
                    field2.set(null, strArr2);
                } catch (Throwable th2) {
                }
                short sXd2 = (short) (C1580rY.Xd() ^ (408331171 ^ (-408327348)));
                short sXd3 = (short) (C1580rY.Xd() ^ ((392250974 ^ 674585572) ^ (-1062489182)));
                int[] iArr2 = new int["\u001f\fQ\u001bb".length()];
                QB qb2 = new QB("\u001f\fQ\u001bb");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                    i3++;
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(C1561oA.ud("J*", (short) (C1580rY.Xd() ^ ((456645188 ^ 1614867459) ^ (-2071416294)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    String[] strArr3 = (String[]) declaredMethod3.invoke(null, objArr3);
                    String strYd = C1561oA.yd("\u0015\u0004K\u0017X", (short) (C1580rY.Xd() ^ ((1633320581 ^ 1594371089) ^ (-1045587423))));
                    short sXd4 = (short) (FB.Xd() ^ (1228146581 ^ 1228174243));
                    int[] iArr3 = new int["\u001e\u0018".length()];
                    QB qb3 = new QB("\u001e\u0018");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i4));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        field3.set(null, strArr3);
                    } catch (Throwable th3) {
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(Xg.qd("=,s?\t", (short) (C1607wl.Xd() ^ ((159010765 ^ 1294407268) ^ 1146966671)), (short) (C1607wl.Xd() ^ (569630846 ^ 569638507)))).getDeclaredMethod(Jg.Wd("25", (short) (Od.Xd() ^ ((1790112113 ^ 1718883505) ^ (-214363550))), (short) (Od.Xd() ^ ((271327822 ^ 1607282883) ^ (-1340153396)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        String[] strArr4 = (String[]) declaredMethod4.invoke(null, objArr4);
                        String strXd = ZO.xd("6JJIJ", (short) (FB.Xd() ^ ((2135760696 ^ 224034272) ^ 1914122140)), (short) (FB.Xd() ^ ((1051100438 ^ 870460119) ^ 222622855)));
                        String strUd = C1626yg.Ud("PL", (short) (OY.Xd() ^ ((365945262 ^ 1716052623) ^ 1938239890)), (short) (OY.Xd() ^ (375379005 ^ 375381264)));
                        try {
                            Class<?> cls4 = Class.forName(strXd);
                            Field field4 = 0 != 0 ? cls4.getField(strUd) : cls4.getDeclaredField(strUd);
                            field4.setAccessible(true);
                            field4.set(null, strArr4);
                        } catch (Throwable th4) {
                        }
                        Object[] objArr5 = new Object[0];
                        Method declaredMethod5 = Class.forName(Ig.wd("\u00101c\u001cc", (short) (C1633zX.Xd() ^ ((1705937175 ^ 2071351369) ^ (-517509464))))).getDeclaredMethod(EO.Od("yz", (short) (OY.Xd() ^ (640402756 ^ 640409800))), new Class[0]);
                        try {
                            declaredMethod5.setAccessible(true);
                            byte[] bArr = (byte[]) declaredMethod5.invoke(null, objArr5);
                            String strQd = C1561oA.Qd("]J\u0010Y!", (short) (C1607wl.Xd() ^ (1459572407 ^ 1459582948)));
                            String strZd = C1593ug.zd("s\n", (short) (C1607wl.Xd() ^ (78776159 ^ 78799467)), (short) (C1607wl.Xd() ^ (1849533617 ^ 1849556697)));
                            try {
                                Class<?> cls5 = Class.forName(strQd);
                                Field field5 = 0 != 0 ? cls5.getField(strZd) : cls5.getDeclaredField(strZd);
                                field5.setAccessible(true);
                                field5.set(null, bArr);
                            } catch (Throwable th5) {
                            }
                            Object[] objArr6 = new Object[0];
                            Method declaredMethod6 = Class.forName(C1561oA.od("XE\u000bT\u001c", (short) (C1607wl.Xd() ^ (592154267 ^ 592177955)))).getDeclaredMethod(C1561oA.Kd("tT", (short) (C1633zX.Xd() ^ (1501593166 ^ (-1501574929)))), new Class[0]);
                            try {
                                declaredMethod6.setAccessible(true);
                                HashSet hashSet = (HashSet) declaredMethod6.invoke(null, objArr6);
                                String strZd2 = Wg.Zd("v\f!0\u001b", (short) (C1633zX.Xd() ^ ((2101100645 ^ 659083470) ^ (-1517596113))), (short) (C1633zX.Xd() ^ ((391153534 ^ 1430044566) ^ (-1114403450))));
                                String strXd2 = C1561oA.Xd("D0", (short) (C1607wl.Xd() ^ ((436241365 ^ 687288105) ^ 855111185)));
                                try {
                                    Class<?> cls6 = Class.forName(strZd2);
                                    Field field6 = 0 != 0 ? cls6.getField(strXd2) : cls6.getDeclaredField(strXd2);
                                    field6.setAccessible(true);
                                    field6.set(null, hashSet);
                                } catch (Throwable th6) {
                                }
                                long[] jArr = new long[1852563787 ^ 1852563785];
                                // fill-array-data instruction
                                jArr[0] = 22528;
                                jArr[1] = 12288;
                                short sXd5 = (short) (OY.Xd() ^ (667072143 ^ 667066823));
                                int[] iArr4 = new int["\u001a\u0007L\u0016]".length()];
                                QB qb4 = new QB("\u001a\u0007L\u0016]");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((sXd5 ^ i5) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                String str3 = new String(iArr4, 0, i5);
                                String strKd3 = Qg.kd("/;", (short) (C1607wl.Xd() ^ ((1226882133 ^ 1374632372) ^ 416259298)), (short) (C1607wl.Xd() ^ (339520400 ^ 339510406)));
                                try {
                                    Class<?> cls7 = Class.forName(str3);
                                    Field field7 = 0 != 0 ? cls7.getField(strKd3) : cls7.getDeclaredField(strKd3);
                                    field7.setAccessible(true);
                                    field7.set(null, jArr);
                                } catch (Throwable th7) {
                                }
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
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    private static boolean BX(C1637zo c1637zo) {
        if (!kd()) {
            return false;
        }
        c1637zo.SY(Wg.vd("TGLM^UHLPSZ[a", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849982718))));
        return true;
    }

    private static boolean KX(C1637zo c1637zo) {
        Object obj;
        C1637zo c1637zo2;
        Object obj2;
        String strVd = hg.Vd("*\u0017\\&m", (short) (ZN.Xd() ^ ((1753463267 ^ 2125364383) ^ 372101425)), (short) (ZN.Xd() ^ (Od.Xd() ^ 1207806748)));
        String strUd = C1561oA.ud("kT", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (1030134411 ^ (-1394781712)))));
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        for (String str : (String[]) obj) {
            try {
                c1637zo2 = c1637zo;
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(C1561oA.yd("\u0012 \u0013\"\u001c\u0017\u000fY\u0017\u000f\u001bUp\u0015\u0006\u0005-\u0015.#(#/", (short) (C1580rY.Xd() ^ ((411036439 ^ 1682401614) ^ (-2084095690))))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    Object objNewInstance = constructor.newInstance(objArr);
                    try {
                        String strYd = C1561oA.Yd("BPGVTOK\u0016WO_\u001a9]RQ]EbW`[k9]^mapq#Nbohwugjm", (short) (C1580rY.Xd() ^ ((330617523 ^ 191281108) ^ (-416431616))));
                        String strQd = Xg.qd("uy}w\u0007\u000e\t\u000b|\u0006", (short) (C1499aX.Xd() ^ (957709555 ^ (-957678799))), (short) (C1499aX.Xd() ^ ((701734977 ^ 1547642460) ^ (-1978455002))));
                        try {
                            Class<?> cls2 = Class.forName(strYd);
                            Field field2 = 0 != 0 ? cls2.getField(strQd) : cls2.getDeclaredField(strQd);
                            field2.setAccessible(true);
                            obj2 = field2.get(null);
                        } catch (Throwable th2) {
                            obj2 = null;
                        }
                        LocalSocketAddress.Namespace namespace = (LocalSocketAddress.Namespace) obj2;
                        Class<?> cls3 = Class.forName(Jg.Wd("C\u001fe<\u0016h4FS!\u0001\u0003}y>\u0005\\[F\u000bg2\u001a7\u001foT\u0018zK", (short) (C1580rY.Xd() ^ ((2034338951 ^ 409780298) ^ (-1630349993))), (short) (C1580rY.Xd() ^ ((1097989356 ^ 1323020380) ^ (-262830176)))));
                        Class<?>[] clsArr = new Class[927769181 ^ 927769183];
                        clsArr[0] = Class.forName(ZO.xd("\u0007gE\b r\u0019Tfk|Oi-\tP", (short) (FB.Xd() ^ (426641900 ^ 426656269)), (short) (FB.Xd() ^ (1802862531 ^ 1802860462))));
                        clsArr[1] = Class.forName(C1626yg.Ud("x3\u001a\r\u0014?t;;\u0015b8*$$\u0004\u0010l\rW_\u0016\u001e\u001d\u0004!+cA1zMz!>\u0004#9S!", (short) (C1633zX.Xd() ^ ((526862273 ^ 871478305) ^ (-748076170))), (short) (C1633zX.Xd() ^ (2138582470 ^ (-2138579039)))));
                        Object[] objArr2 = new Object[(955798161 ^ 1641344966) ^ 1496104277];
                        objArr2[0] = str;
                        objArr2[1] = namespace;
                        Constructor<?> constructor2 = cls3.getConstructor(clsArr);
                        try {
                            constructor2.setAccessible(true);
                            Object objNewInstance2 = constructor2.newInstance(objArr2);
                            Class<?> cls4 = Class.forName(Ig.wd("{`&\u0013\u0016BWOP\n\u001d2%HB\u001dzQD>\u0007K.", (short) (C1499aX.Xd() ^ ((49459737 ^ 2105952532) ^ (-2138367031)))));
                            Class<?>[] clsArr2 = new Class[1];
                            clsArr2[0] = Class.forName(EO.Od(":\u0016O@^|\u001e\u001a\rrY;(?\u00117\u0007aHV!u-\u007f%3e\u0011K_", (short) (C1633zX.Xd() ^ ((251794762 ^ 563755012) ^ (-781737298)))));
                            Object[] objArr3 = {objNewInstance2};
                            short sXd = (short) (C1633zX.Xd() ^ (902783632 ^ (-902776154)));
                            int[] iArr = new int["Q\\ZYOL\\".length()];
                            QB qb = new QB("Q\\ZYOL\\");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                                i2++;
                            }
                            Method method = cls4.getMethod(new String(iArr, 0, i2), clsArr2);
                            try {
                                method.setAccessible(true);
                                method.invoke(objNewInstance, objArr3);
                                c1637zo2.SY(str);
                                Object[] objArr4 = new Object[0];
                                Method method2 = Class.forName(C1593ug.zd("Xf]ljea,meu0Oshgs[xmvq\u0002", (short) (FB.Xd() ^ (355797995 ^ 355796860)), (short) (FB.Xd() ^ ((1248982044 ^ 1876247033) ^ 631544785)))).getMethod(C1561oA.od("^fhk\\", (short) (Od.Xd() ^ ((888296957 ^ 925236045) ^ (-64461338)))), new Class[0]);
                                try {
                                    method2.setAccessible(true);
                                    method2.invoke(objNewInstance, objArr4);
                                    return true;
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (Throwable th3) {
                        short sXd2 = (short) (FB.Xd() ^ (1316847791 ^ 1316869036));
                        int[] iArr2 = new int["4B9HFA=\bIAQ\f+ODCO7TIRM]".length()];
                        QB qb2 = new QB("4B9HFA=\bIAQ\f+ODCO7TIRM]");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                            i3++;
                        }
                        try {
                            Object[] objArr5 = new Object[0];
                            Method method3 = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.Zd("\t\u001d(/!", (short) (FB.Xd() ^ ((227992466 ^ 1822287926) ^ 1628113516)), (short) (FB.Xd() ^ (2032521467 ^ 2032521121))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                method3.invoke(objNewInstance, objArr5);
                            } catch (InvocationTargetException e5) {
                                throw e5.getCause();
                            }
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (Throwable th5) {
                if (th5.getMessage() != null && th5.getMessage().contains(C1561oA.Xd("k\u0002\u0010\f\t\u0014\u0015\f\u0013\u0013E\u000b\r\u0017\u0013\u0010\u0010", (short) (C1633zX.Xd() ^ (514268709 ^ (-514266927)))))) {
                    c1637zo2.SY(str);
                    return true;
                }
            }
        }
        return false;
    }

    public static String Kd() {
        return Ig.wd("<c", (short) (OY.Xd() ^ (220543658 ^ 220538970)));
    }

    private static boolean NX(C1637zo c1637zo, List<C1570qB> list) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String strWd = Jg.Wd("o]2H?", (short) (ZN.Xd() ^ (1808124259 ^ 1808109622)), (short) (ZN.Xd() ^ (1749962423 ^ 1749946888)));
        String strXd = ZO.xd("nr", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951490212))), (short) (OY.Xd() ^ (103521428 ^ 103519552)));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        WF[] wfArr = new WF[((String[]) obj).length];
        int i2 = 0;
        while (true) {
            String strUd = C1626yg.Ud("\t\u007f\b\t}", (short) (OY.Xd() ^ ((1714347668 ^ 927937069) ^ 1365373404)), (short) (OY.Xd() ^ (1215618598 ^ 1215606653)));
            short sXd = (short) (C1633zX.Xd() ^ (2096884496 ^ (-2096862285)));
            int[] iArr = new int["uV".length()];
            QB qb = new QB("uV");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            String str = new String(iArr, 0, i3);
            try {
                Class<?> cls2 = Class.forName(strUd);
                Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            if (i2 >= ((String[]) obj2).length) {
                break;
            }
            short sXd2 = (short) (OY.Xd() ^ ((1317675256 ^ 1478992322) ^ 380489968));
            int[] iArr2 = new int["Nr)N0".length()];
            QB qb2 = new QB("Nr)N0");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i4)) + xuXd2.CK(iKK2));
                i4++;
            }
            String str2 = new String(iArr2, 0, i4);
            String strQd = C1561oA.Qd("\u0018%", (short) (OY.Xd() ^ ((1833936544 ^ 1456642218) ^ 1000157393)));
            try {
                Class<?> cls3 = Class.forName(str2);
                Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                field3.setAccessible(true);
                obj5 = field3.get(null);
            } catch (Throwable th3) {
                obj5 = null;
            }
            wfArr[i2] = new WF(((String[]) obj5)[i2].getBytes(StandardCharsets.UTF_8));
            i2++;
        }
        int[][] iArrUd = C1510dN.ud(wfArr);
        for (C1570qB c1570qB : list) {
            if (c1570qB.Qd.contains(C1593ug.zd("P\u0016\u001d\u0018\u001a\f\u0015W\f\u0014\u001a[\u000f\u001f \u0010\"%#\u0018\u001b*+", (short) (C1633zX.Xd() ^ (708002098 ^ (-707990735))), (short) (C1633zX.Xd() ^ ((1573833196 ^ 2108532159) ^ (-543376574))))) && c1570qB.wd && !c1570qB.Od && c1570qB.yd && !c1570qB.vd) {
                long j2 = c1570qB.Xd - c1570qB.Kd;
                String strOd = C1561oA.od("\bt:\u0004K", (short) (FB.Xd() ^ (1407986273 ^ 1407992098)));
                String strKd = C1561oA.Kd("AO", (short) (C1607wl.Xd() ^ (1236923445 ^ 1236925871)));
                try {
                    Class<?> cls4 = Class.forName(strOd);
                    Field field4 = 0 != 0 ? cls4.getField(strKd) : cls4.getDeclaredField(strKd);
                    field4.setAccessible(true);
                    obj3 = field4.get(null);
                } catch (Throwable th4) {
                    obj3 = null;
                }
                for (long j3 : (long[]) obj3) {
                    if (j3 <= j2) {
                        int iXd = (2054394187 ^ 665700497) ^ (-1574853083);
                        try {
                            iXd = C1510dN.Xd(c1570qB.Kd + j3, wfArr, iArrUd, Math.min(Math.max(j2 - j3, 0L), 4882837232077766648L ^ 4882837232077766136L));
                        } catch (IOException e2) {
                        }
                        if (iXd >= 0) {
                            String strZd = Wg.Zd("lRr.L", (short) (C1580rY.Xd() ^ (1107287369 ^ (-1107274142))), (short) (C1580rY.Xd() ^ (646378557 ^ (-646369435))));
                            String strXd2 = C1561oA.Xd("y\t", (short) (Od.Xd() ^ (179388721 ^ (-179372246))));
                            try {
                                Class<?> cls5 = Class.forName(strZd);
                                Field field5 = 0 != 0 ? cls5.getField(strXd2) : cls5.getDeclaredField(strXd2);
                                field5.setAccessible(true);
                                obj4 = field5.get(null);
                            } catch (Throwable th5) {
                                obj4 = null;
                            }
                            c1637zo.SY(((String[]) obj4)[iXd]);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean Ud(C1637zo c1637zo) {
        String strVd = Wg.vd("I\f\u000f\r\u0002N\u0014\u0007~yC\t\u0004x\t\r", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849982760))));
        boolean z2 = false;
        try {
            CY cy = new CY(Qg.kd("WSKIUJWSLF@RTLQEH?\u0007KF", (short) (C1499aX.Xd() ^ ((1231339152 ^ 821727939) ^ (-2040423231))), (short) (C1499aX.Xd() ^ ((837974293 ^ 679282208) ^ (-428803803)))));
            while (cy.hasMoreElements()) {
                try {
                    C1601vo c1601voNextElement = cy.nextElement();
                    if (!c1601voNextElement.Od && !c1601voNextElement.yd && !c1601voNextElement.vd && c1601voNextElement.Wd <= 0 && c1601voNextElement.Vd >= (117111406964545329L ^ 117111406964459313L) && !z2) {
                        c1637zo.SY(strVd);
                        z2 = true;
                    }
                } catch (Throwable th) {
                    try {
                        cy.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            cy.close();
        } catch (IOException e2) {
        } catch (NoSuchElementException e3) {
        } catch (Throwable th3) {
        }
        return z2;
    }

    private static boolean Wd(C1637zo c1637zo) {
        String strVd = hg.Vd("#cd`S\u001eaRXQ\u0019VW\\TYW", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207804455)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849957471)));
        boolean zContains = Xg.od(strVd).contains(C1561oA.ud("fd#\u0016\u001b\u001c%\u001c^", (short) (OY.Xd() ^ ((1034327879 ^ 753701933) ^ 290067721))));
        if (zContains) {
            c1637zo.SY(strVd);
        }
        return zContains;
    }

    public static String Xd() {
        return C1626yg.Ud("\u0003\u000b\u0012Jg", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134232707))), (short) (FB.Xd() ^ (2001529671 ^ 2001506790)));
    }

    private static boolean YX(C1637zo c1637zo) {
        return false;
    }

    private static String Yd() {
        String name = null;
        try {
            C1504bX c1504bX = new C1504bX(EO.Od("N\u0001m@\r\u001e2C{Gyl\u0004", (short) (C1580rY.Xd() ^ ((1023339554 ^ 1769783961) ^ (-1434603266)))));
            try {
                name = new File(new String(c1504bX.eY(c1504bX.nK(C1561oA.Qd("}8<A1=:", (short) (C1580rY.Xd() ^ ((1451815686 ^ 504943332) ^ (-1217425787)))))), 0, r5.length - 1)).getName();
                c1504bX.close();
            } finally {
            }
        } catch (IOException e2) {
        }
        return name;
    }

    private static boolean Zd(C1637zo c1637zo) throws Throwable {
        hg.Vd("U\n\n\u001aQ\b\u0005N", (short) (C1607wl.Xd() ^ (1238434423 ^ 1238449802)), (short) (C1607wl.Xd() ^ (OY.Xd() ^ (1909905920 ^ 1979576926))));
        Class<?> cls = Class.forName(C1561oA.ud("q^$``", (short) (C1499aX.Xd() ^ (313878066 ^ (-313883186)))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf((1210112161 ^ 281117642) ^ 1491164020)};
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.yd("p}", (short) (OY.Xd() ^ ((1528686377 ^ 1336125440) ^ 348018713))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            if (!((String) declaredMethod.invoke(null, objArr)).contains(C1561oA.Yd("\u001cRTf XW#", (short) (C1607wl.Xd() ^ ((1141277929 ^ 1209016194) ^ 202810872))))) {
                return false;
            }
            c1637zo.SY(Xg.qd("\u001e\u001e\r\u0010\u001b\u0014W\u0010\u0018\u0013[\u0010%)\u001b\u001f\u0015'/d.\u001e\u001d/+/", (short) (C1607wl.Xd() ^ ((1107170566 ^ 1151367433) ^ 90066263)), (short) (C1607wl.Xd() ^ ((940818304 ^ 2004577594) ^ 1332276491))));
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String[] gH() {
        String[] strArr = new String[(909873348 ^ 125930018) ^ 834280175];
        strArr[0] = Qg.kd("us`aja#UcbP`a]PQ^]\u001c\u001a\u0015\u0017\u0013WR", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1791175445 ^ 1531601073))), (short) (C1580rY.Xd() ^ (536553689 ^ (-536570316))));
        int iXd = FB.Xd() ^ (1116513387 ^ (-493090324));
        strArr[1] = hg.Vd("0.\u001b\u001c%\u001c]\u0010\u001e\u001d\u000b\u001b\u001c\u0018\u000b\f\u0019\u0018YVOQM\u0012\r", (short) (C1580rY.Xd() ^ ((1688999651 ^ 1357236314) ^ (-877243767))), (short) (C1580rY.Xd() ^ iXd));
        strArr[OY.Xd() ^ 69929194] = C1561oA.ud("\fOTMM=D\u00057=A\u00012@?-=>:-.;:{x", (short) (FB.Xd() ^ (1659975458 ^ 1659992655)));
        strArr[(2061773082 ^ 750069048) ^ 1448152097] = C1561oA.yd("=\u0001\u0006~~nu6hnr2cqp^nok^_lk*(", (short) (OY.Xd() ^ (310415406 ^ 310431257)));
        short sXd = (short) (Od.Xd() ^ (1863990935 ^ (-1863989939)));
        int[] iArr = new int["~DKFH:C\u0006:BH\n=MN>PSQFIXY".length()];
        QB qb = new QB("~DKFH:C\u0006:BH\n=MN>PSQFIXY");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        strArr[(798525190 ^ 2017446308) ^ 1470582438] = new String(iArr, 0, i2);
        short sXd2 = (short) (FB.Xd() ^ (ZN.Xd() ^ (870666685 ^ 7277505)));
        short sXd3 = (short) (FB.Xd() ^ (1312042333 ^ 1312050357));
        int[] iArr2 = new int["\rRYTVHQ\u0014HPV\u0018LZ[aO]Y^Sg]dd".length()];
        QB qb2 = new QB("\rRYTVHQ\u0014HPV\u0018LZ[aO]Y^Sg]dd");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        strArr[C1580rY.Xd() ^ (388860362 ^ (-648322514))] = new String(iArr2, 0, i3);
        int iXd2 = C1607wl.Xd() ^ (1147685160 ^ 707544397);
        strArr[(1542917925 ^ 1140267069) ^ 402659102] = Jg.Wd("\u000bRErp\u000e\t\b&QS?x%\u001fGBHqj'", (short) (ZN.Xd() ^ ((1143225664 ^ 439204400) ^ 1577696215)), (short) (ZN.Xd() ^ iXd2));
        int iXd3 = ZN.Xd() ^ (910286112 ^ (-97229733));
        strArr[C1499aX.Xd() ^ (346605341 ^ (-1463001098))] = ZO.xd("yI.\thOJQ\u007f=ll\u0013Z\u0002 \u0007/h\f\r", (short) (C1580rY.Xd() ^ (1514371740 ^ (-1514367040))), (short) (C1580rY.Xd() ^ iXd3));
        strArr[C1580rY.Xd() ^ (-831067159)] = C1626yg.Ud("I\u0010`\u000e6\u001blb\u0012Z9\f!x", (short) (FB.Xd() ^ (2014134589 ^ 2014119976)), (short) (FB.Xd() ^ (294449152 ^ 294452179)));
        return strArr;
    }

    public static HashSet iH() {
        HashSet hashSet = new HashSet();
        byte[] bArr = new byte[C1580rY.Xd() ^ (1481635823 ^ (-1774642130))];
        // fill-array-data instruction
        bArr[0] = 116;
        bArr[1] = -14;
        bArr[2] = 32;
        bArr[3] = -106;
        bArr[4] = 72;
        bArr[5] = -124;
        bArr[6] = -74;
        bArr[7] = 4;
        bArr[8] = -73;
        bArr[9] = -34;
        bArr[10] = -1;
        bArr[11] = 31;
        bArr[12] = 71;
        bArr[13] = 7;
        bArr[14] = 125;
        bArr[15] = -69;
        bArr[16] = -80;
        bArr[17] = 105;
        bArr[18] = -20;
        bArr[19] = 110;
        bArr[20] = 45;
        bArr[21] = -15;
        bArr[22] = 110;
        bArr[23] = -23;
        bArr[24] = 21;
        bArr[25] = 50;
        bArr[26] = 98;
        bArr[27] = -76;
        bArr[28] = -102;
        bArr[29] = -20;
        bArr[30] = 62;
        bArr[31] = 75;
        hashSet.add(new WF(bArr));
        byte[] bArr2 = new byte[FB.Xd() ^ (1850416833 ^ 832860626)];
        // fill-array-data instruction
        bArr2[0] = 23;
        bArr2[1] = -84;
        bArr2[2] = -75;
        bArr2[3] = 6;
        bArr2[4] = -64;
        bArr2[5] = -6;
        bArr2[6] = -22;
        bArr2[7] = 70;
        bArr2[8] = 33;
        bArr2[9] = -37;
        bArr2[10] = -35;
        bArr2[11] = 28;
        bArr2[12] = 10;
        bArr2[13] = -111;
        bArr2[14] = -29;
        bArr2[15] = 25;
        bArr2[16] = -125;
        bArr2[17] = -78;
        bArr2[18] = 113;
        bArr2[19] = 41;
        bArr2[20] = 85;
        bArr2[21] = -104;
        bArr2[22] = 25;
        bArr2[23] = -99;
        bArr2[24] = -105;
        bArr2[25] = -30;
        bArr2[26] = -124;
        bArr2[27] = -86;
        bArr2[28] = 76;
        bArr2[29] = 85;
        bArr2[30] = 81;
        bArr2[31] = -36;
        hashSet.add(new WF(bArr2));
        byte[] bArr3 = new byte[(2027655479 ^ 2054867417) ^ 44128462];
        // fill-array-data instruction
        bArr3[0] = 91;
        bArr3[1] = -5;
        bArr3[2] = -116;
        bArr3[3] = -121;
        bArr3[4] = -122;
        bArr3[5] = 101;
        bArr3[6] = -20;
        bArr3[7] = 23;
        bArr3[8] = 100;
        bArr3[9] = -51;
        bArr3[10] = -2;
        bArr3[11] = -95;
        bArr3[12] = 43;
        bArr3[13] = -81;
        bArr3[14] = 0;
        bArr3[15] = 33;
        bArr3[16] = 48;
        bArr3[17] = -62;
        bArr3[18] = -90;
        bArr3[19] = -17;
        bArr3[20] = 41;
        bArr3[21] = -82;
        bArr3[22] = -43;
        bArr3[23] = 4;
        bArr3[24] = 94;
        bArr3[25] = -126;
        bArr3[26] = -34;
        bArr3[27] = -39;
        bArr3[28] = 42;
        bArr3[29] = -31;
        bArr3[30] = -80;
        bArr3[31] = -45;
        hashSet.add(new WF(bArr3));
        byte[] bArr4 = new byte[1898410989 ^ 1898410957];
        // fill-array-data instruction
        bArr4[0] = -46;
        bArr4[1] = 83;
        bArr4[2] = 84;
        bArr4[3] = -34;
        bArr4[4] = 111;
        bArr4[5] = 59;
        bArr4[6] = 41;
        bArr4[7] = -30;
        bArr4[8] = -93;
        bArr4[9] = -94;
        bArr4[10] = 85;
        bArr4[11] = -101;
        bArr4[12] = -52;
        bArr4[13] = -12;
        bArr4[14] = 35;
        bArr4[15] = -65;
        bArr4[16] = -40;
        bArr4[17] = -26;
        bArr4[18] = -20;
        bArr4[19] = 46;
        bArr4[20] = 61;
        bArr4[21] = 37;
        bArr4[22] = -70;
        bArr4[23] = 35;
        bArr4[24] = -9;
        bArr4[25] = -6;
        bArr4[26] = 75;
        bArr4[27] = -118;
        bArr4[28] = -63;
        bArr4[29] = 20;
        bArr4[30] = -22;
        bArr4[31] = -93;
        hashSet.add(new WF(bArr4));
        byte[] bArr5 = new byte[964402695 ^ 964402727];
        // fill-array-data instruction
        bArr5[0] = 59;
        bArr5[1] = -117;
        bArr5[2] = 107;
        bArr5[3] = -64;
        bArr5[4] = 6;
        bArr5[5] = 54;
        bArr5[6] = -110;
        bArr5[7] = -102;
        bArr5[8] = -102;
        bArr5[9] = 116;
        bArr5[10] = 12;
        bArr5[11] = 95;
        bArr5[12] = 67;
        bArr5[13] = 126;
        bArr5[14] = 32;
        bArr5[15] = 2;
        bArr5[16] = -96;
        bArr5[17] = -108;
        bArr5[18] = -37;
        bArr5[19] = 46;
        bArr5[20] = -124;
        bArr5[21] = -11;
        bArr5[22] = -83;
        bArr5[23] = 4;
        bArr5[24] = 47;
        bArr5[25] = 97;
        bArr5[26] = -47;
        bArr5[27] = -45;
        bArr5[28] = 104;
        bArr5[29] = 24;
        bArr5[30] = -3;
        bArr5[31] = 117;
        hashSet.add(new WF(bArr5));
        byte[] bArr6 = new byte[(1475770437 ^ 1660830477) ^ 889731944];
        // fill-array-data instruction
        bArr6[0] = 4;
        bArr6[1] = 53;
        bArr6[2] = 95;
        bArr6[3] = 23;
        bArr6[4] = 29;
        bArr6[5] = -33;
        bArr6[6] = -24;
        bArr6[7] = 83;
        bArr6[8] = -38;
        bArr6[9] = 77;
        bArr6[10] = 118;
        bArr6[11] = 76;
        bArr6[12] = 86;
        bArr6[13] = -88;
        bArr6[14] = -54;
        bArr6[15] = -4;
        bArr6[16] = -45;
        bArr6[17] = -76;
        bArr6[18] = 78;
        bArr6[19] = -100;
        bArr6[20] = -12;
        bArr6[21] = -51;
        bArr6[22] = 1;
        bArr6[23] = -6;
        bArr6[24] = 39;
        bArr6[25] = -57;
        bArr6[26] = 26;
        bArr6[27] = -15;
        bArr6[28] = -75;
        bArr6[29] = -66;
        bArr6[30] = -24;
        bArr6[31] = -95;
        hashSet.add(new WF(bArr6));
        byte[] bArr7 = new byte[(833363295 ^ 1071235877) ^ 242605658];
        // fill-array-data instruction
        bArr7[0] = -12;
        bArr7[1] = 38;
        bArr7[2] = 59;
        bArr7[3] = -49;
        bArr7[4] = -51;
        bArr7[5] = -115;
        bArr7[6] = 15;
        bArr7[7] = 50;
        bArr7[8] = -68;
        bArr7[9] = 8;
        bArr7[10] = -57;
        bArr7[11] = -29;
        bArr7[12] = -20;
        bArr7[13] = 30;
        bArr7[14] = 0;
        bArr7[15] = -107;
        bArr7[16] = -114;
        bArr7[17] = -53;
        bArr7[18] = 14;
        bArr7[19] = 98;
        bArr7[20] = 12;
        bArr7[21] = -3;
        bArr7[22] = -128;
        bArr7[23] = -37;
        bArr7[24] = 22;
        bArr7[25] = 75;
        bArr7[26] = 52;
        bArr7[27] = -35;
        bArr7[28] = 64;
        bArr7[29] = 36;
        bArr7[30] = -8;
        bArr7[31] = 97;
        hashSet.add(new WF(bArr7));
        byte[] bArr8 = new byte[C1633zX.Xd() ^ (-1951491093)];
        // fill-array-data instruction
        bArr8[0] = -104;
        bArr8[1] = 73;
        bArr8[2] = 72;
        bArr8[3] = 16;
        bArr8[4] = -30;
        bArr8[5] = -95;
        bArr8[6] = -125;
        bArr8[7] = -26;
        bArr8[8] = 105;
        bArr8[9] = 76;
        bArr8[10] = 112;
        bArr8[11] = -47;
        bArr8[12] = -50;
        bArr8[13] = 115;
        bArr8[14] = -15;
        bArr8[15] = 105;
        bArr8[16] = -53;
        bArr8[17] = 90;
        bArr8[18] = 83;
        bArr8[19] = 49;
        bArr8[20] = -70;
        bArr8[21] = 68;
        bArr8[22] = 84;
        bArr8[23] = 117;
        bArr8[24] = 99;
        bArr8[25] = 104;
        bArr8[26] = 110;
        bArr8[27] = 119;
        bArr8[28] = -26;
        bArr8[29] = -128;
        bArr8[30] = -103;
        bArr8[31] = 113;
        hashSet.add(new WF(bArr8));
        byte[] bArr9 = new byte[C1499aX.Xd() ^ (1534379511 ^ (-418357957))];
        // fill-array-data instruction
        bArr9[0] = -81;
        bArr9[1] = -106;
        bArr9[2] = -102;
        bArr9[3] = 63;
        bArr9[4] = -11;
        bArr9[5] = -94;
        bArr9[6] = 94;
        bArr9[7] = -98;
        bArr9[8] = -88;
        bArr9[9] = 101;
        bArr9[10] = 32;
        bArr9[11] = 85;
        bArr9[12] = 103;
        bArr9[13] = -8;
        bArr9[14] = 9;
        bArr9[15] = -76;
        bArr9[16] = 37;
        bArr9[17] = -40;
        bArr9[18] = -111;
        bArr9[19] = 8;
        bArr9[20] = -101;
        bArr9[21] = -68;
        bArr9[22] = 88;
        bArr9[23] = -2;
        bArr9[24] = -82;
        bArr9[25] = 53;
        bArr9[26] = -51;
        bArr9[27] = 78;
        bArr9[28] = 88;
        bArr9[29] = 60;
        bArr9[30] = -44;
        bArr9[31] = 38;
        hashSet.add(new WF(bArr9));
        byte[] bArr10 = new byte[Od.Xd() ^ (1816546396 ^ 733730857)];
        // fill-array-data instruction
        bArr10[0] = -101;
        bArr10[1] = 75;
        bArr10[2] = -10;
        bArr10[3] = 121;
        bArr10[4] = -84;
        bArr10[5] = 61;
        bArr10[6] = -6;
        bArr10[7] = -87;
        bArr10[8] = -81;
        bArr10[9] = -110;
        bArr10[10] = -76;
        bArr10[11] = 51;
        bArr10[12] = -2;
        bArr10[13] = 104;
        bArr10[14] = -3;
        bArr10[15] = -114;
        bArr10[16] = -27;
        bArr10[17] = -97;
        bArr10[18] = -15;
        bArr10[19] = 69;
        bArr10[20] = -46;
        bArr10[21] = -17;
        bArr10[22] = -41;
        bArr10[23] = 99;
        bArr10[24] = 23;
        bArr10[25] = 24;
        bArr10[26] = -49;
        bArr10[27] = -55;
        bArr10[28] = 7;
        bArr10[29] = 25;
        bArr10[30] = 118;
        bArr10[31] = -11;
        hashSet.add(new WF(bArr10));
        byte[] bArr11 = new byte[C1633zX.Xd() ^ (-1951491093)];
        // fill-array-data instruction
        bArr11[0] = 37;
        bArr11[1] = 78;
        bArr11[2] = 89;
        bArr11[3] = 114;
        bArr11[4] = -19;
        bArr11[5] = -32;
        bArr11[6] = 118;
        bArr11[7] = -83;
        bArr11[8] = -94;
        bArr11[9] = 117;
        bArr11[10] = -28;
        bArr11[11] = 47;
        bArr11[12] = 72;
        bArr11[13] = 30;
        bArr11[14] = -53;
        bArr11[15] = -6;
        bArr11[16] = 106;
        bArr11[17] = -104;
        bArr11[18] = -100;
        bArr11[19] = -92;
        bArr11[20] = 29;
        bArr11[21] = -18;
        bArr11[22] = -43;
        bArr11[23] = 91;
        bArr11[24] = 109;
        bArr11[25] = -23;
        bArr11[26] = 60;
        bArr11[27] = -16;
        bArr11[28] = -100;
        bArr11[29] = 6;
        bArr11[30] = -3;
        bArr11[31] = 78;
        hashSet.add(new WF(bArr11));
        byte[] bArr12 = new byte[1249914827 ^ 1249914859];
        // fill-array-data instruction
        bArr12[0] = -72;
        bArr12[1] = 8;
        bArr12[2] = 43;
        bArr12[3] = 109;
        bArr12[4] = 126;
        bArr12[5] = 75;
        bArr12[6] = -72;
        bArr12[7] = -120;
        bArr12[8] = 26;
        bArr12[9] = -112;
        bArr12[10] = -126;
        bArr12[11] = 30;
        bArr12[12] = -70;
        bArr12[13] = 78;
        bArr12[14] = 63;
        bArr12[15] = -26;
        bArr12[16] = 67;
        bArr12[17] = 67;
        bArr12[18] = 82;
        bArr12[19] = -28;
        bArr12[20] = -84;
        bArr12[21] = -107;
        bArr12[22] = -121;
        bArr12[23] = -125;
        bArr12[24] = -32;
        bArr12[25] = 4;
        bArr12[26] = 36;
        bArr12[27] = 43;
        bArr12[28] = -40;
        bArr12[29] = -25;
        bArr12[30] = -93;
        bArr12[31] = -5;
        hashSet.add(new WF(bArr12));
        byte[] bArr13 = new byte[Od.Xd() ^ (1817532557 ^ 732482808)];
        // fill-array-data instruction
        bArr13[0] = 127;
        bArr13[1] = 47;
        bArr13[2] = 37;
        bArr13[3] = -61;
        bArr13[4] = 26;
        bArr13[5] = -50;
        bArr13[6] = 28;
        bArr13[7] = 43;
        bArr13[8] = -37;
        bArr13[9] = -65;
        bArr13[10] = 14;
        bArr13[11] = 88;
        bArr13[12] = -42;
        bArr13[13] = -48;
        bArr13[14] = 76;
        bArr13[15] = 14;
        bArr13[16] = 27;
        bArr13[17] = -115;
        bArr13[18] = 90;
        bArr13[19] = 73;
        bArr13[20] = 9;
        bArr13[21] = -93;
        bArr13[22] = 7;
        bArr13[23] = 37;
        bArr13[24] = 99;
        bArr13[25] = -59;
        bArr13[26] = -17;
        bArr13[27] = -61;
        bArr13[28] = -25;
        bArr13[29] = -14;
        bArr13[30] = 94;
        bArr13[31] = -20;
        hashSet.add(new WF(bArr13));
        byte[] bArr14 = new byte[1193847778 ^ 1193847746];
        // fill-array-data instruction
        bArr14[0] = -78;
        bArr14[1] = 36;
        bArr14[2] = 109;
        bArr14[3] = 31;
        bArr14[4] = 4;
        bArr14[5] = -107;
        bArr14[6] = 97;
        bArr14[7] = -58;
        bArr14[8] = -28;
        bArr14[9] = -76;
        bArr14[10] = -18;
        bArr14[11] = -79;
        bArr14[12] = -88;
        bArr14[13] = 95;
        bArr14[14] = -16;
        bArr14[15] = -27;
        bArr14[16] = -49;
        bArr14[17] = 90;
        bArr14[18] = -128;
        bArr14[19] = 111;
        bArr14[20] = -75;
        bArr14[21] = 11;
        bArr14[22] = -108;
        bArr14[23] = 104;
        bArr14[24] = 7;
        bArr14[25] = 48;
        bArr14[26] = -71;
        bArr14[27] = 76;
        bArr14[28] = 14;
        bArr14[29] = -3;
        bArr14[30] = -16;
        bArr14[31] = 64;
        hashSet.add(new WF(bArr14));
        byte[] bArr15 = new byte[679537084 ^ 679537052];
        // fill-array-data instruction
        bArr15[0] = 42;
        bArr15[1] = 107;
        bArr15[2] = -73;
        bArr15[3] = -48;
        bArr15[4] = 117;
        bArr15[5] = 83;
        bArr15[6] = -107;
        bArr15[7] = -70;
        bArr15[8] = -109;
        bArr15[9] = -66;
        bArr15[10] = -86;
        bArr15[11] = -95;
        bArr15[12] = 108;
        bArr15[13] = 14;
        bArr15[14] = 52;
        bArr15[15] = 106;
        bArr15[16] = 79;
        bArr15[17] = -86;
        bArr15[18] = -37;
        bArr15[19] = -85;
        bArr15[20] = -66;
        bArr15[21] = -98;
        bArr15[22] = 57;
        bArr15[23] = -105;
        bArr15[24] = 91;
        bArr15[25] = -14;
        bArr15[26] = -87;
        bArr15[27] = -82;
        bArr15[28] = 22;
        bArr15[29] = -106;
        bArr15[30] = 75;
        bArr15[31] = -89;
        hashSet.add(new WF(bArr15));
        byte[] bArr16 = new byte[(72535492 ^ 227512973) ^ 165502825];
        // fill-array-data instruction
        bArr16[0] = 73;
        bArr16[1] = 120;
        bArr16[2] = -74;
        bArr16[3] = -84;
        bArr16[4] = 71;
        bArr16[5] = 118;
        bArr16[6] = 78;
        bArr16[7] = 113;
        bArr16[8] = -86;
        bArr16[9] = -84;
        bArr16[10] = 99;
        bArr16[11] = -128;
        bArr16[12] = -102;
        bArr16[13] = -68;
        bArr16[14] = 47;
        bArr16[15] = -112;
        bArr16[16] = 75;
        bArr16[17] = 72;
        bArr16[18] = -127;
        bArr16[19] = -19;
        bArr16[20] = 89;
        bArr16[21] = 61;
        bArr16[22] = -7;
        bArr16[23] = -51;
        bArr16[24] = -121;
        bArr16[25] = -28;
        bArr16[26] = 34;
        bArr16[27] = 27;
        bArr16[28] = -51;
        bArr16[29] = 10;
        bArr16[30] = 62;
        bArr16[31] = 58;
        hashSet.add(new WF(bArr16));
        byte[] bArr17 = new byte[ZN.Xd() ^ (582813323 ^ 288831579)];
        // fill-array-data instruction
        bArr17[0] = -126;
        bArr17[1] = -124;
        bArr17[2] = 96;
        bArr17[3] = -29;
        bArr17[4] = -7;
        bArr17[5] = 87;
        bArr17[6] = -50;
        bArr17[7] = -15;
        bArr17[8] = 84;
        bArr17[9] = 108;
        bArr17[10] = 122;
        bArr17[11] = 80;
        bArr17[12] = 100;
        bArr17[13] = 27;
        bArr17[14] = 39;
        bArr17[15] = -75;
        bArr17[16] = 32;
        bArr17[17] = 123;
        bArr17[18] = 6;
        bArr17[19] = -80;
        bArr17[20] = 43;
        bArr17[21] = -88;
        bArr17[22] = 8;
        bArr17[23] = -127;
        bArr17[24] = 57;
        bArr17[25] = 10;
        bArr17[26] = -44;
        bArr17[27] = -118;
        bArr17[28] = 66;
        bArr17[29] = -64;
        bArr17[30] = -121;
        bArr17[31] = 11;
        hashSet.add(new WF(bArr17));
        byte[] bArr18 = new byte[1651176801 ^ 1651176769];
        // fill-array-data instruction
        bArr18[0] = 77;
        bArr18[1] = -4;
        bArr18[2] = 53;
        bArr18[3] = 80;
        bArr18[4] = -11;
        bArr18[5] = 13;
        bArr18[6] = -39;
        bArr18[7] = -71;
        bArr18[8] = 3;
        bArr18[9] = 98;
        bArr18[10] = 82;
        bArr18[11] = -126;
        bArr18[12] = -121;
        bArr18[13] = 48;
        bArr18[14] = -66;
        bArr18[15] = -86;
        bArr18[16] = -9;
        bArr18[17] = 46;
        bArr18[18] = 26;
        bArr18[19] = 119;
        bArr18[20] = -122;
        bArr18[21] = -16;
        bArr18[22] = -118;
        bArr18[23] = -53;
        bArr18[24] = -71;
        bArr18[25] = -99;
        bArr18[26] = 4;
        bArr18[27] = -54;
        bArr18[28] = 97;
        bArr18[29] = 85;
        bArr18[30] = -29;
        bArr18[31] = -32;
        hashSet.add(new WF(bArr18));
        byte[] bArr19 = new byte[C1633zX.Xd() ^ (-1951491093)];
        // fill-array-data instruction
        bArr19[0] = -28;
        bArr19[1] = 31;
        bArr19[2] = -69;
        bArr19[3] = 110;
        bArr19[4] = -94;
        bArr19[5] = -67;
        bArr19[6] = -57;
        bArr19[7] = -76;
        bArr19[8] = 12;
        bArr19[9] = 51;
        bArr19[10] = 57;
        bArr19[11] = 92;
        bArr19[12] = 44;
        bArr19[13] = 27;
        bArr19[14] = 17;
        bArr19[15] = -72;
        bArr19[16] = -17;
        bArr19[17] = 103;
        bArr19[18] = -39;
        bArr19[19] = -48;
        bArr19[20] = -103;
        bArr19[21] = -4;
        bArr19[22] = 75;
        bArr19[23] = -49;
        bArr19[24] = -109;
        bArr19[25] = 47;
        bArr19[26] = -75;
        bArr19[27] = -125;
        bArr19[28] = 41;
        bArr19[29] = 37;
        bArr19[30] = -54;
        bArr19[31] = -46;
        hashSet.add(new WF(bArr19));
        byte[] bArr20 = new byte[FB.Xd() ^ (536079856 ^ 1075610339)];
        // fill-array-data instruction
        bArr20[0] = 57;
        bArr20[1] = -49;
        bArr20[2] = -40;
        bArr20[3] = 32;
        bArr20[4] = 41;
        bArr20[5] = -9;
        bArr20[6] = -43;
        bArr20[7] = -124;
        bArr20[8] = -54;
        bArr20[9] = -99;
        bArr20[10] = -17;
        bArr20[11] = 63;
        bArr20[12] = -79;
        bArr20[13] = 41;
        bArr20[14] = 25;
        bArr20[15] = -16;
        bArr20[16] = -46;
        bArr20[17] = -63;
        bArr20[18] = 75;
        bArr20[19] = 45;
        bArr20[20] = -50;
        bArr20[21] = 115;
        bArr20[22] = 65;
        bArr20[23] = -65;
        bArr20[24] = 114;
        bArr20[25] = -40;
        bArr20[26] = 51;
        bArr20[27] = -39;
        bArr20[28] = -106;
        bArr20[29] = 88;
        bArr20[30] = 62;
        bArr20[31] = -122;
        hashSet.add(new WF(bArr20));
        byte[] bArr21 = new byte[(1516549469 ^ 379428352) ^ 1291398013];
        // fill-array-data instruction
        bArr21[0] = -126;
        bArr21[1] = 20;
        bArr21[2] = 15;
        bArr21[3] = -87;
        bArr21[4] = 48;
        bArr21[5] = -92;
        bArr21[6] = 118;
        bArr21[7] = 115;
        bArr21[8] = 15;
        bArr21[9] = 78;
        bArr21[10] = 39;
        bArr21[11] = -6;
        bArr21[12] = 33;
        bArr21[13] = -57;
        bArr21[14] = 19;
        bArr21[15] = -127;
        bArr21[16] = -62;
        bArr21[17] = -14;
        bArr21[18] = -89;
        bArr21[19] = 31;
        bArr21[20] = 95;
        bArr21[21] = 88;
        bArr21[22] = -16;
        bArr21[23] = -44;
        bArr21[24] = -11;
        bArr21[25] = -30;
        bArr21[26] = -45;
        bArr21[27] = -116;
        bArr21[28] = 124;
        bArr21[29] = -108;
        bArr21[30] = -95;
        bArr21[31] = -67;
        hashSet.add(new WF(bArr21));
        byte[] bArr22 = new byte[FB.Xd() ^ (396370882 ^ 1213156561)];
        // fill-array-data instruction
        bArr22[0] = 76;
        bArr22[1] = 107;
        bArr22[2] = 104;
        bArr22[3] = -123;
        bArr22[4] = 64;
        bArr22[5] = -110;
        bArr22[6] = 77;
        bArr22[7] = -32;
        bArr22[8] = 88;
        bArr22[9] = 15;
        bArr22[10] = -43;
        bArr22[11] = 77;
        bArr22[12] = -94;
        bArr22[13] = 72;
        bArr22[14] = 50;
        bArr22[15] = -10;
        bArr22[16] = -37;
        bArr22[17] = 125;
        bArr22[18] = -10;
        bArr22[19] = -125;
        bArr22[20] = -104;
        bArr22[21] = -56;
        bArr22[22] = 100;
        bArr22[23] = -5;
        bArr22[24] = -89;
        bArr22[25] = -96;
        bArr22[26] = -19;
        bArr22[27] = -73;
        bArr22[28] = 41;
        bArr22[29] = 94;
        bArr22[30] = -11;
        bArr22[31] = 0;
        hashSet.add(new WF(bArr22));
        byte[] bArr23 = new byte[FB.Xd() ^ (1819997331 ^ 865442688)];
        // fill-array-data instruction
        bArr23[0] = 38;
        bArr23[1] = 39;
        bArr23[2] = -119;
        bArr23[3] = 46;
        bArr23[4] = 61;
        bArr23[5] = -69;
        bArr23[6] = -4;
        bArr23[7] = 33;
        bArr23[8] = -103;
        bArr23[9] = -23;
        bArr23[10] = 41;
        bArr23[11] = 95;
        bArr23[12] = 63;
        bArr23[13] = 43;
        bArr23[14] = -120;
        bArr23[15] = 17;
        bArr23[16] = 45;
        bArr23[17] = -10;
        bArr23[18] = 2;
        bArr23[19] = 77;
        bArr23[20] = -56;
        bArr23[21] = -108;
        bArr23[22] = 111;
        bArr23[23] = 122;
        bArr23[24] = -94;
        bArr23[25] = 89;
        bArr23[26] = 121;
        bArr23[27] = -77;
        bArr23[28] = 67;
        bArr23[29] = -88;
        bArr23[30] = 65;
        bArr23[31] = 119;
        hashSet.add(new WF(bArr23));
        byte[] bArr24 = new byte[C1607wl.Xd() ^ 1849955322];
        // fill-array-data instruction
        bArr24[0] = 120;
        bArr24[1] = -63;
        bArr24[2] = -62;
        bArr24[3] = -15;
        bArr24[4] = 82;
        bArr24[5] = 104;
        bArr24[6] = 46;
        bArr24[7] = 24;
        bArr24[8] = -86;
        bArr24[9] = 119;
        bArr24[10] = 125;
        bArr24[11] = 29;
        bArr24[12] = 66;
        bArr24[13] = -14;
        bArr24[14] = -27;
        bArr24[15] = -24;
        bArr24[16] = 7;
        bArr24[17] = 127;
        bArr24[18] = -8;
        bArr24[19] = -125;
        bArr24[20] = 4;
        bArr24[21] = 65;
        bArr24[22] = 118;
        bArr24[23] = 13;
        bArr24[24] = -85;
        bArr24[25] = -83;
        bArr24[26] = 65;
        bArr24[27] = 106;
        bArr24[28] = 48;
        bArr24[29] = 55;
        bArr24[30] = -88;
        bArr24[31] = -126;
        hashSet.add(new WF(bArr24));
        byte[] bArr25 = new byte[(1162115610 ^ 1170862041) ^ 9278947];
        // fill-array-data instruction
        bArr25[0] = -12;
        bArr25[1] = 8;
        bArr25[2] = -56;
        bArr25[3] = -75;
        bArr25[4] = -84;
        bArr25[5] = 27;
        bArr25[6] = -10;
        bArr25[7] = -127;
        bArr25[8] = -101;
        bArr25[9] = 13;
        bArr25[10] = -127;
        bArr25[11] = -94;
        bArr25[12] = -117;
        bArr25[13] = -41;
        bArr25[14] = -80;
        bArr25[15] = 31;
        bArr25[16] = -8;
        bArr25[17] = -78;
        bArr25[18] = 83;
        bArr25[19] = 97;
        bArr25[20] = 47;
        bArr25[21] = 76;
        bArr25[22] = -64;
        bArr25[23] = -14;
        bArr25[24] = -101;
        bArr25[25] = 125;
        bArr25[26] = -98;
        bArr25[27] = 84;
        bArr25[28] = 91;
        bArr25[29] = -6;
        bArr25[30] = 99;
        bArr25[31] = 98;
        hashSet.add(new WF(bArr25));
        byte[] bArr26 = new byte[C1580rY.Xd() ^ (-831067199)];
        // fill-array-data instruction
        bArr26[0] = 46;
        bArr26[1] = 92;
        bArr26[2] = 45;
        bArr26[3] = -8;
        bArr26[4] = 64;
        bArr26[5] = -120;
        bArr26[6] = -44;
        bArr26[7] = -12;
        bArr26[8] = -33;
        bArr26[9] = 14;
        bArr26[10] = 69;
        bArr26[11] = 46;
        bArr26[12] = 115;
        bArr26[13] = 119;
        bArr26[14] = -18;
        bArr26[15] = -35;
        bArr26[16] = -21;
        bArr26[17] = -8;
        bArr26[18] = -2;
        bArr26[19] = 19;
        bArr26[20] = -80;
        bArr26[21] = -90;
        bArr26[22] = -37;
        bArr26[23] = 106;
        bArr26[24] = -52;
        bArr26[25] = 13;
        bArr26[26] = 98;
        bArr26[27] = 96;
        bArr26[28] = 102;
        bArr26[29] = 70;
        bArr26[30] = 30;
        bArr26[31] = 68;
        hashSet.add(new WF(bArr26));
        byte[] bArr27 = new byte[C1580rY.Xd() ^ (700496112 ^ (-407481551))];
        // fill-array-data instruction
        bArr27[0] = -61;
        bArr27[1] = -71;
        bArr27[2] = -78;
        bArr27[3] = 47;
        bArr27[4] = 66;
        bArr27[5] = -53;
        bArr27[6] = 111;
        bArr27[7] = 85;
        bArr27[8] = 104;
        bArr27[9] = 29;
        bArr27[10] = -44;
        bArr27[11] = -88;
        bArr27[12] = -6;
        bArr27[13] = -86;
        bArr27[14] = 107;
        bArr27[15] = -85;
        bArr27[16] = 5;
        bArr27[17] = 10;
        bArr27[18] = 47;
        bArr27[19] = -108;
        bArr27[20] = -69;
        bArr27[21] = -18;
        bArr27[22] = -20;
        bArr27[23] = 110;
        bArr27[24] = -61;
        bArr27[25] = 86;
        bArr27[26] = 28;
        bArr27[27] = -123;
        bArr27[28] = -77;
        bArr27[29] = -79;
        bArr27[30] = -105;
        bArr27[31] = 120;
        hashSet.add(new WF(bArr27));
        byte[] bArr28 = new byte[(899750224 ^ 1532208167) ^ 1861401943];
        // fill-array-data instruction
        bArr28[0] = 91;
        bArr28[1] = -14;
        bArr28[2] = -38;
        bArr28[3] = 45;
        bArr28[4] = 77;
        bArr28[5] = -105;
        bArr28[6] = 111;
        bArr28[7] = -17;
        bArr28[8] = -6;
        bArr28[9] = 78;
        bArr28[10] = 114;
        bArr28[11] = -58;
        bArr28[12] = -2;
        bArr28[13] = -7;
        bArr28[14] = 52;
        bArr28[15] = 107;
        bArr28[16] = 65;
        bArr28[17] = -68;
        bArr28[18] = 88;
        bArr28[19] = -28;
        bArr28[20] = 100;
        bArr28[21] = 107;
        bArr28[22] = 55;
        bArr28[23] = -29;
        bArr28[24] = -28;
        bArr28[25] = -10;
        bArr28[26] = 89;
        bArr28[27] = -76;
        bArr28[28] = -29;
        bArr28[29] = 9;
        bArr28[30] = -9;
        bArr28[31] = 92;
        hashSet.add(new WF(bArr28));
        byte[] bArr29 = new byte[115169154 ^ 115169186];
        // fill-array-data instruction
        bArr29[0] = 78;
        bArr29[1] = 50;
        bArr29[2] = -127;
        bArr29[3] = -9;
        bArr29[4] = 101;
        bArr29[5] = -39;
        bArr29[6] = 47;
        bArr29[7] = -74;
        bArr29[8] = 47;
        bArr29[9] = 98;
        bArr29[10] = -41;
        bArr29[11] = 50;
        bArr29[12] = 54;
        bArr29[13] = -64;
        bArr29[14] = 62;
        bArr29[15] = 123;
        bArr29[16] = -79;
        bArr29[17] = -43;
        bArr29[18] = 123;
        bArr29[19] = -118;
        bArr29[20] = 115;
        bArr29[21] = -82;
        bArr29[22] = 33;
        bArr29[23] = 61;
        bArr29[24] = 49;
        bArr29[25] = -40;
        bArr29[26] = -118;
        bArr29[27] = 79;
        bArr29[28] = -123;
        bArr29[29] = 21;
        bArr29[30] = -108;
        bArr29[31] = 14;
        hashSet.add(new WF(bArr29));
        byte[] bArr30 = new byte[(1504918059 ^ 1290715220) ^ 358480479];
        // fill-array-data instruction
        bArr30[0] = 13;
        bArr30[1] = -105;
        bArr30[2] = 85;
        bArr30[3] = -61;
        bArr30[4] = 17;
        bArr30[5] = -100;
        bArr30[6] = -38;
        bArr30[7] = 81;
        bArr30[8] = -39;
        bArr30[9] = 41;
        bArr30[10] = -123;
        bArr30[11] = 44;
        bArr30[12] = 53;
        bArr30[13] = -69;
        bArr30[14] = -89;
        bArr30[15] = -105;
        bArr30[16] = 23;
        bArr30[17] = 12;
        bArr30[18] = 35;
        bArr30[19] = -53;
        bArr30[20] = -121;
        bArr30[21] = -127;
        bArr30[22] = -77;
        bArr30[23] = -74;
        bArr30[24] = 43;
        bArr30[25] = 34;
        bArr30[26] = 73;
        bArr30[27] = -27;
        bArr30[28] = -87;
        bArr30[29] = 36;
        bArr30[30] = 58;
        bArr30[31] = -70;
        hashSet.add(new WF(bArr30));
        byte[] bArr31 = new byte[(1358981262 ^ 162678233) ^ 1488072055];
        // fill-array-data instruction
        bArr31[0] = -119;
        bArr31[1] = 61;
        bArr31[2] = -124;
        bArr31[3] = 14;
        bArr31[4] = 79;
        bArr31[5] = -68;
        bArr31[6] = -26;
        bArr31[7] = 83;
        bArr31[8] = -105;
        bArr31[9] = -124;
        bArr31[10] = -87;
        bArr31[11] = 89;
        bArr31[12] = 121;
        bArr31[13] = -57;
        bArr31[14] = 42;
        bArr31[15] = 83;
        bArr31[16] = 54;
        bArr31[17] = 65;
        bArr31[18] = 67;
        bArr31[19] = 107;
        bArr31[20] = 59;
        bArr31[21] = -23;
        bArr31[22] = -74;
        bArr31[23] = 88;
        bArr31[24] = 0;
        bArr31[25] = -118;
        bArr31[26] = -11;
        bArr31[27] = 82;
        bArr31[28] = -7;
        bArr31[29] = -29;
        bArr31[30] = -81;
        bArr31[31] = 118;
        hashSet.add(new WF(bArr31));
        byte[] bArr32 = new byte[C1499aX.Xd() ^ (980523055 ^ (-2045443869))];
        // fill-array-data instruction
        bArr32[0] = 104;
        bArr32[1] = 19;
        bArr32[2] = 52;
        bArr32[3] = 82;
        bArr32[4] = 26;
        bArr32[5] = -25;
        bArr32[6] = 64;
        bArr32[7] = -88;
        bArr32[8] = 85;
        bArr32[9] = -74;
        bArr32[10] = -85;
        bArr32[11] = 9;
        bArr32[12] = 79;
        bArr32[13] = -63;
        bArr32[14] = 57;
        bArr32[15] = 103;
        bArr32[16] = 70;
        bArr32[17] = -58;
        bArr32[18] = -15;
        bArr32[19] = 47;
        bArr32[20] = -33;
        bArr32[21] = 96;
        bArr32[22] = 39;
        bArr32[23] = -126;
        bArr32[24] = 28;
        bArr32[25] = 108;
        bArr32[26] = -127;
        bArr32[27] = 89;
        bArr32[28] = 61;
        bArr32[29] = 17;
        bArr32[30] = -21;
        bArr32[31] = 101;
        hashSet.add(new WF(bArr32));
        byte[] bArr33 = new byte[(1082205282 ^ 89114282) ^ 1171186408];
        // fill-array-data instruction
        bArr33[0] = 28;
        bArr33[1] = 80;
        bArr33[2] = 98;
        bArr33[3] = -113;
        bArr33[4] = -76;
        bArr33[5] = -50;
        bArr33[6] = 93;
        bArr33[7] = 77;
        bArr33[8] = 120;
        bArr33[9] = -8;
        bArr33[10] = 63;
        bArr33[11] = 62;
        bArr33[12] = 120;
        bArr33[13] = -73;
        bArr33[14] = -79;
        bArr33[15] = -35;
        bArr33[16] = -95;
        bArr33[17] = 34;
        bArr33[18] = 89;
        bArr33[19] = 93;
        bArr33[20] = -52;
        bArr33[21] = 90;
        bArr33[22] = -17;
        bArr33[23] = 50;
        bArr33[24] = -118;
        bArr33[25] = 55;
        bArr33[26] = 120;
        bArr33[27] = -48;
        bArr33[28] = 121;
        bArr33[29] = -114;
        bArr33[30] = 47;
        bArr33[31] = 8;
        hashSet.add(new WF(bArr33));
        byte[] bArr34 = new byte[C1607wl.Xd() ^ (2056308827 ^ 349494177)];
        // fill-array-data instruction
        bArr34[0] = -8;
        bArr34[1] = -70;
        bArr34[2] = 67;
        bArr34[3] = 115;
        bArr34[4] = -63;
        bArr34[5] = 19;
        bArr34[6] = 114;
        bArr34[7] = -1;
        bArr34[8] = -20;
        bArr34[9] = -37;
        bArr34[10] = 60;
        bArr34[11] = 95;
        bArr34[12] = 107;
        bArr34[13] = -22;
        bArr34[14] = -67;
        bArr34[15] = 123;
        bArr34[16] = 86;
        bArr34[17] = -106;
        bArr34[18] = -116;
        bArr34[19] = -27;
        bArr34[20] = -3;
        bArr34[21] = -23;
        bArr34[22] = -66;
        bArr34[23] = -82;
        bArr34[24] = -65;
        bArr34[25] = -78;
        bArr34[26] = 113;
        bArr34[27] = -97;
        bArr34[28] = 52;
        bArr34[29] = -80;
        bArr34[30] = -104;
        bArr34[31] = 34;
        hashSet.add(new WF(bArr34));
        byte[] bArr35 = new byte[OY.Xd() ^ 69929160];
        // fill-array-data instruction
        bArr35[0] = 80;
        bArr35[1] = -44;
        bArr35[2] = -121;
        bArr35[3] = 95;
        bArr35[4] = -98;
        bArr35[5] = 31;
        bArr35[6] = -73;
        bArr35[7] = -24;
        bArr35[8] = 11;
        bArr35[9] = -68;
        bArr35[10] = -7;
        bArr35[11] = -23;
        bArr35[12] = 18;
        bArr35[13] = 57;
        bArr35[14] = -5;
        bArr35[15] = 55;
        bArr35[16] = -128;
        bArr35[17] = 80;
        bArr35[18] = -118;
        bArr35[19] = 111;
        bArr35[20] = 113;
        bArr35[21] = -122;
        bArr35[22] = 66;
        bArr35[23] = 61;
        bArr35[24] = 90;
        bArr35[25] = -63;
        bArr35[26] = 121;
        bArr35[27] = -20;
        bArr35[28] = 0;
        bArr35[29] = 12;
        bArr35[30] = -89;
        bArr35[31] = 37;
        hashSet.add(new WF(bArr35));
        byte[] bArr36 = new byte[ZN.Xd() ^ (416932513 ^ 726916209)];
        // fill-array-data instruction
        bArr36[0] = -9;
        bArr36[1] = -15;
        bArr36[2] = 82;
        bArr36[3] = -97;
        bArr36[4] = -42;
        bArr36[5] = -102;
        bArr36[6] = 10;
        bArr36[7] = 2;
        bArr36[8] = -33;
        bArr36[9] = 29;
        bArr36[10] = -18;
        bArr36[11] = -81;
        bArr36[12] = -66;
        bArr36[13] = -91;
        bArr36[14] = 45;
        bArr36[15] = 2;
        bArr36[16] = 119;
        bArr36[17] = 44;
        bArr36[18] = -54;
        bArr36[19] = -88;
        bArr36[20] = -43;
        bArr36[21] = -107;
        bArr36[22] = -112;
        bArr36[23] = -100;
        bArr36[24] = -8;
        bArr36[25] = 110;
        bArr36[26] = -18;
        bArr36[27] = -8;
        bArr36[28] = 108;
        bArr36[29] = 71;
        bArr36[30] = -124;
        bArr36[31] = 83;
        hashSet.add(new WF(bArr36));
        byte[] bArr37 = new byte[OY.Xd() ^ (1092772918 ^ 1158245630)];
        // fill-array-data instruction
        bArr37[0] = 77;
        bArr37[1] = 34;
        bArr37[2] = 93;
        bArr37[3] = -11;
        bArr37[4] = -29;
        bArr37[5] = 122;
        bArr37[6] = -15;
        bArr37[7] = 12;
        bArr37[8] = 41;
        bArr37[9] = -103;
        bArr37[10] = 104;
        bArr37[11] = -13;
        bArr37[12] = 45;
        bArr37[13] = -68;
        bArr37[14] = 15;
        bArr37[15] = -91;
        bArr37[16] = 14;
        bArr37[17] = -111;
        bArr37[18] = 13;
        bArr37[19] = 9;
        bArr37[20] = 87;
        bArr37[21] = -47;
        bArr37[22] = 24;
        bArr37[23] = -21;
        bArr37[24] = 0;
        bArr37[25] = 61;
        bArr37[26] = 96;
        bArr37[27] = 58;
        bArr37[28] = 61;
        bArr37[29] = -47;
        bArr37[30] = 6;
        bArr37[31] = 110;
        hashSet.add(new WF(bArr37));
        byte[] bArr38 = new byte[498006196 ^ 498006164];
        // fill-array-data instruction
        bArr38[0] = -15;
        bArr38[1] = -96;
        bArr38[2] = -23;
        bArr38[3] = -58;
        bArr38[4] = -11;
        bArr38[5] = 121;
        bArr38[6] = -51;
        bArr38[7] = -89;
        bArr38[8] = 82;
        bArr38[9] = 126;
        bArr38[10] = 21;
        bArr38[11] = -4;
        bArr38[12] = 14;
        bArr38[13] = 117;
        bArr38[14] = 44;
        bArr38[15] = 10;
        bArr38[16] = 47;
        bArr38[17] = -111;
        bArr38[18] = 26;
        bArr38[19] = 103;
        bArr38[20] = -72;
        bArr38[21] = 57;
        bArr38[22] = 42;
        bArr38[23] = -114;
        bArr38[24] = -78;
        bArr38[25] = 25;
        bArr38[26] = -33;
        bArr38[27] = 99;
        bArr38[28] = 23;
        bArr38[29] = 117;
        bArr38[30] = 26;
        bArr38[31] = -89;
        hashSet.add(new WF(bArr38));
        byte[] bArr39 = new byte[ZN.Xd() ^ 864698064];
        // fill-array-data instruction
        bArr39[0] = 104;
        bArr39[1] = 45;
        bArr39[2] = 127;
        bArr39[3] = 120;
        bArr39[4] = -109;
        bArr39[5] = 125;
        bArr39[6] = 45;
        bArr39[7] = -49;
        bArr39[8] = 61;
        bArr39[9] = 98;
        bArr39[10] = 64;
        bArr39[11] = 78;
        bArr39[12] = 100;
        bArr39[13] = -5;
        bArr39[14] = 1;
        bArr39[15] = 82;
        bArr39[16] = -45;
        bArr39[17] = 17;
        bArr39[18] = -9;
        bArr39[19] = -43;
        bArr39[20] = 105;
        bArr39[21] = -127;
        bArr39[22] = 16;
        bArr39[23] = 102;
        bArr39[24] = -95;
        bArr39[25] = 3;
        bArr39[26] = -34;
        bArr39[27] = -37;
        bArr39[28] = 45;
        bArr39[29] = 25;
        bArr39[30] = -82;
        bArr39[31] = 17;
        hashSet.add(new WF(bArr39));
        byte[] bArr40 = new byte[1695266849 ^ 1695266817];
        // fill-array-data instruction
        bArr40[0] = 37;
        bArr40[1] = -5;
        bArr40[2] = 56;
        bArr40[3] = -88;
        bArr40[4] = 124;
        bArr40[5] = 109;
        bArr40[6] = -40;
        bArr40[7] = 54;
        bArr40[8] = -112;
        bArr40[9] = 60;
        bArr40[10] = 62;
        bArr40[11] = -59;
        bArr40[12] = 122;
        bArr40[13] = 75;
        bArr40[14] = 77;
        bArr40[15] = 1;
        bArr40[16] = -56;
        bArr40[17] = 87;
        bArr40[18] = -45;
        bArr40[19] = 90;
        bArr40[20] = -54;
        bArr40[21] = -32;
        bArr40[22] = 98;
        bArr40[23] = -113;
        bArr40[24] = 33;
        bArr40[25] = -113;
        bArr40[26] = -3;
        bArr40[27] = -35;
        bArr40[28] = 41;
        bArr40[29] = -128;
        bArr40[30] = 5;
        bArr40[31] = -1;
        hashSet.add(new WF(bArr40));
        byte[] bArr41 = new byte[ZN.Xd() ^ 864698064];
        // fill-array-data instruction
        bArr41[0] = 12;
        bArr41[1] = -53;
        bArr41[2] = -14;
        bArr41[3] = 59;
        bArr41[4] = -29;
        bArr41[5] = 11;
        bArr41[6] = 46;
        bArr41[7] = -31;
        bArr41[8] = -9;
        bArr41[9] = 27;
        bArr41[10] = 9;
        bArr41[11] = 97;
        bArr41[12] = -2;
        bArr41[13] = -56;
        bArr41[14] = 64;
        bArr41[15] = 115;
        bArr41[16] = 2;
        bArr41[17] = 11;
        bArr41[18] = -79;
        bArr41[19] = 33;
        bArr41[20] = -127;
        bArr41[21] = 78;
        bArr41[22] = -81;
        bArr41[23] = 31;
        bArr41[24] = -33;
        bArr41[25] = -61;
        bArr41[26] = 46;
        bArr41[27] = 10;
        bArr41[28] = -59;
        bArr41[29] = -8;
        bArr41[30] = -108;
        bArr41[31] = 89;
        hashSet.add(new WF(bArr41));
        byte[] bArr42 = new byte[C1633zX.Xd() ^ (-1951491093)];
        // fill-array-data instruction
        bArr42[0] = 32;
        bArr42[1] = -47;
        bArr42[2] = 106;
        bArr42[3] = -58;
        bArr42[4] = 106;
        bArr42[5] = -127;
        bArr42[6] = -58;
        bArr42[7] = 90;
        bArr42[8] = 119;
        bArr42[9] = 89;
        bArr42[10] = 18;
        bArr42[11] = -43;
        bArr42[12] = 42;
        bArr42[13] = 119;
        bArr42[14] = 94;
        bArr42[15] = -102;
        bArr42[16] = -60;
        bArr42[17] = -29;
        bArr42[18] = 51;
        bArr42[19] = 8;
        bArr42[20] = 5;
        bArr42[21] = 38;
        bArr42[22] = 82;
        bArr42[23] = 101;
        bArr42[24] = 10;
        bArr42[25] = 119;
        bArr42[26] = 1;
        bArr42[27] = -124;
        bArr42[28] = -92;
        bArr42[29] = -86;
        bArr42[30] = 55;
        bArr42[31] = 9;
        hashSet.add(new WF(bArr42));
        byte[] bArr43 = new byte[267545225 ^ 267545257];
        // fill-array-data instruction
        bArr43[0] = 95;
        bArr43[1] = 104;
        bArr43[2] = -42;
        bArr43[3] = -19;
        bArr43[4] = 114;
        bArr43[5] = 101;
        bArr43[6] = 43;
        bArr43[7] = 18;
        bArr43[8] = 81;
        bArr43[9] = -81;
        bArr43[10] = -59;
        bArr43[11] = 90;
        bArr43[12] = -81;
        bArr43[13] = 114;
        bArr43[14] = 24;
        bArr43[15] = -4;
        bArr43[16] = 120;
        bArr43[17] = -61;
        bArr43[18] = -68;
        bArr43[19] = -66;
        bArr43[20] = -93;
        bArr43[21] = -65;
        bArr43[22] = -26;
        bArr43[23] = 46;
        bArr43[24] = 39;
        bArr43[25] = -114;
        bArr43[26] = 96;
        bArr43[27] = -6;
        bArr43[28] = -65;
        bArr43[29] = -71;
        bArr43[30] = -102;
        bArr43[31] = -88;
        hashSet.add(new WF(bArr43));
        byte[] bArr44 = new byte[1750051298 ^ 1750051266];
        // fill-array-data instruction
        bArr44[0] = 40;
        bArr44[1] = -12;
        bArr44[2] = -52;
        bArr44[3] = -75;
        bArr44[4] = 88;
        bArr44[5] = -104;
        bArr44[6] = -120;
        bArr44[7] = -64;
        bArr44[8] = 46;
        bArr44[9] = -2;
        bArr44[10] = -47;
        bArr44[11] = 125;
        bArr44[12] = 102;
        bArr44[13] = 57;
        bArr44[14] = 1;
        bArr44[15] = 6;
        bArr44[16] = 106;
        bArr44[17] = -96;
        bArr44[18] = 91;
        bArr44[19] = -115;
        bArr44[20] = 88;
        bArr44[21] = 67;
        bArr44[22] = 42;
        bArr44[23] = -97;
        bArr44[24] = 126;
        bArr44[25] = 48;
        bArr44[26] = 40;
        bArr44[27] = 32;
        bArr44[28] = 112;
        bArr44[29] = -48;
        bArr44[30] = 70;
        bArr44[31] = -89;
        hashSet.add(new WF(bArr44));
        byte[] bArr45 = new byte[OY.Xd() ^ (2147423212 ^ 2077498148)];
        // fill-array-data instruction
        bArr45[0] = 16;
        bArr45[1] = -25;
        bArr45[2] = -89;
        bArr45[3] = 112;
        bArr45[4] = 102;
        bArr45[5] = -5;
        bArr45[6] = -125;
        bArr45[7] = 39;
        bArr45[8] = 58;
        bArr45[9] = -46;
        bArr45[10] = 19;
        bArr45[11] = -102;
        bArr45[12] = -100;
        bArr45[13] = -86;
        bArr45[14] = -125;
        bArr45[15] = 21;
        bArr45[16] = 61;
        bArr45[17] = -20;
        bArr45[18] = 8;
        bArr45[19] = 17;
        bArr45[20] = 24;
        bArr45[21] = 64;
        bArr45[22] = 40;
        bArr45[23] = -100;
        bArr45[24] = -99;
        bArr45[25] = 115;
        bArr45[26] = -12;
        bArr45[27] = -32;
        bArr45[28] = 79;
        bArr45[29] = -40;
        bArr45[30] = -49;
        bArr45[31] = -98;
        hashSet.add(new WF(bArr45));
        byte[] bArr46 = new byte[1882223238 ^ 1882223270];
        // fill-array-data instruction
        bArr46[0] = 96;
        bArr46[1] = -70;
        bArr46[2] = 104;
        bArr46[3] = 67;
        bArr46[4] = -40;
        bArr46[5] = -43;
        bArr46[6] = -100;
        bArr46[7] = 70;
        bArr46[8] = -48;
        bArr46[9] = 96;
        bArr46[10] = -74;
        bArr46[11] = 111;
        bArr46[12] = -63;
        bArr46[13] = 35;
        bArr46[14] = -24;
        bArr46[15] = -100;
        bArr46[16] = -122;
        bArr46[17] = 40;
        bArr46[18] = 54;
        bArr46[19] = 62;
        bArr46[20] = -37;
        bArr46[21] = -43;
        bArr46[22] = -101;
        bArr46[23] = 89;
        bArr46[24] = -46;
        bArr46[25] = -47;
        bArr46[26] = -110;
        bArr46[27] = -62;
        bArr46[28] = 52;
        bArr46[29] = -46;
        bArr46[30] = -87;
        bArr46[31] = 78;
        hashSet.add(new WF(bArr46));
        byte[] bArr47 = new byte[C1580rY.Xd() ^ (522814428 ^ (-782276579))];
        // fill-array-data instruction
        bArr47[0] = 58;
        bArr47[1] = -87;
        bArr47[2] = -71;
        bArr47[3] = -63;
        bArr47[4] = 12;
        bArr47[5] = -127;
        bArr47[6] = 89;
        bArr47[7] = -101;
        bArr47[8] = -92;
        bArr47[9] = -117;
        bArr47[10] = -39;
        bArr47[11] = -16;
        bArr47[12] = -77;
        bArr47[13] = 113;
        bArr47[14] = 50;
        bArr47[15] = -9;
        bArr47[16] = 109;
        bArr47[17] = -125;
        bArr47[18] = 68;
        bArr47[19] = -104;
        bArr47[20] = 23;
        bArr47[21] = -81;
        bArr47[22] = 96;
        bArr47[23] = 67;
        bArr47[24] = -119;
        bArr47[25] = 35;
        bArr47[26] = 25;
        bArr47[27] = -82;
        bArr47[28] = -36;
        bArr47[29] = 115;
        bArr47[30] = 5;
        bArr47[31] = 86;
        hashSet.add(new WF(bArr47));
        byte[] bArr48 = new byte[(2027654661 ^ 1108035538) ^ 986761719];
        // fill-array-data instruction
        bArr48[0] = -96;
        bArr48[1] = 127;
        bArr48[2] = -94;
        bArr48[3] = 2;
        bArr48[4] = 60;
        bArr48[5] = -10;
        bArr48[6] = 1;
        bArr48[7] = -47;
        bArr48[8] = -61;
        bArr48[9] = 28;
        bArr48[10] = 39;
        bArr48[11] = 124;
        bArr48[12] = -9;
        bArr48[13] = -96;
        bArr48[14] = -58;
        bArr48[15] = 46;
        bArr48[16] = -41;
        bArr48[17] = -73;
        bArr48[18] = -51;
        bArr48[19] = -110;
        bArr48[20] = 107;
        bArr48[21] = -72;
        bArr48[22] = 87;
        bArr48[23] = 5;
        bArr48[24] = 20;
        bArr48[25] = -10;
        bArr48[26] = 97;
        bArr48[27] = -5;
        bArr48[28] = -13;
        bArr48[29] = -118;
        bArr48[30] = 93;
        bArr48[31] = -54;
        hashSet.add(new WF(bArr48));
        byte[] bArr49 = new byte[(2145066864 ^ 1708916291) ^ 436265235];
        // fill-array-data instruction
        bArr49[0] = 7;
        bArr49[1] = 65;
        bArr49[2] = 83;
        bArr49[3] = 14;
        bArr49[4] = -36;
        bArr49[5] = 26;
        bArr49[6] = 127;
        bArr49[7] = 113;
        bArr49[8] = -79;
        bArr49[9] = 50;
        bArr49[10] = -73;
        bArr49[11] = 126;
        bArr49[12] = -21;
        bArr49[13] = 112;
        bArr49[14] = 6;
        bArr49[15] = -107;
        bArr49[16] = 6;
        bArr49[17] = -53;
        bArr49[18] = -20;
        bArr49[19] = 22;
        bArr49[20] = -36;
        bArr49[21] = -34;
        bArr49[22] = 7;
        bArr49[23] = 68;
        bArr49[24] = -48;
        bArr49[25] = -121;
        bArr49[26] = -82;
        bArr49[27] = -13;
        bArr49[28] = -15;
        bArr49[29] = 13;
        bArr49[30] = -91;
        bArr49[31] = -14;
        hashSet.add(new WF(bArr49));
        byte[] bArr50 = new byte[C1633zX.Xd() ^ (-1951491093)];
        // fill-array-data instruction
        bArr50[0] = 65;
        bArr50[1] = 10;
        bArr50[2] = -34;
        bArr50[3] = 77;
        bArr50[4] = -73;
        bArr50[5] = 89;
        bArr50[6] = 111;
        bArr50[7] = 101;
        bArr50[8] = 82;
        bArr50[9] = 80;
        bArr50[10] = 84;
        bArr50[11] = -38;
        bArr50[12] = -4;
        bArr50[13] = 47;
        bArr50[14] = -47;
        bArr50[15] = 55;
        bArr50[16] = -57;
        bArr50[17] = -85;
        bArr50[18] = -31;
        bArr50[19] = -84;
        bArr50[20] = -10;
        bArr50[21] = -111;
        bArr50[22] = 1;
        bArr50[23] = 20;
        bArr50[24] = 115;
        bArr50[25] = 78;
        bArr50[26] = -119;
        bArr50[27] = 122;
        bArr50[28] = 55;
        bArr50[29] = -35;
        bArr50[30] = -127;
        bArr50[31] = -3;
        hashSet.add(new WF(bArr50));
        byte[] bArr51 = new byte[OY.Xd() ^ (44083298 ^ 109813930)];
        // fill-array-data instruction
        bArr51[0] = 108;
        bArr51[1] = 111;
        bArr51[2] = 32;
        bArr51[3] = -78;
        bArr51[4] = 71;
        bArr51[5] = 79;
        bArr51[6] = -30;
        bArr51[7] = -17;
        bArr51[8] = 22;
        bArr51[9] = 6;
        bArr51[10] = 75;
        bArr51[11] = 62;
        bArr51[12] = 109;
        bArr51[13] = -85;
        bArr51[14] = 125;
        bArr51[15] = -43;
        bArr51[16] = 40;
        bArr51[17] = -106;
        bArr51[18] = 72;
        bArr51[19] = -103;
        bArr51[20] = -61;
        bArr51[21] = -1;
        bArr51[22] = 85;
        bArr51[23] = 6;
        bArr51[24] = 14;
        bArr51[25] = -85;
        bArr51[26] = 106;
        bArr51[27] = -119;
        bArr51[28] = -39;
        bArr51[29] = 65;
        bArr51[30] = -92;
        bArr51[31] = 46;
        hashSet.add(new WF(bArr51));
        byte[] bArr52 = new byte[C1580rY.Xd() ^ (-831067199)];
        // fill-array-data instruction
        bArr52[0] = -28;
        bArr52[1] = -5;
        bArr52[2] = 25;
        bArr52[3] = 4;
        bArr52[4] = 16;
        bArr52[5] = -51;
        bArr52[6] = 87;
        bArr52[7] = 110;
        bArr52[8] = 57;
        bArr52[9] = 32;
        bArr52[10] = -23;
        bArr52[11] = 42;
        bArr52[12] = -92;
        bArr52[13] = 118;
        bArr52[14] = 40;
        bArr52[15] = 68;
        bArr52[16] = 79;
        bArr52[17] = -58;
        bArr52[18] = 59;
        bArr52[19] = -126;
        bArr52[20] = 125;
        bArr52[21] = -58;
        bArr52[22] = -90;
        bArr52[23] = -52;
        bArr52[24] = -25;
        bArr52[25] = 116;
        bArr52[26] = -67;
        bArr52[27] = -113;
        bArr52[28] = 97;
        bArr52[29] = -35;
        bArr52[30] = 24;
        bArr52[31] = 102;
        hashSet.add(new WF(bArr52));
        byte[] bArr53 = new byte[Od.Xd() ^ 1207800949];
        // fill-array-data instruction
        bArr53[0] = -102;
        bArr53[1] = 15;
        bArr53[2] = 45;
        bArr53[3] = 27;
        bArr53[4] = -73;
        bArr53[5] = 0;
        bArr53[6] = -70;
        bArr53[7] = 55;
        bArr53[8] = 88;
        bArr53[9] = 58;
        bArr53[10] = -14;
        bArr53[11] = -19;
        bArr53[12] = 70;
        bArr53[13] = -121;
        bArr53[14] = -123;
        bArr53[15] = 86;
        bArr53[16] = 10;
        bArr53[17] = 118;
        bArr53[18] = -42;
        bArr53[19] = 114;
        bArr53[20] = 80;
        bArr53[21] = -110;
        bArr53[22] = -104;
        bArr53[23] = -7;
        bArr53[24] = 82;
        bArr53[25] = -65;
        bArr53[26] = -72;
        bArr53[27] = 109;
        bArr53[28] = 9;
        bArr53[29] = 100;
        bArr53[30] = -64;
        bArr53[31] = -64;
        hashSet.add(new WF(bArr53));
        byte[] bArr54 = new byte[(1437120226 ^ 1703750538) ^ 807771464];
        // fill-array-data instruction
        bArr54[0] = 46;
        bArr54[1] = 127;
        bArr54[2] = -83;
        bArr54[3] = -37;
        bArr54[4] = -47;
        bArr54[5] = -108;
        bArr54[6] = 84;
        bArr54[7] = 106;
        bArr54[8] = 28;
        bArr54[9] = 8;
        bArr54[10] = -2;
        bArr54[11] = -13;
        bArr54[12] = 48;
        bArr54[13] = 3;
        bArr54[14] = -4;
        bArr54[15] = -116;
        bArr54[16] = 39;
        bArr54[17] = 72;
        bArr54[18] = 110;
        bArr54[19] = 42;
        bArr54[20] = 19;
        bArr54[21] = -51;
        bArr54[22] = -21;
        bArr54[23] = -6;
        bArr54[24] = -6;
        bArr54[25] = 55;
        bArr54[26] = -39;
        bArr54[27] = -36;
        bArr54[28] = 48;
        bArr54[29] = -54;
        bArr54[30] = 51;
        bArr54[31] = 91;
        hashSet.add(new WF(bArr54));
        byte[] bArr55 = new byte[C1580rY.Xd() ^ (367790807 ^ (-610606826))];
        // fill-array-data instruction
        bArr55[0] = 81;
        bArr55[1] = -73;
        bArr55[2] = -78;
        bArr55[3] = -9;
        bArr55[4] = -90;
        bArr55[5] = -105;
        bArr55[6] = -117;
        bArr55[7] = 91;
        bArr55[8] = 35;
        bArr55[9] = -45;
        bArr55[10] = -56;
        bArr55[11] = 26;
        bArr55[12] = 93;
        bArr55[13] = -40;
        bArr55[14] = 23;
        bArr55[15] = -5;
        bArr55[16] = -77;
        bArr55[17] = -29;
        bArr55[18] = -79;
        bArr55[19] = -1;
        bArr55[20] = 46;
        bArr55[21] = -54;
        bArr55[22] = 17;
        bArr55[23] = -84;
        bArr55[24] = 118;
        bArr55[25] = -127;
        bArr55[26] = -59;
        bArr55[27] = 0;
        bArr55[28] = -126;
        bArr55[29] = 35;
        bArr55[30] = -89;
        bArr55[31] = 115;
        hashSet.add(new WF(bArr55));
        byte[] bArr56 = new byte[1700308901 ^ 1700308869];
        // fill-array-data instruction
        bArr56[0] = -65;
        bArr56[1] = -92;
        bArr56[2] = 93;
        bArr56[3] = 18;
        bArr56[4] = 65;
        bArr56[5] = -10;
        bArr56[6] = -35;
        bArr56[7] = -20;
        bArr56[8] = 61;
        bArr56[9] = -19;
        bArr56[10] = -51;
        bArr56[11] = 60;
        bArr56[12] = 89;
        bArr56[13] = 106;
        bArr56[14] = -88;
        bArr56[15] = 9;
        bArr56[16] = -106;
        bArr56[17] = 76;
        bArr56[18] = -75;
        bArr56[19] = 56;
        bArr56[20] = 20;
        bArr56[21] = -62;
        bArr56[22] = -82;
        bArr56[23] = 112;
        bArr56[24] = -65;
        bArr56[25] = -77;
        bArr56[26] = -25;
        bArr56[27] = 84;
        bArr56[28] = 87;
        bArr56[29] = 81;
        bArr56[30] = 16;
        bArr56[31] = -26;
        hashSet.add(new WF(bArr56));
        byte[] bArr57 = new byte[1505216123 ^ 1505216091];
        // fill-array-data instruction
        bArr57[0] = -111;
        bArr57[1] = -92;
        bArr57[2] = 10;
        bArr57[3] = -71;
        bArr57[4] = -96;
        bArr57[5] = 62;
        bArr57[6] = -110;
        bArr57[7] = -29;
        bArr57[8] = -52;
        bArr57[9] = -81;
        bArr57[10] = -90;
        bArr57[11] = -32;
        bArr57[12] = -120;
        bArr57[13] = -103;
        bArr57[14] = 39;
        bArr57[15] = 104;
        bArr57[16] = -46;
        bArr57[17] = 59;
        bArr57[18] = -62;
        bArr57[19] = 99;
        bArr57[20] = -112;
        bArr57[21] = 120;
        bArr57[22] = 113;
        bArr57[23] = 36;
        bArr57[24] = -112;
        bArr57[25] = -97;
        bArr57[26] = -51;
        bArr57[27] = -82;
        bArr57[28] = -9;
        bArr57[29] = 59;
        bArr57[30] = 111;
        bArr57[31] = 0;
        hashSet.add(new WF(bArr57));
        byte[] bArr58 = new byte[ZN.Xd() ^ (852455487 ^ 21319407)];
        // fill-array-data instruction
        bArr58[0] = -72;
        bArr58[1] = 38;
        bArr58[2] = 17;
        bArr58[3] = 28;
        bArr58[4] = -86;
        bArr58[5] = 111;
        bArr58[6] = -38;
        bArr58[7] = -45;
        bArr58[8] = 95;
        bArr58[9] = 21;
        bArr58[10] = 13;
        bArr58[11] = 37;
        bArr58[12] = -35;
        bArr58[13] = -106;
        bArr58[14] = 99;
        bArr58[15] = -5;
        bArr58[16] = 122;
        bArr58[17] = 57;
        bArr58[18] = -44;
        bArr58[19] = 8;
        bArr58[20] = 115;
        bArr58[21] = 42;
        bArr58[22] = -72;
        bArr58[23] = -56;
        bArr58[24] = -26;
        bArr58[25] = 106;
        bArr58[26] = 18;
        bArr58[27] = 51;
        bArr58[28] = -62;
        bArr58[29] = -30;
        bArr58[30] = -53;
        bArr58[31] = -64;
        hashSet.add(new WF(bArr58));
        byte[] bArr59 = new byte[C1580rY.Xd() ^ (1029559316 ^ (-215269419))];
        // fill-array-data instruction
        bArr59[0] = 38;
        bArr59[1] = 11;
        bArr59[2] = 77;
        bArr59[3] = -117;
        bArr59[4] = -27;
        bArr59[5] = -126;
        bArr59[6] = -5;
        bArr59[7] = 86;
        bArr59[8] = -24;
        bArr59[9] = 81;
        bArr59[10] = -73;
        bArr59[11] = 105;
        bArr59[12] = -55;
        bArr59[13] = -32;
        bArr59[14] = -5;
        bArr59[15] = -127;
        bArr59[16] = -35;
        bArr59[17] = 30;
        bArr59[18] = 79;
        bArr59[19] = 73;
        bArr59[20] = 124;
        bArr59[21] = -114;
        bArr59[22] = -9;
        bArr59[23] = 103;
        bArr59[24] = 47;
        bArr59[25] = 28;
        bArr59[26] = -43;
        bArr59[27] = -78;
        bArr59[28] = -103;
        bArr59[29] = -74;
        bArr59[30] = -66;
        bArr59[31] = 1;
        hashSet.add(new WF(bArr59));
        byte[] bArr60 = new byte[(1976205507 ^ 1731854923) ^ 317751976];
        // fill-array-data instruction
        bArr60[0] = 105;
        bArr60[1] = 42;
        bArr60[2] = 6;
        bArr60[3] = 107;
        bArr60[4] = -66;
        bArr60[5] = -6;
        bArr60[6] = -106;
        bArr60[7] = 124;
        bArr60[8] = -79;
        bArr60[9] = 48;
        bArr60[10] = -74;
        bArr60[11] = -127;
        bArr60[12] = -70;
        bArr60[13] = 61;
        bArr60[14] = -88;
        bArr60[15] = -75;
        bArr60[16] = -128;
        bArr60[17] = -94;
        bArr60[18] = -87;
        bArr60[19] = 12;
        bArr60[20] = 19;
        bArr60[21] = -2;
        bArr60[22] = -93;
        bArr60[23] = -64;
        bArr60[24] = 65;
        bArr60[25] = 111;
        bArr60[26] = -126;
        bArr60[27] = 14;
        bArr60[28] = 75;
        bArr60[29] = -10;
        bArr60[30] = 82;
        bArr60[31] = -85;
        hashSet.add(new WF(bArr60));
        byte[] bArr61 = new byte[(2122629851 ^ 988265871) ^ 1147371380];
        // fill-array-data instruction
        bArr61[0] = 34;
        bArr61[1] = -39;
        bArr61[2] = 4;
        bArr61[3] = -25;
        bArr61[4] = 41;
        bArr61[5] = -114;
        bArr61[6] = -18;
        bArr61[7] = 67;
        bArr61[8] = 39;
        bArr61[9] = 109;
        bArr61[10] = 34;
        bArr61[11] = -108;
        bArr61[12] = -59;
        bArr61[13] = -30;
        bArr61[14] = 73;
        bArr61[15] = 84;
        bArr61[16] = 87;
        bArr61[17] = -19;
        bArr61[18] = -100;
        bArr61[19] = 12;
        bArr61[20] = 119;
        bArr61[21] = 60;
        bArr61[22] = 8;
        bArr61[23] = 111;
        bArr61[24] = -122;
        bArr61[25] = -59;
        bArr61[26] = -74;
        bArr61[27] = 39;
        bArr61[28] = -10;
        bArr61[29] = -64;
        bArr61[30] = 90;
        bArr61[31] = 78;
        hashSet.add(new WF(bArr61));
        byte[] bArr62 = new byte[OY.Xd() ^ 69929160];
        // fill-array-data instruction
        bArr62[0] = -25;
        bArr62[1] = -87;
        bArr62[2] = -67;
        bArr62[3] = -11;
        bArr62[4] = -69;
        bArr62[5] = -104;
        bArr62[6] = -100;
        bArr62[7] = 48;
        bArr62[8] = -62;
        bArr62[9] = 9;
        bArr62[10] = 92;
        bArr62[11] = 108;
        bArr62[12] = -97;
        bArr62[13] = 53;
        bArr62[14] = 56;
        bArr62[15] = -116;
        bArr62[16] = -51;
        bArr62[17] = 28;
        bArr62[18] = -26;
        bArr62[19] = -15;
        bArr62[20] = -24;
        bArr62[21] = -27;
        bArr62[22] = -73;
        bArr62[23] = -93;
        bArr62[24] = -121;
        bArr62[25] = -72;
        bArr62[26] = -59;
        bArr62[27] = 34;
        bArr62[28] = 20;
        bArr62[29] = -101;
        bArr62[30] = -3;
        bArr62[31] = -86;
        hashSet.add(new WF(bArr62));
        byte[] bArr63 = new byte[C1607wl.Xd() ^ (1492794993 ^ 918433163)];
        // fill-array-data instruction
        bArr63[0] = 74;
        bArr63[1] = 9;
        bArr63[2] = 52;
        bArr63[3] = -52;
        bArr63[4] = 9;
        bArr63[5] = 2;
        bArr63[6] = 75;
        bArr63[7] = 17;
        bArr63[8] = -62;
        bArr63[9] = 25;
        bArr63[10] = -2;
        bArr63[11] = -40;
        bArr63[12] = 117;
        bArr63[13] = -124;
        bArr63[14] = 47;
        bArr63[15] = 32;
        bArr63[16] = 100;
        bArr63[17] = 26;
        bArr63[18] = -9;
        bArr63[19] = 87;
        bArr63[20] = -2;
        bArr63[21] = 19;
        bArr63[22] = -23;
        bArr63[23] = -12;
        bArr63[24] = -18;
        bArr63[25] = 60;
        bArr63[26] = -101;
        bArr63[27] = -87;
        bArr63[28] = -128;
        bArr63[29] = -11;
        bArr63[30] = 22;
        bArr63[31] = -20;
        hashSet.add(new WF(bArr63));
        byte[] bArr64 = new byte[C1633zX.Xd() ^ (768135187 ^ (-1503245320))];
        // fill-array-data instruction
        bArr64[0] = -7;
        bArr64[1] = 119;
        bArr64[2] = -29;
        bArr64[3] = -100;
        bArr64[4] = -46;
        bArr64[5] = 22;
        bArr64[6] = -4;
        bArr64[7] = 102;
        bArr64[8] = 69;
        bArr64[9] = -128;
        bArr64[10] = -5;
        bArr64[11] = 122;
        bArr64[12] = 30;
        bArr64[13] = 53;
        bArr64[14] = 30;
        bArr64[15] = 104;
        bArr64[16] = -108;
        bArr64[17] = 66;
        bArr64[18] = -13;
        bArr64[19] = 31;
        bArr64[20] = -91;
        bArr64[21] = 71;
        bArr64[22] = 29;
        bArr64[23] = 77;
        bArr64[24] = 121;
        bArr64[25] = -81;
        bArr64[26] = -39;
        bArr64[27] = -11;
        bArr64[28] = -2;
        bArr64[29] = -55;
        bArr64[30] = 36;
        bArr64[31] = 96;
        hashSet.add(new WF(bArr64));
        byte[] bArr65 = new byte[704841996 ^ 704842028];
        // fill-array-data instruction
        bArr65[0] = -96;
        bArr65[1] = 104;
        bArr65[2] = -93;
        bArr65[3] = 125;
        bArr65[4] = -25;
        bArr65[5] = 48;
        bArr65[6] = 36;
        bArr65[7] = 69;
        bArr65[8] = 116;
        bArr65[9] = -127;
        bArr65[10] = -14;
        bArr65[11] = -17;
        bArr65[12] = 49;
        bArr65[13] = -103;
        bArr65[14] = -3;
        bArr65[15] = -40;
        bArr65[16] = 44;
        bArr65[17] = -103;
        bArr65[18] = 68;
        bArr65[19] = 38;
        bArr65[20] = 37;
        bArr65[21] = 49;
        bArr65[22] = -59;
        bArr65[23] = -41;
        bArr65[24] = 23;
        bArr65[25] = -10;
        bArr65[26] = 54;
        bArr65[27] = -83;
        bArr65[28] = -70;
        bArr65[29] = 71;
        bArr65[30] = 104;
        bArr65[31] = 20;
        hashSet.add(new WF(bArr65));
        byte[] bArr66 = new byte[OY.Xd() ^ (226603404 ^ 162183492)];
        // fill-array-data instruction
        bArr66[0] = 79;
        bArr66[1] = 8;
        bArr66[2] = 123;
        bArr66[3] = -49;
        bArr66[4] = 12;
        bArr66[5] = 65;
        bArr66[6] = -62;
        bArr66[7] = 106;
        bArr66[8] = -20;
        bArr66[9] = 27;
        bArr66[10] = 118;
        bArr66[11] = -35;
        bArr66[12] = -19;
        bArr66[13] = -33;
        bArr66[14] = 71;
        bArr66[15] = 79;
        bArr66[16] = 114;
        bArr66[17] = -67;
        bArr66[18] = 44;
        bArr66[19] = 75;
        bArr66[20] = 64;
        bArr66[21] = -65;
        bArr66[22] = -119;
        bArr66[23] = -109;
        bArr66[24] = -5;
        bArr66[25] = 107;
        bArr66[26] = -118;
        bArr66[27] = 86;
        bArr66[28] = 54;
        bArr66[29] = -96;
        bArr66[30] = -103;
        bArr66[31] = -89;
        hashSet.add(new WF(bArr66));
        byte[] bArr67 = new byte[(445968817 ^ 1792220700) ^ 1883762573];
        // fill-array-data instruction
        bArr67[0] = -102;
        bArr67[1] = 83;
        bArr67[2] = 0;
        bArr67[3] = -4;
        bArr67[4] = -57;
        bArr67[5] = -12;
        bArr67[6] = -17;
        bArr67[7] = -105;
        bArr67[8] = 60;
        bArr67[9] = -127;
        bArr67[10] = 112;
        bArr67[11] = -127;
        bArr67[12] = -98;
        bArr67[13] = 101;
        bArr67[14] = -58;
        bArr67[15] = -57;
        bArr67[16] = -10;
        bArr67[17] = 67;
        bArr67[18] = 119;
        bArr67[19] = 3;
        bArr67[20] = 99;
        bArr67[21] = 19;
        bArr67[22] = 37;
        bArr67[23] = 112;
        bArr67[24] = -71;
        bArr67[25] = 77;
        bArr67[26] = -124;
        bArr67[27] = 61;
        bArr67[28] = 15;
        bArr67[29] = 76;
        bArr67[30] = -38;
        bArr67[31] = -109;
        hashSet.add(new WF(bArr67));
        byte[] bArr68 = new byte[C1580rY.Xd() ^ (-831067199)];
        // fill-array-data instruction
        bArr68[0] = -93;
        bArr68[1] = 42;
        bArr68[2] = -23;
        bArr68[3] = 88;
        bArr68[4] = 90;
        bArr68[5] = -68;
        bArr68[6] = 96;
        bArr68[7] = -5;
        bArr68[8] = 102;
        bArr68[9] = -121;
        bArr68[10] = -42;
        bArr68[11] = -18;
        bArr68[12] = 95;
        bArr68[13] = -6;
        bArr68[14] = -103;
        bArr68[15] = -120;
        bArr68[16] = 115;
        bArr68[17] = -96;
        bArr68[18] = 33;
        bArr68[19] = 125;
        bArr68[20] = 122;
        bArr68[21] = 29;
        bArr68[22] = 123;
        bArr68[23] = 86;
        bArr68[24] = 23;
        bArr68[25] = 84;
        bArr68[26] = -107;
        bArr68[27] = -80;
        bArr68[28] = 28;
        bArr68[29] = -84;
        bArr68[30] = 113;
        bArr68[31] = 2;
        hashSet.add(new WF(bArr68));
        byte[] bArr69 = new byte[OY.Xd() ^ 69929160];
        // fill-array-data instruction
        bArr69[0] = -25;
        bArr69[1] = 74;
        bArr69[2] = 94;
        bArr69[3] = 74;
        bArr69[4] = -81;
        bArr69[5] = -112;
        bArr69[6] = 104;
        bArr69[7] = 67;
        bArr69[8] = -113;
        bArr69[9] = -28;
        bArr69[10] = -113;
        bArr69[11] = 111;
        bArr69[12] = -54;
        bArr69[13] = 99;
        bArr69[14] = -46;
        bArr69[15] = 8;
        bArr69[16] = -3;
        bArr69[17] = 87;
        bArr69[18] = -92;
        bArr69[19] = 104;
        bArr69[20] = -40;
        bArr69[21] = 75;
        bArr69[22] = -4;
        bArr69[23] = -119;
        bArr69[24] = 51;
        bArr69[25] = 38;
        bArr69[26] = -118;
        bArr69[27] = 122;
        bArr69[28] = -82;
        bArr69[29] = 118;
        bArr69[30] = -90;
        bArr69[31] = -38;
        hashSet.add(new WF(bArr69));
        byte[] bArr70 = new byte[772314735 ^ 772314703];
        // fill-array-data instruction
        bArr70[0] = -33;
        bArr70[1] = -75;
        bArr70[2] = -8;
        bArr70[3] = -79;
        bArr70[4] = 93;
        bArr70[5] = 80;
        bArr70[6] = 28;
        bArr70[7] = -3;
        bArr70[8] = -71;
        bArr70[9] = -74;
        bArr70[10] = 2;
        bArr70[11] = 112;
        bArr70[12] = -13;
        bArr70[13] = 102;
        bArr70[14] = -58;
        bArr70[15] = -83;
        bArr70[16] = 46;
        bArr70[17] = 57;
        bArr70[18] = 15;
        bArr70[19] = 46;
        bArr70[20] = 122;
        bArr70[21] = 56;
        bArr70[22] = 21;
        bArr70[23] = 31;
        bArr70[24] = -127;
        bArr70[25] = -35;
        bArr70[26] = -33;
        bArr70[27] = 61;
        bArr70[28] = -125;
        bArr70[29] = 13;
        bArr70[30] = -116;
        bArr70[31] = 120;
        hashSet.add(new WF(bArr70));
        byte[] bArr71 = new byte[(791476396 ^ 1979453360) ^ 1523644220];
        // fill-array-data instruction
        bArr71[0] = 39;
        bArr71[1] = 87;
        bArr71[2] = 12;
        bArr71[3] = -86;
        bArr71[4] = -103;
        bArr71[5] = 43;
        bArr71[6] = 12;
        bArr71[7] = 31;
        bArr71[8] = 53;
        bArr71[9] = -97;
        bArr71[10] = 90;
        bArr71[11] = 60;
        bArr71[12] = 92;
        bArr71[13] = 86;
        bArr71[14] = 60;
        bArr71[15] = 115;
        bArr71[16] = 9;
        bArr71[17] = 74;
        bArr71[18] = -33;
        bArr71[19] = -12;
        bArr71[20] = 77;
        bArr71[21] = -128;
        bArr71[22] = -103;
        bArr71[23] = -1;
        bArr71[24] = 30;
        bArr71[25] = -7;
        bArr71[26] = -91;
        bArr71[27] = -121;
        bArr71[28] = 9;
        bArr71[29] = 39;
        bArr71[30] = 68;
        bArr71[31] = 24;
        hashSet.add(new WF(bArr71));
        byte[] bArr72 = new byte[C1607wl.Xd() ^ (1289266345 ^ 580695891)];
        // fill-array-data instruction
        bArr72[0] = 123;
        bArr72[1] = 21;
        bArr72[2] = 18;
        bArr72[3] = 98;
        bArr72[4] = 104;
        bArr72[5] = -83;
        bArr72[6] = 5;
        bArr72[7] = 121;
        bArr72[8] = -118;
        bArr72[9] = 40;
        bArr72[10] = 77;
        bArr72[11] = 100;
        bArr72[12] = 60;
        bArr72[13] = 37;
        bArr72[14] = -82;
        bArr72[15] = 118;
        bArr72[16] = -28;
        bArr72[17] = 92;
        bArr72[18] = -16;
        bArr72[19] = 45;
        bArr72[20] = -115;
        bArr72[21] = -21;
        bArr72[22] = 7;
        bArr72[23] = -56;
        bArr72[24] = 85;
        bArr72[25] = 70;
        bArr72[26] = -125;
        bArr72[27] = -13;
        bArr72[28] = -114;
        bArr72[29] = 78;
        bArr72[30] = 74;
        bArr72[31] = -27;
        hashSet.add(new WF(bArr72));
        byte[] bArr73 = new byte[1160315618 ^ 1160315586];
        // fill-array-data instruction
        bArr73[0] = 8;
        bArr73[1] = -115;
        bArr73[2] = 35;
        bArr73[3] = 40;
        bArr73[4] = -5;
        bArr73[5] = 31;
        bArr73[6] = -120;
        bArr73[7] = -73;
        bArr73[8] = -88;
        bArr73[9] = -47;
        bArr73[10] = 9;
        bArr73[11] = 45;
        bArr73[12] = 77;
        bArr73[13] = -90;
        bArr73[14] = -90;
        bArr73[15] = -71;
        bArr73[16] = -114;
        bArr73[17] = -6;
        bArr73[18] = -70;
        bArr73[19] = -45;
        bArr73[20] = -3;
        bArr73[21] = -115;
        bArr73[22] = 52;
        bArr73[23] = 4;
        bArr73[24] = 61;
        bArr73[25] = 72;
        bArr73[26] = -81;
        bArr73[27] = -33;
        bArr73[28] = -4;
        bArr73[29] = -77;
        bArr73[30] = 17;
        bArr73[31] = -65;
        hashSet.add(new WF(bArr73));
        return hashSet;
    }

    public static String[] jH() {
        String[] strArr = new String[(1808228714 ^ 1731786409) ^ 218077126];
        strArr[0] = Ig.wd("pAN*`.\\[x{r\\3!.\u0019\u001d\u0006\u001d\u0012Ps&\u000fH\u007f*U", (short) (C1607wl.Xd() ^ ((1368592871 ^ 1573565979) ^ 207199691)));
        short sXd = (short) (C1607wl.Xd() ^ (1726588557 ^ 1726611230));
        int[] iArr = new int["q8I!_\u001fIhg\u0006\u007fj\u001a!\\6@,}JvF".length()];
        QB qb = new QB("q8I!_\u001fIhg\u0006\u007fj\u001a!\\6@,}JvF");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        strArr[1] = new String(iArr, 0, i2);
        strArr[C1580rY.Xd() ^ (-831067165)] = C1561oA.Qd("\u0012\u0010|}\u0007}@q\u0002{C@8\u0001Ai5yt", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (688118424 ^ (-1995236839)))));
        strArr[OY.Xd() ^ (721591886 ^ 791254693)] = C1593ug.zd("<<+.92',98<.<8??18BIHP", (short) (Od.Xd() ^ ((1152368099 ^ 548769524) ^ (-1679439499))), (short) (Od.Xd() ^ ((1153776450 ^ 981111837) ^ (-2126500598))));
        strArr[(1195990931 ^ 640730169) ^ 1635359662] = C1561oA.od(";9wjopyp3enpcj-mnj^n[k", (short) (Od.Xd() ^ ((794902336 ^ 748348415) ^ (-66820240))));
        return strArr;
    }

    private static boolean kd() {
        C1561oA.yd("D7@AF=", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1203824595 ^ (-1951042142)))));
        int iMyPid = Process.myPid();
        Iterator<Integer> it = EY.Kd().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iMyPid != iIntValue) {
                StringBuilder sb = new StringBuilder();
                short sXd = (short) (FB.Xd() ^ (1180652223 ^ 1180657504));
                int[] iArr = new int["\u0019[^\\Q\u001e".length()];
                QB qb = new QB("\u0019[^\\Q\u001e");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                File[] fileArrListFiles = new File(sb.append(str).append(iIntValue).append(Xg.qd("-satm2", (short) (C1607wl.Xd() ^ ((1542227915 ^ 1149359079) ^ 527268498)), (short) (C1607wl.Xd() ^ (653108123 ^ 653108473)))).toString()).listFiles();
                short sXd2 = (short) (FB.Xd() ^ (1943104287 ^ 1943083849));
                short sXd3 = (short) (FB.Xd() ^ ((1891759185 ^ 1322451080) ^ 1041420996));
                int[] iArr2 = new int["\u0012Z=eMY".length()];
                QB qb2 = new QB("\u0012Z=eMY");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (Xg.od(file.getAbsolutePath() + ZO.xd("Ua=l\u0011\u00168", (short) (Od.Xd() ^ ((114764279 ^ 1669428637) ^ (-1700159542))), (short) (Od.Xd() ^ ((1688579729 ^ 313881988) ^ (-1980807990))))).split(C1626yg.Ud("r", (short) (C1633zX.Xd() ^ (1024968458 ^ (-1024968385))), (short) (C1633zX.Xd() ^ ((566741567 ^ 218473456) ^ (-750937941)))))[0].contains(str2)) {
                            return true;
                        }
                    }
                }
                StringBuilder sbAppend = new StringBuilder().append(str).append(iIntValue);
                short sXd4 = (short) (C1580rY.Xd() ^ ((1711308084 ^ 766794707) ^ (-1270108234)));
                int[] iArr3 = new int["&\b\u0004_8w%$".length()];
                QB qb3 = new QB("&\b\u0004_8w%$");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                    i4++;
                }
                if (Xg.od(sbAppend.append(new String(iArr3, 0, i4)).toString()).contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean oX(C1637zo c1637zo) {
        return xd(c1637zo) || uX(c1637zo) || KX(c1637zo) || pX(c1637zo) || Zd(c1637zo) || Ud(c1637zo);
    }

    public static void od() throws Throwable {
        Method declaredMethod;
        Object obj;
        Object obj2;
        Object obj3;
        if (hg.Qd()) {
            return;
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance(C1593ug.zd("oe_LRVX", (short) (C1499aX.Xd() ^ ((438339231 ^ 344134715) ^ (-245608937))), (short) (C1499aX.Xd() ^ ((1766206137 ^ 2043003817) ^ (-277064943)))));
        } catch (Exception e2) {
        }
        boolean zBX = false;
        C1637zo c1637zo = new C1637zo();
        try {
            HashSet hashSet = new HashSet();
            C1608wo[] c1608woArr = new C1608wo[(342744412 ^ 933304015) ^ 600624027];
            c1608woArr[0] = new C1608wo(C1561oA.od("c',%%\u0015\u001c", (short) (C1499aX.Xd() ^ (1792604420 ^ (-1792592686)))));
            c1608woArr[1] = new C1608wo(C1561oA.Kd("\u0011V]XZLU\u0018K[\\", (short) (C1499aX.Xd() ^ (156395526 ^ (-156383764)))), true);
            short sXd = (short) (ZN.Xd() ^ ((1628092560 ^ 1644943361) ^ 50401795));
            short sXd2 = (short) (ZN.Xd() ^ (1533800308 ^ 1533777734));
            int[] iArr = new int["3>\r\u001dV].6\u0003HI!".length()];
            QB qb = new QB("3>\r\u001dV].6\u0003HI!");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            c1608woArr[(1210277702 ^ 240137552) ^ 1181968916] = new C1608wo(new String(iArr, 0, i2));
            short sXd3 = (short) (FB.Xd() ^ ((244169894 ^ 43740533) ^ 202816953));
            int[] iArr2 = new int["\u000fT[VXJS\u0016`KSY".length()];
            QB qb2 = new QB("\u000fT[VXJS\u0016`KSY");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                i3++;
            }
            c1608woArr[(288222333 ^ 1250431791) ^ 1537605457] = new C1608wo(new String(iArr2, 0, i3));
            c1608woArr[(1049843232 ^ 1406755125) ^ 1833580305] = new C1608wo(Wg.vd("Y\u001d\"\u001b#\u0013\u001aZ\u0019\u0007\u000f\u0004\u0016\u0018S\u0006$(", (short) (C1633zX.Xd() ^ ((581623210 ^ 1245052174) ^ (-1755276293)))));
            c1608woArr[(1592119925 ^ 1018373949) ^ 1649866061] = new C1608wo(Qg.kd("o3811!(h%!\u0019", (short) (C1607wl.Xd() ^ ((1363406999 ^ 297005753) ^ 1089491539)), (short) (C1607wl.Xd() ^ ((1477207393 ^ 1072594928) ^ 1742870917))));
            c1608woArr[(1909701838 ^ 290645228) ^ 1619089444] = new C1608wo(hg.Vd("3v{ttdk,hd\\/,", (short) (Od.Xd() ^ (694879338 ^ (-694879590))), (short) (Od.Xd() ^ ((690120574 ^ 1896675230) ^ (-1479467139)))));
            c1608woArr[391184797 ^ 391184794] = new C1608wo(C1561oA.ud("U\u0019\u001e\u0017\u0017\u0007\u000eN\u0014\u0011\u000f", (short) (C1607wl.Xd() ^ ((432466742 ^ 2128980879) ^ 1730352552))), true);
            for (C1608wo c1608wo : c1608woArr) {
                Class<?> cls = Class.forName(C1561oA.yd("\u000by=\tN", (short) (C1499aX.Xd() ^ (1719589405 ^ (-1719573569)))));
                Class<?>[] clsArr = new Class[(1937285791 ^ 1712363020) ^ 359150743];
                clsArr[0] = Class.forName(C1561oA.Yd("1)?+x?21DB:FL\u0002\";JK:A@ FEDSU", (short) (C1633zX.Xd() ^ ((829826895 ^ 139283021) ^ (-960179991)))));
                clsArr[1] = Class.forName(Xg.qd("'\u001f5!n77-1s\f6>70>.B8??", (short) (FB.Xd() ^ (19028629 ^ 19016665)), (short) (FB.Xd() ^ (437716941 ^ 437719671))));
                clsArr[1719502300 ^ 1719502302] = Class.forName(Jg.Wd("W\u001147R*IF(y\"U6=D\u0011<", (short) (OY.Xd() ^ (373940235 ^ 373939046)), (short) (OY.Xd() ^ ((238224298 ^ 172570643) ^ 75118826))));
                int i4 = (731518225 ^ 419465459) ^ 848993761;
                short sXd4 = (short) (ZN.Xd() ^ ((1513074494 ^ 2100416215) ^ 656288676));
                short sXd5 = (short) (ZN.Xd() ^ (1974525658 ^ 1974501990));
                int[] iArr3 = new int["\"q\\]Q".length()];
                QB qb3 = new QB("\"q\\]Q");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd5) + sXd4)));
                    i5++;
                }
                clsArr[i4] = Class.forName(new String(iArr3, 0, i5));
                Object[] objArr = new Object[(305057593 ^ 1968782213) ^ 1735914680];
                objArr[0] = messageDigest;
                objArr[1] = c1608wo;
                objArr[(1978578482 ^ 1106396509) ^ 874312557] = hashSet;
                objArr[(676228770 ^ 1293462039) ^ 1700185270] = c1637zo;
                Method declaredMethod2 = cls.getDeclaredMethod(C1626yg.Ud("\u0002h", (short) (Od.Xd() ^ (767574801 ^ (-767569814))), (short) (Od.Xd() ^ ((1938257249 ^ 1476867154) ^ (-729830827)))), clsArr);
                try {
                    declaredMethod2.setAccessible(true);
                    if (((Boolean) declaredMethod2.invoke(null, objArr)).booleanValue()) {
                        zBX = true;
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            boolean z2 = false;
            String strWd = Ig.wd("j\u0012Jq\u000b", (short) (ZN.Xd() ^ (1386520044 ^ 1386513331)));
            short sXd6 = (short) (C1607wl.Xd() ^ (288938907 ^ 288935320));
            int[] iArr4 = new int["(j".length()];
            QB qb4 = new QB("(j");
            int i6 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i6] = xuXd4.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i6)) + xuXd4.CK(iKK4));
                i6++;
            }
            String str = new String(iArr4, 0, i6);
            try {
                Class<?> cls2 = Class.forName(strWd);
                Field field = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            for (String str2 : (String[]) obj) {
                if (new File(str2).exists()) {
                    messageDigest.reset();
                    String strQd = C1561oA.Qd("|i/x@", (short) (OY.Xd() ^ ((197177910 ^ 1988171545) ^ 2101469602)));
                    String strZd = C1593ug.zd("8N", (short) (ZN.Xd() ^ ((267611305 ^ 517507592) ^ 288082587)), (short) (ZN.Xd() ^ (1227139313 ^ 1227156990)));
                    try {
                        Class<?> cls3 = Class.forName(strQd);
                        Field field2 = 0 != 0 ? cls3.getField(strZd) : cls3.getDeclaredField(strZd);
                        field2.setAccessible(true);
                        obj2 = field2.get(null);
                    } catch (Throwable th2) {
                        obj2 = null;
                    }
                    messageDigest.update((byte[]) obj2);
                    messageDigest.update(str2.getBytes());
                    WF wf = new WF(messageDigest.digest());
                    if (hashSet.add(wf)) {
                        String strOd = C1561oA.od("\u0001m3|D", (short) (C1499aX.Xd() ^ (191282446 ^ (-191294406))));
                        short sXd7 = (short) (Od.Xd() ^ ((1961555081 ^ 905978237) ^ (-1122671990)));
                        int[] iArr5 = new int["]I".length()];
                        QB qb5 = new QB("]I");
                        int i7 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i7] = xuXd5.fK(xuXd5.CK(iKK5) - ((sXd7 + sXd7) + i7));
                            i7++;
                        }
                        String str3 = new String(iArr5, 0, i7);
                        try {
                            Class<?> cls4 = Class.forName(strOd);
                            Field field3 = 0 != 0 ? cls4.getField(str3) : cls4.getDeclaredField(str3);
                            field3.setAccessible(true);
                            obj3 = field3.get(null);
                        } catch (Throwable th3) {
                            obj3 = null;
                        }
                        if (((Set) obj3).contains(wf)) {
                            z2 = true;
                            c1637zo.SY(str2);
                        }
                    }
                }
            }
            if (z2) {
                zBX = true;
            }
            if (!zBX) {
                zBX = Wd(c1637zo);
            }
            if (!zBX) {
                zBX = oX(c1637zo);
            }
            if (!zBX) {
                zBX = YX(c1637zo);
            }
            if (!zBX) {
                zBX = BX(c1637zo);
            }
        } catch (Exception e4) {
        }
        if (!zBX || new boolean[]{false}[0]) {
            short sXd8 = (short) (FB.Xd() ^ ((1984498306 ^ 651704020) ^ 1351702597));
            short sXd9 = (short) (FB.Xd() ^ (409428450 ^ 409408356));
            int[] iArr6 = new int["0*Y<a".length()];
            QB qb6 = new QB("0*Y<a");
            int i8 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i8] = xuXd6.fK(xuXd6.CK(iKK6) - ((i8 * sXd9) ^ sXd8));
                i8++;
            }
            String str4 = new String(iArr6, 0, i8);
            String strXd = ZO.xd("a\u0015", (short) (ZN.Xd() ^ (828781696 ^ 828770802)), (short) (ZN.Xd() ^ ((602939508 ^ 248912335) ^ 757472495)));
            try {
                Class<?> cls5 = Class.forName(str4);
                boolean z3 = false;
                try {
                    declaredMethod = cls5.getDeclaredMethod(strXd, new Class[0]);
                } catch (NoSuchMethodException e5) {
                    z3 = true;
                    declaredMethod = cls5.getDeclaredMethod(strXd, Class.forName(C1626yg.Ud("Il0\u007f(\u0018.HRBdoZ@\u0018`\u001a]PuNRe", (short) (C1580rY.Xd() ^ ((1921272856 ^ 1700125033) ^ (-399631569))), (short) (C1580rY.Xd() ^ (1923191652 ^ (-1923191061))))));
                }
                if (!z3) {
                    declaredMethod.invoke(null, new Object[0]);
                    return;
                }
                Object[] objArr2 = new Object[1];
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(Ig.wd("\u0016N#\u001ev", (short) (FB.Xd() ^ (2118329990 ^ 2118337072)))).getDeclaredMethod(EO.Od("\u0019W", (short) (Od.Xd() ^ ((1880050033 ^ 921947167) ^ (-1190973607)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    objArr2[0] = (Context) declaredMethod3.invoke(null, objArr3);
                    declaredMethod.invoke(null, objArr2);
                    return;
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (InvocationTargetException e7) {
                C1597vN.Xd(e7.getTargetException());
                return;
            } catch (Exception e8) {
                return;
            }
        }
        Class<?> cls6 = Class.forName(Wg.Zd("4\u001a\u0015\u000e\u001d", (short) (OY.Xd() ^ (1171009053 ^ 1171024478)), (short) (OY.Xd() ^ ((1128698911 ^ 956843257) ^ 2051980767))));
        Class<?>[] clsArr2 = new Class[(964350945 ^ 994833853) ^ 36775512];
        clsArr2[0] = Integer.TYPE;
        clsArr2[1] = Integer.TYPE;
        clsArr2[(436034082 ^ 250273464) ^ 387417240] = Integer.TYPE;
        clsArr2[1194673219 ^ 1194673216] = Class.forName(C1561oA.Xd(">-t\u001f-", (short) (C1499aX.Xd() ^ ((54050150 ^ 701595512) ^ (-719968326)))));
        Object[] objArr4 = new Object[937059805 ^ 937059801];
        objArr4[0] = Integer.valueOf((557965982 ^ 1161997397) ^ 1677938382);
        objArr4[1] = Integer.valueOf(202478305 ^ 202622603);
        objArr4[(518997651 ^ 4440774) ^ 514622551] = 1;
        objArr4[(459552040 ^ 860087245) ^ 673699558] = c1637zo;
        short sXd10 = (short) (FB.Xd() ^ (712572160 ^ 712548520));
        int[] iArr7 = new int["Td".length()];
        QB qb7 = new QB("Td");
        int i9 = 0;
        while (qb7.YK()) {
            int iKK7 = qb7.KK();
            Xu xuXd7 = Xu.Xd(iKK7);
            iArr7[i9] = xuXd7.fK((sXd10 ^ i9) + xuXd7.CK(iKK7));
            i9++;
        }
        Method declaredMethod4 = cls6.getDeclaredMethod(new String(iArr7, 0, i9), clsArr2);
        try {
            declaredMethod4.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod4.invoke(null, objArr4)).booleanValue();
            String strKd = Qg.kd("!,)h\u001e\u001a. ,\u001e\u0019!\u0016\u0012]\u0013\u000f#\u0015!\u0013\u000e\u0016\u000b\u0007\u0006\u0014\u0013O\u0015\u0012\b\u0005\u0004\u0001\rZ\u000b\u0010w\u0004BZ\br\u0003s`rmn~rwu", (short) (Od.Xd() ^ (51281159 ^ (-51262043))), (short) (Od.Xd() ^ (996442923 ^ (-996449556))));
            String strVd = hg.Vd("66F812\u001e:9=-+", (short) (Od.Xd() ^ ((1613763967 ^ 1180783953) ^ (-642846600))), (short) (Od.Xd() ^ ((1167045593 ^ 1491568383) ^ (-493379025))));
            Class<?> cls7 = Class.forName(C1561oA.ud("YF\fD'", (short) (FB.Xd() ^ ((711503709 ^ 525159518) ^ 891660153))));
            Class<?>[] clsArr3 = new Class[(26347348 ^ 1797311989) ^ 1790102178];
            short sXd11 = (short) (C1607wl.Xd() ^ ((1843894146 ^ 922083853) ^ 1527927800));
            int[] iArr8 = new int["\u0004y\u0012{C\u0001x\u0005x>f\u0007\u007fu}u".length()];
            QB qb8 = new QB("\u0004y\u0012{C\u0001x\u0005x>f\u0007\u007fu}u");
            int i10 = 0;
            while (qb8.YK()) {
                int iKK8 = qb8.KK();
                Xu xuXd8 = Xu.Xd(iKK8);
                iArr8[i10] = xuXd8.fK(xuXd8.CK(iKK8) - (sXd11 ^ i10));
                i10++;
            }
            clsArr3[0] = Class.forName(new String(iArr8, 0, i10));
            short sXd12 = (short) (Od.Xd() ^ (1260237369 ^ (-1260243003)));
            int[] iArr9 = new int["PH^J\u0018WM[U\u001dCed\\b\\".length()];
            QB qb9 = new QB("PH^J\u0018WM[U\u001dCed\\b\\");
            int i11 = 0;
            while (qb9.YK()) {
                int iKK9 = qb9.KK();
                Xu xuXd9 = Xu.Xd(iKK9);
                iArr9[i11] = xuXd9.fK(xuXd9.CK(iKK9) - (((sXd12 + sXd12) + sXd12) + i11));
                i11++;
            }
            clsArr3[1] = Class.forName(new String(iArr9, 0, i11));
            clsArr3[(1955864195 ^ 1019837253) ^ 1214080452] = Boolean.TYPE;
            Object[] objArr5 = new Object[(1236707424 ^ 1741500845) ^ 779852238];
            objArr5[0] = strKd;
            objArr5[1] = strVd;
            objArr5[(1974875132 ^ 1907560137) ^ 67452215] = Boolean.valueOf(zBooleanValue);
            Method declaredMethod5 = cls7.getDeclaredMethod(Xg.qd("\u0004\u001a", (short) (Od.Xd() ^ ((260635355 ^ 2043381799) ^ (-1984111005))), (short) (Od.Xd() ^ ((1356994865 ^ 1401058565) ^ (-56625047)))), clsArr3);
            try {
                declaredMethod5.setAccessible(true);
                declaredMethod5.invoke(null, objArr5);
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        } catch (InvocationTargetException e10) {
            throw e10.getCause();
        }
    }

    private static boolean pX(C1637zo c1637zo) {
        try {
            return NX(c1637zo, EY.Yd());
        } catch (IOException e2) {
            return false;
        }
    }

    public static String[] qH() {
        String[] strArr = new String[C1607wl.Xd() ^ 1849955273];
        strArr[0] = C1561oA.yd(" cU[c#jk", (short) (C1607wl.Xd() ^ ((1998559055 ^ 142171397) ^ 2137432937)));
        strArr[1] = C1561oA.Yd("t:*28y?B>4BDG\u00026>D\u0006KNJ@NPS>ITAKIWK", (short) (OY.Xd() ^ (72070115 ^ 72087579)));
        int iXd = Od.Xd() ^ (-1207817930);
        strArr[(587800487 ^ 1472587064) ^ 1959590557] = Xg.qd("\u001dbe T\\b$il", (short) (C1633zX.Xd() ^ (2000597816 ^ (-2000590830))), (short) (C1633zX.Xd() ^ iXd));
        int iXd2 = C1580rY.Xd() ^ 831073066;
        strArr[ZN.Xd() ^ (1908999833 ^ 1111701610)] = Jg.Wd("p\u0016T\u007f*;|k]x)^Hyt", (short) (C1580rY.Xd() ^ ((730902494 ^ 2015659381) ^ (-1404317103))), (short) (C1580rY.Xd() ^ iXd2));
        strArr[C1499aX.Xd() ^ (1110174277 ^ (-28347731))] = ZO.xd("[03F41G5{hF}*n", (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1839171969 ^ 846265982))), (short) (C1607wl.Xd() ^ (2113407062 ^ 2113419774)));
        int iXd3 = C1633zX.Xd() ^ (-1951481041);
        strArr[FB.Xd() ^ (1184950945 ^ 424641943)] = C1626yg.Ud("2W\u0002&C(TE\u0017j\u0003]IRIY", (short) (FB.Xd() ^ ((716781990 ^ 1647070464) ^ 1217740768)), (short) (FB.Xd() ^ iXd3));
        strArr[1512245873 ^ 1512245879] = Ig.wd("xe[<b.H($}~#7v(G5<'\u000f", (short) (C1499aX.Xd() ^ (1950154773 ^ (-1950166323))));
        strArr[1410138690 ^ 1410138693] = EO.Od("t~T4o\u001e8;4\u007f\u0003gS\u00190\u0018=#{F\b", (short) (ZN.Xd() ^ (107087534 ^ 107098838)));
        strArr[294808137 ^ 294808129] = C1561oA.Qd("J\u000e\u0013\f\f{\u0003C\ftz~>\u0002\u0003|zvrk\u0001", (short) (C1499aX.Xd() ^ (451310984 ^ (-451303032))));
        strArr[C1633zX.Xd() ^ (-1951491134)] = C1593ug.zd("F\f\u0013\u000e\u0010\u0002\u000bM\u0002\n\u0010Q\u0005\u0015\u0016\u0006\u0018\u001b\u0019\u000e\u0011 !aa\u0010!%\u001d\u001c\u001f%\u0019%", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69952360)), (short) (C1607wl.Xd() ^ ((1438801055 ^ 1590239580) ^ 185270768)));
        strArr[(16534049 ^ 224206518) ^ 228676765] = C1561oA.od("j.3,,\u001c#c\u0016\u001c _\u0011\u001f\u001e\f\u001c\u001d\u0019\f\r\u001a\u0019ZW\u0002\u0011\u0013\t\u0006\u0007\u000b|\u0007", (short) (C1580rY.Xd() ^ ((1551282397 ^ 882755105) ^ (-1760236759))));
        strArr[(1718269033 ^ 1277176972) ^ 709531886] = C1561oA.Kd("u;B=?1:|19?\u00014DE5GJH=@OP=HNJV", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609508611)));
        strArr[1341742932 ^ 1341742936] = Wg.Zd("p\u0014fo=\r5C\td2])\u0004E)J\u0004*jBQh\u0018Z#8\u00121\nZe", (short) (C1633zX.Xd() ^ ((1442942236 ^ 39195369) ^ (-1415030999))), (short) (C1633zX.Xd() ^ ((1793551487 ^ 1202426735) ^ (-760020296))));
        int i2 = (1323955176 ^ 2036405911) ^ 931718514;
        strArr[i2] = C1561oA.Xd("\u001ecjegYb%\\l\\)djfr-d0;<Wzvlz\\_Omr{~~", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1728491648 ^ (-1452259655)))));
        strArr[(364798293 ^ 1130858635) ^ 1457121744] = Wg.vd("T\u0012\u0005\n\u000b\u0014\u000b", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609508275)));
        int iXd4 = OY.Xd() ^ (-69952947);
        short sXd = (short) (C1499aX.Xd() ^ (89244123 ^ (-89253956)));
        short sXd2 = (short) (C1499aX.Xd() ^ iXd4);
        int[] iArr = new int["c'\u0015\u001b\u001f^\u001c\u000f\u0014\u0015\u001e\u0015\u0019\u0017\u0013\u000f\b\u001d".length()];
        QB qb = new QB("c'\u0015\u001b\u001f^\u001c\u000f\u0014\u0015\u001e\u0015\u0019\u0017\u0013\u000f\b\u001d");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        strArr[C1499aX.Xd() ^ (1759666108 ^ (-729364641))] = new String(iArr, 0, i3);
        strArr[1202296543 ^ 1202296527] = hg.Vd(">\u0002qol|m7Ku|roqbd.k^cdmdWgWiW[WU\u001eX[T", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134245481)), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1946986018 ^ 932702366))));
        strArr[C1499aX.Xd() ^ (1978966622 ^ (-913294685))] = C1561oA.ud("?||\u0002;~nliyj4Hryoln_a+k[m[_[YSUa`d\u001dWZS", (short) (Od.Xd() ^ ((1789522559 ^ 1151803454) ^ (-772721904))));
        strArr[(416944230 ^ 260870273) ^ 391545077] = C1561oA.yd("\u000bPWRL>G\n59:F>~6\u0002\u0005\u0006z<)03>/r9/", (short) (Od.Xd() ^ ((992564854 ^ 1528120201) ^ (-1614557546))));
        return strArr;
    }

    private static boolean uX(C1637zo c1637zo) throws Throwable {
        String strYd = C1561oA.Yd("u;B=y2@|B5=;AIM\u0005CG:>", (short) (C1499aX.Xd() ^ ((1592854338 ^ 904243415) ^ (-1796522078))));
        File file = new File(strYd);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        Class<?> cls = Class.forName(Xg.qd("#\u0012Y\u0018\u001a", (short) (Od.Xd() ^ (526426337 ^ (-526443910))), (short) (Od.Xd() ^ (1351486416 ^ (-1351506025)))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134253992));
        short sXd2 = (short) (C1633zX.Xd() ^ (908067967 ^ (-908098731)));
        int[] iArr = new int["$a \u0012\bc\"VXH\u0007p\u0016\u00188Z".length()];
        QB qb = new QB("$a \u0012\bc\"VXH\u0007p\u0016\u00188Z");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strYd};
        Method declaredMethod = cls.getDeclaredMethod(ZO.xd("qx", (short) (C1580rY.Xd() ^ (1755249796 ^ (-1755235365))), (short) (C1580rY.Xd() ^ (190187556 ^ (-190197874)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            if (zBooleanValue) {
                c1637zo.SY(strYd);
            }
            return zBooleanValue;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static byte[] xH() {
        byte[] bArr = new byte[C1499aX.Xd() ^ (-1134257948)];
        // fill-array-data instruction
        bArr[0] = -81;
        bArr[1] = -41;
        bArr[2] = -35;
        bArr[3] = -69;
        bArr[4] = -1;
        bArr[5] = -33;
        bArr[6] = -51;
        bArr[7] = -109;
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean xd(yg.C1637zo r18) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.C1610xA.xd(yg.zo):boolean");
    }

    public static String[] zH() {
        String[] strArr = new String[OY.Xd() ^ 69929189];
        int iXd = OY.Xd() ^ (209658937 ^ (-139727595));
        strArr[0] = Qg.kd("3ggcuf]o]h^bkb%omZ[d[\u001e\u001dZ[YS]WY\u0014XSFM", (short) (C1633zX.Xd() ^ (1243054537 ^ (-1243067875))), (short) (C1633zX.Xd() ^ iXd));
        strArr[1] = hg.Vd("\u0002662D5,>,7-1:1s><)*3*lk64!\"+\"c(#\u0016\u001d", (short) (ZN.Xd() ^ (628859572 ^ 628867907)), (short) (ZN.Xd() ^ (1132375453 ^ 1132390943)));
        short sXd = (short) (Od.Xd() ^ ((1487642095 ^ 778856211) ^ (-1992811154)));
        int[] iArr = new int["~33/A2);)4*.7.p;9&'0'i#'!+\u0015\"#!\u001b%\u001f!".length()];
        QB qb = new QB("~33/A2);)4*.7.p;9&'0'i#'!+\u0015\"#!\u001b%\u001f!");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        strArr[C1499aX.Xd() ^ (1801925275 ^ (-687625611))] = new String(iArr, 0, i2);
        strArr[553306482 ^ 553306481] = C1561oA.yd(";ook\u0006vm\u007fu\u0001vz\f\u0003E\u0010\u0016\u0003\u0004\r\fNM\u0001\u0015YVO\u001c\u0017\n\u0011", (short) (FB.Xd() ^ ((1024211891 ^ 301827512) ^ 754037499)));
        int i3 = 846376249 ^ 846376253;
        strArr[i3] = C1561oA.Yd("h\u001f!\u001f3&\u001f3#0(.92v284@,;>>:FBF", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (360579955 ^ (-1384363422)))));
        strArr[C1499aX.Xd() ^ (-1134257943)] = Xg.qd("\u001bQSQeXQeUbZ`kd)*_m43.tqfo", (short) (C1633zX.Xd() ^ (946576033 ^ (-946590804))), (short) (C1633zX.Xd() ^ (1020538149 ^ (-1020530612))));
        int iXd2 = C1607wl.Xd() ^ (-1849950741);
        short sXd2 = (short) (Od.Xd() ^ ((1103503712 ^ 554541622) ^ (-1623979297)));
        short sXd3 = (short) (Od.Xd() ^ iXd2);
        int[] iArr2 = new int["GmO>2\u0016uj\u000bw`N9\"G8\u0016\u00057\u0018\u00054\u0011u\u001f".length()];
        QB qb2 = new QB("GmO>2\u0016uj\u000bw`N9\"G8\u0016\u00057\u0018\u00054\u0011u\u001f");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd3) ^ sXd2));
            i4++;
        }
        strArr[C1499aX.Xd() ^ (1879246557 ^ (-865624521))] = new String(iArr2, 0, i4);
        strArr[C1607wl.Xd() ^ (1953261281 ^ 438859068)] = ZO.xd("\u0014Wo\u0001mVF*:\u0018.H\u0001'\u007f\u0016R?nF\u0007~\b>]\f,*d^\t/Ki\f+", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (799384285 ^ 1542771347))), (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (432732620 ^ (-2005840555)))));
        strArr[191598828 ^ 191598820] = C1626yg.Ud("P|qxo\u0003w\u0001\u001b|UHc6C\u001fY\bH\u0016\"ozM\u0002\u001bU8(\bL\bZ", (short) (OY.Xd() ^ (1897404032 ^ 1897418596)), (short) (OY.Xd() ^ ((898214122 ^ 1092324373) ^ 1955750442)));
        strArr[(1767564833 ^ 1371380000) ^ 954695432] = Ig.wd("\u000b\u001ahU\u0016\u0015,9\rZTu{\u000fQ:}1\u0005|F", (short) (C1580rY.Xd() ^ ((1852735530 ^ 968617943) ^ (-1473594123))));
        strArr[FB.Xd() ^ 1609527097] = EO.Od("?CT\u0004^f7 P|pT3P\u00102H{O+r", (short) (ZN.Xd() ^ (OY.Xd() ^ (1927696751 ^ 1993177295))));
        strArr[(592907100 ^ 374615603) ^ 889398628] = C1561oA.Qd("O\u0004\u0004\u0014K\u0016\u0014\u0001\u0002\u000b\u0002Dw\u0004@\u0005\u007fry", (short) (Od.Xd() ^ ((1110921870 ^ 1094604477) ^ (-50941471))));
        strArr[467070920 ^ 467070916] = C1593ug.zd("P\u0007\t\u0007\u001b\u000e\u0007\u001b\u000b\u0018\u0010\u0016!\u001a^^\u001f\u0014\u001b\u001e)\"f,)\u001e'\"2", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849960913)), (short) (ZN.Xd() ^ ((1681180030 ^ 699120843) ^ 1302271549)));
        return strArr;
    }

    private static boolean zd(MessageDigest messageDigest, Enumeration<String> enumeration, HashSet<WF> hashSet, C1637zo c1637zo) {
        Object obj;
        Object obj2;
        boolean z2 = false;
        while (enumeration.hasMoreElements()) {
            String strNextElement = enumeration.nextElement();
            messageDigest.reset();
            String strQd = Xg.qd("kZ\"m7", (short) (C1633zX.Xd() ^ ((1625582493 ^ 422482614) ^ (-2043317010))), (short) (C1633zX.Xd() ^ (390336965 ^ (-390364737))));
            String strWd = Jg.Wd("0\u0018", (short) (C1633zX.Xd() ^ (1341133504 ^ (-1341154997))), (short) (C1633zX.Xd() ^ (311786884 ^ (-311760009))));
            try {
                Class<?> cls = Class.forName(strQd);
                Field field = 0 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            messageDigest.update((byte[]) obj);
            messageDigest.update(strNextElement.getBytes());
            WF wf = new WF(messageDigest.digest());
            if (hashSet.add(wf)) {
                String strXd = ZO.xd("9=Q{;", (short) (C1499aX.Xd() ^ ((1079716655 ^ 1338134766) ^ (-261707771))), (short) (C1499aX.Xd() ^ ((1408470048 ^ 422714610) ^ (-1254200380))));
                String strUd = C1626yg.Ud("NY", (short) (OY.Xd() ^ (1609648235 ^ 1609651755)), (short) (OY.Xd() ^ (940793721 ^ 940796807)));
                try {
                    Class<?> cls2 = Class.forName(strXd);
                    Field field2 = 0 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (((Set) obj2).contains(wf)) {
                    z2 = true;
                    c1637zo.SY(strNextElement);
                }
            }
        }
        return z2;
    }
}
