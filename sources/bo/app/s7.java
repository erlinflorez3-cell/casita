package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s7 implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1746a;

    public s7(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f1746a = apiKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7) && Intrinsics.areEqual(this.f1746a, ((s7) obj).f1746a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.f1746a;
    }

    public final int hashCode() {
        return this.f1746a.hashCode();
    }

    public final String toString() {
        return this.f1746a;
    }
}
