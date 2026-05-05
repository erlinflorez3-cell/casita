package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.ThinWormAnimationValue;

/* JADX INFO: loaded from: classes5.dex */
public class ThinWormAnimation extends WormAnimation {

    /* JADX INFO: renamed from: m */
    private static int f6125m = 0;

    /* JADX INFO: renamed from: n */
    private static int f6126n = 1;

    /* JADX INFO: renamed from: h */
    private ThinWormAnimationValue f6127h;

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation, com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ BaseAnimation a(long j2) {
        int i2 = 2 % 2;
        int i3 = f6126n + 55;
        f6125m = i3 % 128;
        if (i3 % 2 != 0) {
            e(j2);
            throw null;
        }
        ThinWormAnimation thinWormAnimationE = e(j2);
        int i4 = f6125m + 117;
        f6126n = i4 % 128;
        int i5 = i4 % 2;
        return thinWormAnimationE;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation
    public final /* synthetic */ WormAnimation a(float f2) {
        int i2 = 2 % 2;
        int i3 = f6125m + 117;
        f6126n = i3 % 128;
        int i4 = i3 % 2;
        ThinWormAnimation thinWormAnimationC = c(f2);
        int i5 = f6125m + 91;
        f6126n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return thinWormAnimationC;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation, com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ BaseAnimation b(float f2) {
        int i2 = 2 % 2;
        int i3 = f6126n + 125;
        f6125m = i3 % 128;
        int i4 = i3 % 2;
        ThinWormAnimation thinWormAnimationC = c(f2);
        int i5 = f6125m + 45;
        f6126n = i5 % 128;
        int i6 = i5 % 2;
        return thinWormAnimationC;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation
    public final /* synthetic */ WormAnimation b(long j2) {
        int i2 = 2 % 2;
        int i3 = f6126n + 9;
        f6125m = i3 % 128;
        int i4 = i3 % 2;
        ThinWormAnimation thinWormAnimationE = e(j2);
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        int i6 = f6125m + 73;
        f6126n = i6 % 128;
        int i7 = i6 % 2;
        return thinWormAnimationE;
    }

    public ThinWormAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
        this.f6127h = new ThinWormAnimationValue();
    }

    private ThinWormAnimation e(long j2) {
        int i2 = 2 % 2;
        int i3 = f6126n + 95;
        f6125m = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.b(j2);
            int i4 = f6125m + 49;
            f6126n = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }
        super.b(j2);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0023  */
    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation c(int r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation.c(int, int, int, boolean):com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation");
    }

    private ValueAnimator b(int i2, int i3, long j2) {
        int i4 = 2 % 2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.c(valueAnimator);
            }
        });
        int i5 = f6125m + 85;
        f6126n = i5 % 128;
        int i6 = i5 % 2;
        return valueAnimatorOfInt;
    }

    public void c(ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        this.f6127h.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
        if (this.f6078d != null) {
            int i3 = f6126n + 101;
            f6125m = i3 % 128;
            if (i3 % 2 != 0) {
                this.f6078d.a(this.f6127h);
                throw null;
            }
            this.f6078d.a(this.f6127h);
        }
        int i4 = f6125m + 107;
        f6126n = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008e A[PHI: r5 r7
  0x008e: PHI (r5v1 long) = (r5v0 long), (r5v5 long) binds: [B:65:0x008b, B:48:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r7v2 android.animation.ValueAnimator) = (r7v1 android.animation.ValueAnimator), (r7v5 android.animation.ValueAnimator) binds: [B:65:0x008b, B:48:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation c(float r14) {
        /*
            r13 = this;
            r12 = 2
            int r0 = r12 % r12
            T extends android.animation.Animator r0 = r13.f6076a
            if (r0 == 0) goto L9f
            long r1 = r13.f6077b
            float r0 = (float) r1
            float r14 = r14 * r0
            long r3 = (long) r14
            T extends android.animation.Animator r0 = r13.f6076a
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            int r9 = r0.size()
            r8 = 0
        L19:
            if (r8 >= r9) goto L9f
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation.f6125m
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation.f6126n = r0
            int r1 = r1 % r12
            r10 = 0
            if (r1 != 0) goto L71
            T extends android.animation.Animator r0 = r13.f6076a
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            java.lang.Object r7 = r0.get(r8)
            android.animation.ValueAnimator r7 = (android.animation.ValueAnimator) r7
            long r0 = r7.getStartDelay()
            long r5 = r3 / r0
            long r1 = r7.getDuration()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8e
        L44:
            int r0 = r9 + (-1)
            if (r8 != r0) goto L59
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation.f6126n
            int r5 = r0 + 71
            int r0 = r5 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation.f6125m = r0
            int r5 = r5 % r12
            if (r5 == 0) goto L6c
            r5 = 1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L69
        L59:
            android.animation.PropertyValuesHolder[] r0 = r7.getValues()
            if (r0 == 0) goto L69
            android.animation.PropertyValuesHolder[] r0 = r7.getValues()
            int r0 = r0.length
            if (r0 <= 0) goto L69
            r7.setCurrentPlayTime(r1)
        L69:
            int r8 = r8 + 1
            goto L19
        L6c:
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L69
            goto L59
        L71:
            T extends android.animation.Animator r0 = r13.f6076a
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            java.lang.Object r7 = r0.get(r8)
            android.animation.ValueAnimator r7 = (android.animation.ValueAnimator) r7
            long r0 = r7.getStartDelay()
            long r5 = r3 - r0
            long r1 = r7.getDuration()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8e
            goto L44
        L8e:
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 >= 0) goto L9d
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation.f6125m
            int r1 = r0 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation.f6126n = r0
            int r1 = r1 % r12
            r1 = r10
            goto L44
        L9d:
            r1 = r5
            goto L44
        L9f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation.c(float):com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.ThinWormAnimation");
    }
}
