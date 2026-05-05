package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
final class zzji implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhj zzd;
    final /* synthetic */ zzjl zze;

    zzji(zzjl zzjlVar, String str, String str2, String str3, zzhj zzhjVar) {
        this.zze = zzjlVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            z2 = true;
            if (!this.zze.zza.containsKey(this.zza)) {
                this.zze.zza.put(this.zza, this.zze.zzc.zza(this.zza, this.zzb, this.zzc));
            }
        } catch (Exception e2) {
            zzgv.zzb("Fail to load container: ", e2, this.zze.zze);
            z2 = false;
        }
        try {
            zzhj zzhjVar = this.zzd;
            if (zzhjVar != null) {
                zzhjVar.zze(z2, this.zza);
            }
        } catch (RemoteException e3) {
            zzgv.zzb("Error relaying callback: ", e3, this.zze.zze);
        }
    }
}
