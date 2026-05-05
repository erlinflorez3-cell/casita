package com.airbnb.lottie.utils;

/* JADX INFO: loaded from: classes2.dex */
public class GammaEvaluator {
    private static float EOCF_sRGB(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float OECF_sRGB(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int evaluate(float f2, int i2, int i3) {
        if (i2 == i3 || f2 <= 0.0f) {
            return i2;
        }
        if (f2 >= 1.0f) {
            return i3;
        }
        float f3 = ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255))) / 255.0f;
        int i4 = i2 >> 8;
        float f4 = ((i4 + 255) - (i4 | 255)) / 255.0f;
        int i5 = i3 >> 16;
        float fEOCF_sRGB = EOCF_sRGB(((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))) / 255.0f);
        float fEOCF_sRGB2 = EOCF_sRGB(f4);
        float fEOCF_sRGB3 = EOCF_sRGB((i2 & 255) / 255.0f);
        float fEOCF_sRGB4 = EOCF_sRGB(((i5 + 255) - (i5 | 255)) / 255.0f);
        float fEOCF_sRGB5 = fEOCF_sRGB2 + ((EOCF_sRGB(((i3 >> 8) & 255) / 255.0f) - fEOCF_sRGB2) * f2);
        float fEOCF_sRGB6 = fEOCF_sRGB3 + (f2 * (EOCF_sRGB((i3 & 255) / 255.0f) - fEOCF_sRGB3));
        float fOECF_sRGB = OECF_sRGB(fEOCF_sRGB + ((fEOCF_sRGB4 - fEOCF_sRGB) * f2)) * 255.0f;
        float fOECF_sRGB2 = OECF_sRGB(fEOCF_sRGB5) * 255.0f;
        float fOECF_sRGB3 = OECF_sRGB(fEOCF_sRGB6) * 255.0f;
        int iRound = (Math.round(fOECF_sRGB) << 16) | (Math.round((f3 + (((((i3 >> 24) & 255) / 255.0f) - f3) * f2)) * 255.0f) << 24) | (Math.round(fOECF_sRGB2) << 8);
        int iRound2 = Math.round(fOECF_sRGB3);
        return (iRound + iRound2) - (iRound & iRound2);
    }
}
