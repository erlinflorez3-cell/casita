package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class j60 extends se0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f986d = BrazeLogger.getBrazeLogTag((Class<?>) j60.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f987c;

    public j60(JSONObject jSONObject) {
        super(jSONObject);
        this.f987c = jSONObject.getJSONObject("data").getString("product_id");
    }

    @Override // bo.app.n00
    public final boolean a(g10 g10Var) {
        if (!(g10Var instanceof i60) || StringUtils.isNullOrBlank(this.f987c)) {
            return false;
        }
        i60 i60Var = (i60) g10Var;
        if (!StringUtils.isNullOrBlank(i60Var.f879f) && i60Var.f879f.equals(this.f987c)) {
            return this.f1764a.a(g10Var);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObjectB = super.b();
        try {
            jSONObjectB.put("type", "purchase_property");
            JSONObject jSONObject = jSONObjectB.getJSONObject("data");
            jSONObject.put("product_id", this.f987c);
            jSONObjectB.put("data", jSONObject);
        } catch (JSONException e2) {
            BrazeLogger.e(f986d, "Caught exception creating Json.", e2);
        }
        return jSONObjectB;
    }
}
