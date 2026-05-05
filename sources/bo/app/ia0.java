package bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f892a;

    public ia0(ArrayList logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.f892a = logs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia0) && Intrinsics.areEqual(this.f892a, ((ia0) obj).f892a);
    }

    public final int hashCode() {
        return this.f892a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerSendLogEvent(logs=" + this.f892a + ')';
    }
}
