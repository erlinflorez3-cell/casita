package fr.antelop.sdk;

import android.content.Context;
import fr.antelop.sdk.card.EmvApplicationActivationMethod;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface WalletNotificationServiceCallback {
    void onCardsUpdated(Context context);

    void onCountersUpdated(Context context);

    void onCustomerCredentialsReset(Context context);

    void onEmvApplicationActivationRequired(Context context, String str, List<EmvApplicationActivationMethod> list);

    void onEmvApplicationCredentialsUpdated(Context context);

    void onLogout(Context context);

    void onLostEligibility(Context context);

    void onSettingsUpdated(Context context);

    void onSunsetScheduled(Context context, Date date);

    void onWalletDeleted(Context context);

    void onWalletLoaded(Context context);

    void onWalletLocked(Context context, WalletLockReason walletLockReason);

    void onWalletUnlocked(Context context);
}
