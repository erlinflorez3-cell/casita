package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfb {
    private long zzb;
    private final Clock zze;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final String zzd = "tracking";

    public zzfb(int i2, long j2, String str, Clock clock) {
        this.zze = clock;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long jCurrentTimeMillis = this.zze.currentTimeMillis();
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
            zzfc.zze("Excessive " + this.zzd + " detected; call ignored.");
            return false;
        }
    }
}
