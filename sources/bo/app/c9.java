package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f327a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(String str) {
        super(0);
        this.f327a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f327a);
        jSONObject.put("ids", jSONArray);
        return new ba(lx.NEWS_FEED_CARD_IMPRESSION, jSONObject, 0.0d, 12);
    }
}
