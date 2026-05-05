package com.google.android.material.animation;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes8.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f2, Integer num, Integer num2) {
        float f3 = ((-1) - (((-1) - (r3 >> 24)) | ((-1) - 255))) / 255.0f;
        int iIntValue = num.intValue() >> 16;
        float f4 = ((-1) - (((-1) - (r3 >> 8)) | ((-1) - 255))) / 255.0f;
        float f5 = ((-1) - (((-1) - r3) | ((-1) - 255))) / 255.0f;
        float f6 = ((r6 >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue() >> 16;
        float f7 = ((-1) - (((-1) - (r6 >> 8)) | ((-1) - 255))) / 255.0f;
        float f8 = ((-1) - (((-1) - r6) | ((-1) - 255))) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue + 255) - (iIntValue | 255)) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(f4, 2.2d);
        float fPow3 = (float) Math.pow(f5, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 + 255) - (iIntValue2 | 255)) / 255.0f, 2.2d);
        float fPow5 = fPow2 + ((((float) Math.pow(f7, 2.2d)) - fPow2) * f2);
        float fPow6 = fPow3 + (f2 * (((float) Math.pow(f8, 2.2d)) - fPow3));
        float fPow7 = ((float) Math.pow(fPow + ((fPow4 - fPow) * f2), 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f;
        float fPow9 = ((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f;
        int iRound = Math.round((f3 + ((f6 - f3) * f2)) * 255.0f) << 24;
        int iRound2 = Math.round(fPow7) << 16;
        int iRound3 = (-1) - (((-1) - ((iRound2 + iRound) - (iRound2 & iRound))) & ((-1) - (Math.round(fPow8) << 8)));
        int iRound4 = Math.round(fPow9);
        return Integer.valueOf((iRound3 + iRound4) - (iRound3 & iRound4));
    }
}
