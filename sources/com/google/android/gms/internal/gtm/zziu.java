package com.google.android.gms.internal.gtm;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
final class zziu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zziv zzf;
    private boolean zzg = false;

    zziu(zziv zzivVar, String str, Bundle bundle, String str2, long j2, String str3) {
        this.zzf = zzivVar;
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
            zzjhVar.zzf.zzb(this.zza, this.zzb, this.zzc, this.zzd, false);
            return;
        }
        if (zzjhVar.zzn == 1 || zzjhVar.zzn == 2) {
            if (this.zzg) {
                zzho.zze("Invalid state - not expecting to see a deferred event during container loading.");
                return;
            }
            zzho.zzd(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", this.zza, this.zze, this.zzb));
            this.zzg = true;
            this.zzf.zza.zzo.add(this);
            return;
        }
        if (zzjhVar.zzn == 4) {
            zzho.zzd(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", this.zza, this.zze, this.zzb));
            return;
        }
        zzgv.zzc("Unexpected state:" + zzjhVar.zzn, this.zzf.zza.zzd);
    }
}
