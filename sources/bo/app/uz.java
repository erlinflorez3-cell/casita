package bo.app;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1987a;

    public uz(List geofencesList) {
        Intrinsics.checkNotNullParameter(geofencesList, "geofencesList");
        this.f1987a = geofencesList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz) && Intrinsics.areEqual(this.f1987a, ((uz) obj).f1987a);
    }

    public final int hashCode() {
        return this.f1987a.hashCode();
    }

    public final String toString() {
        return "GeofencesReceivedEvent(geofencesList=" + this.f1987a + ')';
    }
}
