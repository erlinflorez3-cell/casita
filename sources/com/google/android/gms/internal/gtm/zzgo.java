package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import io.sentry.protocol.App;

/* JADX INFO: loaded from: classes8.dex */
final class zzgo implements Runnable {
    final /* synthetic */ zzgs zza;
    private final zzgz zzb;

    public zzgo(zzgs zzgsVar, zzgz zzgzVar) {
        this.zza = zzgsVar;
        this.zzb = zzgzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzm == 2) {
            zzho.zzd("Evaluating tags for event ".concat(String.valueOf(this.zzb.zzb())));
            this.zza.zzl.zzf(this.zzb);
            return;
        }
        if (this.zza.zzm == 1) {
            this.zza.zzn.add(this.zzb);
            zzho.zzd("Added event " + this.zzb.zzb() + " to pending queue.");
            return;
        }
        if (this.zza.zzm == 3) {
            zzho.zzd("Failed to evaluate tags for event " + this.zzb.zzb() + " (container failed to load)");
            zzgz zzgzVar = this.zzb;
            if (!zzgzVar.zzf()) {
                zzho.zzd("Discarded non-passthrough event ".concat(String.valueOf(zzgzVar.zzb())));
                return;
            }
            try {
                this.zza.zzi.zzc(App.TYPE, zzgzVar.zzb(), zzgzVar.zza(), zzgzVar.currentTimeMillis());
                zzho.zzd("Logged passthrough event " + this.zzb.zzb() + " to Firebase.");
            } catch (RemoteException e2) {
                zzgv.zzb("Error logging event with measurement proxy:", e2, this.zza.zza);
            }
        }
    }
}
