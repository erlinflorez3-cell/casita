package io.invertase.firebase.crashlytics;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.invertase.firebase.common.ReactNativeFirebaseInitProvider;
import io.invertase.firebase.common.ReactNativeFirebaseJSON;
import io.invertase.firebase.common.ReactNativeFirebaseMeta;
import io.invertase.firebase.common.ReactNativeFirebasePreferences;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseCrashlyticsInitProvider extends ReactNativeFirebaseInitProvider {
    private static final String TAG = "RNFBCrashlyticsInit";

    static boolean isCrashlyticsCollectionEnabled() {
        boolean booleanValue;
        ReactNativeFirebaseJSON sharedInstance = ReactNativeFirebaseJSON.getSharedInstance();
        ReactNativeFirebaseMeta sharedInstance2 = ReactNativeFirebaseMeta.getSharedInstance();
        ReactNativeFirebasePreferences sharedInstance3 = ReactNativeFirebasePreferences.getSharedInstance();
        if (sharedInstance3.contains("crashlytics_auto_collection_enabled")) {
            booleanValue = sharedInstance3.getBooleanValue("crashlytics_auto_collection_enabled", true);
            String str = "isCrashlyticsCollectionEnabled via RNFBPreferences: " + booleanValue;
        } else if (sharedInstance.contains("crashlytics_auto_collection_enabled")) {
            booleanValue = sharedInstance.getBooleanValue("crashlytics_auto_collection_enabled", true);
            String str2 = "isCrashlyticsCollectionEnabled via RNFBJSON: " + booleanValue;
        } else {
            booleanValue = sharedInstance2.getBooleanValue("crashlytics_auto_collection_enabled", true);
            String str3 = "isCrashlyticsCollectionEnabled via RNFBMeta: " + booleanValue;
        }
        String str4 = "isCrashlyticsCollectionEnabled final value: " + booleanValue;
        return booleanValue;
    }

    static boolean isCrashlyticsJavascriptExceptionHandlerChainingEnabled() {
        boolean booleanValue;
        ReactNativeFirebaseJSON sharedInstance = ReactNativeFirebaseJSON.getSharedInstance();
        ReactNativeFirebaseMeta sharedInstance2 = ReactNativeFirebaseMeta.getSharedInstance();
        ReactNativeFirebasePreferences sharedInstance3 = ReactNativeFirebasePreferences.getSharedInstance();
        if (sharedInstance3.contains("crashlytics_javascript_exception_handler_chaining_enabled")) {
            booleanValue = sharedInstance3.getBooleanValue("crashlytics_javascript_exception_handler_chaining_enabled", true);
            String str = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBPreferences: " + booleanValue;
        } else if (sharedInstance.contains("crashlytics_javascript_exception_handler_chaining_enabled")) {
            booleanValue = sharedInstance.getBooleanValue("crashlytics_javascript_exception_handler_chaining_enabled", true);
            String str2 = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBJSON: " + booleanValue;
        } else {
            booleanValue = sharedInstance2.getBooleanValue("crashlytics_javascript_exception_handler_chaining_enabled", true);
            String str3 = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBMeta: " + booleanValue;
        }
        String str4 = "isCrashlyticsJavascriptExceptionHandlerChainingEnabled final value: " + booleanValue;
        return booleanValue;
    }

    static boolean isErrorGenerationOnJSCrashEnabled() {
        boolean booleanValue;
        ReactNativeFirebaseJSON sharedInstance = ReactNativeFirebaseJSON.getSharedInstance();
        ReactNativeFirebaseMeta sharedInstance2 = ReactNativeFirebaseMeta.getSharedInstance();
        ReactNativeFirebasePreferences sharedInstance3 = ReactNativeFirebasePreferences.getSharedInstance();
        if (sharedInstance3.contains("crashlytics_is_error_generation_on_js_crash_enabled")) {
            booleanValue = sharedInstance3.getBooleanValue("crashlytics_is_error_generation_on_js_crash_enabled", true);
            String str = "isErrorGenerationOnJSCrashEnabled via RNFBPreferences: " + booleanValue;
        } else if (sharedInstance.contains("crashlytics_is_error_generation_on_js_crash_enabled")) {
            booleanValue = sharedInstance.getBooleanValue("crashlytics_is_error_generation_on_js_crash_enabled", true);
            String str2 = "isErrorGenerationOnJSCrashEnabled via RNFBJSON: " + booleanValue;
        } else {
            booleanValue = sharedInstance2.getBooleanValue("crashlytics_is_error_generation_on_js_crash_enabled", true);
            String str3 = "isErrorGenerationOnJSCrashEnabled via RNFBMeta: " + booleanValue;
        }
        String str4 = "isErrorGenerationOnJSCrashEnabled final value: " + booleanValue;
        return booleanValue;
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseInitProvider, android.content.ContentProvider
    public boolean onCreate() throws Throwable {
        super.onCreate();
        try {
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(isCrashlyticsCollectionEnabled());
            return true;
        } catch (Exception e2) {
            return false;
        }
    }
}
