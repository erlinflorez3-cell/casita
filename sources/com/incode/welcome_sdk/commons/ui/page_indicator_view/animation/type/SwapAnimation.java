package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.SwapAnimationValue;

/* JADX INFO: loaded from: classes5.dex */
public class SwapAnimation extends BaseAnimation<ValueAnimator> {

    /* JADX INFO: renamed from: g */
    private static int f6120g = 0;

    /* JADX INFO: renamed from: i */
    private static int f6121i = 1;

    /* JADX INFO: renamed from: c */
    private int f6122c;

    /* JADX INFO: renamed from: e */
    private int f6123e;

    /* JADX INFO: renamed from: h */
    private SwapAnimationValue f6124h;

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ BaseAnimation b(float f2) {
        int i2 = 2 % 2;
        int i3 = f6121i + 81;
        f6120g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            a(f2);
            obj.hashCode();
            throw null;
        }
        SwapAnimation swapAnimationA = a(f2);
        int i4 = f6120g + 95;
        f6121i = i4 % 128;
        if (i4 % 2 != 0) {
            return swapAnimationA;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ Animator d() {
        int i2 = 2 % 2;
        int i3 = f6121i + 57;
        f6120g = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimatorE = e();
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
        return valueAnimatorE;
    }

    public SwapAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
        this.f6122c = -1;
        this.f6123e = -1;
        this.f6124h = new SwapAnimationValue();
    }

    private ValueAnimator e() {
        int i2 = 2 % 2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.b(valueAnimator2);
            }
        });
        int i3 = f6121i + 5;
        f6120g = i3 % 128;
        int i4 = i3 % 2;
        return valueAnimator;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002a A[PHI: r1
  0x002a: PHI (r1v6 long) = (r1v5 long), (r1v10 long) binds: [B:28:0x0053, B:22:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation a(float r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation.f6120g
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation.f6121i = r0
            int r1 = r1 % r3
            T extends android.animation.Animator r0 = r4.f6076a
            if (r0 == 0) goto L45
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation.f6120g
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation.f6121i = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L46
            long r1 = r4.f6077b
            float r0 = (float) r1
            float r5 = r5 % r0
            long r1 = (long) r5
            T extends android.animation.Animator r0 = r4.f6076a
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            android.animation.PropertyValuesHolder[] r0 = r0.getValues()
            if (r0 == 0) goto L45
        L2a:
            T extends android.animation.Animator r0 = r4.f6076a
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            android.animation.PropertyValuesHolder[] r0 = r0.getValues()
            int r0 = r0.length
            if (r0 <= 0) goto L45
            T extends android.animation.Animator r0 = r4.f6076a
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.setCurrentPlayTime(r1)
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation.f6120g
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation.f6121i = r0
            int r1 = r1 % r3
        L45:
            return r4
        L46:
            long r1 = r4.f6077b
            float r0 = (float) r1
            float r5 = r5 * r0
            long r1 = (long) r5
            T extends android.animation.Animator r0 = r4.f6076a
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            android.animation.PropertyValuesHolder[] r0 = r0.getValues()
            if (r0 == 0) goto L45
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation.a(float):com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SwapAnimation");
    }

    public final SwapAnimation c(int i2, int i3) {
        int i4 = 2 % 2;
        if (this.f6076a != 0) {
            int i5 = f6121i + 93;
            f6120g = i5 % 128;
            int i6 = i5 % 2;
            if (b(i2, i3)) {
                this.f6122c = i2;
                this.f6123e = i3;
                ((ValueAnimator) this.f6076a).setValues(d("ANIMATION_COORDINATE", i2, i3), d("ANIMATION_COORDINATE_REVERSE", i3, i2));
                int i7 = f6120g + 75;
                f6121i = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        int i9 = f6120g + 77;
        f6121i = i9 % 128;
        if (i9 % 2 != 0) {
            return this;
        }
        throw null;
    }

    private static PropertyValuesHolder d(String str, int i2, int i3) {
        int i4 = 2 % 2;
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i3);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        int i5 = f6121i + 9;
        f6120g = i5 % 128;
        int i6 = i5 % 2;
        return propertyValuesHolderOfInt;
    }

    public void b(ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = f6120g + 33;
        f6121i = i3 % 128;
        if (i3 % 2 != 0) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
            int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
            this.f6124h.setCoordinate(iIntValue);
            this.f6124h.setCoordinateReverse(iIntValue2);
            if (this.f6078d != null) {
                int i4 = f6120g + 41;
                f6121i = i4 % 128;
                if (i4 % 2 != 0) {
                    this.f6078d.a(this.f6124h);
                } else {
                    this.f6078d.a(this.f6124h);
                    throw null;
                }
            }
            int i5 = f6120g + 29;
            f6121i = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        this.f6124h.setCoordinate(iIntValue3);
        this.f6124h.setCoordinateReverse(iIntValue4);
        ValueController.UpdateListener updateListener = this.f6078d;
        throw null;
    }

    private boolean b(int i2, int i3) {
        int i4 = 2 % 2;
        if (this.f6122c != i2) {
            return true;
        }
        if (this.f6123e != i3) {
            int i5 = f6120g + 51;
            f6121i = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i6 = f6121i + 15;
        f6120g = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
