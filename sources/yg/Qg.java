package yg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes9.dex */
public class Qg {
    public static void Kd(Wd wd) {
        XF.Xd(wd);
    }

    public static String Xd(String str) throws Throwable {
        FileInputStream fileInputStream;
        Object obj;
        String strKd = Tl.Kd(str);
        if (strKd != null) {
            return strKd;
        }
        short sXd = (short) (Od.Xd() ^ (Od.Xd() ^ (-1207814320)));
        int[] iArr = new int[";(m7\u0017".length()];
        QB qb = new QB(";(m7\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        int iXd = FB.Xd() ^ 1609519714;
        int iXd2 = Od.Xd() ^ (1624087153 ^ 657458096);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd);
        short sXd3 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr2 = new int["LY".length()];
        QB qb2 = new QB("LY");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            for (PackageInfo packageInfo : WK.Xd((Context) declaredMethod.invoke(null, objArr))) {
                if (packageInfo.applicationInfo != null && packageInfo.packageName.equals(str)) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(C1561oA.od("'\u001b\u0013}\u0002\u0004\u0004", (short) (C1580rY.Xd() ^ (1594433051 ^ (-1594449990)))));
                        byte[] bArr = new byte[487534490 ^ 487526298];
                        try {
                            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                            short sXd4 = (short) (OY.Xd() ^ ((722194110 ^ 75362015) ^ 796266807));
                            int[] iArr3 = new int["FTKZXSO\u001aP]]dV`g\"ec%9ijge`_sippLrku".length()];
                            QB qb3 = new QB("FTKZXSO\u001aP]]dV`g\"ec%9ijge`_sippLrku");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i4));
                                i4++;
                            }
                            String str2 = new String(iArr3, 0, i4);
                            String strZd = Wg.Zd("6t2n7x\u0014xI", (short) (OY.Xd() ^ (1426917692 ^ 1426938578)), (short) (OY.Xd() ^ ((919112194 ^ 924396322) ^ 30512121)));
                            try {
                                Class<?> cls2 = Class.forName(str2);
                                Field field = 1 != 0 ? cls2.getField(strZd) : cls2.getDeclaredField(strZd);
                                field.setAccessible(true);
                                obj = field.get(applicationInfo);
                            } catch (Throwable th) {
                                obj = null;
                            }
                            fileInputStream = new FileInputStream((String) obj);
                        } catch (IOException e2) {
                            return null;
                        }
                        while (true) {
                            try {
                                int i5 = fileInputStream.read(bArr);
                                if (i5 <= 0) {
                                    String strXd = C1624yY.Xd(messageDigest.digest());
                                    fileInputStream.close();
                                    return strXd;
                                }
                                messageDigest.update(bArr, 0, i5);
                            } finally {
                            }
                            return null;
                        }
                    } catch (NoSuchAlgorithmException e3) {
                        return null;
                    }
                }
            }
            return null;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static boolean Zd(int i2) {
        return i2 >= 0 && C1603vu.Xd < ((float) i2);
    }

    public static String kd(String str, short s2, short s3) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((s2 + i2) + xuXd.CK(iKK)) - s3);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static void od(int i2) {
        if (i2 > C1537jK.Kd) {
            C1546kX.Xd = i2;
        } else {
            JN.Xd = JX.Kd;
        }
    }

    public static long[] qd(byte[] bArr) throws Throwable {
        MessageDigest messageDigest = MessageDigest.getInstance(C1561oA.Xd("E;5\"(,.", (short) (C1499aX.Xd() ^ ((535276371 ^ 706287071) ^ (-905892803)))));
        messageDigest.update(bArr);
        messageDigest.update(bArr, 0, (1890968408 ^ 1589811282) ^ 779582222);
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(bArrDigest, 0, 1429332456 ^ 1429332472);
        byte[] bArrDigest2 = messageDigest.digest();
        Class<?> cls = Class.forName(Wg.vd("WD\nDO", (short) (OY.Xd() ^ (C1607wl.Xd() ^ (350253378 ^ 2057587344)))));
        Class<?>[] clsArr = new Class[(1831116906 ^ 241181646) ^ 1665434534];
        clsArr[0] = byte[].class;
        clsArr[1] = Integer.TYPE;
        Object[] objArr = new Object[Od.Xd() ^ (327602565 ^ 1417364946)];
        objArr[0] = bArrDigest;
        objArr[1] = 0;
        Method declaredMethod = cls.getDeclaredMethod(kd("mw", (short) (FB.Xd() ^ (ZN.Xd() ^ (903618416 ^ 106304877))), (short) (FB.Xd() ^ (ZN.Xd() ^ (1398969194 ^ 1625857863)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            long jLongValue = ((Long) declaredMethod.invoke(null, objArr)).longValue();
            Class<?> cls2 = Class.forName(hg.Vd("wd*do", (short) (FB.Xd() ^ (290384036 ^ 290385185)), (short) (FB.Xd() ^ ((1180456821 ^ 657590262) ^ 1634627942))));
            Class<?>[] clsArr2 = new Class[698725448 ^ 698725450];
            clsArr2[0] = byte[].class;
            clsArr2[1] = Integer.TYPE;
            Object[] objArr2 = new Object[1230472872 ^ 1230472874];
            objArr2[0] = bArrDigest;
            objArr2[1] = Integer.valueOf(143360897 ^ 143360905);
            Method declaredMethod2 = cls2.getDeclaredMethod(C1561oA.ud("\f\u0016", (short) (Od.Xd() ^ ((327361667 ^ 1160148301) ^ (-1453666398)))), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                long jLongValue2 = ((Long) declaredMethod2.invoke(null, objArr2)).longValue();
                Class<?> cls3 = Class.forName(C1561oA.yd("3\"i&3", (short) (C1499aX.Xd() ^ ((619162272 ^ 1846512100) ^ (-1256740048)))));
                Class<?>[] clsArr3 = new Class[(1250520142 ^ 57491672) ^ 1239690388];
                clsArr3[0] = byte[].class;
                clsArr3[1] = Integer.TYPE;
                Object[] objArr3 = new Object[(1266564397 ^ 694332108) ^ 1646041059];
                objArr3[0] = bArrDigest2;
                objArr3[1] = 0;
                Method declaredMethod3 = cls3.getDeclaredMethod(C1561oA.Yd("LX", (short) (C1580rY.Xd() ^ (34132526 ^ (-34114237)))), clsArr3);
                try {
                    declaredMethod3.setAccessible(true);
                    long jLongValue3 = ((Long) declaredMethod3.invoke(null, objArr3)).longValue();
                    long[] jArr = new long[450714250 ^ 450714249];
                    jArr[0] = jLongValue ^ jLongValue2;
                    jArr[1] = jLongValue2 ^ jLongValue3;
                    jArr[(820261570 ^ 713103352) ^ 442836280] = (jLongValue ^ jLongValue2) ^ jLongValue3;
                    return jArr;
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

    public static int ud(int i2) {
        return (Integer.rotateRight(i2, 2041216114 ^ 2041216099) ^ Integer.rotateRight(i2, 97314456 ^ 97314443)) ^ (i2 >>> 10);
    }

    public static boolean vd() {
        boolean zBooleanValue = true;
        try {
            Class<?> cls = Class.forName(Xg.qd("HVM\\ZUQ\u001c^c\u001f6XVj]", (short) (C1580rY.Xd() ^ ((804584625 ^ 453226982) ^ (-888608245))), (short) (C1580rY.Xd() ^ ((1749019428 ^ 958033190) ^ (-1361444110)))));
            short sXd = (short) (C1580rY.Xd() ^ ((66333105 ^ 991879052) ^ (-954922817)));
            short sXd2 = (short) (C1580rY.Xd() ^ (2082956451 ^ (-2082951740)));
            int[] iArr = new int["wIU>\u001fif}?\u0014@s6N\u0011Fz3m".length()];
            QB qb = new QB("wIU>\u001fif}?\u0014@s6N\u0011Fz3m");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            zBooleanValue = ((Boolean) cls.getDeclaredMethod(new String(iArr, 0, i2), new Class[0]).invoke(null, new Object[0])).booleanValue();
            return zBooleanValue;
        } catch (Exception e2) {
            return zBooleanValue;
        }
    }

    public static byte[] wd(int[] iArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iArr.length * 4);
        for (int i2 : iArr) {
            byteBufferAllocate.putInt(i2);
        }
        return byteBufferAllocate.array();
    }

    public static long yd() {
        byte[] bArrWd = Ug.wd();
        return (Xg.Kd(bArrWd[C1499aX.Xd() ^ (-1134258018)]) << 56) + (Xg.Kd(bArrWd[C1580rY.Xd() ^ (-831067243)]) << 48) + (Xg.Kd(bArrWd[(1651715371 ^ 1292797328) ^ 796764365]) << 40) + (Xg.Kd(bArrWd[(146242120 ^ 106456089) ^ 250551849]) << 32) + (Xg.Kd(bArrWd[(1427085082 ^ 1322171698) ^ 465644114]) << 24) + (Xg.Kd(bArrWd[(1469211861 ^ 1333484944) ^ 417937721]) << 16) + (Xg.Kd(bArrWd[1540454421 ^ 1540454507]) << 8) + Xg.Kd(bArrWd[C1633zX.Xd() ^ (489491996 ^ (-1769761449))]);
    }
}
