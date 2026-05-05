package bo.app;

import com.braze.models.IBrazeLocation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class l9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f1177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f1178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(String str, double d2, double d3) {
        super(0);
        this.f1176a = str;
        this.f1177b = d2;
        this.f1178c = d3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put("key", this.f1176a).put(IBrazeLocation.LATITUDE, this.f1177b).put(IBrazeLocation.LONGITUDE, this.f1178c);
        lx lxVar = lx.LOCATION_CUSTOM_ATTRIBUTE_ADD;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
