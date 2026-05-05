package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class l50 implements IPutIntoJson, u00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f1166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f1167b;

    public l50(JSONObject userObject) {
        Intrinsics.checkNotNullParameter(userObject, "userObject");
        this.f1166a = userObject;
        this.f1167b = new JSONArray().put(userObject);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONArray jsonArrayForJsonPut = this.f1167b;
        Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
        return jsonArrayForJsonPut;
    }

    @Override // bo.app.u00
    public final boolean isEmpty() {
        if (this.f1166a.length() == 0) {
            return true;
        }
        return this.f1166a.length() == 1 && this.f1166a.has("user_id");
    }
}
