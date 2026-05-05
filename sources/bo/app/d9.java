package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(String str, String str2) {
        super(0);
        this.f470a = str;
        this.f471b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put("geo_id", this.f470a).put("event_type", this.f471b);
        lx lxVar = lx.GEOFENCE;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
