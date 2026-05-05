package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmj extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        double dZzb = zzjx.zzb(zzqzVarArr[0]);
        double dZzb2 = zzjx.zzb(zzqzVarArr[1]);
        return (Double.isNaN(dZzb) || Double.isNaN(dZzb2)) ? new zzrb(Double.valueOf(Double.NaN)) : (Double.isInfinite(dZzb) || dZzb2 == 0.0d) ? new zzrb(Double.valueOf(Double.NaN)) : (Double.isInfinite(dZzb) || !Double.isInfinite(dZzb2)) ? (dZzb != 0.0d || dZzb2 == 0.0d || Double.isInfinite(dZzb2)) ? new zzrb(Double.valueOf(dZzb % dZzb2)) : new zzrb(Double.valueOf(dZzb)) : new zzrb(Double.valueOf(dZzb));
    }
}
