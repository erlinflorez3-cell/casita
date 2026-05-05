package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.view.ViewCompat;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.SVGLength;

/* JADX INFO: loaded from: classes7.dex */
class Brush {
    private ReadableArray mColors;
    private Matrix mMatrix;
    private PatternView mPattern;
    private final SVGLength[] mPoints;
    private final BrushType mType;
    private boolean mUseContentObjectBoundingBoxUnits;
    private final boolean mUseObjectBoundingBox;
    private Rect mUserSpaceBoundingBox;

    enum BrushType {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    enum BrushUnits {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    Brush(BrushType brushType, SVGLength[] sVGLengthArr, BrushUnits brushUnits) {
        this.mType = brushType;
        this.mPoints = sVGLengthArr;
        this.mUseObjectBoundingBox = brushUnits == BrushUnits.OBJECT_BOUNDING_BOX;
    }

    private RectF getPaintRect(RectF rectF) {
        float f2;
        float f3;
        if (!this.mUseObjectBoundingBox) {
            rectF = new RectF(this.mUserSpaceBoundingBox);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (this.mUseObjectBoundingBox) {
            f2 = rectF.left;
            f3 = rectF.top;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        return new RectF(f2, f3, fWidth + f2, fHeight + f3);
    }

    private double getVal(SVGLength sVGLength, double d2, float f2, float f3) {
        return PropHelper.fromRelative(sVGLength, d2, 0.0d, (this.mUseObjectBoundingBox && sVGLength.unit == SVGLength.UnitType.NUMBER) ? d2 : f2, f3);
    }

    private static void parseGradientStops(ReadableArray readableArray, int i2, float[] fArr, int[] iArr, float f2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 2;
            fArr[i3] = (float) readableArray.getDouble(i4);
            int i5 = readableArray.getInt(i4 + 1);
            int iRound = Math.round((i5 >>> 24) * f2) << 24;
            int i6 = (i5 + ViewCompat.MEASURED_SIZE_MASK) - (i5 | ViewCompat.MEASURED_SIZE_MASK);
            iArr[i3] = (i6 + iRound) - (i6 & iRound);
        }
    }

    void setContentUnits(BrushUnits brushUnits) {
        this.mUseContentObjectBoundingBoxUnits = brushUnits == BrushUnits.OBJECT_BOUNDING_BOX;
    }

    void setGradientColors(ReadableArray readableArray) {
        this.mColors = readableArray;
    }

    void setGradientTransform(Matrix matrix) {
        this.mMatrix = matrix;
    }

    void setPattern(PatternView patternView) {
        this.mPattern = patternView;
    }

    void setUserSpaceBoundingBox(Rect rect) {
        this.mUserSpaceBoundingBox = rect;
    }

    void setupPaint(Paint paint, RectF rectF, float f2, float f3) {
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        int[] iArr2;
        RectF paintRect = getPaintRect(rectF);
        float fWidth = paintRect.width();
        float fHeight = paintRect.height();
        float f4 = paintRect.left;
        float f5 = paintRect.top;
        float textSize = paint.getTextSize();
        if (this.mType == BrushType.PATTERN) {
            double d2 = fWidth;
            double val = getVal(this.mPoints[0], d2, f2, textSize);
            double d3 = fHeight;
            double val2 = getVal(this.mPoints[1], d3, f2, textSize);
            double val3 = getVal(this.mPoints[2], d2, f2, textSize);
            double val4 = getVal(this.mPoints[3], d3, f2, textSize);
            if (val3 <= 1.0d || val4 <= 1.0d) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) val3, (int) val4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF viewBox = this.mPattern.getViewBox();
            if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                canvas.concat(ViewBox.getTransform(viewBox, new RectF((float) val, (float) val2, (float) val3, (float) val4), this.mPattern.mAlign, this.mPattern.mMeetOrSlice));
            }
            if (this.mUseContentObjectBoundingBoxUnits) {
                canvas.scale(fWidth / f2, fHeight / f2);
            }
            this.mPattern.draw(canvas, new Paint(), f3);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.mMatrix;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.mColors.size();
        if (size == 0) {
            FLog.w(ReactConstants.TAG, "Gradient contains no stops");
            return;
        }
        int i2 = size / 2;
        int[] iArr3 = new int[i2];
        float[] fArr3 = new float[i2];
        parseGradientStops(this.mColors, i2, fArr3, iArr3, f3);
        if (i2 == 1) {
            iArr = new int[]{iArr3[0], iArr3[0]};
            fArr = new float[]{fArr3[0], fArr3[0]};
            FLog.w(ReactConstants.TAG, "Gradient contains only one stop");
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        if (this.mType == BrushType.LINEAR_GRADIENT) {
            double d4 = fWidth;
            double d5 = f4;
            double val5 = getVal(this.mPoints[0], d4, f2, textSize) + d5;
            double d6 = fHeight;
            double d7 = f5;
            Shader linearGradient = new LinearGradient((float) val5, (float) (getVal(this.mPoints[1], d6, f2, textSize) + d7), (float) (getVal(this.mPoints[2], d4, f2, textSize) + d5), (float) (getVal(this.mPoints[3], d6, f2, textSize) + d7), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.mMatrix != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.mMatrix);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        if (this.mType == BrushType.RADIAL_GRADIENT) {
            double d8 = fWidth;
            double val6 = getVal(this.mPoints[2], d8, f2, textSize);
            double d9 = fHeight;
            double val7 = getVal(this.mPoints[3], d9, f2, textSize);
            if (val6 <= 0.0d || val7 <= 0.0d) {
                fArr2 = new float[]{fArr[0], fArr[fArr.length - 1]};
                iArr2 = new int[]{iArr[iArr.length - 1], iArr[iArr.length - 1]};
                val7 = d9;
                val6 = d8;
            } else {
                iArr2 = iArr;
                fArr2 = fArr;
            }
            double d10 = val7 / val6;
            Shader radialGradient = new RadialGradient((float) (getVal(this.mPoints[4], d8, f2, textSize) + ((double) f4)), (float) (getVal(this.mPoints[5], d9 / d10, f2, textSize) + (((double) f5) / d10)), (float) val6, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d10);
            Matrix matrix5 = this.mMatrix;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
