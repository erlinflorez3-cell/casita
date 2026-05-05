package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class v8 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(String str) {
        super(0);
        this.f2007a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f2007a);
        jSONObject.put("ids", jSONArray);
        return new ba(lx.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject, 0.0d, 12);
    }
}
