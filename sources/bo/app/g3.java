package bo.app;

import com.braze.Braze;
import com.braze.models.IBrazeLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IBrazeLocation f701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(IBrazeLocation iBrazeLocation, Braze braze) {
        super(0);
        this.f701a = iBrazeLocation;
        this.f702b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e00 e00VarA = ba.f257g.a(this.f701a);
        if (e00VarA != null) {
            ((ci0) this.f702b.getUdm$android_sdk_base_release()).f403v.a(e00VarA);
        }
        return Unit.INSTANCE;
    }
}
