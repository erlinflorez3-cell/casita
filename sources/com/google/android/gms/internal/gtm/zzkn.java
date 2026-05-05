package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkn extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        Preconditions.checkNotNull(zzqzVarArr);
        int length = zzqzVarArr.length;
        if (length == 2) {
            z2 = true;
        } else if (length == 3) {
            length = 3;
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        int iZza = (int) zzjx.zza(zzqzVarArr[1]);
        int iMax = iZza < 0 ? Math.max(zzrgVar.zzk().size() + iZza, 0) : Math.min(iZza, zzrgVar.zzk().size());
        int size = zzrgVar.zzk().size();
        if (length == 3) {
            int iZza2 = (int) zzjx.zza(zzqzVarArr[2]);
            size = iZza2 < 0 ? Math.max(iZza2 + zzrgVar.zzk().size(), 0) : Math.min(iZza2, zzrgVar.zzk().size());
        }
        return new zzrg(new ArrayList(zzrgVar.zzk().subList(iMax, Math.max(iMax, size))));
    }
}
