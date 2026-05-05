package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class MatrixExt {
    private static final float[] sTemp = new float[16];

    private MatrixExt() {
    }

    public static void setRotate(float[] fArr, float f2, float f3, float f4) {
        Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f2, f3, f4);
    }

    public static void preRotate(float[] fArr, float f2, float f3, float f4) {
        normalize(fArr, f3, f4);
        Matrix.rotateM(fArr, 0, f2, 0.0f, 0.0f, 1.0f);
        denormalize(fArr, f3, f4);
    }

    public static void postRotate(float[] fArr, float f2, float f3, float f4) {
        float[] fArr2 = sTemp;
        synchronized (fArr2) {
            Matrix.setIdentityM(fArr2, 0);
            normalize(fArr2, f3, f4);
            Matrix.rotateM(fArr2, 0, f2, 0.0f, 0.0f, 1.0f);
            denormalize(fArr2, f3, f4);
            Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public static void preVerticalFlip(float[] fArr, float f2) {
        normalize(fArr, 0.0f, f2);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        denormalize(fArr, 0.0f, f2);
    }

    public static String toString(float[] fArr, int i2) {
        return String.format(Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", Float.valueOf(fArr[i2]), Float.valueOf(fArr[i2 + 4]), Float.valueOf(fArr[i2 + 8]), Float.valueOf(fArr[i2 + 12]), Float.valueOf(fArr[i2 + 1]), Float.valueOf(fArr[i2 + 5]), Float.valueOf(fArr[i2 + 9]), Float.valueOf(fArr[i2 + 13]), Float.valueOf(fArr[i2 + 2]), Float.valueOf(fArr[i2 + 6]), Float.valueOf(fArr[i2 + 10]), Float.valueOf(fArr[i2 + 14]), Float.valueOf(fArr[i2 + 3]), Float.valueOf(fArr[i2 + 7]), Float.valueOf(fArr[i2 + 11]), Float.valueOf(fArr[i2 + 15]));
    }

    private static void normalize(float[] fArr, float f2, float f3) {
        Matrix.translateM(fArr, 0, f2, f3, 0.0f);
    }

    private static void denormalize(float[] fArr, float f2, float f3) {
        Matrix.translateM(fArr, 0, -f2, -f3, 0.0f);
    }
}
