package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmg implements zzjw {
    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        zzrd zzrdVarZzf;
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 4);
        zzqz zzqzVarZzc = zzrl.zzc(zzieVar, zzqzVarArr[3]);
        Preconditions.checkArgument(zzqzVarZzc instanceof zzrg);
        List listZzk = ((zzrg) zzqzVarZzc).zzk();
        zzqz zzqzVar = zzqzVarArr[2];
        Preconditions.checkArgument(zzqzVar instanceof zzra);
        if (((zzra) zzqzVar).zzi().booleanValue()) {
            zzrd zzrdVarZzf2 = zzrl.zzf(zzieVar, listZzk);
            if (zzrdVarZzf2 == zzrd.zzb) {
                return zzrd.zze;
            }
            if (zzrdVarZzf2.zzj()) {
                return zzrdVarZzf2;
            }
        }
        while (zzjx.zzg(zzrl.zzc(zzieVar, zzqzVarArr[0])) && (zzrdVarZzf = zzrl.zzf(zzieVar, listZzk)) != zzrd.zzb) {
            if (zzrdVarZzf.zzj()) {
                return zzrdVarZzf;
            }
            zzrl.zzc(zzieVar, zzqzVarArr[1]);
        }
        return zzrd.zze;
    }
}
