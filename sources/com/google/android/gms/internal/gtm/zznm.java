package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zznm implements zzjw {
    private final zzgg zza;

    public zznm(Context context) {
        this.zza = zzgg.zzb(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        String strZzc = this.zza.zzc();
        return strZzc == null ? zzrd.zze : new zzrk(strZzc);
    }
}
