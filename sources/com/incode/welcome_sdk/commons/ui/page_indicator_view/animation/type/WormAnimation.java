package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.WormAnimationValue;

/* JADX INFO: loaded from: classes5.dex */
public class WormAnimation extends BaseAnimation<AnimatorSet> {

    /* JADX INFO: renamed from: k */
    private static int f6128k = 1;

    /* JADX INFO: renamed from: n */
    private static int f6129n = 0;

    /* JADX INFO: renamed from: c */
    int f6130c;

    /* JADX INFO: renamed from: e */
    int f6131e;

    /* JADX INFO: renamed from: f */
    boolean f6132f;

    /* JADX INFO: renamed from: g */
    int f6133g;

    /* JADX INFO: renamed from: h */
    private WormAnimationValue f6134h;

    /* JADX INFO: renamed from: i */
    int f6135i;

    /* JADX INFO: renamed from: j */
    int f6136j;

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public /* synthetic */ BaseAnimation a(long j2) {
        int i2 = 2 % 2;
        int i3 = f6129n + 75;
        f6128k = i3 % 128;
        int i4 = i3 % 2;
        WormAnimation wormAnimationB = b(j2);
        int i5 = f6129n + 37;
        f6128k = i5 % 128;
        if (i5 % 2 != 0) {
            return wormAnimationB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public /* synthetic */ BaseAnimation b(float f2) {
        int i2 = 2 % 2;
        int i3 = f6129n + 65;
        f6128k = i3 % 128;
        if (i3 % 2 != 0) {
            return a(f2);
        }
        a(f2);
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ Animator d() {
        int i2 = 2 % 2;
        int i3 = f6129n + 95;
        f6128k = i3 % 128;
        int i4 = i3 % 2;
        AnimatorSet animatorSetE = e();
        int i5 = f6128k + 55;
        f6129n = i5 % 128;
        if (i5 % 2 == 0) {
            return animatorSetE;
        }
        throw null;
    }

    public WormAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
        this.f6134h = new WormAnimationValue();
    }

    public static AnimatorSet e() {
        int i2 = 2 % 2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        int i3 = f6128k + 101;
        f6129n = i3 % 128;
        if (i3 % 2 == 0) {
            return animatorSet;
        }
        throw null;
    }

    public WormAnimation b(long j2) {
        int i2 = 2 % 2;
        int i3 = f6128k + 11;
        f6129n = i3 % 128;
        int i4 = i3 % 2;
        super.a(j2);
        int i5 = f6129n + 39;
        f6128k = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public WormAnimation c(int i2, int i3, int i4, boolean z2) {
        int i5 = 2 % 2;
        int i6 = f6129n + 15;
        f6128k = i6 % 128;
        int i7 = i6 % 2;
        if (d(i2, i3, i4, z2)) {
            this.f6076a = e();
            this.f6131e = i2;
            this.f6130c = i3;
            this.f6133g = i4;
            this.f6132f = z2;
            int i8 = i2 - i4;
            this.f6135i = i8;
            this.f6136j = i2 + i4;
            this.f6134h.setRectStart(i8);
            this.f6134h.setRectEnd(this.f6136j);
            c cVarA = a(z2);
            long j2 = this.f6077b / 2;
            ((AnimatorSet) this.f6076a).playSequentially(a(cVarA.f6140d, cVarA.f6141e, j2, false, this.f6134h), a(cVarA.f6137a, cVarA.f6139c, j2, true, this.f6134h));
            int i9 = f6128k + 67;
            f6129n = i9 % 128;
            int i10 = i9 % 2;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0064 A[PHI: r1
  0x0064: PHI (r1v7 android.animation.ValueAnimator) = (r1v5 android.animation.ValueAnimator), (r1v10 android.animation.ValueAnimator) binds: [B:44:0x0061, B:41:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation a(float r10) {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            T extends android.animation.Animator r0 = r9.f6076a
            if (r0 != 0) goto L18
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6128k
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6129n = r0
            int r1 = r1 % r8
            if (r1 != 0) goto L13
            return r9
        L13:
            r0 = 0
            r0.hashCode()
            throw r0
        L18:
            long r1 = r9.f6077b
            float r0 = (float) r1
            float r10 = r10 * r0
            long r4 = (long) r10
            T extends android.animation.Animator r0 = r9.f6076a
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            java.util.Iterator r7 = r0.iterator()
        L29:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L66
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6128k
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6129n = r0
            int r1 = r1 % r8
            if (r1 == 0) goto L53
            java.lang.Object r1 = r7.next()
            android.animation.Animator r1 = (android.animation.Animator) r1
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            long r2 = r1.getDuration()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 21
            int r0 = r0 / 0
            if (r6 <= 0) goto L64
        L4e:
            r1.setCurrentPlayTime(r2)
            long r4 = r4 - r2
            goto L29
        L53:
            java.lang.Object r1 = r7.next()
            android.animation.Animator r1 = (android.animation.Animator) r1
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            long r2 = r1.getDuration()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L64
            goto L4e
        L64:
            r2 = r4
            goto L4e
        L66:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.a(float):com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation");
    }

    public /* synthetic */ void a(WormAnimationValue wormAnimationValue, boolean z2, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = f6128k + 1;
        f6129n = i3 % 128;
        int i4 = i3 % 2;
        b(wormAnimationValue, valueAnimator, z2);
        if (i4 != 0) {
            int i5 = 39 / 0;
        }
    }

    final ValueAnimator a(int i2, int i3, long j2, final boolean z2, final WormAnimationValue wormAnimationValue) {
        int i4 = 2 % 2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.a(wormAnimationValue, z2, valueAnimator);
            }
        });
        int i5 = f6129n + 55;
        f6128k = i5 % 128;
        int i6 = i5 % 2;
        return valueAnimatorOfInt;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.WormAnimationValue r5, android.animation.ValueAnimator r6, boolean r7) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            java.lang.Object r0 = r6.getAnimatedValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            boolean r0 = r4.f6132f
            if (r0 == 0) goto L3b
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6128k
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6129n = r0
            int r1 = r1 % r3
            if (r7 == 0) goto L4c
            r5.setRectStart(r2)
        L1f:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController$UpdateListener r0 = r4.f6078d
            if (r0 == 0) goto L31
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6128k
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6129n = r0
            int r1 = r1 % r3
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController$UpdateListener r0 = r4.f6078d
            r0.a(r5)
        L31:
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6128k
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6129n = r0
            int r1 = r1 % r3
            return
        L3b:
            if (r7 != 0) goto L4c
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6128k
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6129n = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L59
            r5.setRectStart(r2)
            goto L1f
        L4c:
            r5.setRectEnd(r2)
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6129n
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.f6128k = r0
            int r1 = r1 % r3
            goto L1f
        L59:
            r5.setRectStart(r2)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation.b(com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.WormAnimationValue, android.animation.ValueAnimator, boolean):void");
    }

    final boolean d(int i2, int i3, int i4, boolean z2) {
        int i5 = 2 % 2;
        int i6 = f6128k;
        int i7 = i6 + 53;
        f6129n = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        if (this.f6131e != i2) {
            return true;
        }
        if (this.f6130c == i3) {
            if (this.f6133g != i4) {
                return true;
            }
            if (this.f6132f == z2) {
                return false;
            }
            int i8 = i6 + 99;
            f6129n = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 38 / 0;
            }
            return true;
        }
        int i10 = i6 + 77;
        f6129n = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    final c a(boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = f6129n + 87;
        int i8 = i7 % 128;
        f6128k = i8;
        if (i7 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z2) {
            int i9 = this.f6131e;
            int i10 = this.f6133g;
            i2 = i9 + i10;
            int i11 = this.f6130c;
            i3 = i11 + i10;
            i4 = i9 - i10;
            i5 = i11 - i10;
        } else {
            int i12 = this.f6131e;
            int i13 = this.f6133g;
            i2 = i12 - i13;
            int i14 = this.f6130c;
            i3 = i14 - i13;
            i4 = i12 + i13;
            i5 = i13 + i14;
            int i15 = i8 + 3;
            f6129n = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 3 / 3;
            }
        }
        return new c(i2, i3, i4, i5);
    }

    class c {

        /* JADX INFO: renamed from: a */
        final int f6137a;

        /* JADX INFO: renamed from: c */
        final int f6139c;

        /* JADX INFO: renamed from: d */
        final int f6140d;

        /* JADX INFO: renamed from: e */
        final int f6141e;

        c(int i2, int i3, int i4, int i5) {
            this.f6140d = i2;
            this.f6141e = i3;
            this.f6137a = i4;
            this.f6139c = i5;
        }
    }
}
