package yg;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class GF implements Application.ActivityLifecycleCallbacks {
    private static boolean Kd = true;
    private int Xd = 0;

    private static void Kd(Context context) throws Throwable {
        Object obj;
        try {
            Object objInvoke = Class.forName(Wg.Zd("eK&\u0013ts\u0015}Uz:#tfQ\bCdH\r!^{~\u001ddT5\u000fb", (short) (C1607wl.Xd() ^ (297212879 ^ 297222271)), (short) (C1607wl.Xd() ^ ((943031409 ^ 1165809028) ^ 2101965920)))).getMethod(C1561oA.Xd("#\"2\u007f01.,'&:077\r::A3GD", (short) (OY.Xd() ^ (968529895 ^ 968525955))), new Class[0]).invoke(context, new Object[0]);
            Class<?> cls = Class.forName(Wg.vd("E2{E)", (short) (FB.Xd() ^ (1832152285 ^ 1832152504))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (741301992 ^ (-741305523)));
            short sXd2 = (short) (Od.Xd() ^ ((1193752117 ^ 618344550) ^ (-1677489438)));
            int[] iArr = new int["[QeO\u001bXLXP\u00166HOIFV".length()];
            QB qb = new QB("[QeO\u001bXLXP\u00166HOIFV");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {objInvoke};
            Method declaredMethod = cls.getDeclaredMethod(hg.Vd("EO", (short) (C1580rY.Xd() ^ (404386470 ^ (-404363259))), (short) (C1580rY.Xd() ^ (852552183 ^ (-852547442)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
        }
        String strUd = C1561oA.ud("0-/\u001e", (short) (FB.Xd() ^ (50806166 ^ 50804701)));
        String strYd = C1561oA.yd("H5~H$", (short) (C1633zX.Xd() ^ (353746505 ^ (-353747681))));
        String strYd2 = C1561oA.Yd("*6", (short) (ZN.Xd() ^ (1195505960 ^ 1195502387)));
        try {
            Class<?> cls2 = Class.forName(strYd);
            Field field = 0 != 0 ? cls2.getField(strYd2) : cls2.getDeclaredField(strYd2);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        if (strUd.equals((String) obj)) {
            return;
        }
        String strQd = Xg.qd("\t\u0005\u0011\u0019\f", (short) (FB.Xd() ^ ((679127644 ^ 701487589) ^ 28648802)), (short) (FB.Xd() ^ ((1199671275 ^ 887648053) ^ 1936307771)));
        String strWd = Jg.Wd("2\u0012na.", (short) (OY.Xd() ^ (540190769 ^ 540208453)), (short) (OY.Xd() ^ ((583406763 ^ 1613952150) ^ 1123338755)));
        String strXd = ZO.xd("\u001bR", (short) (C1580rY.Xd() ^ (169784118 ^ (-169802156))), (short) (C1580rY.Xd() ^ ((1229384173 ^ 483470660) ^ (-1436009965))));
        try {
            Class<?> cls3 = Class.forName(strWd);
            Field field2 = 0 != 0 ? cls3.getField(strXd) : cls3.getDeclaredField(strXd);
            field2.setAccessible(true);
            field2.set(null, strQd);
        } catch (Throwable th2) {
        }
        short sXd3 = (short) (C1499aX.Xd() ^ (1085119890 ^ (-1085127255)));
        short sXd4 = (short) (C1499aX.Xd() ^ (709329163 ^ (-709349558)));
        int[] iArr2 = new int["F`bG#".length()];
        QB qb2 = new QB("F`bG#");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr2 = new Object[0];
        Method declaredMethod2 = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(Ig.wd("H\u0001", (short) (C1633zX.Xd() ^ ((326837535 ^ 893354934) ^ (-642046119)))), new Class[0]);
        try {
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(null, objArr2);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static void Xd() throws Exception {
        int i2 = (1578384375 ^ 1470771328) ^ 163449725;
        short sXd = (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1859247291 ^ (-444632774))));
        int[] iArr = new int["\u0017\u0004I\u0002d".length()];
        QB qb = new QB("\u0017\u0004I\u0002d");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("xg", (short) (ZN.Xd() ^ (Od.Xd() ^ (1687149494 ^ 594695947))), (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134248201)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            Class<?> cls2 = Class.forName(C1561oA.od("\tu;sV", (short) (C1633zX.Xd() ^ (1207641959 ^ (-1207656612)))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf((1708137884 ^ 364420442) ^ 1885896908)};
            Method declaredMethod2 = cls2.getDeclaredMethod(C1561oA.Kd("{j", (short) (C1580rY.Xd() ^ ((1426884660 ^ 89198200) ^ (-1348316311)))), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(null, objArr2);
                C1556mQ.qd();
                C1498aQ.qd();
                vQ.qd();
                C1532iQ.qd();
                wQ.qd();
                C1503bQ.qd();
                C1579rQ.qd();
                C1585tQ.qd();
                C1622yQ.qd();
                QQ.qd();
                AQ.qd();
                FQ.qd();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void Yd(Object obj) throws Throwable {
        try {
            Application application = (Application) Class.forName(Jg.Wd("#]|2X\u0002&\u0017};d\u0010,b\u0014z;\u0013=i\u0004Fs}Bb\u001bBa$", (short) (OY.Xd() ^ ((1832463943 ^ 246627852) ^ 1670011166)), (short) (OY.Xd() ^ ((173081888 ^ 837067456) ^ 1001772879)))).getMethod(ZO.xd("&)(h7F2NDGC\u000b.5Gl9>\n8r", (short) (C1499aX.Xd() ^ ((2108574904 ^ 607112907) ^ (-1501686722))), (short) (C1499aX.Xd() ^ (251278004 ^ (-251295830)))), new Class[0]).invoke(obj, new Object[0]);
            GF gf = new GF();
            Class<?> cls = Class.forName(C1626yg.Ud("CE@5\rv~]\u001ezh39%=)!G@\u000f63=", (short) (FB.Xd() ^ (474073294 ^ 474073929)), (short) (FB.Xd() ^ ((227873102 ^ 954472185) ^ 896606375))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Ig.wd("\u000eO5)z@e4E*.G(OU-q\u001eDk\u001dc\u0001>\u0004N}!hi\u001d>-\u0005W\u00153irib`ODC%<h\u001f[", (short) (C1580rY.Xd() ^ ((68746633 ^ 1788602134) ^ (-1854083311)))));
            Object[] objArr = {gf};
            short sXd = (short) (C1633zX.Xd() ^ ((118252434 ^ 876930801) ^ (-860422009)));
            int[] iArr = new int["\u001b\\b\u0007\u0013h/\u001f0`i\u0007bYBo\u0017\u0018OX\u0019Y[j\u0016\u0002D\b$.Ck\u0016B".length()];
            QB qb = new QB("\u001b\\b\u0007\u0013h/\u001f0`i\u0007bYBo\u0017\u0018OX\u0019Y[j\u0016\u0002D\b$.Ck\u0016B");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(application, objArr);
                Kd(application);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
        }
    }

    public static boolean ud() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) throws Throwable {
        Kd(activity);
        super.onActivityPreCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
