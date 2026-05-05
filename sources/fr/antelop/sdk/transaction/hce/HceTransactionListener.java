package fr.antelop.sdk.transaction.hce;

import android.content.Context;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.transaction.TransactionDecision;
import java.util.Date;
import java.util.List;
import o.dg.d;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class HceTransactionListener extends d {
    @Override // o.dg.d
    public abstract void onCredentialsRequired(Context context, List<CustomerAuthenticationMethod> list, HceTransaction hceTransaction);

    @Override // o.dg.d
    public abstract void onTransactionDone(Context context, HceTransaction hceTransaction);

    @Override // o.dg.d
    public abstract void onTransactionError(Context context, AntelopError antelopError);

    @Override // o.dg.d
    public TransactionDecision onTransactionFinalization(Context context, CustomerAuthenticationMethod customerAuthenticationMethod, Date date, HceTransaction hceTransaction) {
        return null;
    }

    @Override // o.dg.d
    public void onTransactionProgress(Context context, HceTransactionStep hceTransactionStep) {
    }

    @Override // o.dg.d
    public abstract void onTransactionStart(Context context);
}
