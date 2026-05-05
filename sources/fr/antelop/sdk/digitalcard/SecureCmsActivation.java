package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
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
import o.y.b;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureCmsActivation implements CustomerAuthenticatedProcess {
    private final b innerSecureCmsActivation;

    public SecureCmsActivation(b bVar) {
        this.innerSecureCmsActivation = bVar;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() {
        return m.b(this.innerSecureCmsActivation.d());
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        return this.innerSecureCmsActivation.g();
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        Object[] objArr = {this.innerSecureCmsActivation};
        int i2 = i.f26925h * 601961010;
        i.f26925h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i3 = i.f26927j * 826423998;
        i.f26927j = i3;
        return !((Boolean) i.c(-571425008, i2, 571425009, iFreeMemory, i3, iNextInt, objArr)).booleanValue();
    }

    public final boolean isPinCodeUpdated() throws WalletValidationException {
        Object[] objArr = {this.innerSecureCmsActivation};
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = b.f27029n * 411550838;
        b.f27029n = i3;
        return ((Boolean) b.c((int) SystemClock.elapsedRealtime(), objArr, -2067062937, i3, 2067062937, (int) SystemClock.uptimeMillis(), i2)).booleanValue();
    }

    public final void launch(Context context, SecurePinInput securePinInput, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws Throwable {
        this.innerSecureCmsActivation.d(context, securePinInput, new d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureCmsActivation));
    }

    public final void launch(Context context, SecurePinInput securePinInput, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws Throwable {
        this.innerSecureCmsActivation.c(context, securePinInput, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureCmsActivation));
    }

    public final void setActivityCallback(CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallback) {
        Object[] objArr = {this.innerSecureCmsActivation, customerAuthenticatedProcessActivityCallback};
        int iActiveCount = Thread.activeCount();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = b.f27028l * 274273059;
        b.f27028l = i2;
        b.c(i2, objArr, 323778715, elapsedCpuTime, -323778714, new Random().nextInt(846982669), iActiveCount);
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.innerSecureCmsActivation.e(context, customerAuthenticationCredentials);
    }
}
