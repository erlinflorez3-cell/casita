package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes4.dex */
public class Fade extends Visibility {
    public static final int IN = 1;
    private static final String LOG_TAG = "Fade";
    public static final int OUT = 2;
    private static final String PROPNAME_TRANSITION_ALPHA = "android:fade:transitionAlpha";

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public Fade(int i2) {
        setMode(i2);
    }

    public Fade() {
    }

    public Fade(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Object[] objArr = {attributeSet, Styleable.FADE};
        Method method = Class.forName(Wg.Zd("?\u0018\u0018\u000erx\\\u000eKAJ\u001a\u0014#r8UjQ?<9\u001b", (short) (FB.Xd() ^ 14147), (short) (FB.Xd() ^ 2713))).getMethod(Wg.vd("-!4\"#)\u000f1/#\u001d\u001dr'('71EE/>", (short) (C1499aX.Xd() ^ (-24737))), Class.forName(C1561oA.Xd("?MDSQLH\u0013[[QU\u0018,`a`XRffXGZj", (short) (OY.Xd() ^ 16262))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            setMode(TypedArrayUtils.getNamedInt(typedArray, (XmlResourceParser) attributeSet, Qg.kd("_Y[_c[@aUU", (short) (C1499aX.Xd() ^ (-26209)), (short) (C1499aX.Xd() ^ (-31139))), 0, getMode()));
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        Float fValueOf = (Float) transitionValues.view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (transitionValues.view.getVisibility() == 0) {
                fValueOf = Float.valueOf(ViewUtils.getTransitionAlpha(transitionValues.view));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        transitionValues.values.put(PROPNAME_TRANSITION_ALPHA, fValueOf);
    }

    private Animator createAnimation(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        ViewUtils.setTransitionAlpha(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, ViewUtils.TRANSITION_ALPHA, f3);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        objectAnimatorOfFloat.addListener(fadeAnimatorListener);
        getRootTransition().addListener(fadeAnimatorListener);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.saveNonTransitionAlpha(view);
        return createAnimation(view, getStartAlpha(transitionValues, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.saveNonTransitionAlpha(view);
        Animator animatorCreateAnimation = createAnimation(view, getStartAlpha(transitionValues, 1.0f), 0.0f);
        if (animatorCreateAnimation == null) {
            ViewUtils.setTransitionAlpha(view, getStartAlpha(transitionValues2, 1.0f));
        }
        return animatorCreateAnimation;
    }

    private static float getStartAlpha(TransitionValues transitionValues, float f2) {
        Float f3;
        return (transitionValues == null || (f3 = (Float) transitionValues.values.get(PROPNAME_TRANSITION_ALPHA)) == null) ? f2 : f3.floatValue();
    }

    private static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private boolean mLayerTypeChanged = false;
        private final View mView;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition, boolean z2) {
        }

        FadeAnimatorListener(View view) {
            this.mView = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.mView.hasOverlappingRendering() && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (this.mLayerTypeChanged) {
                this.mView.setLayerType(0, null);
            }
            if (z2) {
                return;
            }
            ViewUtils.setTransitionAlpha(this.mView, 1.0f);
            ViewUtils.clearNonTransitionAlpha(this.mView);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ViewUtils.setTransitionAlpha(this.mView, 1.0f);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.mView.setTag(R.id.transition_pause_alpha, Float.valueOf(this.mView.getVisibility() == 0 ? ViewUtils.getTransitionAlpha(this.mView) : 0.0f));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.mView.setTag(R.id.transition_pause_alpha, null);
        }
    }
}
