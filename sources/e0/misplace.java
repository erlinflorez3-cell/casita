package e0;

import c1.cooperative;
import c1.lifestyle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class misplace implements m0.pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18456a;

    public misplace(List list) {
        this.f18456a = list;
    }

    @Override // m0.pair
    public final List a() {
        lifestyle lifestyleVar = cooperative.f2493c;
        lifestyleVar.getClass();
        return lifestyleVar.f2499a.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof misplace) && Intrinsics.areEqual(this.f18456a, ((misplace) obj).f18456a);
    }

    public final int hashCode() {
        return this.f18456a.hashCode();
    }

    public final String toString() {
        return "OverlayResult(apps=" + this.f18456a + ")";
    }
}
