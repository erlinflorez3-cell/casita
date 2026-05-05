package bo.app;

import com.braze.support.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class l60 implements f10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1170a;

    public l60(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.isNull(FirebaseAnalytics.Param.CAMPAIGN_ID)) {
            return;
        }
        this.f1170a = jSONObjectOptJSONObject.optString(FirebaseAnalytics.Param.CAMPAIGN_ID, null);
    }

    @Override // bo.app.n00
    public final boolean a(g10 g10Var) {
        if (!(g10Var instanceof m60)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f1170a)) {
            return true;
        }
        m60 m60Var = (m60) g10Var;
        return !StringUtils.isNullOrBlank(m60Var.f1260e) && m60Var.f1260e.equals(this.f1170a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.f1170a == null) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(FirebaseAnalytics.Param.CAMPAIGN_ID, this.f1170a);
            jSONObject.putOpt("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
