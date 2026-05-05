package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes8.dex */
final class zzla implements Runnable {
    private final /* synthetic */ zzje zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzje zzd;
    private final /* synthetic */ zzjq zze;

    zzla(zzjq zzjqVar, zzje zzjeVar, long j2, boolean z2, zzje zzjeVar2) {
        this.zza = zzjeVar;
        this.zzb = j2;
        this.zzc = z2;
        this.zzd = zzjeVar2;
        this.zze = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza);
        zzjq.zza(this.zze, this.zza, this.zzb, false, this.zzc);
        zzjq.zza(this.zze, this.zza, this.zzd);
    }
}
