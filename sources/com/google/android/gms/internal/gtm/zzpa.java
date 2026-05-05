package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzpa extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        try {
            double dZzb = zzjx.zzb(zzqzVarArr[0]);
            double dZzb2 = zzjx.zzb(zzqzVarArr[1]);
            return (Double.isNaN(dZzb) || Double.isNaN(dZzb2)) ? new zzra(false) : new zzra(Boolean.valueOf(zzb(dZzb, dZzb2)));
        } catch (IllegalArgumentException unused) {
            return new zzra(false);
        }
    }

    protected abstract boolean zzb(double d2, double d3);
}
