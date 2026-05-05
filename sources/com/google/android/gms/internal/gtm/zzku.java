package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzku extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        Preconditions.checkArgument(zzqzVarArr.length > 0);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 < zzqzVarArr.length; i2++) {
            arrayList.add(zzqzVarArr[i2]);
        }
        zzrgVar.zzk().addAll(0, arrayList);
        return new zzrb(Double.valueOf(zzrgVar.zzk().size()));
    }
}
