package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import io.sentry.protocol.App;

/* JADX INFO: loaded from: classes8.dex */
final class zzgl implements Runnable {
    final /* synthetic */ zzgs zza;

    /* synthetic */ zzgl(zzgs zzgsVar, zzgk zzgkVar) {
        this.zza = zzgsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzm = 3;
        zzho.zze("Container " + this.zza.zzb + " loading failed.");
        zzgs zzgsVar = this.zza;
        if (zzgsVar.zzn != null) {
            for (zzgz zzgzVar : zzgsVar.zzn) {
                if (zzgzVar.zzf()) {
                    try {
                        this.zza.zzi.zzc(App.TYPE, zzgzVar.zzb(), zzgzVar.zza(), zzgzVar.currentTimeMillis());
                        zzho.zzd("Logged event " + zzgzVar.zzb() + " to Firebase (marked as passthrough).");
                    } catch (RemoteException e2) {
                        zzgv.zzb("Error logging event with measurement proxy:", e2, this.zza.zza);
                    }
                } else {
                    zzho.zzd("Discarded event " + zzgzVar.zzb() + " (marked as non-passthrough).");
                }
            }
            this.zza.zzn = null;
        }
    }
}
