package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ic extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rc f895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(long j2, rc rcVar) {
        super(0);
        this.f894a = j2;
        this.f895b = rcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Geofence request suppressed since only " + this.f894a + " seconds have passed since the last time geofences were requested (minimum interval: " + this.f895b.f1672g + ").";
    }
}
