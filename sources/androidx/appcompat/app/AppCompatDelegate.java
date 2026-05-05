package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.ArraySet;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {
    static final String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final boolean DEBUG = false;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final String TAG = "AppCompatDelegate";
    static SerialExecutor sSerialExecutorForLocalesStorage = new SerialExecutor(new ThreadPerTaskExecutor());
    private static int sDefaultNightMode = -100;
    private static LocaleListCompat sRequestedAppLocales = null;
    private static LocaleListCompat sStoredAppLocales = null;
    private static Boolean sIsAutoStoreLocalesOptedIn = null;
    private static boolean sIsFrameworkSyncChecked = false;
    private static final ArraySet<WeakReference<AppCompatDelegate>> sActivityDelegates = new ArraySet<>();
    private static final Object sActivityDelegatesLock = new Object();
    private static final Object sAppLocalesStorageSyncLock = new Object();

    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    boolean applyAppLocales() {
        return false;
    }

    public abstract boolean applyDayNight();

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public abstract View createView(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T findViewById(int i2);

    public Context getContextForDelegate() {
        return null;
    }

    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    public abstract ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i2);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i2);

    public abstract void setContentView(int i2);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z2);

    public abstract void setLocalNightMode(int i2);

    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void setSupportActionBar(Toolbar toolbar);

    public void setTheme(int i2) {
    }

    public abstract void setTitle(CharSequence charSequence);

    public abstract ActionMode startSupportActionMode(ActionMode.Callback callback);

    static class SerialExecutor implements Executor {
        Runnable mActive;
        final Executor mExecutor;
        private final Object mLock = new Object();
        final Queue<Runnable> mTasks = new ArrayDeque();

        SerialExecutor(Executor executor) {
            this.mExecutor = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.mLock) {
                this.mTasks.add(new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegate$SerialExecutor$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m27x45c145d(runnable);
                    }
                });
                if (this.mActive == null) {
                    scheduleNext();
                }
            }
        }

        /* JADX INFO: renamed from: lambda$execute$0$androidx-appcompat-app-AppCompatDelegate$SerialExecutor */
        /* synthetic */ void m27x45c145d(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        protected void scheduleNext() {
            synchronized (this.mLock) {
                Runnable runnablePoll = this.mTasks.poll();
                this.mActive = runnablePoll;
                if (runnablePoll != null) {
                    this.mExecutor.execute(runnablePoll);
                }
            }
        }
    }

    static class ThreadPerTaskExecutor implements Executor {
        ThreadPerTaskExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static AppCompatDelegate create(Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, appCompatCallback);
    }

    public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    public static AppCompatDelegate create(Context context, Window window, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(context, window, appCompatCallback);
    }

    public static AppCompatDelegate create(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(context, activity, appCompatCallback);
    }

    AppCompatDelegate() {
    }

    public Context attachBaseContext2(Context context) {
        attachBaseContext(context);
        return context;
    }

    public static void setDefaultNightMode(int i2) {
        if ((i2 == -1 || i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) && sDefaultNightMode != i2) {
            sDefaultNightMode = i2;
            applyDayNightToActiveDelegates();
        }
    }

    public static void setApplicationLocales(LocaleListCompat localeListCompat) throws Throwable {
        Objects.requireNonNull(localeListCompat);
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                Api33Impl.localeManagerSetApplicationLocales(localeManagerForApplication, Api24Impl.localeListForLanguageTags(localeListCompat.toLanguageTags()));
                return;
            }
            return;
        }
        if (!localeListCompat.equals(sRequestedAppLocales)) {
            synchronized (sActivityDelegatesLock) {
                sRequestedAppLocales = localeListCompat;
                applyLocalesToActiveDelegates();
            }
        }
    }

    public static LocaleListCompat getApplicationLocales() throws Throwable {
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication));
            }
        } else {
            LocaleListCompat localeListCompat = sRequestedAppLocales;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        return sDefaultNightMode;
    }

    static LocaleListCompat getRequestedAppLocales() {
        return sRequestedAppLocales;
    }

    static LocaleListCompat getStoredAppLocales() {
        return sStoredAppLocales;
    }

    static void resetStaticRequestedAndStoredLocales() {
        sRequestedAppLocales = null;
        sStoredAppLocales = null;
    }

    static void setIsAutoStoreLocalesOptedIn(boolean z2) {
        sIsAutoStoreLocalesOptedIn = Boolean.valueOf(z2);
    }

    static Object getLocaleManagerForApplication() throws Throwable {
        Context contextForDelegate;
        Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null && (contextForDelegate = appCompatDelegate.getContextForDelegate()) != null) {
                Object[] objArr = {C1561oA.Kd("\u000e\u0012\u0007\u0006\u0012\f", (short) (Od.Xd() ^ (-29365)))};
                Method method = Class.forName(Wg.Zd("s\ns{7$\u0018\u0011:.+fPF\u00014?w/,\nTF", (short) (FB.Xd() ^ 15739), (short) (FB.Xd() ^ 15276))).getMethod(Wg.vd("\u0017\u0016\"\u0002-(&\u0018%\f\u001b)2&\u001d ", (short) (FB.Xd() ^ 15902)), Class.forName(C1561oA.Xd("ldzf4siwq9_\u0002\u0001x~x", (short) (C1633zX.Xd() ^ (-3228)))));
                try {
                    method.setAccessible(true);
                    return method.invoke(contextForDelegate, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return null;
    }

    static boolean isAutoStorageOptedIn(Context context) throws Throwable {
        if (sIsAutoStoreLocalesOptedIn == null) {
            try {
                ServiceInfo serviceInfo = AppLocalesMetadataHolderService.getServiceInfo(context);
                if (serviceInfo.metaData != null) {
                    sIsAutoStoreLocalesOptedIn = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                sIsAutoStoreLocalesOptedIn = false;
            }
        }
        return sIsAutoStoreLocalesOptedIn.booleanValue();
    }

    void asyncExecuteSyncRequestedAndStoredLocales(final Context context) {
        sSerialExecutorForLocalesStorage.execute(new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AppCompatDelegate.syncRequestedAndStoredLocales(context);
            }
        });
    }

    public static void syncRequestedAndStoredLocales(final Context context) {
        if (isAutoStorageOptedIn(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!sIsFrameworkSyncChecked) {
                    sSerialExecutorForLocalesStorage.execute(new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(context);
                        }
                    });
                    return;
                }
                return;
            }
            synchronized (sAppLocalesStorageSyncLock) {
                LocaleListCompat localeListCompat = sRequestedAppLocales;
                if (localeListCompat == null) {
                    if (sStoredAppLocales == null) {
                        sStoredAppLocales = LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
                    }
                    if (sStoredAppLocales.isEmpty()) {
                    } else {
                        sRequestedAppLocales = sStoredAppLocales;
                    }
                } else if (!localeListCompat.equals(sStoredAppLocales)) {
                    LocaleListCompat localeListCompat2 = sRequestedAppLocales;
                    sStoredAppLocales = localeListCompat2;
                    AppLocalesStorageHelper.persistLocales(context, localeListCompat2.toLanguageTags());
                }
            }
        }
    }

    static /* synthetic */ void lambda$syncRequestedAndStoredLocales$1(Context context) throws Throwable {
        syncLocalesToFramework(context);
        sIsFrameworkSyncChecked = true;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z2) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z2);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    static void addActiveDelegate(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
            sActivityDelegates.add(new WeakReference<>(appCompatDelegate));
        }
    }

    static void removeActivityDelegate(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
        }
    }

    static void syncLocalesToFramework(Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, Qg.kd("_k`mib\\o$VdcU`]_Oa\u001aLZY\u0016(VU0REBLDQ*AO;=9K7\u001dC?66B\"3?B4-.", (short) (ZN.Xd() ^ 2774), (short) (ZN.Xd() ^ 1772)));
            short sXd = (short) (C1499aX.Xd() ^ (-19289));
            short sXd2 = (short) (C1499aX.Xd() ^ (-15665));
            int[] iArr = new int["dpernga*^igl\\di\"6a_dTfa".length()];
            QB qb = new QB("dpernga*^igl\\di\"6a_dTfa");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("PM[6FGNCHE,?K=B?K", (short) (C1499aX.Xd() ^ (-5411))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(C1561oA.yd("esjywrn9_llseov1db$GY\\e\\SR;P^RYXV", (short) (C1580rY.Xd() ^ (-20839))));
                Class<?>[] clsArr = {Class.forName(C1561oA.Yd("\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e{)(,,,$.5\u0010$1*", (short) (OY.Xd() ^ 27381)))};
                Object[] objArr2 = {componentName};
                short sXd3 = (short) (ZN.Xd() ^ 18543);
                short sXd4 = (short) (ZN.Xd() ^ 9535);
                int[] iArr2 = new int["nm}Mzy}}}u\u007f\u0007X\u0003vx\u0004}}m\u0001\u0011\u0012\b\u000e\b".length()];
                QB qb2 = new QB("nm}Mzy}}}u\u007f\u0007X\u0003vx\u0004}}m\u0001\u0011\u0012\b\u000e\b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) + sXd4);
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    if (((Integer) method2.invoke(packageManager, objArr2)).intValue() != 1) {
                        if (getApplicationLocales().isEmpty()) {
                            String locales = AppLocalesStorageHelper.readLocales(context);
                            String strWd = Jg.Wd("\fl?\u001d\u0013i", (short) (C1633zX.Xd() ^ (-16212)), (short) (C1633zX.Xd() ^ (-21877)));
                            Class<?> cls2 = Class.forName(ZO.xd("{l=B\\ofoU*S\f\u001e\f\u00165\u0014\fe0)\"&", (short) (Od.Xd() ^ (-3172)), (short) (Od.Xd() ^ (-20532))));
                            Class<?>[] clsArr2 = new Class[1];
                            short sXd5 = (short) (C1607wl.Xd() ^ 11605);
                            short sXd6 = (short) (C1607wl.Xd() ^ 17226);
                            int[] iArr3 = new int["PE_6Axe\u000fg\u000bbO.z.3".length()];
                            QB qb3 = new QB("PE_6Axe\u000fg\u000bbO.z.3");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
                                i4++;
                            }
                            clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
                            Object[] objArr3 = {strWd};
                            Method method3 = cls2.getMethod(Ig.wd("\tPos\u0019V9wU@N\u007fQDLq", (short) (ZN.Xd() ^ 21691)), clsArr2);
                            try {
                                method3.setAccessible(true);
                                Object objInvoke = method3.invoke(context, objArr3);
                                if (objInvoke != null) {
                                    Api33Impl.localeManagerSetApplicationLocales(objInvoke, Api24Impl.localeListForLanguageTags(locales));
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                        short sXd7 = (short) (Od.Xd() ^ (-23769));
                        int[] iArr4 = new int["\u001ee\n4x7\",8DEi%$>\u0012S\nA\u0014;r\u0015".length()];
                        QB qb4 = new QB("\u001ee\n4x7\",8DEi%$>\u0012S\nA\u0014;r\u0015");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + i5)) + xuXd4.CK(iKK4));
                            i5++;
                        }
                        Class<?> cls3 = Class.forName(new String(iArr4, 0, i5));
                        Class<?>[] clsArr3 = new Class[0];
                        Object[] objArr4 = new Object[0];
                        short sXd8 = (short) (C1499aX.Xd() ^ (-15951));
                        int[] iArr5 = new int["41?\u001a*+2',)\u0010#/!&#/".length()];
                        QB qb5 = new QB("41?\u001a*+2',)\u0010#/!&#/");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(sXd8 + sXd8 + sXd8 + i6 + xuXd5.CK(iKK5));
                            i6++;
                        }
                        Method method4 = cls3.getMethod(new String(iArr5, 0, i6), clsArr3);
                        try {
                            method4.setAccessible(true);
                            PackageManager packageManager2 = (PackageManager) method4.invoke(context, objArr4);
                            Class<?> cls4 = Class.forName(C1593ug.zd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o31r\u0016(+4+21\u001a/=187E", (short) (ZN.Xd() ^ 1525), (short) (ZN.Xd() ^ 29905)));
                            Class<?>[] clsArr4 = new Class[3];
                            short sXd9 = (short) (C1607wl.Xd() ^ 19970);
                            int[] iArr6 = new int["7C8EA:4|1<:?/7<t\t4131/%-2\u000b\u001d(\u001f".length()];
                            QB qb6 = new QB("7C8EA:4|1<:?/7<t\t4131/%-2\u000b\u001d(\u001f");
                            int i7 = 0;
                            while (qb6.YK()) {
                                int iKK6 = qb6.KK();
                                Xu xuXd6 = Xu.Xd(iKK6);
                                iArr6[i7] = xuXd6.fK(sXd9 + sXd9 + i7 + xuXd6.CK(iKK6));
                                i7++;
                            }
                            clsArr4[0] = Class.forName(new String(iArr6, 0, i7));
                            clsArr4[1] = Integer.TYPE;
                            clsArr4[2] = Integer.TYPE;
                            Object[] objArr5 = {componentName, 1, 1};
                            Method method5 = cls4.getMethod(C1561oA.Kd("\u000b}\u000e]\u000b\n\u000e\u000e\u000e\u0006\u0010\u0017h\u0013\u0007\t\u0014\u000e\u000e}\u0011!\"\u0018\u001e\u0018", (short) (Od.Xd() ^ (-3153))), clsArr4);
                            try {
                                method5.setAccessible(true);
                                method5.invoke(packageManager2, objArr5);
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        }
    }

    private static void removeDelegateFromActives(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    private static void applyDayNightToActiveDelegates() {
        synchronized (sActivityDelegatesLock) {
            Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.applyDayNight();
                }
            }
        }
    }

    private static void applyLocalesToActiveDelegates() {
        Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null) {
                appCompatDelegate.applyAppLocales();
            }
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static LocaleList localeListForLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static void localeManagerSetApplicationLocales(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }

        static LocaleList localeManagerGetApplicationLocales(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }
}
