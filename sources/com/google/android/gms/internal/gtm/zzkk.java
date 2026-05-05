package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkk extends zzjy {
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
        int i3 = size - 1;
        if (length == 3) {
            zzqzVarZzi = zzqzVarArr[2];
        } else {
            Preconditions.checkState(size > 0);
            zzqzVarZzi = zzrgVar.zzi(i3);
            int i4 = size - 2;
            while (true) {
                if (i3 < 0) {
                    i2 = i4;
                    break;
                }
                i2 = i3 - 1;
                if (zzrgVar.zzn(i3)) {
                    zzqzVarZzi = zzrgVar.zzi(i3);
                    break;
                }
                i3 = i2;
            }
            Preconditions.checkState(i3 >= 0);
            i3 = i2;
        }
        while (i3 >= 0) {
            if (zzrgVar.zzn(i3)) {
                zzqzVarZzi = zzrcVar.zzi().zzd(zzieVar, zzqzVarZzi, (zzqz) listZzk.get(i3), new zzrb(Double.valueOf(i3)), zzrgVar);
            }
            i3--;
        }
        return zzqzVarZzi;
    }
}
