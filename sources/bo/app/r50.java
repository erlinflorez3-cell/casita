package bo.app;

import com.braze.support.JsonUtils;
import io.sentry.clientreport.DiscardedEvent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r50 {
    public static d10 a(JSONObject jsonObject, l00 request) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(request, "request");
        String optionalString = JsonUtils.getOptionalString(jsonObject, "error");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("auth_error");
        if (jSONObjectOptJSONObject != null) {
            return new i90(request, jSONObjectOptJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject, DiscardedEvent.JsonKeys.REASON), optionalString);
        }
        if (Intrinsics.areEqual(optionalString, "invalid_api_key")) {
            return new x30(optionalString, request);
        }
        if (optionalString != null) {
            return new t(optionalString, request);
        }
        return null;
    }

    public static ma0 b(JSONObject jsonObject, l00 request) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(request, "request");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("optional_auth_error");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new ma0(request, jSONObjectOptJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject, DiscardedEvent.JsonKeys.REASON));
    }
}
