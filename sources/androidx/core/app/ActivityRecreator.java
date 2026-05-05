package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
final class ActivityRecreator {
    private static final String LOG_TAG = "ActivityRecreator";
    protected static final Class<?> activityThreadClass;
    private static final Handler mainHandler;
    protected static final Field mainThreadField;
    protected static final Method performStopActivity2ParamsMethod;
    protected static final Method performStopActivity3ParamsMethod;
    protected static final Method requestRelaunchActivityMethod;
    protected static final Field tokenField;

    private ActivityRecreator() {
    }

    static {
        short sXd = (short) (C1633zX.Xd() ^ (-18816));
        int[] iArr = new int["\u0015{3\u001d\u0003\"E6+\u001f/wj\\=W*".length()];
        QB qb = new QB("\u0015{3\u001d\u0003\"E6+\u001f/wj\\=W*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-14198));
        int[] iArr2 = new int["PM[3FMQ.POOCO".length()];
        QB qb2 = new QB("PM[3FMQ.POOCO");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            mainHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Class<?> activityThreadClass2 = getActivityThreadClass();
            activityThreadClass = activityThreadClass2;
            mainThreadField = getMainThreadField();
            tokenField = getTokenField();
            performStopActivity3ParamsMethod = getPerformStopActivity3Params(activityThreadClass2);
            performStopActivity2ParamsMethod = getPerformStopActivity2Params(activityThreadClass2);
            requestRelaunchActivityMethod = getRequestRelaunchActivityMethod(activityThreadClass2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static boolean recreate(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (needsRelaunchCall() && requestRelaunchActivityMethod == null) {
            return false;
        }
        if (performStopActivity2ParamsMethod == null && performStopActivity3ParamsMethod == null) {
            return false;
        }
        try {
            final Object obj2 = tokenField.get(activity);
            if (obj2 == null || (obj = mainThreadField.get(activity)) == null) {
                return false;
            }
            final Application application = activity.getApplication();
            final LifecycleCheckCallbacks lifecycleCheckCallbacks = new LifecycleCheckCallbacks(activity);
            Class<?> cls = Class.forName(Wg.vd("hvm|rmi4`pq0<lmj`[Zn\\cc", (short) (C1499aX.Xd() ^ (-7441))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Qg.kd("\\h]jf_Y\"Tba\u001e0^]XTMJ\\PUS\b$EUIUGQU'C?=:O8@8\u00152<;0./6=", (short) (OY.Xd() ^ 840), (short) (OY.Xd() ^ 6265)));
            Object[] objArr = {lifecycleCheckCallbacks};
            Method method = cls.getMethod(hg.Vd("D678AA1=\u000b,<0<.8<\u000e*&$!6\u001f'\u001f{\u0019#\"\u0017\u0015\u0016\u001d$", (short) (FB.Xd() ^ 7988), (short) (FB.Xd() ^ 25503)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(application, objArr);
                Handler handler = mainHandler;
                Runnable runnable = new Runnable() { // from class: androidx.core.app.ActivityRecreator.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lifecycleCheckCallbacks.currentlyRecreatingToken = obj2;
                    }
                };
                Class<?> cls2 = Class.forName(C1561oA.ud("AMBOKD>\u0007GJ\u0004\u001d5A6=5A", (short) (C1499aX.Xd() ^ (-13803))));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1561oA.yd("SI]G\u0013PDPX\u001eAc[ZLLE=", (short) (C1607wl.Xd() ^ 15181)));
                Object[] objArr2 = {runnable};
                Method method2 = cls2.getMethod(C1561oA.Yd("\u0012\u0012\u0017\u0019", (short) (C1499aX.Xd() ^ (-17069))), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler, objArr2);
                    try {
                        if (needsRelaunchCall()) {
                            requestRelaunchActivityMethod.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                        } else {
                            activity.recreate();
                        }
                        Runnable runnable2 = new Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                            @Override // java.lang.Runnable
                            public void run() {
                                application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                            }
                        };
                        Class<?> cls3 = Class.forName(Xg.qd("ftkzxso:|\u0002=Xr\u0001w\u0001z\t", (short) (Od.Xd() ^ (-8166)), (short) (Od.Xd() ^ (-29482))));
                        Class<?>[] clsArr3 = new Class[1];
                        clsArr3[0] = Class.forName(Jg.Wd("2+\u0016\u0004&g2B\u0011\u001b\u0015;\n\rUY94", (short) (OY.Xd() ^ 14857), (short) (OY.Xd() ^ 22247)));
                        Object[] objArr3 = {runnable2};
                        Method method3 = cls3.getMethod(ZO.xd("%WQV", (short) (C1580rY.Xd() ^ (-19180)), (short) (C1580rY.Xd() ^ (-32015))), clsArr3);
                        try {
                            method3.setAccessible(true);
                            method3.invoke(handler, objArr3);
                            return true;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (Throwable th) {
                        Handler handler2 = mainHandler;
                        Runnable runnable3 = new Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                            @Override // java.lang.Runnable
                            public void run() {
                                application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                            }
                        };
                        short sXd = (short) (ZN.Xd() ^ 4360);
                        short sXd2 = (short) (ZN.Xd() ^ 17037);
                        int[] iArr = new int["0u\u001db+vZ=.*H/}\u001a\\8\u000f=".length()];
                        QB qb = new QB("0u\u001db+vZ=.*H/}\u001a\\8\u000f=");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                            i2++;
                        }
                        Class<?> cls4 = Class.forName(new String(iArr, 0, i2));
                        Class<?>[] clsArr4 = new Class[1];
                        clsArr4[0] = Class.forName(Ig.wd("\u0018C\t\u00168A$wM&N\u0012WOHe6_", (short) (C1607wl.Xd() ^ 7381)));
                        Object[] objArr4 = {runnable3};
                        Method method4 = cls4.getMethod(EO.Od("$l>'", (short) (FB.Xd() ^ 17407)), clsArr4);
                        try {
                            method4.setAccessible(true);
                            method4.invoke(handler2, objArr4);
                            throw th;
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    private static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
        Object currentlyRecreatingToken;
        private Activity mActivity;
        private final int mRecreatingHashCode;
        private boolean mStarted = false;
        private boolean mDestroyed = false;
        private boolean mStopQueued = false;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        LifecycleCheckCallbacks(Activity activity) {
            this.mActivity = activity;
            this.mRecreatingHashCode = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.mActivity == activity) {
                this.mStarted = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.mDestroyed || this.mStopQueued || this.mStarted || !ActivityRecreator.queueOnStopIfNecessary(this.currentlyRecreatingToken, this.mRecreatingHashCode, activity)) {
                return;
            }
            this.mStopQueued = true;
            this.currentlyRecreatingToken = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.mActivity == activity) {
                this.mActivity = null;
                this.mDestroyed = true;
            }
        }
    }

    protected static boolean queueOnStopIfNecessary(Object obj, int i2, Activity activity) {
        try {
            final Object obj2 = tokenField.get(activity);
            if (obj2 == obj && activity.hashCode() == i2) {
                final Object obj3 = mainThreadField.get(activity);
                Handler handler = mainHandler;
                Runnable runnable = new Runnable() { // from class: androidx.core.app.ActivityRecreator.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (ActivityRecreator.performStopActivity3ParamsMethod != null) {
                                ActivityRecreator.performStopActivity3ParamsMethod.invoke(obj3, obj2, false, "AppCompat recreation");
                            } else {
                                ActivityRecreator.performStopActivity2ParamsMethod.invoke(obj3, obj2, false);
                            }
                        } catch (RuntimeException e2) {
                            if (e2.getClass() != RuntimeException.class || e2.getMessage() == null || !e2.getMessage().startsWith("Unable to stop")) {
                            } else {
                                throw e2;
                            }
                        } catch (Throwable th) {
                        }
                    }
                };
                Class<?> cls = Class.forName(C1593ug.zd("5C:IGB>\tKP\f'AOFOIW", (short) (ZN.Xd() ^ 4873), (short) (ZN.Xd() ^ 31005)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1561oA.od("+!5\u001fj(\u001c( e\t+#\"\u0014\u0014\u001d\u0015", (short) (C1580rY.Xd() ^ (-28407))));
                Object[] objArr = {runnable};
                short sXd = (short) (C1580rY.Xd() ^ (-12731));
                int[] iArr = new int["PPUW%Y,YWW^:R>cTeV".length()];
                QB qb = new QB("PPUW%Y,YWW^:R>cTeV");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                    return true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return false;
        } catch (Throwable th) {
            Wg.Zd("(W\u0007i\u0014e~\"g\u0019s\u0010!\u000b<\u0015&", (short) (FB.Xd() ^ 17650), (short) (FB.Xd() ^ 10589));
            short sXd2 = (short) (ZN.Xd() ^ 16121);
            int[] iArr2 = new int["N\u0003nq}\u0003x\u007f\u007f2\u000b|~\u0003|8\u007f\u007f\u0010\u007f\u0006\b\u000e\bA\t\r\n\u0012\u000bG\u001f\u000b\u0017!\u0012!".length()];
            QB qb2 = new QB("N\u0003nq}\u0003x\u007f\u007f2\u000b|~\u0003|8\u007f\u007f\u0010\u007f\u0006\b\u000e\bA\t\r\n\u0012\u000bG\u001f\u000b\u0017!\u0012!");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i4));
                i4++;
            }
            new String(iArr2, 0, i4);
            return false;
        }
    }

    private static Method getPerformStopActivity3Params(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method getPerformStopActivity2Params(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean needsRelaunchCall() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }

    private static Method getRequestRelaunchActivityMethod(Class<?> cls) {
        if (needsRelaunchCall() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field getMainThreadField() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field getTokenField() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getActivityThreadClass() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }
}
