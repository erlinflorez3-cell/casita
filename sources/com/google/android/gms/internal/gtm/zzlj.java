package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlj implements zzjw {
    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 3);
        zzqz zzqzVarZzc = zzjx.zzg(zzrl.zzc(zzieVar, zzqzVarArr[0])) ? zzrl.zzc(zzieVar, zzqzVarArr[1]) : zzrl.zzc(zzieVar, zzqzVarArr[2]);
        if (!(zzqzVarZzc instanceof zzrd) || zzqzVarZzc == zzrd.zze || zzqzVarZzc == zzrd.zzd) {
            return zzqzVarZzc;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
