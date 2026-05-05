package com.google.maps.android;

/* JADX INFO: loaded from: classes7.dex */
class MathUtil {
    static final double EARTH_RADIUS = 6371009.0d;

    MathUtil() {
    }

    static double arcHav(double d2) {
        return Math.asin(Math.sqrt(d2)) * 2.0d;
    }

    static double clamp(double d2, double d3, double d4) {
        return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
    }

    static double hav(double d2) {
        double dSin = Math.sin(d2 * 0.5d);
        return dSin * dSin;
    }

    static double havDistance(double d2, double d3, double d4) {
        return hav(d2 - d3) + (hav(d4) * Math.cos(d2) * Math.cos(d3));
    }

    static double havFromSin(double d2) {
        double d3 = d2 * d2;
        return (d3 / (Math.sqrt(1.0d - d3) + 1.0d)) * 0.5d;
    }

    static double inverseMercator(double d2) {
        return (Math.atan(Math.exp(d2)) * 2.0d) - 1.5707963267948966d;
    }

    static double mercator(double d2) {
        return Math.log(Math.tan((d2 * 0.5d) + 0.7853981633974483d));
    }

    static double mod(double d2, double d3) {
        return ((d2 % d3) + d3) % d3;
    }

    static double sinFromHav(double d2) {
        return Math.sqrt(d2 * (1.0d - d2)) * 2.0d;
    }

    static double sinSumFromHav(double d2, double d3) {
        double dSqrt = Math.sqrt((1.0d - d2) * d2);
        double dSqrt2 = Math.sqrt((1.0d - d3) * d3);
        return ((dSqrt + dSqrt2) - (((dSqrt * d3) + (dSqrt2 * d2)) * 2.0d)) * 2.0d;
    }

    static double wrap(double d2, double d3, double d4) {
        return (d2 < d3 || d2 >= d4) ? mod(d2 - d3, d4 - d3) + d3 : d2;
    }
}
