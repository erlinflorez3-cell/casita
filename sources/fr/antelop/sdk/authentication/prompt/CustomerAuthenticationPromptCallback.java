package fr.antelop.sdk.authentication.prompt;

import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;

/* JADX INFO: loaded from: classes5.dex */
public interface CustomerAuthenticationPromptCallback {
    void onAuthenticationFailure(CustomerAuthenticationFailureReason customerAuthenticationFailureReason);

    void onAuthenticationSuccess(CustomerAuthenticationCredentials customerAuthenticationCredentials);
}
