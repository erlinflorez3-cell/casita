package i1;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class stain implements sea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f19724a;

    public stain(File file) {
        this.f19724a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof stain) && Intrinsics.areEqual(this.f19724a, ((stain) obj).f19724a);
    }

    public final int hashCode() {
        return this.f19724a.hashCode();
    }

    public final String toString() {
        return "PlatformFileProxy(file=" + this.f19724a + ")";
    }
}
