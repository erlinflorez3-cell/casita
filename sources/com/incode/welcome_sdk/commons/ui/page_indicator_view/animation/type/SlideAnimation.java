package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.SlideAnimationValue;

/* JADX INFO: loaded from: classes5.dex */
public class SlideAnimation extends BaseAnimation<ValueAnimator> {

    /* JADX INFO: renamed from: f */
    private static int f6115f = 1;

    /* JADX INFO: renamed from: j */
    private static int f6116j = 0;

    /* JADX INFO: renamed from: c */
    private int f6117c;

    /* JADX INFO: renamed from: e */
    private SlideAnimationValue f6118e;

    /* JADX INFO: renamed from: g */
    private int f6119g;

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ BaseAnimation b(float f2) {
        int i2 = 2 % 2;
        int i3 = f6115f + 87;
        f6116j = i3 % 128;
        int i4 = i3 % 2;
        SlideAnimation slideAnimationE = e(f2);
        if (i4 != 0) {
            int i5 = 79 / 0;
        }
        int i6 = f6116j + 23;
        f6115f = i6 % 128;
        int i7 = i6 % 2;
        return slideAnimationE;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ Animator d() {
        int i2 = 2 % 2;
        int i3 = f6115f + 67;
        f6116j = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimatorB = b();
        int i5 = f6115f + 117;
        f6116j = i5 % 128;
        int i6 = i5 % 2;
        return valueAnimatorB;
    }

    public SlideAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
        this.f6117c = -1;
        this.f6119g = -1;
        this.f6118e = new SlideAnimationValue();
    }

    private ValueAnimator b() {
        int i2 = 2 % 2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.SlideAnimation$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.e(valueAnimator2);
            }
        });
        int i3 = f6116j + 29;
        f6115f = i3 % 128;
        int i4 = i3 % 2;
        return valueAnimator;
    }

    private SlideAnimation e(float f2) {
        int i2 = 2 % 2;
        Object obj = null;
        if (this.f6076a != 0) {
            long j2 = (long) (f2 * this.f6077b);
            if (((ValueAnimator) this.f6076a).getValues() != null) {
                int i3 = f6115f + 63;
                f6116j = i3 % 128;
                int i4 = i3 % 2;
                if (((ValueAnimator) this.f6076a).getValues().length > 0) {
                    int i5 = f6115f + 77;
                    f6116j = i5 % 128;
                    if (i5 % 2 != 0) {
                        ((ValueAnimator) this.f6076a).setCurrentPlayTime(j2);
                        obj.hashCode();
                        throw null;
                    }
                    ((ValueAnimator) this.f6076a).setCurrentPlayTime(j2);
                }
            }
        }
        int i6 = f6116j + 121;
        f6115f = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final SlideAnimation a(int i2, int i3) {
        int i4 = 2 % 2;
        Object obj = null;
        if (this.f6076a != 0) {
            int i5 = f6115f + 103;
            f6116j = i5 % 128;
            if (i5 % 2 != 0) {
                d(i2, i3);
                obj.hashCode();
                throw null;
            }
            if (d(i2, i3)) {
                this.f6117c = i2;
                this.f6119g = i3;
                ((ValueAnimator) this.f6076a).setValues(e());
            }
        }
        int i6 = f6115f + 105;
        f6116j = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    private PropertyValuesHolder e() {
        int i2 = 2 % 2;
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", this.f6117c, this.f6119g);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        int i3 = f6116j + 121;
        f6115f = i3 % 128;
        int i4 = i3 % 2;
        return propertyValuesHolderOfInt;
    }

    public void e(ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        this.f6118e.setCoordinate(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
        if (this.f6078d != null) {
            int i3 = f6116j + 35;
            f6115f = i3 % 128;
            int i4 = i3 % 2;
            this.f6078d.a(this.f6118e);
            int i5 = f6115f + 65;
            f6116j = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 3;
            }
        }
    }

    private boolean d(int i2, int i3) {
        int i4 = 2 % 2;
        if (this.f6117c == i2) {
            if (this.f6119g == i3) {
                return false;
            }
            int i5 = f6115f + 81;
            f6116j = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = f6116j + 1;
        f6115f = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }
}
