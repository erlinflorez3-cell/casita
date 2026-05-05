package com.incode.welcome_sdk.commons.ui;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class ProgressBarAnimation extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5877a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5878b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f5879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f5881e;

    private ProgressBarAnimation(ProgressBar progressBar, float f2, float f3) {
        this.f5881e = progressBar;
        this.f5879c = f2;
        this.f5880d = f3;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f2, Transformation transformation) {
        float f3;
        int i2 = 2 % 2;
        int i3 = f5878b + 5;
        f5877a = i3 % 128;
        if (i3 % 2 != 0) {
            super.applyTransformation(f2, transformation);
            float f4 = this.f5879c;
            f3 = f4 * ((this.f5880d % f4) % f2);
        } else {
            super.applyTransformation(f2, transformation);
            float f5 = this.f5879c;
            f3 = f5 + ((this.f5880d - f5) * f2);
        }
        this.f5881e.setProgress((int) f3);
        int i4 = f5878b + 81;
        f5877a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }

    public static void setProgressAnimated(ProgressBar progressBar, int i2) {
        int i3 = 2 % 2;
        int i4 = f5878b + 47;
        f5877a = i4 % 128;
        setProgressAnimatedRelativeTo(progressBar, i2, i4 % 2 != 0 ? 18032 : 500);
        int i5 = f5878b + 85;
        f5877a = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void setProgressAnimatedRelativeTo(ProgressBar progressBar, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f5878b;
        int i6 = i5 + 29;
        f5877a = i6 % 128;
        int i7 = i6 % 2;
        if (progressBar != null) {
            int i8 = i5 + 93;
            f5877a = i8 % 128;
            int i9 = i8 % 2;
            int max = progressBar.getMax();
            int progress = progressBar.getProgress();
            if (i2 - progress > 0) {
                float fAbs = Math.abs(r0) / max;
                ProgressBarAnimation progressBarAnimation = new ProgressBarAnimation(progressBar, progress, i2);
                progressBarAnimation.setDuration((long) (i3 * fAbs));
                progressBar.startAnimation(progressBarAnimation);
                return;
            }
            progressBar.setProgress(i2);
            return;
        }
        Timber.w("Tried to setProgressAnimatedRelativeTo() on a null ProgressBar", new Object[0]);
    }
}
