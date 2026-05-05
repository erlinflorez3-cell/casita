package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzka extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkNotNull(zzqzVarArr);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        Preconditions.checkArgument(zzqzVarArr[1] instanceof zzrc);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        zzrc zzrcVar = (zzrc) zzqzVarArr[1];
        List listZzk = zzrgVar.zzk();
        int size = listZzk.size();
        boolean zZzg = true;
        for (int i2 = 0; zZzg && i2 < size && i2 < zzrgVar.zzk().size(); i2++) {
            if (zzrgVar.zzn(i2)) {
                zZzg = zzjx.zzg(zzrcVar.zzi().zzd(zzieVar, (zzqz) listZzk.get(i2), new zzrb(Double.valueOf(i2)), zzrgVar));
            }
        }
        return new zzra(Boolean.valueOf(zZzg));
    }
}
