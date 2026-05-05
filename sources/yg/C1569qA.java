package yg;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yg.qA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1569qA {
    public static String Kd() {
        return C1561oA.yd("\u0010\u001c", (short) (Od.Xd() ^ ((951758551 ^ 1100821670) ^ (-2032631946))));
    }

    public static String Xd() {
        short sXd = (short) (C1580rY.Xd() ^ ((1559778429 ^ 1024239683) ^ (-1643417811)));
        int[] iArr = new int["\u0014\u0001F\tW".length()];
        QB qb = new QB("\u0014\u0001F\tW");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.reflect.Method] */
    public static void Yd() throws Throwable {
        Method declaredMethod;
        if (hg.Qd()) {
            return;
        }
        if (!Tg.wd()) {
            String strZd = C1593ug.zd("eT\u001cF_", (short) (OY.Xd() ^ (1130670248 ^ 1130663607)), (short) (OY.Xd() ^ ((753714931 ^ 1083381636) ^ 1820305970)));
            String strOd = C1561oA.od(".9", (short) (FB.Xd() ^ (OY.Xd() ^ 69945581)));
            try {
                Class<?> cls = Class.forName(strZd);
                boolean z2 = false;
                try {
                    strOd = cls.getDeclaredMethod(strOd, new Class[0]);
                    declaredMethod = strOd;
                } catch (NoSuchMethodException e2) {
                    z2 = true;
                    declaredMethod = cls.getDeclaredMethod(strOd, Class.forName(C1561oA.Kd("P^Udb]Y$Zggn`jq,Boovh|y", (short) (C1499aX.Xd() ^ ((1341453453 ^ 1037500858) ^ (-1914946734))))));
                }
                if (!z2) {
                    declaredMethod.invoke(null, new Object[0]);
                    return;
                }
                Object[] objArr = new Object[1];
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(Wg.Zd("%|\u0005:\\", (short) (OY.Xd() ^ (1358601456 ^ 1358623390)), (short) (OY.Xd() ^ (556512560 ^ 556511436)))).getDeclaredMethod(C1561oA.Xd("&3", (short) (OY.Xd() ^ ((2017574309 ^ 410143219) ^ 1613993028))), new Class[0]);
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
        int iXd = ZN.Xd() ^ (235052539 ^ 1032364843);
        Class<?> cls2 = Class.forName(C1561oA.Yd("\u0012\u0001H\u0003g", (short) (FB.Xd() ^ (OY.Xd() ^ (285401603 ^ 355042655)))));
        Class<?>[] clsArr = new Class[C1580rY.Xd() ^ (-831067166)];
        clsArr[0] = Integer.TYPE;
        clsArr[1] = Integer.TYPE;
        clsArr[FB.Xd() ^ 1609527089] = Integer.TYPE;
        Object[] objArr3 = new Object[C1633zX.Xd() ^ (1475053098 ^ (-599450142))];
        objArr3[0] = Integer.valueOf(iXd);
        objArr3[1] = Integer.valueOf(1787622792 ^ 1787391677);
        objArr3[1090601260 ^ 1090601262] = 1;
        int iXd2 = ZN.Xd() ^ (211317002 ^ 1058149896);
        int iXd3 = ZN.Xd() ^ (85713807 ^ 915521211);
        short sXd = (short) (FB.Xd() ^ iXd2);
        short sXd2 = (short) (FB.Xd() ^ iXd3);
        int[] iArr = new int["\u0017\u0004".length()];
        QB qb = new QB("\u0017\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Method declaredMethod3 = cls2.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod3.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod3.invoke(null, objArr3)).booleanValue();
            short sXd3 = (short) (C1499aX.Xd() ^ (66045057 ^ (-66058411)));
            short sXd4 = (short) (C1499aX.Xd() ^ ((1540874923 ^ 563990419) ^ (-2051670295)));
            int[] iArr2 = new int["i\r\u000e^1".length()];
            QB qb2 = new QB("i\r\u000e^1");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            String str = new String(iArr2, 0, i3);
            String strXd = ZO.xd("8\u000e", (short) (OY.Xd() ^ (1986411185 ^ 1986397227)), (short) (OY.Xd() ^ ((2030521317 ^ 1108372334) ^ 991385234)));
            Class<?> cls3 = Class.forName(C1626yg.Ud("bB\u0006Dk", (short) (OY.Xd() ^ ((817488780 ^ 281217175) ^ 544906027)), (short) (OY.Xd() ^ ((133201636 ^ 1922329143) ^ 1969519410))));
            Class<?>[] clsArr2 = new Class[(1385618991 ^ 244942963) ^ 1544509023];
            clsArr2[0] = Class.forName(Ig.wd("5S\u001b)&\b\u001dY\bBeh\u0014\r\u000el", (short) (C1633zX.Xd() ^ (892077241 ^ (-892081751)))));
            short sXd5 = (short) (ZN.Xd() ^ ((1620125697 ^ 1141148133) ^ 613808248));
            int[] iArr3 = new int["q:\u001ddaLi\u001fvMl4|qb}".length()];
            QB qb3 = new QB("q:\u001ddaLi\u001fvMl4|qb}");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i4)) + xuXd3.CK(iKK3));
                i4++;
            }
            clsArr2[1] = Class.forName(new String(iArr3, 0, i4));
            clsArr2[1694186341 ^ 1694186343] = Boolean.TYPE;
            Object[] objArr4 = new Object[(134307260 ^ 1938599073) ^ 2072899870];
            objArr4[0] = str;
            objArr4[1] = strXd;
            objArr4[(800421527 ^ 1518168340) ^ 1976049537] = Boolean.valueOf(zBooleanValue);
            Method declaredMethod4 = cls3.getDeclaredMethod(C1561oA.Qd("\u0019-", (short) (C1633zX.Xd() ^ (1293723885 ^ (-1293717634)))), clsArr2);
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
}
