package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjz extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        Preconditions.checkArgument(zzqzVarArr.length > 0);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        ArrayList arrayList = new ArrayList();
        Iterator it = zzrgVar.zzk().iterator();
        while (it.hasNext()) {
            arrayList.add((zzqz) it.next());
        }
        for (int i2 = 1; i2 < zzqzVarArr.length; i2++) {
            zzqz zzqzVar = zzqzVarArr[i2];
            if (zzqzVar instanceof zzrg) {
                Iterator it2 = ((zzrg) zzqzVar).zzk().iterator();
                while (it2.hasNext()) {
                    arrayList.add((zzqz) it2.next());
                }
            } else {
                arrayList.add(zzqzVar);
            }
        }
        return new zzrg(arrayList);
    }
}
