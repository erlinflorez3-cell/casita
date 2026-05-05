package com.npmdavi.davinotification;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class PushNotificationModule extends ReactContextBaseJavaModule {
    private static final String TAG = "PushNotificationModule";

    public PushNotificationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    static /* synthetic */ void lambda$forceRefreshToken$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve((String) task.getResult());
        } else {
            task.getException();
            promise.reject("Error", "Fetching new FCM registration token failed");
        }
    }

    static /* synthetic */ void lambda$forceRefreshToken$2(final Promise promise, Task task) {
        if (task.isSuccessful()) {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: com.npmdavi.davinotification.PushNotificationModule$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    PushNotificationModule.lambda$forceRefreshToken$1(promise, task2);
                }
            });
        } else {
            task.getException();
            promise.reject("Error", "Fetching FCM registration token failed");
        }
    }

    static /* synthetic */ void lambda$getFirebaseToken$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve((String) task.getResult());
        } else {
            task.getException();
            promise.reject("Error", "Fetching FCM registration token failed");
        }
    }

    @ReactMethod
    public void clearAllNotifications(Promise promise) {
        try {
            SharedPreferences.Editor editorEdit = getReactApplicationContext().getSharedPreferences("DaviNotificationPrefs", 0).edit();
            editorEdit.clear();
            editorEdit.apply();
            promise.resolve("All notifications cleared");
        } catch (Exception e2) {
            promise.reject("Error", e2.getMessage());
        }
    }

    @ReactMethod
    public void forceRefreshToken(final Promise promise) {
        try {
            FirebaseMessaging.getInstance().deleteToken().addOnCompleteListener(new OnCompleteListener() { // from class: com.npmdavi.davinotification.PushNotificationModule$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    PushNotificationModule.lambda$forceRefreshToken$2(promise, task);
                }
            });
        } catch (Exception e2) {
            promise.reject("Error", e2.getMessage());
        }
    }

    @ReactMethod
    public void getFirebaseToken(final Promise promise) {
        try {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: com.npmdavi.davinotification.PushNotificationModule$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    PushNotificationModule.lambda$getFirebaseToken$0(promise, task);
                }
            });
        } catch (Exception e2) {
            promise.reject("Error", e2.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    public Map<String, String> getNotificationsDataByStorage(Context context) throws Throwable {
        String strZd = C1593ug.zd("\u00142H<\"DJ@>B=<PFMM0SGIW", (short) (C1607wl.Xd() ^ 22752), (short) (C1607wl.Xd() ^ 1173));
        short sXd = (short) (C1499aX.Xd() ^ (-18711));
        int[] iArr = new int["\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b".length()];
        QB qb = new QB("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(C1561oA.Kd("}u\fwE\u0005z\t\u0003Jp\u0013\u0012\n\u0010\n", (short) (C1499aX.Xd() ^ (-15362)))), Integer.TYPE};
        Object[] objArr = {strZd, 0};
        short sXd2 = (short) (C1607wl.Xd() ^ 14283);
        short sXd3 = (short) (C1607wl.Xd() ^ 13518);
        int[] iArr2 = new int["\u000eZe\u00034\u001aiXu.M~\u001c\u0019SBi\u001b+v".length()];
        QB qb2 = new QB("\u000eZe\u00034\u001aiXu.M~\u001c\u0019SBi\u001b+v");
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
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            HashMap map = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                if (entry.getKey().startsWith(C1561oA.Xd("139/-1,+?5<<\u00135E3<@H5", (short) (Od.Xd() ^ (-19674))))) {
                    map.put(entry.getKey(), entry.getValue().toString());
                }
            }
            String str = Wg.vd("Y{\u0002wmqlkwmtt\u001fdbv\\6\u001d", (short) (C1580rY.Xd() ^ (-27678))) + map;
            Qg.kd("j\u000f\f\u007fd\u0005\t|xzsp\u0003v{yWxl|rj", (short) (ZN.Xd() ^ 23423), (short) (ZN.Xd() ^ 11812));
            return map;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void getNotificationsEventByStorage(Promise promise) throws Throwable {
        try {
            Map<String, String> notificationsDataByStorage = getNotificationsDataByStorage(getReactApplicationContext());
            WritableMap writableMapCreateMap = Arguments.createMap();
            for (Map.Entry<String, String> entry : notificationsDataByStorage.entrySet()) {
                writableMapCreateMap.putString(entry.getKey(), entry.getValue());
            }
            promise.resolve(writableMapCreateMap);
        } catch (Exception e2) {
            promise.reject("Error", e2.getMessage());
        }
    }

    @ReactMethod
    public void removeNotificationById(String str, Promise promise) {
        try {
            SharedPreferences sharedPreferences = getReactApplicationContext().getSharedPreferences("DaviNotificationPrefs", 0);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                String str2 = entry.getKey() + ": " + entry.getValue().toString();
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            String str3 = "notificationDetails_" + str;
            if (sharedPreferences.contains(str3)) {
                editorEdit.remove(str3);
                editorEdit.apply();
                String str4 = "notificationEventName_" + str;
                if (sharedPreferences.contains(str4)) {
                    editorEdit.remove(str4);
                    editorEdit.apply();
                }
                for (Map.Entry<String, ?> entry2 : getReactApplicationContext().getSharedPreferences("DaviNotificationPrefs", 0).getAll().entrySet()) {
                    String str5 = entry2.getKey() + ": " + entry2.getValue().toString();
                }
                promise.resolve("Notification removed: " + str);
            }
        } catch (Exception e2) {
            promise.reject("Error", e2.getMessage());
        }
    }

    @ReactMethod
    public void requestNotificationPermissions(Promise promise) {
        try {
            if (Build.VERSION.SDK_INT >= 33 && ContextCompat.checkSelfPermission(getReactApplicationContext(), "android.permission.POST_NOTIFICATIONS") != 0) {
                ActivityCompat.requestPermissions(getCurrentActivity(), new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                promise.resolve("Permisos de notificación solicitados");
            }
            promise.resolve("Permission granted");
        } catch (Exception e2) {
            promise.reject("Error", e2.getMessage());
        }
    }

    @ReactMethod
    public void setNotificationSound(String str) {
        try {
            SharedPreferences.Editor editorEdit = getReactApplicationContext().getSharedPreferences(TAG, 0).edit();
            editorEdit.putString("notification_sound", str);
            editorEdit.apply();
            String str2 = "Sonido de notificación guardado: " + str;
        } catch (Exception e2) {
            String str3 = "Error al guardar el sonido de notificación: " + e2.getMessage();
        }
    }
}
