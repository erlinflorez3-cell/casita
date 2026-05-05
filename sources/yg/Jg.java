package yg;

import android.widget.EditText;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class Jg {
    public static void Qd(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i2 + i5;
            bArr[i6] = (byte) (bArr[i6] ^ bArr2[i3 + i5]);
        }
    }

    public static String Wd(String str, short s2, short s3) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * s3) ^ s2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static int Xd(long j2) {
        int i2 = 0;
        do {
            j2 >>>= (1270518184 ^ 1948771908) ^ 1067284459;
            i2++;
        } while (j2 != 0);
        return i2;
    }

    public static boolean YX(int i2) {
        for (int i3 = 0; i3 < i2 % 10; i3 += 4) {
            if (i3 == i2 || i2 == Xg.Kd.length()) {
                return true;
            }
        }
        return false;
    }

    public static void kX(EditText editText) {
        SY.Yd = editText;
    }

    public static X509Certificate[] od(ByteBuffer byteBuffer, CertificateFactory certificateFactory, GK gk) throws Throwable {
        ByteBuffer byteBufferUd = FN.ud(byteBuffer);
        if (gk == GK.ud) {
            byteBuffer.getInt();
            byteBuffer.getInt();
        }
        FN.ud(byteBuffer);
        FN.ud(byteBufferUd);
        ByteBuffer byteBufferUd2 = FN.ud(byteBufferUd);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (byteBufferUd2.hasRemaining()) {
            i2++;
            byte[] bArrOd = C1626yg.Od(byteBufferUd2);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOd);
                Class<?> cls = Class.forName(ZO.xd("E&r(\u001af9d\u001c\u001cr}\u0012MY\u007f\u007fm\u007f`V9c\u007f]Pk0&E)D<U\"W\u001e", (short) (ZN.Xd() ^ ((674829664 ^ 1068203985) ^ 395458879)), (short) (ZN.Xd() ^ (567695157 ^ 567693547))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1626yg.Ud("=l'' \b[5\u0012\u0005&g\u0012%Dc\u0012*.", (short) (C1633zX.Xd() ^ ((1842974568 ^ 1993374761) ^ (-453621221))), (short) (C1633zX.Xd() ^ (1299853932 ^ (-1299859614)))));
                Object[] objArr = {byteArrayInputStream};
                Method method = cls.getMethod(Ig.wd("\u0012[0\u001d\u0001+P~\u0006\u001e#l3<\u0019rHCy", (short) (FB.Xd() ^ ((2102298414 ^ 1593614842) ^ 598895490))), clsArr);
                try {
                    method.setAccessible(true);
                    arrayList.add(new Vu((X509Certificate) ((Certificate) method.invoke(certificateFactory, objArr)), bArrOd));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (CertificateException e3) {
                StringBuilder sb = new StringBuilder();
                short sXd = (short) (C1607wl.Xd() ^ ((1526287889 ^ 1743324445) ^ 1024460784));
                int[] iArr = new int["zLD\"t(\u0002\t*I\u0012n\u0017+\"\u007fvBn\u0006\u001eYjk{\u0010C\u0001K~".length()];
                QB qb = new QB("zLD\"t(\u0002\t*I\u0012n\u0017+\"\u007fvBn\u0006\u001eYjk{\u0010C\u0001K~");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                    i3++;
                }
                throw new SecurityException(sb.append(new String(iArr, 0, i3)).append(i2).toString(), e3);
            }
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }

    public static boolean qd() throws Throwable {
        int iXd = C1580rY.Xd() ^ (-831080607);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Qd("VC\t)\u001a", (short) (ZN.Xd() ^ iXd))).getDeclaredMethod(C1593ug.zd("]K", (short) (C1633zX.Xd() ^ ((993882687 ^ 1477063602) ^ (-1664555320))), (short) (C1633zX.Xd() ^ (93269840 ^ (-93272733)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static List ud(C1605wK c1605wK) throws Throwable {
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        short sXd = (short) (ZN.Xd() ^ (1268706767 ^ 1268692938));
        int[] iArr = new int["W,2,4".length()];
        QB qb = new QB("W,2,4");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        short sXd2 = (short) (OY.Xd() ^ ((886062506 ^ 1651704833) ^ 1453549109));
        int[] iArr2 = new int["7/E1~E87JH@LR\b>AOR\r#FTWMKOJI]O1MPb^bj".length()];
        QB qb2 = new QB("7/E1~E87JH@LR\b>AOR\r#FTWMKOJI]O1MPb^bj");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i4));
            i4++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr2, 0, i4));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.Zd("\u0003&f~wa\u007f9MA\u0013_\u0007*Z\u0001", (short) (C1499aX.Xd() ^ ((827413930 ^ 1926781815) ^ (-1133065834))), (short) (C1499aX.Xd() ^ ((1234801702 ^ 2048836048) ^ (-864495461)))));
            Object[] objArr = {str};
            short sXd3 = (short) (OY.Xd() ^ ((772700999 ^ 1575593933) ^ 1944564003));
            int[] iArr3 = new int["ts\u0004Y\u007f\u0006\bu\u0004y|".length()];
            QB qb3 = new QB("ts\u0004Y\u007f\u0006\bu\u0004y|");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i5));
                i5++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i5), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                try {
                    ByteBuffer byteBufferUd = FN.ud(c1605wK.od);
                    while (byteBufferUd.hasRemaining()) {
                        try {
                            arrayList.add(od(FN.ud(byteBufferUd), certificateFactory, c1605wK.Qd));
                            i2++;
                        } catch (IOException | SecurityException | BufferUnderflowException e2) {
                            StringBuilder sbAppend = new StringBuilder().append(Wg.vd("4PY]WW\u0014iU\u0007XJ\\^Q\rQHGOGU\u0004\b", (short) (C1633zX.Xd() ^ ((1996589445 ^ 365049805) ^ (-1656991452))))).append(i2);
                            short sXd4 = (short) (C1580rY.Xd() ^ ((2067682897 ^ 523855143) ^ (-1678185280)));
                            short sXd5 = (short) (C1580rY.Xd() ^ ((1911241146 ^ 1921781219) ^ (-57106783)));
                            int[] iArr4 = new int["{=FH;B".length()];
                            QB qb4 = new QB("{=FH;B");
                            int i6 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i6] = xuXd4.fK(((sXd4 + i6) + xuXd4.CK(iKK4)) - sXd5);
                                i6++;
                            }
                            throw new SecurityException(sbAppend.append(new String(iArr4, 0, i6)).toString(), e2);
                        }
                    }
                    return arrayList;
                } catch (IOException e3) {
                    throw new SecurityException(hg.Vd("Rlsumk&ys#tfac\u001eienn\u0019g]\u0016h]Z`Vbb", (short) (OY.Xd() ^ ((828475235 ^ 1758091177) ^ 1504412284)), (short) (OY.Xd() ^ (133089150 ^ 133086957))), e3);
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (CertificateException e5) {
            throw new RuntimeException(C1561oA.ud("3MTVNL\u0007ZT\u0004RDUAHL|4\t\u000f\t\u0011v\u0019:FG;792/A1\u0011+,<68>", (short) (FB.Xd() ^ (2070272857 ^ 2070260284))), e5);
        }
    }

    public static int[] vd() {
        byte[] bArrWd = Ug.wd();
        return new int[]{Tg.Xd(bArrWd[Od.Xd() ^ 1207800927]), Tg.Xd(bArrWd[(1499129030 ^ 153129056) ^ 1350202538]), Tg.Xd(bArrWd[27356163 ^ 27356173]), Tg.Xd(bArrWd[Od.Xd() ^ (2115478248 ^ 971650733)])};
    }

    public static void wd(int i2) {
        float f2 = JK.Xd;
        C1593ug.Qd((int) (C1603vu.Xd - (JK.Xd % 10)));
    }
}
