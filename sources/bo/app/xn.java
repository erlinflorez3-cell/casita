package bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class xn implements f10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2232a;

    public xn(JSONObject jSONObject) {
        this.f2232a = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.n00
    public final boolean a(g10 g10Var) {
        if (!(g10Var instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) g10Var;
        return !StringUtils.isNullOrBlank(ynVar.f2322f) && ynVar.f2322f.equals(this.f2232a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.f2232a);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
