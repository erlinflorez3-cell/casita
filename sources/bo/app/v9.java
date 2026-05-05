package bo.app;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class v9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc0 f2025b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(String str, zc0 zc0Var) {
        super(0);
        this.f2024a = str;
        this.f2025b = zc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        String str;
        JSONObject jSONObjectPut = new JSONObject().put(FirebaseAnalytics.Param.GROUP_ID, this.f2024a);
        int iOrdinal = this.f2025b.ordinal();
        if (iOrdinal == 0) {
            str = "subscribed";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "unsubscribed";
        }
        JSONObject eventData = jSONObjectPut.put("status", str);
        lx lxVar = lx.SUBSCRIPTION_GROUP_UPDATE;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
