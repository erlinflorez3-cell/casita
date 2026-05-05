package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlq extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < zzqzVarArr.length; i2++) {
            zzqz zzqzVar = zzqzVarArr[i2];
            Preconditions.checkArgument(!(zzqzVar instanceof zzrd) || zzqzVar == zzrd.zze || zzqzVar == zzrd.zzd);
            arrayList.add(zzqzVar);
        }
        return new zzrg(arrayList);
    }
}
