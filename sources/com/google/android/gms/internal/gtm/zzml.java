package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzml extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        return new zzrb(Double.valueOf(zzjx.zzc(zzqzVarArr[0], new zzrb(Double.valueOf(-zzjx.zzb(zzqzVarArr[1]))))));
    }
}
