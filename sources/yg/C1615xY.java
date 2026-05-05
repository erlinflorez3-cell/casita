package yg;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yg.xY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1615xY {
    public static Object Kd = null;
    public static Context Xd = null;
    public static String Yd = null;

    static {
        String strXd = ZO.xd("KD\u001e\u0001O", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134243355)), (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (298861727 ^ 542723380))));
        String strUd = C1626yg.Ud("w~", (short) (C1633zX.Xd() ^ (489907680 ^ (-489892865))), (short) (C1633zX.Xd() ^ ((48065029 ^ 223080191) ^ (-261533440))));
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            field.set(null, null);
        } catch (Throwable th) {
        }
    }

    private static synchronized void Kd() {
        Object obj;
        String strZd = Wg.Zd("7\u007f w.", (short) (Od.Xd() ^ (110697945 ^ (-110691626))), (short) (Od.Xd() ^ ((1880026398 ^ 1364871155) ^ (-559211560))));
        String strXd = C1561oA.Xd("Zg", (short) (C1633zX.Xd() ^ ((1390438869 ^ 1793090402) ^ (-939535350))));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        if (((Context) obj) != null) {
            return;
        }
        try {
            Class<?> cls2 = Class.forName(Wg.vd("=IBOG@>\u00075CF\u0003\u00112F:B4BF\u001c/<.%'", (short) (C1580rY.Xd() ^ (58511670 ^ (-58516939)))));
            Object objInvoke = cls2.getMethod(Qg.kd("\u001e/+*\u001c$)t\u0016&\u001a&\u0018\"&\u007f\u0013\u001c\u000e\t\u000b", (short) (C1499aX.Xd() ^ ((1028785167 ^ 1820147365) ^ (-1362061480))), (short) (C1499aX.Xd() ^ ((1819147113 ^ 947481605) ^ (-1410661332)))), new Class[0]).invoke(null, new Object[0]);
            short sXd = (short) (ZN.Xd() ^ (197663827 ^ 197672084));
            short sXd2 = (short) (ZN.Xd() ^ ((387683113 ^ 1582504419) ^ 1229500850));
            int[] iArr = new int["`]k7ed_[TQcW\\Z".length()];
            QB qb = new QB("`]k7ed_[TQcW\\Z");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Object objInvoke2 = cls2.getMethod(new String(iArr, 0, i2), new Class[0]).invoke(objInvoke, new Object[0]);
            if (objInvoke2 != null) {
                Class<?> cls3 = objInvoke2.getClass();
                short sXd3 = (short) (ZN.Xd() ^ (666582976 ^ 666598325));
                int[] iArr2 = new int["khvBpojf_\\nbge9dbgWid".length()];
                QB qb2 = new QB("khvBpojf_\\nbge9dbgWid");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Object objInvoke3 = cls3.getMethod(new String(iArr2, 0, i3), new Class[0]).invoke(objInvoke2, new Object[0]);
                Class<?> cls4 = Class.forName(C1561oA.yd("xe/x\\", (short) (Od.Xd() ^ (2106812895 ^ (-2106797269)))));
                Class<?>[] clsArr = {Class.forName(C1561oA.Yd("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSu\n\u0013\u000f\u000e ", (short) (C1633zX.Xd() ^ (1808986833 ^ (-1808985345)))))};
                Object[] objArr = {objInvoke3};
                short sXd4 = (short) (OY.Xd() ^ (1613804480 ^ 1613794929));
                short sXd5 = (short) (OY.Xd() ^ ((2023721313 ^ 1157786057) ^ 1033762881));
                int[] iArr3 = new int["|\t".length()];
                QB qb3 = new QB("|\t");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                    i4++;
                }
                Method declaredMethod = cls4.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(null, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (Exception e3) {
        }
    }

    public static Context Xd() throws Throwable {
        Object obj;
        Object obj2;
        String strWd = Ig.wd("l)}g(", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (951650123 ^ (-1016220800)))));
        short sXd = (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1518410250 ^ 91107859)));
        int[] iArr = new int["\"V".length()];
        QB qb = new QB("\"V");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        if (((Context) obj) == null) {
            Class<?> cls2 = Class.forName(C1561oA.Qd("\u001b\bM\u0017v", (short) (FB.Xd() ^ ((837666411 ^ 560671239) ^ 277253637))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (C1580rY.Xd() ^ (418504256 ^ (-418508392)));
            short sXd3 = (short) (C1580rY.Xd() ^ ((1113082276 ^ 1584225217) ^ (-473235829)));
            int[] iArr2 = new int["j\u0005".length()];
            QB qb2 = new QB("j\u0005");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            Method declaredMethod = cls2.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        short sXd4 = (short) (C1580rY.Xd() ^ (636855601 ^ (-636874660)));
        int[] iArr3 = new int["dQ\u0017`@".length()];
        QB qb3 = new QB("dQ\u0017`@");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        String str2 = new String(iArr3, 0, i4);
        short sXd5 = (short) (Od.Xd() ^ ((689362075 ^ 1992481645) ^ (-1607747260)));
        int[] iArr4 = new int["3@".length()];
        QB qb4 = new QB("3@");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
            i5++;
        }
        String str3 = new String(iArr4, 0, i5);
        try {
            Class<?> cls3 = Class.forName(str2);
            Field field2 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
            field2.setAccessible(true);
            obj2 = field2.get(null);
        } catch (Throwable th2) {
            obj2 = null;
        }
        return (Context) obj2;
    }

    public static synchronized void Yd(Object obj) {
        Object obj2;
        String strWd = Jg.Wd("[\u0013\u001a&E", (short) (OY.Xd() ^ (1022253007 ^ 1022246332)), (short) (OY.Xd() ^ (1773551635 ^ 1773559004)));
        String strXd = ZO.xd("\u0013H", (short) (C1499aX.Xd() ^ (1931808910 ^ (-1931831908))), (short) (C1499aX.Xd() ^ ((425591521 ^ 1116624446) ^ (-1540366440))));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj2 = field.get(null);
        } catch (Throwable th) {
            obj2 = null;
        }
        if (((Context) obj2) == null && obj != null) {
            Context context = (Context) obj;
            String strUd = C1626yg.Ud("aLLNg", (short) (C1580rY.Xd() ^ ((770142326 ^ 1988202228) ^ (-1533444646))), (short) (C1580rY.Xd() ^ (563715208 ^ (-563734650))));
            String strWd2 = Ig.wd("C*", (short) (C1633zX.Xd() ^ (1889610438 ^ (-1889607606))));
            try {
                Class<?> cls2 = Class.forName(strUd);
                Field field2 = 0 != 0 ? cls2.getField(strWd2) : cls2.getDeclaredField(strWd2);
                field2.setAccessible(true);
                field2.set(null, context);
            } catch (Throwable th2) {
            }
        }
    }
}
