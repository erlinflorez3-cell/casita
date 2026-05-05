package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.ColorAnimationValue;

/* JADX INFO: loaded from: classes5.dex */
public class ColorAnimation extends BaseAnimation<ValueAnimator> {

    /* JADX INFO: renamed from: f */
    private static int f6079f = 1;

    /* JADX INFO: renamed from: i */
    private static int f6080i = 0;

    /* JADX INFO: renamed from: c */
    int f6081c;

    /* JADX INFO: renamed from: e */
    int f6082e;

    /* JADX INFO: renamed from: g */
    private ColorAnimationValue f6083g;

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ BaseAnimation b(float f2) {
        int i2 = 2 % 2;
        int i3 = f6079f + 107;
        f6080i = i3 % 128;
        int i4 = i3 % 2;
        ColorAnimation colorAnimationA = a(f2);
        if (i4 != 0) {
            int i5 = 25 / 0;
        }
        int i6 = f6080i + 89;
        f6079f = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 59 / 0;
        }
        return colorAnimationA;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public /* synthetic */ Animator d() {
        int i2 = 2 % 2;
        int i3 = f6080i + 117;
        f6079f = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimatorB = b();
        int i5 = f6079f + 29;
        f6080i = i5 % 128;
        int i6 = i5 % 2;
        return valueAnimatorB;
    }

    public ColorAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
        this.f6083g = new ColorAnimationValue();
    }

    public ValueAnimator b() {
        int i2 = 2 % 2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.b(valueAnimator2);
            }
        });
        int i3 = f6079f + 3;
        f6080i = i3 % 128;
        if (i3 % 2 == 0) {
            return valueAnimator;
        }
        throw null;
    }

    private ColorAnimation a(float f2) {
        int i2 = 2 % 2;
        int i3 = f6079f + 9;
        f6080i = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.f6076a != 0) {
            int i5 = f6079f + 31;
            f6080i = i5 % 128;
            int i6 = i5 % 2;
            long j2 = (long) (f2 * this.f6077b);
            if (((ValueAnimator) this.f6076a).getValues() != null && ((ValueAnimator) this.f6076a).getValues().length > 0) {
                int i7 = f6080i + 29;
                f6079f = i7 % 128;
                if (i7 % 2 == 0) {
                    ((ValueAnimator) this.f6076a).setCurrentPlayTime(j2);
                    obj.hashCode();
                    throw null;
                }
                ((ValueAnimator) this.f6076a).setCurrentPlayTime(j2);
            }
        }
        int i8 = f6079f + 5;
        f6080i = i8 % 128;
        if (i8 % 2 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation c(int r8, int r9) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation.f6079f
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation.f6080i = r0
            int r1 = r1 % r6
            T extends android.animation.Animator r0 = r7.f6076a
            if (r0 == 0) goto L47
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation.f6079f
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation.f6080i = r0
            int r1 = r1 % r6
            r5 = 0
            if (r1 == 0) goto L48
            boolean r1 = r7.d(r8, r9)
            r0 = 6
            int r0 = r0 / r5
            if (r1 == 0) goto L47
        L24:
            r7.f6082e = r8
            r7.f6081c = r9
            android.animation.PropertyValuesHolder r4 = r7.a(r5)
            r3 = 1
            android.animation.PropertyValuesHolder r2 = r7.a(r3)
            T extends android.animation.Animator r1 = r7.f6076a
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r6]
            r0[r5] = r4
            r0[r3] = r2
            r1.setValues(r0)
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation.f6080i
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation.f6079f = r0
            int r1 = r1 % r6
        L47:
            return r7
        L48:
            boolean r0 = r7.d(r8, r9)
            if (r0 == 0) goto L47
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation.c(int, int):com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation");
    }

    final PropertyValuesHolder a(boolean z2) {
        int i2;
        int i3;
        String str;
        int i4 = 2 % 2;
        if (z2) {
            i2 = this.f6081c;
            i3 = this.f6082e;
            int i5 = f6079f + 19;
            f6080i = i5 % 128;
            int i6 = i5 % 2;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i2 = this.f6082e;
            i3 = this.f6081c;
            int i7 = f6079f + 41;
            f6080i = i7 % 128;
            int i8 = i7 % 2;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i3);
        propertyValuesHolderOfInt.setEvaluator(new ArgbEvaluator());
        return propertyValuesHolderOfInt;
    }

    private boolean d(int i2, int i3) {
        int i4 = 2 % 2;
        if (this.f6082e == i2) {
            if (this.f6081c == i3) {
                return false;
            }
            int i5 = f6080i + 33;
            f6079f = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = f6079f + 47;
        f6080i = i6 % 128;
        return i6 % 2 == 0;
    }

    public void b(ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = f6079f + 93;
        f6080i = i3 % 128;
        int i4 = i3 % 2;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        this.f6083g.setColor(iIntValue);
        this.f6083g.setColorReverse(iIntValue2);
        if (this.f6078d != null) {
            this.f6078d.a(this.f6083g);
        }
        int i5 = f6079f + 27;
        f6080i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
