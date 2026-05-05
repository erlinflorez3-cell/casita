package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import androidx.core.util.Preconditions;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TransformUtils {
    public static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private TransformUtils() {
    }

    public static Size rectToSize(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String rectToString(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static Rect sizeToRect(Size size) {
        return sizeToRect(size, 0, 0);
    }

    public static Rect sizeToRect(Size size, int i2, int i3) {
        return new Rect(i2, i3, size.getWidth() + i2, size.getHeight() + i3);
    }

    public static boolean hasCropping(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static RectF sizeToRectF(Size size) {
        return sizeToRectF(size, 0, 0);
    }

    public static RectF sizeToRectF(Size size, int i2, int i3) {
        return new RectF(i2, i3, i2 + size.getWidth(), i3 + size.getHeight());
    }

    public static Size reverseSize(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static SizeF reverseSizeF(SizeF sizeF) {
        return new SizeF(sizeF.getHeight(), sizeF.getWidth());
    }

    public static Size rotateSize(Size size, int i2) {
        Preconditions.checkArgument(i2 % 90 == 0, "Invalid rotation degrees: " + i2);
        return is90or270(within360(i2)) ? reverseSize(size) : size;
    }

    public static RectF rotateRect(RectF rectF, int i2) {
        Preconditions.checkArgument(i2 % 90 == 0, "Invalid rotation degrees: " + i2);
        return is90or270(within360(i2)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    public static boolean isMirrored(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return calculateSignedAngle(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static float calculateSignedAngle(float f2, float f3, float f4, float f5) {
        float f6 = (f2 * f4) + (f3 * f5);
        double dSqrt = Math.sqrt((f2 * f2) + (f3 * f3)) * Math.sqrt((f4 * f4) + (f5 * f5));
        return (float) Math.toDegrees(Math.atan2(((double) ((f2 * f5) - (f3 * f4))) / dSqrt, ((double) f6) / dSqrt));
    }

    public static Size getRotatedSize(Rect rect, int i2) {
        return rotateSize(rectToSize(rect), i2);
    }

    public static int within360(int i2) {
        return ((i2 % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
    }

    public static RectF verticesToRect(float[] fArr) {
        return new RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }

    public static float max(float f2, float f3, float f4, float f5) {
        return Math.max(Math.max(f2, f3), Math.max(f4, f5));
    }

    public static float min(float f2, float f3, float f4, float f5) {
        return Math.min(Math.min(f2, f3), Math.min(f4, f5));
    }

    public static boolean is90or270(int i2) {
        if (i2 == 90 || i2 == 270) {
            return true;
        }
        if (i2 == 0 || i2 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i2);
    }

    public static float[] sizeToVertices(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static float[] rectToVertices(RectF rectF) {
        return new float[]{rectF.left, rectF.top, rectF.right, rectF.top, rectF.right, rectF.bottom, rectF.left, rectF.bottom};
    }

    public static boolean isAspectRatioMatchingWithRoundingError(Size size, Size size2) {
        return isAspectRatioMatchingWithRoundingError(size, false, size2, false);
    }

    public static boolean isAspectRatioMatchingWithRoundingError(Size size, boolean z2, Size size2, boolean z3) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z2) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z3) {
            width4 = size2.getWidth() / size2.getHeight();
            width3 = width4;
        } else {
            width3 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width4 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
        }
        return width >= width4 && width3 >= width2;
    }

    public static Matrix getRectToRect(RectF rectF, RectF rectF2, int i2) {
        return getRectToRect(rectF, rectF2, i2, false);
    }

    public static Matrix getRectToRect(RectF rectF, RectF rectF2, int i2, boolean z2) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i2);
        if (z2) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(getNormalizedToBuffer(rectF2));
        return matrix;
    }

    public static Matrix getNormalizedToBuffer(Rect rect) {
        return getNormalizedToBuffer(new RectF(rect));
    }

    public static Matrix updateSensorToBufferTransform(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static Matrix getNormalizedToBuffer(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix getExifTransform(int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        float f2 = i3;
        float f3 = i4;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        RectF rectF2 = NORMALIZED_RECT;
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
        switch (i2) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f3, f2);
                break;
            case 6:
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f3, f2);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f3, f2);
                break;
            case 8:
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f3, f2);
                break;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static int getRotationDegrees(Matrix matrix) {
        matrix.getValues(new float[9]);
        return within360((int) Math.round(Math.atan2(r2[3], r2[0]) * 57.29577951308232d));
    }
}
