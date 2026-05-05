package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zznu implements zzjw {
    private final zzqz zza;

    public zznu(zzqz zzqzVar) {
        this.zza = (zzqz) Preconditions.checkNotNull(zzqzVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        return this.zza;
    }
}
