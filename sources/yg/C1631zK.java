package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: yg.zK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1631zK extends TimerTask {
    private static int Xd = 0;

    static {
        short sXd = (short) (FB.Xd() ^ (Od.Xd() ^ 1207809798));
        int[] iArr = new int["\u0006r8\u0004S".length()];
        QB qb = new QB("\u0006r8\u0004S");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (OY.Xd() ^ ((172178525 ^ 1944460585) ^ 2040884981));
        int[] iArr2 = new int["=X".length()];
        QB qb2 = new QB("=X");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
            String strZd = Wg.Zd("gk81\u0018", (short) (C1499aX.Xd() ^ ((1512869543 ^ 613290029) ^ (-2124608485))), (short) (C1499aX.Xd() ^ ((1718936857 ^ 1089889698) ^ (-646100253))));
            short sXd3 = (short) (C1580rY.Xd() ^ ((662086203 ^ 1313749297) ^ (-1765316205)));
            int[] iArr3 = new int["\u0004\u0011".length()];
            QB qb3 = new QB("\u0004\u0011");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i4));
                i4++;
            }
            String str = new String(iArr3, 0, i4);
            Integer numValueOf = Integer.valueOf(iIntValue);
            try {
                Class<?> cls2 = Class.forName(strZd);
                Field field = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                field.setAccessible(true);
                field.set(null, numValueOf);
            } catch (Throwable th) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    C1631zK() {
    }

    public static int Ke() {
        return (819622610 ^ 1834777032) ^ 1569065526;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() throws Throwable {
        Object obj;
        try {
            CX.ud();
        } catch (Exception e2) {
            C1597vN.Xd(e2);
        }
        short sXd = (short) (C1607wl.Xd() ^ ((1711813109 ^ 688087871) ^ 1326130847));
        int[] iArr = new int["\u001a\tP\u000bo".length()];
        QB qb = new QB("\u001a\tP\u000bo");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Qg.kd("+\u0015", (short) (Od.Xd() ^ (533103869 ^ (-533119358))), (short) (Od.Xd() ^ (197666277 ^ (-197680478)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(hg.Vd("L9~7\u001a", (short) (C1580rY.Xd() ^ (1219400111 ^ (-1219398387))), (short) (C1580rY.Xd() ^ ((1494432237 ^ 456424886) ^ (-1109879957))))).getDeclaredMethod(C1561oA.ud("9Q", (short) (C1580rY.Xd() ^ (2131822001 ^ (-2131850990)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(null, objArr2);
                Object[] objArr3 = new Object[0];
                Constructor<?> declaredConstructor = Class.forName(C1561oA.yd("\"\u000fT w", (short) (ZN.Xd() ^ ((858333557 ^ 889959302) ^ 102948288)))).getDeclaredConstructor(new Class[0]);
                try {
                    declaredConstructor.setAccessible(true);
                    C1631zK c1631zK = (C1631zK) declaredConstructor.newInstance(objArr3);
                    Timer timer = new Timer();
                    short sXd2 = (short) (C1499aX.Xd() ^ ((1071520095 ^ 44427445) ^ (-1031514918)));
                    int[] iArr2 = new int["\u0004r:\bY".length()];
                    QB qb2 = new QB("\u0004r:\bY");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                        i3++;
                    }
                    String str = new String(iArr2, 0, i3);
                    short sXd3 = (short) (C1633zX.Xd() ^ (226046807 ^ (-226045070)));
                    short sXd4 = (short) (C1633zX.Xd() ^ (611947493 ^ (-611968374)));
                    int[] iArr3 = new int["v\u0004".length()];
                    QB qb3 = new QB("v\u0004");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls = Class.forName(str);
                        Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
                        field.setAccessible(true);
                        obj = field.get(null);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    timer.schedule(c1631zK, ((Integer) obj).intValue() * 1000);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
