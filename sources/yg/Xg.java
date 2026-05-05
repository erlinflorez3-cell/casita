package yg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes9.dex */
public class Xg {
    public static int Qd = 8192;
    public static int qd = 16;
    public static int ud = 8000;
    public static int vd = 3;
    public static int wd = 2;
    public static int yd = 1;
    public static double Xd = 0.0d;
    public static String Kd = "";

    public static int Kd(byte b2) {
        long j2 = b2;
        long j3 = (8652381721490682835L ^ 1847769210870111744L) ^ 7041368241684999468L;
        return (int) ((j2 + j3) - (j2 | j3));
    }

    public static boolean Od() {
        return C1558nK.Xd();
    }

    public static short Qd(short s2) {
        int i2 = s2 << 8;
        int i3 = (-1) - (((-1) - (s2 >>> 8)) | ((-1) - 255));
        return (short) ((i2 + i3) - (i2 & i3));
    }

    public static String od(String str) {
        FileReader fileReader;
        StringBuilder sb = new StringBuilder();
        try {
            fileReader = new FileReader(str);
        } catch (Throwable th) {
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append(Qg.kd("d", (short) (ZN.Xd() ^ (248817312 ^ 248810980)), (short) (ZN.Xd() ^ ((571877868 ^ 455415034) ^ 959666913))));
                } finally {
                }
            }
            bufferedReader.close();
            fileReader.close();
            return sb.toString();
        } finally {
        }
    }

    public static String qd(String str, short s2, short s3) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (s2 + i2)) + s3);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static void ud(float f2) {
        float f3 = C1603vu.Xd;
        if (Math.cos(f3) >= Double.longBitsToDouble((1897355856342330974L ^ 1014760030470648066L) ^ (-6074821782542672036L)) || Math.min(C1603vu.Xd, C1603vu.Xd) != 0.0f) {
            return;
        }
        NX.Xd = new Float(Math.cos(f3) * Double.longBitsToDouble((6178891028728948666L ^ 8608562294230079059L) ^ 7128095866763309545L)).intValue();
        Tg.Yd(f3);
    }

    public static byte[] vd(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean wd(ZipEntry zipEntry, Map map) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        String strVd = hg.Vd("\u0005q7VX", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69936940))), (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1460583319 ^ 1720160479))));
        short sXd = (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (1750311555 ^ (-1541013306))));
        int[] iArr = new int["hV".length()];
        QB qb = new QB("hV");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        byte[] bArr = (byte[]) obj;
        short sXd2 = (short) (ZN.Xd() ^ ((362731539 ^ 2077383683) ^ 1850512358));
        int[] iArr2 = new int["C;M9\u0003KG=M\u0010YIM\f5EY/U\\W_".length()];
        QB qb2 = new QB("C;M9\u0003KG=M\u0010YIM\f5EY/U\\W_");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Yd("\u000f\u000e\u001ex\r\u001a\u0013", (short) (C1499aX.Xd() ^ (1971682407 ^ (-1971656199)))), new Class[0]);
        try {
            method.setAccessible(true);
            WF wf = new WF(EO.yd(vd(bArr, ((String) method.invoke(zipEntry, objArr)).getBytes(StandardCharsets.UTF_8))));
            String strQd = qd("l[#DH", (short) (ZN.Xd() ^ ((1517228632 ^ 798688831) ^ 1978957101)), (short) (ZN.Xd() ^ ((1874695196 ^ 2024119847) ^ 387464237)));
            String strWd = Jg.Wd("\u0015I", (short) (Od.Xd() ^ (2106694380 ^ (-2106693548))), (short) (Od.Xd() ^ ((1319578427 ^ 830493496) ^ (-2133273313))));
            try {
                Class<?> cls2 = Class.forName(strQd);
                Field field2 = 0 != 0 ? cls2.getField(strWd) : cls2.getDeclaredField(strWd);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            long jLongValue = ((Long) obj2).longValue() + ((long) wf.Xd[0]);
            String strXd = ZO.xd("[|n\u001cQ", (short) (C1580rY.Xd() ^ (1041850245 ^ (-1041851029))), (short) (C1580rY.Xd() ^ (2135353645 ^ (-2135332499))));
            String strUd = C1626yg.Ud("U%", (short) (ZN.Xd() ^ ((2040922621 ^ 809221256) ^ 1235069417)), (short) (ZN.Xd() ^ (372195881 ^ 372186869)));
            Long lValueOf = Long.valueOf(jLongValue);
            try {
                Class<?> cls3 = Class.forName(strXd);
                Field field3 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
                field3.setAccessible(true);
                field3.set(null, lValueOf);
            } catch (Throwable th3) {
            }
            Long l2 = (Long) map.remove(wf);
            if (l2 == null) {
                return true;
            }
            long jLongValue2 = l2.longValue();
            short sXd3 = (short) (C1580rY.Xd() ^ (357394115 ^ (-357395549)));
            int[] iArr3 = new int[")r\u0016%1\u001b\u0002o\u0013\u0019gt,_,E#m_Y\u0018{".length()];
            QB qb3 = new QB(")r\u0016%1\u001b\u0002o\u0013\u0019gt,_,E#m_Y\u0018{");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd3 + i4)));
                i4++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(EO.Od("P\u001do!Qf", (short) (FB.Xd() ^ ((774222767 ^ 1293794041) ^ 1664644686))), new Class[0]);
            try {
                method2.setAccessible(true);
                if (jLongValue2 != ((Long) method2.invoke(zipEntry, objArr2)).longValue()) {
                    return false;
                }
                int size = map.size();
                String strQd2 = C1561oA.Qd("wd*IK", (short) (FB.Xd() ^ ((1185108564 ^ 1032269062) ^ 2065958115)));
                String strZd = C1593ug.zd("v\u0004", (short) (C1607wl.Xd() ^ ((1951576914 ^ 932461579) ^ 1137088552)), (short) (C1607wl.Xd() ^ (292117100 ^ 292114561)));
                try {
                    Class<?> cls4 = Class.forName(strQd2);
                    Field field4 = 0 != 0 ? cls4.getField(strZd) : cls4.getDeclaredField(strZd);
                    field4.setAccessible(true);
                    obj3 = field4.get(null);
                } catch (Throwable th4) {
                    obj3 = null;
                }
                long jLongValue3 = ((Long) obj3).longValue();
                if ((jLongValue3 + 1) - (jLongValue3 | 1) != 1) {
                    return true;
                }
                Object[] objArr3 = {zipEntry};
                Constructor<?> constructor = Class.forName(C1561oA.od("MCWA\rSQEG\bSAG\u0004/=C\u0017?DAG", (short) (Od.Xd() ^ ((1166425560 ^ 1481635493) ^ (-499746133))))).getConstructor(Class.forName(C1561oA.Kd("1)?+xAA7;}K;C\u0002/?G\u001dGNMU", (short) (C1580rY.Xd() ^ ((719319634 ^ 171451868) ^ (-552044572))))));
                try {
                    constructor.setAccessible(true);
                    ZipEntry zipEntry2 = (ZipEntry) constructor.newInstance(objArr3);
                    Class<?> cls5 = Class.forName(Wg.Zd("\u0018EqM)&@&8\u000f\u0012\u0018\f\\Bd|D\u0007?LH", (short) (OY.Xd() ^ ((1607302223 ^ 1779163329) ^ 902228788)), (short) (OY.Xd() ^ (781779645 ^ 781806956))));
                    Class<?>[] clsArr = {Long.TYPE};
                    Object[] objArr4 = {Long.valueOf((((long) size) ^ jLongValue2) & ((6828788582126379557L ^ 1023983007865567639L) ^ 5832531051125269581L))};
                    short sXd4 = (short) (C1499aX.Xd() ^ ((1917390044 ^ 1149210866) ^ (-909562382)));
                    int[] iArr4 = new int["viyIyk".length()];
                    QB qb4 = new QB("viyIyk");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd4 + i5));
                        i5++;
                    }
                    Method method3 = cls5.getMethod(new String(iArr4, 0, i5), clsArr);
                    try {
                        method3.setAccessible(true);
                        method3.invoke(zipEntry, objArr4);
                        Object[] objArr5 = new Object[0];
                        Method method4 = Class.forName(Wg.vd("ZPdN\u001a`^RT\u0015`NT\u0011<JP$LQNT", (short) (OY.Xd() ^ ((2137745389 ^ 1384863217) ^ 769686900)))).getMethod(Qg.kd("xu\u0004Q\u007fo", (short) (ZN.Xd() ^ ((259525796 ^ 1825621637) ^ 1672005009)), (short) (ZN.Xd() ^ (213151957 ^ 213154922))), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            long jLongValue4 = ((Long) method4.invoke(zipEntry, objArr5)).longValue();
                            long j2 = (~jLongValue2) & ((long) size);
                            long j3 = ~size;
                            long j4 = j2 | ((j3 + jLongValue2) - (j3 | jLongValue2));
                            long j5 = 7201544288053522625L ^ 7201544284709031742L;
                            if (jLongValue4 != (j4 + j5) - (j4 | j5)) {
                                return false;
                            }
                            Class<?> cls6 = Class.forName(hg.Vd("\u001a\u0010$\u000eY \u001e\u0012\u0014T \u000e\u0014P{\n\u0010c\f\u0011\u000e\u0014", (short) (C1580rY.Xd() ^ (430192106 ^ (-430180717))), (short) (C1580rY.Xd() ^ ((1693908127 ^ 1355228659) ^ (-875680224)))));
                            Class<?>[] clsArr2 = new Class[0];
                            Object[] objArr6 = new Object[0];
                            short sXd5 = (short) (C1499aX.Xd() ^ ((95441303 ^ 2035491777) ^ (-2095281495)));
                            int[] iArr5 = new int["\u0013\u0010\u001ek\u001a\n".length()];
                            QB qb5 = new QB("\u0013\u0010\u001ek\u001a\n");
                            int i6 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i6] = xuXd5.fK(sXd5 + i6 + xuXd5.CK(iKK5));
                                i6++;
                            }
                            Method method5 = cls6.getMethod(new String(iArr5, 0, i6), clsArr2);
                            try {
                                method5.setAccessible(true);
                                if (((Long) method5.invoke(zipEntry2, objArr6)).longValue() != jLongValue2) {
                                    return false;
                                }
                                long j6 = ~jLongValue2;
                                long j7 = (3603497318932665163L ^ 8856715368515217910L) ^ 5254414384769631554L;
                                long j8 = (j6 + j7) - (j6 | j7);
                                short sXd6 = (short) (C1499aX.Xd() ^ ((1658696256 ^ 1638996818) ^ (-57442579)));
                                int[] iArr6 = new int["\u001d\u0013'\u0011d+)\u001d'g3!/k\u0017%\u0013f\u000f\u0014\u0019\u001f".length()];
                                QB qb6 = new QB("\u001d\u0013'\u0011d+)\u001d'g3!/k\u0017%\u0013f\u000f\u0014\u0019\u001f");
                                int i7 = 0;
                                while (qb6.YK()) {
                                    int iKK6 = qb6.KK();
                                    Xu xuXd6 = Xu.Xd(iKK6);
                                    iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (sXd6 ^ i7));
                                    i7++;
                                }
                                Class<?> cls7 = Class.forName(new String(iArr6, 0, i7));
                                Class<?>[] clsArr3 = {Long.TYPE};
                                Object[] objArr7 = {Long.valueOf(j8)};
                                Method method6 = cls7.getMethod(C1561oA.Yd(".!1\u00011#", (short) (Od.Xd() ^ (2145535150 ^ (-2145528935)))), clsArr3);
                                try {
                                    method6.setAccessible(true);
                                    method6.invoke(zipEntry2, objArr7);
                                    short sXd7 = (short) (OY.Xd() ^ (1754179769 ^ 1754181923));
                                    short sXd8 = (short) (OY.Xd() ^ ((545176993 ^ 2023025827) ^ 1491741523));
                                    int[] iArr7 = new int["_WmY'ooei,yiq0]muKu|{\u0004".length()];
                                    QB qb7 = new QB("_WmY'ooei,yiq0]muKu|{\u0004");
                                    int i8 = 0;
                                    while (qb7.YK()) {
                                        int iKK7 = qb7.KK();
                                        Xu xuXd7 = Xu.Xd(iKK7);
                                        iArr7[i8] = xuXd7.fK((xuXd7.CK(iKK7) - (sXd7 + i8)) + sXd8);
                                        i8++;
                                    }
                                    Object[] objArr8 = new Object[0];
                                    Method method7 = Class.forName(new String(iArr7, 0, i8)).getMethod(Jg.Wd("\u00030 <LF", (short) (OY.Xd() ^ ((571562165 ^ 1307794735) ^ 1877097439)), (short) (OY.Xd() ^ ((1314340094 ^ 1448891197) ^ 403406573))), new Class[0]);
                                    try {
                                        method7.setAccessible(true);
                                        return ((Long) method7.invoke(zipEntry2, objArr8)).longValue() == (-1) - (((-1) - j7) | ((-1) - (~jLongValue2)));
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
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        } catch (InvocationTargetException e9) {
            throw e9.getCause();
        }
    }

    public static boolean xd(float f2) {
        return new Float(f2).compareTo(Float.valueOf(C1603vu.Xd)) > 0;
    }

    public static void yd(InputStream inputStream, byte[] bArr, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            try {
                int i4 = inputStream.read(bArr, i3, i2 - i3);
                if (i4 == ((1458448200 ^ 1320083786) ^ (-406898179))) {
                    return;
                } else {
                    i3 += i4;
                }
            } catch (Throwable th) {
                return;
            }
        }
    }
}
