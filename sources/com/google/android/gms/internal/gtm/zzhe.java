package com.google.android.gms.internal.gtm;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzhe implements Runnable {
    final /* synthetic */ zzhd zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ Map zzf;
    final /* synthetic */ String zzg;
    final /* synthetic */ zzhf zzh;

    zzhe(zzhf zzhfVar, zzhd zzhdVar, long j2, String str, String str2, String str3, Map map, String str4) {
        this.zzh = zzhfVar;
        this.zza = zzhdVar;
        this.zzb = j2;
        this.zzc = str;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = map;
        this.zzg = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzh.zze == null) {
            zzhf zzhfVar = this.zzh;
            zzhd zzhdVar = this.zza;
            zzin zzinVarZzf = zzin.zzf();
            zzinVarZzf.zzj(zzhfVar.zzf, zzhdVar);
            this.zzh.zze = zzinVarZzf.zze();
        }
        zzhf zzhfVar2 = this.zzh;
        zzhfVar2.zze.zzb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }
}
