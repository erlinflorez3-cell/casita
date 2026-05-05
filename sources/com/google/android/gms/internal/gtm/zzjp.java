package com.google.android.gms.internal.gtm;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes8.dex */
final class zzjp {
    private static final ScheduledExecutorService zza;

    static {
        zzgb.zza();
        zza = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new zzjo()));
    }
}
