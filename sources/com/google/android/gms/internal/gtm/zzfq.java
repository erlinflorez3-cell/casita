package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes8.dex */
final class zzfq {
    private final Clock zza;
    private long zzb;

    public zzfq(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public zzfq(Clock clock, long j2) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
        this.zzb = j2;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final boolean zzc(long j2) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb > j2;
    }
}
