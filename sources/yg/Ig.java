package yg;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
public class Ig {
    public static byte[] Od(byte[] bArr, Yl yl, OX ox) throws Throwable {
        int length = bArr.length;
        int iXd = OY.Xd() ^ (-69946185);
        int iXd2 = C1633zX.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("Cj\u001fU[", (short) (iXd2 ^ (1651097775 ^ (-1651084655))), (short) (C1633zX.Xd() ^ iXd))).getMethod(C1626yg.Ud("7gO%p_B\\\u001f@\tn", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1681675911 ^ 665276461))), (short) (C1633zX.Xd() ^ (2127473186 ^ (-2127466163)))), new Class[0]);
        try {
            method.setAccessible(true);
            int iIntValue = ((Integer) method.invoke(yl, objArr)).intValue();
            short sXd = (short) (C1580rY.Xd() ^ ((1277252358 ^ 241293356) ^ (-1111528487)));
            int[] iArr = new int["\"B5xo".length()];
            QB qb = new QB("\"B5xo");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[(1905543471 ^ 1201347238) ^ 906974090];
            clsArr[0] = byte[].class;
            clsArr[1] = Integer.TYPE;
            clsArr[(137021604 ^ 917847888) ^ 1050671094] = Integer.TYPE;
            Object[] objArr2 = new Object[(1732768025 ^ 1466579517) ^ 808307495];
            objArr2[0] = bArr;
            objArr2[1] = Integer.valueOf(length);
            objArr2[9509913 ^ 9509915] = Integer.valueOf(iIntValue);
            Method method2 = cls.getMethod(EO.Od("~W", (short) (FB.Xd() ^ (1495796024 ^ 1495801936))), clsArr);
            try {
                method2.setAccessible(true);
                byte[] bArr2 = (byte[]) method2.invoke(ox, objArr2);
                byte[] bArr3 = new byte[bArr2.length];
                int iIntValue2 = 0;
                while (iIntValue2 < bArr2.length) {
                    Class<?> cls2 = Class.forName(C1561oA.Qd("@-r\u001d/", (short) (ZN.Xd() ^ ((837326792 ^ 2054226537) ^ 1268359338))));
                    Class<?>[] clsArr2 = new Class[1849424807 ^ 1849424803];
                    clsArr2[0] = byte[].class;
                    clsArr2[1] = Integer.TYPE;
                    clsArr2[(2081830099 ^ 1644609177) ^ 504400456] = byte[].class;
                    clsArr2[920560179 ^ 920560176] = Integer.TYPE;
                    Object[] objArr3 = new Object[(873844653 ^ 1755147184) ^ 1552458777];
                    objArr3[0] = bArr2;
                    objArr3[1] = Integer.valueOf(iIntValue2);
                    objArr3[1534835707 ^ 1534835705] = bArr3;
                    objArr3[247225919 ^ 247225916] = Integer.valueOf(iIntValue2);
                    Method method3 = cls2.getMethod(C1593ug.zd("> ", (short) (C1633zX.Xd() ^ (925040866 ^ (-925055166))), (short) (C1633zX.Xd() ^ (1634450996 ^ (-1634467670)))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        method3.invoke(yl, objArr3);
                        int iXd3 = ZN.Xd();
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(C1561oA.od("]J\u0010:L", (short) (iXd3 ^ ((950702320 ^ 1612801032) ^ 1485561905)))).getMethod(C1561oA.Kd("PO_.Y]R[D[mY", (short) (C1633zX.Xd() ^ (269146033 ^ (-269139219)))), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            iIntValue2 += ((Integer) method4.invoke(yl, objArr4)).intValue();
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                return bArr3;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public static boolean Qd() throws Throwable {
        int iXd = C1580rY.Xd() ^ (-831080450);
        short sXd = (short) (C1607wl.Xd() ^ ((692763523 ^ 614604024) ^ 233357807));
        short sXd2 = (short) (C1607wl.Xd() ^ iXd);
        int[] iArr = new int["?f\u0011=x".length()];
        QB qb = new QB("?f\u0011=x");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Xd(">CcaLW\\", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134255065)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int Xd(ByteBuffer byteBuffer) {
        ZO.wd(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        int iXd = C1580rY.Xd() ^ (1693038319 ^ (-1432396520));
        int iXd2 = C1633zX.Xd() ^ 1951491124;
        if (iCapacity < iXd) {
            return iXd2;
        }
        int iMin = Math.min(iCapacity - 22, (2143469277 ^ 1501228378) ^ 649636984);
        int i2 = iCapacity - 22;
        for (int i3 = 0; i3 <= iMin; i3++) {
            int i4 = i2 - i3;
            if (byteBuffer.getInt(i4) == (1544681724 ^ 1511306156) && hg.Kd(byteBuffer, i4 + 20) == i3) {
                return i4;
            }
        }
        return iXd2;
    }

    public static void aX() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler() { // from class: yg.UX
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                C1597vN.Xd(th);
            }
        };
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    public static int od(int i2, int i3, int i4) {
        return ((i2 + i3) - (i2 | i3)) | ((-1) - (((-1) - (~i2)) | ((-1) - i4)));
    }

    public static void qd(String str) {
        if (str == null || str.length() != JK.Xd) {
            return;
        }
        (C1623yX.Kd + C1598vY.Kd).concat(C1561oA.Kd("\u001f\u001br\u001a\u001e\u0011%", (short) (C1580rY.Xd() ^ (344451205 ^ (-344455700)))));
        C1603vu.Xd = r3.length();
    }

    public static boolean uX(String str) {
        if (str.length() == 0 || str.charAt(0) != ((425372575 ^ 194104635) ^ 315319983)) {
            return false;
        }
        for (String str2 : str.split(C1598vY.Kd.toUpperCase())) {
            if (str2.length() > JK.Xd + 2) {
                return true;
            }
        }
        return false;
    }

    public static void vd(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        int iXd = ZN.Xd() ^ (349526816 ^ 660563634);
        throw new IllegalArgumentException(Wg.Zd("dE%|C s^I}\u000e7:\u001e4W\u0013z\u0012zt\u000b{iT<L9'Jw\u001d\u0015}Y{\u001fM:\u0017K*\u001b", (short) (FB.Xd() ^ (1468796567 ^ 1468804633)), (short) (FB.Xd() ^ iXd)));
    }

    public static String wd(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (s2 + i2)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static C1605wK yd(RandomAccessFile randomAccessFile, int i2) throws C1539jX, IOException {
        Pair<ByteBuffer, Long> pairKd = FN.Kd(randomAccessFile);
        ByteBuffer byteBuffer = (ByteBuffer) pairKd.first;
        long jLongValue = ((Long) pairKd.second).longValue();
        if (C1593ug.qd(randomAccessFile, jLongValue)) {
            throw new C1539jX(C1561oA.Xd("<,4\u001b\u001a\u0007)95\u000bZ\\b\u000fcfbccgj\\\\", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831082320)))));
        }
        long jXd = FN.Xd(byteBuffer, jLongValue);
        Pair<ByteBuffer, Long> pairYd = FN.Yd(randomAccessFile, jXd);
        return Wg.wd((ByteBuffer) pairYd.first, ((Long) pairYd.second).longValue(), jXd, jLongValue, byteBuffer, i2);
    }
}
