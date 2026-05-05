package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wg extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b90 f2144a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(b90 b90Var) {
        super(0);
        this.f2144a = b90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Could not parse request parameters for POST request to " + this.f2144a + ", cancelling request.";
    }
}
