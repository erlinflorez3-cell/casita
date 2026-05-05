package bo.app;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d20 implements f10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f450b = new HashSet();

    public d20(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f449a = jSONObject2.getString("id");
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("buttons");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                this.f450b.add(jSONArrayOptJSONArray.getString(i2));
            }
        }
    }

    @Override // bo.app.n00
    public final boolean a(g10 g10Var) {
        if (g10Var instanceof e20) {
            e20 e20Var = (e20) g10Var;
            if (!StringUtils.isNullOrBlank(e20Var.f536e) && e20Var.f536e.equals(this.f449a)) {
                return this.f450b.size() > 0 ? !StringUtils.isNullOrBlank(e20Var.f537f) && this.f450b.contains(e20Var.f537f) : StringUtils.isNullOrBlank(e20Var.f537f);
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f449a);
            if (this.f450b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f450b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
