package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmb extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length <= 1);
        return new zzrd(length <= 0 ? zzrd.zze : zzqzVarArr[0]);
    }
}
