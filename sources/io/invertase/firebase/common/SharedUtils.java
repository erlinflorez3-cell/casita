package io.invertase.firebase.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
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

/* JADX INFO: loaded from: classes3.dex */
public class SharedUtils {
    private static final String EXPO_CORE_PACKAGE = "expo.core";
    private static final String EXPO_REGISTRY_CLASS = "ModuleRegistry";
    private static final String FLUTTER_CORE_PACKAGE = "io.flutter.plugin.common";
    private static final String FLUTTER_REGISTRY_CLASS = "PluginRegistry";
    private static final String REACT_NATIVE_CORE_PACKAGE = "com.facebook.react.bridge";
    private static final String REACT_NATIVE_REGISTRY_CLASS = "NativeModuleRegistry";
    private static final String RN_DEVSUPPORT_CLASS = "DevSupportManagerImpl";
    private static final String RN_DEVSUPPORT_PACKAGE = "com.facebook.react.devsupport";
    private static final String TAG = "Utils";

    public static void arrayPushValue(@Nullable Object obj, WritableArray writableArray) {
        String name;
        if (obj == null || obj == JSONObject.NULL) {
            writableArray.pushNull();
            return;
        }
        name = obj.getClass().getName();
        name.hashCode();
        switch (name) {
            case "java.lang.Integer":
                writableArray.pushInt(((Integer) obj).intValue());
                break;
            case "java.lang.Float":
                writableArray.pushDouble(((Float) obj).floatValue());
                break;
            case "org.json.JSONArray$1":
                try {
                    writableArray.pushArray(jsonArrayToWritableArray((JSONArray) obj));
                    break;
                } catch (JSONException unused) {
                    writableArray.pushNull();
                    return;
                }
                break;
            case "java.lang.Boolean":
                writableArray.pushBoolean(((Boolean) obj).booleanValue());
                break;
            case "java.lang.Long":
                writableArray.pushDouble(((Long) obj).longValue());
                break;
            case "java.lang.Double":
                writableArray.pushDouble(((Double) obj).doubleValue());
                break;
            case "java.lang.String":
                writableArray.pushString((String) obj);
                break;
            case "org.json.JSONObject$1":
                try {
                    writableArray.pushMap(jsonObjectToWritableMap((JSONObject) obj));
                    break;
                } catch (JSONException unused2) {
                    writableArray.pushNull();
                    return;
                }
                break;
            default:
                if (List.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushArray(listToWritableArray((List) obj));
                    break;
                } else {
                    if (!Map.class.isAssignableFrom(obj.getClass())) {
                        String str = "utils:arrayPushValue:unknownType:" + name;
                        writableArray.pushNull();
                    } else {
                        writableArray.pushMap(mapToWritableMap((Map) obj));
                    }
                    break;
                }
                break;
        }
    }

    public static WritableMap getExceptionMap(Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String message = exc.getMessage();
        writableMapCreateMap.putString("code", "unknown");
        writableMapCreateMap.putString("nativeErrorCode", "unknown");
        writableMapCreateMap.putString("message", message);
        writableMapCreateMap.putString("nativeErrorMessage", message);
        return writableMapCreateMap;
    }

    public static int getResId(Context context, String str) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-4935));
        int[] iArr = new int["BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?".length()];
        QB qb = new QB("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (OY.Xd() ^ 29547);
        short sXd3 = (short) (OY.Xd() ^ 1713);
        int[] iArr2 = new int["YXhG[jgnl^ap".length()];
        QB qb2 = new QB("YXhG[jgnl^ap");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            short sXd4 = (short) (C1499aX.Xd() ^ (-28789));
            int[] iArr3 = new int["GGD:>6".length()];
            QB qb3 = new QB("GGD:>6");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            String str2 = new String(iArr3, 0, i4);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Kd("LZQ`^YU Vccj\\fm(>kkrdxu", (short) (C1633zX.Xd() ^ (-4851)))).getMethod(Wg.Zd("(8he\b*SZ\u0002 \u001aN{\u0006", (short) (C1607wl.Xd() ^ 12188), (short) (C1607wl.Xd() ^ 30058)), new Class[0]);
            try {
                method2.setAccessible(true);
                int identifier = resources.getIdentifier(str, str2, (String) method2.invoke(context, objArr2));
                if (identifier == 0) {
                    String str3 = C1561oA.Xd("C7FCJH:=x", (short) (OY.Xd() ^ 7501)) + str + Wg.vd(".r\u007f\u0007vo,{\u0006\f8{w3z\u0005smd", (short) (FB.Xd() ^ 23608));
                    Qg.kd("x\u0017\u000b\r\u0013", (short) (ZN.Xd() ^ 17104), (short) (ZN.Xd() ^ 27364));
                }
                return identifier;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static Uri getUri(String str) {
        Uri uri = Uri.parse(str);
        return (uri.getScheme() == null || uri.getScheme().isEmpty()) ? Uri.fromFile(new File(str)) : uri;
    }

    public static Boolean hasPackageClass(String str, String str2) {
        try {
            Class.forName(str + "." + str2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isAppInForeground(Context context) throws Throwable {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String strVd = hg.Vd("\u0004\u0005\u0015\t\u0015\u0007\u0011\u0015", (short) (OY.Xd() ^ 1939), (short) (OY.Xd() ^ 10902));
        Class<?> cls = Class.forName(C1561oA.ud("WcXeaZT\u001dQ\\Z_OW\\\u0015)TRWGYT", (short) (C1607wl.Xd() ^ 7732)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 22119);
        int[] iArr = new int["TJ^H\u0014QEQY\u001fCc`VZR".length()];
        QB qb = new QB("TJ^H\u0014QEQY\u001fCc`VZR");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strVd};
        Method method = cls.getMethod(C1561oA.Yd("\u0011\u0010 \u007f'\"$\u0016\u001f\u0006\u0019', \u001b\u001e", (short) (C1633zX.Xd() ^ (-31050))), clsArr);
        try {
            method.setAccessible(true);
            ActivityManager activityManager = (ActivityManager) method.invoke(context, objArr);
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            ReactNativeFirebaseJSON sharedInstance = ReactNativeFirebaseJSON.getSharedInstance();
            String strQd = Xg.qd("-;2A?:62669B?KIPJA=@CUKYMY_FVJWP_", (short) (OY.Xd() ^ 25903), (short) (OY.Xd() ^ 25367));
            if (sharedInstance.contains(strQd)) {
                ArrayList<String> arrayValue = sharedInstance.getArrayValue(strQd);
                if (arrayValue.size() != 0) {
                    List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                    String shortClassName = appTasks.size() > 0 ? appTasks.get(0).getTaskInfo().baseActivity.getShortClassName() : "";
                    if (!"".equals(shortClassName) && arrayValue.contains(shortClassName)) {
                        return false;
                    }
                }
            }
            short sXd2 = (short) (C1580rY.Xd() ^ (-6343));
            short sXd3 = (short) (C1580rY.Xd() ^ (-18497));
            int[] iArr2 = new int["S\u00174l\u0011\u0001'\u0017sy @X\u0018\th%L1^yDZ".length()];
            QB qb2 = new QB("S\u00174l\u0011\u0001'\u0017sy @X\u0018\th%L1^yDZ");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(ZO.xd("I@G\n-\u000e4YLrN>I\u000b", (short) (C1607wl.Xd() ^ 16999), (short) (C1607wl.Xd() ^ 16760)), new Class[0]);
            try {
                method2.setAccessible(true);
                String str = (String) method2.invoke(context, objArr2);
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(str)) {
                        try {
                            return ((ReactContext) context).getLifecycleState() == LifecycleState.RESUMED;
                        } catch (ClassCastException unused) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static Boolean isExpo() {
        return hasPackageClass(EXPO_CORE_PACKAGE, EXPO_REGISTRY_CLASS);
    }

    public static Boolean isFlutter() {
        return hasPackageClass(FLUTTER_CORE_PACKAGE, FLUTTER_REGISTRY_CLASS);
    }

    public static Boolean isReactNative() {
        return Boolean.valueOf(!isExpo().booleanValue() && hasPackageClass(REACT_NATIVE_CORE_PACKAGE, REACT_NATIVE_REGISTRY_CLASS).booleanValue());
    }

    public static WritableArray jsonArrayToWritableArray(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableArrayCreateArray.pushDouble(jSONArray.getDouble(i2));
            } else if (obj instanceof Number) {
                writableArrayCreateArray.pushInt(jSONArray.getInt(i2));
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString(jSONArray.getString(i2));
            } else if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(jsonObjectToWritableMap(jSONArray.getJSONObject(i2)));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(jsonArrayToWritableArray(jSONArray.getJSONArray(i2)));
            } else if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap jsonObjectToWritableMap(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        WritableMap writableMapCreateMap = Arguments.createMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableMapCreateMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                writableMapCreateMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                writableMapCreateMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                writableMapCreateMap.putMap(next, jsonObjectToWritableMap(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, jsonArrayToWritableArray(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                writableMapCreateMap.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    private static WritableArray listToWritableArray(List<Object> list) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayPushValue(it.next(), writableArrayCreateArray);
        }
        return writableArrayCreateArray;
    }

    public static void mapPutValue(String str, @Nullable Object obj, WritableMap writableMap) {
        String name;
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        name = obj.getClass().getName();
        name.hashCode();
        switch (name) {
            case "java.lang.Integer":
                writableMap.putInt(str, ((Integer) obj).intValue());
                break;
            case "java.lang.Float":
                writableMap.putDouble(str, ((Float) obj).floatValue());
                break;
            case "org.json.JSONArray$1":
                try {
                    writableMap.putArray(str, jsonArrayToWritableArray((JSONArray) obj));
                    break;
                } catch (JSONException unused) {
                    writableMap.putNull(str);
                    return;
                }
                break;
            case "java.lang.Boolean":
                writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case "java.lang.Long":
                writableMap.putDouble(str, ((Long) obj).longValue());
                break;
            case "java.lang.Double":
                writableMap.putDouble(str, ((Double) obj).doubleValue());
                break;
            case "java.lang.String":
                writableMap.putString(str, (String) obj);
                break;
            case "org.json.JSONObject$1":
                try {
                    writableMap.putMap(str, jsonObjectToWritableMap((JSONObject) obj));
                    break;
                } catch (JSONException unused2) {
                    writableMap.putNull(str);
                    return;
                }
                break;
            default:
                if (List.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putArray(str, listToWritableArray((List) obj));
                    break;
                } else {
                    if (!Map.class.isAssignableFrom(obj.getClass())) {
                        String str2 = "utils:mapPutValue:unknownType:" + name;
                        writableMap.putNull(str);
                    } else {
                        writableMap.putMap(str, mapToWritableMap((Map) obj));
                    }
                    break;
                }
                break;
        }
    }

    public static WritableMap mapToWritableMap(Map<String, Object> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            mapPutValue(entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }

    public static int[] pointToIntArray(@Nullable Point point) {
        return point == null ? new int[0] : new int[]{point.x, point.y};
    }

    public static List<int[]> pointsToIntsList(@Nullable Point[] pointArr) {
        if (pointArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(pointArr.length);
        for (Point point : pointArr) {
            arrayList.add(pointToIntArray(point));
        }
        return arrayList;
    }

    public static Boolean reactNativeHasDevSupport() {
        return hasPackageClass(RN_DEVSUPPORT_PACKAGE, RN_DEVSUPPORT_CLASS);
    }

    public static WritableMap readableMapToWritableMap(ReadableMap readableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.merge(readableMap);
        return writableMapCreateMap;
    }

    public static int[] rectToIntArray(@Nullable Rect rect) {
        return (rect == null || rect.isEmpty()) ? new int[0] : new int[]{rect.left, rect.top, rect.right, rect.bottom};
    }

    public static void sendEvent(ReactContext reactContext, String str, Object obj) {
        if (reactContext != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
        }
    }

    public static String timestampToUTC(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j2 * 1000));
    }
}
