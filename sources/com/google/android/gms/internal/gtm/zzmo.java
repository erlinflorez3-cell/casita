package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmo extends zzjy {
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
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
        return new zzrb(Double.valueOf(strZzk.indexOf(zzjx.zzd(zzqzVarArr[1]), (int) Math.min(Math.max(length < 3 ? 0.0d : zzjx.zza(zzqzVarArr[2]), 0.0d), strZzk.length()))));
    }
}
