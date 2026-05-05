package com.google.android.gms.internal.vision;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzju {
    private static final zzju zza;
    private static final zzju zzb;

    static {
        zzjx zzjxVar = null;
        zza = new zzjw();
        zzb = new zzjz();
    }

    private zzju() {
    }

    static zzju zza() {
        return zza;
    }

    static zzju zzb() {
        return zzb;
    }

    abstract <L> List<L> zza(Object obj, long j2);

    abstract <L> void zza(Object obj, Object obj2, long j2);

    abstract void zzb(Object obj, long j2);
}
