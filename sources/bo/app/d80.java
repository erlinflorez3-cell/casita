package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d10 f469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(z80 z80Var, long j2, d10 d10Var) {
        super(0);
        this.f467a = z80Var;
        this.f468b = j2;
        this.f469c = d10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Request failure received " + this.f467a.a(this.f468b) + " \n" + this.f469c;
    }
}
