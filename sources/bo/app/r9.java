package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class r9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(String str, String str2) {
        super(0);
        this.f1653a = str;
        this.f1654b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put("key", this.f1653a).put("value", this.f1654b);
        lx lxVar = lx.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
