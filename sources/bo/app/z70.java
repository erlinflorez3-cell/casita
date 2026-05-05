package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class z70 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a50 f2359a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(a50 a50Var) {
        super(0);
        this.f2359a = a50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Got network change event: " + this.f2359a;
    }
}
