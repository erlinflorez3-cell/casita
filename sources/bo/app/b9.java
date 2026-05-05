package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(String str) {
        super(0);
        this.f252a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f252a);
        jSONObject.put("ids", jSONArray);
        return new ba(lx.NEWS_FEED_CARD_CLICK, jSONObject, 0.0d, 12);
    }
}
