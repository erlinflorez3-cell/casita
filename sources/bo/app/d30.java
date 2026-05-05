package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class d30 {

    /* JADX INFO: renamed from: a */
    public final g10 f452a;

    /* JADX INFO: renamed from: b */
    public final k10 f453b;

    /* JADX INFO: renamed from: c */
    public final IInAppMessage f454c;

    /* JADX INFO: renamed from: d */
    public final String f455d;

    public d30(g10 triggerEvent, k10 triggeredAction, IInAppMessage inAppMessage, String str) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.f452a = triggerEvent;
        this.f453b = triggeredAction;
        this.f454c = inAppMessage;
        this.f455d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d30)) {
            return false;
        }
        d30 d30Var = (d30) obj;
        return Intrinsics.areEqual(this.f452a, d30Var.f452a) && Intrinsics.areEqual(this.f453b, d30Var.f453b) && Intrinsics.areEqual(this.f454c, d30Var.f454c) && Intrinsics.areEqual(this.f455d, d30Var.f455d);
    }

    public final int hashCode() {
        int iHashCode = (this.f454c.hashCode() + ((this.f453b.hashCode() + (this.f452a.hashCode() * 31)) * 31)) * 31;
        String str = this.f455d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return StringsKt.trimIndent("\n             " + JsonUtils.getPrettyPrintedString(this.f454c.forJsonPut()) + "\n             Triggered Action Id: " + ((bh0) this.f453b).f280a + "\n             Trigger Event: " + this.f452a + "\n             User Id: " + this.f455d + "\n        ");
    }
}
