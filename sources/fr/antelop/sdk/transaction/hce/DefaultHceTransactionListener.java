package fr.antelop.sdk.transaction.hce;

import android.content.Context;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.transaction.TransactionDecision;
import java.util.Date;
import java.util.List;
import java.util.Map;
import o.dg.d;

/* JADX INFO: loaded from: classes5.dex */
public class DefaultHceTransactionListener extends d {
    @Override // o.dg.d
    public void onCredentialsRequired(Context context, List<CustomerAuthenticationMethod> list, HceTransaction hceTransaction) {
    }

    @Override // o.dg.d
    public void onTransactionDone(Context context, HceTransaction hceTransaction) {
    }

    @Override // o.dg.d
    public void onTransactionError(Context context, AntelopError antelopError) {
    }

    @Override // o.dg.d
    public TransactionDecision onTransactionFinalization(Context context, CustomerAuthenticationMethod customerAuthenticationMethod, Date date, HceTransaction hceTransaction) {
        return null;
    }

    @Override // o.dg.d
    public void onTransactionProgress(Context context, HceTransactionStep hceTransactionStep) {
    }

    @Override // o.dg.d
    public void onTransactionStart(Context context) {
    }

    @Override // o.dg.d
    public void onTransactionsUpdated(Context context, Map<String, HceTransaction> map) {
    }
}
