package bo.app;

import com.braze.models.BrazeGeofence;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeGeofence f1352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(BrazeGeofence brazeGeofence) {
        super(0);
        this.f1352a = brazeGeofence;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Adding new geofence to local storage: " + this.f1352a;
    }
}
