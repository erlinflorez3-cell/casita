package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class zzh {
    public static final zzh zza;
    private final boolean zzb;
    private final boolean zzc = false;
    private final zzaf zzd;

    static {
        zze zzeVar = null;
        zzf zzfVar = new zzf(zzeVar);
        zzfVar.zzb();
        zza = zzfVar.zzd();
        zzf zzfVar2 = new zzf(zzeVar);
        zzfVar2.zzb();
        zzfVar2.zza(new zzd());
        zzfVar2.zzd();
        zzf zzfVar3 = new zzf(zzeVar);
        zzfVar3.zzc();
        zzfVar3.zzd();
    }

    /* synthetic */ zzh(boolean z2, boolean z3, zzaf zzafVar, zzg zzgVar) {
        this.zzb = z2;
        this.zzd = zzafVar;
    }

    static /* bridge */ /* synthetic */ boolean zza(zzh zzhVar) {
        boolean z2 = zzhVar.zzc;
        return false;
    }

    static /* bridge */ /* synthetic */ int zzc(zzh zzhVar, Context context, zzj zzjVar) {
        zzaf zzafVar = zzhVar.zzd;
        int size = zzafVar.size();
        int i2 = 0;
        while (i2 < size) {
            int iZza = ((zzk) zzafVar.get(i2)).zza(context, zzjVar, zzhVar.zzb) - 1;
            i2++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
