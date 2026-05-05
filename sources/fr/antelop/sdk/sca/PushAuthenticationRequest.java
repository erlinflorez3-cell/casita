package fr.antelop.sdk.sca;

import android.content.Context;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationDomain;
import java.util.List;
import o.ea.f;
import o.w.a;

/* JADX INFO: loaded from: classes5.dex */
public final class PushAuthenticationRequest implements CustomerAuthenticatedProcess {
    private final String TAG = WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST;

    public PushAuthenticationRequest(a aVar) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "PushAuthenticationRequest - Not supported : Feature SCA Disabled");
        }
    }

    public final void authenticate(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "authenticate - Not supported : Feature SCA Disabled");
        }
    }

    public final void authenticate(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "authenticate - Not supported : Feature SCA Disabled");
        }
    }

    public final void cancel(Context context) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "cancel - Not supported : Feature SCA Disabled");
        }
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() throws Throwable {
        if (!f.a()) {
            return null;
        }
        f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "getAuthenticatedMethods - Not supported : Feature SCA Disabled");
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() throws Throwable {
        if (!f.a()) {
            return "";
        }
        f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "getCustomerAuthenticationPatternName - Not supported : Feature SCA Disabled");
        return "";
    }

    public final long getExpiryTimestamp() throws Throwable {
        if (!f.a()) {
            return 0L;
        }
        f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "getExpiryTimestamp - Not supported : Feature SCA Disabled");
        return 0L;
    }

    public final String getId() throws Throwable {
        if (!f.a()) {
            return "";
        }
        f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "getId - Not supported : Feature SCA Disabled");
        return "";
    }

    public final byte[] getIssuerData() throws Throwable {
        if (!f.a()) {
            return null;
        }
        f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "getIssuerData - Not supported : Feature SCA Disabled");
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() throws Throwable {
        if (!f.a()) {
            return null;
        }
        f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "getMessage - Not supported : Feature SCA Disabled");
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() throws Throwable {
        if (!f.a()) {
            return false;
        }
        f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "isOnline - Not supported : Feature SCA Disabled");
        return false;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "setCustomerCredentials - Not supported : Feature SCA Disabled");
        }
    }

    public final String toString() throws Throwable {
        if (!f.a()) {
            return "";
        }
        f.d(WalletValidationDomain.PUSH_AUTHENTICATION_REQUEST, "toString - Not supported : Feature SCA Disabled");
        return "";
    }
}
