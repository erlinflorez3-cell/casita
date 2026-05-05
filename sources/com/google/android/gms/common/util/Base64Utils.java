package com.google.android.gms.common.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class Base64Utils {
    public static byte[] decode(String str) throws Throwable {
        if (str == null) {
            return null;
        }
        short sXd = (short) (FB.Xd() ^ 5028);
        int[] iArr = new int["=z\u0015HW\u0007S\u001f\nJ7^Ogt.U>V".length()];
        QB qb = new QB("=z\u0015HW\u0007S\u001f\nJ7^Ogt.U>V");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[2];
        short sXd2 = (short) (C1633zX.Xd() ^ (-1923));
        int[] iArr2 = new int["mcwa-j^jb(Lli_c[".length()];
        QB qb2 = new QB("mcwa-j^jb(Lli_c[");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {str, 0};
        Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("%'&3)+", (short) (FB.Xd() ^ 10940), (short) (FB.Xd() ^ 20884)), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static byte[] decodeUrlSafe(String str) throws Throwable {
        if (str == null) {
            return null;
        }
        Object[] objArr = {str, 10};
        Method declaredMethod = Class.forName(C1561oA.od("P\\Q^ZSM\u0016\\ZNP\u0011$BSD\u0014\u0011", (short) (OY.Xd() ^ 4336))).getDeclaredMethod(Wg.Zd("zXAD$\f", (short) (ZN.Xd() ^ 1543), (short) (ZN.Xd() ^ 1933)), Class.forName(C1561oA.Kd(")!7#p0&4.u\u001c>=5;5", (short) (C1607wl.Xd() ^ 8418))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static byte[] decodeUrlSafeNoPadding(String str) throws Throwable {
        if (str == null) {
            return null;
        }
        Object[] objArr = {str, 11};
        Method declaredMethod = Class.forName(C1561oA.Xd("kyp\u007f}xt?\b\b}\u0002DYy\r\u007fQP", (short) (C1499aX.Xd() ^ (-1368)))).getDeclaredMethod(Qg.kd("^^[fZZ", (short) (OY.Xd() ^ 28372), (short) (OY.Xd() ^ 19743)), Class.forName(Wg.vd("tl\u0003n4siwi1Wyphnh", (short) (C1607wl.Xd() ^ 17161))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String encode(byte[] bArr) throws Throwable {
        if (bArr == null) {
            return null;
        }
        short sXd = (short) (FB.Xd() ^ 9424);
        short sXd2 = (short) (FB.Xd() ^ 1567);
        int[] iArr = new int["eqfsohb+qoce&9WhY)&".length()];
        QB qb = new QB("eqfsohb+qoce&9WhY)&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Object[] objArr = {bArr, 0};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.ud("ai]h\\\\JdGgdZ^V", (short) (ZN.Xd() ^ 19819)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String encodeUrlSafe(byte[] bArr) throws Throwable {
        if (bArr == null) {
            return null;
        }
        Object[] objArr = {bArr, 10};
        Method declaredMethod = Class.forName(C1561oA.yd("dpivvom6\u0001~vx=Pr\u0004X()", (short) (C1607wl.Xd() ^ 23467))).getDeclaredMethod(C1561oA.Yd("lvlyoqa}b\u0005\u0004{\u0002{", (short) (C1580rY.Xd() ^ (-5194))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String encodeUrlSafeNoPadding(byte[] bArr) throws Throwable {
        if (bArr == null) {
            return null;
        }
        short sXd = (short) (Od.Xd() ^ (-20358));
        short sXd2 = (short) (Od.Xd() ^ (-29443));
        int[] iArr = new int["\u007f\u000e\u0005\u0014\u0012\r\tS\u001c\u001c\u0012\u0016Xm\u000e!\u0014ed".length()];
        QB qb = new QB("\u007f\u000e\u0005\u0014\u0012\r\tS\u001c\u001c\u0012\u0016Xm\u000e!\u0014ed");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
        Object[] objArr = {bArr, 11};
        short sXd3 = (short) (ZN.Xd() ^ 15043);
        short sXd4 = (short) (ZN.Xd() ^ 29903);
        int[] iArr2 = new int["!\u0018S6\u0012a\u0017\tS3\beAx".length()];
        QB qb2 = new QB("!\u0018S6\u0012a\u0017\tS3\beAx");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
