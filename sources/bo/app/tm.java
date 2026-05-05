package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class tm extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(JSONObject jSONObject) {
        super(0);
        this.f1879a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Server card json: " + this.f1879a;
    }
}
