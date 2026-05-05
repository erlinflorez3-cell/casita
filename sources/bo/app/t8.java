package bo.app;

import com.braze.support.JsonUtils;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class t8 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(String str, String str2) {
        super(0);
        this.f1821a = str;
        this.f1822b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        cc0 cc0Var;
        JSONObject jSONObject = new JSONObject(this.f1821a);
        String value = jSONObject.getString("name");
        LinkedHashMap linkedHashMap = lx.f1214b;
        Intrinsics.checkNotNullExpressionValue(value, "eventTypeString");
        Intrinsics.checkNotNullParameter(value, "value");
        Object obj = lx.f1214b.get(value);
        if (obj == null) {
            obj = lx.UNKNOWN;
        }
        lx eventType = (lx) obj;
        JSONObject eventData = jSONObject.getJSONObject("data");
        double d2 = jSONObject.getDouble("time");
        String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
        String sessionId = JsonUtils.getOptionalString(jSONObject, "session_id");
        Intrinsics.checkNotNullExpressionValue(eventData, "data");
        String uniqueIdentifier = this.f1822b;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        ba baVar = new ba(eventType, eventData, d2, uniqueIdentifier);
        baVar.a(optionalString);
        if (sessionId != null) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            UUID uuidFromString = UUID.fromString(sessionId);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(sessionId)");
            cc0Var = new cc0(uuidFromString);
        } else {
            cc0Var = null;
        }
        baVar.a(cc0Var);
        return baVar;
    }
}
