package com.incode.welcome_sdk.commons.ui;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes5.dex */
public class IncodeLottieAnimationView extends LottieAnimationView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5830b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5831e = 0;
    protected LottieAnimationEndListener lottieAnimationEndListener;

    public interface LottieAnimationEndListener {
        void onLottieAnimationEnd();
    }

    public IncodeLottieAnimationView(Context context) {
        super(context);
    }

    public IncodeLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IncodeLottieAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void setOnLottieAnimationEndListener(final LottieAnimationEndListener lottieAnimationEndListener) {
        int i2 = 2 % 2;
        this.lottieAnimationEndListener = lottieAnimationEndListener;
        addAnimatorListener(new AnimatorListenerWrapper() { // from class: com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5832b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f5833c = 0;

            @Override // com.incode.welcome_sdk.commons.ui.AnimatorListenerWrapper, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f5832b + 17;
                f5833c = i4 % 128;
                int i5 = i4 % 2;
                lottieAnimationEndListener.onLottieAnimationEnd();
                IncodeLottieAnimationView.this.repeatAnimation();
                int i6 = f5833c + 93;
                f5832b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 17 / 0;
                }
            }

            @Override // com.incode.welcome_sdk.commons.ui.AnimatorListenerWrapper, android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                int i3 = 2 % 2;
                int i4 = f5832b + 101;
                f5833c = i4 % 128;
                if (i4 % 2 != 0) {
                    lottieAnimationEndListener.onLottieAnimationEnd();
                    int i5 = 10 / 0;
                } else {
                    lottieAnimationEndListener.onLottieAnimationEnd();
                }
                int i6 = f5833c + 51;
                f5832b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 9 / 0;
                }
            }
        });
        int i3 = f5831e + 113;
        f5830b = i3 % 128;
        int i4 = i3 % 2;
    }

    public void resetAnimation() {
        int i2 = 2 % 2;
        int i3 = f5831e + 35;
        f5830b = i3 % 128;
        int i4 = i3 % 2;
        pauseAnimation();
        setFrame(0);
        playAnimation();
        int i5 = f5831e + 43;
        f5830b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: lambda$repeatAnimation$0$com-incode-welcome_sdk-commons-ui-IncodeLottieAnimationView, reason: not valid java name */
    /* synthetic */ void m8111x954dbc57() {
        int i2 = 2 % 2;
        int i3 = f5831e + 91;
        f5830b = i3 % 128;
        int i4 = i3 % 2;
        setRepeatCount(-1);
        playAnimation();
        int i5 = f5831e + 1;
        f5830b = i5 % 128;
        int i6 = i5 % 2;
    }

    void repeatAnimation() {
        int i2 = 2 % 2;
        int i3 = f5831e + 77;
        f5830b = i3 % 128;
        int i4 = i3 % 2;
        post(new Runnable() { // from class: com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8111x954dbc57();
            }
        });
        int i5 = f5830b + 29;
        f5831e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
