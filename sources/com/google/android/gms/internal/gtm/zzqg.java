package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqg {
    private final ScheduledExecutorService zza;
    private ScheduledFuture zzb;

    public zzqg() {
        ScheduledExecutorService scheduledExecutorServiceZzb = zzgb.zza().zzb(1, 2);
        this.zzb = null;
        this.zza = scheduledExecutorServiceZzb;
    }

    public final void zza(Context context, zzpt zzptVar, long j2, zzpk zzpkVar) {
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.zzb;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzb = this.zza.schedule(new zzqf(context, zzptVar, zzpkVar), 0L, TimeUnit.MILLISECONDS);
        }
    }
}
