package bo.app;

import com.braze.Braze;
import com.braze.location.IBrazeLocationApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f174a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(Braze braze) {
        super(0);
        this.f174a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zd zdVar = ((ci0) this.f174a.getUdm$android_sdk_base_release()).f406y;
        sd sdVar = zdVar.f2385b;
        yd manualLocationUpdateCallback = new yd(zdVar);
        sdVar.getClass();
        Intrinsics.checkNotNullParameter(manualLocationUpdateCallback, "manualLocationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = sdVar.f1760a;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.requestSingleLocationUpdate(manualLocationUpdateCallback);
        }
        return Unit.INSTANCE;
    }
}
