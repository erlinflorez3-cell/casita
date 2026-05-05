package fr.antelop.sdk.digitalcard;

import android.content.Context;
import fr.antelop.sdk.util.OperationCallback;
import java.util.List;
import o.er.v;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenManagementService {
    private final v innerTokenManagementService;

    public TokenManagementService(v vVar) {
        this.innerTokenManagementService = vVar;
    }

    public final DigitalCardServiceStatus getStatus() {
        return this.innerTokenManagementService.c() ? DigitalCardServiceStatus.Active : DigitalCardServiceStatus.Disabled;
    }

    public final void getTokens(Context context, OperationCallback<List<Token>> operationCallback) throws Throwable {
        this.innerTokenManagementService.e(context, operationCallback);
    }
}
