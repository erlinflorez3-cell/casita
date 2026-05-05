package fr.antelop.sdk.digitalcard;

import android.content.Context;
import fr.antelop.sdk.util.OperationCallback;
import java.util.List;
import o.er.u;

/* JADX INFO: loaded from: classes5.dex */
public final class VirtualCardNumberService {
    private final u innerPinDisplayService;

    public VirtualCardNumberService(u uVar) {
        this.innerPinDisplayService = uVar;
    }

    public final DigitalCardServiceStatus getStatus() {
        return this.innerPinDisplayService.c() ? DigitalCardServiceStatus.Active : DigitalCardServiceStatus.Disabled;
    }

    public final VirtualCardNumberGenerator getVirtualCardNumberGenerator() {
        return new VirtualCardNumberGenerator(this.innerPinDisplayService.b());
    }

    public final void getVirtualCardNumbers(Context context, OperationCallback<List<VirtualCardNumber>> operationCallback) throws Throwable {
        this.innerPinDisplayService.c(context, operationCallback);
    }
}
