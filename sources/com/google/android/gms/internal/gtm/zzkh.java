package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkh extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        Preconditions.checkArgument(zzqzVarArr.length == 1);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        List listZzk = ((zzrg) zzqzVarArr[0]).zzk();
        return !listZzk.isEmpty() ? (zzqz) listZzk.remove(listZzk.size() - 1) : zzrd.zze;
    }
}
