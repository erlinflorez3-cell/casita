package fr.antelop.sdk.digitalcard;

import android.app.Activity;
import fr.antelop.sdk.card.Card;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import o.er.q;

/* JADX INFO: loaded from: classes5.dex */
public final class IssuerNfcWalletService {
    private final q innerIssuerNfcWalletService;

    public IssuerNfcWalletService(q qVar) {
        this.innerIssuerNfcWalletService = qVar;
    }

    public final Card getIssuerNfcCard() {
        return this.innerIssuerNfcWalletService.b();
    }

    public final SecureCardPushToIssuerNfcWallet getSecureCardPush() throws WalletValidationException {
        return this.innerIssuerNfcWalletService.d();
    }

    public final DigitalCardServiceStatus getStatus() {
        return this.innerIssuerNfcWalletService.c() ? DigitalCardServiceStatus.Active : DigitalCardServiceStatus.Disabled;
    }

    public final boolean isCardInIssuerNfcWallet() {
        return this.innerIssuerNfcWalletService.e();
    }

    public final void pushCard(Activity activity, OperationCallback<Void> operationCallback) throws Throwable {
        this.innerIssuerNfcWalletService.a(activity, false, operationCallback);
    }

    public final void pushCard(Activity activity, boolean z2, OperationCallback<Void> operationCallback) throws Throwable {
        this.innerIssuerNfcWalletService.a(activity, z2, operationCallback);
    }
}
