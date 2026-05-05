package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzha extends ThreadPoolExecutor {
    private final Context zza;

    public zzha(Context context, int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(1, 1, 0L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.zza = context;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        if (th != null) {
            zzgv.zzb("Uncaught exception: ", th, this.zza);
        }
    }
}
