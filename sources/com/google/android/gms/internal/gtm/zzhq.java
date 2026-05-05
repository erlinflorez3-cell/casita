package com.google.android.gms.internal.gtm;

import com.statsig.androidsdk.NetworkFallbackResolverKt;

/* JADX INFO: loaded from: classes8.dex */
final class zzhq implements zzip {
    final /* synthetic */ zzhs zza;

    zzhq(zzhs zzhsVar) {
        this.zza = zzhsVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzip
    public final void zza(zzhb zzhbVar) {
        this.zza.zzo(zzhbVar.zzb());
        zzho.zzd("Permanent failure dispatching hitId: " + zzhbVar.zzb());
    }

    @Override // com.google.android.gms.internal.gtm.zzip
    public final void zzb(zzhb zzhbVar) {
        long jZza = zzhbVar.zza();
        if (jZza == 0) {
            zzhs.zzl(this.zza, zzhbVar.zzb(), this.zza.zzj.currentTimeMillis());
            return;
        }
        if (jZza + NetworkFallbackResolverKt.COOLDOWN_TIME_MS < this.zza.zzj.currentTimeMillis()) {
            this.zza.zzo(zzhbVar.zzb());
            zzho.zzd("Giving up on failed hitId: " + zzhbVar.zzb());
        }
    }
}
