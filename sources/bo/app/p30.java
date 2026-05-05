package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class p30 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q30 f1482a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(q30 q30Var) {
        super(0);
        this.f1482a = q30Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("Failed to return remote paths to assets for type: ");
        InAppMessageBase inAppMessageBase = this.f1482a.f1570g;
        return sb.append(inAppMessageBase != null ? inAppMessageBase.getMessageType() : null).toString();
    }
}
