package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected final List<DrawingDelegate.ActiveIndicator> activeIndicators = new ArrayList();
    protected IndeterminateDrawable drawable;

    protected IndeterminateAnimatorDelegate(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    abstract void cancelAnimatorImmediately();

    protected float getFractionInRange(int i2, int i3, int i4) {
        return (i2 - i3) / i4;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(Animatable2Compat.AnimationCallback animationCallback);

    protected void registerDrawable(IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    abstract void requestCancelAnimatorAfterCurrentCycle();

    abstract void resetPropertiesForNewStart();

    abstract void setAnimationFraction(float f2);

    abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
