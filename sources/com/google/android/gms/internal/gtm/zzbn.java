package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzbn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbs zzb;

    zzbn(zzbs zzbsVar, int i2) {
        this.zzb = zzbsVar;
        this.zza = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzY(((long) this.zza) * 1000);
    }
}
