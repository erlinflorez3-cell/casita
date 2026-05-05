package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.common.build.ReactBuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class UiThreadUtil {
    private static volatile Handler sMainHandler = null;

    public static void assertNotOnUiThread() {
        if (ReactBuildConfig.DEBUG) {
            SoftAssertions.assertCondition(!isOnUiThread(), "Expected not to run on UI thread!");
        }
    }

    public static void assertOnUiThread() {
        if (ReactBuildConfig.DEBUG) {
            SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
        }
    }

    public static Handler getUiThreadHandler() {
        if (sMainHandler == null) {
            synchronized (UiThreadUtil.class) {
                if (sMainHandler == null) {
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(C1561oA.Yd("~\r\u0004\u0013\u0011\f\bR\u0015\u001aUt\u0019\u001a\u001c\u0012 ", (short) (FB.Xd() ^ 29512))).getDeclaredMethod(Xg.qd("}|\rf{\u0005\u000bi\u000e\u000f\u0011\u0007\u0015", (short) (C1499aX.Xd() ^ (-29248)), (short) (C1499aX.Xd() ^ (-7381))), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        sMainHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
        return sMainHandler;
    }

    public static boolean isOnUiThread() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Jg.Wd("\u00173%'\u0018\u0016\rI\u000f\u001bMcv\u0002vop", (short) (Od.Xd() ^ (-5780)), (short) (Od.Xd() ^ (-11485)))).getDeclaredMethod(ZO.xd("C\u0014\u0005 1^-)_^\u0011&O", (short) (C1607wl.Xd() ^ 8366), (short) (C1607wl.Xd() ^ 11517)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return ((Looper) declaredMethod.invoke(null, objArr)).getThread() == Thread.currentThread();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void removeOnUiThread(Runnable runnable) {
        getUiThreadHandler().removeCallbacks(runnable);
    }

    public static boolean runOnUiThread(Runnable runnable) {
        Handler uiThreadHandler = getUiThreadHandler();
        Class<?> cls = Class.forName(C1626yg.Ud("A\u0011G\u0004p\u0004tvnXC/l\u0001WY\u00120", (short) (C1580rY.Xd() ^ (-17652)), (short) (C1580rY.Xd() ^ (-19380))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1607wl.Xd() ^ 12636);
        int[] iArr = new int["6t(7\u001d\u0016bh\u000e\u0005\u0013L\u0016$v\u0012vQ".length()];
        QB qb = new QB("6t(7\u001d\u0016bh\u000e\u0005\u0013L\u0016$v\u0012vQ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {runnable, 0L};
        short sXd2 = (short) (C1607wl.Xd() ^ 13843);
        int[] iArr2 = new int["F\u0017lM-\f/C\u0017vs".length()];
        QB qb2 = new QB("F\u0017lM-\f/C\u0017vs");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(uiThreadHandler, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean runOnUiThread(Runnable runnable, long j2) throws Throwable {
        Handler uiThreadHandler = getUiThreadHandler();
        Class<?> cls = Class.forName(C1561oA.Qd("~\u000b\u007f\r\t\u0002{D\u0005\bAZr~szr~", (short) (C1633zX.Xd() ^ (-19908))));
        Class<?>[] clsArr = {Class.forName(C1593ug.zd("\u000b\u0003\u0019\u0005R\u0012\b\u0016\u0010W|!\u001b\u001c\u0010\u0012\u001d\u0017", (short) (C1607wl.Xd() ^ 8950), (short) (C1607wl.Xd() ^ 27851))), Long.TYPE};
        Object[] objArr = {runnable, Long.valueOf(j2)};
        Method method = cls.getMethod(C1561oA.od("FDGG\u00166<0G20", (short) (C1580rY.Xd() ^ (-20757))), clsArr);
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(uiThreadHandler, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
