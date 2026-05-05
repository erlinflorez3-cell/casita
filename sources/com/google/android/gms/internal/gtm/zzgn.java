package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
final class zzgn implements Runnable, zzpl {
    final /* synthetic */ zzgs zza;

    /* synthetic */ zzgn(zzgs zzgsVar, zzgm zzgmVar) {
        this.zza = zzgsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Preconditions.checkState(this.zza.zzm == 1);
        ArrayList arrayList = new ArrayList();
        this.zza.zzp = false;
        if (zzhv.zza().zze(this.zza.zzb)) {
            arrayList.add(0);
        } else {
            zzgs zzgsVar = this.zza;
            zzgsVar.zzp = zzgsVar.zzk.zzf();
            if (this.zza.zzp) {
                arrayList.add(1);
                arrayList.add(0);
            } else {
                arrayList.add(0);
                arrayList.add(1);
            }
            arrayList.add(2);
        }
        zzgs zzgsVar2 = this.zza;
        zzgsVar2.zzf.zzc(zzgsVar2.zzb, zzgsVar2.zzd, zzgsVar2.zzc, arrayList, this, zzgsVar2.zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzpl
    public final void zza(zzpv zzpvVar) {
        if (zzpvVar.getStatus() == Status.RESULT_SUCCESS) {
            zzgs zzgsVar = this.zza;
            zzgsVar.zzg.execute(new zzgr(zzgsVar, zzpvVar));
        } else {
            zzgs zzgsVar2 = this.zza;
            zzgsVar2.zzg.execute(new zzgl(zzgsVar2, null));
        }
    }
}
