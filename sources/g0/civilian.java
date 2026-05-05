package g0;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class civilian {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f19660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19661b;

    public civilian(File file, String str) {
        this.f19660a = file;
        this.f19661b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof civilian)) {
            return false;
        }
        civilian civilianVar = (civilian) obj;
        return Intrinsics.areEqual(this.f19660a, civilianVar.f19660a) && Intrinsics.areEqual(this.f19661b, civilianVar.f19661b);
    }

    public final int hashCode() {
        return this.f19661b.hashCode() + (this.f19660a.hashCode() * 31);
    }

    public final String toString() {
        return "EmulatorFolder(qemuFile=" + this.f19660a + ", pipe=" + this.f19661b + ")";
    }
}
