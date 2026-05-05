package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
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

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static Store store = null;
    static ScheduledExecutorService syncExecutor = null;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final GmsRpc gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Task<TopicsSubscriber> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    static Provider<TransportFactory> transportFactory = new Provider() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda8
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return FirebaseMessaging.lambda$static$0();
        }
    };

    class AutoInit {
        private static final String AUTO_INIT_PREF = "auto_init";
        private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
        private static final String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_messaging_auto_init_enabled";
        private Boolean autoInitEnabled;
        private EventHandler<DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;
        private boolean initialized;
        private final Subscriber subscriber;

        AutoInit(Subscriber subscriber) {
            this.subscriber = subscriber;
        }

        private Boolean readEnabled() throws Throwable {
            String strYd = C1561oA.Yd("CGQECCVIDSL[\\KRU[UNQffbS^d`lX_i]_jdd", (short) (C1607wl.Xd() ^ 14895));
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            Object[] objArr = {Xg.qd("\u001d*)j%./(.(q+/9-++>1z;4CD3:=C=", (short) (ZN.Xd() ^ 28426), (short) (ZN.Xd() ^ 23917)), 0};
            Method method = Class.forName(Jg.Wd("\u001bXTVusdRJJ/%\\\u000b\u0005@y\u001c\u001bWl\u0006q", (short) (C1580rY.Xd() ^ (-25674)), (short) (C1580rY.Xd() ^ (-20444)))).getMethod(C1626yg.Ud("&\u0007h(:Xx\nQy\u0003\\\u0015!\u0015h\u0010{Z\u0018", (short) (C1633zX.Xd() ^ (-3648)), (short) (C1633zX.Xd() ^ (-8012))), Class.forName(ZO.xd("![6\u0005]_TB\u0016fb`?\"I\u0002", (short) (OY.Xd() ^ 28175), (short) (OY.Xd() ^ 16527))), Integer.TYPE);
            try {
                method.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(applicationContext, objArr);
                String strWd = Ig.wd("E\u000e|V;hO0p", (short) (C1633zX.Xd() ^ (-28688)));
                if (sharedPreferences.contains(strWd)) {
                    return Boolean.valueOf(sharedPreferences.getBoolean(strWd, false));
                }
                try {
                    Class<?> cls = Class.forName(EO.Od("-o\n5l\u001ch,\u0005RIs\u0014!5\u0016`-FBug7", (short) (Od.Xd() ^ (-27198))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd = (short) (Od.Xd() ^ (-6010));
                    int[] iArr = new int["{x\u0007aqrynspWjvhmjv".length()];
                    QB qb = new QB("{x\u0007aqrynspWjvhmjv");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method2.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method2.invoke(applicationContext, objArr2);
                        if (packageManager == null) {
                            return null;
                        }
                        Object[] objArr3 = new Object[0];
                        Method method3 = Class.forName(C1593ug.zd("\u001c*!0.)%o&33:,6=w\u000e;;B4HE", (short) (C1580rY.Xd() ^ (-11767)), (short) (C1580rY.Xd() ^ (-8430)))).getMethod(C1561oA.od("\u0002~\rgwx\u007ftyv^p{r", (short) (FB.Xd() ^ 17060)), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            String str = (String) method3.invoke(applicationContext, objArr3);
                            Class<?> cls2 = Class.forName(C1561oA.Kd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Z\u001e\u001c]\u0001\u0013\u0016\u001f\u0016\u001d\u001c\u0005\u001a(\u001c#\"0", (short) (C1633zX.Xd() ^ (-5209))));
                            Class<?>[] clsArr2 = new Class[2];
                            clsArr2[0] = Class.forName(Wg.Zd("-s<::,\u0011Q}W0!q\u001cT`", (short) (C1607wl.Xd() ^ 1237), (short) (C1607wl.Xd() ^ 4375)));
                            clsArr2[1] = Integer.TYPE;
                            Object[] objArr4 = {str, 128};
                            Method method4 = cls2.getMethod(C1561oA.Xd("SRb0`a^\\WVj`ggCibl", (short) (C1499aX.Xd() ^ (-19463))), clsArr2);
                            try {
                                method4.setAccessible(true);
                                ApplicationInfo applicationInfo = (ApplicationInfo) method4.invoke(packageManager, objArr4);
                                if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(strYd)) {
                                    return null;
                                }
                                return Boolean.valueOf(applicationInfo.metaData.getBoolean(strYd));
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }

        synchronized void initialize() {
            if (this.initialized) {
                return;
            }
            Boolean enabled = readEnabled();
            this.autoInitEnabled = enabled;
            if (enabled == null) {
                EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler() { // from class: com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0
                    @Override // com.google.firebase.events.EventHandler
                    public final void handle(Event event) {
                        this.f$0.m7769x1061f0b8(event);
                    }
                };
                this.dataCollectionDefaultChangeEventHandler = eventHandler;
                this.subscriber.subscribe(DataCollectionDefaultChange.class, eventHandler);
            }
            this.initialized = true;
        }

        synchronized boolean isEnabled() {
            Boolean bool;
            initialize();
            bool = this.autoInitEnabled;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
        }

        /* JADX INFO: renamed from: lambda$initialize$0$com-google-firebase-messaging-FirebaseMessaging$AutoInit */
        /* synthetic */ void m7769x1061f0b8(Event event) {
            if (isEnabled()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        synchronized void setEnabled(boolean z2) {
            initialize();
            EventHandler<DataCollectionDefaultChange> eventHandler = this.dataCollectionDefaultChangeEventHandler;
            if (eventHandler != null) {
                this.subscriber.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                this.dataCollectionDefaultChangeEventHandler = null;
            }
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            Object[] objArr = {Wg.vd("MZU\u0017MVSLNH\u000eGGQA?;N=\u0007C<GH3:9?5", (short) (Od.Xd() ^ (-4620))), 0};
            Method method = Class.forName(Qg.kd("kwlyunh1epnsckp)=hfk[mh", (short) (Od.Xd() ^ (-18739)), (short) (Od.Xd() ^ (-17213)))).getMethod(C1561oA.ud("85C!5-=/-\u00189++)5'/#$1", (short) (C1607wl.Xd() ^ 24604)), Class.forName(hg.Vd("\u001a\u0010$\u000eY\u0017\u000b\u0017\u000fTx\u0019\u0016\f\u0010\b", (short) (C1580rY.Xd() ^ (-13606)), (short) (C1580rY.Xd() ^ (-26616)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(applicationContext, objArr)).edit();
                editorEdit.putBoolean(C1561oA.yd("?RTN9BJDZ", (short) (OY.Xd() ^ 19261)), z2);
                editorEdit.apply();
                if (z2) {
                    FirebaseMessaging.this.startSyncIfNecessary();
                }
                this.autoInitEnabled = Boolean.valueOf(z2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<TransportFactory> provider, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) throws Throwable {
        this.syncScheduledOrRunning = false;
        transportFactory = provider;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            Application application = (Application) applicationContext2;
            Class<?> cls = Class.forName(C1561oA.Yd("\u0016$\u001b*(#\u001fi\u001e./m\u0002230.)(<299", (short) (ZN.Xd() ^ 32175)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1633zX.Xd() ^ (-23528));
            short sXd2 = (short) (C1633zX.Xd() ^ (-17200));
            int[] iArr = new int["KYP_]XT\u001fScd#7ghec^]qgnn%Cfxn|p|\u0003Vtrrq\ts}wVu\u0002\u0003yy|\u0006\u000f".length()];
            QB qb = new QB("KYP_]XT\u001fScd#7ghec^]qgnn%Cfxn|p|\u0003Vtrrq\ts}wVu\u0002\u0003yy|\u0006\u000f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {fcmLifecycleCallbacks};
            short sXd3 = (short) (OY.Xd() ^ 10773);
            short sXd4 = (short) (OY.Xd() ^ 23022);
            int[] iArr2 = new int["6J\\\u007f,NO}n2Si\u0019-Hnc!/Po&!Lfd\u0014Abx\t-U~".length()];
            QB qb2 = new QB("6J\\\u007f,NO}n2Si\u0019-Hnc!/Po&!Lfd\u0014Abx\t-U~");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(application, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            String str = ZO.xd(";W\tU.MW\u0004", (short) (C1633zX.Xd() ^ (-29693)), (short) (C1633zX.Xd() ^ (-18675))) + applicationContext2 + C1626yg.Ud("It:\f\u0016\u0017$\u0007)Nd\u0017j[\u001b@{D7}\n>\u0006\u0005,l\bW;ok\nisn\u001fF\u007f=wtA. \u001b)\u0015pu\u0019\u0007B\u000fS$4H\t\u0012\u0014b\u0004z\fDH~i6\u001c ('g8qlyHz\u001a@g$nJK4|$P'-'B\u000bng\tXV'H's8xO+~\u0014\boM-4D", (short) (ZN.Xd() ^ 16730), (short) (ZN.Xd() ^ 2944));
            Ig.wd("n\\w\u000f{-\u000f\u0002\u000eZf\t#;\u0019D\u0014", (short) (C1633zX.Xd() ^ (-30392)));
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda3
                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                public final void onNewToken(String str2) {
                    this.f$0.m7764lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(str2);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7765lambda$new$2$comgooglefirebasemessagingFirebaseMessaging();
            }
        });
        Task<TopicsSubscriber> taskCreateInstance = TopicsSubscriber.createInstance(this, metadata, gmsRpc, applicationContext, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = taskCreateInstance;
        taskCreateInstance.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.m7766lambda$new$3$comgooglefirebasemessagingFirebaseMessaging((TopicsSubscriber) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7767lambda$new$4$comgooglefirebasemessagingFirebaseMessaging();
            }
        });
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider3, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new Metadata(firebaseApp.getApplicationContext()));
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider3, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), FcmExecutors.newTaskExecutor(), FcmExecutors.newInitExecutor(), FcmExecutors.newFileIOExecutor());
    }

    static synchronized void clearStoreForTest() {
        store = null;
    }

    static void clearTransportFactoryForTest() {
        transportFactory = new Provider() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda7
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
            }
        };
    }

    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    private static synchronized Store getStore(Context context) {
        if (store == null) {
            store = new Store(context);
        }
        return store;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    public static TransportFactory getTransportFactory() {
        return transportFactory.get();
    }

    private void handleProxiedNotificationData() {
        this.gmsRpc.getProxyNotificationData().addOnSuccessListener(this.initExecutor, new OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda12
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.m7763x8ede5a30((CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: renamed from: initializeProxyNotifications */
    public void m7767lambda$new$4$comgooglefirebasemessagingFirebaseMessaging() {
        ProxyNotificationInitializer.initialize(this.context);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: renamed from: invokeOnTokenRefresh */
    public void m7764lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String str2 = "Invoking onNewToken for app: " + this.firebaseApp.getName();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    static /* synthetic */ TransportFactory lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    static /* synthetic */ TransportFactory lambda$static$0() {
        return null;
    }

    private boolean shouldRetainProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        if (!ProxyNotificationInitializer.isProxyNotificationEnabled(this.context)) {
            return false;
        }
        if (this.firebaseApp.get(AnalyticsConnector.class) != null) {
            return true;
        }
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    public void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    String blockingGetToken() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.await(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
        final Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.token;
        }
        final String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
        try {
            return (String) Tasks.await(this.requestDeduplicator.getOrStartGetTokenRequest(defaultSenderId, new RequestDeduplicator.GetTokenRequest() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda14
                @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
                public final Task start() {
                    return this.f$0.m7759xb7d2b1c4(defaultSenderId, tokenWithoutTriggeringSync);
                }
            }));
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public Task<Void> deleteToken() {
        if (this.iid != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.initExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7760xd5738b77(taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (getTokenWithoutTriggeringSync() == null) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        FcmExecutors.newNetworkIOExecutor().execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7761xd4fd2578(taskCompletionSource2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    void enqueueTaskWithDelaySeconds(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            syncExecutor.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    Context getApplicationContext() {
        return this.context;
    }

    public Task<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.initExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7762x6a533e85(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    Store.Token getTokenWithoutTriggeringSync() {
        return getStore(this.context).getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
    }

    Task<TopicsSubscriber> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public boolean isNotificationDelegationEnabled() {
        return ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
    }

    /* JADX INFO: renamed from: lambda$blockingGetToken$13$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ Task m7758xb84917c3(String str, Store.Token token, String str2) throws Exception {
        getStore(this.context).saveToken(getSubtype(), str, str2, this.metadata.getAppVersionCode());
        if (token == null || !str2.equals(token.token)) {
            m7764lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(str2);
        }
        return Tasks.forResult(str2);
    }

    /* JADX INFO: renamed from: lambda$blockingGetToken$14$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ Task m7759xb7d2b1c4(final String str, final Store.Token token) {
        return this.gmsRpc.getToken().onSuccessTask(this.fileExecutor, new SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f$0.m7758xb84917c3(str, token, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$deleteToken$8$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ void m7760xd5738b77(TaskCompletionSource taskCompletionSource) {
        try {
            this.iid.deleteToken(Metadata.getDefaultSenderId(this.firebaseApp), INSTANCE_ID_SCOPE);
            taskCompletionSource.setResult(null);
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    /* JADX INFO: renamed from: lambda$deleteToken$9$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ void m7761xd4fd2578(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.gmsRpc.deleteToken());
            getStore(this.context).deleteToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
            taskCompletionSource.setResult(null);
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    /* JADX INFO: renamed from: lambda$getToken$7$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ void m7762x6a533e85(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingGetToken());
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    /* JADX INFO: renamed from: lambda$handleProxiedNotificationData$5$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ void m7763x8ede5a30(CloudMessage cloudMessage) {
        if (cloudMessage != null) {
            MessagingAnalytics.logNotificationReceived(cloudMessage.getIntent());
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: renamed from: lambda$new$2$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ void m7765lambda$new$2$comgooglefirebasemessagingFirebaseMessaging() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* JADX INFO: renamed from: lambda$new$3$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ void m7766lambda$new$3$comgooglefirebasemessagingFirebaseMessaging(TopicsSubscriber topicsSubscriber) {
        if (isAutoInitEnabled()) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    /* JADX INFO: renamed from: lambda$setNotificationDelegationEnabled$6$com-google-firebase-messaging-FirebaseMessaging */
    /* synthetic */ void m7768x6495830d(Void r4) {
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    @Deprecated
    public void send(RemoteMessage remoteMessage) throws Throwable {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            throw new IllegalArgumentException(hg.Vd("Nirqfjb\u001a lf\u001d", (short) (C1633zX.Xd() ^ (-8577)), (short) (C1633zX.Xd() ^ (-18903))));
        }
        Intent intent = new Intent(EO.Od("G{k\u0011A&FF&_&;\u0017\u0017\u001dx\u0017\u0018\u001a V\t+jZ8\fE1=r\u0003$@", (short) (Od.Xd() ^ (-32204))));
        Intent intent2 = new Intent();
        short sXd = (short) (ZN.Xd() ^ 1361);
        int[] iArr = new int["\u0018# _\u0018\u001f\u001e\u0015\u0019\u0011X\u000f!\t\u0014\u0016\u0011\tP\u000b\u000f\u0016\u007f\n\u0006\u007f\u000bz{\u0003w|y".length()];
        QB qb = new QB("\u0018# _\u0018\u001f\u001e\u0015\u0019\u0011X\u000f!\t\u0014\u0016\u0011\tP\u000b\u000f\u0016\u007f\n\u0006\u007f\u000bz{\u0003w|y");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        intent2.setPackage(new String(iArr, 0, i2));
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, 0, intent2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        short sXd2 = (short) (C1607wl.Xd() ^ 5354);
        short sXd3 = (short) (C1607wl.Xd() ^ 15709);
        int[] iArr2 = new int["\u0005\u0015\u0016".length()];
        QB qb2 = new QB("\u0005\u0015\u0016");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        intent.putExtra(new String(iArr2, 0, i3), broadcast);
        intent.setPackage(C1561oA.od("LWT\u0014LSRIME\r?K@MIB<\u0005=BG", (short) (C1633zX.Xd() ^ (-22885))));
        remoteMessage.populateSendMessageIntent(intent);
        Context context = this.context;
        Object[] objArr = {intent, C1561oA.Kd("gts5oxyrxr<p~u\u0005\u0003}yD~\rz\u0007\u0007\u0010\u0003\u0011\u0016\n\u0005\bQ\u0015\u000b\u0019\u0015\u0012\u001d\u001e\u0015\u001c\u001c\\v\u0005r~~\u0014\t{\n\u000f\u0003}\u0001", (short) (C1607wl.Xd() ^ 1548))};
        Method method = Class.forName(Wg.Zd("\u007f:^\u001cGn\u001a\u0011r,Y\u000f.f\u001b\u0002C\u001dL\u007f\u001fa\f", (short) (Od.Xd() ^ (-1068)), (short) (Od.Xd() ^ (-31641)))).getMethod(Qg.kd("\u0011\u0002\n~h\u000b{{\bywT\u0004\u007fprpm~~", (short) (ZN.Xd() ^ 16474), (short) (ZN.Xd() ^ 1701)), Class.forName(C1561oA.Xd(":H?NLGC\u000eDQQXJT[\u00162X_Q[b", (short) (C1607wl.Xd() ^ 26629))), Class.forName(Wg.vd(";3E1\u0003B4B@\b*LOGIC", (short) (FB.Xd() ^ 5902))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setAutoInitEnabled(boolean z2) {
        this.autoInit.setEnabled(z2);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z2) throws Throwable {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z2);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    public Task<Void> setNotificationDelegationEnabled(boolean z2) {
        return ProxyNotificationInitializer.setEnableProxyNotification(this.initExecutor, this.context, z2).addOnSuccessListener(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), new OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.m7768x6495830d((Void) obj);
            }
        });
    }

    synchronized void setSyncScheduledOrRunning(boolean z2) {
        this.syncScheduledOrRunning = z2;
    }

    public Task<Void> subscribeToTopic(final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return ((TopicsSubscriber) obj).subscribeToTopic(str);
            }
        });
    }

    synchronized void syncWithDelaySecondsInternal(long j2) {
        enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j2), MAX_DELAY_SEC)), j2);
        this.syncScheduledOrRunning = true;
    }

    boolean tokenNeedsRefresh(Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    public Task<Void> unsubscribeFromTopic(final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda13
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return ((TopicsSubscriber) obj).unsubscribeFromTopic(str);
            }
        });
    }
}
