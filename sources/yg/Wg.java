package yg;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes9.dex */
public class Wg {
    public static List Kd(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            short sXd = (short) (C1607wl.Xd() ^ (1022379947 ^ 1022363004));
            short sXd2 = (short) (C1607wl.Xd() ^ (1546525946 ^ 1546519809));
            int[] iArr = new int["w".length()];
            QB qb = new QB("w");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, new String(iArr, 0, i2));
            try {
                Iterator<X509Certificate[]> it = C1578rK.Xd(randomAccessFile).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(Arrays.asList(it.next()));
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (C1539jX e2) {
        } catch (Exception e3) {
        }
        arrayList.addAll(Yd(str));
        return arrayList;
    }

    public static Pair Qd(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < (2198407795268619346L ^ 2198407795268619332L)) {
            return null;
        }
        Pair pairYd = C1626yg.yd(randomAccessFile, 0);
        return pairYd != null ? pairYd : C1626yg.yd(randomAccessFile, (891774913 ^ 255887172) ^ 979836794);
    }

    public static void SX(final Runnable runnable) {
        Ig.aX();
        short sXd = (short) (OY.Xd() ^ (2027291769 ^ 2027301133));
        int iXd = OY.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(hg.Vd("F<P:\u0006LJ>@\u00015@>2C?>08=u\f>*'86022", sXd, (short) (iXd ^ (1119224042 ^ 1119235570)))).getDeclaredMethod(C1561oA.ud("3):\u0015*.&*\"\u0010#,\u001e\u0019\u001bz-\u0019\u0016'%\u001f!", (short) (C1607wl.Xd() ^ (1416432728 ^ 1416456909))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            ExecutorService executorService = (ExecutorService) declaredMethod.invoke(null, objArr);
            int iXd2 = C1580rY.Xd();
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.yd("lxq~~wu>ru3Pvuymm", (short) (iXd2 ^ ((106317353 ^ 830273553) ^ (-925557344))))).getDeclaredMethod(C1561oA.Yd("-,<\u0016+4:\u0019=>@6D", (short) (C1580rY.Xd() ^ (529153846 ^ (-529157859)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                final Handler handler = new Handler((Looper) declaredMethod2.invoke(null, objArr2));
                executorService.execute(new Runnable() { // from class: yg.LX
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        SY.qX(handler, runnable);
                    }
                });
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static List Yd(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName(Xg.qd("G?UA\u000fWWMQ\u0014aQY\u0018EU]4X\\V", (short) (OY.Xd() ^ ((1511785190 ^ 1930948999) ^ 688643925)), (short) (OY.Xd() ^ (1730750274 ^ 1730757190))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Jg.Wd("^psq?o{\npRw\u0004\u0019\u0018\f\u0018", (short) (C1633zX.Xd() ^ (279710171 ^ (-279721811))), (short) (C1633zX.Xd() ^ ((340081240 ^ 517003805) ^ (-177574179)))));
            Object[] objArr = {str};
            Constructor<?> constructor = cls.getConstructor(clsArr);
            try {
                constructor.setAccessible(true);
                ZipFile zipFile = (ZipFile) constructor.newInstance(objArr);
                String strXd = ZO.xd("uQ'f\u001e", (short) (OY.Xd() ^ (545582536 ^ 545567436)), (short) (OY.Xd() ^ (1630921162 ^ 1630898036)));
                try {
                    Class<?> cls2 = Class.forName(C1626yg.Ud("oQVGV-\u0011\u001e4\u0007U):ad{>\u0004`w\u0001\u0005~yezmVc|\u0010v;\u0010O[g", (short) (C1633zX.Xd() ^ ((608888372 ^ 47356508) ^ (-647511859))), (short) (C1633zX.Xd() ^ (937008922 ^ (-937006546)))));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(Ig.wd("\u0016FK\u0011;DgrHa\u000b\fVEP&", (short) (ZN.Xd() ^ ((1044925012 ^ 2968015) ^ 1046822980))));
                    Object[] objArr2 = {strXd};
                    short sXd = (short) (ZN.Xd() ^ (333750372 ^ 333764830));
                    int[] iArr = new int["8\u0006b\u001b`\u000b<P\u0015im".length()];
                    QB qb = new QB("8\u0006b\u001b`\u000b<P\u0015im");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                        i2++;
                    }
                    Method declaredMethod = cls2.getDeclaredMethod(new String(iArr, 0, i2), clsArr2);
                    try {
                        declaredMethod.setAccessible(true);
                        CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr2);
                        Object[] objArr3 = new Object[0];
                        Method method = Class.forName(C1561oA.Qd(")\u001f3\u001dh/-!#c/\u001d#_\u000b\u0019\u001fs\u0016\u0018\u0010", (short) (ZN.Xd() ^ (308400459 ^ 308408632)))).getMethod(C1593ug.zd("\u0007\u0011\u0018\u0017\u000f\f\u001b", (short) (C1633zX.Xd() ^ (1986117218 ^ (-1986122036))), (short) (C1633zX.Xd() ^ (2068309028 ^ (-2068303512)))), new Class[0]);
                        try {
                            method.setAccessible(true);
                            Enumeration enumeration = (Enumeration) method.invoke(zipFile, objArr3);
                            while (enumeration.hasMoreElements()) {
                                ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
                                Object[] objArr4 = new Object[0];
                                Method method2 = Class.forName(C1561oA.od("\u0001v\u000bt@\u0007\u0005xz;\u0007tz7bpvJrwtz", (short) (C1633zX.Xd() ^ ((1869425617 ^ 662183306) ^ (-1209365342))))).getMethod(C1561oA.Kd("edtOcpi", (short) (C1633zX.Xd() ^ ((1364181603 ^ 1917083296) ^ (-587975148)))), new Class[0]);
                                try {
                                    method2.setAccessible(true);
                                    String str2 = (String) method2.invoke(zipEntry, objArr4);
                                    if (str2.startsWith(Zd("\u007f0y F\u001bY\f\u000e", (short) (C1633zX.Xd() ^ ((1627490535 ^ 1904663600) ^ (-277294958))), (short) (C1633zX.Xd() ^ (727926660 ^ (-727936979))))) && str2.endsWith(C1561oA.Xd("2WYH", (short) (C1499aX.Xd() ^ ((983096381 ^ 251623325) ^ (-879212480)))))) {
                                        try {
                                            Class<?> cls3 = Class.forName(vd("PH^J\u0018``VZ\u001djZb!N^F\u001dAE?", (short) (C1580rY.Xd() ^ (1405297234 ^ (-1405305572)))));
                                            Class<?>[] clsArr3 = new Class[1];
                                            clsArr3[0] = Class.forName(Qg.kd("si}g3ywkm.ygm*Uci=ejgm", (short) (FB.Xd() ^ (927768279 ^ 927760650)), (short) (FB.Xd() ^ (2095290239 ^ 2095315871))));
                                            Object[] objArr5 = {zipEntry};
                                            Method method3 = cls3.getMethod(hg.Vd("daoCghljHheWR]", (short) (Od.Xd() ^ ((660851946 ^ 225799161) ^ (-706134621))), (short) (Od.Xd() ^ ((1619865011 ^ 2022219933) ^ (-403044423)))), clsArr3);
                                            try {
                                                method3.setAccessible(true);
                                                InputStream inputStream = (InputStream) method3.invoke(zipFile, objArr5);
                                                Class<?> cls4 = Class.forName(C1561oA.ud(" \u0016*\u0014_$\u0015\u0012#\u001f\u0015\u001f#V\u000b\f\u0018\u0019Qe\u0007\u0013\u0014\b\u0004\u0006~{\u000e}]wx\t\u0003\u0005\u000b", (short) (C1580rY.Xd() ^ ((648737778 ^ 827461938) ^ (-402175640)))));
                                                Class<?>[] clsArr4 = new Class[1];
                                                clsArr4[0] = Class.forName(C1561oA.yd("^TlV\u001eXa\u001fEinrlJnkids", (short) (C1499aX.Xd() ^ ((392114893 ^ 2011883102) ^ (-1622512806)))));
                                                Object[] objArr6 = {inputStream};
                                                Method method4 = cls4.getMethod(C1561oA.Yd("?>H@N>RD#FTWMKOJI]O", (short) (C1633zX.Xd() ^ ((149061190 ^ 2049221465) ^ (-1925632353)))), clsArr4);
                                                try {
                                                    method4.setAccessible(true);
                                                    arrayList.add((X509Certificate) ((Certificate) method4.invoke(certificateFactory, objArr6)));
                                                    inputStream.close();
                                                } catch (InvocationTargetException e2) {
                                                    throw e2.getCause();
                                                }
                                            } catch (InvocationTargetException e3) {
                                                throw e3.getCause();
                                            }
                                        } catch (Exception e4) {
                                        }
                                    }
                                } catch (InvocationTargetException e5) {
                                    throw e5.getCause();
                                }
                            }
                            Object[] objArr7 = new Object[0];
                            Method method5 = Class.forName(Xg.qd("&\u001e4 m66,0r@08v$4<\u00137;5", (short) (Od.Xd() ^ ((1918569402 ^ 377091339) ^ (-1680002662))), (short) (Od.Xd() ^ ((2134779236 ^ 2118699842) ^ (-24552097))))).getMethod(Jg.Wd("2 \f|\u001b", (short) (Od.Xd() ^ (930894342 ^ (-930892878))), (short) (Od.Xd() ^ ((1755561775 ^ 1032261098) ^ (-1428486535)))), new Class[0]);
                            try {
                                method5.setAccessible(true);
                                method5.invoke(zipFile, objArr7);
                            } catch (InvocationTargetException e6) {
                                throw e6.getCause();
                            }
                        } catch (InvocationTargetException e7) {
                            throw e7.getCause();
                        }
                    } catch (InvocationTargetException e8) {
                        throw e8.getCause();
                    }
                } finally {
                }
            } catch (InvocationTargetException e9) {
                throw e9.getCause();
            }
        } catch (Throwable th) {
        }
        return arrayList;
    }

    public static String Zd(String str, short s2, short s3) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * s3) ^ s2) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static void kd(String str) {
        C1523gX.Kd = Ig.wd(":n\u001f<*<k\u0012=)$F", (short) (OY.Xd() ^ (31844219 ^ 31848392))) + new Integer(C1546kX.Xd).toString();
    }

    public static boolean oX(String str) {
        String strOd = EO.Od("\u0015G", (short) (OY.Xd() ^ (ZN.Xd() ^ 864682110)));
        if (strOd.charAt(0) != ((571006808 ^ 1726977004) ^ 1156009151)) {
            return false;
        }
        char[] charArray = strOd.toCharArray();
        int i2 = 0;
        for (char c2 : charArray) {
            i2 ^= c2;
        }
        return i2 == 0;
    }

    public static int od(byte[] bArr) {
        return (-1) - (((-1) - Tg.Xd(Ug.wd()[C1633zX.Xd() ^ (1592730940 ^ (-717111727))])) | ((-1) - ((((bArr[812979436 ^ 812979427] ^ bArr[C1607wl.Xd() ^ (1953571809 ^ 439693355)]) ^ bArr[1436881310 ^ 1436881295]) ^ bArr[(1724153993 ^ 833454443) ^ 1466499568]) ^ bArr[FB.Xd() ^ 1609527072])));
    }

    public static String vd(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((s2 ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static C1605wK wd(ByteBuffer byteBuffer, long j2, long j3, long j4, ByteBuffer byteBuffer2, int i2) throws C1539jX {
        Ig.vd(byteBuffer);
        int i3 = (1902475777 ^ 1301716931) ^ 1022617034;
        ByteBuffer byteBufferQd = Ug.Qd(byteBuffer, i3, byteBuffer.capacity() - 24);
        int i4 = 0;
        while (byteBufferQd.hasRemaining()) {
            i4++;
            if (byteBufferQd.remaining() < i3) {
                throw new C1539jX(C1561oA.ud("\n.23#\"$\u001d\"\u001d%*T\u0018\u0014&\u0012O#\u001dL\u001e\u0010\u000b\rG\u001a\u000f\u001f\tB\u0011\u0007?_mg;m\u0003\u007f\u0006\u007f\u0004{3T}\u007fry-qy~{\u0002')", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864693204)))) + i4);
            }
            long j5 = byteBufferQd.getLong();
            long j6 = 126744282628166886L ^ 126744282628166882L;
            String strVd = vd("P#\u0018(\u0012K\u001a\u001f\u001dG\u0016\fD\u0016\u0004\u0010\b\u0005X=", (short) (C1499aX.Xd() ^ (2138033742 ^ (-2138041886))));
            int iXd = C1607wl.Xd() ^ (2049156500 ^ (-342357448));
            short sXd = (short) (Od.Xd() ^ (1208438961 ^ (-1208428667)));
            short sXd2 = (short) (Od.Xd() ^ iXd);
            int[] iArr = new int["-;5\t;PMSMQI\u0001\"KM@Gz?GLIOtv".length()];
            QB qb = new QB("-;5\t;PMSMQI\u0001\"KM@Gz?GLIOtv");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(((sXd + i5) + xuXd.CK(iKK)) - sXd2);
                i5++;
            }
            String str = new String(iArr, 0, i5);
            if (j5 < j6 || j5 > (1385982462174112868L ^ 1385982462079849371L)) {
                throw new C1539jX(str + i4 + strVd + j5);
            }
            int i6 = (int) j5;
            int iPosition = byteBufferQd.position() + i6;
            if (i6 > byteBufferQd.remaining()) {
                StringBuilder sbAppend = new StringBuilder().append(str).append(i4).append(strVd).append(i6);
                short sXd3 = (short) (C1607wl.Xd() ^ ((1164002222 ^ 1625002025) ^ 633008220));
                short sXd4 = (short) (C1607wl.Xd() ^ (43698495 ^ 43690497));
                int[] iArr2 = new int["\u0003u6J4;=11:2\u0006j".length()];
                QB qb2 = new QB("\u0003u6J4;=11:2\u0006j");
                int i7 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i7] = xuXd2.fK(sXd3 + i7 + xuXd2.CK(iKK2) + sXd4);
                    i7++;
                }
                throw new C1539jX(sbAppend.append(new String(iArr2, 0, i7)).append(byteBufferQd.remaining()).toString());
            }
            int i8 = byteBufferQd.getInt();
            if (i8 == i2) {
                return new C1605wK(i8 == (1838655521 ^ 480128827) ? GK.Yd : GK.ud, FN.od(byteBufferQd, i6 - 4), j2, j3, j4, byteBuffer2);
            }
            byteBufferQd.position(iPosition);
        }
        short sXd5 = (short) (FB.Xd() ^ (FB.Xd() ^ (1196095327 ^ 413529334)));
        int[] iArr3 = new int["v\u0011\u001c\u001e\u001a\u0018V*\u0018G\u0011\u0013\u001b\u0010N!*'1#999+f".length()];
        QB qb3 = new QB("v\u0011\u001c\u001e\u001a\u0018V*\u0018G\u0011\u0013\u001b\u0010N!*'1#999+f");
        int i9 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i9] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd5 ^ i9));
            i9++;
        }
        throw new C1539jX(new String(iArr3, 0, i9));
    }

    public static boolean yd() throws Throwable {
        int iXd = Od.Xd();
        Object[] objArr = new Object[0];
        int iXd2 = C1607wl.Xd() ^ (823098850 ^ (-1598780608));
        Method declaredMethod = Class.forName(C1561oA.Yd("\u0006t<\u0004|", (short) (iXd ^ ((2033231953 ^ 674292765) ^ (-1358956071))))).getDeclaredMethod(Xg.qd("\u000e;\u0018C4HHB", (short) (C1633zX.Xd() ^ (1354715068 ^ (-1354709457))), (short) (C1633zX.Xd() ^ iXd2)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
