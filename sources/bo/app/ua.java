package bo.app;

import com.braze.managers.BrazeGeofenceManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ua extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeGeofenceManager f1927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(BrazeGeofenceManager brazeGeofenceManager) {
        super(0);
        this.f1927a = brazeGeofenceManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Geofences enabled status newly set to " + this.f1927a.isGeofencesEnabled() + " during server config update.";
    }
}
