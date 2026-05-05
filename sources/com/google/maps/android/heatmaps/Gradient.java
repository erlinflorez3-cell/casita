package com.google.maps.android.heatmaps;

import android.graphics.Color;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    private class ColorInterval {
        private final int color1;
        private final int color2;
        private final float duration;

        private ColorInterval(int i2, int i3, float f2) {
            this.color1 = i2;
            this.color2 = i3;
            this.duration = f2;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    public Gradient(int[] iArr, float[] fArr, int i2) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (iArr.length == 0) {
            throw new IllegalArgumentException("No colors have been defined");
        }
        for (int i3 = 1; i3 < fArr.length; i3++) {
            if (fArr[i3] <= fArr[i3 - 1]) {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }
        this.mColorMapSize = i2;
        int[] iArr2 = new int[iArr.length];
        this.mColors = iArr2;
        this.mStartPoints = new float[fArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
    }

    private HashMap<Integer, ColorInterval> generateColorIntervals() {
        HashMap<Integer, ColorInterval> map = new HashMap<>();
        if (this.mStartPoints[0] != 0.0f) {
            map.put(0, new ColorInterval(Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0]));
        }
        for (int i2 = 1; i2 < this.mColors.length; i2++) {
            int i3 = i2 - 1;
            Integer numValueOf = Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i3]));
            int[] iArr = this.mColors;
            int i4 = iArr[i3];
            int i5 = iArr[i2];
            float f2 = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            map.put(numValueOf, new ColorInterval(i4, i5, (fArr[i2] - fArr[i3]) * f2));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer numValueOf2 = Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int i6 = this.mColors[length];
            map.put(numValueOf2, new ColorInterval(i6, i6, this.mColorMapSize * (1.0f - this.mStartPoints[length])));
        }
        return map;
    }

    static int interpolateColor(int i2, int i3, float f2) {
        int iAlpha = (int) (((Color.alpha(i3) - Color.alpha(i2)) * f2) + Color.alpha(i2));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i3), Color.green(i3), Color.blue(i3), fArr2);
        float f3 = fArr[0];
        float f4 = fArr2[0];
        if (f3 - f4 > 180.0f) {
            fArr2[0] = f4 + 360.0f;
        } else if (f4 - f3 > 180.0f) {
            fArr[0] = f3 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i4 = 0; i4 < 3; i4++) {
            float f5 = fArr2[i4];
            float f6 = fArr[i4];
            fArr3[i4] = ((f5 - f6) * f2) + f6;
        }
        return Color.HSVToColor(iAlpha, fArr3);
    }

    int[] generateColorMap(double d2) {
        HashMap<Integer, ColorInterval> mapGenerateColorIntervals = generateColorIntervals();
        int[] iArr = new int[this.mColorMapSize];
        ColorInterval colorInterval = mapGenerateColorIntervals.get(0);
        int i2 = 0;
        for (int i3 = 0; i3 < this.mColorMapSize; i3++) {
            if (mapGenerateColorIntervals.containsKey(Integer.valueOf(i3))) {
                colorInterval = mapGenerateColorIntervals.get(Integer.valueOf(i3));
                i2 = i3;
            }
            iArr[i3] = interpolateColor(colorInterval.color1, colorInterval.color2, (i3 - i2) / colorInterval.duration);
        }
        if (d2 != 1.0d) {
            for (int i4 = 0; i4 < this.mColorMapSize; i4++) {
                int i5 = iArr[i4];
                iArr[i4] = Color.argb((int) (((double) Color.alpha(i5)) * d2), Color.red(i5), Color.green(i5), Color.blue(i5));
            }
        }
        return iArr;
    }
}
