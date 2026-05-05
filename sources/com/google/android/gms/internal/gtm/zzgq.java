package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
final class zzgq implements Runnable, zzpl {
    final /* synthetic */ zzgs zza;

    @Override // java.lang.Runnable
    public final void run() {
        Preconditions.checkState(this.zza.zzm == 2);
        if (zzhv.zza().zze(this.zza.zzb)) {
            return;
        }
        zzho.zzd("Refreshing container " + this.zza.zzb + "...");
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        zzgs zzgsVar = this.zza;
        zzgsVar.zzf.zzc(zzgsVar.zzb, zzgsVar.zzd, zzgsVar.zzc, arrayList, this, zzgsVar.zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzpl
    public final void zza(zzpv zzpvVar) {
        if (zzpvVar.getStatus() != Status.RESULT_SUCCESS) {
            zzgs zzgsVar = this.zza;
            zzgs.zzr(zzgsVar, zzgsVar.zzk.zzc());
            return;
        }
        zzho.zzd("Refreshed container " + this.zza.zzb + ". Reinitializing runtime...");
        zzgs zzgsVar2 = this.zza;
        zzgsVar2.zzg.execute(new zzgr(zzgsVar2, zzpvVar));
    }
}
