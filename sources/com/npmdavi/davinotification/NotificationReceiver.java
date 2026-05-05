package com.npmdavi.davinotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.gson.Gson;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
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

/* JADX INFO: loaded from: classes5.dex */
public class NotificationReceiver extends BroadcastReceiver {
    private static final String TAG = "NotificationReceiver";
    private static ReactApplicationContext reactContext = null;

    private WritableMap convertToWritableMap(HashMap<String, Object> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                writableMapCreateMap.putString(entry.getKey(), (String) value);
            } else if (value instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) value;
                if (arrayList.isEmpty() || !(arrayList.get(0) instanceof String)) {
                    writableMapCreateMap.putArray(entry.getKey(), Arguments.fromArray(arrayList.toArray()));
                } else {
                    writableMapCreateMap.putArray(entry.getKey(), Arguments.fromArray(arrayList.toArray(new String[0])));
                }
            } else if (value instanceof Integer) {
                writableMapCreateMap.putInt(entry.getKey(), ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                writableMapCreateMap.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                writableMapCreateMap.putDouble(entry.getKey(), ((Double) value).doubleValue());
            } else if (value instanceof Float) {
                writableMapCreateMap.putDouble(entry.getKey(), ((Float) value).doubleValue());
            } else if (value instanceof HashMap) {
                writableMapCreateMap.putMap(entry.getKey(), convertToWritableMap((HashMap) value));
            } else {
                writableMapCreateMap.putString(entry.getKey(), value.toString());
            }
        }
        return writableMapCreateMap;
    }

    public static void setReactContext(ReactApplicationContext reactApplicationContext) {
        reactContext = reactApplicationContext;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        String action = intent.getAction();
        HashMap map = (HashMap) intent.getSerializableExtra("data");
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put(Constant.NOTIFICATION_DETAILS_ACTION, action);
        map2.put("title", intent.getStringExtra("title"));
        map2.put("message", intent.getStringExtra("message"));
        map2.put("data", map);
        map2.put(Constant.NOTIFICATION_DETAILS_BY, intent.getStringExtra(Constant.NOTIFICATION_DETAILS_BY));
        map2.put(Constant.NOTIFICATION_DETAILS_ID_NOTIFICATION, intent.getStringExtra(Constant.NOTIFICATION_DETAILS_ID_NOTIFICATION));
        map2.put(Constant.NOTIFICATION_DETAILS_LOG, new ArrayList(Arrays.asList(action)));
        if (Constant.PUSH_LISTENER_NOTIFICATION_DISMISSED.equals(action)) {
            if (reactContext == null) {
                saveEventToStorage(context, Constant.EVENTPUSH_ON_MESSAGE_DISMISSED, map2);
                return;
            } else {
                sendEventToJS(Constant.EVENTPUSH_ON_MESSAGE_DISMISSED, map2);
                return;
            }
        }
        if (Constant.PUSH_LISTENER_NOTIFICATION_OPENED.equals(action)) {
            if (reactContext == null) {
                saveEventToStorage(context, Constant.EVENTPUSH_ON_MESSAGE_OPENED, map2);
                return;
            } else {
                sendEventToJS(Constant.EVENTPUSH_ON_MESSAGE_OPENED, map2);
                return;
            }
        }
        if (Constant.PUSH_LISTENER_NOTIFICATION_RECEIVED.equals(action)) {
            if (reactContext == null) {
                saveEventToStorage(context, Constant.EVENTPUSH_ON_MESSAGE_RECEIVED, map2);
            } else {
                sendEventToJS(Constant.EVENTPUSH_ON_MESSAGE_RECEIVED, map2);
            }
        }
    }

    public void saveEventToStorage(Context context, String str, HashMap<String, Object> map) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-31171));
        int[] iArr = new int["l\u000f\u0015\u000b\t\r\b\u0007\u001b\u0011\u0018\u0018|\u0011\u0010\u0013\u0018&\u0016$".length()];
        QB qb = new QB("l\u000f\u0015\u000b\t\r\b\u0007\u001b\u0011\u0018\u0018|\u0011\u0010\u0013\u0018&\u0016$");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        new String(iArr, 0, i2);
        String strZd = Wg.Zd("x0h", (short) (Od.Xd() ^ (-6100)), (short) (Od.Xd() ^ (-16191)));
        String strXd = C1561oA.Xd("7SHFZLL\tXZ`VTXSRf\\cc\u0016cg`\u001aako\u001eHD;\"", (short) (FB.Xd() ^ 17464));
        String strVd = Wg.vd("AAI=5741OCLJ\u001cL>FW0FQD=", (short) (ZN.Xd() ^ 26122));
        String strKd = Qg.kd("^z\u000f\u0001d\u0005\t|xzsp\u0003v{yZ{mmy", (short) (Od.Xd() ^ (-13859)), (short) (Od.Xd() ^ (-31637)));
        try {
            Class<?> cls = Class.forName(hg.Vd("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@", (short) (FB.Xd() ^ 29495), (short) (FB.Xd() ^ 2210)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.ud("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X|\u001d\u001a\u0010\u0014\f", (short) (C1607wl.Xd() ^ 32055)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strKd, 0};
            Method method = cls.getMethod(C1561oA.yd("edtTjdvjjWznpp~r|ru\u0005", (short) (ZN.Xd() ^ 12304)), clsArr);
            try {
                method.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                String str2 = (String) map.get(C1561oA.Yd("b^Ikqgeidcwmtt", (short) (OY.Xd() ^ 7573)));
                if (str2 != null) {
                    String string = sharedPreferences.getString(strVd + str2, null);
                    String strQd = Xg.qd("ACI?=A<;OELL#EUCLPXE", (short) (ZN.Xd() ^ 30837), (short) (ZN.Xd() ^ 8690));
                    if (string == null) {
                        editorEdit.putString(strVd + str2, str);
                        editorEdit.putString(strQd + str2, new Gson().toJson(map));
                        editorEdit.apply();
                        return;
                    }
                    String string2 = sharedPreferences.getString(strQd + str2, null);
                    if (string2 != null) {
                        ArrayList arrayList = (ArrayList) ((HashMap) new Gson().fromJson(string2, HashMap.class)).get(strZd);
                        arrayList.addAll((ArrayList) map.get(strZd));
                        map.put(strZd, arrayList);
                        editorEdit.putString(strQd + str2, new Gson().toJson(map));
                        editorEdit.apply();
                        String str3 = strXd + str2 + Jg.Wd("\bvWM(L\u0010keN\u0003S\u0010wZB<\u001aC\u0003]KD", (short) (OY.Xd() ^ 15381), (short) (OY.Xd() ^ 1821));
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            ZO.xd("\u001c8^n\u0005&\u0014Hh\"\u000buXK>ez\u0013`eXt\u0003\u0011\t\u000b`M6", (short) (ZN.Xd() ^ 21902), (short) (ZN.Xd() ^ 20389));
        }
    }

    public void sendEventToJS(String str, HashMap<String, Object> map) {
        try {
            if (reactContext != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, convertToWritableMap(map));
            }
        } catch (Exception e2) {
        }
    }
}
