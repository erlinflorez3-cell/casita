package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
class FragmentAnim {
    private FragmentAnim() {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[Catch: RuntimeException -> 0x00eb, TryCatch #3 {RuntimeException -> 0x00eb, blocks: (B:36:0x00df, B:38:0x00e5), top: B:56:0x00df }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(android.content.Context r12, androidx.fragment.app.Fragment r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentAnim.loadAnimation(android.content.Context, androidx.fragment.app.Fragment, boolean, boolean):androidx.fragment.app.FragmentAnim$AnimationOrAnimator");
    }

    private static int getNextAnim(Fragment fragment, boolean z2, boolean z3) {
        if (z3) {
            if (z2) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        }
        if (z2) {
            return fragment.getEnterAnim();
        }
        return fragment.getExitAnim();
    }

    private static int transitToAnimResourceId(Context context, int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i2 == 8194) {
            return z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
        }
        if (i2 == 8197) {
            if (z2) {
                return toActivityTransitResId(context, android.R.attr.activityCloseEnterAnimation);
            }
            return toActivityTransitResId(context, android.R.attr.activityCloseExitAnimation);
        }
        if (i2 == 4099) {
            return z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
        }
        if (i2 != 4100) {
            return -1;
        }
        if (z2) {
            return toActivityTransitResId(context, android.R.attr.activityOpenEnterAnimation);
        }
        return toActivityTransitResId(context, android.R.attr.activityOpenExitAnimation);
    }

    private static int toActivityTransitResId(Context context, int i2) throws Throwable {
        Class<?> cls = Class.forName(Jg.Wd("+e\u001ej*b ( z<\u00014{D<\u0014n0t(y8", (short) (C1633zX.Xd() ^ (-19422)), (short) (C1633zX.Xd() ^ (-23436))));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(android.R.style.Animation.Activity), new int[]{i2}};
        Method method = cls.getMethod(ZO.xd("d\u0019f\u0007\u0001X\"c\u001d\u0001g\u0015Nti>\\zMg\b9", (short) (OY.Xd() ^ 23207), (short) (OY.Xd() ^ 19947)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int resourceId = typedArray.getResourceId(0, -1);
            typedArray.recycle();
            return resourceId;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static class AnimationOrAnimator {
        public final Animation animation;
        public final Animator animator;

        AnimationOrAnimator(Animation animation) {
            this.animation = animation;
            this.animator = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        AnimationOrAnimator(Animator animator) {
            this.animation = null;
            this.animator = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        private boolean mAnimating;
        private final View mChild;
        private boolean mEnded;
        private final ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.mAnimating = true;
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mEnded && this.mAnimating) {
                this.mAnimating = false;
                this.mParent.post(this);
            } else {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
            }
        }
    }
}
