package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes7.dex */
public class PolyUtil {
    public static final double DEFAULT_TOLERANCE = 0.1d;

    private PolyUtil() {
    }

    public static boolean containsLocation(double d2, double d3, List<LatLng> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(d3);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.latitude);
        double radians4 = Math.toRadians(latLng.longitude);
        int i2 = 0;
        for (LatLng latLng2 : list) {
            double dWrap = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == radians3 && dWrap == 0.0d) {
                return true;
            }
            double radians5 = Math.toRadians(latLng2.latitude);
            double radians6 = Math.toRadians(latLng2.longitude);
            if (intersects(radians3, radians5, MathUtil.wrap(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, dWrap, z2)) {
                i2++;
            }
            radians3 = radians5;
            radians4 = radians6;
        }
        return (-1) - (((-1) - i2) | ((-1) - 1)) != 0;
    }

    public static boolean containsLocation(LatLng latLng, List<LatLng> list, boolean z2) {
        return containsLocation(latLng.latitude, latLng.longitude, list, z2);
    }

    public static List<LatLng> decode(String str) {
        int i2;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = 1;
            int i7 = 0;
            int i8 = 1;
            while (true) {
                i2 = i3 + 1;
                int iCharAt = str.charAt(i3) - '@';
                i8 += iCharAt << i7;
                i7 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i3 = i2;
            }
            int i9 = ((-1) - (((-1) - i8) | ((-1) - 1)) != 0 ? ~(i8 >> 1) : i8 >> 1) + i4;
            int i10 = 0;
            while (true) {
                i3 = i2 + 1;
                int iCharAt2 = str.charAt(i2) - '@';
                i6 += iCharAt2 << i10;
                i10 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i2 = i3;
            }
            i5 += (1 & i6) != 0 ? ~(i6 >> 1) : i6 >> 1;
            arrayList.add(new LatLng(((double) i9) * 1.0E-5d, ((double) i5) * 1.0E-5d));
            i4 = i9;
        }
        return arrayList;
    }

    public static double distanceToLine(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double radians5 = Math.toRadians(latLng3.latitude);
        double radians6 = Math.toRadians(latLng3.longitude);
        double dCos = Math.cos(radians3);
        double d2 = radians5 - radians3;
        double d3 = (radians6 - radians4) * dCos;
        double d4 = (((radians - radians3) * d2) + (((radians2 - radians4) * dCos) * d3)) / ((d2 * d2) + (d3 * d3));
        return d4 <= 0.0d ? SphericalUtil.computeDistanceBetween(latLng, latLng2) : d4 >= 1.0d ? SphericalUtil.computeDistanceBetween(latLng, latLng3) : SphericalUtil.computeDistanceBetween(latLng, new LatLng(latLng2.latitude + ((latLng3.latitude - latLng2.latitude) * d4), latLng2.longitude + (d4 * (latLng3.longitude - latLng2.longitude))));
    }

    public static String encode(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j2 = 0;
        long j3 = 0;
        for (LatLng latLng : list) {
            long jRound = Math.round(latLng.latitude * 100000.0d);
            long jRound2 = Math.round(latLng.longitude * 100000.0d);
            encode(jRound - j2, stringBuffer);
            encode(jRound2 - j3, stringBuffer);
            j2 = jRound;
            j3 = jRound2;
        }
        return stringBuffer.toString();
    }

    private static void encode(long j2, StringBuffer stringBuffer) {
        long j3 = j2 << 1;
        if (j2 < 0) {
            j3 = ~j3;
        }
        while (j3 >= 32) {
            long j4 = (31 + j3) - (31 | j3);
            stringBuffer.append(Character.toChars((int) (((32 + j4) - (32 & j4)) + 63)));
            j3 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j3 + 63)));
    }

    private static boolean intersects(double d2, double d3, double d4, double d5, double d6, boolean z2) {
        if ((d6 >= 0.0d && d6 >= d4) || ((d6 < 0.0d && d6 < d4) || d5 <= -1.5707963267948966d || d2 <= -1.5707963267948966d || d3 <= -1.5707963267948966d || d2 >= 1.5707963267948966d || d3 >= 1.5707963267948966d || d4 <= -3.141592653589793d)) {
            return false;
        }
        double d7 = (((d4 - d6) * d2) + (d3 * d6)) / d4;
        if (d2 >= 0.0d && d3 >= 0.0d && d5 < d7) {
            return false;
        }
        if ((d2 <= 0.0d && d3 <= 0.0d && d5 >= d7) || d5 >= 1.5707963267948966d) {
            return true;
        }
        if (z2) {
            if (Math.tan(d5) < tanLatGC(d2, d3, d4, d6)) {
                return false;
            }
        } else if (MathUtil.mercator(d5) < mercatorLatRhumb(d2, d3, d4, d6)) {
            return false;
        }
        return true;
    }

    public static boolean isClosedPolygon(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z2) {
        return isLocationOnEdge(latLng, list, z2, 0.1d);
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z2, double d2) {
        return isLocationOnEdgeOrPath(latLng, list, true, z2, d2);
    }

    private static boolean isLocationOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z2, boolean z3, double d2) {
        return locationIndexOnEdgeOrPath(latLng, list, z2, z3, d2) >= 0;
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z2) {
        return isLocationOnPath(latLng, list, z2, 0.1d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z2, double d2) {
        return isLocationOnEdgeOrPath(latLng, list, false, z2, d2);
    }

    private static boolean isOnSegmentGC(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double dHavDistance = MathUtil.havDistance(d2, d6, d3 - d7);
        if (dHavDistance <= d8) {
            return true;
        }
        double dHavDistance2 = MathUtil.havDistance(d4, d6, d5 - d7);
        if (dHavDistance2 <= d8) {
            return true;
        }
        double dHavFromSin = MathUtil.havFromSin(MathUtil.sinFromHav(dHavDistance) * sinDeltaBearing(d2, d3, d4, d5, d6, d7));
        if (dHavFromSin > d8) {
            return false;
        }
        double dHavDistance3 = MathUtil.havDistance(d2, d4, d3 - d5);
        double d9 = ((1.0d - (dHavDistance3 * 2.0d)) * dHavFromSin) + dHavDistance3;
        if (dHavDistance > d9 || dHavDistance2 > d9) {
            return false;
        }
        if (dHavDistance3 < 0.74d) {
            return true;
        }
        double d10 = 1.0d - (2.0d * dHavFromSin);
        return MathUtil.sinSumFromHav((dHavDistance - dHavFromSin) / d10, (dHavDistance2 - dHavFromSin) / d10) > 0.0d;
    }

    public static int locationIndexOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z2, boolean z3, double d2) {
        int size = list.size();
        int i2 = -1;
        if (size == 0) {
            return -1;
        }
        double d3 = d2 / 6371009.0d;
        double dHav = MathUtil.hav(d3);
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        int i3 = 0;
        LatLng latLng2 = list.get(z2 ? size - 1 : 0);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        if (z3) {
            int i4 = 0;
            for (LatLng latLng3 : list) {
                double radians5 = Math.toRadians(latLng3.latitude);
                double radians6 = Math.toRadians(latLng3.longitude);
                if (isOnSegmentGC(radians3, radians4, radians5, radians6, radians, radians2, dHav)) {
                    return Math.max(0, i4 - 1);
                }
                i4++;
                radians3 = radians5;
                radians4 = radians6;
            }
        } else {
            double d4 = radians - d3;
            double d5 = radians + d3;
            double dMercator = MathUtil.mercator(radians3);
            double dMercator2 = MathUtil.mercator(radians);
            for (LatLng latLng4 : list) {
                double radians7 = Math.toRadians(latLng4.latitude);
                double dMercator3 = MathUtil.mercator(radians7);
                double radians8 = Math.toRadians(latLng4.longitude);
                if (Math.max(radians3, radians7) >= d4 && Math.min(radians3, radians7) <= d5) {
                    double dWrap = MathUtil.wrap(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double dWrap2 = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double[] dArr = {dWrap2, dWrap2 + 6.283185307179586d, dWrap2 - 6.283185307179586d};
                    for (int i5 = 0; i5 < 3; i5++) {
                        double d6 = dArr[i5];
                        double d7 = dMercator3 - dMercator;
                        double d8 = (dWrap * dWrap) + (d7 * d7);
                        double dClamp = d8 > 0.0d ? MathUtil.clamp(((d6 * dWrap) + ((dMercator2 - dMercator) * d7)) / d8, 0.0d, 1.0d) : 0.0d;
                        if (MathUtil.havDistance(radians, MathUtil.inverseMercator(dMercator + (dClamp * d7)), d6 - (dClamp * dWrap)) < dHav) {
                            return Math.max(0, i3 - 1);
                        }
                    }
                }
                i3++;
                radians4 = radians8;
                dMercator = dMercator3;
                radians3 = radians7;
                i2 = -1;
            }
        }
        return i2;
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z2) {
        return locationIndexOnPath(latLng, list, z2, 0.1d);
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z2, double d2) {
        return locationIndexOnEdgeOrPath(latLng, list, false, z2, d2);
    }

    private static double mercatorLatRhumb(double d2, double d3, double d4, double d5) {
        return ((MathUtil.mercator(d2) * (d4 - d5)) + (MathUtil.mercator(d3) * d5)) / d4;
    }

    public static List<LatLng> simplify(List<LatLng> list, double d2) {
        LatLng latLng;
        int size = list.size();
        if (size < 1) {
            throw new IllegalArgumentException("Polyline must have at least 1 point");
        }
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        boolean zIsClosedPolygon = isClosedPolygon(list);
        if (zIsClosedPolygon) {
            latLng = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(new LatLng(latLng.latitude + 1.0E-11d, latLng.longitude + 1.0E-11d));
        } else {
            latLng = null;
        }
        Stack stack = new Stack();
        double[] dArr = new double[size];
        int i2 = 0;
        dArr[0] = 1.0d;
        int i3 = size - 1;
        dArr[i3] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i3});
            int i4 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                for (int i5 = iArr[0] + 1; i5 < iArr[1]; i5++) {
                    double dDistanceToLine = distanceToLine(list.get(i5), list.get(iArr[0]), list.get(iArr[1]));
                    if (dDistanceToLine > d3) {
                        d3 = dDistanceToLine;
                        i4 = i5;
                    }
                }
                if (d3 > d2) {
                    dArr[i4] = d3;
                    stack.push(new int[]{iArr[0], i4});
                    stack.push(new int[]{i4, iArr[1]});
                }
                d3 = 0.0d;
            }
        }
        if (zIsClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(latLng);
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng2 : list) {
            if (dArr[i2] != 0.0d) {
                arrayList.add(latLng2);
            }
            i2++;
        }
        return arrayList;
    }

    private static double sinDeltaBearing(double d2, double d3, double d4, double d5, double d6, double d7) {
        double dSin = Math.sin(d2);
        double dCos = Math.cos(d4);
        double dCos2 = Math.cos(d6);
        double d8 = d7 - d3;
        double d9 = d5 - d3;
        double dSin2 = Math.sin(d8) * dCos2;
        double dSin3 = Math.sin(d9) * dCos;
        double d10 = dSin * 2.0d;
        double dSin4 = Math.sin(d6 - d2) + (dCos2 * d10 * MathUtil.hav(d8));
        double dSin5 = Math.sin(d4 - d2) + (d10 * dCos * MathUtil.hav(d9));
        double d11 = ((dSin2 * dSin2) + (dSin4 * dSin4)) * ((dSin3 * dSin3) + (dSin5 * dSin5));
        if (d11 <= 0.0d) {
            return 1.0d;
        }
        return ((dSin2 * dSin5) - (dSin4 * dSin3)) / Math.sqrt(d11);
    }

    private static double tanLatGC(double d2, double d3, double d4, double d5) {
        return ((Math.tan(d2) * Math.sin(d4 - d5)) + (Math.tan(d3) * Math.sin(d5))) / Math.sin(d4);
    }
}
