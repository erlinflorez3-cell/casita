package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class gg0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg0(JSONObject jSONObject) {
        super(0);
        this.f757a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Encountered exception processing templated message: " + this.f757a;
    }
}
