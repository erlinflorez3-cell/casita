package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class q5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f1574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f1575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(double d2, double d3) {
        super(0);
        this.f1574a = d2;
        this.f1575b = d3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: " + this.f1574a + " - " + this.f1575b;
    }
}
