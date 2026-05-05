package fr.antelop.sdk.authentication;

import android.content.Context;
import fr.antelop.sdk.exception.WalletValidationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface CustomerAuthenticatedProcess {
    List<CustomerAuthenticationMethodType> getAuthenticatedMethods();

    String getCustomerAuthenticationPatternName();

    String getMessage();

    boolean isOnline();

    void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws WalletValidationException;
}
