package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzki extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        Preconditions.checkArgument(zzqzVarArr.length > 0);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        int size = zzrgVar.zzk().size();
        zzrgVar.zzm((r4 + size) - 1);
        for (int i2 = 1; i2 < zzqzVarArr.length; i2++) {
            zzrgVar.zzl(size, zzqzVarArr[i2]);
            size++;
        }
        return new zzrb(Double.valueOf(size));
    }
}
