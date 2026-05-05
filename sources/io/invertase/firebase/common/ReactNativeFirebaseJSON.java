package io.invertase.firebase.common;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseJSON {
    private static ReactNativeFirebaseJSON sharedInstance = new ReactNativeFirebaseJSON();
    private JSONObject jsonObject;

    private ReactNativeFirebaseJSON() {
        try {
            this.jsonObject = new JSONObject("{\"android_task_executor_maximum_pool_size\":10,\"android_task_executor_keep_alive_seconds\":3,\"analytics_auto_collection_enabled\":false,\"crashlytics_auto_collection_enabled\":false,\"crashlytics_debug_enabled\":true,\"priority\":\"high\",\"messaging_android_headless_task_timeout\":180000}");
        } catch (JSONException unused) {
        }
    }

    public static ReactNativeFirebaseJSON getSharedInstance() {
        return sharedInstance;
    }

    public boolean contains(String str) {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(str);
    }

    public WritableMap getAll() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        JSONArray jSONArrayNames = this.jsonObject.names();
        for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
            try {
                String string = jSONArrayNames.getString(i2);
                SharedUtils.mapPutValue(string, this.jsonObject.get(string), writableMapCreateMap);
            } catch (JSONException unused) {
            }
        }
        return writableMapCreateMap;
    }

    public ArrayList<String> getArrayValue(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject == null) {
            return arrayList;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i2));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    public boolean getBooleanValue(String str, boolean z2) {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? z2 : jSONObject.optBoolean(str, z2);
    }

    public int getIntValue(String str, int i2) {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? i2 : jSONObject.optInt(str, i2);
    }

    public long getLongValue(String str, long j2) {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? j2 : jSONObject.optLong(str, j2);
    }

    public String getRawJSON() {
        return "{\"android_task_executor_maximum_pool_size\":10,\"android_task_executor_keep_alive_seconds\":3,\"analytics_auto_collection_enabled\":false,\"crashlytics_auto_collection_enabled\":false,\"crashlytics_debug_enabled\":true,\"priority\":\"high\",\"messaging_android_headless_task_timeout\":180000}";
    }

    public String getStringValue(String str, String str2) {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? str2 : jSONObject.optString(str, str2);
    }
}
