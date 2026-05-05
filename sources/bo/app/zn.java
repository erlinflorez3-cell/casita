package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zn extends se0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2407d = BrazeLogger.getBrazeLogTag((Class<?>) zn.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2408c;

    public zn(JSONObject jSONObject) {
        super(jSONObject);
        this.f2408c = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.n00
    public final boolean a(g10 g10Var) {
        if (!(g10Var instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) g10Var;
        if (StringUtils.isNullOrBlank(ynVar.f2322f) || !ynVar.f2322f.equals(this.f2408c)) {
            return false;
        }
        return this.f1764a.a(g10Var);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObjectB = super.b();
        try {
            jSONObjectB.put("type", "custom_event_property");
            JSONObject jSONObject = jSONObjectB.getJSONObject("data");
            jSONObject.put("event_name", this.f2408c);
            jSONObjectB.put("data", jSONObject);
        } catch (JSONException e2) {
            BrazeLogger.e(f2407d, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e2);
        }
        return jSONObjectB;
    }
}
