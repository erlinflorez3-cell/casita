package com.google.android.libraries.intelligence.acceleration;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
final class zza {
    private final long zza = TimeUnit.SECONDS.toMillis(10);
    private long zzb;

    zza(long j2) {
    }

    final synchronized boolean zza() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.zzb;
        if (j2 != 0 && jElapsedRealtime - j2 < this.zza) {
            return false;
        }
        this.zzb = jElapsedRealtime;
        return true;
    }
}
