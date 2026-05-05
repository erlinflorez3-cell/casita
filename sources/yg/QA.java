package yg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class QA extends YK {
    public final int Kd;
    public final String Yd;

    public QA(BF bf, String str, int i2) {
        Object obj;
        String strXd = ZO.xd("\u001b7-{\u0010", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609514431))), (short) (C1580rY.Xd() ^ ((168012644 ^ 1339584431) ^ (-1172037298))));
        int iXd = C1607wl.Xd() ^ (319231441 ^ (-2101573062));
        short sXd = (short) (C1633zX.Xd() ^ (1075828632 ^ (-1075838696)));
        short sXd2 = (short) (C1633zX.Xd() ^ iXd);
        int[] iArr = new int["\f<".length()];
        QB qb = new QB("\f<");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        String str2 = new String(iArr, 0, i3);
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        super(bf, (EnumC1506bu) obj);
        String strWd = Ig.wd("-tG\bN", (short) (OY.Xd() ^ ((659685980 ^ 882762491) ^ 332386317)));
        String strOd = EO.Od("mH", (short) (C1607wl.Xd() ^ ((1696664080 ^ 1505219151) ^ 1016498538)));
        try {
            Class<?> cls2 = Class.forName(strWd);
            Field field2 = 1 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
            field2.setAccessible(true);
            field2.set(this, str);
        } catch (Throwable th2) {
        }
        String strQd = C1561oA.Qd("L9~!\u0010", (short) (Od.Xd() ^ (773665720 ^ (-773682594))));
        short sXd3 = (short) (FB.Xd() ^ ((1946565493 ^ 2105588406) ^ 159811722));
        short sXd4 = (short) (FB.Xd() ^ ((2085790494 ^ 917175675) ^ 1257769438));
        int[] iArr2 = new int["\u000e(".length()];
        QB qb2 = new QB("\u000e(");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i4)) - sXd4);
            i4++;
        }
        String str3 = new String(iArr2, 0, i4);
        Integer numValueOf = Integer.valueOf(i2);
        try {
            Class<?> cls3 = Class.forName(strQd);
            Field field3 = 1 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
            field3.setAccessible(true);
            field3.set(this, numValueOf);
        } catch (Throwable th3) {
        }
    }

    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QA qa = (QA) obj;
        String strYd = C1561oA.Yd("\u0006t<`Q", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951470932))));
        String strQd = Xg.qd("Uo", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951497567))), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831082374))));
        try {
            Class<?> cls = Class.forName(strYd);
            Field field = 1 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            obj2 = field.get(this);
        } catch (Throwable th) {
            obj2 = null;
        }
        int iIntValue = ((Integer) obj2).intValue();
        String strWd = Jg.Wd("|/y&Y", (short) (OY.Xd() ^ ((1518079541 ^ 1029189069) ^ 1730444272)), (short) (OY.Xd() ^ (1013918525 ^ 1013919164)));
        String strXd = ZO.xd("?M", (short) (C1499aX.Xd() ^ (1231846902 ^ (-1231826544))), (short) (C1499aX.Xd() ^ (1072538957 ^ (-1072551588))));
        try {
            Class<?> cls2 = Class.forName(strWd);
            Field field2 = 1 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
            field2.setAccessible(true);
            obj3 = field2.get(qa);
        } catch (Throwable th2) {
            obj3 = null;
        }
        if (iIntValue == ((Integer) obj3).intValue()) {
            String strUd = C1626yg.Ud("C$ee\u0018", (short) (C1499aX.Xd() ^ (1168265394 ^ (-1168263355))), (short) (C1499aX.Xd() ^ (2035239426 ^ (-2035244874))));
            String strWd2 = Ig.wd("#w", (short) (ZN.Xd() ^ (1103278154 ^ 1103278326)));
            try {
                Class<?> cls3 = Class.forName(strUd);
                Field field3 = 1 != 0 ? cls3.getField(strWd2) : cls3.getDeclaredField(strWd2);
                field3.setAccessible(true);
                obj4 = field3.get(this);
            } catch (Throwable th3) {
                obj4 = null;
            }
            String str = (String) obj4;
            String strOd = EO.Od("Vs./!", (short) (OY.Xd() ^ ((179036945 ^ 56596549) ^ 166990909)));
            String strQd2 = C1561oA.Qd("q{", (short) (OY.Xd() ^ ((1516059454 ^ 1332483700) ^ 355538736)));
            try {
                Class<?> cls4 = Class.forName(strOd);
                Field field4 = 1 != 0 ? cls4.getField(strQd2) : cls4.getDeclaredField(strQd2);
                field4.setAccessible(true);
                obj5 = field4.get(qa);
            } catch (Throwable th4) {
                obj5 = null;
            }
            if (Objects.equals(str, (String) obj5)) {
                return true;
            }
        }
        return false;
    }

    @Override // yg.TK
    public int hashCode() {
        Object obj;
        Object obj2;
        int iHashCode = ((((71635156 ^ 1403313757) ^ 1474416270) * 31) + super.hashCode()) * 31;
        String strZd = C1593ug.zd("=,s\u0018\t", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849977512))), (short) (C1580rY.Xd() ^ (OY.Xd() ^ (1958791353 ^ (-1894490843)))));
        String strOd = C1561oA.od("_i", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (521810499 ^ 1551983669))));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 1 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        int iHashCode2 = (iHashCode + ((String) obj).hashCode()) * 31;
        String strKd = C1561oA.Kd("n]%I:", (short) (C1633zX.Xd() ^ ((326020678 ^ 914343093) ^ (-621891903))));
        String strZd2 = Wg.Zd("U\u0002", (short) (C1580rY.Xd() ^ (1569890745 ^ (-1569904020))), (short) (C1580rY.Xd() ^ (1708599373 ^ (-1708608679))));
        try {
            Class<?> cls2 = Class.forName(strKd);
            Field field2 = 1 != 0 ? cls2.getField(strZd2) : cls2.getDeclaredField(strZd2);
            field2.setAccessible(true);
            obj2 = field2.get(this);
        } catch (Throwable th2) {
            obj2 = null;
        }
        return iHashCode2 + ((Integer) obj2).intValue();
    }

    @Override // yg.YK, yg.TK
    public void tK(LY ly) throws Throwable {
        Object obj;
        Object obj2;
        super.tK(ly);
        String strOd = C1561oA.od(";(m\u0010~", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1886642658 ^ 506979829))));
        String strKd = C1561oA.Kd("IU", (short) (C1499aX.Xd() ^ ((1352855233 ^ 102549718) ^ (-1455324539))));
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 1 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        String str = (String) obj;
        short sXd = (short) (Od.Xd() ^ ((1749625506 ^ 1651410978) ^ (-170362150)));
        short sXd2 = (short) (Od.Xd() ^ (1804796679 ^ (-1804803577)));
        int[] iArr = new int["Q\u001a90E".length()];
        QB qb = new QB("Q\u001a90E");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls2 = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (Od.Xd() ^ ((1665652655 ^ 181091953) ^ (-1770825189)));
        int[] iArr2 = new int["JBXD\u0012QGUO\u0017=_^V\\V".length()];
        QB qb2 = new QB("JBXD\u0012QGUO\u0017=_^V\\V");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str};
        Method method = cls2.getMethod(Wg.vd("_J", (short) (C1499aX.Xd() ^ ((1454490640 ^ 384520468) ^ (-1079701239)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(ly, objArr);
            String strKd2 = Qg.kd("7$i\fz", (short) (Od.Xd() ^ ((945600944 ^ 857656962) ^ (-188887651))), (short) (Od.Xd() ^ (751415037 ^ (-751409295))));
            String strVd = hg.Vd("[s", (short) (C1633zX.Xd() ^ ((11360465 ^ 2129275165) ^ (-2118607188))), (short) (C1633zX.Xd() ^ ((1930438879 ^ 2100147352) ^ (-238932341))));
            try {
                Class<?> cls3 = Class.forName(strKd2);
                Field field2 = 1 != 0 ? cls3.getField(strVd) : cls3.getDeclaredField(strVd);
                field2.setAccessible(true);
                obj2 = field2.get(this);
            } catch (Throwable th2) {
                obj2 = null;
            }
            long jIntValue = ((Integer) obj2).intValue();
            short sXd4 = (short) (C1580rY.Xd() ^ ((1163281992 ^ 195903569) ^ (-1325073157)));
            int[] iArr3 = new int["TA\u0007$0".length()];
            QB qb3 = new QB("TA\u0007$0");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            Class<?> cls4 = Class.forName(new String(iArr3, 0, i4));
            Class<?>[] clsArr2 = {Long.TYPE};
            Object[] objArr2 = {Long.valueOf(jIntValue)};
            Method method2 = cls4.getMethod(C1561oA.yd("`X", (short) (Od.Xd() ^ ((1385906684 ^ 199478718) ^ (-1501099304)))), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(ly, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
