package com.incode.welcome_sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.TextViewCompat;
import com.airbnb.paris.extensions.TextViewStyleExtensionsKt;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ThemeConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeButton extends AppCompatButton {
    public static final int $stable = 0;

    public /* synthetic */ IncodeButton(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.style.onboard_sdk_ButtonPrimary : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        if (isInEditMode()) {
            return;
        }
        initCustomView(attributeSet);
    }

    static /* synthetic */ void initCustomView$default(IncodeButton incodeButton, AttributeSet attributeSet, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            attributeSet = null;
        }
        incodeButton.initCustomView(attributeSet);
    }

    private final void initCustomView(AttributeSet attributeSet) {
        if (IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIncodeRepository().isDynamicStylingAvailable()) {
            ThemeConfiguration themeConfiguration = IncodeWelcome.Companion.getInstance().getInternalConfig().getThemeConfiguration();
            Integer numValueOf = attributeSet != null ? Integer.valueOf(attributeSet.getStyleAttribute()) : null;
            int i2 = R.style.onboard_sdk_ButtonPrimaryBig;
            if (numValueOf != null && numValueOf.intValue() == i2) {
                if (themeConfiguration.getButtonPrimaryBigStyle() != -1) {
                    IncodeButton incodeButton = this;
                    TextViewStyleExtensionsKt.style(incodeButton, themeConfiguration.getButtonPrimaryBigStyle());
                    TextViewCompat.setTextAppearance(incodeButton, themeConfiguration.getButtonPrimaryBigStyle());
                }
            } else {
                int i3 = R.style.onboard_sdk_ButtonPrimaryBigAlt;
                if (numValueOf != null && numValueOf.intValue() == i3) {
                    if (themeConfiguration.getButtonPrimaryBigAltStyle() != -1) {
                        IncodeButton incodeButton2 = this;
                        TextViewStyleExtensionsKt.style(incodeButton2, themeConfiguration.getButtonPrimaryBigAltStyle());
                        TextViewCompat.setTextAppearance(incodeButton2, themeConfiguration.getButtonPrimaryBigAltStyle());
                    }
                } else {
                    int i4 = R.style.onboard_sdk_ButtonPrimaryMedium;
                    if (numValueOf != null && numValueOf.intValue() == i4) {
                        if (themeConfiguration.getButtonPrimaryMediumStyle() != -1) {
                            IncodeButton incodeButton3 = this;
                            TextViewStyleExtensionsKt.style(incodeButton3, themeConfiguration.getButtonPrimaryMediumStyle());
                            TextViewCompat.setTextAppearance(incodeButton3, themeConfiguration.getButtonPrimaryMediumStyle());
                        }
                    } else {
                        int i5 = R.style.onboard_sdk_ButtonPrimarySmall;
                        if (numValueOf != null && numValueOf.intValue() == i5) {
                            if (themeConfiguration.getButtonPrimarySmallStyle() != -1) {
                                IncodeButton incodeButton4 = this;
                                TextViewStyleExtensionsKt.style(incodeButton4, themeConfiguration.getButtonPrimarySmallStyle());
                                TextViewCompat.setTextAppearance(incodeButton4, themeConfiguration.getButtonPrimarySmallStyle());
                            }
                        } else {
                            int i6 = R.style.onboard_sdk_ButtonSecondaryBig;
                            if (numValueOf != null && numValueOf.intValue() == i6) {
                                if (themeConfiguration.getButtonSecondaryBigStyle() != -1) {
                                    IncodeButton incodeButton5 = this;
                                    TextViewStyleExtensionsKt.style(incodeButton5, themeConfiguration.getButtonSecondaryBigStyle());
                                    TextViewCompat.setTextAppearance(incodeButton5, themeConfiguration.getButtonSecondaryBigStyle());
                                }
                            } else {
                                int i7 = R.style.onboard_sdk_ButtonSecondaryMedium;
                                if (numValueOf != null && numValueOf.intValue() == i7) {
                                    if (themeConfiguration.getButtonSecondaryMediumStyle() != -1) {
                                        IncodeButton incodeButton6 = this;
                                        TextViewStyleExtensionsKt.style(incodeButton6, themeConfiguration.getButtonSecondaryMediumStyle());
                                        TextViewCompat.setTextAppearance(incodeButton6, themeConfiguration.getButtonSecondaryMediumStyle());
                                    }
                                } else {
                                    int i8 = R.style.onboard_sdk_ButtonSecondarySmall;
                                    if (numValueOf != null && numValueOf.intValue() == i8) {
                                        if (themeConfiguration.getButtonSecondarySmallStyle() != -1) {
                                            IncodeButton incodeButton7 = this;
                                            TextViewStyleExtensionsKt.style(incodeButton7, themeConfiguration.getButtonSecondarySmallStyle());
                                            TextViewCompat.setTextAppearance(incodeButton7, themeConfiguration.getButtonSecondarySmallStyle());
                                        }
                                    } else {
                                        int i9 = R.style.onboard_sdk_ButtonTextBig;
                                        if (numValueOf != null && numValueOf.intValue() == i9) {
                                            if (themeConfiguration.getButtonTextBigStyle() != -1) {
                                                IncodeButton incodeButton8 = this;
                                                TextViewStyleExtensionsKt.style(incodeButton8, themeConfiguration.getButtonTextBigStyle());
                                                TextViewCompat.setTextAppearance(incodeButton8, themeConfiguration.getButtonTextBigStyle());
                                            }
                                        } else {
                                            int i10 = R.style.onboard_sdk_ButtonTextMedium;
                                            if (numValueOf != null && numValueOf.intValue() == i10) {
                                                if (themeConfiguration.getButtonTextMediumStyle() != -1) {
                                                    IncodeButton incodeButton9 = this;
                                                    TextViewStyleExtensionsKt.style(incodeButton9, themeConfiguration.getButtonTextMediumStyle());
                                                    TextViewCompat.setTextAppearance(incodeButton9, themeConfiguration.getButtonTextMediumStyle());
                                                }
                                            } else {
                                                int i11 = R.style.onboard_sdk_ButtonTextSmall;
                                                if (numValueOf != null && numValueOf.intValue() == i11) {
                                                    if (themeConfiguration.getButtonTextSmallStyle() != -1) {
                                                        IncodeButton incodeButton10 = this;
                                                        TextViewStyleExtensionsKt.style(incodeButton10, themeConfiguration.getButtonTextSmallStyle());
                                                        TextViewCompat.setTextAppearance(incodeButton10, themeConfiguration.getButtonTextSmallStyle());
                                                    }
                                                } else {
                                                    int i12 = R.style.onboard_sdk_ButtonNeedHelp;
                                                    if (numValueOf != null && numValueOf.intValue() == i12) {
                                                        if (themeConfiguration.getButtonNeedHelpStyle() != -1) {
                                                            IncodeButton incodeButton11 = this;
                                                            TextViewStyleExtensionsKt.style(incodeButton11, themeConfiguration.getButtonNeedHelpStyle());
                                                            TextViewCompat.setTextAppearance(incodeButton11, themeConfiguration.getButtonNeedHelpStyle());
                                                        }
                                                    } else {
                                                        int i13 = R.style.onboard_sdk_ButtonNeedHelpManualCapture;
                                                        if (numValueOf != null && numValueOf.intValue() == i13 && themeConfiguration.getButtonNeedHelpManualCaptureStyle() != -1) {
                                                            IncodeButton incodeButton12 = this;
                                                            TextViewStyleExtensionsKt.style(incodeButton12, themeConfiguration.getButtonNeedHelpManualCaptureStyle());
                                                            TextViewCompat.setTextAppearance(incodeButton12, themeConfiguration.getButtonNeedHelpManualCaptureStyle());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_IncodeButton, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            setXmlAttributes(typedArrayObtainStyledAttributes);
        }
    }

    private final void setXmlAttributes(TypedArray typedArray) {
        try {
            int integer = typedArray.getInteger(R.styleable.onboard_sdk_IncodeButton_android_gravity, -1);
            if (integer >= 0) {
                setGravity(integer);
            }
        } finally {
            typedArray.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
