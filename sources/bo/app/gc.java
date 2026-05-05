package bo.app;

import com.braze.enums.GeofenceTransitionType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeofenceTransitionType f741b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(String str, GeofenceTransitionType geofenceTransitionType) {
        super(0);
        this.f740a = str;
        this.f741b = geofenceTransitionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Geofence report eligible since this geofence/transition combination has never been reported.id:" + this.f740a + " transition:" + this.f741b;
    }
}
