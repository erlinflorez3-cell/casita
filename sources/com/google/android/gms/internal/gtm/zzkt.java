package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkt extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        Preconditions.checkArgument(zzqzVarArr.length >= 3);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        int iZza = (int) zzjx.zza(zzqzVarArr[1]);
        int iMax = iZza < 0 ? Math.max(zzrgVar.zzk().size() + iZza, 0) : Math.min(iZza, zzrgVar.zzk().size());
        int iMin = Math.min(Math.max((int) zzjx.zza(zzqzVarArr[2]), 0), zzrgVar.zzk().size() - iMax) + iMax;
        ArrayList arrayList = new ArrayList(zzrgVar.zzk().subList(iMax, iMin));
        zzrgVar.zzk().subList(iMax, iMin).clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 3; i2 < zzqzVarArr.length; i2++) {
            arrayList2.add(zzqzVarArr[i2]);
        }
        zzrgVar.zzk().addAll(iMax, arrayList2);
        return new zzrg(arrayList);
    }
}
