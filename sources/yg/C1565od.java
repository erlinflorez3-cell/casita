package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: renamed from: yg.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1565od implements Yl {
    private final byte[] Kd;
    private final Yl Xd;

    public C1565od(byte[] bArr, Yl yl) throws Throwable {
        this.Xd = yl;
        short sXd = (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134240770)));
        int iXd = OY.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("S\u001d92 ", sXd, (short) (iXd ^ (1822292453 ^ 1822293818)))).getMethod(Ig.wd("r+lQ\u001byI!V\u001c3{", (short) (C1499aX.Xd() ^ (1109829692 ^ (-1109841657)))), new Class[0]);
        try {
            method.setAccessible(true);
            this.Kd = Arrays.copyOf(bArr, ((Integer) method.invoke(yl, objArr)).intValue());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // yg.Yl
    public int getBlockSize() {
        return this.Kd.length;
    }

    @Override // yg.Yl
    public int jY(byte[] bArr, int i2, byte[] bArr2, int i3) throws Throwable {
        Class<?> cls = Class.forName(EO.Od("9\\\u0013.m", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1669519737 ^ (-1013821267))))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ ((338681056 ^ 1197471771) ^ 1399877181));
        int[] iArr = new int["xu\u0004Py{nu\\q\u0002k".length()];
        QB qb = new QB("xu\u0004Py{nu\\q\u0002k");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + sXd + sXd + i4 + xuXd.CK(iKK));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            int iIntValue = ((Integer) method.invoke(this, objArr)).intValue();
            Yl yl = this.Xd;
            Class<?> cls2 = Class.forName(C1593ug.zd("\u0005s;g{", (short) (C1580rY.Xd() ^ (376713861 ^ (-376729530))), (short) (C1580rY.Xd() ^ (1225854125 ^ (-1225868972)))));
            Class<?>[] clsArr2 = new Class[883119436 ^ 883119432];
            clsArr2[0] = byte[].class;
            clsArr2[1] = Integer.TYPE;
            clsArr2[(1574426316 ^ 905305661) ^ 1747060979] = byte[].class;
            clsArr2[(1924083474 ^ 9078516) ^ 1915070949] = Integer.TYPE;
            Object[] objArr2 = new Object[(192262487 ^ 782142168) ^ 636173195];
            objArr2[0] = bArr;
            objArr2[1] = Integer.valueOf(i2);
            objArr2[742192160 ^ 742192162] = bArr2;
            objArr2[1644188891 ^ 1644188888] = Integer.valueOf(i3);
            Method method2 = cls2.getMethod(C1561oA.od(">,", (short) (C1499aX.Xd() ^ (1875660102 ^ (-1875667142)))), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(yl, objArr2);
                byte[] bArr3 = this.Kd;
                Class<?> cls3 = Class.forName(C1561oA.Kd("\u0010~Fc\u0002", (short) (ZN.Xd() ^ (886203472 ^ 886199502))));
                Class<?>[] clsArr3 = new Class[(1515561672 ^ 420657054) ^ 1128731987];
                clsArr3[0] = byte[].class;
                clsArr3[1] = Integer.TYPE;
                clsArr3[(1982709054 ^ 1736937052) ^ 296366944] = byte[].class;
                clsArr3[620293103 ^ 620293100] = Integer.TYPE;
                clsArr3[(189800469 ^ 1935638616) ^ 2014289993] = Integer.TYPE;
                Object[] objArr3 = new Object[452783143 ^ 452783138];
                objArr3[0] = bArr2;
                objArr3[1] = Integer.valueOf(i3);
                objArr3[1149246565 ^ 1149246567] = bArr3;
                objArr3[(647636871 ^ 1936704770) ^ 1442177670] = 0;
                objArr3[1218533634 ^ 1218533638] = Integer.valueOf(iIntValue);
                Method declaredMethod = cls3.getDeclaredMethod(Wg.Zd("\u0014\u0016", (short) (C1499aX.Xd() ^ (1584615293 ^ (-1584600786))), (short) (C1499aX.Xd() ^ ((1820146361 ^ 495225851) ^ (-1912194075)))), clsArr3);
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(null, objArr3);
                    System.arraycopy(bArr, i2, this.Kd, 0, iIntValue);
                    return iIntValue;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // yg.Yl
    public void reset() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Yd(".&<(u</.A?7CI~%87JH<*:H?KJ", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1570770442 ^ (-442347937)))))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            byte[] bArr = new byte[this.Kd.length];
            short sXd = (short) (C1633zX.Xd() ^ ((1305331427 ^ 1125988698) ^ (-248554472)));
            short sXd2 = (short) (C1633zX.Xd() ^ (421385173 ^ (-421375380)));
            int[] iArr = new int["\u001f\u0017-\u0019f- \u001f20(4:o\u0016)(;9-\u001b+90<;".length()];
            QB qb = new QB("\u001f\u0017-\u0019f- \u001f20(4:o\u0016)(;9-\u001b+90<;");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Object[] objArr2 = {bArr};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("\u0003m\u0017%\u0005PQXt", (short) (Od.Xd() ^ (1092497815 ^ (-1092491569))), (short) (Od.Xd() ^ ((576716148 ^ 220812432) ^ (-796308196)))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr2);
                for (int i3 = 0; i3 < this.Kd.length; i3++) {
                    byte[] bArr2 = this.Kd;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i3]);
                }
                Yl yl = this.Xd;
                Object[] objArr3 = new Object[0];
                Method method2 = Class.forName(ZO.xd("O\u000e1 E", (short) (ZN.Xd() ^ ((1021187655 ^ 1830790963) ^ 1371663498)), (short) (ZN.Xd() ^ ((794399698 ^ 713768847) ^ 97688618)))).getMethod(C1626yg.Ud("\u000b]N3c", (short) (C1607wl.Xd() ^ ((82363009 ^ 592986041) ^ 665903285)), (short) (C1607wl.Xd() ^ (262201602 ^ 262205491))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    method2.invoke(yl, objArr3);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // yg.Yl
    public int xY(byte[] bArr, int i2, byte[] bArr2, int i3) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ (FB.Xd() ^ 1609522032));
        int[] iArr = new int["B1x;1".length()];
        QB qb = new QB("B1x;1");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd + i4));
            i4++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i4)).getMethod(Wg.vd("?>N\u001d@D9B3J\\H", (short) (ZN.Xd() ^ (FB.Xd() ^ (372823552 ^ 1238866344)))), new Class[0]);
        try {
            method.setAccessible(true);
            int iIntValue = ((Integer) method.invoke(this, objArr)).intValue();
            byte[] bArr3 = this.Kd;
            Class<?> cls = Class.forName(Qg.kd(" \rRm\n", (short) (OY.Xd() ^ (1445658965 ^ 1445691390)), (short) (OY.Xd() ^ (1304615778 ^ 1304603869))));
            Class<?>[] clsArr = new Class[(1243674523 ^ 1948173706) ^ 1044263444];
            clsArr[0] = byte[].class;
            clsArr[1] = Integer.TYPE;
            clsArr[(331537791 ^ 2030579135) ^ 1791684802] = byte[].class;
            clsArr[2078123972 ^ 2078123975] = Integer.TYPE;
            clsArr[(816278273 ^ 189074377) ^ 1004691660] = Integer.TYPE;
            Object[] objArr2 = new Object[1654859066 ^ 1654859071];
            objArr2[0] = bArr3;
            objArr2[1] = 0;
            objArr2[287982356 ^ 287982358] = bArr;
            objArr2[2097251502 ^ 2097251501] = Integer.valueOf(i2);
            objArr2[2125071181 ^ 2125071177] = Integer.valueOf(iIntValue);
            Method declaredMethod = cls.getDeclaredMethod(hg.Vd("cu", (short) (C1580rY.Xd() ^ (547619941 ^ (-547649874))), (short) (C1580rY.Xd() ^ ((779287981 ^ 1180373234) ^ (-1747561478)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr2);
                Yl yl = this.Xd;
                byte[] bArr4 = this.Kd;
                byte[] bArr5 = this.Kd;
                Class<?> cls2 = Class.forName(C1561oA.ud("s`&Pb", (short) (C1607wl.Xd() ^ (106187422 ^ 106184727))));
                Class<?>[] clsArr2 = new Class[2076447181 ^ 2076447177];
                clsArr2[0] = byte[].class;
                clsArr2[1] = Integer.TYPE;
                clsArr2[(601748854 ^ 582058145) ^ 23885269] = byte[].class;
                clsArr2[(1098777998 ^ 339435248) ^ 1430608765] = Integer.TYPE;
                Object[] objArr3 = new Object[(1649356537 ^ 709322071) ^ 1208503210];
                objArr3[0] = bArr4;
                objArr3[1] = 0;
                objArr3[850268701 ^ 850268703] = bArr5;
                objArr3[(1636058807 ^ 1797298220) ^ 178577048] = 0;
                Method method2 = cls2.getMethod(C1561oA.yd("I)", (short) (FB.Xd() ^ (721641823 ^ 721624517))), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(yl, objArr3);
                    System.arraycopy(this.Kd, 0, bArr2, i3, iIntValue);
                    return iIntValue;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
