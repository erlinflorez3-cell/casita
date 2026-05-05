package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes9.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    LinearDrawingDelegate(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    private void drawLine(Canvas canvas, Paint paint, float f2, float f3, int i2, int i3, int i4) {
        float fClamp = MathUtils.clamp(f2, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f3, 0.0f, 1.0f);
        float fLerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, fClamp2);
        int iClamp = (int) ((i3 * MathUtils.clamp(fLerp, 0.0f, 0.01f)) / 0.01f);
        int iClamp2 = (int) ((i4 * (1.0f - MathUtils.clamp(fLerp2, 0.99f, 1.0f))) / 0.01f);
        float f4 = this.trackLength;
        int i5 = (int) ((fLerp * f4) + iClamp);
        int i6 = (int) ((fLerp2 * f4) - iClamp2);
        float f5 = (-f4) / 2.0f;
        if (i5 <= i6) {
            float f6 = this.displayedCornerRadius;
            float f7 = i5 + f6;
            float f8 = i6 - f6;
            float f9 = f6 * 2.0f;
            paint.setColor(i2);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            if (f7 >= f8) {
                drawRoundedBlock(canvas, paint, new PointF(f7 + f5, 0.0f), new PointF(f8 + f5, 0.0f), f9, this.displayedTrackThickness);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f10 = f7 + f5;
            float f11 = f5 + f8;
            canvas.drawLine(f10, 0.0f, f11, 0.0f, paint);
            if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f7 > 0.0f) {
                drawRoundedBlock(canvas, paint, new PointF(f10, 0.0f), f9, this.displayedTrackThickness);
            }
            if (f8 < this.trackLength) {
                drawRoundedBlock(canvas, paint, new PointF(f11, 0.0f), f9, this.displayedTrackThickness);
            }
        }
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, PointF pointF, float f2, float f3) {
        drawRoundedBlock(canvas, paint, pointF, null, f2, f3);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f2, float f3) {
        float fMin = Math.min(f3, this.displayedTrackThickness);
        float f4 = f2 / 2.0f;
        float fMin2 = Math.min(f4, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f2) / 2.0f, (-fMin) / 2.0f, f4, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(Canvas canvas, Rect rect, float f2, boolean z2, boolean z3) {
        this.trackLength = rect.width();
        float f3 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f3) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f4 = this.trackLength / 2.0f;
        float f5 = f3 / 2.0f;
        canvas.clipRect(-f4, -f5, f4, f5);
        this.useStrokeCap = ((LinearProgressIndicatorSpec) this.spec).trackThickness / 2 == ((LinearProgressIndicatorSpec) this.spec).trackCornerRadius;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) this.spec).trackThickness * f2;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) this.spec).trackThickness / 2, ((LinearProgressIndicatorSpec) this.spec).trackCornerRadius) * f2;
        if (z2 || z3) {
            if ((z2 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z3 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z2 || (z3 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (1.0f - f2)) / 2.0f);
            }
        }
        if (z3 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f2;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void drawStopIndicator(Canvas canvas, Paint paint, int i2, int i3) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i2, i3);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        drawRoundedBlock(canvas, paint, new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), 0.0f), ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i2) {
        drawLine(canvas, paint, activeIndicator.startFraction, activeIndicator.endFraction, MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i2), activeIndicator.gapSize, activeIndicator.gapSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(Canvas canvas, Paint paint, float f2, float f3, int i2, int i3, int i4) {
        drawLine(canvas, paint, f2, f3, MaterialColors.compositeARGBWithAlpha(i2, i3), i4, i4);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredWidth() {
        return -1;
    }
}
