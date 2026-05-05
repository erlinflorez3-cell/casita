package fr.antelop.sdk.digitalcard;

import fr.antelop.sdk.exception.WalletValidationException;
import o.er.s;

/* JADX INFO: loaded from: classes5.dex */
public final class PinDisplayService {
    private final s innerPinDisplayService;

    public PinDisplayService(s sVar) {
        this.innerPinDisplayService = sVar;
    }

    public final SecurePinDisplay getSecurePinDisplay() throws WalletValidationException {
        return new SecurePinDisplay(this.innerPinDisplayService.e());
    }

    public final DigitalCardServiceStatus getStatus() {
        return this.innerPinDisplayService.c() ? DigitalCardServiceStatus.Active : DigitalCardServiceStatus.Disabled;
    }
}
