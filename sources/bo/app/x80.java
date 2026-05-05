package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class x80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z80 f2192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a90 f2193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f2194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(z80 z80Var, a90 a90Var, long j2) {
        super(0);
        this.f2192a = z80Var;
        this.f2193b = a90Var;
        this.f2194c = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Moving from " + this.f2192a.f2366d + " -> " + this.f2193b + " with time " + this.f2194c + " for \n" + this.f2192a.a(this.f2194c);
    }
}
