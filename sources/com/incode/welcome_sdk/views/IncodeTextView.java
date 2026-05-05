package com.incode.welcome_sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import com.airbnb.paris.extensions.TextViewStyleExtensionsKt;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ThemeConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeTextView extends AppCompatTextView {
    public static final int $stable = 0;

    public /* synthetic */ IncodeTextView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.style.onboard_sdk_LabelBig : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        if (isInEditMode()) {
            return;
        }
        initCustomView(attributeSet);
    }

    public final void setDrawableTint(int i2) {
        Drawable[] compoundDrawables = getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "");
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    static /* synthetic */ void initCustomView$default(IncodeTextView incodeTextView, AttributeSet attributeSet, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            attributeSet = null;
        }
        incodeTextView.initCustomView(attributeSet);
    }

    private final void initCustomView(AttributeSet attributeSet) {
        IncodeWelcome.InternalConfig internalConfig;
        ThemeConfiguration themeConfiguration;
        if (IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIncodeRepository().isDynamicStylingAvailable() && (internalConfig = IncodeWelcome.Companion.getInstance().getInternalConfig()) != null && (themeConfiguration = internalConfig.getThemeConfiguration()) != null) {
            Integer numValueOf = attributeSet != null ? Integer.valueOf(attributeSet.getStyleAttribute()) : null;
            int i2 = R.style.onboard_sdk_Headline1;
            if (numValueOf != null && numValueOf.intValue() == i2) {
                if (themeConfiguration.getHeadline1Style() != -1) {
                    IncodeTextView incodeTextView = this;
                    TextViewStyleExtensionsKt.style(incodeTextView, themeConfiguration.getHeadline1Style());
                    TextViewCompat.setTextAppearance(incodeTextView, themeConfiguration.getHeadline1Style());
                }
            } else {
                int i3 = R.style.onboard_sdk_Headline2;
                if (numValueOf != null && numValueOf.intValue() == i3) {
                    if (themeConfiguration.getHeadline2Style() != -1) {
                        IncodeTextView incodeTextView2 = this;
                        TextViewStyleExtensionsKt.style(incodeTextView2, themeConfiguration.getHeadline2Style());
                        TextViewCompat.setTextAppearance(incodeTextView2, themeConfiguration.getHeadline2Style());
                    }
                } else {
                    int i4 = R.style.onboard_sdk_Headline3;
                    if (numValueOf != null && numValueOf.intValue() == i4) {
                        if (themeConfiguration.getHeadline3Style() != -1) {
                            IncodeTextView incodeTextView3 = this;
                            TextViewStyleExtensionsKt.style(incodeTextView3, themeConfiguration.getHeadline3Style());
                            TextViewCompat.setTextAppearance(incodeTextView3, themeConfiguration.getHeadline3Style());
                        }
                    } else {
                        int i5 = R.style.onboard_sdk_Headline4;
                        if (numValueOf != null && numValueOf.intValue() == i5) {
                            if (themeConfiguration.getHeadline4Style() != -1) {
                                IncodeTextView incodeTextView4 = this;
                                TextViewStyleExtensionsKt.style(incodeTextView4, themeConfiguration.getHeadline4Style());
                                TextViewCompat.setTextAppearance(incodeTextView4, themeConfiguration.getHeadline4Style());
                            }
                        } else {
                            int i6 = R.style.onboard_sdk_BodyBig;
                            if (numValueOf != null && numValueOf.intValue() == i6) {
                                if (themeConfiguration.getBodyBigStyle() != -1) {
                                    IncodeTextView incodeTextView5 = this;
                                    TextViewStyleExtensionsKt.style(incodeTextView5, themeConfiguration.getBodyBigStyle());
                                    TextViewCompat.setTextAppearance(incodeTextView5, themeConfiguration.getBodyBigStyle());
                                }
                            } else {
                                int i7 = R.style.onboard_sdk_BodyLead;
                                if (numValueOf != null && numValueOf.intValue() == i7) {
                                    if (themeConfiguration.getBodyLeadStyle() != -1) {
                                        IncodeTextView incodeTextView6 = this;
                                        TextViewStyleExtensionsKt.style(incodeTextView6, themeConfiguration.getBodyLeadStyle());
                                        TextViewCompat.setTextAppearance(incodeTextView6, themeConfiguration.getBodyLeadStyle());
                                    }
                                } else {
                                    int i8 = R.style.onboard_sdk_BodyQuote;
                                    if (numValueOf != null && numValueOf.intValue() == i8) {
                                        if (themeConfiguration.getBodyQuoteStyle() != -1) {
                                            IncodeTextView incodeTextView7 = this;
                                            TextViewStyleExtensionsKt.style(incodeTextView7, themeConfiguration.getBodyQuoteStyle());
                                            TextViewCompat.setTextAppearance(incodeTextView7, themeConfiguration.getBodyQuoteStyle());
                                        }
                                    } else {
                                        int i9 = R.style.onboard_sdk_BodyLongText;
                                        if (numValueOf != null && numValueOf.intValue() == i9) {
                                            if (themeConfiguration.getBodyLongTextStyle() != -1) {
                                                IncodeTextView incodeTextView8 = this;
                                                TextViewStyleExtensionsKt.style(incodeTextView8, themeConfiguration.getBodyLongTextStyle());
                                                TextViewCompat.setTextAppearance(incodeTextView8, themeConfiguration.getBodyLongTextStyle());
                                            }
                                        } else {
                                            int i10 = R.style.onboard_sdk_LabelBig;
                                            if (numValueOf != null && numValueOf.intValue() == i10) {
                                                if (themeConfiguration.getLabelBigStyle() != -1) {
                                                    IncodeTextView incodeTextView9 = this;
                                                    TextViewStyleExtensionsKt.style(incodeTextView9, themeConfiguration.getLabelBigStyle());
                                                    TextViewCompat.setTextAppearance(incodeTextView9, themeConfiguration.getLabelBigStyle());
                                                }
                                            } else {
                                                int i11 = R.style.onboard_sdk_LabelSmall;
                                                if (numValueOf != null && numValueOf.intValue() == i11) {
                                                    if (themeConfiguration.getLabelSmallStyle() != -1) {
                                                        IncodeTextView incodeTextView10 = this;
                                                        TextViewStyleExtensionsKt.style(incodeTextView10, themeConfiguration.getLabelSmallStyle());
                                                        TextViewCompat.setTextAppearance(incodeTextView10, themeConfiguration.getLabelSmallStyle());
                                                    }
                                                } else {
                                                    int i12 = R.style.onboard_sdk_BottomSheetItem;
                                                    if (numValueOf != null && numValueOf.intValue() == i12) {
                                                        if (themeConfiguration.getBottomSheetItemStyle() != -1) {
                                                            IncodeTextView incodeTextView11 = this;
                                                            TextViewStyleExtensionsKt.style(incodeTextView11, themeConfiguration.getBottomSheetItemStyle());
                                                            TextViewCompat.setTextAppearance(incodeTextView11, themeConfiguration.getBottomSheetItemStyle());
                                                        }
                                                    } else {
                                                        int i13 = R.style.onboard_sdk_ScanFeedbackTextBig;
                                                        if (numValueOf != null && numValueOf.intValue() == i13) {
                                                            if (themeConfiguration.getScanFeedbackTextBigStyle() != -1) {
                                                                IncodeTextView incodeTextView12 = this;
                                                                TextViewStyleExtensionsKt.style(incodeTextView12, themeConfiguration.getScanFeedbackTextBigStyle());
                                                                TextViewCompat.setTextAppearance(incodeTextView12, themeConfiguration.getScanFeedbackTextBigStyle());
                                                            }
                                                        } else {
                                                            int i14 = R.style.onboard_sdk_ScanFeedbackTextSmall;
                                                            if (numValueOf != null && numValueOf.intValue() == i14) {
                                                                if (themeConfiguration.getScanFeedbackTextSmallStyle() != -1) {
                                                                    IncodeTextView incodeTextView13 = this;
                                                                    TextViewStyleExtensionsKt.style(incodeTextView13, themeConfiguration.getScanFeedbackTextSmallStyle());
                                                                    TextViewCompat.setTextAppearance(incodeTextView13, themeConfiguration.getScanFeedbackTextSmallStyle());
                                                                }
                                                            } else {
                                                                int i15 = R.style.onboard_sdk_ManualCaptureInstructionsText;
                                                                if (numValueOf != null && numValueOf.intValue() == i15) {
                                                                    if (themeConfiguration.getManualCaptureInstructionsTextStyle() != -1) {
                                                                        IncodeTextView incodeTextView14 = this;
                                                                        TextViewStyleExtensionsKt.style(incodeTextView14, themeConfiguration.getManualCaptureInstructionsTextStyle());
                                                                        TextViewCompat.setTextAppearance(incodeTextView14, themeConfiguration.getManualCaptureInstructionsTextStyle());
                                                                    }
                                                                } else {
                                                                    int i16 = R.style.onboard_sdk_CountdownAnimationText;
                                                                    if (numValueOf != null && numValueOf.intValue() == i16 && themeConfiguration.getCountdownAnimationTextStyle() != -1) {
                                                                        IncodeTextView incodeTextView15 = this;
                                                                        TextViewStyleExtensionsKt.style(incodeTextView15, themeConfiguration.getCountdownAnimationTextStyle());
                                                                        TextViewCompat.setTextAppearance(incodeTextView15, themeConfiguration.getCountdownAnimationTextStyle());
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
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_IncodeTextView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            setXmlAttributes(typedArrayObtainStyledAttributes);
        }
    }

    private final void setXmlAttributes(TypedArray typedArray) {
        try {
            int integer = typedArray.getInteger(R.styleable.onboard_sdk_IncodeTextView_android_gravity, -1);
            if (integer >= 0) {
                setGravity(integer);
            }
            int integer2 = typedArray.getInteger(R.styleable.onboard_sdk_IncodeTextView_android_maxLines, -1);
            if (integer2 >= 0) {
                setMaxLines(integer2);
            }
            int integer3 = typedArray.getInteger(R.styleable.onboard_sdk_IncodeTextView_onboard_sdk_textColor, -1);
            if (integer3 != -1) {
                setTextColor(integer3);
            }
        } finally {
            typedArray.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeTextView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
