package yg;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class dQ {
    public static String[] Xd = null;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Qd("\u001f\fQ\u0007r", (short) (FB.Xd() ^ (639777371 ^ 639762950)))).getDeclaredMethod(C1593ug.zd("X[", (short) (OY.Xd() ^ ((1633939784 ^ 115865430) ^ 1736714557)), (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134236806)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String[] strArr = (String[]) declaredMethod.invoke(null, objArr);
            String strOd = C1561oA.od("jW\u001dR>", (short) (C1633zX.Xd() ^ (785931372 ^ (-785915984))));
            String strKd = C1561oA.Kd("FS", (short) (C1633zX.Xd() ^ ((2083192833 ^ 227710993) ^ (-1907992475))));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
                field.setAccessible(true);
                field.set(null, strArr);
            } catch (Throwable th) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String[] FH() {
        return new String[]{Wg.Zd("\u0016]</e=O\u0002XV1\u007f8\t/5+If\u001ayr-,{(>p\u001ah\u001frP\u0018\u0016B7'`7k[e\u001b>g\u0017_@Lt[[\n~0`IQ}QM\u0003\u0007", (short) (FB.Xd() ^ (526608465 ^ 526609710)), (short) (FB.Xd() ^ (OY.Xd() ^ 69928532)))};
    }

    public static String Kd() {
        short sXd = (short) (OY.Xd() ^ (1729735127 ^ 1729726521));
        int[] iArr = new int["\u001d\u000b".length()];
        QB qb = new QB("\u001d\u000b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static void Qd() throws Exception {
        XN.Kd = 0;
        CX.ud();
        int i2 = JN.Xd;
        while (C1593ug.Ud(Integer.lowestOneBit(C1620yF.Xd)) && Xg.Kd.length() < 0) {
            Xg.ud(i2);
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Xd("^M\u0015L:", (short) (ZN.Xd() ^ (OY.Xd() ^ 69936216)))).getDeclaredMethod(Wg.vd("_j", (short) (OY.Xd() ^ (1753416322 ^ 1753420886))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            if (Wg.oX(IK.Yd)) {
                C1589uF.Xd = "";
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Qg.kd("\fx>s_", (short) (C1499aX.Xd() ^ ((1908395991 ^ 351756052) ^ (-1699272693))), (short) (C1499aX.Xd() ^ (285451905 ^ (-285469198))))).getDeclaredMethod(hg.Vd("\u0002\u001a", (short) (C1607wl.Xd() ^ (1606380580 ^ 1606374532)), (short) (C1607wl.Xd() ^ ((612619900 ^ 1656410497) ^ 1178151130))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                if (Ig.uX(C1523gX.Kd)) {
                    Wg.kd(C1598vY.Kd);
                }
                Object[] objArr3 = new Object[0];
                Constructor<?> constructor = Class.forName(C1561oA.ud("wm\u0002k7{lizvlvz.Rc`qm_KYeZda", (short) (ZN.Xd() ^ ((1564510816 ^ 184900620) ^ 1447427540)))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    int iNextInt = ((SecureRandom) constructor.newInstance(objArr3)).nextInt((222971015 ^ 2137831679) ^ 232326023);
                    Kp kp = new Kp(iNextInt, str, str2);
                    int i3 = ((iNextInt ^ ((1610684836 ^ 1494958287) ^ 956102177)) << 7) ^ 65;
                    int i4 = 949803161 ^ 949803145;
                    int i5 = Integer.parseInt(C1561oA.yd("u\u0003\u0003ux", (short) (C1580rY.Xd() ^ ((380435012 ^ 2026321531) ^ (-1852559881)))), i4) ^ ((int) ((-1) - (((-1) - ((1488137912194111941L ^ 7014899671175444844L) ^ 8502518600424595542L)) | ((-1) - kp.getId()))));
                    int i6 = i5 + (((i5 << (Integer.parseInt(C1561oA.Yd("\u0014\u001b'", (short) (C1607wl.Xd() ^ ((100332529 ^ 393396425) ^ 310926747))), i4) - 650)) + i5) * ((i5 << 2) + i5));
                    short sXd = (short) (ZN.Xd() ^ ((1605851787 ^ 1178751606) ^ 435506687));
                    short sXd2 = (short) (ZN.Xd() ^ (1008936754 ^ 1008940897));
                    int[] iArr = new int["dS\u001b1G".length()];
                    QB qb = new QB("dS\u001b1G");
                    int i7 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i7] = xuXd.fK((xuXd.CK(iKK) - (sXd + i7)) + sXd2);
                        i7++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i7));
                    Class<?>[] clsArr = {Integer.TYPE};
                    Object[] objArr4 = {Integer.valueOf(i6)};
                    short sXd3 = (short) (C1633zX.Xd() ^ (438141598 ^ (-438142025)));
                    short sXd4 = (short) (C1633zX.Xd() ^ (2057358666 ^ (-2057349122)));
                    int[] iArr2 = new int["\u0002J".length()];
                    QB qb2 = new QB("\u0002J");
                    int i8 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - ((i8 * sXd4) ^ sXd3));
                        i8++;
                    }
                    Method declaredMethod3 = cls.getDeclaredMethod(new String(iArr2, 0, i8), clsArr);
                    try {
                        declaredMethod3.setAccessible(true);
                        int iIntValue = i3 ^ ((Integer) declaredMethod3.invoke(null, objArr4)).intValue();
                        long j2 = 5770918295800551164L ^ 5770918295800551155L;
                        int i9 = iIntValue ^ ((Integer.parseInt(ZO.xd("\u001c\u0002", (short) (C1499aX.Xd() ^ ((608113146 ^ 784983547) ^ (-183954403))), (short) (C1499aX.Xd() ^ (2144131139 ^ (-2144126742)))), i4) + 20) << ((byte) ((j2 + r15) - (j2 | r15))));
                        Class<?> cls2 = Class.forName(C1626yg.Ud("x10\u001aN", (short) (OY.Xd() ^ (718225168 ^ 718237558)), (short) (OY.Xd() ^ ((1964174130 ^ 2101479204) ^ 139513285))));
                        Class<?>[] clsArr2 = {Integer.TYPE};
                        Object[] objArr5 = {Integer.valueOf(i9)};
                        Method declaredMethod4 = cls2.getDeclaredMethod(Ig.wd("+q", (short) (C1580rY.Xd() ^ ((1798837127 ^ 1877418635) ^ (-81737993)))), clsArr2);
                        try {
                            declaredMethod4.setAccessible(true);
                            int iIntValue2 = ((Integer) declaredMethod4.invoke(null, objArr5)).intValue();
                            synchronized (CX.Xd) {
                                long id = kp.getId();
                                StringBuilder sbAppend = new StringBuilder().append("").append(iIntValue2);
                                String strOd = EO.Od("w", (short) (C1607wl.Xd() ^ (2064014412 ^ 2064019278)));
                                StringBuilder sbAppend2 = new StringBuilder().append(sbAppend.append(strOd).toString());
                                Class<?> cls3 = Class.forName(C1561oA.Qd("\u0016\u0003H\\p", (short) (C1580rY.Xd() ^ (569620852 ^ (-569635213)))));
                                Class<?>[] clsArr3 = {Integer.TYPE};
                                Object[] objArr6 = {Integer.valueOf((int) id)};
                                Method declaredMethod5 = cls3.getDeclaredMethod(C1593ug.zd("3@", (short) (OY.Xd() ^ ((2083168864 ^ 2107195450) ^ 28572297)), (short) (OY.Xd() ^ ((175522159 ^ 41899628) ^ 134831760))), clsArr3);
                                try {
                                    declaredMethod5.setAccessible(true);
                                    StringBuilder sbAppend3 = new StringBuilder().append((sbAppend2.append(((Integer) declaredMethod5.invoke(null, objArr6)).intValue()).append(strOd).toString() + str + strOd) + str2 + strOd);
                                    long jLongValue = 0;
                                    try {
                                        jLongValue = ((Long) Class.forName(C1561oA.od("C9M7\u0003@4@8}\"G@@07", (short) (ZN.Xd() ^ (1034274940 ^ 1034279803)))).getMethod(C1561oA.Kd("L_]^R\\cDZ_XA^bcal", (short) (C1580rY.Xd() ^ ((1719528186 ^ 1958654598) ^ (-314781455)))), new Class[0]).invoke(null, new Object[0])).longValue();
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

    public static String Xd() {
        return C1561oA.Xd("\u001b\nQ\tv", (short) (C1633zX.Xd() ^ ((1463570783 ^ 1419199911) ^ (-61563569))));
    }

    private static String Yd(byte[] bArr) throws NoSuchAlgorithmException {
        return C1626yg.od(EO.yd(bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.reflect.Method] */
    public static void ud() throws Throwable {
        Method declaredMethod;
        if (hg.Qd()) {
            return;
        }
        boolean z2 = false;
        Zp zp = new Zp();
        try {
            z2 = !vd(zp);
        } catch (Exception e2) {
        }
        if (z2) {
            Object[] objArr = new Object[0];
            Method declaredMethod2 = Class.forName(Qg.kd("^K\u0011[H", (short) (C1633zX.Xd() ^ (622522323 ^ (-622524378))), (short) (C1633zX.Xd() ^ ((1269102824 ^ 1167673239) ^ (-238925323))))).getDeclaredMethod(hg.Vd("Yd", (short) (C1633zX.Xd() ^ ((1578086972 ^ 1812868227) ^ (-838979480))), (short) (C1633zX.Xd() ^ ((1605553824 ^ 811223337) ^ (-1877518161)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                if (((Boolean) declaredMethod2.invoke(null, objArr)).booleanValue()) {
                    z2 = false;
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (!z2) {
            short sXd = (short) (C1499aX.Xd() ^ (741062727 ^ (-741073548)));
            int[] iArr = new int["fS\u0019AX".length()];
            QB qb = new QB("fS\u0019AX");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strZd = C1593ug.zd(")6", (short) (C1607wl.Xd() ^ (1842668936 ^ 1842664163)), (short) (C1607wl.Xd() ^ (1414398404 ^ 1414408385)));
            try {
                Class<?> cls = Class.forName(str);
                boolean z3 = false;
                try {
                    strZd = cls.getDeclaredMethod(strZd, new Class[0]);
                    declaredMethod = strZd;
                } catch (NoSuchMethodException e4) {
                    z3 = true;
                    declaredMethod = cls.getDeclaredMethod(strZd, Class.forName(C1561oA.od("{\b|\n\u0006~xAu\u0001~\u0004s{\u00019Mxv{k}x", (short) (ZN.Xd() ^ ((899287693 ^ 917530861) ^ 53100346)))));
                }
                if (!z3) {
                    declaredMethod.invoke(null, new Object[0]);
                    return;
                }
                Object[] objArr2 = new Object[1];
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(C1561oA.Kd("3\"i5\u0017", (short) (C1607wl.Xd() ^ ((814503659 ^ 512988057) ^ 773825496)))).getDeclaredMethod(Wg.Zd("f]", (short) (Od.Xd() ^ (1265730677 ^ (-1265736410))), (short) (Od.Xd() ^ ((1775740889 ^ 1280489023) ^ (-629505237)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    objArr2[0] = (Context) declaredMethod3.invoke(null, objArr3);
                    declaredMethod.invoke(null, objArr2);
                    return;
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                C1597vN.Xd(e6.getTargetException());
                return;
            } catch (Exception e7) {
                return;
            }
        }
        Class<?> cls2 = Class.forName(C1561oA.ud("\"\u000fT\ro", (short) (Od.Xd() ^ (233567789 ^ (-233555108)))));
        Class<?>[] clsArr = new Class[(654387654 ^ 2096057482) ^ 1542350152];
        clsArr[0] = Integer.TYPE;
        clsArr[1] = Integer.TYPE;
        clsArr[535618382 ^ 535618380] = Integer.TYPE;
        clsArr[336192249 ^ 336192250] = Class.forName(C1561oA.yd("bO\u0015=Q", (short) (Od.Xd() ^ (1633503986 ^ (-1633502076)))));
        Object[] objArr4 = new Object[(645539420 ^ 245089821) ^ 685891653];
        objArr4[0] = Integer.valueOf((1252238349 ^ 1585529461) ^ 337831538);
        objArr4[1] = Integer.valueOf(1899454232 ^ 1899474335);
        objArr4[1803041742 ^ 1803041740] = 1;
        objArr4[1977586116 ^ 1977586119] = zp;
        Method declaredMethod4 = cls2.getDeclaredMethod(C1561oA.Yd("4D", (short) (C1607wl.Xd() ^ ((1528218209 ^ 1632961887) ^ 977534144))), clsArr);
        try {
            declaredMethod4.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod4.invoke(null, objArr4)).booleanValue();
            String strQd = Xg.qd("WF\u000e8Q", (short) (Od.Xd() ^ ((633505784 ^ 1392154333) ^ (-2000175777))), (short) (Od.Xd() ^ ((1902583059 ^ 2106720697) ^ (-217413570))));
            String strWd = Jg.Wd("'y", (short) (ZN.Xd() ^ ((176626704 ^ 1469710011) ^ 1562293932)), (short) (ZN.Xd() ^ (1954351066 ^ 1954355360)));
            Class<?> cls3 = Class.forName(ZO.xd("Or1H)", (short) (ZN.Xd() ^ (895027202 ^ 895048071)), (short) (ZN.Xd() ^ ((1420963222 ^ 1621417257) ^ 873892404))));
            Class<?>[] clsArr2 = new Class[13866643 ^ 13866640];
            short sXd2 = (short) (ZN.Xd() ^ (444995822 ^ 445008138));
            short sXd3 = (short) (ZN.Xd() ^ ((1515575081 ^ 1893235996) ^ 713919641));
            int[] iArr2 = new int["\u0003&PS\u0004\u0004$bD0%\u001bXa\u0013F".length()];
            QB qb2 = new QB("\u0003&PS\u0004\u0004$bD0%\u001bXa\u0013F");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr2[1] = Class.forName(Ig.wd("i\u0013\u0018\\n\u0001\f.l\u00156?\u000bRCb", (short) (OY.Xd() ^ (1476488031 ^ 1476470468))));
            clsArr2[(1335855076 ^ 796685054) ^ 1625552152] = Boolean.TYPE;
            Object[] objArr5 = new Object[(80648374 ^ 513185692) ^ 441978665];
            objArr5[0] = strQd;
            objArr5[1] = strWd;
            objArr5[(675200902 ^ 1522115895) ^ 1921456819] = Boolean.valueOf(zBooleanValue);
            Method declaredMethod5 = cls3.getDeclaredMethod(EO.Od(",\u0018", (short) (OY.Xd() ^ ((858064659 ^ 101179499) ^ 891483662))), clsArr2);
            try {
                declaredMethod5.setAccessible(true);
                declaredMethod5.invoke(null, objArr5);
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        } catch (InvocationTargetException e9) {
            throw e9.getCause();
        }
    }

    public static boolean vd(Zp zp) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.ud("&\u0013X\"\u0002", (short) (FB.Xd() ^ ((118453680 ^ 1928476360) ^ 1979530747)))).getDeclaredMethod(C1561oA.yd("\u001e+", (short) (Od.Xd() ^ (1998022420 ^ (-1998016691)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Context context = (Context) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(C1561oA.Yd(";I@OMHD\u000fERRYKU\\\u0017-ZZaSgd", (short) (C1499aX.Xd() ^ ((1868575947 ^ 508254544) ^ (-1898649898))))).getMethod(Xg.qd("zy\nfx{\u0005{\u0003\u0002o\u0004\u0013\u0010\u0017\u0015\u0007\nu\b\u001c\u0011", (short) (C1607wl.Xd() ^ ((337197632 ^ 1190936324) ^ 1390763726)), (short) (C1607wl.Xd() ^ (441578781 ^ 441555210))), new Class[0]);
            try {
                method.setAccessible(true);
                Iterator it = Wg.Kd((String) method.invoke(context, objArr2)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    try {
                        String strYd = Yd(((X509Certificate) it.next()).getEncoded());
                        zp.jK(strYd);
                        String strWd = Jg.Wd("Sp%\rh", (short) (C1580rY.Xd() ^ ((1592770305 ^ 868902435) ^ (-1831179676))), (short) (C1580rY.Xd() ^ (1714511633 ^ (-1714518815))));
                        String strXd = ZO.xd("Si", (short) (OY.Xd() ^ ((8574100 ^ 661441471) ^ 669910548)), (short) (OY.Xd() ^ (1828909158 ^ 1828908054)));
                        try {
                            Class<?> cls = Class.forName(strWd);
                            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                            field.setAccessible(true);
                            obj = field.get(null);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        for (String str : (String[]) obj) {
                            if (str.equals(strYd)) {
                                return true;
                            }
                        }
                    } catch (CertificateEncodingException e2) {
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
