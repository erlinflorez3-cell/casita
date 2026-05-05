package yg;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class CX {
    public static final ArrayList<byte[]> Xd = new ArrayList<>();

    public static byte[] Od() throws Throwable {
        Object[] objArr = {C1561oA.ud("ff\u0013fffeac`\f\tY[\n\\VVVO\u0005\u0003UQPROHJJKy", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1572392878 ^ 440730262))))};
        Method declaredMethod = Class.forName(C1561oA.yd("VC\r?H", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1693164962 ^ 1432549842))))).getDeclaredMethod(Xg.qd(")5", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (195946006 ^ (-260485518)))), (short) (C1580rY.Xd() ^ ((192427992 ^ 1315049223) ^ (-1159357793)))), Class.forName(C1561oA.Yd("bZp\\*i_mg/Uwvntn", (short) (Od.Xd() ^ (Od.Xd() ^ (203510535 ^ (-1272758229)))))));
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void Qd(long j2) {
        synchronized (Xd) {
            for (byte[] bArr : Xd) {
                if (Long.parseLong(new StringTokenizer(Yd(bArr), C1626yg.Ud("\u001e", (short) (OY.Xd() ^ (1356161109 ^ 1356165740)), (short) (OY.Xd() ^ (261001389 ^ 261024955)))).nextToken()) == j2) {
                    Xd.remove(bArr);
                    return;
                }
            }
        }
    }

    public static int Xd(int i2) {
        return i2 ^ FB.Xd();
    }

    public static String Yd(byte[] bArr) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Yd("YH\u0010&<", (short) (C1633zX.Xd() ^ ((2045456082 ^ 301052428) ^ (-1746583256))))).getDeclaredMethod(Xg.qd("Si", (short) (Od.Xd() ^ ((1881483522 ^ 549417856) ^ (-1352274664))), (short) (Od.Xd() ^ ((409820424 ^ 1210443027) ^ (-1346949309)))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr2 = (byte[]) declaredMethod.invoke(null, objArr);
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(Jg.Wd(";|7CL", (short) (C1580rY.Xd() ^ ((1299624890 ^ 1198380145) ^ (-169546790))), (short) (C1580rY.Xd() ^ ((872519451 ^ 1456154095) ^ (-1657440412))))).getDeclaredMethod(ZO.xd("L\u001e", (short) (C1607wl.Xd() ^ (147212961 ^ 147197916)), (short) (C1607wl.Xd() ^ (1737879401 ^ 1737878944))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    byte[] bArr3 = (byte[]) declaredMethod2.invoke(null, objArr2);
                    Class<?> cls = Class.forName(C1626yg.Ud("\u0013nb9\u0001", (short) (FB.Xd() ^ ((1634247659 ^ 578943344) ^ 1139347092)), (short) (FB.Xd() ^ ((1223428081 ^ 886626187) ^ 2083824965))));
                    Class<?>[] clsArr = new Class[(442368908 ^ 1805179549) ^ 1908857106];
                    clsArr[0] = byte[].class;
                    clsArr[1] = byte[].class;
                    clsArr[1869103114 ^ 1869103112] = byte[].class;
                    Object[] objArr3 = new Object[(1563267393 ^ 1469440937) ^ 179860203];
                    objArr3[0] = bArr;
                    objArr3[1] = bArr2;
                    objArr3[(29768848 ^ 970697510) ^ 941463476] = bArr3;
                    Method declaredMethod3 = cls.getDeclaredMethod(Ig.wd("\u000bu", (short) (Od.Xd() ^ ((555529391 ^ 1378610075) ^ (-1932991729)))), clsArr);
                    try {
                        declaredMethod3.setAccessible(true);
                        return new String((byte[]) declaredMethod3.invoke(null, objArr3));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Exception e5) {
            return "";
        }
    }

    public static byte[] qd(String str) throws Throwable {
        try {
            byte[] bytes = str.getBytes();
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(EO.Od("\u0019T/ay", (short) (FB.Xd() ^ (649304535 ^ 649330553)))).getDeclaredMethod(C1561oA.Qd("\u000f#", (short) (C1607wl.Xd() ^ (1879018867 ^ 1879027748))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                short sXd = (short) (ZN.Xd() ^ (749528200 ^ 749518311));
                short sXd2 = (short) (ZN.Xd() ^ (1352619927 ^ 1352618285));
                int[] iArr = new int["%\u0014[q\b".length()];
                QB qb = new QB("%\u0014[q\b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = cls.getDeclaredMethod(C1561oA.od("K8", (short) (ZN.Xd() ^ (1662986852 ^ 1662992021))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    byte[] bArr2 = (byte[]) declaredMethod2.invoke(null, objArr2);
                    Class<?> cls2 = Class.forName(C1561oA.Kd("+\u001aa\u0016\u000f", (short) (C1499aX.Xd() ^ ((518212571 ^ 1547993993) ^ (-1118278818)))));
                    Class<?>[] clsArr = new Class[(1011683363 ^ 649134585) ^ 452727257];
                    clsArr[0] = byte[].class;
                    clsArr[1] = byte[].class;
                    clsArr[989447819 ^ 989447817] = byte[].class;
                    Object[] objArr3 = new Object[793090004 ^ 793090007];
                    objArr3[0] = bytes;
                    objArr3[1] = bArr;
                    objArr3[(755848447 ^ 261982838) ^ 579919499] = bArr2;
                    Method declaredMethod3 = cls2.getDeclaredMethod(Wg.Zd("5\r", (short) (OY.Xd() ^ (1849213944 ^ 1849224388)), (short) (OY.Xd() ^ (848701280 ^ 848704514))), clsArr);
                    try {
                        declaredMethod3.setAccessible(true);
                        return (byte[]) declaredMethod3.invoke(null, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Exception e5) {
            return new byte[0];
        }
    }

    public static void ud() throws Exception {
        ArrayList<String> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jLongValue = 0;
        short sXd = (short) (ZN.Xd() ^ ((650911120 ^ 1029210303) ^ 462723438));
        short sXd2 = (short) (ZN.Xd() ^ (1921539653 ^ 1921520501));
        int[] iArr = new int["\u001a\u0010$\u000eY\u0017\u000b\u0017\u000fTx\u001e\u0017\u0017\u0007\u000e".length()];
        QB qb = new QB("\u001a\u0010$\u000eY\u0017\u000b\u0017\u000fTx\u001e\u0017\u0017\u0007\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        try {
            jLongValue = ((Long) Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("l}yxjrwVjmdKfhgcl", (short) (C1607wl.Xd() ^ ((1953008164 ^ 1437814556) ^ 568045408))), new Class[0]).invoke(null, new Object[0])).longValue();
        } catch (Exception e2) {
        }
        synchronized (Xd) {
            try {
                for (byte[] bArr : Xd) {
                    StringTokenizer stringTokenizer = new StringTokenizer(Yd(bArr), C1561oA.yd("k", (short) (OY.Xd() ^ (79630755 ^ 79642554))));
                    stringTokenizer.nextToken();
                    String strNextToken = stringTokenizer.nextToken();
                    String strNextToken2 = stringTokenizer.nextToken();
                    String strNextToken3 = stringTokenizer.nextToken();
                    if (jLongValue - Long.parseLong(stringTokenizer.nextToken()) > (328317981 ^ 328317975) * 1000) {
                        try {
                            arrayList2.add(bArr);
                            arrayList.add(strNextToken2 + C1561oA.Yd(ExifInterface.LONGITUDE_EAST, (short) (C1607wl.Xd() ^ ((176566298 ^ 600388139) ^ 693051092))) + strNextToken3);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        int i3 = Integer.parseInt(strNextToken);
                        Class<?> cls = Class.forName(Xg.qd("H7~\u0015+", (short) (OY.Xd() ^ (562493813 ^ 562471122)), (short) (OY.Xd() ^ (1796858637 ^ 1796835640))));
                        Class<?>[] clsArr = {Integer.TYPE};
                        Object[] objArr = {Integer.valueOf(i3)};
                        Method declaredMethod = cls.getDeclaredMethod(Jg.Wd(",w", (short) (ZN.Xd() ^ ((1965935139 ^ 903167342) ^ 1090045318)), (short) (ZN.Xd() ^ ((2053053589 ^ 348479900) ^ 1855614864))), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
                            boolean z2 = false;
                            for (ThreadGroup threadGroup = Thread.currentThread().getThreadGroup(); threadGroup != null; threadGroup = threadGroup.getParent()) {
                                Thread[] threadArr = new Thread[threadGroup.activeCount()];
                                threadGroup.enumerate(threadArr, true);
                                int length = threadArr.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        break;
                                    }
                                    if (threadArr[i4].getId() == iIntValue) {
                                        z2 = true;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            if (!z2) {
                                arrayList2.add(bArr);
                                arrayList.add(strNextToken2 + ZO.xd("m", (short) (FB.Xd() ^ (1045821966 ^ 1045819980)), (short) (FB.Xd() ^ (1202840663 ^ 1202846951))) + strNextToken3);
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                }
                Xd.removeAll(arrayList2);
                for (String str : arrayList) {
                    short sXd3 = (short) (ZN.Xd() ^ (609490652 ^ 609514093));
                    short sXd4 = (short) (ZN.Xd() ^ (385878262 ^ 385897087));
                    int[] iArr2 = new int[">".length()];
                    QB qb2 = new QB(">");
                    int i5 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i5] = xuXd2.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i5 * sXd4))) + xuXd2.CK(iKK2));
                        i5++;
                    }
                    StringTokenizer stringTokenizer2 = new StringTokenizer(str, new String(iArr2, 0, i5));
                    try {
                        Class.forName(stringTokenizer2.nextToken()).getMethod(stringTokenizer2.nextToken(), new Class[0]).invoke(null, new Object[0]);
                    } catch (Exception e4) {
                        throw e4;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] vd() throws Throwable {
        Object[] objArr = {C1561oA.Xd("4>6@i@ll@B>GIsIGxNKNH}~\u0002\u0003UR\u0004\u0002Y\u0004Z", (short) (OY.Xd() ^ (OY.Xd() ^ (227658145 ^ 163225202))))};
        Method declaredMethod = Class.forName(Wg.vd("\u000byAu|", (short) (C1633zX.Xd() ^ ((1835095435 ^ 377455998) ^ (-2065621379))))).getDeclaredMethod(hg.Vd("%/", (short) (Od.Xd() ^ (1702526913 ^ (-1702499170))), (short) (Od.Xd() ^ (2026642383 ^ (-2026636501)))), Class.forName(Qg.kd("\"\u0018,\u0016a\u001f\u0013\u001f\u0017\\\u0001!\u001e\u0014\u0018\u0010", (short) (OY.Xd() ^ ((2026727839 ^ 1459329713) ^ 775324148)), (short) (OY.Xd() ^ ((912732771 ^ 153120684) ^ 1061636481)))));
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void yd(String str, String str2) throws Exception {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Ig.wd("<d&2\u001d&}Y1KBqHp\u007fq+Mo|/o`XY5", (short) (FB.Xd() ^ (435234183 ^ 435254758)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            int iNextInt = ((SecureRandom) constructor.newInstance(objArr)).nextInt((2121939596 ^ 248237021) ^ 256773806);
            Kp kp = new Kp(iNextInt, str, str2);
            int i2 = ((iNextInt ^ ((1825713125 ^ 767167714) ^ 1083082829)) << 7) ^ 65;
            int i3 = (35393772 ^ 1460072778) ^ 1427825078;
            int i4 = Integer.parseInt(EO.Od("*_\u000f'\u007f", (short) (Od.Xd() ^ (564009631 ^ (-564017989)))), i3) ^ ((int) ((-1) - (((-1) - ((8711229772403721958L ^ 5576766997218490649L) ^ 3855126754343141120L)) | ((-1) - kp.getId()))));
            Class<?> cls = Class.forName(C1593ug.zd("hW\u001f5K", (short) (OY.Xd() ^ ((23107247 ^ 879964772) ^ 890492673)), (short) (OY.Xd() ^ (1288386437 ^ 1288397049))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i4 + (((i4 << (Integer.parseInt(C1561oA.Qd("-2<", (short) (OY.Xd() ^ (951766370 ^ 951768716))), i3) - 650)) + i4) * ((i4 << 2) + i4)))};
            short sXd = (short) (ZN.Xd() ^ ((1407572733 ^ 1621439665) ^ 859887474));
            int[] iArr = new int["\u001d(".length()];
            QB qb = new QB("\u001d(");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(sXd + sXd + i5 + xuXd.CK(iKK));
                i5++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i5), clsArr);
            try {
                declaredMethod.setAccessible(true);
                int iIntValue = i2 ^ ((Integer) declaredMethod.invoke(null, objArr2)).intValue();
                long j2 = (6165075977455614895L ^ 4481807975761255240L) ^ 7763127599383585000L;
                int i6 = iIntValue ^ ((Integer.parseInt(C1561oA.Kd("yz", (short) (C1580rY.Xd() ^ ((1359453417 ^ 375314974) ^ (-1197029992)))), i3) + 20) << ((byte) ((j2 + r15) - (j2 | r15))));
                Class<?> cls2 = Class.forName(Wg.Zd("~K]a@", (short) (C1607wl.Xd() ^ (1379370260 ^ 1379388813)), (short) (C1607wl.Xd() ^ ((1378774144 ^ 979380222) ^ 1749965582))));
                Class<?>[] clsArr2 = {Integer.TYPE};
                Object[] objArr3 = {Integer.valueOf(i6)};
                short sXd2 = (short) (C1607wl.Xd() ^ ((772031768 ^ 512817972) ^ 815059785));
                int[] iArr2 = new int["\u0017$".length()];
                QB qb2 = new QB("\u0017$");
                int i7 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i7));
                    i7++;
                }
                Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr2, 0, i7), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    int iIntValue2 = ((Integer) declaredMethod2.invoke(null, objArr3)).intValue();
                    synchronized (Xd) {
                        long id = kp.getId();
                        StringBuilder sbAppend = new StringBuilder().append("").append(iIntValue2);
                        String strVd = Wg.vd("P", (short) (FB.Xd() ^ (912365389 ^ 912381440)));
                        StringBuilder sbAppend2 = new StringBuilder().append(sbAppend.append(strVd).toString());
                        Class<?> cls3 = Class.forName(Qg.kd("\fx>Rf", (short) (C1580rY.Xd() ^ (388434951 ^ (-388457838))), (short) (C1580rY.Xd() ^ ((441039883 ^ 1533177222) ^ (-1093386143)))));
                        Class<?>[] clsArr3 = {Integer.TYPE};
                        Object[] objArr4 = {Integer.valueOf((int) id)};
                        Method declaredMethod3 = cls3.getDeclaredMethod(hg.Vd("fq", (short) (C1607wl.Xd() ^ ((1683618356 ^ 908270961) ^ 1383781429)), (short) (C1607wl.Xd() ^ ((1708586468 ^ 713488580) ^ 1330673741))), clsArr3);
                        try {
                            declaredMethod3.setAccessible(true);
                            StringBuilder sbAppend3 = new StringBuilder().append((sbAppend2.append(((Integer) declaredMethod3.invoke(null, objArr4)).intValue()).append(strVd).toString() + str + strVd) + str2 + strVd);
                            long jLongValue = 0;
                            try {
                                jLongValue = ((Long) Class.forName(C1561oA.ud("bXlV\"_S_W\u001dAf__OV", (short) (OY.Xd() ^ (1126583186 ^ 1126596596)))).getMethod(C1561oA.yd("ZmghXbeFhmbKdhecZ", (short) (ZN.Xd() ^ (362944123 ^ 362956573))), new Class[0]).invoke(null, new Object[0])).longValue();
                            } catch (Exception e2) {
                            }
                            Xd.add(qd(sbAppend3.append(jLongValue).toString()));
                            kp.start();
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
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
    }
}
