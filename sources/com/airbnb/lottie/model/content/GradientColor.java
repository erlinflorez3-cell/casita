package com.airbnb.lottie.model.content;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GradientColor {
    private final int[] colors;
    private final float[] positions;

    public GradientColor(float[] fArr, int[] iArr) {
        this.positions = fArr;
        this.colors = iArr;
    }

    private void copyFrom(GradientColor gradientColor) {
        int i2 = 0;
        while (true) {
            int[] iArr = gradientColor.colors;
            if (i2 >= iArr.length) {
                return;
            }
            this.positions[i2] = gradientColor.positions[i2];
            this.colors[i2] = iArr[i2];
            i2++;
        }
    }

    private int getColorForPosition(float f2) {
        int iBinarySearch = Arrays.binarySearch(this.positions, f2);
        if (iBinarySearch >= 0) {
            return this.colors[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        if (i2 == 0) {
            return this.colors[0];
        }
        int[] iArr = this.colors;
        if (i2 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.positions;
        int i3 = i2 - 1;
        float f3 = fArr[i3];
        return GammaEvaluator.evaluate((f2 - f3) / (fArr[i2] - f3), iArr[i3], iArr[i2]);
    }

    public GradientColor copyWithPositions(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            iArr[i2] = getColorForPosition(fArr[i2]);
        }
        return new GradientColor(fArr, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GradientColor gradientColor = (GradientColor) obj;
        return Arrays.equals(this.positions, gradientColor.positions) && Arrays.equals(this.colors, gradientColor.colors);
    }

    public int[] getColors() {
        return this.colors;
    }

    public float[] getPositions() {
        return this.positions;
    }

    public int getSize() {
        return this.colors.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.positions) * 31) + Arrays.hashCode(this.colors);
    }

    public void lerp(GradientColor gradientColor, GradientColor gradientColor2, float f2) {
        int[] iArr;
        if (gradientColor.equals(gradientColor2)) {
            copyFrom(gradientColor);
            return;
        }
        if (f2 <= 0.0f) {
            copyFrom(gradientColor);
            return;
        }
        if (f2 >= 1.0f) {
            copyFrom(gradientColor2);
            return;
        }
        if (gradientColor.colors.length != gradientColor2.colors.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + gradientColor.colors.length + " vs " + gradientColor2.colors.length + ")");
        }
        int i2 = 0;
        while (true) {
            iArr = gradientColor.colors;
            if (i2 >= iArr.length) {
                break;
            }
            this.positions[i2] = MiscUtils.lerp(gradientColor.positions[i2], gradientColor2.positions[i2], f2);
            this.colors[i2] = GammaEvaluator.evaluate(f2, gradientColor.colors[i2], gradientColor2.colors[i2]);
            i2++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.positions;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = gradientColor.colors;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.colors;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }
}
