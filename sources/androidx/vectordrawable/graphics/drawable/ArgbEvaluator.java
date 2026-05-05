package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes4.dex */
public class ArgbEvaluator implements TypeEvaluator {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f2, Object obj, Object obj2) {
        float f3 = ((-1) - (((-1) - (r4 >> 24)) | ((-1) - 255))) / 255.0f;
        int iIntValue = ((Integer) obj).intValue() >> 16;
        float f4 = ((iIntValue + 255) - (iIntValue | 255)) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        int i2 = iIntValue2 >> 24;
        float f5 = ((i2 + 255) - (i2 | 255)) / 255.0f;
        float f6 = ((-1) - (((-1) - (iIntValue2 >> 16)) | ((-1) - 255))) / 255.0f;
        int i3 = iIntValue2 >> 8;
        float f7 = ((-1) - (((-1) - iIntValue2) | ((-1) - 255))) / 255.0f;
        float fPow = (float) Math.pow(f4, 2.2d);
        float fPow2 = (float) Math.pow(((r4 >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow(((r4 + 255) - (r4 | 255)) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(f6, 2.2d);
        float f8 = f3 + ((f5 - f3) * f2);
        float fPow5 = fPow2 + ((((float) Math.pow(((i3 + 255) - (i3 | 255)) / 255.0f, 2.2d)) - fPow2) * f2);
        float fPow6 = fPow3 + (f2 * (((float) Math.pow(f7, 2.2d)) - fPow3));
        return Integer.valueOf((-1) - (((-1) - ((-1) - (((-1) - ((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f2), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f8 * 255.0f) << 24))) & ((-1) - (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8))))) & ((-1) - Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f))));
    }
}
