package fr.antelop.sdk;

import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.CustomerCredentialsRequiredReason;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;

/* JADX INFO: loaded from: classes5.dex */
public interface WalletManagerCallback {
    void onAsyncRequestError(AsyncRequestType asyncRequestType, AntelopError antelopError);

    void onAsyncRequestSuccess(AsyncRequestType asyncRequestType);

    void onConnectionError(AntelopError antelopError);

    void onConnectionSuccess(Wallet wallet);

    void onCredentialsRequired(CustomerCredentialsRequiredReason customerCredentialsRequiredReason, AntelopError antelopError);

    void onLocalAuthenticationError(CustomerAuthenticationMethodType customerAuthenticationMethodType, LocalAuthenticationErrorReason localAuthenticationErrorReason, String str);

    void onLocalAuthenticationSuccess(CustomerAuthenticationMethodType customerAuthenticationMethodType);

    void onProvisioningRequired();
}
