package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class Quantiles {

    public static final class Scale {
        private final int scale;

        private Scale(int scale) {
            Preconditions.checkArgument(scale > 0, "Quantile scale must be positive");
            this.scale = scale;
        }

        public ScaleAndIndex index(int index) {
            return new ScaleAndIndex(this.scale, index);
        }

        public ScaleAndIndexes indexes(Collection<Integer> indexes) {
            return new ScaleAndIndexes(this.scale, Ints.toArray(indexes));
        }

        public ScaleAndIndexes indexes(int... indexes) {
            return new ScaleAndIndexes(this.scale, (int[]) indexes.clone());
        }
    }

    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        private ScaleAndIndex(int scale, int index) {
            Quantiles.checkIndex(index, scale);
            this.scale = scale;
            this.index = index;
        }

        public double compute(Collection<? extends Number> dataset) {
            return computeInPlace(Doubles.toArray(dataset));
        }

        public double compute(double... dataset) {
            return computeInPlace((double[]) dataset.clone());
        }

        public double compute(int... dataset) {
            return computeInPlace(Quantiles.intsToDoubles(dataset));
        }

        public double compute(long... dataset) {
            return computeInPlace(Quantiles.longsToDoubles(dataset));
        }

        public double computeInPlace(double... dataset) {
            Preconditions.checkArgument(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.containsNaN(dataset)) {
                return Double.NaN;
            }
            long length = ((long) this.index) * ((long) (dataset.length - 1));
            int iDivide = (int) LongMath.divide(length, this.scale, RoundingMode.DOWN);
            int i2 = (int) (length - (((long) iDivide) * ((long) this.scale)));
            Quantiles.selectInPlace(iDivide, dataset, 0, dataset.length - 1);
            if (i2 == 0) {
                return dataset[iDivide];
            }
            int i3 = iDivide + 1;
            Quantiles.selectInPlace(i3, dataset, i3, dataset.length - 1);
            return Quantiles.interpolate(dataset[iDivide], dataset[i3], i2, this.scale);
        }
    }

    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        private ScaleAndIndexes(int scale, int[] indexes) {
            for (int i2 : indexes) {
                Quantiles.checkIndex(i2, scale);
            }
            Preconditions.checkArgument(indexes.length > 0, "Indexes must be a non empty array");
            this.scale = scale;
            this.indexes = indexes;
        }

        public Map<Integer, Double> compute(Collection<? extends Number> dataset) {
            return computeInPlace(Doubles.toArray(dataset));
        }

        public Map<Integer, Double> compute(double... dataset) {
            return computeInPlace((double[]) dataset.clone());
        }

        public Map<Integer, Double> compute(int... dataset) {
            return computeInPlace(Quantiles.intsToDoubles(dataset));
        }

        public Map<Integer, Double> compute(long... dataset) {
            return computeInPlace(Quantiles.longsToDoubles(dataset));
        }

        public Map<Integer, Double> computeInPlace(double... dataset) {
            int i2 = 0;
            Preconditions.checkArgument(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.containsNaN(dataset)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.indexes;
                int length = iArr.length;
                while (i2 < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i2]), Double.valueOf(Double.NaN));
                    i2++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.indexes;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr6 = this.indexes;
                if (i3 >= iArr6.length) {
                    break;
                }
                long length2 = ((long) iArr6[i3]) * ((long) (dataset.length - 1));
                int iDivide = (int) LongMath.divide(length2, this.scale, RoundingMode.DOWN);
                int i5 = (int) (length2 - (((long) iDivide) * ((long) this.scale)));
                iArr3[i3] = iDivide;
                iArr4[i3] = i5;
                iArr5[i4] = iDivide;
                int i6 = i4 + 1;
                if (i5 != 0) {
                    iArr5[i6] = iDivide + 1;
                    i4 += 2;
                } else {
                    i4 = i6;
                }
                i3++;
            }
            Arrays.sort(iArr5, 0, i4);
            Quantiles.selectAllInPlace(iArr5, 0, i4 - 1, dataset, 0, dataset.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr7 = this.indexes;
                if (i2 >= iArr7.length) {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
                int i7 = iArr3[i2];
                int i8 = iArr4[i2];
                if (i8 == 0) {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i2]), Double.valueOf(dataset[i7]));
                } else {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i2]), Double.valueOf(Quantiles.interpolate(dataset[i7], dataset[i7 + 1], i8, this.scale)));
                }
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIndex(int index, int scale) {
        if (index < 0 || index > scale) {
            throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + scale);
        }
    }

    private static int chooseNextSelection(int[] allRequired, int requiredFrom, int requiredTo, int from, int to) {
        if (requiredFrom == requiredTo) {
            return requiredFrom;
        }
        int i2 = from + to;
        int i3 = i2 >>> 1;
        while (requiredTo > requiredFrom + 1) {
            int i4 = (requiredFrom + requiredTo) >>> 1;
            int i5 = allRequired[i4];
            if (i5 > i3) {
                requiredTo = i4;
            } else {
                if (i5 >= i3) {
                    return i4;
                }
                requiredFrom = i4;
            }
        }
        return (i2 - allRequired[requiredFrom]) - allRequired[requiredTo] > 0 ? requiredTo : requiredFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean containsNaN(double... dataset) {
        for (double d2 : dataset) {
            if (Double.isNaN(d2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double interpolate(double lower, double upper, double remainder, double scale) {
        if (lower == Double.NEGATIVE_INFINITY) {
            return upper == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (upper == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return lower + (((upper - lower) * remainder) / scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] intsToDoubles(int[] ints) {
        int length = ints.length;
        double[] dArr = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = ints[i2];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] longsToDoubles(long[] longs) {
        int length = longs.length;
        double[] dArr = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = longs[i2];
        }
        return dArr;
    }

    public static ScaleAndIndex median() {
        return scale(2).index(1);
    }

    private static void movePivotToStartOfSlice(double[] array, int from, int to) {
        int i2 = (from + to) >>> 1;
        double d2 = array[to];
        double d3 = array[i2];
        boolean z2 = d2 < d3;
        double d4 = array[from];
        boolean z3 = d3 < d4;
        boolean z4 = d2 < d4;
        if (z2 == z3) {
            swap(array, i2, from);
        } else if (z2 != z4) {
            swap(array, from, to);
        }
    }

    private static int partition(double[] array, int from, int to) {
        movePivotToStartOfSlice(array, from, to);
        double d2 = array[from];
        int i2 = to;
        while (to > from) {
            if (array[to] > d2) {
                swap(array, i2, to);
                i2--;
            }
            to--;
        }
        swap(array, from, i2);
        return i2;
    }

    public static Scale percentiles() {
        return scale(100);
    }

    public static Scale quartiles() {
        return scale(4);
    }

    public static Scale scale(int scale) {
        return new Scale(scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectAllInPlace(int[] allRequired, int requiredFrom, int requiredTo, double[] array, int from, int to) {
        int iChooseNextSelection = chooseNextSelection(allRequired, requiredFrom, requiredTo, from, to);
        int i2 = allRequired[iChooseNextSelection];
        selectInPlace(i2, array, from, to);
        int i3 = iChooseNextSelection - 1;
        while (i3 >= requiredFrom && allRequired[i3] == i2) {
            i3--;
        }
        if (i3 >= requiredFrom) {
            selectAllInPlace(allRequired, requiredFrom, i3, array, from, i2 - 1);
        }
        int i4 = iChooseNextSelection + 1;
        while (i4 <= requiredTo && allRequired[i4] == i2) {
            i4++;
        }
        if (i4 <= requiredTo) {
            selectAllInPlace(allRequired, i4, requiredTo, array, i2 + 1, to);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectInPlace(int required, double[] array, int from, int to) {
        if (required != from) {
            while (to > from) {
                int iPartition = partition(array, from, to);
                if (iPartition >= required) {
                    to = iPartition - 1;
                }
                if (iPartition <= required) {
                    from = iPartition + 1;
                }
            }
            return;
        }
        int i2 = from;
        for (int i3 = from + 1; i3 <= to; i3++) {
            if (array[i2] > array[i3]) {
                i2 = i3;
            }
        }
        if (i2 != from) {
            swap(array, i2, from);
        }
    }

    private static void swap(double[] array, int i2, int j2) {
        double d2 = array[i2];
        array[i2] = array[j2];
        array[j2] = d2;
    }
}
