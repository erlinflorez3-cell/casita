package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes8.dex */
final class zzd implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzb zzc;

    zzd(zzb zzbVar, String str, long j2) {
        this.zza = str;
        this.zzb = j2;
        this.zzc = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb.zzb(this.zzc, this.zza, this.zzb);
    }
}
