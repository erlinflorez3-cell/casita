package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkd extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        int length = zzqzVarArr.length;
        int iMax = 0;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        zzqz zzqzVar = length < 2 ? zzrd.zze : zzqzVarArr[1];
        zzqz zzqzVar2 = length < 3 ? zzrd.zze : zzqzVarArr[2];
        List listZzk = zzrgVar.zzk();
        int size = listZzk.size();
        if (zzqzVar2 != zzrd.zze) {
            int iZza = (int) zzjx.zza(zzqzVar2);
            iMax = iZza < 0 ? Math.max(size - Math.abs(iZza), 0) : iZza;
        }
        while (true) {
            if (iMax >= size) {
                iMax = -1;
                break;
            }
            if (zzrgVar.zzn(iMax) && zzjx.zzh(zzqzVar, (zzqz) listZzk.get(iMax))) {
                break;
            }
            iMax++;
        }
        return new zzrb(Double.valueOf(iMax));
    }
}
