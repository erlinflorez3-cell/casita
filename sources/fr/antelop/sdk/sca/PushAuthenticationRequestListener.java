package fr.antelop.sdk.sca;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public interface PushAuthenticationRequestListener {
    void onRequestCancelled(Context context, String str, CancellationReason cancellationReason);

    void onRequestReceived(Context context, PushAuthenticationRequest pushAuthenticationRequest);
}
