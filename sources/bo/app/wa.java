package bo.app;

import com.braze.managers.BrazeGeofenceManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wa extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BrazeGeofenceManager f2124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(BrazeGeofenceManager brazeGeofenceManager) {
        super(0);
        this.f2124a = brazeGeofenceManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Max number to register newly set to " + this.f2124a.getMaxNumToRegister() + " via server config.";
    }
}
