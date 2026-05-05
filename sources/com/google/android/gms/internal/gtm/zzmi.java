package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmi extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        double dZzb = zzjx.zzb(zzqzVarArr[0]);
        double dZzb2 = zzjx.zzb(zzqzVarArr[1]);
        if (Double.isNaN(dZzb) || Double.isNaN(dZzb2)) {
            return new zzrb(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(dZzb) && Double.isInfinite(dZzb2)) {
            return new zzrb(Double.valueOf(Double.NaN));
        }
        boolean z2 = (((double) Double.compare(dZzb, 0.0d)) < 0.0d) ^ (((double) Double.compare(dZzb2, 0.0d)) < 0.0d);
        if (Double.isInfinite(dZzb) && !Double.isInfinite(dZzb2)) {
            return new zzrb(Double.valueOf(true == z2 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY));
        }
        if (!Double.isInfinite(dZzb) && Double.isInfinite(dZzb2)) {
            return new zzrb(Double.valueOf(0.0d));
        }
        if (dZzb == 0.0d) {
            return dZzb2 == 0.0d ? new zzrb(Double.valueOf(Double.NaN)) : new zzrb(Double.valueOf(0.0d));
        }
        if (Double.isInfinite(dZzb) || dZzb == 0.0d || dZzb2 != 0.0d) {
            return new zzrb(Double.valueOf(dZzb / dZzb2));
        }
        return new zzrb(Double.valueOf(true == z2 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY));
    }
}
