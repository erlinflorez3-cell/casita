package com.transitionseverywhere;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ChangeText extends Transition {
    public static final int CHANGE_BEHAVIOR_IN = 2;
    public static final int CHANGE_BEHAVIOR_KEEP = 0;
    public static final int CHANGE_BEHAVIOR_OUT = 1;
    public static final int CHANGE_BEHAVIOR_OUT_IN = 3;
    private static final String PROPNAME_TEXT_COLOR = "android:textchange:textColor";
    private int mChangeBehavior = 0;
    private static final String PROPNAME_TEXT = "android:textchange:text";
    private static final String PROPNAME_TEXT_SELECTION_START = "android:textchange:textSelectionStart";
    private static final String PROPNAME_TEXT_SELECTION_END = "android:textchange:textSelectionEnd";
    private static final String[] sTransitionProperties = {PROPNAME_TEXT, PROPNAME_TEXT_SELECTION_START, PROPNAME_TEXT_SELECTION_END};

    private void captureValues(TransitionValues transitionValues) {
        if (transitionValues.view instanceof TextView) {
            TextView textView = (TextView) transitionValues.view;
            transitionValues.values.put(PROPNAME_TEXT, textView.getText());
            if (textView instanceof EditText) {
                transitionValues.values.put(PROPNAME_TEXT_SELECTION_START, Integer.valueOf(textView.getSelectionStart()));
                transitionValues.values.put(PROPNAME_TEXT_SELECTION_END, Integer.valueOf(textView.getSelectionEnd()));
            }
            if (this.mChangeBehavior > 0) {
                transitionValues.values.put(PROPNAME_TEXT_COLOR, Integer.valueOf(textView.getCurrentTextColor()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelection(EditText editText, int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            return;
        }
        editText.setSelection(i2, i3);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        final int iIntValue;
        final int iIntValue2;
        final int iIntValue3;
        final int iIntValue4;
        final int iIntValue5;
        ValueAnimator valueAnimatorOfInt;
        final TextView textView;
        ValueAnimator valueAnimatorOfInt2;
        final TextView textView2;
        Animator animator;
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof TextView) || !(transitionValues2.view instanceof TextView)) {
            return null;
        }
        final TextView textView3 = (TextView) transitionValues2.view;
        Map<String, Object> map = transitionValues.values;
        Map<String, Object> map2 = transitionValues2.values;
        final String str = map.get(PROPNAME_TEXT) != null ? (CharSequence) map.get(PROPNAME_TEXT) : "";
        final CharSequence charSequence = map2.get(PROPNAME_TEXT) != null ? (CharSequence) map2.get(PROPNAME_TEXT) : "";
        boolean z2 = textView3 instanceof EditText;
        if (z2) {
            iIntValue4 = map.get(PROPNAME_TEXT_SELECTION_START) != null ? ((Integer) map.get(PROPNAME_TEXT_SELECTION_START)).intValue() : -1;
            iIntValue = map.get(PROPNAME_TEXT_SELECTION_END) != null ? ((Integer) map.get(PROPNAME_TEXT_SELECTION_END)).intValue() : iIntValue4;
            iIntValue2 = map2.get(PROPNAME_TEXT_SELECTION_START) != null ? ((Integer) map2.get(PROPNAME_TEXT_SELECTION_START)).intValue() : -1;
            iIntValue3 = map2.get(PROPNAME_TEXT_SELECTION_END) != null ? ((Integer) map2.get(PROPNAME_TEXT_SELECTION_END)).intValue() : iIntValue2;
        } else {
            iIntValue = -1;
            iIntValue2 = -1;
            iIntValue3 = -1;
            iIntValue4 = -1;
        }
        if (str.equals(charSequence)) {
            return null;
        }
        if (this.mChangeBehavior != 2) {
            textView3.setText(str);
            if (z2) {
                setSelection((EditText) textView3, iIntValue4, iIntValue);
            }
        }
        if (this.mChangeBehavior == 0) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final CharSequence charSequence2 = str;
            textView2 = textView3;
            charSequence = charSequence;
            iIntValue2 = iIntValue2;
            iIntValue3 = iIntValue3;
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.transitionseverywhere.ChangeText.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    if (charSequence2.equals(textView2.getText())) {
                        textView2.setText(charSequence);
                        TextView textView4 = textView2;
                        if (textView4 instanceof EditText) {
                            ChangeText.this.setSelection((EditText) textView4, iIntValue2, iIntValue3);
                        }
                    }
                }
            });
            iIntValue5 = 0;
            animator = valueAnimatorOfFloat;
        } else {
            final int iIntValue6 = ((Integer) map.get(PROPNAME_TEXT_COLOR)).intValue();
            iIntValue5 = ((Integer) map2.get(PROPNAME_TEXT_COLOR)).intValue();
            int i2 = this.mChangeBehavior;
            if (i2 == 3 || i2 == 1) {
                valueAnimatorOfInt = ValueAnimator.ofInt(Color.alpha(iIntValue6), 0);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transitionseverywhere.ChangeText.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int iIntValue7 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        TextView textView4 = textView3;
                        int i3 = iIntValue7 << 24;
                        int i4 = iIntValue6;
                        int i5 = (-1) - (((-1) - 16711680) | ((-1) - i4));
                        int i6 = (i3 + i5) - (i3 & i5);
                        int i7 = 65280 & i4;
                        textView4.setTextColor(((i6 + i7) - (i6 & i7)) | ((-1) - (((-1) - i4) | ((-1) - 255))));
                    }
                });
                final CharSequence charSequence3 = str;
                textView = textView3;
                final CharSequence charSequence4 = charSequence;
                final int i3 = iIntValue2;
                final int i4 = iIntValue3;
                valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: com.transitionseverywhere.ChangeText.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        if (charSequence3.equals(textView.getText())) {
                            textView.setText(charSequence4);
                            TextView textView4 = textView;
                            if (textView4 instanceof EditText) {
                                ChangeText.this.setSelection((EditText) textView4, i3, i4);
                            }
                        }
                        textView.setTextColor(iIntValue5);
                    }
                });
            } else {
                textView = textView3;
                valueAnimatorOfInt = null;
            }
            int i5 = this.mChangeBehavior;
            if (i5 == 3 || i5 == 2) {
                valueAnimatorOfInt2 = ValueAnimator.ofInt(0, Color.alpha(iIntValue5));
                textView2 = textView;
                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transitionseverywhere.ChangeText.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int iIntValue7 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        TextView textView4 = textView2;
                        int iRed = (-1) - (((-1) - (iIntValue7 << 24)) & ((-1) - (Color.red(iIntValue5) << 16)));
                        int iGreen = Color.green(iIntValue5) << 8;
                        int i6 = (iRed + iGreen) - (iRed & iGreen);
                        int iBlue = Color.blue(iIntValue5);
                        textView4.setTextColor((i6 + iBlue) - (i6 & iBlue));
                    }
                });
                valueAnimatorOfInt2.addListener(new AnimatorListenerAdapter() { // from class: com.transitionseverywhere.ChangeText.5
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator2) {
                        textView2.setTextColor(iIntValue5);
                    }
                });
            } else {
                textView2 = textView;
                valueAnimatorOfInt2 = null;
            }
            if (valueAnimatorOfInt == null || valueAnimatorOfInt2 == null) {
                animator = valueAnimatorOfInt != null ? valueAnimatorOfInt : valueAnimatorOfInt2;
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
                animator = animatorSet;
            }
        }
        addListener(new TransitionListenerAdapter() { // from class: com.transitionseverywhere.ChangeText.6
            int mPausedColor = 0;

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
                if (ChangeText.this.mChangeBehavior != 2) {
                    textView2.setText(charSequence);
                    TextView textView4 = textView2;
                    if (textView4 instanceof EditText) {
                        ChangeText.this.setSelection((EditText) textView4, iIntValue2, iIntValue3);
                    }
                }
                if (ChangeText.this.mChangeBehavior > 0) {
                    this.mPausedColor = textView2.getCurrentTextColor();
                    textView2.setTextColor(iIntValue5);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
                if (ChangeText.this.mChangeBehavior != 2) {
                    textView2.setText(str);
                    TextView textView4 = textView2;
                    if (textView4 instanceof EditText) {
                        ChangeText.this.setSelection((EditText) textView4, iIntValue4, iIntValue);
                    }
                }
                if (ChangeText.this.mChangeBehavior > 0) {
                    textView2.setTextColor(this.mPausedColor);
                }
            }
        });
        return animator;
    }

    public int getChangeBehavior() {
        return this.mChangeBehavior;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public ChangeText setChangeBehavior(int i2) {
        if (i2 >= 0 && i2 <= 3) {
            this.mChangeBehavior = i2;
        }
        return this;
    }
}
