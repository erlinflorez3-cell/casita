package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jc0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00 f1003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(e00 e00Var) {
        super(0);
        this.f1003a = e00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Adding event to storage with uid " + ((ba) this.f1003a).f262d;
    }
}
