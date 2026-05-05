package com.google.android.gms.internal.gtm;

import androidx.work.PeriodicWorkRequest;

/* JADX INFO: loaded from: classes8.dex */
final class zzgr implements Runnable {
    final /* synthetic */ zzgs zza;
    private final zzpv zzb;

    zzgr(zzgs zzgsVar, zzpv zzpvVar) {
        this.zza = zzgsVar;
        this.zzb = zzpvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqj zzqjVarZzc = this.zzb.zzb().zzc();
        zzgs zzgsVar = this.zza;
        zzqs zzqsVarZzc = this.zzb.zzc();
        zzic zzicVar = zzgsVar.zzl;
        this.zza.zzl = zzgsVar.zze.zza(zzqjVarZzc, zzqsVarZzc);
        this.zza.zzm = 2;
        zzho.zzd("Container " + this.zza.zzb + " loaded during runtime initialization.");
        zzgs zzgsVar2 = this.zza;
        if (zzgsVar2.zzn != null) {
            for (zzgz zzgzVar : zzgsVar2.zzn) {
                zzho.zzd("Evaluating tags for pending event ".concat(String.valueOf(zzgzVar.zzb())));
                this.zza.zzl.zzf(zzgzVar);
            }
            this.zza.zzn = null;
        }
        this.zza.zzl.zze();
        zzho.zzd("Runtime initialized successfully for container ".concat(String.valueOf(this.zza.zzb)));
        long jZza = this.zzb.zzb().zza() + this.zza.zzk.zzb();
        if (zzicVar == null) {
            zzgs zzgsVar3 = this.zza;
            if (zzgsVar3.zzp && this.zzb.zza() == 1 && jZza < zzgsVar3.zzj.currentTimeMillis()) {
                zzgs zzgsVar4 = this.zza;
                zzgs.zzr(zzgsVar4, zzgsVar4.zzk.zza());
                return;
            }
        }
        zzgs zzgsVar5 = this.zza;
        zzgs.zzr(zzgsVar5, Math.max(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, jZza - zzgsVar5.zzj.currentTimeMillis()));
    }
}
