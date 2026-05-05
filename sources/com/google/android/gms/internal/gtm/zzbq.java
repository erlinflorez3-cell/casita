package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzbq implements Runnable {
    final /* synthetic */ zzdb zza;
    final /* synthetic */ zzbs zzb;

    zzbq(zzbs zzbsVar, zzdb zzdbVar) {
        this.zzb = zzbsVar;
        this.zza = zzdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zzb.zza.zzf(this.zza);
    }
}
