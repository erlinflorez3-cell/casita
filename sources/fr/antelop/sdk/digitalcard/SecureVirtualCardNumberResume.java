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
import o.x.i;
import o.x.j;
import o.y.p;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureVirtualCardNumberResume implements CustomerAuthenticatedProcess {
    private final p innerSecureDigitalCardVcnManageResumeProcess;

    public SecureVirtualCardNumberResume(p pVar) {
        this.innerSecureDigitalCardVcnManageResumeProcess = pVar;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        return m.b(this.innerSecureDigitalCardVcnManageResumeProcess.d());
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        return this.innerSecureDigitalCardVcnManageResumeProcess.g();
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        Object[] objArr = {this.innerSecureDigitalCardVcnManageResumeProcess};
        int i2 = i.f26925h * 601961010;
        i.f26925h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i3 = i.f26927j * 826423998;
        i.f26927j = i3;
        return !((Boolean) i.c(-571425008, i2, 571425009, iFreeMemory, i3, iNextInt, objArr)).booleanValue();
    }

    public final void resume(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        this.innerSecureDigitalCardVcnManageResumeProcess.a(context, new d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardVcnManageResumeProcess));
    }

    public final void resume(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        this.innerSecureDigitalCardVcnManageResumeProcess.a(context, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardVcnManageResumeProcess));
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.innerSecureDigitalCardVcnManageResumeProcess.e(context, customerAuthenticationCredentials);
    }
}
