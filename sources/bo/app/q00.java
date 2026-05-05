package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class q00 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1562a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q00(JSONObject jSONObject) {
        super(0);
        this.f1562a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to parse json. Returning unknown.\n" + this.f1562a;
    }
}
