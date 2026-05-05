package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class dh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih f491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IInAppMessage f492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(ih ihVar, InAppMessageBase inAppMessageBase, String str) {
        super(0);
        this.f491a = ihVar;
        this.f492b = inAppMessageBase;
        this.f493c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l00 l00Var = this.f491a.f913g;
        if (l00Var instanceof gd0) {
            this.f492b.setExpirationTimestamp(((gd0) l00Var).f749o);
            ih ihVar = this.f491a;
            v00 v00Var = ihVar.f907a;
            gd0 gd0Var = (gd0) ihVar.f913g;
            ((vw) v00Var).b(d30.class, new d30(gd0Var.f745k, gd0Var.f750p, this.f492b, this.f493c));
        }
        return Unit.INSTANCE;
    }
}
