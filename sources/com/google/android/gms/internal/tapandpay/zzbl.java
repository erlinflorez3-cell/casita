package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbl extends zzbj {
    private final WeakReference zza;
    private final int zzb;

    public zzbl(Activity activity, int i2) {
        this.zza = new WeakReference(activity);
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzd(Status status, Bundle bundle) {
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException e2) {
            }
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzb, new Intent(), 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(status.isSuccess() ? -1 : status.getStatusCode());
        } catch (PendingIntent.CanceledException e3) {
        }
    }
}
