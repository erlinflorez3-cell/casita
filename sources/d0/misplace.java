package d0;

import c1.crisis;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class misplace implements fabricate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18412a;

    public misplace(String str) {
        this.f18412a = str;
    }

    @Override // m0.pair
    public final List a() {
        return crisis.f2495b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof misplace) && Intrinsics.areEqual(this.f18412a, ((misplace) obj).f18412a);
    }

    @Override // d0.fabricate
    public final String getKey() {
        return "app_session_id";
    }

    @Override // d0.fabricate
    public final String getValue() {
        return this.f18412a;
    }

    public final int hashCode() {
        return this.f18412a.hashCode();
    }

    public final String toString() {
        return "AppSessionId(value=" + this.f18412a + ")";
    }
}
