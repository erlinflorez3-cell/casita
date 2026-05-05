package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k70 implements a10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1082a;

    public k70(int i2) {
        this.f1082a = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k70(JSONObject json) {
        this(json.optInt("re_eligibility", -1));
        Intrinsics.checkNotNullParameter(json, "json");
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            return new JSONObject().put("re_eligibility", this.f1082a);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) j70.f989a, 4, (Object) null);
            return null;
        }
    }
}
