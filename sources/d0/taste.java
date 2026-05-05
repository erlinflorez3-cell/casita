package d0;

import c1.crisis;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class taste implements fabricate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18418a;

    public taste(String str) {
        this.f18418a = str;
    }

    @Override // m0.pair
    public final List a() {
        return crisis.f2495b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof taste) && Intrinsics.areEqual(this.f18418a, ((taste) obj).f18418a);
    }

    @Override // d0.fabricate
    public final String getKey() {
        return "app_device_id";
    }

    @Override // d0.fabricate
    public final String getValue() {
        return this.f18418a;
    }

    public final int hashCode() {
        return this.f18418a.hashCode();
    }

    public final String toString() {
        return "AppDeviceId(value=" + this.f18418a + ")";
    }
}
