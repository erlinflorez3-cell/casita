package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ou extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f1461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(z80 z80Var) {
        super(0);
        this.f1461a = z80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "About to batch request " + this.f1461a;
    }
}
