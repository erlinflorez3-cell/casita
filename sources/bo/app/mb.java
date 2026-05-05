package bo.app;

import com.braze.managers.BrazeGeofenceManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class mb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BrazeGeofenceManager f1273a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(BrazeGeofenceManager brazeGeofenceManager) {
        super(0);
        this.f1273a = brazeGeofenceManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Reached maximum number of new geofences: " + this.f1273a.getMaxNumToRegister();
    }
}
