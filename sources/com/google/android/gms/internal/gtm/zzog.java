package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzog implements zzjw {
    private final Context zza;

    public zzog(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        zzqz zzqzVar;
        Preconditions.checkArgument(zzqzVarArr != null);
        String strZzd = null;
        if (zzqzVarArr.length > 0 && (zzqzVar = zzqzVarArr[0]) != zzrd.zze) {
            strZzd = zzjx.zzd(zzrl.zzc(zzieVar, zzqzVar));
        }
        String strZzb = zzhn.zzb(this.zza, strZzd);
        return strZzb != null ? new zzrk(strZzb) : zzrd.zze;
    }
}
