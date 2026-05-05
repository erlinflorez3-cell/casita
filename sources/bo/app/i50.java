package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class i50 implements IPutIntoJson, u00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f873b;

    public i50(long j2, boolean z2) {
        this.f872a = j2;
        this.f873b = z2;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f872a);
        return jSONObject;
    }

    @Override // bo.app.u00
    public final boolean isEmpty() {
        return !this.f873b;
    }
}
