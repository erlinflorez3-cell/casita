package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
final class zzis implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzit zzf;
    private boolean zzg = false;

    zzis(zzit zzitVar, String str, Bundle bundle, String str2, long j2, String str3) {
        this.zzf = zzitVar;
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
        this.zzd = j2;
        this.zze = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjh zzjhVar = this.zzf.zza;
        if (zzjhVar.zzn == 3) {
            zzjhVar.zzf.zzb(this.zza, this.zzb, this.zzc, this.zzd, true);
            return;
        }
        if (zzjhVar.zzn == 4) {
            zzho.zzd(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", this.zza, this.zzc, this.zzb));
            try {
                this.zzf.zza.zze.zzc(this.zzc, this.zza, this.zzb, this.zzd);
                return;
            } catch (RemoteException e2) {
                zzgv.zzb("Error logging event on measurement proxy: ", e2, this.zzf.zza.zzd);
                return;
            }
        }
        if (zzjhVar.zzn != 1 && zzjhVar.zzn != 2) {
            zzgv.zzc("Unexpected state:" + zzjhVar.zzn, this.zzf.zza.zzd);
            return;
        }
        if (this.zzg) {
            zzgv.zzc("Invalid state - not expecting to see a deferredevent during container loading.", zzjhVar.zzd);
            return;
        }
        zzho.zzd(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", this.zza, this.zze, this.zzb));
        this.zzg = true;
        this.zzf.zza.zzo.add(this);
    }
}
