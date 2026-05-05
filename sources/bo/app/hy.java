package bo.app;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class hy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONArray f859a;

    public hy(JSONArray featureFlagsData) {
        Intrinsics.checkNotNullParameter(featureFlagsData, "featureFlagsData");
        this.f859a = featureFlagsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy) && Intrinsics.areEqual(this.f859a, ((hy) obj).f859a);
    }

    public final int hashCode() {
        return this.f859a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.f859a + ')';
    }
}
