package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ExecutorService;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";
    final CrashlyticsCore core;

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Deferred<CrashlyticsNativeComponent> deferred, Deferred<AnalyticsConnector> deferred2, Deferred<FirebaseRemoteConfigInterop> deferred3, ExecutorService executorService, ExecutorService executorService2) throws Throwable {
        Context applicationContext = firebaseApp.getApplicationContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("We\\kid`+annugqx3Ivv}o\u0004\u0001", (short) (FB.Xd() ^ 21086), (short) (FB.Xd() ^ 6928))).getMethod(C1561oA.od("`]kFVW^SXU=OZQ", (short) (C1633zX.Xd() ^ (-32038))), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(applicationContext, objArr);
            Logger.getLogger().i(C1561oA.Kd("d\u000b\u0007\u0013\t\u0002\u000e\f\u001e\u000e\u0014\u000eGn\u0013\u001d\u0011\u000f\u000f\"\u0015Pt%\u0015(\u001e#1-#\u001e/\\", (short) (ZN.Xd() ^ 29380)) + CrashlyticsCore.getVersion() + Wg.Zd("k\t\bb\u000b", (short) (ZN.Xd() ^ 8581), (short) (ZN.Xd() ^ 10569)) + str);
            CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers(executorService, executorService2);
            FileStore fileStore = new FileStore(applicationContext);
            DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
            IdManager idManager = new IdManager(applicationContext, str, firebaseInstallationsApi, dataCollectionArbiter);
            CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
            AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
            CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
            FirebaseSessionsDependencies.register(crashlyticsAppQualitySessionsSubscriber);
            CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.getDeferredBreadcrumbSource(), analyticsDeferredProxy.getAnalyticsEventLogger(), fileStore, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3), crashlyticsWorkers);
            String applicationId = firebaseApp.getOptions().getApplicationId();
            String mappingFileId = CommonUtils.getMappingFileId(applicationContext);
            List<BuildIdInfo> buildIdInfo = CommonUtils.getBuildIdInfo(applicationContext);
            Logger.getLogger().d(C1561oA.Xd("Rgwxrxr,sw{u1[W4~\nQ8", (short) (C1607wl.Xd() ^ 24368)) + mappingFileId);
            for (BuildIdInfo buildIdInfo2 : buildIdInfo) {
                Logger.getLogger().d(String.format(Wg.vd("\u000fA465o82d*24hl:e,*Z^4y^b(", (short) (OY.Xd() ^ 28172)), buildIdInfo2.getLibraryName(), buildIdInfo2.getArch(), buildIdInfo2.getBuildId()));
            }
            try {
                AppData appDataCreate = AppData.create(applicationContext, idManager, applicationId, mappingFileId, buildIdInfo, new DevelopmentPlatformProvider(applicationContext));
                Logger logger = Logger.getLogger();
                short sXd = (short) (ZN.Xd() ^ 22541);
                short sXd2 = (short) (ZN.Xd() ^ 32624);
                int[] iArr = new int["\u0001%))\u0015\u001f\u001e\u0016\"N\u001e\u000e\u000f\u0016\u000b\u0010\rF\u0014\u0006\u0011\bA\n\u0013X=".length()];
                QB qb = new QB("\u0001%))\u0015\u001f\u001e\u0016\"N\u001e\u000e\u000f\u0016\u000b\u0010\rF\u0014\u0006\u0011\bA\n\u0013X=");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                logger.v(new String(iArr, 0, i2) + appDataCreate.installerPackageName);
                SettingsController settingsControllerCreate = SettingsController.create(applicationContext, applicationId, idManager, new HttpRequestFactory(), appDataCreate.versionCode, appDataCreate.versionName, fileStore, dataCollectionArbiter);
                settingsControllerCreate.loadSettingsData(crashlyticsWorkers).addOnFailureListener(new OnFailureListener() { // from class: com.google.firebase.crashlytics.FirebaseCrashlytics$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        Logger.getLogger().e("Error fetching settings.", exc);
                    }
                });
                if (crashlyticsCore.onPreExecute(appDataCreate, settingsControllerCreate)) {
                    crashlyticsCore.doBackgroundInitializationAsync(settingsControllerCreate);
                }
                return new FirebaseCrashlytics(crashlyticsCore);
            } catch (PackageManager.NameNotFoundException e2) {
                Logger.getLogger().e(hg.Vd("z'&\"$P\"\u0014\"\u001f\u0015\u0010 \u0012\u0016\u000eE\u0006\u0014\u0013A\u0011\u0001\u0002\t}\u0003\u007f9\u0002\u0006|\u0005B", (short) (C1499aX.Xd() ^ (-20601)), (short) (C1499aX.Xd() ^ (-21144))), e2);
                return null;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.core.isCrashlyticsCollectionEnabled();
    }

    public void log(String str) {
        this.core.log(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th);
        }
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCrashlyticsCollectionEnabled(boolean z2) {
        this.core.setCrashlyticsCollectionEnabled(Boolean.valueOf(z2));
    }

    public void setCustomKey(String str, double d2) {
        this.core.setCustomKey(str, Double.toString(d2));
    }

    public void setCustomKey(String str, float f2) {
        this.core.setCustomKey(str, Float.toString(f2));
    }

    public void setCustomKey(String str, int i2) {
        this.core.setCustomKey(str, Integer.toString(i2));
    }

    public void setCustomKey(String str, long j2) {
        this.core.setCustomKey(str, Long.toString(j2));
    }

    public void setCustomKey(String str, String str2) {
        this.core.setCustomKey(str, str2);
    }

    public void setCustomKey(String str, boolean z2) {
        this.core.setCustomKey(str, Boolean.toString(z2));
    }

    public void setCustomKeys(CustomKeysAndValues customKeysAndValues) {
        this.core.setCustomKeys(customKeysAndValues.keysAndValues);
    }

    public void setUserId(String str) {
        this.core.setUserId(str);
    }
}
