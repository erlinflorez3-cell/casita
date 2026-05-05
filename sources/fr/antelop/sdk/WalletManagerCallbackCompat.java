package fr.antelop.sdk;

import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.CustomerCredentialsRequiredReason;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface WalletManagerCallbackCompat {
    void onAsyncRequestError(AsyncRequestType asyncRequestType, AntelopError antelopError, Object obj);

    void onAsyncRequestSuccess(AsyncRequestType asyncRequestType, Object obj);

    void onConnectionError(AntelopError antelopError, Object obj);

    void onConnectionSuccess(Wallet wallet, Object obj);

    void onCredentialsRequired(CustomerCredentialsRequiredReason customerCredentialsRequiredReason, AntelopError antelopError, Object obj);

    void onLocalAuthenticationError(CustomerAuthenticationMethodType customerAuthenticationMethodType, LocalAuthenticationErrorReason localAuthenticationErrorReason, String str, Object obj);

    void onLocalAuthenticationSuccess(CustomerAuthenticationMethodType customerAuthenticationMethodType, Object obj);

    void onProvisioningRequired(Object obj);
}
