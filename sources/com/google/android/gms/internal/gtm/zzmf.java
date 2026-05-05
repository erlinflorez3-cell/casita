package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmf implements zzjw {
    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length > 0);
        for (zzqz zzqzVar : zzqzVarArr) {
            Preconditions.checkNotNull(zzqzVar);
            Preconditions.checkArgument(zzqzVar instanceof zzrk);
            zzieVar.zzc(((zzrk) zzqzVar).zzk(), zzrd.zze);
        }
        return zzrd.zze;
    }
}
