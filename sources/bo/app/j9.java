package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class j9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(String str, int i2) {
        super(0);
        this.f994a = str;
        this.f995b = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put("key", this.f994a).put("value", this.f995b);
        lx lxVar = lx.INCREMENT;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
