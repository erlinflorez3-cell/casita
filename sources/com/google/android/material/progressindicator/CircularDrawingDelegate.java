package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes9.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    CircularDrawingDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    private void drawArc(Canvas canvas, Paint paint, float f2, float f3, int i2, int i3, int i4) {
        float f4 = f3 >= f2 ? f3 - f2 : (f3 + 1.0f) - f2;
        float f5 = f2 % 1.0f;
        if (this.totalTrackLengthFraction < 1.0f) {
            float f6 = f5 + f4;
            if (f6 > 1.0f) {
                drawArc(canvas, paint, f5, 1.0f, i2, i3, 0);
                drawArc(canvas, paint, 1.0f, f6, i2, 0, i4);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        if (f5 == 0.0f && f4 >= 0.99f) {
            f4 += ((f4 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f5);
        float fLerp2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f4);
        float degrees2 = (float) Math.toDegrees(i3 / this.adjustedRadius);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i4 / this.adjustedRadius));
        float f7 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i2);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f8 = degrees * 2.0f;
        if (degrees3 < f8) {
            float f9 = degrees3 / f8;
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, f7 + (degrees * f9), this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, f9);
            return;
        }
        float f10 = this.adjustedRadius;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f11 = f7 + degrees;
        canvas.drawArc(rectF, f11, degrees3 - f8, false, paint);
        if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas, paint, f11, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
        drawRoundedBlock(canvas, paint, (f7 + degrees3) - degrees, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float f2, float f3, float f4) {
        drawRoundedBlock(canvas, paint, f2, f3, f4, 1.0f);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float f2, float f3, float f4, float f5) {
        float fMin = (int) Math.min(f4, this.displayedTrackThickness);
        float f6 = f3 / 2.0f;
        float fMin2 = Math.min(f6, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f3) / 2.0f, fMin / 2.0f, f6);
        canvas.save();
        double d2 = f2;
        canvas.translate((float) (((double) this.adjustedRadius) * Math.cos(Math.toRadians(d2))), (float) (((double) this.adjustedRadius) * Math.sin(Math.toRadians(d2))));
        canvas.rotate(f2);
        canvas.scale(f5, f5);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int getSize() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorSize + (((CircularProgressIndicatorSpec) this.spec).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(Canvas canvas, Rect rect, float f2, boolean z2, boolean z3) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        float f3 = (((CircularProgressIndicatorSpec) this.spec).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) this.spec).indicatorInset;
        canvas.translate((f3 * fWidth) + rect.left, (f3 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f4 = -f3;
        canvas.clipRect(f4, f4, f3, f3);
        this.useStrokeCap = ((CircularProgressIndicatorSpec) this.spec).trackThickness / 2 <= ((CircularProgressIndicatorSpec) this.spec).trackCornerRadius;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) this.spec).trackThickness * f2;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) this.spec).trackThickness / 2, ((CircularProgressIndicatorSpec) this.spec).trackCornerRadius) * f2;
        this.adjustedRadius = (((CircularProgressIndicatorSpec) this.spec).indicatorSize - ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        if (z2 || z3) {
            if ((z2 && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z3 && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                this.adjustedRadius += ((1.0f - f2) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
            } else if ((z2 && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (z3 && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
                this.adjustedRadius -= ((1.0f - f2) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
            }
        }
        if (z3 && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f2;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void drawStopIndicator(Canvas canvas, Paint paint, int i2, int i3) {
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i2) {
        drawArc(canvas, paint, activeIndicator.startFraction, activeIndicator.endFraction, MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i2), activeIndicator.gapSize, activeIndicator.gapSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(Canvas canvas, Paint paint, float f2, float f3, int i2, int i3, int i4) {
        drawArc(canvas, paint, f2, f3, MaterialColors.compositeARGBWithAlpha(i2, i3), i4, i4);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredWidth() {
        return getSize();
    }
}
