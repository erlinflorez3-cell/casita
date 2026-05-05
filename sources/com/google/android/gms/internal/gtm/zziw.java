package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zziw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjh zzc;

    zziw(zzjh zzjhVar, String str, String str2, String str3) {
        this.zzc = zzjhVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzho.zzd("Starting to load container " + this.zza + ".");
        zzjh zzjhVar = this.zzc;
        if (zzjhVar.zzn != 1) {
            zzgv.zzc("Unexpected state - container loading already initiated.", zzjhVar.zzd);
            return;
        }
        zzjhVar.zzn = 2;
        zzjh zzjhVar2 = this.zzc;
        zzjhVar2.zzf.zzc(this.zza, this.zzb, null, new zzjf(zzjhVar2, null));
    }
}
