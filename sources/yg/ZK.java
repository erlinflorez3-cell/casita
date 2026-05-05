package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ZK implements Yl {
    private final int[] Kd;
    private final Yp Xd;

    public ZK(byte[] bArr, Yp yp) throws Throwable {
        this.Xd = yp;
        Object[] objArr = {bArr};
        Method declaredMethod = Class.forName(ZO.xd("&\u0015)\u001d\u0014", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134257804)), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1899088186 ^ (-786334044)))))).getDeclaredMethod(C1626yg.Ud("V\u000e", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1750856293 ^ (-470461593)))), (short) (ZN.Xd() ^ (704831351 ^ 704824368))), byte[].class);
        try {
            declaredMethod.setAccessible(true);
            this.Kd = (int[]) declaredMethod.invoke(this, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private int Kd(int i2, int i3) {
        return (-1) - (((-1) - (i2 >>> i3)) & ((-1) - (i2 << ((this.Xd.od * 8) - i3))));
    }

    private int Xd(int i2, int i3) {
        return (i2 << i3) | (i2 >>> ((this.Xd.od * 8) - i3));
    }

    private int[] Yd(byte[] bArr) throws Throwable {
        Yp yp = this.Xd;
        short sXd = (short) (C1607wl.Xd() ^ ((934414478 ^ 1212055066) ^ 2139894954));
        int[] iArr = new int["\u0003?WZ!".length()];
        QB qb = new QB("\u0003?WZ!");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("|D", (short) (C1499aX.Xd() ^ (511321395 ^ (-511329982)))), new Class[0]);
        try {
            method.setAccessible(true);
            int[] iArr2 = (int[]) method.invoke(yp, objArr);
            for (int i3 : iArr2) {
                if (bArr.length == i3) {
                    int i4 = this.Xd.od;
                    int length = bArr.length / i4;
                    int[] iArr3 = new int[(this.Xd.Kd + length) - 2];
                    Class<?> cls = Class.forName(C1561oA.Qd("=*o*5", (short) (C1633zX.Xd() ^ ((1707763091 ^ 283132223) ^ (-1965688859)))));
                    Class<?>[] clsArr = new Class[(389829554 ^ 70538553) ^ 319293064];
                    clsArr[0] = byte[].class;
                    clsArr[1] = Integer.TYPE;
                    clsArr[(517796773 ^ 378515176) ^ 139681103] = Integer.TYPE;
                    Object[] objArr2 = new Object[(561547070 ^ 375040496) ^ 924987085];
                    objArr2[0] = bArr;
                    objArr2[1] = Integer.valueOf((length - 1) * i4);
                    objArr2[(1640235451 ^ 684500297) ^ 1225303280] = Integer.valueOf(i4);
                    Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("kx", (short) (ZN.Xd() ^ (1631388184 ^ 1631399588)), (short) (ZN.Xd() ^ (1818307474 ^ 1818322905))), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        iArr3[0] = ((Integer) declaredMethod.invoke(null, objArr2)).intValue();
                        int[] iArr4 = new int[length];
                        for (int i5 = 0; i5 < length - 1; i5++) {
                            Class<?> cls2 = Class.forName(C1561oA.od("G4y4?", (short) (ZN.Xd() ^ ((1503300095 ^ 1770566238) ^ 806488494))));
                            Class<?>[] clsArr2 = new Class[(1576149148 ^ 1904224809) ^ 745671350];
                            clsArr2[0] = byte[].class;
                            clsArr2[1] = Integer.TYPE;
                            clsArr2[418300241 ^ 418300243] = Integer.TYPE;
                            Object[] objArr3 = new Object[767696849 ^ 767696850];
                            objArr3[0] = bArr;
                            objArr3[1] = Integer.valueOf(((length - i5) - 2) * i4);
                            objArr3[1218995416 ^ 1218995418] = Integer.valueOf(i4);
                            short sXd2 = (short) (C1580rY.Xd() ^ ((1756319383 ^ 1112049078) ^ (-719825263)));
                            int[] iArr5 = new int["Wd".length()];
                            QB qb2 = new QB("Wd");
                            int i6 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr5[i6] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i6));
                                i6++;
                            }
                            Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr5, 0, i6), clsArr2);
                            try {
                                declaredMethod2.setAccessible(true);
                                iArr4[i5] = ((Integer) declaredMethod2.invoke(null, objArr3)).intValue();
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                        for (int i7 = 0; i7 < iArr3.length - 1; i7++) {
                            int i8 = ((i7 + length) - 1) % length;
                            int i9 = iArr4[i7 % length];
                            int i10 = this.Xd.Xd;
                            Class<?> cls3 = Class.forName(Wg.Zd("dhF\t-", (short) (C1633zX.Xd() ^ ((741037262 ^ 1626577174) ^ (-1289275711))), (short) (C1633zX.Xd() ^ (1569394260 ^ (-1569421605)))));
                            Class<?>[] clsArr3 = new Class[1347831040 ^ 1347831042];
                            clsArr3[0] = Integer.TYPE;
                            clsArr3[1] = Integer.TYPE;
                            Object[] objArr4 = new Object[1110405624 ^ 1110405626];
                            objArr4[0] = Integer.valueOf(i9);
                            objArr4[1] = Integer.valueOf(i10);
                            short sXd3 = (short) (FB.Xd() ^ (441272755 ^ 441261391));
                            int[] iArr6 = new int["\u0013-".length()];
                            QB qb3 = new QB("\u0013-");
                            int i11 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr6[i11] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i11));
                                i11++;
                            }
                            Method declaredMethod3 = cls3.getDeclaredMethod(new String(iArr6, 0, i11), clsArr3);
                            try {
                                declaredMethod3.setAccessible(true);
                                iArr4[i8] = (((Integer) declaredMethod3.invoke(this, objArr4)).intValue() + iArr3[i7]) ^ i7;
                                int i12 = i7 + 1;
                                int i13 = iArr3[i7];
                                int i14 = this.Xd.Yd;
                                Class<?> cls4 = Class.forName(Wg.vd("%\u0012[\u0007r", (short) (C1607wl.Xd() ^ (1567884664 ^ 1567912488))));
                                Class<?>[] clsArr4 = new Class[(1871224784 ^ 537290751) ^ 1334769709];
                                clsArr4[0] = Integer.TYPE;
                                clsArr4[1] = Integer.TYPE;
                                Object[] objArr5 = new Object[(2017156382 ^ 211580263) ^ 1957111931];
                                objArr5[0] = Integer.valueOf(i13);
                                objArr5[1] = Integer.valueOf(i14);
                                short sXd4 = (short) (FB.Xd() ^ ((1644682166 ^ 152815177) ^ 1797017434));
                                short sXd5 = (short) (FB.Xd() ^ (1592251325 ^ 1592253114));
                                int[] iArr7 = new int["HS".length()];
                                QB qb4 = new QB("HS");
                                int i15 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr7[i15] = xuXd4.fK(((sXd4 + i15) + xuXd4.CK(iKK4)) - sXd5);
                                    i15++;
                                }
                                Method declaredMethod4 = cls4.getDeclaredMethod(new String(iArr7, 0, i15), clsArr4);
                                try {
                                    declaredMethod4.setAccessible(true);
                                    iArr3[i12] = ((Integer) declaredMethod4.invoke(this, objArr5)).intValue() ^ iArr4[i8];
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        }
                        return iArr3;
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                }
            }
            StringBuilder sbAppend = new StringBuilder().append(hg.Vd("f\u007f\u00138\u0005\f\t\t3tv0~|r,zp)", (short) (Od.Xd() ^ (248589235 ^ (-248588666))), (short) (Od.Xd() ^ ((871195714 ^ 2100326106) ^ (-1323128436))))).append(Arrays.toString(iArr2));
            short sXd6 = (short) (C1580rY.Xd() ^ ((238020497 ^ 594862341) ^ (-760971092)));
            int[] iArr8 = new int["i+A;+8c/1/'l".length()];
            QB qb5 = new QB("i+A;+8c/1/'l");
            int i16 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr8[i16] = xuXd5.fK(sXd6 + i16 + xuXd5.CK(iKK5));
                i16++;
            }
            throw new IllegalArgumentException(sbAppend.append(new String(iArr8, 0, i16)).toString());
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    @Override // yg.Yl
    public int getBlockSize() {
        return this.Xd.ud;
    }

    @Override // yg.Yl
    public int jY(byte[] bArr, int i2, byte[] bArr2, int i3) throws Throwable {
        int i4 = this.Xd.od;
        short sXd = (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134247578)));
        int[] iArr = new int["\u007fn2n\u007f".length()];
        QB qb = new QB("\u007fn2n\u007f");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i5));
            i5++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i5));
        Class<?>[] clsArr = new Class[(1436364469 ^ 309586484) ^ 1206830210];
        clsArr[0] = byte[].class;
        clsArr[1] = Integer.TYPE;
        clsArr[655133873 ^ 655133875] = Integer.TYPE;
        Object[] objArr = new Object[(260704498 ^ 1597075573) ^ 1354463364];
        objArr[0] = bArr;
        objArr[1] = Integer.valueOf(i2);
        objArr[C1607wl.Xd() ^ 1849955288] = Integer.valueOf(i4);
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Yd("g\u0002", (short) (C1607wl.Xd() ^ ((2142261196 ^ 1328063178) ^ 815328111))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
            int i6 = i2 + i4;
            short sXd2 = (short) (FB.Xd() ^ ((9058149 ^ 823648215) ^ 832419035));
            short sXd3 = (short) (FB.Xd() ^ ((2020071907 ^ 2041514211) ^ 29949620));
            int[] iArr2 = new int["2!h%2".length()];
            QB qb2 = new QB("2!h%2");
            int i7 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i7] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i7)) + sXd3);
                i7++;
            }
            Class<?> cls2 = Class.forName(new String(iArr2, 0, i7));
            Class<?>[] clsArr2 = new Class[1564615545 ^ 1564615546];
            clsArr2[0] = byte[].class;
            clsArr2[1] = Integer.TYPE;
            clsArr2[721891117 ^ 721891119] = Integer.TYPE;
            Object[] objArr2 = new Object[1425836260 ^ 1425836263];
            objArr2[0] = bArr;
            objArr2[1] = Integer.valueOf(i6);
            objArr2[(552459157 ^ 113224563) ^ 642937060] = Integer.valueOf(i4);
            Method declaredMethod2 = cls2.getDeclaredMethod(Jg.Wd("5\f", (short) (C1633zX.Xd() ^ (346487530 ^ (-346471362))), (short) (C1633zX.Xd() ^ (1144450454 ^ (-1144441319)))), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                int iIntValue2 = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                for (int length = this.Kd.length - 1; length >= 0; length--) {
                    int i8 = this.Xd.Yd;
                    Class<?> cls3 = Class.forName(ZO.xd(".p>\u0016]", (short) (C1607wl.Xd() ^ (213257985 ^ 213278818)), (short) (C1607wl.Xd() ^ (479595396 ^ 479610137))));
                    Class<?>[] clsArr3 = new Class[1443337080 ^ 1443337082];
                    clsArr3[0] = Integer.TYPE;
                    clsArr3[1] = Integer.TYPE;
                    Object[] objArr3 = new Object[(486899187 ^ 1330767522) ^ 1381276499];
                    objArr3[0] = Integer.valueOf(iIntValue2 ^ iIntValue);
                    objArr3[1] = Integer.valueOf(i8);
                    Method declaredMethod3 = cls3.getDeclaredMethod(C1626yg.Ud("\u0014\u0014", (short) (C1499aX.Xd() ^ ((1850080909 ^ 1336607969) ^ (-569303589))), (short) (C1499aX.Xd() ^ (1589371916 ^ (-1589378555)))), clsArr3);
                    try {
                        declaredMethod3.setAccessible(true);
                        iIntValue = ((Integer) declaredMethod3.invoke(this, objArr3)).intValue();
                        int i9 = (this.Kd[length] ^ iIntValue2) - iIntValue;
                        int i10 = this.Xd.Xd;
                        Class<?> cls4 = Class.forName(Ig.wd("\u0004L#i\u0001", (short) (C1607wl.Xd() ^ ((691389396 ^ 776516317) ^ 125658075))));
                        Class<?>[] clsArr4 = new Class[912062483 ^ 912062481];
                        clsArr4[0] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        Object[] objArr4 = new Object[1144370231 ^ 1144370229];
                        objArr4[0] = Integer.valueOf(i9);
                        objArr4[1] = Integer.valueOf(i10);
                        short sXd4 = (short) (Od.Xd() ^ ((1044748617 ^ 1480792934) ^ (-1711725679)));
                        int[] iArr3 = new int[")\u0010".length()];
                        QB qb3 = new QB(")\u0010");
                        int i11 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i11] = xuXd3.fK((C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i11)) + xuXd3.CK(iKK3));
                            i11++;
                        }
                        Method declaredMethod4 = cls4.getDeclaredMethod(new String(iArr3, 0, i11), clsArr4);
                        try {
                            declaredMethod4.setAccessible(true);
                            iIntValue2 = ((Integer) declaredMethod4.invoke(this, objArr4)).intValue();
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                Class<?> cls5 = Class.forName(C1561oA.Qd("}j0ju", (short) (ZN.Xd() ^ (782142852 ^ 782169706))));
                Class<?>[] clsArr5 = new Class[2074491783 ^ 2074491779];
                clsArr5[0] = Integer.TYPE;
                clsArr5[1] = byte[].class;
                clsArr5[(702292965 ^ 186050646) ^ 583715761] = Integer.TYPE;
                clsArr5[1580148141 ^ 1580148142] = Integer.TYPE;
                Object[] objArr5 = new Object[1868004719 ^ 1868004715];
                objArr5[0] = Integer.valueOf(iIntValue);
                objArr5[1] = bArr2;
                objArr5[(221233747 ^ 1760817855) ^ 1708929262] = Integer.valueOf(i3);
                objArr5[(535115638 ^ 2040039915) ^ 1719516830] = Integer.valueOf(i4);
                Method declaredMethod5 = cls5.getDeclaredMethod(C1593ug.zd("RB", (short) (FB.Xd() ^ ((1585920255 ^ 26514615) ^ 1595136463)), (short) (FB.Xd() ^ (1915962429 ^ 1915968779))), clsArr5);
                try {
                    declaredMethod5.setAccessible(true);
                    declaredMethod5.invoke(null, objArr5);
                    Class<?> cls6 = Class.forName(C1561oA.od("7$i$/", (short) (ZN.Xd() ^ ((42230575 ^ 378131466) ^ 336457849))));
                    Class<?>[] clsArr6 = new Class[(2103733363 ^ 1677390130) ^ 513711429];
                    clsArr6[0] = Integer.TYPE;
                    clsArr6[1] = byte[].class;
                    clsArr6[1903989983 ^ 1903989981] = Integer.TYPE;
                    clsArr6[1759325481 ^ 1759325482] = Integer.TYPE;
                    Object[] objArr6 = new Object[(953021118 ^ 1673294830) ^ 1534165332];
                    objArr6[0] = Integer.valueOf(iIntValue2);
                    objArr6[1] = bArr2;
                    objArr6[264294077 ^ 264294079] = Integer.valueOf(i3 + i4);
                    objArr6[931564788 ^ 931564791] = Integer.valueOf(i4);
                    Method declaredMethod6 = cls6.getDeclaredMethod(C1561oA.Kd("td", (short) (FB.Xd() ^ (1210323074 ^ 1210349343))), clsArr6);
                    try {
                        declaredMethod6.setAccessible(true);
                        declaredMethod6.invoke(null, objArr6);
                        return i4 * 2;
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
    }

    @Override // yg.Yl
    public void reset() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Ig.wd("yAr{VfB~mlk\u000fd\u0015,V\u001f\u001d\u0001y#XM=5\u0015", (short) (C1633zX.Xd() ^ ((2005292692 ^ 1020930501) ^ (-1264343916))))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            for (int i2 = 0; i2 < this.Kd.length; i2++) {
                int[] iArr = this.Kd;
                iArr[i2] = iArr[i2] ^ secureRandom.nextInt();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // yg.Yl
    public int xY(byte[] bArr, int i2, byte[] bArr2, int i3) throws Throwable {
        ZK zk = this;
        int i4 = zk.Xd.od;
        Class<?> cls = Class.forName(Wg.Zd("/\fXjl", (short) (C1499aX.Xd() ^ (1938724778 ^ (-1938732296))), (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1993949319 ^ 1196427631)))));
        Class<?>[] clsArr = new Class[C1499aX.Xd() ^ (-1134257937)];
        clsArr[0] = byte[].class;
        clsArr[1] = Integer.TYPE;
        clsArr[1074365038 ^ 1074365036] = Integer.TYPE;
        Object[] objArr = new Object[ZN.Xd() ^ (90429554 ^ 921298561)];
        objArr[0] = bArr;
        objArr[1] = Integer.valueOf(i2);
        objArr[(949297271 ^ 254229159) ^ 934419154] = Integer.valueOf(i4);
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Xd("Ga", (short) (C1580rY.Xd() ^ (818696583 ^ (-818678137)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
            Class<?> cls2 = Class.forName(Wg.vd("'\u0016Y\u0016'", (short) (C1499aX.Xd() ^ ((1132286175 ^ 1609786544) ^ (-479100170)))));
            Class<?>[] clsArr2 = new Class[(1854966062 ^ 581214106) ^ 1278482103];
            clsArr2[0] = byte[].class;
            clsArr2[1] = Integer.TYPE;
            clsArr2[(1164744298 ^ 1742618436) ^ 582134060] = Integer.TYPE;
            Object[] objArr2 = new Object[242386425 ^ 242386426];
            objArr2[0] = bArr;
            objArr2[1] = Integer.valueOf(i2 + i4);
            objArr2[(198472118 ^ 1094691970) ^ 1256971574] = Integer.valueOf(i4);
            Method declaredMethod2 = cls2.getDeclaredMethod(Qg.kd("H`", (short) (C1633zX.Xd() ^ (398471553 ^ (-398463525))), (short) (C1633zX.Xd() ^ (38838354 ^ (-38856125)))), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                int iIntValue2 = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                for (int i5 : zk.Kd) {
                    int i6 = zk.Xd.Xd;
                    short sXd = (short) (OY.Xd() ^ ((218729277 ^ 2131454625) ^ 1912773302));
                    short sXd2 = (short) (OY.Xd() ^ ((1130970848 ^ 2064184451) ^ 945915749));
                    int[] iArr = new int["S@\u00061!".length()];
                    QB qb = new QB("S@\u00061!");
                    int i7 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i7] = xuXd.fK(sXd + i7 + xuXd.CK(iKK) + sXd2);
                        i7++;
                    }
                    Class<?> cls3 = Class.forName(new String(iArr, 0, i7));
                    Class<?>[] clsArr3 = new Class[(623448830 ^ 1386128381) ^ 2008527105];
                    clsArr3[0] = Integer.TYPE;
                    clsArr3[1] = Integer.TYPE;
                    Object[] objArr3 = new Object[845667440 ^ 845667442];
                    objArr3[0] = Integer.valueOf(iIntValue2);
                    objArr3[1] = Integer.valueOf(i6);
                    Method declaredMethod3 = cls3.getDeclaredMethod(C1561oA.ud("\u001a2", (short) (C1580rY.Xd() ^ ((828350343 ^ 223149496) ^ (-1007897493)))), clsArr3);
                    ZK zk2 = zk;
                    try {
                        declaredMethod3.setAccessible(true);
                        iIntValue2 = (((Integer) declaredMethod3.invoke(zk2, objArr3)).intValue() + iIntValue) ^ i5;
                        int i8 = zk2.Xd.Yd;
                        Class<?> cls4 = Class.forName(C1561oA.yd("iX\u001cI?", (short) (C1499aX.Xd() ^ (233475067 ^ (-233487019)))));
                        Class<?>[] clsArr4 = new Class[242862607 ^ 242862605];
                        clsArr4[0] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        Object[] objArr4 = new Object[74780943 ^ 74780941];
                        objArr4[0] = Integer.valueOf(iIntValue);
                        objArr4[1] = Integer.valueOf(i8);
                        Method declaredMethod4 = cls4.getDeclaredMethod(C1561oA.Yd("4A", (short) (C1499aX.Xd() ^ ((1090005440 ^ 748731869) ^ (-1817745320)))), clsArr4);
                        zk = zk2;
                        try {
                            declaredMethod4.setAccessible(true);
                            iIntValue = ((Integer) declaredMethod4.invoke(zk, objArr4)).intValue() ^ iIntValue2;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                short sXd3 = (short) (C1580rY.Xd() ^ ((1709468082 ^ 221599979) ^ (-1758550966)));
                short sXd4 = (short) (C1580rY.Xd() ^ (1730664774 ^ (-1730663679)));
                int[] iArr2 = new int["\u0012\u0001H\u0005\u0012".length()];
                QB qb2 = new QB("\u0012\u0001H\u0005\u0012");
                int i9 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i9] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i9)) + sXd4);
                    i9++;
                }
                Class<?> cls5 = Class.forName(new String(iArr2, 0, i9));
                Class<?>[] clsArr5 = new Class[22613560 ^ 22613564];
                clsArr5[0] = Integer.TYPE;
                clsArr5[1] = byte[].class;
                clsArr5[(867537907 ^ 561393014) ^ 314818183] = Integer.TYPE;
                clsArr5[1603573031 ^ 1603573028] = Integer.TYPE;
                Object[] objArr5 = new Object[589912794 ^ 589912798];
                objArr5[0] = Integer.valueOf(iIntValue);
                objArr5[1] = bArr2;
                objArr5[(594748566 ^ 348023844) ^ 936200368] = Integer.valueOf(i3);
                objArr5[(1459982630 ^ 423027437) ^ 1311994824] = Integer.valueOf(i4);
                short sXd5 = (short) (Od.Xd() ^ ((1537271471 ^ 95327259) ^ (-1577994578)));
                short sXd6 = (short) (Od.Xd() ^ ((137631129 ^ 1744483455) ^ (-1875827163)));
                int[] iArr3 = new int["fF".length()];
                QB qb3 = new QB("fF");
                int i10 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i10] = xuXd3.fK(xuXd3.CK(iKK3) - ((i10 * sXd6) ^ sXd5));
                    i10++;
                }
                Method declaredMethod5 = cls5.getDeclaredMethod(new String(iArr3, 0, i10), clsArr5);
                try {
                    declaredMethod5.setAccessible(true);
                    declaredMethod5.invoke(null, objArr5);
                    Class<?> cls6 = Class.forName(ZO.xd("&^u\u000b\u0012", (short) (C1607wl.Xd() ^ ((196595791 ^ 1706678809) ^ 1846434602)), (short) (C1607wl.Xd() ^ ((1631994332 ^ 834568451) ^ 1358487002))));
                    Class<?>[] clsArr6 = new Class[(918033535 ^ 1459155431) ^ 1614865820];
                    clsArr6[0] = Integer.TYPE;
                    clsArr6[1] = byte[].class;
                    clsArr6[(888186716 ^ 2026904029) ^ 1277214339] = Integer.TYPE;
                    clsArr6[693930621 ^ 693930622] = Integer.TYPE;
                    Object[] objArr6 = new Object[(398339187 ^ 409864337) ^ 265299174];
                    objArr6[0] = Integer.valueOf(iIntValue2);
                    objArr6[1] = bArr2;
                    objArr6[(2136361295 ^ 816853087) ^ 1340504338] = Integer.valueOf(i3 + i4);
                    objArr6[(1820357860 ^ 932030059) ^ 1527632524] = Integer.valueOf(i4);
                    short sXd7 = (short) (C1499aX.Xd() ^ (312317674 ^ (-312321069)));
                    short sXd8 = (short) (C1499aX.Xd() ^ (145403560 ^ (-145420212)));
                    int[] iArr4 = new int["qT".length()];
                    QB qb4 = new QB("qT");
                    int i11 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i11] = xuXd4.fK((C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + (i11 * sXd8))) + xuXd4.CK(iKK4));
                        i11++;
                    }
                    Method declaredMethod6 = cls6.getDeclaredMethod(new String(iArr4, 0, i11), clsArr6);
                    try {
                        declaredMethod6.setAccessible(true);
                        declaredMethod6.invoke(null, objArr6);
                        return i4 * 2;
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
    }
}
