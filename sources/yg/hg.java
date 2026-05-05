package yg;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class hg {
    public static boolean KX(int i2) {
        return Integer.reverse(i2) == IK.Yd.hashCode();
    }

    public static int Kd(ByteBuffer byteBuffer, int i2) {
        short s2 = byteBuffer.getShort(i2);
        int i3 = 992743490 ^ 992800701;
        return (s2 + i3) - (s2 | i3);
    }

    public static boolean Qd() {
        return C1593ug.od() && !EY.ud();
    }

    public static String Vd(String str, short s2, short s3) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(s2 + i2 + xuXd.CK(iKK) + s3);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static Set Xd(byte[] bArr) throws Throwable {
        Object[] objArr = {bArr};
        Method declaredMethod = Class.forName(C1561oA.Qd("|i/tk", (short) (C1499aX.Xd() ^ (1376088179 ^ (-1376066696))))).getDeclaredMethod(C1593ug.zd("v\u001f\u001c!{ ", (short) (C1607wl.Xd() ^ ((2146085114 ^ 2127228505) ^ 18899745)), (short) (C1607wl.Xd() ^ (471556359 ^ 471535414))), byte[].class);
        try {
            declaredMethod.setAccessible(true);
            return (Set) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static byte[] Yd(long j2) {
        if (j2 < 0) {
            throw new ArithmeticException(C1561oA.od("+5?G6o8Al8:A.:f:-%1a;%1-j", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849978840))));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        do {
            byte bKd = (byte) ((Od.Kd() ^ 2601039965261239338L) & j2);
            j2 >>>= 166364158 ^ 166364153;
            if (j2 != 0) {
                bKd = (byte) ((-1) - (((-1) - bKd) & ((-1) - 128)));
            }
            byteArrayOutputStream.write(bKd);
        } while (j2 != 0);
        return byteArrayOutputStream.toByteArray();
    }

    public static void cX(int i2) {
        SY.Xd = i2;
    }

    public static int[] qd(int i2) {
        byte[] bArrWd = Ug.wd();
        return new int[]{Tg.Xd(bArrWd[i2]), Tg.Xd(bArrWd[i2 + 4]), Tg.Xd(bArrWd[i2 + 8]), Tg.Xd(bArrWd[i2 + 12])};
    }

    public static long ud(ByteBuffer byteBuffer) {
        ZO.wd(byteBuffer);
        return Tg.od(byteBuffer, byteBuffer.position() + 12);
    }

    public static byte[] wd(long j2, long j3, long j4) {
        byte[] bArr = new byte[C1499aX.Xd() ^ (588972507 ^ (-1619027673))];
        long j5 = j3 ^ (j4 ^ j2);
        long j6 = j2 ^ j5;
        int i2 = 0;
        while (true) {
            int i3 = (1324020968 ^ 825377104) ^ 2144908720;
            if (i2 >= i3) {
                return bArr;
            }
            bArr[i2] = (byte) j6;
            bArr[i2 + 8] = (byte) j5;
            j6 >>= i3;
            j5 >>= i3;
            i2++;
        }
    }
}
