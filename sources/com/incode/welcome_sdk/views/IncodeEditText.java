package com.incode.welcome_sdk.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.airbnb.paris.extensions.TextViewStyleExtensionsKt;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ThemeConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeEditText extends AppCompatEditText {
    public static final int $stable = 0;

    public /* synthetic */ IncodeEditText(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.editTextStyle : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        if (isInEditMode()) {
            return;
        }
        initCustomView(attributeSet);
    }

    static /* synthetic */ void initCustomView$default(IncodeEditText incodeEditText, AttributeSet attributeSet, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            attributeSet = null;
        }
        incodeEditText.initCustomView(attributeSet);
    }

    private final void initCustomView(AttributeSet attributeSet) {
        if (IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIncodeRepository().isDynamicStylingAvailable()) {
            ThemeConfiguration themeConfiguration = IncodeWelcome.Companion.getInstance().getInternalConfig().getThemeConfiguration();
            Integer numValueOf = attributeSet != null ? Integer.valueOf(attributeSet.getStyleAttribute()) : null;
            int i2 = com.incode.welcome_sdk.R.style.onboard_sdk_InputSpecial;
            if (numValueOf != null && numValueOf.intValue() == i2) {
                if (themeConfiguration.getInputSpecialStyle() != -1) {
                    TextViewStyleExtensionsKt.style(this, themeConfiguration.getInputSpecialStyle());
                }
            } else {
                int i3 = com.incode.welcome_sdk.R.style.onboard_sdk_InputBig;
                if (numValueOf != null && numValueOf.intValue() == i3) {
                    if (themeConfiguration.getInputBigStyle() != -1) {
                        TextViewStyleExtensionsKt.style(this, themeConfiguration.getInputBigStyle());
                    }
                } else {
                    int i4 = com.incode.welcome_sdk.R.style.onboard_sdk_InputSmall;
                    if (numValueOf != null && numValueOf.intValue() == i4) {
                        if (themeConfiguration.getInputSmallStyle() != -1) {
                            TextViewStyleExtensionsKt.style(this, themeConfiguration.getInputSmallStyle());
                        }
                    } else {
                        int i5 = com.incode.welcome_sdk.R.style.onboard_sdk_InputEditText;
                        if (numValueOf != null && numValueOf.intValue() == i5) {
                            if (themeConfiguration.getInputEditTextStyle() != -1) {
                                TextViewStyleExtensionsKt.style(this, themeConfiguration.getInputEditTextStyle());
                            }
                        } else {
                            int i6 = com.incode.welcome_sdk.R.style.onboard_sdk_InputEditTextError;
                            if (numValueOf != null && numValueOf.intValue() == i6) {
                                if (themeConfiguration.getInputEditTextErrorStyle() != -1) {
                                    TextViewStyleExtensionsKt.style(this, themeConfiguration.getInputEditTextErrorStyle());
                                }
                            } else {
                                int i7 = com.incode.welcome_sdk.R.style.onboard_sdk_InputSpinner;
                                if (numValueOf != null && numValueOf.intValue() == i7 && themeConfiguration.getInputSpinnerStyle() != -1) {
                                    TextViewStyleExtensionsKt.style(this, themeConfiguration.getInputSpinnerStyle());
                                }
                            }
                        }
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, com.incode.welcome_sdk.R.styleable.onboard_sdk_IncodeEditText, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            setXmlAttributes(typedArrayObtainStyledAttributes);
        }
    }

    private final void setXmlAttributes(TypedArray typedArray) {
        try {
            int integer = typedArray.getInteger(com.incode.welcome_sdk.R.styleable.onboard_sdk_IncodeEditText_android_gravity, -1);
            if (integer >= 0) {
                setGravity(integer);
            }
            int integer2 = typedArray.getInteger(com.incode.welcome_sdk.R.styleable.onboard_sdk_IncodeEditText_android_inputType, 0);
            if (integer2 != 0) {
                setInputType(integer2);
            }
        } finally {
            typedArray.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
