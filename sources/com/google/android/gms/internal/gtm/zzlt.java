package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlt extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    public final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        Preconditions.checkArgument(zzqzVarArr.length == 3);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
        Preconditions.checkArgument(zzieVar.zzf(strZzk));
        zzqz zzqzVar = zzqzVarArr[1];
        Preconditions.checkNotNull(zzqzVar);
        zzqz zzqzVar2 = zzqzVarArr[2];
        Preconditions.checkArgument(zzqzVar2 instanceof zzrg);
        List listZzk = ((zzrg) zzqzVar2).zzk();
        Iterator itZze = zzqzVar.zze();
        while (itZze.hasNext()) {
            zzieVar.zze(strZzk, (zzqz) itZze.next());
            zzrd zzrdVarZzf = zzrl.zzf(zzieVar, listZzk);
            if (zzrdVarZzf == zzrd.zzb) {
                return zzrd.zze;
            }
            if (zzrdVarZzf.zzj()) {
                return zzrdVarZzf;
            }
        }
        return zzrd.zze;
    }
}
