package bo.app;

import com.braze.enums.GeofenceTransitionType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeofenceTransitionType f1000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(String str, GeofenceTransitionType geofenceTransitionType) {
        super(0);
        this.f999a = str;
        this.f1000b = geofenceTransitionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to record geofence " + this.f999a + " transition with transition type " + this.f1000b + '.';
    }
}
