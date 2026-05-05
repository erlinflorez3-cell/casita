package bo.app;

import com.braze.enums.GeofenceTransitionType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class fc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GeofenceTransitionType f662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(long j2, int i2, String str, GeofenceTransitionType geofenceTransitionType) {
        super(0);
        this.f659a = j2;
        this.f660b = i2;
        this.f661c = str;
        this.f662d = geofenceTransitionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f659a + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f660b + "). id:" + this.f661c + " transition:" + this.f662d;
    }
}
