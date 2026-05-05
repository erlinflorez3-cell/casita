package bo.app;

import android.location.Location;

/* JADX INFO: loaded from: classes4.dex */
public final class qd {
    public static final Double a(qd qdVar, Location location) {
        qdVar.getClass();
        if (location.hasVerticalAccuracy()) {
            return Double.valueOf(location.getVerticalAccuracyMeters());
        }
        return null;
    }
}
