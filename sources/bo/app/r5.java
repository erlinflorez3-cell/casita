package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f1646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f1647b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(double d2, double d3) {
        super(0);
        this.f1646a = d2;
        this.f1647b = d3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Manually requesting Geofence refresh of with provided latitude - longitude: " + this.f1646a + " - " + this.f1647b;
    }
}
