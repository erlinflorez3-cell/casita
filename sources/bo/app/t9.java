package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class t9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cc0 f1824a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(cc0 cc0Var) {
        super(0);
        this.f1824a = cc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ba baVar = new ba(lx.SESSION_START, (JSONObject) null, 0.0d, 14);
        baVar.a(this.f1824a);
        return baVar;
    }
}
