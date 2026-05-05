package com.incode.welcome_sdk.commons.ui;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.incode.welcome_sdk.ui.camera.id_validation.base.IdOrientation;

/* JADX INFO: loaded from: classes5.dex */
public class FlashingBorderView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5822a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5823b = 0;
    private ObjectAnimator animator;
    private int cornerRadius;
    private int currentColor;
    private int defaultColor;
    private boolean drawPassportLine;
    private boolean frozen;
    private boolean isAnimationEnabled;
    private IdOrientation orientation;
    private Paint paint;
    private RectF roundRectBorder;
    private int thickness;

    public FlashingBorderView(Context context) {
        super(context);
        this.drawPassportLine = false;
        this.orientation = IdOrientation.f11819d;
        init();
    }

    public FlashingBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.drawPassportLine = false;
        this.orientation = IdOrientation.f11819d;
        init();
    }

    public FlashingBorderView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.drawPassportLine = false;
        this.orientation = IdOrientation.f11819d;
        init();
    }

    private void init() {
        int i2 = 2 % 2;
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.STROKE);
        enableAnimation();
        int i3 = f5823b + 21;
        f5822a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        int i2 = 2 % 2;
        int i3 = f5823b + 87;
        f5822a = i3 % 128;
        int i4 = i3 % 2;
        super.onAttachedToWindow();
        initFlashingAnimation();
        startFlashingAnimation();
        int i5 = f5822a + 41;
        f5823b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onDetachedFromWindow() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.ui.FlashingBorderView.f5823b
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.FlashingBorderView.f5822a = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L33
            android.animation.ObjectAnimator r1 = r3.animator
            r0 = 47
            int r0 = r0 / 0
            if (r1 == 0) goto L23
        L16:
            android.animation.ObjectAnimator r0 = r3.animator
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L23
            android.animation.ObjectAnimator r0 = r3.animator
            r0.cancel()
        L23:
            r0 = 0
            r3.animator = r0
            super.onDetachedFromWindow()
            int r0 = com.incode.welcome_sdk.commons.ui.FlashingBorderView.f5822a
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.FlashingBorderView.f5823b = r0
            int r1 = r1 % r2
            return
        L33:
            android.animation.ObjectAnimator r0 = r3.animator
            if (r0 == 0) goto L23
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.FlashingBorderView.onDetachedFromWindow():void");
    }

    private void initFlashingAnimation() {
        int i2 = 2 % 2;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this, "alphaAnimated", new ArgbEvaluator(), 255, 0);
        this.animator = objectAnimatorOfObject;
        objectAnimatorOfObject.setDuration(600L);
        this.animator.setInterpolator(new FastOutSlowInInterpolator());
        this.animator.setRepeatMode(2);
        this.animator.setRepeatCount(-1);
        int i3 = f5823b + 81;
        f5822a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
        }
    }

    private void startFlashingAnimation() {
        int i2 = 2 % 2;
        int i3 = f5823b + 85;
        f5822a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
            if (!isAttachedToWindow()) {
                return;
            }
        } else if (!isAttachedToWindow()) {
            return;
        }
        try {
            if (Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale") != 0.0f) {
                int i5 = f5822a + 73;
                f5823b = i5 % 128;
                if (i5 % 2 == 0) {
                    this.animator.start();
                } else {
                    this.animator.start();
                    throw null;
                }
            }
            int i6 = f5822a + 15;
            f5823b = i6 % 128;
            int i7 = i6 % 2;
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    public void enableAnimation() {
        int i2 = 2 % 2;
        int i3 = f5823b + 41;
        int i4 = i3 % 128;
        f5822a = i4;
        int i5 = i3 % 2;
        this.isAnimationEnabled = true;
        int i6 = i4 + 19;
        f5823b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void disableAnimation() {
        int i2 = 2 % 2;
        int i3 = f5822a + 45;
        f5823b = i3 % 128;
        this.isAnimationEnabled = i3 % 2 != 0;
    }

    public void setParams(Rect rect, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f5823b + 23;
        f5822a = i6 % 128;
        int i7 = i6 % 2;
        setParams(rect, i2, i3, i4, IdOrientation.f11819d);
        int i8 = f5822a + 87;
        f5823b = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public void setParams(Rect rect, int i2, int i3, int i4, IdOrientation idOrientation) {
        int i5 = 2 % 2;
        float f2 = i3;
        float f3 = f2 / 2.0f;
        this.roundRectBorder = new RectF(rect.left + f3, rect.top + f3, rect.right - f3, rect.bottom - f3);
        this.cornerRadius = i2;
        this.thickness = i3;
        this.defaultColor = i4;
        this.paint.setStrokeWidth(f2);
        this.orientation = idOrientation;
        postInvalidate();
        int i6 = f5822a + 115;
        f5823b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
        }
    }

    public void setAlphaAnimated(int i2) {
        int i3 = 2 % 2;
        int i4 = f5822a + 51;
        f5823b = i4 % 128;
        int i5 = i4 % 2;
        if (this.isAnimationEnabled) {
            setPaintAlpha(i2);
            int i6 = f5822a + 115;
            f5823b = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setPaintAlpha(int i2) {
        int i3 = 2 % 2;
        int i4 = f5822a + 93;
        f5823b = i4 % 128;
        int i5 = i4 % 2;
        this.paint.setAlpha(i2);
        postInvalidate();
        int i6 = f5822a + 3;
        f5823b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setPaintColor(int i2) {
        int i3 = 2 % 2;
        int i4 = f5823b + 101;
        f5822a = i4 % 128;
        int i5 = i4 % 2;
        this.paint.setColor(i2);
        postInvalidate();
        int i6 = f5823b + 121;
        f5822a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
    }

    public synchronized void setColorAndFreeze(int i2) {
        int i3 = 2 % 2;
        int i4 = f5823b + 15;
        f5822a = i4 % 128;
        if (i4 % 2 == 0) {
            setColorInternal(i2, isDefaultColor(i2));
            setFrozen(false);
        } else {
            setColorInternal(i2, isDefaultColor(i2));
            setFrozen(true);
        }
    }

    public synchronized void setColorAndUnfreeze(int i2) {
        int i3 = 2 % 2;
        int i4 = f5822a + 99;
        f5823b = i4 % 128;
        int i5 = i4 % 2;
        setColorInternal(i2, isDefaultColor(i2));
        setFrozen(false);
        int i6 = f5822a + 71;
        f5823b = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setColor(int i2) {
        int i3 = 2 % 2;
        int i4 = f5822a + 51;
        f5823b = i4 % 128;
        int i5 = i4 % 2;
        setColor(i2, isDefaultColor(i2));
        int i6 = f5822a + 5;
        f5823b = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setColor(int i2, boolean z2) {
        int i3 = 2 % 2;
        int i4 = f5822a;
        int i5 = i4 + 101;
        f5823b = i5 % 128;
        int i6 = i5 % 2;
        if (!this.frozen) {
            setColorInternal(i2, z2);
            int i7 = f5823b + 97;
            f5822a = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = i4 + 25;
        f5823b = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setColorInternal(int i2, boolean z2) {
        int i3 = 2 % 2;
        if (this.currentColor == i2) {
            int i4 = f5823b + 53;
            f5822a = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (z2) {
            int i6 = f5822a + 59;
            f5823b = i6 % 128;
            if (i6 % 2 != 0) {
                enableAnimation();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            enableAnimation();
        } else {
            disableAnimation();
        }
        this.currentColor = i2;
        setPaintColor(i2);
        int i7 = f5823b + 123;
        f5822a = i7 % 128;
        int i8 = i7 % 2;
    }

    private boolean isDefaultColor(int i2) {
        int i3 = 2 % 2;
        int i4 = f5822a;
        int i5 = i4 + 5;
        f5823b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (i2 != this.defaultColor) {
            return false;
        }
        int i6 = i4 + 41;
        f5823b = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public void setFrozen(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f5823b + 113;
        int i4 = i3 % 128;
        f5822a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (z2) {
            int i5 = i4 + 59;
            f5823b = i5 % 128;
            if (i5 % 2 == 0) {
                disableAnimation();
            } else {
                disableAnimation();
                throw null;
            }
        }
        this.frozen = z2;
    }

    public void setDrawPassportLine(boolean z2, IdOrientation idOrientation) {
        int i2 = 2 % 2;
        int i3 = f5823b + 45;
        f5822a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.drawPassportLine = z2;
            this.orientation = idOrientation;
            invalidate();
            int i4 = f5822a + 9;
            f5823b = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.drawPassportLine = z2;
        this.orientation = idOrientation;
        invalidate();
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f5823b + 107;
        f5822a = i3 % 128;
        int i4 = i3 % 2;
        super.onDraw(canvas);
        RectF rectF = this.roundRectBorder;
        if (rectF != null) {
            int i5 = this.cornerRadius;
            canvas.drawRoundRect(rectF, i5, i5, this.paint);
            if (this.drawPassportLine) {
                int i6 = f5823b + 7;
                f5822a = i6 % 128;
                if (i6 % 2 != 0) {
                    setDrawPassportLine(canvas, this.orientation);
                    return;
                }
                setDrawPassportLine(canvas, this.orientation);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.ui.FlashingBorderView$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5824a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5825b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f5826d;

        static {
            int[] iArr = new int[IdOrientation.values().length];
            f5826d = iArr;
            try {
                iArr[IdOrientation.f11819d.ordinal()] = 1;
                int i2 = f5825b + 41;
                f5824a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5826d[IdOrientation.f11818c.ordinal()] = 2;
                int i5 = f5824a + 97;
                f5825b = i5 % 128;
                int i6 = i5 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void setDrawPassportLine(Canvas canvas, IdOrientation idOrientation) {
        int i2 = 2 % 2;
        int i3 = f5823b + 53;
        f5822a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass4.f5826d[idOrientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                float f2 = (this.roundRectBorder.bottom - this.roundRectBorder.top) * 0.78f;
                canvas.drawLine(this.roundRectBorder.left, this.roundRectBorder.top + f2, this.roundRectBorder.right, this.roundRectBorder.top + f2, this.paint);
                return;
            }
            return;
        }
        float f3 = (this.roundRectBorder.right - this.roundRectBorder.left) * 0.78f;
        canvas.drawLine(this.roundRectBorder.left + f3, this.roundRectBorder.top, this.roundRectBorder.left + f3, this.roundRectBorder.bottom, this.paint);
        int i6 = f5822a + 23;
        f5823b = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getPositionLeft() {
        int i2 = 2 % 2;
        int i3 = f5822a + 97;
        f5823b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (int) this.roundRectBorder.left;
        int i6 = f5822a + 109;
        f5823b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getPositionTop() {
        int i2 = 2 % 2;
        int i3 = f5822a + 25;
        f5823b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (int) this.roundRectBorder.top;
        if (i4 != 0) {
            int i6 = 9 / 0;
        }
        return i5;
    }

    public int getPositionRight() {
        int i2 = 2 % 2;
        int i3 = f5823b + 7;
        f5822a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (int) this.roundRectBorder.right;
        int i6 = f5823b + 45;
        f5822a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 17 / 0;
        }
        return i5;
    }

    public int getPositionBottom() {
        int i2 = 2 % 2;
        int i3 = f5822a + 75;
        f5823b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (int) this.roundRectBorder.bottom;
        int i6 = f5823b + 11;
        f5822a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int getThickness() {
        int i2 = 2 % 2;
        int i3 = f5822a + 57;
        int i4 = i3 % 128;
        f5823b = i4;
        int i5 = i3 % 2;
        int i6 = this.thickness;
        int i7 = i4 + 111;
        f5822a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }
}
