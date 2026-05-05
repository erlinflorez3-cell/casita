package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class zzks extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        zzrc zzrcVar;
        Preconditions.checkNotNull(zzqzVarArr);
        int length = zzqzVarArr.length;
        if (length == 1) {
            z2 = true;
        } else if (length == 2) {
            length = 2;
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        zzrg zzrgVar = (zzrg) zzqzVarArr[0];
        if (length == 2) {
            Preconditions.checkArgument(zzqzVarArr[1] instanceof zzrc);
            zzrcVar = (zzrc) zzqzVarArr[1];
        } else {
            zzrcVar = new zzrc(new zzkr(null));
        }
        Collections.sort(zzrgVar.zzk(), new zzkp(this, zzrcVar, zzieVar));
        return zzqzVarArr[0];
    }
}
