package com.transitionseverywhere.extra;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.transitionseverywhere.R;
import com.transitionseverywhere.utils.TransitionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class Scale extends Visibility {
    static final String PROPNAME_SCALE_X = "scale:scaleX";
    static final String PROPNAME_SCALE_Y = "scale:scaleY";
    private float mDisappearedScale;

    public Scale() {
        this.mDisappearedScale = 0.0f;
    }

    public Scale(float f2) {
        this.mDisappearedScale = 0.0f;
        setDisappearedScale(f2);
    }

    public Scale(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.mDisappearedScale = 0.0f;
        int[] iArr = R.styleable.Scale;
        Class<?> cls = Class.forName(C1561oA.od("iujwslf/cnlqain';fdiYkf", (short) (C1580rY.Xd() ^ (-9738))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (FB.Xd() ^ 4261);
        int[] iArr2 = new int["\u0010\u001e\u0015$\"\u001d\u0019c,,\"&h|121)#77)\u0018+;".length()];
        QB qb = new QB("\u0010\u001e\u0015$\"\u001d\u0019c,,\"&h|121)#77)\u0018+;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i2));
        clsArr[1] = int[].class;
        Object[] objArr = {attributeSet, iArr};
        Method method = cls.getMethod(Wg.Zd(":\u0004sF*\u0005GP3|S6pyQ5\nWH-{a", (short) (ZN.Xd() ^ 9098), (short) (ZN.Xd() ^ 8918)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            setDisappearedScale(typedArray.getFloat(R.styleable.Scale_disappearedScale, this.mDisappearedScale));
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Animator createAnimation(final View view, float f2, float f3, TransitionValues transitionValues) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        float fFloatValue = scaleX * f2;
        float f4 = scaleX * f3;
        float fFloatValue2 = f2 * scaleY;
        float f5 = f3 * scaleY;
        if (transitionValues != null) {
            Float f6 = (Float) transitionValues.values.get(PROPNAME_SCALE_X);
            Float f7 = (Float) transitionValues.values.get(PROPNAME_SCALE_Y);
            if (f6 != null && f6.floatValue() != scaleX) {
                fFloatValue = f6.floatValue();
            }
            if (f7 != null && f7.floatValue() != scaleY) {
                fFloatValue2 = f7.floatValue();
            }
        }
        view.setScaleX(fFloatValue);
        view.setScaleY(fFloatValue2);
        Animator animatorMergeAnimators = TransitionUtils.mergeAnimators(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, fFloatValue, f4), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, fFloatValue2, f5));
        addListener(new TransitionListenerAdapter() { // from class: com.transitionseverywhere.extra.Scale.1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
                transition.removeListener(this);
            }
        });
        return animatorMergeAnimators;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        transitionValues.values.put(PROPNAME_SCALE_X, Float.valueOf(transitionValues.view.getScaleX()));
        transitionValues.values.put(PROPNAME_SCALE_Y, Float.valueOf(transitionValues.view.getScaleY()));
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimation(view, this.mDisappearedScale, 1.0f, transitionValues);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimation(view, 1.0f, this.mDisappearedScale, transitionValues);
    }

    public Scale setDisappearedScale(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("disappearedScale cannot be negative!");
        }
        this.mDisappearedScale = f2;
        return this;
    }
}
