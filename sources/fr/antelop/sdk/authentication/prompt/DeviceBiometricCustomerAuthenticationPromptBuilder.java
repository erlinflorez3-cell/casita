package fr.antelop.sdk.authentication.prompt;

/* JADX INFO: loaded from: classes5.dex */
public final class DeviceBiometricCustomerAuthenticationPromptBuilder extends CustomerAuthenticationPromptBuilder {
    private String subtitle;
    private String title;

    @Override // fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder
    public final DeviceBiometricCustomerAuthenticationPrompt build() {
        return new DeviceBiometricCustomerAuthenticationPrompt(this.title, this.subtitle);
    }

    public final DeviceBiometricCustomerAuthenticationPromptBuilder setSubtitle(String str) {
        this.subtitle = str;
        return this;
    }

    public final DeviceBiometricCustomerAuthenticationPromptBuilder setTitle(String str) {
        this.title = str;
        return this;
    }
}
