package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
class EndCompoundLayout extends LinearLayout {
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;
    private AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* JADX INFO: renamed from: com.google.android.material.textfield.EndCompoundLayout$1 */
    class AnonymousClass1 extends TextWatcherAdapter {
        AnonymousClass1() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.EndCompoundLayout$2 */
    class AnonymousClass2 implements TextInputLayout.OnEditTextAttachedListener {
        AnonymousClass2() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public void onEditTextAttached(TextInputLayout textInputLayout) {
            if (EndCompoundLayout.this.editText == textInputLayout.getEditText()) {
                return;
            }
            if (EndCompoundLayout.this.editText != null) {
                EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                    EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                }
            }
            EndCompoundLayout.this.editText = textInputLayout.getEditText();
            if (EndCompoundLayout.this.editText != null) {
                EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
            }
            EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
            EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
            endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.EndCompoundLayout$3 */
    class AnonymousClass3 implements View.OnAttachStateChangeListener {
        AnonymousClass3() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) throws Throwable {
            EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) throws Throwable {
            EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
        }
    }

    private static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates = new SparseArray<>();
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = tintTypedArray.getResourceId(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = tintTypedArray.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        private EndIconDelegate create(int i2) {
            if (i2 == -1) {
                return new CustomEndIconDelegate(this.endLayout);
            }
            if (i2 == 0) {
                return new NoEndIconDelegate(this.endLayout);
            }
            if (i2 == 1) {
                return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
            }
            if (i2 == 2) {
                return new ClearTextEndIconDelegate(this.endLayout);
            }
            if (i2 == 3) {
                return new DropdownMenuEndIconDelegate(this.endLayout);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i2);
        }

        EndIconDelegate get(int i2) {
            EndIconDelegate endIconDelegate = this.delegates.get(i2);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            EndIconDelegate endIconDelegateCreate = create(i2);
            this.delegates.append(i2, endIconDelegateCreate);
            return endIconDelegateCreate;
        }
    }

    EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) throws Throwable {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            AnonymousClass1() {
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i2, i3, i4);
            }
        };
        AnonymousClass2 anonymousClass2 = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            AnonymousClass2() {
            }

            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                    if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                }
                EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = anonymousClass2;
        Context context = getContext();
        Object[] objArr = {C1561oA.yd("3636AB5/371=?", (short) (FB.Xd() ^ 13869))};
        Method method = Class.forName(C1561oA.Yd(" .%42-)s*77>0:A{\u0012??F8LI", (short) (Od.Xd() ^ (-22654)))).getMethod(Jg.Wd("Sz\rx$)-+4\b\u001e9A><H", (short) (C1607wl.Xd() ^ 19831), (short) (C1607wl.Xd() ^ 32196)), Class.forName(Xg.qd("\u0001x\u000fzH\b}\f\u0006Ms\u0016\u0015\r\u0013\r", (short) (ZN.Xd() ^ 9669), (short) (ZN.Xd() ^ 24808))));
        try {
            method.setAccessible(true);
            this.accessibilityManager = (AccessibilityManager) method.invoke(context, objArr);
            this.textInputLayout = textInputLayout;
            setVisibility(8);
            setOrientation(0);
            setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.endIconFrame = frameLayout;
            frameLayout.setVisibility(8);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            CheckableImageButton checkableImageButtonCreateIconView = createIconView(this, layoutInflaterFrom, R.id.text_input_error_icon);
            this.errorIconView = checkableImageButtonCreateIconView;
            CheckableImageButton checkableImageButtonCreateIconView2 = createIconView(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
            this.endIconView = checkableImageButtonCreateIconView2;
            this.endIconDelegates = new EndIconDelegates(this, tintTypedArray);
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.suffixTextView = appCompatTextView;
            initErrorIconView(tintTypedArray);
            initEndIconView(tintTypedArray);
            initSuffixTextView(tintTypedArray);
            frameLayout.addView(checkableImageButtonCreateIconView2);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(checkableImageButtonCreateIconView);
            textInputLayout.addOnEditTextAttachedListener(anonymousClass2);
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
                AnonymousClass3() {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) throws Throwable {
                    EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) throws Throwable {
                    EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void addTouchExplorationStateChangeListenerIfNeeded() throws Throwable {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null || !ViewCompat.isAttachedToWindow(this)) {
            return;
        }
        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.accessibilityManager, this.touchExplorationStateChangeListener);
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void dispatchOnEndIconChanged(int i2) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i2);
        }
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int i2 = this.endIconDelegates.customEndIconDrawableId;
        return i2 == 0 ? endIconDelegate.getIconDrawableResId() : i2;
    }

    private void initEndIconView(TintTypedArray tintTypedArray) throws Throwable {
        if (!tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_endIconTint);
            }
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconMode, 0));
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(tintTypedArray.getText(R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(tintTypedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            setEndIconMode(tintTypedArray.getBoolean(R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconContentDescription(tintTypedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconScaleType)) {
            setEndIconScaleType(IconHelper.convertScaleType(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void initErrorIconView(TintTypedArray tintTypedArray) throws Throwable {
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconTint)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_errorIconTint);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconTintMode)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(tintTypedArray.getDrawable(R.styleable.TextInputLayout_errorIconDrawable));
        }
        this.errorIconView.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(this.errorIconView, 2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(TintTypedArray tintTypedArray) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(this.suffixTextView, 1);
        setSuffixTextAppearance(tintTypedArray.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(tintTypedArray.getColorStateList(R.styleable.TextInputLayout_suffixTextColor));
        }
        setSuffixText(tintTypedArray.getText(R.styleable.TextInputLayout_suffixText));
    }

    public void removeTouchExplorationStateChangeListenerIfNeeded() throws Throwable {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
    }

    public void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    private void setUpDelegate(EndIconDelegate endIconDelegate) throws Throwable {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(EndIconDelegate endIconDelegate) throws Throwable {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    private void tintEndIconOnError(boolean z2) {
        if (!z2 || getEndIconDrawable() == null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            return;
        }
        Drawable drawableMutate = DrawableCompat.wrap(getEndIconDrawable()).mutate();
        DrawableCompat.setTint(drawableMutate, this.textInputLayout.getErrorCurrentTextColors());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateEndLayoutVisibility() {
        int i2 = 0;
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        char c2 = (this.suffixText == null || this.hintExpanded) ? '\b' : (char) 0;
        if (!isEndIconVisible() && !isErrorIconVisible() && c2 != 0) {
            i2 = 8;
        }
        setVisibility(i2);
    }

    private void updateErrorIconVisibility() throws Throwable {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i2 = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i2) {
            getEndIconDelegate().onSuffixVisibilityChanged(i2 == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i2);
        this.textInputLayout.updateDummyDrawables();
    }

    void addOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    int getEndIconMode() {
        return this.endIconMode;
    }

    ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    CharSequence getSuffixText() {
        return this.suffixText;
    }

    ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    int getSuffixTextEndOffset() {
        return ViewCompat.getPaddingEnd(this) + ViewCompat.getPaddingEnd(this.suffixTextView) + ((isEndIconVisible() || isErrorIconVisible()) ? this.endIconView.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams()) : 0);
    }

    TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    void onHintStateChanged(boolean z2) {
        this.hintExpanded = z2;
        updateSuffixTextVisibility();
    }

    void onTextInputBoxStateUpdated() throws Throwable {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    void refreshIconState(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean zIsChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z4 = true;
        if (!endIconDelegate.isIconCheckable() || (zIsChecked = this.endIconView.isChecked()) == endIconDelegate.isIconChecked()) {
            z3 = false;
        } else {
            this.endIconView.setChecked(!zIsChecked);
            z3 = true;
        }
        if (!endIconDelegate.isIconActivable() || (zIsActivated = this.endIconView.isActivated()) == endIconDelegate.isIconActivated()) {
            z4 = z3;
        } else {
            setEndIconActivated(!zIsActivated);
        }
        if (z2 || z4) {
            refreshEndIconDrawableState();
        }
    }

    void removeOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    void setEndIconActivated(boolean z2) {
        this.endIconView.setActivated(z2);
    }

    void setEndIconCheckable(boolean z2) {
        this.endIconView.setCheckable(z2);
    }

    void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null);
    }

    void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    void setEndIconMinSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != this.endIconMinSize) {
            this.endIconMinSize = i2;
            IconHelper.setIconMinSize(this.endIconView, i2);
            IconHelper.setIconMinSize(this.errorIconView, i2);
        }
    }

    void setEndIconMode(int i2) throws Throwable {
        if (this.endIconMode == i2) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i3 = this.endIconMode;
        this.endIconMode = i2;
        dispatchOnEndIconChanged(i3);
        setEndIconVisible(i2 != 0);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (!endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        setUpDelegate(endIconDelegate);
        setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
        EditText editText = this.editText;
        if (editText != null) {
            endIconDelegate.onEditTextAttached(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate);
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
        refreshIconState(true);
    }

    void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    void setEndIconVisible(boolean z2) throws Throwable {
        if (isEndIconVisible() != z2) {
            this.endIconView.setVisibility(z2 ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    void setErrorIconDrawable(int i2) throws Throwable {
        setErrorIconDrawable(i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null);
        refreshErrorIconDrawableState();
    }

    void setErrorIconDrawable(Drawable drawable) throws Throwable {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null);
    }

    void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    void setPasswordVisibilityToggleEnabled(boolean z2) throws Throwable {
        if (z2 && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z2) {
                return;
            }
            setEndIconMode(0);
        }
    }

    void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    void setSuffixTextAppearance(int i2) {
        TextViewCompat.setTextAppearance(this.suffixTextView, i2);
    }

    void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    void togglePasswordVisibilityToggle(boolean z2) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z2) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    void updateSuffixTextViewPadding() throws Throwable {
        if (this.textInputLayout.editText == null) {
            return;
        }
        int paddingEnd = (isEndIconVisible() || isErrorIconVisible()) ? 0 : ViewCompat.getPaddingEnd(this.textInputLayout.editText);
        TextView textView = this.suffixTextView;
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\"{j\u000b$O_\u000b\u0013\bU\u0013E7\u0001G&77\u0010O\fZ", (short) (OY.Xd() ^ 12185), (short) (OY.Xd() ^ 2457))).getMethod(C1626yg.Ud("p`D\u00058C4\u000e/\u0019(7", (short) (C1607wl.Xd() ^ 16844), (short) (C1607wl.Xd() ^ 17729)), new Class[0]);
        try {
            method.setAccessible(true);
            ViewCompat.setPaddingRelative(textView, ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), paddingEnd, this.textInputLayout.editText.getPaddingBottom());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
