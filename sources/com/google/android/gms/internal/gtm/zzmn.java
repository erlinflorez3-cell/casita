package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmn extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length > 0);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        StringBuilder sb = new StringBuilder(((zzrk) zzqzVarArr[0]).zzk());
        for (int i2 = 1; i2 < zzqzVarArr.length; i2++) {
            sb.append(zzjx.zzd(zzqzVarArr[i2]));
        }
        return new zzrk(sb.toString());
    }
}
