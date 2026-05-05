package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    private static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        Distance() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i2) {
        int i3;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i4 = 0;
        for (int i5 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i5));
            if (num == null) {
                dArr[i4] = pointProviderLab.fromInt(i5);
                iArr3[i4] = i5;
                i4++;
                linkedHashMap.put(Integer.valueOf(i5), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr4 = new int[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            iArr4[i6] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i6]))).intValue();
        }
        int iMin = Math.min(i2, i4);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr2 = new double[iMin][];
        int i7 = 0;
        for (int i8 = 0; i8 < iArr2.length; i8++) {
            dArr2[i8] = pointProviderLab.fromInt(iArr2[i8]);
            i7++;
        }
        int i9 = iMin - i7;
        if (i9 > 0) {
            for (int i10 = 0; i10 < i9; i10++) {
            }
        }
        int[] iArr5 = new int[i4];
        for (int i11 = 0; i11 < i4; i11++) {
            iArr5[i11] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i12 = 0; i12 < iMin; i12++) {
            iArr6[i12] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i13 = 0; i13 < iMin; i13++) {
            distanceArr[i13] = new Distance[iMin];
            for (int i14 = 0; i14 < iMin; i14++) {
                distanceArr[i13][i14] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i15 = 0;
        while (true) {
            if (i15 >= 10) {
                i3 = 0;
                break;
            }
            int i16 = 0;
            while (i16 < iMin) {
                int i17 = i16 + 1;
                for (int i18 = i17; i18 < iMin; i18++) {
                    double dDistance = pointProviderLab.distance(dArr2[i16], dArr2[i18]);
                    distanceArr[i18][i16].distance = dDistance;
                    distanceArr[i18][i16].index = i16;
                    distanceArr[i16][i18].distance = dDistance;
                    distanceArr[i16][i18].index = i18;
                }
                Arrays.sort(distanceArr[i16]);
                for (int i19 = 0; i19 < iMin; i19++) {
                    iArr6[i16][i19] = distanceArr[i16][i19].index;
                }
                i16 = i17;
            }
            int i20 = 0;
            for (int i21 = 0; i21 < i4; i21++) {
                double[] dArr3 = dArr[i21];
                int i22 = iArr5[i21];
                double dDistance2 = pointProviderLab.distance(dArr3, dArr2[i22]);
                double d2 = dDistance2;
                int i23 = -1;
                for (int i24 = 0; i24 < iMin; i24++) {
                    if (distanceArr[i22][i24].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr3, dArr2[i24]);
                        if (dDistance3 < d2) {
                            i23 = i24;
                            d2 = dDistance3;
                        }
                    }
                }
                if (i23 != -1 && Math.abs(Math.sqrt(d2) - Math.sqrt(dDistance2)) > 3.0d) {
                    i20++;
                    iArr5[i21] = i23;
                }
            }
            if (i20 == 0 && i15 != 0) {
                i3 = 0;
                break;
            }
            double[] dArr4 = new double[iMin];
            double[] dArr5 = new double[iMin];
            double[] dArr6 = new double[iMin];
            char c2 = 0;
            Arrays.fill(iArr7, 0);
            int i25 = 0;
            while (i25 < i4) {
                int i26 = iArr5[i25];
                double[] dArr7 = dArr[i25];
                int i27 = iArr4[i25];
                iArr7[i26] = iArr7[i26] + i27;
                double d3 = i27;
                dArr4[i26] = dArr4[i26] + (dArr7[c2] * d3);
                dArr5[i26] = dArr5[i26] + (dArr7[1] * d3);
                dArr6[i26] = dArr6[i26] + (dArr7[2] * d3);
                i25++;
                c2 = 0;
            }
            for (int i28 = 0; i28 < iMin; i28++) {
                int i29 = iArr7[i28];
                if (i29 == 0) {
                    dArr2[i28] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d4 = i29;
                    double d5 = dArr4[i28] / d4;
                    double d6 = dArr5[i28] / d4;
                    double d7 = dArr6[i28] / d4;
                    double[] dArr8 = dArr2[i28];
                    dArr8[0] = d5;
                    dArr8[1] = d6;
                    dArr8[2] = d7;
                }
            }
            i15++;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (i3 < iMin) {
            int i30 = iArr7[i3];
            if (i30 != 0) {
                int i31 = pointProviderLab.toInt(dArr2[i3]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i31))) {
                    linkedHashMap2.put(Integer.valueOf(i31), Integer.valueOf(i30));
                }
            }
            i3++;
        }
        return linkedHashMap2;
    }
}
