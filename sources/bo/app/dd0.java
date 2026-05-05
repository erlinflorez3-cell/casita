package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class dd0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(long j2, z80 z80Var) {
        super(0);
        this.f482a = z80Var;
        this.f483b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. " + this.f482a.a(this.f483b);
    }
}
