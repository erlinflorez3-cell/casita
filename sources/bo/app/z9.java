package bo.app;

import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class z9 {
    public static /* synthetic */ JSONObject a(z9 z9Var, String str, String str2, int i2) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            str2 = null;
        }
        return z9Var.a(str, str2, null);
    }

    public final e00 a(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return a(new n9(location));
    }

    public final e00 a(Function0 function0) {
        try {
            return (e00) function0.invoke();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) y9.f2290a, 4, (Object) null);
            return null;
        }
    }

    public final JSONObject a(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("bid", str2);
        }
        if (str3 != null) {
            jSONObject.put(InAppMessageBase.MESSAGE_EXTRAS, str3);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) x9.f2195a, 6, (Object) null);
        }
        return jSONObject;
    }
}
