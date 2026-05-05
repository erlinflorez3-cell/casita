package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzjd implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjf zzc;

    zzjd(zzjf zzjfVar, boolean z2, String str) {
        this.zzc = zzjfVar;
        this.zza = z2;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjh zzjhVar = this.zzc.zza;
        if (zzjhVar.zzn != 2) {
            zzho.zze("Container load callback completed after timeout");
            return;
        }
        if (this.zza) {
            zzjhVar.zzn = 3;
            zzho.zzd("Container " + this.zzb + " loaded.");
        } else {
            zzjhVar.zzn = 4;
            zzho.zza("Error loading container:".concat(String.valueOf(this.zzb)));
        }
        while (!this.zzc.zza.zzo.isEmpty()) {
            zzjh zzjhVar2 = this.zzc.zza;
            zzjhVar2.zzg.execute((Runnable) zzjhVar2.zzo.remove());
        }
    }
}
