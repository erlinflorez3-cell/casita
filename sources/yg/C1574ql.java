package yg;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

/* JADX INFO: renamed from: yg.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1574ql {
    public static byte[] Kd = null;
    private static String Qd = null;
    public static int Xd = 0;
    public static byte[] Yd = null;
    public static byte[] od = null;
    public static byte[] ud = null;

    static {
        Class<?> cls = Class.forName(hg.Vd("\u001a\u0007L\u000f\t", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (241555600 ^ 1072480249))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (1513231348 ^ 430532242)))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (366978338 ^ (-366998691)));
        int[] iArr = new int["8D".length()];
        QB qb = new QB("8D");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
            String strYd = C1561oA.yd("p_#g_", (short) (C1607wl.Xd() ^ (965708494 ^ 965713274)));
            String strYd2 = C1561oA.Yd("w\u0005", (short) (ZN.Xd() ^ (284868798 ^ 284860782)));
            Integer numValueOf = Integer.valueOf(iIntValue);
            try {
                Class<?> cls2 = Class.forName(strYd);
                Field field = 0 != 0 ? cls2.getField(strYd2) : cls2.getDeclaredField(strYd2);
                field.setAccessible(true);
                field.set(null, numValueOf);
            } catch (Throwable th) {
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Xg.qd("\u001b\nQ\u0016\u0012", (short) (OY.Xd() ^ (1426669689 ^ 1426664424)), (short) (OY.Xd() ^ ((1189825238 ^ 1912822826) ^ 887649501)))).getDeclaredMethod(Jg.Wd("$\b", (short) (C1580rY.Xd() ^ ((1276142269 ^ 1116095420) ^ (-244712315))), (short) (C1580rY.Xd() ^ ((1663151181 ^ 295377246) ^ (-1924833358)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod2.invoke(null, objArr2);
                String strXd = ZO.xd("]\u001aX\u0019\t", (short) (OY.Xd() ^ ((2061107116 ^ 1876806329) ^ 352611910)), (short) (OY.Xd() ^ (574731614 ^ 574719017)));
                String strUd = C1626yg.Ud("M2", (short) (C1607wl.Xd() ^ (2640168 ^ 2627837)), (short) (C1607wl.Xd() ^ ((1233518601 ^ 2040719720) ^ 807712506)));
                try {
                    Class<?> cls3 = Class.forName(strXd);
                    Field field2 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
                    field2.setAccessible(true);
                    field2.set(null, bArr);
                } catch (Throwable th2) {
                }
                short sXd2 = (short) (C1633zX.Xd() ^ ((150414680 ^ 685164073) ^ (-539086071)));
                int[] iArr2 = new int["E[\u00148b".length()];
                QB qb2 = new QB("E[\u00148b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                    i3++;
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(EO.Od("X%", (short) (Od.Xd() ^ (533084383 ^ (-533097388)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    byte[] bArr2 = (byte[]) declaredMethod3.invoke(null, objArr3);
                    String strQd = C1561oA.Qd("\bt:|v", (short) (OY.Xd() ^ ((1720413713 ^ 2067741446) ^ 498351600)));
                    String strZd = C1593ug.zd("?5", (short) (Od.Xd() ^ (1334073011 ^ (-1334050843))), (short) (Od.Xd() ^ (1060021865 ^ (-1060032598))));
                    try {
                        Class<?> cls4 = Class.forName(strQd);
                        Field field3 = 0 != 0 ? cls4.getField(strZd) : cls4.getDeclaredField(strZd);
                        field3.setAccessible(true);
                        field3.set(null, bArr2);
                    } catch (Throwable th3) {
                    }
                    Class<?> cls5 = Class.forName(C1561oA.od("\u0013\u007fE\b\u0002", (short) (ZN.Xd() ^ (520434072 ^ 520428645))));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr4 = new Object[0];
                    short sXd3 = (short) (OY.Xd() ^ ((947800033 ^ 1963240995) ^ 1299894630));
                    int[] iArr3 = new int["3O".length()];
                    QB qb3 = new QB("3O");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i4));
                        i4++;
                    }
                    Method declaredMethod4 = cls5.getDeclaredMethod(new String(iArr3, 0, i4), clsArr2);
                    try {
                        declaredMethod4.setAccessible(true);
                        byte[] bArr3 = (byte[]) declaredMethod4.invoke(null, objArr4);
                        String strZd2 = Wg.Zd("\rqv0h", (short) (C1633zX.Xd() ^ (1724370414 ^ (-1724353015))), (short) (C1633zX.Xd() ^ (1294172946 ^ (-1294195893))));
                        String strXd2 = C1561oA.Xd("\u0012,", (short) (C1580rY.Xd() ^ ((580559403 ^ 280589112) ^ (-841190842))));
                        try {
                            Class<?> cls6 = Class.forName(strZd2);
                            Field field4 = 0 != 0 ? cls6.getField(strXd2) : cls6.getDeclaredField(strXd2);
                            field4.setAccessible(true);
                            field4.set(null, bArr3);
                        } catch (Throwable th4) {
                        }
                        Object[] objArr5 = new Object[0];
                        Method declaredMethod5 = Class.forName(Wg.vd("XG\u000fSO", (short) (OY.Xd() ^ ((385156615 ^ 1736042702) ^ 1905051390)))).getDeclaredMethod(Qg.kd("Sl", (short) (OY.Xd() ^ (1305860098 ^ 1305865656)), (short) (OY.Xd() ^ (1153157754 ^ 1153145883))), new Class[0]);
                        try {
                            declaredMethod5.setAccessible(true);
                            byte[] bArr4 = (byte[]) declaredMethod5.invoke(null, objArr5);
                            String strVd = hg.Vd("A.s60", (short) (C1633zX.Xd() ^ ((1312506367 ^ 1045006987) ^ (-1886564860))), (short) (C1633zX.Xd() ^ (1982721924 ^ (-1982724457))));
                            String strUd2 = C1561oA.ud("U_", (short) (OY.Xd() ^ (1287177414 ^ 1287184389)));
                            try {
                                Class<?> cls7 = Class.forName(strVd);
                                Field field5 = 0 != 0 ? cls7.getField(strUd2) : cls7.getDeclaredField(strUd2);
                                field5.setAccessible(true);
                                field5.set(null, bArr4);
                            } catch (Throwable th5) {
                            }
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
    }

    public static String Kd() throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String strXd = ZO.xd("\u0017AQ6h", (short) (OY.Xd() ^ (853945245 ^ 853965469)), (short) (OY.Xd() ^ ((612748805 ^ 1144920921) ^ 1622914560)));
        String strUd = C1626yg.Ud("J\u0019", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (349624573 ^ (-285070764)))), (short) (C1580rY.Xd() ^ (Od.Xd() ^ (2144917936 ^ (-941969815)))));
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        if (((String) obj) == null) {
            String strWd = Ig.wd("l$z`2", (short) (OY.Xd() ^ (2146243948 ^ 2146250376)));
            String strOd = EO.Od("7T", (short) (C1580rY.Xd() ^ (1728174789 ^ (-1728158767))));
            try {
                Class<?> cls2 = Class.forName(strWd);
                Field field2 = 0 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                field2.setAccessible(true);
                obj3 = field2.get(null);
            } catch (Throwable th2) {
                obj3 = null;
            }
            if (((byte[]) obj3) == null) {
                return null;
            }
            Class<?> cls3 = Class.forName(C1561oA.Qd("xe+tT", (short) (Od.Xd() ^ ((3999833 ^ 279276056) ^ (-278418166)))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1499aX.Xd() ^ ((760732777 ^ 1357816122) ^ (-2109303129)));
            short sXd2 = (short) (C1499aX.Xd() ^ ((748332869 ^ 292607800) ^ (-1038759734)));
            int[] iArr = new int["t\u0002".length()];
            QB qb = new QB("t\u0002");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Method declaredMethod = cls3.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                Context context = (Context) declaredMethod.invoke(null, objArr);
                String strOd2 = C1561oA.od("|i/qk", (short) (Od.Xd() ^ (1782945567 ^ (-1782967468))));
                String strKd = C1561oA.Kd("/%", (short) (Od.Xd() ^ (10004946 ^ (-10011819))));
                try {
                    Class<?> cls4 = Class.forName(strOd2);
                    Field field3 = 0 != 0 ? cls4.getField(strKd) : cls4.getDeclaredField(strKd);
                    field3.setAccessible(true);
                    obj4 = field3.get(null);
                } catch (Throwable th3) {
                    obj4 = null;
                }
                String str = new String((byte[]) obj4);
                Class<?> cls5 = Class.forName(Wg.Zd("&\u000ehW9\u000e-WqX<$y[Hb\u001c!\u0007mC/\u000f", (short) (C1499aX.Xd() ^ (405881889 ^ (-405869163))), (short) (C1499aX.Xd() ^ (1035771432 ^ (-1035765950)))));
                Class<?>[] clsArr2 = new Class[1147481684 ^ 1147481686];
                clsArr2[0] = Class.forName(C1561oA.Xd("\n\u0002\u0018\u0004Q\u0011\u0007\u0015\u000fV|\u001f\u001e\u0016\u001c\u0016", (short) (C1580rY.Xd() ^ ((1636576426 ^ 1631419337) ^ (-11609897)))));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = new Object[(1094204968 ^ 1972349712) ^ 884446522];
                objArr2[0] = str;
                objArr2[1] = 0;
                Method method = cls5.getMethod(Wg.vd("ifxVf^rd^In`\\Zj\\\u0001ty\u0007", (short) (ZN.Xd() ^ (808213761 ^ 808191683))), clsArr2);
                try {
                    method.setAccessible(true);
                    SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
                    String string = sharedPreferences.getString(str, null);
                    String strKd2 = Qg.kd("C0u82", (short) (FB.Xd() ^ (1076583717 ^ 1076573224)), (short) (FB.Xd() ^ ((171537983 ^ 1359095453) ^ 1530606054)));
                    String strVd = hg.Vd("+=", (short) (Od.Xd() ^ ((1837897695 ^ 1393357398) ^ (-1048615275))), (short) (Od.Xd() ^ ((1800112623 ^ 1655760322) ^ (-167447442))));
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field4 = 0 != 0 ? cls6.getField(strVd) : cls6.getDeclaredField(strVd);
                        field4.setAccessible(true);
                        field4.set(null, string);
                    } catch (Throwable th4) {
                    }
                    short sXd3 = (short) (C1607wl.Xd() ^ (901436260 ^ 901428287));
                    int[] iArr2 = new int["\u000ez@\u0003|".length()];
                    QB qb2 = new QB("\u000ez@\u0003|");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    short sXd4 = (short) (C1607wl.Xd() ^ ((1189417829 ^ 64260913) ^ 1160880132));
                    int[] iArr3 = new int["3G".length()];
                    QB qb3 = new QB("3G");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls7 = Class.forName(str2);
                        Field field5 = 0 != 0 ? cls7.getField(str3) : cls7.getDeclaredField(str3);
                        field5.setAccessible(true);
                        obj5 = field5.get(null);
                    } catch (Throwable th5) {
                        obj5 = null;
                    }
                    if (((String) obj5) == null) {
                        String string2 = UUID.randomUUID().toString();
                        String strYd = C1561oA.Yd("sb*nj", (short) (C1607wl.Xd() ^ ((1569594357 ^ 336452149) ^ 1233373660)));
                        String strQd = Xg.qd("\u0007\u001b", (short) (C1580rY.Xd() ^ ((967869963 ^ 1822197434) ^ (-1428954475))), (short) (C1580rY.Xd() ^ (940759233 ^ (-940758837))));
                        try {
                            Class<?> cls8 = Class.forName(strYd);
                            Field field6 = 0 != 0 ? cls8.getField(strQd) : cls8.getDeclaredField(strQd);
                            field6.setAccessible(true);
                            field6.set(null, string2);
                        } catch (Throwable th6) {
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        String strWd2 = Jg.Wd("\u0017<61+", (short) (C1633zX.Xd() ^ ((602238866 ^ 1421650978) ^ (-2002361507))), (short) (C1633zX.Xd() ^ (1914147261 ^ (-1914174657))));
                        String strXd2 = ZO.xd("7h", (short) (Od.Xd() ^ ((1760178080 ^ 756019926) ^ (-1172690814))), (short) (Od.Xd() ^ (2083200330 ^ (-2083206805))));
                        try {
                            Class<?> cls9 = Class.forName(strWd2);
                            Field field7 = 0 != 0 ? cls9.getField(strXd2) : cls9.getDeclaredField(strXd2);
                            field7.setAccessible(true);
                            obj6 = field7.get(null);
                        } catch (Throwable th7) {
                            obj6 = null;
                        }
                        editorEdit.putString(str, (String) obj6);
                        editorEdit.commit();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        String strUd2 = C1626yg.Ud("bQe~N", (short) (FB.Xd() ^ ((123427053 ^ 1780722566) ^ 1836633726)), (short) (FB.Xd() ^ (1702184933 ^ 1702171674)));
        String strWd3 = Ig.wd("'\u0004", (short) (C1499aX.Xd() ^ ((1978826630 ^ 913666668) ^ (-1132927381))));
        try {
            Class<?> cls10 = Class.forName(strUd2);
            Field field8 = 0 != 0 ? cls10.getField(strWd3) : cls10.getDeclaredField(strWd3);
            field8.setAccessible(true);
            obj2 = field8.get(null);
        } catch (Throwable th8) {
            obj2 = null;
        }
        return (String) obj2;
    }

    public static byte[] Qs() {
        byte[] bArr = new byte[80051671 ^ 80051699];
        // fill-array-data instruction
        bArr[0] = 99;
        bArr[1] = 100;
        bArr[2] = 100;
        bArr[3] = 53;
        bArr[4] = 97;
        bArr[5] = 53;
        bArr[6] = 55;
        bArr[7] = 97;
        bArr[8] = 45;
        bArr[9] = 50;
        bArr[10] = 97;
        bArr[11] = 50;
        bArr[12] = 102;
        bArr[13] = 45;
        bArr[14] = 52;
        bArr[15] = 53;
        bArr[16] = 98;
        bArr[17] = 53;
        bArr[18] = 45;
        bArr[19] = 57;
        bArr[20] = 99;
        bArr[21] = 100;
        bArr[22] = 56;
        bArr[23] = 45;
        bArr[24] = 48;
        bArr[25] = 52;
        bArr[26] = 97;
        bArr[27] = 97;
        bArr[28] = 54;
        bArr[29] = 54;
        bArr[30] = 52;
        bArr[31] = 100;
        bArr[32] = 50;
        bArr[33] = 100;
        bArr[34] = 52;
        bArr[35] = 102;
        return bArr;
    }

    public static int Xe() {
        return 969994675 ^ 970534218;
    }

    public static byte[] Xs() {
        byte[] bArr = new byte[1061326931 ^ 1061326967];
        // fill-array-data instruction
        bArr[0] = 48;
        bArr[1] = 52;
        bArr[2] = 55;
        bArr[3] = 97;
        bArr[4] = 55;
        bArr[5] = 99;
        bArr[6] = 49;
        bArr[7] = 54;
        bArr[8] = 45;
        bArr[9] = 50;
        bArr[10] = 102;
        bArr[11] = 53;
        bArr[12] = 49;
        bArr[13] = 45;
        bArr[14] = 52;
        bArr[15] = 98;
        bArr[16] = 97;
        bArr[17] = 52;
        bArr[18] = 45;
        bArr[19] = 56;
        bArr[20] = 57;
        bArr[21] = 50;
        bArr[22] = 97;
        bArr[23] = 45;
        bArr[24] = 56;
        bArr[25] = 101;
        bArr[26] = 99;
        bArr[27] = 97;
        bArr[28] = 54;
        bArr[29] = 48;
        bArr[30] = 49;
        bArr[31] = 102;
        bArr[32] = 56;
        bArr[33] = 98;
        bArr[34] = 56;
        bArr[35] = 55;
        return bArr;
    }

    public static byte[] Ys() {
        byte[] bArr = new byte[1766545010 ^ 1766544978];
        // fill-array-data instruction
        bArr[0] = 104;
        bArr[1] = 116;
        bArr[2] = 116;
        bArr[3] = 112;
        bArr[4] = 115;
        bArr[5] = 58;
        bArr[6] = 47;
        bArr[7] = 47;
        bArr[8] = 98;
        bArr[9] = 50;
        bArr[10] = 104;
        bArr[11] = 120;
        bArr[12] = 97;
        bArr[13] = 107;
        bArr[14] = 49;
        bArr[15] = 97;
        bArr[16] = 110;
        bArr[17] = 99;
        bArr[18] = 46;
        bArr[19] = 99;
        bArr[20] = 108;
        bArr[21] = 105;
        bArr[22] = 120;
        bArr[23] = 115;
        bArr[24] = 105;
        bArr[25] = 103;
        bArr[26] = 104;
        bArr[27] = 116;
        bArr[28] = 46;
        bArr[29] = 99;
        bArr[30] = 111;
        bArr[31] = 109;
        return bArr;
    }

    public static byte[] ys() {
        byte[] bArr = new byte[1849695981 ^ 1849695975];
        // fill-array-data instruction
        bArr[0] = 85;
        bArr[1] = 73;
        bArr[2] = 68;
        bArr[3] = 101;
        bArr[4] = 102;
        bArr[5] = 97;
        bArr[6] = 117;
        bArr[7] = 108;
        bArr[8] = 116;
        bArr[9] = 115;
        return bArr;
    }
}
