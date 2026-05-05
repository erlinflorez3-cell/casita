package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkf extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        zzqz zzqzVar = length < 2 ? zzrd.zze : zzqzVarArr[1];
        List listZzk = zzrgVar.zzk();
        int size = listZzk.size();
        int iAbs = size - 1;
        if (length == 3) {
            int iZza = (int) zzjx.zza(zzqzVarArr[2]);
            iAbs = iZza < 0 ? size - Math.abs(iZza) : Math.min(iZza, iAbs);
        }
        while (true) {
            if (iAbs < 0) {
                iAbs = -1;
                break;
            }
            if (zzrgVar.zzn(iAbs) && zzjx.zzh(zzqzVar, (zzqz) listZzk.get(iAbs))) {
                break;
            }
            iAbs--;
        }
        return new zzrb(Double.valueOf(iAbs));
    }
}
