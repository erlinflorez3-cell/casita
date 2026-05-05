package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class sq {
    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        sq sqVar = zq.f2423f;
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject2.opt(next);
            Object objOpt2 = jSONObject.opt(next);
            if (objOpt != null) {
                try {
                    if (objOpt instanceof JSONObject) {
                        if (objOpt2 == null || !JsonUtils.areJsonObjectsEqual((JSONObject) objOpt, (JSONObject) objOpt2)) {
                            jSONObject3.put(next, objOpt);
                        }
                    } else if (!Intrinsics.areEqual(objOpt, objOpt2)) {
                        jSONObject3.put(next, objOpt);
                    }
                } catch (JSONException e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) sqVar, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) oq.f1457a, 4, (Object) null);
                    return null;
                }
            }
        }
        return jSONObject3;
    }
}
