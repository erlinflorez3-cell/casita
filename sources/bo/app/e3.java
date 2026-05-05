package bo.app;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Braze braze) {
        super(0);
        this.f538a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z9 z9Var = ba.f257g;
        z9Var.getClass();
        Intrinsics.checkNotNullParameter("feed_displayed", "name");
        e00 e00VarA = z9Var.a(new k9());
        if (e00VarA != null) {
            ((ci0) this.f538a.getUdm$android_sdk_base_release()).f403v.a(e00VarA);
        }
        return Unit.INSTANCE;
    }
}
