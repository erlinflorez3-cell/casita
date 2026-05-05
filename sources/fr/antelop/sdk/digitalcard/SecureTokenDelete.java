package fr.antelop.sdk.digitalcard;

import android.content.Context;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import java.util.List;
import java.util.Random;
import o.ea.m;
import o.x.d;
import o.x.j;
import o.y.i;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureTokenDelete implements CustomerAuthenticatedProcess {
    private final i innerTokenDeleteProcess;

    public SecureTokenDelete(i iVar) {
        this.innerTokenDeleteProcess = iVar;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        return m.b(this.innerTokenDeleteProcess.d());
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        return this.innerTokenDeleteProcess.g();
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        Object[] objArr = {this.innerTokenDeleteProcess};
        int i2 = o.x.i.f26925h * 601961010;
        o.x.i.f26925h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i3 = o.x.i.f26927j * 826423998;
        o.x.i.f26927j = i3;
        return !((Boolean) o.x.i.c(-571425008, i2, 571425009, iFreeMemory, i3, iNextInt, objArr)).booleanValue();
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        this.innerTokenDeleteProcess.a(context, new d(context, customCustomerAuthenticatedProcessCallback, this, this.innerTokenDeleteProcess));
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        this.innerTokenDeleteProcess.a(context, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerTokenDeleteProcess));
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.innerTokenDeleteProcess.e(context, customerAuthenticationCredentials);
    }
}
