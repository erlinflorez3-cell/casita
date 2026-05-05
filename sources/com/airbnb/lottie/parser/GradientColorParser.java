package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GradientColorParser implements ValueParser<GradientColor> {
    private int colorPoints;

    public GradientColorParser(int i2) {
        this.colorPoints = i2;
    }

    private GradientColor addOpacityStopsToGradientIfNeeded(GradientColor gradientColor, List<Float> list) {
        int i2 = this.colorPoints * 4;
        if (list.size() <= i2) {
            return gradientColor;
        }
        float[] positions = gradientColor.getPositions();
        int[] colors = gradientColor.getColors();
        int size = (list.size() - i2) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i3 = 0;
        while (i2 < list.size()) {
            if (i2 % 2 == 0) {
                fArr[i3] = list.get(i2).floatValue();
            } else {
                fArr2[i3] = list.get(i2).floatValue();
                i3++;
            }
            i2++;
        }
        float[] fArrMergeUniqueElements = mergeUniqueElements(gradientColor.getPositions(), fArr);
        int length = fArrMergeUniqueElements.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            float f2 = fArrMergeUniqueElements[i4];
            int iBinarySearch = Arrays.binarySearch(positions, f2);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f2);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i4] = getColorInBetweenColorStops(f2, fArr2[iBinarySearch2], positions, colors);
            } else {
                iArr[i4] = getColorInBetweenOpacityStops(f2, colors[iBinarySearch], fArr, fArr2);
            }
        }
        return new GradientColor(fArrMergeUniqueElements, iArr);
    }

    private int getColorInBetweenOpacityStops(float f2, int i2, float[] fArr, float[] fArr2) {
        float fLerp;
        if (fArr2.length < 2 || f2 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
        }
        for (int i3 = 1; i3 < fArr.length; i3++) {
            float f3 = fArr[i3];
            if (f3 >= f2 || i3 == fArr.length - 1) {
                if (f3 <= f2) {
                    fLerp = fArr2[i3];
                } else {
                    int i4 = i3 - 1;
                    float f4 = fArr[i4];
                    fLerp = MiscUtils.lerp(fArr2[i4], fArr2[i3], (f2 - f4) / (f3 - f4));
                }
                return Color.argb((int) (fLerp * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] mergeUniqueElements(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            float f2 = i3 < fArr.length ? fArr[i3] : Float.NaN;
            float f3 = i4 < fArr2.length ? fArr2[i4] : Float.NaN;
            if (Float.isNaN(f3) || f2 < f3) {
                fArr3[i5] = f2;
                i3++;
            } else if (Float.isNaN(f2) || f3 < f2) {
                fArr3[i5] = f3;
                i4++;
            } else {
                fArr3[i5] = f2;
                i3++;
                i4++;
                i2++;
            }
        }
        return i2 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i2);
    }

    int getColorInBetweenColorStops(float f2, float f3, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f2 == fArr[0]) {
            return iArr[0];
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f4 = fArr[i2];
            if (f4 >= f2 || i2 == fArr.length - 1) {
                if (i2 == fArr.length - 1 && f2 >= f4) {
                    return Color.argb((int) (f3 * 255.0f), Color.red(iArr[i2]), Color.green(iArr[i2]), Color.blue(iArr[i2]));
                }
                int i3 = i2 - 1;
                float f5 = fArr[i3];
                int iEvaluate = GammaEvaluator.evaluate((f2 - f5) / (f4 - f5), iArr[i3], iArr[i2]);
                return Color.argb((int) (f3 * 255.0f), Color.red(iEvaluate), Color.green(iEvaluate), Color.blue(iEvaluate));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    @Override // com.airbnb.lottie.parser.ValueParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.airbnb.lottie.model.content.GradientColor parse(com.airbnb.lottie.parser.moshi.JsonReader r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.GradientColorParser.parse(com.airbnb.lottie.parser.moshi.JsonReader, float):com.airbnb.lottie.model.content.GradientColor");
    }
}
