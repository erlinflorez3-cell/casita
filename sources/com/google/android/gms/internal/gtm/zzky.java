package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzky extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        boolean z2 = false;
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        zzqz zzrkVar = zzqzVarArr[0];
        boolean z3 = zzrkVar instanceof zzrh;
        zzqz zzrkVar2 = zzqzVarArr[1];
        if (z3 || (zzrkVar instanceof zzrg) || (zzrkVar instanceof zzrc)) {
            zzrkVar = new zzrk(zzjx.zzd(zzrkVar));
        }
        if ((zzrkVar2 instanceof zzrh) || (zzrkVar2 instanceof zzrg) || (zzrkVar2 instanceof zzrc)) {
            zzrkVar2 = new zzrk(zzjx.zzd(zzrkVar2));
        }
        if (((zzrkVar instanceof zzrk) && (zzrkVar2 instanceof zzrk)) || (!Double.isNaN(zzjx.zzb(zzrkVar)) && !Double.isNaN(zzjx.zzb(zzrkVar2)))) {
            z2 = !zzjx.zzf(zzrkVar, zzrkVar2);
        }
        return new zzra(Boolean.valueOf(z2));
    }
}
