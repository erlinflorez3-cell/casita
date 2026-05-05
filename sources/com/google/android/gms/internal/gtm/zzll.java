package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzll extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 3);
        Preconditions.checkArgument(zzqzVarArr[1] instanceof zzrk);
        Preconditions.checkArgument(zzqzVarArr[2] instanceof zzrg);
        zzqz zzqzVar = zzqzVarArr[0];
        String strZzk = ((zzrk) zzqzVarArr[1]).zzk();
        List listZzk = ((zzrg) zzqzVarArr[2]).zzk();
        if (zzqzVar.zzh(strZzk)) {
            zzqz zzqzVarZzb = zzqzVar.zzb(strZzk);
            if (zzqzVarZzb instanceof zzrc) {
                return ((zzrc) zzqzVarZzb).zzi().zzd(zzieVar, (zzqz[]) listZzk.toArray(new zzqz[listZzk.size()]));
            }
            throw new IllegalArgumentException("Apply TypeError: " + strZzk + " is not a function");
        }
        if (zzqzVar.zzg(strZzk)) {
            zzjw zzjwVarZza = zzqzVar.zza(strZzk);
            listZzk.add(0, zzqzVar);
            return zzjwVarZza.zzd(zzieVar, (zzqz[]) listZzk.toArray(new zzqz[listZzk.size()]));
        }
        throw new IllegalArgumentException("Apply TypeError: object has no " + strZzk + " property");
    }
}
