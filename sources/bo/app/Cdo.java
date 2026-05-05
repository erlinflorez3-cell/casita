package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: bo.app.do, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Cdo extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp f505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z80 f506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(cp cpVar, z80 z80Var) {
        super(0);
        this.f505a = cpVar;
        this.f506b = z80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Could not merge other request: " + this.f505a + " into parent: " + this.f506b;
    }
}
