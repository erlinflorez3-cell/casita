package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzly extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        if (length == 2) {
            z2 = true;
        } else if (length == 3) {
            z2 = true;
            length = 3;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(zzqzVarArr[1] instanceof zzrg);
        if (length == 3) {
            Preconditions.checkArgument(zzqzVarArr[2] instanceof zzrg);
        }
        List arrayList = new ArrayList();
        if (zzjx.zzg(zzqzVarArr[0])) {
            arrayList = ((zzrg) zzqzVarArr[1]).zzk();
        } else if (length > 2) {
            arrayList = ((zzrg) zzqzVarArr[2]).zzk();
        }
        zzrd zzrdVarZzf = zzrl.zzf(zzieVar, arrayList);
        return zzrl.zzi(zzrdVarZzf) ? zzrdVarZzf : zzrd.zze;
    }
}
