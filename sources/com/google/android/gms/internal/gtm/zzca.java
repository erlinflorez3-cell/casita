package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzca extends zzcy {
    final /* synthetic */ zzce zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzca(zzce zzceVar, zzbx zzbxVar) {
        super(zzbxVar);
        this.zza = zzceVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcy
    public final void zza() {
        com.google.android.gms.analytics.zzr.zzh();
        zzce zzceVar = this.zza;
        if (zzceVar.zzg()) {
            zzceVar.zzN("Inactivity, disconnecting from device AnalyticsService");
            zzceVar.zzc();
        }
    }
}
