package com.google.android.libraries.vision.visionkit.pipeline;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbi {
    private final int zza;
    private final Map zzb = new HashMap();

    public zzbi(int i2) {
        this.zza = i2;
    }

    public final synchronized void zza(long j2) {
        this.zzb.remove(Long.valueOf(j2));
    }

    public final synchronized boolean zzb(Object obj, long j2) {
        if (this.zzb.size() != this.zza) {
            this.zzb.put(Long.valueOf(j2), obj);
            return true;
        }
        com.google.android.gms.internal.mlkit_vision_internal_vkp.zzcp.zza.zzc(this, "Buffer is full. Drop frame " + j2, new Object[0]);
        return false;
    }
}
