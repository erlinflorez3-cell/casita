package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oh0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uh0 f1446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(uh0 uh0Var) {
        super(1);
        this.f1446a = uh0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f1446a.b("user_id", it);
        return Unit.INSTANCE;
    }
}
