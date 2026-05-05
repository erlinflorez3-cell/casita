package com.incode.welcome_sdk.commons.ui;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AnimatorListenerWrapper implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5760a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5761d = 0;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i2 = 2 % 2;
        int i3 = f5760a + 69;
        f5761d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(animator, "");
        int i5 = f5761d + 1;
        f5760a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i2 = 2 % 2;
        int i3 = f5760a + 101;
        f5761d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(animator, "");
        int i5 = f5760a + 107;
        f5761d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i2 = 2 % 2;
        int i3 = f5760a + 63;
        f5761d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(animator, "");
        int i5 = f5761d + 103;
        f5760a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        int i2 = 2 % 2;
        int i3 = f5761d + 79;
        f5760a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(animator, "");
            return;
        }
        Intrinsics.checkNotNullParameter(animator, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
