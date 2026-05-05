package com.horcrux.svg;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public class CustomFilter {
    public static Bitmap apply(Bitmap bitmap, Bitmap bitmap2, CustomFilterFunction customFilterFunction) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f};
        try {
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
        }
        for (int i3 = 0; i3 < height; i3++) {
            for (int i4 = 0; i4 < width; i4++) {
                int i5 = (i3 * width) + i4;
                int i6 = iArr[i5];
                fArr[0] = ((i6 >> 24) & 255) / 255.0f;
                int i7 = i6 >> 16;
                fArr[1] = ((i7 + 255) - (i7 | 255)) / 255.0f;
                fArr[2] = ((-1) - (((-1) - (i6 >> 8)) | ((-1) - 255))) / 255.0f;
                fArr[3] = ((-1) - (((-1) - i6) | ((-1) - 255))) / 255.0f;
                int i8 = iArr2[i5];
                int i9 = i8 >> 24;
                fArr2[0] = ((i9 + 255) - (i9 | 255)) / 255.0f;
                int i10 = i8 >> 16;
                fArr2[1] = ((i10 + 255) - (i10 | 255)) / 255.0f;
                int i11 = i8 >> 8;
                fArr2[2] = ((i11 + 255) - (i11 | 255)) / 255.0f;
                fArr2[3] = ((i8 + 255) - (i8 | 255)) / 255.0f;
                iArr3[i5] = normalizeFromFloats(customFilterFunction.execute(fArr, fArr2));
            }
        }
        return Bitmap.createBitmap(iArr3, width, height, Bitmap.Config.ARGB_8888);
    }

    public static int normalizeFromFloat(float f2) {
        return Math.min(255, Math.max(0, Math.round(f2 * 255.0f)));
    }

    public static int normalizeFromFloats(float[] fArr) {
        if (fArr.length < 4 || normalizeFromFloat(fArr[0]) <= 0) {
            return 0;
        }
        int iNormalizeFromFloat = normalizeFromFloat(fArr[0]) << 24;
        int iNormalizeFromFloat2 = normalizeFromFloat(fArr[1] / fArr[0]) << 16;
        int i2 = (iNormalizeFromFloat + iNormalizeFromFloat2) - (iNormalizeFromFloat & iNormalizeFromFloat2);
        int iNormalizeFromFloat3 = normalizeFromFloat(fArr[2] / fArr[0]) << 8;
        int i3 = (i2 + iNormalizeFromFloat3) - (i2 & iNormalizeFromFloat3);
        int iNormalizeFromFloat4 = normalizeFromFloat(fArr[3] / fArr[0]);
        return (iNormalizeFromFloat4 + i3) - (iNormalizeFromFloat4 & i3);
    }
}
