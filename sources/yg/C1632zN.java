package yg;

import android.os.Build;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: yg.zN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1632zN extends Thread {
    int Kd;
    int Xd;
    int Yd;
    int[] od;
    BX ud;

    public C1632zN(int i2, BX bx, int i3, int i4, int[] iArr) {
        String strKd = Qg.kd("2\u001fd0\u0003", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609523768))), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (294280057 ^ (-1450703747)))));
        String strVd = hg.Vd("ju", (short) (C1580rY.Xd() ^ (1875073813 ^ (-1875078740))), (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (1775260543 ^ (-1515878312)))));
        Integer numValueOf = Integer.valueOf(i2);
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            field.set(this, numValueOf);
        } catch (Throwable th) {
        }
        String strUd = C1561oA.ud("iV\u001cg:", (short) (FB.Xd() ^ (450464328 ^ 450484588)));
        String strYd = C1561oA.yd("jZ", (short) (Od.Xd() ^ ((913915158 ^ 1412105098) ^ (-1649547225))));
        try {
            Class<?> cls2 = Class.forName(strUd);
            Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
            field2.setAccessible(true);
            field2.set(this, bx);
        } catch (Throwable th2) {
        }
        short sXd = (short) (C1499aX.Xd() ^ (667437007 ^ (-667427964)));
        int[] iArr2 = new int["\u000byA\u000fc".length()];
        QB qb = new QB("\u000byA\u000fc");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i5] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i5));
            i5++;
        }
        String str = new String(iArr2, 0, i5);
        short sXd2 = (short) (ZN.Xd() ^ ((1324555941 ^ 1346397668) ^ 515071938));
        short sXd3 = (short) (ZN.Xd() ^ (1890682915 ^ 1890705274));
        int[] iArr3 = new int["\u0004\u0010".length()];
        QB qb2 = new QB("\u0004\u0010");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr3[i6] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i6)) + sXd3);
            i6++;
        }
        String str2 = new String(iArr3, 0, i6);
        Integer numValueOf2 = Integer.valueOf(i3);
        try {
            Class<?> cls3 = Class.forName(str);
            Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
            field3.setAccessible(true);
            field3.set(this, numValueOf2);
        } catch (Throwable th3) {
        }
        String strWd = Jg.Wd("<C@Ve", (short) (C1580rY.Xd() ^ ((1261691498 ^ 432074637) ^ (-1391661909))), (short) (C1580rY.Xd() ^ (154618146 ^ (-154630767))));
        String strXd = ZO.xd("5;", (short) (FB.Xd() ^ ((2135017784 ^ 521271926) ^ 1615880467)), (short) (FB.Xd() ^ (1675129308 ^ 1675131906)));
        Integer numValueOf3 = Integer.valueOf(i4);
        try {
            Class<?> cls4 = Class.forName(strWd);
            Field field4 = 0 != 0 ? cls4.getField(strXd) : cls4.getDeclaredField(strXd);
            field4.setAccessible(true);
            field4.set(this, numValueOf3);
        } catch (Throwable th4) {
        }
        String strUd2 = C1626yg.Ud("\u0004v\u0012\u001e\u001e", (short) (C1580rY.Xd() ^ (100078625 ^ (-100086185))), (short) (C1580rY.Xd() ^ (813548462 ^ (-813555236))));
        String strWd2 = Ig.wd("{9", (short) (ZN.Xd() ^ ((1440997330 ^ 385874039) ^ 1125914297)));
        try {
            Class<?> cls5 = Class.forName(strUd2);
            Field field5 = 0 != 0 ? cls5.getField(strWd2) : cls5.getDeclaredField(strWd2);
            field5.setAccessible(true);
            field5.set(this, iArr);
        } catch (Throwable th5) {
        }
    }

    private static int Kd(int i2, BX bx, int i3, int i4, int[] iArr) throws Throwable {
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT < ((882336308 ^ 973397896) ^ 244563361)) {
            ud(hashSet, Qg.kd("b#$ \u0013]\u001c\u0012 Y\u001e\f\u0018", (short) (Od.Xd() ^ ((559214664 ^ 2069520385) ^ (-1510917020))), (short) (Od.Xd() ^ (648089869 ^ (-648103354)))), i3);
            ud(hashSet, hg.Vd("G\b\t\u0005wB\u0001v\u0005>\u0003p|A", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831091341))), (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1551749582 ^ 59957311)))), i3);
        }
        Yd(hashSet, i3);
        if (iArr != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int length = iArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (num.intValue() == iArr[i5]) {
                            it.remove();
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        int iXd = Xd(i4, i3, Xd(i4, i3, i2, bx, false), bx, true);
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            iXd = Xd(((Integer) it2.next()).intValue(), i3, iXd, bx, true);
        }
        return (-1) - (((-1) - iXd) & ((-1) - 2));
    }

    private static boolean Qd(int i2) {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), i2);
            try {
                socket.setSoTimeout((1737764379 ^ 999497876) ^ 1543966341);
                byte[] bArr = new byte[442106559 ^ 442112703];
                OutputStream outputStream = socket.getOutputStream();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
                short sXd = (short) (ZN.Xd() ^ ((1102213274 ^ 919399571) ^ 2004794379));
                short sXd2 = (short) (ZN.Xd() ^ (816501340 ^ 816510180));
                int[] iArr = new int["w\r\u0014wK^\u001d*\u001eyc\r\t\u000f\u0014d%8`!%<,#\u001d50!R\u0013\t!\u0014*2?9P\u0013\u0011Buc\u0003i\u0005|=~)\u001a{\u001eD<EYaaryNd\u0016\u001evT$ 80G;SKf^vn\u0002y\u0012\u000e%\u001d5)A891\u0016V|rTy \u0015\u001e-99KU&Gjn\bu\u0018\u000eqKtn\\$WFdKf_O-\u001d~\u0013\u001c0 ?1XaDZhm?K\u0006{\u001d\u001e{Y\u00187F9R\u00171-:3IO90".length()];
                QB qb = new QB("w\r\u0014wK^\u001d*\u001eyc\r\t\u000f\u0014d%8`!%<,#\u001d50!R\u0013\t!\u0014*2?9P\u0013\u0011Buc\u0003i\u0005|=~)\u001a{\u001eD<EYaaryNd\u0016\u001evT$ 80G;SKf^vn\u0002y\u0012\u000e%\u001d5)A891\u0016V|rTy \u0015\u001e-99KU&Gjn\bu\u0018\u000eqKtn\\$WFdKf_O-\u001d~\u0013\u001c0 ?1XaDZhm?K\u0006{\u001d\u001e{Y\u00187F9R\u00171-:3IO90");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                    i3++;
                }
                outputStream.write(new String(iArr, 0, i3).getBytes());
                outputStream.flush();
                z = new String(bArr, 0, bufferedInputStream.read(bArr)).contains(ZO.xd("gL\u0012p<w\u0010wAdK$\b~iD\u000f5>", (short) (C1580rY.Xd() ^ ((221648635 ^ 295715924) ^ (-479604757))), (short) (C1580rY.Xd() ^ (1344248439 ^ (-1344259383)))));
                socket.close();
            } finally {
            }
        } catch (Exception e2) {
        }
        return z;
    }

    private static int Xd(int i2, int i3, int i4, BX bx, boolean z2) throws Throwable {
        boolean zBooleanValue;
        Object obj;
        Object obj2;
        int i5 = i2 ^ i3;
        if (!od(i5)) {
            return (-1) - (((-1) - i4) & ((-1) - 2));
        }
        if (z2) {
            Class<?> cls = Class.forName(EO.Od("\u0018`)\u0016q", (short) (Od.Xd() ^ ((1074717520 ^ 83402164) ^ (-1156999842)))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i5)};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("}g", (short) (C1607wl.Xd() ^ ((1240599749 ^ 1526624570) ^ 319565571))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                zBooleanValue = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Class<?> cls2 = Class.forName(C1593ug.zd("SB\nW,", (short) (ZN.Xd() ^ (8822731 ^ 8816541)), (short) (ZN.Xd() ^ ((1904376744 ^ 728296273) ^ 1525327452))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i5)};
            short sXd = (short) (ZN.Xd() ^ ((112344013 ^ 626523954) ^ 602270966));
            int[] iArr = new int["\u0003\u0015".length()];
            QB qb = new QB("\u0003\u0015");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(sXd + sXd + i6 + xuXd.CK(iKK));
                i6++;
            }
            Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr, 0, i6), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                zBooleanValue = ((Boolean) declaredMethod2.invoke(null, objArr2)).booleanValue();
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (zBooleanValue) {
            i4 = (i4 + 133) - (i4 & 133);
            short sXd2 = (short) (C1633zX.Xd() ^ ((1472630554 ^ 1413026230) ^ (-67081301)));
            int[] iArr2 = new int["P?\u0007B)".length()];
            QB qb2 = new QB("P?\u0007B)");
            int i7 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i7));
                i7++;
            }
            String str = new String(iArr2, 0, i7);
            String strZd = Wg.Zd("a(", (short) (C1607wl.Xd() ^ (1367123299 ^ 1367117756)), (short) (C1607wl.Xd() ^ ((670602201 ^ 771262542) ^ 167774336)));
            try {
                Class<?> cls3 = Class.forName(str);
                Field field = 0 != 0 ? cls3.getField(strZd) : cls3.getDeclaredField(strZd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            Ao aoPX = bx.PX((EnumC1527hN) obj);
            String strXd = C1561oA.Xd("B1xB1", (short) (C1633zX.Xd() ^ (1758976366 ^ (-1758984677))));
            String strVd = Wg.vd("1E", (short) (C1499aX.Xd() ^ (1244044854 ^ (-1244066608))));
            try {
                Class<?> cls4 = Class.forName(strXd);
                Field field2 = 0 != 0 ? cls4.getField(strVd) : cls4.getDeclaredField(strVd);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            aoPX.sX((EnumC1599vd) obj2, Integer.valueOf(i5));
        }
        return (i4 + 2) - (i4 & 2);
    }

    private static void Yd(Set<Integer> set, int i2) {
        HashSet hashSet = new HashSet();
        for (Integer num : set) {
            int iIntValue = num.intValue() ^ i2;
            for (int i3 = (408512839 ^ 616219897) ^ 1021563070; i3 <= ((1409015749 ^ 1279589703) ^ 532635529); i3++) {
                if (iIntValue == i3) {
                    hashSet.add(num);
                }
            }
            for (int i4 = 1892565142 ^ 1892582348; i4 <= (1799479159 ^ 1799429371); i4++) {
                if (iIntValue == i4) {
                    hashSet.add(num);
                }
            }
        }
        if (hashSet.size() == (C1607wl.Xd() ^ 1849955301) || hashSet.size() == ((679719005 ^ 719545243) ^ 39900088)) {
            set.removeAll(hashSet);
        }
    }

    private static boolean od(int i2) {
        try {
            Socket socket = new Socket();
            try {
                socket.bind(new InetSocketAddress(InetAddress.getLocalHost(), i2));
                socket.close();
                return false;
            } finally {
            }
        } catch (IOException e2) {
            String message = e2.getMessage();
            short sXd = (short) (C1633zX.Xd() ^ (956515937 ^ (-956502761)));
            int[] iArr = new int["JN~SPA".length()];
            QB qb = new QB("JN~SPA");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            return message.contains(new String(iArr, 0, i3));
        }
    }

    private static void ud(Set<Integer> set, String str, int i2) throws Throwable {
        int i3;
        String strYd = C1561oA.yd("g", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (272902502 ^ (-1679123247)))));
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            return;
                        }
                        if (!line.trim().startsWith(C1561oA.Yd("c]", (short) (C1580rY.Xd() ^ ((1147324589 ^ 217243975) ^ (-1217406087))))) && line.trim().length() != 0) {
                            String strTrim = line.trim();
                            short sXd = (short) (OY.Xd() ^ (256524573 ^ 256534629));
                            short sXd2 = (short) (OY.Xd() ^ (1815494797 ^ 1815497467));
                            int[] iArr = new int["\r%]".length()];
                            QB qb = new QB("\r%]");
                            int i4 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) + sXd2);
                                i4++;
                            }
                            String[] strArrSplit = strTrim.split(new String(iArr, 0, i4));
                            if (strArrSplit.length > 1) {
                                String[] strArrSplit2 = strArrSplit[1].split(strYd);
                                int i5 = 1554011565 ^ 1554011567;
                                if (strArrSplit2.length == i5) {
                                    String[] strArrSplit3 = strArrSplit[i5].split(strYd);
                                    try {
                                        int i6 = 1122302060 ^ 1122302076;
                                        if (Integer.parseInt(strArrSplit3[0], i6) == 0 && Integer.parseInt(strArrSplit3[1], i6) == 0) {
                                            String str2 = strArrSplit2[0];
                                            byte[] bArr = new byte[str2.length() / i5];
                                            int i7 = 0;
                                            while (true) {
                                                i3 = (233799106 ^ 817122566) ^ 1029386432;
                                                if (i7 >= str2.length()) {
                                                    break;
                                                }
                                                bArr[i7 / 2] = (byte) ((Character.digit(str2.charAt(i7), i6) << i3) + Character.digit(str2.charAt(i7 + 1), i6));
                                                i7 += 2;
                                            }
                                            if (bArr.length == i3) {
                                                for (int i8 = 0; i8 < bArr.length / i5; i8++) {
                                                    byte b2 = bArr[i8];
                                                    bArr[i8] = bArr[(bArr.length - i8) - 1];
                                                    bArr[(bArr.length - i8) - 1] = b2;
                                                }
                                            }
                                            if (InetAddress.getByAddress(bArr).isAnyLocalAddress()) {
                                                try {
                                                    set.add(Integer.valueOf(Integer.parseInt(strArrSplit2[1], i6) ^ i2));
                                                } catch (NumberFormatException e2) {
                                                } catch (Throwable th) {
                                                    th = th;
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                    } catch (NumberFormatException e3) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e4) {
                    return;
                }
            }
        } catch (IOException e5) {
        }
    }

    private static boolean yd(int i2) {
        boolean z2 = false;
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), i2);
            try {
                socket.setTcpNoDelay(true);
                PrintStream printStream = new PrintStream(socket.getOutputStream());
                printStream.write(0);
                printStream.print(C1626yg.Ud("\u0004r,f\u0005\u001f", (short) (Od.Xd() ^ ((2079558176 ^ 1748674900) ^ (-331954988))), (short) (Od.Xd() ^ (104643676 ^ (-104650030)))));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
                byte[] bArr = new byte[(491191608 ^ 793596492) ^ 839624564];
                socket.setSoTimeout((45259204 ^ 1239984485) ^ 1264201899);
                if (bufferedInputStream.read(bArr) > 0) {
                    if (new String(bArr).startsWith(Ig.wd("\u0007,!zN25JjfuU\u0013pj\u0001C#i|Co\u0013\u00058Xqm>g\r0^e;n\u0014,'5#E\bc", (short) (C1633zX.Xd() ^ (1198461688 ^ (-1198470912)))))) {
                        printStream.print(EO.Od("5\u0011\":j8\u0013-wdX6\f\u0006(\u0018me/E\u0001^*0,eIvnB\u001c{e*x", (short) (ZN.Xd() ^ (516938587 ^ 516940246))));
                        if (bufferedInputStream.read(bArr) > 0) {
                            if (new String(bArr).startsWith(C1561oA.Qd("\u0007\u0002", (short) (C1633zX.Xd() ^ ((432508667 ^ 1482684172) ^ (-1100500406)))))) {
                                z2 = true;
                            }
                        }
                    }
                }
                socket.close();
            } finally {
            }
        } catch (IOException e2) {
        }
        return z2;
    }

    public int qX() {
        Object obj;
        String strZd = C1593ug.zd("n]%rG", (short) (FB.Xd() ^ (ZN.Xd() ^ 864712837)), (short) (FB.Xd() ^ (OY.Xd() ^ 69950139)));
        short sXd = (short) (C1607wl.Xd() ^ (1453339107 ^ 1453353958));
        int[] iArr = new int["p{".length()];
        QB qb = new QB("p{");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return ((Integer) obj).intValue();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String strKd = C1561oA.Kd("\u0003q9\u0007[", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (1579025038 ^ (-434351664)))));
        String strZd = Wg.Zd("\u000f\u0005", (short) (C1633zX.Xd() ^ (273501188 ^ (-273497392))), (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609511067))));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        int iIntValue = ((Integer) obj).intValue();
        String strXd = C1561oA.Xd("Q@\bU*", (short) (ZN.Xd() ^ ((233017898 ^ 522625019) ^ 314919232)));
        String strVd = Wg.vd("|l", (short) (C1580rY.Xd() ^ ((227109864 ^ 301945134) ^ (-477513972))));
        try {
            Class<?> cls2 = Class.forName(strXd);
            Field field2 = 0 != 0 ? cls2.getField(strVd) : cls2.getDeclaredField(strVd);
            field2.setAccessible(true);
            obj2 = field2.get(this);
        } catch (Throwable th2) {
            obj2 = null;
        }
        BX bx = (BX) obj2;
        String strKd2 = Qg.kd("ZG\rX+", (short) (C1499aX.Xd() ^ ((900119538 ^ 1647860905) ^ (-1470019714))), (short) (C1499aX.Xd() ^ ((1788820525 ^ 1056174891) ^ (-1416420646))));
        short sXd = (short) (Od.Xd() ^ ((2011357913 ^ 1146005023) ^ (-866923675)));
        short sXd2 = (short) (Od.Xd() ^ (542451629 ^ (-542451497)));
        int[] iArr = new int["$.".length()];
        QB qb = new QB("$.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls3 = Class.forName(strKd2);
            Field field3 = 0 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
            field3.setAccessible(true);
            obj3 = field3.get(this);
        } catch (Throwable th3) {
            obj3 = null;
        }
        int iIntValue2 = ((Integer) obj3).intValue();
        String strUd = C1561oA.ud("E2wC\u0016", (short) (Od.Xd() ^ (1697312712 ^ (-1697287239))));
        short sXd3 = (short) (Od.Xd() ^ ((430146756 ^ 1729565949) ^ (-2125764875)));
        int[] iArr2 = new int["+C".length()];
        QB qb2 = new QB("+C");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        try {
            Class<?> cls4 = Class.forName(strUd);
            Field field4 = 0 != 0 ? cls4.getField(str2) : cls4.getDeclaredField(str2);
            field4.setAccessible(true);
            obj4 = field4.get(this);
        } catch (Throwable th4) {
            obj4 = null;
        }
        int iIntValue3 = ((Integer) obj4).intValue();
        String strYd = C1561oA.Yd("\r{C\u0011e", (short) (Od.Xd() ^ (1517045504 ^ (-1517053028))));
        String strQd = Xg.qd("xn", (short) (ZN.Xd() ^ ((1953028278 ^ 360160649) ^ 1629423149)), (short) (ZN.Xd() ^ ((941529235 ^ 1276328839) ^ 1947045451)));
        try {
            Class<?> cls5 = Class.forName(strYd);
            Field field5 = 0 != 0 ? cls5.getField(strQd) : cls5.getDeclaredField(strQd);
            field5.setAccessible(true);
            obj5 = field5.get(this);
        } catch (Throwable th5) {
            obj5 = null;
        }
        int iKd = Kd(iIntValue, bx, iIntValue2, iIntValue3, (int[]) obj5);
        String strWd = Jg.Wd("Q[D!6", (short) (OY.Xd() ^ (1133581434 ^ 1133590943)), (short) (OY.Xd() ^ (565829916 ^ 565805088)));
        String strXd2 = ZO.xd("xe", (short) (OY.Xd() ^ (754384310 ^ 754382019)), (short) (OY.Xd() ^ ((1343894129 ^ 1296599047) ^ 491952833)));
        Integer numValueOf = Integer.valueOf(iKd);
        try {
            Class<?> cls6 = Class.forName(strWd);
            Field field6 = 0 != 0 ? cls6.getField(strXd2) : cls6.getDeclaredField(strXd2);
            field6.setAccessible(true);
            field6.set(this, numValueOf);
        } catch (Throwable th6) {
        }
    }
}
