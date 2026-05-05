package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zznl extends zzjy {
    private final zzib zza;

    public zznl(Context context, zzib zzibVar) {
        this.zza = zzibVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        this.zza.zza().zze(false);
        return zzrd.zze;
    }
}
