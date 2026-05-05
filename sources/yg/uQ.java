package yg;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class uQ {
    public static String[] Xd = null;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("\u0016\u0005L\u0015q", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207826461))))).getDeclaredMethod(Wg.Zd(".\u001e", (short) (OY.Xd() ^ (ZN.Xd() ^ 864697002)), (short) (OY.Xd() ^ ((980430977 ^ 554218676) ^ 460912389))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String[] strArr = (String[]) declaredMethod.invoke(null, objArr);
            short sXd = (short) (C1580rY.Xd() ^ ((236345533 ^ 513181942) ^ (-276864988)));
            int[] iArr = new int["@/v?\u001c".length()];
            QB qb = new QB("@/v?\u001c");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd2 = (short) (FB.Xd() ^ ((878417245 ^ 1130785200) ^ 2000534983));
            int[] iArr2 = new int["bo".length()];
            QB qb2 = new QB("bo");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
                field.setAccessible(true);
                field.set(null, strArr);
            } catch (Throwable th) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String Kd() {
        short sXd = (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207826112)));
        short sXd2 = (short) (C1499aX.Xd() ^ (1877463493 ^ (-1877452357)));
        int[] iArr = new int["!+".length()];
        QB qb = new QB("!+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String Xd() {
        return Qg.kd("q^$jE", (short) (OY.Xd() ^ ((185044110 ^ 503805436) ^ 352385803)), (short) (OY.Xd() ^ ((1187170217 ^ 633771999) ^ 1661209318)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    public static void Yd() throws Throwable {
        Object obj;
        Method declaredMethod;
        if (hg.Qd()) {
            return;
        }
        boolean z2 = true;
        short sXd = (short) (C1580rY.Xd() ^ (1338701692 ^ (-1338692033)));
        int[] iArr = new int["q^$mM".length()];
        QB qb = new QB("q^$mM");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (1171222072 ^ (-730553189))));
        int[] iArr2 = new int["Vc".length()];
        QB qb2 = new QB("Vc");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod2.setAccessible(true);
            Context context = (Context) declaredMethod2.invoke(null, objArr);
            short sXd3 = (short) (OY.Xd() ^ (318669341 ^ 318677846));
            int[] iArr3 = new int["FTKZXSO\u001aP]]dV`g\"8eel^ro".length()];
            QB qb3 = new QB("FTKZXSO\u001aP]]dV`g\"8eel^ro");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i4));
                i4++;
            }
            Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd4 = (short) (C1633zX.Xd() ^ ((2137842531 ^ 1950606758) ^ (-187633141)));
            short sXd5 = (short) (C1633zX.Xd() ^ (1252672029 ^ (-1252677897)));
            int[] iArr4 = new int["+*:\u0017),5,32\u001b0>298F".length()];
            QB qb4 = new QB("+*:\u0017),5,32\u001b0>298F");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd4 + i5)) + sXd5);
                i5++;
            }
            Method method = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr2);
                Object[] objArr3 = new Object[0];
                Method method2 = Class.forName(Jg.Wd("\u001d\u0003xzY/\u0019DiQ0+\u001c`T\u0012\u0016\u001e~xIU!", (short) (ZN.Xd() ^ (1499236756 ^ 1499246574)), (short) (ZN.Xd() ^ (1416051001 ^ 1416052242)))).getMethod(ZO.xd("F2q\u0004[c7\u0010\u001a1v,D\u0010", (short) (C1499aX.Xd() ^ (513530074 ^ (-513536524))), (short) (C1499aX.Xd() ^ ((1464744793 ^ 2012180288) ^ (-547454220)))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr3);
                    short sXd6 = (short) (OY.Xd() ^ ((44175159 ^ 2041979372) ^ 2064916871));
                    short sXd7 = (short) (OY.Xd() ^ ((1148842086 ^ 1276053562) ^ 141987428));
                    int[] iArr5 = new int["ZdQwgRfx]8D~\u000e1\np\u001cTi0\u000f\u0005\u001cFGAU\u0003G\u0012/;\u001c".length()];
                    QB qb5 = new QB("ZdQwgRfx]8D~\u000e1\np\u001cTi0\u000f\u0005\u001cFGAU\u0003G\u0012/;\u001c");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i6 * sXd7))) + xuXd5.CK(iKK5));
                        i6++;
                    }
                    Object[] objArr4 = {str};
                    Method method3 = Class.forName(new String(iArr5, 0, i6)).getMethod(EO.Od(",d\"\u0013o9*W9IDo\u0018\u001f%Gi\n@e/o\u000e", (short) (FB.Xd() ^ ((362887021 ^ 1037707229) ^ 679168753))), Class.forName(Ig.wd("Z%F[v\u007fZ.\u007fHe3\u0002tc|", (short) (ZN.Xd() ^ (687893235 ^ 687891726)))));
                    try {
                        method3.setAccessible(true);
                        String str2 = (String) method3.invoke(packageManager, objArr4);
                        String strQd = C1561oA.Qd("\u007fl2xS", (short) (C1633zX.Xd() ^ (814671214 ^ (-814663352))));
                        String strZd = C1593ug.zd("$1", (short) (C1499aX.Xd() ^ (944931052 ^ (-944933104))), (short) (C1499aX.Xd() ^ (1725418479 ^ (-1725412568))));
                        try {
                            Class<?> cls3 = Class.forName(strQd);
                            Field field = 0 != 0 ? cls3.getField(strZd) : cls3.getDeclaredField(strZd);
                            field.setAccessible(true);
                            obj = field.get(null);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        String[] strArr = (String[]) obj;
                        int length = strArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                break;
                            }
                            if (strArr[i7].equals(str2)) {
                                z2 = false;
                                break;
                            }
                            i7++;
                        }
                        if (!z2) {
                            String strYd = C1561oA.Yd("1 g\u0012+", (short) (C1580rY.Xd() ^ (1742750050 ^ (-1742743953))));
                            String strQd2 = Xg.qd("\u000f\u001c", (short) (C1580rY.Xd() ^ ((208547147 ^ 745719800) ^ (-538764056))), (short) (C1580rY.Xd() ^ ((1310539910 ^ 1347106230) ^ (-508977553))));
                            try {
                                Class<?> cls4 = Class.forName(strYd);
                                boolean z3 = false;
                                try {
                                    strQd2 = cls4.getDeclaredMethod(strQd2, new Class[0]);
                                    declaredMethod = strQd2;
                                } catch (NoSuchMethodException e2) {
                                    z3 = true;
                                    declaredMethod = cls4.getDeclaredMethod(strQd2, Class.forName(Jg.Wd("'q\u0014\u0015>9b\u001d\u0001}92OI}8{\u0019D=*.X", (short) (Od.Xd() ^ ((737891037 ^ 1941709664) ^ (-1481078397))), (short) (Od.Xd() ^ ((349006890 ^ 768332273) ^ (-956754242))))));
                                }
                                if (!z3) {
                                    declaredMethod.invoke(null, new Object[0]);
                                    return;
                                }
                                Object[] objArr5 = new Object[1];
                                short sXd8 = (short) (C1607wl.Xd() ^ (82924600 ^ 82917421));
                                short sXd9 = (short) (C1607wl.Xd() ^ ((1107951631 ^ 1892589057) ^ 851740168));
                                int[] iArr6 = new int["J{=%\u0002".length()];
                                QB qb6 = new QB("J{=%\u0002");
                                int i8 = 0;
                                while (qb6.YK()) {
                                    int iKK6 = qb6.KK();
                                    Xu xuXd6 = Xu.Xd(iKK6);
                                    iArr6[i8] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((i8 * sXd9) + sXd8)));
                                    i8++;
                                }
                                Class<?> cls5 = Class.forName(new String(iArr6, 0, i8));
                                Object[] objArr6 = new Object[0];
                                Method declaredMethod3 = cls5.getDeclaredMethod(C1626yg.Ud("(>", (short) (C1607wl.Xd() ^ ((650491700 ^ 1165290080) ^ 1672549487)), (short) (C1607wl.Xd() ^ (1731578749 ^ 1731592009))), new Class[0]);
                                try {
                                    declaredMethod3.setAccessible(true);
                                    objArr5[0] = (Context) declaredMethod3.invoke(null, objArr6);
                                    declaredMethod.invoke(null, objArr5);
                                    return;
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            } catch (InvocationTargetException e4) {
                                C1597vN.Xd(e4.getTargetException());
                                return;
                            } catch (Exception e5) {
                                return;
                            }
                        }
                        Vo vo = new Vo();
                        vo.vK(str2);
                        Class<?> cls6 = Class.forName(C1561oA.od("mZ X;", (short) (ZN.Xd() ^ ((1898024474 ^ 1107589683) ^ 858097880))));
                        Class<?>[] clsArr3 = new Class[1159743078 ^ 1159743074];
                        clsArr3[0] = Integer.TYPE;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[(13127626 ^ 789474842) ^ 801513938] = Integer.TYPE;
                        clsArr3[1977348623 ^ 1977348620] = Class.forName(C1561oA.Kd("\nx@jx", (short) (C1580rY.Xd() ^ (830630702 ^ (-830627704)))));
                        Object[] objArr7 = new Object[(306168525 ^ 1619114906) ^ 1925085523];
                        objArr7[0] = Integer.valueOf((1331846423 ^ 250983422) ^ 1100476104);
                        objArr7[1] = Integer.valueOf((2013469756 ^ 206030673) ^ 1950418131);
                        objArr7[(1925962125 ^ 1369802631) ^ 594435592] = 1;
                        objArr7[1907169523 ^ 1907169520] = vo;
                        short sXd10 = (short) (OY.Xd() ^ ((1262489044 ^ 252250614) ^ 1145662615));
                        short sXd11 = (short) (OY.Xd() ^ (1502697362 ^ 1502687588));
                        int[] iArr7 = new int["6\u0005".length()];
                        QB qb7 = new QB("6\u0005");
                        int i9 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i9] = xuXd7.fK(((i9 * sXd11) ^ sXd10) + xuXd7.CK(iKK7));
                            i9++;
                        }
                        Method declaredMethod4 = cls6.getDeclaredMethod(new String(iArr7, 0, i9), clsArr3);
                        try {
                            declaredMethod4.setAccessible(true);
                            boolean zBooleanValue = ((Boolean) declaredMethod4.invoke(null, objArr7)).booleanValue();
                            String strXd = C1561oA.Xd(":)p\u001b4", (short) (C1580rY.Xd() ^ (1597044597 ^ (-1597024577))));
                            String strVd = Wg.vd("\u001b(", (short) (C1633zX.Xd() ^ (66554680 ^ (-66578210))));
                            short sXd12 = (short) (C1499aX.Xd() ^ (1220807261 ^ (-1220836115)));
                            short sXd13 = (short) (C1499aX.Xd() ^ (2089267775 ^ (-2089270906)));
                            int[] iArr8 = new int["\u001e\u000bP\tk".length()];
                            QB qb8 = new QB("\u001e\u000bP\tk");
                            int i10 = 0;
                            while (qb8.YK()) {
                                int iKK8 = qb8.KK();
                                Xu xuXd8 = Xu.Xd(iKK8);
                                iArr8[i10] = xuXd8.fK(((sXd12 + i10) + xuXd8.CK(iKK8)) - sXd13);
                                i10++;
                            }
                            Class<?> cls7 = Class.forName(new String(iArr8, 0, i10));
                            Class<?>[] clsArr4 = new Class[(359539225 ^ 472270696) ^ 155739506];
                            clsArr4[0] = Class.forName(hg.Vd("9/C-x6*6.s\u001885+/'", (short) (C1607wl.Xd() ^ ((624401721 ^ 1334366480) ^ 1790926969)), (short) (C1607wl.Xd() ^ (1262011633 ^ 1262004482))));
                            clsArr4[1] = Class.forName(C1561oA.ud("0&:$o-!-%j\u000f/,\"&\u001e", (short) (C1607wl.Xd() ^ ((2058790780 ^ 1771139568) ^ 321370863))));
                            clsArr4[2139000685 ^ 2139000687] = Boolean.TYPE;
                            Object[] objArr8 = new Object[(1535122272 ^ 1225395153) ^ 311038130];
                            objArr8[0] = strXd;
                            objArr8[1] = strVd;
                            objArr8[1659473365 ^ 1659473367] = Boolean.valueOf(zBooleanValue);
                            Method declaredMethod5 = cls7.getDeclaredMethod(C1561oA.yd("i}", (short) (C1633zX.Xd() ^ (290088736 ^ (-290091940)))), clsArr4);
                            try {
                                declaredMethod5.setAccessible(true);
                                declaredMethod5.invoke(null, objArr8);
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
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        } catch (InvocationTargetException e11) {
            throw e11.getCause();
        }
    }

    public static String[] yx() {
        return new String[]{C1593ug.zd("Vcb$Xf]ljea,ueoflrl", (short) (Od.Xd() ^ (1730950688 ^ (-1730945576))), (short) (Od.Xd() ^ (349099123 ^ (-349083821))))};
    }
}
