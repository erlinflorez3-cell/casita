package bo.app;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.IBrazeLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rb extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BrazeGeofenceManager f1664a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(BrazeGeofenceManager brazeGeofenceManager) {
        super(1);
        this.f1664a = brazeGeofenceManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IBrazeLocation location = (IBrazeLocation) obj;
        Intrinsics.checkNotNullParameter(location, "location");
        this.f1664a.onLocationRequestComplete(location);
        return Unit.INSTANCE;
    }
}
