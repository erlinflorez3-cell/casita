package yg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class KQ {
    private static long Kd = 0;
    public static JSONObject Xd = null;
    private static String Yd = null;
    private static final Set<String> ud = null;

    static {
        short sXd = (short) (ZN.Xd() ^ (1400024780 ^ 1400045348));
        int[] iArr = new int["\nG\u001eT}".length()];
        QB qb = new QB("\nG\u001eT}");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134246711));
        int[] iArr2 = new int["I}".length()];
        QB qb2 = new QB("I}");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            String strZd = C1593ug.zd("\u0007u=[b", (short) (C1499aX.Xd() ^ ((2128572035 ^ 1225039154) ^ (-937155903))), (short) (C1499aX.Xd() ^ (650823130 ^ (-650829591))));
            String strOd = C1561oA.od("\u0007\u0011", (short) (C1633zX.Xd() ^ (1552337890 ^ (-1552332449))));
            try {
                Class<?> cls2 = Class.forName(strZd);
                Field field = 0 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                field.setAccessible(true);
                field.set(null, str);
            } catch (Throwable th) {
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Kd(";*q\u0010\u0017", (short) (C1499aX.Xd() ^ (1519460731 ^ (-1519468859))))).getDeclaredMethod(Wg.Zd("U\u000e", (short) (C1580rY.Xd() ^ (1969357056 ^ (-1969362331))), (short) (C1580rY.Xd() ^ (505772821 ^ (-505746432)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                long jLongValue = ((Long) declaredMethod2.invoke(null, objArr2)).longValue();
                String strXd = C1561oA.Xd("F5|\u001b\"", (short) (Od.Xd() ^ (1877437176 ^ (-1877410456))));
                String strVd = Wg.vd("a{", (short) (ZN.Xd() ^ ((607716537 ^ 908785643) ^ 303282399)));
                Long lValueOf = Long.valueOf(jLongValue);
                try {
                    Class<?> cls3 = Class.forName(strXd);
                    Field field2 = 0 != 0 ? cls3.getField(strVd) : cls3.getDeclaredField(strVd);
                    field2.setAccessible(true);
                    field2.set(null, lValueOf);
                } catch (Throwable th2) {
                }
                String strKd = Qg.kd("B/t\u0011\u0016", (short) (C1633zX.Xd() ^ ((1554109665 ^ 1859130548) ^ (-846319164))), (short) (C1633zX.Xd() ^ ((529343130 ^ 1490443564) ^ (-1197149147))));
                String strVd2 = hg.Vd("\b\u0013", (short) (C1499aX.Xd() ^ (7775361 ^ (-7776622))), (short) (C1499aX.Xd() ^ (934945557 ^ (-934940132))));
                try {
                    Class<?> cls4 = Class.forName(strKd);
                    Field field3 = 0 != 0 ? cls4.getField(strVd2) : cls4.getDeclaredField(strVd2);
                    field3.setAccessible(true);
                    field3.set(null, null);
                } catch (Throwable th3) {
                }
                HashSet hashSet = new HashSet(Arrays.asList(C1561oA.ud("5A6C?82z<0<61:9.31o\u0003\t\r\u0002\u001c|}|}\u000b\n~v|~z\u0005\t\u000e\u0001q}\u0001rkl", (short) (C1580rY.Xd() ^ ((303691515 ^ 1168277855) ^ (-1471898918))))));
                String strYd = C1561oA.yd("/\u001ee\u0004\u000b", (short) (ZN.Xd() ^ (1346109459 ^ 1346123851)));
                String strYd2 = C1561oA.Yd("vf", (short) (FB.Xd() ^ (262755199 ^ 262746868)));
                try {
                    Class<?> cls5 = Class.forName(strYd);
                    Field field4 = 0 != 0 ? cls5.getField(strYd2) : cls5.getDeclaredField(strYd2);
                    field4.setAccessible(true);
                    field4.set(null, hashSet);
                } catch (Throwable th4) {
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static String Cx() {
        int iXd = ZN.Xd() ^ (199595261 ^ 946858933);
        return Xg.qd(".2;", (short) (FB.Xd() ^ (78351188 ^ 78353455)), (short) (FB.Xd() ^ iXd));
    }

    public static String Kd() {
        int iXd = C1633zX.Xd() ^ (2020385471 ^ 205375749);
        int iXd2 = Od.Xd() ^ (-1207798820);
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["2?g%L".length()];
        QB qb = new QB("2?g%L");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.reflect.Method] */
    private static boolean Ud(C1542jl c1542jl) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Method declaredMethod;
        Object obj5;
        Object obj6;
        Object obj7;
        Method declaredMethod2;
        Object obj8;
        Object[] objArr = {c1542jl};
        Method declaredMethod3 = Class.forName(C1593ug.zd("\tw?]d", (short) (Od.Xd() ^ ((1831011595 ^ 2051022183) ^ (-392381418))), (short) (Od.Xd() ^ (FB.Xd() ^ (1784804211 ^ (-898558893)))))).getDeclaredMethod(C1561oA.Kd("RB", (short) (C1580rY.Xd() ^ (1210787754 ^ (-1210797082)))), Class.forName(C1561oA.od("\u0015\u0002Go{", (short) (ZN.Xd() ^ (FB.Xd() ^ (506377930 ^ 1103218020))))));
        try {
            declaredMethod3.setAccessible(true);
            List<VX> list = (List) declaredMethod3.invoke(null, objArr);
            if (list == null || list.isEmpty()) {
                return false;
            }
            for (VX vx : list) {
                String strZd = Wg.Zd("\u001d,LR.", (short) (C1607wl.Xd() ^ ((872723601 ^ 1828168645) ^ 1492344989)), (short) (C1607wl.Xd() ^ ((1590996695 ^ 1162935351) ^ 461667744)));
                short sXd = (short) (ZN.Xd() ^ (332976353 ^ 332971043));
                int[] iArr = new int["0=".length()];
                QB qb = new QB("0=");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                try {
                    Class<?> cls = Class.forName(strZd);
                    Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                    field.setAccessible(true);
                    obj = field.get(vx);
                } catch (Throwable th) {
                    obj = null;
                }
                long jLongValue = ((Long) obj).longValue();
                String strVd = Wg.vd("aP\u001425", (short) (FB.Xd() ^ (10647832 ^ 10622394)));
                short sXd2 = (short) (C1607wl.Xd() ^ ((407824828 ^ 1387278171) ^ 1258201405));
                short sXd3 = (short) (C1607wl.Xd() ^ (1904103208 ^ 1904115045));
                int[] iArr2 = new int["<T".length()];
                QB qb2 = new QB("<T");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                try {
                    Class<?> cls2 = Class.forName(strVd);
                    Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (jLongValue == ((Long) obj2).longValue()) {
                    short sXd4 = (short) (Od.Xd() ^ ((484717887 ^ 1745010174) ^ (-1961264259)));
                    short sXd5 = (short) (Od.Xd() ^ (16503351 ^ (-16487626)));
                    int[] iArr3 = new int["\u0010|Bij".length()];
                    QB qb3 = new QB("\u0010|Bij");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    String strUd = C1561oA.ud("?W", (short) (C1607wl.Xd() ^ ((1343398406 ^ 1153066286) ^ 346592376)));
                    try {
                        Class<?> cls3 = Class.forName(str3);
                        Field field3 = 1 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
                        field3.setAccessible(true);
                        obj3 = field3.get(vx);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    EnumC1557nF enumC1557nF = (EnumC1557nF) obj3;
                    String strYd = C1561oA.yd("\u0014\u0003F\b\\", (short) (ZN.Xd() ^ ((1217634191 ^ 129113240) ^ 1327621249)));
                    String strYd2 = C1561oA.Yd("wm", (short) (C1499aX.Xd() ^ ((209106285 ^ 1705805537) ^ (-1775901201))));
                    try {
                        Class<?> cls4 = Class.forName(strYd);
                        Field field4 = 0 != 0 ? cls4.getField(strYd2) : cls4.getDeclaredField(strYd2);
                        field4.setAccessible(true);
                        obj4 = field4.get(null);
                    } catch (Throwable th4) {
                        obj4 = null;
                    }
                    if (enumC1557nF == ((EnumC1557nF) obj4)) {
                        Object[] objArr2 = new Object[0];
                        Method method = Class.forName(Xg.qd("M<\u0004-0", (short) (C1580rY.Xd() ^ ((476813759 ^ 235173651) ^ (-309319170))), (short) (C1580rY.Xd() ^ ((1280349363 ^ 998549154) ^ (-2010382976))))).getMethod(Jg.Wd("\u001e`", (short) (Od.Xd() ^ ((1488196757 ^ 342614584) ^ (-1289721499))), (short) (Od.Xd() ^ ((1100737405 ^ 999161855) ^ (-2048294200)))), new Class[0]);
                        try {
                            method.setAccessible(true);
                            Pu pu = (Pu) method.invoke(vx, objArr2);
                            short sXd6 = (short) (ZN.Xd() ^ (1339901139 ^ 1339906022));
                            short sXd7 = (short) (ZN.Xd() ^ ((1036366823 ^ 1003903697) ^ 101960118));
                            int[] iArr4 = new int["\u001beAwi".length()];
                            QB qb4 = new QB("\u001beAwi");
                            int i5 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd7) + sXd6)));
                                i5++;
                            }
                            Object[] objArr3 = new Object[0];
                            Method method2 = Class.forName(new String(iArr4, 0, i5)).getMethod(C1626yg.Ud("F\u0011", (short) (C1633zX.Xd() ^ (1473406617 ^ (-1473386531))), (short) (C1633zX.Xd() ^ (1124090192 ^ (-1124099575)))), new Class[0]);
                            try {
                                method2.setAccessible(true);
                                long jLongValue2 = ((Long) method2.invoke(pu, objArr3)).longValue();
                                for (int i6 = 0; i6 < jLongValue2; i6++) {
                                    short sXd8 = (short) (C1580rY.Xd() ^ ((365278300 ^ 565483426) ^ (-879827473)));
                                    int[] iArr5 = new int["Fk$\u001ek".length()];
                                    QB qb5 = new QB("Fk$\u001ek");
                                    int i7 = 0;
                                    while (qb5.YK()) {
                                        int iKK5 = qb5.KK();
                                        Xu xuXd5 = Xu.Xd(iKK5);
                                        iArr5[i7] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd8 + i7)));
                                        i7++;
                                    }
                                    Object[] objArr4 = new Object[0];
                                    Method method3 = Class.forName(new String(iArr5, 0, i7)).getMethod(EO.Od("Q\u000f", (short) (Od.Xd() ^ (466964386 ^ (-466950794)))), new Class[0]);
                                    try {
                                        method3.setAccessible(true);
                                        ((Long) method3.invoke(pu, objArr4)).longValue();
                                        Object[] objArr5 = new Object[0];
                                        Method method4 = Class.forName(C1561oA.Qd("\u001b\bMn\u0013", (short) (ZN.Xd() ^ ((517536263 ^ 1648660654) ^ 2090615946)))).getMethod(C1593ug.zd("th", (short) (C1633zX.Xd() ^ ((450227992 ^ 1011611912) ^ (-647918469))), (short) (C1633zX.Xd() ^ ((1231805349 ^ 1746755944) ^ (-561431390)))), new Class[0]);
                                        try {
                                            method4.setAccessible(true);
                                            String str4 = (String) method4.invoke(pu, objArr5);
                                            Object[] objArr6 = new Object[0];
                                            Method method5 = Class.forName(C1561oA.od("\u0001m3Tx", (short) (C1499aX.Xd() ^ ((819616300 ^ 1917279490) ^ (-1117604056))))).getMethod(C1561oA.Kd("\u0015+", (short) (ZN.Xd() ^ ((1540644754 ^ 1376003118) ^ 164656945))), new Class[0]);
                                            try {
                                                method5.setAccessible(true);
                                                Tl.Yd(((Long) method5.invoke(pu, objArr6)).longValue(), str4);
                                            } catch (InvocationTargetException e2) {
                                                throw e2.getCause();
                                            }
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    } catch (InvocationTargetException e4) {
                                        throw e4.getCause();
                                    }
                                }
                                String strZd2 = Wg.Zd("Yxf\u0015\u0018", (short) (FB.Xd() ^ ((1177284548 ^ 808037257) ^ 1979862570)), (short) (FB.Xd() ^ ((239691112 ^ 1127535923) ^ 1300071763)));
                                String strXd = C1561oA.Xd("\u0004\u0011", (short) (FB.Xd() ^ ((1665066961 ^ 1043660716) ^ 1560967235)));
                                try {
                                    Class<?> cls5 = Class.forName(strZd2);
                                    boolean z2 = false;
                                    try {
                                        declaredMethod = cls5.getDeclaredMethod(strXd, new Class[0]);
                                    } catch (NoSuchMethodException e5) {
                                        z2 = true;
                                        declaredMethod = cls5.getDeclaredMethod(strXd, Class.forName(Wg.vd("*8/><73}4AAH:DK\u0006\u001cIIPBVS", (short) (C1633zX.Xd() ^ ((2110858118 ^ 361765176) ^ (-1749116214))))));
                                    }
                                    if (z2) {
                                        Object[] objArr7 = new Object[1];
                                        Class<?> cls6 = Class.forName(Qg.kd("r_%nN", (short) (C1607wl.Xd() ^ ((926822111 ^ 1076593152) ^ 1997917579)), (short) (C1607wl.Xd() ^ (1226140007 ^ 1226116417))));
                                        Class<?>[] clsArr = new Class[0];
                                        Object[] objArr8 = new Object[0];
                                        short sXd9 = (short) (OY.Xd() ^ ((1835008792 ^ 921073941) ^ 1535524806));
                                        short sXd10 = (short) (OY.Xd() ^ (1094534453 ^ 1094540797));
                                        int[] iArr6 = new int["Yd".length()];
                                        QB qb6 = new QB("Yd");
                                        int i8 = 0;
                                        while (qb6.YK()) {
                                            int iKK6 = qb6.KK();
                                            Xu xuXd6 = Xu.Xd(iKK6);
                                            iArr6[i8] = xuXd6.fK(sXd9 + i8 + xuXd6.CK(iKK6) + sXd10);
                                            i8++;
                                        }
                                        Method declaredMethod4 = cls6.getDeclaredMethod(new String(iArr6, 0, i8), clsArr);
                                        try {
                                            declaredMethod4.setAccessible(true);
                                            objArr7[0] = (Context) declaredMethod4.invoke(null, objArr8);
                                            declaredMethod.invoke(null, objArr7);
                                        } catch (InvocationTargetException e6) {
                                            throw e6.getCause();
                                        }
                                    } else {
                                        declaredMethod.invoke(null, new Object[0]);
                                    }
                                } catch (InvocationTargetException e7) {
                                    C1597vN.Xd(e7.getTargetException());
                                } catch (Exception e8) {
                                }
                                return true;
                            } catch (InvocationTargetException e9) {
                                throw e9.getCause();
                            }
                        } catch (InvocationTargetException e10) {
                            throw e10.getCause();
                        }
                    }
                    String strUd2 = C1561oA.ud("5\"g\u000f\u0010", (short) (C1499aX.Xd() ^ (1599922110 ^ (-1599922724))));
                    String strYd3 = C1561oA.yd("=W", (short) (C1607wl.Xd() ^ (576474018 ^ 576483544)));
                    try {
                        Class<?> cls7 = Class.forName(strUd2);
                        Field field5 = 1 != 0 ? cls7.getField(strYd3) : cls7.getDeclaredField(strYd3);
                        field5.setAccessible(true);
                        obj5 = field5.get(vx);
                    } catch (Throwable th5) {
                        obj5 = null;
                    }
                    EnumC1557nF enumC1557nF2 = (EnumC1557nF) obj5;
                    String strYd4 = C1561oA.Yd("tc+lE", (short) (ZN.Xd() ^ (229294574 ^ 229306538)));
                    String strQd = Xg.qd("%9", (short) (C1580rY.Xd() ^ (1707020775 ^ (-1707020288))), (short) (C1580rY.Xd() ^ ((452849973 ^ 33492159) ^ (-453175852))));
                    try {
                        Class<?> cls8 = Class.forName(strYd4);
                        Field field6 = 0 != 0 ? cls8.getField(strQd) : cls8.getDeclaredField(strQd);
                        field6.setAccessible(true);
                        obj6 = field6.get(null);
                    } catch (Throwable th6) {
                        obj6 = null;
                    }
                    if (enumC1557nF2 == ((EnumC1557nF) obj6)) {
                        short sXd11 = (short) (C1499aX.Xd() ^ (1893498371 ^ (-1893496027)));
                        short sXd12 = (short) (C1499aX.Xd() ^ (736817678 ^ (-736790422)));
                        int[] iArr7 = new int["!*\u001b^\u0013".length()];
                        QB qb7 = new QB("!*\u001b^\u0013");
                        int i9 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i9] = xuXd7.fK(xuXd7.CK(iKK7) - ((i9 * sXd12) ^ sXd11));
                            i9++;
                        }
                        Class<?> cls9 = Class.forName(new String(iArr7, 0, i9));
                        Class<?>[] clsArr2 = new Class[0];
                        Object[] objArr9 = new Object[0];
                        short sXd13 = (short) (C1580rY.Xd() ^ ((503741902 ^ 1494642234) ^ (-1192246053)));
                        short sXd14 = (short) (C1580rY.Xd() ^ ((2041688021 ^ 39034731) ^ (-2078412816)));
                        int[] iArr8 = new int["2[".length()];
                        QB qb8 = new QB("2[");
                        int i10 = 0;
                        while (qb8.YK()) {
                            int iKK8 = qb8.KK();
                            Xu xuXd8 = Xu.Xd(iKK8);
                            iArr8[i10] = xuXd8.fK(xuXd8.CK(iKK8) - (C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((i10 * sXd14) + sXd13)));
                            i10++;
                        }
                        Method method6 = cls9.getMethod(new String(iArr8, 0, i10), clsArr2);
                        try {
                            method6.setAccessible(true);
                            AX axWd = wd((Pu) method6.invoke(vx, objArr9), c1542jl);
                            String strUd3 = C1626yg.Ud("08\u0019C\u001a", (short) (C1580rY.Xd() ^ (1634609628 ^ (-1634618293))), (short) (C1580rY.Xd() ^ ((374226473 ^ 1773523830) ^ (-2147201092))));
                            String strWd = Ig.wd("-\u0012", (short) (Od.Xd() ^ ((621504793 ^ 1958804440) ^ (-1372307637))));
                            try {
                                Class<?> cls10 = Class.forName(strUd3);
                                Field field7 = 0 != 0 ? cls10.getField(strWd) : cls10.getDeclaredField(strWd);
                                field7.setAccessible(true);
                                obj7 = field7.get(null);
                            } catch (Throwable th7) {
                                obj7 = null;
                            }
                            IB ibXd = IB.Xd((String) obj7);
                            boolean z3 = false;
                            Iterator<C1628yp> it = axWd.kX().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C1628yp next = it.next();
                                String strOd = EO.Od("(Ey.\u0005", (short) (OY.Xd() ^ (1613343008 ^ 1613357866)));
                                String strQd2 = C1561oA.Qd("2&", (short) (C1499aX.Xd() ^ (1931265306 ^ (-1931254140))));
                                try {
                                    Class<?> cls11 = Class.forName(strOd);
                                    Field field8 = 1 != 0 ? cls11.getField(strQd2) : cls11.getDeclaredField(strQd2);
                                    field8.setAccessible(true);
                                    obj8 = field8.get(next);
                                } catch (Throwable th8) {
                                    obj8 = null;
                                }
                                if (IB.Xd((String) obj8).NX(ibXd)) {
                                    z3 = true;
                                    break;
                                }
                            }
                            if (z3) {
                                JSONObject jSONObjectZX = axWd.zX();
                                String strZd3 = C1593ug.zd("\u001f\u000eUsz", (short) (FB.Xd() ^ ((1796169599 ^ 1615109829) ^ 189505083)), (short) (FB.Xd() ^ ((1176142329 ^ 1540695868) ^ 500145686)));
                                String strOd2 = C1561oA.od("v\u0002", (short) (C1607wl.Xd() ^ ((1002022031 ^ 183116822) ^ 827569894)));
                                try {
                                    Class<?> cls12 = Class.forName(strZd3);
                                    Field field9 = 0 != 0 ? cls12.getField(strOd2) : cls12.getDeclaredField(strOd2);
                                    field9.setAccessible(true);
                                    field9.set(null, jSONObjectZX);
                                } catch (Throwable th9) {
                                }
                                Class<?> cls13 = Class.forName(C1561oA.Kd("6%l'\f", (short) (C1633zX.Xd() ^ ((1109470756 ^ 977946705) ^ (-2020284840)))));
                                Class<?>[] clsArr3 = new Class[1190069166 ^ 1190069162];
                                clsArr3[0] = Integer.TYPE;
                                clsArr3[1] = Integer.TYPE;
                                clsArr3[(1105637915 ^ 824535505) ^ 1891883976] = Integer.TYPE;
                                clsArr3[(850485556 ^ 233990217) ^ 1061357950] = Class.forName(Wg.Zd("hC?\u0005\u000f", (short) (C1580rY.Xd() ^ (1662091695 ^ (-1662117787))), (short) (C1580rY.Xd() ^ ((898363694 ^ 1867593876) ^ (-1524292915)))));
                                Object[] objArr10 = new Object[238883412 ^ 238883408];
                                objArr10[0] = Integer.valueOf(2118984408 ^ 2118984387);
                                objArr10[1] = Integer.valueOf((1805406108 ^ 149438643) ^ 1668624297);
                                objArr10[(941537476 ^ 1384074615) ^ 1784804785] = 1;
                                objArr10[(118473046 ^ 1951328029) ^ 1933649480] = axWd;
                                short sXd15 = (short) (ZN.Xd() ^ (1882439756 ^ 1882450660));
                                int[] iArr9 = new int["Vf".length()];
                                QB qb9 = new QB("Vf");
                                int i11 = 0;
                                while (qb9.YK()) {
                                    int iKK9 = qb9.KK();
                                    Xu xuXd9 = Xu.Xd(iKK9);
                                    iArr9[i11] = xuXd9.fK(xuXd9.CK(iKK9) - (sXd15 + i11));
                                    i11++;
                                }
                                Method declaredMethod5 = cls13.getDeclaredMethod(new String(iArr9, 0, i11), clsArr3);
                                try {
                                    declaredMethod5.setAccessible(true);
                                    boolean zBooleanValue = ((Boolean) declaredMethod5.invoke(null, objArr10)).booleanValue();
                                    short sXd16 = (short) (C1499aX.Xd() ^ ((1709349182 ^ 369758764) ^ (-1944625369)));
                                    int[] iArr10 = new int["\u0006t8bw".length()];
                                    QB qb10 = new QB("\u0006t8bw");
                                    int i12 = 0;
                                    while (qb10.YK()) {
                                        int iKK10 = qb10.KK();
                                        Xu xuXd10 = Xu.Xd(iKK10);
                                        iArr10[i12] = xuXd10.fK((sXd16 ^ i12) + xuXd10.CK(iKK10));
                                        i12++;
                                    }
                                    String str5 = new String(iArr10, 0, i12);
                                    String strKd = Qg.kd("U`", (short) (C1580rY.Xd() ^ ((335033694 ^ 2008134415) ^ (-1682561173))), (short) (C1580rY.Xd() ^ ((505220347 ^ 1478046025) ^ (-1174677374))));
                                    Class<?> cls14 = Class.forName(hg.Vd("ta'_B", (short) (C1580rY.Xd() ^ (30064878 ^ (-30070461))), (short) (C1580rY.Xd() ^ (780006653 ^ (-780000346)))));
                                    Class<?>[] clsArr4 = new Class[1454931399 ^ 1454931396];
                                    clsArr4[0] = Class.forName(C1561oA.ud("\u007fu\ns?|p|t:^~{qum", (short) (C1580rY.Xd() ^ ((1807392099 ^ 172441125) ^ (-1644008573)))));
                                    short sXd17 = (short) (Od.Xd() ^ (1605181914 ^ (-1605173306)));
                                    int[] iArr11 = new int["I?WA\u0011NFR>\u0004,LMCKC".length()];
                                    QB qb11 = new QB("I?WA\u0011NFR>\u0004,LMCKC");
                                    int i13 = 0;
                                    while (qb11.YK()) {
                                        int iKK11 = qb11.KK();
                                        Xu xuXd11 = Xu.Xd(iKK11);
                                        iArr11[i13] = xuXd11.fK(xuXd11.CK(iKK11) - (sXd17 ^ i13));
                                        i13++;
                                    }
                                    clsArr4[1] = Class.forName(new String(iArr11, 0, i13));
                                    clsArr4[(665758615 ^ 148321993) ^ 796499292] = Boolean.TYPE;
                                    Object[] objArr11 = new Object[1071904349 ^ 1071904350];
                                    objArr11[0] = str5;
                                    objArr11[1] = strKd;
                                    objArr11[(125705824 ^ 1091336644) ^ 1181902758] = Boolean.valueOf(zBooleanValue);
                                    Method declaredMethod6 = cls14.getDeclaredMethod(C1561oA.Yd("&<", (short) (C1607wl.Xd() ^ ((2091761196 ^ 245573216) ^ 1913574018))), clsArr4);
                                    try {
                                        declaredMethod6.setAccessible(true);
                                        declaredMethod6.invoke(null, objArr11);
                                    } catch (InvocationTargetException e11) {
                                        throw e11.getCause();
                                    }
                                } catch (InvocationTargetException e12) {
                                    throw e12.getCause();
                                }
                            } else {
                                String strQd3 = Xg.qd("\r{Cm\u0007", (short) (Od.Xd() ^ (1442453109 ^ (-1442451391))), (short) (Od.Xd() ^ ((421880288 ^ 1985818269) ^ (-1870139422))));
                                String strWd2 = Jg.Wd("n6", (short) (C1580rY.Xd() ^ (18162126 ^ (-18156659))), (short) (C1580rY.Xd() ^ (2092945978 ^ (-2092955592))));
                                try {
                                    Class<?> cls15 = Class.forName(strQd3);
                                    boolean z4 = false;
                                    try {
                                        strWd2 = cls15.getDeclaredMethod(strWd2, new Class[0]);
                                        declaredMethod2 = strWd2;
                                    } catch (NoSuchMethodException e13) {
                                        z4 = true;
                                        declaredMethod2 = cls15.getDeclaredMethod(strWd2, Class.forName(ZO.xd("&aJ]z\\~-@<W`h`\u0019p(0\u001a6\f{U", (short) (C1633zX.Xd() ^ (1766552782 ^ (-1766552963))), (short) (C1633zX.Xd() ^ (517586993 ^ (-517587479))))));
                                    }
                                    if (z4) {
                                        Object[] objArr12 = new Object[1];
                                        Class<?> cls16 = Class.forName(C1626yg.Ud("d91\u001c.", (short) (C1607wl.Xd() ^ ((520892460 ^ 1237391637) ^ 1456303044)), (short) (C1607wl.Xd() ^ (329433803 ^ 329417484))));
                                        Class<?>[] clsArr5 = new Class[0];
                                        Object[] objArr13 = new Object[0];
                                        short sXd18 = (short) (Od.Xd() ^ ((1150751307 ^ 844381194) ^ (-1992516653)));
                                        int[] iArr12 = new int["cI".length()];
                                        QB qb12 = new QB("cI");
                                        int i14 = 0;
                                        while (qb12.YK()) {
                                            int iKK12 = qb12.KK();
                                            Xu xuXd12 = Xu.Xd(iKK12);
                                            iArr12[i14] = xuXd12.fK(xuXd12.CK(iKK12) - (C1561oA.Xd[i14 % C1561oA.Xd.length] ^ (sXd18 + i14)));
                                            i14++;
                                        }
                                        Method declaredMethod7 = cls16.getDeclaredMethod(new String(iArr12, 0, i14), clsArr5);
                                        try {
                                            declaredMethod7.setAccessible(true);
                                            objArr12[0] = (Context) declaredMethod7.invoke(null, objArr13);
                                            declaredMethod2.invoke(null, objArr12);
                                        } catch (InvocationTargetException e14) {
                                            throw e14.getCause();
                                        }
                                    } else {
                                        declaredMethod2.invoke(null, new Object[0]);
                                    }
                                } catch (InvocationTargetException e15) {
                                    C1597vN.Xd(e15.getTargetException());
                                } catch (Exception e16) {
                                }
                            }
                            return true;
                        } catch (InvocationTargetException e17) {
                            throw e17.getCause();
                        }
                    }
                }
            }
            return false;
        } catch (InvocationTargetException e18) {
            throw e18.getCause();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|60|3|(6:56|4|5|59|6|(4:8|35|36|37)(10:9|10|11|12|54|13|14|(3:16|17|18)(4:19|52|20|(2:21|(1:23)(5:61|24|25|26|27)))|48|49))|43|57|44|47|(1:(0))) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long Xd(java.util.zip.CRC32 r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.KQ.Xd(java.util.zip.CRC32, java.lang.String):long");
    }

    public static String Yd() {
        return Qg.kd("\u0018\u0005", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1534147780 ^ (-790631857)))), (short) (ZN.Xd() ^ ((1467919341 ^ 2040004223) ^ 787034471)));
    }

    private static boolean Zd(PackageInfo packageInfo) {
        Object obj;
        if (packageInfo.services != null) {
            for (ServiceInfo serviceInfo : packageInfo.services) {
                if (serviceInfo.permission != null) {
                    String strVd = hg.Vd("ta'CH", (short) (C1580rY.Xd() ^ (1887792676 ^ (-1887768716))), (short) (C1580rY.Xd() ^ ((964646650 ^ 1541661654) ^ (-1654438271))));
                    String strUd = C1561oA.ud(">,", (short) (Od.Xd() ^ ((333019253 ^ 317571525) ^ (-20219544))));
                    try {
                        Class<?> cls = Class.forName(strVd);
                        Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                        field.setAccessible(true);
                        obj = field.get(null);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    if (((Set) obj).contains(serviceInfo.permission)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static long Zx() {
        return (6552896661998956126L ^ 9149953498784617182L) ^ 2597375154798271494L;
    }

    public static JSONObject getGuardData() {
        Object obj;
        String strXd = C1561oA.Xd("<+r\u0011\u0018", (short) (ZN.Xd() ^ (408313226 ^ 408304888)));
        short sXd = (short) (C1580rY.Xd() ^ ((1541265865 ^ 1683945811) ^ (-1065577950)));
        int[] iArr = new int["KX".length()];
        QB qb = new QB("KX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        return (JSONObject) obj;
    }

    public static void qd() throws Exception {
        CX.ud();
        int iXd = C1633zX.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.yd("\u0002n4PU", (short) (iXd ^ ((1839887389 ^ 1566476692) ^ (-821355059))))).getDeclaredMethod(C1561oA.Yd("'A", (short) (OY.Xd() ^ (Od.Xd() ^ (3306578 ^ 1204811738)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            short sXd = (short) (C1633zX.Xd() ^ ((1539668966 ^ 2048870144) ^ (-567949283)));
            int iXd2 = C1633zX.Xd();
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Xg.qd("wf.LS", sXd, (short) (iXd2 ^ (1202052070 ^ (-1202044127))))).getDeclaredMethod(Jg.Wd(")@", (short) (C1499aX.Xd() ^ (676482940 ^ (-676468028))), (short) (C1499aX.Xd() ^ (78700180 ^ (-78707085)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                new Kp(0, str, (String) declaredMethod2.invoke(null, objArr2)).start();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static List<VX> ud(Wd wd) throws Throwable {
        int iXd = C1607wl.Xd() ^ (394162904 ^ 2033869081);
        Class<?> cls = Class.forName(Jg.Wd("k-KgC", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (530281557 ^ (-739326335)))), (short) (C1499aX.Xd() ^ (1871677174 ^ (-1871676283)))));
        Class<?>[] clsArr = new Class[ZN.Xd() ^ (1660184528 ^ 1367234852)];
        clsArr[0] = Integer.TYPE;
        clsArr[1] = Integer.TYPE;
        clsArr[ZN.Xd() ^ 864698098] = Integer.TYPE;
        clsArr[(522702608 ^ 440052033) ^ 85812818] = Class.forName(ZO.xd("r,\u0015; ", (short) (OY.Xd() ^ (Od.Xd() ^ 1207799144)), (short) (OY.Xd() ^ (Od.Xd() ^ 1207816890))));
        Object[] objArr = new Object[Od.Xd() ^ 1207800913];
        objArr[0] = Integer.valueOf(iXd);
        objArr[1] = Integer.valueOf((659636553 ^ 1381015780) ^ 1962983723);
        objArr[(564205462 ^ 878537676) ^ 368868440] = Integer.valueOf(1680605103 ^ 1680605099);
        objArr[(234720575 ^ 535999355) ^ 302988871] = wd;
        int iXd2 = Od.Xd() ^ 1207809352;
        Method declaredMethod = cls.getDeclaredMethod(C1626yg.Ud("aq", (short) (ZN.Xd() ^ ((1025755665 ^ 507848077) ^ 593946108)), (short) (ZN.Xd() ^ iXd2)), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            Class<?> cls2 = Class.forName(Ig.wd("\u001f^5\u0014^", (short) (C1633zX.Xd() ^ ((1401386325 ^ 853850809) ^ (-1633928608)))));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (C1580rY.Xd() ^ ((1125873645 ^ 748900974) ^ (-1874356661)));
            int[] iArr = new int["$u".length()];
            QB qb = new QB("$u");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr, 0, i2), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                return (List) declaredMethod2.invoke(null, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void vd() throws Throwable {
        zd();
    }

    private static AX wd(Pu pu, C1542jl c1542jl) throws Throwable {
        AX ax = new AX();
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("CZS\u001dj", (short) (OY.Xd() ^ (1301696390 ^ 1301701567)))).getMethod(C1561oA.Qd(">R", (short) (FB.Xd() ^ ((530144203 ^ 2948721) ^ 532011526))), new Class[0]);
            try {
                method.setAccessible(true);
                ((Long) method.invoke(pu, objArr)).longValue();
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1593ug.zd("B1x\u001cB", (short) (C1607wl.Xd() ^ ((1689992661 ^ 1111070498) ^ 646091511)), (short) (C1607wl.Xd() ^ ((23339748 ^ 541938034) ^ 556337160)))).getMethod(C1561oA.od("L`", (short) (FB.Xd() ^ (1692752651 ^ 1692746601))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    long jLongValue = ((Long) method2.invoke(pu, objArr2)).longValue();
                    for (int i2 = 0; i2 < jLongValue; i2++) {
                        Object[] objArr3 = new Object[0];
                        Method method3 = Class.forName(C1561oA.Kd("D3z\u001eD", (short) (C1633zX.Xd() ^ ((1821156669 ^ 1519105044) ^ (-906455011))))).getMethod(Wg.Zd("z\u001f", (short) (C1580rY.Xd() ^ ((1426259169 ^ 521811146) ^ (-1243126849))), (short) (C1580rY.Xd() ^ ((1530650790 ^ 148461711) ^ (-1407375772)))), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            String str = (String) method3.invoke(pu, objArr3);
                            long jOY = c1542jl.oY(str);
                            long jPY = c1542jl.pY(str);
                            Object[] objArr4 = new Object[0];
                            Method method4 = Class.forName(C1561oA.Xd("E4{\u001fE", (short) (C1633zX.Xd() ^ ((468072899 ^ 21039904) ^ (-447178303))))).getMethod(Wg.vd("\u0004u", (short) (C1580rY.Xd() ^ ((1847404159 ^ 1836199831) ^ (-57632513)))), new Class[0]);
                            try {
                                method4.setAccessible(true);
                                String str2 = (String) method4.invoke(pu, objArr4);
                                List<String> arrayList = new ArrayList<>();
                                Object[] objArr5 = new Object[0];
                                Method method5 = Class.forName(Qg.kd("=*o\u00115", (short) (C1607wl.Xd() ^ ((586102474 ^ 80511459) ^ 639890936)), (short) (C1607wl.Xd() ^ ((1898769449 ^ 1746889671) ^ 422815820)))).getMethod(hg.Vd("xj", (short) (ZN.Xd() ^ ((610114991 ^ 863421549) ^ 388724915)), (short) (ZN.Xd() ^ ((1463275374 ^ 812420079) ^ 1734045567))), new Class[0]);
                                try {
                                    method5.setAccessible(true);
                                    String str3 = (String) method5.invoke(pu, objArr5);
                                    boolean zIsEmpty = str3.isEmpty();
                                    String strUd = C1561oA.ud("F", (short) (ZN.Xd() ^ ((1374344773 ^ 844507948) ^ 1673325067)));
                                    if (!zIsEmpty) {
                                        arrayList = Arrays.asList(str3.split(strUd));
                                    }
                                    List<String> arrayList2 = new ArrayList<>();
                                    Object[] objArr6 = new Object[0];
                                    Method method6 = Class.forName(C1561oA.yd("I6{\u001dA", (short) (C1607wl.Xd() ^ ((1363337182 ^ 1819254277) ^ 1026374006)))).getMethod(C1561oA.Yd("ui", (short) (FB.Xd() ^ (52603356 ^ 52620398))), new Class[0]);
                                    try {
                                        method6.setAccessible(true);
                                        String str4 = (String) method6.invoke(pu, objArr6);
                                        if (!str4.isEmpty()) {
                                            arrayList2 = Arrays.asList(str4.split(strUd));
                                        }
                                        Object[] objArr7 = new Object[0];
                                        Method method7 = Class.forName(Xg.qd("E4{\u001fE", (short) (FB.Xd() ^ ((1913476948 ^ 490215562) ^ 1865753151)), (short) (FB.Xd() ^ ((1373367732 ^ 1370537454) ^ 7022515)))).getMethod(Jg.Wd("$\u001f", (short) (C1633zX.Xd() ^ ((1595960528 ^ 2025395561) ^ (-664343321))), (short) (C1633zX.Xd() ^ ((658661216 ^ 222171878) ^ (-712789062)))), new Class[0]);
                                        try {
                                            method7.setAccessible(true);
                                            ax.VX(str, jOY, jPY, (String) method7.invoke(pu, objArr7), str2, arrayList2, arrayList);
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
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        } catch (Exception e9) {
        }
        return ax;
    }

    public static ZipEntry yd(ZipInputStream zipInputStream, String str) throws Throwable {
        ZipEntry nextEntry;
        Object[] objArr;
        Method method;
        do {
            nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return nextEntry;
            }
            int iXd = C1499aX.Xd();
            objArr = new Object[0];
            method = Class.forName(Wg.vd("G?Q=\u000fWSIA\u0004M=I\b1A=\u00139@CK", (short) (iXd ^ (1775159835 ^ (-1775149582))))).getMethod(Qg.kd("$!/\b\u001a%\u001c", (short) (C1607wl.Xd() ^ (452577722 ^ 452561383)), (short) (C1607wl.Xd() ^ ((592094788 ^ 2143241430) ^ 1559613349))), new Class[0]);
            try {
                method.setAccessible(true);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } while (!((String) method.invoke(nextEntry, objArr)).equals(str));
        return nextEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.reflect.Method] */
    public static void zd() throws Throwable {
        Method declaredMethod;
        Object obj;
        Object obj2;
        Object obj3;
        Object[] objArr;
        Constructor<?> constructor;
        if (hg.Qd()) {
            return;
        }
        short sXd = (short) (FB.Xd() ^ (626264825 ^ 626283330));
        int[] iArr = new int["[J\u0012]?".length()];
        QB qb = new QB("[J\u0012]?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr2 = new Object[0];
        Method declaredMethod2 = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Xg.qd("Q^", (short) (OY.Xd() ^ ((878462506 ^ 343975950) ^ 551334307)), (short) (OY.Xd() ^ (C1607wl.Xd() ^ (1958277915 ^ 452771679)))), new Class[0]);
        try {
            declaredMethod2.setAccessible(true);
            List<PackageInfo> listXd = C1636zl.Xd((Context) declaredMethod2.invoke(null, objArr2));
            CRC32 crc32 = new CRC32();
            short sXd2 = (short) (FB.Xd() ^ (936508977 ^ 936489894));
            short sXd3 = (short) (FB.Xd() ^ (85536100 ^ 85527846));
            int[] iArr2 = new int["c\u001ao\r|".length()];
            QB qb2 = new QB("c\u001ao\r|");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                i3++;
            }
            Object[] objArr3 = new Object[0];
            Method declaredMethod3 = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(ZO.xd("\u0011\u001c", (short) (C1607wl.Xd() ^ ((1526141017 ^ 1624482515) ^ 975502888)), (short) (C1607wl.Xd() ^ ((905212779 ^ 1420255883) ^ 1632840135))), new Class[0]);
            try {
                declaredMethod3.setAccessible(true);
                Context context = (Context) declaredMethod3.invoke(null, objArr3);
                Class<?> cls = Class.forName(C1626yg.Ud("\u0011_\bGE\u0006EZB]F`+qpoHJq]L\u000b\u0001", (short) (C1607wl.Xd() ^ ((1474647901 ^ 217458634) ^ 1527991195)), (short) (C1607wl.Xd() ^ (1122763270 ^ 1122765027))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr4 = new Object[0];
                short sXd4 = (short) (FB.Xd() ^ (1117999905 ^ 1117990958));
                int[] iArr3 = new int["<lk&Dq[7v&\u000bB\u0004s".length()];
                QB qb3 = new QB("<lk&Dq[7v&\u000bB\u0004s");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                    i4++;
                }
                Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    method.setAccessible(true);
                    String str = (String) method.invoke(context, objArr4);
                    C1542jl c1542jl = new C1542jl();
                    for (PackageInfo packageInfo : listXd) {
                        if (!packageInfo.packageName.equals(str)) {
                            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                            String strOd = EO.Od("|S[\r\u0013:\u0005ffC@(gjx\u0011(\u000b\u0014r\\%rshNDiU'aeE5", (short) (C1499aX.Xd() ^ ((1973017499 ^ 21578975) ^ (-1959842315))));
                            String strQd = C1561oA.Qd("{v{wghFjr", (short) (C1633zX.Xd() ^ (653160245 ^ (-653161181))));
                            try {
                                Class<?> cls2 = Class.forName(strOd);
                                Field field = 1 != 0 ? cls2.getField(strQd) : cls2.getDeclaredField(strQd);
                                field.setAccessible(true);
                                obj = field.get(applicationInfo);
                            } catch (Throwable th) {
                                obj = null;
                            }
                            File file = new File((String) obj);
                            if (file.exists()) {
                                HashSet hashSet = new HashSet();
                                if (packageInfo.requestedPermissions != null) {
                                    hashSet.addAll(Arrays.asList(packageInfo.requestedPermissions));
                                }
                                try {
                                    ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                                    String strZd = C1593ug.zd(")7.=;62|3@@G9CJ\u0005HF\b\u001cLMJHCBVLSS/UNX", (short) (C1499aX.Xd() ^ (1499345818 ^ (-1499333001))), (short) (C1499aX.Xd() ^ ((968401352 ^ 2060223491) ^ (-1131705962))));
                                    String strOd2 = C1561oA.od("fjV_[TC^c_OP.RZ", (short) (C1499aX.Xd() ^ (655994457 ^ (-656010484))));
                                    try {
                                        Class<?> cls3 = Class.forName(strZd);
                                        Field field2 = 1 != 0 ? cls3.getField(strOd2) : cls3.getDeclaredField(strOd2);
                                        field2.setAccessible(true);
                                        obj3 = field2.get(applicationInfo2);
                                    } catch (Throwable th2) {
                                        obj3 = null;
                                    }
                                    String str2 = (String) obj3;
                                    Class<?> cls4 = Class.forName(C1561oA.Kd("\u0004{\u0012}K\u0014\u0014\n\u000eP\u001e\u000e\u0016T\u0002\u0012\u001ap\u0015\u0019\u0013", (short) (ZN.Xd() ^ (517981015 ^ 517989692))));
                                    Class<?>[] clsArr2 = new Class[1];
                                    clsArr2[0] = Class.forName(Wg.Zd("\u0015\u0015\u0003F4;\t/\t\u0018VP//\r^", (short) (C1580rY.Xd() ^ ((1240827454 ^ 555930316) ^ (-1758940241))), (short) (C1580rY.Xd() ^ ((375353101 ^ 273673620) ^ (-101752199)))));
                                    objArr = new Object[]{str2};
                                    constructor = cls4.getConstructor(clsArr2);
                                } catch (IOException e2) {
                                }
                                try {
                                    constructor.setAccessible(true);
                                    ZipFile zipFile = (ZipFile) constructor.newInstance(objArr);
                                    short sXd5 = (short) (FB.Xd() ^ ((1014148148 ^ 653997487) ^ 445239483));
                                    int[] iArr4 = new int["!OFUSNJ4IWSQQ`b\u001dh^^".length()];
                                    QB qb4 = new QB("!OFUSNJ4IWSQQ`b\u001dh^^");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 + i5));
                                        i5++;
                                    }
                                    String str3 = new String(iArr4, 0, i5);
                                    Class<?> cls5 = Class.forName(Wg.vd("\u0017\r%\u000f^%'\u001b\u0011Q!\u000f\u0019U\u0005\u0013\ra\b\n\u0006", (short) (Od.Xd() ^ ((981079638 ^ 1724884202) ^ (-1555431313)))));
                                    Class<?>[] clsArr3 = new Class[1];
                                    clsArr3[0] = Class.forName(Qg.kd("8.B,w5)5-r\u001774*.&", (short) (ZN.Xd() ^ (226601162 ^ 226608902)), (short) (ZN.Xd() ^ ((1841208900 ^ 537457004) ^ 1303788552))));
                                    Object[] objArr5 = {str3};
                                    Method method2 = cls5.getMethod(hg.Vd("-*8\b0528", (short) (C1580rY.Xd() ^ ((661270755 ^ 472986981) ^ (-995849310))), (short) (C1580rY.Xd() ^ (654919528 ^ (-654922706)))), clsArr3);
                                    try {
                                        method2.setAccessible(true);
                                        ZipEntry zipEntry = (ZipEntry) method2.invoke(zipFile, objArr5);
                                        Class<?> cls6 = Class.forName(C1561oA.ud("#\u0019-\u0017b)'\u001b\u001d])\u0017\u001dY\u0005\u0013\u0019m\u0010\u0012\n", (short) (Od.Xd() ^ (1137870046 ^ (-1137871884)))));
                                        Class<?>[] clsArr4 = new Class[1];
                                        clsArr4[0] = Class.forName(C1561oA.yd(" \u0018*\u0016g0,\"*l6&2p\u001a*6\f29<D", (short) (ZN.Xd() ^ ((1641552020 ^ 1129026109) ^ 580107771))));
                                        Object[] objArr6 = {zipEntry};
                                        short sXd6 = (short) (C1499aX.Xd() ^ (773698788 ^ (-773692737)));
                                        int[] iArr5 = new int["hgwMsv||\\~}qn{".length()];
                                        QB qb5 = new QB("hgwMsv||\\~}qn{");
                                        int i6 = 0;
                                        while (qb5.YK()) {
                                            int iKK5 = qb5.KK();
                                            Xu xuXd5 = Xu.Xd(iKK5);
                                            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd6 + sXd6) + sXd6) + i6));
                                            i6++;
                                        }
                                        Method method3 = cls6.getMethod(new String(iArr5, 0, i6), clsArr4);
                                        try {
                                            method3.setAccessible(true);
                                            InputStream inputStream = (InputStream) method3.invoke(zipFile, objArr6);
                                            byte[] bArr = new byte[inputStream.available()];
                                            inputStream.read(bArr);
                                            Object[] objArr7 = {bArr};
                                            Method declaredMethod4 = Class.forName(Xg.qd("gV\u001eYY", (short) (FB.Xd() ^ ((1283216599 ^ 832497980) ^ 2112008557)), (short) (FB.Xd() ^ ((1923980528 ^ 1800347599) ^ 434292017)))).getDeclaredMethod(Jg.Wd("ug", (short) (C1607wl.Xd() ^ ((262775801 ^ 937000796) ^ 946920711)), (short) (C1607wl.Xd() ^ ((1039190976 ^ 213707616) ^ 827081400))), byte[].class);
                                            try {
                                                declaredMethod4.setAccessible(true);
                                                hashSet.addAll((Set) declaredMethod4.invoke(null, objArr7));
                                                if (Zd(packageInfo) || C1600vl.Yd(hashSet)) {
                                                    if (packageInfo.packageName.startsWith(ZO.xd("qwd-\u0001\u001d\u001c%(b;un\u0007Tf\u0013\u0006B", (short) (Od.Xd() ^ ((2018073737 ^ 313013321) ^ (-1793142350))), (short) (Od.Xd() ^ ((1221672365 ^ 2076240298) ^ (-856812589)))))) {
                                                        HashSet hashSet2 = new HashSet();
                                                        if (packageInfo.requestedPermissions != null) {
                                                            hashSet2.addAll(Arrays.asList(packageInfo.requestedPermissions));
                                                        }
                                                        if (hashSet2.size() != 1 || !hashSet2.contains(C1626yg.Ud(">as\u0002\"o~\u001b<g@A12Iicg\u0003\u0010S\u0007\"\u000ed:\u0013\u0019j211\u0007Q\u0004n\u0014", (short) (OY.Xd() ^ (1147458089 ^ 1147468369)), (short) (OY.Xd() ^ (414587783 ^ 414598788))))) {
                                                        }
                                                    }
                                                    ApplicationInfo applicationInfo3 = packageInfo.applicationInfo;
                                                    String strWd = Ig.wd("\u001ccK2n3Z$6\u0013\u0018{9<&>GzbmZ\u001641T^\u000f/s\u007f\u0007I]\u0014", (short) (C1607wl.Xd() ^ (1257221845 ^ 1257224352)));
                                                    String strOd3 = EO.Od("=\n\u001e7W\u0016Lj\"", (short) (OY.Xd() ^ (46225545 ^ 46219545)));
                                                    try {
                                                        Class<?> cls7 = Class.forName(strWd);
                                                        Field field3 = 1 != 0 ? cls7.getField(strOd3) : cls7.getDeclaredField(strOd3);
                                                        field3.setAccessible(true);
                                                        obj2 = field3.get(applicationInfo3);
                                                    } catch (Throwable th3) {
                                                        obj2 = null;
                                                    }
                                                    c1542jl.QY(packageInfo.packageName, file.length(), Xd(crc32, (String) obj2));
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
                        }
                    }
                    try {
                        if (Ud(c1542jl)) {
                            return;
                        }
                    } catch (Exception e7) {
                    }
                    String strQd2 = C1561oA.Qd("Q>\u0004,C", (short) (ZN.Xd() ^ ((741613933 ^ 925050959) ^ 454499288)));
                    String strZd2 = C1593ug.zd("DQ", (short) (Od.Xd() ^ (1365741100 ^ (-1365749034))), (short) (Od.Xd() ^ (1179966019 ^ (-1179947393))));
                    try {
                        Class<?> cls8 = Class.forName(strQd2);
                        boolean z2 = false;
                        try {
                            strZd2 = cls8.getDeclaredMethod(strZd2, new Class[0]);
                            declaredMethod = strZd2;
                        } catch (NoSuchMethodException e8) {
                            z2 = true;
                            declaredMethod = cls8.getDeclaredMethod(strZd2, Class.forName(C1561oA.od("u\u0002v\u0004\u007fxr;ozx}muz3Grpuewr", (short) (C1499aX.Xd() ^ ((200747157 ^ 1626900056) ^ (-1796202621))))));
                        }
                        if (!z2) {
                            declaredMethod.invoke(null, new Object[0]);
                            return;
                        }
                        Object[] objArr8 = new Object[1];
                        Object[] objArr9 = new Object[0];
                        Method declaredMethod5 = Class.forName(C1561oA.Kd("-\u001cc/\u0011", (short) (C1633zX.Xd() ^ (2104428611 ^ (-2104446192))))).getDeclaredMethod(Wg.Zd("!S", (short) (C1633zX.Xd() ^ ((1327299094 ^ 925352806) ^ (-2017162531))), (short) (C1633zX.Xd() ^ (1477529333 ^ (-1477540287)))), new Class[0]);
                        try {
                            declaredMethod5.setAccessible(true);
                            objArr8[0] = (Context) declaredMethod5.invoke(null, objArr9);
                            declaredMethod.invoke(null, objArr8);
                        } catch (InvocationTargetException e9) {
                            throw e9.getCause();
                        }
                    } catch (InvocationTargetException e10) {
                        C1597vN.Xd(e10.getTargetException());
                    } catch (Exception e11) {
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
    }
}
