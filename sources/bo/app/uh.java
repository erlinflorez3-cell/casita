package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class uh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w40 f1944a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(w40 w40Var) {
        super(0);
        this.f1944a = w40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "New session created with ID: " + this.f1944a.f2375a;
    }
}
