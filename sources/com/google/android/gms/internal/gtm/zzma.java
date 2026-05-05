package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzma implements zzjw {
    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        ArrayList arrayList = new ArrayList(zzqzVarArr.length);
        for (zzqz zzqzVar : zzqzVarArr) {
            arrayList.add(zzqzVar);
        }
        return new zzrg(arrayList);
    }
}
