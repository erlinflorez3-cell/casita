package com.google.android.gms.internal.gcm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public interface zzf {
    ExecutorService zzd(int i2, ThreadFactory threadFactory, int i3);

    ExecutorService zzd(ThreadFactory threadFactory, int i2);

    ScheduledExecutorService zze(int i2, ThreadFactory threadFactory, int i3);
}
