package d0;

import c1.crisis;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gregarious implements fabricate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18411a;

    public gregarious(String str) {
        this.f18411a = str;
    }

    @Override // m0.pair
    public final List a() {
        return crisis.f2495b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gregarious) && Intrinsics.areEqual(this.f18411a, ((gregarious) obj).f18411a);
    }

    @Override // d0.fabricate
    public final String getKey() {
        return "user_id";
    }

    @Override // d0.fabricate
    public final String getValue() {
        return this.f18411a;
    }

    public final int hashCode() {
        return this.f18411a.hashCode();
    }

    public final String toString() {
        return "UserId(value=" + this.f18411a + ")";
    }
}
