package bo.app;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ca implements u00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f329b;

    public ca(LinkedHashSet eventsList) {
        Intrinsics.checkNotNullParameter(eventsList, "eventsList");
        this.f328a = eventsList;
        this.f329b = eventsList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca) && Intrinsics.areEqual(this.f328a, ((ca) obj).f328a);
    }

    public final int hashCode() {
        return this.f328a.hashCode();
    }

    @Override // bo.app.u00
    public final boolean isEmpty() {
        return this.f329b;
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.f328a + ')';
    }
}
