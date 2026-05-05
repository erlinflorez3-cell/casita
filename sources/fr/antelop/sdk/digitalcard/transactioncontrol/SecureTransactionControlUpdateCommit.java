package fr.antelop.sdk.digitalcard.transactioncontrol;

import android.content.Context;
import android.os.SystemClock;
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
import o.y.n;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureTransactionControlUpdateCommit implements CustomerAuthenticatedProcess {
    private final n innerSecureDigitalCardUpdateTransactionControlProcess;

    public SecureTransactionControlUpdateCommit(n nVar) {
        this.innerSecureDigitalCardUpdateTransactionControlProcess = nVar;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        return m.b(this.innerSecureDigitalCardUpdateTransactionControlProcess.d());
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        return this.innerSecureDigitalCardUpdateTransactionControlProcess.g();
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        Object[] objArr = {this.innerSecureDigitalCardUpdateTransactionControlProcess};
        int i2 = i.f26925h * 601961010;
        i.f26925h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i3 = i.f26927j * 826423998;
        i.f26927j = i3;
        return !((Boolean) i.c(-571425008, i2, 571425009, iFreeMemory, i3, iNextInt, objArr)).booleanValue();
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        Object[] objArr = {this.innerSecureDigitalCardUpdateTransactionControlProcess, context, new d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardUpdateTransactionControlProcess)};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = n.f27264l * 1598386653;
        n.f27264l = i2;
        int i3 = n.f27263k * (-150805110);
        n.f27263k = i3;
        n.b((int) Runtime.getRuntime().maxMemory(), i3, i2, iElapsedRealtime, -1425880657, objArr, 1425880657);
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        Object[] objArr = {this.innerSecureDigitalCardUpdateTransactionControlProcess, context, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardUpdateTransactionControlProcess)};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = n.f27264l * 1598386653;
        n.f27264l = i2;
        int i3 = n.f27263k * (-150805110);
        n.f27263k = i3;
        n.b((int) Runtime.getRuntime().maxMemory(), i3, i2, iElapsedRealtime, -1425880657, objArr, 1425880657);
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.innerSecureDigitalCardUpdateTransactionControlProcess.e(context, customerAuthenticationCredentials);
    }
}
