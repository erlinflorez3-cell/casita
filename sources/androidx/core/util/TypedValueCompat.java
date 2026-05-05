package androidx.core.util;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }

    public static int getUnitFromComplexDimension(int i2) {
        return i2 & 15;
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i2, float f2, DisplayMetrics displayMetrics) {
        float f3;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i2, f2, displayMetrics);
        }
        if (i2 == 0) {
            return f2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalArgumentException("Invalid unitToConvertTo " + i2);
                        }
                        if (displayMetrics.xdpi == 0.0f) {
                            return 0.0f;
                        }
                        f2 /= displayMetrics.xdpi;
                        f3 = INCHES_PER_MM;
                    } else {
                        if (displayMetrics.xdpi == 0.0f) {
                            return 0.0f;
                        }
                        f3 = displayMetrics.xdpi;
                    }
                } else {
                    if (displayMetrics.xdpi == 0.0f) {
                        return 0.0f;
                    }
                    f2 /= displayMetrics.xdpi;
                    f3 = INCHES_PER_PT;
                }
            } else {
                if (displayMetrics.scaledDensity == 0.0f) {
                    return 0.0f;
                }
                f3 = displayMetrics.scaledDensity;
            }
        } else {
            if (displayMetrics.density == 0.0f) {
                return 0.0f;
            }
            f3 = displayMetrics.density;
        }
        return f2 / f3;
    }

    public static float dpToPx(float f2, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f2, displayMetrics);
    }

    public static float pxToDp(float f2, DisplayMetrics displayMetrics) {
        return deriveDimension(1, f2, displayMetrics);
    }

    public static float spToPx(float f2, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f2, displayMetrics);
    }

    public static float pxToSp(float f2, DisplayMetrics displayMetrics) {
        return deriveDimension(2, f2, displayMetrics);
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        public static float deriveDimension(int i2, float f2, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i2, f2, displayMetrics);
        }
    }
}
