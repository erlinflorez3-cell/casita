package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlo extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 1);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        Iterator it = ((zzrg) zzqzVarArr[0]).zzk().iterator();
        while (it.hasNext()) {
            zzqz zzqzVarZzc = zzrl.zzc(zzieVar, (zzqz) it.next());
            if ((zzqzVarZzc instanceof zzrd) && (zzqzVarZzc == zzrd.zzb || zzqzVarZzc == zzrd.zzc || ((zzrd) zzqzVarZzc).zzj())) {
                return zzqzVarZzc;
            }
        }
        return zzrd.zze;
    }
}
