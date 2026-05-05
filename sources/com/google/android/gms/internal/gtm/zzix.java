package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzix implements Runnable {
    final /* synthetic */ zziy zza;

    zzix(zziy zziyVar) {
        this.zza = zziyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjh zzjhVar = this.zza.zza;
        if (zzjhVar.zzn == 1 || zzjhVar.zzn == 2) {
            zzjhVar.zzn = 4;
            zzho.zza("Container load timed out after 5000ms.");
            while (!this.zza.zza.zzo.isEmpty()) {
                zzjh zzjhVar2 = this.zza.zza;
                zzjhVar2.zzg.execute((Runnable) zzjhVar2.zzo.remove());
            }
        }
    }
}
