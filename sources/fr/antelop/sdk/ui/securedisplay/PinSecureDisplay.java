package fr.antelop.sdk.ui.securedisplay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import fr.antelop.sdk.CancellationSignal;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationDomain;
import o.ea.f;
import o.eb.c;
import o.eb.i;

/* JADX INFO: loaded from: classes5.dex */
public final class PinSecureDisplay extends AbsSecureDisplay<i> {
    private final String TAG;

    public PinSecureDisplay(String str) throws Throwable {
        super(str, 0, new c() { // from class: fr.antelop.sdk.ui.securedisplay.PinSecureDisplay.1
            @Override // o.eb.c
            public int getThemeResource() {
                return 0;
            }
        });
        this.TAG = WalletValidationDomain.PIN_SECURE_DISPLAY;
        if (f.a()) {
            f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "PinSecureDisplay - Not supported : Feature SCA Disabled");
        }
    }

    private void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "launch - Not supported : Feature SCA Disabled");
        }
    }

    public final CancellationSignal getCancellationSignal() throws Throwable {
        if (!f.a()) {
            return null;
        }
        f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "getCancellationSignal - Not supported : Feature SCA Disabled");
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() throws Throwable {
        if (!f.a()) {
            return false;
        }
        f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "isOnline - Not supported : Feature SCA Disabled");
        return false;
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "launch - Not supported : Feature SCA Disabled");
        }
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "launch - Not supported : Feature SCA Disabled");
        }
    }

    public final PinSecureDisplay setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "setActivityCallback - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    public final PinSecureDisplay setCardBackground(Drawable drawable) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "setCardBackground - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    public final void setOnlineAuthentication(boolean z2) throws Throwable {
        if (f.a()) {
            f.d(WalletValidationDomain.PIN_SECURE_DISPLAY, "setOnlineAuthentication - Not supported : Feature SCA Disabled");
        }
    }
}
