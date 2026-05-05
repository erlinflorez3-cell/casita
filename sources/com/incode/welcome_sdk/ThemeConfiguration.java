package com.incode.welcome_sdk;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class ThemeConfiguration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4408a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4409b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4410c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4411d = 1;
    private final int bodyBigResId;
    private final int bodyLeadResId;
    private final int bodyLongTextResId;
    private final int bodyQuoteResId;
    private final int bottomSheetItemResId;
    private final int buttonNeedHelpManualCaptureResId;
    private final int buttonNeedHelpResId;
    private final int buttonPrimaryBigAltResId;
    private final int buttonPrimaryBigResId;
    private final int buttonPrimaryMediumResId;
    private final int buttonPrimarySmallResId;
    private final int buttonSecondaryBigResId;
    private final int buttonSecondaryMediumResId;
    private final int buttonSecondarySmallResId;
    private final int buttonTextBigResId;
    private final int buttonTextMediumResId;
    private final int buttonTextSmallResId;
    private final int countdownAnimationBackgroundResId;
    private final int countdownAnimationTextResId;
    private final int customThemeResId;
    private final int dividerResId;
    private final int headline1ResId;
    private final int headline2ResId;
    private final int headline3ResId;
    private final int headline4ResId;
    private final int inputBigResId;
    private final int inputEditTextErrorResId;
    private final int inputEditTextResId;
    private final int inputSmallResId;
    private final int inputSpecialResId;
    private final int inputSpinnerResId;
    private final int labelBigResId;
    private final int labelSmallResId;
    private final int logoResId;
    private final int manualCaptureInstructionsTextResId;
    private final int scanFeedbackTextBigResId;
    private final int scanFeedbackTextSmallResId;
    private final int spinnerResId;

    private ThemeConfiguration(Builder builder) {
        this.customThemeResId = builder.getCustomThemeResId$onboard_release();
        this.headline1ResId = builder.getHeadline1ResId$onboard_release();
        this.headline2ResId = builder.getHeadline2ResId$onboard_release();
        this.headline3ResId = builder.getHeadline3ResId$onboard_release();
        this.headline4ResId = builder.getHeadline4ResId$onboard_release();
        this.bodyBigResId = builder.getBodyBigResId$onboard_release();
        this.bodyLeadResId = builder.getBodyLeadResId$onboard_release();
        this.bodyQuoteResId = builder.getBodyQuoteResId$onboard_release();
        this.bodyLongTextResId = builder.getBodyLongTextResId$onboard_release();
        this.labelBigResId = builder.getLabelBigResId$onboard_release();
        this.labelSmallResId = builder.getLabelSmallResId$onboard_release();
        this.bottomSheetItemResId = builder.getBottomSheetItemResId$onboard_release();
        this.scanFeedbackTextBigResId = builder.getScanFeedbackTextBigResId$onboard_release();
        this.scanFeedbackTextSmallResId = builder.getScanFeedbackTextSmallResId$onboard_release();
        this.manualCaptureInstructionsTextResId = builder.getManualCaptureInstructionsTextResId$onboard_release();
        this.inputSpecialResId = builder.getInputSpecialResId$onboard_release();
        this.inputBigResId = builder.getInputBigResId$onboard_release();
        this.inputSmallResId = builder.getInputSmallResId$onboard_release();
        this.inputEditTextResId = builder.getInputEditTextResId$onboard_release();
        this.inputEditTextErrorResId = builder.getInputEditTextErrorResId$onboard_release();
        this.inputSpinnerResId = builder.getInputSpinnerResId$onboard_release();
        this.spinnerResId = builder.getSpinnerResId$onboard_release();
        this.buttonPrimaryBigResId = builder.getButtonPrimaryBigResId$onboard_release();
        this.buttonPrimaryBigAltResId = builder.getButtonPrimaryBigAltResId$onboard_release();
        this.buttonPrimaryMediumResId = builder.getButtonPrimaryMediumResId$onboard_release();
        this.buttonPrimarySmallResId = builder.getButtonPrimarySmallResId$onboard_release();
        this.buttonSecondaryBigResId = builder.getButtonSecondaryBigResId$onboard_release();
        this.buttonSecondaryMediumResId = builder.getButtonSecondaryMediumResId$onboard_release();
        this.buttonSecondarySmallResId = builder.getButtonSecondarySmallResId$onboard_release();
        this.buttonTextBigResId = builder.getButtonTextBigResId$onboard_release();
        this.buttonTextMediumResId = builder.getButtonTextMediumResId$onboard_release();
        this.buttonTextSmallResId = builder.getButtonTextSmallResId$onboard_release();
        this.buttonNeedHelpResId = builder.getButtonNeedHelpResId$onboard_release();
        this.buttonNeedHelpManualCaptureResId = builder.getButtonNeedHelpManualCaptureResId$onboard_release();
        this.dividerResId = builder.getDividerResId$onboard_release();
        this.countdownAnimationBackgroundResId = builder.getCountdownAnimationBackgroundResId$onboard_release();
        this.countdownAnimationTextResId = builder.getCountdownAnimationTextResId$onboard_release();
        this.logoResId = builder.getLogoResId$onboard_release();
    }

    public final int getCustomTheme() {
        int i2 = 2 % 2;
        int i3 = f4409b + 7;
        f4411d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.customThemeResId;
        }
        throw null;
    }

    public final int getHeadline1Style() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 121;
        f4409b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.headline1ResId;
        int i6 = i3 + 115;
        f4409b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int getHeadline2Style() {
        int i2 = 2 % 2;
        int i3 = f4411d + 47;
        f4409b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.headline2ResId;
        if (i4 != 0) {
            int i6 = 69 / 0;
        }
        return i5;
    }

    public final int getHeadline3Style() {
        int i2 = 2 % 2;
        int i3 = f4409b + 107;
        f4411d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.headline3ResId;
        if (i4 == 0) {
            int i6 = 32 / 0;
        }
        return i5;
    }

    public final int getHeadline4Style() {
        int i2 = 2 % 2;
        int i3 = f4409b + 25;
        f4411d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.headline4ResId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getBodyBigStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 115;
        int i4 = i3 % 128;
        f4409b = i4;
        int i5 = i3 % 2;
        int i6 = this.bodyBigResId;
        int i7 = i4 + 27;
        f4411d = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getBodyLeadStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 53;
        f4411d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.bodyLeadResId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getBodyQuoteStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b;
        int i4 = i3 + 1;
        f4411d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.bodyQuoteResId;
        int i7 = i3 + 117;
        f4411d = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getBodyLongTextStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b;
        int i4 = i3 + 7;
        f4411d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.bodyLongTextResId;
        int i7 = i3 + 65;
        f4411d = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 27 / 0;
        }
        return i6;
    }

    public final int getLabelBigStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 107;
        int i4 = i3 % 128;
        f4411d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.labelBigResId;
        int i6 = i4 + 5;
        f4409b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getLabelSmallStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 59;
        f4411d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.labelSmallResId;
        }
        throw null;
    }

    public final int getBottomSheetItemStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 17;
        int i4 = i3 % 128;
        f4409b = i4;
        int i5 = i3 % 2;
        int i6 = this.bottomSheetItemResId;
        int i7 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4411d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getScanFeedbackTextBigStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 61;
        f4409b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.scanFeedbackTextBigResId;
        int i7 = i3 + 115;
        f4409b = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getScanFeedbackTextSmallStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 117;
        f4409b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.scanFeedbackTextSmallResId;
        int i7 = i3 + 69;
        f4409b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 96 / 0;
        }
        return i6;
    }

    public final int getManualCaptureInstructionsTextStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 5;
        int i4 = i3 % 128;
        f4411d = i4;
        int i5 = i3 % 2;
        int i6 = this.manualCaptureInstructionsTextResId;
        int i7 = i4 + 17;
        f4409b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 21 / 0;
        }
        return i6;
    }

    public final int getInputSpecialStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 115;
        f4409b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.inputSpecialResId;
        int i7 = i3 + 85;
        f4409b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getInputBigStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 35;
        f4409b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.inputBigResId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getInputSmallStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 25;
        int i4 = i3 % 128;
        f4411d = i4;
        int i5 = i3 % 2;
        int i6 = this.inputSmallResId;
        int i7 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4409b = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getInputEditTextStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 35;
        int i4 = i3 % 128;
        f4411d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.inputEditTextResId;
        int i6 = i4 + 57;
        f4409b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getInputEditTextErrorStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 11;
        int i4 = i3 % 128;
        f4409b = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.inputEditTextErrorResId;
        int i6 = i4 + 81;
        f4411d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 44 / 0;
        }
        return i5;
    }

    public final int getInputSpinnerStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 25;
        int i4 = i3 % 128;
        f4411d = i4;
        int i5 = i3 % 2;
        int i6 = this.inputSpinnerResId;
        int i7 = i4 + 49;
        f4409b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getSpinnerStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 5;
        int i4 = i3 % 128;
        f4411d = i4;
        int i5 = i3 % 2;
        int i6 = this.spinnerResId;
        int i7 = i4 + 39;
        f4409b = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getButtonPrimaryBigStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 43;
        f4409b = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.buttonPrimaryBigResId;
        int i6 = i3 + 77;
        f4409b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getButtonPrimaryBigAltStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 77;
        int i4 = i3 % 128;
        f4411d = i4;
        int i5 = i3 % 2;
        int i6 = this.buttonPrimaryBigAltResId;
        int i7 = i4 + 93;
        f4409b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 99 / 0;
        }
        return i6;
    }

    public final int getButtonPrimaryMediumStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 91;
        int i4 = i3 % 128;
        f4409b = i4;
        int i5 = i3 % 2;
        int i6 = this.buttonPrimaryMediumResId;
        int i7 = i4 + 87;
        f4411d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getButtonPrimarySmallStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b;
        int i4 = i3 + 81;
        f4411d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.buttonPrimarySmallResId;
        int i7 = i3 + 67;
        f4411d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getButtonSecondaryBigStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 79;
        f4409b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.buttonSecondaryBigResId;
        if (i4 != 0) {
            int i6 = 93 / 0;
        }
        return i5;
    }

    public final int getButtonSecondaryMediumStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 39;
        f4409b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.buttonSecondaryMediumResId;
        int i7 = i3 + 63;
        f4409b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getButtonSecondarySmallStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 99;
        int i4 = i3 % 128;
        f4409b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.buttonSecondarySmallResId;
        int i6 = i4 + 73;
        f4411d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 7 / 0;
        }
        return i5;
    }

    public final int getButtonTextBigStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 103;
        int i4 = i3 % 128;
        f4409b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.buttonTextBigResId;
        int i6 = i4 + 77;
        f4411d = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int getButtonTextMediumStyle() {
        int i2 = 2 % 2;
        int i3 = f4409b + 25;
        int i4 = i3 % 128;
        f4411d = i4;
        int i5 = i3 % 2;
        int i6 = this.buttonTextMediumResId;
        int i7 = i4 + 23;
        f4409b = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public final int getButtonTextSmallStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 73;
        f4409b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.buttonTextSmallResId;
        }
        throw null;
    }

    public final int getButtonNeedHelpStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 65;
        f4409b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.buttonNeedHelpResId;
        int i7 = i3 + 27;
        f4409b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getButtonNeedHelpManualCaptureStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 19;
        int i4 = i3 % 128;
        f4409b = i4;
        int i5 = i3 % 2;
        int i6 = this.buttonNeedHelpManualCaptureResId;
        int i7 = i4 + 45;
        f4411d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getDividerStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 105;
        int i4 = i3 % 128;
        f4409b = i4;
        int i5 = i3 % 2;
        int i6 = this.dividerResId;
        int i7 = i4 + 89;
        f4411d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getCountdownAnimationBackgroundStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d + 85;
        int i4 = i3 % 128;
        f4409b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.countdownAnimationBackgroundResId;
        int i6 = i4 + 49;
        f4411d = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int getCountdownAnimationTextStyle() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 13;
        f4409b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.countdownAnimationTextResId;
        int i7 = i3 + 29;
        f4409b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getLogo() {
        int i2 = 2 % 2;
        int i3 = f4411d;
        int i4 = i3 + 113;
        f4409b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = this.logoResId;
        int i6 = i3 + 109;
        f4409b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4412a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f4413b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f4414c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f4415d = 9 % 128;
        private int customThemeResId = -1;
        private int headline1ResId = -1;
        private int headline2ResId = -1;
        private int headline3ResId = -1;
        private int headline4ResId = -1;
        private int bodyBigResId = -1;
        private int bodyLeadResId = -1;
        private int bodyQuoteResId = -1;
        private int bodyLongTextResId = -1;
        private int labelBigResId = -1;
        private int labelSmallResId = -1;
        private int inputSpecialResId = -1;
        private int inputBigResId = -1;
        private int inputSmallResId = -1;
        private int inputEditTextResId = -1;
        private int inputEditTextErrorResId = -1;
        private int inputSpinnerResId = -1;
        private int spinnerResId = -1;
        private int buttonPrimaryBigResId = -1;
        private int buttonPrimaryBigAltResId = -1;
        private int buttonPrimaryMediumResId = -1;
        private int buttonPrimarySmallResId = -1;
        private int buttonSecondaryBigResId = -1;
        private int buttonSecondaryMediumResId = -1;
        private int buttonSecondarySmallResId = -1;
        private int buttonTextBigResId = -1;
        private int buttonTextMediumResId = -1;
        private int buttonTextSmallResId = -1;
        private int buttonNeedHelpResId = -1;
        private int buttonNeedHelpManualCaptureResId = -1;
        private int dividerResId = -1;
        private int bottomSheetItemResId = -1;
        private int scanFeedbackTextBigResId = -1;
        private int scanFeedbackTextSmallResId = -1;
        private int manualCaptureInstructionsTextResId = -1;
        private int countdownAnimationBackgroundResId = -1;
        private int countdownAnimationTextResId = -1;
        private int logoResId = -1;

        public final int getCustomThemeResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a + 107;
            f4414c = i3 % 128;
            if (i3 % 2 == 0) {
                return this.customThemeResId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getHeadline1ResId$onboard_release() {
            int i2;
            int i3 = 2 % 2;
            int i4 = f4412a;
            int i5 = i4 + 47;
            f4414c = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = this.headline1ResId;
                int i6 = 75 / 0;
            } else {
                i2 = this.headline1ResId;
            }
            int i7 = i4 + 9;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return i2;
            }
            throw null;
        }

        public final int getHeadline2ResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c + 1;
            f4412a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.headline2ResId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getHeadline3ResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c + 77;
            f4412a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.headline3ResId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getHeadline4ResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c + 37;
            int i4 = i3 % 128;
            f4412a = i4;
            int i5 = i3 % 2;
            int i6 = this.headline4ResId;
            int i7 = i4 + 95;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return i6;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getBodyBigResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c;
            int i4 = i3 + 51;
            f4412a = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = this.bodyBigResId;
            int i6 = i3 + 125;
            f4412a = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        public final int getBodyLeadResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a + 93;
            f4414c = i3 % 128;
            if (i3 % 2 == 0) {
                return this.bodyLeadResId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getBodyQuoteResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c + 1;
            int i4 = i3 % 128;
            f4412a = i4;
            int i5 = i3 % 2;
            int i6 = this.bodyQuoteResId;
            int i7 = i4 + 53;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getBodyLongTextResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c;
            int i4 = i3 + 19;
            f4412a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.bodyLongTextResId;
            int i7 = i3 + 53;
            f4412a = i7 % 128;
            if (i7 % 2 != 0) {
                return i6;
            }
            throw null;
        }

        public final int getLabelBigResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 49;
            f4414c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.labelBigResId;
            int i7 = i3 + 5;
            f4414c = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 76 / 0;
            }
            return i6;
        }

        public final int getLabelSmallResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a + 89;
            f4414c = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.labelSmallResId;
            if (i4 != 0) {
                int i6 = 0 / 0;
            }
            return i5;
        }

        public final int getInputSpecialResId$onboard_release() {
            int i2;
            int i3 = 2 % 2;
            int i4 = f4412a;
            int i5 = i4 + 13;
            f4414c = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = this.inputSpecialResId;
                int i6 = 98 / 0;
            } else {
                i2 = this.inputSpecialResId;
            }
            int i7 = i4 + 29;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i2;
        }

        public final int getInputBigResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f4414c = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.inputBigResId;
            if (i4 != 0) {
                int i6 = 45 / 0;
            }
            return i5;
        }

        public final int getInputSmallResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c + 9;
            f4412a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.inputSmallResId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getInputEditTextResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 29;
            f4414c = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = this.inputEditTextResId;
            int i6 = i3 + 125;
            f4414c = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int getInputEditTextErrorResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c;
            int i4 = i3 + 101;
            f4412a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.inputEditTextErrorResId;
            int i7 = i3 + 31;
            f4412a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 8 / 0;
            }
            return i6;
        }

        public final int getInputSpinnerResId$onboard_release() {
            int i2;
            int i3 = 2 % 2;
            int i4 = f4412a + 15;
            int i5 = i4 % 128;
            f4414c = i5;
            if (i4 % 2 != 0) {
                i2 = this.inputSpinnerResId;
                int i6 = 87 / 0;
            } else {
                i2 = this.inputSpinnerResId;
            }
            int i7 = i5 + 23;
            f4412a = i7 % 128;
            int i8 = i7 % 2;
            return i2;
        }

        public final int getSpinnerResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c + 19;
            int i4 = i3 % 128;
            f4412a = i4;
            int i5 = i3 % 2;
            int i6 = this.spinnerResId;
            int i7 = i4 + 39;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getButtonPrimaryBigResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 77;
            f4414c = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = this.buttonPrimaryBigResId;
            int i6 = i3 + 97;
            f4414c = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        public final int getButtonPrimaryBigAltResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a + 41;
            int i4 = i3 % 128;
            f4414c = i4;
            int i5 = i3 % 2;
            int i6 = this.buttonPrimaryBigAltResId;
            int i7 = i4 + 51;
            f4412a = i7 % 128;
            if (i7 % 2 != 0) {
                return i6;
            }
            throw null;
        }

        public final int getButtonPrimaryMediumResId$onboard_release() {
            int i2;
            int i3 = 2 % 2;
            int i4 = f4412a;
            int i5 = i4 + 31;
            f4414c = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = this.buttonPrimaryMediumResId;
                int i6 = 85 / 0;
            } else {
                i2 = this.buttonPrimaryMediumResId;
            }
            int i7 = i4 + 107;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i2;
        }

        public final int getButtonPrimarySmallResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c + 57;
            int i4 = i3 % 128;
            f4412a = i4;
            int i5 = i3 % 2;
            int i6 = this.buttonPrimarySmallResId;
            int i7 = i4 + 15;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getButtonSecondaryBigResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c;
            int i4 = i3 + 57;
            f4412a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.buttonSecondaryBigResId;
            int i7 = i3 + 9;
            f4412a = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getButtonSecondaryMediumResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 51;
            f4414c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.buttonSecondaryMediumResId;
            int i7 = i3 + 109;
            f4414c = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 97 / 0;
            }
            return i6;
        }

        public final int getButtonSecondarySmallResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 115;
            f4414c = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = this.buttonSecondarySmallResId;
            int i6 = i3 + 71;
            f4414c = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int getButtonTextBigResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c;
            int i4 = i3 + 109;
            f4412a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = this.buttonTextBigResId;
            int i6 = i3 + 15;
            f4412a = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        public final int getButtonTextMediumResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a + 29;
            int i4 = i3 % 128;
            f4414c = i4;
            int i5 = i3 % 2;
            int i6 = this.buttonTextMediumResId;
            int i7 = i4 + 63;
            f4412a = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getButtonTextSmallResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f4414c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.buttonTextSmallResId;
            int i7 = i3 + 95;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getButtonNeedHelpResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            int i4 = i3 % 128;
            f4414c = i4;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = this.buttonNeedHelpResId;
            int i6 = i4 + 105;
            f4412a = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int getButtonNeedHelpManualCaptureResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 63;
            f4414c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.buttonNeedHelpManualCaptureResId;
            int i7 = i3 + 51;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return i6;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getDividerResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 89;
            f4414c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.dividerResId;
            int i7 = i3 + 87;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getBottomSheetItemResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4414c + 25;
            f4412a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.bottomSheetItemResId;
            }
            throw null;
        }

        public final int getScanFeedbackTextBigResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 35;
            f4414c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.scanFeedbackTextBigResId;
            int i7 = i3 + 89;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getScanFeedbackTextSmallResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 89;
            f4414c = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = this.scanFeedbackTextSmallResId;
            int i6 = i3 + 43;
            f4414c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 36 / 0;
            }
            return i5;
        }

        public final int getManualCaptureInstructionsTextResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 21;
            f4414c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.manualCaptureInstructionsTextResId;
            int i7 = i3 + 75;
            f4414c = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 65 / 0;
            }
            return i6;
        }

        public final int getCountdownAnimationBackgroundResId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4412a;
            int i4 = i3 + 47;
            f4414c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.countdownAnimationBackgroundResId;
            int i7 = i3 + 35;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int getCountdownAnimationTextResId$onboard_release() {
            int i2;
            int i3 = 2 % 2;
            int i4 = f4414c + 19;
            int i5 = i4 % 128;
            f4412a = i5;
            if (i4 % 2 == 0) {
                i2 = this.countdownAnimationTextResId;
                int i6 = 81 / 0;
            } else {
                i2 = this.countdownAnimationTextResId;
            }
            int i7 = i5 + 3;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i2;
        }

        public final int getLogoResId$onboard_release() {
            int i2;
            int i3 = 2 % 2;
            int i4 = f4414c + 57;
            int i5 = i4 % 128;
            f4412a = i5;
            if (i4 % 2 == 0) {
                i2 = this.logoResId;
                int i6 = 81 / 0;
            } else {
                i2 = this.logoResId;
            }
            int i7 = i5 + 9;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return i2;
        }

        public final Builder setCustomTheme(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 121;
            int i5 = i4 % 128;
            f4414c = i5;
            int i6 = i4 % 2;
            this.customThemeResId = i2;
            int i7 = i5 + 103;
            f4412a = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setHeadline1Style(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c;
            int i5 = i4 + 59;
            f4412a = i5 % 128;
            int i6 = i5 % 2;
            this.headline1ResId = i2;
            int i7 = i4 + 69;
            f4412a = i7 % 128;
            if (i7 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder setHeadline2Style(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 125;
            int i5 = i4 % 128;
            f4414c = i5;
            int i6 = i4 % 2;
            this.headline2ResId = i2;
            int i7 = i5 + 69;
            f4412a = i7 % 128;
            if (i7 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setHeadline3Style(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 15;
            int i5 = i4 % 128;
            f4414c = i5;
            int i6 = i4 % 2;
            this.headline3ResId = i2;
            int i7 = i5 + 75;
            f4412a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 0 / 0;
            }
            return this;
        }

        public final Builder setHeadline4Style(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c;
            int i5 = i4 + 41;
            f4412a = i5 % 128;
            if (i5 % 2 != 0) {
                this.headline4ResId = i2;
                int i6 = i4 + 69;
                f4412a = i6 % 128;
                int i7 = i6 % 2;
                return this;
            }
            this.headline4ResId = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setBodyBigStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 35;
            f4412a = i4 % 128;
            if (i4 % 2 != 0) {
                this.bodyBigResId = i2;
                return this;
            }
            this.bodyBigResId = i2;
            throw null;
        }

        public final Builder setBodyLeadStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a;
            int i5 = i4 + 17;
            f4414c = i5 % 128;
            int i6 = i5 % 2;
            this.bodyLeadResId = i2;
            int i7 = i4 + 59;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setBodyQuoteStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 33;
            int i5 = i4 % 128;
            f4414c = i5;
            int i6 = i4 % 2;
            this.bodyQuoteResId = i2;
            int i7 = i5 + 83;
            f4412a = i7 % 128;
            if (i7 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder setBodyLongTextStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 7;
            f4414c = i4 % 128;
            if (i4 % 2 == 0) {
                this.bodyLongTextResId = i2;
                return this;
            }
            this.bodyLongTextResId = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setLabelBigStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a;
            int i5 = i4 + 41;
            f4414c = i5 % 128;
            if (i5 % 2 != 0) {
                this.labelBigResId = i2;
                int i6 = 2 / 0;
            } else {
                this.labelBigResId = i2;
            }
            int i7 = i4 + 29;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setLabelSmallStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 77;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.labelSmallResId = i2;
            int i7 = i5 + 121;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setBottomSheetItemStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 103;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.bottomSheetItemResId = i2;
            int i7 = i5 + 23;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        @Deprecated(message = "This method is deprecated and will be removed in a future version")
        public final Builder setScanFeedbackTextStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 49;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.scanFeedbackTextSmallResId = i2;
            int i7 = i5 + 103;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setScanFeedbackTextBigStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 81;
            f4412a = i4 % 128;
            if (i4 % 2 != 0) {
                this.scanFeedbackTextBigResId = i2;
                return this;
            }
            this.scanFeedbackTextBigResId = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setScanFeedbackTextSmallStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 111;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.scanFeedbackTextSmallResId = i2;
            int i7 = i5 + 41;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setManualCaptureInstructionsTextStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 63;
            int i5 = i4 % 128;
            f4412a = i5;
            if (i4 % 2 != 0) {
                this.manualCaptureInstructionsTextResId = i2;
                int i6 = i5 + 53;
                f4414c = i6 % 128;
                int i7 = i6 % 2;
                return this;
            }
            this.manualCaptureInstructionsTextResId = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setInputSpecialStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 79;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.inputSpecialResId = i2;
            int i7 = i5 + 15;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setInputBigStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 125;
            int i5 = i4 % 128;
            f4414c = i5;
            int i6 = i4 % 2;
            this.inputBigResId = i2;
            int i7 = i5 + 55;
            f4412a = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setInputSmallStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 33;
            f4412a = i4 % 128;
            if (i4 % 2 != 0) {
                this.inputSmallResId = i2;
                return this;
            }
            this.inputSmallResId = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setInputEditTextStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 83;
            f4414c = i4 % 128;
            if (i4 % 2 == 0) {
                this.inputEditTextResId = i2;
                return this;
            }
            this.inputEditTextResId = i2;
            throw null;
        }

        public final Builder setInputEditTextErrorStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c;
            int i5 = i4 + 103;
            f4412a = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                this.inputEditTextErrorResId = i2;
                int i6 = i4 + 57;
                f4412a = i6 % 128;
                if (i6 % 2 != 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
            this.inputEditTextErrorResId = i2;
            obj.hashCode();
            throw null;
        }

        public final Builder setInputSpinnerStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 73;
            f4414c = i4 % 128;
            if (i4 % 2 != 0) {
                this.inputSpinnerResId = i2;
                int i5 = 30 / 0;
            } else {
                this.inputSpinnerResId = i2;
            }
            return this;
        }

        public final Builder setSpinnerStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 49;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.spinnerResId = i2;
            int i7 = i5 + 85;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setButtonPrimaryBigStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 67;
            int i5 = i4 % 128;
            f4414c = i5;
            int i6 = i4 % 2;
            this.buttonPrimaryBigResId = i2;
            int i7 = i5 + 103;
            f4412a = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setButtonPrimaryBigAltStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 63;
            f4414c = i4 % 128;
            if (i4 % 2 != 0) {
                this.buttonPrimaryBigAltResId = i2;
                int i5 = 90 / 0;
            } else {
                this.buttonPrimaryBigAltResId = i2;
            }
            return this;
        }

        public final Builder setButtonPrimaryMediumStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 97;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.buttonPrimaryMediumResId = i2;
            int i7 = i5 + 25;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setButtonPrimarySmallStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a;
            int i5 = i4 + 81;
            f4414c = i5 % 128;
            if (i5 % 2 != 0) {
                this.buttonPrimarySmallResId = i2;
                int i6 = 34 / 0;
            } else {
                this.buttonPrimarySmallResId = i2;
            }
            int i7 = i4 + 13;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setButtonSecondaryBigStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c;
            int i5 = i4 + 103;
            f4412a = i5 % 128;
            int i6 = i5 % 2;
            this.buttonSecondaryBigResId = i2;
            int i7 = i4 + 39;
            f4412a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 71 / 0;
            }
            return this;
        }

        public final Builder setButtonSecondaryMediumStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a + 103;
            f4414c = i4 % 128;
            if (i4 % 2 != 0) {
                this.buttonSecondaryMediumResId = i2;
                int i5 = 25 / 0;
            } else {
                this.buttonSecondaryMediumResId = i2;
            }
            return this;
        }

        public final Builder setButtonSecondarySmallStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 47;
            f4412a = i4 % 128;
            if (i4 % 2 == 0) {
                this.buttonSecondarySmallResId = i2;
                int i5 = 20 / 0;
            } else {
                this.buttonSecondarySmallResId = i2;
            }
            return this;
        }

        public final Builder setButtonTextBigStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c;
            int i5 = i4 + 97;
            f4412a = i5 % 128;
            if (i5 % 2 != 0) {
                this.buttonTextBigResId = i2;
                int i6 = i4 + 125;
                f4412a = i6 % 128;
                int i7 = i6 % 2;
                return this;
            }
            this.buttonTextBigResId = i2;
            throw null;
        }

        public final Builder setButtonTextMediumStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a;
            int i5 = i4 + 37;
            f4414c = i5 % 128;
            int i6 = i5 % 2;
            this.buttonTextMediumResId = i2;
            int i7 = i4 + 1;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setButtonTextSmallStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 53;
            int i5 = i4 % 128;
            f4412a = i5;
            Object obj = null;
            if (i4 % 2 != 0) {
                this.buttonTextSmallResId = i2;
                int i6 = i5 + 85;
                f4414c = i6 % 128;
                if (i6 % 2 == 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
            this.buttonTextSmallResId = i2;
            obj.hashCode();
            throw null;
        }

        public final Builder setButtonNeedHelpStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 15;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.buttonNeedHelpResId = i2;
            int i7 = i5 + 59;
            f4414c = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setButtonNeedHelpManualCaptureStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4412a;
            int i5 = i4 + 33;
            f4414c = i5 % 128;
            if (i5 % 2 != 0) {
                this.buttonNeedHelpManualCaptureResId = i2;
                int i6 = 83 / 0;
            } else {
                this.buttonNeedHelpManualCaptureResId = i2;
            }
            int i7 = i4 + 57;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setDividerStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c;
            int i5 = i4 + 121;
            f4412a = i5 % 128;
            int i6 = i5 % 2;
            this.dividerResId = i2;
            int i7 = i4 + 49;
            f4412a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 46 / 0;
            }
            return this;
        }

        public final Builder setCountdownAnimationBackgroundStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c;
            int i5 = i4 + 99;
            f4412a = i5 % 128;
            int i6 = i5 % 2;
            this.countdownAnimationBackgroundResId = i2;
            int i7 = i4 + 19;
            f4412a = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Builder setCountdownAnimationTextStyle(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 61;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.countdownAnimationTextResId = i2;
            int i7 = i5 + 19;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setLogo(int i2) {
            int i3 = 2 % 2;
            int i4 = f4414c + 13;
            int i5 = i4 % 128;
            f4412a = i5;
            int i6 = i4 % 2;
            this.logoResId = i2;
            int i7 = i5 + 33;
            f4414c = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ThemeConfiguration build() {
            int i2 = 2 % 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemeConfiguration themeConfiguration = new ThemeConfiguration(this, defaultConstructorMarker);
            int i3 = f4412a + 71;
            f4414c = i3 % 128;
            if (i3 % 2 == 0) {
                return themeConfiguration;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        static {
            int i2 = 9 % 2;
        }
    }

    static {
        int i2 = 1 + 27;
        f4408a = i2 % 128;
        int i3 = i2 % 2;
    }

    public /* synthetic */ ThemeConfiguration(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
