package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkj extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        zzqz zzqzVarZzi;
        int i2;
        Preconditions.checkNotNull(zzqzVarArr);
        int length = zzqzVarArr.length;
        if (length == 2) {
            z2 = true;
        } else if (length == 3) {
            length = 3;
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        Preconditions.checkArgument(zzqzVarArr[1] instanceof zzrc);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        zzrc zzrcVar = (zzrc) zzqzVarArr[1];
        List listZzk = zzrgVar.zzk();
        int size = listZzk.size();
        if (length == 3) {
            zzqzVarZzi = zzqzVarArr[2];
            i2 = 0;
        } else {
            Preconditions.checkState(size > 0);
            zzqzVarZzi = zzrgVar.zzi(0);
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i2 = 1;
                    break;
                }
                i2 = i3 + 1;
                if (zzrgVar.zzn(i3)) {
                    zzqzVarZzi = zzrgVar.zzi(i3);
                    break;
                }
                i3 = i2;
            }
            Preconditions.checkState(i3 < size);
        }
        while (i2 < size && i2 < zzrgVar.zzk().size()) {
            if (zzrgVar.zzn(i2)) {
                zzqzVarZzi = zzrcVar.zzi().zzd(zzieVar, zzqzVarZzi, (zzqz) listZzk.get(i2), new zzrb(Double.valueOf(i2)), zzrgVar);
            }
            i2++;
        }
        return zzqzVarZzi;
    }
}
