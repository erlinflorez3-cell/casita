package io.invertase.firebase.crashlytics;

import android.os.Handler;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.common.ReactNativeFirebasePreferences;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseCrashlyticsModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Crashlytics";

    ReactNativeFirebaseCrashlyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    static /* synthetic */ void lambda$checkForUnsentReports$0(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            rejectPromiseWithCodeAndMessage(promise, "unknown", task.getException() != null ? task.getException().getMessage() : "checkForUnsentReports() request error");
        } else if (task.getResult() != null) {
            promise.resolve(task.getResult());
        } else {
            rejectPromiseWithCodeAndMessage(promise, "unknown", "Unknown result of check for unsent reports");
        }
    }

    private Exception recordJavaScriptError(ReadableMap readableMap) throws Throwable {
        String string = readableMap.getString(C1561oA.Kd("^WfgV]\\", (short) (OY.Xd() ^ 10032)));
        short sXd = (short) (C1499aX.Xd() ^ (-30301));
        short sXd2 = (short) (C1499aX.Xd() ^ (-22514));
        int[] iArr = new int["t\u0002szu\u0001".length()];
        QB qb = new QB("t\u0002szu\u0001");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        ReadableArray readableArray = (ReadableArray) Objects.requireNonNull(readableMap.getArray(new String(iArr, 0, i2)));
        Exception unhandledPromiseRejection = readableMap.getBoolean(C1561oA.Xd("\u0011\u001c~\u0019\u0014\u000e\u001c\u0013\u001c\u0016\u0016\u0005\u0019\u001f\u001b\u001a,\"))", (short) (C1580rY.Xd() ^ (-28867)))) ? new UnhandledPromiseRejection(string) : new JavaScriptError(string);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[readableArray.size()];
        for (int i3 = 0; i3 < readableArray.size(); i3++) {
            ReadableMap readableMap2 = (ReadableMap) Objects.requireNonNull(readableArray.getMap(i3));
            short sXd3 = (short) (C1580rY.Xd() ^ (-24486));
            int[] iArr2 = new int["\u0013\u001c".length()];
            QB qb2 = new QB("\u0013\u001c");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((sXd3 ^ i4) + xuXd2.CK(iKK2));
                i4++;
            }
            Object[] objArr = {"", readableMap2.getString(new String(iArr2, 0, i4)), readableMap2.getString(Qg.kd("\u000b\r\u000f\u0007", (short) (C1499aX.Xd() ^ (-23411)), (short) (C1499aX.Xd() ^ (-9708)))), -1};
            Constructor<?> constructor = Class.forName(hg.Vd("]SgQ\u001dZNZR\u0018<\\HIP8UCDE$JBI@HM", (short) (Od.Xd() ^ (-17457)), (short) (Od.Xd() ^ (-7568)))).getConstructor(Class.forName(C1561oA.ud("=3G1|:.:2w\u001c<9/3+", (short) (OY.Xd() ^ 15008))), Class.forName(C1561oA.yd("H@R>\u0010OAO=\u0005'ILDF@", (short) (C1633zX.Xd() ^ (-23903)))), Class.forName(C1561oA.Yd("+#9%r2(60w\u001e@?7=7", (short) (ZN.Xd() ^ 7120))), Integer.TYPE);
            try {
                constructor.setAccessible(true);
                stackTraceElementArr[i3] = (StackTraceElement) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        unhandledPromiseRejection.setStackTrace(stackTraceElementArr);
        FirebaseCrashlytics.getInstance().recordException(unhandledPromiseRejection);
        return unhandledPromiseRejection;
    }

    @ReactMethod
    public void checkForUnsentReports(final Promise promise) {
        FirebaseCrashlytics.getInstance().checkForUnsentReports().addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsModule$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseCrashlyticsModule.lambda$checkForUnsentReports$0(promise, task);
            }
        });
    }

    @ReactMethod
    public void crash() throws Throwable {
        if (!ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            short sXd = (short) (C1607wl.Xd() ^ 3695);
            short sXd2 = (short) (C1607wl.Xd() ^ 9352);
            int[] iArr = new int["a)%I\u000b'aH<S&".length()];
            QB qb = new QB("a)%I\u000b'aH<S&");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            new String(iArr, 0, i2);
            Ig.wd("@\u0003aYD$K[\u001e\r#iYop\u000f>>\bA\u00043rD\u0007;(w\u0007`>c\u0003\u001e-t\u0004k^\u001b\u001cqM+HC~=\f\u0006\u0017\u0018", (short) (C1580rY.Xd() ^ (-9834)));
            return;
        }
        Handler handler = new Handler();
        Runnable runnable = new Runnable() { // from class: io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsModule.1
            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException("Crash Test");
            }
        };
        Class<?> cls = Class.forName(Xg.qd("JXO^\\WS\u001e`e!<Vd[d^l", (short) (C1499aX.Xd() ^ (-19704)), (short) (C1499aX.Xd() ^ (-6854))));
        Class<?>[] clsArr = new Class[2];
        short sXd3 = (short) (C1499aX.Xd() ^ (-108));
        short sXd4 = (short) (C1499aX.Xd() ^ (-11134));
        int[] iArr2 = new int["3N\u001e\u001a!\u00020S\u007fpG$3x\u00027Z\u001a".length()];
        QB qb2 = new QB("3N\u001e\u001a!\u00020S\u007fpG$3x\u00027Z\u001a");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {runnable, 50L};
        Method method = cls.getMethod(ZO.xd("\fm\u0013=5m\u00125^iY", (short) (C1633zX.Xd() ^ (-5134)), (short) (C1633zX.Xd() ^ (-18174))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void crashWithStackPromise(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            recordJavaScriptError(readableMap).printStackTrace(System.err);
            System.exit(0);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void deleteUnsentReports() {
        FirebaseCrashlytics.getInstance().deleteUnsentReports();
    }

    @ReactMethod
    public void didCrashOnPreviousExecution(Promise promise) {
        promise.resolve(Boolean.valueOf(FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution()));
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("isCrashlyticsCollectionEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()));
        map.put("isErrorGenerationOnJSCrashEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.isErrorGenerationOnJSCrashEnabled()));
        map.put("isCrashlyticsJavascriptExceptionHandlerChainingEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsJavascriptExceptionHandlerChainingEnabled()));
        return map;
    }

    @ReactMethod
    public void log(String str) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
    }

    @ReactMethod
    public void logPromise(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void recordError(ReadableMap readableMap) throws Throwable {
        if (ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            recordJavaScriptError(readableMap);
        }
    }

    @ReactMethod
    public void recordErrorPromise(ReadableMap readableMap, Promise promise) throws Throwable {
        if (ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            recordJavaScriptError(readableMap);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void sendUnsentReports() {
        FirebaseCrashlytics.getInstance().sendUnsentReports();
    }

    @ReactMethod
    public void setAttribute(String str, String str2, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            FirebaseCrashlytics.getInstance().setCustomKey(str, str2);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setAttributes(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                firebaseCrashlytics.setCustomKey(strNextKey, readableMap.getString(strNextKey));
            }
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setCrashlyticsCollectionEnabled(Boolean bool, Promise promise) {
        ReactNativeFirebasePreferences.getSharedInstance().setBooleanValue("crashlytics_auto_collection_enabled", bool.booleanValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void setUserId(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.isCrashlyticsCollectionEnabled()) {
            FirebaseCrashlytics.getInstance().setUserId(str);
        }
        promise.resolve(null);
    }
}
