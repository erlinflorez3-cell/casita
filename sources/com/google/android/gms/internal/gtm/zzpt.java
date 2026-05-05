package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpt {
    private zzph zza;

    public final zzph zza() {
        return this.zza;
    }

    public final zzpt zzb(zzph zzphVar) throws IllegalArgumentException {
        Preconditions.checkNotNull(zzphVar);
        this.zza = zzphVar;
        return this;
    }

    public final String zzc() {
        zzph zzphVar = this.zza;
        return zzphVar == null ? "" : zzphVar.zzb();
    }
}
