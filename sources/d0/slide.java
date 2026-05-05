package d0;

import c1.muscle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class slide implements fabricate {

    /* JADX INFO: renamed from: a */
    public final String f18416a;

    /* JADX INFO: renamed from: b */
    public final f0.tongue f18417b;

    public slide(String str, f0.tongue tongueVar) {
        this.f18416a = str;
        this.f18417b = tongueVar;
    }

    @Override // m0.pair
    public final List a() {
        return muscle.f2501b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slide)) {
            return false;
        }
        slide slideVar = (slide) obj;
        return Intrinsics.areEqual(this.f18416a, slideVar.f18416a) && Intrinsics.areEqual(this.f18417b, slideVar.f18417b);
    }

    @Override // d0.fabricate
    public final String getKey() {
        return FirebaseAnalytics.Param.LOCATION;
    }

    @Override // d0.fabricate
    public final String getValue() {
        return this.f18416a;
    }

    public final int hashCode() {
        return this.f18417b.hashCode() + (this.f18416a.hashCode() * 31);
    }

    public final String toString() {
        return "Location(value=" + this.f18416a + ", deviceContext=" + this.f18417b + ")";
    }
}
