package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.drew.metadata.mov.media.QuickTimeMediaDirectory;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
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

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseApp {
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final String LOG_TAG = "FirebaseApp";
    private final Context applicationContext;
    private final ComponentRuntime componentRuntime;
    private final Lazy<DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final Provider<DefaultHeartBeatController> defaultHeartBeatController;
    private final String name;
    private final FirebaseOptions options;
    private static final Object LOCK = new Object();
    static final Map<String, FirebaseApp> INSTANCES = new ArrayMap();
    private final AtomicBoolean automaticResourceManagementEnabled = new AtomicBoolean(false);
    private final AtomicBoolean deleted = new AtomicBoolean();
    private final List<BackgroundStateChangeListener> backgroundStateChangeListeners = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> lifecycleListeners = new CopyOnWriteArrayList();

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z2);
    }

    private static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<GlobalBackgroundStateListener> INSTANCE = new AtomicReference<>();

        private GlobalBackgroundStateListener() {
        }

        public static void ensureBackgroundStateListenerRegistered(Context context) throws Throwable {
            if (PlatformVersion.isAtLeastIceCreamSandwich()) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Yd("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f", (short) (C1580rY.Xd() ^ (-20353)))).getMethod(Xg.qd("\n\t\u0019f\u0017\u0018\u0015\u0013\u000e\r!\u0017\u001e\u001es!!(\u001a.+", (short) (C1580rY.Xd() ^ (-20214)), (short) (C1580rY.Xd() ^ (-15537))), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (((Context) method.invoke(context, objArr)) instanceof Application) {
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(Jg.Wd("\fC>HK:H_Gpl\u000fEy=B+t(s)\b\b", (short) (OY.Xd() ^ 8893), (short) (OY.Xd() ^ 28294))).getMethod(ZO.xd("\u0019\u000b\u0007*\bqaG1/\u0002RK5TN:$/@v", (short) (C1607wl.Xd() ^ 11371), (short) (C1607wl.Xd() ^ 10640)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            Application application = (Application) ((Context) method2.invoke(context, objArr2));
                            if (INSTANCE.get() == null) {
                                GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(INSTANCE, null, globalBackgroundStateListener)) {
                                    BackgroundDetector.initialize(application);
                                    BackgroundDetector.getInstance().addListener(globalBackgroundStateListener);
                                }
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z2) {
            synchronized (FirebaseApp.LOCK) {
                for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.INSTANCES.values())) {
                    if (firebaseApp.automaticResourceManagementEnabled.get()) {
                        firebaseApp.notifyBackgroundStateChangeListeners(z2);
                    }
                }
            }
        }
    }

    private static class UserUnlockReceiver extends BroadcastReceiver {
        private static AtomicReference<UserUnlockReceiver> INSTANCE = new AtomicReference<>();
        private final Context applicationContext;

        public UserUnlockReceiver(Context context) {
            this.applicationContext = context;
        }

        public static void ensureReceiverRegistered(Context context) throws Throwable {
            if (INSTANCE.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(INSTANCE, null, userUnlockReceiver)) {
                    IntentFilter intentFilter = new IntentFilter(C1626yg.Ud("t\u000b\u001a#\u000bo\u000b\u001fY^\"WKR\u0017\\\u000f\\V>olj\u001fpLS\u0006Ytwo0{^", (short) (ZN.Xd() ^ 7168), (short) (ZN.Xd() ^ 25625)));
                    short sXd = (short) (C1633zX.Xd() ^ (-9374));
                    int[] iArr = new int["\rr6!\u00062E/5\u0006\u0007j,;!E!;\u0013|.\u000e[".length()];
                    QB qb = new QB("\rr6!\u00062E/5\u0006\u0007j,;!E!;\u0013|.\u000e[");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                        i2++;
                    }
                    Object[] objArr = {userUnlockReceiver, intentFilter};
                    Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("eY\\_jl^lMa`chvft", (short) (Od.Xd() ^ (-19774)), (short) (Od.Xd() ^ (-23432))), Class.forName(EO.Od("{0Z\n\u0012Y\"eF\u007f~%EJV/x-SO\u000e6\u0005\u001dx\u001c\u0014b(!\fYP", (short) (OY.Xd() ^ 26365))), Class.forName(C1561oA.Qd("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fD^\u0003\bw\u007f\u0005Uwy\u0001p|", (short) (OY.Xd() ^ QuickTimeMediaDirectory.TAG_DURATION))));
                    try {
                        method.setAccessible(true);
                        method.invoke(context, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            synchronized (FirebaseApp.LOCK) {
                Iterator<FirebaseApp> it = FirebaseApp.INSTANCES.values().iterator();
                while (it.hasNext()) {
                    it.next().initializeAllApis();
                }
            }
            unregister();
        }

        public void unregister() throws Throwable {
            Context context = this.applicationContext;
            Class<?> cls = Class.forName(C1561oA.od("\u0012\u001e\u0013 \u001c\u0015\u000fW\f\u0017\u0015\u001a\n\u0012\u0017Oc\u000f\r\u0012\u0002\u0014\u000f", (short) (C1580rY.Xd() ^ (-15255))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (-9591));
            int[] iArr = new int["We\\kid`+annugqx3Hywjnnm\u0001\u0003autw|\u000bz\t".length()];
            QB qb = new QB("We\\kid`+annugqx3Hywjnnm\u0001\u0003autw|\u000bz\t");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {this};
            short sXd2 = (short) (C1499aX.Xd() ^ (-6897));
            short sXd3 = (short) (C1499aX.Xd() ^ (-32207));
            int[] iArr2 = new int["\u0015`\b\u0016#<i\u0006\u00022)\u000f Ed\u0001\u000b3".length()];
            QB qb2 = new QB("\u0015`\b\u0016#<i\u0006\u00022)\u000f Ed\u0001\u000b3");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    protected FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        this.applicationContext = (Context) Preconditions.checkNotNull(context);
        this.name = Preconditions.checkNotEmpty(str);
        this.options = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> listDiscoverLazy = ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime.Builder processor = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(Component.of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(this, (Class<FirebaseApp>) FirebaseApp.class, (Class<? super FirebaseApp>[]) new Class[0])).addComponent(Component.of(firebaseOptions, (Class<FirebaseOptions>) FirebaseOptions.class, (Class<? super FirebaseOptions>[]) new Class[0])).setProcessor(new ComponentMonitor());
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(Component.of(startupTime, (Class<StartupTime>) StartupTime.class, (Class<? super StartupTime>[]) new Class[0]));
        }
        ComponentRuntime componentRuntimeBuild = processor.build();
        this.componentRuntime = componentRuntimeBuild;
        FirebaseTrace.popTrace();
        this.dataCollectionConfigStorage = new Lazy<>(new Provider() { // from class: com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return this.f$0.m7707lambda$new$0$comgooglefirebaseFirebaseApp(context);
            }
        });
        this.defaultHeartBeatController = componentRuntimeBuild.getProvider(DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new BackgroundStateChangeListener() { // from class: com.google.firebase.FirebaseApp$$ExternalSyntheticLambda1
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z2) {
                this.f$0.m7708lambda$new$1$comgooglefirebaseFirebaseApp(z2);
            }
        });
        FirebaseTrace.popTrace();
    }

    private void checkNotDeleted() {
        Preconditions.checkState(!this.deleted.get(), "FirebaseApp was deleted");
    }

    public static void clearInstancesForTest() {
        synchronized (LOCK) {
            INSTANCES.clear();
        }
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            Iterator<FirebaseApp> it = INSTANCES.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<FirebaseApp> getApps(Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(DEFAULT_APP_NAME);
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
        }
        return firebaseApp;
    }

    public static FirebaseApp getInstance(String str) {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(normalize(str));
            if (firebaseApp == null) {
                List<String> allAppNames = getAllAppNames();
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, allAppNames.isEmpty() ? "" : "Available app names: " + TextUtils.join(", ", allAppNames)));
            }
            firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
        }
        return firebaseApp;
    }

    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public void initializeAllApis() throws Throwable {
        if (!UserManagerCompat.isUserUnlocked(this.applicationContext)) {
            String str = "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + getName();
            UserUnlockReceiver.ensureReceiverRegistered(this.applicationContext);
        } else {
            String str2 = "Device unlocked: initializing all Firebase APIs for app " + getName();
            this.componentRuntime.initializeEagerComponents(isDefaultApp());
            this.defaultHeartBeatController.get().registerHeartBeat();
        }
    }

    public static FirebaseApp initializeApp(Context context) {
        synchronized (LOCK) {
            if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                return getInstance();
            }
            FirebaseOptions firebaseOptionsFromResource = FirebaseOptions.fromResource(context);
            if (firebaseOptionsFromResource == null) {
                return null;
            }
            return initializeApp(context, firebaseOptionsFromResource);
        }
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        short sXd = (short) (C1633zX.Xd() ^ (-24875));
        int[] iArr = new int["n\u0013\u001d\u0011\u000f\u000f\"\u0015q\"#S#\u0017$\u001dX".length()];
        QB qb = new QB("n\u0013\u001d\u0011\u000f\u000f\"\u0015q\"#S#\u0017$\u001dX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        GlobalBackgroundStateListener.ensureBackgroundStateListenerRegistered(context);
        String strNormalize = normalize(str);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("IUN[[TR\u001bCNPUIQZ\u0013;fhmasr", (short) (OY.Xd() ^ 2558))).getMethod(Qg.kd("khvBpojf_\\nbge9dbgWid", (short) (C1607wl.Xd() ^ 1574), (short) (C1607wl.Xd() ^ 26991)), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Context) method.invoke(context, objArr)) != null) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(hg.Vd("XdYfb[U\u001eR][`PX]\u0016*USXHZU", (short) (C1499aX.Xd() ^ (-14289)), (short) (C1499aX.Xd() ^ (-30961)))).getMethod(C1561oA.ud("1.<\b650,%\"4(-+~*(-\u001d/*", (short) (C1633zX.Xd() ^ (-24459))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    context = (Context) method2.invoke(context, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            synchronized (LOCK) {
                Map<String, FirebaseApp> map = INSTANCES;
                boolean z2 = !map.containsKey(strNormalize);
                StringBuilder sbAppend = new StringBuilder(str2).append(strNormalize);
                short sXd2 = (short) (C1633zX.Xd() ^ (-7782));
                int[] iArr2 = new int["g(6;1,2Fo4J:GGIu".length()];
                QB qb2 = new QB("g(6;1,2Fo4J:GGIu");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                    i3++;
                }
                Preconditions.checkState(z2, sbAppend.append(new String(iArr2, 0, i3)).toString());
                Preconditions.checkNotNull(context, C1561oA.Yd("\r=>;943G=DDv;HHOAUR~CBPQSY\u0006IM\tX`XY\u001c", (short) (Od.Xd() ^ (-29937))));
                firebaseApp = new FirebaseApp(context, strNormalize, firebaseOptions);
                map.put(strNormalize, firebaseApp);
            }
            firebaseApp.initializeAllApis();
            return firebaseApp;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static String normalize(String str) {
        return str.trim();
    }

    public void notifyBackgroundStateChangeListeners(boolean z2) {
        Iterator<BackgroundStateChangeListener> it = this.backgroundStateChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z2);
        }
    }

    private void notifyOnAppDeleted() {
        Iterator<FirebaseAppLifecycleListener> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onDeleted(this.name, this.options);
        }
    }

    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.backgroundStateChangeListeners.add(backgroundStateChangeListener);
    }

    public void addLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.add(firebaseAppLifecycleListener);
    }

    public void delete() {
        if (this.deleted.compareAndSet(false, true)) {
            synchronized (LOCK) {
                INSTANCES.remove(this.name);
            }
            notifyOnAppDeleted();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.name.equals(((FirebaseApp) obj).getName());
        }
        return false;
    }

    public <T> T get(Class<T> cls) {
        checkNotDeleted();
        return (T) this.componentRuntime.get(cls);
    }

    public Context getApplicationContext() {
        checkNotDeleted();
        return this.applicationContext;
    }

    public String getName() {
        checkNotDeleted();
        return this.name;
    }

    public FirebaseOptions getOptions() {
        checkNotDeleted();
        return this.options;
    }

    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    void initializeAllComponents() {
        this.componentRuntime.initializeAllComponentsForTests();
    }

    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.dataCollectionConfigStorage.get().isEnabled();
    }

    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-firebase-FirebaseApp */
    /* synthetic */ DataCollectionConfigStorage m7707lambda$new$0$comgooglefirebaseFirebaseApp(Context context) {
        return new DataCollectionConfigStorage(context, getPersistenceKey(), (Publisher) this.componentRuntime.get(Publisher.class));
    }

    /* JADX INFO: renamed from: lambda$new$1$com-google-firebase-FirebaseApp */
    /* synthetic */ void m7708lambda$new$1$comgooglefirebaseFirebaseApp(boolean z2) {
        if (z2) {
            return;
        }
        this.defaultHeartBeatController.get().registerHeartBeat();
    }

    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        this.backgroundStateChangeListeners.remove(backgroundStateChangeListener);
    }

    public void removeLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean z2) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.compareAndSet(!z2, z2)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z2 && zIsInBackground) {
                notifyBackgroundStateChangeListeners(true);
            } else {
                if (z2 || !zIsInBackground) {
                    return;
                }
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    public void setDataCollectionDefaultEnabled(Boolean bool) {
        checkNotDeleted();
        this.dataCollectionConfigStorage.get().setEnabled(bool);
    }

    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z2) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z2));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.name).add(RRWebOptionsEvent.EVENT_TAG, this.options).toString();
    }
}
