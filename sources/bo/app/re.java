package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class re extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00 f1681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(e00 e00Var) {
        super(0);
        this.f1681a = e00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "SDK is disabled. Not logging event: " + this.f1681a;
    }
}
