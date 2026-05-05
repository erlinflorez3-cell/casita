package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmd extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 3);
        Preconditions.checkArgument(zzqzVarArr[1] instanceof zzrg);
        Preconditions.checkArgument(zzqzVarArr[2] instanceof zzrg);
        zzqz zzqzVar = zzqzVarArr[0];
        List listZzk = ((zzrg) zzqzVarArr[1]).zzk();
        List listZzk2 = ((zzrg) zzqzVarArr[2]).zzk();
        Preconditions.checkArgument(listZzk2.size() <= listZzk.size() + 1);
        boolean z2 = false;
        for (int i2 = 0; i2 < listZzk.size(); i2++) {
            if (z2 || zzjx.zzh(zzqzVar, zzrl.zzc(zzieVar, (zzqz) listZzk.get(i2)))) {
                zzqz zzqzVarZzc = zzrl.zzc(zzieVar, (zzqz) listZzk2.get(i2));
                if (!(zzqzVarZzc instanceof zzrd)) {
                    z2 = true;
                } else {
                    if (zzqzVarZzc == zzrd.zzc || ((zzrd) zzqzVarZzc).zzj()) {
                        return zzqzVarZzc;
                    }
                    if (zzqzVarZzc == zzrd.zzb) {
                        return zzrd.zze;
                    }
                }
            }
        }
        if (listZzk.size() < listZzk2.size()) {
            zzqz zzqzVarZzc2 = zzrl.zzc(zzieVar, (zzqz) listZzk2.get(listZzk2.size() - 1));
            if ((zzqzVarZzc2 instanceof zzrd) && (zzqzVarZzc2 == zzrd.zzc || ((zzrd) zzqzVarZzc2).zzj())) {
                return zzqzVarZzc2;
            }
        }
        return zzrd.zze;
    }
}
