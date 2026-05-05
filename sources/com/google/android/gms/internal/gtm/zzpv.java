package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpv implements Result {
    private final Status zza;
    private final int zzb;
    private final zzpu zzc;
    private final zzqs zzd;

    public zzpv(Status status, int i2, zzpu zzpuVar, zzqs zzqsVar) {
        this.zza = status;
        this.zzb = i2;
        this.zzc = zzpuVar;
        this.zzd = zzqsVar;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzpu zzb() {
        return this.zzc;
    }

    public final zzqs zzc() {
        return this.zzd;
    }

    public final String zzd() {
        int i2 = this.zzb;
        if (i2 == 0) {
            return "Network";
        }
        if (i2 == 1) {
            return "Saved file on disk";
        }
        if (i2 == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }
}
