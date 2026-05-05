package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlu implements zzjw {
    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 1);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        zzqz zzqzVarZzb = zzieVar.zzb(((zzrk) zzqzVarArr[0]).zzk());
        if (zzqzVarZzb instanceof zzri) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        }
        if (!(zzqzVarZzb instanceof zzrd) || zzqzVarZzb == zzrd.zze || zzqzVarZzb == zzrd.zzd) {
            return zzqzVarZzb;
        }
        throw new IllegalStateException("Illegal InternalType encountered in Get.");
    }
}
