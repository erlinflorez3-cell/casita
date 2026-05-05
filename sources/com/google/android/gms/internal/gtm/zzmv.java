package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmv extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        zzqz zzqzVar;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
        int iZza = (int) zzjx.zza(length < 2 ? zzrd.zze : zzqzVarArr[1]);
        int length2 = strZzk.length();
        if (length == 3 && (zzqzVar = zzqzVarArr[2]) != zzrd.zze) {
            length2 = (int) zzjx.zza(zzrl.zzc(zzieVar, zzqzVar));
        }
        int iMin = Math.min(Math.max(iZza, 0), strZzk.length());
        int iMin2 = Math.min(Math.max(length2, 0), strZzk.length());
        return new zzrk(strZzk.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
    }
}
