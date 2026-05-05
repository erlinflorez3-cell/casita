package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoo extends zzjy {
    private static final zzrb zza = new zzrb(Double.valueOf(0.0d));
    private static final zzrb zzb = new zzrb(Double.valueOf(2.147483647E9d));

    private static final boolean zzb(zzqz zzqzVar) {
        return (zzqzVar instanceof zzrb) && !Double.isNaN(((zzrb) zzqzVar).zzi().doubleValue());
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        zzqz zzqzVar = length > 0 ? zzqzVarArr[0] : zza;
        zzqz zzqzVar2 = length > 1 ? zzqzVarArr[1] : zzb;
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = 2.147483647E9d;
        if (zzb(zzqzVar) && zzb(zzqzVar2) && zzjx.zzf(zzqzVar, zzqzVar2)) {
            dDoubleValue = ((zzrb) zzqzVar).zzi().doubleValue();
            dDoubleValue2 = ((zzrb) zzqzVar2).zzi().doubleValue();
        }
        return new zzrb(Double.valueOf(Math.round((Math.random() * (dDoubleValue2 - dDoubleValue)) + dDoubleValue)));
    }
}
