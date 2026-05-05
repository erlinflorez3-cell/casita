package androidx.camera.video.internal.workaround;

import android.util.Pair;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    private static double adjustInternal(double d2) {
        return d2 >= 0.0d ? d2 : ((d2 * 10000.0d) - 1.0d) / 10000.0d;
    }

    private CorrectNegativeLatLongForMediaMuxer() {
    }

    public static Pair<Double, Double> adjustGeoLocation(double d2, double d3) {
        if (DeviceQuirks.get(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d2 = adjustInternal(d2);
            d3 = adjustInternal(d3);
        }
        return Pair.create(Double.valueOf(d2), Double.valueOf(d3));
    }
}
