package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmt extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        zzqz zzqzVar;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
        double dZza = length < 2 ? 0.0d : zzjx.zza(zzqzVarArr[1]);
        double length2 = strZzk.length();
        if (length == 3 && (zzqzVar = zzqzVarArr[2]) != zzrd.zze) {
            length2 = zzjx.zza(zzqzVar);
        }
        int iMax = (int) (dZza < 0.0d ? Math.max(((double) strZzk.length()) + dZza, 0.0d) : Math.min(dZza, strZzk.length()));
        return new zzrk(strZzk.substring(iMax, Math.max(0, ((int) (length2 < 0.0d ? Math.max(((double) strZzk.length()) + length2, 0.0d) : Math.min(length2, strZzk.length()))) - iMax) + iMax));
    }
}
