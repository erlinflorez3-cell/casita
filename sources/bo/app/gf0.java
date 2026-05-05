package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g10 f755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(g10 g10Var) {
        super(0);
        this.f755a = g10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "No action found for " + this.f755a.a() + " event, publishing NoMatchingTriggerEvent";
    }
}
