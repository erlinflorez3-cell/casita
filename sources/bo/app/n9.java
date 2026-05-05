package bo.app;

import com.braze.models.IBrazeLocation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IBrazeLocation f1349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(IBrazeLocation iBrazeLocation) {
        super(0);
        this.f1349a = iBrazeLocation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ba(lx.LOCATION_RECORDED, this.f1349a.forJsonPut(), 0.0d, 12);
    }
}
