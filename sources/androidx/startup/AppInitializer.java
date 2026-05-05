package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
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
public final class AppInitializer {
    private static final String SECTION_NAME = "Startup";
    private static volatile AppInitializer sInstance = null;
    private static final Object sLock = new Object();
    final Context mContext;
    final Set<Class<? extends Initializer<?>>> mDiscovered;
    final Map<Class<?>, Object> mInitialized;

    AppInitializer(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:", (short) (OY.Xd() ^ 28003))).getMethod(Wg.Zd("|\u0002w3qX;G0\u0015/\u0013\b\u000eIlR_7AD", (short) (FB.Xd() ^ 318), (short) (FB.Xd() ^ 12216)), new Class[0]);
        try {
            method.setAccessible(true);
            this.mContext = (Context) method.invoke(context, objArr);
            this.mDiscovered = new HashSet();
            this.mInitialized = new HashMap();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static AppInitializer getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new AppInitializer(context);
                }
            }
        }
        return sInstance;
    }

    static void setDelegate(AppInitializer appInitializer) {
        synchronized (sLock) {
            sInstance = appInitializer;
        }
    }

    public <T> T initializeComponent(Class<? extends Initializer<T>> cls) {
        return (T) doInitialize(cls);
    }

    public boolean isEagerlyInitialized(Class<? extends Initializer<?>> cls) {
        return this.mDiscovered.contains(cls);
    }

    <T> T doInitialize(Class<? extends Initializer<?>> cls) {
        T t2;
        synchronized (sLock) {
            t2 = (T) this.mInitialized.get(cls);
            if (t2 == null) {
                t2 = (T) doInitialize(cls, new HashSet());
            }
        }
        return t2;
    }

    private <T> T doInitialize(Class<? extends Initializer<?>> cls, Set<Class<?>> set) {
        T t2;
        if (Trace.isEnabled()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (!this.mInitialized.containsKey(cls)) {
            set.add(cls);
            try {
                Initializer<?> initializerNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends Initializer<?>>> listDependencies = initializerNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends Initializer<?>> cls2 : listDependencies) {
                        if (!this.mInitialized.containsKey(cls2)) {
                            doInitialize(cls2, set);
                        }
                    }
                }
                t2 = (T) initializerNewInstance.create(this.mContext);
                set.remove(cls);
                this.mInitialized.put(cls, t2);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        } else {
            t2 = (T) this.mInitialized.get(cls);
        }
        return t2;
    }

    void discoverAndInitialize() {
        try {
            try {
                Trace.beginSection(C1561oA.Xd("[}k}\u0001\u0003~", (short) (ZN.Xd() ^ 251)));
                Context context = this.mContext;
                Object[] objArr = new Object[0];
                Method method = Class.forName(Wg.vd("(6-<:51{2??F8BI\u0004y''. 41", (short) (OY.Xd() ^ 15399))).getMethod(Qg.kd("VSa<LMTINK3EPG", (short) (C1607wl.Xd() ^ 2506), (short) (C1607wl.Xd() ^ 586)), new Class[0]);
                try {
                    method.setAccessible(true);
                    ComponentName componentName = new ComponentName((String) method.invoke(context, objArr), InitializationProvider.class.getName());
                    Context context2 = this.mContext;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(hg.Vd("r~s\u0001|uo8lwuzjrw0Domrbto", (short) (FB.Xd() ^ 3172), (short) (FB.Xd() ^ 14609))).getMethod(C1561oA.ud("yv\u0005_opwlqnUhtfkht", (short) (FB.Xd() ^ 20702)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                        Class<?> cls = Class.forName(C1561oA.yd("/=4CA<8\u00039FFM?IP\u000bNL\u000e1CFOFML5JXLSR`", (short) (Od.Xd() ^ (-3499))));
                        Class<?>[] clsArr = new Class[2];
                        short sXd = (short) (Od.Xd() ^ (-10331));
                        int[] iArr = new int["LZQ`^YU Vccj\\fm(>kjnnnfpwRfsl".length()];
                        QB qb = new QB("LZQ`^YU Vccj\\fm(>kjnnnfpwRfsl");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                            i2++;
                        }
                        clsArr[0] = Class.forName(new String(iArr, 0, i2));
                        clsArr[1] = Integer.TYPE;
                        Object[] objArr3 = {componentName, 128};
                        Method method3 = cls.getMethod(Xg.qd("10@\u001d@>F:68F\u001eD=G", (short) (OY.Xd() ^ 23068), (short) (OY.Xd() ^ 17503)), clsArr);
                        try {
                            method3.setAccessible(true);
                            discoverAndInitialize(((ProviderInfo) method3.invoke(packageManager, objArr3)).metaData);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (PackageManager.NameNotFoundException e5) {
                throw new StartupException(e5);
            }
        } finally {
            Trace.endSection();
        }
    }

    void discoverAndInitialize(Bundle bundle) throws Throwable {
        Context context = this.mContext;
        int i2 = R.string.androidx_startup;
        Class<?> cls = Class.forName(Jg.Wd("8\u0001\u0002n78\u000e%5H\u0012ws9%i]U[<{\tk", (short) (FB.Xd() ^ 19874), (short) (FB.Xd() ^ 6469)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(ZO.xd("\u0011\u0003\bG\u000f\u0010\u0015H%", (short) (OY.Xd() ^ 27529), (short) (OY.Xd() ^ 12473)), clsArr);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            if (bundle != null) {
                try {
                    HashSet hashSet = new HashSet();
                    for (String str2 : bundle.keySet()) {
                        if (str.equals(bundle.getString(str2, null))) {
                            Class<?> cls2 = Class.forName(str2);
                            if (Initializer.class.isAssignableFrom(cls2)) {
                                this.mDiscovered.add((Class<? extends Initializer<?>>) cls2);
                            }
                        }
                    }
                    Iterator<Class<? extends Initializer<?>>> it = this.mDiscovered.iterator();
                    while (it.hasNext()) {
                        doInitialize(it.next(), hashSet);
                    }
                } catch (ClassNotFoundException e2) {
                    throw new StartupException(e2);
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
