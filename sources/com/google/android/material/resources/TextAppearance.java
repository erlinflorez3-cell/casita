package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;
    public final String fontFamily;
    private final int fontFamilyResourceId;
    private boolean fontResolved = false;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    private ColorStateList textColor;
    public final ColorStateList textColorHint;
    public final ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(Context context, int i2) throws Throwable {
        int[] iArr = R.styleable.TextAppearance;
        Class<?> cls = Class.forName(C1626yg.Ud("\u0018w|:at\u000e\b\u0012b\u0002+O~x}F\u00056\r=!:", (short) (FB.Xd() ^ 3247), (short) (FB.Xd() ^ 3977)));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(i2), iArr};
        Method method = cls.getMethod(Ig.wd("b/\rX7^e=fLE$1XrQ#\ba&[0", (short) (Od.Xd() ^ (-17289))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            setTextSize(typedArray.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f));
            setTextColor(MaterialResources.getColorStateList(context, typedArray, R.styleable.TextAppearance_android_textColor));
            this.textColorHint = MaterialResources.getColorStateList(context, typedArray, R.styleable.TextAppearance_android_textColorHint);
            this.textColorLink = MaterialResources.getColorStateList(context, typedArray, R.styleable.TextAppearance_android_textColorLink);
            this.textStyle = typedArray.getInt(R.styleable.TextAppearance_android_textStyle, 0);
            this.typeface = typedArray.getInt(R.styleable.TextAppearance_android_typeface, 1);
            int indexWithValue = MaterialResources.getIndexWithValue(typedArray, R.styleable.TextAppearance_fontFamily, R.styleable.TextAppearance_android_fontFamily);
            this.fontFamilyResourceId = typedArray.getResourceId(indexWithValue, 0);
            this.fontFamily = typedArray.getString(indexWithValue);
            this.textAllCaps = typedArray.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
            this.shadowColor = MaterialResources.getColorStateList(context, typedArray, R.styleable.TextAppearance_android_shadowColor);
            this.shadowDx = typedArray.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
            this.shadowDy = typedArray.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
            this.shadowRadius = typedArray.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
            typedArray.recycle();
            int[] iArr2 = R.styleable.MaterialTextAppearance;
            short sXd = (short) (C1633zX.Xd() ^ (-1990));
            int[] iArr3 = new int["l+S\u0002\u001fuLVfvs\u0018Wj\t`\u001aX\u0010>i)C".length()];
            QB qb = new QB("l+S\u0002\u001fuLVfvs\u0018Wj\t`\u001aX\u0010>i)C");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr3[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                i3++;
            }
            Class<?> cls2 = Class.forName(new String(iArr3, 0, i3));
            Class<?>[] clsArr2 = {Integer.TYPE, int[].class};
            Object[] objArr2 = {Integer.valueOf(i2), iArr2};
            short sXd2 = (short) (ZN.Xd() ^ 2150);
            int[] iArr4 = new int["cUfRY]AaeWOM)[ZWMEWUER".length()];
            QB qb2 = new QB("cUfRY]AaeWOM)[ZWMEWUER");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr4[i4] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i4 + xuXd2.CK(iKK2));
                i4++;
            }
            Method method2 = cls2.getMethod(new String(iArr4, 0, i4), clsArr2);
            try {
                method2.setAccessible(true);
                TypedArray typedArray2 = (TypedArray) method2.invoke(context, objArr2);
                this.hasLetterSpacing = typedArray2.hasValue(R.styleable.MaterialTextAppearance_android_letterSpacing);
                this.letterSpacing = typedArray2.getFloat(R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
                typedArray2.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private void createFallbackFont() {
        String str;
        if (this.font == null && (str = this.fontFamily) != null) {
            this.font = Typeface.create(str, this.textStyle);
        }
        if (this.font == null) {
            int i2 = this.typeface;
            if (i2 == 1) {
                this.font = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.font = Typeface.SERIF;
            } else if (i2 != 3) {
                this.font = Typeface.DEFAULT;
            } else {
                this.font = Typeface.MONOSPACE;
            }
            this.font = Typeface.create(this.font, this.textStyle);
        }
    }

    private boolean shouldLoadFontSynchronously(Context context) {
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            return true;
        }
        int i2 = this.fontFamilyResourceId;
        return (i2 != 0 ? ResourcesCompat.getCachedFont(context, i2) : null) != null;
    }

    public Typeface getFallbackFont() {
        createFallbackFont();
        return this.font;
    }

    public Typeface getFont(Context context) throws Throwable {
        if (this.fontResolved) {
            return this.font;
        }
        short sXd = (short) (Od.Xd() ^ (-14498));
        short sXd2 = (short) (Od.Xd() ^ (-16589));
        int[] iArr = new int["Q_Vec^Z%[hhoakr-Cppwi}z".length()];
        QB qb = new QB("Q_Vec^Z%[hhoakr-Cppwi}z");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("w\u0001^p}}zpiyig", (short) (C1607wl.Xd() ^ 27693)), new Class[0]);
        try {
            method.setAccessible(true);
            if (!((Boolean) method.invoke(context, objArr)).booleanValue()) {
                try {
                    Typeface font = ResourcesCompat.getFont(context, this.fontFamilyResourceId);
                    this.font = font;
                    if (font != null) {
                        this.font = Typeface.create(font, this.textStyle);
                    }
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                } catch (Exception e2) {
                    String str = C1561oA.Kd(">lmko\u001ekobflrl&mww~+", (short) (C1499aX.Xd() ^ (-15766))) + this.fontFamily;
                    Wg.Zd("\f2\fl{\u0011V-mu'\u0019TX", (short) (OY.Xd() ^ 4223), (short) (OY.Xd() ^ 31911));
                }
            }
            createFallbackFont();
            this.fontResolved = true;
            return this.font;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void getFontAsync(final Context context, final TextPaint textPaint, final TextAppearanceFontCallback textAppearanceFontCallback) throws Throwable {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i2) {
                textAppearanceFontCallback.onFontRetrievalFailed(i2);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(Typeface typeface, boolean z2) throws Throwable {
                TextAppearance.this.updateTextPaintMeasureState(context, textPaint, typeface);
                textAppearanceFontCallback.onFontRetrieved(typeface, z2);
            }
        });
    }

    public void getFontAsync(Context context, final TextAppearanceFontCallback textAppearanceFontCallback) throws Throwable {
        if (shouldLoadFontSynchronously(context)) {
            getFont(context);
        } else {
            createFallbackFont();
        }
        int i2 = this.fontFamilyResourceId;
        if (i2 == 0) {
            this.fontResolved = true;
        }
        if (this.fontResolved) {
            textAppearanceFontCallback.onFontRetrieved(this.font, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i2, new ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                /* JADX INFO: renamed from: onFontRetrievalFailed */
                public void m6907xb24343b7(int i3) {
                    TextAppearance.this.fontResolved = true;
                    textAppearanceFontCallback.onFontRetrievalFailed(i3);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                /* JADX INFO: renamed from: onFontRetrieved */
                public void m6908x46c88379(Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.font = Typeface.create(typeface, textAppearance.textStyle);
                    TextAppearance.this.fontResolved = true;
                    textAppearanceFontCallback.onFontRetrieved(TextAppearance.this.font, false);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception e2) {
            String str = "Error loading font " + this.fontFamily;
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    public ColorStateList getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
    }

    public void setTextSize(float f2) {
        this.textSize = f2;
    }

    public void updateDrawState(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) throws Throwable {
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.textColor;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.textColor.getDefaultColor()) : ViewCompat.MEASURED_STATE_MASK);
        float f2 = this.shadowRadius;
        float f3 = this.shadowDx;
        float f4 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.shadowColor.getDefaultColor()) : 0);
    }

    public void updateMeasureState(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) throws Throwable {
        if (shouldLoadFontSynchronously(context)) {
            updateTextPaintMeasureState(context, textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(Context context, TextPaint textPaint, Typeface typeface) throws Throwable {
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i2 = this.textStyle & (~typeface.getStyle());
        textPaint.setFakeBoldText((1 & i2) != 0);
        textPaint.setTextSkewX((i2 + 2) - (i2 | 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.textSize);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }
}
