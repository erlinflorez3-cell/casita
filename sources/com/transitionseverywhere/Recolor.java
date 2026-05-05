package com.transitionseverywhere;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.transitionseverywhere.utils.IntProperty;

/* JADX INFO: loaded from: classes5.dex */
public class Recolor extends Transition {
    private static final String PROPNAME_BACKGROUND = "android:recolor:background";
    private static final String PROPNAME_TEXT_COLOR = "android:recolor:textColor";
    private static final String[] sTransitionProperties = {PROPNAME_BACKGROUND, PROPNAME_TEXT_COLOR};
    public static final Property<TextView, Integer> TEXTVIEW_TEXT_COLOR = new IntProperty<TextView>() { // from class: com.transitionseverywhere.Recolor.1
        @Override // com.transitionseverywhere.utils.IntProperty, android.util.Property
        public Integer get(TextView textView) {
            return 0;
        }

        @Override // com.transitionseverywhere.utils.IntProperty
        public void setValue(TextView textView, int i2) {
            textView.setTextColor(i2);
        }
    }.optimize();
    public static final Property<ColorDrawable, Integer> COLORDRAWABLE_COLOR = new IntProperty<ColorDrawable>() { // from class: com.transitionseverywhere.Recolor.2
        @Override // com.transitionseverywhere.utils.IntProperty, android.util.Property
        public Integer get(ColorDrawable colorDrawable) {
            return Integer.valueOf(colorDrawable.getColor());
        }

        @Override // com.transitionseverywhere.utils.IntProperty
        public void setValue(ColorDrawable colorDrawable, int i2) {
            colorDrawable.setColor(i2);
        }
    }.optimize();

    public Recolor() {
    }

    public Recolor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void captureValues(TransitionValues transitionValues) {
        transitionValues.values.put(PROPNAME_BACKGROUND, transitionValues.view.getBackground());
        if (transitionValues.view instanceof TextView) {
            transitionValues.values.put(PROPNAME_TEXT_COLOR, Integer.valueOf(((TextView) transitionValues.view).getCurrentTextColor()));
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator createAnimator(android.view.ViewGroup r8, androidx.transition.TransitionValues r9, androidx.transition.TransitionValues r10) {
        /*
            r7 = this;
            r5 = 0
            if (r9 == 0) goto L5
            if (r10 != 0) goto L6
        L5:
            return r5
        L6:
            android.view.View r4 = r10.view
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.values
            java.lang.String r1 = "android:recolor:background"
            java.lang.Object r6 = r0.get(r1)
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.values
            java.lang.Object r2 = r0.get(r1)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            boolean r0 = r6 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L94
            boolean r0 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L94
            android.graphics.drawable.ColorDrawable r6 = (android.graphics.drawable.ColorDrawable) r6
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r1 = r6.getColor()
            int r0 = r2.getColor()
            if (r1 == r0) goto L94
            int r3 = r2.getColor()
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r0 = r6.getColor()
            r2.setColor(r0)
            android.util.Property<android.graphics.drawable.ColorDrawable, java.lang.Integer> r1 = com.transitionseverywhere.Recolor.COLORDRAWABLE_COLOR
            int r0 = r6.getColor()
            int[] r0 = new int[]{r0, r3}
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofInt(r2, r1, r0)
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r3.setEvaluator(r0)
        L57:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L8e
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.values
            java.lang.String r1 = "android:recolor:textColor"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.values
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r2 == r0) goto L8e
            r4.setTextColor(r0)
            android.util.Property<android.widget.TextView, java.lang.Integer> r1 = com.transitionseverywhere.Recolor.TEXTVIEW_TEXT_COLOR
            int[] r0 = new int[]{r2, r0}
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofInt(r4, r1, r0)
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r5.setEvaluator(r0)
        L8e:
            android.animation.Animator r5 = com.transitionseverywhere.utils.TransitionUtils.mergeAnimators(r3, r5)
            goto L5
        L94:
            r3 = r5
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transitionseverywhere.Recolor.createAnimator(android.view.ViewGroup, androidx.transition.TransitionValues, androidx.transition.TransitionValues):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }
}
