package com.incode.welcome_sdk.commons.utils;

import androidx.core.util.Pair;
import com.incode.welcome_sdk.data.remote.beans.ResultsStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6646a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6647e = 0;

    public static Map<String, Object> c(JSONObject jSONObject) throws JSONException {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        int i3 = f6646a + 89;
        f6647e = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 % 4;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objB = jSONObject.get(next);
            if (!(objB instanceof JSONArray)) {
                if (objB instanceof JSONObject) {
                    objB = c((JSONObject) objB);
                }
            } else {
                int i5 = f6647e + 75;
                f6646a = i5 % 128;
                if (i5 % 2 == 0) {
                    b((JSONArray) objB);
                    throw null;
                }
                objB = b((JSONArray) objB);
            }
            map.put(next, objB);
        }
        return map;
    }

    private static List<Object> b(JSONArray jSONArray) throws JSONException {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            Object objC = jSONArray.get(i3);
            if (objC instanceof JSONArray) {
                int i4 = f6647e + 115;
                f6646a = i4 % 128;
                int i5 = i4 % 2;
                objC = b((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                int i6 = f6647e + 61;
                f6646a = i6 % 128;
                if (i6 % 2 == 0) {
                    objC = c((JSONObject) objC);
                    int i7 = 24 / 0;
                } else {
                    objC = c((JSONObject) objC);
                }
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static LinkedHashMap<String, Pair<String, ResultsStatus>> d(JSONArray jSONArray) {
        int i2 = 2 % 2;
        LinkedHashMap<String, Pair<String, ResultsStatus>> linkedHashMap = new LinkedHashMap<>();
        int i3 = f6647e + 27;
        f6646a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 4;
        }
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                linkedHashMap.put(jSONObject.optString("key"), new Pair<>(jSONObject.optString("value"), ResultsStatus.valueOf(jSONObject.optString("status"))));
            } catch (IllegalArgumentException e2) {
                Timber.e(e2);
            } catch (JSONException e3) {
                Timber.e(e3);
            }
        }
        int i6 = f6646a + 49;
        f6647e = i6 % 128;
        if (i6 % 2 == 0) {
            return linkedHashMap;
        }
        throw null;
    }

    public static Pair<String, ResultsStatus> e(JSONObject jSONObject) {
        int i2 = 2 % 2;
        try {
            Pair<String, ResultsStatus> pair = new Pair<>(jSONObject.optString("value"), ResultsStatus.valueOf(jSONObject.optString("status")));
            int i3 = f6647e + 55;
            f6646a = i3 % 128;
            int i4 = i3 % 2;
            return pair;
        } catch (IllegalArgumentException e2) {
            Timber.e(e2);
            return null;
        }
    }

    public static Pair<String, Pair<String, ResultsStatus>> a(JSONObject jSONObject) {
        int i2 = 2 % 2;
        try {
            Pair<String, Pair<String, ResultsStatus>> pair = new Pair<>(jSONObject.optString("key"), new Pair(jSONObject.optString("value"), ResultsStatus.valueOf(jSONObject.optString("status"))));
            int i3 = f6647e + 5;
            f6646a = i3 % 128;
            if (i3 % 2 != 0) {
                return pair;
            }
            throw null;
        } catch (IllegalArgumentException e2) {
            Timber.e(e2);
            return null;
        }
    }
}
