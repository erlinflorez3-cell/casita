package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zg extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih f2393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONArray f2394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(ih ihVar, JSONArray jSONArray) {
        super(0);
        this.f2393a = ihVar;
        this.f2394b = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((vw) this.f2393a.f907a).b(hy.class, new hy(this.f2394b));
        return Unit.INSTANCE;
    }
}
