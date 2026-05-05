package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzki<T> implements Serializable {
    zzki() {
    }

    public static zzki zzd() {
        return zzjz.zza;
    }

    public static zzki zze(Object obj) {
        obj.getClass();
        return new zzkk(obj);
    }

    public abstract Object zza();

    public abstract Object zzb(Object obj);

    public abstract boolean zzc();
}
