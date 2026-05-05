package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class zf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(k10 k10Var, long j2) {
        super(0);
        this.f2391a = k10Var;
        this.f2392b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Performing fallback triggered action with id: <" + ((bh0) this.f2391a).f280a + "> with a delay: " + this.f2392b + " ms";
    }
}
