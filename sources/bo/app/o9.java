package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class o9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(String str, JSONObject jSONObject) {
        super(0);
        this.f1428a = str;
        this.f1429b = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put("key", this.f1428a).put("value", this.f1429b);
        lx lxVar = lx.NESTED_CUSTOM_ATTRIBUTE_MERGE;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
