package fr.antelop.sdk.cardeventlistener;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public interface CardEventListener {
    void onCardActivated(Context context, String str, String str2);

    void onCardActivating(Context context, String str, String str2);

    void onCardActivationRequired(Context context, String str, String str2);

    void onCardDeleted(Context context, String str, String str2);

    void onCardDisplayUpdated(Context context, String str, String str2);

    void onCardLocked(Context context, String str, String str2);

    void onCardPaymentInformationUpdated(Context context, String str, String str2);

    void onCardPaymentKeysRefreshed(Context context, String str, String str2);

    void onCardRedigitized(Context context, String str, String str2);

    void onCardTermsAndConditionsApprovalRequired(Context context, String str, String str2);
}
