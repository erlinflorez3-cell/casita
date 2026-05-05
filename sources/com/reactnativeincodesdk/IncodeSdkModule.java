package com.reactnativeincodesdk;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.incode.welcome_sdk.CommonConfig;
import com.incode.welcome_sdk.FlowConfig;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.SessionConfig;
import com.incode.welcome_sdk.commons.IncodeUXConfig;
import com.incode.welcome_sdk.commons.theme.IncodeThemeConfig;
import com.incode.welcome_sdk.commons.utils.QuantityKeyword;
import com.incode.welcome_sdk.listeners.FaceMatchListener;
import com.incode.welcome_sdk.listeners.FinishOnboardingListener;
import com.incode.welcome_sdk.listeners.GetUserScoreListener;
import com.incode.welcome_sdk.listeners.OnboardingSessionListener;
import com.incode.welcome_sdk.listeners.SelfieScanListener;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import com.incode.welcome_sdk.results.FaceMatchResult;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.results.UserScoreResult;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@ReactModule(name = "\t-!,  \r\u001d#")
public class IncodeSdkModule extends ReactContextBaseJavaModule {
    public static final String CORE_DEFAULT_MODULE_NAME = "incode_core";
    public static final String NAME = "IncodeSdk";
    private final BaseActivityEventListener activityListener;
    private CommonConfig commonConfig;
    private Boolean shouldShowCloseButton;
    SplitInstallStateUpdatedListener splitInstallStateUpdatedListener;

    public IncodeSdkModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.splitInstallStateUpdatedListener = null;
        BaseActivityEventListener baseActivityEventListener = new BaseActivityEventListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule.1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
                super.onActivityResult(activity, i2, i3, intent);
            }

            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
                super.onNewIntent(intent);
            }
        };
        this.activityListener = baseActivityEventListener;
        reactApplicationContext.addActivityEventListener(baseActivityEventListener);
    }

    private static Map<String, String> convertReadableMapToJavaMap(ReadableMap readableMap) {
        HashMap map = new HashMap();
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                map.put(strNextKey, readableMap.getString(strNextKey));
            }
        }
        return map;
    }

    private WritableMap createResponse(boolean z2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean(FirebaseAnalytics.Param.SUCCESS, z2);
        return writableMapCreateMap;
    }

    private String extractIdV2ThemeJson(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String[] strArr = {"colorPalette", "typography"};
            for (int i2 = 0; i2 < 2; i2++) {
                String str2 = strArr[i2];
                if (jSONObject2.has(str2)) {
                    jSONObject.put(str2, jSONObject2.getJSONObject(str2));
                }
            }
            if (jSONObject.length() == 0) {
                return null;
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    private CommonConfig.Builder getCommonConfigBuilder() {
        if (this.commonConfig == null) {
            this.commonConfig = new CommonConfig.Builder().build();
        }
        return CommonConfig.Builder.from(this.commonConfig);
    }

    private String getModuleName(ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey("moduleName") || TextUtils.isEmpty(readableMap.getString("moduleName"))) ? CORE_DEFAULT_MODULE_NAME : readableMap.getString("moduleName");
    }

    private static Map<String, String> getSupportedLanguages() {
        HashMap map = new HashMap();
        map.put("en", "en_US");
        map.put("es", "es_ES");
        map.put("pt", "pt_PT");
        return map;
    }

    private static Map<String, String> getSupportedLanguagesInverse() {
        HashMap map = new HashMap();
        map.put("en_US", "en");
        map.put("es_ES", "es");
        map.put("pt_PT", "pt");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$approve$9(FlowConfig flowConfig, ReactOnboardingListener reactOnboardingListener) throws Exception {
        IncodeWelcome.getInstance().startOnboardingSection(getCurrentActivity(), flowConfig, reactOnboardingListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadOnDemandResources$6(SplitInstallManager splitInstallManager, Promise promise, AtomicInteger atomicInteger, SplitInstallSessionState splitInstallSessionState) {
        if (splitInstallSessionState.status() == 6) {
            splitInstallManager.unregisterListener(this.splitInstallStateUpdatedListener);
            promise.reject("INTERNAL_ERROR", "SplitInstallSessionStatus.FAILED");
            return;
        }
        if (splitInstallSessionState.sessionId() == atomicInteger.get()) {
            int iStatus = splitInstallSessionState.status();
            if (iStatus == 2) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble("progress", splitInstallSessionState.bytesDownloaded() / splitInstallSessionState.totalBytesToDownload());
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RESOURCE_DOWNLOAD_PROGRESS_UPDATED", writableMapCreateMap);
                return;
            }
            if (iStatus != 5) {
                return;
            }
            splitInstallManager.unregisterListener(this.splitInstallStateUpdatedListener);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("status", FirebaseAnalytics.Param.SUCCESS);
            promise.resolve(writableMapCreateMap2);
        }
    }

    static /* synthetic */ void lambda$downloadOnDemandResources$8(Promise promise, Exception exc) {
        String str;
        int errorCode = ((SplitInstallException) exc).getErrorCode();
        String str2 = "INTERNAL_ERROR";
        if (errorCode != -100) {
            switch (errorCode) {
                case -15:
                    str = "APP_NOT_OWNED";
                    break;
                case -14:
                    str = "PLAY_STORE_NOT_FOUND";
                    break;
                case -13:
                    str = "SPLITCOMPAT_COPY_ERROR";
                    break;
                case -12:
                    str = "SPLITCOMPAT_EMULATION_ERROR";
                    break;
                case -11:
                    str = "SPLITCOMPAT_VERIFICATION_ERROR";
                    break;
                case -10:
                    str2 = "INSUFFICIENT_STORAGE";
                    str = str2;
                    break;
                case -9:
                    str = "SERVICE_DIED";
                    break;
                default:
                    switch (errorCode) {
                        case -7:
                            str = "ACCESS_DENIED";
                            break;
                        case -6:
                            str2 = "NETWORK_ERROR";
                            str = str2;
                            break;
                        case -5:
                            str = "API_NOT_AVAILABLE";
                            break;
                        case -4:
                            str = "SESSION_NOT_FOUND";
                            break;
                        case -3:
                            str = "INVALID_REQUEST";
                            break;
                        case -2:
                            str = "MODULE_UNAVAILABLE";
                            break;
                        case -1:
                            str = "ACTIVE_SESSIONS_LIMIT_EXCEEDED";
                            break;
                        default:
                            str = "";
                            break;
                    }
                    break;
            }
        } else {
            str = str2;
        }
        promise.reject(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFaceLogin$10(SessionConfig.Builder builder, SelfieScan.Builder builder2, final Promise promise) {
        IncodeWelcome.getInstance().startFaceLogin(getCurrentActivity(), builder.build(), builder2.build(), new SelfieScanListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule.6
            @Override // com.incode.welcome_sdk.listeners.ErrorListener
            public void onError(Throwable th) {
                promise.reject(th);
            }

            @Override // com.incode.welcome_sdk.listeners.SelfieScanListener
            public void onSelfieScanCompleted(SelfieScanResult selfieScanResult) {
                promise.resolve(TypeHelper.getFaceLoginResultMap(selfieScanResult));
            }

            @Override // com.incode.welcome_sdk.listeners.UserCancelledListener
            public void onUserCancelled() {
                IncodeSdkModule.this.userCancelled(promise, "Incd::UserCancelled");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFlowFromDeepLink$3(String str, ReactOnboardingListener reactOnboardingListener) throws Exception {
        IncodeWelcome.getInstance().startFlowFromDeeplink(getCurrentActivity(), str, reactOnboardingListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOnboarding$0(SessionConfig sessionConfig, FlowConfig flowConfig, ReactOnboardingListener reactOnboardingListener) throws Exception {
        IncodeWelcome.getInstance().startOnboarding(getCurrentActivity(), sessionConfig, flowConfig, reactOnboardingListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOnboardingSection$5(FlowConfig flowConfig, ReactOnboardingListener reactOnboardingListener) throws Exception {
        IncodeWelcome.getInstance().startOnboardingSection(getCurrentActivity(), flowConfig, reactOnboardingListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startWorkflow$4(SessionConfig sessionConfig, ReactOnboardingListener reactOnboardingListener) throws Exception {
        IncodeWelcome.getInstance().startWorkflow(getCurrentActivity(), sessionConfig, reactOnboardingListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rejectBadConfig(Promise promise) {
        promise.reject(IncodeSdkInitError.CONFIG_ERROR.getValue(), "Missing or incomplete apiConfig", new IllegalArgumentException("Missing API configuration"));
    }

    private void setCommonConfig(CommonConfig commonConfig) {
        this.commonConfig = commonConfig;
        IncodeWelcome.getInstance().setCommonConfig(this.commonConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void userCancelled(Promise promise, String str) {
        promise.reject(str, "User cancelled");
    }

    @ReactMethod
    public void approve(ReadableMap readableMap, Promise promise) {
        try {
            final FlowConfig flowConfigBuild = new FlowConfig.Builder().addApproval(false, false, readableMap.hasKey("forceApproval") ? readableMap.getBoolean("forceApproval") : false).build();
            final ReactOnboardingListener reactOnboardingListener = new ReactOnboardingListener(promise, getReactApplicationContext());
            if (getCurrentActivity() != null) {
                getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        this.f$0.lambda$approve$9(flowConfigBuild, reactOnboardingListener);
                    }
                });
            }
        } catch (ModuleConfigurationException e2) {
            promise.reject(e2.getCause());
        }
    }

    @ReactMethod
    public void checkOnDemandResourcesDownloaded(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(IncodeSdkInitError.ACTIVITY_NOT_PRESENT.getValue(), "Activity not present");
            return;
        }
        String moduleName = getModuleName(readableMap);
        SplitInstallManager splitInstallManagerCreate = SplitInstallManagerFactory.create(currentActivity);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", splitInstallManagerCreate.getInstalledModules().contains(moduleName) ? "true" : Constants.CASEFIRST_FALSE);
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public void deleteLocalUserData(Promise promise) {
        IncodeWelcome.deleteUserLocalData(getReactApplicationContext());
        promise.resolve("");
    }

    @ReactMethod
    public void downloadOnDemandResources(ReadableMap readableMap, final Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(IncodeSdkInitError.ACTIVITY_NOT_PRESENT.getValue(), "Activity not present");
            return;
        }
        String moduleName = getModuleName(readableMap);
        final SplitInstallManager splitInstallManagerCreate = SplitInstallManagerFactory.create(currentActivity);
        final AtomicInteger atomicInteger = new AtomicInteger();
        SplitInstallStateUpdatedListener splitInstallStateUpdatedListener = this.splitInstallStateUpdatedListener;
        if (splitInstallStateUpdatedListener != null) {
            splitInstallManagerCreate.unregisterListener(splitInstallStateUpdatedListener);
        }
        SplitInstallStateUpdatedListener splitInstallStateUpdatedListener2 = new SplitInstallStateUpdatedListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda2
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            public final void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
                this.f$0.lambda$downloadOnDemandResources$6(splitInstallManagerCreate, promise, atomicInteger, splitInstallSessionState);
            }
        };
        this.splitInstallStateUpdatedListener = splitInstallStateUpdatedListener2;
        splitInstallManagerCreate.registerListener(splitInstallStateUpdatedListener2);
        splitInstallManagerCreate.startInstall(SplitInstallRequest.newBuilder().addModule(moduleName).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                atomicInteger.set(((Integer) obj).intValue());
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                IncodeSdkModule.lambda$downloadOnDemandResources$8(promise, exc);
            }
        });
    }

    @ReactMethod
    public void faceMatch(final Promise promise) {
        IncodeWelcome.getInstance().faceMatch(null, null, new FaceMatchListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule.5
            @Override // com.incode.welcome_sdk.listeners.ErrorListener
            public void onError(Throwable th) {
                promise.reject(th);
            }

            @Override // com.incode.welcome_sdk.listeners.FaceMatchListener
            public void onFaceMatchCompleted(FaceMatchResult faceMatchResult) {
                if (Double.isNaN(faceMatchResult.confidence)) {
                    promise.reject("IncdSDK:faceMatch", "Error");
                    return;
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("status", faceMatchResult.isFaceMatched ? "match" : "mismatch");
                writableMapCreateMap.putDouble("confidence", faceMatchResult.confidence);
                writableMapCreateMap.putString("existingInterviewId", faceMatchResult.existingInterviewId);
                writableMapCreateMap.putBoolean("existingUser", faceMatchResult.isExistingUser);
                promise.resolve(writableMapCreateMap);
            }

            @Override // com.incode.welcome_sdk.listeners.UserCancelledListener
            public void onUserCancelled() {
                IncodeSdkModule.this.userCancelled(promise, "Incd::FaceMatch::UserCancelled");
            }
        });
    }

    @ReactMethod
    public void finishOnboardingFlow(final Promise promise) {
        IncodeWelcome.getInstance().finishOnboarding(getReactApplicationContext(), new FinishOnboardingListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule.4
            @Override // com.incode.welcome_sdk.listeners.ErrorListener
            public void onError(Throwable th) {
                promise.reject(th);
            }

            @Override // com.incode.welcome_sdk.listeners.FinishOnboardingListener
            public void onOnboardingFinished() {
                promise.resolve("");
            }

            @Override // com.incode.welcome_sdk.listeners.UserCancelledListener
            public void onUserCancelled() {
                IncodeSdkModule.this.userCancelled(promise, "Incd::UserCancelled");
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getUserScore(ReadableMap readableMap, final Promise promise) {
        IncodeWelcome.getInstance().getUserScore("fast".equals(readableMap.hasKey("mode") ? readableMap.getString("mode") : null) ? IncodeWelcome.IDResultsFetchMode.FAST : IncodeWelcome.IDResultsFetchMode.ACCURATE, null, new GetUserScoreListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule.7
            @Override // com.incode.welcome_sdk.listeners.ErrorListener
            public void onError(Throwable th) {
                promise.reject(th);
            }

            @Override // com.incode.welcome_sdk.listeners.UserCancelledListener
            public void onUserCancelled() {
                IncodeSdkModule.this.userCancelled(promise, "Incd::GET_USER_SCORE::UserCancelled");
            }

            @Override // com.incode.welcome_sdk.listeners.GetUserScoreListener
            public void onUserScoreFetched(UserScoreResult userScoreResult) {
                promise.resolve(TypeHelper.getUserScoreResultMap(userScoreResult));
            }
        });
    }

    @ReactMethod
    public void initialize(final ReadableMap readableMap, final Promise promise) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(IncodeSdkInitError.ACTIVITY_NOT_PRESENT.getValue(), "Activity not present");
        } else {
            currentActivity.runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule.2
                /* JADX WARN: Removed duplicated region for block: B:103:0x0219  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0221  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 551
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.reactnativeincodesdk.IncodeSdkModule.AnonymousClass2.run():void");
                }
            });
        }
    }

    public void optimizeInstallSize(File file) {
        File[] fileArrListFiles;
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                optimizeInstallSize(file2);
            } else if (file2.getName().equalsIgnoreCase("libRecogKitAndroid.so")) {
                file2.delete();
            }
        }
    }

    @ReactMethod
    public void removeOnDemandResources(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(IncodeSdkInitError.ACTIVITY_NOT_PRESENT.getValue(), "Activity not present");
            return;
        }
        SplitInstallManagerFactory.create(currentActivity).deferredUninstall(Arrays.asList(getModuleName(readableMap)));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", FirebaseAnalytics.Param.SUCCESS);
        promise.resolve(writableMapCreateMap);
    }

    @ReactMethod
    public void setFaceAuthenticationHint(ReadableMap readableMap) {
        if (readableMap.hasKey("faceAuthenticationHint")) {
            IncodeWelcome.getInstance().setFaceAuthenticationHint(readableMap.getString("faceAuthenticationHint"));
        }
    }

    @ReactMethod
    public void setLocalizationLanguage(String str) {
        String str2 = getSupportedLanguages().get(str);
        if (str2 == null) {
            str2 = "en_US";
        }
        setCommonConfig(getCommonConfigBuilder().setLocalizationLanguage(str2).build());
    }

    @ReactMethod
    public void setQuantityStrings(ReadableMap readableMap, Promise promise) {
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                Locale localeForLanguageTag = Locale.forLanguageTag(next.getKey());
                ReadableMap readableMap2 = (ReadableMap) next.getValue();
                HashMap map = new HashMap();
                Iterator<Map.Entry<String, Object>> entryIterator2 = readableMap2.getEntryIterator();
                while (entryIterator2.hasNext()) {
                    Map.Entry<String, Object> next2 = entryIterator2.next();
                    String key = next2.getKey();
                    ReadableMap readableMap3 = (ReadableMap) next2.getValue();
                    HashMap map2 = new HashMap();
                    Iterator<Map.Entry<String, Object>> entryIterator3 = readableMap3.getEntryIterator();
                    while (entryIterator3.hasNext()) {
                        Map.Entry<String, Object> next3 = entryIterator3.next();
                        String key2 = next3.getKey();
                        map2.put(QuantityKeyword.valueOf(key2.toUpperCase()), (String) next3.getValue());
                    }
                    map.put(key, map2);
                }
                IncodeWelcome.getInstance().setQuantityStrings(localeForLanguageTag, map);
            }
            promise.resolve(null);
        } catch (Exception e2) {
            promise.reject("SET_QUANTITY_STRINGS_ERROR", e2);
        }
    }

    @ReactMethod
    public void setString(ReadableMap readableMap) {
        IncodeWelcome.getInstance().setStrings(new Locale("en"), convertReadableMapToJavaMap(readableMap));
    }

    @ReactMethod
    public void setTheme(ReadableMap readableMap, Promise promise) {
        if (!readableMap.hasKey("jsonTheme")) {
            promise.resolve(createResponse(false));
            return;
        }
        String strExtractIdV2ThemeJson = extractIdV2ThemeJson(readableMap.getString("jsonTheme"));
        if (strExtractIdV2ThemeJson == null) {
            promise.resolve(createResponse(false));
            return;
        }
        try {
            setCommonConfig(getCommonConfigBuilder().setThemeConfig(IncodeThemeConfig.fromJson(getReactApplicationContext(), strExtractIdV2ThemeJson)).build());
            promise.resolve(createResponse(true));
        } catch (Exception unused) {
            promise.resolve(createResponse(false));
        }
    }

    @ReactMethod
    public void setUXConfig(ReadableMap readableMap, Promise promise) {
        if (!readableMap.hasKey("jsonConfig")) {
            promise.resolve(createResponse(false));
            return;
        }
        try {
            setCommonConfig(getCommonConfigBuilder().setUXConfig(IncodeUXConfig.fromJson(readableMap.getString("jsonConfig"))).build());
            promise.resolve(createResponse(true));
        } catch (Exception unused) {
            promise.resolve(createResponse(false));
        }
    }

    @ReactMethod
    public void setupOnboardingSession(ReadableMap readableMap, final Promise promise) {
        IncodeWelcome.getInstance().setupOnboardingSession(OnboardingConfigFactory.getSessionConfigByMap(readableMap.getMap("sessionConfig")), new OnboardingSessionListener() { // from class: com.reactnativeincodesdk.IncodeSdkModule.3
            @Override // com.incode.welcome_sdk.listeners.ErrorListener
            public void onError(Throwable th) {
                promise.reject(th);
            }

            @Override // com.incode.welcome_sdk.listeners.OnboardingSessionListener
            public void onOnboardingSessionCreated(String str, String str2, String str3) {
                promise.resolve(TypeHelper.getOnboardingSessionResult(str2, str));
            }

            @Override // com.incode.welcome_sdk.listeners.UserCancelledListener
            public void onUserCancelled() {
                IncodeSdkModule.this.userCancelled(promise, "Incd::UserCancelled");
            }
        });
    }

    @ReactMethod
    public void showCloseButton(Boolean bool) {
        setCommonConfig(getCommonConfigBuilder().setShowCloseButton(bool.booleanValue()).build());
    }

    @ReactMethod
    public void startFaceLogin(ReadableMap readableMap, final Promise promise) {
        final SelfieScan.Builder waitForTutorials = new SelfieScan.Builder().setMode(SelfieScan.Mode.LOGIN).setFaceAuthMode(SelfieScan.FaceAuthMode.SERVER).setWaitForTutorials(OnboardingConfigFactory.WAIT_FOR_TUTORIALS);
        final SessionConfig.Builder builder = new SessionConfig.Builder();
        if (readableMap != null) {
            if (readableMap.hasKey("customerUUID")) {
                waitForTutorials.setCustomerUUID(readableMap.getString("customerUUID"));
            }
            if (readableMap.hasKey("showTutorials")) {
                waitForTutorials.setShowTutorials(readableMap.getBoolean("showTutorials"));
            }
            if (readableMap.hasKey("faceMaskCheck")) {
                waitForTutorials.setMaskCheckEnabled(readableMap.getBoolean("faceMaskCheck"));
            }
            if (readableMap.hasKey("lensesCheck")) {
                waitForTutorials.setLensesCheckEnabled(readableMap.getBoolean("lensesCheck"));
            }
            if (readableMap.hasKey("logAuthenticationEnabled")) {
                waitForTutorials.setLogAuthenticationEnabled(readableMap.getBoolean("logAuthenticationEnabled"));
            }
            if (readableMap.hasKey("e2eeEncryptionEnabled")) {
                builder.setE2eEncryptionEnabled(readableMap.getBoolean("e2eeEncryptionEnabled"));
            }
        }
        if (getCurrentActivity() != null) {
            getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$startFaceLogin$10(builder, waitForTutorials, promise);
                }
            });
        }
    }

    @ReactMethod
    public void startFlow(ReadableMap readableMap, Promise promise) {
        try {
            final SessionConfig sessionConfigByMap = OnboardingConfigFactory.getSessionConfigByMap(readableMap.getMap("sessionConfig"));
            final ReactOnboardingListener reactOnboardingListener = new ReactOnboardingListener(promise, getReactApplicationContext());
            final Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                if (!readableMap.hasKey("moduleId") || readableMap.isNull("moduleId")) {
                    currentActivity.runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            IncodeWelcome.getInstance().startFlow(currentActivity, sessionConfigByMap, reactOnboardingListener);
                        }
                    });
                    return;
                }
                String string = readableMap.getString("moduleId");
                final Modules modulesSafeValueOf = Modules.safeValueOf(string);
                if (modulesSafeValueOf == null) {
                    promise.reject("Incd::invalidModuleId", "Invalid moduleId: " + string);
                } else {
                    currentActivity.runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() throws Exception {
                            IncodeWelcome.getInstance().startFlow(currentActivity, sessionConfigByMap, modulesSafeValueOf, reactOnboardingListener);
                        }
                    });
                }
            }
        } catch (Exception e2) {
            promise.reject("Incd::startFlowException", e2);
        }
    }

    @ReactMethod
    public void startFlowFromDeepLink(final String str, Boolean bool, Promise promise) {
        try {
            final ReactOnboardingListener reactOnboardingListener = new ReactOnboardingListener(promise, getReactApplicationContext());
            if (getCurrentActivity() != null) {
                getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        this.f$0.lambda$startFlowFromDeepLink$3(str, reactOnboardingListener);
                    }
                });
            }
        } catch (Exception e2) {
            promise.reject("Incd::startFlowException", e2);
        }
    }

    @ReactMethod
    public void startOnboarding(ReadableMap readableMap, Promise promise) throws Throwable {
        try {
            final SessionConfig sessionConfigByMap = OnboardingConfigFactory.getSessionConfigByMap(readableMap.getMap("sessionConfig"));
            final FlowConfig flowConfigByMap = OnboardingConfigFactory.getFlowConfigByMap(getCurrentActivity(), readableMap.getArray("flowConfig"), readableMap.getMap("recordSessionConfig"), readableMap.getString("sectionTag"));
            final ReactOnboardingListener reactOnboardingListener = new ReactOnboardingListener(promise, getReactApplicationContext());
            if (getCurrentActivity() != null) {
                getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        this.f$0.lambda$startOnboarding$0(sessionConfigByMap, flowConfigByMap, reactOnboardingListener);
                    }
                });
            }
        } catch (ModuleConfigurationException e2) {
            promise.reject("Incd::StartOnboardingException", e2);
        }
    }

    @ReactMethod
    public void startOnboardingSection(ReadableMap readableMap, Promise promise) throws Throwable {
        try {
            final FlowConfig flowConfigByMap = OnboardingConfigFactory.getFlowConfigByMap(getCurrentActivity(), readableMap.getArray("flowConfig"), readableMap.getMap("recordSessionConfig"), readableMap.getString("sectionTag"));
            final ReactOnboardingListener reactOnboardingListener = new ReactOnboardingListener(promise, getReactApplicationContext());
            if (getCurrentActivity() != null) {
                getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        this.f$0.lambda$startOnboardingSection$5(flowConfigByMap, reactOnboardingListener);
                    }
                });
            }
        } catch (ModuleConfigurationException e2) {
            promise.reject("Incd::StartOnboardingSectionException", e2);
        }
    }

    @ReactMethod
    public void startWorkflow(ReadableMap readableMap, Promise promise) {
        try {
            final SessionConfig sessionConfigByMap = OnboardingConfigFactory.getSessionConfigByMap(readableMap.getMap("sessionConfig"));
            final ReactOnboardingListener reactOnboardingListener = new ReactOnboardingListener(promise, getReactApplicationContext());
            if (getCurrentActivity() != null) {
                getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.reactnativeincodesdk.IncodeSdkModule$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        this.f$0.lambda$startWorkflow$4(sessionConfigByMap, reactOnboardingListener);
                    }
                });
            }
        } catch (Exception e2) {
            promise.reject("Incd::StartWorkflowException", e2);
        }
    }
}
