package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k50 implements IPutIntoJson, u00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f1074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f1075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i50 f1076d;

    public k50(String str, Boolean bool, Boolean bool2, i50 i50Var) {
        this.f1073a = str;
        this.f1074b = bool;
        this.f1075c = bool2;
        this.f1076d = i50Var;
    }

    public final boolean b() {
        return this.f1074b != null;
    }

    public final boolean c() {
        return this.f1075c != null;
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f1073a;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.f1073a);
        }
        Boolean bool = this.f1074b;
        if (bool != null) {
            jSONObject.put("feed", bool.booleanValue());
        }
        Boolean bool2 = this.f1075c;
        if (bool2 != null) {
            jSONObject.put("triggers", bool2.booleanValue());
        }
        i50 i50Var = this.f1076d;
        if (i50Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", i50Var.f872a);
            jSONObject.put("config", jSONObject2);
        }
        return jSONObject;
    }

    @Override // bo.app.u00
    public final boolean isEmpty() throws JSONException {
        i50 i50Var;
        JSONObject jSONObjectForJsonPut = forJsonPut();
        if (jSONObjectForJsonPut.length() == 0) {
            return true;
        }
        if (this.f1074b == null && this.f1075c == null && (i50Var = this.f1076d) != null) {
            return !i50Var.f873b;
        }
        if (jSONObjectForJsonPut.length() == 1) {
            return jSONObjectForJsonPut.has("user_id");
        }
        return false;
    }
}
