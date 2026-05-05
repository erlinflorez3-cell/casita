package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmm extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        if (length == 1) {
            z2 = true;
        } else if (length == 2) {
            z2 = true;
            length = 2;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
        int iZza = length == 2 ? (int) zzjx.zza(zzqzVarArr[1]) : 0;
        return (iZza < 0 || iZza >= strZzk.length()) ? new zzrk("") : new zzrk(String.valueOf(strZzk.charAt(iZza)));
    }
}
