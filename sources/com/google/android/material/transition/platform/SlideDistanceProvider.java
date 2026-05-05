package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes9.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    private int slideDistance = -1;
    private int slideEdge;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i2) {
        this.slideEdge = i2;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i2, int i3) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i2 == 3) {
            return createTranslationXAnimator(view2, i3 + translationX, translationX, translationX);
        }
        if (i2 == 5) {
            return createTranslationXAnimator(view2, translationX - i3, translationX, translationX);
        }
        if (i2 == 48) {
            return createTranslationYAnimator(view2, translationY - i3, translationY, translationY);
        }
        if (i2 == 80) {
            return createTranslationYAnimator(view2, i3 + translationY, translationY, translationY);
        }
        if (i2 == 8388611) {
            return createTranslationXAnimator(view2, isRtl(view) ? i3 + translationX : translationX - i3, translationX, translationX);
        }
        if (i2 == 8388613) {
            return createTranslationXAnimator(view2, isRtl(view) ? translationX - i3 : i3 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i2);
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i2, int i3) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i2 == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - i3, translationX);
        }
        if (i2 == 5) {
            return createTranslationXAnimator(view2, translationX, i3 + translationX, translationX);
        }
        if (i2 == 48) {
            return createTranslationYAnimator(view2, translationY, i3 + translationY, translationY);
        }
        if (i2 == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - i3, translationY);
        }
        if (i2 == 8388611) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - i3 : i3 + translationX, translationX);
        }
        if (i2 == 8388613) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? i3 + translationX : translationX - i3, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i2);
    }

    private static Animator createTranslationXAnimator(final View view, float f2, float f3, final float f4) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f2, f3));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f4);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f2, float f3, final float f4) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f3));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f4);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) throws Throwable {
        int i2 = this.slideDistance;
        if (i2 != -1) {
            return i2;
        }
        Class<?> cls = Class.forName(Wg.vd("Wc\\iaZX!Q\\^cOW`\u0019)TV[GYX", (short) (OY.Xd() ^ 19306)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 6258);
        short sXd2 = (short) (OY.Xd() ^ 9345);
        int[] iArr = new int["nkyVhupuqabo".length()];
        QB qb = new QB("nkyVhupuqabo");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean isRtl(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createAppear(ViewGroup viewGroup, View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public Animator createDisappear(ViewGroup viewGroup, View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.slideDistance = i2;
    }

    public void setSlideEdge(int i2) {
        this.slideEdge = i2;
    }
}
