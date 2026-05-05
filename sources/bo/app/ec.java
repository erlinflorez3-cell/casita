package bo.app;

import com.braze.enums.GeofenceTransitionType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ec extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GeofenceTransitionType f565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(long j2, int i2, String str, GeofenceTransitionType geofenceTransitionType) {
        super(0);
        this.f562a = j2;
        this.f563b = i2;
        this.f564c = str;
        this.f565d = geofenceTransitionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Geofence report suppressed since only " + this.f562a + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f563b + "). id:" + this.f564c + " transition:" + this.f565d;
    }
}
