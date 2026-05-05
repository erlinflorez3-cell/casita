package fr.antelop.sdk.digitalcard;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.Address;
import fr.antelop.sdk.util.AndroidActivityResultCallback;
import java.util.List;
import java.util.Random;
import o.ea.m;
import o.x.d;
import o.x.i;
import o.x.j;
import o.y.g;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureCardPushToGooglePay implements CustomerAuthenticatedProcess {
    private final g innerSecureDigitalCardPushToGooglePayProcess;

    public SecureCardPushToGooglePay(g gVar) {
        this.innerSecureDigitalCardPushToGooglePayProcess = gVar;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        return m.b(this.innerSecureDigitalCardPushToGooglePayProcess.d());
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        return this.innerSecureDigitalCardPushToGooglePayProcess.g();
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        Object[] objArr = {this.innerSecureDigitalCardPushToGooglePayProcess};
        int i2 = i.f26925h * 601961010;
        i.f26925h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i3 = i.f26927j * 826423998;
        i.f26927j = i3;
        return !((Boolean) i.c(-571425008, i2, 571425009, iFreeMemory, i3, iNextInt, objArr)).booleanValue();
    }

    public final AndroidActivityResultCallback launch(Activity activity, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        return this.innerSecureDigitalCardPushToGooglePayProcess.c(activity, new d(activity, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardPushToGooglePayProcess)).b();
    }

    public final AndroidActivityResultCallback launch(Activity activity, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        return this.innerSecureDigitalCardPushToGooglePayProcess.c(activity, new j(activity, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardPushToGooglePayProcess)).b();
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.innerSecureDigitalCardPushToGooglePayProcess.e(context, customerAuthenticationCredentials);
    }

    public final void setUserAddress(Address address) throws Throwable {
        Object[] objArr = {this.innerSecureDigitalCardPushToGooglePayProcess, address};
        int iMyPid = Process.myPid();
        int iMyPid2 = Process.myPid();
        int id = (int) Thread.currentThread().getId();
        int i2 = o.y.d.f27092p * 1897016743;
        o.y.d.f27092p = i2;
        o.y.d.c(-1198808467, objArr, iMyPid2, id, i2, 1198808468, iMyPid);
    }
}
