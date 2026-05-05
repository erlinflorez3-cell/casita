package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes9.dex */
class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    public interface OnActionUpListener {
        void onActionUp(float f2, boolean z2);
    }

    public interface OnRotateListener {
        void onRotate(float f2, boolean z2);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        int[] iArr = R.styleable.ClockHandView;
        int i3 = R.style.Widget_MaterialComponents_TimePicker_Clock;
        Class<?> cls = Class.forName(C1561oA.yd("\u0014 \u0019&&\u001f\u001de\u001e)+0$,5me\u0011\u0013\u0018\f\u001e\u001d", (short) (C1499aX.Xd() ^ (-6307))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("\u001c*!0.)%o88.2t\t=>=5/CC5$7G", (short) (OY.Xd() ^ 13826))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        short sXd = (short) (C1607wl.Xd() ^ 30626);
        short sXd2 = (short) (C1607wl.Xd() ^ 21599);
        int[] iArr2 = new int["\u001d\u0011$\u0012\u001b!\u0007)/#\u001d\u001dz/0/'!55'6".length()];
        QB qb = new QB("\u001d\u0011$\u0012\u001b!\u0007)/#\u001d\u001dz/0/'!55'6");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) + sXd2);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            this.animationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
            this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.circleRadius = typedArray.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
            this.selectorRadius = typedArray.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
            this.selectorStrokeWidth = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
            this.centerDotRadius = r1.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
            int color = typedArray.getColor(R.styleable.ClockHandView_clockHandColor, 0);
            paint.setAntiAlias(true);
            paint.setColor(color);
            setHandRotation(0.0f);
            this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            ViewCompat.setImportantForAccessibility(this, 2);
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void adjustLevel(float f2, float f3) {
        this.currentLevel = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), f2, f3) > ((float) getLeveledCircleRadius(2)) + ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float fCos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f2;
        float f3 = height;
        float fSin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f3;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.selectorRadius, this.paint);
        double dSin = Math.sin(this.degRad);
        double dCos = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f2, f3, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.paint);
        canvas.drawCircle(f2, f3, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f2, float f3) {
        int degrees = (int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)));
        int i2 = degrees + 90;
        return i2 < 0 ? degrees + 450 : i2;
    }

    private int getLeveledCircleRadius(int i2) {
        return i2 == 2 ? Math.round(this.circleRadius * 0.66f) : this.circleRadius;
    }

    private Pair<Float, Float> getValuesForAnimation(float f2) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f2) > 180.0f) {
            if (handRotation > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (handRotation < 180.0f && f2 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f2));
    }

    private boolean handleTouchInput(float f2, float f3, boolean z2, boolean z3, boolean z4) {
        float degreesFromXY = getDegreesFromXY(f2, f3);
        boolean z5 = false;
        boolean z6 = getHandRotation() != degreesFromXY;
        if (z3 && z6) {
            return true;
        }
        if (!z6 && !z2) {
            return false;
        }
        if (z4 && this.animatingOnTouchUp) {
            z5 = true;
        }
        setHandRotation(degreesFromXY, z5);
        return true;
    }

    private void setHandRotationInternal(float f2, boolean z2) {
        float f3 = f2 % 360.0f;
        this.originalDeg = f3;
        this.degRad = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float fCos = width + (((float) Math.cos(this.degRad)) * leveledCircleRadius);
        float fSin = height + (leveledCircleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i2 = this.selectorRadius;
        rectF.set(fCos - i2, fSin - i2, fCos + i2, fSin + i2);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f3, z2);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    /* JADX INFO: renamed from: lambda$setHandRotation$0$com-google-android-material-timepicker-ClockHandView, reason: not valid java name */
    /* synthetic */ void m7668xb17f7076(ValueAnimator valueAnimator) {
        setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.rotationAnimator.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.downX = x2;
            this.downY = y2;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z2 = false;
            z3 = false;
            z4 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i2 = (int) (x2 - this.downX);
            int i3 = (int) (y2 - this.downY);
            this.isInTapRegion = (i2 * i2) + (i3 * i3) > this.scaledTouchSlop;
            z3 = this.changedDuringTouch;
            z2 = actionMasked == 1;
            if (this.isMultiLevel) {
                adjustLevel(x2, y2);
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
        }
        boolean zHandleTouchInput = handleTouchInput(x2, y2, z3, z4, z2) | this.changedDuringTouch;
        this.changedDuringTouch = zHandleTouchInput;
        if (zHandleTouchInput && z2 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x2, y2), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z2) {
        this.animatingOnTouchUp = z2;
    }

    public void setCircleRadius(int i2) {
        this.circleRadius = i2;
        invalidate();
    }

    void setCurrentLevel(int i2) {
        this.currentLevel = i2;
        invalidate();
    }

    public void setHandRotation(float f2) {
        setHandRotation(f2, false);
    }

    public void setHandRotation(float f2, boolean z2) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            setHandRotationInternal(f2, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f2);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.m7668xb17f7076(valueAnimator2);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }

    void setMultiLevel(boolean z2) {
        if (this.isMultiLevel && !z2) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z2;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }
}
