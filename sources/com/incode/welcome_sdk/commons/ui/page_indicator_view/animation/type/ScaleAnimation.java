package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.ScaleAnimationValue;

/* JADX INFO: loaded from: classes5.dex */
public class ScaleAnimation extends ColorAnimation {

    /* JADX INFO: renamed from: i */
    private static int f6108i = 0;

    /* JADX INFO: renamed from: j */
    private static int f6109j = 1;

    /* JADX INFO: renamed from: f */
    private ScaleAnimationValue f6110f;

    /* JADX INFO: renamed from: g */
    float f6111g;

    /* JADX INFO: renamed from: h */
    int f6112h;

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation, com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ Animator d() {
        int i2 = 2 % 2;
        int i3 = f6108i + 25;
        f6109j = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimatorB = b();
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
        return valueAnimatorB;
    }

    public ScaleAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
        this.f6110f = new ScaleAnimationValue();
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation
    public final ValueAnimator b() {
        int i2 = 2 % 2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ScaleAnimation$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.b(valueAnimator2);
            }
        });
        int i3 = f6109j + 47;
        f6108i = i3 % 128;
        int i4 = i3 % 2;
        return valueAnimator;
    }

    public final ScaleAnimation d(int i2, int i3, int i4, float f2) {
        int i5 = 2 % 2;
        if (this.f6076a != 0) {
            int i6 = f6108i + 89;
            f6109j = i6 % 128;
            int i7 = i6 % 2;
            if (b(i2, i3, i4, f2)) {
                this.f6082e = i2;
                this.f6081c = i3;
                this.f6112h = i4;
                this.f6111g = f2;
                ((ValueAnimator) this.f6076a).setValues(a(false), a(true), b(false), b(true));
                int i8 = f6108i + 115;
                f6109j = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        int i10 = f6108i + 77;
        f6109j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 32 / 0;
        }
        return this;
    }

    public void b(ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        this.f6110f.setColor(iIntValue);
        this.f6110f.setColorReverse(iIntValue2);
        this.f6110f.setRadius(iIntValue3);
        this.f6110f.setRadiusReverse(iIntValue4);
        if (this.f6078d != null) {
            int i3 = f6109j + 81;
            f6108i = i3 % 128;
            int i4 = i3 % 2;
            this.f6078d.a(this.f6110f);
        }
        int i5 = f6108i + 43;
        f6109j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    protected PropertyValuesHolder b(boolean z2) {
        int i2;
        int i3;
        String str;
        int i4 = 2 % 2;
        int i5 = f6109j;
        int i6 = i5 + 87;
        f6108i = i6 % 128;
        if (i6 % 2 == 0) {
            if (z2) {
                int i7 = i5 + 5;
                f6108i = i7 % 128;
                int i8 = i7 % 2;
                i3 = this.f6112h;
                i2 = (int) (i3 * this.f6111g);
                str = "ANIMATION_SCALE_REVERSE";
            } else {
                i2 = this.f6112h;
                i3 = (int) (i2 * this.f6111g);
                str = "ANIMATION_SCALE";
            }
            PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i3, i2);
            propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
            return propertyValuesHolderOfInt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean b(int i2, int i3, int i4, float f2) {
        int i5 = 2 % 2;
        int i6 = f6109j + 37;
        f6108i = i6 % 128;
        int i7 = i6 % 2;
        if (this.f6082e != i2) {
            return true;
        }
        if (this.f6081c != i3) {
            int i8 = f6109j + 123;
            f6108i = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 17 / 0;
            }
            return true;
        }
        if (this.f6112h != i4) {
            int i10 = f6108i + 21;
            f6109j = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        if (this.f6111g == f2) {
            return false;
        }
        int i12 = f6109j + 1;
        f6108i = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }
}
