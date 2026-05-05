package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import com.braze.location.IBrazeGeofenceApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBrazeGeofenceApi f1588a;

    public qa() {
        IBrazeGeofenceApi iBrazeGeofenceApi;
        try {
            Object objNewInstance = Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.braze.location.IBrazeGeofenceApi");
            iBrazeGeofenceApi = (IBrazeGeofenceApi) objNewInstance;
        } catch (Exception unused) {
            iBrazeGeofenceApi = null;
        }
        this.f1588a = iBrazeGeofenceApi;
    }

    public final PendingIntent a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.f1588a;
        if (iBrazeGeofenceApi != null) {
            return iBrazeGeofenceApi.getGeofenceTransitionPendingIntent(context);
        }
        return null;
    }

    public final boolean a() {
        return this.f1588a != null;
    }
}
