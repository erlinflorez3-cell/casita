package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v80 f553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(v80 v80Var) {
        super(0);
        this.f553a = v80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Incremented invalidApiKeyErrorCounter to " + this.f553a.f2021k.get();
    }
}
