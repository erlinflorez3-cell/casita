package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class de0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de0(k10 k10Var, String str) {
        super(0);
        this.f485a = k10Var;
        this.f486b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Received new remote path for triggered action ").append(((bh0) this.f485a).f280a).append(" at "), this.f486b, '.');
    }
}
