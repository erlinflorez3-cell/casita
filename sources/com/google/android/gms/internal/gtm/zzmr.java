package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmr extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
        if (length == 1) {
            return new zzrk(strZzk);
        }
        String strZzd = zzjx.zzd(zzqzVarArr[1]);
        zzqz zzqzVarZzd = length < 3 ? zzrd.zze : zzqzVarArr[2];
        int iIndexOf = strZzk.indexOf(strZzd);
        if (iIndexOf == -1) {
            return new zzrk(strZzk);
        }
        if (zzqzVarZzd instanceof zzrc) {
            zzqzVarZzd = ((zzrc) zzqzVarZzd).zzi().zzd(zzieVar, new zzrk(strZzd), new zzrb(Double.valueOf(iIndexOf)), new zzrk(strZzk));
        }
        String strZzd2 = zzjx.zzd(zzqzVarZzd);
        return new zzrk(strZzk.substring(0, iIndexOf) + strZzd2 + strZzk.substring(iIndexOf + strZzd.length()));
    }
}
