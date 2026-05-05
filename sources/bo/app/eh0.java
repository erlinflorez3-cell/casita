package bo.app;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f576a;

    public eh0(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        this.f576a = triggeredActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh0) && Intrinsics.areEqual(this.f576a, ((eh0) obj).f576a);
    }

    public final int hashCode() {
        return this.f576a.hashCode();
    }

    public final String toString() {
        return "TriggeredActionsReceivedEvent(triggeredActions=" + this.f576a + ')';
    }
}
