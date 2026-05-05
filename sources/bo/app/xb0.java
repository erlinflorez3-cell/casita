package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class xb0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f2200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zb0 f2201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb0(double d2, zb0 zb0Var) {
        super(0);
        this.f2200a = d2;
        this.f2201b = zb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "End time '" + this.f2200a + "' for session is less than the start time '" + this.f2201b.f2376b + "' for this session.";
    }
}
