package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import fr.antelop.sdk.CancellationSignal;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import java.util.List;
import java.util.Random;
import o.ea.m;
import o.eb.i;
import o.x.d;
import o.y.j;

/* JADX INFO: loaded from: classes5.dex */
public final class SecurePinDisplay implements CustomerAuthenticatedProcess {
    private CustomerAuthenticatedProcessActivityCallback activityCallback;
    private Drawable cardDrawable = null;
    private final j<i> innerSecureDigitalCardDisplay;

    public SecurePinDisplay(j<i> jVar) {
        this.innerSecureDigitalCardDisplay = jVar;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        return m.b(this.innerSecureDigitalCardDisplay.d());
    }

    public final CancellationSignal getCancellationSignal() {
        return this.innerSecureDigitalCardDisplay.l();
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        return this.innerSecureDigitalCardDisplay.g();
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        Object[] objArr = {this.innerSecureDigitalCardDisplay};
        int i2 = o.x.i.f26925h * 601961010;
        o.x.i.f26925h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i3 = o.x.i.f26927j * 826423998;
        o.x.i.f26927j = i3;
        return !((Boolean) o.x.i.c(-571425008, i2, 571425009, iFreeMemory, i3, iNextInt, objArr)).booleanValue();
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        j<i> jVar = this.innerSecureDigitalCardDisplay;
        d dVar = new d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardDisplay);
        this.innerSecureDigitalCardDisplay.m();
        jVar.c(context, dVar, new i());
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        j<i> jVar = this.innerSecureDigitalCardDisplay;
        o.x.j jVar2 = new o.x.j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardDisplay);
        this.innerSecureDigitalCardDisplay.m();
        jVar.c(context, jVar2, new i());
    }

    public final SecurePinDisplay setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        this.activityCallback = customerAuthenticatedProcessActivityCallback;
        return this;
    }

    public final SecurePinDisplay setCardBackground(Drawable drawable) {
        this.cardDrawable = drawable;
        return this;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.innerSecureDigitalCardDisplay.e(context, customerAuthenticationCredentials);
    }
}
