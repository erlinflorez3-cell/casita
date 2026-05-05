package fr.antelop.sdk.authentication;

import fr.antelop.sdk.AntelopError;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface CustomCustomerAuthenticatedProcessCallback {
    void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess);

    void onCustomerCredentialsInvalid(LocalAuthenticationErrorReason localAuthenticationErrorReason, CustomerAuthenticatedProcess customerAuthenticatedProcess);

    void onCustomerCredentialsRequired(List<CustomerAuthenticationMethod> list, CustomerAuthenticatedProcess customerAuthenticatedProcess);

    void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess);

    void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess);

    void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess);
}
