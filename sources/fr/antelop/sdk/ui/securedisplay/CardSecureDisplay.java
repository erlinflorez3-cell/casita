package fr.antelop.sdk.ui.securedisplay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import fr.antelop.sdk.CancellationSignal;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationDomain;
import o.ea.f;
import o.eb.b;
import o.eb.e;

/* JADX INFO: loaded from: classes5.dex */
public final class CardSecureDisplay extends AbsSecureDisplay<b> {
    private String TAG;

    public CardSecureDisplay(String str) throws Throwable {
        super(str, 1, new e() { // from class: fr.antelop.sdk.ui.securedisplay.CardSecureDisplay.1
            @Override // o.eb.e
            public int getThemeResource(b bVar) {
                return 0;
            }
        });
        this.TAG = WalletValidationDomain.CARD_SECURE_DISPLAY;
        if (f.a()) {
            f.d(this.TAG, "CardSecureDisplay - Not supported : Feature SCA Disabled");
        }
    }

    private void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "launch - Not supported : Feature SCA Disabled");
        }
    }

    public final CancellationSignal getCancellationSignal() throws Throwable {
        if (!f.a()) {
            return null;
        }
        f.d(this.TAG, "getCancellationSignal - Not supported : Feature SCA Disabled");
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() throws Throwable {
        if (!f.a()) {
            return false;
        }
        f.d(this.TAG, "isOnline - Not supported : Feature SCA Disabled");
        return false;
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "launch - Not supported : Feature SCA Disabled");
        }
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "launch - Not supported : Feature SCA Disabled");
        }
    }

    public final CardSecureDisplay setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setActivityCallback - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    public final CardSecureDisplay setAnchorCardView(Activity activity, View view) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setAnchorCardView - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    public final CardSecureDisplay setAnchorCardView(Rect rect) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setAnchorCardView - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    @Deprecated
    public final CardSecureDisplay setAnchorCardView(View view) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setAnchorCardView - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    @Deprecated
    public final CardSecureDisplay setBackground(Drawable drawable) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setBackground - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    public final CardSecureDisplay setCardBackground(Drawable drawable) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setCardBackground - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    public final CardSecureDisplay setCardForegroundColor(Integer num) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setCardForegroundColor - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    @Deprecated
    public final CardSecureDisplay setForegroundColor(Integer num) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setForegroundColor - Not supported : Feature SCA Disabled");
        }
        return this;
    }

    public final void setOnlineAuthentication(boolean z2) throws Throwable {
        if (f.a()) {
            f.d(this.TAG, "setOnlineAuthentication - Not supported : Feature SCA Disabled");
        }
    }
}
