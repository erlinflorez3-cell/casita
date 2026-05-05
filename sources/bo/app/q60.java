package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class q60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o60 f1578a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(o60 o60Var) {
        super(0);
        this.f1578a = o60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        StringBuilder sb = new StringBuilder("Clearing PDE from storage with uid ");
        String string = this.f1578a.f260b.getString("cid");
        Intrinsics.checkNotNullExpressionValue(string, "data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
        return sb.append(string).toString();
    }
}
