package yg;

import android.os.Process;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yg.ug */
/* JADX INFO: loaded from: classes9.dex */
public class C1593ug {
    public static long Kd(InputStream inputStream) throws IOException {
        int i2;
        long j2 = 0;
        int i3 = 0;
        do {
            i2 = inputStream.read();
            if (i2 == ((1700390544 ^ 1388315709) ^ (-932831918))) {
                throw new IOException(EO.Od("\u001e]\tBc5\rh4E\u0001B\u001b\u001e", (short) (C1633zX.Xd() ^ ((1110574193 ^ 1946964926) ^ (-910059339)))));
            }
            j2 += ((-1) - (((-1) - ((long) i2)) | ((-1) - (7367396323905908044L ^ 7367396323905908019L)))) << i3;
            i3 += 7;
        } while ((i2 + 128) - (i2 | 128) == (OY.Xd() ^ 69929064));
        if (i3 < ((756021060 ^ 1892709076) ^ 1574929872)) {
            return j2;
        }
        throw new ArithmeticException(Ig.wd("#`[CP6]Vz\u001e\u001a=\u0002&\"9st.\u001c=9<!5\u0001\u0010\u0016d\u001dB\u0015w\u001a@|\u0007=ELCa", (short) (C1499aX.Xd() ^ (1044393628 ^ (-1044398516)))));
    }

    public static void Qd(int i2) {
        int i3 = (JN.Xd + i2) % 8;
        for (int i4 = 0; i4 < i3; i4 += 4) {
            Qg.od(i2);
        }
    }

    public static boolean Ud(int i2) {
        return false;
    }

    public static int Yd(int i2) {
        return (Integer.rotateRight(i2, (255191081 ^ 719762440) ^ 634608678) ^ Integer.rotateRight(i2, ZN.Xd() ^ (432120590 ^ 709598700))) ^ (i2 >>> 3);
    }

    public static boolean od() {
        return Process.myUid() >= ((1791491991 ^ 40620783) ^ 1756197608);
    }

    public static final boolean qd(RandomAccessFile randomAccessFile, long j2) throws IOException {
        long j3 = j2 - ((5970862838330188332L ^ 3587237365326586250L) ^ 7139517665303643058L);
        if (j3 < 0) {
            return false;
        }
        randomAccessFile.seek(j3);
        return randomAccessFile.readInt() == (C1633zX.Xd() ^ (51266486 ^ (-655630726)));
    }

    public static byte[] vd(byte[] bArr, Yl yl, OX ox) throws Throwable {
        byte[] bArr2 = new byte[bArr.length];
        int iIntValue = 0;
        while (iIntValue < bArr.length) {
            short sXd = (short) (Od.Xd() ^ (1654188438 ^ (-1654175925)));
            short sXd2 = (short) (Od.Xd() ^ ((1181162372 ^ 1218435759) ^ (-251185338)));
            int[] iArr = new int["{\u00054|\u0019".length()];
            QB qb = new QB("{\u00054|\u0019");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[381184377 ^ 381184381];
            clsArr[0] = byte[].class;
            clsArr[1] = Integer.TYPE;
            clsArr[(1073238146 ^ 1197319122) ^ 2024141650] = byte[].class;
            clsArr[(1306770534 ^ 78544409) ^ 1229832828] = Integer.TYPE;
            Object[] objArr = new Object[1158503066 ^ 1158503070];
            objArr[0] = bArr;
            objArr[1] = Integer.valueOf(iIntValue);
            objArr[(1790773124 ^ 1530267707) ^ 831197117] = bArr2;
            objArr[(1775433356 ^ 381048023) ^ 2137301592] = Integer.valueOf(iIntValue);
            Method method = cls.getMethod(C1561oA.Xd("rb", (short) (C1499aX.Xd() ^ ((1635208959 ^ 119816272) ^ (-1716737718)))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(yl, objArr);
                short sXd3 = (short) (Od.Xd() ^ ((331350655 ^ 1770249692) ^ (-2051249360)));
                int[] iArr2 = new int["q^(Rh".length()];
                QB qb2 = new QB("q^(Rh");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((sXd3 ^ i3) + xuXd2.CK(iKK2));
                    i3++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Qg.kd("}z\tU~\u0001szav\u0007p", (short) (Od.Xd() ^ (1479613213 ^ (-1479620857))), (short) (Od.Xd() ^ ((56327357 ^ 1540186635) ^ (-1486228460)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    iIntValue += ((Integer) method2.invoke(yl, objArr2)).intValue();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        Object[] objArr3 = {bArr2};
        Method method3 = Class.forName(hg.Vd("fS\u00199A", (short) (ZN.Xd() ^ (1072652552 ^ 1072630318)), (short) (ZN.Xd() ^ (543493413 ^ 543519956)))).getMethod(C1561oA.ud("CV", (short) (Od.Xd() ^ (787924704 ^ (-787938325)))), byte[].class);
        try {
            method3.setAccessible(true);
            return (byte[]) method3.invoke(ox, objArr3);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static byte[] yd(int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Od.Xd() ^ (1613970570 ^ 667855067));
        byteBufferAllocate.putInt(i2);
        return byteBufferAllocate.array();
    }

    public static String zd(String str, short s2, short s3) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (s2 + i2)) - s3);
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
