package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzno extends zzjy {
    private final zzib zza;

    public zzno(zzib zzibVar) {
        this.zza = zzibVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        zzqz zzqzVar;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        if (length == 0 || zzqzVarArr[0] == zzrd.zze) {
            return new zzrk("");
        }
        Object obj = this.zza.zza().zzd().get("_ldl");
        if (obj == null) {
            return new zzrk("");
        }
        zzqz zzqzVarZzb = zzrl.zzb(obj);
        if (!(zzqzVarZzb instanceof zzrk)) {
            return new zzrk("");
        }
        String strZzk = ((zzrk) zzqzVarZzb).zzk();
        if (!zzhn.zza(strZzk, "conv").equals(zzjx.zzd(zzqzVarArr[0]))) {
            return new zzrk("");
        }
        String strZzd = null;
        if (length > 1 && (zzqzVar = zzqzVarArr[1]) != zzrd.zze) {
            strZzd = zzjx.zzd(zzqzVar);
        }
        String strZza = zzhn.zza(strZzk, strZzd);
        return strZza != null ? new zzrk(strZza) : new zzrk("");
    }
}
