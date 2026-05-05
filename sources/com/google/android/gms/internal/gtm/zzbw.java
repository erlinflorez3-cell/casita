package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* JADX INFO: loaded from: classes8.dex */
final class zzbw implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbx zza;

    zzbw(zzbx zzbxVar) {
        this.zza = zzbxVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        zzfd zzfdVarZzn = this.zza.zzn();
        if (zzfdVarZzn != null) {
            zzfdVarZzn.zzJ("Job execution failed", th);
        }
    }
}
