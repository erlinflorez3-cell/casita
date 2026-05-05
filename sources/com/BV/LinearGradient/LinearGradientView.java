package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.PixelUtil;

/* JADX INFO: loaded from: classes4.dex */
public class LinearGradientView extends View {
    private float mAngle;
    private float[] mAngleCenter;
    private float[] mBorderRadii;
    private int[] mColors;
    private float[] mEndPoint;
    private float[] mLocations;
    private final Paint mPaint;
    private Path mPathForBorderRadius;
    private LinearGradient mShader;
    private int[] mSize;
    private float[] mStartPoint;
    private RectF mTempRectForBorderRadius;
    private boolean mUseAngle;

    public LinearGradientView(Context context) {
        super(context);
        this.mPaint = new Paint(1);
        this.mStartPoint = new float[]{0.0f, 0.0f};
        this.mEndPoint = new float[]{0.0f, 1.0f};
        this.mUseAngle = false;
        this.mAngleCenter = new float[]{0.5f, 0.5f};
        this.mAngle = 45.0f;
        this.mSize = new int[]{0, 0};
        this.mBorderRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private void drawGradient() {
        float[] fArr;
        float[] fArr2;
        int[] iArr = this.mColors;
        if (iArr != null) {
            float[] fArr3 = this.mLocations;
            if (fArr3 == null || iArr.length == fArr3.length) {
                if (!this.mUseAngle || this.mAngleCenter == null) {
                    float[] fArr4 = this.mStartPoint;
                    float f2 = fArr4[0];
                    int[] iArr2 = this.mSize;
                    int i2 = iArr2[0];
                    float f3 = fArr4[1];
                    int i3 = iArr2[1];
                    fArr = new float[]{f2 * i2, f3 * i3};
                    float[] fArr5 = this.mEndPoint;
                    fArr2 = new float[]{fArr5[0] * i2, fArr5[1] * i3};
                } else {
                    float[] gradientStartPoint = getGradientStartPoint(90.0f - this.mAngle, this.mSize);
                    float[] fArr6 = this.mAngleCenter;
                    float f4 = fArr6[0];
                    int[] iArr3 = this.mSize;
                    float[] fArr7 = {f4 * iArr3[0], fArr6[1] * iArr3[1]};
                    fArr = new float[]{fArr7[0] + gradientStartPoint[0], fArr7[1] - gradientStartPoint[1]};
                    fArr2 = new float[]{fArr7[0] - gradientStartPoint[0], fArr7[1] + gradientStartPoint[1]};
                }
                LinearGradient linearGradient = new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.mColors, this.mLocations, Shader.TileMode.CLAMP);
                this.mShader = linearGradient;
                this.mPaint.setShader(linearGradient);
                invalidate();
            }
        }
    }

    private static float[] getGradientStartPoint(float f2, int[] iArr) {
        float f3 = f2 % 360.0f;
        if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        if (f3 % 90.0f == 0.0f) {
            return getHorizontalOrVerticalStartPoint(f3, iArr);
        }
        float fTan = (float) Math.tan((((double) f3) * 3.141592653589793d) / 180.0d);
        float f4 = (-1.0f) / fTan;
        float[] startCornerToIntersect = getStartCornerToIntersect(f3, iArr);
        float f5 = (startCornerToIntersect[1] - (startCornerToIntersect[0] * f4)) / (fTan - f4);
        return new float[]{f5, fTan * f5};
    }

    private static float[] getHorizontalOrVerticalStartPoint(float f2, int[] iArr) {
        float f3 = iArr[0] / 2.0f;
        float f4 = iArr[1] / 2.0f;
        return f2 == 0.0f ? new float[]{-f3, 0.0f} : f2 == 90.0f ? new float[]{0.0f, -f4} : f2 == 180.0f ? new float[]{f3, 0.0f} : new float[]{0.0f, f4};
    }

    private static float[] getStartCornerToIntersect(float f2, int[] iArr) {
        float f3 = iArr[0] / 2.0f;
        float f4 = iArr[1] / 2.0f;
        return f2 < 90.0f ? new float[]{-f3, -f4} : f2 < 180.0f ? new float[]{f3, -f4} : f2 < 270.0f ? new float[]{f3, f4} : new float[]{-f3, f4};
    }

    private void updatePath() {
        if (this.mPathForBorderRadius == null) {
            this.mPathForBorderRadius = new Path();
            this.mTempRectForBorderRadius = new RectF();
        }
        this.mPathForBorderRadius.reset();
        RectF rectF = this.mTempRectForBorderRadius;
        int[] iArr = this.mSize;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.mPathForBorderRadius.addRoundRect(this.mTempRectForBorderRadius, this.mBorderRadii, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.mPathForBorderRadius;
        if (path == null) {
            canvas.drawPaint(this.mPaint);
        } else {
            canvas.drawPath(path, this.mPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.mSize = new int[]{i2, i3};
        updatePath();
        drawGradient();
    }

    public void setAngle(float f2) {
        this.mAngle = f2;
        drawGradient();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.mAngleCenter = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            fArr[i2] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i2));
        }
        this.mBorderRadii = fArr;
        updatePath();
        drawGradient();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = readableArray.getType(i2) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(i2), getContext()).intValue() : readableArray.getInt(i2);
        }
        this.mColors = iArr;
        drawGradient();
    }

    public void setEndPoint(ReadableArray readableArray) {
        this.mEndPoint = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            fArr[i2] = (float) readableArray.getDouble(i2);
        }
        this.mLocations = fArr;
        drawGradient();
    }

    public void setStartPoint(ReadableArray readableArray) {
        this.mStartPoint = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setUseAngle(boolean z2) {
        this.mUseAngle = z2;
        drawGradient();
    }
}
