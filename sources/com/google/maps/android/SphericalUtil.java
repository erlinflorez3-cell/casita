package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SphericalUtil {
    private SphericalUtil() {
    }

    static double computeAngleBetween(LatLng latLng, LatLng latLng2) {
        return distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
    }

    public static double computeArea(List<LatLng> list) {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }

    public static double computeHeading(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude) - radians2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4)))), -180.0d, 180.0d);
    }

    public static double computeLength(List<LatLng> list) {
        double dDistanceRadians = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        LatLng latLng = null;
        for (LatLng latLng2 : list) {
            if (latLng != null) {
                dDistanceRadians += distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
            }
            latLng = latLng2;
        }
        return dDistanceRadians * 6371009.0d;
    }

    public static LatLng computeOffset(LatLng latLng, double d2, double d3) {
        double d4 = d2 / 6371009.0d;
        double radians = Math.toRadians(d3);
        double radians2 = Math.toRadians(latLng.latitude);
        double radians3 = Math.toRadians(latLng.longitude);
        double dCos = Math.cos(d4);
        double dSin = Math.sin(d4);
        double dSin2 = Math.sin(radians2);
        double dCos2 = dSin * Math.cos(radians2);
        double dCos3 = (dCos * dSin2) + (Math.cos(radians) * dCos2);
        return new LatLng(Math.toDegrees(Math.asin(dCos3)), Math.toDegrees(radians3 + Math.atan2(dCos2 * Math.sin(radians), dCos - (dSin2 * dCos3))));
    }

    public static LatLng computeOffsetOrigin(LatLng latLng, double d2, double d3) {
        double radians = Math.toRadians(d3);
        double d4 = d2 / 6371009.0d;
        double dCos = Math.cos(d4);
        double dSin = Math.sin(d4) * Math.cos(radians);
        double dSin2 = Math.sin(d4) * Math.sin(radians);
        double dSin3 = Math.sin(Math.toRadians(latLng.latitude));
        double d5 = dCos * dCos;
        double d6 = dSin * dSin;
        double d7 = ((d6 * d5) + (d5 * d5)) - ((d5 * dSin3) * dSin3);
        if (d7 < 0.0d) {
            return null;
        }
        double d8 = dSin * dSin3;
        double d9 = d5 + d6;
        double dSqrt = (d8 + Math.sqrt(d7)) / d9;
        double d10 = (dSin3 - (dSin * dSqrt)) / dCos;
        double dAtan2 = Math.atan2(d10, dSqrt);
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            dAtan2 = Math.atan2(d10, (d8 - Math.sqrt(d7)) / d9);
        }
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(dAtan2), Math.toDegrees(Math.toRadians(latLng.longitude) - Math.atan2(dSin2, (dCos * Math.cos(dAtan2)) - (dSin * Math.sin(dAtan2)))));
    }

    public static double computeSignedArea(List<LatLng> list) {
        return computeSignedArea(list, 6371009.0d);
    }

    static double computeSignedArea(List<LatLng> list, double d2) {
        int size = list.size();
        double dPolarTriangleArea = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double dTan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.latitude)) / 2.0d);
        double radians = Math.toRadians(latLng.longitude);
        for (LatLng latLng2 : list) {
            double dTan2 = Math.tan((1.5707963267948966d - Math.toRadians(latLng2.latitude)) / 2.0d);
            double radians2 = Math.toRadians(latLng2.longitude);
            dPolarTriangleArea += polarTriangleArea(dTan2, radians2, dTan, radians);
            dTan = dTan2;
            radians = radians2;
        }
        return dPolarTriangleArea * d2 * d2;
    }

    private static double distanceRadians(double d2, double d3, double d4, double d5) {
        return MathUtil.arcHav(MathUtil.havDistance(d2, d4, d3 - d5));
    }

    public static LatLng interpolate(LatLng latLng, LatLng latLng2, double d2) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double dCos = Math.cos(radians);
        double dCos2 = Math.cos(radians3);
        double dComputeAngleBetween = computeAngleBetween(latLng, latLng2);
        double dSin = Math.sin(dComputeAngleBetween);
        if (dSin < 1.0E-6d) {
            return new LatLng(latLng.latitude + ((latLng2.latitude - latLng.latitude) * d2), latLng.longitude + (d2 * (latLng2.longitude - latLng.longitude)));
        }
        double dSin2 = Math.sin((1.0d - d2) * dComputeAngleBetween) / dSin;
        double dSin3 = Math.sin(dComputeAngleBetween * d2) / dSin;
        double d3 = dCos * dSin2;
        double d4 = dCos2 * dSin3;
        double dCos3 = (Math.cos(radians2) * d3) + (Math.cos(radians4) * d4);
        double dSin4 = (d3 * Math.sin(radians2)) + (d4 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((dSin2 * Math.sin(radians)) + (Math.sin(radians3) * dSin3), Math.sqrt((dCos3 * dCos3) + (dSin4 * dSin4)))), Math.toDegrees(Math.atan2(dSin4, dCos3)));
    }

    private static double polarTriangleArea(double d2, double d3, double d4, double d5) {
        double d6 = d3 - d5;
        double d7 = d2 * d4;
        return Math.atan2(Math.sin(d6) * d7, (d7 * Math.cos(d6)) + 1.0d) * 2.0d;
    }
}
