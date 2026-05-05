package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlr extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < zzqzVarArr.length - 1; i2 += 2) {
            String strZzd = zzjx.zzd(zzqzVarArr[i2]);
            zzqz zzqzVar = zzqzVarArr[i2 + 1];
            if ((zzqzVar instanceof zzrd) && zzqzVar != zzrd.zzd && zzqzVar != zzrd.zze) {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
            map.put(strZzd, zzqzVar);
        }
        return new zzrh(map);
    }
}
