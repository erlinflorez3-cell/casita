package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class xh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w40 f2213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(w40 w40Var) {
        super(0);
        this.f2213a = w40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Session [" + this.f2213a.f2375a + "] being sealed because its end time is over the grace period. Session: " + this.f2213a;
    }
}
