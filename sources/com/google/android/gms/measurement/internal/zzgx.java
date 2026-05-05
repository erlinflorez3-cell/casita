package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes8.dex */
final class zzgx implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzgy zzb;

    zzgx(zzgy zzgyVar, boolean z2) {
        this.zza = z2;
        this.zzb = zzgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zza(this.zza);
    }
}
