package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes8.dex */
final class zzpn {
    private Status zza;
    private Object zzb;
    private long zzc;

    public zzpn(Status status, Object obj, long j2) {
        this.zza = status;
        this.zzb = obj;
        this.zzc = j2;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb(Object obj) {
        this.zzb = obj;
    }

    public final void zzc(long j2) {
        this.zzc = j2;
    }

    public final void zzd(Status status) {
        this.zza = status;
    }
}
