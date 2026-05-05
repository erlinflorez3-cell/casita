package yg;

import android.content.Context;
import dalvik.system.VMDebug;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class OA {
    public static String Kd() {
        short sXd = (short) (C1499aX.Xd() ^ ((653098256 ^ 661220676) ^ (-25450705)));
        int[] iArr = new int["P\r".length()];
        QB qb = new QB("P\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String Xd() {
        return C1626yg.Ud("\u0019ma+\u0002", (short) (C1607wl.Xd() ^ (1149389540 ^ 1149398782)), (short) (C1607wl.Xd() ^ ((1370441164 ^ 1564489575) ^ 217011722)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.reflect.Method] */
    public static void Yd() throws Throwable {
        Method declaredMethod;
        if (hg.Qd()) {
            return;
        }
        if (!(Qg.vd() || Jg.qd() || Xg.Od())) {
            String strKd = Qg.kd("WD\n2I", (short) (C1607wl.Xd() ^ (203533427 ^ 203547626)), (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831094306))));
            String strVd = hg.Vd("\u0006\u0011", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134258522))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (192697736 ^ (-2133671833)))));
            try {
                Class<?> cls = Class.forName(strKd);
                boolean z2 = false;
                try {
                    strVd = cls.getDeclaredMethod(strVd, new Class[0]);
                    declaredMethod = strVd;
                } catch (NoSuchMethodException e2) {
                    z2 = true;
                    declaredMethod = cls.getDeclaredMethod(strVd, Class.forName(C1561oA.ud("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e", (short) (OY.Xd() ^ (1166658772 ^ 1166647871)))));
                }
                if (!z2) {
                    declaredMethod.invoke(null, new Object[0]);
                    return;
                }
                Object[] objArr = new Object[1];
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.yd("=,s?!", (short) (FB.Xd() ^ ((462722506 ^ 1638828719) ^ 2050653694)))).getDeclaredMethod(C1561oA.Yd("\u0006\u0013", (short) (ZN.Xd() ^ (1884283426 ^ 1884290329))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    objArr[0] = (Context) declaredMethod2.invoke(null, objArr2);
                    declaredMethod.invoke(null, objArr);
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
        int i2 = 1443533992 ^ 1443533994;
        int i3 = 1253700763 ^ 1253924685;
        short sXd = (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951471561));
        int[] iArr = new int["I\b\u001c>A".length()];
        QB qb = new QB("I\b\u001c>A");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + i4)) + xuXd.CK(iKK));
            i4++;
        }
        Class<?> cls2 = Class.forName(new String(iArr, 0, i4));
        Class<?>[] clsArr = new Class[OY.Xd() ^ 69929195];
        clsArr[0] = Integer.TYPE;
        clsArr[1] = Integer.TYPE;
        clsArr[(1937325625 ^ 506612696) ^ 1833661923] = Integer.TYPE;
        Object[] objArr3 = new Object[(1683269861 ^ 570081903) ^ 1169058441];
        objArr3[0] = Integer.valueOf(i2);
        objArr3[1] = Integer.valueOf(i3);
        objArr3[(678495285 ^ 1151215839) ^ 1827613928] = 1;
        Method declaredMethod3 = cls2.getDeclaredMethod(C1561oA.Qd("M8", (short) (OY.Xd() ^ (Od.Xd() ^ (1667007698 ^ 614546419)))), clsArr);
        try {
            declaredMethod3.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod3.invoke(null, objArr3)).booleanValue();
            String strZd = C1593ug.zd("\u0015\u0004Kqx", (short) (Od.Xd() ^ (1332612130 ^ (-1332616266))), (short) (Od.Xd() ^ ((757641786 ^ 874908128) ^ (-420393199))));
            short sXd2 = (short) (C1607wl.Xd() ^ (176153011 ^ 176142633));
            int[] iArr2 = new int["B4".length()];
            QB qb2 = new QB("B4");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(sXd2 + sXd2 + i5 + xuXd2.CK(iKK2));
                i5++;
            }
            String str = new String(iArr2, 0, i5);
            Class<?> cls3 = Class.forName(C1561oA.Kd("}l4nS", (short) (ZN.Xd() ^ ((628585854 ^ 65861089) ^ 647757714))));
            Class<?>[] clsArr2 = new Class[1150416756 ^ 1150416759];
            clsArr2[0] = Class.forName(Wg.Zd("^\u0013EN@\u0019/^xY$c~\u0018>Q", (short) (C1499aX.Xd() ^ ((542365257 ^ 462996691) ^ (-1003187016))), (short) (C1499aX.Xd() ^ ((1048904838 ^ 699838133) ^ (-389279168)))));
            clsArr2[1] = Class.forName(C1561oA.Xd("xp\u0007r@\u007fu\u0004}Ek\u000e\r\u0005\u000b\u0005", (short) (ZN.Xd() ^ (798837467 ^ 798826003))));
            clsArr2[(1624976113 ^ 1995099473) ^ 372369314] = Boolean.TYPE;
            Object[] objArr4 = new Object[848272357 ^ 848272358];
            objArr4[0] = strZd;
            objArr4[1] = str;
            objArr4[917502438 ^ 917502436] = Boolean.valueOf(zBooleanValue);
            Method declaredMethod4 = cls3.getDeclaredMethod(Wg.vd("Qg", (short) (OY.Xd() ^ (1000401442 ^ 1000386089))), clsArr2);
            try {
                declaredMethod4.setAccessible(true);
                declaredMethod4.invoke(null, objArr4);
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    public static boolean wd() {
        return VMDebug.isDebuggerConnected();
    }
}
