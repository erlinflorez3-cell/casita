package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class mg0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f1292a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg0(JSONArray jSONArray) {
        super(0);
        this.f1292a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to deserialize triggered actions Json array: " + this.f1292a;
    }
}
