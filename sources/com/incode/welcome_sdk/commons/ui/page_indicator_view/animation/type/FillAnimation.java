package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.FillAnimationValue;

/* JADX INFO: loaded from: classes5.dex */
public class FillAnimation extends ColorAnimation {

    /* JADX INFO: renamed from: g */
    private static int f6103g = 1;

    /* JADX INFO: renamed from: h */
    private static int f6104h = 0;

    /* JADX INFO: renamed from: f */
    private FillAnimationValue f6105f;

    /* JADX INFO: renamed from: i */
    private int f6106i;

    /* JADX INFO: renamed from: j */
    private int f6107j;

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation, com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ Animator d() {
        int i2 = 2 % 2;
        int i3 = f6103g + 125;
        f6104h = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimatorB = b();
        int i5 = f6103g + 55;
        f6104h = i5 % 128;
        if (i5 % 2 == 0) {
            return valueAnimatorB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FillAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
        this.f6105f = new FillAnimationValue();
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ColorAnimation
    public final ValueAnimator b() {
        int i2 = 2 % 2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.a(valueAnimator2);
            }
        });
        int i3 = f6103g + 73;
        f6104h = i3 % 128;
        int i4 = i3 % 2;
        return valueAnimator;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation b(int r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            r11 = 2
            int r0 = r11 % r11
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6104h
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6103g = r0
            int r1 = r1 % r11
            if (r1 == 0) goto L6b
            T extends android.animation.Animator r0 = r12.f6076a
            if (r0 == 0) goto L63
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6104h
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6103g = r0
            int r1 = r1 % r11
            r10 = 0
            r2 = r16
            if (r1 != 0) goto L64
            boolean r1 = r12.e(r13, r14, r15, r2)
            r0 = 92
            int r0 = r0 / r10
            if (r1 == 0) goto L63
        L29:
            r12.f6082e = r13
            r12.f6081c = r14
            r12.f6107j = r15
            r12.f6106i = r2
            android.animation.PropertyValuesHolder r9 = r12.a(r10)
            r8 = 1
            android.animation.PropertyValuesHolder r7 = r12.a(r8)
            android.animation.PropertyValuesHolder r6 = r12.e(r10)
            android.animation.PropertyValuesHolder r5 = r12.e(r8)
            android.animation.PropertyValuesHolder r4 = r12.c(r10)
            android.animation.PropertyValuesHolder r3 = r12.c(r8)
            T extends android.animation.Animator r2 = r12.f6076a
            android.animation.ValueAnimator r2 = (android.animation.ValueAnimator) r2
            r0 = 6
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r0]
            r1[r10] = r9
            r1[r8] = r7
            r1[r11] = r6
            r0 = 3
            r1[r0] = r5
            r0 = 4
            r1[r0] = r4
            r0 = 5
            r1[r0] = r3
            r2.setValues(r1)
        L63:
            return r12
        L64:
            boolean r0 = r12.e(r13, r14, r15, r2)
            if (r0 == 0) goto L63
            goto L29
        L6b:
            T extends android.animation.Animator r0 = r12.f6076a
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.b(int, int, int, int):com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.animation.PropertyValuesHolder e(boolean r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r4 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6104h
            int r0 = r4 + 83
            int r1 = r0 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6103g = r1
            int r0 = r0 % r5
            if (r0 != 0) goto L32
            r0 = 91
            int r0 = r0 / 0
            if (r7 != 0) goto L34
        L14:
            int r3 = r6.f6107j
            int r2 = r3 / 2
            int r1 = r4 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6103g = r0
            int r1 = r1 % r5
            java.lang.String r1 = "ANIMATION_RADIUS"
        L21:
            int[] r0 = new int[]{r3, r2}
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofInt(r1, r0)
            android.animation.IntEvaluator r0 = new android.animation.IntEvaluator
            r0.<init>()
            r1.setEvaluator(r0)
            return r1
        L32:
            if (r7 == 0) goto L14
        L34:
            int r1 = r1 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6104h = r0
            int r1 = r1 % r5
            int r2 = r6.f6107j
            int r3 = r2 / 2
            java.lang.String r1 = "ANIMATION_RADIUS_REVERSE"
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.e(boolean):android.animation.PropertyValuesHolder");
    }

    private PropertyValuesHolder c(boolean z2) {
        int i2;
        String str;
        int i3 = 2 % 2;
        int i4 = f6104h;
        int i5 = i4 + 19;
        f6103g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0;
            if (z2) {
                str = "ANIMATION_STROKE_REVERSE";
                i2 = 0;
                i6 = this.f6107j;
            } else {
                i2 = this.f6107j;
                int i7 = i4 + 11;
                f6103g = i7 % 128;
                int i8 = i7 % 2;
                str = "ANIMATION_STROKE";
            }
            PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i6, i2);
            propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
            return propertyValuesHolderOfInt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void a(ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int iIntValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int iIntValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        this.f6105f.setColor(iIntValue);
        this.f6105f.setColorReverse(iIntValue2);
        this.f6105f.setRadius(iIntValue3);
        this.f6105f.setRadiusReverse(iIntValue4);
        this.f6105f.setStroke(iIntValue5);
        this.f6105f.setStrokeReverse(iIntValue6);
        if (this.f6078d != null) {
            int i3 = f6103g + 57;
            f6104h = i3 % 128;
            int i4 = i3 % 2;
            this.f6078d.a(this.f6105f);
            int i5 = f6103g + 89;
            f6104h = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = f6104h + 55;
        f6103g = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0015, code lost:
    
        if (r5.f6082e != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0017, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x001a, code lost:
    
        if (r5.f6082e != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x001f, code lost:
    
        if (r5.f6081c == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0024, code lost:
    
        if (r5.f6107j == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0029, code lost:
    
        if (r5.f6106i == r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002b, code lost:
    
        r1 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6104h + 95;
        com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6103g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean e(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6104h
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6103g = r0
            int r1 = r1 % r4
            r3 = 0
            r2 = 1
            if (r1 != 0) goto L18
            int r1 = r5.f6082e
            r0 = 10
            int r0 = r0 / r3
            if (r1 == r6) goto L1d
        L17:
            return r2
        L18:
            int r0 = r5.f6082e
            if (r0 == r6) goto L1d
            goto L17
        L1d:
            int r0 = r5.f6081c
            if (r0 == r7) goto L22
            return r2
        L22:
            int r0 = r5.f6107j
            if (r0 == r8) goto L27
            return r2
        L27:
            int r0 = r5.f6106i
            if (r0 == r9) goto L35
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6104h
            int r1 = r0 + 95
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.f6103g = r0
            int r1 = r1 % r4
            return r2
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.FillAnimation.e(int, int, int, int):boolean");
    }
}
