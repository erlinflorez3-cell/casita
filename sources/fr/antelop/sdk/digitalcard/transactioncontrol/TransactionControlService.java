package fr.antelop.sdk.digitalcard.transactioncontrol;

import android.content.Context;
import fr.antelop.sdk.digitalcard.DigitalCardServiceStatus;
import fr.antelop.sdk.util.OperationCallback;
import o.er.y;

/* JADX INFO: loaded from: classes5.dex */
public final class TransactionControlService {
    private final y innerTransactionControlService;

    public TransactionControlService(y yVar) {
        this.innerTransactionControlService = yVar;
    }

    public final DigitalCardServiceStatus getStatus() {
        return this.innerTransactionControlService.c() ? DigitalCardServiceStatus.Active : DigitalCardServiceStatus.Disabled;
    }

    public final void getTransactionControls(Context context, OperationCallback<TransactionControls> operationCallback) throws Throwable {
        this.innerTransactionControlService.a(context, operationCallback);
    }
}
