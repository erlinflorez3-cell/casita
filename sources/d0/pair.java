package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0.pair f18415c;

    public pair(String str, Object obj, z0.pair pairVar) {
        this.f18413a = str;
        this.f18414b = obj;
        this.f18415c = pairVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Intrinsics.areEqual(this.f18413a, pairVar.f18413a) && Intrinsics.areEqual(this.f18414b, pairVar.f18414b) && Intrinsics.areEqual(this.f18415c, pairVar.f18415c);
    }

    public final int hashCode() {
        return this.f18415c.hashCode() + ((this.f18414b.hashCode() + (this.f18413a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CustomProbeData(key=" + this.f18413a + ", data=" + this.f18414b + ", dataJsonConverter=" + this.f18415c + ")";
    }
}
