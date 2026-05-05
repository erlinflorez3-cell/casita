package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlm extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
        if (!zzieVar.zzf(strZzk)) {
            throw new IllegalStateException("Attempting to assign to undefined variable ".concat(String.valueOf(strZzk)));
        }
        zzieVar.zze(strZzk, zzqzVarArr[1]);
        return zzqzVarArr[1];
    }
}
