package com.google.maps.android.projection;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes7.dex */
public class SphericalMercatorProjection {
    final double mWorldWidth;

    public SphericalMercatorProjection(double d2) {
        this.mWorldWidth = d2;
    }

    public LatLng toLatLng(com.google.maps.android.geometry.Point point) {
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (point.f3535y / this.mWorldWidth))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((point.f3534x / this.mWorldWidth) - 0.5d) * 360.0d);
    }

    public Point toPoint(LatLng latLng) {
        double d2 = (latLng.longitude / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.latitude));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d3 = this.mWorldWidth;
        return new Point(d2 * d3, dLog * d3);
    }
}
