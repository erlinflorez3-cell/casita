package yg;

import android.content.Context;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import kotlin.io.encoding.Base64;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes9.dex */
public class NQ {
    public static long Xd = 0;
    public static Map<WF, Long> Yd = vO();
    public static Map<WF, Long> Kd = qO();
    public static byte[] ud = xO();

    static {
        String strVd = hg.Vd("\u0014\u0001Feg", (short) (Od.Xd() ^ ((1332288946 ^ 739126738) ^ (-1667724682))), (short) (Od.Xd() ^ (708448579 ^ (-708467310))));
        String strUd = C1561oA.ud("{\u0007", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134252552))));
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            field.set(null, 0L);
        } catch (Throwable th) {
        }
    }

    public static String Kd() {
        short sXd = (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831068331)));
        int[] iArr = new int["am".length()];
        QB qb = new QB("am");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    private static void VO(TreeMap treeMap) {
        treeMap.put(new WF(new byte[]{-120, -15, -13, -28, 39, 115, -128, -126, -26, -30, MessagePack.Code.FLOAT32, -117, -26, MessagePack.Code.FIXEXT8, -26, 19, Base64.padSymbol, MessagePack.Code.EXT16, 72, -8, -27, Ascii.US, 107, 85, -101, 4, -120, 98, MessagePack.Code.FIXEXT16, -4, 8, 1}), 2884673965660859312L);
    }

    public static String Xd() {
        short sXd = (short) (ZN.Xd() ^ ((2093094833 ^ 2109182300) ^ 24481040));
        int[] iArr = new int["q^(GE".length()];
        QB qb = new QB("q^(GE");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.reflect.Method] */
    public static void Yd() throws Throwable {
        Object obj;
        Object obj2;
        Method declaredMethod;
        Object obj3;
        Object[] objArr;
        Constructor<?> constructor;
        if (hg.Qd()) {
            return;
        }
        List<String> listKd = UB.Kd();
        boolean z2 = false;
        String strQd = Xg.qd("\r{Cdh", (short) (OY.Xd() ^ ((256035973 ^ 279993052) ^ 535992456)), (short) (OY.Xd() ^ (17196393 ^ 17192634)));
        short sXd = (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831093730)));
        short sXd2 = (short) (OY.Xd() ^ (1535867267 ^ 1535838925));
        int[] iArr = new int["2O".length()];
        QB qb = new QB("2O");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        TreeMap treeMap = new TreeMap((Map) obj);
        String strXd = ZO.xd("\u0019Of_\u0011", (short) (C1580rY.Xd() ^ ((1926854622 ^ 1101188497) ^ (-863736271))), (short) (C1580rY.Xd() ^ (89755187 ^ (-89752168))));
        String strUd = C1626yg.Ud("\f*", (short) (C1607wl.Xd() ^ (810882131 ^ 810890295)), (short) (C1607wl.Xd() ^ ((1324663756 ^ 1493679026) ^ 401807602)));
        try {
            Class<?> cls2 = Class.forName(strXd);
            Field field2 = 0 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
            field2.setAccessible(true);
            obj2 = field2.get(null);
        } catch (Throwable th2) {
            obj2 = null;
        }
        long jLongValue = ((Long) obj2).longValue() + ((long) treeMap.size());
        String strWd = Ig.wd("p,\u0005A\u0015", (short) (OY.Xd() ^ ((1556329038 ^ 1800119657) ^ 931686219)));
        String strOd = EO.Od("U\b", (short) (OY.Xd() ^ (300066258 ^ 300088110)));
        Long lValueOf = Long.valueOf(jLongValue);
        try {
            Class<?> cls3 = Class.forName(strWd);
            Field field3 = 0 != 0 ? cls3.getField(strOd) : cls3.getDeclaredField(strOd);
            field3.setAccessible(true);
            field3.set(null, lValueOf);
        } catch (Throwable th3) {
        }
        for (String str2 : listKd) {
            try {
                Class<?> cls4 = Class.forName(C1561oA.Qd("@6J4\u007fFD8:zF4:v\"06\u000b-/'", (short) (Od.Xd() ^ ((551949401 ^ 729494583) ^ (-194846117)))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1593ug.zd("\u0017\u000f%\u0011^\u001e\u0014\"\u001cc\n,+#)#", (short) (C1499aX.Xd() ^ ((1736646469 ^ 201154190) ^ (-1820198189))), (short) (C1499aX.Xd() ^ ((910412152 ^ 1566593254) ^ (-1797497663)))));
                objArr = new Object[]{str2};
                constructor = cls4.getConstructor(clsArr);
            } catch (ZipException e2) {
                z2 = true;
            } catch (IOException e3) {
                z2 = true;
            } catch (Exception e4) {
            }
            try {
                constructor.setAccessible(true);
                ZipFile zipFile = (ZipFile) constructor.newInstance(objArr);
                try {
                    Object[] objArr2 = new Object[0];
                    Method method = Class.forName(C1561oA.od("xn\u0003l8~|pr3~lr/ZhnCeg_", (short) (OY.Xd() ^ (415114604 ^ 415137235)))).getMethod(C1561oA.Kd("baqL`mf", (short) (ZN.Xd() ^ (1133368020 ^ 1133354238))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        if (((String) method.invoke(zipFile, objArr2)).equals(str2)) {
                            Object[] objArr3 = new Object[0];
                            Method method2 = Class.forName(Wg.Zd("_ Uu\u0002n\u001e[\u0011v\u0005(OQ2f\u001f:}6n", (short) (C1580rY.Xd() ^ ((2049920313 ^ 1604722205) ^ (-629762036))), (short) (C1580rY.Xd() ^ (959766513 ^ (-959757365))))).getMethod(C1561oA.Xd("=GNMEBQ", (short) (C1499aX.Xd() ^ ((1071036798 ^ 905489473) ^ (-170817775)))), new Class[0]);
                            try {
                                method2.setAccessible(true);
                                Enumeration enumeration = (Enumeration) method2.invoke(zipFile, objArr3);
                                while (enumeration.hasMoreElements()) {
                                    if (!Xg.wd((ZipEntry) enumeration.nextElement(), treeMap)) {
                                        z2 = true;
                                    }
                                }
                            } catch (InvocationTargetException e5) {
                                throw e5.getCause();
                            }
                        } else {
                            z2 = true;
                        }
                        Object[] objArr4 = new Object[0];
                        Method method3 = Class.forName(Wg.vd("\u0017\u000f!\rV\u001f\u001b\u0011\u0011S\u001d\r\u0011Ox\t-\u0004$(\u001e", (short) (Od.Xd() ^ (1759107979 ^ (-1759101009))))).getMethod(Qg.kd("\u0006\u000e\u0010\u0013\u0004", (short) (C1499aX.Xd() ^ ((837478155 ^ 1965660035) ^ (-1153656789))), (short) (C1499aX.Xd() ^ (622578361 ^ (-622582982)))), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            method3.invoke(zipFile, objArr4);
                        } catch (InvocationTargetException e6) {
                            throw e6.getCause();
                        }
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                } catch (Throwable th4) {
                    try {
                        Object[] objArr5 = new Object[0];
                        Method method4 = Class.forName(hg.Vd("\u0017\r!\u000bV\u001d\u001b\u000f\u0011Q\u001d\u000b\u0011Mx\u0007\ra\u0004\u0006}", (short) (C1580rY.Xd() ^ (492117989 ^ (-492127876))), (short) (C1580rY.Xd() ^ ((1609527384 ^ 2051937144) ^ (-631323040))))).getMethod(C1561oA.ud("\u0015\u001d\u001f\"\u0013", (short) (C1633zX.Xd() ^ (1530577697 ^ (-1530584781)))), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            method4.invoke(zipFile, objArr5);
                        } catch (InvocationTargetException e8) {
                            throw e8.getCause();
                        }
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        }
        TreeMap treeMap2 = new TreeMap((Map) treeMap);
        Iterator it = treeMap2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String strYd = C1561oA.yd("\u0002p8YU", (short) (Od.Xd() ^ ((1180037405 ^ 389721060) ^ (-1366254608))));
            String strYd2 = C1561oA.Yd("\u001b'", (short) (FB.Xd() ^ (2038675270 ^ 2038667338)));
            try {
                Class<?> cls5 = Class.forName(strYd);
                Field field4 = 0 != 0 ? cls5.getField(strYd2) : cls5.getDeclaredField(strYd2);
                field4.setAccessible(true);
                obj3 = field4.get(null);
            } catch (Throwable th6) {
                obj3 = null;
            }
            Long l2 = (Long) ((Map) obj3).get(entry.getKey());
            if (l2 == null) {
                z2 = true;
                break;
            }
            long jLongValue2 = l2.longValue();
            long j2 = (1371946974094099659L ^ 4065247658742686251L) ^ (-3125651751054235936L);
            if ((((j2 + jLongValue2) - (j2 | jLongValue2)) ^ (jLongValue2 << ((1271171549 ^ 934170863) ^ 2087377170))) != 0) {
                treeMap.remove(entry.getKey());
            }
        }
        treeMap2.clear();
        if (treeMap.size() != 0) {
            z2 = true;
        }
        if (z2) {
            Class<?> cls6 = Class.forName(Xg.qd("!\u0010W$\u0013", (short) (Od.Xd() ^ ((1690773002 ^ 102101348) ^ (-1657983369))), (short) (Od.Xd() ^ ((1842167073 ^ 1547480215) ^ (-837933089)))));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr6 = new Object[0];
            short sXd3 = (short) (FB.Xd() ^ ((1510737845 ^ 2120795730) ^ 610582959));
            short sXd4 = (short) (FB.Xd() ^ (646704939 ^ 646701082));
            int[] iArr2 = new int["4|".length()];
            QB qb2 = new QB("4|");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            Method declaredMethod2 = cls6.getDeclaredMethod(new String(iArr2, 0, i3), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                if (((Boolean) declaredMethod2.invoke(null, objArr6)).booleanValue()) {
                    z2 = false;
                }
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
        if (!z2) {
            String strZd = Wg.Zd("'\u00059\u00135", (short) (OY.Xd() ^ (838831084 ^ 838843364)), (short) (OY.Xd() ^ ((803987555 ^ 2005968395) ^ 1484467404)));
            String strXd2 = C1561oA.Xd(";H", (short) (C1633zX.Xd() ^ (881383348 ^ (-881385354))));
            try {
                Class<?> cls7 = Class.forName(strZd);
                boolean z3 = false;
                try {
                    strXd2 = cls7.getDeclaredMethod(strXd2, new Class[0]);
                    declaredMethod = strXd2;
                } catch (NoSuchMethodException e11) {
                    z3 = true;
                    declaredMethod = cls7.getDeclaredMethod(strXd2, Class.forName(Wg.vd("HTMZZSQ\u001aBMOTHPY\u0012:egl`rq", (short) (Od.Xd() ^ ((1355294399 ^ 1199832491) ^ (-390828521))))));
                }
                if (!z3) {
                    declaredMethod.invoke(null, new Object[0]);
                    return;
                }
                Object[] objArr7 = new Object[1];
                Object[] objArr8 = new Object[0];
                Method declaredMethod3 = Class.forName(Qg.kd("[H\u000eW7", (short) (C1633zX.Xd() ^ (241664417 ^ (-241664914))), (short) (C1633zX.Xd() ^ (629130761 ^ (-629142318))))).getDeclaredMethod(hg.Vd("&1", (short) (C1580rY.Xd() ^ ((822619347 ^ 1229030333) ^ (-2018110031))), (short) (C1580rY.Xd() ^ ((290037172 ^ 1029040606) ^ (-740041907)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    objArr7[0] = (Context) declaredMethod3.invoke(null, objArr8);
                    declaredMethod.invoke(null, objArr7);
                    return;
                } catch (InvocationTargetException e12) {
                    throw e12.getCause();
                }
            } catch (InvocationTargetException e13) {
                C1597vN.Xd(e13.getTargetException());
                return;
            } catch (Exception e14) {
                return;
            }
        }
        Class<?> cls8 = Class.forName(ZO.xd("ZC=)\u0004", (short) (C1580rY.Xd() ^ ((153226660 ^ 131936905) ^ (-251608195))), (short) (C1580rY.Xd() ^ (1589313678 ^ (-1589339511)))));
        Class<?>[] clsArr3 = new Class[1388794523 ^ 1388794520];
        clsArr3[0] = Integer.TYPE;
        clsArr3[1] = Integer.TYPE;
        clsArr3[1156838786 ^ 1156838784] = Integer.TYPE;
        Object[] objArr9 = new Object[(1491985412 ^ 1386108151) ^ 175354096];
        objArr9[0] = Integer.valueOf(868275306 ^ 868275298);
        objArr9[1] = Integer.valueOf((658009055 ^ 755164215) ^ 171553319);
        objArr9[(410299213 ^ 670489320) ^ 1065513383] = 1;
        short sXd5 = (short) (Od.Xd() ^ ((1431577994 ^ 517818079) ^ (-1267272131)));
        short sXd6 = (short) (Od.Xd() ^ ((692266336 ^ 1102775586) ^ (-1761100851)));
        int[] iArr3 = new int["y@".length()];
        QB qb3 = new QB("y@");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
            i4++;
        }
        Method declaredMethod4 = cls8.getDeclaredMethod(new String(iArr3, 0, i4), clsArr3);
        try {
            declaredMethod4.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod4.invoke(null, objArr9)).booleanValue();
            String strWd2 = Ig.wd("\u001fVj\u0001n", (short) (OY.Xd() ^ (260855976 ^ 260861925)));
            String strOd2 = EO.Od("iy", (short) (Od.Xd() ^ (2019714402 ^ (-2019694303))));
            Class<?> cls9 = Class.forName(C1561oA.Qd("C0u.\u0011", (short) (C1607wl.Xd() ^ ((973699509 ^ 666309256) ^ 499003416))));
            Class<?>[] clsArr4 = new Class[(1328183151 ^ 1937128725) ^ 1012681337];
            clsArr4[0] = Class.forName(C1593ug.zd("um\u0004o=|r\u0001zBh\u000b\n\u0002\b\u0002", (short) (Od.Xd() ^ (237866521 ^ (-237884037))), (short) (Od.Xd() ^ (2122185099 ^ (-2122167870)))));
            clsArr4[1] = Class.forName(C1561oA.od("f\\pZ&cWc[!EebX\\T", (short) (Od.Xd() ^ ((1235092536 ^ 1110949844) ^ (-195677442)))));
            clsArr4[(461531190 ^ 142282488) ^ 335111884] = Boolean.TYPE;
            Object[] objArr10 = new Object[(1164093195 ^ 650925577) ^ 1672409345];
            objArr10[0] = strWd2;
            objArr10[1] = strOd2;
            objArr10[(1625421406 ^ 1222605462) ^ 675187914] = Boolean.valueOf(zBooleanValue);
            short sXd7 = (short) (C1580rY.Xd() ^ ((186156591 ^ 1310773973) ^ (-1161299205)));
            int[] iArr4 = new int[")?".length()];
            QB qb4 = new QB(")?");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd7 + sXd7) + i5));
                i5++;
            }
            Method declaredMethod5 = cls9.getDeclaredMethod(new String(iArr4, 0, i5), clsArr4);
            try {
                declaredMethod5.setAccessible(true);
                declaredMethod5.invoke(null, objArr10);
            } catch (InvocationTargetException e15) {
                throw e15.getCause();
            }
        } catch (InvocationTargetException e16) {
            throw e16.getCause();
        }
    }

    public static void od() throws Exception {
        CX.ud();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.ud("-\u001a_~\u0001", (short) (C1499aX.Xd() ^ (229299095 ^ (-229298566))))).getDeclaredMethod(C1561oA.yd("\u001c'", (short) (C1499aX.Xd() ^ ((1926731033 ^ 321610484) ^ (-1643952144)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Yd("\tw?`d", (short) (C1499aX.Xd() ^ ((2054934027 ^ 1412277346) ^ (-777400262))))).getDeclaredMethod(Xg.qd("e\u007f", (short) (FB.Xd() ^ ((128638787 ^ 1298597650) ^ 1255011540)), (short) (FB.Xd() ^ ((1292760541 ^ 1819686332) ^ 561749523))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                Object[] objArr3 = new Object[0];
                Constructor<?> constructor = Class.forName(Jg.Wd("bh\f\u0006g:<Ojv{\u00160i\u001f>Efqz}\u001a7;N[", (short) (OY.Xd() ^ (1050109744 ^ 1050096227)), (short) (OY.Xd() ^ ((1328555980 ^ 1354123339) ^ 528906046)))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    int iNextInt = ((SecureRandom) constructor.newInstance(objArr3)).nextInt((639564401 ^ 1242248686) ^ 334114912);
                    Kp kp = new Kp(iNextInt, str, str2);
                    long id = kp.getId();
                    int i2 = ((iNextInt ^ ((885409563 ^ 528316567) ^ 710774982)) << 7) ^ 65;
                    long j2 = 6235419222678747209L ^ 6235419222678747318L;
                    int i3 = 296131748 ^ 296131764;
                    int i4 = Integer.parseInt(ZO.xd("~\u007f.e6", (short) (C1633zX.Xd() ^ (910662630 ^ (-910681799))), (short) (C1633zX.Xd() ^ ((998898903 ^ 991019558) ^ (-9988608)))), i3) ^ ((int) ((j2 + id) - (j2 | id)));
                    short sXd = (short) (C1607wl.Xd() ^ ((1237026884 ^ 1910108671) ^ 945957217));
                    short sXd2 = (short) (C1607wl.Xd() ^ ((1484901513 ^ 947577378) ^ 1627078042));
                    int[] iArr = new int["$m\u0003".length()];
                    QB qb = new QB("$m\u0003");
                    int i5 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i5 * sXd2))) + xuXd.CK(iKK));
                        i5++;
                    }
                    int i6 = i4 + (((i4 << (Integer.parseInt(new String(iArr, 0, i5), i3) - 650)) + i4) * ((i4 << 2) + i4));
                    short sXd3 = (short) (C1633zX.Xd() ^ (1417135207 ^ (-1417134854)));
                    int[] iArr2 = new int["\u0018-0fr".length()];
                    QB qb2 = new QB("\u0018-0fr");
                    int i7 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd3 + i7)));
                        i7++;
                    }
                    Class<?> cls = Class.forName(new String(iArr2, 0, i7));
                    Class<?>[] clsArr = {Integer.TYPE};
                    Object[] objArr4 = {Integer.valueOf(i6)};
                    Method declaredMethod3 = cls.getDeclaredMethod(EO.Od("\u007fZ", (short) (C1499aX.Xd() ^ (210227302 ^ (-210233344)))), clsArr);
                    try {
                        declaredMethod3.setAccessible(true);
                        int iIntValue = i2 ^ ((Integer) declaredMethod3.invoke(null, objArr4)).intValue();
                        byte b2 = (byte) ((-1) - (((-1) - ((8897779983035592824L ^ 4901099139673952581L) ^ 4575499388999688498L)) | ((-1) - id)));
                        short sXd4 = (short) (C1607wl.Xd() ^ (1794398870 ^ 1794399764));
                        int[] iArr3 = new int["#\"".length()];
                        QB qb3 = new QB("#\"");
                        int i8 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i8] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i8 + xuXd3.CK(iKK3));
                            i8++;
                        }
                        int i9 = iIntValue ^ ((Integer.parseInt(new String(iArr3, 0, i8), i3) + 20) << b2);
                        Class<?> cls2 = Class.forName(C1593ug.zd("L;\u0003\u0019/", (short) (C1580rY.Xd() ^ ((1930165001 ^ 41673100) ^ (-1903192675))), (short) (C1580rY.Xd() ^ (1756044918 ^ (-1756038686)))));
                        Class<?>[] clsArr2 = {Integer.TYPE};
                        Object[] objArr5 = {Integer.valueOf(i9)};
                        Method declaredMethod4 = cls2.getDeclaredMethod(C1561oA.od("$/", (short) (C1607wl.Xd() ^ ((1488861922 ^ 854574637) ^ 1783731082))), clsArr2);
                        try {
                            declaredMethod4.setAccessible(true);
                            int iIntValue2 = ((Integer) declaredMethod4.invoke(null, objArr5)).intValue();
                            synchronized (CX.Xd) {
                                long id2 = kp.getId();
                                StringBuilder sbAppend = new StringBuilder().append("").append(iIntValue2);
                                String strKd = C1561oA.Kd("\u0010", (short) (C1607wl.Xd() ^ (1027324242 ^ 1027321908)));
                                StringBuilder sbAppend2 = new StringBuilder().append(sbAppend.append(strKd).toString());
                                Class<?> cls3 = Class.forName(Wg.Zd("\u0002R\n\u000e\t", (short) (C1499aX.Xd() ^ (239295991 ^ (-239281755))), (short) (C1499aX.Xd() ^ (1573287537 ^ (-1573259230)))));
                                Class<?>[] clsArr3 = {Integer.TYPE};
                                Object[] objArr6 = {Integer.valueOf((int) id2)};
                                Method declaredMethod5 = cls3.getDeclaredMethod(C1561oA.Xd("8E", (short) (C1580rY.Xd() ^ ((564423682 ^ 966999392) ^ (-403120086)))), clsArr3);
                                try {
                                    declaredMethod5.setAccessible(true);
                                    StringBuilder sbAppend3 = new StringBuilder().append((sbAppend2.append(((Integer) declaredMethod5.invoke(null, objArr6)).intValue()).append(strKd).toString() + str + strKd) + str2 + strKd);
                                    long jLongValue = 0;
                                    try {
                                        jLongValue = ((Long) Class.forName(Wg.vd("\"\u001a,\u0018i)\u001b)'n\u0011879'0", (short) (ZN.Xd() ^ (637464570 ^ 637455495)))).getMethod(Qg.kd("GXTSEMR1EH?&ACB>G", (short) (ZN.Xd() ^ ((869974347 ^ 566709639) ^ 303951218)), (short) (ZN.Xd() ^ (1443023641 ^ 1443027964))), new Class[0]).invoke(null, new Object[0])).longValue();
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

    public static TreeMap qO() {
        TreeMap treeMap = new TreeMap();
        zO(treeMap);
        return treeMap;
    }

    public static TreeMap vO() {
        TreeMap treeMap = new TreeMap();
        VO(treeMap);
        return treeMap;
    }

    public static byte[] xO() {
        return new byte[]{94, -18, MessagePack.Code.UINT8, -5, -65, MessagePack.Code.UINT32, -11, -113};
    }

    private static void zO(TreeMap treeMap) {
        treeMap.put(new WF(new byte[]{-120, -15, -13, -28, 39, 115, -128, -126, -26, -30, MessagePack.Code.FLOAT32, -117, -26, MessagePack.Code.FIXEXT8, -26, 19, Base64.padSymbol, MessagePack.Code.EXT16, 72, -8, -27, Ascii.US, 107, 85, -101, 4, -120, 98, MessagePack.Code.FIXEXT16, -4, 8, 1}), 2591746904L);
    }
}
