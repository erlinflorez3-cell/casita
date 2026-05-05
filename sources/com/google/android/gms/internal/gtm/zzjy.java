package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzjy implements zzjw {
    protected abstract zzqz zza(zzie zzieVar, zzqz... zzqzVarArr);

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr != null);
        zzqz[] zzqzVarArr2 = new zzqz[zzqzVarArr.length];
        for (int i2 = 0; i2 < zzqzVarArr.length; i2++) {
            Preconditions.checkArgument(zzqzVarArr[i2] != null);
            Preconditions.checkArgument(zzqzVarArr[i2] != zzrd.zzb);
            Preconditions.checkArgument(zzqzVarArr[i2] != zzrd.zzc);
            zzqzVarArr2[i2] = zzrl.zzc(zzieVar, zzqzVarArr[i2]);
            Preconditions.checkArgument(true);
            Preconditions.checkArgument(zzqzVarArr2[i2] != zzrd.zzb);
            Preconditions.checkArgument(zzqzVarArr2[i2] != zzrd.zzc);
        }
        zzqz zzqzVarZza = zza(zzieVar, zzqzVarArr2);
        Preconditions.checkState(zzqzVarZza != null);
        return zzqzVarZza;
    }
}
