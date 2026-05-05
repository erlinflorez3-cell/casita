package fr.antelop.sdk.authentication.prompt;

/* JADX INFO: loaded from: classes5.dex */
public final class DeviceBiometricCustomerAuthenticationPrompt extends CustomerAuthenticationPrompt {
    private final String subtitle;
    private final String title;

    DeviceBiometricCustomerAuthenticationPrompt(String str, String str2) {
        this.title = str;
        this.subtitle = str2;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }
}
