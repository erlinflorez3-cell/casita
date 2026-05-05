package yg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
public class ZO {
    public static int Kd(int i2) {
        return (Integer.rotateRight(i2, 1853570130 ^ 1853570132) ^ Integer.rotateRight(i2, OY.Xd() ^ (2135652589 ^ 2069917710))) ^ Integer.rotateRight(i2, C1607wl.Xd() ^ (1031581471 ^ 1396227292));
    }

    public static void Od(String str) {
        if (str == null || str.hashCode() != NX.Xd) {
            return;
        }
        String str2 = C1587uA.Kd;
        short sXd = (short) (ZN.Xd() ^ (1269040481 ^ 1269066553));
        int[] iArr = new int[",\u0015FDi\u00130Y".length()];
        QB qb = new QB(",\u0015FDi\u00130Y");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        str2.concat(new String(iArr, 0, i2));
        C1603vu.Xd = str2.hashCode();
    }

    public static void Qd(InputStream inputStream, File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[1606139244 ^ 1606131052];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == (1272745323 ^ (-1272745324))) {
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long Xd() throws Throwable {
        int iXd = C1607wl.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("@xQ@_", (short) (iXd ^ (1483675226 ^ 1483699577)))).getDeclaredMethod(C1561oA.Qd("sTSwY", (short) (OY.Xd() ^ (108562960 ^ 108591655))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Long) declaredMethod.invoke(null, objArr)).longValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static long Yd(ByteBuffer byteBuffer) {
        wd(byteBuffer);
        return Tg.od(byteBuffer, byteBuffer.position() + 16);
    }

    public static boolean ZX() {
        return SY.Yd == null;
    }

    public static boolean lX(String str) {
        StringBuilder sbAppend = new StringBuilder().append(C1623yX.Kd);
        int iXd = Od.Xd() ^ (-1207805280);
        return str.equals(sbAppend.append(C1593ug.zd("djkcq", (short) (Od.Xd() ^ ((631067909 ^ 1532475363) ^ (-2127201351))), (short) (Od.Xd() ^ iXd))).toString());
    }

    public static int ud(byte[] bArr) {
        int iXd = Tg.Xd(Ug.wd()[C1499aX.Xd() ^ (-1134258058)]);
        int i2 = (((bArr[0] ^ bArr[1]) ^ bArr[Od.Xd() ^ (551584518 ^ 1729959761)]) ^ bArr[Od.Xd() ^ 1207800918]) ^ bArr[(246984214 ^ 1968272524) ^ 2078923422];
        return (iXd + i2) - (iXd | i2);
    }

    public static void wd(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        throw new IllegalArgumentException(Wg.vd("}42\"y, \u001f\u0019%U\u0017)#\u0017P;=22:f7>77e'%^.*\u0010\u000f\n\u00027{\b||s\u0004", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831075325)))));
    }

    public static String xd(String str, short s2, short s3) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * s3) + s2)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static byte[] yd(long j2, long j3) {
        int iXd = C1607wl.Xd() ^ 1849955282;
        byte[] bArr = new byte[iXd];
        long j4 = j3 ^ j2;
        for (int i2 = 0; i2 < iXd; i2++) {
            bArr[7 - i2] = (byte) j4;
            j4 >>= iXd;
        }
        return bArr;
    }
}
