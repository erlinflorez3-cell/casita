package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class qh0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1605a = "ab_install_attribution";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh0(JSONObject jSONObject) {
        super(0);
        this.f1606b = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to write to user object json from prefs with key: [" + this.f1605a + "] value: [" + this.f1606b + "] ";
    }
}
