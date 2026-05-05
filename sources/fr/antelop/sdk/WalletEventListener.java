package fr.antelop.sdk;

import android.content.Context;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public interface WalletEventListener {
    void onAppSunsetScheduled(Context context, Date date);

    void onCustomerCredentialsReset(Context context);

    void onDeviceEligibilityLost(Context context);

    void onWalletCountersUpdated(Context context);

    void onWalletDeleted(Context context);

    void onWalletLoaded(Context context);

    void onWalletLocked(Context context, WalletLockReason walletLockReason);

    void onWalletLogout(Context context);

    void onWalletProductsUpdated(Context context);

    void onWalletSettingUpdated(Context context);

    void onWalletUnlocked(Context context);
}
