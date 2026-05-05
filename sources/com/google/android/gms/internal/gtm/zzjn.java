package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
final class zzjn {
    private static volatile ExecutorService zza = null;

    private zzjn() {
    }

    public static ExecutorService zza(Context context) {
        if (zza == null) {
            synchronized (zzjn.class) {
                if (zza == null) {
                    zza = new zzha(context, 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new zzjm());
                }
            }
        }
        return zza;
    }
}
