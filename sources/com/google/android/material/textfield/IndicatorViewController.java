package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes9.dex */
final class IndicatorViewController {
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    static final int COUNTER_INDEX = 2;
    private static final int DEFAULT_CAPTION_FADE_ANIMATION_DURATION = 167;
    private static final int DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION = 217;
    static final int ERROR_INDEX = 0;
    static final int HELPER_INDEX = 1;
    private Animator captionAnimator;
    private FrameLayout captionArea;
    private int captionDisplayed;
    private final int captionFadeInAnimationDuration;
    private final TimeInterpolator captionFadeInAnimationInterpolator;
    private final int captionFadeOutAnimationDuration;
    private final TimeInterpolator captionFadeOutAnimationInterpolator;
    private int captionToShow;
    private final int captionTranslationYAnimationDuration;
    private final TimeInterpolator captionTranslationYAnimationInterpolator;
    private final float captionTranslationYPx;
    private final Context context;
    private boolean errorEnabled;
    private CharSequence errorText;
    private int errorTextAppearance;
    private TextView errorView;
    private int errorViewAccessibilityLiveRegion;
    private CharSequence errorViewContentDescription;
    private ColorStateList errorViewTextColor;
    private CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    private TextView helperTextView;
    private ColorStateList helperTextViewTextColor;
    private LinearLayout indicatorArea;
    private int indicatorsAdded;
    private final TextInputLayout textInputView;
    private Typeface typeface;

    public IndicatorViewController(TextInputLayout textInputLayout) throws Throwable {
        Context context = textInputLayout.getContext();
        this.context = context;
        this.textInputView = textInputLayout;
        Object[] objArr = new Object[0];
        try {
            Class.forName(Ig.wd("E'-XKxE\u0005_!\u001cFd}a>+C\b4jK_", (short) (OY.Xd() ^ 6315))).getMethod(EO.Od("\u0013i\t\u0005\u007fc{\u0011U*.\u0016", (short) (C1607wl.Xd() ^ 9828)), new Class[0]).setAccessible(true);
            this.captionTranslationYPx = ((Resources) r1.invoke(context, objArr)).getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
            this.captionTranslationYAnimationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort4, 217);
            this.captionFadeInAnimationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium4, 167);
            this.captionFadeOutAnimationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort4, 167);
            this.captionTranslationYAnimationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
            this.captionFadeInAnimationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
            this.captionFadeOutAnimationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private boolean canAdjustIndicatorPadding() {
        return (this.indicatorArea == null || this.textInputView.getEditText() == null) ? false : true;
    }

    private void createCaptionAnimators(List<Animator> list, boolean z2, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z2) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            ObjectAnimator objectAnimatorCreateCaptionOpacityAnimator = createCaptionOpacityAnimator(textView, i4 == i2);
            if (i2 == i4 && i3 != 0) {
                objectAnimatorCreateCaptionOpacityAnimator.setStartDelay(this.captionFadeOutAnimationDuration);
            }
            list.add(objectAnimatorCreateCaptionOpacityAnimator);
            if (i4 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorCreateCaptionTranslationYAnimator = createCaptionTranslationYAnimator(textView);
            objectAnimatorCreateCaptionTranslationYAnimator.setStartDelay(this.captionFadeOutAnimationDuration);
            list.add(objectAnimatorCreateCaptionTranslationYAnimator);
        }
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z2 ? this.captionFadeInAnimationDuration : this.captionFadeOutAnimationDuration);
        objectAnimatorOfFloat.setInterpolator(z2 ? this.captionFadeInAnimationInterpolator : this.captionFadeOutAnimationInterpolator);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.captionTranslationYPx, 0.0f);
        objectAnimatorOfFloat.setDuration(this.captionTranslationYAnimationDuration);
        objectAnimatorOfFloat.setInterpolator(this.captionTranslationYAnimationInterpolator);
        return objectAnimatorOfFloat;
    }

    private TextView getCaptionViewFromDisplayState(int i2) {
        if (i2 == 1) {
            return this.errorView;
        }
        if (i2 != 2) {
            return null;
        }
        return this.helperTextView;
    }

    private int getIndicatorPadding(boolean z2, int i2, int i3) throws Throwable {
        if (!z2) {
            return i3;
        }
        Context context = this.context;
        Class<?> cls = Class.forName(C1561oA.Qd("`lanjc]&ZechX`e\u001e2][`Pb]", (short) (C1633zX.Xd() ^ (-12702))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-30909));
        short sXd2 = (short) (Od.Xd() ^ (-6667));
        int[] iArr = new int[")(8\u0017+:7><.1@".length()];
        QB qb = new QB(")(8\u0017+:7><.1@");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) - sXd2);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(i2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private boolean isCaptionStateError(int i2) {
        return (i2 != 1 || this.errorView == null || TextUtils.isEmpty(this.errorText)) ? false : true;
    }

    private boolean isCaptionStateHelperText(int i2) {
        return (i2 != 2 || this.helperTextView == null || TextUtils.isEmpty(this.helperText)) ? false : true;
    }

    private void setCaptionViewVisibilities(int i2, int i3) {
        TextView captionViewFromDisplayState;
        TextView captionViewFromDisplayState2;
        if (i2 == i3) {
            return;
        }
        if (i3 != 0 && (captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i3)) != null) {
            captionViewFromDisplayState2.setVisibility(0);
            captionViewFromDisplayState2.setAlpha(1.0f);
        }
        if (i2 != 0 && (captionViewFromDisplayState = getCaptionViewFromDisplayState(i2)) != null) {
            captionViewFromDisplayState.setVisibility(4);
            if (i2 == 1) {
                captionViewFromDisplayState.setText((CharSequence) null);
            }
        }
        this.captionDisplayed = i3;
    }

    private void setTextViewTypeface(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void setViewGroupGoneIfEmpty(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean shouldAnimateCaptionView(TextView textView, CharSequence charSequence) {
        return ViewCompat.isLaidOut(this.textInputView) && this.textInputView.isEnabled() && !(this.captionToShow == this.captionDisplayed && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void updateCaptionViewsVisibility(final int i2, final int i3, boolean z2) throws Throwable {
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.captionAnimator = animatorSet;
            ArrayList arrayList = new ArrayList();
            createCaptionAnimators(arrayList, this.helperTextEnabled, this.helperTextView, 2, i2, i3);
            createCaptionAnimators(arrayList, this.errorEnabled, this.errorView, 1, i2, i3);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            final TextView captionViewFromDisplayState = getCaptionViewFromDisplayState(i2);
            final TextView captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i3);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.IndicatorViewController.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IndicatorViewController.this.captionDisplayed = i3;
                    IndicatorViewController.this.captionAnimator = null;
                    TextView textView = captionViewFromDisplayState;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i2 == 1 && IndicatorViewController.this.errorView != null) {
                            IndicatorViewController.this.errorView.setText((CharSequence) null);
                        }
                    }
                    TextView textView2 = captionViewFromDisplayState2;
                    if (textView2 != null) {
                        textView2.setTranslationY(0.0f);
                        captionViewFromDisplayState2.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    TextView textView = captionViewFromDisplayState2;
                    if (textView != null) {
                        textView.setVisibility(0);
                        captionViewFromDisplayState2.setAlpha(0.0f);
                    }
                }
            });
            animatorSet.start();
        } else {
            setCaptionViewVisibilities(i2, i3);
        }
        this.textInputView.updateEditTextBackground();
        this.textInputView.updateLabelState(z2);
        this.textInputView.updateTextInputBoxState();
    }

    void addIndicator(TextView textView, int i2) {
        if (this.indicatorArea == null && this.captionArea == null) {
            LinearLayout linearLayout = new LinearLayout(this.context);
            this.indicatorArea = linearLayout;
            linearLayout.setOrientation(0);
            this.textInputView.addView(this.indicatorArea, -1, -2);
            this.captionArea = new FrameLayout(this.context);
            this.indicatorArea.addView(this.captionArea, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.textInputView.getEditText() != null) {
                adjustIndicatorPadding();
            }
        }
        if (isCaptionView(i2)) {
            this.captionArea.setVisibility(0);
            this.captionArea.addView(textView);
        } else {
            this.indicatorArea.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.indicatorArea.setVisibility(0);
        this.indicatorsAdded++;
    }

    void adjustIndicatorPadding() {
        if (canAdjustIndicatorPadding()) {
            EditText editText = this.textInputView.getEditText();
            boolean zIsFontScaleAtLeast1_3 = MaterialResources.isFontScaleAtLeast1_3(this.context);
            LinearLayout linearLayout = this.indicatorArea;
            int indicatorPadding = getIndicatorPadding(zIsFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.getPaddingStart(editText));
            int i2 = R.dimen.material_helper_text_font_1_3_padding_top;
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("\".#0,%\u001fg\u001c'%*\u001a\"'_s\u001f\u001d\"\u0012$\u001f", (short) (FB.Xd() ^ 24010))).getMethod(C1561oA.Kd("10@\u001f3B?FD69H", (short) (C1499aX.Xd() ^ (-21228))), new Class[0]);
            try {
                method.setAccessible(true);
                ViewCompat.setPaddingRelative(linearLayout, indicatorPadding, getIndicatorPadding(zIsFontScaleAtLeast1_3, i2, ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), getIndicatorPadding(zIsFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.getPaddingEnd(editText)), 0);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    void cancelCaptionAnimator() {
        Animator animator = this.captionAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean errorIsDisplayed() {
        return isCaptionStateError(this.captionDisplayed);
    }

    boolean errorShouldBeShown() {
        return isCaptionStateError(this.captionToShow);
    }

    int getErrorAccessibilityLiveRegion() {
        return this.errorViewAccessibilityLiveRegion;
    }

    CharSequence getErrorContentDescription() {
        return this.errorViewContentDescription;
    }

    CharSequence getErrorText() {
        return this.errorText;
    }

    int getErrorViewCurrentTextColor() {
        TextView textView = this.errorView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList getErrorViewTextColors() {
        TextView textView = this.errorView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence getHelperText() {
        return this.helperText;
    }

    View getHelperTextView() {
        return this.helperTextView;
    }

    ColorStateList getHelperTextViewColors() {
        TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    int getHelperTextViewCurrentTextColor() {
        TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    boolean helperTextIsDisplayed() {
        return isCaptionStateHelperText(this.captionDisplayed);
    }

    boolean helperTextShouldBeShown() {
        return isCaptionStateHelperText(this.captionToShow);
    }

    void hideError() {
        this.errorText = null;
        cancelCaptionAnimator();
        if (this.captionDisplayed == 1) {
            if (!this.helperTextEnabled || TextUtils.isEmpty(this.helperText)) {
                this.captionToShow = 0;
            } else {
                this.captionToShow = 2;
            }
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.errorView, ""));
    }

    void hideHelperText() throws Throwable {
        cancelCaptionAnimator();
        int i2 = this.captionDisplayed;
        if (i2 == 2) {
            this.captionToShow = 0;
        }
        updateCaptionViewsVisibility(i2, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, ""));
    }

    boolean isCaptionView(int i2) {
        return i2 == 0 || i2 == 1;
    }

    boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    boolean isHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    void removeIndicator(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.indicatorArea == null) {
            return;
        }
        if (!isCaptionView(i2) || (frameLayout = this.captionArea) == null) {
            this.indicatorArea.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i3 = this.indicatorsAdded - 1;
        this.indicatorsAdded = i3;
        setViewGroupGoneIfEmpty(this.indicatorArea, i3);
    }

    void setErrorAccessibilityLiveRegion(int i2) {
        this.errorViewAccessibilityLiveRegion = i2;
        TextView textView = this.errorView;
        if (textView != null) {
            ViewCompat.setAccessibilityLiveRegion(textView, i2);
        }
    }

    void setErrorContentDescription(CharSequence charSequence) {
        this.errorViewContentDescription = charSequence;
        TextView textView = this.errorView;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void setErrorEnabled(boolean z2) {
        if (this.errorEnabled == z2) {
            return;
        }
        cancelCaptionAnimator();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.context);
            this.errorView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.errorView.setTextAlignment(5);
            Typeface typeface = this.typeface;
            if (typeface != null) {
                this.errorView.setTypeface(typeface);
            }
            setErrorTextAppearance(this.errorTextAppearance);
            setErrorViewTextColor(this.errorViewTextColor);
            setErrorContentDescription(this.errorViewContentDescription);
            setErrorAccessibilityLiveRegion(this.errorViewAccessibilityLiveRegion);
            this.errorView.setVisibility(4);
            addIndicator(this.errorView, 0);
        } else {
            hideError();
            removeIndicator(this.errorView, 0);
            this.errorView = null;
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateTextInputBoxState();
        }
        this.errorEnabled = z2;
    }

    void setErrorTextAppearance(int i2) {
        this.errorTextAppearance = i2;
        TextView textView = this.errorView;
        if (textView != null) {
            this.textInputView.setTextAppearanceCompatWithErrorFallback(textView, i2);
        }
    }

    void setErrorViewTextColor(ColorStateList colorStateList) {
        this.errorViewTextColor = colorStateList;
        TextView textView = this.errorView;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void setHelperTextAppearance(int i2) {
        this.helperTextTextAppearance = i2;
        TextView textView = this.helperTextView;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i2);
        }
    }

    void setHelperTextEnabled(boolean z2) {
        if (this.helperTextEnabled == z2) {
            return;
        }
        cancelCaptionAnimator();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.context);
            this.helperTextView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.helperTextView.setTextAlignment(5);
            Typeface typeface = this.typeface;
            if (typeface != null) {
                this.helperTextView.setTypeface(typeface);
            }
            this.helperTextView.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(this.helperTextView, 1);
            setHelperTextAppearance(this.helperTextTextAppearance);
            setHelperTextViewTextColor(this.helperTextViewTextColor);
            addIndicator(this.helperTextView, 1);
            this.helperTextView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.textfield.IndicatorViewController.2
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    EditText editText = IndicatorViewController.this.textInputView.getEditText();
                    if (editText != null) {
                        accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            });
        } else {
            hideHelperText();
            removeIndicator(this.helperTextView, 1);
            this.helperTextView = null;
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateTextInputBoxState();
        }
        this.helperTextEnabled = z2;
    }

    void setHelperTextViewTextColor(ColorStateList colorStateList) {
        this.helperTextViewTextColor = colorStateList;
        TextView textView = this.helperTextView;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void setTypefaces(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            setTextViewTypeface(this.errorView, typeface);
            setTextViewTypeface(this.helperTextView, typeface);
        }
    }

    void showError(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.errorText = charSequence;
        this.errorView.setText(charSequence);
        int i2 = this.captionDisplayed;
        if (i2 != 1) {
            this.captionToShow = 1;
        }
        updateCaptionViewsVisibility(i2, this.captionToShow, shouldAnimateCaptionView(this.errorView, charSequence));
    }

    void showHelper(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.helperText = charSequence;
        this.helperTextView.setText(charSequence);
        int i2 = this.captionDisplayed;
        if (i2 != 2) {
            this.captionToShow = 2;
        }
        updateCaptionViewsVisibility(i2, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, charSequence));
    }
}
