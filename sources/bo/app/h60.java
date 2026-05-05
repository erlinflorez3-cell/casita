package bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class h60 implements f10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f807a;

    public h60(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.isNull("product_id")) {
            return;
        }
        this.f807a = jSONObjectOptJSONObject.optString("product_id", null);
    }

    @Override // bo.app.n00
    public final boolean a(g10 g10Var) {
        if (!(g10Var instanceof i60)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f807a)) {
            return true;
        }
        i60 i60Var = (i60) g10Var;
        return !StringUtils.isNullOrBlank(i60Var.f879f) && i60Var.f879f.equals(this.f807a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f807a == null) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("product_id", this.f807a);
            jSONObject.putOpt("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
