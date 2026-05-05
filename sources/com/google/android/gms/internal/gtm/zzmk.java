package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmk extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        double dZzb = zzjx.zzb(zzqzVarArr[0]);
        double dZzb2 = zzjx.zzb(zzqzVarArr[1]);
        if (Double.isNaN(dZzb) || Double.isNaN(dZzb2)) {
            return new zzrb(Double.valueOf(Double.NaN));
        }
        if ((Double.isInfinite(dZzb) && dZzb2 == 0.0d) || (dZzb == 0.0d && Double.isInfinite(dZzb2))) {
            return new zzrb(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(dZzb) || Double.isInfinite(dZzb2)) {
            return new zzrb(Double.valueOf(true != (((((double) Double.compare(dZzb, 0.0d)) > 0.0d ? 1 : (((double) Double.compare(dZzb, 0.0d)) == 0.0d ? 0 : -1)) < 0) ^ (((double) Double.compare(dZzb2, 0.0d)) < 0.0d)) ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY));
        }
        return new zzrb(Double.valueOf(dZzb * dZzb2));
    }
}
