package fr.antelop.sdk.sca;

import android.content.Context;
import fr.antelop.sdk.AntelopCallback;
import fr.antelop.sdk.util.OperationCallback;
import o.ea.f;

/* JADX INFO: loaded from: classes5.dex */
public final class PushAuthenticationRequestFetcher {
    private final String TAG = "PushAuthenticationRequestFetcher";

    @Deprecated
    public final void fetchPendingRequests(Context context, AntelopCallback antelopCallback) throws Throwable {
        if (f.a()) {
            f.d("PushAuthenticationRequestFetcher", "fetchPendingRequests - Not supported : Feature SCA Disabled");
        }
    }

    public final void fetchPendingRequests(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        if (f.a()) {
            f.d("PushAuthenticationRequestFetcher", "fetchPendingRequests - Not supported : Feature SCA Disabled");
        }
    }
}
