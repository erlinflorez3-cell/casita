package bo.app;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class o60 extends ba {
    /* JADX WARN: Illegal instructions before constructor call */
    public o60(String campaignId, long j2) throws JSONException {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        LinkedHashMap linkedHashMap = lx.f1214b;
        JSONObject jSONObjectPut = new JSONObject().put("cid", campaignId);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject().put(IBrazeE…_CAMPAIGN_ID, campaignId)");
        this(jSONObjectPut, j2);
    }

    public o60(JSONObject jSONObject, double d2) {
        super(lx.PUSH_DELIVERY_EVENT, jSONObject, d2, 8);
    }
}
