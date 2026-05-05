package fr.antelop.sdk.authentication;

import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPrompt;
import fr.antelop.sdk.authentication.prompt.CustomerAuthenticationPromptBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface DefaultCustomerAuthenticatedProcessCallback {
    CustomerAuthenticationPrompt buildCustomerAuthenticationPrompt(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationPromptBuilder customerAuthenticationPromptBuilder);

    void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess);

    void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess);

    void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess);

    void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess);
}
