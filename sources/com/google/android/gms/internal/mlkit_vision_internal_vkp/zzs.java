package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class zzs {
    public static final zzs zza;
    private final boolean zzb;
    private final boolean zzc = false;
    private final zzkz zzd;

    static {
        zzp zzpVar = null;
        zzq zzqVar = new zzq(zzpVar);
        zzqVar.zzb();
        zza = zzqVar.zzd();
        zzq zzqVar2 = new zzq(zzpVar);
        zzqVar2.zzb();
        zzqVar2.zza(new zzo());
        zzqVar2.zzd();
        zzq zzqVar3 = new zzq(zzpVar);
        zzqVar3.zzc();
        zzqVar3.zzd();
    }

    /* synthetic */ zzs(boolean z2, boolean z3, zzkz zzkzVar, zzr zzrVar) {
        this.zzb = z2;
        this.zzd = zzkzVar;
    }

    static /* bridge */ /* synthetic */ boolean zza(zzs zzsVar) {
        boolean z2 = zzsVar.zzc;
        return false;
    }

    static /* bridge */ /* synthetic */ int zzc(zzs zzsVar, Context context, zzu zzuVar) {
        zzkz zzkzVar = zzsVar.zzd;
        int size = zzkzVar.size();
        int i2 = 0;
        while (i2 < size) {
            int iZza = ((zzv) zzkzVar.get(i2)).zza(context, zzuVar, zzsVar.zzb) - 1;
            i2++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
