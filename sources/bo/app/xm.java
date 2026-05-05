package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class xm extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f2231a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(JSONObject jSONObject) {
        super(0);
        this.f2231a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Server card was locally dismissed already. Not adding card to storage. Server card: " + this.f2231a;
    }
}
