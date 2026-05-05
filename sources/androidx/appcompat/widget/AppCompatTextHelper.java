package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.C1607wl;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    AppCompatTextHelper(TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void loadFromAttributes(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) throws Throwable {
        int i2;
        String string;
        this.mStyle = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.mStyle);
        if (Build.VERSION.SDK_INT >= 28) {
            int i3 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i3;
            if (i3 != -1) {
                int i4 = this.mStyle;
                this.mStyle = (i4 + 2) - (i4 | 2);
            }
        }
        if (tintTypedArray.hasValue(R.styleable.TextAppearance_android_fontFamily) || tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            this.mFontTypeface = null;
            if (tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
                i2 = R.styleable.TextAppearance_fontFamily;
            } else {
                i2 = R.styleable.TextAppearance_android_fontFamily;
            }
            int i5 = this.mFontWeight;
            int i6 = this.mStyle;
            short sXd = (short) (C1607wl.Xd() ^ 1749);
            short sXd2 = (short) (C1607wl.Xd() ^ 24344);
            int[] iArr = new int["(l>?\u0018I'LT8r[((\u0002vNRL&R<\u001c".length()];
            QB qb = new QB("(l>?\u0018I'LT8r[((\u0002vNRL&R<\u001c");
            int i7 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i7] = xuXd.fK(((i7 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i7++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i7));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (ZN.Xd() ^ 17486);
            int[] iArr2 = new int["\u001f*\n\u001e-/.&!3%%".length()];
            QB qb2 = new QB("\u001f*\n\u001e-/.&!3%%");
            int i8 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i8));
                i8++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i8), clsArr);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(context, objArr)).booleanValue()) {
                    try {
                        Typeface font = tintTypedArray.getFont(i2, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                            final /* synthetic */ int val$fontWeight;
                            final /* synthetic */ int val$style;
                            final /* synthetic */ WeakReference val$textViewWeak;

                            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                            /* JADX INFO: renamed from: onFontRetrievalFailed */
                            public void m6907xb24343b7(int i9) {
                            }

                            AnonymousClass1(int i52, int i62, WeakReference weakReference) {
                                i = i52;
                                i = i62;
                                weakReference = weakReference;
                            }

                            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                            /* JADX INFO: renamed from: onFontRetrieved */
                            public void m6908x46c88379(Typeface typeface) {
                                int i9;
                                if (Build.VERSION.SDK_INT >= 28 && (i9 = i) != -1) {
                                    int i10 = i;
                                    typeface = Api28Impl.create(typeface, i9, (i10 + 2) - (i10 | 2) != 0);
                                }
                                AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                            }
                        });
                        if (font != null) {
                            if (Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                                this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                            } else {
                                this.mFontTypeface = font;
                            }
                        }
                        this.mAsyncFontPending = this.mFontTypeface == null;
                    } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                    }
                }
                if (this.mFontTypeface == null && (string = tintTypedArray.getString(i2)) != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                        Typeface typefaceCreate = Typeface.create(string, 0);
                        int i9 = this.mFontWeight;
                        int i10 = this.mStyle;
                        this.mFontTypeface = Api28Impl.create(typefaceCreate, i9, (i10 + 2) - (i10 | 2) != 0);
                        return;
                    }
                    this.mFontTypeface = Typeface.create(string, this.mStyle);
                    return;
                }
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (tintTypedArray.hasValue(R.styleable.TextAppearance_android_typeface)) {
            this.mAsyncFontPending = false;
            int i11 = tintTypedArray.getInt(R.styleable.TextAppearance_android_typeface, 1);
            if (i11 == 1) {
                this.mFontTypeface = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.mFontTypeface = Typeface.SERIF;
            } else {
                if (i11 != 3) {
                    return;
                }
                this.mFontTypeface = Typeface.MONOSPACE;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatTextHelper$1 */
    class AnonymousClass1 extends ResourcesCompat.FontCallback {
        final /* synthetic */ int val$fontWeight;
        final /* synthetic */ int val$style;
        final /* synthetic */ WeakReference val$textViewWeak;

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public void m6907xb24343b7(int i9) {
        }

        AnonymousClass1(int i52, int i62, WeakReference weakReference) {
            i = i52;
            i = i62;
            weakReference = weakReference;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* JADX INFO: renamed from: onFontRetrieved */
        public void m6908x46c88379(Typeface typeface) {
            int i9;
            if (Build.VERSION.SDK_INT >= 28 && (i9 = i) != -1) {
                int i10 = i;
                typeface = Api28Impl.create(typeface, i9, (i10 + 2) - (i10 | 2) != 0);
            }
            AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
        }
    }

    void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        final /* synthetic */ int val$style;
                        final /* synthetic */ TextView val$textView;
                        final /* synthetic */ Typeface val$typeface;

                        AnonymousClass2(TextView textView2, Typeface typeface2, int i2) {
                            textView = textView2;
                            typeface = typeface2;
                            i = i2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                } else {
                    textView2.setTypeface(typeface2, this.mStyle);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatTextHelper$2 */
    /* JADX INFO: loaded from: classes2.dex */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ int val$style;
        final /* synthetic */ TextView val$textView;
        final /* synthetic */ Typeface val$typeface;

        AnonymousClass2(TextView textView2, Typeface typeface2, int i2) {
            textView = textView2;
            typeface = typeface2;
            i = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            textView.setTypeface(typeface, i);
        }
    }

    void onSetTextAppearance(Context context, int i2) {
        String string;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i2, R.styleable.TextAppearance);
        if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            setAllCaps(tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes);
        if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.TextAppearance_fontVariationSettings) && (string = tintTypedArrayObtainStyledAttributes.getString(R.styleable.TextAppearance_fontVariationSettings)) != null) {
            Api26Impl.setFontVariationSettings(this.mView, string);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    void setAllCaps(boolean z2) {
        this.mView.setAllCaps(z2);
    }

    void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i2) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i2);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    void setTextSize(int i2, float f2) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i2, f2);
    }

    void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    private void setTextSizeInternal(int i2, float f2) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i2, f2);
    }

    void setAutoSizeTextTypeWithDefaults(int i2) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i2);
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    void setCompoundDrawableTintList(ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        this.mDrawableTint.mTintList = colorStateList;
        this.mDrawableTint.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void setCompoundDrawableTintMode(PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        this.mDrawableTint.mTintMode = mode;
        this.mDrawableTint.mHasTintMode = mode != null;
        setCompoundTints();
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.mView;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.mView.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            TextView textView2 = this.mView;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        this.mView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
    }

    void populateSurroundingTextIfNeeded(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }

        static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }

        static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static Typeface create(Typeface typeface, int i2, boolean z2) {
            return Typeface.create(typeface, i2, z2);
        }
    }
}
