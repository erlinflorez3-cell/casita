package io.cobrowse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class ObjectMapper {
    ObjectMapper() {
    }

    static JSONObject toJSONObject(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JSONObject(map);
    }

    static List<Object> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object objOpt = jSONArray.opt(i2);
            if (objOpt instanceof JSONArray) {
                objOpt = toList((JSONArray) objOpt);
            } else if (objOpt instanceof JSONObject) {
                objOpt = toMap((JSONObject) objOpt);
            }
            arrayList.add(objOpt);
        }
        return arrayList;
    }

    static Map<String, Object> toMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONArray) {
                objOpt = toList((JSONArray) objOpt);
            } else if (objOpt instanceof JSONObject) {
                objOpt = toMap((JSONObject) objOpt);
            }
            map.put(next, objOpt);
        }
        return map;
    }
}
