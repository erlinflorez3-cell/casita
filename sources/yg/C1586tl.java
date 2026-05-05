package yg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/* JADX INFO: renamed from: yg.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1586tl {
    private static boolean Kd = false;
    private static String Xd = null;

    static {
        short sXd = (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849961915)));
        int[] iArr = new int["\fx>\u0004z".length()];
        QB qb = new QB("\fx>\u0004z");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Kd("M=", (short) (ZN.Xd() ^ ((1256563930 ^ 1317512738) ^ 73546341))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            short sXd2 = (short) (C1607wl.Xd() ^ ((1269575485 ^ 153644484) ^ 1115948448));
            short sXd3 = (short) (C1607wl.Xd() ^ (423356119 ^ 423350962));
            int[] iArr2 = new int["LCxnU".length()];
            QB qb2 = new QB("LCxnU");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            String strXd = C1561oA.Xd("'4", (short) (C1633zX.Xd() ^ (551009410 ^ (-551015428))));
            try {
                Class<?> cls = Class.forName(str2);
                Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                field.setAccessible(true);
                field.set(null, str);
            } catch (Throwable th) {
            }
            String strVd = Wg.vd("7&m5&", (short) (C1607wl.Xd() ^ (716312968 ^ 716325225)));
            String strKd = Qg.kd("\n\"", (short) (C1499aX.Xd() ^ (1654613734 ^ (-1654598848))), (short) (C1499aX.Xd() ^ ((1132058969 ^ 797094249) ^ (-1828396446))));
            try {
                Class<?> cls2 = Class.forName(strVd);
                Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                field2.setAccessible(true);
                field2.set(null, false);
            } catch (Throwable th2) {
            }
            short sXd4 = (short) (ZN.Xd() ^ (1925352633 ^ 1925353065));
            short sXd5 = (short) (ZN.Xd() ^ (1556988541 ^ 1556987899));
            int[] iArr3 = new int["bO\u0015ZQ".length()];
            QB qb3 = new QB("bO\u0015ZQ");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                i4++;
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(new String(iArr3, 0, i4)).getDeclaredMethod(C1561oA.ud("p{", (short) (OY.Xd() ^ ((659089783 ^ 1379952350) ^ 1963517408))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(null, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private C1586tl() {
    }

    public static native boolean CoKuexwp();

    public static native boolean DOeVLrk(String str);

    public static native void ETOrBjV();

    public static native Set HokoIl(byte[] bArr);

    public static native boolean IzHHP(long j2);

    public static native void KNMGT();

    public static native boolean NRqnXbf();

    public static native long PiVsN();

    public static native long SIlDg(long j2);

    public static native void TYmfev();

    public static native void UGzxlZSL();

    public static native void UIROamau();

    private static synchronized void Xd() {
        Object obj;
        Object obj2;
        short sXd = (short) (C1633zX.Xd() ^ (1954157740 ^ (-1954165443)));
        int[] iArr = new int["YH\fSP".length()];
        QB qb = new QB("YH\fSP");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strYd = C1561oA.Yd("Oi", (short) (FB.Xd() ^ ((1950676244 ^ 446986016) ^ 1860231030)));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        if (!((Boolean) obj).booleanValue()) {
            String strQd = Xg.qd("\u0006t<\u0004|", (short) (C1580rY.Xd() ^ ((1243532180 ^ 70949268) ^ (-1311008354))), (short) (C1580rY.Xd() ^ ((1689856959 ^ 997311691) ^ (-1606987491))));
            String strWd = Jg.Wd("\u0012\u0015", (short) (OY.Xd() ^ (747949896 ^ 747935414)), (short) (OY.Xd() ^ (1741845833 ^ 1741833449)));
            try {
                Class<?> cls2 = Class.forName(strQd);
                Field field2 = 0 != 0 ? cls2.getField(strWd) : cls2.getDeclaredField(strWd);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            Object[] objArr = {(String) obj2};
            Method declaredMethod = Class.forName(ZO.xd("\u001dV>ra", (short) (C1633zX.Xd() ^ (477353009 ^ (-477355714))), (short) (C1633zX.Xd() ^ ((73252549 ^ 2082284854) ^ (-2017520829))))).getDeclaredMethod(Ig.wd("'\u0002", (short) (C1607wl.Xd() ^ (1012864525 ^ 1012880763))), Class.forName(C1626yg.Ud("\u0005wN\u0003\u001b\u0001FXbc{ 8\u0001Da", (short) (Od.Xd() ^ ((1398807911 ^ 546643449) ^ (-1945439383))), (short) (Od.Xd() ^ ((747215145 ^ 998390975) ^ (-386638662))))));
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                String strOd = EO.Od("Zv-RK", (short) (Od.Xd() ^ ((843866099 ^ 1426330346) ^ (-1732784404))));
                String strQd2 = C1561oA.Qd("Sk", (short) (C1580rY.Xd() ^ ((1988797973 ^ 40002068) ^ (-1961402609))));
                try {
                    Class<?> cls3 = Class.forName(strOd);
                    Field field3 = 0 != 0 ? cls3.getField(strQd2) : cls3.getDeclaredField(strQd2);
                    field3.setAccessible(true);
                    field3.set(null, true);
                } catch (Throwable th3) {
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public static String YH() {
        return C1593ug.zd("\u001a\r\u001d\u001f\u0015\u0012#\u001e\u001e*\u001b", (short) (C1607wl.Xd() ^ (2063215177 ^ 2063236522)), (short) (C1607wl.Xd() ^ (698314127 ^ 698303292)));
    }

    public static native boolean aOGRK();

    public static native String hZevq(int i2);

    public static native void iOC();

    public static native long kMMrU();

    public static native void kpw();

    public static native long lxfdwg(Method method);

    public static native byte[] tWUPGWB(long j2, int i2);

    public static native long tddJvGb(long j2, long j3, long j4);

    public static native long vDElteV(long j2);
}
