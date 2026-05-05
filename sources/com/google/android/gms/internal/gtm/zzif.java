package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: loaded from: classes8.dex */
final class zzif {
    private long zzb;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final Clock zzd = DefaultClock.getInstance();

    public final boolean zza() {
        synchronized (this.zzc) {
            long jCurrentTimeMillis = this.zzd.currentTimeMillis();
            double dMin = this.zza;
            if (dMin < 60.0d) {
                double d2 = (jCurrentTimeMillis - this.zzb) / 2000.0d;
                if (d2 > 0.0d) {
                    dMin = Math.min(60.0d, dMin + d2);
                    this.zza = dMin;
                }
            }
            this.zzb = jCurrentTimeMillis;
            if (dMin >= 1.0d) {
                this.zza = dMin - 1.0d;
                return true;
            }
            zzho.zze("No more tokens available.");
            return false;
        }
    }
}
