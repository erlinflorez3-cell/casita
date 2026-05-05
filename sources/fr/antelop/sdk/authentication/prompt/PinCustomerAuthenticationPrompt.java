package fr.antelop.sdk.authentication.prompt;

/* JADX INFO: loaded from: classes5.dex */
public final class PinCustomerAuthenticationPrompt extends CustomerAuthenticationPrompt {
    private String biometryFallbackAccessibilityHint;
    private String biometryFallbackAccessibilityLabel;
    private String closeAccessibilityLabel;
    private String deleteAccessibilityHint;
    private String deleteAccessibilityLabel;
    private String digitsCounterAccessibilityLabel;
    private String digitsCounterAccessibilityValueFormat;
    private final InvalidPinMessageProvider invalidPinMessageProvider;
    private boolean pinCheckDisabled;
    private final String subtitle;
    private final String title;

    public interface InvalidPinMessageProvider {
        String getMessage(int i2);
    }

    public PinCustomerAuthenticationPrompt(String str, String str2, InvalidPinMessageProvider invalidPinMessageProvider, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        this.title = str;
        this.subtitle = str2;
        this.invalidPinMessageProvider = invalidPinMessageProvider;
        this.closeAccessibilityLabel = str3;
        this.deleteAccessibilityLabel = str4;
        this.deleteAccessibilityHint = str5;
        this.digitsCounterAccessibilityLabel = str6;
        this.digitsCounterAccessibilityValueFormat = str7;
        this.biometryFallbackAccessibilityLabel = str8;
        this.biometryFallbackAccessibilityHint = str9;
        this.pinCheckDisabled = z2;
    }

    public final String getBiometryFallbackAccessibilityHint() {
        return this.biometryFallbackAccessibilityHint;
    }

    public final String getBiometryFallbackAccessibilityLabel() {
        return this.biometryFallbackAccessibilityLabel;
    }

    public final String getCloseAccessibilityLabel() {
        return this.closeAccessibilityLabel;
    }

    public final String getDeleteAccessibilityHint() {
        return this.deleteAccessibilityHint;
    }

    public final String getDeleteAccessibilityLabel() {
        return this.deleteAccessibilityLabel;
    }

    public final String getDigitsCounterAccessibilityLabel() {
        return this.digitsCounterAccessibilityLabel;
    }

    public final String getDigitsCounterAccessibilityValueFormat() {
        return this.digitsCounterAccessibilityValueFormat;
    }

    public final InvalidPinMessageProvider getInvalidPinMessageProvider() {
        return this.invalidPinMessageProvider;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isPinCheckDisabled() {
        return this.pinCheckDisabled;
    }

    public final void setPinCheckDisabled(boolean z2) {
        this.pinCheckDisabled = z2;
    }
}
