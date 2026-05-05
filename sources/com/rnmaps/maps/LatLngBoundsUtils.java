package com.rnmaps.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes5.dex */
public class LatLngBoundsUtils {
    public static boolean BoundsAreDifferent(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        LatLng center = latLngBounds.getCenter();
        double d2 = center.latitude;
        double d3 = center.longitude;
        double d4 = latLngBounds.northeast.latitude - latLngBounds.southwest.latitude;
        double d5 = latLngBounds.northeast.longitude - latLngBounds.southwest.longitude;
        LatLng center2 = latLngBounds2.getCenter();
        double d6 = center2.latitude;
        double d7 = center2.longitude;
        double d8 = latLngBounds2.northeast.latitude - latLngBounds2.southwest.latitude;
        double d9 = latLngBounds2.northeast.longitude - latLngBounds2.southwest.longitude;
        double dLatitudeEpsilon = LatitudeEpsilon(latLngBounds, latLngBounds2);
        double dLongitudeEpsilon = LongitudeEpsilon(latLngBounds, latLngBounds2);
        return different(d2, d6, dLatitudeEpsilon) || different(d3, d7, dLongitudeEpsilon) || different(d4, d8, dLatitudeEpsilon) || different(d5, d9, dLongitudeEpsilon);
    }

    private static double LatitudeEpsilon(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        return Math.min(Math.abs(latLngBounds.northeast.latitude - latLngBounds.southwest.latitude), Math.abs(latLngBounds2.northeast.latitude - latLngBounds2.southwest.latitude)) / 2560.0d;
    }

    private static double LongitudeEpsilon(LatLngBounds latLngBounds, LatLngBounds latLngBounds2) {
        return Math.min(Math.abs(latLngBounds.northeast.longitude - latLngBounds.southwest.longitude), Math.abs(latLngBounds2.northeast.longitude - latLngBounds2.southwest.longitude)) / 2560.0d;
    }

    private static boolean different(double d2, double d3, double d4) {
        return Math.abs(d2 - d3) > d4;
    }
}
