package fr.antelop.sdk.digitalcard;

import android.content.Context;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.util.List;
import o.by.c;
import o.er.t;
import o.j.b;
import o.m.h;
import o.x.f;

/* JADX INFO: loaded from: classes5.dex */
public final class PinUpdateService {
    private final t innerPinUpdateService;

    public PinUpdateService(t tVar) {
        this.innerPinUpdateService = tVar;
    }

    public final int getRemainingAttemptNumber() throws WalletValidationException {
        return this.innerPinUpdateService.d().l();
    }

    public final SecurePinUpdate getSecurePinUpdate() throws WalletValidationException {
        return new SecurePinUpdate(this.innerPinUpdateService.d());
    }

    public final DigitalCardServiceStatus getStatus() {
        return this.innerPinUpdateService.c() ? DigitalCardServiceStatus.Active : DigitalCardServiceStatus.Disabled;
    }

    public final void updatePin(Context context, SecurePinInput securePinInput, final OperationCallback<Void> operationCallback) throws Throwable {
        this.innerPinUpdateService.d().c(context, securePinInput, new f() { // from class: fr.antelop.sdk.digitalcard.PinUpdateService.1
            public void abortPrompt() {
            }

            @Override // o.x.f
            public void onAuthenticationDeclined() {
            }

            @Override // o.x.f
            public void onCustomerCredentialsInvalid(b bVar) {
            }

            @Override // o.x.f
            public void onCustomerCredentialsRequired(List<h> list) {
                operationCallback.onError(new c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
            }

            @Override // o.x.f
            public void onError(c cVar) {
                operationCallback.onError(cVar.a());
            }

            @Override // o.x.f
            public void onProcessStart() {
            }

            @Override // o.x.f
            public void onProcessSuccess() {
                operationCallback.onSuccess(null);
            }
        });
    }
}
