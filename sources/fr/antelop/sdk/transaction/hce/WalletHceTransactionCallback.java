package fr.antelop.sdk.transaction.hce;

import android.content.Context;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.transaction.TransactionDecision;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface WalletHceTransactionCallback {
    void onCustomerCredentialsRequired(Context context, List<CustomerAuthenticationMethod> list, HceTransaction hceTransaction);

    void onDecline(Context context, HceTransactionDeclineReason hceTransactionDeclineReason, AntelopError antelopError, HceTransaction hceTransaction);

    TransactionDecision onFinalization(Context context, CustomerAuthenticationMethod customerAuthenticationMethod, Date date, HceTransaction hceTransaction);

    void onPending(Context context, HceTransaction hceTransaction);

    void onProgress(Context context, HceTransactionStep hceTransactionStep);

    void onSuccess(Context context, HceTransactionStatus hceTransactionStatus, HceTransaction hceTransaction);

    void onUnknownResult(Context context, HceTransactionUnknownReason hceTransactionUnknownReason, HceTransaction hceTransaction);
}
