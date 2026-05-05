package com.incode.welcome_sdk;

import com.incode.welcome_sdk.ThemeConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10417c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10418e = 0;

    public static final String d(ThemeConfiguration themeConfiguration) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(themeConfiguration, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("customThemeResId", themeConfiguration.getCustomTheme());
            jSONObject.put("headline1ResId", themeConfiguration.getHeadline1Style());
            jSONObject.put("headline2ResId", themeConfiguration.getHeadline2Style());
            jSONObject.put("headline3ResId", themeConfiguration.getHeadline3Style());
            jSONObject.put("headline4ResId", themeConfiguration.getHeadline4Style());
            jSONObject.put("bodyBigResId", themeConfiguration.getBodyBigStyle());
            jSONObject.put("bodyLeadResId", themeConfiguration.getBodyLeadStyle());
            jSONObject.put("bodyQuoteResId", themeConfiguration.getBodyQuoteStyle());
            jSONObject.put("bodyLongTextResId", themeConfiguration.getBodyLongTextStyle());
            jSONObject.put("labelBigResId", themeConfiguration.getLabelBigStyle());
            jSONObject.put("labelSmallResId", themeConfiguration.getLabelSmallStyle());
            jSONObject.put("bottomSheetItemResId", themeConfiguration.getBottomSheetItemStyle());
            jSONObject.put("scanFeedbackTextBigResId", themeConfiguration.getScanFeedbackTextBigStyle());
            jSONObject.put("scanFeedbackTextSmallResId", themeConfiguration.getScanFeedbackTextSmallStyle());
            jSONObject.put("manualCaptureInstructionsTextResId", themeConfiguration.getManualCaptureInstructionsTextStyle());
            jSONObject.put("inputSpecialResId", themeConfiguration.getInputSpecialStyle());
            jSONObject.put("inputBigResId", themeConfiguration.getInputBigStyle());
            jSONObject.put("inputSmallResId", themeConfiguration.getInputSmallStyle());
            jSONObject.put("inputEditTextResId", themeConfiguration.getInputEditTextStyle());
            jSONObject.put("inputEdiTextErrorResId", themeConfiguration.getInputEditTextErrorStyle());
            jSONObject.put("inputSpinnerResId", themeConfiguration.getInputSpinnerStyle());
            jSONObject.put("spinnerResId", themeConfiguration.getSpinnerStyle());
            jSONObject.put("buttonPrimaryBigResId", themeConfiguration.getButtonPrimaryBigStyle());
            jSONObject.put("buttonPrimaryBigAltResId", themeConfiguration.getButtonPrimaryBigAltStyle());
            jSONObject.put("buttonPrimaryMediumResId", themeConfiguration.getButtonPrimaryMediumStyle());
            jSONObject.put("buttonPrimarySmallResId", themeConfiguration.getButtonPrimarySmallStyle());
            jSONObject.put("buttonSecondaryBigResId", themeConfiguration.getButtonSecondaryBigStyle());
            jSONObject.put("buttonSecondaryMediumResId", themeConfiguration.getButtonSecondaryMediumStyle());
            jSONObject.put("buttonSecondarySmallResId", themeConfiguration.getButtonSecondarySmallStyle());
            jSONObject.put("buttonTextBigResId", themeConfiguration.getButtonTextBigStyle());
            jSONObject.put("buttonTextMediumResId", themeConfiguration.getButtonTextMediumStyle());
            jSONObject.put("buttonTextSmallResId", themeConfiguration.getButtonTextSmallStyle());
            jSONObject.put("buttonNeedHelpResId", themeConfiguration.getButtonNeedHelpStyle());
            jSONObject.put("buttonNeedHelpManualCaptureResId", themeConfiguration.getButtonNeedHelpManualCaptureStyle());
            jSONObject.put("dividerResId", themeConfiguration.getDividerStyle());
            jSONObject.put("countdownAnimationBackgroundResId", themeConfiguration.getCountdownAnimationBackgroundStyle());
            jSONObject.put("countdownAnimationTextResId", themeConfiguration.getCountdownAnimationTextStyle());
            jSONObject.put("logoResId", themeConfiguration.getLogo());
            String string = jSONObject.toString();
            int i3 = f10418e + 51;
            f10417c = i3 % 128;
            int i4 = i3 % 2;
            return string;
        } catch (JSONException e2) {
            Timber.Forest.e(e2);
            return null;
        }
    }

    public static final ThemeConfiguration c(String str) {
        int i2 = 2 % 2;
        int i3 = f10418e + 17;
        f10417c = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            return new ThemeConfiguration.Builder().build();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ThemeConfiguration themeConfigurationBuild = new ThemeConfiguration.Builder().setCustomTheme(jSONObject.optInt("customThemeResId", -1)).setHeadline1Style(jSONObject.optInt("headline1ResId", -1)).setHeadline2Style(jSONObject.optInt("headline2ResId", -1)).setHeadline3Style(jSONObject.optInt("headline3ResId", -1)).setHeadline4Style(jSONObject.optInt("headline4ResId", -1)).setBodyBigStyle(jSONObject.optInt("bodyBigResId", -1)).setBodyLeadStyle(jSONObject.optInt("bodyLeadResId", -1)).setBodyQuoteStyle(jSONObject.optInt("bodyQuoteResId", -1)).setBodyLongTextStyle(jSONObject.optInt("bodyLongTextResId", -1)).setLabelBigStyle(jSONObject.optInt("labelBigResId", -1)).setLabelSmallStyle(jSONObject.optInt("labelSmallResId", -1)).setBottomSheetItemStyle(jSONObject.optInt("bottomSheetItemResId", -1)).setScanFeedbackTextBigStyle(jSONObject.optInt("scanFeedbackTextBigResId", -1)).setScanFeedbackTextSmallStyle(jSONObject.optInt("scanFeedbackTextSmallResId", -1)).setManualCaptureInstructionsTextStyle(jSONObject.optInt("manualCaptureInstructionsTextResId", -1)).setInputSpecialStyle(jSONObject.optInt("inputSpecialResId", -1)).setInputBigStyle(jSONObject.optInt("inputBigResId", -1)).setInputSmallStyle(jSONObject.optInt("inputSmallResId", -1)).setInputEditTextStyle(jSONObject.optInt("inputEditTextResId", -1)).setInputEditTextErrorStyle(jSONObject.optInt("inputEditTextErrorResId", -1)).setInputSpinnerStyle(jSONObject.optInt("inputSpinnerResId", -1)).setSpinnerStyle(jSONObject.optInt("spinnerResId", -1)).setButtonPrimaryBigStyle(jSONObject.optInt("buttonPrimaryBigResId", -1)).setButtonPrimaryBigAltStyle(jSONObject.optInt("buttonPrimaryBigAltResId", -1)).setButtonPrimaryMediumStyle(jSONObject.optInt("buttonPrimaryMediumResId", -1)).setButtonPrimarySmallStyle(jSONObject.optInt("buttonPrimarySmallResId", -1)).setButtonSecondaryBigStyle(jSONObject.optInt("buttonSecondaryBigResId", -1)).setButtonSecondaryMediumStyle(jSONObject.optInt("buttonSecondaryMediumResId", -1)).setButtonSecondarySmallStyle(jSONObject.optInt("buttonSecondarySmallResId", -1)).setButtonTextBigStyle(jSONObject.optInt("buttonTextBigResId", -1)).setButtonTextMediumStyle(jSONObject.optInt("buttonTextMediumResId", -1)).setButtonTextSmallStyle(jSONObject.optInt("buttonTextSmallResId", -1)).setButtonNeedHelpStyle(jSONObject.optInt("buttonNeedHelpResId", -1)).setButtonNeedHelpManualCaptureStyle(jSONObject.optInt("buttonNeedHelpManualCaptureResId", -1)).setDividerStyle(jSONObject.optInt("dividerResId", -1)).setCountdownAnimationBackgroundStyle(jSONObject.optInt("countdownAnimationBackgroundResId", -1)).setCountdownAnimationTextStyle(jSONObject.optInt("countdownAnimationTextResId", -1)).setLogo(jSONObject.optInt("logoResId", -1)).build();
            int i5 = f10417c + 111;
            f10418e = i5 % 128;
            int i6 = i5 % 2;
            return themeConfigurationBuild;
        } catch (JSONException e2) {
            Timber.Forest.e(e2);
            return new ThemeConfiguration.Builder().build();
        }
    }
}
