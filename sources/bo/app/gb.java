package bo.app;

import com.braze.models.IBrazeLocation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IBrazeLocation f738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(IBrazeLocation iBrazeLocation) {
        super(0);
        this.f738a = iBrazeLocation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Single location request was successful, requesting Geofence refresh. Location:\n " + this.f738a;
    }
}
