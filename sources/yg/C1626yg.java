package yg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: yg.yg */
/* JADX INFO: loaded from: classes9.dex */
public class C1626yg {
    public static void Kd(float f2) {
        if (f2 > 0.0f) {
            C1603vu.Xd = (C1603vu.Xd + f2) % Float.intBitsToFloat((1060964599 ^ 655413346) ^ 1521342613);
        }
    }

    public static byte[] Od(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException(hg.Vd("[qrk}q}k%phphtg", (short) (C1499aX.Xd() ^ (115620761 ^ (-115614528))), (short) (C1499aX.Xd() ^ ((210861017 ^ 1314362647) ^ (-1120306682)))));
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbAppend = new StringBuilder().append(Wg.vd("'?44@38:Ah?//1)b4&!#'+#Z&\u001e&\u001e*\u001d`#$\u0016\u0016\u0018&\u0012\u0010J \n\u0014\u001c\u000bRCn\u0007\u000f\u0007\u0013\u0006V;", (short) (ZN.Xd() ^ ((1754050159 ^ 88177237) ^ 1842207754)))).append(i2);
        short sXd = (short) (Od.Xd() ^ (1773719224 ^ (-1773727092)));
        short sXd2 = (short) (Od.Xd() ^ ((1094822540 ^ 961424397) ^ (-2014288804)));
        int[] iArr = new int["0#cwahj^^g_3\u0018".length()];
        QB qb = new QB("0#cwahj^^g_3\u0018");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        throw new IOException(sbAppend.append(new String(iArr, 0, i3)).append(byteBuffer.remaining()).toString());
    }

    public static void Qd(String str, String str2) {
    }

    public static String Ud(String str, short s2, short s3) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((s2 + s2) + (i2 * s3))) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static boolean Xd() {
        return false;
    }

    public static File Yd() throws Throwable {
        Object obj;
        Object obj2;
        int i2 = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.ud("Q>\u0004M-", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (2033496289 ^ (-1053362842)))))).getDeclaredMethod(C1561oA.yd("ep", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134243915)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Context context = (Context) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(C1561oA.Yd("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f", (short) (C1607wl.Xd() ^ ((1226698109 ^ 330159929) ^ 1521513859)))).getMethod(Xg.qd("\u0017\u0016&s$%\" \u001b\u001a.$++\u0007-&0", (short) (OY.Xd() ^ ((1633372901 ^ 1778896601) ^ 190626872)), (short) (OY.Xd() ^ (1857262622 ^ 1857286710))), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr2);
                String strWd = Jg.Wd("@!(o}O;^EJ\u0019\u0018Z|4\u0005x/\u0001i\baN%PE*8o\b\u0012Py<", (short) (C1580rY.Xd() ^ ((816619740 ^ 63282084) ^ (-862525323))), (short) (C1580rY.Xd() ^ (1303735772 ^ (-1303726897))));
                String strXd = ZO.xd("W\u00121\u0018w\u0011k)%P_c\u001a8F}", (short) (ZN.Xd() ^ (1966561983 ^ 1966544847)), (short) (ZN.Xd() ^ (1573456691 ^ 1573473246)));
                try {
                    Class<?> cls = Class.forName(strWd);
                    Field field = 1 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                File file = new File((String) obj);
                if (!file.isDirectory() || file.listFiles().length != 0) {
                    return file;
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod2 = Class.forName(Ud("^\\t\u0001*", (short) (C1633zX.Xd() ^ ((1745161391 ^ 1216806559) ^ (-545505317))), (short) (C1633zX.Xd() ^ ((1644023939 ^ 311755573) ^ (-1936244622))))).getDeclaredMethod(Ig.wd("\u001aS", (short) (C1633zX.Xd() ^ ((1026992000 ^ 1795272350) ^ (-1446451963)))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    Context context2 = (Context) declaredMethod2.invoke(null, objArr3);
                    Object[] objArr4 = new Object[0];
                    Method method2 = Class.forName(EO.Od("A\u007fcYV\u0006\u001d\u001ez\u000b\fk\b\u0017\u0011$v9_\u001e&\u0011\u001f", (short) (C1633zX.Xd() ^ (600473413 ^ (-600457144))))).getMethod(C1561oA.Qd("\u0013\u0010\u001ei\u0018\u0017\u0012\u000e\u0007\u0004\u0016\n\u000f\rf\u000b\u0002\n", (short) (FB.Xd() ^ (996935916 ^ 996962355))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        ApplicationInfo applicationInfo2 = (ApplicationInfo) method2.invoke(context2, objArr4);
                        String strZd = C1593ug.zd("N\\Sb`[W\"Xeel^ho*mk-Aqromhg{qxxTzs}", (short) (C1607wl.Xd() ^ ((583247024 ^ 1322659201) ^ 1813374532)), (short) (C1607wl.Xd() ^ (348419357 ^ 348421579)));
                        String strOd = C1561oA.od("'\u0019+\u001f+\u0019~\u001b\u0013\"\u0010 &o\u0014\u001c", (short) (C1633zX.Xd() ^ (51350831 ^ (-51379489))));
                        try {
                            Class<?> cls2 = Class.forName(strZd);
                            Field field2 = 1 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                            field2.setAccessible(true);
                            obj2 = field2.get(applicationInfo2);
                        } catch (Throwable th2) {
                            obj2 = null;
                        }
                        File parentFile = new File((String) obj2).getParentFile().getParentFile();
                        for (String str : Build.SUPPORTED_ABIS) {
                            File file2 = new File(parentFile, C1561oA.Kd("%# \u001e*\u0016\u001b((!%$k", (short) (FB.Xd() ^ (950082591 ^ 950092377))) + str.replace(Wg.Zd("\u0012", (short) (C1580rY.Xd() ^ ((1608860947 ^ 233861085) ^ (-1377126392))), (short) (C1580rY.Xd() ^ (1327663857 ^ (-1327669657)))), C1561oA.Xd(ExifInterface.LATITUDE_SOUTH, (short) (C1499aX.Xd() ^ ((1568201139 ^ 1853213421) ^ (-856520727))))) + Wg.vd("S\b\u0018\u0014", (short) (FB.Xd() ^ (940660526 ^ 940657906))));
                            if (file2.exists()) {
                                return file2;
                            }
                        }
                        return file;
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
    }

    public static String od(byte[] bArr) {
        char[] cArr = new char[ZN.Xd() ^ 864698080];
        // fill-array-data instruction
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = '8';
        cArr[9] = '9';
        cArr[10] = 'a';
        cArr[11] = 'b';
        cArr[12] = 'c';
        cArr[13] = 'd';
        cArr[14] = 'e';
        cArr[15] = 'f';
        char[] cArr2 = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = (b2 + 255) - (b2 | 255);
            cArr2[i2 * 2] = cArr[i3 >>> 4];
            cArr2[(i2 * 2) + 1] = cArr[i3 & 15];
        }
        return new String(cArr2);
    }

    public static int[] vd(byte[] bArr) {
        int i2 = (1817591902 ^ 1622981126) ^ 216726040;
        int length = bArr.length % i2;
        int length2 = bArr.length / i2;
        int i3 = length + 1 + 8;
        int iXd = C1499aX.Xd() ^ (-1134257938);
        IntBuffer intBufferAllocate = IntBuffer.allocate((length2 + (i3 > i2 ? Od.Xd() ^ (1181559256 ^ 26262927) : 1)) * 16);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int i4 = 672922866 ^ 672922870;
        int length3 = bArr.length / i4;
        for (int i5 = 0; i5 < length3; i5++) {
            intBufferAllocate.put(byteBufferWrap.getInt());
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i4);
        byteBufferAllocate.put(byteBufferWrap).put((C1499aX.Xd() ^ 1134258028) == true ? (byte) 1 : (byte) 0).rewind();
        intBufferAllocate.put(byteBufferAllocate.getInt());
        intBufferAllocate.position(intBufferAllocate.capacity() - iXd);
        long length4 = ((long) bArr.length) * ((5352339079999980362L ^ 7710913335338198966L) ^ 2397602589076153588L);
        intBufferAllocate.put((int) (length4 >>> ((35342639 ^ 1085323649) ^ 1118564494)));
        intBufferAllocate.put((int) length4);
        return intBufferAllocate.array();
    }

    public static boolean wd(long j2, long j3) {
        if (EY.Xd == null) {
            return false;
        }
        for (long j4 : EY.Xd) {
            if (j4 != 0 && j4 >= j2 && j4 <= j3) {
                return true;
            }
        }
        return false;
    }

    public static Pair yd(RandomAccessFile randomAccessFile, int i2) {
        if (i2 < 0 || i2 > ((606610333 ^ 1871496375) ^ 1269045461)) {
            throw new IllegalArgumentException(new StringBuilder().append(ZO.xd("L>TD\u0003\u0013\u001eU^l\u0014\u000b=YkD", (short) (OY.Xd() ^ ((119176208 ^ 1234986847) ^ 1317426678)), (short) (OY.Xd() ^ (ZN.Xd() ^ 864695979)))).append(i2).toString());
        }
        long length = randomAccessFile.length();
        long jQd = C1607wl.Qd() ^ 3971561221148382156L;
        if (length < jQd) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i2, length - jQd)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        int iXd = Ig.Xd(byteBufferAllocate);
        if (iXd == (OY.Xd() ^ (-69929193))) {
            return null;
        }
        byteBufferAllocate.position(iXd);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(((long) iXd) + jCapacity));
    }
}
