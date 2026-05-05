package fr.antelop.sdk.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.hbisoft.hbrecorder.Constants;
import fr.antelop.sdk.WalletLockReason;
import fr.antelop.sdk.WalletManager;
import fr.antelop.sdk.WalletManagerCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.exception.WalletValidationException;
import o.ea.f;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractWalletAwareActivity extends AppCompatActivity implements WalletManagerCallback {
    private static final String TAG = "AbstractWalletAwareActivity";
    private WalletManager walletManager;

    public void activateAuthenticationMethod(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.walletManager.activateAuthenticationMethod(customerAuthenticationMethodType, customerAuthenticationCredentials);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    protected final void cancelOngoingTransaction() throws Throwable {
        this.walletManager.cancelOngoingTransaction();
    }

    public final void changeCredentials(CustomerAuthenticationCredentials customerAuthenticationCredentials, CustomerAuthenticationCredentials customerAuthenticationCredentials2) throws Throwable {
        this.walletManager.changeCredentials(customerAuthenticationCredentials, customerAuthenticationCredentials2);
    }

    public final void checkCredentials(CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.walletManager.checkCredentials(customerAuthenticationCredentials);
    }

    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected final void connect(CustomerAuthenticationCredentials customerAuthenticationCredentials, CustomerAuthenticationCredentials customerAuthenticationCredentials2) throws Throwable {
        this.walletManager.connect(customerAuthenticationCredentials, customerAuthenticationCredentials2);
    }

    public void deactivateAuthenticationMethod(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.walletManager.deactivateAuthenticationMethod(customerAuthenticationMethodType, customerAuthenticationCredentials);
    }

    protected final void delete() throws Throwable {
        this.walletManager.delete();
    }

    protected final void disconnect() throws Throwable {
        this.walletManager.disconnect();
    }

    protected final WalletManager getWalletManager() {
        return this.walletManager;
    }

    protected final void lock(WalletLockReason walletLockReason) throws Throwable {
        this.walletManager.lock(walletLockReason);
    }

    protected final void logout() throws Throwable {
        this.walletManager.logout();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        try {
            super.onCreate(bundle);
            this.walletManager = new WalletManager(this, this);
        } catch (WalletValidationException e2) {
            if (f.a()) {
                f.e(TAG, "onCreate", e2);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() throws Throwable {
        WalletManager walletManager = this.walletManager;
        if (walletManager != null) {
            walletManager.clean();
        }
        this.walletManager = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() throws Throwable {
        super.onPause();
        if (f.a()) {
            f.c(TAG, Constants.ON_PAUSE_KEY);
        }
        this.walletManager.disconnect();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() throws Throwable {
        super.onResume();
        if (f.a()) {
            f.c(TAG, Constants.ON_RESUME_KEY);
        }
        this.walletManager.connect();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() throws Throwable {
        if (f.a()) {
            f.c(TAG, Constants.ON_START_KEY);
        }
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() throws Throwable {
        super.onStop();
        if (f.a()) {
            f.c(TAG, "onStop");
        }
    }

    public final boolean setCustomerCredentialsForTransaction(CustomerAuthenticationCredentials customerAuthenticationCredentials) throws WalletValidationException {
        return this.walletManager.setCustomerCredentialsForTransaction(customerAuthenticationCredentials);
    }

    public final void synchronizeAuthenticationMethod(CustomerAuthenticationMethodType customerAuthenticationMethodType, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        this.walletManager.synchronizeAuthenticationMethod(customerAuthenticationMethodType, customerAuthenticationCredentials);
    }
}
