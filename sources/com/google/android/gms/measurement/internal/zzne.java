package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes8.dex */
final class zzne implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zznb zzb;

    zzne(zznb zznbVar, long j2) {
        this.zza = j2;
        this.zzb = zznbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zznb.zzb(this.zzb, this.zza);
    }
}
