package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hq extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k00 f843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(k00 k00Var) {
        super(0);
        this.f843a = k00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Default queue created for dest " + this.f843a;
    }
}
